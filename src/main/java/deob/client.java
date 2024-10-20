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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class136 {

    @ObfuscatedName("client.a")
    public static boolean field381 = true;

    @ObfuscatedName("client.m")
    public static int field281 = 1;

    @ObfuscatedName("client.s")
    public static int field282 = 0;

    @ObfuscatedName("client.f")
    public static int field310 = 0;

    @ObfuscatedName("client.i")
    public static boolean field284 = false;

    @ObfuscatedName("client.c")
    public static boolean field285 = false;

    @ObfuscatedName("client.k")
    public static int field286 = 0;

    @ObfuscatedName("client.v")
    public static int field555 = 0;

    @ObfuscatedName("client.h")
    public static boolean field293 = true;

    @ObfuscatedName("client.p")
    public static int field289 = 0;

    @ObfuscatedName("client.z")
    public static long field517 = 1L;

    @ObfuscatedName("client.w")
    public static class220[] field338 = new class220[4];

    @ObfuscatedName("client.d")
    public static int field398 = -1;

    @ObfuscatedName("client.l")
    public static int field292 = -1;

    @ObfuscatedName("client.aj")
    public static int field307 = -1;

    @ObfuscatedName("client.aq")
    public static boolean field454 = true;

    @ObfuscatedName("client.al")
    public static boolean field295 = false;

    @ObfuscatedName("client.az")
    public static int field296 = 0;

    @ObfuscatedName("client.ah")
    public static int field510 = 0;

    @ObfuscatedName("client.ag")
    public static int field423 = 0;

    @ObfuscatedName("client.ad")
    public static int field299 = 0;

    @ObfuscatedName("client.ao")
    public static int field300 = 0;

    @ObfuscatedName("client.am")
    public static int field301 = 0;

    @ObfuscatedName("client.ax")
    public static int field302 = 0;

    @ObfuscatedName("client.at")
    public static int field303 = 0;

    @ObfuscatedName("client.ar")
    public static int field304 = 0;

    @ObfuscatedName("client.ai")
    public static class111 field305 = new class111(new byte[5000]);

    @ObfuscatedName("client.an")
    public static class19 field358 = class19.field574;

    @ObfuscatedName("client.af")
    public static int field278 = 0;

    @ObfuscatedName("client.aa")
    public static int field308 = 0;

    @ObfuscatedName("client.ay")
    public static int field492 = 0;

    @ObfuscatedName("client.bx")
    public static int field504 = 0;

    @ObfuscatedName("client.bs")
    public static int field311 = 0;

    @ObfuscatedName("client.bg")
    public static int field312 = 0;

    @ObfuscatedName("client.bw")
    public static int field313 = 0;

    @ObfuscatedName("client.bq")
    public static int field453 = 0;

    @ObfuscatedName("client.ce")
    public static class32[] field316 = new class32[32768];

    @ObfuscatedName("client.cj")
    public static int field317 = 0;

    @ObfuscatedName("client.cz")
    public static int[] field318 = new int[32768];

    @ObfuscatedName("client.ck")
    public static class114 field320 = new class114(5000);

    @ObfuscatedName("client.cq")
    public static class114 field549 = new class114(5000);

    @ObfuscatedName("client.cp")
    public static class114 field322 = new class114(5000);

    @ObfuscatedName("client.cx")
    public static int field323 = 0;

    @ObfuscatedName("client.cn")
    public static int field324 = 0;

    @ObfuscatedName("client.cg")
    public static int field325 = 0;

    @ObfuscatedName("client.cr")
    public static int field432 = 0;

    @ObfuscatedName("client.cm")
    public static int field486 = 0;

    @ObfuscatedName("client.cu")
    public static int field535 = 0;

    @ObfuscatedName("client.cf")
    public static int field551 = 0;

    @ObfuscatedName("client.ci")
    public static int field330 = 0;

    @ObfuscatedName("client.ca")
    public static boolean field331 = false;

    @ObfuscatedName("client.cd")
    public static int field388 = 0;

    @ObfuscatedName("client.dn")
    public static int field333 = 0;

    @ObfuscatedName("client.de")
    public static int field334 = 1;

    @ObfuscatedName("client.dq")
    public static int field479 = 0;

    @ObfuscatedName("client.do")
    public static int field336 = 1;

    @ObfuscatedName("client.dp")
    public static int field337 = 0;

    @ObfuscatedName("client.ds")
    public static boolean field339 = false;

    @ObfuscatedName("client.du")
    public static int[][][] field340 = new int[4][13][13];

    @ObfuscatedName("client.dg")
    public static final int[] field341 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.di")
    public static int field332 = 0;

    @ObfuscatedName("client.dk")
    public static int field343 = 2;

    @ObfuscatedName("client.dt")
    public static int field344 = 0;

    @ObfuscatedName("client.dm")
    public static int field521 = 2;

    @ObfuscatedName("client.dy")
    public static int field473 = 0;

    @ObfuscatedName("client.dj")
    public static int field378 = 1;

    @ObfuscatedName("client.dl")
    public static int field348 = 0;

    @ObfuscatedName("client.ev")
    public static int field349 = 0;

    @ObfuscatedName("client.eb")
    public static int field326 = 2;

    @ObfuscatedName("client.el")
    public static int field351 = 0;

    @ObfuscatedName("client.ed")
    public static int field379 = 1;

    @ObfuscatedName("client.ez")
    public static int field353 = 0;

    @ObfuscatedName("client.eh")
    public static int field354 = 0;

    @ObfuscatedName("client.ex")
    public static int field383 = 2301979;

    @ObfuscatedName("client.er")
    public static int field327 = 5063219;

    @ObfuscatedName("client.ey")
    public static int field359 = 3353893;

    @ObfuscatedName("client.eq")
    public static int field360 = 7759444;

    @ObfuscatedName("client.ej")
    public static boolean field361 = false;

    @ObfuscatedName("client.ep")
    public static int field335 = 0;

    @ObfuscatedName("client.fe")
    public static int field364 = 128;

    @ObfuscatedName("client.fd")
    public static int field365 = 0;

    @ObfuscatedName("client.fp")
    public static int field452 = 0;

    @ObfuscatedName("client.fu")
    public static int field350 = 0;

    @ObfuscatedName("client.fx")
    public static int field368 = 0;

    @ObfuscatedName("client.fb")
    public static int field447 = 0;

    @ObfuscatedName("client.ff")
    public static int field370 = 0;

    @ObfuscatedName("client.fl")
    public static boolean field371 = false;

    @ObfuscatedName("client.fk")
    public static int field372 = 0;

    @ObfuscatedName("client.fj")
    public static int field382 = 0;

    @ObfuscatedName("client.fw")
    public static int field434 = 50;

    @ObfuscatedName("client.fr")
    public static int[] field375 = new int[field434];

    @ObfuscatedName("client.fm")
    public static int[] field294 = new int[field434];

    @ObfuscatedName("client.fo")
    public static int[] field377 = new int[field434];

    @ObfuscatedName("client.fy")
    public static int[] field380 = new int[field434];

    @ObfuscatedName("client.fa")
    public static int[] field384 = new int[field434];

    @ObfuscatedName("client.fn")
    public static int[] field374 = new int[field434];

    @ObfuscatedName("client.fc")
    public static int[] field532 = new int[field434];

    @ObfuscatedName("client.fh")
    public static String[] field530 = new String[field434];

    @ObfuscatedName("client.fq")
    public static int[][] field554 = new int[104][104];

    @ObfuscatedName("client.gi")
    public static int field287 = 0;

    @ObfuscatedName("client.gc")
    public static int field366 = -1;

    @ObfuscatedName("client.gf")
    public static int field386 = -1;

    @ObfuscatedName("client.gz")
    public static int field387 = 0;

    @ObfuscatedName("client.gn")
    public static int field426 = 0;

    @ObfuscatedName("client.gl")
    public static int field389 = 0;

    @ObfuscatedName("client.gb")
    public static int field390 = 0;

    @ObfuscatedName("client.gx")
    public static int field288 = 0;

    @ObfuscatedName("client.gt")
    public static int field544 = 0;

    @ObfuscatedName("client.ge")
    public static int field328 = 0;

    @ObfuscatedName("client.go")
    public static int field394 = 0;

    @ObfuscatedName("client.gk")
    public static int field395 = 0;

    @ObfuscatedName("client.gu")
    public static int field396 = 0;

    @ObfuscatedName("client.gg")
    public static boolean field397 = false;

    @ObfuscatedName("client.gp")
    public static int field404 = 0;

    @ObfuscatedName("client.gd")
    public static int field399 = 0;

    @ObfuscatedName("client.gv")
    public static class3[] field400 = new class3[2048];

    @ObfuscatedName("client.gy")
    public static int field401 = 0;

    @ObfuscatedName("client.gs")
    public static int[] field357 = new int[2048];

    @ObfuscatedName("client.gw")
    public static int field403 = 0;

    @ObfuscatedName("client.gh")
    public static int[] field508 = new int[2048];

    @ObfuscatedName("client.hc")
    public static class111[] field405 = new class111[2048];

    @ObfuscatedName("client.hf")
    public static int field406 = -1;

    @ObfuscatedName("client.ho")
    public static int field283 = 0;

    @ObfuscatedName("client.hy")
    public static int field408 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field511 = new int[1000];

    @ObfuscatedName("client.hm")
    public static final int[] field410 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hl")
    public static String[] field291 = new String[8];

    @ObfuscatedName("client.hs")
    public static boolean[] field552 = new boolean[8];

    @ObfuscatedName("client.hq")
    public static int[] field413 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hw")
    public static int field414 = -1;

    @ObfuscatedName("client.hd")
    public static class190[][][] field415 = new class190[4][104][104];

    @ObfuscatedName("client.hi")
    public static class190 field558 = new class190();

    @ObfuscatedName("client.ha")
    public static class190 field417 = new class190();

    @ObfuscatedName("client.hn")
    public static class190 field418 = new class190();

    @ObfuscatedName("client.hx")
    public static int[] field419 = new int[25];

    @ObfuscatedName("client.ht")
    public static int[] field420 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field421 = new int[25];

    @ObfuscatedName("client.hh")
    public static int field422 = 0;

    @ObfuscatedName("client.he")
    public static boolean field528 = false;

    @ObfuscatedName("client.iy")
    public static int field424 = 0;

    @ObfuscatedName("client.ic")
    public static int[] field409 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field347 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field427 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field428 = new int[500];

    @ObfuscatedName("client.ia")
    public static String[] field429 = new String[500];

    @ObfuscatedName("client.iv")
    public static String[] field430 = new String[500];

    @ObfuscatedName("client.ie")
    public static int field431 = -1;

    @ObfuscatedName("client.is")
    public static int field465 = -1;

    @ObfuscatedName("client.il")
    public static int field499 = 0;

    @ObfuscatedName("client.iw")
    public static int field290 = 50;

    @ObfuscatedName("client.id")
    public static int field450 = 0;

    @ObfuscatedName("client.ig")
    public static String field436 = null;

    @ObfuscatedName("client.io")
    public static boolean field393 = false;

    @ObfuscatedName("client.ip")
    public static int field385 = -1;

    @ObfuscatedName("client.if")
    public static int field392 = -1;

    @ObfuscatedName("client.ir")
    public static String field440 = null;

    @ObfuscatedName("client.jf")
    public static String field441 = null;

    @ObfuscatedName("client.js")
    public static int field442 = -1;

    @ObfuscatedName("client.jd")
    public static class187 field443 = new class187(8);

    @ObfuscatedName("client.jn")
    public static int field444 = 0;

    @ObfuscatedName("client.jr")
    public static int field445 = 0;

    @ObfuscatedName("client.ja")
    public static class164 field546 = null;

    @ObfuscatedName("client.jz")
    public static int field373 = 0;

    @ObfuscatedName("client.ji")
    public static int field448 = 0;

    @ObfuscatedName("client.ju")
    public static int field449 = 0;

    @ObfuscatedName("client.jq")
    public static int field306 = -1;

    @ObfuscatedName("client.jp")
    public static boolean field451 = false;

    @ObfuscatedName("client.jv")
    public static boolean field329 = false;

    @ObfuscatedName("client.jw")
    public static boolean field538 = false;

    @ObfuscatedName("client.je")
    public static class164 field376 = null;

    @ObfuscatedName("client.jc")
    public static class164 field455 = null;

    @ObfuscatedName("client.jt")
    public static class164 field456 = null;

    @ObfuscatedName("client.jx")
    public static int field457 = 0;

    @ObfuscatedName("client.jg")
    public static int field458 = 0;

    @ObfuscatedName("client.jo")
    public static class164 field459 = null;

    @ObfuscatedName("client.jj")
    public static boolean field460 = false;

    @ObfuscatedName("client.jm")
    public static int field407 = -1;

    @ObfuscatedName("client.jh")
    public static int field520 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field463 = false;

    @ObfuscatedName("client.jy")
    public static int field464 = -1;

    @ObfuscatedName("client.jk")
    public static int field402 = -1;

    @ObfuscatedName("client.jl")
    public static boolean field466 = false;

    @ObfuscatedName("client.kp")
    public static int field467 = 1;

    @ObfuscatedName("client.kn")
    public static int[] field461 = new int[32];

    @ObfuscatedName("client.kz")
    public static int field481 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field470 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field471 = 0;

    @ObfuscatedName("client.km")
    public static int[] field472 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field494 = 0;

    @ObfuscatedName("client.ko")
    public static int field474 = 0;

    @ObfuscatedName("client.kx")
    public static int field475 = 0;

    @ObfuscatedName("client.ks")
    public static int field476 = 0;

    @ObfuscatedName("client.kq")
    public static int field477 = 0;

    @ObfuscatedName("client.kt")
    public static int field478 = 0;

    @ObfuscatedName("client.ka")
    public static int field411 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field534 = new int[2000];

    @ObfuscatedName("client.kf")
    public static String[] field438 = new String[1000];

    @ObfuscatedName("client.kj")
    public static int field482 = 0;

    @ObfuscatedName("client.kb")
    public static class190 field483 = new class190();

    @ObfuscatedName("client.kd")
    public static class190 field484 = new class190();

    @ObfuscatedName("client.kr")
    public static class190 field485 = new class190();

    @ObfuscatedName("client.ln")
    public static class187 field309 = new class187(512);

    @ObfuscatedName("client.lj")
    public static int field487 = 0;

    @ObfuscatedName("client.lq")
    public static int field416 = -2;

    @ObfuscatedName("client.lh")
    public static boolean[] field489 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static boolean[] field490 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static boolean[] field491 = new boolean[100];

    @ObfuscatedName("client.ly")
    public static int[] field297 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field493 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field369 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field495 = new int[100];

    @ObfuscatedName("client.lr")
    public static int field496 = 0;

    @ObfuscatedName("client.ls")
    public static long field497 = 0L;

    @ObfuscatedName("client.le")
    public static boolean field498 = true;

    @ObfuscatedName("client.li")
    public static int field468 = 765;

    @ObfuscatedName("client.lc")
    public static int field500 = 503;

    @ObfuscatedName("client.lw")
    public static int[] field501 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lz")
    public static int field502 = 0;

    @ObfuscatedName("client.lu")
    public static int field503 = 0;

    @ObfuscatedName("client.ld")
    public static String field540 = "";

    @ObfuscatedName("client.mb")
    public static long[] field345 = new long[100];

    @ObfuscatedName("client.mn")
    public static int field506 = 0;

    @ObfuscatedName("client.mg")
    public static int field507 = 0;

    @ObfuscatedName("client.mi")
    public static int[] field352 = new int[128];

    @ObfuscatedName("client.ma")
    public static int[] field509 = new int[128];

    @ObfuscatedName("client.me")
    public static long field446 = -1L;

    @ObfuscatedName("client.ml")
    public static String field391 = null;

    @ObfuscatedName("client.mk")
    public static String field512 = null;

    @ObfuscatedName("client.md")
    public static int field513 = -1;

    @ObfuscatedName("client.mv")
    public static int field514 = 0;

    @ObfuscatedName("client.mu")
    public static int[] field515 = new int[1000];

    @ObfuscatedName("client.mz")
    public static int[] field516 = new int[1000];

    @ObfuscatedName("client.mt")
    public static class74[] field469 = new class74[1000];

    @ObfuscatedName("client.mq")
    public static int field321 = 0;

    @ObfuscatedName("client.ms")
    public static int field519 = 0;

    @ObfuscatedName("client.na")
    public static int field562 = 0;

    @ObfuscatedName("client.nd")
    public static int field522 = 255;

    @ObfuscatedName("client.ne")
    public static int field523 = -1;

    @ObfuscatedName("client.nk")
    public static boolean field524 = false;

    @ObfuscatedName("client.nc")
    public static int field537 = 127;

    @ObfuscatedName("client.nt")
    public static int field526 = 127;

    @ObfuscatedName("client.nf")
    public static int field527 = 0;

    @ObfuscatedName("client.nb")
    public static int[] field462 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field529 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field565 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field488 = new int[50];

    @ObfuscatedName("client.nj")
    public static class54[] field437 = new class54[50];

    @ObfuscatedName("client.nz")
    public static boolean field533 = false;

    @ObfuscatedName("client.oh")
    public static boolean[] field439 = new boolean[5];

    @ObfuscatedName("client.om")
    public static int[] field536 = new int[5];

    @ObfuscatedName("client.ol")
    public static int[] field280 = new int[5];

    @ObfuscatedName("client.on")
    public static int[] field435 = new int[5];

    @ObfuscatedName("client.of")
    public static int[] field425 = new int[5];

    @ObfuscatedName("client.oe")
    public static short field525 = 256;

    @ObfuscatedName("client.oc")
    public static short field541 = 205;

    @ObfuscatedName("client.oi")
    public static short field542 = 256;

    @ObfuscatedName("client.ot")
    public static short field543 = 320;

    @ObfuscatedName("client.os")
    public static short field531 = 1;

    @ObfuscatedName("client.ov")
    public static short field545 = 32767;

    @ObfuscatedName("client.oa")
    public static short field480 = 1;

    @ObfuscatedName("client.od")
    public static short field547 = 32767;

    @ObfuscatedName("client.or")
    public static int field548 = 0;

    @ObfuscatedName("client.og")
    public static int field346 = 0;

    @ObfuscatedName("client.oz")
    public static int field550 = 0;

    @ObfuscatedName("client.oo")
    public static int field412 = 0;

    @ObfuscatedName("client.oy")
    public static int field367 = 0;

    @ObfuscatedName("client.op")
    public static int field553 = 0;

    @ObfuscatedName("client.ob")
    public static int field539 = 0;

    @ObfuscatedName("client.ok")
    public static class17[] field518 = new class17[400];

    @ObfuscatedName("client.pv")
    public static class186 field556 = new class186();

    @ObfuscatedName("client.po")
    public static int field557 = 0;

    @ObfuscatedName("client.pp")
    public static class8[] field298 = new class8[400];

    @ObfuscatedName("client.pl")
    public static class170 field559 = new class170();

    @ObfuscatedName("client.pq")
    public static int field560 = -1;

    @ObfuscatedName("client.ps")
    public static int field561 = -1;

    @ObfuscatedName("client.pg")
    public static class211[] field314 = new class211[6];

    @ObfuscatedName("client.a(I)V")
    public final void method170() {
    }

    public final void init() {
        if (!this.method2711()) {
            return;
        }
        class181[] var1 = new class181[] { class181.field2967, class181.field2956, class181.field2964, class181.field2960, class181.field2963, class181.field2959, class181.field2971, class181.field2965, class181.field2958, class181.field2955, class181.field2969, class181.field2968, class181.field2957, class181.field2966, class181.field2962 };
        class181[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class181 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2970);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2970)) {
                    case 1:
                        Statics.field628 = Integer.parseInt(var5);
                        break;
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field33)) {
                            field284 = true;
                        } else {
                            field284 = false;
                        }
                        break;
                    case 3:
                        Statics.field136 = (class145) class101.method648(class145.method2898(), Integer.parseInt(var5));
                        if (Statics.field136 == class145.field2176) {
                            Statics.field578 = class203.field3034;
                        } else {
                            Statics.field578 = class203.field3042;
                        }
                        break;
                    case 4:
                        Statics.field2538 = var5;
                    case 5:
                    case 6:
                    case 11:
                    default:
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field33)) {
                        }
                        break;
                    case 8:
                        field282 = Integer.parseInt(var5);
                        break;
                    case 9:
                        Statics.field3059 = class144.method539(Integer.parseInt(var5));
                        break;
                    case 10:
                        Statics.field2083 = Integer.parseInt(var5);
                        break;
                    case 12:
                        field286 = Integer.parseInt(var5);
                        break;
                    case 13:
                        field281 = Integer.parseInt(var5);
                        break;
                    case 14:
                        Statics.field1953 = var5;
                        break;
                    case 15:
                        field310 = Integer.parseInt(var5);
                }
            }
        }
        method1126();
        Statics.field1574 = this.getCodeBase().getHost();
        String var6 = Statics.field3059.field2167;
        byte var7 = 0;
        try {
            class141.method3622("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class140.method2829((String) null, var9);
        }
        Statics.field279 = this;
        this.method2773(765, 503, 80);
    }

    @ObfuscatedName("bl.s(I)V")
    public static final void method1126() {
        class81.field1464 = false;
        field285 = false;
    }

    @ObfuscatedName("client.j(I)V")
    public final void method173() {
        Statics.field315 = field310 == 0 ? 43594 : field281 + 40000;
        Statics.field996 = field310 == 0 ? 443 : field281 + 50000;
        Statics.field154 = Statics.field315;
        Statics.field2810 = class165.field2784;
        Statics.field64 = class165.field2782;
        Statics.field3053 = class165.field2783;
        Statics.field2811 = class165.field2781;
        class129.method2399();
        class129.method2488(Statics.field139);
        Canvas var1 = Statics.field139;
        var1.addMouseListener(class132.field2058);
        var1.addMouseMotionListener(class132.field2058);
        var1.addFocusListener(class132.field2058);
        Statics.field950 = class123.method13();
        if (Statics.field950 != null) {
            Statics.field950.method2524(Statics.field139);
        }
        Statics.field2536 = new class126(255, class141.field2137, class141.field2144, 500000);
        class218 var2 = null;
        class9 var3 = new class9();
        try {
            var2 = class141.method1076("", Statics.field136.field2177, false);
            byte[] var4 = new byte[(int) var2.method3755()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3751(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class9(new class111(var4));
        } catch (Exception var12) {
        }
        try {
            if (var2 != null) {
                var2.method3754();
            }
        } catch (Exception var11) {
        }
        Statics.field134 = var3;
        Statics.field563 = this.getToolkit().getSystemClipboard();
        class130.method32(this, Statics.field657);
        if (field310 != 0) {
            field295 = true;
        }
        int var10 = Statics.field134.field152;
        field497 = 0L;
        if (var10 >= 2) {
            field498 = true;
        } else {
            field498 = false;
        }
        method541();
        if (field555 >= 25) {
            method2521();
        }
        field2109 = true;
    }

    @ObfuscatedName("client.f(B)V")
    public final void method432() {
        field289++;
        this.method415();
        while (true) {
            class190 var1 = class161.field2606;
            class160 var2;
            synchronized (class161.field2606) {
                var2 = (class160) class161.field2607.method3466();
            }
            if (var2 == null) {
                Statics.method2808();
                method2();
                class129.method1683();
                class132 var4 = class132.field2058;
                synchronized (class132.field2058) {
                    class132.field2062 = class132.field2055;
                    class132.field2070 = class132.field2056;
                    class132.field2067 = class132.field2057;
                    class132.field2065 = class132.field2061;
                    class132.field2066 = class132.field2059;
                    class132.field2060 = class132.field2063;
                    class132.field2068 = class132.field2064;
                    class132.field2061 = 0;
                }
                if (Statics.field950 != null) {
                    int var6 = Statics.field950.method2527();
                    field482 = var6;
                }
                if (field555 == 0) {
                    method3097();
                    class136.method2517();
                } else if (field555 == 5) {
                    class30.method1956(this);
                    method3097();
                    class136.method2517();
                } else if (field555 == 10 || field555 == 11) {
                    class30.method1956(this);
                } else if (field555 == 20) {
                    class30.method1956(this);
                    method3032();
                } else if (field555 == 25) {
                    method2809(false);
                    field333 = 0;
                    boolean var7 = true;
                    for (int var8 = 0; var8 < Statics.field77.length; var8++) {
                        if (Statics.field2530[var8] != -1 && Statics.field77[var8] == null) {
                            Statics.field77[var8] = Statics.field2552.method2929(Statics.field2530[var8], 0);
                            if (Statics.field77[var8] == null) {
                                var7 = false;
                                field333++;
                            }
                        }
                        if (Statics.field228[var8] != -1 && Statics.field3057[var8] == null) {
                            Statics.field3057[var8] = Statics.field2552.method2928(Statics.field228[var8], 0, Statics.field2794[var8]);
                            if (Statics.field3057[var8] == null) {
                                var7 = false;
                                field333++;
                            }
                        }
                    }
                    if (var7) {
                        field479 = 0;
                        boolean var9 = true;
                        for (int var10 = 0; var10 < Statics.field77.length; var10++) {
                            byte[] var11 = Statics.field3057[var10];
                            if (var11 != null) {
                                int var12 = (Statics.field1506[var10] >> 8) * 64 - Statics.field2594;
                                int var13 = (Statics.field1506[var10] & 0xFF) * 64 - Statics.field954;
                                if (field339) {
                                    var12 = 10;
                                    var13 = 10;
                                }
                                boolean var15 = true;
                                class111 var16 = new class111(var11);
                                int var17 = -1;
                                label616: while (true) {
                                    int var18 = var16.method2378();
                                    if (var18 == 0) {
                                        var9 &= var15;
                                        break;
                                    }
                                    var17 += var18;
                                    int var19 = 0;
                                    boolean var20 = false;
                                    while (true) {
                                        while (!var20) {
                                            int var22 = var16.method2378();
                                            if (var22 == 0) {
                                                continue label616;
                                            }
                                            var19 += var22 - 1;
                                            int var23 = var19 & 0x3F;
                                            int var24 = var19 >> 6 & 0x3F;
                                            int var25 = var16.method2211() >> 2;
                                            int var26 = var12 + var24;
                                            int var27 = var13 + var23;
                                            if (var26 > 0 && var27 > 0 && var26 < 103 && var27 < 103) {
                                                class38 var28 = class38.method879(var17);
                                                if (var25 != 22 || !field285 || var28.field903 != 0 || var28.field934 == 1 || var28.field922) {
                                                    if (!var28.method687()) {
                                                        field479++;
                                                        var15 = false;
                                                    }
                                                    var20 = true;
                                                }
                                            }
                                        }
                                        int var21 = var16.method2378();
                                        if (var21 == 0) {
                                            break;
                                        }
                                        var16.method2211();
                                    }
                                }
                            }
                        }
                        if (var9) {
                            if (field337 != 0) {
                                method1861(class148.field2282 + class2.field27 + class2.field23 + 100 + "%" + class2.field20, true);
                            }
                            method2();
                            method1397();
                            method2();
                            Statics.field684.method1693();
                            method2();
                            System.gc();
                            for (int var30 = 0; var30 < 4; var30++) {
                                field338[var30].method3800();
                            }
                            for (int var31 = 0; var31 < 4; var31++) {
                                for (int var32 = 0; var32 < 104; var32++) {
                                    for (int var33 = 0; var33 < 104; var33++) {
                                        class6.field83[var31][var32][var33] = 0;
                                    }
                                }
                            }
                            method2();
                            class6.method9();
                            int var34 = Statics.field77.length;
                            for (class22 var35 = (class22) class22.field611.method3468(); var35 != null; var35 = (class22) class22.field611.method3470()) {
                                if (var35.field610 != null) {
                                    Statics.field2476.method994(var35.field610);
                                    var35.field610 = null;
                                }
                                if (var35.field613 != null) {
                                    Statics.field2476.method994(var35.field613);
                                    var35.field613 = null;
                                }
                            }
                            class22.field611.method3480();
                            method2809(true);
                            if (!field339) {
                                for (int var36 = 0; var36 < var34; var36++) {
                                    int var37 = (Statics.field1506[var36] >> 8) * 64 - Statics.field2594;
                                    int var38 = (Statics.field1506[var36] & 0xFF) * 64 - Statics.field954;
                                    byte[] var39 = Statics.field77[var36];
                                    if (var39 != null) {
                                        method2();
                                        class6.method2824(var39, var37, var38, Statics.field993 * 8 - 48, Statics.field1933 * 8 - 48, field338);
                                    }
                                }
                                for (int var40 = 0; var40 < var34; var40++) {
                                    int var41 = (Statics.field1506[var40] >> 8) * 64 - Statics.field2594;
                                    int var42 = (Statics.field1506[var40] & 0xFF) * 64 - Statics.field954;
                                    byte[] var43 = Statics.field77[var40];
                                    if (var43 == null && Statics.field1933 < 800) {
                                        method2();
                                        class6.method2047(var41, var42, 64, 64);
                                    }
                                }
                                method2809(true);
                                for (int var44 = 0; var44 < var34; var44++) {
                                    byte[] var45 = Statics.field3057[var44];
                                    if (var45 != null) {
                                        int var46 = (Statics.field1506[var44] >> 8) * 64 - Statics.field2594;
                                        int var47 = (Statics.field1506[var44] & 0xFF) * 64 - Statics.field954;
                                        method2();
                                        class81 var48 = Statics.field684;
                                        class220[] var49 = field338;
                                        class111 var50 = new class111(var45);
                                        int var51 = -1;
                                        while (true) {
                                            int var52 = var50.method2378();
                                            if (var52 == 0) {
                                                break;
                                            }
                                            var51 += var52;
                                            int var53 = 0;
                                            while (true) {
                                                int var54 = var50.method2378();
                                                if (var54 == 0) {
                                                    break;
                                                }
                                                var53 += var54 - 1;
                                                int var55 = var53 & 0x3F;
                                                int var56 = var53 >> 6 & 0x3F;
                                                int var57 = var53 >> 12;
                                                int var58 = var50.method2211();
                                                int var59 = var58 >> 2;
                                                int var60 = var58 & 0x3;
                                                int var61 = var46 + var56;
                                                int var62 = var47 + var55;
                                                if (var61 > 0 && var62 > 0 && var61 < 103 && var62 < 103) {
                                                    int var63 = var57;
                                                    if ((class6.field83[1][var61][var62] & 0x2) == 2) {
                                                        var63 = var57 - 1;
                                                    }
                                                    class220 var64 = null;
                                                    if (var63 >= 0) {
                                                        var64 = var49[var63];
                                                    }
                                                    class6.method6(var57, var61, var62, var51, var60, var59, var48, var64);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field339) {
                                int var65 = 0;
                                label515: while (true) {
                                    if (var65 >= 4) {
                                        for (int var97 = 0; var97 < 13; var97++) {
                                            for (int var98 = 0; var98 < 13; var98++) {
                                                int var99 = field340[0][var97][var98];
                                                if (var99 == -1) {
                                                    class6.method2047(var97 * 8, var98 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2809(true);
                                        int var100 = 0;
                                        while (true) {
                                            if (var100 >= 4) {
                                                break label515;
                                            }
                                            method2();
                                            for (int var101 = 0; var101 < 13; var101++) {
                                                label438: for (int var102 = 0; var102 < 13; var102++) {
                                                    int var103 = field340[var100][var101][var102];
                                                    if (var103 != -1) {
                                                        int var104 = var103 >> 24 & 0x3;
                                                        int var105 = var103 >> 1 & 0x3;
                                                        int var106 = var103 >> 14 & 0x3FF;
                                                        int var107 = var103 >> 3 & 0x7FF;
                                                        int var108 = (var106 / 8 << 8) + var107 / 8;
                                                        for (int var109 = 0; var109 < Statics.field1506.length; var109++) {
                                                            if (Statics.field1506[var109] == var108 && Statics.field3057[var109] != null) {
                                                                byte[] var110 = Statics.field3057[var109];
                                                                int var111 = var101 * 8;
                                                                int var112 = var102 * 8;
                                                                int var113 = (var106 & 0x7) * 8;
                                                                int var114 = (var107 & 0x7) * 8;
                                                                class81 var115 = Statics.field684;
                                                                class220[] var116 = field338;
                                                                class111 var117 = new class111(var110);
                                                                int var118 = -1;
                                                                while (true) {
                                                                    int var119 = var117.method2378();
                                                                    if (var119 == 0) {
                                                                        continue label438;
                                                                    }
                                                                    var118 += var119;
                                                                    int var120 = 0;
                                                                    while (true) {
                                                                        int var121 = var117.method2378();
                                                                        if (var121 == 0) {
                                                                            break;
                                                                        }
                                                                        var120 += var121 - 1;
                                                                        int var122 = var120 & 0x3F;
                                                                        int var123 = var120 >> 6 & 0x3F;
                                                                        int var124 = var120 >> 12;
                                                                        int var125 = var117.method2211();
                                                                        int var126 = var125 >> 2;
                                                                        int var127 = var125 & 0x3;
                                                                        if (var104 == var124 && var123 >= var113 && var123 < var113 + 8 && var122 >= var114 && var122 < var114 + 8) {
                                                                            class38 var128 = class38.method879(var118);
                                                                            int var129 = var111 + class168.method2479(var123 & 0x7, var122 & 0x7, var105, var128.field904, var128.field905, var127);
                                                                            int var131 = var123 & 0x7;
                                                                            int var132 = var122 & 0x7;
                                                                            int var134 = var128.field904;
                                                                            int var135 = var128.field905;
                                                                            if ((var127 & 0x1) == 1) {
                                                                                int var136 = var134;
                                                                                var134 = var135;
                                                                                var135 = var136;
                                                                            }
                                                                            int var137 = var105 & 0x3;
                                                                            int var138;
                                                                            if (var137 == 0) {
                                                                                var138 = var132;
                                                                            } else if (var137 == 1) {
                                                                                var138 = 7 - var131 - (var134 - 1);
                                                                            } else if (var137 == 2) {
                                                                                var138 = 7 - var132 - (var135 - 1);
                                                                            } else {
                                                                                var138 = var131;
                                                                            }
                                                                            int var139 = var112 + var138;
                                                                            if (var129 > 0 && var139 > 0 && var129 < 103 && var139 < 103) {
                                                                                int var140 = var100;
                                                                                if ((class6.field83[1][var129][var139] & 0x2) == 2) {
                                                                                    var140 = var100 - 1;
                                                                                }
                                                                                class220 var141 = null;
                                                                                if (var140 >= 0) {
                                                                                    var141 = var116[var140];
                                                                                }
                                                                                class6.method6(var100, var129, var139, var118, var105 + var127 & 0x3, var126, var115, var141);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var100++;
                                        }
                                    }
                                    method2();
                                    for (int var66 = 0; var66 < 13; var66++) {
                                        for (int var67 = 0; var67 < 13; var67++) {
                                            boolean var68 = false;
                                            int var69 = field340[var65][var66][var67];
                                            if (var69 != -1) {
                                                int var70 = var69 >> 24 & 0x3;
                                                int var71 = var69 >> 1 & 0x3;
                                                int var72 = var69 >> 14 & 0x3FF;
                                                int var73 = var69 >> 3 & 0x7FF;
                                                int var74 = (var72 / 8 << 8) + var73 / 8;
                                                for (int var75 = 0; var75 < Statics.field1506.length; var75++) {
                                                    if (Statics.field1506[var75] == var74 && Statics.field77[var75] != null) {
                                                        byte[] var76 = Statics.field77[var75];
                                                        int var77 = var66 * 8;
                                                        int var78 = var67 * 8;
                                                        int var79 = (var72 & 0x7) * 8;
                                                        int var80 = (var73 & 0x7) * 8;
                                                        class220[] var81 = field338;
                                                        for (int var82 = 0; var82 < 8; var82++) {
                                                            for (int var83 = 0; var83 < 8; var83++) {
                                                                if (var77 + var82 > 0 && var77 + var82 < 103 && var78 + var83 > 0 && var78 + var83 < 103) {
                                                                    var81[var65].field3137[var77 + var82][var78 + var83] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class111 var84 = new class111(var76);
                                                        for (int var85 = 0; var85 < 4; var85++) {
                                                            for (int var86 = 0; var86 < 64; var86++) {
                                                                for (int var87 = 0; var87 < 64; var87++) {
                                                                    if (var70 == var85 && var86 >= var79 && var86 < var79 + 8 && var87 >= var80 && var87 < var80 + 8) {
                                                                        int var90 = var77 + class168.method723(var86 & 0x7, var87 & 0x7, var71);
                                                                        int var92 = var86 & 0x7;
                                                                        int var93 = var87 & 0x7;
                                                                        int var95 = var71 & 0x3;
                                                                        int var96;
                                                                        if (var95 == 0) {
                                                                            var96 = var93;
                                                                        } else if (var95 == 1) {
                                                                            var96 = 7 - var92;
                                                                        } else if (var95 == 2) {
                                                                            var96 = 7 - var93;
                                                                        } else {
                                                                            var96 = var92;
                                                                        }
                                                                        class6.method2052(var84, var65, var90, var78 + var96, 0, 0, var71);
                                                                    } else {
                                                                        class6.method2052(var84, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var68 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var68) {
                                                class6.method2522(var65, var66 * 8, var67 * 8);
                                            }
                                        }
                                    }
                                    var65++;
                                }
                            }
                            method2809(true);
                            method1397();
                            method2();
                            class6.method1942(Statics.field684, field338);
                            method2809(true);
                            int var142 = class6.field84;
                            if (var142 > Statics.field599) {
                                var142 = Statics.field599;
                            }
                            if (var142 < Statics.field599 - 1) {
                                int var143 = Statics.field599 - 1;
                            }
                            if (field285) {
                                Statics.field684.method1847(class6.field84);
                            } else {
                                Statics.field684.method1847(0);
                            }
                            for (int var144 = 0; var144 < 104; var144++) {
                                for (int var145 = 0; var145 < 104; var145++) {
                                    method11(var144, var145);
                                }
                            }
                            method2();
                            for (class16 var146 = (class16) field558.method3468(); var146 != null; var146 = (class16) field558.method3470()) {
                                if (var146.field244 == -1) {
                                    var146.field238 = 0;
                                    method649(var146);
                                } else {
                                    var146.method3554();
                                }
                            }
                            class38.field892.method3398();
                            if (Statics.field616 != null) {
                                field320.method2453(202);
                                field320.method2204(1057001181);
                            }
                            if (!field339) {
                                int var147 = (Statics.field993 - 6) / 8;
                                int var148 = (Statics.field993 + 6) / 8;
                                int var149 = (Statics.field1933 - 6) / 8;
                                int var150 = (Statics.field1933 + 6) / 8;
                                for (int var151 = var147 - 1; var151 <= var148 + 1; var151++) {
                                    for (int var152 = var149 - 1; var152 <= var150 + 1; var152++) {
                                        if (var151 < var147 || var151 > var148 || var152 < var149 || var152 > var150) {
                                            Statics.field2552.method2982("m" + var151 + "_" + var152);
                                            Statics.field2552.method2982("l" + var151 + "_" + var152);
                                        }
                                    }
                                }
                            }
                            method46(30);
                            method2();
                            class6.method12();
                            field320.method2453(52);
                            class136.method2517();
                        } else {
                            field337 = 2;
                        }
                    } else {
                        field337 = 1;
                    }
                }
                if (field555 == 30) {
                    method511();
                } else if (field555 == 40 || field555 == 45) {
                    method3032();
                }
                return;
            }
            var2.field2598.method3001(var2.field2597, (int) var2.field3018, var2.field2600, false);
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method383() {
        boolean var1 = class174.method2638();
        if (var1 && field524 && Statics.field270 != null) {
            Statics.field270.method1045();
        }
        if (field555 == 10 || field555 == 20 || field555 == 30) {
            if (field497 != 0L && class107.method3364() > field497) {
                int var2 = field498 ? 2 : 1;
                field497 = 0L;
                if (var2 >= 2) {
                    field498 = true;
                } else {
                    field498 = false;
                }
                method541();
                if (field555 >= 25) {
                    method2521();
                }
                field2109 = true;
            } else if (field2114) {
                class129.method944(Statics.field139);
                class132.method2155(Statics.field139);
                if (Statics.field950 != null) {
                    Statics.field950.method2525(Statics.field139);
                }
                Statics.field279.method2710();
                Statics.field139.setBackground(Color.black);
                class129.method2488(Statics.field139);
                Canvas var3 = Statics.field139;
                var3.addMouseListener(class132.field2058);
                var3.addMouseMotionListener(class132.field2058);
                var3.addFocusListener(class132.field2058);
                if (Statics.field950 != null) {
                    Statics.field950.method2524(Statics.field139);
                }
                if (field442 != -1) {
                    method153(field442, Statics.field1408, Statics.field1949, false);
                }
                field2101 = true;
            }
        }
        Dimension var4 = this.method2721();
        if (Statics.field166 != var4.width || Statics.field1015 != var4.height || field2101) {
            method541();
            field497 = class107.method3364() + 500L;
            field2101 = false;
        }
        boolean var5 = false;
        if (field2109) {
            field2109 = false;
            var5 = true;
            for (int var6 = 0; var6 < 100; var6++) {
                field489[var6] = true;
            }
        }
        if (var5) {
            method525();
        }
        if (field555 == 0) {
            int var7 = class30.field717;
            String var8 = class30.field704;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field139.getGraphics();
                if (Statics.field1867 == null) {
                    Statics.field1867 = new Font("Helvetica", 1, 13);
                    Statics.field2197 = Statics.field139.getFontMetrics(Statics.field1867);
                }
                if (var5) {
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field1408, Statics.field1949);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field637 == null) {
                        Statics.field637 = Statics.field139.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field637.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field1867);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field2197.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field637, Statics.field1408 / 2 - 152, Statics.field1949 / 2 - 18, (ImageObserver) null);
                } catch (Exception var27) {
                    int var13 = Statics.field1408 / 2 - 152;
                    int var14 = Statics.field1949 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field1867);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field2197.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var28) {
                Statics.field139.repaint();
            }
        } else if (field555 == 5) {
            class30.method1127(Statics.field100, Statics.field1403, Statics.field676, var5);
        } else if (field555 == 10 || field555 == 11) {
            class30.method1127(Statics.field100, Statics.field1403, Statics.field676, var5);
        } else if (field555 == 20) {
            class30.method1127(Statics.field100, Statics.field1403, Statics.field676, var5);
        } else if (field555 == 25) {
            if (field337 == 1) {
                if (field333 > field334) {
                    field334 = field333;
                }
                int var16 = (field334 * 50 - field333 * 50) / field334;
                method1861(class148.field2282 + class2.field27 + class2.field23 + var16 + "%" + class2.field20, false);
            } else if (field337 == 2) {
                if (field479 > field336) {
                    field336 = field479;
                }
                int var17 = (field336 * 50 - field479 * 50) / field336 + 50;
                method1861(class148.field2282 + class2.field27 + class2.field23 + var17 + "%" + class2.field20, false);
            } else {
                method1861(class148.field2282, false);
            }
        } else if (field555 == 30) {
            if (field442 != -1) {
                int var18 = field442;
                if (class164.method915(var18)) {
                    method5(Statics.field2764[var18], -1);
                }
            }
            for (int var19 = 0; var19 < field487; var19++) {
                if (field489[var19]) {
                    field490[var19] = true;
                }
                field491[var19] = field489[var19];
                field489[var19] = false;
            }
            field416 = field289;
            field431 = -1;
            field465 = -1;
            Statics.field102 = null;
            if (field442 != -1) {
                field487 = 0;
                method1954(field442, 0, 0, Statics.field1408, Statics.field1949, 0, 0, -1);
            }
            class75.method1605();
            if (field528) {
                method154();
            } else if (field431 != -1) {
                method1957(field431, field465);
            }
            if (field496 == 3) {
                for (int var20 = 0; var20 < field487; var20++) {
                    if (field491[var20]) {
                        class75.method1611(field297[var20], field493[var20], field369[var20], field495[var20], 16711935, 128);
                    } else if (field490[var20]) {
                        class75.method1611(field297[var20], field493[var20], field369[var20], field495[var20], 16711680, 128);
                    }
                }
            }
            class22.method2480(Statics.field599, Statics.field1994.field830, Statics.field1994.field828, field354);
            field354 = 0;
        } else if (field555 == 40) {
            method1861(class148.field2212 + class2.field27 + class148.field2213, false);
        } else if (field555 == 45) {
            method1861(class148.field2360, false);
        }
        if (field555 == 30 && field496 == 0 && !var5) {
            try {
                Graphics var21 = Statics.field139.getGraphics();
                for (int var22 = 0; var22 < field487; var22++) {
                    if (field490[var22]) {
                        Statics.field59.method1430(var21, field297[var22], field493[var22], field369[var22], field495[var22]);
                        field490[var22] = false;
                    }
                }
            } catch (Exception var30) {
                Statics.field139.repaint();
            }
        } else if (field555 > 0) {
            try {
                Graphics var24 = Statics.field139.getGraphics();
                Statics.field59.method1454(var24, 0, 0);
                for (int var25 = 0; var25 < field487; var25++) {
                    field490[var25] = false;
                }
            } catch (Exception var29) {
                Statics.field139.repaint();
            }
        }
    }

    @ObfuscatedName("client.t(I)V")
    public final void method176() {
        if (Statics.field3110 != null) {
            Statics.field3110.field202 = false;
        }
        Statics.field3110 = null;
        if (Statics.field2560 != null) {
            Statics.field2560.method2685();
            Statics.field2560 = null;
        }
        class129.method3025();
        if (class132.field2058 != null) {
            class132 var1 = class132.field2058;
            synchronized (class132.field2058) {
                class132.field2058 = null;
            }
        }
        Statics.field950 = null;
        if (Statics.field270 != null) {
            Statics.field270.method1041();
        }
        if (Statics.field1982 != null) {
            Statics.field1982.method1041();
        }
        class162.method3011();
        class161.method614();
        try {
            class141.field2137.method3770();
            for (int var3 = 0; var3 < Statics.field2483; var3++) {
                Statics.field1508[var3].method3770();
            }
            class141.field2144.method3770();
            class141.field2142.method3770();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("j.i(II)V")
    public static void method46(int arg0) {
        if (field555 == arg0) {
            return;
        }
        if (field555 == 0) {
            class136.method878();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field311 = 0;
            field312 = 0;
            field313 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2603 != null) {
            Statics.field2603.method2685();
            Statics.field2603 = null;
        }
        if (field555 == 25) {
            field337 = 0;
            field333 = 0;
            field334 = 1;
            field479 = 0;
            field336 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class30.method2443(Statics.field139, Statics.field240, Statics.field115, true, 0);
        } else if (arg0 == 20) {
            class30.method2443(Statics.field139, Statics.field240, Statics.field115, true, field555 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class30.method2443(Statics.field139, Statics.field240, Statics.field115, false, 4);
        } else {
            class30.method2880();
        }
        field555 = arg0;
    }

    @ObfuscatedName("client.c(I)V")
    public void method415() {
        if (field555 == 1000) {
            return;
        }
        long var1 = class107.method3364();
        int var3 = (int) (var1 - Statics.field2613);
        Statics.field2613 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class162.field2612 += var3;
        boolean var4;
        if (class162.field2622 == 0 && class162.field2617 == 0 && class162.field2620 == 0 && class162.field2615 == 0) {
            var4 = true;
        } else if (Statics.field2627 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class162.field2612 > 30000) {
                        throw new IOException();
                    }
                    while (class162.field2617 < 20 && class162.field2615 > 0) {
                        class163 var5 = (class163) class162.field2621.method3428();
                        class111 var6 = new class111(4);
                        var6.method2326(1);
                        var6.method2323((int) var5.field3018);
                        Statics.field2627.method2688(var6.field1904, 0, 4);
                        class162.field2616.method3426(var5, var5.field3018);
                        class162.field2615--;
                        class162.field2617++;
                    }
                    while (class162.field2622 < 20 && class162.field2620 > 0) {
                        class163 var7 = (class163) class162.field2629.method3522();
                        class111 var8 = new class111(4);
                        var8.method2326(0);
                        var8.method2323((int) var7.field3018);
                        Statics.field2627.method2688(var8.field1904, 0, 4);
                        var7.method3527();
                        class162.field2624.method3426(var7, var7.field3018);
                        class162.field2620--;
                        class162.field2622++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2627.method2695();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class162.field2612 = 0;
                        byte var11 = 0;
                        if (Statics.field1405 == null) {
                            var11 = 8;
                        } else if (class162.field2618 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class162.field2628.field1896;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2627.method2702(class162.field2628.field1904, class162.field2628.field1896, var12);
                            if (class162.field2614 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class162.field2628.field1904[class162.field2628.field1896 + var13] ^= class162.field2614;
                                }
                            }
                            class162.field2628.field1896 += var12;
                            if (class162.field2628.field1896 < var11) {
                                break;
                            }
                            if (Statics.field1405 == null) {
                                class162.field2628.field1896 = 0;
                                int var14 = class162.field2628.method2211();
                                int var15 = class162.field2628.method2395();
                                int var16 = class162.field2628.method2211();
                                int var17 = class162.field2628.method2366();
                                long var18 = (long) ((var14 << 16) + var15);
                                class163 var20 = (class163) class162.field2616.method3425(var18);
                                Statics.field1971 = true;
                                if (var20 == null) {
                                    var20 = (class163) class162.field2624.method3425(var18);
                                    Statics.field1971 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1405 = var20;
                                Statics.field775 = new class111(var17 + var21 + Statics.field1405.field2634);
                                Statics.field775.method2326(var16);
                                Statics.field775.method2204(var17);
                                class162.field2618 = 8;
                                class162.field2628.field1896 = 0;
                            } else if (class162.field2618 == 0) {
                                if (class162.field2628.field1904[0] == -1) {
                                    class162.field2618 = 1;
                                    class162.field2628.field1896 = 0;
                                } else {
                                    Statics.field1405 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field775.field1904.length - Statics.field1405.field2634;
                            int var23 = 512 - class162.field2618;
                            if (var23 > var22 - Statics.field775.field1896) {
                                var23 = var22 - Statics.field775.field1896;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2627.method2702(Statics.field775.field1904, Statics.field775.field1896, var23);
                            if (class162.field2614 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field775.field1904[Statics.field775.field1896 + var24] ^= class162.field2614;
                                }
                            }
                            Statics.field775.field1896 += var23;
                            class162.field2618 += var23;
                            if (Statics.field775.field1896 == var22) {
                                if (Statics.field1405.field3018 == 16711935L) {
                                    Statics.field1311 = Statics.field775;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class159 var26 = class162.field2626[var25];
                                        if (var26 != null) {
                                            Statics.field1311.field1896 = var25 * 8 + 5;
                                            int var27 = Statics.field1311.method2366();
                                            int var28 = Statics.field1311.method2366();
                                            var26.method2991(var27, var28);
                                        }
                                    }
                                } else {
                                    class162.field2625.reset();
                                    class162.field2625.update(Statics.field775.field1904, 0, var22);
                                    int var29 = (int) class162.field2625.getValue();
                                    if (Statics.field1405.field2636 != var29) {
                                        try {
                                            Statics.field2627.method2685();
                                        } catch (Exception var35) {
                                        }
                                        class162.field2623++;
                                        Statics.field2627 = null;
                                        class162.field2614 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class162.field2623 = 0;
                                    class162.field2611 = 0;
                                    Statics.field1405.field2637.method2992((int) (Statics.field1405.field3018 & 0xFFFFL), Statics.field775.field1904, (Statics.field1405.field3018 & 0xFF0000L) == 16711680L, Statics.field1971);
                                }
                                Statics.field1405.method3554();
                                if (Statics.field1971) {
                                    class162.field2617--;
                                } else {
                                    class162.field2622--;
                                }
                                class162.field2618 = 0;
                                Statics.field1405 = null;
                                Statics.field775 = null;
                            } else {
                                if (class162.field2618 != 512) {
                                    break;
                                }
                                class162.field2618 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2627.method2685();
                } catch (Exception var34) {
                }
                class162.field2611++;
                Statics.field2627 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method178();
        }
    }

    @ObfuscatedName("client.k(I)V")
    public void method178() {
        if (class162.field2623 >= 4) {
            this.method2745("js5crc");
            field555 = 1000;
            return;
        }
        if (class162.field2611 >= 4) {
            if (field555 <= 5) {
                this.method2745("js5io");
                field555 = 1000;
                return;
            }
            field492 = 3000;
            class162.field2611 = 3;
        }
        if (--field492 + 1 > 0) {
            return;
        }
        try {
            if (field308 == 0) {
                Statics.field698 = Statics.field1869.method2599(Statics.field1574, Statics.field154);
                field308++;
            }
            if (field308 == 1) {
                if (Statics.field698.field2127 == 2) {
                    this.method179(-1);
                    return;
                }
                if (Statics.field698.field2127 == 1) {
                    field308++;
                }
            }
            if (field308 == 2) {
                Statics.field17 = new class135((Socket) Statics.field698.field2123, Statics.field1869);
                class111 var1 = new class111(5);
                var1.method2326(15);
                var1.method2204(80);
                Statics.field17.method2688(var1.field1904, 0, 5);
                field308++;
                Statics.field689 = class107.method3364();
            }
            if (field308 == 3) {
                if (field555 <= 5 || Statics.field17.method2695() > 0) {
                    int var2 = Statics.field17.method2686();
                    if (var2 != 0) {
                        this.method179(var2);
                        return;
                    }
                    field308++;
                } else if (class107.method3364() - Statics.field689 > 30000L) {
                    this.method179(-2);
                    return;
                }
            }
            if (field308 == 4) {
                class135 var3 = Statics.field17;
                boolean var4 = field555 > 20;
                if (Statics.field2627 != null) {
                    try {
                        Statics.field2627.method2685();
                    } catch (Exception var14) {
                    }
                    Statics.field2627 = null;
                }
                Statics.field2627 = var3;
                class162.method2147(var4);
                class162.field2628.field1896 = 0;
                Statics.field1405 = null;
                Statics.field775 = null;
                class162.field2618 = 0;
                while (true) {
                    class163 var6 = (class163) class162.field2616.method3428();
                    if (var6 == null) {
                        while (true) {
                            class163 var7 = (class163) class162.field2624.method3428();
                            if (var7 == null) {
                                if (class162.field2614 != 0) {
                                    try {
                                        class111 var8 = new class111(4);
                                        var8.method2326(4);
                                        var8.method2326(class162.field2614);
                                        var8.method2202(0);
                                        Statics.field2627.method2688(var8.field1904, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2627.method2685();
                                        } catch (Exception var12) {
                                        }
                                        class162.field2611++;
                                        Statics.field2627 = null;
                                    }
                                }
                                class162.field2612 = 0;
                                Statics.field2613 = class107.method3364();
                                Statics.field698 = null;
                                Statics.field17 = null;
                                field308 = 0;
                                field504 = 0;
                                return;
                            }
                            class162.field2629.method3515(var7);
                            class162.field2619.method3426(var7, var7.field3018);
                            class162.field2620++;
                            class162.field2622--;
                        }
                    }
                    class162.field2621.method3426(var6, var6.field3018);
                    class162.field2615++;
                    class162.field2617--;
                }
            }
        } catch (IOException var15) {
            this.method179(-3);
        }
    }

    @ObfuscatedName("client.x(IB)V")
    public void method179(int arg0) {
        Statics.field698 = null;
        Statics.field17 = null;
        field308 = 0;
        if (Statics.field315 == Statics.field154) {
            Statics.field154 = Statics.field996;
        } else {
            Statics.field154 = Statics.field315;
        }
        field504++;
        if (field504 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field555 <= 5) {
                this.method2745("js5connect_full");
                field555 = 1000;
            } else {
                field492 = 3000;
            }
        } else if (field504 >= 2 && arg0 == 6) {
            this.method2745("js5connect_outofdate");
            field555 = 1000;
        } else if (field504 >= 4) {
            if (field555 <= 5) {
                this.method2745("js5connect");
                field555 = 1000;
            } else {
                field492 = 3000;
            }
        }
    }

    @ObfuscatedName("fz.e(B)V")
    public static void method3097() {
        if (field278 == 0) {
            Statics.field684 = new class81(4, 104, 104, class6.field95);
            for (int var0 = 0; var0 < 4; var0++) {
                field338[var0] = new class220(104, 104);
            }
            Statics.field2117 = new class74(512, 512);
            class30.field704 = class148.field2214;
            class30.field717 = 5;
            field278 = 20;
        } else if (field278 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class86.field1539[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class81.method1728(var1, 500, 800, 512, 334);
            class30.field704 = class148.field2439;
            class30.field717 = 10;
            field278 = 30;
        } else if (field278 == 30) {
            Statics.field2165 = method571(0, false, true, true);
            Statics.field567 = method571(1, false, true, true);
            Statics.field203 = method571(2, true, false, true);
            Statics.field1032 = method571(3, false, true, true);
            Statics.field2200 = method571(4, false, true, true);
            Statics.field2552 = method571(5, true, true, true);
            Statics.field259 = method571(6, true, true, false);
            Statics.field1175 = method571(7, false, true, true);
            Statics.field115 = method571(8, false, true, true);
            Statics.field1997 = method571(9, false, true, true);
            Statics.field240 = method571(10, false, true, true);
            Statics.field885 = method571(11, false, true, true);
            Statics.field2954 = method571(12, false, true, true);
            Statics.field193 = method571(13, true, false, true);
            Statics.field119 = method571(14, false, true, false);
            Statics.field1054 = method571(15, false, true, true);
            class30.field704 = class148.field2216;
            class30.field717 = 20;
            field278 = 40;
        } else if (field278 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2165.method2989() * 4 / 100;
            int var8 = var7 + Statics.field567.method2989() * 4 / 100;
            int var9 = var8 + Statics.field203.method2989() * 2 / 100;
            int var10 = var9 + Statics.field1032.method2989() * 2 / 100;
            int var11 = var10 + Statics.field2200.method2989() * 6 / 100;
            int var12 = var11 + Statics.field2552.method2989() * 4 / 100;
            int var13 = var12 + Statics.field259.method2989() * 2 / 100;
            int var14 = var13 + Statics.field1175.method2989() * 60 / 100;
            int var15 = var14 + Statics.field115.method2989() * 2 / 100;
            int var16 = var15 + Statics.field1997.method2989() * 2 / 100;
            int var17 = var16 + Statics.field240.method2989() * 2 / 100;
            int var18 = var17 + Statics.field885.method2989() * 2 / 100;
            int var19 = var18 + Statics.field2954.method2989() * 2 / 100;
            int var20 = var19 + Statics.field193.method2989() * 2 / 100;
            int var21 = var20 + Statics.field119.method2989() * 2 / 100;
            int var22 = var21 + Statics.field1054.method2989() * 2 / 100;
            if (var22 == 100) {
                class30.field704 = class148.field2459;
                class30.field717 = 30;
                field278 = 45;
            } else {
                if (var22 != 0) {
                    class30.field704 = class148.field2379 + var22 + "%";
                }
                class30.field717 = 30;
            }
        } else if (field278 == 45) {
            class52.method513(22050, !field285, 2);
            class175 var23 = new class175();
            var23.method3308(9, 128);
            Statics.field270 = class52.method27(Statics.field1869, Statics.field139, 0, 22050);
            Statics.field270.method1037(var23);
            class174.method494(Statics.field1054, Statics.field119, Statics.field2200, var23);
            Statics.field1982 = class52.method27(Statics.field1869, Statics.field139, 1, 2048);
            Statics.field2476 = new class51();
            Statics.field1982.method1037(Statics.field2476);
            Statics.field799 = new class70(22050, Statics.field1142);
            class30.field704 = class148.field2427;
            class30.field717 = 35;
            field278 = 50;
        } else if (field278 == 50) {
            int var24 = 0;
            if (Statics.field1403 == null) {
                Statics.field1403 = class72.method553(Statics.field115, Statics.field193, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field676 == null) {
                Statics.field676 = class72.method553(Statics.field115, Statics.field193, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field100 == null) {
                Statics.field100 = class72.method553(Statics.field115, Statics.field193, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class30.field704 = class148.field2365 + var24 * 100 / 3 + "%";
                class30.field717 = 40;
            } else {
                Statics.field1881 = new class151(true);
                class30.field704 = class148.field2270;
                class30.field717 = 40;
                field278 = 60;
            }
        } else if (field278 == 60) {
            class159 var25 = Statics.field240;
            class159 var26 = Statics.field115;
            int var27 = 0;
            if (var25.method2926("title.jpg", "")) {
                var27++;
            }
            if (var26.method2926("logo", "")) {
                var27++;
            }
            if (var26.method2926("titlebox", "")) {
                var27++;
            }
            if (var26.method2926("titlebutton", "")) {
                var27++;
            }
            if (var26.method2926("runes", "")) {
                var27++;
            }
            if (var26.method2926("title_mute", "")) {
                var27++;
            }
            if (var26.method2927("options_radio_buttons,0")) {
                var27++;
            }
            if (var26.method2927("options_radio_buttons,2")) {
                var27++;
            }
            var26.method2926("sl_back", "");
            var26.method2926("sl_flags", "");
            var26.method2926("sl_arrows", "");
            var26.method2926("sl_stars", "");
            var26.method2926("sl_button", "");
            byte var30 = 8;
            if (var27 < var30) {
                class30.field704 = class148.field2222 + var27 * 100 / var30 + "%";
                class30.field717 = 50;
            } else {
                class30.field704 = class148.field2223;
                class30.field717 = 50;
                method46(5);
                field278 = 70;
            }
        } else if (field278 == 70) {
            if (Statics.field203.method2913()) {
                class43.method135(Statics.field203);
                class159 var32 = Statics.field203;
                Statics.field948 = var32;
                class159 var33 = Statics.field203;
                class159 var34 = Statics.field1175;
                Statics.field1004 = var33;
                Statics.field1003 = var34;
                Statics.field1005 = Statics.field1004.method2919(3);
                class38.method499(Statics.field203, Statics.field1175, field285);
                class37.method2811(Statics.field203, Statics.field1175);
                class159 var35 = Statics.field203;
                class159 var36 = Statics.field1175;
                boolean var37 = field284;
                class215 var38 = Statics.field1403;
                Statics.field1074 = var35;
                Statics.field1102 = var36;
                Statics.field1072 = var37;
                Statics.field1883 = Statics.field1074.method2919(10);
                Statics.field1633 = var38;
                class159 var39 = Statics.field203;
                class159 var40 = Statics.field2165;
                class159 var41 = Statics.field567;
                Statics.field975 = var39;
                Statics.field887 = var40;
                Statics.field956 = var41;
                class41.method543(Statics.field203, Statics.field1175);
                class44.method2965(Statics.field203);
                class159 var42 = Statics.field203;
                Statics.field1123 = var42;
                Statics.field1930 = Statics.field1123.method2919(16);
                class164.method2149(Statics.field1032, Statics.field1175, Statics.field115, Statics.field193);
                class46.method561(Statics.field203);
                class159 var43 = Statics.field203;
                Statics.field1058 = var43;
                class30.field704 = class148.field2225;
                class30.field717 = 60;
                field278 = 80;
            } else {
                class30.field704 = class148.field2327 + Statics.field203.method2996() + "%";
                class30.field717 = 60;
            }
        } else if (field278 == 80) {
            int var44 = 0;
            if (Statics.field2596 == null) {
                class159 var45 = Statics.field115;
                int var46 = var45.method2924("compass");
                int var47 = var45.method2935(var46, "");
                class74 var48 = class72.method646(var45, var46, var47);
                Statics.field2596 = var48;
            } else {
                var44++;
            }
            if (Statics.field1977 == null) {
                Statics.field1977 = class72.method840(Statics.field115, "mapedge", "");
            } else {
                var44++;
            }
            if (Statics.field1809 == null) {
                Statics.field1809 = Statics.method555(Statics.field115, "mapscene", "");
            } else {
                var44++;
            }
            if (Statics.field974 == null) {
                Statics.field974 = class72.method25(Statics.field115, "mapfunction", "");
            } else {
                var44++;
            }
            if (Statics.field133 == null) {
                Statics.field133 = class72.method25(Statics.field115, "hitmarks", "");
            } else {
                var44++;
            }
            if (Statics.field997 == null) {
                Statics.field997 = class72.method25(Statics.field115, "headicons_pk", "");
            } else {
                var44++;
            }
            if (Statics.field28 == null) {
                Statics.field28 = class72.method25(Statics.field115, "headicons_prayer", "");
            } else {
                var44++;
            }
            if (Statics.field1852 == null) {
                Statics.field1852 = class72.method25(Statics.field115, "headicons_hint", "");
            } else {
                var44++;
            }
            if (Statics.field29 == null) {
                Statics.field29 = class72.method25(Statics.field115, "mapmarker", "");
            } else {
                var44++;
            }
            if (Statics.field355 == null) {
                Statics.field355 = class72.method25(Statics.field115, "cross", "");
            } else {
                var44++;
            }
            if (Statics.field356 == null) {
                Statics.field356 = class72.method25(Statics.field115, "mapdots", "");
            } else {
                var44++;
            }
            if (Statics.field1410 == null) {
                Statics.field1410 = Statics.method555(Statics.field115, "scrollbar", "");
            } else {
                var44++;
            }
            if (Statics.field78 == null) {
                Statics.field78 = Statics.method555(Statics.field115, "mod_icons", "");
            } else {
                var44++;
            }
            if (var44 < 13) {
                class30.field704 = class148.field2323 + var44 * 100 / 13 + "%";
                class30.field717 = 70;
            } else {
                Statics.field3094 = Statics.field78;
                Statics.field1977.method1564();
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 41.0D) - 20;
                for (int var53 = 0; var53 < Statics.field974.length; var53++) {
                    Statics.field974[var53].method1507(var49 + var52, var50 + var52, var51 + var52);
                }
                Statics.field1809[0].method1662(var49 + var52, var50 + var52, var51 + var52);
                class30.field704 = class148.field2227;
                class30.field717 = 70;
                field278 = 90;
            }
        } else if (field278 == 90) {
            if (Statics.field1997.method2913()) {
                class90 var54 = new class90(Statics.field1997, Statics.field115, 20, 0.8D, field285 ? 64 : 128);
                class86.method1870(var54);
                class86.method1871(0.8D);
                class30.field704 = class148.field2229;
                class30.field717 = 90;
                field278 = 110;
            } else {
                class30.field704 = class148.field2228 + Statics.field1997.method2996() + "%";
                class30.field717 = 90;
            }
        } else if (field278 == 110) {
            Statics.field3110 = new class13();
            Statics.field1869.method2581(Statics.field3110, 10);
            class30.field704 = class148.field2230;
            class30.field717 = 94;
            field278 = 120;
        } else if (field278 == 120) {
            if (Statics.field240.method2926("huffman", "")) {
                class105 var55 = new class105(Statics.field240.method2911("huffman", ""));
                Statics.field3084 = var55;
                class30.field704 = class148.field2221;
                class30.field717 = 96;
                field278 = 130;
            } else {
                class30.field704 = class148.field2231 + "%";
                class30.field717 = 96;
            }
        } else if (field278 == 130) {
            if (!Statics.field1032.method2913()) {
                class30.field704 = class148.field2233 + Statics.field1032.method2996() * 4 / 5 + "%";
                class30.field717 = 100;
            } else if (!Statics.field2954.method2913()) {
                class30.field704 = class148.field2233 + (80 + Statics.field2954.method2996() / 6) + "%";
                class30.field717 = 100;
            } else if (Statics.field193.method2913()) {
                class30.field704 = class148.field2234;
                class30.field717 = 100;
                field278 = 140;
            } else {
                class30.field704 = class148.field2233 + (96 + Statics.field193.method2996() / 20) + "%";
                class30.field717 = 100;
            }
        } else if (field278 == 140) {
            method46(10);
        }
    }

    @ObfuscatedName("aq.q(IZZZI)Lft;")
    public static class159 method571(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class126 var4 = null;
        if (class141.field2137 != null) {
            var4 = new class126(arg0, class141.field2137, Statics.field1508[arg0], 1000000);
        }
        return new class159(var4, Statics.field2536, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("fp.o(I)V")
    public static final void method3032() {
        try {
            if (field311 == 0) {
                if (Statics.field2560 != null) {
                    Statics.field2560.method2685();
                    Statics.field2560 = null;
                }
                Statics.field319 = null;
                field331 = false;
                field312 = 0;
                field311 = 1;
            }
            if (field311 == 1) {
                if (Statics.field319 == null) {
                    Statics.field319 = Statics.field1869.method2599(Statics.field1574, Statics.field154);
                }
                if (Statics.field319.field2127 == 2) {
                    throw new IOException();
                }
                if (Statics.field319.field2127 == 1) {
                    Statics.field2560 = new class135((Socket) Statics.field319.field2123, Statics.field1869);
                    Statics.field319 = null;
                    field311 = 2;
                }
            }
            if (field311 == 2) {
                field320.field1896 = 0;
                field320.method2326(14);
                Statics.field2560.method2688(field320.field1904, 0, 1);
                field322.field1896 = 0;
                field311 = 3;
            }
            if (field311 == 3) {
                if (Statics.field270 != null) {
                    Statics.field270.method1039();
                }
                if (Statics.field1982 != null) {
                    Statics.field1982.method1039();
                }
                int var0 = Statics.field2560.method2686();
                if (Statics.field270 != null) {
                    Statics.field270.method1039();
                }
                if (Statics.field1982 != null) {
                    Statics.field1982.method1039();
                }
                if (var0 != 0) {
                    method1457(var0);
                    return;
                }
                field322.field1896 = 0;
                field311 = 5;
            }
            if (field311 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field320.field1896 = 0;
                field320.method2326(1);
                field320.method2326(class30.field725.method492());
                field320.method2204(var1[0]);
                field320.method2204(var1[1]);
                field320.method2204(var1[2]);
                field320.method2204(var1[3]);
                switch(class30.field725.field2490) {
                    case 0:
                    case 1:
                        field320.method2323(Statics.field1170);
                        field320.field1896 += 5;
                        break;
                    case 2:
                        field320.field1896 += 8;
                        break;
                    case 3:
                        field320.method2204((Integer) Statics.field134.field149.get(class154.method132(class30.field727)));
                        field320.field1896 += 4;
                }
                field320.method2362(class30.field712);
                field320.method2235(class5.field81, class5.field75);
                field549.field1896 = 0;
                if (field555 == 40) {
                    field549.method2326(18);
                } else {
                    field549.method2326(16);
                }
                field549.method2202(0);
                int var2 = field549.field1896;
                field549.method2204(80);
                field549.method2248(field320.field1904, 0, field320.field1896);
                int var3 = field549.field1896;
                field549.method2362(class30.field727);
                field549.method2326((field498 ? 1 : 0) << 1 | (field285 ? 1 : 0));
                field549.method2202(Statics.field1408);
                field549.method2202(Statics.field1949);
                class114 var4 = field549;
                byte[] var5 = new byte[24];
                try {
                    class141.field2142.method3771(0L);
                    class141.field2142.method3773(var5);
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
                var4.method2248(var5, 0, 24);
                field549.method2362(Statics.field1953);
                field549.method2204(Statics.field628);
                class111 var9 = new class111(Statics.field1881.method2843());
                Statics.field1881.method2835(var9);
                field549.method2248(var9.field1904, 0, var9.field1904.length);
                field549.method2326(Statics.field2083);
                field549.method2204(Statics.field2165.field2572);
                field549.method2204(Statics.field567.field2572);
                field549.method2204(Statics.field203.field2572);
                field549.method2204(Statics.field1032.field2572);
                field549.method2204(Statics.field2200.field2572);
                field549.method2204(Statics.field2552.field2572);
                field549.method2204(Statics.field259.field2572);
                field549.method2204(Statics.field1175.field2572);
                field549.method2204(Statics.field115.field2572);
                field549.method2204(Statics.field1997.field2572);
                field549.method2204(Statics.field240.field2572);
                field549.method2204(Statics.field885.field2572);
                field549.method2204(Statics.field2954.field2572);
                field549.method2204(Statics.field193.field2572);
                field549.method2204(Statics.field119.field2572);
                field549.method2204(Statics.field1054.field2572);
                field549.method2233(var1, var3, field549.field1896);
                field549.method2212(field549.field1896 - var2);
                Statics.field2560.method2688(field549.field1904, 0, field549.field1896);
                field320.method2445(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field322.method2445(var1);
                field311 = 6;
            }
            if (field311 == 6 && Statics.field2560.method2695() > 0) {
                int var11 = Statics.field2560.method2686();
                if (var11 == 21 && field555 == 20) {
                    field311 = 7;
                } else if (var11 == 2) {
                    field311 = 9;
                } else if (var11 == 15 && field555 == 40) {
                    method26();
                    return;
                } else if (var11 == 23 && field313 < 1) {
                    field313++;
                    field311 = 0;
                } else {
                    method1457(var11);
                    return;
                }
            }
            if (field311 == 7 && Statics.field2560.method2695() > 0) {
                field453 = (Statics.field2560.method2686() + 3) * 60;
                field311 = 8;
            }
            if (field311 == 8) {
                field312 = 0;
                class30.method161(class148.field2238, class148.field2237, field453 / 60 + class148.field2220);
                if (--field453 <= 0) {
                    field311 = 0;
                }
            } else {
                if (field311 == 9 && Statics.field2560.method2695() >= 13) {
                    boolean var12 = Statics.field2560.method2686() == 1;
                    Statics.field2560.method2702(field322.field1904, 0, 4);
                    field322.field1896 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field322.method2446() << 24;
                        int var15 = var14 | field322.method2446() << 16;
                        int var16 = var15 | field322.method2446() << 8;
                        int var17 = var16 | field322.method2446();
                        int var18 = class154.method132(class30.field727);
                        if (Statics.field134.field149.size() >= 10 && !Statics.field134.field149.containsKey(var18)) {
                            Iterator var19 = Statics.field134.field149.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field134.field149.put(var18, var17);
                        class9.method156();
                    }
                    field449 = Statics.field2560.method2686();
                    field451 = Statics.field2560.method2686() == 1;
                    field406 = Statics.field2560.method2686();
                    field406 <<= 0x8;
                    field406 += Statics.field2560.method2686();
                    field283 = Statics.field2560.method2686();
                    Statics.field2560.method2702(field322.field1904, 0, 1);
                    field322.field1896 = 0;
                    field324 = field322.method2446();
                    Statics.field2560.method2702(field322.field1904, 0, 2);
                    field322.field1896 = 0;
                    field323 = field322.method2395();
                    if (field283 == 1) {
                        try {
                            class124.method2540(Statics.field279, "zap");
                        } catch (Throwable var24) {
                        }
                    } else {
                        try {
                            class124.method2540(Statics.field279, "unzap");
                        } catch (Throwable var23) {
                        }
                    }
                    field311 = 10;
                }
                if (field311 != 10) {
                    field312++;
                    if (field312 > 2000) {
                        if (field313 < 1) {
                            if (Statics.field315 == Statics.field154) {
                                Statics.field154 = Statics.field996;
                            } else {
                                Statics.field154 = Statics.field315;
                            }
                            field313++;
                            field311 = 0;
                        } else {
                            method1457(-3);
                        }
                    }
                } else if (Statics.field2560.method2695() >= field323) {
                    field322.field1896 = 0;
                    Statics.field2560.method2702(field322.field1904, 0, field323);
                    method780();
                    Statics.field993 = -1;
                    method1448(false);
                    field324 = -1;
                }
            }
        } catch (IOException var26) {
            if (field313 < 1) {
                if (Statics.field315 == Statics.field154) {
                    Statics.field154 = Statics.field996;
                } else {
                    Statics.field154 = Statics.field315;
                }
                field313++;
                field311 = 0;
            } else {
                method1457(-2);
            }
        }
    }

    @ObfuscatedName("ak.r(I)V")
    public static void method780() {
        field517 = 1L;
        field307 = -1;
        Statics.field3110.field200 = 0;
        Statics.field1981 = true;
        field454 = true;
        field446 = -1L;
        Statics.method2164();
        field320.field1896 = 0;
        field322.field1896 = 0;
        field324 = -1;
        field535 = -1;
        field551 = -1;
        field330 = -1;
        field325 = 0;
        field296 = 0;
        field486 = 0;
        field510 = 0;
        field424 = 0;
        field528 = false;
        class132.method566(0);
        class11.method1497();
        field450 = 0;
        field393 = false;
        field527 = 0;
        field332 = (int) (Math.random() * 100.0D) - 50;
        field344 = (int) (Math.random() * 110.0D) - 55;
        field473 = (int) (Math.random() * 80.0D) - 40;
        field349 = (int) (Math.random() * 120.0D) - 60;
        field351 = (int) (Math.random() * 30.0D) - 20;
        field365 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field562 = 0;
        field513 = -1;
        field321 = 0;
        field519 = 0;
        field358 = class19.field574;
        field401 = 0;
        field317 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field400[var0] = null;
            field405[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field316[var1] = null;
        }
        Statics.field1994 = field400[2047] = new class3();
        field414 = -1;
        field417.method3480();
        field418.method3480();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field415[var2][var3][var4] = null;
                }
            }
        }
        field558 = new class190();
        field539 = 0;
        field553 = 0;
        field557 = 0;
        for (int var5 = 0; var5 < Statics.field1930; var5++) {
            class48 var6 = class48.method2707(var5);
            if (var6 != null) {
                class167.field2799[var5] = 0;
                class167.field2796[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field534.length; var7++) {
            field534[var7] = -1;
        }
        field306 = -1;
        if (field442 != -1) {
            class164.method1958(field442);
        }
        for (class4 var8 = (class4) field443.method3428(); var8 != null; var8 = (class4) field443.method3432()) {
            method2854(var8, true);
        }
        field442 = -1;
        field443 = new class187(8);
        field546 = null;
        field528 = false;
        field424 = 0;
        field559.method3149((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field291[var9] = null;
            field552[var9] = false;
        }
        class15.method1464();
        field293 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field489[var10] = true;
        }
        method2521();
        field391 = null;
        Statics.field2081 = 0;
        Statics.field1475 = null;
        for (int var11 = 0; var11 < 6; var11++) {
            field314[var11] = new class211();
        }
        Statics.field251 = null;
    }

    @ObfuscatedName("m.v(I)V")
    public static void method26() {
        field320.field1896 = 0;
        field322.field1896 = 0;
        field324 = -1;
        field535 = -1;
        field551 = -1;
        field330 = -1;
        field323 = 0;
        field325 = 0;
        field296 = 0;
        field424 = 0;
        field528 = false;
        field562 = 0;
        field321 = 0;
        for (int var0 = 0; var0 < field400.length; var0++) {
            if (field400[var0] != null) {
                field400[var0].field804 = -1;
            }
        }
        for (int var1 = 0; var1 < field316.length; var1++) {
            if (field316[var1] != null) {
                field316[var1].field804 = -1;
            }
        }
        class15.method1464();
        method46(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field489[var2] = true;
        }
        method2521();
    }

    @ObfuscatedName("bq.h(II)V")
    public static void method1457(int arg0) {
        if (arg0 == -3) {
            class30.method161(class148.field2324, class148.field2275, class148.field2243);
        } else if (arg0 == -2) {
            class30.method161(class148.field2244, class148.field2245, class148.field2246);
        } else if (arg0 == -1) {
            class30.method161(class148.field2247, class148.field2457, class148.field2370);
        } else if (arg0 == 3) {
            class30.method161(class148.field2250, class148.field2342, class148.field2252);
        } else if (arg0 == 4) {
            class30.method161(class148.field2433, class148.field2254, class148.field2226);
        } else if (arg0 == 5) {
            class30.method161(class148.field2256, class148.field2257, class148.field2258);
        } else if (arg0 == 6) {
            class30.method161(class148.field2240, class148.field2260, class148.field2273);
        } else if (arg0 == 7) {
            class30.method161(class148.field2262, class148.field2263, class148.field2461);
        } else if (arg0 == 8) {
            class30.method161(class148.field2265, class148.field2266, class148.field2235);
        } else if (arg0 == 9) {
            class30.method161(class148.field2268, class148.field2383, class148.field2450);
        } else if (arg0 == 10) {
            class30.method161(class148.field2271, class148.field2272, class148.field2249);
        } else if (arg0 == 11) {
            class30.method161(class148.field2274, class148.field2279, class148.field2276);
        } else if (arg0 == 12) {
            class30.method161(class148.field2277, class148.field2215, class148.field2392);
        } else if (arg0 == 13) {
            class30.method161(class148.field2280, class148.field2281, class148.field2381);
        } else if (arg0 == 14) {
            class30.method161(class148.field2283, class148.field2284, class148.field2285);
        } else if (arg0 == 16) {
            class30.method161(class148.field2286, class148.field2449, class148.field2288);
        } else if (arg0 == 17) {
            class30.method161(class148.field2289, class148.field2290, class148.field2291);
        } else if (arg0 == 18) {
            class30.method161(class148.field2292, class148.field2293, class148.field2294);
        } else if (arg0 == 19) {
            class30.method161(class148.field2295, class148.field2296, class148.field2297);
        } else if (arg0 == 20) {
            class30.method161(class148.field2298, class148.field2299, class148.field2300);
        } else if (arg0 == 22) {
            class30.method161(class148.field2301, class148.field2302, class148.field2287);
        } else if (arg0 == 23) {
            class30.method161(class148.field2242, class148.field2305, class148.field2217);
        } else if (arg0 == 24) {
            class30.method161(class148.field2347, class148.field2389, class148.field2309);
        } else if (arg0 == 25) {
            class30.method161(class148.field2310, class148.field2311, class148.field2312);
        } else if (arg0 == 26) {
            class30.method161(class148.field2453, class148.field2314, class148.field2315);
        } else if (arg0 == 27) {
            class30.method161(class148.field2316, class148.field2317, class148.field2318);
        } else if (arg0 == 31) {
            class30.method161(class148.field2325, class148.field2219, class148.field2369);
        } else if (arg0 == 32) {
            class30.method161(class148.field2264, class148.field2329, class148.field2330);
        } else if (arg0 == 37) {
            class30.method161(class148.field2251, class148.field2332, class148.field2333);
        } else if (arg0 == 38) {
            class30.method161(class148.field2334, class148.field2335, class148.field2467);
        } else if (arg0 == 55) {
            class30.method161(class148.field2337, class148.field2372, class148.field2339);
        } else if (arg0 == 56) {
            class30.method161(class148.field2340, class148.field2417, class148.field2307);
            method46(11);
            return;
        } else if (arg0 == 57) {
            class30.method161(class148.field2343, class148.field2344, class148.field2345);
            method46(11);
            return;
        } else {
            class30.method161(class148.field2346, class148.field2208, class148.field2267);
        }
        method46(10);
    }

    @ObfuscatedName("bg.y(I)V")
    public static final void method1397() {
        class43.method559();
        class39.method138();
        class42.method1125();
        class38.method619();
        class37.field849.method3398();
        class37.field850.method3398();
        class47.field1073.method3398();
        class47.field1108.method3398();
        class47.field1078.method3398();
        class40.method493();
        class41.field978.method3398();
        class41.field979.method3398();
        class44.field1035.method3398();
        class48.field1120.method3398();
        class170.field2813.method3398();
        class164.method2055();
        ((class90) Statics.field1522).method1946();
        class20.field585.method3398();
        Statics.field2165.method2922();
        Statics.field567.method2922();
        Statics.field1032.method2922();
        Statics.field2200.method2922();
        Statics.field2552.method2922();
        Statics.field259.method2922();
        Statics.field1175.method2922();
        Statics.field115.method2922();
        Statics.field1997.method2922();
        Statics.field240.method2922();
        Statics.field885.method2922();
        Statics.field2954.method2922();
    }

    @ObfuscatedName("y.z(B)V")
    public static final void method511() {
        if (field296 > 1) {
            field296--;
        }
        if (field486 > 0) {
            field486--;
        }
        if (field331) {
            field331 = false;
            if (field486 > 0) {
                Statics.method1();
            } else {
                method46(40);
                Statics.field2603 = Statics.field2560;
                Statics.field2560 = null;
            }
            return;
        }
        if (!field528) {
            field429[0] = class148.field2438;
            field430[0] = "";
            field427[0] = 1006;
            field424 = 1;
        }
        for (int var0 = 0; var0 < 100 && method3565(); var0++) {
        }
        if (field555 != 30) {
            return;
        }
        while (true) {
            class201 var1 = (class201) class202.field3032.method3506();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field3110.field199;
                synchronized (Statics.field3110.field199) {
                    if (!field381) {
                        Statics.field3110.field200 = 0;
                    } else if (class132.field2065 != 0 || Statics.field3110.field200 >= 40) {
                        field320.method2453(39);
                        field320.method2326(0);
                        int var5 = field320.field1896;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field3110.field200 && field320.field1896 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field3110.field201[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field3110.field205[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field3110.field201[var7] == -1 && Statics.field3110.field205[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field398 != var9 || field292 != var8) {
                                int var11 = var9 - field398;
                                field398 = var9;
                                int var12 = var8 - field292;
                                field292 = var8;
                                if (field307 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field320.method2202((field307 << 12) + (var11 << 6) + var12);
                                    field307 = 0;
                                } else if (field307 < 8) {
                                    field320.method2323((field307 << 19) + 8388608 + var10);
                                    field307 = 0;
                                } else {
                                    field320.method2204((field307 << 19) + -1073741824 + var10);
                                    field307 = 0;
                                }
                            } else if (field307 < 2047) {
                                field307++;
                            }
                        }
                        field320.method2294(field320.field1896 - var5);
                        if (var6 >= Statics.field3110.field200) {
                            Statics.field3110.field200 = 0;
                        } else {
                            Statics.field3110.field200 -= var6;
                            for (int var13 = 0; var13 < Statics.field3110.field200; var13++) {
                                Statics.field3110.field205[var13] = Statics.field3110.field205[var6 + var13];
                                Statics.field3110.field201[var13] = Statics.field3110.field201[var6 + var13];
                            }
                        }
                    }
                }
                if (class132.field2065 == 1 || !Statics.field568 && class132.field2065 == 4 || class132.field2065 == 2) {
                    long var15 = (class132.field2068 - field517 * -1L) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field517 = class132.field2068 * -1L;
                    int var17 = class132.field2060;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > Statics.field1949) {
                        var17 = Statics.field1949;
                    }
                    int var18 = class132.field2066;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field1408) {
                        var18 = Statics.field1408;
                    }
                    int var19 = (int) var15;
                    field320.method2453(199);
                    field320.method2202((var19 << 1) + (class132.field2065 == 2 ? 1 : 0));
                    field320.method2202(var18);
                    field320.method2202(var17);
                }
                if (class129.field2032 > 0) {
                    field320.method2453(194);
                    field320.method2202(0);
                    int var20 = field320.field1896;
                    long var21 = class107.method3364();
                    for (int var23 = 0; var23 < class129.field2032; var23++) {
                        long var24 = var21 - field446;
                        if (var24 > 16777215L) {
                            var24 = 16777215L;
                        }
                        field446 = var21;
                        field320.method2254((int) var24);
                        field320.method2239(class129.field2031[var23]);
                    }
                    field320.method2212(field320.field1896 - var20);
                }
                if (field370 > 0) {
                    field370--;
                }
                if (class129.field2025[96] || class129.field2025[97] || class129.field2025[98] || class129.field2025[99]) {
                    field371 = true;
                }
                if (field371 && field370 <= 0) {
                    field370 = 20;
                    field371 = false;
                    field320.method2453(207);
                    field320.method2246(field365);
                    field320.method2203(field364);
                }
                if (Statics.field1981 && !field454) {
                    field454 = true;
                    field320.method2453(221);
                    field320.method2326(1);
                }
                if (!Statics.field1981 && field454) {
                    field454 = false;
                    field320.method2453(221);
                    field320.method2326(0);
                }
                if (field285 && Statics.field599 != field388) {
                    method85(Statics.field993, Statics.field1933, Statics.field599, Statics.field1994.field833[0], Statics.field1994.field794[0]);
                } else if (Statics.field599 != field513) {
                    field513 = Statics.field599;
                    method2850(Statics.field599);
                }
                if (field555 != 30) {
                    return;
                }
                for (class16 var26 = (class16) field558.method3468(); var26 != null; var26 = (class16) field558.method3470()) {
                    if (var26.field244 > 0) {
                        var26.field244--;
                    }
                    if (var26.field244 == 0) {
                        if (var26.field232 >= 0) {
                            int var27 = var26.field232;
                            int var28 = var26.field234;
                            class38 var29 = class38.method879(var27);
                            if (var28 == 11) {
                                var28 = 10;
                            }
                            if (var28 >= 5 && var28 <= 8) {
                                var28 = 4;
                            }
                            boolean var30 = var29.method686(var28);
                            if (!var30) {
                                continue;
                            }
                        }
                        method2156(var26.field239, var26.field229, var26.field230, var26.field231, var26.field232, var26.field243, var26.field234);
                        var26.method3554();
                    } else {
                        if (var26.field238 > 0) {
                            var26.field238--;
                        }
                        if (var26.field238 == 0 && var26.field230 >= 1 && var26.field231 >= 1 && var26.field230 <= 102 && var26.field231 <= 102) {
                            if (var26.field235 >= 0) {
                                int var31 = var26.field235;
                                int var32 = var26.field237;
                                class38 var33 = class38.method879(var31);
                                if (var32 == 11) {
                                    var32 = 10;
                                }
                                if (var32 >= 5 && var32 <= 8) {
                                    var32 = 4;
                                }
                                boolean var34 = var33.method686(var32);
                                if (!var34) {
                                    continue;
                                }
                            }
                            method2156(var26.field239, var26.field229, var26.field230, var26.field231, var26.field235, var26.field236, var26.field237);
                            var26.field238 = -1;
                            if (var26.field235 == var26.field232 && var26.field232 == -1) {
                                var26.method3554();
                            } else if (var26.field235 == var26.field232 && var26.field243 == var26.field236 && var26.field237 == var26.field234) {
                                var26.method3554();
                            }
                        }
                    }
                }
                method777();
                field325++;
                if (field325 > 750) {
                    if (field486 > 0) {
                        Statics.method1();
                    } else {
                        method46(40);
                        Statics.field2603 = Statics.field2560;
                        Statics.field2560 = null;
                    }
                    return;
                }
                method3();
                for (int var35 = 0; var35 < field317; var35++) {
                    int var36 = field318[var35];
                    class32 var37 = field316[var36];
                    if (var37 != null) {
                        method130(var37, var37.field749.field853);
                    }
                }
                method1960();
                field354++;
                if (field390 != 0) {
                    field389 += 20;
                    if (field389 >= 400) {
                        field390 = 0;
                    }
                }
                if (Statics.field249 != null) {
                    field288++;
                    if (field288 >= 15) {
                        method572(Statics.field249);
                        Statics.field249 = null;
                    }
                }
                class164 var38 = Statics.field994;
                class164 var39 = Statics.field973;
                Statics.field994 = null;
                Statics.field973 = null;
                field459 = null;
                field463 = false;
                field460 = false;
                field507 = 0;
                while (class129.method1499() && field507 < 128) {
                    if (field449 >= 2 && class129.field2025[82] && Statics.field1306 == 66) {
                        String var40 = "";
                        Iterator var41 = class11.field171.iterator();
                        while (var41.hasNext()) {
                            class33 var42 = (class33) var41.next();
                            var40 = var40 + var42.field754 + ':' + var42.field756 + '\n';
                        }
                        Statics.field563.setContents(new StringSelection(var40), (ClipboardOwner) null);
                    } else {
                        field509[field507] = Statics.field1306;
                        field352[field507] = Statics.field175;
                        field507++;
                    }
                }
                int var45 = field442;
                int var46 = Statics.field1408;
                int var47 = Statics.field1949;
                if (class164.method915(var45)) {
                    method562(Statics.field2764[var45], -1, 0, 0, var46, var47, 0, 0);
                }
                field467++;
                while (true) {
                    class1 var48;
                    class164 var49;
                    class164 var50;
                    do {
                        var48 = (class1) field484.method3466();
                        if (var48 == null) {
                            while (true) {
                                class1 var51;
                                class164 var52;
                                class164 var53;
                                do {
                                    var51 = (class1) field485.method3466();
                                    if (var51 == null) {
                                        while (true) {
                                            class1 var54;
                                            class164 var55;
                                            class164 var56;
                                            do {
                                                var54 = (class1) field483.method3466();
                                                if (var54 == null) {
                                                    method3568();
                                                    if (field455 != null) {
                                                        method136();
                                                    }
                                                    if (Statics.field129 != null) {
                                                        method572(Statics.field129);
                                                        field404++;
                                                        if (class132.field2062 == 0) {
                                                            if (field397) {
                                                                if (Statics.field129 == Statics.field102 && field396 != field328) {
                                                                    class164 var57 = Statics.field129;
                                                                    byte var58 = 0;
                                                                    if (field445 == 1 && var57.field2652 == 206) {
                                                                        var58 = 1;
                                                                    }
                                                                    if (var57.field2694[field396] <= 0) {
                                                                        var58 = 0;
                                                                    }
                                                                    if (class169.method3559(Statics.method74(var57))) {
                                                                        int var59 = field328;
                                                                        int var60 = field396;
                                                                        var57.field2694[var60] = var57.field2694[var59];
                                                                        var57.field2673[var60] = var57.field2673[var59];
                                                                        var57.field2694[var59] = -1;
                                                                        var57.field2673[var59] = 0;
                                                                    } else if (var58 == 1) {
                                                                        int var61 = field328;
                                                                        int var62 = field396;
                                                                        while (var61 != var62) {
                                                                            if (var61 > var62) {
                                                                                var57.method3038(var61 - 1, var61);
                                                                                var61--;
                                                                            } else if (var61 < var62) {
                                                                                var57.method3038(var61 + 1, var61);
                                                                                var61++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var57.method3038(field396, field328);
                                                                    }
                                                                    field320.method2453(240);
                                                                    field320.method2202(field328);
                                                                    field320.method2202(field396);
                                                                    field320.method2257(Statics.field129.field2717);
                                                                    field320.method2240(var58);
                                                                }
                                                            } else if ((field422 == 1 || method2806(field424 - 1)) && field424 > 2) {
                                                                method615(field394, field395);
                                                            } else if (field424 > 0) {
                                                                method31(field394, field395);
                                                            }
                                                            field288 = 10;
                                                            class132.field2065 = 0;
                                                            Statics.field129 = null;
                                                        } else if (field404 >= 5 && (class132.field2070 > field394 + 5 || class132.field2070 < field394 - 5 || class132.field2067 > field395 + 5 || class132.field2067 < field395 - 5)) {
                                                            field397 = true;
                                                        }
                                                    }
                                                    if (class81.field1427 != -1) {
                                                        int var63 = class81.field1427;
                                                        int var64 = class81.field1447;
                                                        field320.method2453(42);
                                                        field320.method2326(5);
                                                        field320.method2203(Statics.field954 + var64);
                                                        field320.method2202(Statics.field2594 + var63);
                                                        field320.method2240(class129.field2025[82] ? (class129.field2025[81] ? 2 : 1) : 0);
                                                        class81.field1427 = -1;
                                                        field387 = class132.field2066;
                                                        field426 = class132.field2060;
                                                        field390 = 1;
                                                        field389 = 0;
                                                        field321 = var63;
                                                        field519 = var64;
                                                    }
                                                    if (Statics.field994 != var38) {
                                                        if (var38 != null) {
                                                            method572(var38);
                                                        }
                                                        if (Statics.field994 != null) {
                                                            method572(Statics.field994);
                                                        }
                                                    }
                                                    if (Statics.field973 != var39 && field499 == field290) {
                                                        if (var39 != null) {
                                                            method572(var39);
                                                        }
                                                        if (Statics.field973 != null) {
                                                            method572(Statics.field973);
                                                        }
                                                    }
                                                    if (Statics.field973 == null) {
                                                        if (field499 > 0) {
                                                            field499--;
                                                        }
                                                    } else if (field499 < field290) {
                                                        field499++;
                                                        if (field499 == field290) {
                                                            method572(Statics.field973);
                                                        }
                                                    }
                                                    method100();
                                                    if (field533) {
                                                        method1952();
                                                    }
                                                    for (int var65 = 0; var65 < 5; var65++) {
                                                        int var10002 = field425[var65]++;
                                                    }
                                                    int var66 = class132.method2163();
                                                    int var67 = class129.method1857();
                                                    if (var66 > 15000 && var67 > 15000) {
                                                        field486 = 250;
                                                        class132.method566(14500);
                                                        field320.method2453(27);
                                                    }
                                                    field348++;
                                                    if (field348 > 500) {
                                                        field348 = 0;
                                                        int var68 = (int) (Math.random() * 8.0D);
                                                        if ((var68 & 0x1) == 1) {
                                                            field332 += field343;
                                                        }
                                                        if ((var68 & 0x2) == 2) {
                                                            field344 += field521;
                                                        }
                                                        if ((var68 & 0x4) == 4) {
                                                            field473 += field378;
                                                        }
                                                    }
                                                    if (field332 < -50) {
                                                        field343 = 2;
                                                    }
                                                    if (field332 > 50) {
                                                        field343 = -2;
                                                    }
                                                    if (field344 < -55) {
                                                        field521 = 2;
                                                    }
                                                    if (field344 > 55) {
                                                        field521 = -2;
                                                    }
                                                    if (field473 < -40) {
                                                        field378 = 1;
                                                    }
                                                    if (field473 > 40) {
                                                        field378 = -1;
                                                    }
                                                    field353++;
                                                    if (field353 > 500) {
                                                        field353 = 0;
                                                        int var69 = (int) (Math.random() * 8.0D);
                                                        if ((var69 & 0x1) == 1) {
                                                            field349 += field326;
                                                        }
                                                        if ((var69 & 0x2) == 2) {
                                                            field351 += field379;
                                                        }
                                                    }
                                                    if (field349 < -60) {
                                                        field326 = 2;
                                                    }
                                                    if (field349 > 60) {
                                                        field326 = -2;
                                                    }
                                                    if (field351 < -20) {
                                                        field379 = 1;
                                                    }
                                                    if (field351 > 10) {
                                                        field379 = -1;
                                                    }
                                                    for (class36 var70 = (class36) field556.method3417(); var70 != null; var70 = (class36) field556.method3418()) {
                                                        if ((long) var70.field845 < class107.method3364() / 1000L - 5L) {
                                                            if (var70.field843 > 0) {
                                                                class11.method2846(5, "", var70.field842 + class148.field2326);
                                                            }
                                                            if (var70.field843 == 0) {
                                                                class11.method2846(5, "", var70.field842 + class148.field2350);
                                                            }
                                                            var70.method3550();
                                                        }
                                                    }
                                                    field432++;
                                                    if (field432 > 50) {
                                                        field320.method2453(109);
                                                    }
                                                    try {
                                                        if (Statics.field2560 != null && field320.field1896 > 0) {
                                                            Statics.field2560.method2688(field320.field1904, 0, field320.field1896);
                                                            field320.field1896 = 0;
                                                            field432 = 0;
                                                        }
                                                    } catch (IOException var72) {
                                                        if (field486 > 0) {
                                                            Statics.method1();
                                                        } else {
                                                            method46(40);
                                                            Statics.field2603 = Statics.field2560;
                                                            Statics.field2560 = null;
                                                        }
                                                    }
                                                    return;
                                                }
                                                var55 = var54.field3;
                                                if (var55.field2649 < 0) {
                                                    break;
                                                }
                                                var56 = class164.method560(var55.field2724);
                                            } while (var56 == null || var56.field2770 == null || var55.field2649 >= var56.field2770.length || var56.field2770[var55.field2649] != var55);
                                            class34.method97(var54);
                                        }
                                    }
                                    var52 = var51.field3;
                                    if (var52.field2649 < 0) {
                                        break;
                                    }
                                    var53 = class164.method560(var52.field2724);
                                } while (var53 == null || var53.field2770 == null || var52.field2649 >= var53.field2770.length || var53.field2770[var52.field2649] != var52);
                                class34.method97(var51);
                            }
                        }
                        var49 = var48.field3;
                        if (var49.field2649 < 0) {
                            break;
                        }
                        var50 = class164.method560(var49.field2724);
                    } while (var50 == null || var50.field2770 == null || var49.field2649 >= var50.field2770.length || var50.field2770[var49.field2649] != var49);
                    class34.method97(var48);
                }
            }
            field320.method2453(169);
            field320.method2326(0);
            int var3 = field320.field1896;
            class202.method526(field320);
            field320.method2294(field320.field1896 - var3);
        }
    }

    @ObfuscatedName("n.u(I)V")
    public static final void method2() {
        if (Statics.field1982 != null) {
            Statics.field1982.method1067();
        }
        if (Statics.field270 != null) {
            Statics.field270.method1067();
        }
    }

    @ObfuscatedName("aw.w(I)V")
    public static final void method777() {
        for (int var0 = 0; var0 < field527; var0++) {
            int var10002 = field565[var0]--;
            if (field565[var0] >= -10) {
                class54 var2 = field437[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method1100(Statics.field2200, field462[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field565[var0] += var2.method1097();
                    field437[var0] = var2;
                }
                if (field565[var0] < 0) {
                    int var9;
                    if (field488[var0] == 0) {
                        var9 = field537;
                    } else {
                        int var3 = (field488[var0] & 0xFF) * 128;
                        int var4 = field488[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1994.field830;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field488[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1994.field828;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field565[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field526 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class58 var10 = var2.method1105().method1140(Statics.field799);
                        class60 var11 = class60.method1182(var10, 100, var9);
                        var11.method1170(field529[var0] - 1);
                        Statics.field2476.method993(var11);
                    }
                    field565[var0] = -100;
                }
            } else {
                field527--;
                for (int var1 = var0; var1 < field527; var1++) {
                    field462[var1] = field462[var1 + 1];
                    field437[var1] = field437[var1 + 1];
                    field529[var1] = field529[var1 + 1];
                    field565[var1] = field565[var1 + 1];
                    field488[var1] = field488[var1 + 1];
                }
                var0--;
            }
        }
        if (field524 && !Statics.method945()) {
            if (field522 != 0 && field523 != -1) {
                class174.method2851(Statics.field259, field523, 0, field522, false);
            }
            field524 = false;
        }
    }

    @ObfuscatedName("m.d(Law;IIIB)V")
    public static void method28(class40 arg0, int arg1, int arg2, int arg3) {
        if (field527 >= 50 || field526 == 0 || arg0.field970 == null || arg1 >= arg0.field970.length) {
            return;
        }
        int var4 = arg0.field970[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field462[field527] = var5;
        field529[field527] = var6;
        field565[field527] = 0;
        field437[field527] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field488[field527] = (var8 << 16) + (var9 << 8) + var7;
        field527++;
    }

    @ObfuscatedName("fo.l(IIIB)V")
    public static void method3365(int arg0, int arg1, int arg2) {
        if (field537 == 0 || arg1 == 0 || field527 >= 50) {
            return;
        }
        field462[field527] = arg0;
        field529[field527] = arg1;
        field565[field527] = arg2;
        field437[field527] = null;
        field488[field527] = 0;
        field527++;
    }

    @ObfuscatedName("aj.aj(Lfu;III)V")
    public static final void method557(class164 arg0, int arg1, int arg2) {
        if (field562 != 0 && field562 != 3 || class132.field2065 != 1 && Statics.field568 || class132.field2065 != 4) {
            return;
        }
        class166 var3 = arg0.method3043();
        if (var3 == null) {
            return;
        }
        int var4 = class132.field2066 - arg1;
        int var5 = class132.field2060 - arg2;
        if (!var3.method3091(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2792 / 2;
        int var7 = var5 - var3.field2788 / 2;
        int var8 = field365 + field349 & 0x7FF;
        int var9 = class86.field1539[var8];
        int var10 = class86.field1540[var8];
        int var11 = (field351 + 256) * var9 >> 8;
        int var12 = (field351 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field1994.field830 + var13 >> 7;
        int var16 = Statics.field1994.field828 - var14 >> 7;
        field320.method2453(172);
        field320.method2326(18);
        field320.method2203(Statics.field954 + var16);
        field320.method2202(Statics.field2594 + var15);
        field320.method2240(class129.field2025[82] ? (class129.field2025[81] ? 2 : 1) : 0);
        field320.method2326(var6);
        field320.method2326(var7);
        field320.method2202(field365);
        field320.method2326(57);
        field320.method2326(field349);
        field320.method2326(field351);
        field320.method2326(89);
        field320.method2202(Statics.field1994.field830);
        field320.method2202(Statics.field1994.field828);
        field320.method2326(63);
        field321 = var15;
        field519 = var16;
    }

    @ObfuscatedName("cf.aq(I)V")
    public static final void method1960() {
        for (int var0 = -1; var0 < field401; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field357[var0];
            }
            class3 var2 = field400[var1];
            if (var2 != null && var2.field795 > 0) {
                var2.field795--;
                if (var2.field795 == 0) {
                    var2.field836 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field317; var3++) {
            int var4 = field318[var3];
            class32 var5 = field316[var4];
            if (var5 != null && var5.field795 > 0) {
                var5.field795--;
                if (var5.field795 == 0) {
                    var5.field836 = null;
                }
            }
        }
    }

    @ObfuscatedName("ar.al(Ljava/lang/String;I)V")
    public static final void method709(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field134.field147 = !Statics.field134.field147;
            class9.method156();
            if (Statics.field134.field147) {
                class11.method2846(99, "", "Roofs are now all hidden");
            } else {
                class11.method2846(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field295 = !field295;
        }
        if (field449 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field295 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field295 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field486 > 0) {
                    Statics.method1();
                } else {
                    method46(40);
                    Statics.field2603 = Statics.field2560;
                    Statics.field2560 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field310 == 2) {
                throw new RuntimeException();
            }
        }
        field320.method2453(196);
        field320.method2326(arg0.length() + 1);
        field320.method2362(arg0);
    }

    @ObfuscatedName("cg.az(I)V")
    public static final void method1952() {
        int var0 = Statics.field1806 * 128 + 64;
        int var1 = Statics.field1938 * 128 + 64;
        int var2 = method163(var0, var1, Statics.field599) - Statics.field1066;
        if (Statics.field1733 < var0) {
            Statics.field1733 += Statics.field218 * (var0 - Statics.field1733) / 1000 + Statics.field1045;
            if (Statics.field1733 > var0) {
                Statics.field1733 = var0;
            }
        }
        if (Statics.field1733 > var0) {
            Statics.field1733 -= Statics.field218 * (Statics.field1733 - var0) / 1000 + Statics.field1045;
            if (Statics.field1733 < var0) {
                Statics.field1733 = var0;
            }
        }
        if (Statics.field991 < var2) {
            Statics.field991 += Statics.field218 * (var2 - Statics.field991) / 1000 + Statics.field1045;
            if (Statics.field991 > var2) {
                Statics.field991 = var2;
            }
        }
        if (Statics.field991 > var2) {
            Statics.field991 -= Statics.field218 * (Statics.field991 - var2) / 1000 + Statics.field1045;
            if (Statics.field991 < var2) {
                Statics.field991 = var2;
            }
        }
        if (Statics.field2823 < var1) {
            Statics.field2823 += Statics.field218 * (var1 - Statics.field2823) / 1000 + Statics.field1045;
            if (Statics.field2823 > var1) {
                Statics.field2823 = var1;
            }
        }
        if (Statics.field2823 > var1) {
            Statics.field2823 -= Statics.field218 * (Statics.field2823 - var1) / 1000 + Statics.field1045;
            if (Statics.field2823 < var1) {
                Statics.field2823 = var1;
            }
        }
        int var3 = Statics.field1937 * 128 + 64;
        int var4 = Statics.field1152 * 128 + 64;
        int var5 = method163(var3, var4, Statics.field599) - Statics.field433;
        int var6 = var3 - Statics.field1733;
        int var7 = var5 - Statics.field991;
        int var8 = var4 - Statics.field2823;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field938 < var10) {
            Statics.field938 += Statics.field1571 * (var10 - Statics.field938) / 1000 + Statics.field51;
            if (Statics.field938 > var10) {
                Statics.field938 = var10;
            }
        }
        if (Statics.field938 > var10) {
            Statics.field938 -= Statics.field1571 * (Statics.field938 - var10) / 1000 + Statics.field51;
            if (Statics.field938 < var10) {
                Statics.field938 = var10;
            }
        }
        int var12 = var11 - Statics.field363;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field363 += Statics.field1571 * var12 / 1000 + Statics.field51;
            Statics.field363 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field363 -= Statics.field1571 * -var12 / 1000 + Statics.field51;
            Statics.field363 &= 0x7FF;
        }
        int var13 = var11 - Statics.field363;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field363 = var11;
        }
    }

    @ObfuscatedName("b.ah(B)V")
    public static final void method100() {
        int var0 = field332 + Statics.field1994.field830;
        int var1 = field344 + Statics.field1994.field828;
        if (Statics.field2952 - var0 < -500 || Statics.field2952 - var0 > 500 || Statics.field596 - var1 < -500 || Statics.field596 - var1 > 500) {
            Statics.field2952 = var0;
            Statics.field596 = var1;
        }
        if (Statics.field2952 != var0) {
            Statics.field2952 += (var0 - Statics.field2952) / 16;
        }
        if (Statics.field596 != var1) {
            Statics.field596 += (var1 - Statics.field596) / 16;
        }
        if (class132.field2062 == 4 && Statics.field568) {
            int var2 = class132.field2067 - field447;
            field350 = var2 * 2;
            field447 = var2 == -1 || var2 == 1 ? class132.field2067 : (field447 + class132.field2067) / 2;
            int var3 = field368 - class132.field2070;
            field452 = var3 * 2;
            field368 = var3 == -1 || var3 == 1 ? class132.field2070 : (field368 + class132.field2070) / 2;
        } else {
            if (class129.field2025[96]) {
                field452 += (-24 - field452) / 2;
            } else if (class129.field2025[97]) {
                field452 += (24 - field452) / 2;
            } else {
                field452 /= 2;
            }
            if (class129.field2025[98]) {
                field350 += (12 - field350) / 2;
            } else if (class129.field2025[99]) {
                field350 += (-12 - field350) / 2;
            } else {
                field350 /= 2;
            }
            field447 = class132.field2067;
            field368 = class132.field2070;
        }
        field365 = field452 / 2 + field365 & 0x7FF;
        field364 += field350 / 2;
        if (field364 < 128) {
            field364 = 128;
        }
        if (field364 > 383) {
            field364 = 383;
        }
        int var4 = Statics.field2952 >> 7;
        int var5 = Statics.field596 >> 7;
        int var6 = method163(Statics.field2952, Statics.field596, Statics.field599);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field599;
                    if (var10 < 3 && (class6.field83[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field95[var10][var8][var9];
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
        if (var12 > field372) {
            field372 += (var12 - field372) / 24;
        } else if (var12 < field372) {
            field372 += (var12 - field372) / 80;
        }
    }

    @ObfuscatedName("n.ag(I)V")
    public static final void method3() {
        for (int var0 = -1; var0 < field401; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field357[var0];
            }
            class3 var2 = field400[var1];
            if (var2 != null) {
                method130(var2, 1);
            }
        }
    }

    @ObfuscatedName("k.ad(Lam;II)V")
    public static final void method130(class35 arg0, int arg1) {
        if (arg0.field824 > field289) {
            int var2 = arg0.field824 - field289;
            int var3 = arg0.field820 * 128 + arg0.field783 * 64;
            int var4 = arg0.field819 * 128 + arg0.field783 * 64;
            arg0.field830 += (var3 - arg0.field830) / var2;
            arg0.field828 += (var4 - arg0.field828) / var2;
            arg0.field823 = 0;
            if (arg0.field826 == 0) {
                arg0.field790 = 1024;
            }
            if (arg0.field826 == 1) {
                arg0.field790 = 1536;
            }
            if (arg0.field826 == 2) {
                arg0.field790 = 0;
            }
            if (arg0.field826 == 3) {
                arg0.field790 = 512;
            }
        } else if (arg0.field825 >= field289) {
            method3380(arg0);
        } else {
            arg0.field807 = arg0.field784;
            if (arg0.field832 == 0) {
                arg0.field823 = 0;
            } else {
                label330: {
                    if (arg0.field810 != -1 && arg0.field813 == 0) {
                        class40 var5 = class40.method2146(arg0.field810);
                        if (arg0.field837 > 0 && var5.field960 == 0) {
                            arg0.field823++;
                            break label330;
                        }
                        if (arg0.field837 <= 0 && var5.field971 == 0) {
                            arg0.field823++;
                            break label330;
                        }
                    }
                    int var6 = arg0.field830;
                    int var7 = arg0.field828;
                    int var8 = arg0.field833[arg0.field832 - 1] * 128 + arg0.field783 * 64;
                    int var9 = arg0.field794[arg0.field832 - 1] * 128 + arg0.field783 * 64;
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        if (var6 < var8) {
                            if (var7 < var9) {
                                arg0.field790 = 1280;
                            } else if (var7 > var9) {
                                arg0.field790 = 1792;
                            } else {
                                arg0.field790 = 1536;
                            }
                        } else if (var6 > var8) {
                            if (var7 < var9) {
                                arg0.field790 = 768;
                            } else if (var7 > var9) {
                                arg0.field790 = 256;
                            } else {
                                arg0.field790 = 512;
                            }
                        } else if (var7 < var9) {
                            arg0.field790 = 1024;
                        } else if (var7 > var9) {
                            arg0.field790 = 0;
                        }
                        int var10 = arg0.field790 - arg0.field789 & 0x7FF;
                        if (var10 > 1024) {
                            var10 -= 2048;
                        }
                        int var11 = arg0.field796;
                        if (var10 >= -256 && var10 <= 256) {
                            var11 = arg0.field787;
                        } else if (var10 >= 256 && var10 < 768) {
                            var11 = arg0.field788;
                        } else if (var10 >= -768 && var10 <= -256) {
                            var11 = arg0.field785;
                        }
                        if (var11 == -1) {
                            var11 = arg0.field787;
                        }
                        arg0.field807 = var11;
                        int var12 = 4;
                        boolean var13 = true;
                        if (arg0 instanceof class32) {
                            var13 = ((class32) arg0).field749.field881;
                        }
                        if (var13) {
                            if (arg0.field790 != arg0.field789 && arg0.field804 == -1 && arg0.field829 != 0) {
                                var12 = 2;
                            }
                            if (arg0.field832 > 2) {
                                var12 = 6;
                            }
                            if (arg0.field832 > 3) {
                                var12 = 8;
                            }
                            if (arg0.field823 > 0 && arg0.field832 > 1) {
                                var12 = 8;
                                arg0.field823--;
                            }
                        } else {
                            if (arg0.field832 > 1) {
                                var12 = 6;
                            }
                            if (arg0.field832 > 2) {
                                var12 = 8;
                            }
                            if (arg0.field823 > 0 && arg0.field832 > 1) {
                                var12 = 8;
                                arg0.field823--;
                            }
                        }
                        if (arg0.field831[arg0.field832 - 1]) {
                            var12 <<= 0x1;
                        }
                        if (var12 >= 8 && arg0.field807 == arg0.field787 && arg0.field791 != -1) {
                            arg0.field807 = arg0.field791;
                        }
                        if (var6 < var8) {
                            arg0.field830 += var12;
                            if (arg0.field830 > var8) {
                                arg0.field830 = var8;
                            }
                        } else if (var6 > var8) {
                            arg0.field830 -= var12;
                            if (arg0.field830 < var8) {
                                arg0.field830 = var8;
                            }
                        }
                        if (var7 < var9) {
                            arg0.field828 += var12;
                            if (arg0.field828 > var9) {
                                arg0.field828 = var9;
                            }
                        } else if (var7 > var9) {
                            arg0.field828 -= var12;
                            if (arg0.field828 < var9) {
                                arg0.field828 = var9;
                            }
                        }
                        if (arg0.field830 == var8 && arg0.field828 == var9) {
                            arg0.field832--;
                            if (arg0.field837 > 0) {
                                arg0.field837--;
                            }
                        }
                    } else {
                        arg0.field830 = var8;
                        arg0.field828 = var9;
                    }
                }
            }
        }
        if (arg0.field830 < 128 || arg0.field828 < 128 || arg0.field830 >= 13184 || arg0.field828 >= 13184) {
            arg0.field810 = -1;
            arg0.field815 = -1;
            arg0.field824 = 0;
            arg0.field825 = 0;
            arg0.field830 = arg0.field833[0] * 128 + arg0.field783 * 64;
            arg0.field828 = arg0.field794[0] * 128 + arg0.field783 * 64;
            arg0.method643();
        }
        if (Statics.field1994 == arg0 && (arg0.field830 < 1536 || arg0.field828 < 1536 || arg0.field830 >= 11776 || arg0.field828 >= 11776)) {
            arg0.field810 = -1;
            arg0.field815 = -1;
            arg0.field824 = 0;
            arg0.field825 = 0;
            arg0.field830 = arg0.field833[0] * 128 + arg0.field783 * 64;
            arg0.field828 = arg0.field794[0] * 128 + arg0.field783 * 64;
            arg0.method643();
        }
        method1482(arg0);
        arg0.field782 = false;
        if (arg0.field807 != -1) {
            class40 var14 = class40.method2146(arg0.field807);
            if (var14 == null || var14.field955 == null) {
                arg0.field807 = -1;
            } else {
                arg0.field809++;
                if (arg0.field808 < var14.field955.length && arg0.field809 > var14.field961[arg0.field808]) {
                    arg0.field809 = 1;
                    arg0.field808++;
                    method28(var14, arg0.field808, arg0.field830, arg0.field828);
                }
                if (arg0.field808 >= var14.field955.length) {
                    arg0.field809 = 0;
                    arg0.field808 = 0;
                    method28(var14, arg0.field808, arg0.field830, arg0.field828);
                }
            }
        }
        if (arg0.field815 != -1 && field289 >= arg0.field818) {
            if (arg0.field834 < 0) {
                arg0.field834 = 0;
            }
            int var15 = class41.method24(arg0.field815).field982;
            if (var15 == -1) {
                arg0.field815 = -1;
            } else {
                class40 var16 = class40.method2146(var15);
                if (var16 == null || var16.field955 == null) {
                    arg0.field815 = -1;
                } else {
                    arg0.field817++;
                    if (arg0.field834 < var16.field955.length && arg0.field817 > var16.field961[arg0.field834]) {
                        arg0.field817 = 1;
                        arg0.field834++;
                        method28(var16, arg0.field834, arg0.field830, arg0.field828);
                    }
                    if (arg0.field834 >= var16.field955.length && (arg0.field834 < 0 || arg0.field834 >= var16.field955.length)) {
                        arg0.field815 = -1;
                    }
                }
            }
        }
        if (arg0.field810 != -1 && arg0.field813 <= 1) {
            class40 var17 = class40.method2146(arg0.field810);
            if (var17.field960 == 1 && arg0.field837 > 0 && arg0.field824 <= field289 && arg0.field825 < field289) {
                arg0.field813 = 1;
                return;
            }
        }
        if (arg0.field810 != -1 && arg0.field813 == 0) {
            class40 var18 = class40.method2146(arg0.field810);
            if (var18 == null || var18.field955 == null) {
                arg0.field810 = -1;
            } else {
                arg0.field812++;
                if (arg0.field811 < var18.field955.length && arg0.field812 > var18.field961[arg0.field811]) {
                    arg0.field812 = 1;
                    arg0.field811++;
                    method28(var18, arg0.field811, arg0.field830, arg0.field828);
                }
                if (arg0.field811 >= var18.field955.length) {
                    arg0.field811 -= var18.field968;
                    arg0.field814++;
                    if (arg0.field814 >= var18.field959) {
                        arg0.field810 = -1;
                    } else if (arg0.field811 >= 0 && arg0.field811 < var18.field955.length) {
                        method28(var18, arg0.field811, arg0.field830, arg0.field828);
                    } else {
                        arg0.field810 = -1;
                    }
                }
                arg0.field782 = var18.field965;
            }
        }
        if (arg0.field813 > 0) {
            arg0.field813--;
        }
    }

    @ObfuscatedName("fq.ao(Lam;I)V")
    public static final void method3380(class35 arg0) {
        if (field289 == arg0.field825 || arg0.field810 == -1 || arg0.field813 != 0 || arg0.field812 + 1 > class40.method2146(arg0.field810).field961[arg0.field811]) {
            int var1 = arg0.field825 - arg0.field824;
            int var2 = field289 - arg0.field824;
            int var3 = arg0.field820 * 128 + arg0.field783 * 64;
            int var4 = arg0.field819 * 128 + arg0.field783 * 64;
            int var5 = arg0.field821 * 128 + arg0.field783 * 64;
            int var6 = arg0.field816 * 128 + arg0.field783 * 64;
            arg0.field830 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field828 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field823 = 0;
        if (arg0.field826 == 0) {
            arg0.field790 = 1024;
        }
        if (arg0.field826 == 1) {
            arg0.field790 = 1536;
        }
        if (arg0.field826 == 2) {
            arg0.field790 = 0;
        }
        if (arg0.field826 == 3) {
            arg0.field790 = 512;
        }
        arg0.field789 = arg0.field790;
    }

    @ObfuscatedName("bz.am(Lam;B)V")
    public static final void method1482(class35 arg0) {
        if (arg0.field829 == 0) {
            return;
        }
        if (arg0.field804 != -1 && arg0.field804 < 32768) {
            class32 var1 = field316[arg0.field804];
            if (var1 != null) {
                int var2 = arg0.field830 - var1.field830;
                int var3 = arg0.field828 - var1.field828;
                if (var2 != 0 || var3 != 0) {
                    arg0.field790 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field804 >= 32768) {
            int var4 = arg0.field804 - 32768;
            if (field406 == var4) {
                var4 = 2047;
            }
            class3 var5 = field400[var4];
            if (var5 != null) {
                int var6 = arg0.field830 - var5.field830;
                int var7 = arg0.field828 - var5.field828;
                if (var6 != 0 || var7 != 0) {
                    arg0.field790 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field805 != 0 || arg0.field822 != 0) && (arg0.field832 == 0 || arg0.field823 > 0)) {
            int var8 = arg0.field830 - (arg0.field805 * 64 - Statics.field2594 * 64 - Statics.field2594 * 64);
            int var9 = arg0.field828 - (arg0.field822 * 64 - Statics.field954 * 64 - Statics.field954 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field790 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field805 = 0;
            arg0.field822 = 0;
        }
        int var10 = arg0.field790 - arg0.field789 & 0x7FF;
        if (var10 == 0) {
            arg0.field780 = 0;
            return;
        }
        arg0.field780++;
        if (var10 > 1024) {
            arg0.field789 -= arg0.field829;
            boolean var11 = true;
            if (var10 < arg0.field829 || var10 > 2048 - arg0.field829) {
                arg0.field789 = arg0.field790;
                var11 = false;
            }
            if (arg0.field807 == arg0.field784 && (arg0.field780 > 25 || var11)) {
                if (arg0.field779 == -1) {
                    arg0.field807 = arg0.field787;
                } else {
                    arg0.field807 = arg0.field779;
                }
            }
        } else {
            arg0.field789 += arg0.field829;
            boolean var12 = true;
            if (var10 < arg0.field829 || var10 > 2048 - arg0.field829) {
                arg0.field789 = arg0.field790;
                var12 = false;
            }
            if (arg0.field807 == arg0.field784 && (arg0.field780 > 25 || var12)) {
                if (arg0.field786 == -1) {
                    arg0.field807 = arg0.field787;
                } else {
                    arg0.field807 = arg0.field786;
                }
            }
        }
        arg0.field789 &= 0x7FF;
    }

    @ObfuscatedName("al.ax(La;III)V")
    public static void method575(class3 arg0, int arg1, int arg2) {
        if (arg0.field810 == arg1 && arg1 != -1) {
            int var3 = class40.method2146(arg1).field972;
            if (var3 == 1) {
                arg0.field811 = 0;
                arg0.field812 = 0;
                arg0.field813 = arg2;
                arg0.field814 = 0;
            }
            if (var3 == 2) {
                arg0.field814 = 0;
            }
        } else if (arg1 == -1 || arg0.field810 == -1 || class40.method2146(arg1).field966 >= class40.method2146(arg0.field810).field966) {
            arg0.field810 = arg1;
            arg0.field811 = 0;
            arg0.field812 = 0;
            arg0.field813 = arg2;
            arg0.field814 = 0;
            arg0.field837 = arg0.field832;
        }
    }

    @ObfuscatedName("db.at(I)V")
    public static void method2521() {
        field320.method2453(11);
        class114 var0 = field320;
        int var1 = field498 ? 2 : 1;
        var0.method2326(var1);
        field320.method2202(Statics.field1408);
        field320.method2202(Statics.field1949);
    }

    @ObfuscatedName("w.ar(I)V")
    public static void method541() {
        client var0 = Statics.field279;
        synchronized (Statics.field279) {
            Container var1 = Statics.field279.method2763();
            if (var1 != null) {
                Statics.field166 = Math.max(var1.getSize().width, Statics.field49);
                Statics.field1015 = Math.max(var1.getSize().height, Statics.field1483);
                if (Statics.field616 == var1) {
                    Insets var2 = Statics.field616.getInsets();
                    Statics.field166 -= var2.right + var2.left;
                    Statics.field1015 -= var2.top + var2.bottom;
                }
                if (Statics.field166 <= 0) {
                    Statics.field166 = 1;
                }
                if (Statics.field1015 <= 0) {
                    Statics.field1015 = 1;
                }
                int var3 = field498 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field1408 = field468;
                    Statics.field1949 = field500;
                } else {
                    Statics.field1408 = Math.min(Statics.field166, 7680);
                    Statics.field1949 = Math.min(Statics.field1015, 2160);
                }
                field2107 = (Statics.field166 - Statics.field1408) / 2;
                field2108 = 0;
                Statics.field139.setSize(Statics.field1408, Statics.field1949);
                Statics.field59 = class73.method1496(Statics.field1408, Statics.field1949, Statics.field139);
                if (Statics.field616 == var1) {
                    Insets var4 = Statics.field616.getInsets();
                    Statics.field139.setLocation(field2107 + var4.left, field2108 + var4.top);
                } else {
                    Statics.field139.setLocation(field2107, field2108);
                }
                int var5 = Statics.field1408;
                int var6 = Statics.field1949;
                if (Statics.field166 < var5) {
                    int var7 = Statics.field166;
                }
                if (Statics.field1015 < var6) {
                    int var8 = Statics.field1015;
                }
                if (Statics.field134 != null) {
                    try {
                        client var9 = Statics.field279;
                        int var10 = field498 ? 2 : 1;
                        Object[] var11 = new Object[] { var10 };
                        JSObject.getWindow(var9).call("resize", var11);
                    } catch (Throwable var14) {
                    }
                }
                if (field442 != -1) {
                    method153(field442, Statics.field1408, Statics.field1949, true);
                }
                method525();
            }
        }
    }

    @ObfuscatedName("z.ai(I)V")
    public static void method525() {
        int var0 = field2107;
        int var1 = field2108;
        int var2 = Statics.field166 - Statics.field1408 - var0;
        int var3 = Statics.field1015 - Statics.field1949 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field279.method2763();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field616 == var4) {
                Insets var7 = Statics.field616.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1015);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field166, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field166 + var5 - var2, var6, var2, Statics.field1015);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1015 + var6 - var3, Statics.field166, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ch.aw(Ljava/lang/String;ZI)V")
    public static final void method1861(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field676.method3657(arg0, 250);
        int var6 = Statics.field676.method3658(arg0, 250) * 13;
        class75.method1637(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class75.method1614(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field676.method3663(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method498(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field139.getGraphics();
                Statics.field59.method1454(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field139.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field487; var13++) {
            if (field369[var13] + field297[var13] > var9 && field297[var13] < var9 + var11 && field495[var13] + field493[var13] > var10 && field493[var13] < var10 + var12) {
                field490[var13] = true;
            }
        }
    }

    @ObfuscatedName("au.ak(IIIIZI)V")
    public static final void method874(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field541 - field525) * var5 / 100 + field525;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field480) {
            short var8 = field480;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field545) {
                var6 = field545;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class75.method1605();
                    class75.method1637(arg0, arg1, var10, arg3, -16777216);
                    class75.method1637(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field547) {
            short var11 = field547;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field531) {
                var6 = field531;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class75.method1605();
                    class75.method1637(arg0, arg1, arg2, var13, -16777216);
                    class75.method1637(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field367 = arg3 * var6 / 334 << 1;
        if (field550 != arg2 || field412 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < 9; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var18 = class86.field1539[var16];
                var14[var15] = var17 * var18 >> 16;
            }
            class81.method1728(var14, 500, 800, arg2, arg3);
        }
        field548 = arg0;
        field346 = arg1;
        field550 = arg2;
        field412 = arg3;
    }

    @ObfuscatedName("g.an(Lah;I)V")
    public static final void method7(class31 arg0) {
        if (Statics.field1994.field830 >> 7 == field321 && Statics.field1994.field828 >> 7 == field519) {
            field321 = 0;
        }
        int var1 = field401;
        if (class31.field745 == arg0 || class31.field739 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class31.field745 == arg0) {
                var3 = Statics.field1994;
                var4 = 33538048;
            } else if (class31.field739 == arg0) {
                var3 = field400[field414];
                var4 = field414 << 14;
            } else {
                var3 = field400[field357[var2]];
                var4 = field357[var2] << 14;
                if (class31.field738 == arg0 && field414 == field357[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method18() && !var3.field63) {
                var3.field62 = false;
                if ((field285 && field401 > 50 || field401 > 200) && class31.field745 != arg0 && var3.field807 == var3.field784) {
                    var3.field62 = true;
                }
                int var5 = var3.field830 >> 7;
                int var6 = var3.field828 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field52 == null || field289 < var3.field57 || field289 >= var3.field48) {
                        if ((var3.field830 & 0x7F) == 64 && (var3.field828 & 0x7F) == 64) {
                            if (field287 == field554[var5][var6]) {
                                continue;
                            }
                            field554[var5][var6] = field287;
                        }
                        var3.field46 = method163(var3.field830, var3.field828, Statics.field599);
                        Statics.field684.method1708(Statics.field599, var3.field830, var3.field828, var3.field46, 60, var3, var3.field789, var4, var3.field782);
                    } else {
                        var3.field62 = false;
                        var3.field46 = method163(var3.field830, var3.field828, Statics.field599);
                        Statics.field684.method1803(Statics.field599, var3.field830, var3.field828, var3.field46, 60, var3, var3.field789, var4, var3.field53, var3.field54, var3.field55, var3.field41);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.av(ZI)V")
    public static final void method912(boolean arg0) {
        for (int var1 = 0; var1 < field317; var1++) {
            class32 var2 = field316[field318[var1]];
            int var3 = (field318[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field749.field872 == arg0 && var2.field749.method658()) {
                int var4 = var2.field830 >> 7;
                int var5 = var2.field828 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field783 == 1 && (var2.field830 & 0x7F) == 64 && (var2.field828 & 0x7F) == 64) {
                        if (field287 == field554[var4][var5]) {
                            continue;
                        }
                        field554[var4][var5] = field287;
                    }
                    if (!var2.field749.field880) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field684.method1708(Statics.field599, var2.field830, var2.field828, method163(var2.field830 + (var2.field783 * 64 - 64), var2.field828 + (var2.field783 * 64 - 64), Statics.field599), var2.field783 * 64 - 64 + 60, var2, var2.field789, var3, var2.field782);
                }
            }
        }
    }

    @ObfuscatedName("k.af(I)V")
    public static final void method129() {
        for (class7 var0 = (class7) field417.method3468(); var0 != null; var0 = (class7) field417.method3470()) {
            if (Statics.field599 != var0.field114 || field289 > var0.field110) {
                var0.method3554();
            } else if (field289 >= var0.field109) {
                if (var0.field113 > 0) {
                    class32 var1 = field316[var0.field113 - 1];
                    if (var1 != null && var1.field830 >= 0 && var1.field830 < 13312 && var1.field828 >= 0 && var1.field828 < 13312) {
                        var0.method87(var1.field830, var1.field828, method163(var1.field830, var1.field828, var0.field114) - var0.field124, field289);
                    }
                }
                if (var0.field113 < 0) {
                    int var2 = -var0.field113 - 1;
                    class3 var3;
                    if (field406 == var2) {
                        var3 = Statics.field1994;
                    } else {
                        var3 = field400[var2];
                    }
                    if (var3 != null && var3.field830 >= 0 && var3.field830 < 13312 && var3.field828 >= 0 && var3.field828 < 13312) {
                        var0.method87(var3.field830, var3.field828, method163(var3.field830, var3.field828, var0.field114) - var0.field124, field289);
                    }
                }
                var0.method88(field354);
                Statics.field684.method1708(Statics.field599, (int) var0.field112, (int) var0.field116, (int) var0.field128, 60, var0, var0.field123, -1, false);
            }
        }
    }

    @ObfuscatedName("ck.ae(III)V")
    public static final void method1864(int arg0, int arg1) {
        if (field510 == 2) {
            method144((field300 - Statics.field2594 << 7) + field303, (field301 - Statics.field954 << 7) + field304, field302 * 2);
            if (field366 > -1 && field289 % 20 < 10) {
                Statics.field1852[0].method1587(field366 + arg0 - 12, field386 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("dt.au(Lam;IIIIII)V")
    public static final void method2561(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method18()) {
            return;
        }
        if (arg0 instanceof class32) {
            class37 var6 = ((class32) arg0).field749;
            if (var6.field877 != null) {
                var6 = var6.method657();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field401) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field63) {
                return;
            }
            if (var8.field42 != -1 || var8.field43 != -1) {
                method850(arg0, arg0.field781 + 15);
                if (field366 > -1) {
                    if (var8.field42 != -1) {
                        Statics.field997[var8.field42].method1587(field366 + arg2 - 12, field386 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field43 != -1) {
                        Statics.field28[var8.field43].method1587(field366 + arg2 - 12, field386 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field510 == 10 && field299 == field357[arg1]) {
                method850(arg0, arg0.field781 + 15);
                if (field366 > -1) {
                    Statics.field1852[1].method1587(field366 + arg2 - 12, field386 + arg3 - var7);
                }
            }
        } else {
            class37 var9 = ((class32) arg0).field749;
            if (var9.field877 != null) {
                var9 = var9.method657();
            }
            if (var9.field864 >= 0 && var9.field864 < Statics.field28.length) {
                method850(arg0, arg0.field781 + 15);
                if (field366 > -1) {
                    Statics.field28[var9.field864].method1587(field366 + arg2 - 12, field386 + arg3 - 30);
                }
            }
            if (field510 == 1 && field423 == field318[arg1 - field401] && field289 % 20 < 10) {
                method850(arg0, arg0.field781 + 15);
                if (field366 > -1) {
                    Statics.field1852[0].method1587(field366 + arg2 - 12, field386 + arg3 - 28);
                }
            }
        }
        if (arg0.field836 != null && (arg1 >= field401 || !arg0.field792 && (field502 == 4 || !arg0.field793 && (field502 == 0 || field502 == 3 || field502 == 1 && method2896(((class3) arg0).field60, false))))) {
            method850(arg0, arg0.field781);
            if (field366 > -1 && field382 < field434) {
                field380[field382] = Statics.field100.method3655(arg0.field836) / 2;
                field377[field382] = Statics.field100.field3091;
                field375[field382] = field366;
                field294[field382] = field386;
                field384[field382] = arg0.field838;
                field374[field382] = arg0.field797;
                field532[field382] = arg0.field795;
                field530[field382] = arg0.field836;
                field382++;
            }
        }
        if (arg0.field801 > field289) {
            method850(arg0, arg0.field781 + 15);
            if (field366 > -1) {
                int var10;
                if (arg1 < field401) {
                    var10 = 30;
                } else {
                    class37 var11 = ((class32) arg0).field749;
                    var10 = var11.field866;
                }
                int var12 = arg0.field802 * var10 / arg0.field803;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field802 > 0) {
                    var12 = 1;
                }
                class75.method1637(field366 + arg2 - var10 / 2, field386 + arg3 - 3, var12, 5, 65280);
                class75.method1637(field366 + arg2 - var10 / 2 + var12, field386 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field800[var13] > field289) {
                method850(arg0, arg0.field781 / 2);
                if (field366 > -1) {
                    if (var13 == 1) {
                        field386 -= 20;
                    }
                    if (var13 == 2) {
                        field366 -= 15;
                        field386 -= 10;
                    }
                    if (var13 == 3) {
                        field366 += 15;
                        field386 -= 10;
                    }
                    Statics.field133[arg0.field835[var13]].method1587(field366 + arg2 - 12, field386 + arg3 - 12);
                    Statics.field1403.method3662(Integer.toString(arg0.field798[var13]), field366 + arg2 - 1, field386 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("cf.aa(IIIIB)V")
    public static final void method1959(int arg0, int arg1, int arg2, int arg3) {
        field382 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field401 + field317; var6++) {
            class35 var7;
            if (var6 == -1) {
                var7 = Statics.field1994;
            } else if (var6 < field401) {
                var7 = field400[field357[var6]];
                if (field414 == field357[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field316[field318[var6 - field401]];
            }
            method2561(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2561(field400[field414], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field382; var8++) {
            int var9 = field375[var8];
            int var10 = field294[var8];
            int var11 = field380[var8];
            int var12 = field377[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field294[var14] - field377[var14] && var10 - var12 < field294[var14] + 2 && var9 - var11 < field380[var14] + field375[var14] && var9 + var11 > field375[var14] - field380[var14] && field294[var14] - field377[var14] < var10) {
                        var10 = field294[var14] - field377[var14];
                        var13 = true;
                    }
                }
            }
            field366 = field375[var8];
            field386 = field294[var8] = var10;
            String var15 = field530[var8];
            if (field444 == 0) {
                int var16 = 16776960;
                if (field384[var8] < 6) {
                    var16 = field501[field384[var8]];
                }
                if (field384[var8] == 6) {
                    var16 = field287 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field384[var8] == 7) {
                    var16 = field287 % 20 < 10 ? 255 : 65535;
                }
                if (field384[var8] == 8) {
                    var16 = field287 % 20 < 10 ? 45056 : 8454016;
                }
                if (field384[var8] == 9) {
                    int var17 = 150 - field532[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field384[var8] == 10) {
                    int var18 = 150 - field532[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field384[var8] == 11) {
                    int var19 = 150 - field532[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field374[var8] == 0) {
                    Statics.field100.method3662(var15, field366 + arg0, field386 + arg1, var16, 0);
                }
                if (field374[var8] == 1) {
                    Statics.field100.method3664(var15, field366 + arg0, field386 + arg1, var16, 0, field287);
                }
                if (field374[var8] == 2) {
                    Statics.field100.method3675(var15, field366 + arg0, field386 + arg1, var16, 0, field287);
                }
                if (field374[var8] == 3) {
                    Statics.field100.method3666(var15, field366 + arg0, field386 + arg1, var16, 0, field287, 150 - field532[var8]);
                }
                if (field374[var8] == 4) {
                    int var20 = (150 - field532[var8]) * (Statics.field100.method3655(var15) + 100) / 150;
                    class75.method1607(field366 + arg0 - 50, arg1, field366 + arg0 + 50, arg1 + arg3);
                    Statics.field100.method3654(var15, field366 + arg0 + 50 - var20, field386 + arg1, var16, 0);
                    class75.method1606(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field374[var8] == 5) {
                    int var21 = 150 - field532[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class75.method1607(arg0, field386 + arg1 - Statics.field100.field3091 - 1, arg0 + arg2, field386 + arg1 + 5);
                    Statics.field100.method3662(var15, field366 + arg0, field386 + arg1 + var22, var16, 0);
                    class75.method1606(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field100.method3662(var15, field366 + arg0, field386 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("av.ay(Lam;II)V")
    public static final void method850(class35 arg0, int arg1) {
        method144(arg0.field830, arg0.field828, arg1);
    }

    @ObfuscatedName("q.ac(IIII)V")
    public static final void method144(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field366 = -1;
            field386 = -1;
            return;
        }
        int var3 = method163(arg0, arg1, Statics.field599) - arg2;
        int var4 = arg0 - Statics.field1733;
        int var5 = var3 - Statics.field991;
        int var6 = arg1 - Statics.field2823;
        int var7 = class86.field1539[Statics.field938];
        int var8 = class86.field1540[Statics.field938];
        int var9 = class86.field1539[Statics.field363];
        int var10 = class86.field1540[Statics.field363];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field366 = field367 * var11 / var15 + field550 / 2;
            field386 = field367 * var14 / var15 + field412 / 2;
        } else {
            field366 = -1;
            field386 = -1;
        }
    }

    @ObfuscatedName("v.ab(IIII)I")
    public static final int method163(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field83[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field95[var5][var3][var4] + class6.field95[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field95[var5][var3][var4 + 1] + class6.field95[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bq.ap(ZI)V")
    public static final void method1448(boolean arg0) {
        field339 = arg0;
        if (!field339) {
            int var1 = field322.method2251();
            int var2 = field322.method2251();
            int var3 = (field323 - field322.field1896) / 16;
            Statics.field2794 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2794[var4][var5] = field322.method2321();
                }
            }
            int var6 = field322.method2250();
            int var7 = field322.method2241();
            int var8 = field322.method2250();
            Statics.field1506 = new int[var3];
            Statics.field2530 = new int[var3];
            Statics.field228 = new int[var3];
            Statics.field77 = new byte[var3][];
            Statics.field3057 = new byte[var3][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var6 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var6 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1506[var10] = var13;
                        Statics.field2530[var10] = Statics.field2552.method2924("m" + var11 + "_" + var12);
                        Statics.field228[var10] = Statics.field2552.method2924("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method85(var8, var6, var7, var1, var2);
            return;
        }
        int var14 = field322.method2395();
        field322.method2457();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field322.method2459(1);
                    if (var18 == 1) {
                        field340[var15][var16][var17] = field322.method2459(26);
                    } else {
                        field340[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field322.method2449();
        int var19 = (field323 - field322.field1896) / 16;
        Statics.field2794 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2794[var20][var21] = field322.method2321();
            }
        }
        int var22 = field322.method2251();
        int var23 = field322.method2250();
        int var24 = field322.method2251();
        int var25 = field322.method2242();
        Statics.field1506 = new int[var19];
        Statics.field2530 = new int[var19];
        Statics.field228 = new int[var19];
        Statics.field77 = new byte[var19][];
        Statics.field3057 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field340[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1506[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1506[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field2530[var26] = Statics.field2552.method2924("m" + var35 + "_" + var36);
                            Statics.field228[var26] = Statics.field2552.method2924("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method85(var24, var23, var25, var14, var22);
    }

    @ObfuscatedName("j.as(IIIIII)V")
    public static final void method85(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field993 == arg0 && Statics.field1933 == arg1 && field388 == arg2 || !field285) {
            return;
        }
        Statics.field993 = arg0;
        Statics.field1933 = arg1;
        field388 = arg2;
        if (!field285) {
            field388 = 0;
        }
        method46(25);
        method1861(class148.field2282, true);
        int var5 = Statics.field2594;
        int var6 = Statics.field954;
        Statics.field2594 = (arg0 - 6) * 8;
        Statics.field954 = (arg1 - 6) * 8;
        int var7 = Statics.field2594 - var5;
        int var8 = Statics.field954 - var6;
        int var9 = Statics.field2594;
        int var10 = Statics.field954;
        for (int var11 = 0; var11 < 32768; var11++) {
            class32 var12 = field316[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field833[var13] -= var7;
                    var12.field794[var13] -= var8;
                }
                var12.field830 -= var7 * 128;
                var12.field828 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field400[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field833[var16] -= var7;
                    var15.field794[var16] -= var8;
                }
                var15.field830 -= var7 * 128;
                var15.field828 -= var8 * 128;
            }
        }
        Statics.field599 = arg2;
        Statics.field1994.method634(arg3, arg4, false);
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
                        field415[var27][var23][var24] = field415[var27][var25][var26];
                    } else {
                        field415[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field558.method3468(); var28 != null; var28 = (class16) field558.method3470()) {
            var28.field230 -= var7;
            var28.field231 -= var8;
            if (var28.field230 < 0 || var28.field231 < 0 || var28.field230 >= 104 || var28.field231 >= 104) {
                var28.method3554();
            }
        }
        if (field321 != 0) {
            field321 -= var7;
            field519 -= var8;
        }
        field527 = 0;
        field533 = false;
        field513 = -1;
        field418.method3480();
        field417.method3480();
    }

    @ObfuscatedName("eg.bi(ZI)V")
    public static final void method2809(boolean arg0) {
        method2();
        field432++;
        if (field432 < 50 && !arg0) {
            return;
        }
        field432 = 0;
        if (field331 || Statics.field2560 == null) {
            return;
        }
        field320.method2453(109);
        try {
            Statics.field2560.method2688(field320.field1904, 0, field320.field1896);
            field320.field1896 = 0;
        } catch (IOException var2) {
            field331 = true;
        }
    }

    @ObfuscatedName("ey.bv(IB)V")
    public static final void method2850(int arg0) {
        int[] var1 = Statics.field2117.field1362;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field83[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field684.method1727(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field83[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field684.method1727(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2117.method1506();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field83[arg0][var10][var9] & 0x18) == 0) {
                    method29(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field83[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method29(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field514 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field684.method1763(Statics.field599, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class38.method879(var14).field918;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field338[Statics.field599].field3137;
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
                        field469[field514] = Statics.field974[var15];
                        field515[field514] = var16;
                        field516[field514] = var17;
                        field514++;
                    }
                }
            }
        }
        Statics.field59.method1500();
    }

    @ObfuscatedName("m.bl(IIIIII)V")
    public static final void method29(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field684.method1719(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field684.method1703(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2117.field1362;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class38 var13 = class38.method879(var12);
            if (var13.field911 == -1) {
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
                class76 var14 = Statics.field1809[var13.field911];
                if (var14 != null) {
                    int var15 = (var13.field904 * 4 - var14.field1379) / 2;
                    int var16 = (var13.field905 * 4 - var14.field1378) / 2;
                    var14.method1663(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field905) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field684.method1721(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field684.method1703(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class38 var22 = class38.method879(var21);
            if (var22.field911 != -1) {
                class76 var23 = Statics.field1809[var22.field911];
                if (var23 != null) {
                    int var24 = (var22.field904 * 4 - var23.field1379) / 2;
                    int var25 = (var22.field905 * 4 - var23.field1378) / 2;
                    var23.method1663(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field905) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2117.field1362;
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
        int var29 = Statics.field684.method1763(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class38 var31 = class38.method879(var30);
        if (var31.field911 == -1) {
            return;
        }
        class76 var32 = Statics.field1809[var31.field911];
        if (var32 != null) {
            int var33 = (var31.field904 * 4 - var32.field1379) / 2;
            int var34 = (var31.field905 * 4 - var32.field1378) / 2;
            var32.method1663(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field905) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("gr.by(B)Z")
    public static final boolean method3565() {
        if (Statics.field2560 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2560.method2695();
            if (var0 == 0) {
                return false;
            }
            if (field324 == -1) {
                Statics.field2560.method2702(field322.field1904, 0, 1);
                field322.field1896 = 0;
                field324 = field322.method2446();
                field323 = class179.field2935[field324];
                var0--;
            }
            if (field323 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2560.method2702(field322.field1904, 0, 1);
                field323 = field322.field1904[0] & 0xFF;
                var0--;
            }
            if (field323 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2560.method2702(field322.field1904, 0, 2);
                field322.field1896 = 0;
                field323 = field322.method2395();
                var0 -= 2;
            }
            if (var0 < field323) {
                return false;
            }
            field322.field1896 = 0;
            Statics.field2560.method2702(field322.field1904, 0, field323);
            field325 = 0;
            field330 = field551;
            field551 = field535;
            field535 = field324;
            if (field324 == 26) {
                String var1 = field322.method2223();
                int var2 = field322.method2321();
                class164 var3 = class164.method560(var2);
                if (!var1.equals(var3.field2680)) {
                    var3.field2680 = var1;
                    method572(var3);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 58) {
                int var4 = field322.method2321();
                class164 var5 = class164.method560(var4);
                var5.field2689 = 3;
                var5.field2690 = Statics.field1994.field47.method3125();
                method572(var5);
                field324 = -1;
                return true;
            }
            if (field324 == 169) {
                field296 = field322.method2249() * 30;
                field411 = field467;
                field324 = -1;
                return true;
            }
            if (field324 == 197) {
                field322.field1896 += 28;
                if (field322.method2237()) {
                    class141.method2157(field322, field322.field1896 - 28);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 85) {
                field533 = true;
                Statics.field1937 = field322.method2211();
                Statics.field1152 = field322.method2211();
                Statics.field433 = field322.method2395();
                Statics.field51 = field322.method2211();
                Statics.field1571 = field322.method2211();
                if (Statics.field1571 >= 100) {
                    int var6 = Statics.field1937 * 128 + 64;
                    int var7 = Statics.field1152 * 128 + 64;
                    int var8 = method163(var6, var7, Statics.field599) - Statics.field433;
                    int var9 = var6 - Statics.field1733;
                    int var10 = var8 - Statics.field991;
                    int var11 = var7 - Statics.field2823;
                    int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
                    Statics.field938 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
                    Statics.field363 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
                    if (Statics.field938 < 128) {
                        Statics.field938 = 128;
                    }
                    if (Statics.field938 > 383) {
                        Statics.field938 = 383;
                    }
                }
                field324 = -1;
                return true;
            }
            if (field324 == 100) {
                field502 = field322.method2211();
                field503 = field322.method2211();
                field324 = -1;
                return true;
            }
            if (field324 == 49) {
                int var13 = field322.method2251();
                int var14 = field322.method2366();
                class164 var15 = class164.method560(var14);
                if (var15.field2689 != 1 || var15.field2690 != var13) {
                    var15.field2689 = 1;
                    var15.field2690 = var13;
                    method572(var15);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 5) {
                for (int var16 = 0; var16 < Statics.field1930; var16++) {
                    class48 var17 = class48.method2707(var16);
                    if (var17 != null) {
                        class167.field2799[var16] = 0;
                        class167.field2796[var16] = 0;
                    }
                }
                method1941();
                field481 += 32;
                field324 = -1;
                return true;
            }
            if (field324 == 172) {
                int var18 = field322.method2395();
                int var19 = field322.method2211();
                int var20 = field322.method2395();
                method3365(var18, var19, var20);
                field324 = -1;
                return true;
            }
            if (field324 == 104) {
                int var21 = field322.method2250();
                int var22 = field322.method2250();
                int var23 = field322.method2366();
                int var24 = field322.method2395();
                class164 var25 = class164.method560(var23);
                if (var25.field2706 != var22 || var25.field2698 != var21 || var25.field2700 != var24) {
                    var25.field2706 = var22;
                    var25.field2698 = var21;
                    var25.field2700 = var24;
                    method572(var25);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 139) {
                method1448(false);
                field324 = -1;
                return true;
            }
            if (field324 == 9) {
                int var26 = field322.method2395();
                class15 var27 = (class15) class15.field227.method3425((long) var26);
                if (var27 != null) {
                    var27.method3554();
                }
                field470[++field471 - 1 & 0x1F] = var26 & 0x7FFF;
                field324 = -1;
                return true;
            }
            if (field324 == 193) {
                int var28 = field322.method2395();
                int var29 = field322.method2366();
                int var30 = field322.method2241();
                class4 var31 = (class4) field443.method3425((long) var29);
                if (var31 != null) {
                    method2854(var31, var31.field72 != var28);
                }
                method853(var29, var28, var30);
                field324 = -1;
                return true;
            }
            if (field324 == 206) {
                field533 = false;
                for (int var32 = 0; var32 < 5; var32++) {
                    field439[var32] = false;
                }
                field324 = -1;
                return true;
            }
            if (field324 == 16) {
                while (field322.field1896 < field323) {
                    int var33 = field322.method2211();
                    boolean var34 = (var33 & 0x1) == 1;
                    String var35 = field322.method2223();
                    String var36 = field322.method2223();
                    field322.method2223();
                    for (int var37 = 0; var37 < field557; var37++) {
                        class8 var38 = field298[var37];
                        if (var34) {
                            if (var36.equals(var38.field142)) {
                                var38.field142 = var35;
                                var38.field135 = var36;
                                var35 = null;
                                break;
                            }
                        } else if (var35.equals(var38.field142)) {
                            var38.field142 = var35;
                            var38.field135 = var36;
                            var35 = null;
                            break;
                        }
                    }
                    if (var35 != null && field557 < 400) {
                        class8 var39 = new class8();
                        field298[field557] = var39;
                        var39.field142 = var35;
                        var39.field135 = var36;
                        field557++;
                    }
                }
                field475 = field467;
                field324 = -1;
                return true;
            }
            if (field324 == 165) {
                int var40 = field322.method2242();
                int var41 = field322.method2211();
                int var42 = field322.method2360();
                Statics.field599 = var42 >> 1;
                Statics.field1994.method634(var40, var41, (var42 & 0x1) == 1);
                field324 = -1;
                return true;
            }
            if (field324 == 36) {
                class114 var43 = field322;
                int var44 = field323;
                class201 var45 = new class201();
                var45.field3026 = var43.method2211();
                var45.field3024 = var43.method2366();
                var45.field3025 = new int[var45.field3026];
                var45.field3027 = new int[var45.field3026];
                var45.field3028 = new Field[var45.field3026];
                var45.field3029 = new int[var45.field3026];
                var45.field3030 = new Method[var45.field3026];
                var45.field3031 = new byte[var45.field3026][][];
                for (int var46 = 0; var46 < var45.field3026; var46++) {
                    try {
                        int var47 = var43.method2211();
                        if (var47 == 0 || var47 == 1 || var47 == 2) {
                            String var48 = var43.method2223();
                            String var49 = var43.method2223();
                            int var50 = 0;
                            if (var47 == 1) {
                                var50 = var43.method2366();
                            }
                            var45.field3025[var46] = var47;
                            var45.field3029[var46] = var50;
                            if (class202.method2853(var48).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var45.field3028[var46] = class202.method2853(var48).getDeclaredField(var49);
                        } else if (var47 == 3 || var47 == 4) {
                            String var51 = var43.method2223();
                            String var52 = var43.method2223();
                            int var53 = var43.method2211();
                            String[] var54 = new String[var53];
                            for (int var55 = 0; var55 < var53; var55++) {
                                var54[var55] = var43.method2223();
                            }
                            String var56 = var43.method2223();
                            byte[][] var57 = new byte[var53][];
                            if (var47 == 3) {
                                for (int var58 = 0; var58 < var53; var58++) {
                                    int var59 = var43.method2366();
                                    var57[var58] = new byte[var59];
                                    var43.method2226(var57[var58], 0, var59);
                                }
                            }
                            var45.field3025[var46] = var47;
                            Class[] var60 = new Class[var53];
                            for (int var61 = 0; var61 < var53; var61++) {
                                var60[var61] = class202.method2853(var54[var61]);
                            }
                            Class var62 = class202.method2853(var56);
                            if (class202.method2853(var51).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var63 = class202.method2853(var51).getDeclaredMethods();
                            Method[] var64 = var63;
                            for (int var65 = 0; var65 < var64.length; var65++) {
                                Method var66 = var64[var65];
                                if (var66.getName().equals(var52)) {
                                    Class[] var67 = var66.getParameterTypes();
                                    if (var60.length == var67.length) {
                                        boolean var68 = true;
                                        for (int var69 = 0; var69 < var60.length; var69++) {
                                            if (var60[var69] != var67[var69]) {
                                                var68 = false;
                                                break;
                                            }
                                        }
                                        if (var68 && var62 == var66.getReturnType()) {
                                            var45.field3030[var46] = var66;
                                        }
                                    }
                                }
                            }
                            var45.field3031[var46] = var57;
                        }
                    } catch (ClassNotFoundException var290) {
                        var45.field3027[var46] = -1;
                    } catch (SecurityException var291) {
                        var45.field3027[var46] = -2;
                    } catch (NullPointerException var292) {
                        var45.field3027[var46] = -3;
                    } catch (Exception var293) {
                        var45.field3027[var46] = -4;
                    } catch (Throwable var294) {
                        var45.field3027[var46] = -5;
                    }
                }
                class202.field3032.method3505(var45);
                field324 = -1;
                return true;
            }
            if (field324 == 125) {
                boolean var75 = field322.method2211() == 1;
                if (var75) {
                    Statics.field639 = class107.method3364() - field322.method2221();
                    Statics.field251 = new class212(field322, true);
                } else {
                    Statics.field251 = null;
                }
                field478 = field467;
                field324 = -1;
                return true;
            }
            if (field324 == 140) {
                for (int var76 = 0; var76 < class167.field2796.length; var76++) {
                    if (class167.field2799[var76] != class167.field2796[var76]) {
                        class167.field2796[var76] = class167.field2799[var76];
                        method2484(var76);
                        field461[++field481 - 1 & 0x1F] = var76;
                    }
                }
                field324 = -1;
                return true;
            }
            if (field324 == 199) {
                String var77 = field322.method2223();
                int var78 = field322.method2395();
                byte var79 = field322.method2217();
                boolean var80 = false;
                if (var79 == -128) {
                    var80 = true;
                }
                if (var80) {
                    if (Statics.field2081 == 0) {
                        field324 = -1;
                        return true;
                    }
                    boolean var81 = false;
                    int var82;
                    for (var82 = 0; var82 < Statics.field2081 && (!Statics.field1475[var82].field625.equals(var77) || Statics.field1475[var82].field620 != var78); var82++) {
                    }
                    if (var82 < Statics.field2081) {
                        while (var82 < Statics.field2081 - 1) {
                            Statics.field1475[var82] = Statics.field1475[var82 + 1];
                            var82++;
                        }
                        Statics.field2081--;
                        Statics.field1475[Statics.field2081] = null;
                    }
                } else {
                    field322.method2223();
                    class23 var83 = new class23();
                    var83.field625 = var77;
                    var83.field618 = class155.method710(var83.field625, Statics.field578);
                    var83.field620 = var78;
                    var83.field621 = var79;
                    int var84;
                    for (var84 = Statics.field2081 - 1; var84 >= 0; var84--) {
                        int var85 = Statics.field1475[var84].field618.compareTo(var83.field618);
                        if (var85 == 0) {
                            Statics.field1475[var84].field620 = var78;
                            Statics.field1475[var84].field621 = var79;
                            if (var77.equals(Statics.field1994.field60)) {
                                Statics.field1326 = var79;
                            }
                            field476 = field467;
                            field324 = -1;
                            return true;
                        }
                        if (var85 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2081 >= Statics.field1475.length) {
                        field324 = -1;
                        return true;
                    }
                    for (int var86 = Statics.field2081 - 1; var86 > var84; var86--) {
                        Statics.field1475[var86 + 1] = Statics.field1475[var86];
                    }
                    if (Statics.field2081 == 0) {
                        Statics.field1475 = new class23[100];
                    }
                    Statics.field1475[var84 + 1] = var83;
                    Statics.field2081++;
                    if (var77.equals(Statics.field1994.field60)) {
                        Statics.field1326 = var79;
                    }
                }
                field476 = field467;
                field324 = -1;
                return true;
            }
            if (field324 == 93) {
                method1863(true);
                field324 = -1;
                return true;
            }
            if (field324 == 215) {
                int var87 = field322.method2378();
                boolean var88 = field322.method2211() == 1;
                String var89 = "";
                boolean var90 = false;
                if (var88) {
                    var89 = field322.method2223();
                    if (method574(var89)) {
                        var90 = true;
                    }
                }
                String var91 = field322.method2223();
                if (!var90) {
                    class11.method2846(var87, var89, var91);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 117) {
                int var92 = field322.method2366();
                class4 var93 = (class4) field443.method3425((long) var92);
                if (var93 != null) {
                    method2854(var93, true);
                }
                if (field546 != null) {
                    method572(field546);
                    field546 = null;
                }
                field324 = -1;
                return true;
            }
            if (field324 == 213 || field324 == 106 || field324 == 239 || field324 == 63 || field324 == 107 || field324 == 149 || field324 == 196 || field324 == 226 || field324 == 224 || field324 == 115) {
                method158();
                field324 = -1;
                return true;
            }
            if (field324 == 94) {
                field510 = field322.method2211();
                if (field510 == 1) {
                    field423 = field322.method2395();
                }
                if (field510 >= 2 && field510 <= 6) {
                    if (field510 == 2) {
                        field303 = 64;
                        field304 = 64;
                    }
                    if (field510 == 3) {
                        field303 = 0;
                        field304 = 64;
                    }
                    if (field510 == 4) {
                        field303 = 128;
                        field304 = 64;
                    }
                    if (field510 == 5) {
                        field303 = 64;
                        field304 = 0;
                    }
                    if (field510 == 6) {
                        field303 = 64;
                        field304 = 128;
                    }
                    field510 = 2;
                    field300 = field322.method2395();
                    field301 = field322.method2395();
                    field302 = field322.method2211();
                }
                if (field510 == 10) {
                    field299 = field322.method2395();
                }
                field324 = -1;
                return true;
            }
            if (field324 == 95) {
                Statics.field39 = class122.method638(field322.method2211());
                field324 = -1;
                return true;
            }
            if (field324 == 8) {
                int var94 = field322.method2259();
                int var95 = field322.method2251();
                int var96 = var95 >> 10 & 0x1F;
                int var97 = var95 >> 5 & 0x1F;
                int var98 = var95 & 0x1F;
                int var99 = (var98 << 3) + (var96 << 19) + (var97 << 11);
                class164 var100 = class164.method560(var94);
                if (var100.field2742 != var99) {
                    var100.field2742 = var99;
                    method572(var100);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 144) {
                int var101 = field322.method2249();
                int var102 = field322.method2366();
                class164 var103 = class164.method560(var102);
                if (var103.field2689 != 2 || var103.field2690 != var101) {
                    var103.field2689 = 2;
                    var103.field2690 = var101;
                    method572(var103);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 38) {
                int var104 = field322.method2366();
                Statics.field2951 = Statics.field1869.method2575(var104);
                field324 = -1;
                return true;
            }
            if (field324 == 134) {
                method1863(false);
                field324 = -1;
                return true;
            }
            if (field324 == 253) {
                method1448(true);
                field324 = -1;
                return true;
            }
            if (field324 == 219) {
                int var105 = field322.method2259();
                int var106 = field322.method2249();
                class167.field2799[var106] = var105;
                if (class167.field2796[var106] != var105) {
                    class167.field2796[var106] = var105;
                    method2484(var106);
                }
                field461[++field481 - 1 & 0x1F] = var106;
                field324 = -1;
                return true;
            }
            if (field324 == 190) {
                String var107 = field322.method2223();
                String var108 = class214.method3659(class154.method2584(class213.method3602(field322)));
                class11.method2846(6, var107, var108);
                field324 = -1;
                return true;
            }
            if (field324 == 113) {
                method1941();
                field448 = field322.method2389();
                field411 = field467;
                field324 = -1;
                return true;
            }
            if (field324 == 55) {
                int var109 = field322.method2366();
                int var110 = field322.method2366();
                class4 var111 = (class4) field443.method3425((long) var109);
                class4 var112 = (class4) field443.method3425((long) var110);
                if (var112 != null) {
                    method2854(var112, var111 == null || var111.field72 != var112.field72);
                }
                if (var111 != null) {
                    var111.method3554();
                    field443.method3426(var111, (long) var110);
                }
                class164 var113 = class164.method560(var109);
                if (var113 != null) {
                    method572(var113);
                }
                class164 var114 = class164.method560(var110);
                if (var114 != null) {
                    method572(var114);
                    method3375(Statics.field2764[var114.field2717 >>> 16], var114, true);
                }
                if (field442 != -1) {
                    method934(field442, 1);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 1) {
                int var115 = field322.method2260();
                class164 var116 = class164.method560(var115);
                for (int var117 = 0; var117 < var116.field2694.length; var117++) {
                    var116.field2694[var117] = -1;
                    var116.field2694[var117] = 0;
                }
                method572(var116);
                field324 = -1;
                return true;
            }
            if (field324 == 218) {
                while (field322.field1896 < field323) {
                    boolean var118 = field322.method2211() == 1;
                    String var119 = field322.method2223();
                    String var120 = field322.method2223();
                    int var121 = field322.method2395();
                    int var122 = field322.method2211();
                    int var123 = field322.method2211();
                    boolean var124 = (var123 & 0x2) != 0;
                    boolean var125 = (var123 & 0x1) != 0;
                    if (var121 > 0) {
                        field322.method2223();
                        field322.method2211();
                        field322.method2366();
                    }
                    field322.method2223();
                    for (int var126 = 0; var126 < field553; var126++) {
                        class17 var127 = field518[var126];
                        if (var118) {
                            if (var120.equals(var127.field260)) {
                                var127.field260 = var119;
                                var127.field252 = var120;
                                var119 = null;
                                break;
                            }
                        } else if (var119.equals(var127.field260)) {
                            if (var127.field247 != var121) {
                                boolean var128 = true;
                                for (class36 var129 = (class36) field556.method3417(); var129 != null; var129 = (class36) field556.method3418()) {
                                    if (var129.field842.equals(var119)) {
                                        if (var121 != 0 && var129.field843 == 0) {
                                            var129.method3550();
                                            var128 = false;
                                        } else if (var121 == 0 && var129.field843 != 0) {
                                            var129.method3550();
                                            var128 = false;
                                        }
                                    }
                                }
                                if (var128) {
                                    field556.method3421(new class36(var119, var121));
                                }
                                var127.field247 = var121;
                            }
                            var127.field252 = var120;
                            var127.field248 = var122;
                            var127.field245 = var124;
                            var127.field250 = var125;
                            var119 = null;
                            break;
                        }
                    }
                    if (var119 != null && field553 < 400) {
                        class17 var130 = new class17();
                        field518[field553] = var130;
                        var130.field260 = var119;
                        var130.field252 = var120;
                        var130.field247 = var121;
                        var130.field248 = var122;
                        var130.field245 = var124;
                        var130.field250 = var125;
                        field553++;
                    }
                }
                field539 = 2;
                field475 = field467;
                boolean var131 = false;
                int var132 = field553;
                while (var132 > 0) {
                    boolean var133 = true;
                    var132--;
                    for (int var134 = 0; var134 < var132; var134++) {
                        boolean var135 = false;
                        class17 var136 = field518[var134];
                        class17 var137 = field518[var134 + 1];
                        if (field281 != var136.field247 && field281 == var137.field247) {
                            var135 = true;
                        }
                        if (!var135 && var136.field247 == 0 && var137.field247 != 0) {
                            var135 = true;
                        }
                        if (!var135 && !var136.field245 && var137.field245) {
                            var135 = true;
                        }
                        if (!var135 && !var136.field250 && var137.field250) {
                            var135 = true;
                        }
                        if (var135) {
                            class17 var138 = field518[var134];
                            field518[var134] = field518[var134 + 1];
                            field518[var134 + 1] = var138;
                            var133 = false;
                        }
                    }
                    if (var133) {
                        break;
                    }
                }
                field324 = -1;
                return true;
            }
            if (field324 == 234) {
                int var139 = field322.method2395();
                field442 = var139;
                method153(field442, Statics.field1408, Statics.field1949, false);
                method2150(var139);
                class34.method122(field442);
                for (int var140 = 0; var140 < 100; var140++) {
                    field489[var140] = true;
                }
                field324 = -1;
                return true;
            }
            if (field324 == 129) {
                method1941();
                field373 = field322.method2211();
                field411 = field467;
                field324 = -1;
                return true;
            }
            if (field324 == 181) {
                boolean var141 = field322.method2211() == 1;
                int var142 = field322.method2366();
                class164 var143 = class164.method560(var142);
                if (var143.field2668 != var141) {
                    var143.field2668 = var141;
                    method572(var143);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 101) {
                field476 = field467;
                if (field323 == 0) {
                    field391 = null;
                    field512 = null;
                    Statics.field2081 = 0;
                    Statics.field1475 = null;
                    field324 = -1;
                    return true;
                }
                field512 = field322.method2223();
                long var144 = field322.method2221();
                field391 = Statics.method1686(var144);
                Statics.field2803 = field322.method2217();
                int var146 = field322.method2211();
                if (var146 == 255) {
                    field324 = -1;
                    return true;
                }
                Statics.field2081 = var146;
                class23[] var147 = new class23[100];
                for (int var148 = 0; var148 < Statics.field2081; var148++) {
                    var147[var148] = new class23();
                    var147[var148].field625 = field322.method2223();
                    var147[var148].field618 = class155.method710(var147[var148].field625, Statics.field578);
                    var147[var148].field620 = field322.method2395();
                    var147[var148].field621 = field322.method2217();
                    field322.method2223();
                    if (var147[var148].field625.equals(Statics.field1994.field60)) {
                        Statics.field1326 = var147[var148].field621;
                    }
                }
                boolean var149 = false;
                int var150 = Statics.field2081;
                while (var150 > 0) {
                    boolean var151 = true;
                    var150--;
                    for (int var152 = 0; var152 < var150; var152++) {
                        if (var147[var152].field618.compareTo(var147[var152 + 1].field618) > 0) {
                            class23 var153 = var147[var152];
                            var147[var152] = var147[var152 + 1];
                            var147[var152 + 1] = var153;
                            var151 = false;
                        }
                    }
                    if (var151) {
                        break;
                    }
                }
                Statics.field1475 = var147;
                field324 = -1;
                return true;
            }
            if (field324 == 220) {
                field539 = 1;
                field475 = field467;
                field324 = -1;
                return true;
            }
            if (field324 == 90) {
                for (int var154 = 0; var154 < field400.length; var154++) {
                    if (field400[var154] != null) {
                        field400[var154].field810 = -1;
                    }
                }
                for (int var155 = 0; var155 < field316.length; var155++) {
                    if (field316[var155] != null) {
                        field316[var155].field810 = -1;
                    }
                }
                field324 = -1;
                return true;
            }
            if (field324 == 110) {
                String var156 = field322.method2223();
                long var157 = field322.method2221();
                long var159 = (long) field322.method2395();
                long var161 = (long) field322.method2228();
                class143 var163 = (class143) class101.method648(class143.method1052(), field322.method2211());
                long var164 = (var159 << 32) + var161;
                boolean var166 = false;
                for (int var167 = 0; var167 < 100; var167++) {
                    if (field345[var167] == var164) {
                        var166 = true;
                        break;
                    }
                }
                if (var163.field2162 && method574(var156)) {
                    var166 = true;
                }
                if (!var166 && field399 == 0) {
                    field345[field506] = var164;
                    field506 = (field506 + 1) % 100;
                    String var168 = class214.method3659(class154.method2584(class213.method3602(field322)));
                    if (var163.field2160 == -1) {
                        class11.method1862(9, var156, var168, class153.method621(var157));
                    } else {
                        int var169 = var163.field2160;
                        String var170 = "<img=" + var169 + ">";
                        class11.method1862(9, var170 + var156, var168, class153.method621(var157));
                    }
                }
                field324 = -1;
                return true;
            }
            if (field324 == 211) {
                int var171 = field322.method2211();
                if (field322.method2211() == 0) {
                    field314[var171] = new class211();
                    field322.field1896 += 18;
                } else {
                    field322.field1896--;
                    field314[var171] = new class211(field322, false);
                }
                field477 = field467;
                field324 = -1;
                return true;
            }
            if (field324 == 128) {
                field533 = true;
                Statics.field1806 = field322.method2211();
                Statics.field1938 = field322.method2211();
                Statics.field1066 = field322.method2395();
                Statics.field1045 = field322.method2211();
                Statics.field218 = field322.method2211();
                if (Statics.field218 >= 100) {
                    Statics.field1733 = Statics.field1806 * 128 + 64;
                    Statics.field2823 = Statics.field1938 * 128 + 64;
                    Statics.field991 = method163(Statics.field1733, Statics.field2823, Statics.field599) - Statics.field1066;
                }
                field324 = -1;
                return true;
            }
            if (field324 == 157) {
                int var172 = field322.method2366();
                int var173 = field322.method2395();
                if (var172 < -70000) {
                    var173 += 32768;
                }
                class164 var174;
                if (var172 >= 0) {
                    var174 = class164.method560(var172);
                } else {
                    var174 = null;
                }
                while (field322.field1896 < field323) {
                    int var175 = field322.method2378();
                    int var176 = field322.method2395();
                    int var177 = 0;
                    if (var176 != 0) {
                        var177 = field322.method2211();
                        if (var177 == 255) {
                            var177 = field322.method2366();
                        }
                    }
                    if (var174 != null && var175 >= 0 && var175 < var174.field2694.length) {
                        var174.field2694[var175] = var176;
                        var174.field2673[var175] = var177;
                    }
                    class15.method488(var173, var175, var176 - 1, var177);
                }
                if (var174 != null) {
                    method572(var174);
                }
                method1941();
                field470[++field471 - 1 & 0x1F] = var173 & 0x7FFF;
                field324 = -1;
                return true;
            }
            if (field324 == 21) {
                Statics.field619 = field322.method2211();
                Statics.field594 = field322.method2241();
                while (field322.field1896 < field323) {
                    field324 = field322.method2211();
                    method158();
                }
                field324 = -1;
                return true;
            }
            if (field324 == 185) {
                field321 = field322.method2211();
                if (field321 == 255) {
                    field321 = 0;
                }
                field519 = field322.method2211();
                if (field519 == 255) {
                    field519 = 0;
                }
                field324 = -1;
                return true;
            }
            if (field324 == 204) {
                Statics.field594 = field322.method2241();
                Statics.field619 = field322.method2211();
                for (int var178 = Statics.field594; var178 < Statics.field594 + 8; var178++) {
                    for (int var179 = Statics.field619; var179 < Statics.field619 + 8; var179++) {
                        if (field415[Statics.field599][var178][var179] != null) {
                            field415[Statics.field599][var178][var179] = null;
                            method11(var178, var179);
                        }
                    }
                }
                for (class16 var180 = (class16) field558.method3468(); var180 != null; var180 = (class16) field558.method3470()) {
                    if (var180.field230 >= Statics.field594 && var180.field230 < Statics.field594 + 8 && var180.field231 >= Statics.field619 && var180.field231 < Statics.field619 + 8 && Statics.field599 == var180.field239) {
                        var180.field244 = 0;
                    }
                }
                field324 = -1;
                return true;
            }
            if (field324 == 12) {
                int var181 = field322.method2259();
                int var182 = field322.method2229();
                class164 var183 = class164.method560(var181);
                if (var183.field2693 != var182 || var182 == -1) {
                    var183.field2693 = var182;
                    var183.field2768 = 0;
                    var183.field2769 = 0;
                    method572(var183);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 143) {
                method1941();
                int var184 = field322.method2360();
                int var185 = field322.method2366();
                int var186 = field322.method2241();
                field421[var184] = var185;
                field419[var184] = var186;
                field420[var184] = 1;
                for (int var187 = 0; var187 < 98; var187++) {
                    if (var185 >= class146.field2185[var187]) {
                        field420[var184] = var187 + 2;
                    }
                }
                field472[++field494 - 1 & 0x1F] = var184;
                field324 = -1;
                return true;
            }
            if (field324 == 216) {
                method2826(field322.method2223());
                field324 = -1;
                return true;
            }
            if (field324 == 28) {
                int var188 = field322.method2395();
                int var189 = field322.method2251();
                int var190 = field322.method2321();
                class164 var191 = class164.method560(var190);
                var191.field2702 = (var189 << 16) + var188;
                field324 = -1;
                return true;
            }
            if (field324 == 52) {
                int var192 = field322.method2252();
                int var193 = field322.method2389();
                int var194 = field322.method2321();
                class164 var195 = class164.method560(var194);
                if (var195.field2657 != var192 || var195.field2658 != var193 || var195.field2779 != 0 || var195.field2654 != 0) {
                    var195.field2657 = var192;
                    var195.field2658 = var193;
                    var195.field2779 = 0;
                    var195.field2654 = 0;
                    method572(var195);
                    method666(var195);
                    if (var195.field2650 == 0) {
                        method3375(Statics.field2764[var194 >> 16], var195, false);
                    }
                }
                field324 = -1;
                return true;
            }
            if (field324 == 30) {
                int var196 = field322.method2366();
                int var197 = field322.method2395();
                if (var196 < -70000) {
                    var197 += 32768;
                }
                class164 var198;
                if (var196 >= 0) {
                    var198 = class164.method560(var196);
                } else {
                    var198 = null;
                }
                if (var198 != null) {
                    for (int var199 = 0; var199 < var198.field2694.length; var199++) {
                        var198.field2694[var199] = 0;
                        var198.field2673[var199] = 0;
                    }
                }
                class15 var200 = (class15) class15.field227.method3425((long) var197);
                if (var200 != null) {
                    for (int var201 = 0; var201 < var200.field224.length; var201++) {
                        var200.field224[var201] = -1;
                        var200.field222[var201] = 0;
                    }
                }
                int var202 = field322.method2395();
                for (int var203 = 0; var203 < var202; var203++) {
                    int var204 = field322.method2241();
                    if (var204 == 255) {
                        var204 = field322.method2259();
                    }
                    int var205 = field322.method2251();
                    if (var198 != null && var203 < var198.field2694.length) {
                        var198.field2694[var203] = var205;
                        var198.field2673[var203] = var204;
                    }
                    class15.method488(var197, var203, var205 - 1, var204);
                }
                if (var198 != null) {
                    method572(var198);
                }
                method1941();
                field470[++field471 - 1 & 0x1F] = var197 & 0x7FFF;
                field324 = -1;
                return true;
            }
            if (field324 == 175) {
                String var206 = field322.method2223();
                long var207 = (long) field322.method2395();
                long var209 = (long) field322.method2228();
                class143 var211 = (class143) class101.method648(class143.method1052(), field322.method2211());
                long var212 = (var207 << 32) + var209;
                boolean var214 = false;
                for (int var215 = 0; var215 < 100; var215++) {
                    if (field345[var215] == var212) {
                        var214 = true;
                        break;
                    }
                }
                if (method574(var206)) {
                    var214 = true;
                }
                if (!var214 && field399 == 0) {
                    field345[field506] = var212;
                    field506 = (field506 + 1) % 100;
                    String var216 = class214.method3659(class154.method2584(class213.method3602(field322)));
                    byte var217;
                    if (var211.field2154) {
                        var217 = 7;
                    } else {
                        var217 = 3;
                    }
                    if (var211.field2160 == -1) {
                        class11.method2846(var217, var206, var216);
                    } else {
                        int var219 = var211.field2160;
                        String var220 = "<img=" + var219 + ">";
                        class11.method2846(var217, var220 + var206, var216);
                    }
                }
                field324 = -1;
                return true;
            }
            if (field324 == 70) {
                int var221 = field322.method2251();
                if (var221 == 65535) {
                    var221 = -1;
                }
                int var222 = field322.method2259();
                int var223 = field322.method2366();
                int var224 = field322.method2249();
                if (var224 == 65535) {
                    var224 = -1;
                }
                for (int var225 = var221; var225 <= var224; var225++) {
                    long var226 = ((long) var222 << 32) + (long) var225;
                    class199 var228 = field309.method3425(var226);
                    if (var228 != null) {
                        var228.method3554();
                    }
                    field309.method3426(new class192(var223), var226);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 214) {
                Statics.method1();
                field324 = -1;
                return false;
            }
            if (field324 == 148) {
                int var229 = field322.method2251();
                int var230 = field322.method2260();
                class164 var231 = class164.method560(var230);
                if (var231 != null && var231.field2650 == 0) {
                    if (var229 > var231.field2672 - var231.field2765) {
                        var229 = var231.field2672 - var231.field2765;
                    }
                    if (var229 < 0) {
                        var229 = 0;
                    }
                    if (var231.field2739 != var229) {
                        var231.field2739 = var229;
                        method572(var231);
                    }
                }
                field324 = -1;
                return true;
            }
            if (field324 == 98) {
                field408 = 0;
                field403 = 0;
                field322.method2457();
                int var232 = field322.method2459(1);
                if (var232 != 0) {
                    int var233 = field322.method2459(2);
                    if (var233 == 0) {
                        field508[++field403 - 1] = 2047;
                    } else if (var233 == 1) {
                        int var234 = field322.method2459(3);
                        Statics.field1994.method635(var234, false);
                        int var235 = field322.method2459(1);
                        if (var235 == 1) {
                            field508[++field403 - 1] = 2047;
                        }
                    } else if (var233 == 2) {
                        int var236 = field322.method2459(3);
                        Statics.field1994.method635(var236, true);
                        int var237 = field322.method2459(3);
                        Statics.field1994.method635(var237, true);
                        int var238 = field322.method2459(1);
                        if (var238 == 1) {
                            field508[++field403 - 1] = 2047;
                        }
                    } else if (var233 == 3) {
                        int var239 = field322.method2459(7);
                        int var240 = field322.method2459(1);
                        Statics.field599 = field322.method2459(2);
                        int var241 = field322.method2459(7);
                        int var242 = field322.method2459(1);
                        if (var242 == 1) {
                            field508[++field403 - 1] = 2047;
                        }
                        Statics.field1994.method634(var241, var239, var240 == 1);
                    }
                }
                method107();
                method2790();
                method3377();
                for (int var243 = 0; var243 < field408; var243++) {
                    int var244 = field511[var243];
                    if (field289 != field400[var244].field827) {
                        field400[var244] = null;
                    }
                }
                if (field323 != field322.field1896) {
                    throw new RuntimeException(field322.field1896 + class2.field21 + field323);
                }
                for (int var245 = 0; var245 < field401; var245++) {
                    if (field400[field357[var245]] == null) {
                        throw new RuntimeException(var245 + class2.field21 + field401);
                    }
                }
                field324 = -1;
                return true;
            }
            if (field324 == 97) {
                int var246 = field322.method2249();
                if (var246 == 65535) {
                    var246 = -1;
                }
                int var247 = field322.method2259();
                int var248 = field322.method2321();
                class164 var249 = class164.method560(var248);
                if (var249.field2647) {
                    var249.field2667 = var246;
                    var249.field2743 = var247;
                    class47 var251 = class47.method2845(var246);
                    var249.field2706 = var251.field1084;
                    var249.field2698 = var251.field1071;
                    var249.field2670 = var251.field1086;
                    var249.field2718 = var251.field1087;
                    var249.field2696 = var251.field1101;
                    var249.field2700 = var251.field1083;
                    if (var251.field1092 == 1) {
                        var249.field2641 = 1;
                    } else {
                        var249.field2641 = 2;
                    }
                    if (var249.field2723 > 0) {
                        var249.field2700 = var249.field2700 * 32 / var249.field2723;
                    } else if (var249.field2659 > 0) {
                        var249.field2700 = var249.field2700 * 32 / var249.field2659;
                    }
                    method572(var249);
                } else if (var246 == -1) {
                    var249.field2689 = 0;
                    field324 = -1;
                    return true;
                } else {
                    class47 var250 = class47.method2845(var246);
                    var249.field2689 = 4;
                    var249.field2690 = var246;
                    var249.field2706 = var250.field1084;
                    var249.field2698 = var250.field1071;
                    var249.field2700 = var250.field1083 * 100 / var247;
                    method572(var249);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 222) {
                int var252 = field322.method2251();
                byte var253 = field322.method2244();
                class167.field2799[var252] = var253;
                if (class167.field2796[var252] != var253) {
                    class167.field2796[var252] = var253;
                    method2484(var252);
                }
                field461[++field481 - 1 & 0x1F] = var252;
                field324 = -1;
                return true;
            }
            if (field324 == 130) {
                int var254 = field322.method2395();
                if (var254 == 65535) {
                    var254 = -1;
                }
                if (var254 == -1 && !field524) {
                    Statics.field2540.method3252();
                    class174.field2843 = 1;
                    Statics.field2847 = null;
                } else if (var254 != -1 && field523 != var254 && field522 != 0 && !field524) {
                    class174.method2054(2, Statics.field259, var254, 0, field522, false);
                }
                field523 = var254;
                field324 = -1;
                return true;
            }
            if (field324 == 61) {
                int var255 = field322.method2251();
                if (var255 == 65535) {
                    var255 = -1;
                }
                int var256 = field322.method2255();
                if (field522 != 0 && var255 != -1) {
                    class174.method2851(Statics.field885, var255, 0, field522, false);
                    field524 = true;
                }
                field324 = -1;
                return true;
            }
            if (field324 == 54) {
                field562 = field322.method2211();
                field324 = -1;
                return true;
            }
            if (field324 == 29) {
                String var257 = field322.method2223();
                Object[] var258 = new Object[var257.length() + 1];
                for (int var259 = var257.length() - 1; var259 >= 0; var259--) {
                    if (var257.charAt(var259) == 's') {
                        var258[var259 + 1] = field322.method2223();
                    } else {
                        var258[var259 + 1] = Integer.valueOf(field322.method2366());
                    }
                }
                var258[0] = Integer.valueOf(field322.method2366());
                class1 var260 = new class1();
                var260.field16 = var258;
                class34.method97(var260);
                field324 = -1;
                return true;
            }
            if (field324 == 156) {
                Statics.field594 = field322.method2211();
                Statics.field619 = field322.method2241();
                field324 = -1;
                return true;
            }
            if (field324 == 48) {
                int var261 = field322.method2211();
                int var262 = field322.method2211();
                int var263 = field322.method2211();
                int var264 = field322.method2211();
                field439[var261] = true;
                field536[var261] = var262;
                field280[var261] = var263;
                field435[var261] = var264;
                field425[var261] = 0;
                field324 = -1;
                return true;
            }
            if (field324 == 87) {
                class24 var265 = new class24();
                var265.field631 = field322.method2223();
                var265.field632 = field322.method2395();
                int var266 = field322.method2366();
                var265.field629 = var266;
                method46(45);
                Statics.field2560.method2685();
                Statics.field2560 = null;
                class30.method2041(var265);
                field324 = -1;
                return false;
            }
            if (field324 == 210) {
                if (field442 != -1) {
                    method934(field442, 0);
                }
                field324 = -1;
                return true;
            }
            if (field324 == 131) {
                int var267 = field322.method2241();
                String var268 = field322.method2223();
                int var269 = field322.method2360();
                if (var269 >= 1 && var269 <= 8) {
                    if (var268.equalsIgnoreCase("null")) {
                        var268 = null;
                    }
                    field291[var269 - 1] = var268;
                    field552[var269 - 1] = var267 == 0;
                }
                field324 = -1;
                return true;
            }
            if (field324 == 24) {
                int var270 = field323 + field322.field1896;
                int var271 = field322.method2395();
                int var272 = field322.method2395();
                if (field442 != var271) {
                    field442 = var271;
                    method153(field442, Statics.field1408, Statics.field1949, false);
                    method2150(field442);
                    class34.method122(field442);
                    for (int var273 = 0; var273 < 100; var273++) {
                        field489[var273] = true;
                    }
                }
                while (var272-- > 0) {
                    int var274 = field322.method2366();
                    int var275 = field322.method2395();
                    int var276 = field322.method2211();
                    class4 var277 = (class4) field443.method3425((long) var274);
                    if (var277 != null && var277.field72 != var275) {
                        method2854(var277, true);
                        var277 = null;
                    }
                    if (var277 == null) {
                        var277 = method853(var274, var275, var276);
                    }
                    var277.field66 = true;
                }
                for (class4 var278 = (class4) field443.method3428(); var278 != null; var278 = (class4) field443.method3432()) {
                    if (var278.field66) {
                        var278.field66 = false;
                    } else {
                        method2854(var278, true);
                    }
                }
                field309 = new class187(512);
                while (field322.field1896 < var270) {
                    int var279 = field322.method2366();
                    int var280 = field322.method2395();
                    int var281 = field322.method2395();
                    int var282 = field322.method2366();
                    for (int var283 = var280; var283 <= var281; var283++) {
                        long var284 = ((long) var279 << 32) + (long) var283;
                        field309.method3426(new class192(var282), var284);
                    }
                }
                field324 = -1;
                return true;
            }
            class140.method2829("" + field324 + class2.field21 + field551 + class2.field21 + field330 + class2.field21 + field323, (Throwable) null);
            Statics.method1();
        } catch (IOException var295) {
            if (field486 > 0) {
                Statics.method1();
            } else {
                method46(40);
                Statics.field2603 = Statics.field2560;
                Statics.field2560 = null;
            }
        } catch (Exception var296) {
            String var288 = "" + field324 + class2.field21 + field551 + class2.field21 + field330 + class2.field21 + field323 + class2.field21 + (Statics.field2594 + Statics.field1994.field833[0]) + class2.field21 + (Statics.field954 + Statics.field1994.field794[0]) + class2.field21;
            for (int var289 = 0; var289 < field323 && var289 < 50; var289++) {
                var288 = var288 + field322.field1904[var289] + class2.field21;
            }
            class140.method2829(var288, var296);
            Statics.method1();
        }
        return true;
    }

    @ObfuscatedName("o.bm(I)V")
    public static final void method158() {
        if (field324 == 149) {
            int var0 = field322.method2242();
            int var1 = (var0 >> 4 & 0x7) + Statics.field594;
            int var2 = (var0 & 0x7) + Statics.field619;
            int var3 = field322.method2249();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class190 var4 = field415[Statics.field599][var1][var2];
                if (var4 != null) {
                    for (class27 var5 = (class27) var4.method3468(); var5 != null; var5 = (class27) var4.method3470()) {
                        if ((var3 & 0x7FFF) == var5.field671) {
                            var5.method3554();
                            break;
                        }
                    }
                    if (var4.method3468() == null) {
                        field415[Statics.field599][var1][var2] = null;
                    }
                    method11(var1, var2);
                }
            }
        } else if (field324 == 106) {
            int var6 = field322.method2211();
            int var7 = (var6 >> 4 & 0x7) + Statics.field594;
            int var8 = (var6 & 0x7) + Statics.field619;
            int var9 = field322.method2395();
            int var10 = field322.method2395();
            int var11 = field322.method2395();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class190 var12 = field415[Statics.field599][var7][var8];
                if (var12 != null) {
                    for (class27 var13 = (class27) var12.method3468(); var13 != null; var13 = (class27) var12.method3470()) {
                        if ((var9 & 0x7FFF) == var13.field671 && var13.field668 == var10) {
                            var13.field668 = var11;
                            break;
                        }
                    }
                    method11(var7, var8);
                }
            }
        } else if (field324 == 107) {
            int var14 = field322.method2211();
            int var15 = (var14 >> 4 & 0x7) + Statics.field594;
            int var16 = (var14 & 0x7) + Statics.field619;
            int var17 = var15 + field322.method2217();
            int var18 = var16 + field322.method2217();
            int var19 = field322.method2389();
            int var20 = field322.method2395();
            int var21 = field322.method2211() * 4;
            int var22 = field322.method2211() * 4;
            int var23 = field322.method2395();
            int var24 = field322.method2395();
            int var25 = field322.method2211();
            int var26 = field322.method2211();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104 && var20 != 65535) {
                int var27 = var15 * 128 + 64;
                int var28 = var16 * 128 + 64;
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                class7 var31 = new class7(var20, Statics.field599, var27, var28, method163(var27, var28, Statics.field599) - var21, field289 + var23, field289 + var24, var25, var26, var19, var22);
                var31.method87(var29, var30, method163(var29, var30, Statics.field599) - var22, field289 + var23);
                field417.method3463(var31);
            }
        } else if (field324 == 226) {
            int var32 = field322.method2211();
            int var33 = var32 >> 2;
            int var34 = var32 & 0x3;
            int var35 = field341[var33];
            int var36 = field322.method2211();
            int var37 = (var36 >> 4 & 0x7) + Statics.field594;
            int var38 = (var36 & 0x7) + Statics.field619;
            int var39 = field322.method2249();
            if (var37 >= 0 && var38 >= 0 && var37 < 103 && var38 < 103) {
                if (var35 == 0) {
                    class82 var40 = Statics.field684.method1715(Statics.field599, var37, var38);
                    if (var40 != null) {
                        int var41 = var40.field1480 >> 14 & 0x7FFF;
                        if (var33 == 2) {
                            var40.field1473 = new class12(var41, 2, var34 + 4, Statics.field599, var37, var38, var39, false, var40.field1473);
                            var40.field1479 = new class12(var41, 2, var34 + 1 & 0x3, Statics.field599, var37, var38, var39, false, var40.field1479);
                        } else {
                            var40.field1473 = new class12(var41, var33, var34, Statics.field599, var37, var38, var39, false, var40.field1473);
                        }
                    }
                }
                if (var35 == 1) {
                    class89 var42 = Statics.field684.method1769(Statics.field599, var37, var38);
                    if (var42 != null) {
                        int var43 = var42.field1558 >> 14 & 0x7FFF;
                        if (var33 == 4 || var33 == 5) {
                            var42.field1556 = new class12(var43, 4, var34, Statics.field599, var37, var38, var39, false, var42.field1556);
                        } else if (var33 == 6) {
                            var42.field1556 = new class12(var43, 4, var34 + 4, Statics.field599, var37, var38, var39, false, var42.field1556);
                        } else if (var33 == 7) {
                            var42.field1556 = new class12(var43, 4, (var34 + 2 & 0x3) + 4, Statics.field599, var37, var38, var39, false, var42.field1556);
                        } else if (var33 == 8) {
                            var42.field1556 = new class12(var43, 4, var34 + 4, Statics.field599, var37, var38, var39, false, var42.field1556);
                            var42.field1557 = new class12(var43, 4, (var34 + 2 & 0x3) + 4, Statics.field599, var37, var38, var39, false, var42.field1557);
                        }
                    }
                }
                if (var35 == 2) {
                    class93 var44 = Statics.field684.method1717(Statics.field599, var37, var38);
                    if (var33 == 11) {
                        var33 = 10;
                    }
                    if (var44 != null) {
                        var44.field1609 = new class12(var44.field1617 >> 14 & 0x7FFF, var33, var34, Statics.field599, var37, var38, var39, false, var44.field1609);
                    }
                }
                if (var35 == 3) {
                    class88 var45 = Statics.field684.method1724(Statics.field599, var37, var38);
                    if (var45 != null) {
                        var45.field1544 = new class12(var45.field1545 >> 14 & 0x7FFF, 22, var34, Statics.field599, var37, var38, var39, false, var45.field1544);
                    }
                }
            }
        } else {
            if (field324 == 213) {
                int var46 = field322.method2211();
                int var47 = (var46 >> 4 & 0x7) + Statics.field594;
                int var48 = (var46 & 0x7) + Statics.field619;
                int var49 = field322.method2395();
                int var50 = field322.method2211();
                int var51 = var50 >> 4 & 0xF;
                int var52 = var50 & 0x7;
                int var53 = field322.method2211();
                if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                    int var54 = var51 + 1;
                    if (Statics.field1994.field833[0] >= var47 - var54 && Statics.field1994.field833[0] <= var47 + var54 && Statics.field1994.field794[0] >= var48 - var54 && Statics.field1994.field794[0] <= var48 + var54 && field526 != 0 && var52 > 0 && field527 < 50) {
                        field462[field527] = var49;
                        field529[field527] = var52;
                        field565[field527] = var53;
                        field437[field527] = null;
                        field488[field527] = (var47 << 16) + (var48 << 8) + var51;
                        field527++;
                    }
                }
            }
            if (field324 == 224) {
                int var55 = field322.method2360();
                int var56 = var55 >> 2;
                int var57 = var55 & 0x3;
                int var58 = field341[var56];
                int var59 = field322.method2211();
                int var60 = (var59 >> 4 & 0x7) + Statics.field594;
                int var61 = (var59 & 0x7) + Statics.field619;
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                    method3376(Statics.field599, var60, var61, var58, -1, var56, var57, 0, -1);
                }
            } else {
                if (field324 == 239) {
                    int var62 = field322.method2211();
                    int var63 = (var62 >> 4 & 0x7) + Statics.field594;
                    int var64 = (var62 & 0x7) + Statics.field619;
                    int var65 = field322.method2242();
                    int var66 = var65 >> 2;
                    int var67 = var65 & 0x3;
                    int var68 = field341[var66];
                    int var69 = field322.method2250();
                    int var70 = field322.method2395();
                    byte var71 = field322.method2217();
                    int var72 = field322.method2395();
                    byte var73 = field322.method2244();
                    byte var74 = field322.method2263();
                    int var75 = field322.method2249();
                    byte var76 = field322.method2217();
                    class3 var77;
                    if (field406 == var72) {
                        var77 = Statics.field1994;
                    } else {
                        var77 = field400[var72];
                    }
                    if (var77 != null) {
                        class38 var78 = class38.method879(var75);
                        int var79;
                        int var80;
                        if (var67 == 1 || var67 == 3) {
                            var79 = var78.field905;
                            var80 = var78.field904;
                        } else {
                            var79 = var78.field904;
                            var80 = var78.field905;
                        }
                        int var81 = (var79 >> 1) + var63;
                        int var82 = (var79 + 1 >> 1) + var63;
                        int var83 = (var80 >> 1) + var64;
                        int var84 = (var80 + 1 >> 1) + var64;
                        int[][] var85 = class6.field95[Statics.field599];
                        int var86 = var85[var81][var83] + var85[var82][var83] + var85[var81][var84] + var85[var82][var84] >> 2;
                        int var87 = (var63 << 7) + (var79 << 6);
                        int var88 = (var64 << 7) + (var80 << 6);
                        class100 var89 = var78.method689(var66, var67, var85, var87, var86, var88);
                        if (var89 != null) {
                            method3376(Statics.field599, var63, var64, var68, -1, 0, 0, var69 + 1, var70 + 1);
                            var77.field57 = field289 + var69;
                            var77.field48 = field289 + var70;
                            var77.field52 = var89;
                            var77.field40 = var63 * 128 + var79 * 64;
                            var77.field56 = var64 * 128 + var80 * 64;
                            var77.field50 = var86;
                            if (var71 > var73) {
                                byte var90 = var71;
                                var71 = var73;
                                var73 = var90;
                            }
                            if (var76 > var74) {
                                byte var91 = var76;
                                var76 = var74;
                                var74 = var91;
                            }
                            var77.field53 = var63 + var71;
                            var77.field55 = var63 + var73;
                            var77.field54 = var64 + var76;
                            var77.field41 = var64 + var74;
                        }
                    }
                }
                if (field324 == 115) {
                    int var92 = field322.method2242();
                    int var93 = (var92 >> 4 & 0x7) + Statics.field594;
                    int var94 = (var92 & 0x7) + Statics.field619;
                    int var95 = field322.method2250();
                    int var96 = field322.method2242();
                    int var97 = var96 >> 2;
                    int var98 = var96 & 0x3;
                    int var99 = field341[var97];
                    if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                        method3376(Statics.field599, var93, var94, var99, var95, var97, var98, 0, -1);
                    }
                } else if (field324 == 196) {
                    int var100 = field322.method2395();
                    int var101 = field322.method2249();
                    int var102 = field322.method2242();
                    int var103 = (var102 >> 4 & 0x7) + Statics.field594;
                    int var104 = (var102 & 0x7) + Statics.field619;
                    if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                        class27 var105 = new class27();
                        var105.field671 = var100;
                        var105.field668 = var101;
                        if (field415[Statics.field599][var103][var104] == null) {
                            field415[Statics.field599][var103][var104] = new class190();
                        }
                        field415[Statics.field599][var103][var104].method3463(var105);
                        method11(var103, var104);
                    }
                } else if (field324 == 63) {
                    int var106 = field322.method2211();
                    int var107 = (var106 >> 4 & 0x7) + Statics.field594;
                    int var108 = (var106 & 0x7) + Statics.field619;
                    int var109 = field322.method2395();
                    int var110 = field322.method2211();
                    int var111 = field322.method2395();
                    if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                        int var112 = var107 * 128 + 64;
                        int var113 = var108 * 128 + 64;
                        class28 var114 = new class28(var109, Statics.field599, var112, var113, method163(var112, var113, Statics.field599) - var110, var111, field289);
                        field418.method3463(var114);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.br(IIIIIIIIII)V")
    public static final void method3376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field558.method3468(); var10 != null; var10 = (class16) field558.method3470()) {
            if (var10.field239 == arg0 && var10.field230 == arg1 && var10.field231 == arg2 && var10.field229 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field239 = arg0;
            var9.field229 = arg3;
            var9.field230 = arg1;
            var9.field231 = arg2;
            method649(var9);
            field558.method3463(var9);
        }
        var9.field235 = arg4;
        var9.field237 = arg5;
        var9.field236 = arg6;
        var9.field238 = arg7;
        var9.field244 = arg8;
    }

    @ObfuscatedName("ax.bo(Lo;I)V")
    public static final void method649(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field229 == 0) {
            var1 = Statics.field684.method1719(arg0.field239, arg0.field230, arg0.field231);
        }
        if (arg0.field229 == 1) {
            var1 = Statics.field684.method1720(arg0.field239, arg0.field230, arg0.field231);
        }
        if (arg0.field229 == 2) {
            var1 = Statics.field684.method1721(arg0.field239, arg0.field230, arg0.field231);
        }
        if (arg0.field229 == 3) {
            var1 = Statics.field684.method1763(arg0.field239, arg0.field230, arg0.field231);
        }
        if (var1 != 0) {
            int var5 = Statics.field684.method1703(arg0.field239, arg0.field230, arg0.field231, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field232 = var2;
        arg0.field234 = var3;
        arg0.field243 = var4;
    }

    @ObfuscatedName("dn.bt(IIIIIIII)V")
    public static final void method2156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field285 && Statics.field599 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field684.method1719(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field684.method1720(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field684.method1721(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field684.method1763(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field684.method1703(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field684.method1712(arg0, arg2, arg3);
                class38 var15 = class38.method879(var12);
                if (var15.field934 != 0) {
                    field338[arg0].method3806(arg2, arg3, var13, var14, var15.field936);
                }
            }
            if (arg1 == 1) {
                Statics.field684.method1711(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field684.method1799(arg0, arg2, arg3);
                class38 var16 = class38.method879(var12);
                if (var16.field904 + arg2 > 103 || var16.field904 + arg3 > 103 || var16.field905 + arg2 > 103 || var16.field905 + arg3 > 103) {
                    return;
                }
                if (var16.field934 != 0) {
                    field338[arg0].method3807(arg2, arg3, var16.field904, var16.field905, var14, var16.field936);
                }
            }
            if (arg1 == 3) {
                Statics.field684.method1796(arg0, arg2, arg3);
                class38 var17 = class38.method879(var12);
                if (var17.field934 == 1) {
                    field338[arg0].method3816(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field83[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method90(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field684, field338[arg0]);
    }

    @ObfuscatedName("g.be(III)V")
    public static final void method11(int arg0, int arg1) {
        class190 var2 = field415[Statics.field599][arg0][arg1];
        if (var2 == null) {
            Statics.field684.method1714(Statics.field599, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class27 var5 = null;
        for (class27 var6 = (class27) var2.method3468(); var6 != null; var6 = (class27) var2.method3470()) {
            class47 var7 = class47.method2845(var6.field671);
            long var8 = (long) var7.field1090;
            if (var7.field1092 == 1) {
                var8 = (long) (var6.field668 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field684.method1714(Statics.field599, arg0, arg1);
            return;
        }
        var2.method3464(var5);
        class27 var10 = null;
        class27 var11 = null;
        for (class27 var12 = (class27) var2.method3468(); var12 != null; var12 = (class27) var2.method3470()) {
            if (var5.field671 != var12.field671) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field671 != var12.field671 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field684.method1700(Statics.field599, arg0, arg1, method163(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field599), var5, var13, var10, var11);
    }

    @ObfuscatedName("t.bh(S)V")
    public static final void method107() {
        int var0 = field322.method2459(8);
        if (var0 < field401) {
            for (int var1 = var0; var1 < field401; var1++) {
                field511[++field408 - 1] = field357[var1];
            }
        }
        if (var0 > field401) {
            throw new RuntimeException("");
        }
        field401 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field357[var2];
            class3 var4 = field400[var3];
            int var5 = field322.method2459(1);
            if (var5 == 0) {
                field357[++field401 - 1] = var3;
                var4.field827 = field289;
            } else {
                int var6 = field322.method2459(2);
                if (var6 == 0) {
                    field357[++field401 - 1] = var3;
                    var4.field827 = field289;
                    field508[++field403 - 1] = var3;
                } else if (var6 == 1) {
                    field357[++field401 - 1] = var3;
                    var4.field827 = field289;
                    int var7 = field322.method2459(3);
                    var4.method635(var7, false);
                    int var8 = field322.method2459(1);
                    if (var8 == 1) {
                        field508[++field403 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field357[++field401 - 1] = var3;
                    var4.field827 = field289;
                    int var9 = field322.method2459(3);
                    var4.method635(var9, true);
                    int var10 = field322.method2459(3);
                    var4.method635(var10, true);
                    int var11 = field322.method2459(1);
                    if (var11 == 1) {
                        field508[++field403 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field511[++field408 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("eh.bb(S)V")
    public static final void method2790() {
        while (true) {
            if (field322.method2450(field323) >= 11) {
                int var0 = field322.method2459(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field400[var0] == null) {
                        field400[var0] = new class3();
                        if (field405[var0] != null) {
                            field400[var0].method16(field405[var0]);
                        }
                        var1 = true;
                    }
                    field357[++field401 - 1] = var0;
                    class3 var2 = field400[var0];
                    var2.field827 = field289;
                    int var3 = field322.method2459(1);
                    int var4 = field322.method2459(1);
                    if (var4 == 1) {
                        field508[++field403 - 1] = var0;
                    }
                    int var5 = field322.method2459(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field413[field322.method2459(3)];
                    if (var1) {
                        var2.field790 = var2.field789 = var6;
                    }
                    int var7 = field322.method2459(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method634(Statics.field1994.field833[0] + var7, Statics.field1994.field794[0] + var5, var3 == 1);
                    continue;
                }
            }
            field322.method2449();
            return;
        }
    }

    @ObfuscatedName("fh.bd(S)V")
    public static final void method3377() {
        for (int var0 = 0; var0 < field403; var0++) {
            int var1 = field508[var0];
            class3 var2 = field400[var1];
            int var3 = field322.method2211();
            if ((var3 & 0x1) != 0) {
                var3 += field322.method2211() << 8;
            }
            method556(var1, var2, var3);
        }
    }

    @ObfuscatedName("aj.bc(ILa;IB)V")
    public static final void method556(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x80) != 0) {
            arg1.field805 = field322.method2251();
            arg1.field822 = field322.method2395();
        }
        if ((arg2 & 0x8) != 0) {
            int var3 = field322.method2249();
            if (var3 == 65535) {
                var3 = -1;
            }
            int var4 = field322.method2242();
            method575(arg1, var3, var4);
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field836 = field322.method2223();
            if (arg1.field836.charAt(0) == '~') {
                arg1.field836 = arg1.field836.substring(1);
                class11.method2846(2, arg1.field60, arg1.field836);
            } else if (Statics.field1994 == arg1) {
                class11.method2846(2, arg1.field60, arg1.field836);
            }
            arg1.field793 = false;
            arg1.field838 = 0;
            arg1.field797 = 0;
            arg1.field795 = 150;
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field815 = field322.method2251();
            int var5 = field322.method2259();
            arg1.field806 = var5 >> 16;
            arg1.field818 = (var5 & 0xFFFF) + field289;
            arg1.field834 = 0;
            arg1.field817 = 0;
            if (arg1.field818 > field289) {
                arg1.field834 = -1;
            }
            if (arg1.field815 == 65535) {
                arg1.field815 = -1;
            }
        }
        if ((arg2 & 0x200) != 0) {
            int var6 = field322.method2395();
            int var7 = field322.method2211();
            arg1.method637(var6, var7, field289);
            arg1.field801 = field289 + 300;
            arg1.field802 = field322.method2211();
            arg1.field803 = field322.method2211();
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field804 = field322.method2395();
            if (arg1.field804 == 65535) {
                arg1.field804 = -1;
            }
        }
        if ((arg2 & 0x10) != 0) {
            int var8 = field322.method2251();
            class143 var9 = (class143) class101.method648(class143.method1052(), field322.method2211());
            boolean var10 = field322.method2241() == 1;
            int var11 = field322.method2360();
            int var12 = field322.field1896;
            if (arg1.field60 != null && arg1.field47 != null) {
                boolean var13 = false;
                if (var9.field2162 && method574(arg1.field60)) {
                    var13 = true;
                }
                if (!var13 && field399 == 0 && !arg1.field63) {
                    field305.field1896 = 0;
                    field322.method2226(field305.field1904, 0, var11);
                    field305.field1896 = 0;
                    String var14 = class214.method3659(class154.method2584(class213.method3602(field305)));
                    arg1.field836 = var14.trim();
                    arg1.field838 = var8 >> 8;
                    arg1.field797 = var8 & 0xFF;
                    arg1.field795 = 150;
                    arg1.field793 = var10;
                    arg1.field792 = Statics.field1994 != arg1 && var9.field2162 && field540 != "" && var14.toLowerCase().indexOf(field540) == -1;
                    int var15;
                    if (var9.field2154) {
                        var15 = var10 ? 91 : 1;
                    } else {
                        var15 = var10 ? 90 : 2;
                    }
                    if (var9.field2160 == -1) {
                        class11.method2846(var15, arg1.field60, var14);
                    } else {
                        int var17 = var9.field2160;
                        String var18 = "<img=" + var17 + ">";
                        class11.method2846(var15, var18 + arg1.field60, var14);
                    }
                }
            }
            field322.field1896 = var11 + var12;
        }
        if ((arg2 & 0x4) != 0) {
            int var19 = field322.method2250();
            int var20 = field322.method2360();
            arg1.method637(var19, var20, field289);
            arg1.field801 = field289 + 300;
            arg1.field802 = field322.method2360();
            arg1.field803 = field322.method2241();
        }
        if ((arg2 & 0x20) != 0) {
            int var21 = field322.method2211();
            byte[] var22 = new byte[var21];
            class111 var23 = new class111(var22);
            field322.method2226(var22, 0, var21);
            field405[arg0] = var23;
            arg1.method16(var23);
        }
        if ((arg2 & 0x400) == 0) {
            return;
        }
        arg1.field820 = field322.method2360();
        arg1.field819 = field322.method2242();
        arg1.field821 = field322.method2211();
        arg1.field816 = field322.method2360();
        arg1.field824 = field322.method2251() + field289;
        arg1.field825 = field322.method2395() + field289;
        arg1.field826 = field322.method2241();
        arg1.field832 = 1;
        arg1.field837 = 0;
    }

    @ObfuscatedName("ck.bx(ZI)V")
    public static final void method1863(boolean arg0) {
        field408 = 0;
        field403 = 0;
        field322.method2457();
        int var1 = field322.method2459(8);
        if (var1 < field317) {
            for (int var2 = var1; var2 < field317; var2++) {
                field511[++field408 - 1] = field318[var2];
            }
        }
        if (var1 > field317) {
            throw new RuntimeException("");
        }
        field317 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field318[var3];
            class32 var5 = field316[var4];
            int var6 = field322.method2459(1);
            if (var6 == 0) {
                field318[++field317 - 1] = var4;
                var5.field827 = field289;
            } else {
                int var7 = field322.method2459(2);
                if (var7 == 0) {
                    field318[++field317 - 1] = var4;
                    var5.field827 = field289;
                    field508[++field403 - 1] = var4;
                } else if (var7 == 1) {
                    field318[++field317 - 1] = var4;
                    var5.field827 = field289;
                    int var8 = field322.method2459(3);
                    var5.method635(var8, false);
                    int var9 = field322.method2459(1);
                    if (var9 == 1) {
                        field508[++field403 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field318[++field317 - 1] = var4;
                    var5.field827 = field289;
                    int var10 = field322.method2459(3);
                    var5.method635(var10, true);
                    int var11 = field322.method2459(3);
                    var5.method635(var11, true);
                    int var12 = field322.method2459(1);
                    if (var12 == 1) {
                        field508[++field403 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field511[++field408 - 1] = var4;
                }
            }
        }
        while (field322.method2450(field323) >= 27) {
            int var13 = field322.method2459(15);
            if (var13 == 32767) {
                break;
            }
            boolean var29 = false;
            if (field316[var13] == null) {
                field316[var13] = new class32();
                var29 = true;
            }
            class32 var30 = field316[var13];
            field318[++field317 - 1] = var13;
            var30.field827 = field289;
            int var31 = field322.method2459(1);
            if (var31 == 1) {
                field508[++field403 - 1] = var13;
            }
            int var32;
            if (arg0) {
                var32 = field322.method2459(8);
                if (var32 > 127) {
                    var32 -= 256;
                }
            } else {
                var32 = field322.method2459(5);
                if (var32 > 15) {
                    var32 -= 32;
                }
            }
            int var33 = field413[field322.method2459(3)];
            if (var29) {
                var30.field790 = var30.field789 = var33;
            }
            int var34 = field322.method2459(1);
            var30.field749 = class37.method502(field322.method2459(14));
            int var35;
            if (arg0) {
                var35 = field322.method2459(8);
                if (var35 > 127) {
                    var35 -= 256;
                }
            } else {
                var35 = field322.method2459(5);
                if (var35 > 15) {
                    var35 -= 32;
                }
            }
            var30.field783 = var30.field749.field853;
            var30.field829 = var30.field749.field875;
            if (var30.field829 == 0) {
                var30.field789 = 0;
            }
            var30.field787 = var30.field749.field859;
            var30.field796 = var30.field749.field883;
            var30.field785 = var30.field749.field861;
            var30.field788 = var30.field749.field862;
            var30.field784 = var30.field749.field856;
            var30.field779 = var30.field749.field857;
            var30.field786 = var30.field749.field884;
            var30.method634(Statics.field1994.field833[0] + var32, Statics.field1994.field794[0] + var35, var34 == 1);
        }
        field322.method2449();
        for (int var14 = 0; var14 < field403; var14++) {
            int var15 = field508[var14];
            class32 var16 = field316[var15];
            int var17 = field322.method2211();
            if ((var17 & 0x8) != 0) {
                int var18 = field322.method2395();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field322.method2241();
                if (var16.field810 == var18 && var18 != -1) {
                    int var20 = class40.method2146(var18).field972;
                    if (var20 == 1) {
                        var16.field811 = 0;
                        var16.field812 = 0;
                        var16.field813 = var19;
                        var16.field814 = 0;
                    }
                    if (var20 == 2) {
                        var16.field814 = 0;
                    }
                } else if (var18 == -1 || var16.field810 == -1 || class40.method2146(var18).field966 >= class40.method2146(var16.field810).field966) {
                    var16.field810 = var18;
                    var16.field811 = 0;
                    var16.field812 = 0;
                    var16.field813 = var19;
                    var16.field814 = 0;
                    var16.field837 = var16.field832;
                }
            }
            if ((var17 & 0x4) != 0) {
                var16.field749 = class37.method502(field322.method2395());
                var16.field783 = var16.field749.field853;
                var16.field829 = var16.field749.field875;
                var16.field787 = var16.field749.field859;
                var16.field796 = var16.field749.field883;
                var16.field785 = var16.field749.field861;
                var16.field788 = var16.field749.field862;
                var16.field784 = var16.field749.field856;
                var16.field779 = var16.field749.field857;
                var16.field786 = var16.field749.field884;
            }
            if ((var17 & 0x40) != 0) {
                var16.field815 = field322.method2251();
                int var21 = field322.method2259();
                var16.field806 = var21 >> 16;
                var16.field818 = (var21 & 0xFFFF) + field289;
                var16.field834 = 0;
                var16.field817 = 0;
                if (var16.field818 > field289) {
                    var16.field834 = -1;
                }
                if (var16.field815 == 65535) {
                    var16.field815 = -1;
                }
            }
            if ((var17 & 0x80) != 0) {
                var16.field836 = field322.method2223();
                var16.field795 = 100;
            }
            if ((var17 & 0x20) != 0) {
                var16.field805 = field322.method2251();
                var16.field822 = field322.method2249();
            }
            if ((var17 & 0x1) != 0) {
                int var22 = field322.method2242();
                int var23 = field322.method2360();
                var16.method637(var22, var23, field289);
                var16.field801 = field289 + 300;
                var16.field802 = field322.method2249();
                var16.field803 = field322.method2251();
            }
            if ((var17 & 0x2) != 0) {
                var16.field804 = field322.method2395();
                if (var16.field804 == 65535) {
                    var16.field804 = -1;
                }
            }
            if ((var17 & 0x10) != 0) {
                int var24 = field322.method2242();
                int var25 = field322.method2360();
                var16.method637(var24, var25, field289);
                var16.field801 = field289 + 300;
                var16.field802 = field322.method2395();
                var16.field803 = field322.method2249();
            }
        }
        for (int var26 = 0; var26 < field408; var26++) {
            int var27 = field511[var26];
            if (field289 != field316[var27].field827) {
                field316[var27].field749 = null;
                field316[var27] = null;
            }
        }
        if (field323 != field322.field1896) {
            throw new RuntimeException(field322.field1896 + class2.field21 + field323);
        }
        for (int var28 = 0; var28 < field317; var28++) {
            if (field316[field318[var28]] == null) {
                throw new RuntimeException(var28 + class2.field21 + field317);
            }
        }
    }

    @ObfuscatedName("cu.bs(III)V")
    public static final void method1957(int arg0, int arg1) {
        if (field424 < 2 && field450 == 0 && !field393) {
            return;
        }
        String var2;
        if (field450 == 1 && field424 < 2) {
            var2 = class148.field2336 + class148.field2362 + field436 + " " + class2.field25;
        } else if (field393 && field424 < 2) {
            var2 = field440 + class148.field2362 + field441 + " " + class2.field25;
        } else {
            var2 = method2489(field424 - 1);
        }
        if (field424 > 2) {
            var2 = var2 + class2.method2134(16777215) + " " + '/' + " " + (field424 - 2) + class148.field2356;
        }
        Statics.field100.method3667(var2, arg0 + 4, arg1 + 15, 16777215, 0, field289 / 1000);
    }

    @ObfuscatedName("o.bg(I)V")
    public static final void method154() {
        int var0 = Statics.field2131;
        int var1 = Statics.field214;
        int var2 = Statics.field1310;
        int var3 = Statics.field1346;
        int var4 = 6116423;
        class75.method1637(var0, var1, var2, var3, var4);
        class75.method1637(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class75.method1614(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field100.method3654(class148.field2420, var0 + 3, var1 + 14, var4, -1);
        int var5 = class132.field2070;
        int var6 = class132.field2067;
        for (int var7 = 0; var7 < field424; var7++) {
            int var8 = (field424 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field100.method3654(method2489(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field2131;
        int var11 = Statics.field214;
        int var12 = Statics.field1310;
        int var13 = Statics.field1346;
        for (int var14 = 0; var14 < field487; var14++) {
            if (field369[var14] + field297[var14] > var10 && field297[var14] < var10 + var12 && field495[var14] + field493[var14] > var11 && field493[var14] < var11 + var13) {
                field490[var14] = true;
            }
        }
    }

    @ObfuscatedName("p.bf(IIIIB)V")
    public static final void method498(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field487; var4++) {
            if (field369[var4] + field297[var4] > arg0 && field297[var4] < arg0 + arg2 && field495[var4] + field493[var4] > arg1 && field493[var4] < arg1 + arg3) {
                field489[var4] = true;
            }
        }
    }

    @ObfuscatedName("gv.bw(I)V")
    public static final void method3568() {
        method2482();
        if (Statics.field129 != null || field455 != null) {
            return;
        }
        int var12;
        int var13;
        label195: {
            int var0 = class132.field2065;
            if (field528) {
                if (var0 != 1 && (Statics.field568 || var0 != 4)) {
                    int var1 = class132.field2070;
                    int var2 = class132.field2067;
                    if (var1 < Statics.field2131 - 10 || var1 > Statics.field2131 + Statics.field1310 + 10 || var2 < Statics.field214 - 10 || var2 > Statics.field214 + Statics.field1346 + 10) {
                        field528 = false;
                        method498(Statics.field2131, Statics.field214, Statics.field1310, Statics.field1346);
                    }
                }
                if (var0 == 1 || !Statics.field568 && var0 == 4) {
                    int var3 = Statics.field2131;
                    int var4 = Statics.field214;
                    int var5 = Statics.field1310;
                    int var6 = class132.field2066;
                    int var7 = class132.field2060;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field424; var9++) {
                        int var10 = (field424 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method1685(var8);
                    }
                    field528 = false;
                    method498(Statics.field2131, Statics.field214, Statics.field1310, Statics.field1346);
                }
            } else {
                if ((var0 == 1 || !Statics.field568 && var0 == 4) && field424 > 0) {
                    int var11 = field427[field424 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field409[field424 - 1];
                        var13 = field347[field424 - 1];
                        class164 var14 = class164.method560(var13);
                        int var15 = Statics.method74(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label195;
                        }
                        class169 var10000 = (class169) null;
                        if (class169.method3559(Statics.method74(var14))) {
                            break label195;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field568 && var0 == 4) && (field422 == 1 && field424 > 2 || method2806(field424 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field568 && var0 == 4) && field424 > 0) {
                    method1685(field424 - 1);
                }
                if (var0 == 2 && field424 > 0) {
                    method615(class132.field2066, class132.field2060);
                }
            }
            return;
        }
        if (Statics.field129 != null && !field397 && field422 != 1 && !method2806(field424 - 1) && field424 > 0) {
            method31(field394, field395);
        }
        field397 = false;
        field404 = 0;
        if (Statics.field129 != null) {
            method572(Statics.field129);
        }
        Statics.field129 = class164.method560(var13);
        field328 = var12;
        field394 = class132.field2066;
        field395 = class132.field2060;
        if (field424 > 0) {
            int var17 = field424 - 1;
            Statics.field1303 = new class29();
            Statics.field1303.field696 = field409[var17];
            Statics.field1303.field691 = field347[var17];
            Statics.field1303.field692 = field427[var17];
            Statics.field1303.field694 = field428[var17];
            Statics.field1303.field693 = field429[var17];
        }
        method572(Statics.field129);
    }

    @ObfuscatedName("ag.bq(IIB)V")
    public static final void method615(int arg0, int arg1) {
        int var2 = Statics.field100.method3655(class148.field2420);
        for (int var3 = 0; var3 < field424; var3++) {
            int var4 = Statics.field100.method3655(method2489(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field424 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1408) {
            var6 = Statics.field1408 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1949) {
            var7 = Statics.field1949 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field528 = true;
        Statics.field2131 = var6;
        Statics.field214 = var7;
        Statics.field1310 = var2;
        Statics.field1346 = field424 * 15 + 22;
    }

    @ObfuscatedName("eg.bz(IB)Z")
    public static final boolean method2806(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field427[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ce.bp(IB)V")
    public static final void method1685(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field409[arg0];
        int var2 = field347[arg0];
        int var3 = field427[arg0];
        int var4 = field428[arg0];
        String var5 = field429[arg0];
        String var6 = field430[arg0];
        method864(var1, var2, var3, var4, var5, var6, class132.field2066, class132.field2060);
    }

    @ObfuscatedName("u.ba(Lal;III)V")
    public static final void method527(class29 arg0, int arg1, int arg2) {
        method864(arg0.field696, arg0.field691, arg0.field692, arg0.field694, arg0.field693, arg0.field693, arg1, arg2);
    }

    @ObfuscatedName("ae.bn(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method864(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 38) {
            method563();
            class164 var8 = class164.method560(arg1);
            field450 = 1;
            Statics.field1404 = arg0;
            Statics.field130 = arg1;
            Statics.field747 = arg3;
            method572(var8);
            field436 = class2.method2134(16748608) + class47.method2845(arg3).field1068 + class2.method2134(16777215);
            if (field436 == null) {
                field436 = "null";
            }
            return;
        }
        if (arg2 == 19) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(219);
            field320.method2238(class129.field2025[82] ? 1 : 0);
            field320.method2203(Statics.field2594 + arg0);
            field320.method2203(arg3);
            field320.method2246(Statics.field954 + arg1);
        }
        if (arg2 == 28) {
            field320.method2453(223);
            field320.method2204(arg1);
            class164 var9 = class164.method560(arg1);
            if (var9.field2758 != null && var9.field2758[0][0] == 5) {
                int var10 = var9.field2758[0][1];
                class167.field2796[var10] = 1 - class167.field2796[var10];
                method2484(var10);
            }
        }
        if (arg2 == 22) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(133);
            field320.method2326(class129.field2025[82] ? 1 : 0);
            field320.method2246(Statics.field2594 + arg0);
            field320.method2203(arg3);
            field320.method2202(Statics.field954 + arg1);
        }
        if (arg2 == 49) {
            class3 var11 = field400[arg3];
            if (var11 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(61);
                field320.method2202(arg3);
                field320.method2238(class129.field2025[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class164 var12 = class164.method554(arg1, arg0);
            if (var12 != null) {
                field320.method2453(146);
                field320.method2203(var12.field2667);
                field320.method2204(Statics.field2785);
                field320.method2203(field385);
                field320.method2204(arg1);
                field320.method2227(arg0);
                field320.method2202(field392);
            }
        }
        if (arg2 == 40) {
            field320.method2453(242);
            field320.method2256(arg1);
            field320.method2246(arg0);
            field320.method2227(arg3);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 23) {
            Statics.field684.method1812(Statics.field599, arg0, arg1);
        }
        if (arg2 == 30 && field546 == null) {
            field320.method2453(216);
            field320.method2246(arg0);
            field320.method2257(arg1);
            field546 = class164.method554(arg1, arg0);
            method572(field546);
        }
        if (arg2 == 41) {
            field320.method2453(212);
            field320.method2204(arg1);
            field320.method2202(arg0);
            field320.method2246(arg3);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 16) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(238);
            field320.method2202(Statics.field1404);
            field320.method2238(class129.field2025[82] ? 1 : 0);
            field320.method2246(arg3);
            field320.method2227(Statics.field2594 + arg0);
            field320.method2202(Statics.field954 + arg1);
            field320.method2257(Statics.field130);
            field320.method2202(Statics.field747);
        }
        if (arg2 == 21) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(178);
            field320.method2246(arg3);
            field320.method2203(Statics.field954 + arg1);
            field320.method2326(class129.field2025[82] ? 1 : 0);
            field320.method2246(Statics.field2594 + arg0);
        }
        if (arg2 == 5) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(177);
            field320.method2246(Statics.field2594 + arg0);
            field320.method2246(Statics.field954 + arg1);
            field320.method2227(arg3 >> 14 & 0x7FFF);
            field320.method2240(class129.field2025[82] ? 1 : 0);
        }
        if (arg2 == 11) {
            class32 var13 = field316[arg3];
            if (var13 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(37);
                field320.method2203(arg3);
                field320.method2238(class129.field2025[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class32 var14 = field316[arg3];
            if (var14 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(3);
                field320.method2258(Statics.field2785);
                field320.method2239(class129.field2025[82] ? 1 : 0);
                field320.method2227(field385);
                field320.method2246(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var15 = field400[arg3];
            if (var15 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(206);
                field320.method2227(arg3);
                field320.method2256(Statics.field130);
                field320.method2240(class129.field2025[82] ? 1 : 0);
                field320.method2202(Statics.field1404);
                field320.method2203(Statics.field747);
            }
        }
        if (arg2 == 45) {
            class3 var16 = field400[arg3];
            if (var16 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(233);
                field320.method2239(class129.field2025[82] ? 1 : 0);
                field320.method2246(arg3);
            }
        }
        if (arg2 == 34) {
            field320.method2453(227);
            field320.method2204(arg1);
            field320.method2202(arg3);
            field320.method2227(arg0);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 33) {
            field320.method2453(252);
            field320.method2203(arg0);
            field320.method2258(arg1);
            field320.method2246(arg3);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 18) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(102);
            field320.method2202(arg3);
            field320.method2227(Statics.field954 + arg1);
            field320.method2202(Statics.field2594 + arg0);
            field320.method2238(class129.field2025[82] ? 1 : 0);
        }
        if (arg2 == 1003) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            class32 var17 = field316[arg3];
            if (var17 != null) {
                class37 var18 = var17.field749;
                if (var18.field877 != null) {
                    var18 = var18.method657();
                }
                if (var18 != null) {
                    field320.method2453(137);
                    field320.method2202(var18.field879);
                }
            }
        }
        if (arg2 == 13) {
            class32 var19 = field316[arg3];
            if (var19 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(126);
                field320.method2326(class129.field2025[82] ? 1 : 0);
                field320.method2246(arg3);
            }
        }
        if (arg2 == 1005) {
            class164 var20 = class164.method560(arg1);
            if (var20 == null || var20.field2673[arg0] < 100000) {
                field320.method2453(51);
                field320.method2246(arg3);
            } else {
                class11.method2846(27, "", var20.field2673[arg0] + " x " + class47.method2845(arg3).field1068);
            }
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 7) {
            class32 var21 = field316[arg3];
            if (var21 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(20);
                field320.method2258(Statics.field130);
                field320.method2227(arg3);
                field320.method2238(class129.field2025[82] ? 1 : 0);
                field320.method2246(Statics.field1404);
                field320.method2202(Statics.field747);
            }
        }
        if (arg2 == 25) {
            class164 var22 = class164.method554(arg1, arg0);
            if (var22 != null) {
                method563();
                int var23 = Statics.method74(var22);
                int var24 = var23 >> 11 & 0x3F;
                int var26 = var22.field2667;
                class164 var27 = class164.method554(arg1, arg0);
                if (var27 != null && var27.field2737 != null) {
                    class1 var28 = new class1();
                    var28.field3 = var27;
                    var28.field16 = var27.field2737;
                    class34.method97(var28);
                }
                field392 = var26;
                field393 = true;
                Statics.field2785 = arg1;
                field385 = arg0;
                Statics.field1509 = var24;
                method572(var27);
                field450 = 0;
                field440 = method3363(var22);
                if (field440 == null) {
                    field440 = "Null";
                }
                if (var22.field2647) {
                    field441 = var22.field2719 + class2.method2134(16777215);
                } else {
                    field441 = class2.method2134(65280) + var22.field2762 + class2.method2134(16777215);
                }
            }
            return;
        }
        if (arg2 == 51) {
            class3 var29 = field400[arg3];
            if (var29 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(74);
                field320.method2202(arg3);
                field320.method2240(class129.field2025[82] ? 1 : 0);
            }
        }
        if (arg2 == 47) {
            class3 var30 = field400[arg3];
            if (var30 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(4);
                field320.method2246(arg3);
                field320.method2239(class129.field2025[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field320.method2453(107);
            field320.method2203(arg0);
            field320.method2227(arg3);
            field320.method2204(arg1);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 15) {
            class3 var31 = field400[arg3];
            if (var31 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(143);
                field320.method2202(field385);
                field320.method2227(arg3);
                field320.method2240(class129.field2025[82] ? 1 : 0);
                field320.method2256(Statics.field2785);
            }
        }
        if (arg2 == 24) {
            class164 var32 = class164.method560(arg1);
            boolean var33 = true;
            if (var32.field2652 > 0) {
                var33 = method880(var32);
            }
            if (var33) {
                field320.method2453(223);
                field320.method2204(arg1);
            }
        }
        if (arg2 == 1004) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field320.method2453(51);
            field320.method2246(arg3);
        }
        if (arg2 == 44) {
            class3 var34 = field400[arg3];
            if (var34 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(57);
                field320.method2227(arg3);
                field320.method2238(class129.field2025[82] ? 1 : 0);
            }
        }
        if (arg2 == 12) {
            class32 var35 = field316[arg3];
            if (var35 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(70);
                field320.method2239(class129.field2025[82] ? 1 : 0);
                field320.method2203(arg3);
            }
        }
        if (arg2 == 3) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(232);
            field320.method2227(Statics.field2594 + arg0);
            field320.method2238(class129.field2025[82] ? 1 : 0);
            field320.method2246(arg3 >> 14 & 0x7FFF);
            field320.method2246(Statics.field954 + arg1);
        }
        if (arg2 == 4) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(228);
            field320.method2240(class129.field2025[82] ? 1 : 0);
            field320.method2202(Statics.field2594 + arg0);
            field320.method2246(arg3 >> 14 & 0x7FFF);
            field320.method2203(Statics.field954 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class164 var36 = class164.method554(arg1, arg0);
            if (var36 != null) {
                method3095(arg3, arg1, arg0, var36.field2667, arg5);
            }
        }
        if (arg2 == 31) {
            field320.method2453(41);
            field320.method2203(Statics.field747);
            field320.method2203(arg0);
            field320.method2227(arg3);
            field320.method2257(arg1);
            field320.method2246(Statics.field1404);
            field320.method2256(Statics.field130);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 20) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(239);
            field320.method2326(class129.field2025[82] ? 1 : 0);
            field320.method2227(Statics.field2594 + arg0);
            field320.method2227(Statics.field954 + arg1);
            field320.method2202(arg3);
        }
        if (arg2 == 39) {
            field320.method2453(151);
            field320.method2258(arg1);
            field320.method2202(arg0);
            field320.method2246(arg3);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 35) {
            field320.method2453(118);
            field320.method2202(arg3);
            field320.method2256(arg1);
            field320.method2246(arg0);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 1001) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(157);
            field320.method2203(Statics.field2594 + arg0);
            field320.method2238(class129.field2025[82] ? 1 : 0);
            field320.method2202(Statics.field954 + arg1);
            field320.method2227(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 48) {
            class3 var37 = field400[arg3];
            if (var37 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(131);
                field320.method2227(arg3);
                field320.method2238(class129.field2025[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field320.method2453(79);
            field320.method2246(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 50) {
            class3 var38 = field400[arg3];
            if (var38 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(158);
                field320.method2202(arg3);
                field320.method2326(class129.field2025[82] ? 1 : 0);
            }
        }
        if (arg2 == 46) {
            class3 var39 = field400[arg3];
            if (var39 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(22);
                field320.method2202(arg3);
                field320.method2326(class129.field2025[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(147);
            field320.method2203(Statics.field2594 + arg0);
            field320.method2238(class129.field2025[82] ? 1 : 0);
            field320.method2246(arg3 >> 14 & 0x7FFF);
            field320.method2227(field385);
            field320.method2202(Statics.field954 + arg1);
            field320.method2257(Statics.field2785);
        }
        if (arg2 == 37) {
            field320.method2453(153);
            field320.method2256(arg1);
            field320.method2246(arg3);
            field320.method2202(arg0);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 17) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(12);
            field320.method2202(field385);
            field320.method2204(Statics.field2785);
            field320.method2246(arg3);
            field320.method2246(Statics.field2594 + arg0);
            field320.method2202(Statics.field954 + arg1);
            field320.method2238(class129.field2025[82] ? 1 : 0);
        }
        if (arg2 == 1) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(62);
            field320.method2203(Statics.field954 + arg1);
            field320.method2257(Statics.field130);
            field320.method2202(arg3 >> 14 & 0x7FFF);
            field320.method2246(Statics.field2594 + arg0);
            field320.method2202(Statics.field1404);
            field320.method2238(class129.field2025[82] ? 1 : 0);
            field320.method2246(Statics.field747);
        }
        if (arg2 == 6) {
            field387 = arg6;
            field426 = arg7;
            field390 = 2;
            field389 = 0;
            field321 = arg0;
            field519 = arg1;
            field320.method2453(122);
            field320.method2227(arg3 >> 14 & 0x7FFF);
            field320.method2203(Statics.field2594 + arg0);
            field320.method2326(class129.field2025[82] ? 1 : 0);
            field320.method2246(Statics.field954 + arg1);
        }
        if (arg2 == 36) {
            field320.method2453(213);
            field320.method2257(arg1);
            field320.method2227(arg3);
            field320.method2246(arg0);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 10) {
            class32 var40 = field316[arg3];
            if (var40 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(246);
                field320.method2202(arg3);
                field320.method2326(class129.field2025[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field320.method2453(73);
            field320.method2257(Statics.field2785);
            field320.method2227(arg0);
            field320.method2258(arg1);
            field320.method2246(arg3);
            field320.method2203(field385);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 9) {
            class32 var41 = field316[arg3];
            if (var41 != null) {
                field387 = arg6;
                field426 = arg7;
                field390 = 2;
                field389 = 0;
                field321 = arg0;
                field519 = arg1;
                field320.method2453(82);
                field320.method2202(arg3);
                field320.method2326(class129.field2025[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            field320.method2453(63);
            for (class4 var42 = (class4) field443.method3428(); var42 != null; var42 = (class4) field443.method3432()) {
                if (var42.field69 == 0 || var42.field69 == 3) {
                    method2854(var42, true);
                }
            }
            if (field546 != null) {
                method572(field546);
                field546 = null;
            }
        }
        if (arg2 == 43) {
            field320.method2453(144);
            field320.method2203(arg3);
            field320.method2202(arg0);
            field320.method2256(arg1);
            field288 = 0;
            Statics.field249 = class164.method560(arg1);
            field544 = arg0;
        }
        if (arg2 == 29) {
            field320.method2453(223);
            field320.method2204(arg1);
            class164 var43 = class164.method560(arg1);
            if (var43.field2758 != null && var43.field2758[0][0] == 5) {
                int var44 = var43.field2758[0][1];
                if (class167.field2796[var44] != var43.field2760[0]) {
                    class167.field2796[var44] = var43.field2760[0];
                    method2484(var44);
                }
            }
        }
        if (field450 != 0) {
            field450 = 0;
            method572(class164.method560(Statics.field130));
        }
        if (field393) {
            method563();
        }
        if (Statics.field249 != null && field288 == 0) {
            method572(Statics.field249);
        }
    }

    @ObfuscatedName("aq.bj(B)V")
    public static void method563() {
        if (!field393) {
            return;
        }
        class164 var0 = class164.method554(Statics.field2785, field385);
        if (var0 != null && var0.field2738 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field16 = var0.field2738;
            class34.method97(var1);
        }
        field393 = false;
        method572(var0);
    }

    @ObfuscatedName("fb.bk(IIIILjava/lang/String;B)V")
    public static void method3095(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class164 var5 = class164.method554(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2746 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field14 = arg0;
            var6.field10 = arg4;
            var6.field16 = var5.field2746;
            class34.method97(var6);
        }
        boolean var7 = true;
        if (var5.field2652 > 0) {
            var7 = method880(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = Statics.method74(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field320.method2453(200);
            field320.method2204(arg1);
            field320.method2202(arg2);
            field320.method2202(arg3);
        }
        if (arg0 == 2) {
            field320.method2453(183);
            field320.method2204(arg1);
            field320.method2202(arg2);
            field320.method2202(arg3);
        }
        if (arg0 == 3) {
            field320.method2453(201);
            field320.method2204(arg1);
            field320.method2202(arg2);
            field320.method2202(arg3);
        }
        if (arg0 == 4) {
            field320.method2453(214);
            field320.method2204(arg1);
            field320.method2202(arg2);
            field320.method2202(arg3);
        }
        if (arg0 == 5) {
            field320.method2453(132);
            field320.method2204(arg1);
            field320.method2202(arg2);
            field320.method2202(arg3);
        }
        if (arg0 == 6) {
            field320.method2453(160);
            field320.method2204(arg1);
            field320.method2202(arg2);
            field320.method2202(arg3);
        }
        if (arg0 == 7) {
            field320.method2453(159);
            field320.method2204(arg1);
            field320.method2202(arg2);
            field320.method2202(arg3);
        }
        if (arg0 == 8) {
            field320.method2453(149);
            field320.method2204(arg1);
            field320.method2202(arg2);
            field320.method2202(arg3);
        }
        if (arg0 == 9) {
            field320.method2453(115);
            field320.method2204(arg1);
            field320.method2202(arg2);
            field320.method2202(arg3);
        }
        if (arg0 == 10) {
            field320.method2453(87);
            field320.method2204(arg1);
            field320.method2202(arg2);
            field320.method2202(arg3);
        }
    }

    @ObfuscatedName("dh.bu(I)V")
    public static final void method2482() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field424 - 1; var1++) {
                if (field427[var1] < 1000 && field427[var1 + 1] > 1000) {
                    String var2 = field430[var1];
                    field430[var1] = field430[var1 + 1];
                    field430[var1 + 1] = var2;
                    String var3 = field429[var1];
                    field429[var1] = field429[var1 + 1];
                    field429[var1 + 1] = var3;
                    int var4 = field427[var1];
                    field427[var1] = field427[var1 + 1];
                    field427[var1 + 1] = var4;
                    int var5 = field409[var1];
                    field409[var1] = field409[var1 + 1];
                    field409[var1 + 1] = var5;
                    int var6 = field347[var1];
                    field347[var1] = field347[var1 + 1];
                    field347[var1 + 1] = var6;
                    int var7 = field428[var1];
                    field428[var1] = field428[var1 + 1];
                    field428[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("f.ce(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method95(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field528 || field424 >= 500) {
            return;
        }
        field429[field424] = arg0;
        field430[field424] = arg1;
        field427[field424] = arg2;
        field428[field424] = arg3;
        field409[field424] = arg4;
        field347[field424] = arg5;
        field424++;
    }

    @ObfuscatedName("fq.cj(I)V")
    public static void method3379() {
        for (int var0 = 0; var0 < field424; var0++) {
            int var1 = field427[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field424 - 1) {
                    for (int var3 = var0; var3 < field424 - 1; var3++) {
                        field429[var3] = field429[var3 + 1];
                        field430[var3] = field430[var3 + 1];
                        field427[var3] = field427[var3 + 1];
                        field428[var3] = field428[var3 + 1];
                        field409[var3] = field409[var3 + 1];
                        field347[var3] = field347[var3 + 1];
                    }
                }
                field424--;
            }
        }
    }

    @ObfuscatedName("dr.cz(IB)Ljava/lang/String;")
    public static String method2489(int arg0) {
        return field430[arg0].length() > 0 ? field429[arg0] + class148.field2362 + field430[arg0] : field429[arg0];
    }

    @ObfuscatedName("ex.cy(IIIIB)V")
    public static final void method2831(int arg0, int arg1, int arg2, int arg3) {
        if (field450 == 0 && !field393) {
            method95(class148.field2357, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class100.field1789; var6++) {
            int var7 = class100.field1779[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field684.method1703(Statics.field599, var8, var9, var7) >= 0) {
                    class38 var12 = class38.method879(var11);
                    if (var12.field930 != null) {
                        var12 = var12.method692();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field450 == 1) {
                        method95(class148.field2336, field436 + " " + class2.field25 + " " + class2.method2134(65535) + var12.field899, 1, var7, var8, var9);
                    } else if (!field393) {
                        String[] var13 = var12.field898;
                        if (field538) {
                            var13 = method157(var13);
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
                                    method95(var13[var14], class2.method2134(65535) + var12.field899, var15, var7, var8, var9);
                                }
                            }
                        }
                        method95(class148.field2353, class2.method2134(65535) + var12.field899, 1002, var12.field896 << 14, var8, var9);
                    } else if ((Statics.field1509 & 0x4) == 4) {
                        method95(field440, field441 + " " + class2.field25 + " " + class2.method2134(65535) + var12.field899, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class32 var16 = field316[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field749.field853 == 1 && (var16.field830 & 0x7F) == 64 && (var16.field828 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field317; var17++) {
                            class32 var18 = field316[field318[var17]];
                            if (var18 != null && var16 != var18 && var18.field749.field853 == 1 && var16.field830 == var18.field830 && var16.field828 == var18.field828) {
                                method3244(var18.field749, field318[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field401; var19++) {
                            class3 var20 = field400[field357[var19]];
                            if (var20 != null && var16.field830 == var20.field830 && var16.field828 == var20.field828) {
                                method3378(var20, field357[var19], var8, var9);
                            }
                        }
                    }
                    method3244(var16.field749, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field400[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field830 & 0x7F) == 64 && (var21.field828 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field317; var22++) {
                            class32 var23 = field316[field318[var22]];
                            if (var23 != null && var23.field749.field853 == 1 && var21.field830 == var23.field830 && var21.field828 == var23.field828) {
                                method3244(var23.field749, field318[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field401; var24++) {
                            class3 var25 = field400[field357[var24]];
                            if (var25 != null && var21 != var25 && var21.field830 == var25.field830 && var21.field828 == var25.field828) {
                                method3378(var25, field357[var24], var8, var9);
                            }
                        }
                    }
                    if (field414 == var11) {
                        var4 = var7;
                    } else {
                        method3378(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class190 var26 = field415[Statics.field599][var8][var9];
                    if (var26 != null) {
                        for (class27 var27 = (class27) var26.method3469(); var27 != null; var27 = (class27) var26.method3471()) {
                            class47 var28 = class47.method2845(var27.field671);
                            if (field450 == 1) {
                                method95(class148.field2336, field436 + " " + class2.field25 + " " + class2.method2134(16748608) + var28.field1068, 16, var27.field671, var8, var9);
                            } else if (!field393) {
                                String[] var29 = var28.field1070;
                                if (field538) {
                                    var29 = method157(var29);
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
                                        method95(var29[var30], class2.method2134(16748608) + var28.field1068, var31, var27.field671, var8, var9);
                                    } else if (var30 == 2) {
                                        method95(class148.field2202, class2.method2134(16748608) + var28.field1068, 20, var27.field671, var8, var9);
                                    }
                                }
                                method95(class148.field2353, class2.method2134(16748608) + var28.field1068, 1004, var27.field671, var8, var9);
                            } else if ((Statics.field1509 & 0x1) == 1) {
                                method95(field440, field441 + " " + class2.field25 + " " + class2.method2134(16748608) + var28.field1068, 17, var27.field671, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field400[field414];
            method3378(var34, field414, var32, var33);
        }
    }

    @ObfuscatedName("fr.co(Lat;IIII)V")
    public static final void method3244(class37 arg0, int arg1, int arg2, int arg3) {
        if (field424 >= 400) {
            return;
        }
        if (arg0.field877 != null) {
            arg0 = arg0.method657();
        }
        if (arg0 == null || !arg0.field880 || arg0.field882 && field306 != arg1) {
            return;
        }
        String var4 = arg0.field852;
        if (arg0.field869 != 0) {
            var4 = var4 + method2643(arg0.field869, Statics.field1994.field44) + " " + class2.field23 + class148.field2358 + arg0.field869 + class2.field20;
        }
        if (field450 == 1) {
            method95(class148.field2336, field436 + " " + class2.field25 + " " + class2.method2134(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field393) {
            String[] var5 = arg0.field867;
            if (field538) {
                var5 = method157(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class148.field2201)) {
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
                        method95(var5[var6], class2.method2134(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class148.field2201)) {
                        short var9 = 0;
                        if (field358 == class19.field571 || field358 == class19.field574 && arg0.field869 > Statics.field1994.field44) {
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
                        method95(var5[var8], class2.method2134(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method95(class148.field2353, class2.method2134(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1509 & 0x2) == 2) {
            method95(field440, field441 + " " + class2.field25 + " " + class2.method2134(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fh.ch(La;IIII)V")
    public static final void method3378(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1994 == arg0 || field424 >= 400) {
            return;
        }
        String var4;
        if (arg0.field45 == 0) {
            var4 = arg0.field60 + method2643(arg0.field44, Statics.field1994.field44) + " " + class2.field23 + class148.field2358 + arg0.field44 + class2.field20;
        } else {
            var4 = arg0.field60 + " " + class2.field23 + class148.field2359 + arg0.field45 + class2.field20;
        }
        if (field450 == 1) {
            method95(class148.field2336, field436 + " " + class2.field25 + " " + class2.method2134(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field393) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field291[var5] != null) {
                    short var6 = 0;
                    if (field291[var5].equalsIgnoreCase(class148.field2201)) {
                        if (field358 == class19.field571 || field358 == class19.field574 && arg0.field44 > Statics.field1994.field44) {
                            var6 = 2000;
                        }
                        if (Statics.field1994.field58 != 0 && arg0.field58 != 0) {
                            if (Statics.field1994.field58 == arg0.field58) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field552[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field410[var5] + var6;
                    method95(field291[var5], class2.method2134(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1509 & 0x8) == 8) {
            method95(field440, field441 + " " + class2.field25 + " " + class2.method2134(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field424; var9++) {
            if (field427[var9] == 23) {
                field430[var9] = class2.method2134(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("dl.ck(III)Ljava/lang/String;")
    public static final String method2643(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2134(16711680);
        } else if (var2 < -6) {
            return class2.method2134(16723968);
        } else if (var2 < -3) {
            return class2.method2134(16740352);
        } else if (var2 < 0) {
            return class2.method2134(16756736);
        } else if (var2 > 9) {
            return class2.method2134(65280);
        } else if (var2 > 6) {
            return class2.method2134(4259584);
        } else if (var2 > 3) {
            return class2.method2134(8453888);
        } else if (var2 > 0) {
            return class2.method2134(12648192);
        } else {
            return class2.method2134(16776960);
        }
    }

    @ObfuscatedName("cr.cq(IIIIIIIII)V")
    public static final void method1954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class164.method915(arg0)) {
            Statics.field211 = null;
            method2827(Statics.field2764[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field211 != null) {
                method2827(Statics.field211, -1412584499, arg1, arg2, arg3, arg4, Statics.field1943, Statics.field191, arg7);
                Statics.field211 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field489[var8] = true;
            }
        } else {
            field489[arg7] = true;
        }
    }

    @ObfuscatedName("ei.cp([Lfu;IIIIIIIIB)V")
    public static final void method2827(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75.method1606(arg2, arg3, arg4, arg5);
        class86.method1875();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class164 var10 = arg0[var9];
            if (var10 != null && (var10.field2724 == arg1 || arg1 == -1412584499 && field455 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field297[field487] = var10.field2661 + arg6;
                    field493[field487] = var10.field2734 + arg7;
                    field369[field487] = var10.field2663;
                    field495[field487] = var10.field2765;
                    var11 = ++field487 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2775 = var11;
                var10.field2778 = field289;
                if (!var10.field2647 || !method94(var10)) {
                    if (var10.field2652 > 0) {
                        int var12 = var10.field2652;
                        if (var12 == 324) {
                            if (field560 == -1) {
                                field560 = var10.field2695;
                                field561 = var10.field2682;
                            }
                            if (field559.field2814) {
                                var10.field2695 = field560;
                            } else {
                                var10.field2695 = field561;
                            }
                        } else if (var12 == 325) {
                            if (field560 == -1) {
                                field560 = var10.field2695;
                                field561 = var10.field2682;
                            }
                            if (field559.field2814) {
                                var10.field2695 = field561;
                            } else {
                                var10.field2695 = field560;
                            }
                        } else if (var12 == 327) {
                            var10.field2706 = 150;
                            var10.field2698 = (int) (Math.sin((double) field289 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2689 = 5;
                            var10.field2690 = 0;
                        } else if (var12 == 328) {
                            var10.field2706 = 150;
                            var10.field2698 = (int) (Math.sin((double) field289 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2689 = 5;
                            var10.field2690 = 1;
                        }
                    }
                    int var13 = var10.field2661 + arg6;
                    int var14 = var10.field2734 + arg7;
                    int var15 = var10.field2678;
                    if (field455 == var10) {
                        if (arg1 != -1412584499 && !var10.field2756) {
                            Statics.field211 = arg0;
                            Statics.field1943 = arg6;
                            Statics.field191 = arg7;
                            continue;
                        }
                        if (field466 && field460) {
                            int var16 = class132.field2070;
                            int var17 = class132.field2067;
                            int var18 = var16 - field457;
                            int var19 = var17 - field458;
                            if (var18 < field407) {
                                var18 = field407;
                            }
                            if (var10.field2663 + var18 > field407 + field456.field2663) {
                                var18 = field407 + field456.field2663 - var10.field2663;
                            }
                            if (var19 < field520) {
                                var19 = field520;
                            }
                            if (var10.field2765 + var19 > field520 + field456.field2765) {
                                var19 = field520 + field456.field2765 - var10.field2765;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2756) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2650 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2650 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2663 + var13;
                        int var27 = var10.field2765 + var14;
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
                        int var30 = var10.field2663 + var13;
                        int var31 = var10.field2765 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2647 || var20 < var22 && var21 < var23) {
                        if (var10.field2652 != 0) {
                            if (var10.field2652 == 1336) {
                                if (field295) {
                                    var14 += 15;
                                    Statics.field676.method3661("Fps:" + field2111, var10.field2663 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field285) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field285) {
                                        var34 = 16711680;
                                    }
                                    Statics.field676.method3661("Mem:" + var33 + "k", var10.field2663 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2652 == 1337) {
                                field431 = var13;
                                field465 = var14;
                                int var37 = var10.field2663;
                                int var38 = var10.field2765;
                                field287++;
                                method7(class31.field745);
                                boolean var39 = false;
                                if (field414 >= 0) {
                                    for (int var40 = 0; var40 < field401; var40++) {
                                        if (field414 == field357[var40]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method7(class31.field739);
                                }
                                method912(true);
                                method7(var39 ? class31.field738 : class31.field740);
                                method912(false);
                                method129();
                                for (class28 var41 = (class28) field418.method3468(); var41 != null; var41 = (class28) field418.method3470()) {
                                    if (Statics.field599 != var41.field685 || var41.field683) {
                                        var41.method3554();
                                    } else if (field289 >= var41.field675) {
                                        var41.method564(field354);
                                        if (var41.field683) {
                                            var41.method3554();
                                        } else {
                                            Statics.field684.method1708(var41.field685, var41.field686, var41.field678, var41.field679, 60, var41, 0, -1, false);
                                        }
                                    }
                                }
                                method874(var13, var14, var37, var38, true);
                                int var42 = field548;
                                int var43 = field346;
                                int var44 = field550;
                                int var45 = field412;
                                class75.method1606(var42, var43, var42 + var44, var43 + var45);
                                class86.method1875();
                                if (!field533) {
                                    int var46 = field364;
                                    if (field372 / 256 > var46) {
                                        var46 = field372 / 256;
                                    }
                                    if (field439[4] && field280[4] + 128 > var46) {
                                        var46 = field280[4] + 128;
                                    }
                                    int var47 = field473 + field365 & 0x7FF;
                                    int var48 = Statics.field2952;
                                    int var49 = method163(Statics.field1994.field830, Statics.field1994.field828, Statics.field599) - 50;
                                    int var50 = Statics.field596;
                                    int var51 = var46 * 3 + 600;
                                    int var52 = 2048 - var46 & 0x7FF;
                                    int var53 = 2048 - var47 & 0x7FF;
                                    int var54 = 0;
                                    int var55 = 0;
                                    int var56 = var51;
                                    if (var52 != 0) {
                                        int var57 = class86.field1539[var52];
                                        int var58 = class86.field1540[var52];
                                        int var59 = var55 * var58 - var51 * var57 >> 16;
                                        var56 = var55 * var57 + var51 * var58 >> 16;
                                        var55 = var59;
                                    }
                                    if (var53 != 0) {
                                        int var60 = class86.field1539[var53];
                                        int var61 = class86.field1540[var53];
                                        int var62 = var54 * var61 + var56 * var60 >> 16;
                                        var56 = var56 * var61 - var54 * var60 >> 16;
                                        var54 = var62;
                                    }
                                    Statics.field1733 = var48 - var54;
                                    Statics.field991 = var49 - var55;
                                    Statics.field2823 = var50 - var56;
                                    Statics.field938 = var46;
                                    Statics.field363 = var47;
                                }
                                int var75;
                                if (field533) {
                                    int var76;
                                    if (Statics.field134.field147) {
                                        var76 = Statics.field599;
                                    } else {
                                        int var77 = method163(Statics.field1733, Statics.field2823, Statics.field599);
                                        if (var77 - Statics.field991 >= 800 || (class6.field83[Statics.field599][Statics.field1733 >> 7][Statics.field2823 >> 7] & 0x4) == 0) {
                                            var76 = 3;
                                        } else {
                                            var76 = Statics.field599;
                                        }
                                    }
                                    var75 = var76;
                                } else {
                                    int var63;
                                    if (Statics.field134.field147) {
                                        var63 = Statics.field599;
                                    } else {
                                        int var64 = 3;
                                        if (Statics.field938 < 310) {
                                            int var65 = Statics.field1733 >> 7;
                                            int var66 = Statics.field2823 >> 7;
                                            int var67 = Statics.field1994.field830 >> 7;
                                            int var68 = Statics.field1994.field828 >> 7;
                                            if ((class6.field83[Statics.field599][var65][var66] & 0x4) != 0) {
                                                var64 = Statics.field599;
                                            }
                                            int var69;
                                            if (var67 > var65) {
                                                var69 = var67 - var65;
                                            } else {
                                                var69 = var65 - var67;
                                            }
                                            int var70;
                                            if (var68 > var66) {
                                                var70 = var68 - var66;
                                            } else {
                                                var70 = var66 - var68;
                                            }
                                            if (var69 > var70) {
                                                int var71 = var70 * 65536 / var69;
                                                int var72 = 32768;
                                                while (var65 != var67) {
                                                    if (var65 < var67) {
                                                        var65++;
                                                    } else if (var65 > var67) {
                                                        var65--;
                                                    }
                                                    if ((class6.field83[Statics.field599][var65][var66] & 0x4) != 0) {
                                                        var64 = Statics.field599;
                                                    }
                                                    var72 += var71;
                                                    if (var72 >= 65536) {
                                                        var72 -= 65536;
                                                        if (var66 < var68) {
                                                            var66++;
                                                        } else if (var66 > var68) {
                                                            var66--;
                                                        }
                                                        if ((class6.field83[Statics.field599][var65][var66] & 0x4) != 0) {
                                                            var64 = Statics.field599;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var73 = var69 * 65536 / var70;
                                                int var74 = 32768;
                                                while (var66 != var68) {
                                                    if (var66 < var68) {
                                                        var66++;
                                                    } else if (var66 > var68) {
                                                        var66--;
                                                    }
                                                    if ((class6.field83[Statics.field599][var65][var66] & 0x4) != 0) {
                                                        var64 = Statics.field599;
                                                    }
                                                    var74 += var73;
                                                    if (var74 >= 65536) {
                                                        var74 -= 65536;
                                                        if (var65 < var67) {
                                                            var65++;
                                                        } else if (var65 > var67) {
                                                            var65--;
                                                        }
                                                        if ((class6.field83[Statics.field599][var65][var66] & 0x4) != 0) {
                                                            var64 = Statics.field599;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field83[Statics.field599][Statics.field1994.field830 >> 7][Statics.field1994.field828 >> 7] & 0x4) != 0) {
                                            var64 = Statics.field599;
                                        }
                                        var63 = var64;
                                    }
                                    var75 = var63;
                                }
                                int var78 = Statics.field1733;
                                int var79 = Statics.field991;
                                int var80 = Statics.field2823;
                                int var81 = Statics.field938;
                                int var82 = Statics.field363;
                                for (int var83 = 0; var83 < 5; var83++) {
                                    if (field439[var83]) {
                                        int var84 = (int) (Math.random() * (double) (field536[var83] * 2 + 1) - (double) field536[var83] + Math.sin((double) field435[var83] / 100.0D * (double) field425[var83]) * (double) field280[var83]);
                                        if (var83 == 0) {
                                            Statics.field1733 += var84;
                                        }
                                        if (var83 == 1) {
                                            Statics.field991 += var84;
                                        }
                                        if (var83 == 2) {
                                            Statics.field2823 += var84;
                                        }
                                        if (var83 == 3) {
                                            Statics.field363 = Statics.field363 + var84 & 0x7FF;
                                        }
                                        if (var83 == 4) {
                                            Statics.field938 += var84;
                                            if (Statics.field938 < 128) {
                                                Statics.field938 = 128;
                                            }
                                            if (Statics.field938 > 383) {
                                                Statics.field938 = 383;
                                            }
                                        }
                                    }
                                }
                                int var85 = class132.field2070;
                                int var86 = class132.field2067;
                                if (class132.field2065 != 0) {
                                    var85 = class132.field2066;
                                    var86 = class132.field2060;
                                }
                                if (var85 >= var42 && var85 < var42 + var44 && var86 >= var43 && var86 < var43 + var45) {
                                    class100.field1787 = true;
                                    class100.field1789 = 0;
                                    class100.field1792 = var85 - var42;
                                    class100.field1796 = var86 - var43;
                                } else {
                                    class100.field1787 = false;
                                    class100.field1789 = 0;
                                }
                                method2();
                                class75.method1637(var42, var43, var44, var45, 0);
                                method2();
                                int var87 = class86.field1517;
                                class86.field1517 = field367;
                                Statics.field684.method1731(Statics.field1733, Statics.field991, Statics.field2823, Statics.field938, Statics.field363, var75);
                                class86.field1517 = var87;
                                method2();
                                Statics.field684.method1707();
                                method1959(var42, var43, var44, var45);
                                method1864(var42, var43);
                                ((class90) Statics.field1522).method1945(field354);
                                if (field390 == 1) {
                                    Statics.field355[field389 / 100].method1587(field387 - 8, field426 - 8);
                                }
                                if (field390 == 2) {
                                    Statics.field355[field389 / 100 + 4].method1587(field387 - 8, field426 - 8);
                                }
                                field399 = 0;
                                int var88 = (Statics.field1994.field830 >> 7) + Statics.field2594;
                                int var89 = (Statics.field1994.field828 >> 7) + Statics.field954;
                                if (var88 >= 3053 && var88 <= 3156 && var89 >= 3056 && var89 <= 3136) {
                                    field399 = 1;
                                }
                                if (var88 >= 3072 && var88 <= 3118 && var89 >= 9492 && var89 <= 9535) {
                                    field399 = 1;
                                }
                                if (field399 == 1 && var88 >= 3139 && var88 <= 3199 && var89 >= 3008 && var89 <= 3062) {
                                    field399 = 0;
                                }
                                Statics.field1733 = var78;
                                Statics.field991 = var79;
                                Statics.field2823 = var80;
                                Statics.field938 = var81;
                                Statics.field363 = var82;
                                if (field293 && Statics.method2905(true, false) == 0) {
                                    field293 = false;
                                }
                                if (field293) {
                                    class75.method1637(var42, var43, var44, var45, 0);
                                    method1861(class148.field2282, false);
                                }
                                field489[var10.field2775] = true;
                                class75.method1606(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2652 == 1338) {
                                method2885(var10, var13, var14, var11);
                                class75.method1606(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2652 == 1339) {
                                method2812(var10, var13, var14, var11);
                                class75.method1606(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2650 == 0) {
                            if (!var10.field2647 && method94(var10) && Statics.field994 != var10) {
                                continue;
                            }
                            if (!var10.field2647) {
                                if (var10.field2739 > var10.field2672 - var10.field2765) {
                                    var10.field2739 = var10.field2672 - var10.field2765;
                                }
                                if (var10.field2739 < 0) {
                                    var10.field2739 = 0;
                                }
                            }
                            method2827(arg0, var10.field2717, var20, var21, var22, var23, var13 - var10.field2669, var14 - var10.field2739, var11);
                            if (var10.field2770 != null) {
                                method2827(var10.field2770, var10.field2717, var20, var21, var22, var23, var13 - var10.field2669, var14 - var10.field2739, var11);
                            }
                            class4 var90 = (class4) field443.method3425((long) var10.field2717);
                            if (var90 != null) {
                                method1954(var90.field72, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class75.method1606(arg2, arg3, arg4, arg5);
                            class86.method1875();
                        }
                        if (field498 || field491[var11] || field496 > 1) {
                            if (var10.field2650 == 0 && !var10.field2647 && var10.field2672 > var10.field2765) {
                                int var91 = var10.field2663 + var13;
                                int var92 = var10.field2739;
                                int var93 = var10.field2765;
                                int var94 = var10.field2672;
                                Statics.field1410[0].method1663(var91, var14);
                                Statics.field1410[1].method1663(var91, var14 + var93 - 16);
                                class75.method1637(var91, var14 + 16, 16, var93 - 32, field383);
                                int var95 = (var93 - 32) * var93 / var94;
                                if (var95 < 8) {
                                    var95 = 8;
                                }
                                int var96 = (var93 - 32 - var95) * var92 / (var94 - var93);
                                class75.method1637(var91, var14 + 16 + var96, 16, var95, field327);
                                class75.method1618(var91, var14 + 16 + var96, var95, field360);
                                class75.method1618(var91 + 1, var14 + 16 + var96, var95, field360);
                                class75.method1647(var91, var14 + 16 + var96, 16, field360);
                                class75.method1647(var91, var14 + 17 + var96, 16, field360);
                                class75.method1618(var91 + 15, var14 + 16 + var96, var95, field359);
                                class75.method1618(var91 + 14, var14 + 17 + var96, var95 - 1, field359);
                                class75.method1647(var91, var14 + 15 + var96 + var95, 16, field359);
                                class75.method1647(var91 + 1, var14 + 14 + var96 + var95, 15, field359);
                            }
                            if (var10.field2650 != 1) {
                                if (var10.field2650 == 2) {
                                    int var97 = 0;
                                    for (int var98 = 0; var98 < var10.field2660; var98++) {
                                        for (int var99 = 0; var99 < var10.field2659; var99++) {
                                            int var100 = (var10.field2712 + 32) * var99 + var13;
                                            int var101 = (var10.field2755 + 32) * var98 + var14;
                                            if (var97 < 20) {
                                                var100 += var10.field2714[var97];
                                                var101 += var10.field2715[var97];
                                            }
                                            if (var10.field2694[var97] > 0) {
                                                boolean var102 = false;
                                                boolean var103 = false;
                                                int var104 = var10.field2694[var97] - 1;
                                                if (var100 + 32 > arg2 && var100 < arg4 && var101 + 32 > arg3 && var101 < arg5 || Statics.field129 == var10 && field328 == var97) {
                                                    class74 var105;
                                                    if (field450 == 1 && Statics.field1404 == var97 && Statics.field130 == var10.field2717) {
                                                        var105 = class47.method165(var104, var10.field2673[var97], 2, 0, 2, false);
                                                    } else {
                                                        var105 = class47.method165(var104, var10.field2673[var97], 1, 3153952, 2, false);
                                                    }
                                                    if (var105 == null) {
                                                        method572(var10);
                                                    } else if (Statics.field129 == var10 && field328 == var97) {
                                                        int var106 = class132.field2070 - field394;
                                                        int var107 = class132.field2067 - field395;
                                                        if (var106 < 5 && var106 > -5) {
                                                            var106 = 0;
                                                        }
                                                        if (var107 < 5 && var107 > -5) {
                                                            var107 = 0;
                                                        }
                                                        if (field404 < 5) {
                                                            var106 = 0;
                                                            var107 = 0;
                                                        }
                                                        var105.method1522(var100 + var106, var101 + var107, 128);
                                                        if (arg1 != -1) {
                                                            class164 var108 = arg0[arg1 & 0xFFFF];
                                                            if (var101 + var107 < class75.field1371 && var108.field2739 > 0) {
                                                                int var109 = field354 * (class75.field1371 - var101 - var107) / 3;
                                                                if (var109 > field354 * 10) {
                                                                    var109 = field354 * 10;
                                                                }
                                                                if (var109 > var108.field2739) {
                                                                    var109 = var108.field2739;
                                                                }
                                                                var108.field2739 -= var109;
                                                                field395 += var109;
                                                                method572(var108);
                                                            }
                                                            if (var101 + var107 + 32 > class75.field1372 && var108.field2739 < var108.field2672 - var108.field2765) {
                                                                int var110 = field354 * (var101 + var107 + 32 - class75.field1372) / 3;
                                                                if (var110 > field354 * 10) {
                                                                    var110 = field354 * 10;
                                                                }
                                                                if (var110 > var108.field2672 - var108.field2765 - var108.field2739) {
                                                                    var110 = var108.field2672 - var108.field2765 - var108.field2739;
                                                                }
                                                                var108.field2739 += var110;
                                                                field395 -= var110;
                                                                method572(var108);
                                                            }
                                                        }
                                                    } else if (Statics.field249 == var10 && field544 == var97) {
                                                        var105.method1522(var100, var101, 128);
                                                    } else {
                                                        var105.method1587(var100, var101);
                                                    }
                                                }
                                            } else if (var10.field2716 != null && var97 < 20) {
                                                class74 var111 = var10.method3041(var97);
                                                if (var111 != null) {
                                                    var111.method1587(var100, var101);
                                                } else if (class164.field2646) {
                                                    method572(var10);
                                                }
                                            }
                                            var97++;
                                        }
                                    }
                                } else if (var10.field2650 == 3) {
                                    int var112;
                                    if (method1684(var10)) {
                                        var112 = var10.field2704;
                                        if (Statics.field994 == var10 && var10.field2676 != 0) {
                                            var112 = var10.field2676;
                                        }
                                    } else {
                                        var112 = var10.field2742;
                                        if (Statics.field994 == var10 && var10.field2675 != 0) {
                                            var112 = var10.field2675;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2677) {
                                            class75.method1637(var13, var14, var10.field2663, var10.field2765, var112);
                                        } else {
                                            class75.method1614(var13, var14, var10.field2663, var10.field2765, var112);
                                        }
                                    } else if (var10.field2677) {
                                        class75.method1611(var13, var14, var10.field2663, var10.field2765, var112, 256 - (var15 & 0xFF));
                                    } else {
                                        class75.method1615(var13, var14, var10.field2663, var10.field2765, var112, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2650 == 4) {
                                    class215 var113 = var10.method3040();
                                    if (var113 != null) {
                                        String var114 = var10.field2680;
                                        int var115;
                                        if (method1684(var10)) {
                                            var115 = var10.field2704;
                                            if (Statics.field994 == var10 && var10.field2676 != 0) {
                                                var115 = var10.field2676;
                                            }
                                            if (var10.field2707.length() > 0) {
                                                var114 = var10.field2707;
                                            }
                                        } else {
                                            var115 = var10.field2742;
                                            if (Statics.field994 == var10 && var10.field2675 != 0) {
                                                var115 = var10.field2675;
                                            }
                                        }
                                        if (var10.field2647 && var10.field2667 != -1) {
                                            class47 var116 = class47.method2845(var10.field2667);
                                            var114 = var116.field1068;
                                            if (var114 == null) {
                                                var114 = "null";
                                            }
                                            if ((var116.field1092 == 1 || var10.field2743 != 1) && var10.field2743 != -1) {
                                                var114 = class2.method2134(16748608) + var114 + class2.field30 + " " + 'x' + method2162(var10.field2743);
                                            }
                                        }
                                        if (field546 == var10) {
                                            class148 var10000 = (class148) null;
                                            var114 = class148.field2360;
                                            var115 = var10.field2742;
                                        }
                                        if (!var10.field2647) {
                                            var114 = method2679(var114, var10);
                                        }
                                        var113.method3663(var114, var13, var14, var10.field2663, var10.field2765, var115, var10.field2711 ? 0 : -1, var10.field2709, var10.field2710, var10.field2708);
                                    } else if (class164.field2646) {
                                        method572(var10);
                                    }
                                } else if (var10.field2650 == 5) {
                                    if (var10.field2647) {
                                        class74 var118;
                                        if (var10.field2667 == -1) {
                                            var118 = var10.method3042(false);
                                        } else {
                                            var118 = class47.method165(var10.field2667, var10.field2743, var10.field2685, var10.field2686, var10.field2641, false);
                                        }
                                        if (var118 != null) {
                                            int var119 = var118.field1359;
                                            int var120 = var118.field1365;
                                            if (var10.field2684) {
                                                class75.method1607(var13, var14, var10.field2663 + var13, var10.field2765 + var14);
                                                int var121 = (var10.field2663 + (var119 - 1)) / var119;
                                                int var122 = (var10.field2765 + (var120 - 1)) / var120;
                                                for (int var123 = 0; var123 < var121; var123++) {
                                                    for (int var124 = 0; var124 < var122; var124++) {
                                                        if (var10.field2683 != 0) {
                                                            var118.method1529(var119 / 2 + var119 * var123 + var13, var120 / 2 + var120 * var124 + var14, var10.field2683, 4096);
                                                        } else if (var15 == 0) {
                                                            var118.method1587(var119 * var123 + var13, var120 * var124 + var14);
                                                        } else {
                                                            var118.method1522(var119 * var123 + var13, var120 * var124 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method1606(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var125 = var10.field2663 * 4096 / var119;
                                                if (var10.field2683 != 0) {
                                                    var118.method1529(var10.field2663 / 2 + var13, var10.field2765 / 2 + var14, var10.field2683, var125);
                                                } else if (var15 != 0) {
                                                    var118.method1593(var13, var14, var10.field2663, var10.field2765, 256 - (var15 & 0xFF));
                                                } else if (var10.field2663 == var119 && var10.field2765 == var120) {
                                                    var118.method1587(var13, var14);
                                                } else {
                                                    var118.method1518(var13, var14, var10.field2663, var10.field2765);
                                                }
                                            }
                                        } else if (class164.field2646) {
                                            method572(var10);
                                        }
                                    } else {
                                        class74 var117 = var10.method3042(method1684(var10));
                                        if (var117 != null) {
                                            var117.method1587(var13, var14);
                                        } else if (class164.field2646) {
                                            method572(var10);
                                        }
                                    }
                                } else if (var10.field2650 == 6) {
                                    boolean var126 = method1684(var10);
                                    int var127;
                                    if (var126) {
                                        var127 = var10.field2732;
                                    } else {
                                        var127 = var10.field2693;
                                    }
                                    class100 var128 = null;
                                    int var129 = 0;
                                    if (var10.field2667 != -1) {
                                        class47 var130 = class47.method2845(var10.field2667);
                                        if (var130 != null) {
                                            class47 var131 = var130.method902(var10.field2743);
                                            var128 = var131.method889(1);
                                            if (var128 == null) {
                                                method572(var10);
                                            } else {
                                                var128.method2061();
                                                var129 = var128.field1409 / 2;
                                            }
                                        }
                                    } else if (var10.field2689 == 5) {
                                        if (var10.field2690 == 0) {
                                            var128 = field559.method3143((class40) null, -1, (class40) null, -1);
                                        } else {
                                            var128 = Statics.field1994.method17();
                                        }
                                    } else if (var127 == -1) {
                                        var128 = var10.method3035((class40) null, -1, var126, Statics.field1994.field47);
                                        if (var128 == null && class164.field2646) {
                                            method572(var10);
                                        }
                                    } else {
                                        class40 var132 = class40.method2146(var127);
                                        var128 = var10.method3035(var132, var10.field2768, var126, Statics.field1994.field47);
                                        if (var128 == null && class164.field2646) {
                                            method572(var10);
                                        }
                                    }
                                    class86.method1902(var10.field2663 / 2 + var13, var10.field2765 / 2 + var14);
                                    int var133 = var10.field2700 * class86.field1539[var10.field2706] >> 16;
                                    int var134 = var10.field2700 * class86.field1540[var10.field2706] >> 16;
                                    if (var128 != null) {
                                        if (var10.field2647) {
                                            var128.method2061();
                                            if (var10.field2703) {
                                                var128.method2074(0, var10.field2698, var10.field2670, var10.field2706, var10.field2718, var10.field2696 + var129 + var133, var10.field2696 + var134, var10.field2700);
                                            } else {
                                                var128.method2073(0, var10.field2698, var10.field2670, var10.field2706, var10.field2718, var10.field2696 + var129 + var133, var10.field2696 + var134);
                                            }
                                        } else {
                                            var128.method2073(0, var10.field2698, 0, var10.field2706, 0, var133, var134);
                                        }
                                    }
                                    class86.method1868();
                                } else {
                                    if (var10.field2650 == 7) {
                                        class215 var135 = var10.method3040();
                                        if (var135 == null) {
                                            if (class164.field2646) {
                                                method572(var10);
                                            }
                                            continue;
                                        }
                                        int var136 = 0;
                                        for (int var137 = 0; var137 < var10.field2660; var137++) {
                                            for (int var138 = 0; var138 < var10.field2659; var138++) {
                                                if (var10.field2694[var136] > 0) {
                                                    class47 var139 = class47.method2845(var10.field2694[var136] - 1);
                                                    String var140;
                                                    if (var139.field1092 != 1 && var10.field2673[var136] == 1) {
                                                        var140 = class2.method2134(16748608) + var139.field1068 + class2.field30;
                                                    } else {
                                                        var140 = class2.method2134(16748608) + var139.field1068 + class2.field30 + " " + 'x' + method2162(var10.field2673[var136]);
                                                    }
                                                    int var141 = (var10.field2712 + 115) * var138 + var13;
                                                    int var142 = (var10.field2755 + 12) * var137 + var14;
                                                    if (var10.field2709 == 0) {
                                                        var135.method3654(var140, var141, var142, var10.field2742, var10.field2711 ? 0 : -1);
                                                    } else if (var10.field2709 == 1) {
                                                        var135.method3662(var140, var10.field2663 / 2 + var141, var142, var10.field2742, var10.field2711 ? 0 : -1);
                                                    } else {
                                                        var135.method3661(var140, var10.field2663 + var141 - 1, var142, var10.field2742, var10.field2711 ? 0 : -1);
                                                    }
                                                }
                                                var136++;
                                            }
                                        }
                                    }
                                    if (var10.field2650 == 8 && Statics.field973 == var10 && field499 == field290) {
                                        int var143 = 0;
                                        int var144 = 0;
                                        class215 var145 = Statics.field676;
                                        String var146 = var10.field2680;
                                        String var147 = method2679(var146, var10);
                                        while (var147.length() > 0) {
                                            int var148 = var147.indexOf(class2.field27);
                                            String var149;
                                            if (var148 == -1) {
                                                var149 = var147;
                                                var147 = "";
                                            } else {
                                                var149 = var147.substring(0, var148);
                                                var147 = var147.substring(var148 + 4);
                                            }
                                            int var150 = var145.method3655(var149);
                                            if (var150 > var143) {
                                                var143 = var150;
                                            }
                                            var144 += var145.field3091 + 1;
                                        }
                                        var143 += 6;
                                        var144 += 7;
                                        int var151 = var10.field2663 + var13 - 5 - var143;
                                        int var152 = var10.field2765 + var14 + 5;
                                        if (var151 < var13 + 5) {
                                            var151 = var13 + 5;
                                        }
                                        if (var143 + var151 > arg4) {
                                            var151 = arg4 - var143;
                                        }
                                        if (var144 + var152 > arg5) {
                                            var152 = arg5 - var144;
                                        }
                                        class75.method1637(var151, var152, var143, var144, 16777120);
                                        class75.method1614(var151, var152, var143, var144, 0);
                                        String var153 = var10.field2680;
                                        int var154 = var145.field3091 + var152 + 2;
                                        String var155 = method2679(var153, var10);
                                        while (var155.length() > 0) {
                                            int var156 = var155.indexOf(class2.field27);
                                            String var157;
                                            if (var156 == -1) {
                                                var157 = var155;
                                                var155 = "";
                                            } else {
                                                var157 = var155.substring(0, var156);
                                                var155 = var155.substring(var156 + 4);
                                            }
                                            var145.method3654(var157, var151 + 3, var154, 0, -1);
                                            var154 += var145.field3091 + 1;
                                        }
                                    }
                                    if (var10.field2650 == 9) {
                                        if (var10.field2679 == 1) {
                                            int var158;
                                            int var159;
                                            int var160;
                                            int var161;
                                            if (var10.field2766) {
                                                var158 = var13;
                                                var159 = var10.field2765 + var14;
                                                var160 = var10.field2663 + var13;
                                                var161 = var14;
                                            } else {
                                                var158 = var13;
                                                var159 = var14;
                                                var160 = var10.field2663 + var13;
                                                var161 = var10.field2765 + var14;
                                            }
                                            class75.method1609(var158, var159, var160, var161, var10.field2742);
                                        } else {
                                            int var162 = var10.field2663 >= 0 ? var10.field2663 : -var10.field2663;
                                            int var163 = var10.field2765 >= 0 ? var10.field2765 : -var10.field2765;
                                            int var164 = var162;
                                            if (var162 < var163) {
                                                var164 = var163;
                                            }
                                            if (var164 != 0) {
                                                int var165 = (var10.field2663 << 16) / var164;
                                                int var166 = (var10.field2765 << 16) / var164;
                                                if (var166 <= var165) {
                                                    var165 = -var165;
                                                } else {
                                                    var166 = -var166;
                                                }
                                                int var167 = var10.field2679 * var166 >> 17;
                                                int var168 = var10.field2679 * var166 + 1 >> 17;
                                                int var169 = var10.field2679 * var165 >> 17;
                                                int var170 = var10.field2679 * var165 + 1 >> 17;
                                                int var171 = var13 + var167;
                                                int var172 = var13 - var168;
                                                int var173 = var10.field2663 + var13 - var168;
                                                int var174 = var10.field2663 + var13 + var167;
                                                int var175 = var14 + var169;
                                                int var176 = var14 - var170;
                                                int var177 = var10.field2765 + var14 - var170;
                                                int var178 = var10.field2765 + var14 + var169;
                                                class86.method1874(var171, var172, var173);
                                                class86.method1877(var175, var176, var177, var171, var172, var173, var10.field2742);
                                                class86.method1874(var171, var173, var174);
                                                class86.method1877(var175, var177, var178, var171, var173, var174, var10.field2742);
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

    @ObfuscatedName("ed.cx(Ljava/lang/String;Lfu;I)Ljava/lang/String;")
    public static String method2679(String arg0, class164 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2636(method159(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field2951 != null) {
                    int var6 = Statics.field2951.field2125;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field2951.field2123 != null) {
                        var5 = (String) Statics.field2951.field2123;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("de.cn(II)Ljava/lang/String;")
    public static final String method2162(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field21 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2134(65408) + var1.substring(0, var1.length() - 8) + class148.field2363 + " " + class2.field23 + var1 + class2.field20 + class2.field30;
        } else if (var1.length() > 6) {
            return " " + class2.method2134(16777215) + var1.substring(0, var1.length() - 4) + class148.field2442 + " " + class2.field23 + var1 + class2.field20 + class2.field30;
        } else {
            return " " + class2.method2134(16776960) + var1 + class2.field30;
        }
    }

    @ObfuscatedName("at.cg(Lfu;B)V")
    public static void method666(class164 arg0) {
        class164 var1 = arg0.field2724 == -1 ? null : class164.method560(arg0.field2724);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1408;
            var3 = Statics.field1949;
        } else {
            var2 = var1.field2663;
            var3 = var1.field2765;
        }
        method2789(arg0, var2, var3, false);
        method528(arg0, var2, var3);
    }

    @ObfuscatedName("fn.cr([Lfu;Lfu;ZI)V")
    public static void method3375(class164[] arg0, class164 arg1, boolean arg2) {
        int var3 = arg1.field2645 == 0 ? arg1.field2663 : arg1.field2645;
        int var4 = arg1.field2672 == 0 ? arg1.field2765 : arg1.field2672;
        method30(arg0, arg1.field2717, var3, var4, arg2);
        if (arg1.field2770 != null) {
            method30(arg1.field2770, arg1.field2717, var3, var4, arg2);
        }
        class4 var5 = (class4) field443.method3425((long) arg1.field2717);
        if (var5 != null) {
            method153(var5.field72, var3, var4, arg2);
        }
        if (arg1.field2652 == 1337) {
        }
    }

    @ObfuscatedName("q.cm(IIIZI)V")
    public static final void method153(int arg0, int arg1, int arg2, boolean arg3) {
        if (class164.method915(arg0)) {
            method30(Statics.field2764[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("s.cu([Lfu;IIIZI)V")
    public static void method30(class164[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class164 var6 = arg0[var5];
            if (var6 != null && var6.field2724 == arg1) {
                method2789(var6, arg2, arg3, arg4);
                method528(var6, arg2, arg3);
                if (var6.field2669 > var6.field2645 - var6.field2663) {
                    var6.field2669 = var6.field2645 - var6.field2663;
                }
                if (var6.field2669 < 0) {
                    var6.field2669 = 0;
                }
                if (var6.field2739 > var6.field2672 - var6.field2765) {
                    var6.field2739 = var6.field2672 - var6.field2765;
                }
                if (var6.field2739 < 0) {
                    var6.field2739 = 0;
                }
                if (var6.field2650 == 0) {
                    method3375(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("eh.cf(Lfu;IIZB)V")
    public static void method2789(class164 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2663;
        int var5 = arg0.field2765;
        if (arg0.field2655 == 0) {
            arg0.field2663 = arg0.field2659;
        } else if (arg0.field2655 == 1) {
            arg0.field2663 = arg1 - arg0.field2659;
        } else if (arg0.field2655 == 2) {
            arg0.field2663 = arg0.field2659 * arg1 >> 14;
        }
        if (arg0.field2745 == 0) {
            arg0.field2765 = arg0.field2660;
        } else if (arg0.field2745 == 1) {
            arg0.field2765 = arg2 - arg0.field2660;
        } else if (arg0.field2745 == 2) {
            arg0.field2765 = arg0.field2660 * arg2 >> 14;
        }
        if (arg0.field2655 == 4) {
            arg0.field2663 = arg0.field2765 * arg0.field2665 / arg0.field2666;
        }
        if (arg0.field2745 == 4) {
            arg0.field2765 = arg0.field2666 * arg0.field2663 / arg0.field2665;
        }
        if (field329 && arg0.field2650 == 0) {
            if (arg0.field2765 < 5 && arg0.field2663 < 5) {
                arg0.field2765 = 5;
                arg0.field2663 = 5;
            } else {
                if (arg0.field2765 <= 0) {
                    arg0.field2765 = 5;
                }
                if (arg0.field2663 <= 0) {
                    arg0.field2663 = 5;
                }
            }
        }
        if (arg0.field2652 == 1337) {
            field376 = arg0;
        }
        if (arg3 && arg0.field2674 != null && (arg0.field2663 != var4 || arg0.field2765 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field16 = arg0.field2674;
            field483.method3463(var6);
        }
    }

    @ObfuscatedName("u.ci(Lfu;IIB)V")
    public static void method528(class164 arg0, int arg1, int arg2) {
        if (arg0.field2779 == 0) {
            arg0.field2661 = arg0.field2657;
        } else if (arg0.field2779 == 1) {
            arg0.field2661 = (arg1 - arg0.field2663) / 2 + arg0.field2657;
        } else if (arg0.field2779 == 2) {
            arg0.field2661 = arg1 - arg0.field2663 - arg0.field2657;
        } else if (arg0.field2779 == 3) {
            arg0.field2661 = arg0.field2657 * arg1 >> 14;
        } else if (arg0.field2779 == 4) {
            arg0.field2661 = (arg0.field2657 * arg1 >> 14) + (arg1 - arg0.field2663) / 2;
        } else {
            arg0.field2661 = arg1 - arg0.field2663 - (arg0.field2657 * arg1 >> 14);
        }
        if (arg0.field2654 == 0) {
            arg0.field2734 = arg0.field2658;
        } else if (arg0.field2654 == 1) {
            arg0.field2734 = (arg2 - arg0.field2765) / 2 + arg0.field2658;
        } else if (arg0.field2654 == 2) {
            arg0.field2734 = arg2 - arg0.field2765 - arg0.field2658;
        } else if (arg0.field2654 == 3) {
            arg0.field2734 = arg0.field2658 * arg2 >> 14;
        } else if (arg0.field2654 == 4) {
            arg0.field2734 = (arg0.field2658 * arg2 >> 14) + (arg2 - arg0.field2765) / 2;
        } else {
            arg0.field2734 = arg2 - arg0.field2765 - (arg0.field2658 * arg2 >> 14);
        }
        if (!field329 || arg0.field2650 != 0) {
            return;
        }
        if (arg0.field2661 < 0) {
            arg0.field2661 = 0;
        } else if (arg0.field2663 + arg0.field2661 > arg1) {
            arg0.field2661 = arg1 - arg0.field2663;
        }
        if (arg0.field2734 < 0) {
            arg0.field2734 = 0;
        } else if (arg0.field2765 + arg0.field2734 > arg2) {
            arg0.field2734 = arg2 - arg0.field2765;
        }
    }

    @ObfuscatedName("dj.ca(IB)Ljava/lang/String;")
    public static final String method2636(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ce.cc(Lfu;I)Z")
    public static final boolean method1684(class164 arg0) {
        if (arg0.field2759 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2759.length; var1++) {
            int var2 = method159(arg0, var1);
            int var3 = arg0.field2760[var1];
            if (arg0.field2759[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2759[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2759[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("r.cw(Lfu;IB)I")
    public static final int method159(class164 arg0, int arg1) {
        if (arg0.field2758 == null || arg1 >= arg0.field2758.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2758[arg1];
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
                    var7 = field419[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field420[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field421[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class164 var11 = class164.method560(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class47.method2845(var12).field1091 || field284)) {
                        for (int var13 = 0; var13 < var11.field2694.length; var13++) {
                            if (var12 + 1 == var11.field2694[var13]) {
                                var7 += var11.field2673[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class167.field2796[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class146.field2185[field420[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class167.field2796[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1994.field44;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class146.field2184[var14]) {
                            var7 += field420[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class164 var17 = class164.method560(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class47.method2845(var18).field1091 || field284)) {
                        for (int var19 = 0; var19 < var17.field2694.length; var19++) {
                            if (var18 + 1 == var17.field2694[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field373;
                }
                if (var6 == 12) {
                    var7 = field448;
                }
                if (var6 == 13) {
                    int var20 = class167.field2796[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = Statics.method110(var22);
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
                    var7 = (Statics.field1994.field830 >> 7) + Statics.field2594;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1994.field828 >> 7) + Statics.field954;
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

    @ObfuscatedName("aj.cl([Lfu;IIIIIIII)V")
    public static final void method562(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class164 var9 = arg0[var8];
            if (var9 != null && (!var9.field2647 || var9.field2650 == 0 || var9.field2726 || Statics.method74(var9) != 0 || field456 == var9 || var9.field2652 == 1338) && var9.field2724 == arg1 && (!var9.field2647 || !method94(var9))) {
                int var10 = var9.field2661 + arg6;
                int var11 = var9.field2734 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2650 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2650 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2663 + var10;
                    int var19 = var9.field2765 + var11;
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
                    int var22 = var9.field2663 + var10;
                    int var23 = var9.field2765 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field455 == var9) {
                    field463 = true;
                    field464 = var10;
                    field402 = var11;
                }
                if (!var9.field2647 || var12 < var14 && var13 < var15) {
                    int var24 = class132.field2070;
                    int var25 = class132.field2067;
                    if (class132.field2065 != 0) {
                        var24 = class132.field2066;
                        var25 = class132.field2060;
                    }
                    if (var9.field2652 == 1337) {
                        if (!field293 && !field528 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2831(var24, var25, var12, var13);
                        }
                    } else if (var9.field2652 == 1338) {
                        method557(var9, var10, var11);
                    } else {
                        if (!field528 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2651 == 1) {
                                method95(var9.field2763, "", 24, 0, 0, var9.field2717);
                            }
                            if (var9.field2651 == 2 && !field393) {
                                String var28 = method3363(var9);
                                if (var28 != null) {
                                    method95(var28, class2.method2134(65280) + var9.field2762, 25, 0, -1, var9.field2717);
                                }
                            }
                            if (var9.field2651 == 3) {
                                method95(class148.field2361, "", 26, 0, 0, var9.field2717);
                            }
                            if (var9.field2651 == 4) {
                                method95(var9.field2763, "", 28, 0, 0, var9.field2717);
                            }
                            if (var9.field2651 == 5) {
                                method95(var9.field2763, "", 29, 0, 0, var9.field2717);
                            }
                            if (var9.field2651 == 6 && field546 == null) {
                                method95(var9.field2763, "", 30, 0, -1, var9.field2717);
                            }
                            if (var9.field2650 == 2) {
                                int var29 = 0;
                                for (int var30 = 0; var30 < var9.field2765; var30++) {
                                    for (int var31 = 0; var31 < var9.field2663; var31++) {
                                        int var32 = (var9.field2712 + 32) * var31;
                                        int var33 = (var9.field2755 + 32) * var30;
                                        if (var29 < 20) {
                                            var32 += var9.field2714[var29];
                                            var33 += var9.field2715[var29];
                                        }
                                        if (var26 >= var32 && var27 >= var33 && var26 < var32 + 32 && var27 < var33 + 32) {
                                            field396 = var29;
                                            Statics.field102 = var9;
                                            if (var9.field2694[var29] > 0) {
                                                class47 var34 = class47.method2845(var9.field2694[var29] - 1);
                                                if (field450 == 1 && class169.method2825(Statics.method74(var9))) {
                                                    if (Statics.field130 != var9.field2717 || Statics.field1404 != var29) {
                                                        method95(class148.field2336, field436 + " " + class2.field25 + " " + class2.method2134(16748608) + var34.field1068, 31, var34.field1076, var29, var9.field2717);
                                                    }
                                                } else if (!field393 || !class169.method2825(Statics.method74(var9))) {
                                                    String[] var35 = var34.field1093;
                                                    if (field538) {
                                                        var35 = method157(var35);
                                                    }
                                                    if (class169.method2825(Statics.method74(var9))) {
                                                        for (int var36 = 4; var36 >= 3; var36--) {
                                                            if (var35 != null && var35[var36] != null) {
                                                                byte var37;
                                                                if (var36 == 3) {
                                                                    var37 = 36;
                                                                } else {
                                                                    var37 = 37;
                                                                }
                                                                method95(var35[var36], class2.method2134(16748608) + var34.field1068, var37, var34.field1076, var29, var9.field2717);
                                                            } else if (var36 == 4) {
                                                                method95(class148.field2203, class2.method2134(16748608) + var34.field1068, 37, var34.field1076, var29, var9.field2717);
                                                            }
                                                        }
                                                    }
                                                    int var38 = Statics.method74(var9);
                                                    boolean var39 = (var38 >> 31 & 0x1) != 0;
                                                    if (var39) {
                                                        method95(class148.field2336, class2.method2134(16748608) + var34.field1068, 38, var34.field1076, var29, var9.field2717);
                                                    }
                                                    class169 var10000 = (class169) null;
                                                    if (class169.method2825(Statics.method74(var9)) && var35 != null) {
                                                        for (int var40 = 2; var40 >= 0; var40--) {
                                                            if (var35[var40] != null) {
                                                                byte var41 = 0;
                                                                if (var40 == 0) {
                                                                    var41 = 33;
                                                                }
                                                                if (var40 == 1) {
                                                                    var41 = 34;
                                                                }
                                                                if (var40 == 2) {
                                                                    var41 = 35;
                                                                }
                                                                method95(var35[var40], class2.method2134(16748608) + var34.field1068, var41, var34.field1076, var29, var9.field2717);
                                                            }
                                                        }
                                                    }
                                                    String[] var42 = var9.field2643;
                                                    if (field538) {
                                                        var42 = method157(var42);
                                                    }
                                                    if (var42 != null) {
                                                        for (int var43 = 4; var43 >= 0; var43--) {
                                                            if (var42[var43] != null) {
                                                                byte var44 = 0;
                                                                if (var43 == 0) {
                                                                    var44 = 39;
                                                                }
                                                                if (var43 == 1) {
                                                                    var44 = 40;
                                                                }
                                                                if (var43 == 2) {
                                                                    var44 = 41;
                                                                }
                                                                if (var43 == 3) {
                                                                    var44 = 42;
                                                                }
                                                                if (var43 == 4) {
                                                                    var44 = 43;
                                                                }
                                                                method95(var42[var43], class2.method2134(16748608) + var34.field1068, var44, var34.field1076, var29, var9.field2717);
                                                            }
                                                        }
                                                    }
                                                    method95(class148.field2353, class2.method2134(16748608) + var34.field1068, 1005, var34.field1076, var29, var9.field2717);
                                                } else if ((Statics.field1509 & 0x10) == 16) {
                                                    method95(field440, field441 + " " + class2.field25 + " " + class2.method2134(16748608) + var34.field1068, 32, var34.field1076, var29, var9.field2717);
                                                }
                                            }
                                        }
                                        var29++;
                                    }
                                }
                            }
                            if (var9.field2647) {
                                if (!field393) {
                                    for (int var45 = 9; var45 >= 5; var45--) {
                                        String var46 = method137(var9, var45);
                                        if (var46 != null) {
                                            method95(var46, var9.field2719, 1007, var45 + 1, var9.field2649, var9.field2717);
                                        }
                                    }
                                    String var47 = method3363(var9);
                                    if (var47 != null) {
                                        method95(var47, var9.field2719, 25, 0, var9.field2649, var9.field2717);
                                    }
                                    for (int var48 = 4; var48 >= 0; var48--) {
                                        String var49 = method137(var9, var48);
                                        if (var49 != null) {
                                            method95(var49, var9.field2719, 57, var48 + 1, var9.field2649, var9.field2717);
                                        }
                                    }
                                    if (class169.method1688(Statics.method74(var9))) {
                                        method95(class148.field2207, "", 30, 0, var9.field2649, var9.field2717);
                                    }
                                } else if (class169.method2042(Statics.method74(var9)) && (Statics.field1509 & 0x20) == 32) {
                                    method95(field440, field441 + " " + class2.field25 + " " + var9.field2719, 58, 0, var9.field2649, var9.field2717);
                                }
                            }
                        }
                        if (var9.field2650 == 0) {
                            if (!var9.field2647 && method94(var9) && Statics.field994 != var9) {
                                continue;
                            }
                            method562(arg0, var9.field2717, var12, var13, var14, var15, var10 - var9.field2669, var11 - var9.field2739);
                            if (var9.field2770 != null) {
                                method562(var9.field2770, var9.field2717, var12, var13, var14, var15, var10 - var9.field2669, var11 - var9.field2739);
                            }
                            class4 var50 = (class4) field443.method3425((long) var9.field2717);
                            if (var50 != null) {
                                if (var50.field69 == 0 && class132.field2070 >= var12 && class132.field2067 >= var13 && class132.field2070 < var14 && class132.field2067 < var15 && !field528 && !field329) {
                                    field429[0] = class148.field2438;
                                    field430[0] = "";
                                    field427[0] = 1006;
                                    field424 = 1;
                                }
                                int var51 = var50.field72;
                                if (class164.method915(var51)) {
                                    method562(Statics.field2764[var51], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2647) {
                            if (var9.field2662 && class132.field2070 >= var12 && class132.field2067 >= var13 && class132.field2070 < var14 && class132.field2067 < var15) {
                                for (class1 var52 = (class1) field483.method3468(); var52 != null; var52 = (class1) field483.method3470()) {
                                    if (var52.field8) {
                                        var52.method3554();
                                        var52.field3.field2648 = false;
                                    }
                                }
                                if (Statics.field1986 == 0) {
                                    field455 = null;
                                    field456 = null;
                                }
                                if (!field528) {
                                    field429[0] = class148.field2438;
                                    field430[0] = "";
                                    field427[0] = 1006;
                                    field424 = 1;
                                }
                            }
                            boolean var53;
                            if (class132.field2070 >= var12 && class132.field2067 >= var13 && class132.field2070 < var14 && class132.field2067 < var15) {
                                var53 = true;
                            } else {
                                var53 = false;
                            }
                            boolean var54 = false;
                            if ((class132.field2062 == 1 || !Statics.field568 && class132.field2062 == 4) && var53) {
                                var54 = true;
                            }
                            boolean var55 = false;
                            if ((class132.field2065 == 1 || !Statics.field568 && class132.field2065 == 4) && class132.field2066 >= var12 && class132.field2060 >= var13 && class132.field2066 < var14 && class132.field2060 < var15) {
                                var55 = true;
                            }
                            if (var55) {
                                method15(var9, class132.field2066 - var10, class132.field2060 - var11);
                            }
                            if (field455 != null && field455 != var9 && var53) {
                                int var56 = Statics.method74(var9);
                                boolean var57 = (var56 >> 20 & 0x1) != 0;
                                if (var57) {
                                    field459 = var9;
                                }
                            }
                            if (field456 == var9) {
                                field460 = true;
                                field407 = var10;
                                field520 = var11;
                            }
                            if (var9.field2726) {
                                if (var53 && field482 != 0 && var9.field2747 != null) {
                                    class1 var58 = new class1();
                                    var58.field8 = true;
                                    var58.field3 = var9;
                                    var58.field2 = field482;
                                    var58.field16 = var9.field2747;
                                    field483.method3463(var58);
                                }
                                if (field455 != null || Statics.field129 != null || field528) {
                                    var55 = false;
                                    var54 = false;
                                    var53 = false;
                                }
                                if (!var9.field2699 && var55) {
                                    var9.field2699 = true;
                                    if (var9.field2656 != null) {
                                        class1 var59 = new class1();
                                        var59.field8 = true;
                                        var59.field3 = var9;
                                        var59.field1 = class132.field2066 - var10;
                                        var59.field2 = class132.field2060 - var11;
                                        var59.field16 = var9.field2656;
                                        field483.method3463(var59);
                                    }
                                }
                                if (var9.field2699 && var54 && var9.field2729 != null) {
                                    class1 var60 = new class1();
                                    var60.field8 = true;
                                    var60.field3 = var9;
                                    var60.field1 = class132.field2070 - var10;
                                    var60.field2 = class132.field2067 - var11;
                                    var60.field16 = var9.field2729;
                                    field483.method3463(var60);
                                }
                                if (var9.field2699 && !var54) {
                                    var9.field2699 = false;
                                    if (var9.field2730 != null) {
                                        class1 var61 = new class1();
                                        var61.field8 = true;
                                        var61.field3 = var9;
                                        var61.field1 = class132.field2070 - var10;
                                        var61.field2 = class132.field2067 - var11;
                                        var61.field16 = var9.field2730;
                                        field485.method3463(var61);
                                    }
                                }
                                if (var54 && var9.field2664 != null) {
                                    class1 var62 = new class1();
                                    var62.field8 = true;
                                    var62.field3 = var9;
                                    var62.field1 = class132.field2070 - var10;
                                    var62.field2 = class132.field2067 - var11;
                                    var62.field16 = var9.field2664;
                                    field483.method3463(var62);
                                }
                                if (!var9.field2648 && var53) {
                                    var9.field2648 = true;
                                    if (var9.field2697 != null) {
                                        class1 var63 = new class1();
                                        var63.field8 = true;
                                        var63.field3 = var9;
                                        var63.field1 = class132.field2070 - var10;
                                        var63.field2 = class132.field2067 - var11;
                                        var63.field16 = var9.field2697;
                                        field483.method3463(var63);
                                    }
                                }
                                if (var9.field2648 && var53 && var9.field2733 != null) {
                                    class1 var64 = new class1();
                                    var64.field8 = true;
                                    var64.field3 = var9;
                                    var64.field1 = class132.field2070 - var10;
                                    var64.field2 = class132.field2067 - var11;
                                    var64.field16 = var9.field2733;
                                    field483.method3463(var64);
                                }
                                if (var9.field2648 && !var53) {
                                    var9.field2648 = false;
                                    if (var9.field2772 != null) {
                                        class1 var65 = new class1();
                                        var65.field8 = true;
                                        var65.field3 = var9;
                                        var65.field1 = class132.field2070 - var10;
                                        var65.field2 = class132.field2067 - var11;
                                        var65.field16 = var9.field2772;
                                        field485.method3463(var65);
                                    }
                                }
                                if (var9.field2681 != null) {
                                    class1 var66 = new class1();
                                    var66.field3 = var9;
                                    var66.field16 = var9.field2681;
                                    field484.method3463(var66);
                                }
                                if (var9.field2780 != null && field481 > var9.field2653) {
                                    if (var9.field2740 == null || field481 - var9.field2653 > 32) {
                                        class1 var71 = new class1();
                                        var71.field3 = var9;
                                        var71.field16 = var9.field2780;
                                        field483.method3463(var71);
                                    } else {
                                        label696: for (int var67 = var9.field2653; var67 < field481; var67++) {
                                            int var68 = field461[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var9.field2740.length; var69++) {
                                                if (var9.field2740[var69] == var68) {
                                                    class1 var70 = new class1();
                                                    var70.field3 = var9;
                                                    var70.field16 = var9.field2780;
                                                    field483.method3463(var70);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2653 = field481;
                                }
                                if (var9.field2741 != null && field471 > var9.field2687) {
                                    if (var9.field2713 == null || field471 - var9.field2687 > 32) {
                                        class1 var76 = new class1();
                                        var76.field3 = var9;
                                        var76.field16 = var9.field2741;
                                        field483.method3463(var76);
                                    } else {
                                        label672: for (int var72 = var9.field2687; var72 < field471; var72++) {
                                            int var73 = field470[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var9.field2713.length; var74++) {
                                                if (var9.field2713[var74] == var73) {
                                                    class1 var75 = new class1();
                                                    var75.field3 = var9;
                                                    var75.field16 = var9.field2741;
                                                    field483.method3463(var75);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2687 = field471;
                                }
                                if (var9.field2776 != null && field494 > var9.field2671) {
                                    if (var9.field2744 == null || field494 - var9.field2671 > 32) {
                                        class1 var81 = new class1();
                                        var81.field3 = var9;
                                        var81.field16 = var9.field2776;
                                        field483.method3463(var81);
                                    } else {
                                        label648: for (int var77 = var9.field2671; var77 < field494; var77++) {
                                            int var78 = field472[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var9.field2744.length; var79++) {
                                                if (var9.field2744[var79] == var78) {
                                                    class1 var80 = new class1();
                                                    var80.field3 = var9;
                                                    var80.field16 = var9.field2776;
                                                    field483.method3463(var80);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2671 = field494;
                                }
                                if (field474 > var9.field2773 && var9.field2728 != null) {
                                    class1 var82 = new class1();
                                    var82.field3 = var9;
                                    var82.field16 = var9.field2728;
                                    field483.method3463(var82);
                                }
                                if (field475 > var9.field2773 && var9.field2750 != null) {
                                    class1 var83 = new class1();
                                    var83.field3 = var9;
                                    var83.field16 = var9.field2750;
                                    field483.method3463(var83);
                                }
                                if (field476 > var9.field2773 && var9.field2751 != null) {
                                    class1 var84 = new class1();
                                    var84.field3 = var9;
                                    var84.field16 = var9.field2751;
                                    field483.method3463(var84);
                                }
                                if (field477 > var9.field2773 && var9.field2771 != null) {
                                    class1 var85 = new class1();
                                    var85.field3 = var9;
                                    var85.field16 = var9.field2771;
                                    field483.method3463(var85);
                                }
                                if (field478 > var9.field2773 && var9.field2757 != null) {
                                    class1 var86 = new class1();
                                    var86.field3 = var9;
                                    var86.field16 = var9.field2757;
                                    field483.method3463(var86);
                                }
                                if (field411 > var9.field2773 && var9.field2725 != null) {
                                    class1 var87 = new class1();
                                    var87.field3 = var9;
                                    var87.field16 = var9.field2725;
                                    field483.method3463(var87);
                                }
                                var9.field2773 = field467;
                                if (var9.field2749 != null) {
                                    for (int var88 = 0; var88 < field507; var88++) {
                                        class1 var89 = new class1();
                                        var89.field3 = var9;
                                        var89.field9 = field509[var88];
                                        var89.field5 = field352[var88];
                                        var89.field16 = var9.field2749;
                                        field483.method3463(var89);
                                    }
                                }
                            }
                        }
                        if (!var9.field2647 && field455 == null && Statics.field129 == null && !field528) {
                            if ((var9.field2761 >= 0 || var9.field2675 != 0) && class132.field2070 >= var12 && class132.field2067 >= var13 && class132.field2070 < var14 && class132.field2067 < var15) {
                                if (var9.field2761 >= 0) {
                                    Statics.field994 = arg0[var9.field2761];
                                } else {
                                    Statics.field994 = var9;
                                }
                            }
                            if (var9.field2650 == 8 && class132.field2070 >= var12 && class132.field2067 >= var13 && class132.field2070 < var14 && class132.field2067 < var15) {
                                Statics.field973 = var9;
                            }
                            if (var9.field2672 > var9.field2765) {
                                int var90 = var9.field2663 + var10;
                                int var91 = var9.field2765;
                                int var92 = var9.field2672;
                                int var93 = class132.field2070;
                                int var94 = class132.field2067;
                                if (field361) {
                                    field335 = 32;
                                } else {
                                    field335 = 0;
                                }
                                field361 = false;
                                if (class132.field2062 == 1 || !Statics.field568 && class132.field2062 == 4) {
                                    if (var93 >= var90 && var93 < var90 + 16 && var94 >= var11 && var94 < var11 + 16) {
                                        var9.field2739 -= 4;
                                        method572(var9);
                                    } else if (var93 >= var90 && var93 < var90 + 16 && var94 >= var11 + var91 - 16 && var94 < var11 + var91) {
                                        var9.field2739 += 4;
                                        method572(var9);
                                    } else if (var93 >= var90 - field335 && var93 < field335 + var90 + 16 && var94 >= var11 + 16 && var94 < var11 + var91 - 16) {
                                        int var95 = (var91 - 32) * var91 / var92;
                                        if (var95 < 8) {
                                            var95 = 8;
                                        }
                                        int var96 = var94 - var11 - 16 - var95 / 2;
                                        int var97 = var91 - 32 - var95;
                                        var9.field2739 = (var92 - var91) * var96 / var97;
                                        method572(var9);
                                        field361 = true;
                                    }
                                }
                                if (field482 != 0) {
                                    int var98 = var9.field2663;
                                    if (var93 >= var90 - var98 && var94 >= var11 && var93 < var90 + 16 && var94 <= var11 + var91) {
                                        var9.field2739 += field482 * 45;
                                        method572(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.cs(IIB)V")
    public static final void method934(int arg0, int arg1) {
        if (class164.method915(arg0)) {
            method1955(Statics.field2764[arg0], arg1);
        }
    }

    @ObfuscatedName("cr.cb([Lfu;II)V")
    public static final void method1955(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2650 == 0) {
                    if (var3.field2770 != null) {
                        method1955(var3.field2770, arg1);
                    }
                    class4 var4 = (class4) field443.method3425((long) var3.field2717);
                    if (var4 != null) {
                        method934(var4.field72, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2753 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field16 = var3.field2753;
                    class34.method97(var5);
                }
                if (arg1 == 1 && var3.field2722 != null) {
                    if (var3.field2649 >= 0) {
                        class164 var6 = class164.method560(var3.field2717);
                        if (var6 == null || var6.field2770 == null || var3.field2649 >= var6.field2770.length || var6.field2770[var3.field2649] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field16 = var3.field2722;
                    class34.method97(var7);
                }
            }
        }
    }

    @ObfuscatedName("g.ct(Lfu;III)V")
    public static final void method15(class164 arg0, int arg1, int arg2) {
        if (field455 != null || field528 || arg0 == null) {
            return;
        }
        class164 var3 = method530(arg0);
        if (var3 == null) {
            var3 = arg0.field2721;
        }
        if (var3 == null) {
            return;
        }
        field455 = arg0;
        class164 var5 = method530(arg0);
        if (var5 == null) {
            var5 = arg0.field2721;
        }
        field456 = var5;
        field457 = arg1;
        field458 = arg2;
        Statics.field1986 = 0;
        field466 = false;
        if (field424 > 0) {
            int var7 = field424 - 1;
            Statics.field1303 = new class29();
            Statics.field1303.field696 = field409[var7];
            Statics.field1303.field691 = field347[var7];
            Statics.field1303.field692 = field427[var7];
            Statics.field1303.field694 = field428[var7];
            Statics.field1303.field693 = field429[var7];
        }
        return;
    }

    @ObfuscatedName("x.cv(B)V")
    public static final void method136() {
        method572(field455);
        Statics.field1986++;
        if (field463 && field460) {
            int var0 = class132.field2070;
            int var1 = class132.field2067;
            int var2 = var0 - field457;
            int var3 = var1 - field458;
            if (var2 < field407) {
                var2 = field407;
            }
            if (field455.field2663 + var2 > field407 + field456.field2663) {
                var2 = field407 + field456.field2663 - field455.field2663;
            }
            if (var3 < field520) {
                var3 = field520;
            }
            if (field455.field2765 + var3 > field520 + field456.field2765) {
                var3 = field520 + field456.field2765 - field455.field2765;
            }
            int var4 = var2 - field464;
            int var5 = var3 - field402;
            int var6 = field455.field2748;
            if (Statics.field1986 > field455.field2731 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field466 = true;
            }
            int var7 = field456.field2669 + (var2 - field407);
            int var8 = field456.field2739 + (var3 - field520);
            if (field455.field2754 != null && field466) {
                class1 var9 = new class1();
                var9.field3 = field455;
                var9.field1 = var7;
                var9.field2 = var8;
                var9.field16 = field455.field2754;
                class34.method97(var9);
            }
            if (class132.field2062 == 0) {
                if (field466) {
                    if (field455.field2736 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field455;
                        var10.field1 = var7;
                        var10.field2 = var8;
                        var10.field7 = field459;
                        var10.field16 = field455.field2736;
                        class34.method97(var10);
                    }
                    if (field459 != null && method530(field455) != null) {
                        field320.method2453(25);
                        field320.method2258(field459.field2717);
                        field320.method2203(field455.field2667);
                        field320.method2246(field459.field2649);
                        field320.method2204(field455.field2717);
                        field320.method2227(field455.field2649);
                        field320.method2246(field459.field2667);
                    }
                } else if ((field422 == 1 || method2806(field424 - 1)) && field424 > 2) {
                    method615(field464 + field457, field458 + field402);
                } else if (field424 > 0) {
                    method31(field464 + field457, field458 + field402);
                }
                field455 = null;
            }
        } else if (Statics.field1986 > 1) {
            field455 = null;
        }
    }

    @ObfuscatedName("s.cd(IIB)V")
    public static void method31(int arg0, int arg1) {
        method527(Statics.field1303, arg0, arg1);
        Statics.field1303 = null;
    }

    @ObfuscatedName("aq.dx(Lfu;B)V")
    public static void method572(class164 arg0) {
        if (field416 == arg0.field2778) {
            field489[arg0.field2775] = true;
        }
    }

    @ObfuscatedName("cn.dz(I)V")
    public static void method1941() {
        for (class4 var0 = (class4) field443.method3428(); var0 != null; var0 = (class4) field443.method3432()) {
            int var1 = var0.field72;
            if (class164.method915(var1)) {
                boolean var2 = true;
                class164[] var3 = Statics.field2764[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2647;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3018;
                    class164 var6 = class164.method560(var5);
                    if (var6 != null) {
                        method572(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.dn([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method157(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("dz.de(II)V")
    public static final void method2150(int arg0) {
        if (!class164.method915(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2764[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3 != null) {
                var3.field2768 = 0;
                var3.field2769 = 0;
            }
        }
    }

    @ObfuscatedName("n.dq([Lfu;II)V")
    public static final void method5(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null && var3.field2724 == arg1 && (!var3.field2647 || !method94(var3))) {
                if (var3.field2650 == 0) {
                    if (!var3.field2647 && method94(var3) && Statics.field994 != var3) {
                        continue;
                    }
                    method5(arg0, var3.field2717);
                    if (var3.field2770 != null) {
                        method5(var3.field2770, var3.field2717);
                    }
                    class4 var4 = (class4) field443.method3425((long) var3.field2717);
                    if (var4 != null) {
                        int var5 = var4.field72;
                        if (class164.method915(var5)) {
                            method5(Statics.field2764[var5], -1);
                        }
                    }
                }
                if (var3.field2650 == 6) {
                    if (var3.field2693 != -1 || var3.field2732 != -1) {
                        boolean var6 = method1684(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2732;
                        } else {
                            var7 = var3.field2693;
                        }
                        if (var7 != -1) {
                            class40 var8 = class40.method2146(var7);
                            var3.field2769 += field354;
                            while (var3.field2769 > var8.field961[var3.field2768]) {
                                var3.field2769 -= var8.field961[var3.field2768];
                                var3.field2768++;
                                if (var3.field2768 >= var8.field955.length) {
                                    var3.field2768 -= var8.field968;
                                    if (var3.field2768 < 0 || var3.field2768 >= var8.field955.length) {
                                        var3.field2768 = 0;
                                    }
                                }
                                method572(var3);
                            }
                        }
                    }
                    if (var3.field2702 != 0 && !var3.field2647) {
                        int var9 = var3.field2702 >> 16;
                        int var10 = var3.field2702 << 16 >> 16;
                        int var11 = field354 * var9;
                        int var12 = field354 * var10;
                        var3.field2706 = var3.field2706 + var11 & 0x7FF;
                        var3.field2698 = var3.field2698 + var12 & 0x7FF;
                        method572(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dh.do(II)V")
    public static final void method2484(int arg0) {
        method1941();
        class22.method1859();
        int var1 = class48.method2707(arg0).field1122;
        if (var1 == 0) {
            return;
        }
        int var2 = class167.field2796[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class86.method1871(0.9D);
                ((class90) Statics.field1522).method1943(0.9D);
            }
            if (var2 == 2) {
                class86.method1871(0.8D);
                ((class90) Statics.field1522).method1943(0.8D);
            }
            if (var2 == 3) {
                class86.method1871(0.7D);
                ((class90) Statics.field1522).method1943(0.7D);
            }
            if (var2 == 4) {
                class86.method1871(0.6D);
                ((class90) Statics.field1522).method1943(0.6D);
            }
            class47.field1078.method3398();
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
                if (field522 == 0 && field523 != -1) {
                    class174.method2851(Statics.field259, field523, 0, var3, false);
                    field524 = false;
                } else if (var3 == 0) {
                    Statics.field2540.method3252();
                    class174.field2843 = 1;
                    Statics.field2847 = null;
                    field524 = false;
                } else {
                    class174.method3090(var3);
                }
                field522 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field537 = 127;
            }
            if (var2 == 1) {
                field537 = 96;
            }
            if (var2 == 2) {
                field537 = 64;
            }
            if (var2 == 3) {
                field537 = 32;
            }
            if (var2 == 4) {
                field537 = 0;
            }
        }
        if (var1 == 5) {
            field422 = var2;
        }
        if (var1 == 6) {
            field444 = var2;
        }
        if (var1 == 9) {
            field445 = var2;
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
            field306 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class19[] var4 = new class19[] { class19.field571, class19.field574, class19.field569 };
            field358 = (class19) class101.method648(var4, var2);
            if (field358 == null) {
                field358 = class19.field574;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field414 = -1;
        } else {
            field414 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("av.dp(IIII)Lm;")
    public static final class4 method853(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field72 = arg1;
        var3.field69 = arg2;
        field443.method3426(var3, (long) arg0);
        method2150(arg1);
        class164 var4 = class164.method560(arg0);
        method572(var4);
        if (field546 != null) {
            method572(field546);
            field546 = null;
        }
        method3379();
        method3375(Statics.field2764[arg0 >> 16], var4, false);
        class34.method122(arg1);
        if (field442 != -1) {
            method934(field442, 1);
        }
        return var3;
    }

    @ObfuscatedName("ej.dc(Lm;ZI)V")
    public static final void method2854(class4 arg0, boolean arg1) {
        int var2 = arg0.field72;
        int var3 = (int) arg0.field3018;
        arg0.method3554();
        if (arg1) {
            class164.method1958(var2);
        }
        for (class192 var4 = (class192) field309.method3428(); var4 != null; var4 = (class192) field309.method3432()) {
            if ((var4.field3018 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3554();
            }
        }
        class164 var5 = class164.method560(var3);
        if (var5 != null) {
            method572(var5);
        }
        method3379();
        if (field442 != -1) {
            method934(field442, 1);
        }
    }

    @ObfuscatedName("au.dd(Lfu;I)Z")
    public static final boolean method880(class164 arg0) {
        int var1 = arg0.field2652;
        if (var1 == 205) {
            field486 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field559.method3123(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field559.method3122(var4, var5 == 1);
        }
        if (var1 == 324) {
            field559.method3132(false);
        }
        if (var1 == 325) {
            field559.method3132(true);
        }
        if (var1 == 326) {
            field320.method2453(21);
            field559.method3127(field320);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ep.df(Lfu;IIII)V")
    public static final void method2885(class164 arg0, int arg1, int arg2, int arg3) {
        method2();
        class166 var4 = arg0.method3043();
        if (var4 == null) {
            return;
        }
        class75.method1606(arg1, arg2, var4.field2792 + arg1, var4.field2788 + arg2);
        if (field562 == 2 || field562 == 5) {
            class75.method1620(arg1, arg2, 0, var4.field2793, var4.field2789);
        } else {
            int var5 = field365 + field349 & 0x7FF;
            int var6 = Statics.field1994.field830 / 32 + 48;
            int var7 = 464 - Statics.field1994.field828 / 32;
            Statics.field2117.method1527(arg1, arg2, var4.field2792, var4.field2788, var6, var7, var5, field351 + 256, var4.field2793, var4.field2789);
            for (int var8 = 0; var8 < field514; var8++) {
                int var9 = field515[var8] * 4 + 2 - Statics.field1994.field830 / 32;
                int var10 = field516[var8] * 4 + 2 - Statics.field1994.field828 / 32;
                method650(arg1, arg2, var9, var10, field469[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class190 var13 = field415[Statics.field599][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1994.field830 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1994.field828 / 32;
                        method650(arg1, arg2, var14, var15, Statics.field356[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field317; var16++) {
                class32 var17 = field316[field318[var16]];
                if (var17 != null && var17.method18()) {
                    class37 var18 = var17.field749;
                    if (var18 != null && var18.field877 != null) {
                        var18 = var18.method657();
                    }
                    if (var18 != null && var18.field868 && var18.field880) {
                        int var19 = var17.field830 / 32 - Statics.field1994.field830 / 32;
                        int var20 = var17.field828 / 32 - Statics.field1994.field828 / 32;
                        method650(arg1, arg2, var19, var20, Statics.field356[1], var4);
                    }
                }
            }
            for (int var21 = 0; var21 < field401; var21++) {
                class3 var22 = field400[field357[var21]];
                if (var22 != null && var22.method18() && !var22.field63) {
                    int var23 = var22.field830 / 32 - Statics.field1994.field830 / 32;
                    int var24 = var22.field828 / 32 - Statics.field1994.field828 / 32;
                    boolean var25 = false;
                    if (method2896(var22.field60, true)) {
                        var25 = true;
                    }
                    boolean var26 = false;
                    for (int var27 = 0; var27 < Statics.field2081; var27++) {
                        if (var22.field60.equals(Statics.field1475[var27].field625)) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (Statics.field1994.field58 != 0 && var22.field58 != 0 && Statics.field1994.field58 == var22.field58) {
                        var28 = true;
                    }
                    if (var25) {
                        method650(arg1, arg2, var23, var24, Statics.field356[3], var4);
                    } else if (var28) {
                        method650(arg1, arg2, var23, var24, Statics.field356[4], var4);
                    } else if (var26) {
                        method650(arg1, arg2, var23, var24, Statics.field356[5], var4);
                    } else {
                        method650(arg1, arg2, var23, var24, Statics.field356[2], var4);
                    }
                }
            }
            if (field510 != 0 && field289 % 20 < 10) {
                if (field510 == 1 && field423 >= 0 && field423 < field316.length) {
                    class32 var29 = field316[field423];
                    if (var29 != null) {
                        int var30 = var29.field830 / 32 - Statics.field1994.field830 / 32;
                        int var31 = var29.field828 / 32 - Statics.field1994.field828 / 32;
                        method542(arg1, arg2, var30, var31, Statics.field29[1], var4);
                    }
                }
                if (field510 == 2) {
                    int var32 = field300 * 4 - Statics.field2594 * 4 + 2 - Statics.field1994.field830 / 32;
                    int var33 = field301 * 4 - Statics.field954 * 4 + 2 - Statics.field1994.field828 / 32;
                    method542(arg1, arg2, var32, var33, Statics.field29[1], var4);
                }
                if (field510 == 10 && field299 >= 0 && field299 < field400.length) {
                    class3 var34 = field400[field299];
                    if (var34 != null) {
                        int var35 = var34.field830 / 32 - Statics.field1994.field830 / 32;
                        int var36 = var34.field828 / 32 - Statics.field1994.field828 / 32;
                        method542(arg1, arg2, var35, var36, Statics.field29[1], var4);
                    }
                }
            }
            if (field321 != 0) {
                int var37 = field321 * 4 + 2 - Statics.field1994.field830 / 32;
                int var38 = field519 * 4 + 2 - Statics.field1994.field828 / 32;
                method650(arg1, arg2, var37, var38, Statics.field29[0], var4);
            }
            if (!Statics.field1994.field63) {
                class75.method1637(var4.field2792 / 2 + arg1 - 1, var4.field2788 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field490[arg3] = true;
    }

    @ObfuscatedName("ec.dw(Lfu;IIII)V")
    public static final void method2812(class164 arg0, int arg1, int arg2, int arg3) {
        class166 var4 = arg0.method3043();
        if (var4 == null) {
            return;
        }
        if (field562 < 3) {
            Statics.field2596.method1527(arg1, arg2, var4.field2792, var4.field2788, 25, 25, field365, 256, var4.field2793, var4.field2789);
        } else {
            class75.method1620(arg1, arg2, 0, var4.field2793, var4.field2789);
        }
    }

    @ObfuscatedName("d.dh(IIIILba;Lfb;I)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method650(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field365 + field349 & 0x7FF;
        int var8 = class86.field1539[var7];
        int var9 = class86.field1540[var7];
        int var10 = var8 * 256 / (field351 + 256);
        int var11 = var9 * 256 / (field351 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1977.method1539(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("ax.dr(IIIILba;Lfb;I)V")
    public static final void method650(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field365 + field349 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class86.field1539[var6];
        int var9 = class86.field1540[var6];
        int var10 = var8 * 256 / (field351 + 256);
        int var11 = var9 * 256 / (field351 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1528(arg5.field2792 / 2 + var12 - arg4.field1359 / 2, arg5.field2788 / 2 - var13 - arg4.field1365 / 2, arg0, arg1, arg5.field2792, arg5.field2788, arg5.field2793, arg5.field2789);
        } else {
            arg4.method1587(arg5.field2792 / 2 + arg0 + var12 - arg4.field1359 / 2, arg5.field2788 / 2 + arg1 - var13 - arg4.field1365 / 2);
        }
    }

    @ObfuscatedName("ef.da(Ljava/lang/String;ZI)Z")
    public static boolean method2896(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class155.method710(arg0, Statics.field578);
        for (int var3 = 0; var3 < field553; var3++) {
            if (var2.equalsIgnoreCase(class155.method710(field518[var3].field260, Statics.field578)) && (!arg1 || field518[var3].field247 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class155.method710(Statics.field1994.field60, Statics.field578))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("al.ds(Ljava/lang/String;I)Z")
    public static boolean method574(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class155.method710(arg0, Statics.field578);
        for (int var2 = 0; var2 < field557; var2++) {
            class8 var3 = field298[var2];
            if (var1.equalsIgnoreCase(class155.method710(var3.field142, Statics.field578))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class155.method710(var3.field135, Statics.field578))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("az.du(Ljava/lang/String;B)V")
    public static final void method583(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field553 < 200 || field283 == 1) || field553 >= 400) {
            class11.method2846(30, "", class148.field2368);
            return;
        }
        String var1 = class155.method710(arg0, Statics.field578);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field553; var2++) {
            class17 var3 = field518[var2];
            String var4 = class155.method710(var3.field260, Statics.field578);
            if (var4 != null && var4.equals(var1)) {
                class11.method2846(30, "", arg0 + class148.field2424);
                return;
            }
            if (var3.field252 != null) {
                String var5 = class155.method710(var3.field252, Statics.field578);
                if (var5 != null && var5.equals(var1)) {
                    class11.method2846(30, "", arg0 + class148.field2424);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field557; var6++) {
            class8 var7 = field298[var6];
            String var8 = class155.method710(var7.field142, Statics.field578);
            if (var8 != null && var8.equals(var1)) {
                class11.method2846(30, "", class148.field2374 + arg0 + class148.field2375);
                return;
            }
            if (var7.field135 != null) {
                String var9 = class155.method710(var7.field135, Statics.field578);
                if (var9 != null && var9.equals(var1)) {
                    class11.method2846(30, "", class148.field2374 + arg0 + class148.field2375);
                    return;
                }
            }
        }
        if (class155.method710(Statics.field1994.field60, Statics.field578).equals(var1)) {
            class11.method2846(30, "", class148.field2403);
        } else {
            field320.method2453(64);
            field320.method2326(class111.method2667(arg0));
            field320.method2362(arg0);
        }
    }

    @ObfuscatedName("k.db(Ljava/lang/String;I)V")
    public static final void method127(String arg0) {
        if (!arg0.equals("")) {
            field320.method2453(9);
            field320.method2326(class111.method2667(arg0));
            field320.method2362(arg0);
        }
    }

    @ObfuscatedName("d.dv(I)V")
    public static final void method544() {
        field320.method2453(9);
        field320.method2326(0);
    }

    @ObfuscatedName("u.dk(Lfu;B)Lfu;")
    public static class164 method530(class164 arg0) {
        int var1 = Statics.method74(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class164.method560(arg0.field2724);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("f.dt(Lfu;B)Z")
    public static boolean method94(class164 arg0) {
        if (field329) {
            if (Statics.method74(arg0) != 0) {
                return false;
            }
            if (arg0.field2650 == 0) {
                return false;
            }
        }
        return arg0.field2668;
    }

    @ObfuscatedName("e.dm(Lfu;II)Ljava/lang/String;")
    public static String method137(class164 arg0, int arg1) {
        int var2 = Statics.method74(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2746 == null) {
            return null;
        } else if (arg0.field2720 == null || arg0.field2720.length <= arg1 || arg0.field2720[arg1] == null || arg0.field2720[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2720[arg1];
        }
    }

    @ObfuscatedName("fm.dy(Lfu;I)Ljava/lang/String;")
    public static String method3363(class164 arg0) {
        if (class169.method2814(Statics.method74(arg0)) == 0) {
            return null;
        } else if (arg0.field2735 == null || arg0.field2735.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2735;
        }
    }

    @ObfuscatedName("bz.dj(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method1471(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field310 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field310 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field310 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field310 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field310 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1953 != null) {
            var3 = "/p=" + Statics.field1953;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field286 + "/a=" + Statics.field628 + var3 + "/";
    }

    @ObfuscatedName("et.dl(Ljava/lang/String;I)V")
    public static void method2826(String arg0) {
        Statics.field1953 = arg0;
        try {
            String var1 = Statics.field279.getParameter(class181.field2963.field2970);
            String var2 = Statics.field279.getParameter(class181.field2962.field2970);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class103.method318(class107.method3364() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field279;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }
}

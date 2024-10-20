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

public final class client extends class136 {

    @ObfuscatedName("client.n")
    public static boolean field260 = true;

    @ObfuscatedName("client.t")
    public static int field261 = 1;

    @ObfuscatedName("client.e")
    public static int field262 = 0;

    @ObfuscatedName("client.z")
    public static int field264 = 0;

    @ObfuscatedName("client.f")
    public static boolean field265 = false;

    @ObfuscatedName("client.i")
    public static boolean field267 = false;

    @ObfuscatedName("client.w")
    public static class220[] field322 = new class220[4];

    @ObfuscatedName("client.l")
    public static int field492 = 0;

    @ObfuscatedName("client.m")
    public static int field269 = 0;

    @ObfuscatedName("client.a")
    public static boolean field300 = true;

    @ObfuscatedName("client.p")
    public static int field423 = 0;

    @ObfuscatedName("client.c")
    public static long field272 = 1L;

    @ObfuscatedName("client.d")
    public static int field273 = -1;

    @ObfuscatedName("client.o")
    public static int field535 = -1;

    @ObfuscatedName("client.aj")
    public static int field275 = -1;

    @ObfuscatedName("client.au")
    public static boolean field276 = true;

    @ObfuscatedName("client.ah")
    public static boolean field277 = false;

    @ObfuscatedName("client.ab")
    public static int field278 = 0;

    @ObfuscatedName("client.am")
    public static int field279 = 0;

    @ObfuscatedName("client.ar")
    public static int field280 = 0;

    @ObfuscatedName("client.an")
    public static int field281 = 0;

    @ObfuscatedName("client.az")
    public static int field478 = 0;

    @ObfuscatedName("client.at")
    public static int field283 = 0;

    @ObfuscatedName("client.ag")
    public static int field274 = 0;

    @ObfuscatedName("client.as")
    public static int field285 = 0;

    @ObfuscatedName("client.ao")
    public static int field286 = 0;

    @ObfuscatedName("client.af")
    public static class111 field435 = new class111(new byte[5000]);

    @ObfuscatedName("client.aw")
    public static class19 field288 = class19.field552;

    @ObfuscatedName("client.ap")
    public static int field289 = 0;

    @ObfuscatedName("client.ai")
    public static int field338 = 0;

    @ObfuscatedName("client.ax")
    public static int field291 = 0;

    @ObfuscatedName("client.bg")
    public static int field299 = 0;

    @ObfuscatedName("client.bp")
    public static int field294 = 0;

    @ObfuscatedName("client.bx")
    public static int field295 = 0;

    @ObfuscatedName("client.br")
    public static int field296 = 0;

    @ObfuscatedName("client.bl")
    public static int field297 = 0;

    @ObfuscatedName("client.cr")
    public static class32[] field365 = new class32[32768];

    @ObfuscatedName("client.ck")
    public static int field505 = 0;

    @ObfuscatedName("client.cd")
    public static int[] field466 = new int[32768];

    @ObfuscatedName("client.cy")
    public static class114 field284 = new class114(5000);

    @ObfuscatedName("client.cs")
    public static class114 field305 = new class114(5000);

    @ObfuscatedName("client.cm")
    public static class114 field524 = new class114(5000);

    @ObfuscatedName("client.ce")
    public static int field307 = 0;

    @ObfuscatedName("client.cn")
    public static int field399 = 0;

    @ObfuscatedName("client.cb")
    public static int field309 = 0;

    @ObfuscatedName("client.cl")
    public static int field310 = 0;

    @ObfuscatedName("client.cw")
    public static int field311 = 0;

    @ObfuscatedName("client.cz")
    public static int field287 = 0;

    @ObfuscatedName("client.cc")
    public static int field313 = 0;

    @ObfuscatedName("client.cq")
    public static int field428 = 0;

    @ObfuscatedName("client.cx")
    public static boolean field315 = false;

    @ObfuscatedName("client.dv")
    public static int field464 = 0;

    @ObfuscatedName("client.di")
    public static int field317 = 0;

    @ObfuscatedName("client.dg")
    public static int field364 = 1;

    @ObfuscatedName("client.dj")
    public static int field319 = 0;

    @ObfuscatedName("client.dw")
    public static int field268 = 1;

    @ObfuscatedName("client.dc")
    public static int field321 = 0;

    @ObfuscatedName("client.dr")
    public static boolean field453 = false;

    @ObfuscatedName("client.da")
    public static int[][][] field324 = new int[4][13][13];

    @ObfuscatedName("client.dq")
    public static final int[] field325 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dl")
    public static int field326 = 0;

    @ObfuscatedName("client.dz")
    public static int field426 = 2;

    @ObfuscatedName("client.du")
    public static int field328 = 0;

    @ObfuscatedName("client.df")
    public static int field329 = 2;

    @ObfuscatedName("client.do")
    public static int field330 = 0;

    @ObfuscatedName("client.dn")
    public static int field331 = 1;

    @ObfuscatedName("client.ey")
    public static int field394 = 0;

    @ObfuscatedName("client.ez")
    public static int field333 = 0;

    @ObfuscatedName("client.eh")
    public static int field334 = 2;

    @ObfuscatedName("client.ei")
    public static int field503 = 0;

    @ObfuscatedName("client.eo")
    public static int field410 = 1;

    @ObfuscatedName("client.ef")
    public static int field337 = 0;

    @ObfuscatedName("client.ep")
    public static int field537 = 0;

    @ObfuscatedName("client.ev")
    public static int field343 = 2301979;

    @ObfuscatedName("client.en")
    public static int field344 = 5063219;

    @ObfuscatedName("client.ew")
    public static int field345 = 3353893;

    @ObfuscatedName("client.ed")
    public static int field346 = 7759444;

    @ObfuscatedName("client.ea")
    public static boolean field391 = false;

    @ObfuscatedName("client.eg")
    public static int field348 = 0;

    @ObfuscatedName("client.fg")
    public static int field349 = 128;

    @ObfuscatedName("client.fk")
    public static int field350 = 0;

    @ObfuscatedName("client.fb")
    public static int field351 = 0;

    @ObfuscatedName("client.fr")
    public static int field352 = 0;

    @ObfuscatedName("client.fi")
    public static int field358 = 0;

    @ObfuscatedName("client.fh")
    public static int field354 = 0;

    @ObfuscatedName("client.fo")
    public static int field382 = 0;

    @ObfuscatedName("client.ft")
    public static boolean field356 = false;

    @ObfuscatedName("client.fx")
    public static int field406 = 0;

    @ObfuscatedName("client.fv")
    public static int field523 = 0;

    @ObfuscatedName("client.fw")
    public static int field359 = 50;

    @ObfuscatedName("client.fa")
    public static int[] field360 = new int[field359];

    @ObfuscatedName("client.fy")
    public static int[] field376 = new int[field359];

    @ObfuscatedName("client.fj")
    public static int[] field306 = new int[field359];

    @ObfuscatedName("client.fm")
    public static int[] field499 = new int[field359];

    @ObfuscatedName("client.fn")
    public static int[] field413 = new int[field359];

    @ObfuscatedName("client.fs")
    public static int[] field484 = new int[field359];

    @ObfuscatedName("client.fu")
    public static int[] field387 = new int[field359];

    @ObfuscatedName("client.fp")
    public static String[] field367 = new String[field359];

    @ObfuscatedName("client.gl")
    public static int[][] field368 = new int[104][104];

    @ObfuscatedName("client.ge")
    public static int field369 = 0;

    @ObfuscatedName("client.gf")
    public static int field370 = -1;

    @ObfuscatedName("client.gi")
    public static int field534 = -1;

    @ObfuscatedName("client.gd")
    public static int field372 = 0;

    @ObfuscatedName("client.go")
    public static int field373 = 0;

    @ObfuscatedName("client.gh")
    public static int field374 = 0;

    @ObfuscatedName("client.gr")
    public static int field375 = 0;

    @ObfuscatedName("client.gz")
    public static int field301 = 0;

    @ObfuscatedName("client.gk")
    public static int field377 = 0;

    @ObfuscatedName("client.gg")
    public static int field378 = 0;

    @ObfuscatedName("client.gu")
    public static int field379 = 0;

    @ObfuscatedName("client.gs")
    public static int field380 = 0;

    @ObfuscatedName("client.gb")
    public static int field517 = 0;

    @ObfuscatedName("client.gq")
    public static boolean field432 = false;

    @ObfuscatedName("client.gn")
    public static int field383 = 0;

    @ObfuscatedName("client.gm")
    public static int field384 = 0;

    @ObfuscatedName("client.gv")
    public static class3[] field385 = new class3[2048];

    @ObfuscatedName("client.gt")
    public static int field386 = 0;

    @ObfuscatedName("client.gx")
    public static int[] field482 = new int[2048];

    @ObfuscatedName("client.gy")
    public static int field388 = 0;

    @ObfuscatedName("client.ho")
    public static int[] field389 = new int[2048];

    @ObfuscatedName("client.hu")
    public static class111[] field390 = new class111[2048];

    @ObfuscatedName("client.hp")
    public static int field312 = -1;

    @ObfuscatedName("client.hc")
    public static int field392 = 0;

    @ObfuscatedName("client.he")
    public static int field500 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field355 = new int[1000];

    @ObfuscatedName("client.hg")
    public static final int[] field395 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ha")
    public static String[] field396 = new String[8];

    @ObfuscatedName("client.hd")
    public static boolean[] field397 = new boolean[8];

    @ObfuscatedName("client.hv")
    public static int[] field530 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hj")
    public static int field341 = -1;

    @ObfuscatedName("client.hk")
    public static class190[][][] field400 = new class190[4][104][104];

    @ObfuscatedName("client.hn")
    public static class190 field401 = new class190();

    @ObfuscatedName("client.hb")
    public static class190 field402 = new class190();

    @ObfuscatedName("client.ht")
    public static class190 field403 = new class190();

    @ObfuscatedName("client.hq")
    public static int[] field353 = new int[25];

    @ObfuscatedName("client.hi")
    public static int[] field302 = new int[25];

    @ObfuscatedName("client.hh")
    public static int[] field409 = new int[25];

    @ObfuscatedName("client.hr")
    public static int field407 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field408 = false;

    @ObfuscatedName("client.ip")
    public static int field320 = 0;

    @ObfuscatedName("client.ie")
    public static int[] field347 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field411 = new int[500];

    @ObfuscatedName("client.ir")
    public static int[] field545 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field433 = new int[500];

    @ObfuscatedName("client.ig")
    public static String[] field414 = new String[500];

    @ObfuscatedName("client.ia")
    public static String[] field366 = new String[500];

    @ObfuscatedName("client.ik")
    public static int field489 = -1;

    @ObfuscatedName("client.iu")
    public static int field417 = -1;

    @ObfuscatedName("client.id")
    public static int field418 = 0;

    @ObfuscatedName("client.iv")
    public static int field419 = 50;

    @ObfuscatedName("client.is")
    public static int field508 = 0;

    @ObfuscatedName("client.it")
    public static String field421 = null;

    @ObfuscatedName("client.iy")
    public static boolean field422 = false;

    @ObfuscatedName("client.ib")
    public static int field447 = -1;

    @ObfuscatedName("client.im")
    public static int field424 = -1;

    @ObfuscatedName("client.ja")
    public static String field425 = null;

    @ObfuscatedName("client.jp")
    public static String field362 = null;

    @ObfuscatedName("client.jf")
    public static int field258 = -1;

    @ObfuscatedName("client.jj")
    public static class187 field522 = new class187(8);

    @ObfuscatedName("client.jy")
    public static int field456 = 0;

    @ObfuscatedName("client.jl")
    public static int field393 = 0;

    @ObfuscatedName("client.jh")
    public static class164 field332 = null;

    @ObfuscatedName("client.jb")
    public static int field270 = 0;

    @ObfuscatedName("client.jn")
    public static int field318 = 0;

    @ObfuscatedName("client.jg")
    public static int field434 = 0;

    @ObfuscatedName("client.jt")
    public static int field495 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field436 = false;

    @ObfuscatedName("client.jx")
    public static boolean field437 = false;

    @ObfuscatedName("client.ju")
    public static boolean field438 = false;

    @ObfuscatedName("client.jo")
    public static class164 field439 = null;

    @ObfuscatedName("client.jv")
    public static class164 field361 = null;

    @ObfuscatedName("client.jd")
    public static class164 field511 = null;

    @ObfuscatedName("client.jc")
    public static int field442 = 0;

    @ObfuscatedName("client.jq")
    public static int field443 = 0;

    @ObfuscatedName("client.jk")
    public static class164 field444 = null;

    @ObfuscatedName("client.jm")
    public static boolean field445 = false;

    @ObfuscatedName("client.ji")
    public static int field446 = -1;

    @ObfuscatedName("client.je")
    public static int field335 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field448 = false;

    @ObfuscatedName("client.js")
    public static int field449 = -1;

    @ObfuscatedName("client.jz")
    public static int field450 = -1;

    @ObfuscatedName("client.kh")
    public static boolean field451 = false;

    @ObfuscatedName("client.ka")
    public static int field521 = 1;

    @ObfuscatedName("client.kp")
    public static int[] field430 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field454 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field455 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field266 = 0;

    @ObfuscatedName("client.kj")
    public static int[] field457 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field458 = 0;

    @ObfuscatedName("client.ky")
    public static int field459 = 0;

    @ObfuscatedName("client.ko")
    public static int field460 = 0;

    @ObfuscatedName("client.ki")
    public static int field452 = 0;

    @ObfuscatedName("client.kc")
    public static int field462 = 0;

    @ObfuscatedName("client.kb")
    public static int field463 = 0;

    @ObfuscatedName("client.kx")
    public static int field314 = 0;

    @ObfuscatedName("client.ke")
    public static int[] field465 = new int[2000];

    @ObfuscatedName("client.kt")
    public static String[] field416 = new String[1000];

    @ObfuscatedName("client.kw")
    public static int field467 = 0;

    @ObfuscatedName("client.kl")
    public static class190 field468 = new class190();

    @ObfuscatedName("client.kr")
    public static class190 field469 = new class190();

    @ObfuscatedName("client.lo")
    public static class190 field541 = new class190();

    @ObfuscatedName("client.la")
    public static class187 field471 = new class187(512);

    @ObfuscatedName("client.ln")
    public static int field472 = 0;

    @ObfuscatedName("client.le")
    public static int field473 = -2;

    @ObfuscatedName("client.lv")
    public static boolean[] field474 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field475 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field476 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static int[] field477 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field519 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field479 = new int[100];

    @ObfuscatedName("client.lt")
    public static int[] field480 = new int[100];

    @ObfuscatedName("client.lm")
    public static int field481 = 0;

    @ObfuscatedName("client.lx")
    public static long field371 = 0L;

    @ObfuscatedName("client.ls")
    public static boolean field483 = true;

    @ObfuscatedName("client.ly")
    public static int field485 = 765;

    @ObfuscatedName("client.lj")
    public static int field486 = 1;

    @ObfuscatedName("client.lw")
    public static int[] field487 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lu")
    public static int field488 = 0;

    @ObfuscatedName("client.lp")
    public static int field405 = 0;

    @ObfuscatedName("client.lk")
    public static String field490 = "";

    @ObfuscatedName("client.me")
    public static long[] field491 = new long[100];

    @ObfuscatedName("client.ml")
    public static int field507 = 0;

    @ObfuscatedName("client.mc")
    public static int field493 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field494 = new int[128];

    @ObfuscatedName("client.mq")
    public static int[] field381 = new int[128];

    @ObfuscatedName("client.md")
    public static long field496 = -1L;

    @ObfuscatedName("client.mb")
    public static String field497 = null;

    @ObfuscatedName("client.ma")
    public static String field498 = null;

    @ObfuscatedName("client.mv")
    public static int field336 = -1;

    @ObfuscatedName("client.mt")
    public static int field420 = 0;

    @ObfuscatedName("client.ms")
    public static int[] field501 = new int[1000];

    @ObfuscatedName("client.mr")
    public static int[] field502 = new int[1000];

    @ObfuscatedName("client.mf")
    public static class74[] field398 = new class74[1000];

    @ObfuscatedName("client.mk")
    public static int field504 = 0;

    @ObfuscatedName("client.mx")
    public static int field282 = 0;

    @ObfuscatedName("client.no")
    public static int field506 = 0;

    @ObfuscatedName("client.nd")
    public static int field412 = 255;

    @ObfuscatedName("client.nb")
    public static int field429 = -1;

    @ObfuscatedName("client.nn")
    public static boolean field509 = false;

    @ObfuscatedName("client.nm")
    public static int field520 = 127;

    @ObfuscatedName("client.nj")
    public static int field290 = 127;

    @ObfuscatedName("client.np")
    public static int field512 = 0;

    @ObfuscatedName("client.na")
    public static int[] field513 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field514 = new int[50];

    @ObfuscatedName("client.nh")
    public static int[] field515 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field516 = new int[50];

    @ObfuscatedName("client.nc")
    public static class54[] field339 = new class54[50];

    @ObfuscatedName("client.nv")
    public static boolean field518 = false;

    @ObfuscatedName("client.oo")
    public static boolean[] field404 = new boolean[5];

    @ObfuscatedName("client.ow")
    public static int[] field293 = new int[5];

    @ObfuscatedName("client.ot")
    public static int[] field427 = new int[5];

    @ObfuscatedName("client.om")
    public static int[] field363 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field308 = new int[5];

    @ObfuscatedName("client.or")
    public static short field470 = 256;

    @ObfuscatedName("client.ox")
    public static short field525 = 205;

    @ObfuscatedName("client.og")
    public static short field526 = 256;

    @ObfuscatedName("client.oa")
    public static short field527 = 320;

    @ObfuscatedName("client.op")
    public static short field528 = 1;

    @ObfuscatedName("client.ol")
    public static short field529 = 32767;

    @ObfuscatedName("client.oe")
    public static short field327 = 1;

    @ObfuscatedName("client.os")
    public static short field531 = 32767;

    @ObfuscatedName("client.oh")
    public static int field532 = 0;

    @ObfuscatedName("client.oy")
    public static int field533 = 0;

    @ObfuscatedName("client.oq")
    public static int field441 = 0;

    @ObfuscatedName("client.ov")
    public static int field316 = 0;

    @ObfuscatedName("client.od")
    public static int field536 = 0;

    @ObfuscatedName("client.of")
    public static int field271 = 0;

    @ObfuscatedName("client.oz")
    public static int field538 = 0;

    @ObfuscatedName("client.pd")
    public static class17[] field539 = new class17[400];

    @ObfuscatedName("client.pw")
    public static class186 field540 = new class186();

    @ObfuscatedName("client.pp")
    public static int field431 = 0;

    @ObfuscatedName("client.pk")
    public static class8[] field542 = new class8[400];

    @ObfuscatedName("client.pc")
    public static class170 field543 = new class170();

    @ObfuscatedName("client.pl")
    public static int field544 = -1;

    @ObfuscatedName("client.pv")
    public static int field510 = -1;

    @ObfuscatedName("client.po")
    public static class211[] field546 = new class211[8];

    @ObfuscatedName("client.g(B)V")
    public final void method350() {
    }

    public final void init() {
        if (!this.method2667()) {
            return;
        }
        class181[] var1 = class181.method530();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class181 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2976);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2976)) {
                    case 1:
                        int var5 = Integer.parseInt(var4);
                        class144[] var6 = class144.method597();
                        int var7 = 0;
                        class144 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class144 var8 = var6[var7];
                            if (var8.field2187 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field263 = var9;
                        break;
                    case 2:
                        Statics.field292 = var4;
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class2.field21)) {
                        }
                        break;
                    case 4:
                        field264 = Integer.parseInt(var4);
                        break;
                    case 5:
                        field261 = Integer.parseInt(var4);
                        break;
                    case 6:
                        Statics.field2549 = var4;
                    case 7:
                    case 8:
                    case 9:
                    default:
                        break;
                    case 10:
                        field492 = Integer.parseInt(var4);
                        break;
                    case 11:
                        Statics.field2062 = Integer.parseInt(var4);
                        break;
                    case 12:
                        if (var4.equalsIgnoreCase(class2.field21)) {
                            field265 = true;
                        } else {
                            field265 = false;
                        }
                        break;
                    case 13:
                        field262 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field2509 = Integer.parseInt(var4);
                        break;
                    case 15:
                        class145[] var10 = new class145[] { class145.field2202, class145.field2204, class145.field2199, class145.field2203, class145.field2200, class145.field2201 };
                        Statics.field2851 = (class145) class101.method529(var10, Integer.parseInt(var4));
                        if (Statics.field2851 == class145.field2204) {
                            Statics.field1455 = class203.field3040;
                        } else {
                            Statics.field1455 = class203.field3048;
                        }
                }
            }
        }
        method2811();
        Statics.field2165 = this.getCodeBase().getHost();
        String var11 = Statics.field263.field2189;
        byte var12 = 0;
        try {
            class141.method2563("oldschool", var11, var12, 16);
        } catch (Exception var14) {
            class140.method793((String) null, var14);
        }
        Statics.field259 = this;
        this.method2683(765, 503, 85);
    }

    @ObfuscatedName("en.t(I)V")
    public static final void method2811() {
        class81.field1388 = false;
        field267 = false;
    }

    @ObfuscatedName("client.e(I)V")
    public final void method172() {
        Statics.field1713 = field264 == 0 ? 43594 : field261 + 40000;
        Statics.field1920 = field264 == 0 ? 443 : field261 + 50000;
        Statics.field298 = Statics.field1713;
        Statics.field1038 = class165.field2803;
        Statics.field2835 = class165.field2801;
        Statics.field1303 = class165.field2800;
        Statics.field2833 = class165.field2807;
        class129.method677();
        class129.method129(Statics.field1094);
        Canvas var1 = Statics.field1094;
        var1.addMouseListener(class132.field2067);
        var1.addMouseMotionListener(class132.field2067);
        var1.addFocusListener(class132.field2067);
        class137 var2;
        try {
            var2 = new class137();
        } catch (Throwable var7) {
            var2 = null;
        }
        Statics.field2149 = var2;
        if (Statics.field2149 != null) {
            Statics.field2149.method2491(Statics.field1094);
        }
        Statics.field653 = new class126(255, class141.field2160, class141.field2161, 500000);
        Statics.field2828 = class9.method2530();
        Statics.field62 = this.getToolkit().getSystemClipboard();
        String var5 = Statics.field866;
        class130.field2055 = this;
        class130.field2051 = var5;
        if (field264 != 0) {
            field277 = true;
        }
        int var6 = Statics.field2828.field137;
        field371 = 0L;
        if (var6 >= 2) {
            field483 = true;
        } else {
            field483 = false;
        }
        method2465();
        if (field269 >= 25) {
            method1805();
        }
        field2126 = true;
    }

    @ObfuscatedName("client.q(I)V")
    public final void method232() {
        field423++;
        this.method176();
        while (true) {
            class190 var1 = class161.field2626;
            class160 var2;
            synchronized (class161.field2626) {
                var2 = (class160) class161.field2622.method3394();
            }
            if (var2 == null) {
                class174.method2789();
                method2597();
                class129 var4 = class129.field2030;
                synchronized (class129.field2030) {
                    class129.field2038++;
                    class129.field2041 = class129.field2036;
                    class129.field2040 = 0;
                    if (class129.field2019 >= 0) {
                        while (class129.field2044 != class129.field2019) {
                            int var6 = class129.field2034[class129.field2044];
                            class129.field2044 = class129.field2044 + 1 & 0x7F;
                            if (var6 < 0) {
                                class129.field2027[~var6] = false;
                            } else {
                                if (!class129.field2027[var6] && class129.field2040 < class129.field2035.length - 1) {
                                    class129.field2035[++class129.field2040 - 1] = var6;
                                }
                                class129.field2027[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class129.field2027[var5] = false;
                        }
                        class129.field2019 = class129.field2044;
                    }
                    class129.field2036 = class129.field2020;
                }
                class132 var8 = class132.field2067;
                synchronized (class132.field2067) {
                    class132.field2070 = class132.field2073;
                    class132.field2071 = class132.field2078;
                    class132.field2072 = class132.field2065 * -1777304847;
                    class132.field2068 = class132.field2082;
                    class132.field2077 = class132.field2074;
                    class132.field2079 = class132.field2069;
                    class132.field2080 = class132.field2076;
                    class132.field2082 = 0;
                }
                if (Statics.field2149 != null) {
                    int var10 = Statics.field2149.method2490();
                    field467 = var10;
                }
                if (field269 == 0) {
                    method28();
                    class136.method124();
                } else if (field269 == 5) {
                    class30.method2736(this);
                    method28();
                    class136.method124();
                } else if (field269 == 10 || field269 == 11) {
                    class30.method2736(this);
                } else if (field269 == 20) {
                    class30.method2736(this);
                    method484();
                } else if (field269 == 25) {
                    method2536();
                }
                if (field269 == 30) {
                    if (field278 > 1) {
                        field278--;
                    }
                    if (field428 > 0) {
                        field428--;
                    }
                    if (field315) {
                        field315 = false;
                        method531();
                    } else {
                        if (!field408) {
                            field414[0] = class148.field2393;
                            field366[0] = "";
                            field545[0] = 1006;
                            field320 = 1;
                        }
                        for (int var11 = 0; var11 < 100; var11++) {
                            boolean var12;
                            if (Statics.field113 == null) {
                                var12 = false;
                            } else {
                                label2948: {
                                    try {
                                        int var13 = Statics.field113.method2642();
                                        if (var13 == 0) {
                                            var12 = false;
                                            break label2948;
                                        }
                                        if (field399 == -1) {
                                            Statics.field113.method2643(field524.field1897, 0, 1);
                                            field524.field1902 = 0;
                                            field399 = field524.method2416();
                                            field307 = class179.field2956[field399];
                                            var13--;
                                        }
                                        if (field307 == -1) {
                                            if (var13 <= 0) {
                                                var12 = false;
                                                break label2948;
                                            }
                                            Statics.field113.method2643(field524.field1897, 0, 1);
                                            field307 = field524.field1897[0] & 0xFF;
                                            var13--;
                                        }
                                        if (field307 == -2) {
                                            if (var13 <= 1) {
                                                var12 = false;
                                                break label2948;
                                            }
                                            Statics.field113.method2643(field524.field1897, 0, 2);
                                            field524.field1902 = 0;
                                            field307 = field524.method2339();
                                            var13 -= 2;
                                        }
                                        if (var13 < field307) {
                                            var12 = false;
                                            break label2948;
                                        }
                                        field524.field1902 = 0;
                                        Statics.field113.method2643(field524.field1897, 0, field307);
                                        field309 = 0;
                                        field313 = field287;
                                        field287 = field311;
                                        field311 = field399;
                                        if (field399 == 240) {
                                            int var14 = field524.method2334();
                                            int var15 = field524.method2215();
                                            int var16 = field524.method2163();
                                            class164 var17 = class164.method2744(var15);
                                            if (var17.field2677 != var16 || var17.field2678 != var14 || var17.field2722 != 0 || var17.field2674 != 0) {
                                                var17.field2677 = var16;
                                                var17.field2678 = var14;
                                                var17.field2722 = 0;
                                                var17.field2674 = 0;
                                                method147(var17);
                                                method703(var17);
                                                if (var17.field2670 == 0) {
                                                    method97(Statics.field2685[var15 >> 16], var17, false);
                                                }
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 136) {
                                            for (int var18 = 0; var18 < Statics.field1093; var18++) {
                                                class48 var19 = class48.method102(var18);
                                                if (var19 != null) {
                                                    class167.field2817[var18] = 0;
                                                    class167.field2816[var18] = 0;
                                                }
                                            }
                                            method157();
                                            field454 += 32;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 19) {
                                            int var20 = field524.method2195();
                                            if (var20 == 65535) {
                                                var20 = -1;
                                            }
                                            int var21 = field524.method2165();
                                            int var22 = field524.method2204();
                                            class164 var23 = class164.method2744(var21);
                                            if (var23.field2667) {
                                                var23.field2786 = var20;
                                                var23.field2787 = var22;
                                                class47 var25 = class47.method859(var20);
                                                var23.field2739 = var25.field1055;
                                                var23.field2673 = var25.field1056;
                                                var23.field2719 = var25.field1057;
                                                var23.field2715 = var25.field1075;
                                                var23.field2716 = var25.field1077;
                                                var23.field2762 = var25.field1070;
                                                if (var25.field1060 == 1) {
                                                    var23.field2724 = 1;
                                                } else {
                                                    var23.field2724 = 2;
                                                }
                                                if (var23.field2797 > 0) {
                                                    var23.field2762 = var23.field2762 * 32 / var23.field2797;
                                                } else if (var23.field2747 > 0) {
                                                    var23.field2762 = var23.field2762 * 32 / var23.field2747;
                                                }
                                                method147(var23);
                                            } else {
                                                if (var20 == -1) {
                                                    var23.field2709 = 0;
                                                    field399 = -1;
                                                    var12 = true;
                                                    break label2948;
                                                }
                                                class47 var24 = class47.method859(var20);
                                                var23.field2709 = 4;
                                                var23.field2745 = var20;
                                                var23.field2739 = var24.field1055;
                                                var23.field2673 = var24.field1056;
                                                var23.field2762 = var24.field1070 * 100 / var22;
                                                method147(var23);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 158) {
                                            method668(false);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 132) {
                                            if (field258 != -1) {
                                                method896(field258, 0);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 140) {
                                            class114 var26 = field524;
                                            int var27 = field307;
                                            class201 var28 = new class201();
                                            var28.field3030 = var26.method2205();
                                            var28.field3033 = var26.method2165();
                                            var28.field3029 = new int[var28.field3030];
                                            var28.field3032 = new int[var28.field3030];
                                            var28.field3036 = new Field[var28.field3030];
                                            var28.field3035 = new int[var28.field3030];
                                            var28.field3031 = new Method[var28.field3030];
                                            var28.field3034 = new byte[var28.field3030][][];
                                            for (int var29 = 0; var29 < var28.field3030; var29++) {
                                                try {
                                                    int var30 = var26.method2205();
                                                    if (var30 == 0 || var30 == 1 || var30 == 2) {
                                                        String var31 = var26.method2170();
                                                        String var32 = var26.method2170();
                                                        int var33 = 0;
                                                        if (var30 == 1) {
                                                            var33 = var26.method2165();
                                                        }
                                                        var28.field3029[var29] = var30;
                                                        var28.field3035[var29] = var33;
                                                        if (class202.method2473(var31).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        var28.field3036[var29] = class202.method2473(var31).getDeclaredField(var32);
                                                    } else if (var30 == 3 || var30 == 4) {
                                                        String var34 = var26.method2170();
                                                        String var35 = var26.method2170();
                                                        int var36 = var26.method2205();
                                                        String[] var37 = new String[var36];
                                                        for (int var38 = 0; var38 < var36; var38++) {
                                                            var37[var38] = var26.method2170();
                                                        }
                                                        String var39 = var26.method2170();
                                                        byte[][] var40 = new byte[var36][];
                                                        if (var30 == 3) {
                                                            for (int var41 = 0; var41 < var36; var41++) {
                                                                int var42 = var26.method2165();
                                                                var40[var41] = new byte[var42];
                                                                var26.method2171(var40[var41], 0, var42);
                                                            }
                                                        }
                                                        var28.field3029[var29] = var30;
                                                        Class[] var43 = new Class[var36];
                                                        for (int var44 = 0; var44 < var36; var44++) {
                                                            var43[var44] = class202.method2473(var37[var44]);
                                                        }
                                                        Class var45 = class202.method2473(var39);
                                                        if (class202.method2473(var34).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        Method[] var46 = class202.method2473(var34).getDeclaredMethods();
                                                        Method[] var47 = var46;
                                                        for (int var48 = 0; var48 < var47.length; var48++) {
                                                            Method var49 = var47[var48];
                                                            if (var49.getName().equals(var35)) {
                                                                Class[] var50 = var49.getParameterTypes();
                                                                if (var43.length == var50.length) {
                                                                    boolean var51 = true;
                                                                    for (int var52 = 0; var52 < var43.length; var52++) {
                                                                        if (var43[var52] != var50[var52]) {
                                                                            var51 = false;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var51 && var45 == var49.getReturnType()) {
                                                                        var28.field3031[var29] = var49;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var28.field3034[var29] = var40;
                                                    }
                                                } catch (ClassNotFoundException var443) {
                                                    var28.field3032[var29] = -1;
                                                } catch (SecurityException var444) {
                                                    var28.field3032[var29] = -2;
                                                } catch (NullPointerException var445) {
                                                    var28.field3032[var29] = -3;
                                                } catch (Exception var446) {
                                                    var28.field3032[var29] = -4;
                                                } catch (Throwable var447) {
                                                    var28.field3032[var29] = -5;
                                                }
                                            }
                                            class202.field3039.method3434(var28);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 249) {
                                            int var58 = field524.method2193();
                                            field258 = var58;
                                            method74(false);
                                            method2795(var58);
                                            class34.method2972(field258);
                                            for (int var59 = 0; var59 < 100; var59++) {
                                                field474[var59] = true;
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 10 || field399 == 192 || field399 == 195 || field399 == 175 || field399 == 251 || field399 == 123 || field399 == 68 || field399 == 24 || field399 == 210 || field399 == 72) {
                                            method2663();
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 200) {
                                            method668(true);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 101) {
                                            int var60 = field524.method2215();
                                            Statics.field781 = Statics.field1483.method2561(var60);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 172) {
                                            Statics.field2922 = field524.method2352();
                                            Statics.field1931 = field524.method2187();
                                            while (field524.field1902 < field307) {
                                                field399 = field524.method2205();
                                                method2663();
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 3) {
                                            boolean var61 = field524.method2205() == 1;
                                            if (var61) {
                                                Statics.field614 = class107.method78() - field524.method2166();
                                                Statics.field674 = new class212(field524, true);
                                            } else {
                                                Statics.field674 = null;
                                            }
                                            field463 = field521;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 230) {
                                            Statics.method1806(true);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 206) {
                                            int var62 = field524.method2205();
                                            int var63 = field524.method2352();
                                            int var64 = field524.method2352();
                                            Statics.field991 = var62 >> 1;
                                            Statics.field2098.method657(var63, var64, (var62 & 0x1) == 1);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 219) {
                                            field500 = 0;
                                            field388 = 0;
                                            field524.method2422();
                                            int var65 = field524.method2420(1);
                                            if (var65 != 0) {
                                                int var66 = field524.method2420(2);
                                                if (var66 == 0) {
                                                    field389[++field388 - 1] = 2047;
                                                } else if (var66 == 1) {
                                                    int var67 = field524.method2420(3);
                                                    Statics.field2098.method662(var67, false);
                                                    int var68 = field524.method2420(1);
                                                    if (var68 == 1) {
                                                        field389[++field388 - 1] = 2047;
                                                    }
                                                } else if (var66 == 2) {
                                                    int var69 = field524.method2420(3);
                                                    Statics.field2098.method662(var69, true);
                                                    int var70 = field524.method2420(3);
                                                    Statics.field2098.method662(var70, true);
                                                    int var71 = field524.method2420(1);
                                                    if (var71 == 1) {
                                                        field389[++field388 - 1] = 2047;
                                                    }
                                                } else if (var66 == 3) {
                                                    int var72 = field524.method2420(7);
                                                    int var73 = field524.method2420(1);
                                                    if (var73 == 1) {
                                                        field389[++field388 - 1] = 2047;
                                                    }
                                                    Statics.field991 = field524.method2420(2);
                                                    int var74 = field524.method2420(7);
                                                    int var75 = field524.method2420(1);
                                                    Statics.field2098.method657(var72, var74, var75 == 1);
                                                }
                                            }
                                            method2098();
                                            while (field524.method2423(field307) >= 11) {
                                                int var76 = field524.method2420(11);
                                                if (var76 == 2047) {
                                                    break;
                                                }
                                                boolean var77 = false;
                                                if (field385[var76] == null) {
                                                    field385[var76] = new class3();
                                                    if (field390[var76] != null) {
                                                        field385[var76].method25(field390[var76]);
                                                    }
                                                    var77 = true;
                                                }
                                                field482[++field386 - 1] = var76;
                                                class3 var78 = field385[var76];
                                                var78.field809 = field423;
                                                int var79 = field524.method2420(5);
                                                if (var79 > 15) {
                                                    var79 -= 32;
                                                }
                                                int var80 = field524.method2420(1);
                                                if (var80 == 1) {
                                                    field389[++field388 - 1] = var76;
                                                }
                                                int var81 = field524.method2420(5);
                                                if (var81 > 15) {
                                                    var81 -= 32;
                                                }
                                                int var82 = field524.method2420(1);
                                                int var83 = field530[field524.method2420(3)];
                                                if (var77) {
                                                    var78.field811 = var78.field763 = var83;
                                                }
                                                var78.method657(Statics.field2098.field815[0] + var79, Statics.field2098.field816[0] + var81, var82 == 1);
                                            }
                                            field524.method2421();
                                            method705();
                                            for (int var84 = 0; var84 < field500; var84++) {
                                                int var85 = field355[var84];
                                                if (field423 != field385[var85].field809) {
                                                    field385[var85] = null;
                                                }
                                            }
                                            if (field307 != field524.field1902) {
                                                throw new RuntimeException(field524.field1902 + class2.field29 + field307);
                                            }
                                            for (int var86 = 0; var86 < field386; var86++) {
                                                if (field385[field482[var86]] == null) {
                                                    throw new RuntimeException(var86 + class2.field29 + field386);
                                                }
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 45) {
                                            int var87 = field524.method2321();
                                            int var88 = field524.method2202();
                                            class164 var89 = class164.method2744(var88);
                                            if (var89.field2721 != var87 || var87 == -1) {
                                                var89.field2721 = var87;
                                                var89.field2788 = 0;
                                                var89.field2789 = 0;
                                                method147(var89);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 201) {
                                            field518 = true;
                                            Statics.field2571 = field524.method2205();
                                            Statics.field161 = field524.method2205();
                                            Statics.field1841 = field524.method2339();
                                            Statics.field2806 = field524.method2205();
                                            Statics.field595 = field524.method2205();
                                            if (Statics.field595 >= 100) {
                                                Statics.field1829 = Statics.field2571 * 128 + 64;
                                                Statics.field1147 = Statics.field161 * 128 + 64;
                                                Statics.field2210 = method2468(Statics.field1829, Statics.field1147, Statics.field991) - Statics.field1841;
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 100) {
                                            String var90 = field524.method2170();
                                            int var91 = field524.method2339();
                                            byte var92 = field524.method2199();
                                            boolean var93 = false;
                                            if (var92 == -128) {
                                                var93 = true;
                                            }
                                            if (var93) {
                                                if (Statics.field168 == 0) {
                                                    field399 = -1;
                                                    var12 = true;
                                                    break label2948;
                                                }
                                                boolean var94 = false;
                                                int var95;
                                                for (var95 = 0; var95 < Statics.field168 && (!Statics.field1800[var95].field599.equals(var90) || Statics.field1800[var95].field602 != var91); var95++) {
                                                }
                                                if (var95 < Statics.field168) {
                                                    while (var95 < Statics.field168 - 1) {
                                                        Statics.field1800[var95] = Statics.field1800[var95 + 1];
                                                        var95++;
                                                    }
                                                    Statics.field168--;
                                                    Statics.field1800[Statics.field168] = null;
                                                }
                                            } else {
                                                field524.method2170();
                                                class23 var96 = new class23();
                                                var96.field599 = var90;
                                                var96.field604 = class155.method2081(var96.field599, Statics.field1455);
                                                var96.field602 = var91;
                                                var96.field597 = var92;
                                                int var97;
                                                for (var97 = Statics.field168 - 1; var97 >= 0; var97--) {
                                                    int var98 = Statics.field1800[var97].field604.compareTo(var96.field604);
                                                    if (var98 == 0) {
                                                        Statics.field1800[var97].field602 = var91;
                                                        Statics.field1800[var97].field597 = var92;
                                                        if (var90.equals(Statics.field2098.field49)) {
                                                            Statics.field2957 = var92;
                                                        }
                                                        field452 = field521;
                                                        field399 = -1;
                                                        var12 = true;
                                                        break label2948;
                                                    }
                                                    if (var98 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field168 >= Statics.field1800.length) {
                                                    field399 = -1;
                                                    var12 = true;
                                                    break label2948;
                                                }
                                                for (int var99 = Statics.field168 - 1; var99 > var97; var99--) {
                                                    Statics.field1800[var99 + 1] = Statics.field1800[var99];
                                                }
                                                if (Statics.field168 == 0) {
                                                    Statics.field1800 = new class23[100];
                                                }
                                                Statics.field1800[var97 + 1] = var96;
                                                Statics.field168++;
                                                if (var90.equals(Statics.field2098.field49)) {
                                                    Statics.field2957 = var92;
                                                }
                                            }
                                            field452 = field521;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 183) {
                                            method27();
                                            field399 = -1;
                                            var12 = false;
                                            break label2948;
                                        }
                                        if (field399 == 250) {
                                            while (field524.field1902 < field307) {
                                                boolean var100 = field524.method2205() == 1;
                                                String var101 = field524.method2170();
                                                String var102 = field524.method2170();
                                                int var103 = field524.method2339();
                                                int var104 = field524.method2205();
                                                int var105 = field524.method2205();
                                                boolean var106 = (var105 & 0x2) != 0;
                                                boolean var107 = (var105 & 0x1) != 0;
                                                if (var103 > 0) {
                                                    field524.method2170();
                                                    field524.method2205();
                                                    field524.method2165();
                                                }
                                                field524.method2170();
                                                for (int var108 = 0; var108 < field271; var108++) {
                                                    class17 var109 = field539[var108];
                                                    if (var100) {
                                                        if (var102.equals(var109.field239)) {
                                                            var109.field239 = var101;
                                                            var109.field247 = var102;
                                                            var101 = null;
                                                            break;
                                                        }
                                                    } else if (var101.equals(var109.field239)) {
                                                        if (var109.field240 != var103) {
                                                            boolean var110 = true;
                                                            for (class36 var111 = (class36) field540.method3350(); var111 != null; var111 = (class36) field540.method3352()) {
                                                                if (var111.field828.equals(var101)) {
                                                                    if (var103 != 0 && var111.field823 == 0) {
                                                                        var111.method3479();
                                                                        var110 = false;
                                                                    } else if (var103 == 0 && var111.field823 != 0) {
                                                                        var111.method3479();
                                                                        var110 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var110) {
                                                                field540.method3354(new class36(var101, var103));
                                                            }
                                                            var109.field240 = var103;
                                                        }
                                                        var109.field247 = var102;
                                                        var109.field241 = var104;
                                                        var109.field243 = var106;
                                                        var109.field238 = var107;
                                                        var101 = null;
                                                        break;
                                                    }
                                                }
                                                if (var101 != null && field271 < 400) {
                                                    class17 var112 = new class17();
                                                    field539[field271] = var112;
                                                    var112.field239 = var101;
                                                    var112.field247 = var102;
                                                    var112.field240 = var103;
                                                    var112.field241 = var104;
                                                    var112.field243 = var106;
                                                    var112.field238 = var107;
                                                    field271++;
                                                }
                                            }
                                            field538 = 2;
                                            field460 = field521;
                                            boolean var113 = false;
                                            int var114 = field271;
                                            while (var114 > 0) {
                                                boolean var115 = true;
                                                var114--;
                                                for (int var116 = 0; var116 < var114; var116++) {
                                                    boolean var117 = false;
                                                    class17 var118 = field539[var116];
                                                    class17 var119 = field539[var116 + 1];
                                                    if (field261 != var118.field240 && field261 == var119.field240) {
                                                        var117 = true;
                                                    }
                                                    if (!var117 && var118.field240 == 0 && var119.field240 != 0) {
                                                        var117 = true;
                                                    }
                                                    if (!var117 && !var118.field243 && var119.field243) {
                                                        var117 = true;
                                                    }
                                                    if (!var117 && !var118.field238 && var119.field238) {
                                                        var117 = true;
                                                    }
                                                    if (var117) {
                                                        class17 var120 = field539[var116];
                                                        field539[var116] = field539[var116 + 1];
                                                        field539[var116 + 1] = var120;
                                                        var115 = false;
                                                    }
                                                }
                                                if (var115) {
                                                    break;
                                                }
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 226) {
                                            int var121 = field524.method2339();
                                            int var122 = field524.method2202();
                                            class164 var123 = class164.method2744(var122);
                                            if (var123 != null && var123.field2670 == 0) {
                                                if (var121 > var123.field2692 - var123.field2684) {
                                                    var121 = var123.field2692 - var123.field2684;
                                                }
                                                if (var121 < 0) {
                                                    var121 = 0;
                                                }
                                                if (var123.field2690 != var121) {
                                                    var123.field2690 = var121;
                                                    method147(var123);
                                                }
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 218) {
                                            field524.field1902 += 28;
                                            if (field524.method2313()) {
                                                class141.method3077(field524, field524.field1902 - 28);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 28) {
                                            int var124 = field524.method2204();
                                            int var125 = field524.method2204();
                                            class4 var126 = (class4) field522.method3357((long) var125);
                                            class4 var127 = (class4) field522.method3357((long) var124);
                                            if (var127 != null) {
                                                method2095(var127, var126 == null || var126.field61 != var127.field61);
                                            }
                                            if (var126 != null) {
                                                var126.method3482();
                                                field522.method3358(var126, (long) var124);
                                            }
                                            class164 var128 = class164.method2744(var125);
                                            if (var128 != null) {
                                                method147(var128);
                                            }
                                            class164 var129 = class164.method2744(var124);
                                            if (var129 != null) {
                                                method147(var129);
                                                method97(Statics.field2685[var129.field2792 >>> 16], var129, true);
                                            }
                                            if (field258 != -1) {
                                                method896(field258, 1);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 71) {
                                            int var130 = field524.method2165();
                                            int var131 = field524.method2339();
                                            if (var130 < -70000) {
                                                var131 += 32768;
                                            }
                                            class164 var132;
                                            if (var130 >= 0) {
                                                var132 = class164.method2744(var130);
                                            } else {
                                                var132 = null;
                                            }
                                            if (var132 != null) {
                                                for (int var133 = 0; var133 < var132.field2784.length; var133++) {
                                                    var132.field2784[var133] = 0;
                                                    var132.field2693[var133] = 0;
                                                }
                                            }
                                            class15.method581(var131);
                                            int var134 = field524.method2339();
                                            for (int var135 = 0; var135 < var134; var135++) {
                                                int var136 = field524.method2339();
                                                int var137 = field524.method2186();
                                                if (var137 == 255) {
                                                    var137 = field524.method2202();
                                                }
                                                if (var132 != null && var135 < var132.field2784.length) {
                                                    var132.field2784[var135] = var136;
                                                    var132.field2693[var135] = var137;
                                                }
                                                class15.method589(var131, var135, var136 - 1, var137);
                                            }
                                            if (var132 != null) {
                                                method147(var132);
                                            }
                                            method157();
                                            field455[++field266 - 1 & 0x1F] = var131 & 0x7FFF;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 12) {
                                            int var138 = field524.method2194();
                                            int var139 = field524.method2165();
                                            int var140 = var138 >> 10 & 0x1F;
                                            int var141 = var138 >> 5 & 0x1F;
                                            int var142 = var138 & 0x1F;
                                            int var143 = (var142 << 3) + (var140 << 19) + (var141 << 11);
                                            class164 var144 = class164.method2744(var139);
                                            if (var144.field2688 != var143) {
                                                var144.field2688 = var143;
                                                method147(var144);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 89) {
                                            int var145 = field524.method2194();
                                            class15 var146 = (class15) class15.field217.method3357((long) var145);
                                            if (var146 != null) {
                                                var146.method3482();
                                            }
                                            field455[++field266 - 1 & 0x1F] = var145 & 0x7FFF;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 221) {
                                            int var147 = field524.method2194();
                                            int var148 = field524.method2193();
                                            int var149 = field524.method2202();
                                            int var150 = field524.method2194();
                                            class164 var151 = class164.method2744(var149);
                                            if (var151.field2739 != var148 || var151.field2673 != var150 || var151.field2762 != var147) {
                                                var151.field2739 = var148;
                                                var151.field2673 = var150;
                                                var151.field2762 = var147;
                                                method147(var151);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 162) {
                                            Statics.method1806(false);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 53) {
                                            for (int var152 = 0; var152 < field385.length; var152++) {
                                                if (field385[var152] != null) {
                                                    field385[var152].field777 = -1;
                                                }
                                            }
                                            for (int var153 = 0; var153 < field365.length; var153++) {
                                                if (field365[var153] != null) {
                                                    field365[var153].field777 = -1;
                                                }
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 116) {
                                            String var154 = field524.method2170();
                                            long var155 = (long) field524.method2339();
                                            long var157 = (long) field524.method2164();
                                            class143 var159 = (class143) class101.method529(class143.method864(), field524.method2205());
                                            long var160 = (var155 << 32) + var157;
                                            boolean var162 = false;
                                            for (int var163 = 0; var163 < 100; var163++) {
                                                if (field491[var163] == var160) {
                                                    var162 = true;
                                                    break;
                                                }
                                            }
                                            if (method2784(var154)) {
                                                var162 = true;
                                            }
                                            if (!var162 && field384 == 0) {
                                                field491[field507] = var160;
                                                field507 = (field507 + 1) % 100;
                                                class114 var164 = field524;
                                                String var168;
                                                try {
                                                    int var165 = var164.method2173();
                                                    if (var165 > 32767) {
                                                        var165 = 32767;
                                                    }
                                                    byte[] var166 = new byte[var165];
                                                    var164.field1902 += Statics.field3082.method2087(var164.field1897, var164.field1902, var166, 0, var165);
                                                    String var167 = Statics.method29(var166, 0, var165);
                                                    var168 = var167;
                                                } catch (Exception var439) {
                                                    var168 = "Cabbage";
                                                }
                                                String var171 = class214.method3615(class154.method26(var168));
                                                byte var172;
                                                if (var159.field2182) {
                                                    var172 = 7;
                                                } else {
                                                    var172 = 3;
                                                }
                                                if (var159.field2181 == -1) {
                                                    class11.method590(var172, var154, var171);
                                                } else {
                                                    class11.method590(var172, class2.method1058(var159.field2181) + var154, var171);
                                                }
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 106) {
                                            int var173 = field524.method2202();
                                            String var174 = field524.method2170();
                                            class164 var175 = class164.method2744(var173);
                                            if (!var174.equals(var175.field2726)) {
                                                var175.field2726 = var174;
                                                method147(var175);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 60) {
                                            while (field524.field1902 < field307) {
                                                int var176 = field524.method2205();
                                                boolean var177 = (var176 & 0x1) == 1;
                                                String var178 = field524.method2170();
                                                String var179 = field524.method2170();
                                                field524.method2170();
                                                for (int var180 = 0; var180 < field431; var180++) {
                                                    class8 var181 = field542[var180];
                                                    if (var177) {
                                                        if (var179.equals(var181.field123)) {
                                                            var181.field123 = var178;
                                                            var181.field124 = var179;
                                                            var178 = null;
                                                            break;
                                                        }
                                                    } else if (var178.equals(var181.field123)) {
                                                        var181.field123 = var178;
                                                        var181.field124 = var179;
                                                        var178 = null;
                                                        break;
                                                    }
                                                }
                                                if (var178 != null && field431 < 400) {
                                                    class8 var182 = new class8();
                                                    field542[field431] = var182;
                                                    var182.field123 = var178;
                                                    var182.field124 = var179;
                                                    field431++;
                                                }
                                            }
                                            field460 = field521;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 84) {
                                            int var183 = field524.method2339();
                                            int var184 = field524.method2205();
                                            int var185 = field524.method2339();
                                            method767(var183, var184, var185);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 163) {
                                            field278 = field524.method2195() * 30;
                                            field314 = field521;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 20) {
                                            String var186 = field524.method2170();
                                            Statics.field292 = var186;
                                            try {
                                                String var187 = Statics.field259.getParameter(class181.field2973.field2976);
                                                String var188 = Statics.field259.getParameter(class181.field2974.field2976);
                                                String var189 = var187 + "settings=" + var186 + "; version=1; path=/; domain=" + var188;
                                                String var190;
                                                if (var186.length() == 0) {
                                                    var190 = var189 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                                } else {
                                                    var190 = var189 + "; Expires=" + class103.method2603(class107.method78() + 94608000000L) + "; Max-Age=" + 94608000L;
                                                }
                                                class124.method2502(Statics.field259, "document.cookie=\"" + var190 + "\"");
                                            } catch (Throwable var438) {
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 199) {
                                            method157();
                                            field318 = field524.method2163();
                                            field314 = field521;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 0) {
                                            int var192 = field524.method2195();
                                            int var193 = field524.method2202();
                                            class164 var194 = class164.method2744(var193);
                                            if (var194.field2709 != 2 || var194.field2745 != var192) {
                                                var194.field2709 = 2;
                                                var194.field2745 = var192;
                                                method147(var194);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 238) {
                                            int var195 = field524.method2205();
                                            int var196 = field524.method2205();
                                            int var197 = field524.method2205();
                                            int var198 = field524.method2205();
                                            field404[var195] = true;
                                            field293[var195] = var196;
                                            field427[var195] = var197;
                                            field363[var195] = var198;
                                            field308[var195] = 0;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 131) {
                                            Statics.field2628 = class122.method2486(field524.method2205());
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 121) {
                                            int var199 = field524.method2215();
                                            class164 var200 = class164.method2744(var199);
                                            for (int var201 = 0; var201 < var200.field2784.length; var201++) {
                                                var200.field2784[var201] = -1;
                                                var200.field2784[var201] = 0;
                                            }
                                            method147(var200);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 228) {
                                            field488 = field524.method2205();
                                            field405 = field524.method2205();
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 142) {
                                            int var202 = field524.method2195();
                                            int var203 = field524.method2204();
                                            int var204 = field524.method2193();
                                            class164 var205 = class164.method2744(var203);
                                            var205.field2752 = (var202 << 16) + var204;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 181) {
                                            int var206 = field524.method2205();
                                            if (field524.method2205() == 0) {
                                                field546[var206] = new class211();
                                                field524.field1902 += 18;
                                            } else {
                                                field524.field1902--;
                                                field546[var206] = new class211(field524, false);
                                            }
                                            field462 = field521;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 75) {
                                            String var207 = field524.method2170();
                                            class114 var208 = field524;
                                            String var212;
                                            try {
                                                int var209 = var208.method2173();
                                                if (var209 > 32767) {
                                                    var209 = 32767;
                                                }
                                                byte[] var210 = new byte[var209];
                                                var208.field1902 += Statics.field3082.method2087(var208.field1897, var208.field1902, var210, 0, var209);
                                                String var211 = Statics.method29(var210, 0, var209);
                                                var212 = var211;
                                            } catch (Exception var437) {
                                                var212 = "Cabbage";
                                            }
                                            String var215 = class214.method3615(class154.method26(var212));
                                            class11.method590(6, var207, var215);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 235) {
                                            int var216 = field524.method2204();
                                            class164 var217 = class164.method2744(var216);
                                            var217.field2709 = 3;
                                            var217.field2745 = Statics.field2098.field36.method3084();
                                            method147(var217);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 244) {
                                            field538 = 1;
                                            field460 = field521;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 234) {
                                            field279 = field524.method2205();
                                            if (field279 == 1) {
                                                field280 = field524.method2339();
                                            }
                                            if (field279 >= 2 && field279 <= 6) {
                                                if (field279 == 2) {
                                                    field285 = 64;
                                                    field286 = 64;
                                                }
                                                if (field279 == 3) {
                                                    field285 = 0;
                                                    field286 = 64;
                                                }
                                                if (field279 == 4) {
                                                    field285 = 128;
                                                    field286 = 64;
                                                }
                                                if (field279 == 5) {
                                                    field285 = 64;
                                                    field286 = 0;
                                                }
                                                if (field279 == 6) {
                                                    field285 = 64;
                                                    field286 = 128;
                                                }
                                                field279 = 2;
                                                field478 = field524.method2339();
                                                field283 = field524.method2339();
                                                field274 = field524.method2205();
                                            }
                                            if (field279 == 10) {
                                                field281 = field524.method2339();
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 174) {
                                            field452 = field521;
                                            if (field307 == 0) {
                                                field497 = null;
                                                field498 = null;
                                                Statics.field168 = 0;
                                                Statics.field1800 = null;
                                                field399 = -1;
                                                var12 = true;
                                                break label2948;
                                            }
                                            field498 = field524.method2170();
                                            long var218 = field524.method2166();
                                            field497 = class153.method795(var218);
                                            Statics.field2651 = field524.method2199();
                                            int var220 = field524.method2205();
                                            if (var220 == 255) {
                                                field399 = -1;
                                                var12 = true;
                                                break label2948;
                                            }
                                            Statics.field168 = var220;
                                            class23[] var221 = new class23[100];
                                            for (int var222 = 0; var222 < Statics.field168; var222++) {
                                                var221[var222] = new class23();
                                                var221[var222].field599 = field524.method2170();
                                                var221[var222].field604 = class155.method2081(var221[var222].field599, Statics.field1455);
                                                var221[var222].field602 = field524.method2339();
                                                var221[var222].field597 = field524.method2199();
                                                field524.method2170();
                                                if (var221[var222].field599.equals(Statics.field2098.field49)) {
                                                    Statics.field2957 = var221[var222].field597;
                                                }
                                            }
                                            boolean var223 = false;
                                            int var224 = Statics.field168;
                                            while (var224 > 0) {
                                                boolean var225 = true;
                                                var224--;
                                                for (int var226 = 0; var226 < var224; var226++) {
                                                    if (var221[var226].field604.compareTo(var221[var226 + 1].field604) > 0) {
                                                        class23 var227 = var221[var226];
                                                        var221[var226] = var221[var226 + 1];
                                                        var221[var226 + 1] = var227;
                                                        var225 = false;
                                                    }
                                                }
                                                if (var225) {
                                                    break;
                                                }
                                            }
                                            Statics.field1800 = var221;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 113) {
                                            method157();
                                            field270 = field524.method2205();
                                            field314 = field521;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 170) {
                                            int var228 = field524.method2194();
                                            int var229 = field524.method2186();
                                            int var230 = field524.method2202();
                                            class4 var231 = (class4) field522.method3357((long) var230);
                                            if (var231 != null) {
                                                method2095(var231, var231.field61 != var228);
                                            }
                                            method763(var230, var228, var229);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 17) {
                                            String var232 = field524.method2170();
                                            Object[] var233 = new Object[var232.length() + 1];
                                            for (int var234 = var232.length() - 1; var234 >= 0; var234--) {
                                                if (var232.charAt(var234) == 's') {
                                                    var233[var234 + 1] = field524.method2170();
                                                } else {
                                                    var233[var234 + 1] = Integer.valueOf(field524.method2165());
                                                }
                                            }
                                            var233[0] = Integer.valueOf(field524.method2165());
                                            class1 var235 = new class1();
                                            var235.field11 = var233;
                                            class34.method607(var235);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 124) {
                                            field506 = field524.method2205();
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 135) {
                                            method157();
                                            int var236 = field524.method2186();
                                            int var237 = field524.method2204();
                                            int var238 = field524.method2352();
                                            field409[var238] = var237;
                                            field353[var238] = var236;
                                            field302[var238] = 1;
                                            for (int var239 = 0; var239 < 98; var239++) {
                                                if (var237 >= class146.field2207[var239]) {
                                                    field302[var238] = var239 + 2;
                                                }
                                            }
                                            field457[++field458 - 1 & 0x1F] = var238;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 66) {
                                            field504 = field524.method2205();
                                            if (field504 == 255) {
                                                field504 = 0;
                                            }
                                            field282 = field524.method2205();
                                            if (field282 == 255) {
                                                field282 = 0;
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 83) {
                                            class24 var240 = new class24();
                                            var240.field618 = field524.method2170();
                                            var240.field616 = field524.method2339();
                                            int var241 = field524.method2165();
                                            var240.field617 = var241;
                                            method165(45);
                                            Statics.field113.method2640();
                                            Statics.field113 = null;
                                            class30.method144(var240);
                                            field399 = -1;
                                            var12 = false;
                                            break label2948;
                                        }
                                        if (field399 == 11) {
                                            int var242 = field307 + field524.field1902;
                                            int var243 = field524.method2339();
                                            int var244 = field524.method2339();
                                            if (field258 != var243) {
                                                field258 = var243;
                                                method74(false);
                                                method2795(field258);
                                                class34.method2972(field258);
                                                for (int var245 = 0; var245 < 100; var245++) {
                                                    field474[var245] = true;
                                                }
                                            }
                                            while (var244-- > 0) {
                                                int var246 = field524.method2165();
                                                int var247 = field524.method2339();
                                                int var248 = field524.method2205();
                                                class4 var249 = (class4) field522.method3357((long) var246);
                                                if (var249 != null && var249.field61 != var247) {
                                                    method2095(var249, true);
                                                    var249 = null;
                                                }
                                                if (var249 == null) {
                                                    var249 = method763(var246, var247, var248);
                                                }
                                                var249.field58 = true;
                                            }
                                            for (class4 var250 = (class4) field522.method3360(); var250 != null; var250 = (class4) field522.method3373()) {
                                                if (var250.field58) {
                                                    var250.field58 = false;
                                                } else {
                                                    method2095(var250, true);
                                                }
                                            }
                                            field471 = new class187(512);
                                            while (field524.field1902 < var242) {
                                                int var251 = field524.method2165();
                                                int var252 = field524.method2339();
                                                int var253 = field524.method2339();
                                                int var254 = field524.method2165();
                                                for (int var255 = var252; var255 <= var253; var255++) {
                                                    long var256 = ((long) var251 << 32) + (long) var255;
                                                    field471.method3358(new class192(var254), var256);
                                                }
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 151) {
                                            int var258 = field524.method2339();
                                            int var259 = field524.method2165();
                                            class164 var260 = class164.method2744(var259);
                                            if (var260.field2709 != 1 || var260.field2745 != var258) {
                                                var260.field2709 = 1;
                                                var260.field2745 = var258;
                                                method147(var260);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 80) {
                                            String var261 = field524.method2170();
                                            long var262 = field524.method2166();
                                            long var264 = (long) field524.method2339();
                                            long var266 = (long) field524.method2164();
                                            class143 var268 = (class143) class101.method529(class143.method864(), field524.method2205());
                                            long var269 = (var264 << 32) + var266;
                                            boolean var271 = false;
                                            for (int var272 = 0; var272 < 100; var272++) {
                                                if (field491[var272] == var269) {
                                                    var271 = true;
                                                    break;
                                                }
                                            }
                                            if (var268.field2175 && method2784(var261)) {
                                                var271 = true;
                                            }
                                            if (!var271 && field384 == 0) {
                                                field491[field507] = var269;
                                                field507 = (field507 + 1) % 100;
                                                class114 var273 = field524;
                                                String var277;
                                                try {
                                                    int var274 = var273.method2173();
                                                    if (var274 > 32767) {
                                                        var274 = 32767;
                                                    }
                                                    byte[] var275 = new byte[var274];
                                                    var273.field1902 += Statics.field3082.method2087(var273.field1897, var273.field1902, var275, 0, var274);
                                                    String var276 = Statics.method29(var275, 0, var274);
                                                    var277 = var276;
                                                } catch (Exception var436) {
                                                    var277 = "Cabbage";
                                                }
                                                String var280 = class214.method3615(class154.method26(var277));
                                                if (var268.field2181 == -1) {
                                                    class11.method411(9, var261, var280, class153.method2775(var262));
                                                } else {
                                                    class11.method411(9, class2.method1058(var268.field2181) + var261, var280, class153.method2775(var262));
                                                }
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 120) {
                                            Statics.field1931 = field524.method2205();
                                            Statics.field2922 = field524.method2352();
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 51) {
                                            int var281 = field524.method2339();
                                            if (var281 == 65535) {
                                                var281 = -1;
                                            }
                                            int var282 = field524.method2195();
                                            if (var282 == 65535) {
                                                var282 = -1;
                                            }
                                            int var283 = field524.method2165();
                                            int var284 = field524.method2215();
                                            for (int var285 = var281; var285 <= var282; var285++) {
                                                long var286 = ((long) var284 << 32) + (long) var285;
                                                class199 var288 = field471.method3357(var286);
                                                if (var288 != null) {
                                                    var288.method3482();
                                                }
                                                field471.method3358(new class192(var283), var286);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 129) {
                                            int var289 = field524.method2165();
                                            class4 var290 = (class4) field522.method3357((long) var289);
                                            if (var290 != null) {
                                                method2095(var290, true);
                                            }
                                            if (field332 != null) {
                                                method147(field332);
                                                field332 = null;
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 14) {
                                            int var291 = field524.method2339();
                                            int var292 = field524.method2204();
                                            class167.field2817[var291] = var292;
                                            if (class167.field2816[var291] != var292) {
                                                class167.field2816[var291] = var292;
                                                method125(var291);
                                            }
                                            field430[++field454 - 1 & 0x1F] = var291;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 111) {
                                            int var293 = field524.method2193();
                                            if (var293 == 65535) {
                                                var293 = -1;
                                            }
                                            method2971(var293);
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 94) {
                                            int var294 = field524.method2213();
                                            int var295 = field524.method2193();
                                            if (var295 == 65535) {
                                                var295 = -1;
                                            }
                                            if (field412 != 0 && var295 != -1) {
                                                class174.method2487(Statics.field2555, var295, 0, field412, false);
                                                field509 = true;
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 26) {
                                            Statics.field1931 = field524.method2205();
                                            Statics.field2922 = field524.method2352();
                                            for (int var296 = Statics.field2922; var296 < Statics.field2922 + 8; var296++) {
                                                for (int var297 = Statics.field1931; var297 < Statics.field1931 + 8; var297++) {
                                                    if (field400[Statics.field991][var296][var297] != null) {
                                                        field400[Statics.field991][var296][var297] = null;
                                                        method704(var296, var297);
                                                    }
                                                }
                                            }
                                            for (class16 var298 = (class16) field401.method3396(); var298 != null; var298 = (class16) field401.method3398()) {
                                                if (var298.field222 >= Statics.field2922 && var298.field222 < Statics.field2922 + 8 && var298.field223 >= Statics.field1931 && var298.field223 < Statics.field1931 + 8 && Statics.field991 == var298.field232) {
                                                    var298.field231 = 0;
                                                }
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 88) {
                                            field518 = false;
                                            for (int var299 = 0; var299 < 5; var299++) {
                                                field404[var299] = false;
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 42) {
                                            byte var300 = field524.method2365();
                                            int var301 = field524.method2195();
                                            class167.field2817[var301] = var300;
                                            if (class167.field2816[var301] != var300) {
                                                class167.field2816[var301] = var300;
                                                method125(var301);
                                            }
                                            field430[++field454 - 1 & 0x1F] = var301;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 214) {
                                            field518 = true;
                                            Statics.field723 = field524.method2205();
                                            Statics.field1727 = field524.method2205();
                                            Statics.field2196 = field524.method2339();
                                            Statics.field1860 = field524.method2205();
                                            Statics.field1613 = field524.method2205();
                                            if (Statics.field1613 >= 100) {
                                                int var302 = Statics.field723 * 128 + 64;
                                                int var303 = Statics.field1727 * 128 + 64;
                                                int var304 = method2468(var302, var303, Statics.field991) - Statics.field2196;
                                                int var305 = var302 - Statics.field1829;
                                                int var306 = var304 - Statics.field2210;
                                                int var307 = var303 - Statics.field1147;
                                                int var308 = (int) Math.sqrt((double) (var305 * var305 + var307 * var307));
                                                Statics.field13 = (int) (Math.atan2((double) var306, (double) var308) * 325.949D) & 0x7FF;
                                                Statics.field1971 = (int) (Math.atan2((double) var305, (double) var307) * -325.949D) & 0x7FF;
                                                if (Statics.field13 < 128) {
                                                    Statics.field13 = 128;
                                                }
                                                if (Statics.field13 > 383) {
                                                    Statics.field13 = 383;
                                                }
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 215) {
                                            for (int var309 = 0; var309 < class167.field2816.length; var309++) {
                                                if (class167.field2817[var309] != class167.field2816[var309]) {
                                                    class167.field2816[var309] = class167.field2817[var309];
                                                    method125(var309);
                                                    field430[++field454 - 1 & 0x1F] = var309;
                                                }
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 67) {
                                            boolean var310 = field524.method2187() == 1;
                                            int var311 = field524.method2215();
                                            class164 var312 = class164.method2744(var311);
                                            if (var312.field2671 != var310) {
                                                var312.field2671 = var310;
                                                method147(var312);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 31) {
                                            int var313 = field524.method2165();
                                            int var314 = field524.method2339();
                                            if (var313 < -70000) {
                                                var314 += 32768;
                                            }
                                            class164 var315;
                                            if (var313 >= 0) {
                                                var315 = class164.method2744(var313);
                                            } else {
                                                var315 = null;
                                            }
                                            while (field524.field1902 < field307) {
                                                int var316 = field524.method2173();
                                                int var317 = field524.method2339();
                                                int var318 = 0;
                                                if (var317 != 0) {
                                                    var318 = field524.method2205();
                                                    if (var318 == 255) {
                                                        var318 = field524.method2165();
                                                    }
                                                }
                                                if (var315 != null && var316 >= 0 && var316 < var315.field2784.length) {
                                                    var315.field2784[var316] = var317;
                                                    var315.field2693[var316] = var318;
                                                }
                                                class15.method589(var314, var316, var317 - 1, var318);
                                            }
                                            if (var315 != null) {
                                                method147(var315);
                                            }
                                            method157();
                                            field455[++field266 - 1 & 0x1F] = var314 & 0x7FFF;
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 202) {
                                            int var319 = field524.method2186();
                                            String var320 = field524.method2170();
                                            int var321 = field524.method2187();
                                            if (var319 >= 1 && var319 <= 8) {
                                                if (var320.equalsIgnoreCase("null")) {
                                                    var320 = null;
                                                }
                                                field396[var319 - 1] = var320;
                                                field397[var319 - 1] = var321 == 0;
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        if (field399 == 102) {
                                            int var322 = field524.method2173();
                                            boolean var323 = field524.method2205() == 1;
                                            String var324 = "";
                                            boolean var325 = false;
                                            if (var323) {
                                                var324 = field524.method2170();
                                                if (method2784(var324)) {
                                                    var325 = true;
                                                }
                                            }
                                            String var326 = field524.method2170();
                                            if (!var325) {
                                                class11.method590(var322, var324, var326);
                                            }
                                            field399 = -1;
                                            var12 = true;
                                            break label2948;
                                        }
                                        class140.method793("" + field399 + class2.field29 + field287 + class2.field29 + field313 + class2.field29 + field307, (Throwable) null);
                                        method27();
                                    } catch (IOException var448) {
                                        method531();
                                    } catch (Exception var449) {
                                        String var329 = "" + field399 + class2.field29 + field287 + class2.field29 + field313 + class2.field29 + field307 + class2.field29 + (Statics.field2052 + Statics.field2098.field815[0]) + class2.field29 + (Statics.field613 + Statics.field2098.field816[0]) + class2.field29;
                                        for (int var330 = 0; var330 < field307 && var330 < 50; var330++) {
                                            var329 = var329 + field524.field1897[var330] + class2.field29;
                                        }
                                        class140.method793(var329, var449);
                                        method27();
                                    }
                                    var12 = true;
                                }
                            }
                            if (!var12) {
                                break;
                            }
                        }
                        if (field269 == 30) {
                            while (true) {
                                class201 var331 = (class201) class202.field3039.method3442();
                                boolean var332;
                                if (var331 == null) {
                                    var332 = false;
                                } else {
                                    var332 = true;
                                }
                                if (!var332) {
                                    Object var334 = Statics.field1938.field189;
                                    synchronized (Statics.field1938.field189) {
                                        if (!field260) {
                                            Statics.field1938.field190 = 0;
                                        } else if (class132.field2068 != 0 || Statics.field1938.field190 >= 40) {
                                            field284.method2429(28);
                                            field284.method2145(0);
                                            int var335 = field284.field1902;
                                            int var336 = 0;
                                            for (int var337 = 0; var337 < Statics.field1938.field190 && field284.field1902 - var335 < 240; var337++) {
                                                var336++;
                                                int var338 = Statics.field1938.field192[var337];
                                                if (var338 < 0) {
                                                    var338 = 0;
                                                } else if (var338 > 502) {
                                                    var338 = 502;
                                                }
                                                int var339 = Statics.field1938.field191[var337];
                                                if (var339 < 0) {
                                                    var339 = 0;
                                                } else if (var339 > 764) {
                                                    var339 = 764;
                                                }
                                                int var340 = var338 * 765 + var339;
                                                if (Statics.field1938.field192[var337] == -1 && Statics.field1938.field191[var337] == -1) {
                                                    var339 = -1;
                                                    var338 = -1;
                                                    var340 = 524287;
                                                }
                                                if (field273 != var339 || field535 != var338) {
                                                    int var341 = var339 - field273;
                                                    field273 = var339;
                                                    int var342 = var338 - field535;
                                                    field535 = var338;
                                                    if (field275 < 8 && var341 >= -32 && var341 <= 31 && var342 >= -32 && var342 <= 31) {
                                                        var341 += 32;
                                                        var342 += 32;
                                                        field284.method2319((field275 << 12) + (var341 << 6) + var342);
                                                        field275 = 0;
                                                    } else if (field275 < 8) {
                                                        field284.method2147((field275 << 19) + 8388608 + var340);
                                                        field275 = 0;
                                                    } else {
                                                        field284.method2148((field275 << 19) + -1073741824 + var340);
                                                        field275 = 0;
                                                    }
                                                } else if (field275 < 2047) {
                                                    field275++;
                                                }
                                            }
                                            field284.method2157(field284.field1902 - var335);
                                            if (var336 >= Statics.field1938.field190) {
                                                Statics.field1938.field190 = 0;
                                            } else {
                                                Statics.field1938.field190 -= var336;
                                                for (int var343 = 0; var343 < Statics.field1938.field190; var343++) {
                                                    Statics.field1938.field191[var343] = Statics.field1938.field191[var336 + var343];
                                                    Statics.field1938.field192[var343] = Statics.field1938.field192[var336 + var343];
                                                }
                                            }
                                        }
                                    }
                                    if (class132.field2068 == 1 || !Statics.field213 && class132.field2068 == 4 || class132.field2068 == 2) {
                                        long var345 = (class132.field2080 - field272 * -1L) / 50L;
                                        if (var345 > 4095L) {
                                            var345 = 4095L;
                                        }
                                        field272 = class132.field2080 * -1L;
                                        int var347 = class132.field2079;
                                        if (var347 < 0) {
                                            var347 = 0;
                                        } else if (var347 > Statics.field2125) {
                                            var347 = Statics.field2125;
                                        }
                                        int var348 = class132.field2077;
                                        if (var348 < 0) {
                                            var348 = 0;
                                        } else if (var348 > Statics.field178) {
                                            var348 = Statics.field178;
                                        }
                                        int var349 = (int) var345;
                                        field284.method2429(114);
                                        field284.method2319((class132.field2068 == 2 ? 1 : 0) + (var349 << 1));
                                        field284.method2319(var348);
                                        field284.method2319(var347);
                                    }
                                    if (class129.field2040 > 0) {
                                        field284.method2429(60);
                                        field284.method2319(0);
                                        int var350 = field284.field1902;
                                        long var351 = class107.method78();
                                        for (int var353 = 0; var353 < class129.field2040; var353++) {
                                            long var354 = var351 - field496;
                                            if (var354 > 16777215L) {
                                                var354 = 16777215L;
                                            }
                                            field496 = var351;
                                            field284.method2147((int) var354);
                                            field284.method2183(class129.field2035[var353]);
                                        }
                                        field284.method2156(field284.field1902 - var350);
                                    }
                                    if (field382 > 0) {
                                        field382--;
                                    }
                                    if (class129.field2027[96] || class129.field2027[97] || class129.field2027[98] || class129.field2027[99]) {
                                        field356 = true;
                                    }
                                    if (field356 && field382 <= 0) {
                                        field382 = 20;
                                        field356 = false;
                                        field284.method2429(10);
                                        field284.method2319(field350);
                                        field284.method2319(field349);
                                    }
                                    if (Statics.field2081 && !field276) {
                                        field276 = true;
                                        field284.method2429(208);
                                        field284.method2145(1);
                                    }
                                    if (!Statics.field2081 && field276) {
                                        field276 = false;
                                        field284.method2429(208);
                                        field284.method2145(0);
                                    }
                                    method160();
                                    if (field269 == 30) {
                                        method2633();
                                        method702();
                                        field309++;
                                        if (field309 > 750) {
                                            method531();
                                        } else {
                                            method888();
                                            for (int var356 = 0; var356 < field505; var356++) {
                                                int var357 = field466[var356];
                                                class32 var358 = field365[var357];
                                                if (var358 != null) {
                                                    method604(var358, var358.field729.field849);
                                                }
                                            }
                                            method2532();
                                            field537++;
                                            if (field375 != 0) {
                                                field374 += 20;
                                                if (field374 >= 400) {
                                                    field375 = 0;
                                                }
                                            }
                                            if (Statics.field2185 != null) {
                                                field301++;
                                                if (field301 >= 15) {
                                                    method147(Statics.field2185);
                                                    Statics.field2185 = null;
                                                }
                                            }
                                            class164 var359 = Statics.field1980;
                                            class164 var360 = Statics.field2923;
                                            Statics.field1980 = null;
                                            Statics.field2923 = null;
                                            field444 = null;
                                            field448 = false;
                                            field445 = false;
                                            field493 = 0;
                                            while (true) {
                                                while (class129.method862() && field493 < 128) {
                                                    if (field434 >= 2 && class129.field2027[82] && Statics.field1471 == 66) {
                                                        String var361 = class11.method806();
                                                        Statics.field62.setContents(new StringSelection(var361), (ClipboardOwner) null);
                                                    } else {
                                                        field381[field493] = Statics.field1471;
                                                        field494[field493] = Statics.field2033;
                                                        field493++;
                                                    }
                                                }
                                                method638(field258, 0, 0, Statics.field178, Statics.field2125, 0, 0);
                                                field521++;
                                                while (true) {
                                                    class1 var362;
                                                    class164 var363;
                                                    class164 var364;
                                                    do {
                                                        var362 = (class1) field469.method3394();
                                                        if (var362 == null) {
                                                            while (true) {
                                                                class1 var365;
                                                                class164 var366;
                                                                class164 var367;
                                                                do {
                                                                    var365 = (class1) field541.method3394();
                                                                    if (var365 == null) {
                                                                        while (true) {
                                                                            class1 var368;
                                                                            class164 var369;
                                                                            class164 var370;
                                                                            do {
                                                                                var368 = (class1) field468.method3394();
                                                                                if (var368 == null) {
                                                                                    boolean var371 = false;
                                                                                    while (!var371) {
                                                                                        var371 = true;
                                                                                        for (int var372 = 0; var372 < field320 - 1; var372++) {
                                                                                            if (field545[var372] < 1000 && field545[var372 + 1] > 1000) {
                                                                                                String var373 = field366[var372];
                                                                                                field366[var372] = field366[var372 + 1];
                                                                                                field366[var372 + 1] = var373;
                                                                                                String var374 = field414[var372];
                                                                                                field414[var372] = field414[var372 + 1];
                                                                                                field414[var372 + 1] = var374;
                                                                                                int var375 = field545[var372];
                                                                                                field545[var372] = field545[var372 + 1];
                                                                                                field545[var372 + 1] = var375;
                                                                                                int var376 = field347[var372];
                                                                                                field347[var372] = field347[var372 + 1];
                                                                                                field347[var372 + 1] = var376;
                                                                                                int var377 = field411[var372];
                                                                                                field411[var372] = field411[var372 + 1];
                                                                                                field411[var372 + 1] = var377;
                                                                                                int var378 = field433[var372];
                                                                                                field433[var372] = field433[var372 + 1];
                                                                                                field433[var372 + 1] = var378;
                                                                                                var371 = false;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field1672 == null && field361 == null) {
                                                                                        int var379 = class132.field2068;
                                                                                        if (field408) {
                                                                                            if (var379 != 1 && (Statics.field213 || var379 != 4)) {
                                                                                                int var380 = class132.field2071;
                                                                                                int var381 = class132.field2072 * 76101137;
                                                                                                if (var380 < Statics.field1843 - 10 || var380 > Statics.field2047 + Statics.field1843 + 10 || var381 < Statics.field758 - 10 || var381 > Statics.field758 + Statics.field211 + 10) {
                                                                                                    field408 = false;
                                                                                                    method150(Statics.field1843, Statics.field758, Statics.field2047, Statics.field211);
                                                                                                }
                                                                                            }
                                                                                            if (var379 == 1 || !Statics.field213 && var379 == 4) {
                                                                                                int var382 = Statics.field1843;
                                                                                                int var383 = Statics.field758;
                                                                                                int var384 = Statics.field2047;
                                                                                                int var385 = class132.field2077;
                                                                                                int var386 = class132.field2079;
                                                                                                int var387 = -1;
                                                                                                for (int var388 = 0; var388 < field320; var388++) {
                                                                                                    int var389 = (field320 - 1 - var388) * 15 + var383 + 31;
                                                                                                    if (var385 > var382 && var385 < var382 + var384 && var386 > var389 - 13 && var386 < var389 + 3) {
                                                                                                        var387 = var388;
                                                                                                    }
                                                                                                }
                                                                                                if (var387 != -1 && var387 >= 0) {
                                                                                                    int var390 = field347[var387];
                                                                                                    int var391 = field411[var387];
                                                                                                    int var392 = field545[var387];
                                                                                                    int var393 = field433[var387];
                                                                                                    String var394 = field414[var387];
                                                                                                    String var395 = field366[var387];
                                                                                                    method1982(var390, var391, var392, var393, var394, var395, class132.field2077, class132.field2079);
                                                                                                }
                                                                                                field408 = false;
                                                                                                method150(Statics.field1843, Statics.field758, Statics.field2047, Statics.field211);
                                                                                            }
                                                                                        } else {
                                                                                            label3044: {
                                                                                                if ((var379 == 1 || !Statics.field213 && var379 == 4) && field320 > 0) {
                                                                                                    int var396 = field545[field320 - 1];
                                                                                                    if (var396 == 39 || var396 == 40 || var396 == 41 || var396 == 42 || var396 == 43 || var396 == 33 || var396 == 34 || var396 == 35 || var396 == 36 || var396 == 37 || var396 == 38 || var396 == 1005) {
                                                                                                        label3024: {
                                                                                                            int var397 = field347[field320 - 1];
                                                                                                            int var398 = field411[field320 - 1];
                                                                                                            class164 var399 = class164.method2744(var398);
                                                                                                            int var400 = method588(var399);
                                                                                                            boolean var401 = (var400 >> 28 & 0x1) != 0;
                                                                                                            if (!var401) {
                                                                                                                class169 var451 = (class169) null;
                                                                                                                if (!Statics.method2511(method588(var399))) {
                                                                                                                    break label3024;
                                                                                                                }
                                                                                                            }
                                                                                                            if (Statics.field1672 != null && !field432 && field407 != 1 && !method126(field320 - 1) && field320 > 0) {
                                                                                                                int var402 = field379;
                                                                                                                int var403 = field380;
                                                                                                                method1991(Statics.field1516, var402, var403);
                                                                                                                Statics.field1516 = null;
                                                                                                            }
                                                                                                            field432 = false;
                                                                                                            field383 = 0;
                                                                                                            if (Statics.field1672 != null) {
                                                                                                                method147(Statics.field1672);
                                                                                                            }
                                                                                                            Statics.field1672 = class164.method2744(var398);
                                                                                                            field378 = var397;
                                                                                                            field379 = class132.field2077;
                                                                                                            field380 = class132.field2079;
                                                                                                            if (field320 > 0) {
                                                                                                                method2797(field320 - 1);
                                                                                                            }
                                                                                                            method147(Statics.field1672);
                                                                                                            break label3044;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if ((var379 == 1 || !Statics.field213 && var379 == 4) && (field407 == 1 && field320 > 2 || method126(field320 - 1))) {
                                                                                                    var379 = 2;
                                                                                                }
                                                                                                if ((var379 == 1 || !Statics.field213 && var379 == 4) && field320 > 0) {
                                                                                                    method142(field320 - 1);
                                                                                                }
                                                                                                if (var379 == 2 && field320 > 0) {
                                                                                                    method1630(class132.field2077, class132.field2079);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (field361 != null) {
                                                                                        method147(field361);
                                                                                        Statics.field254++;
                                                                                        if (field448 && field445) {
                                                                                            int var404 = class132.field2071;
                                                                                            int var405 = class132.field2072 * 76101137;
                                                                                            int var406 = var404 - field442;
                                                                                            int var407 = var405 - field443;
                                                                                            if (var406 < field446) {
                                                                                                var406 = field446;
                                                                                            }
                                                                                            if (field361.field2683 + var406 > field446 + field511.field2683) {
                                                                                                var406 = field446 + field511.field2683 - field361.field2683;
                                                                                            }
                                                                                            if (var407 < field335) {
                                                                                                var407 = field335;
                                                                                            }
                                                                                            if (field361.field2684 + var407 > field335 + field511.field2684) {
                                                                                                var407 = field335 + field511.field2684 - field361.field2684;
                                                                                            }
                                                                                            int var408 = var406 - field449;
                                                                                            int var409 = var407 - field450;
                                                                                            int var410 = field361.field2742;
                                                                                            if (Statics.field254 > field361.field2705 && (var408 > var410 || var408 < -var410 || var409 > var410 || var409 < -var410)) {
                                                                                                field451 = true;
                                                                                            }
                                                                                            int var411 = field511.field2785 + (var406 - field446);
                                                                                            int var412 = field511.field2690 + (var407 - field335);
                                                                                            if (field361.field2755 != null && field451) {
                                                                                                class1 var413 = new class1();
                                                                                                var413.field3 = field361;
                                                                                                var413.field4 = var411;
                                                                                                var413.field5 = var412;
                                                                                                var413.field11 = field361.field2755;
                                                                                                class34.method607(var413);
                                                                                            }
                                                                                            if (class132.field2070 == 0) {
                                                                                                if (field451) {
                                                                                                    if (field361.field2707 != null) {
                                                                                                        class1 var414 = new class1();
                                                                                                        var414.field3 = field361;
                                                                                                        var414.field4 = var411;
                                                                                                        var414.field5 = var412;
                                                                                                        var414.field7 = field444;
                                                                                                        var414.field11 = field361.field2707;
                                                                                                        class34.method607(var414);
                                                                                                    }
                                                                                                    if (field444 != null && method2434(field361) != null) {
                                                                                                        field284.method2429(61);
                                                                                                        field284.method2201(field361.field2792);
                                                                                                        field284.method2191(field444.field2669);
                                                                                                        field284.method2228(field361.field2786);
                                                                                                        field284.method2319(field361.field2669);
                                                                                                        field284.method2319(field444.field2786);
                                                                                                        field284.method2148(field444.field2792);
                                                                                                    }
                                                                                                } else if ((field407 == 1 || method126(field320 - 1)) && field320 > 2) {
                                                                                                    method1630(field449 + field442, field450 + field443);
                                                                                                } else if (field320 > 0) {
                                                                                                    int var415 = field449 + field442;
                                                                                                    int var416 = field450 + field443;
                                                                                                    method1991(Statics.field1516, var415, var416);
                                                                                                    Statics.field1516 = null;
                                                                                                }
                                                                                                field361 = null;
                                                                                            }
                                                                                        } else if (Statics.field254 > 1) {
                                                                                            field361 = null;
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field1672 != null) {
                                                                                        method147(Statics.field1672);
                                                                                        field383++;
                                                                                        if (class132.field2070 == 0) {
                                                                                            if (field432) {
                                                                                                if (Statics.field1672 == Statics.field129 && field517 != field378) {
                                                                                                    class164 var417 = Statics.field1672;
                                                                                                    byte var418 = 0;
                                                                                                    if (field393 == 1 && var417.field2672 == 206) {
                                                                                                        var418 = 1;
                                                                                                    }
                                                                                                    if (var417.field2784[field517] <= 0) {
                                                                                                        var418 = 0;
                                                                                                    }
                                                                                                    if (Statics.method2511(method588(var417))) {
                                                                                                        int var419 = field378;
                                                                                                        int var420 = field517;
                                                                                                        var417.field2784[var420] = var417.field2784[var419];
                                                                                                        var417.field2693[var420] = var417.field2693[var419];
                                                                                                        var417.field2784[var419] = -1;
                                                                                                        var417.field2693[var419] = 0;
                                                                                                    } else if (var418 == 1) {
                                                                                                        int var421 = field378;
                                                                                                        int var422 = field517;
                                                                                                        while (var421 != var422) {
                                                                                                            if (var421 > var422) {
                                                                                                                var417.method3012(var421 - 1, var421);
                                                                                                                var421--;
                                                                                                            } else if (var421 < var422) {
                                                                                                                var417.method3012(var421 + 1, var421);
                                                                                                                var421++;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        var417.method3012(field517, field378);
                                                                                                    }
                                                                                                    field284.method2429(112);
                                                                                                    field284.method2320(field378);
                                                                                                    field284.method2201(Statics.field1672.field2792);
                                                                                                    field284.method2191(field517);
                                                                                                    field284.method2281(var418);
                                                                                                }
                                                                                            } else if ((field407 == 1 || method126(field320 - 1)) && field320 > 2) {
                                                                                                method1630(field379, field380);
                                                                                            } else if (field320 > 0) {
                                                                                                int var423 = field379;
                                                                                                int var424 = field380;
                                                                                                method1991(Statics.field1516, var423, var424);
                                                                                                Statics.field1516 = null;
                                                                                            }
                                                                                            field301 = 10;
                                                                                            class132.field2068 = 0;
                                                                                            Statics.field1672 = null;
                                                                                        } else if (field383 >= 5 && (class132.field2071 > field379 + 5 || class132.field2071 < field379 - 5 || class132.field2072 * 76101137 > field380 + 5 || class132.field2072 * 76101137 < field380 - 5)) {
                                                                                            field432 = true;
                                                                                        }
                                                                                    }
                                                                                    if (class81.field1419 != -1) {
                                                                                        int var425 = class81.field1419;
                                                                                        int var426 = class81.field1420;
                                                                                        field284.method2429(120);
                                                                                        field284.method2145(5);
                                                                                        field284.method2319(Statics.field613 + var426);
                                                                                        field284.method2319(Statics.field2052 + var425);
                                                                                        field284.method2184(class129.field2027[82] ? (class129.field2027[81] ? 2 : 1) : 0);
                                                                                        class81.field1419 = -1;
                                                                                        field372 = class132.field2077;
                                                                                        field373 = class132.field2079;
                                                                                        field375 = 1;
                                                                                        field374 = 0;
                                                                                        field504 = var425;
                                                                                        field282 = var426;
                                                                                    }
                                                                                    if (Statics.field1980 != var359) {
                                                                                        if (var359 != null) {
                                                                                            method147(var359);
                                                                                        }
                                                                                        if (Statics.field1980 != null) {
                                                                                            method147(Statics.field1980);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field2923 != var360 && field419 == field418) {
                                                                                        if (var360 != null) {
                                                                                            method147(var360);
                                                                                        }
                                                                                        if (Statics.field2923 != null) {
                                                                                            method147(Statics.field2923);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field2923 == null) {
                                                                                        if (field418 > 0) {
                                                                                            field418--;
                                                                                        }
                                                                                    } else if (field418 < field419) {
                                                                                        field418++;
                                                                                        if (field419 == field418) {
                                                                                            method147(Statics.field2923);
                                                                                        }
                                                                                    }
                                                                                    method2464();
                                                                                    if (field518) {
                                                                                        method1804();
                                                                                    }
                                                                                    for (int var427 = 0; var427 < 5; var427++) {
                                                                                        int var10002 = field308[var427]++;
                                                                                    }
                                                                                    int var428 = ++class132.field2066 - 1;
                                                                                    int var430 = class129.method1799();
                                                                                    if (var428 > 15000 && var430 > 15000) {
                                                                                        field428 = 250;
                                                                                        class132.method2598(14500);
                                                                                        field284.method2429(13);
                                                                                    }
                                                                                    field394++;
                                                                                    if (field394 > 500) {
                                                                                        field394 = 0;
                                                                                        int var431 = (int) (Math.random() * 8.0D);
                                                                                        if ((var431 & 0x1) == 1) {
                                                                                            field326 += field426;
                                                                                        }
                                                                                        if ((var431 & 0x2) == 2) {
                                                                                            field328 += field329;
                                                                                        }
                                                                                        if ((var431 & 0x4) == 4) {
                                                                                            field330 += field331;
                                                                                        }
                                                                                    }
                                                                                    if (field326 < -50) {
                                                                                        field426 = 2;
                                                                                    }
                                                                                    if (field326 > 50) {
                                                                                        field426 = -2;
                                                                                    }
                                                                                    if (field328 < -55) {
                                                                                        field329 = 2;
                                                                                    }
                                                                                    if (field328 > 55) {
                                                                                        field329 = -2;
                                                                                    }
                                                                                    if (field330 < -40) {
                                                                                        field331 = 1;
                                                                                    }
                                                                                    if (field330 > 40) {
                                                                                        field331 = -1;
                                                                                    }
                                                                                    field337++;
                                                                                    if (field337 > 500) {
                                                                                        field337 = 0;
                                                                                        int var432 = (int) (Math.random() * 8.0D);
                                                                                        if ((var432 & 0x1) == 1) {
                                                                                            field333 += field334;
                                                                                        }
                                                                                        if ((var432 & 0x2) == 2) {
                                                                                            field503 += field410;
                                                                                        }
                                                                                    }
                                                                                    if (field333 < -60) {
                                                                                        field334 = 2;
                                                                                    }
                                                                                    if (field333 > 60) {
                                                                                        field334 = -2;
                                                                                    }
                                                                                    if (field503 < -20) {
                                                                                        field410 = 1;
                                                                                    }
                                                                                    if (field503 > 10) {
                                                                                        field410 = -1;
                                                                                    }
                                                                                    for (class36 var433 = (class36) field540.method3350(); var433 != null; var433 = (class36) field540.method3352()) {
                                                                                        if ((long) var433.field824 < class107.method78() / 1000L - 5L) {
                                                                                            if (var433.field823 > 0) {
                                                                                                class11.method590(5, "", var433.field828 + class148.field2370);
                                                                                            }
                                                                                            if (var433.field823 == 0) {
                                                                                                class11.method590(5, "", var433.field828 + class148.field2371);
                                                                                            }
                                                                                            var433.method3479();
                                                                                        }
                                                                                    }
                                                                                    field310++;
                                                                                    if (field310 > 50) {
                                                                                        field284.method2429(2);
                                                                                    }
                                                                                    try {
                                                                                        if (Statics.field113 != null && field284.field1902 > 0) {
                                                                                            Statics.field113.method2649(field284.field1897, 0, field284.field1902);
                                                                                            field284.field1902 = 0;
                                                                                            field310 = 0;
                                                                                            return;
                                                                                        }
                                                                                    } catch (IOException var435) {
                                                                                        method531();
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                var369 = var368.field3;
                                                                                if (var369.field2669 < 0) {
                                                                                    break;
                                                                                }
                                                                                var370 = class164.method2744(var369.field2687);
                                                                            } while (var370 == null || var370.field2790 == null || var369.field2669 >= var370.field2790.length || var370.field2790[var369.field2669] != var369);
                                                                            class34.method607(var368);
                                                                        }
                                                                    }
                                                                    var366 = var365.field3;
                                                                    if (var366.field2669 < 0) {
                                                                        break;
                                                                    }
                                                                    var367 = class164.method2744(var366.field2687);
                                                                } while (var367 == null || var367.field2790 == null || var366.field2669 >= var367.field2790.length || var367.field2790[var366.field2669] != var366);
                                                                class34.method607(var365);
                                                            }
                                                        }
                                                        var363 = var362.field3;
                                                        if (var363.field2669 < 0) {
                                                            break;
                                                        }
                                                        var364 = class164.method2744(var363.field2687);
                                                    } while (var364 == null || var364.field2790 == null || var363.field2669 >= var364.field2790.length || var364.field2790[var363.field2669] != var363);
                                                    class34.method607(var362);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                field284.method2429(97);
                                field284.method2145(0);
                                int var333 = field284.field1902;
                                class202.method810(field284);
                                field284.method2157(field284.field1902 - var333);
                            }
                        }
                    }
                } else if (field269 == 40 || field269 == 45) {
                    method484();
                }
                return;
            }
            var2.field2615.method2949(var2.field2614, (int) var2.field3024, var2.field2620, false);
        }
    }

    @ObfuscatedName("client.z(I)V")
    public final void method260() {
        boolean var1;
        label262: {
            try {
                if (class174.field2874 == 2) {
                    if (Statics.field2090 == null) {
                        Statics.field2090 = class171.method3122(Statics.field2875, Statics.field214, Statics.field2826);
                        if (Statics.field2090 == null) {
                            var1 = false;
                            break label262;
                        }
                    }
                    if (Statics.field605 == null) {
                        Statics.field605 = new class55(Statics.field2878, Statics.field2872);
                    }
                    if (Statics.field730.method3210(Statics.field2090, Statics.field2877, Statics.field605, 22050)) {
                        Statics.field730.method3211();
                        Statics.field730.method3208(Statics.field2152);
                        Statics.field730.method3213(Statics.field2090, Statics.field579);
                        class174.field2874 = 0;
                        Statics.field2090 = null;
                        Statics.field605 = null;
                        Statics.field2875 = null;
                        var1 = true;
                        break label262;
                    }
                }
            } catch (Exception var34) {
                var34.printStackTrace();
                Statics.field730.method3214();
                class174.field2874 = 0;
                Statics.field2090 = null;
                Statics.field605 = null;
                Statics.field2875 = null;
            }
            var1 = false;
        }
        if (var1 && field509 && Statics.field30 != null) {
            Statics.field30.method1071();
        }
        if (field269 == 10 || field269 == 20 || field269 == 30) {
            if (field371 != 0L && class107.method78() > field371) {
                int var4 = method596();
                field371 = 0L;
                if (var4 >= 2) {
                    field483 = true;
                } else {
                    field483 = false;
                }
                method2465();
                if (field269 >= 25) {
                    method1805();
                }
                field2126 = true;
            } else if (field2129) {
                class129.method2456(Statics.field1094);
                Canvas var5 = Statics.field1094;
                var5.removeMouseListener(class132.field2067);
                var5.removeMouseMotionListener(class132.field2067);
                var5.removeFocusListener(class132.field2067);
                class132.field2073 = 0;
                if (Statics.field2149 != null) {
                    Statics.field2149.method2492(Statics.field1094);
                }
                Statics.field259.method2666();
                Statics.field1094.setBackground(Color.black);
                class129.method129(Statics.field1094);
                Canvas var6 = Statics.field1094;
                var6.addMouseListener(class132.field2067);
                var6.addMouseMotionListener(class132.field2067);
                var6.addFocusListener(class132.field2067);
                if (Statics.field2149 != null) {
                    Statics.field2149.method2491(Statics.field1094);
                }
                if (field258 != -1) {
                    method74(false);
                }
                field2128 = true;
            }
        }
        Dimension var7 = this.method2729();
        if (Statics.field131 != var7.width || Statics.field1851 != var7.height || field2128) {
            method2465();
            field371 = class107.method78() + 500L;
            field2128 = false;
        }
        boolean var8 = false;
        if (field2126) {
            field2126 = false;
            var8 = true;
            for (int var9 = 0; var9 < 100; var9++) {
                field474[var9] = true;
            }
        }
        if (var8) {
            method811();
        }
        if (field269 == 0) {
            int var10 = class30.field699;
            String var11 = class30.field700;
            Color var12 = null;
            try {
                Graphics var13 = Statics.field1094.getGraphics();
                if (Statics.field1954 == null) {
                    Statics.field1954 = new Font("Helvetica", 1, 13);
                    Statics.field2094 = Statics.field1094.getFontMetrics(Statics.field1954);
                }
                if (var8) {
                    var13.setColor(Color.black);
                    var13.fillRect(0, 0, Statics.field178, Statics.field2125);
                }
                if (var12 == null) {
                    var12 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1863 == null) {
                        Statics.field1863 = Statics.field1094.createImage(304, 34);
                    }
                    Graphics var14 = Statics.field1863.getGraphics();
                    var14.setColor(var12);
                    var14.drawRect(0, 0, 303, 33);
                    var14.fillRect(2, 2, var10 * 3, 30);
                    var14.setColor(Color.black);
                    var14.drawRect(1, 1, 301, 31);
                    var14.fillRect(var10 * 3 + 2, 2, 300 - var10 * 3, 30);
                    var14.setFont(Statics.field1954);
                    var14.setColor(Color.white);
                    var14.drawString(var11, (304 - Statics.field2094.stringWidth(var11)) / 2, 22);
                    var13.drawImage(Statics.field1863, Statics.field178 / 2 - 152, Statics.field2125 / 2 - 18, (ImageObserver) null);
                } catch (Exception var30) {
                    int var16 = Statics.field178 / 2 - 152;
                    int var17 = Statics.field2125 / 2 - 18;
                    var13.setColor(var12);
                    var13.drawRect(var16, var17, 303, 33);
                    var13.fillRect(var16 + 2, var17 + 2, var10 * 3, 30);
                    var13.setColor(Color.black);
                    var13.drawRect(var16 + 1, var17 + 1, 301, 31);
                    var13.fillRect(var10 * 3 + var16 + 2, var17 + 2, 300 - var10 * 3, 30);
                    var13.setFont(Statics.field1954);
                    var13.setColor(Color.white);
                    var13.drawString(var11, var16 + (304 - Statics.field2094.stringWidth(var11)) / 2, var17 + 22);
                }
            } catch (Exception var31) {
                Statics.field1094.repaint();
            }
        } else if (field269 == 5) {
            class30.method1445(Statics.field1802, Statics.field1960, Statics.field2059, var8);
        } else if (field269 == 10 || field269 == 11) {
            class30.method1445(Statics.field1802, Statics.field1960, Statics.field2059, var8);
        } else if (field269 == 20) {
            class30.method1445(Statics.field1802, Statics.field1960, Statics.field2059, var8);
        } else if (field269 == 25) {
            if (field321 == 1) {
                if (field317 > field364) {
                    field364 = field317;
                }
                int var19 = (field364 * 50 - field317 * 50) / field364;
                Statics.method2869(class148.field2432 + class2.field24 + class2.field33 + var19 + "%" + class2.field22, false);
            } else if (field321 == 2) {
                if (field319 > field268) {
                    field268 = field319;
                }
                int var20 = (field268 * 50 - field319 * 50) / field268 + 50;
                Statics.method2869(class148.field2432 + class2.field24 + class2.field33 + var20 + "%" + class2.field22, false);
            } else {
                Statics.method2869(class148.field2432, false);
            }
        } else if (field269 == 30) {
            if (field258 != -1) {
                int var21 = field258;
                if (class164.method511(var21)) {
                    method766(Statics.field2685[var21], -1);
                }
            }
            for (int var22 = 0; var22 < field472; var22++) {
                if (field474[var22]) {
                    field475[var22] = true;
                }
                field476[var22] = field474[var22];
                field474[var22] = false;
            }
            field473 = field423;
            field489 = -1;
            field417 = -1;
            Statics.field129 = null;
            if (field258 != -1) {
                field472 = 0;
                method2457(field258, 0, 0, Statics.field178, Statics.field2125, 0, 0, -1);
            }
            class75.method1580();
            if (field408) {
                method153();
            } else if (field489 != -1) {
                Statics.method140(field489, field417);
            }
            if (field481 == 3) {
                for (int var23 = 0; var23 < field472; var23++) {
                    if (field476[var23]) {
                        class75.method1554(field477[var23], field519[var23], field479[var23], field480[var23], 16711935, 128);
                    } else if (field475[var23]) {
                        class75.method1554(field477[var23], field519[var23], field479[var23], field480[var23], 16711680, 128);
                    }
                }
            }
            class22.method3529(Statics.field991, Statics.field2098.field802, Statics.field2098.field762, field537);
            field537 = 0;
        } else if (field269 == 40) {
            Statics.method2869(class148.field2233 + class2.field24 + class148.field2402, false);
        } else if (field269 == 45) {
            Statics.method2869(class148.field2381, false);
        }
        if (field269 == 30 && field481 == 0 && !var8) {
            try {
                Graphics var24 = Statics.field1094.getGraphics();
                for (int var25 = 0; var25 < field472; var25++) {
                    if (field475[var25]) {
                        Statics.field1376.method1392(var24, field477[var25], field519[var25], field479[var25], field480[var25]);
                        field475[var25] = false;
                    }
                }
            } catch (Exception var33) {
                Statics.field1094.repaint();
            }
        } else if (field269 > 0) {
            try {
                Graphics var27 = Statics.field1094.getGraphics();
                Statics.field1376.method1393(var27, 0, 0);
                for (int var28 = 0; var28 < field472; var28++) {
                    field475[var28] = false;
                }
            } catch (Exception var32) {
                Statics.field1094.repaint();
            }
        }
    }

    @ObfuscatedName("client.v(I)V")
    public final void method175() {
        if (Statics.field1938 != null) {
            Statics.field1938.field193 = false;
        }
        Statics.field1938 = null;
        if (Statics.field113 != null) {
            Statics.field113.method2640();
            Statics.field113 = null;
        }
        class129.method145();
        class132.method104();
        Statics.field2149 = null;
        if (Statics.field30 != null) {
            Statics.field30.method1056();
        }
        if (Statics.field1866 != null) {
            Statics.field1866.method1056();
        }
        class162.method2493();
        Statics.method2231();
        class141.method81();
    }

    @ObfuscatedName("h.b(IB)V")
    public static void method165(int arg0) {
        if (field269 == arg0) {
            return;
        }
        if (field269 == 0) {
            Statics.field1863 = null;
            Statics.field1954 = null;
            Statics.field2094 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field294 = 0;
            field295 = 0;
            field296 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field26 != null) {
            Statics.field26.method2640();
            Statics.field26 = null;
        }
        if (field269 == 25) {
            field321 = 0;
            field317 = 0;
            field364 = 1;
            field319 = 0;
            field268 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class30.method605(Statics.field1094, Statics.field166, Statics.field14, true, 0);
        } else if (arg0 == 20) {
            class30.method605(Statics.field1094, Statics.field166, Statics.field14, true, field269 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class30.method605(Statics.field1094, Statics.field166, Statics.field14, false, 4);
        } else if (Statics.field712) {
            Statics.field687 = null;
            Statics.field688 = null;
            Statics.field1382 = null;
            Statics.field2811 = null;
            Statics.field1005 = null;
            Statics.field689 = null;
            Statics.field2627 = null;
            Statics.field2184 = null;
            Statics.field1091 = null;
            Statics.field2150 = null;
            Statics.field2577 = null;
            Statics.field2157 = null;
            Statics.field1026 = null;
            Statics.field934 = null;
            Statics.field682 = null;
            Statics.field1314 = null;
            Statics.field576 = null;
            Statics.field1306 = null;
            Statics.field3027 = null;
            Statics.field173 = null;
            Statics.field719 = null;
            Statics.field1097 = null;
            class174.method115(2);
            class162.method3528(true);
            Statics.field712 = false;
        }
        field269 = arg0;
    }

    @ObfuscatedName("client.f(I)V")
    public void method176() {
        if (field269 == 1000) {
            return;
        }
        long var1 = class107.method78();
        int var3 = (int) (var1 - Statics.field2648);
        Statics.field2648 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class162.field2631 += var3;
        boolean var4;
        if (class162.field2632 == 0 && class162.field2642 == 0 && class162.field2639 == 0 && class162.field2641 == 0) {
            var4 = true;
        } else if (Statics.field2636 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class162.field2631 > 30000) {
                        throw new IOException();
                    }
                    while (class162.field2642 < 20 && class162.field2641 > 0) {
                        class163 var5 = (class163) class162.field2633.method3360();
                        class111 var6 = new class111(4);
                        var6.method2145(1);
                        var6.method2147((int) var5.field3024);
                        Statics.field2636.method2649(var6.field1897, 0, 4);
                        class162.field2635.method3358(var5, var5.field3024);
                        class162.field2641--;
                        class162.field2642++;
                    }
                    while (class162.field2632 < 20 && class162.field2639 > 0) {
                        class163 var7 = (class163) class162.field2637.method3450();
                        class111 var8 = new class111(4);
                        var8.method2145(0);
                        var8.method2147((int) var7.field3024);
                        Statics.field2636.method2649(var8.field1897, 0, 4);
                        var7.method3461();
                        class162.field2640.method3358(var7, var7.field3024);
                        class162.field2639--;
                        class162.field2632++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2636.method2642();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class162.field2631 = 0;
                        byte var11 = 0;
                        if (Statics.field1532 == null) {
                            var11 = 8;
                        } else if (class162.field2643 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class162.field2634.field1902;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2636.method2643(class162.field2634.field1897, class162.field2634.field1902, var12);
                            if (class162.field2646 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class162.field2634.field1897[class162.field2634.field1902 + var13] ^= class162.field2646;
                                }
                            }
                            class162.field2634.field1902 += var12;
                            if (class162.field2634.field1902 < var11) {
                                break;
                            }
                            if (Statics.field1532 == null) {
                                class162.field2634.field1902 = 0;
                                int var14 = class162.field2634.method2205();
                                int var15 = class162.field2634.method2339();
                                int var16 = class162.field2634.method2205();
                                int var17 = class162.field2634.method2165();
                                long var18 = (long) ((var14 << 16) + var15);
                                class163 var20 = (class163) class162.field2635.method3357(var18);
                                Statics.field1896 = true;
                                if (var20 == null) {
                                    var20 = (class163) class162.field2640.method3357(var18);
                                    Statics.field1896 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1532 = var20;
                                Statics.field651 = new class111(var17 + var21 + Statics.field1532.field2654);
                                Statics.field651.method2145(var16);
                                Statics.field651.method2148(var17);
                                class162.field2643 = 8;
                                class162.field2634.field1902 = 0;
                            } else if (class162.field2643 == 0) {
                                if (class162.field2634.field1897[0] == -1) {
                                    class162.field2643 = 1;
                                    class162.field2634.field1902 = 0;
                                } else {
                                    Statics.field1532 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field651.field1897.length - Statics.field1532.field2654;
                            int var23 = 512 - class162.field2643;
                            if (var23 > var22 - Statics.field651.field1902) {
                                var23 = var22 - Statics.field651.field1902;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2636.method2643(Statics.field651.field1897, Statics.field651.field1902, var23);
                            if (class162.field2646 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field651.field1897[Statics.field651.field1902 + var24] ^= class162.field2646;
                                }
                            }
                            Statics.field651.field1902 += var23;
                            class162.field2643 += var23;
                            if (Statics.field651.field1902 == var22) {
                                if (Statics.field1532.field3024 == 16711935L) {
                                    Statics.field1969 = Statics.field651;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class159 var26 = class162.field2647[var25];
                                        if (var26 != null) {
                                            Statics.field1969.field1902 = var25 * 8 + 5;
                                            int var27 = Statics.field1969.method2165();
                                            int var28 = Statics.field1969.method2165();
                                            var26.method2965(var27, var28);
                                        }
                                    }
                                } else {
                                    class162.field2644.reset();
                                    class162.field2644.update(Statics.field651.field1897, 0, var22);
                                    int var29 = (int) class162.field2644.getValue();
                                    if (Statics.field1532.field2652 != var29) {
                                        try {
                                            Statics.field2636.method2640();
                                        } catch (Exception var35) {
                                        }
                                        class162.field2638++;
                                        Statics.field2636 = null;
                                        class162.field2646 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class162.field2638 = 0;
                                    class162.field2650 = 0;
                                    Statics.field1532.field2653.method2950((int) (Statics.field1532.field3024 & 0xFFFFL), Statics.field651.field1897, (Statics.field1532.field3024 & 0xFF0000L) == 16711680L, Statics.field1896);
                                }
                                Statics.field1532.method3482();
                                if (Statics.field1896) {
                                    class162.field2642--;
                                } else {
                                    class162.field2632--;
                                }
                                class162.field2643 = 0;
                                Statics.field1532 = null;
                                Statics.field651 = null;
                            } else {
                                if (class162.field2643 != 512) {
                                    break;
                                }
                                class162.field2643 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2636.method2640();
                } catch (Exception var34) {
                }
                class162.field2650++;
                Statics.field2636 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method177();
        }
    }

    @ObfuscatedName("client.i(B)V")
    public void method177() {
        if (class162.field2638 >= 4) {
            this.method2678("js5crc");
            field269 = 1000;
            return;
        }
        if (class162.field2650 >= 4) {
            if (field269 <= 5) {
                this.method2678("js5io");
                field269 = 1000;
                return;
            }
            field291 = 3000;
            class162.field2650 = 3;
        }
        if (--field291 + 1 > 0) {
            return;
        }
        try {
            if (field338 == 0) {
                Statics.field170 = Statics.field1483.method2545(Statics.field2165, Statics.field298);
                field338++;
            }
            if (field338 == 1) {
                if (Statics.field170.field2138 == 2) {
                    this.method178(-1);
                    return;
                }
                if (Statics.field170.field2138 == 1) {
                    field338++;
                }
            }
            if (field338 == 2) {
                Statics.field119 = new class135((Socket) Statics.field170.field2134, Statics.field1483);
                class111 var1 = new class111(5);
                var1.method2145(15);
                var1.method2148(85);
                Statics.field119.method2649(var1.field1897, 0, 5);
                field338++;
                Statics.field2075 = class107.method78();
            }
            if (field338 == 3) {
                if (field269 <= 5 || Statics.field119.method2642() > 0) {
                    int var2 = Statics.field119.method2655();
                    if (var2 != 0) {
                        this.method178(var2);
                        return;
                    }
                    field338++;
                } else if (class107.method78() - Statics.field2075 > 30000L) {
                    this.method178(-2);
                    return;
                }
            }
            if (field338 == 4) {
                class162.method2469(Statics.field119, field269 > 20);
                Statics.field170 = null;
                Statics.field119 = null;
                field338 = 0;
                field299 = 0;
            }
        } catch (IOException var4) {
            this.method178(-3);
        }
    }

    @ObfuscatedName("client.w(II)V")
    public void method178(int arg0) {
        Statics.field170 = null;
        Statics.field119 = null;
        field338 = 0;
        if (Statics.field298 == Statics.field1713) {
            Statics.field298 = Statics.field1920;
        } else {
            Statics.field298 = Statics.field1713;
        }
        field299++;
        if (field299 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field269 <= 5) {
                this.method2678("js5connect_full");
                field269 = 1000;
            } else {
                field291 = 3000;
            }
        } else if (field299 >= 2 && arg0 == 6) {
            this.method2678("js5connect_outofdate");
            field269 = 1000;
        } else if (field299 >= 4) {
            if (field269 <= 5) {
                this.method2678("js5connect");
                field269 = 1000;
            } else {
                field291 = 3000;
            }
        }
    }

    @ObfuscatedName("n.l(B)V")
    public static void method28() {
        if (field289 == 0) {
            Statics.field1939 = new class81(4, 104, 104, class6.field89);
            for (int var0 = 0; var0 < 4; var0++) {
                field322[var0] = new class220(104, 104);
            }
            Statics.field1120 = new class74(512, 512);
            class30.field700 = class148.field2235;
            class30.field699 = 5;
            field289 = 20;
        } else if (field289 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class86.field1510[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class81.method1672(var1, 500, 800, 512, 334);
            class30.field700 = class148.field2306;
            class30.field699 = 10;
            field289 = 30;
        } else if (field289 == 30) {
            Statics.field1036 = method669(0, false, true, true);
            Statics.field2843 = method669(1, false, true, true);
            Statics.field1599 = method669(2, true, false, true);
            Statics.field1982 = method669(3, false, true, true);
            Statics.field1548 = method669(4, false, true, true);
            Statics.field16 = method669(5, true, true, true);
            Statics.field830 = method669(6, true, true, false);
            Statics.field198 = method669(7, false, true, true);
            Statics.field14 = method669(8, false, true, true);
            Statics.field461 = method669(9, false, true, true);
            Statics.field166 = method669(10, false, true, true);
            Statics.field2555 = method669(11, false, true, true);
            Statics.field1847 = method669(12, false, true, true);
            Statics.field657 = method669(13, true, false, true);
            Statics.field1919 = method669(14, false, true, false);
            Statics.field551 = method669(15, false, true, true);
            class30.field700 = class148.field2302;
            class30.field699 = 20;
            field289 = 40;
        } else if (field289 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1036.method2947() * 4 / 100;
            int var8 = var7 + Statics.field2843.method2947() * 4 / 100;
            int var9 = var8 + Statics.field1599.method2947() * 2 / 100;
            int var10 = var9 + Statics.field1982.method2947() * 2 / 100;
            int var11 = var10 + Statics.field1548.method2947() * 6 / 100;
            int var12 = var11 + Statics.field16.method2947() * 4 / 100;
            int var13 = var12 + Statics.field830.method2947() * 2 / 100;
            int var14 = var13 + Statics.field198.method2947() * 60 / 100;
            int var15 = var14 + Statics.field14.method2947() * 2 / 100;
            int var16 = var15 + Statics.field461.method2947() * 2 / 100;
            int var17 = var16 + Statics.field166.method2947() * 2 / 100;
            int var18 = var17 + Statics.field2555.method2947() * 2 / 100;
            int var19 = var18 + Statics.field1847.method2947() * 2 / 100;
            int var20 = var19 + Statics.field657.method2947() * 2 / 100;
            int var21 = var20 + Statics.field1919.method2947() * 2 / 100;
            int var22 = var21 + Statics.field551.method2947() * 2 / 100;
            if (var22 == 100) {
                class30.field700 = class148.field2239;
                class30.field699 = 30;
                field289 = 45;
            } else {
                if (var22 != 0) {
                    class30.field700 = class148.field2238 + var22 + "%";
                }
                class30.field699 = 30;
            }
        } else if (field289 == 45) {
            boolean var23 = !field267;
            Statics.field1126 = 22050;
            Statics.field1125 = var23;
            Statics.field3066 = 2;
            class175 var24 = new class175();
            var24.method3216(9, 128);
            Statics.field30 = class52.method105(Statics.field1483, Statics.field1094, 0, 22050);
            Statics.field30.method1048(var24);
            class159 var25 = Statics.field551;
            class159 var26 = Statics.field1919;
            class159 var27 = Statics.field1548;
            Statics.field2877 = var25;
            Statics.field2872 = var26;
            Statics.field2878 = var27;
            Statics.field730 = var24;
            Statics.field1866 = class52.method105(Statics.field1483, Statics.field1094, 1, 2048);
            Statics.field928 = new class51();
            Statics.field1866.method1048(Statics.field928);
            Statics.field204 = new class70(22050, Statics.field1126);
            class30.field700 = class148.field2387;
            class30.field699 = 35;
            field289 = 50;
        } else if (field289 == 50) {
            int var28 = 0;
            if (Statics.field1960 == null) {
                class159 var29 = Statics.field14;
                class159 var30 = Statics.field657;
                int var31 = var29.method2888("p11_full");
                int var32 = var29.method2889(var31, "");
                class215 var33;
                if (Statics.method655(var29, var31, var32)) {
                    byte[] var34 = var30.method2874(var31, var32);
                    class215 var35;
                    if (var34 == null) {
                        var35 = null;
                    } else {
                        class215 var36 = new class215(var34, Statics.field1313, Statics.field1311, Statics.field3053, Statics.field1323, Statics.field578, Statics.field3116);
                        class72.method2414();
                        var35 = var36;
                    }
                    var33 = var35;
                } else {
                    var33 = null;
                }
                Statics.field1960 = var33;
            } else {
                var28++;
            }
            if (Statics.field2059 == null) {
                class159 var38 = Statics.field14;
                class159 var39 = Statics.field657;
                int var40 = var38.method2888("p12_full");
                int var41 = var38.method2889(var40, "");
                class215 var42;
                if (Statics.method655(var38, var40, var41)) {
                    byte[] var43 = var39.method2874(var40, var41);
                    class215 var44;
                    if (var43 == null) {
                        var44 = null;
                    } else {
                        class215 var45 = new class215(var43, Statics.field1313, Statics.field1311, Statics.field3053, Statics.field1323, Statics.field578, Statics.field3116);
                        class72.method2414();
                        var44 = var45;
                    }
                    var42 = var44;
                } else {
                    var42 = null;
                }
                Statics.field2059 = var42;
            } else {
                var28++;
            }
            if (Statics.field1802 == null) {
                class159 var47 = Statics.field14;
                class159 var48 = Statics.field657;
                int var49 = var47.method2888("b12_full");
                int var50 = var47.method2889(var49, "");
                class215 var51;
                if (Statics.method655(var47, var49, var50)) {
                    byte[] var52 = var48.method2874(var49, var50);
                    class215 var53;
                    if (var52 == null) {
                        var53 = null;
                    } else {
                        class215 var54 = new class215(var52, Statics.field1313, Statics.field1311, Statics.field3053, Statics.field1323, Statics.field578, Statics.field3116);
                        class72.method2414();
                        var53 = var54;
                    }
                    var51 = var53;
                } else {
                    var51 = null;
                }
                Statics.field1802 = var51;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class30.field700 = class148.field2241 + var28 * 100 / 3 + "%";
                class30.field699 = 40;
            } else {
                Statics.field208 = new class151(true);
                class30.field700 = class148.field2289;
                class30.field699 = 40;
                field289 = 60;
            }
        } else if (field289 == 60) {
            int var56 = class30.method812(Statics.field166, Statics.field14);
            int var57 = class30.method482();
            if (var56 < var57) {
                class30.field700 = class148.field2243 + var56 * 100 / var57 + "%";
                class30.field699 = 50;
            } else {
                class30.field700 = class148.field2244;
                class30.field699 = 50;
                method165(5);
                field289 = 70;
            }
        } else if (field289 == 70) {
            if (Statics.field1599.method2931()) {
                class159 var58 = Statics.field1599;
                Statics.field993 = var58;
                class159 var59 = Statics.field1599;
                Statics.field925 = var59;
                class42.method1990(Statics.field1599, Statics.field198);
                class38.method796(Statics.field1599, Statics.field198, field267);
                class37.method151(Statics.field1599, Statics.field198);
                class159 var60 = Statics.field1599;
                class159 var61 = Statics.field198;
                boolean var62 = field265;
                class215 var63 = Statics.field1960;
                Statics.field1042 = var60;
                Statics.field1978 = var61;
                Statics.field1063 = var62;
                Statics.field716 = Statics.field1042.method2883(10);
                Statics.field1010 = var63;
                class159 var64 = Statics.field1599;
                class159 var65 = Statics.field1036;
                class159 var66 = Statics.field2843;
                Statics.field936 = var64;
                Statics.field2959 = var65;
                Statics.field952 = var66;
                class159 var67 = Statics.field1599;
                class159 var68 = Statics.field198;
                Statics.field970 = var67;
                Statics.field958 = var68;
                class44.method166(Statics.field1599);
                class48.method514(Statics.field1599);
                class164.method637(Statics.field1982, Statics.field198, Statics.field14, Statics.field657);
                class159 var69 = Statics.field1599;
                Statics.field1937 = var69;
                class159 var70 = Statics.field1599;
                Statics.field1019 = var70;
                class30.field700 = class148.field2246;
                class30.field699 = 60;
                field289 = 80;
            } else {
                class30.field700 = class148.field2378 + Statics.field1599.method2952() + "%";
                class30.field699 = 60;
            }
        } else if (field289 == 80) {
            int var71 = 0;
            if (Statics.field242 == null) {
                class159 var72 = Statics.field14;
                int var73 = var72.method2888("compass");
                int var74 = var72.method2889(var73, "");
                class74 var75;
                if (Statics.method655(var72, var73, var74)) {
                    var75 = class72.method1882();
                } else {
                    var75 = null;
                }
                Statics.field242 = var75;
            } else {
                var71++;
            }
            if (Statics.field1999 == null) {
                class159 var77 = Statics.field14;
                int var78 = var77.method2888("mapedge");
                int var79 = var77.method2889(var78, "");
                class74 var80;
                if (Statics.method655(var77, var78, var79)) {
                    var80 = class72.method1882();
                } else {
                    var80 = null;
                }
                Statics.field1999 = var80;
            } else {
                var71++;
            }
            if (Statics.field357 == null) {
                Statics.field357 = class72.method127(Statics.field14, "mapscene", "");
            } else {
                var71++;
            }
            if (Statics.field1962 == null) {
                Statics.field1962 = class72.method156(Statics.field14, "mapfunction", "");
            } else {
                var71++;
            }
            if (Statics.field1948 == null) {
                Statics.field1948 = class72.method156(Statics.field14, "hitmarks", "");
            } else {
                var71++;
            }
            if (Statics.field1865 == null) {
                Statics.field1865 = class72.method156(Statics.field14, "headicons_pk", "");
            } else {
                var71++;
            }
            if (Statics.field728 == null) {
                Statics.field728 = class72.method156(Statics.field14, "headicons_prayer", "");
            } else {
                var71++;
            }
            if (Statics.field340 == null) {
                Statics.field340 = class72.method156(Statics.field14, "headicons_hint", "");
            } else {
                var71++;
            }
            if (Statics.field342 == null) {
                Statics.field342 = class72.method156(Statics.field14, "mapmarker", "");
            } else {
                var71++;
            }
            if (Statics.field415 == null) {
                Statics.field415 = class72.method156(Statics.field14, "cross", "");
            } else {
                var71++;
            }
            if (Statics.field1310 == null) {
                Statics.field1310 = class72.method156(Statics.field14, "mapdots", "");
            } else {
                var71++;
            }
            if (Statics.field165 == null) {
                Statics.field165 = class72.method127(Statics.field14, "scrollbar", "");
            } else {
                var71++;
            }
            if (Statics.field1534 == null) {
                Statics.field1534 = class72.method127(Statics.field14, "mod_icons", "");
            } else {
                var71++;
            }
            if (var71 < 13) {
                class30.field700 = class148.field2247 + var71 * 100 / 13 + "%";
                class30.field699 = 70;
            } else {
                Statics.field3083 = Statics.field1534;
                Statics.field1999.method1511();
                int var82 = (int) (Math.random() * 21.0D) - 10;
                int var83 = (int) (Math.random() * 21.0D) - 10;
                int var84 = (int) (Math.random() * 21.0D) - 10;
                int var85 = (int) (Math.random() * 41.0D) - 20;
                for (int var86 = 0; var86 < Statics.field1962.length; var86++) {
                    Statics.field1962[var86].method1468(var82 + var85, var83 + var85, var84 + var85);
                }
                Statics.field357[0].method1609(var82 + var85, var83 + var85, var84 + var85);
                class30.field700 = class148.field2248;
                class30.field699 = 70;
                field289 = 90;
            }
        } else if (field289 == 90) {
            if (Statics.field461.method2931()) {
                class90 var87 = new class90(Statics.field461, Statics.field14, 20, 0.8D, field267 ? 64 : 128);
                class86.method1856(var87);
                class86.method1814(0.8D);
                class30.field700 = class148.field2250;
                class30.field699 = 90;
                field289 = 110;
            } else {
                class30.field700 = class148.field2414 + Statics.field461.method2952() + "%";
                class30.field699 = 90;
            }
        } else if (field289 == 110) {
            Statics.field1938 = new class13();
            Statics.field1483.method2541(Statics.field1938, 10);
            class30.field700 = class148.field2251;
            class30.field699 = 94;
            field289 = 120;
        } else if (field289 == 120) {
            if (Statics.field166.method2919("huffman", "")) {
                class105 var88 = new class105(Statics.field166.method2890("huffman", ""));
                class213.method598(var88);
                class30.field700 = class148.field2253;
                class30.field699 = 96;
                field289 = 130;
            } else {
                class30.field700 = class148.field2400 + "%";
                class30.field699 = 96;
            }
        } else if (field289 == 130) {
            if (!Statics.field1982.method2931()) {
                class30.field700 = class148.field2344 + Statics.field1982.method2952() * 4 / 5 + "%";
                class30.field699 = 100;
            } else if (!Statics.field1847.method2931()) {
                class30.field700 = class148.field2344 + (80 + Statics.field1847.method2952() / 6) + "%";
                class30.field699 = 100;
            } else if (Statics.field657.method2931()) {
                class30.field700 = class148.field2255;
                class30.field699 = 100;
                field289 = 140;
            } else {
                class30.field700 = class148.field2344 + (96 + Statics.field657.method2952() / 20) + "%";
                class30.field699 = 100;
            }
        } else if (field289 == 140) {
            method165(10);
        }
    }

    @ObfuscatedName("at.j(IZZZB)Lfl;")
    public static class159 method669(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class126 var4 = null;
        if (class141.field2160 != null) {
            var4 = new class126(arg0, class141.field2160, Statics.field673[arg0], 1000000);
        }
        return new class159(var4, Statics.field653, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.s(I)V")
    public static final void method484() {
        try {
            if (field294 == 0) {
                if (Statics.field113 != null) {
                    Statics.field113.method2640();
                    Statics.field113 = null;
                }
                Statics.field303 = null;
                field315 = false;
                field295 = 0;
                field294 = 1;
            }
            if (field294 == 1) {
                if (Statics.field303 == null) {
                    Statics.field303 = Statics.field1483.method2545(Statics.field2165, Statics.field298);
                }
                if (Statics.field303.field2138 == 2) {
                    throw new IOException();
                }
                if (Statics.field303.field2138 == 1) {
                    Statics.field113 = new class135((Socket) Statics.field303.field2134, Statics.field1483);
                    Statics.field303 = null;
                    field294 = 2;
                }
            }
            if (field294 == 2) {
                field284.field1902 = 0;
                field284.method2145(14);
                Statics.field113.method2649(field284.field1897, 0, 1);
                field524.field1902 = 0;
                field294 = 3;
            }
            if (field294 == 3) {
                if (Statics.field30 != null) {
                    Statics.field30.method1066();
                }
                if (Statics.field1866 != null) {
                    Statics.field1866.method1066();
                }
                int var0 = Statics.field113.method2655();
                if (Statics.field30 != null) {
                    Statics.field30.method1066();
                }
                if (Statics.field1866 != null) {
                    Statics.field1866.method1066();
                }
                if (var0 != 0) {
                    method764(var0);
                    return;
                }
                field524.field1902 = 0;
                field294 = 5;
            }
            if (field294 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field284.field1902 = 0;
                field284.method2145(1);
                field284.method2145(class30.field715.method494());
                field284.method2148(var1[0]);
                field284.method2148(var1[1]);
                field284.method2148(var1[2]);
                field284.method2148(var1[3]);
                switch(class30.field715.field2507) {
                    case 0:
                    case 1:
                        field284.method2147(Statics.field708);
                        field284.field1902 += 5;
                        break;
                    case 2:
                        field284.field1902 += 8;
                        break;
                    case 3:
                        field284.method2148((Integer) Statics.field2828.field141.get(class154.method576(class30.field705)));
                        field284.field1902 += 4;
                }
                field284.method2298(class30.field706);
                field284.method2263(class5.field65, class5.field66);
                field305.field1902 = 0;
                if (field269 == 40) {
                    field305.method2145(18);
                } else {
                    field305.method2145(16);
                }
                field305.method2319(0);
                int var2 = field305.field1902;
                field305.method2148(85);
                field305.method2154(field284.field1897, 0, field284.field1902);
                int var3 = field305.field1902;
                field305.method2298(class30.field705);
                field305.method2145((field483 ? 1 : 0) << 1 | (field267 ? 1 : 0));
                field305.method2319(Statics.field178);
                field305.method2319(Statics.field2125);
                class141.method135(field305);
                field305.method2298(Statics.field292);
                field305.method2148(Statics.field2509);
                class111 var4 = new class111(Statics.field208.method2801());
                Statics.field208.method2806(var4);
                field305.method2154(var4.field1897, 0, var4.field1897.length);
                field305.method2145(Statics.field2062);
                field305.method2148(Statics.field1036.field2591);
                field305.method2148(Statics.field2843.field2591);
                field305.method2148(Statics.field1599.field2591);
                field305.method2148(Statics.field1982.field2591);
                field305.method2148(Statics.field1548.field2591);
                field305.method2148(Statics.field16.field2591);
                field305.method2148(Statics.field830.field2591);
                field305.method2148(Statics.field198.field2591);
                field305.method2148(Statics.field14.field2591);
                field305.method2148(Statics.field461.field2591);
                field305.method2148(Statics.field166.field2591);
                field305.method2148(Statics.field2555.field2591);
                field305.method2148(Statics.field1847.field2591);
                field305.method2148(Statics.field657.field2591);
                field305.method2148(Statics.field1919.field2591);
                field305.method2148(Statics.field551.field2591);
                field305.method2178(var1, var3, field305.field1902);
                field305.method2156(field305.field1902 - var2);
                Statics.field113.method2649(field305.field1897, 0, field305.field1902);
                field284.method2417(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field524.method2417(var1);
                field294 = 6;
            }
            if (field294 == 6 && Statics.field113.method2642() > 0) {
                int var6 = Statics.field113.method2655();
                if (var6 == 21 && field269 == 20) {
                    field294 = 7;
                } else if (var6 == 2) {
                    field294 = 9;
                } else if (var6 == 15 && field269 == 40) {
                    field284.field1902 = 0;
                    field524.field1902 = 0;
                    field399 = -1;
                    field311 = -1;
                    field287 = -1;
                    field313 = -1;
                    field307 = 0;
                    field309 = 0;
                    field278 = 0;
                    field320 = 0;
                    field408 = false;
                    field506 = 0;
                    field504 = 0;
                    for (int var7 = 0; var7 < field385.length; var7++) {
                        if (field385[var7] != null) {
                            field385[var7].field764 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field365.length; var8++) {
                        if (field365[var8] != null) {
                            field365[var8].field764 = -1;
                        }
                    }
                    class15.field217 = new class187(32);
                    method165(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field474[var9] = true;
                    }
                    field284.method2429(230);
                    field284.method2145(method596());
                    field284.method2319(Statics.field178);
                    field284.method2319(Statics.field2125);
                    return;
                } else if (var6 == 23 && field296 < 1) {
                    field296++;
                    field294 = 0;
                } else if (var6 == 29) {
                    field294 = 11;
                } else {
                    method764(var6);
                    return;
                }
            }
            if (field294 == 7 && Statics.field113.method2642() > 0) {
                field297 = (Statics.field113.method2655() + 3) * 60;
                field294 = 8;
            }
            if (field294 == 8) {
                field295 = 0;
                class30.method640(class148.field2259, class148.field2260, field297 / 60 + class148.field2471);
                if (--field297 <= 0) {
                    field294 = 0;
                }
            } else {
                if (field294 == 9 && Statics.field113.method2642() >= 13) {
                    boolean var10 = Statics.field113.method2655() == 1;
                    Statics.field113.method2643(field524.field1897, 0, 4);
                    field524.field1902 = 0;
                    boolean var11 = false;
                    if (var10) {
                        int var12 = field524.method2416() << 24;
                        int var13 = var12 | field524.method2416() << 16;
                        int var14 = var13 | field524.method2416() << 8;
                        int var15 = var14 | field524.method2416();
                        int var16 = class154.method576(class30.field705);
                        if (Statics.field2828.field141.size() >= 10 && !Statics.field2828.field141.containsKey(var16)) {
                            Iterator var17 = Statics.field2828.field141.entrySet().iterator();
                            var17.next();
                            var17.remove();
                        }
                        Statics.field2828.field141.put(var16, var15);
                        class9.method2780();
                    }
                    field434 = Statics.field113.method2655();
                    field436 = Statics.field113.method2655() == 1;
                    field312 = Statics.field113.method2655();
                    field312 <<= 0x8;
                    field312 += Statics.field113.method2655();
                    field392 = Statics.field113.method2655();
                    Statics.field113.method2643(field524.field1897, 0, 1);
                    field524.field1902 = 0;
                    field399 = field524.method2416();
                    Statics.field113.method2643(field524.field1897, 0, 2);
                    field524.field1902 = 0;
                    field307 = field524.method2339();
                    if (field392 == 1) {
                        try {
                            class124.method2506(Statics.field259, "zap");
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            class124.method2506(Statics.field259, "unzap");
                        } catch (Throwable var24) {
                        }
                    }
                    field294 = 10;
                }
                if (field294 != 10) {
                    if (field294 == 11 && Statics.field113.method2642() >= 2) {
                        field524.field1902 = 0;
                        Statics.field113.method2643(field524.field1897, 0, 2);
                        field524.field1902 = 0;
                        Statics.field1855 = field524.method2339();
                        field294 = 12;
                    }
                    if (field294 == 12 && Statics.field113.method2642() >= Statics.field1855) {
                        field524.field1902 = 0;
                        Statics.field113.method2643(field524.field1897, 0, Statics.field1855);
                        field524.field1902 = 0;
                        String var20 = field524.method2170();
                        String var21 = field524.method2170();
                        String var22 = field524.method2170();
                        class30.method640(var20, var21, var22);
                        method165(10);
                    }
                    field295++;
                    if (field295 > 2000) {
                        if (field296 < 1) {
                            if (Statics.field298 == Statics.field1713) {
                                Statics.field298 = Statics.field1920;
                            } else {
                                Statics.field298 = Statics.field1713;
                            }
                            field296++;
                            field294 = 0;
                        } else {
                            method764(-3);
                        }
                    }
                } else if (Statics.field113.method2642() >= field307) {
                    field524.field1902 = 0;
                    Statics.field113.method2643(field524.field1897, 0, field307);
                    method155();
                    Statics.field229 = -1;
                    Statics.method1806(false);
                    field399 = -1;
                }
            }
        } catch (IOException var26) {
            if (field296 < 1) {
                if (Statics.field298 == Statics.field1713) {
                    Statics.field298 = Statics.field1920;
                } else {
                    Statics.field298 = Statics.field1713;
                }
                field296++;
                field294 = 0;
            } else {
                method764(-2);
            }
        }
    }

    @ObfuscatedName("r.r(I)V")
    public static void method155() {
        field272 = 1L;
        field275 = -1;
        Statics.field1938.field190 = 0;
        Statics.field2081 = true;
        field276 = true;
        field496 = -1L;
        class202.field3039 = new class193();
        field284.field1902 = 0;
        field524.field1902 = 0;
        field399 = -1;
        field311 = -1;
        field287 = -1;
        field313 = -1;
        field309 = 0;
        field278 = 0;
        field428 = 0;
        field279 = 0;
        field320 = 0;
        field408 = false;
        class132.method2598(0);
        class11.method492();
        field508 = 0;
        field422 = false;
        field512 = 0;
        field326 = (int) (Math.random() * 100.0D) - 50;
        field328 = (int) (Math.random() * 110.0D) - 55;
        field330 = (int) (Math.random() * 80.0D) - 40;
        field333 = (int) (Math.random() * 120.0D) - 60;
        field503 = (int) (Math.random() * 30.0D) - 20;
        field350 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field506 = 0;
        field336 = -1;
        field504 = 0;
        field282 = 0;
        field288 = class19.field552;
        field386 = 0;
        field505 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field385[var0] = null;
            field390[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field365[var1] = null;
        }
        Statics.field2098 = field385[2047] = new class3();
        field341 = -1;
        field402.method3406();
        field403.method3406();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field400[var2][var3][var4] = null;
                }
            }
        }
        field401 = new class190();
        field538 = 0;
        field271 = 0;
        field431 = 0;
        for (int var5 = 0; var5 < Statics.field1093; var5++) {
            class48 var6 = class48.method102(var5);
            if (var6 != null) {
                class167.field2817[var5] = 0;
                class167.field2816[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field465.length; var7++) {
            field465[var7] = -1;
        }
        field495 = -1;
        if (field258 != -1) {
            class164.method1365(field258);
        }
        for (class4 var8 = (class4) field522.method3360(); var8 != null; var8 = (class4) field522.method3373()) {
            method2095(var8, true);
        }
        field258 = -1;
        field522 = new class187(8);
        field332 = null;
        field408 = false;
        field320 = 0;
        field543.method3105((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field396[var9] = null;
            field397[var9] = false;
        }
        class15.field217 = new class187(32);
        field300 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field474[var10] = true;
        }
        method1805();
        field497 = null;
        Statics.field168 = 0;
        Statics.field1800 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field546[var11] = new class211();
        }
        Statics.field674 = null;
    }

    @ObfuscatedName("af.h(II)V")
    public static void method764(int arg0) {
        if (arg0 == -3) {
            class30.method640(class148.field2262, class148.field2485, class148.field2386);
        } else if (arg0 == -2) {
            class30.method640(class148.field2265, class148.field2222, class148.field2480);
        } else if (arg0 == -1) {
            class30.method640(class148.field2270, class148.field2269, class148.field2444);
        } else if (arg0 == 3) {
            class30.method640(class148.field2271, class148.field2272, class148.field2374);
        } else if (arg0 == 4) {
            class30.method640(class148.field2274, class148.field2275, class148.field2276);
        } else if (arg0 == 5) {
            class30.method640(class148.field2277, class148.field2278, class148.field2279);
        } else if (arg0 == 6) {
            class30.method640(class148.field2458, class148.field2281, class148.field2282);
        } else if (arg0 == 7) {
            class30.method640(class148.field2283, class148.field2284, class148.field2285);
        } else if (arg0 == 8) {
            class30.method640(class148.field2286, class148.field2419, class148.field2288);
        } else if (arg0 == 9) {
            class30.method640(class148.field2491, class148.field2290, class148.field2291);
        } else if (arg0 == 10) {
            class30.method640(class148.field2292, class148.field2293, class148.field2294);
        } else if (arg0 == 11) {
            class30.method640(class148.field2362, class148.field2296, class148.field2297);
        } else if (arg0 == 12) {
            class30.method640(class148.field2298, class148.field2299, class148.field2300);
        } else if (arg0 == 13) {
            class30.method640(class148.field2301, class148.field2231, class148.field2303);
        } else if (arg0 == 14) {
            class30.method640(class148.field2304, class148.field2305, class148.field2404);
        } else if (arg0 == 16) {
            class30.method640(class148.field2307, class148.field2308, class148.field2309);
        } else if (arg0 == 17) {
            class30.method640(class148.field2310, class148.field2311, class148.field2433);
        } else if (arg0 == 18) {
            class30.method640(class148.field2313, class148.field2268, class148.field2315);
        } else if (arg0 == 19) {
            class30.method640(class148.field2316, class148.field2317, class148.field2318);
        } else if (arg0 == 20) {
            class30.method640(class148.field2319, class148.field2320, class148.field2384);
        } else if (arg0 == 22) {
            class30.method640(class148.field2322, class148.field2323, class148.field2475);
        } else if (arg0 == 23) {
            class30.method640(class148.field2229, class148.field2261, class148.field2327);
        } else if (arg0 == 24) {
            class30.method640(class148.field2328, class148.field2324, class148.field2389);
        } else if (arg0 == 25) {
            class30.method640(class148.field2331, class148.field2332, class148.field2333);
        } else if (arg0 == 26) {
            class30.method640(class148.field2334, class148.field2335, class148.field2336);
        } else if (arg0 == 27) {
            class30.method640(class148.field2337, class148.field2254, class148.field2339);
        } else if (arg0 == 31) {
            class30.method640(class148.field2346, class148.field2347, class148.field2348);
        } else if (arg0 == 32) {
            class30.method640(class148.field2349, class148.field2350, class148.field2351);
        } else if (arg0 == 37) {
            class30.method640(class148.field2267, class148.field2353, class148.field2312);
        } else if (arg0 == 38) {
            class30.method640(class148.field2355, class148.field2356, class148.field2232);
        } else if (arg0 == 55) {
            class30.method640(class148.field2377, class148.field2359, class148.field2360);
        } else if (arg0 == 56) {
            class30.method640(class148.field2361, class148.field2280, class148.field2363);
            method165(11);
            return;
        } else if (arg0 == 57) {
            class30.method640(class148.field2443, class148.field2365, class148.field2366);
            method165(11);
            return;
        } else {
            class30.method640(class148.field2367, class148.field2409, class148.field2369);
        }
        method165(10);
    }

    @ObfuscatedName("n.x(B)V")
    public static final void method27() {
        if (Statics.field113 != null) {
            Statics.field113.method2640();
            Statics.field113 = null;
        }
        method152();
        Statics.field1939.method1686();
        for (int var0 = 0; var0 < 4; var0++) {
            field322[var0].method3741();
        }
        System.gc();
        class174.method115(2);
        field429 = -1;
        field509 = false;
        class22.method656();
        method165(10);
    }

    @ObfuscatedName("r.m(I)V")
    public static final void method152() {
        class43.field1000.method3333();
        class39.method66();
        class42.field980.method3333();
        class38.field879.method3333();
        class38.field874.method3333();
        class38.field891.method3333();
        class38.field876.method3333();
        class37.field831.method3333();
        class37.field832.method3333();
        class47.field1059.method3333();
        class47.field1045.method3333();
        class47.field1043.method3333();
        class40.field937.method3333();
        class40.field938.method3333();
        Statics.method2638();
        class44.method644();
        class48.method670();
        class170.field2830.method3333();
        class164.method857();
        ((class90) Statics.field1507).method1885();
        class20.field565.method3333();
        Statics.field1036.method2875();
        Statics.field2843.method2875();
        Statics.field1982.method2875();
        Statics.field1548.method2875();
        Statics.field16.method2875();
        Statics.field830.method2875();
        Statics.field198.method2875();
        Statics.field14.method2875();
        Statics.field461.method2875();
        Statics.field166.method2875();
        Statics.field2555.method2875();
        Statics.field1847.method2875();
    }

    @ObfuscatedName("c.a(I)V")
    public static final void method531() {
        if (field428 > 0) {
            method27();
        } else {
            method165(40);
            Statics.field26 = Statics.field113;
            Statics.field113 = null;
        }
    }

    @ObfuscatedName("ey.p(I)V")
    public static final void method2597() {
        if (Statics.field1866 != null) {
            Statics.field1866.method1049();
        }
        if (Statics.field30 != null) {
            Statics.field30.method1049();
        }
    }

    @ObfuscatedName("as.c(B)V")
    public static final void method702() {
        for (int var0 = 0; var0 < field512; var0++) {
            int var10002 = field515[var0]--;
            if (field515[var0] >= -10) {
                class54 var2 = field339[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method1101(Statics.field1548, field513[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field515[var0] += var2.method1100();
                    field339[var0] = var2;
                }
                if (field515[var0] < 0) {
                    int var9;
                    if (field516[var0] == 0) {
                        var9 = field520;
                    } else {
                        int var3 = (field516[var0] & 0xFF) * 128;
                        int var4 = field516[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2098.field802;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field516[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2098.field762;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field515[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field290 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class58 var10 = var2.method1102().method1135(Statics.field204);
                        class60 var11 = class60.method1159(var10, 100, var9);
                        var11.method1199(field514[var0] - 1);
                        Statics.field928.method1045(var11);
                    }
                    field515[var0] = -100;
                }
            } else {
                field512--;
                for (int var1 = var0; var1 < field512; var1++) {
                    field513[var1] = field513[var1 + 1];
                    field339[var1] = field339[var1 + 1];
                    field514[var1] = field514[var1 + 1];
                    field515[var1] = field515[var1 + 1];
                    field516[var1] = field516[var1 + 1];
                }
                var0--;
            }
        }
        if (!field509) {
            return;
        }
        boolean var12;
        if (class174.field2874 == 0) {
            var12 = Statics.field730.method3275();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field412 != 0 && field429 != -1) {
                class174.method2487(Statics.field830, field429, 0, field412, false);
            }
            field509 = false;
        }
    }

    @ObfuscatedName("e.u(Lay;IIII)V")
    public static void method65(class40 arg0, int arg1, int arg2, int arg3) {
        if (field512 >= 50 || field290 == 0 || arg0.field941 == null || arg1 >= arg0.field941.length) {
            return;
        }
        int var4 = arg0.field941[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field513[field512] = var5;
        field514[field512] = var6;
        field515[field512] = 0;
        field339[field512] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field516[field512] = (var8 << 16) + (var9 << 8) + var7;
        field512++;
    }

    @ObfuscatedName("af.d(IIII)V")
    public static void method767(int arg0, int arg1, int arg2) {
        if (field520 == 0 || arg1 == 0 || field512 >= 50) {
            return;
        }
        field513[field512] = arg0;
        field514[field512] = arg1;
        field515[field512] = arg2;
        field339[field512] = null;
        field516[field512] = 0;
        field512++;
    }

    @ObfuscatedName("ff.o(II)V")
    public static void method2971(int arg0) {
        if (arg0 == -1 && !field509) {
            class174.method2786();
        } else if (arg0 != -1 && field429 != arg0 && field412 != 0 && !field509) {
            class159 var1 = Statics.field830;
            int var2 = field412;
            class174.field2874 = 1;
            Statics.field2875 = var1;
            Statics.field214 = arg0;
            Statics.field2826 = 0;
            Statics.field2152 = var2;
            Statics.field579 = false;
            Statics.field2876 = 2;
        }
        field429 = arg0;
    }

    @ObfuscatedName("bv.aj(III)V")
    public static void method1444(int arg0, int arg1) {
        if (field412 != 0 && arg0 != -1) {
            class174.method2487(Statics.field2555, arg0, 0, field412, false);
            field509 = true;
        }
    }

    @ObfuscatedName("r.au(I)V")
    public static final void method160() {
        if (field267 && Statics.field991 != field464) {
            method498(Statics.field229, Statics.field2839, Statics.field991, Statics.field2098.field815[0], Statics.field2098.field816[0]);
        } else if (Statics.field991 != field336) {
            field336 = Statics.field991;
            int var0 = Statics.field991;
            int[] var1 = Statics.field1120.field1332;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class6.field71[var0][var6][var4] & 0x18) == 0) {
                        Statics.field1939.method1671(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class6.field71[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field1939.method1671(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field1120.method1449();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class6.field71[var0][var10][var9] & 0x18) == 0) {
                        method100(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class6.field71[var0 + 1][var10][var9] & 0x8) != 0) {
                        method100(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field420 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field1939.method1666(Statics.field991, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class38.method167(var14).field899;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field322[Statics.field991].field3130;
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
                            field398[field420] = Statics.field1962[var15];
                            field501[field420] = var16;
                            field502[field420] = var17;
                            field420++;
                        }
                    }
                }
            }
            Statics.field1376.method1439();
        }
    }

    @ObfuscatedName("du.ah(I)V")
    public static final void method2532() {
        for (int var0 = -1; var0 < field386; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field482[var0];
            }
            class3 var2 = field385[var1];
            if (var2 != null && var2.field819 > 0) {
                var2.field819--;
                if (var2.field819 == 0) {
                    var2.field772 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field505; var3++) {
            int var4 = field466[var3];
            class32 var5 = field365[var4];
            if (var5 != null && var5.field819 > 0) {
                var5.field819--;
                if (var5.field819 == 0) {
                    var5.field772 = null;
                }
            }
        }
    }

    @ObfuscatedName("ct.ab(Ljava/lang/String;S)V")
    public static final void method2079(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2828.field135 = !Statics.field2828.field135;
            class9.method2780();
            if (Statics.field2828.field135) {
                class11.method590(99, "", "Roofs are now all hidden");
            } else {
                class11.method590(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field277 = !field277;
        }
        if (field434 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field277 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field277 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method531();
            }
            if (arg0.equalsIgnoreCase("errortest") && field264 == 2) {
                throw new RuntimeException();
            }
        }
        field284.method2429(175);
        field284.method2145(arg0.length() + 1);
        field284.method2298(arg0);
    }

    @ObfuscatedName("cu.am(I)V")
    public static final void method1804() {
        int var0 = Statics.field2571 * 128 + 64;
        int var1 = Statics.field161 * 128 + 64;
        int var2 = method2468(var0, var1, Statics.field991) - Statics.field1841;
        if (Statics.field1829 < var0) {
            Statics.field1829 += Statics.field595 * (var0 - Statics.field1829) / 1000 + Statics.field2806;
            if (Statics.field1829 > var0) {
                Statics.field1829 = var0;
            }
        }
        if (Statics.field1829 > var0) {
            Statics.field1829 -= Statics.field595 * (Statics.field1829 - var0) / 1000 + Statics.field2806;
            if (Statics.field1829 < var0) {
                Statics.field1829 = var0;
            }
        }
        if (Statics.field2210 < var2) {
            Statics.field2210 += Statics.field595 * (var2 - Statics.field2210) / 1000 + Statics.field2806;
            if (Statics.field2210 > var2) {
                Statics.field2210 = var2;
            }
        }
        if (Statics.field2210 > var2) {
            Statics.field2210 -= Statics.field595 * (Statics.field2210 - var2) / 1000 + Statics.field2806;
            if (Statics.field2210 < var2) {
                Statics.field2210 = var2;
            }
        }
        if (Statics.field1147 < var1) {
            Statics.field1147 += Statics.field595 * (var1 - Statics.field1147) / 1000 + Statics.field2806;
            if (Statics.field1147 > var1) {
                Statics.field1147 = var1;
            }
        }
        if (Statics.field1147 > var1) {
            Statics.field1147 -= Statics.field595 * (Statics.field1147 - var1) / 1000 + Statics.field2806;
            if (Statics.field1147 < var1) {
                Statics.field1147 = var1;
            }
        }
        int var3 = Statics.field723 * 128 + 64;
        int var4 = Statics.field1727 * 128 + 64;
        int var5 = method2468(var3, var4, Statics.field991) - Statics.field2196;
        int var6 = var3 - Statics.field1829;
        int var7 = var5 - Statics.field2210;
        int var8 = var4 - Statics.field1147;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field13 < var10) {
            Statics.field13 += Statics.field1613 * (var10 - Statics.field13) / 1000 + Statics.field1860;
            if (Statics.field13 > var10) {
                Statics.field13 = var10;
            }
        }
        if (Statics.field13 > var10) {
            Statics.field13 -= Statics.field1613 * (Statics.field13 - var10) / 1000 + Statics.field1860;
            if (Statics.field13 < var10) {
                Statics.field13 = var10;
            }
        }
        int var12 = var11 - Statics.field1971;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1971 += Statics.field1613 * var12 / 1000 + Statics.field1860;
            Statics.field1971 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1971 -= Statics.field1613 * -var12 / 1000 + Statics.field1860;
            Statics.field1971 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1971;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1971 = var11;
        }
    }

    @ObfuscatedName("dy.ar(B)V")
    public static final void method2464() {
        int var0 = field326 + Statics.field2098.field802;
        int var1 = field328 + Statics.field2098.field762;
        if (Statics.field601 - var0 < -500 || Statics.field601 - var0 > 500 || Statics.field1034 - var1 < -500 || Statics.field1034 - var1 > 500) {
            Statics.field601 = var0;
            Statics.field1034 = var1;
        }
        if (Statics.field601 != var0) {
            Statics.field601 += (var0 - Statics.field601) / 16;
        }
        if (Statics.field1034 != var1) {
            Statics.field1034 += (var1 - Statics.field1034) / 16;
        }
        if (class132.field2070 == 4 && Statics.field213) {
            int var2 = class132.field2072 * 76101137 - field354;
            field352 = var2 * 2;
            field354 = var2 == -1 || var2 == 1 ? class132.field2072 * 76101137 : (field354 + class132.field2072 * 76101137) / 2;
            int var3 = field358 - class132.field2071;
            field351 = var3 * 2;
            field358 = var3 == -1 || var3 == 1 ? class132.field2071 : (field358 + class132.field2071) / 2;
        } else {
            if (class129.field2027[96]) {
                field351 += (-24 - field351) / 2;
            } else if (class129.field2027[97]) {
                field351 += (24 - field351) / 2;
            } else {
                field351 /= 2;
            }
            if (class129.field2027[98]) {
                field352 += (12 - field352) / 2;
            } else if (class129.field2027[99]) {
                field352 += (-12 - field352) / 2;
            } else {
                field352 /= 2;
            }
            field354 = class132.field2072 * 76101137;
            field358 = class132.field2071;
        }
        field350 = field351 / 2 + field350 & 0x7FF;
        field349 += field352 / 2;
        if (field349 < 128) {
            field349 = 128;
        }
        if (field349 > 383) {
            field349 = 383;
        }
        int var4 = Statics.field601 >> 7;
        int var5 = Statics.field1034 >> 7;
        int var6 = method2468(Statics.field601, Statics.field1034, Statics.field991);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field991;
                    if (var10 < 3 && (class6.field71[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field89[var10][var8][var9];
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
        if (var12 > field406) {
            field406 += (var12 - field406) / 24;
        } else if (var12 < field406) {
            field406 += (var12 - field406) / 80;
        }
    }

    @ObfuscatedName("av.an(I)V")
    public static final void method888() {
        for (int var0 = -1; var0 < field386; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field482[var0];
            }
            class3 var2 = field385[var1];
            if (var2 != null) {
                method604(var2, 1);
            }
        }
    }

    @ObfuscatedName("au.az(Lat;II)V")
    public static final void method604(class35 arg0, int arg1) {
        if (arg0.field807 > field423) {
            int var2 = arg0.field807 - field423;
            int var3 = arg0.field817 * 128 + arg0.field808 * 64;
            int var4 = arg0.field808 * 64 + arg0.field804 * 128;
            arg0.field802 += (var3 - arg0.field802) / var2;
            arg0.field762 += (var4 - arg0.field762) / var2;
            arg0.field818 = 0;
            if (arg0.field770 == 0) {
                arg0.field811 = 1024;
            }
            if (arg0.field770 == 1) {
                arg0.field811 = 1536;
            }
            if (arg0.field770 == 2) {
                arg0.field811 = 0;
            }
            if (arg0.field770 == 3) {
                arg0.field811 = 512;
            }
        } else if (arg0.field761 >= field423) {
            method2415(arg0);
        } else {
            method778(arg0);
        }
        if (arg0.field802 < 128 || arg0.field762 < 128 || arg0.field802 >= 13184 || arg0.field762 >= 13184) {
            arg0.field777 = -1;
            arg0.field797 = -1;
            arg0.field807 = 0;
            arg0.field761 = 0;
            arg0.field802 = arg0.field815[0] * 128 + arg0.field808 * 64;
            arg0.field762 = arg0.field816[0] * 128 + arg0.field808 * 64;
            arg0.method659();
        }
        if (Statics.field2098 == arg0 && (arg0.field802 < 1536 || arg0.field762 < 1536 || arg0.field802 >= 11776 || arg0.field762 >= 11776)) {
            arg0.field777 = -1;
            arg0.field797 = -1;
            arg0.field807 = 0;
            arg0.field761 = 0;
            arg0.field802 = arg0.field815[0] * 128 + arg0.field808 * 64;
            arg0.field762 = arg0.field816[0] * 128 + arg0.field808 * 64;
            arg0.method659();
        }
        if (arg0.field813 != 0) {
            if (arg0.field764 != -1 && arg0.field764 < 32768) {
                class32 var5 = field365[arg0.field764];
                if (var5 != null) {
                    int var6 = arg0.field802 - var5.field802;
                    int var7 = arg0.field762 - var5.field762;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field811 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field764 >= 32768) {
                int var8 = arg0.field764 - 32768;
                if (field312 == var8) {
                    var8 = 2047;
                }
                class3 var9 = field385[var8];
                if (var9 != null) {
                    int var10 = arg0.field802 - var9.field802;
                    int var11 = arg0.field762 - var9.field762;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field811 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field805 != 0 || arg0.field788 != 0) && (arg0.field780 == 0 || arg0.field818 > 0)) {
                int var12 = arg0.field802 - (arg0.field805 * 64 - Statics.field2052 * 64 - Statics.field2052 * 64);
                int var13 = arg0.field762 - (arg0.field788 * 64 - Statics.field613 * 64 - Statics.field613 * 64);
                if (var12 != 0 || var13 != 0) {
                    arg0.field811 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
                arg0.field805 = 0;
                arg0.field788 = 0;
            }
            int var14 = arg0.field811 - arg0.field763 & 0x7FF;
            if (var14 == 0) {
                arg0.field812 = 0;
            } else {
                arg0.field812++;
                if (var14 > 1024) {
                    arg0.field763 -= arg0.field813;
                    boolean var15 = true;
                    if (var14 < arg0.field813 || var14 > 2048 - arg0.field813) {
                        arg0.field763 = arg0.field811;
                        var15 = false;
                    }
                    if (arg0.field789 == arg0.field766 && (arg0.field812 > 25 || var15)) {
                        if (arg0.field814 == -1) {
                            arg0.field789 = arg0.field769;
                        } else {
                            arg0.field789 = arg0.field814;
                        }
                    }
                } else {
                    arg0.field763 += arg0.field813;
                    boolean var16 = true;
                    if (var14 < arg0.field813 || var14 > 2048 - arg0.field813) {
                        arg0.field763 = arg0.field811;
                        var16 = false;
                    }
                    if (arg0.field789 == arg0.field766 && (arg0.field812 > 25 || var16)) {
                        if (arg0.field768 == -1) {
                            arg0.field789 = arg0.field769;
                        } else {
                            arg0.field789 = arg0.field768;
                        }
                    }
                }
                arg0.field763 &= 0x7FF;
            }
        }
        method18(arg0);
    }

    @ObfuscatedName("de.at(Lat;I)V")
    public static final void method2415(class35 arg0) {
        if (field423 == arg0.field761 || arg0.field777 == -1 || arg0.field795 != 0 || arg0.field767 + 1 > class40.method547(arg0.field777).field950[arg0.field793]) {
            int var1 = arg0.field761 - arg0.field807;
            int var2 = field423 - arg0.field807;
            int var3 = arg0.field817 * 128 + arg0.field808 * 64;
            int var4 = arg0.field808 * 64 + arg0.field804 * 128;
            int var5 = arg0.field808 * 64 + arg0.field803 * 128;
            int var6 = arg0.field808 * 64 + arg0.field774 * 128;
            arg0.field802 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field762 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field818 = 0;
        if (arg0.field770 == 0) {
            arg0.field811 = 1024;
        }
        if (arg0.field770 == 1) {
            arg0.field811 = 1536;
        }
        if (arg0.field770 == 2) {
            arg0.field811 = 0;
        }
        if (arg0.field770 == 3) {
            arg0.field811 = 512;
        }
        arg0.field763 = arg0.field811;
    }

    @ObfuscatedName("ay.ag(Lat;B)V")
    public static final void method778(class35 arg0) {
        arg0.field789 = arg0.field766;
        if (arg0.field780 == 0) {
            arg0.field818 = 0;
            return;
        }
        if (arg0.field777 != -1 && arg0.field795 == 0) {
            class40 var1 = class40.method547(arg0.field777);
            if (arg0.field806 > 0 && var1.field948 == 0) {
                arg0.field818++;
                return;
            }
            if (arg0.field806 <= 0 && var1.field951 == 0) {
                arg0.field818++;
                return;
            }
        }
        int var2 = arg0.field802;
        int var3 = arg0.field762;
        int var4 = arg0.field815[arg0.field780 - 1] * 128 + arg0.field808 * 64;
        int var5 = arg0.field816[arg0.field780 - 1] * 128 + arg0.field808 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field802 = var4;
            arg0.field762 = var5;
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
        int var6 = arg0.field811 - arg0.field763 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field787;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field769;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field820;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field771;
        }
        if (var7 == -1) {
            var7 = arg0.field769;
        }
        arg0.field789 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class32) {
            var9 = ((class32) arg0).field729.field834;
        }
        if (var9) {
            if (arg0.field811 != arg0.field763 && arg0.field764 == -1 && arg0.field813 != 0) {
                var8 = 2;
            }
            if (arg0.field780 > 2) {
                var8 = 6;
            }
            if (arg0.field780 > 3) {
                var8 = 8;
            }
            if (arg0.field818 > 0 && arg0.field780 > 1) {
                var8 = 8;
                arg0.field818--;
            }
        } else {
            if (arg0.field780 > 1) {
                var8 = 6;
            }
            if (arg0.field780 > 2) {
                var8 = 8;
            }
            if (arg0.field818 > 0 && arg0.field780 > 1) {
                var8 = 8;
                arg0.field818--;
            }
        }
        if (arg0.field784[arg0.field780 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field789 == arg0.field769 && arg0.field792 != -1) {
            arg0.field789 = arg0.field792;
        }
        if (var2 < var4) {
            arg0.field802 += var8;
            if (arg0.field802 > var4) {
                arg0.field802 = var4;
            }
        } else if (var2 > var4) {
            arg0.field802 -= var8;
            if (arg0.field802 < var4) {
                arg0.field802 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field762 += var8;
            if (arg0.field762 > var5) {
                arg0.field762 = var5;
            }
        } else if (var3 > var5) {
            arg0.field762 -= var8;
            if (arg0.field762 < var5) {
                arg0.field762 = var5;
            }
        }
        if (arg0.field802 == var4 && arg0.field762 == var5) {
            arg0.field780--;
            if (arg0.field806 > 0) {
                arg0.field806--;
            }
        }
    }

    @ObfuscatedName("g.as(Lat;I)V")
    public static final void method18(class35 arg0) {
        arg0.field765 = false;
        if (arg0.field789 != -1) {
            class40 var1 = class40.method547(arg0.field789);
            if (var1 == null || var1.field949 == null) {
                arg0.field789 = -1;
            } else {
                arg0.field791++;
                if (arg0.field790 < var1.field949.length && arg0.field791 > var1.field950[arg0.field790]) {
                    arg0.field791 = 1;
                    arg0.field790++;
                    method65(var1, arg0.field790, arg0.field802, arg0.field762);
                }
                if (arg0.field790 >= var1.field949.length) {
                    arg0.field791 = 0;
                    arg0.field790 = 0;
                    method65(var1, arg0.field790, arg0.field802, arg0.field762);
                }
            }
        }
        if (arg0.field797 != -1 && field423 >= arg0.field800) {
            if (arg0.field798 < 0) {
                arg0.field798 = 0;
            }
            int var2 = class41.method2077(arg0.field797).field968;
            if (var2 == -1) {
                arg0.field797 = -1;
            } else {
                class40 var3 = class40.method547(var2);
                if (var3 == null || var3.field949 == null) {
                    arg0.field797 = -1;
                } else {
                    arg0.field799++;
                    if (arg0.field798 < var3.field949.length && arg0.field799 > var3.field950[arg0.field798]) {
                        arg0.field799 = 1;
                        arg0.field798++;
                        method65(var3, arg0.field798, arg0.field802, arg0.field762);
                    }
                    if (arg0.field798 >= var3.field949.length && (arg0.field798 < 0 || arg0.field798 >= var3.field949.length)) {
                        arg0.field797 = -1;
                    }
                }
            }
        }
        if (arg0.field777 != -1 && arg0.field795 <= 1) {
            class40 var4 = class40.method547(arg0.field777);
            if (var4.field948 == 1 && arg0.field806 > 0 && arg0.field807 <= field423 && arg0.field761 < field423) {
                arg0.field795 = 1;
                return;
            }
        }
        if (arg0.field777 != -1 && arg0.field795 == 0) {
            class40 var5 = class40.method547(arg0.field777);
            if (var5 == null || var5.field949 == null) {
                arg0.field777 = -1;
            } else {
                arg0.field767++;
                if (arg0.field793 < var5.field949.length && arg0.field767 > var5.field950[arg0.field793]) {
                    arg0.field767 = 1;
                    arg0.field793++;
                    method65(var5, arg0.field793, arg0.field802, arg0.field762);
                }
                if (arg0.field793 >= var5.field949.length) {
                    arg0.field793 -= var5.field943;
                    arg0.field796++;
                    if (arg0.field796 >= var5.field947) {
                        arg0.field777 = -1;
                    } else if (arg0.field793 >= 0 && arg0.field793 < var5.field949.length) {
                        method65(var5, arg0.field793, arg0.field802, arg0.field762);
                    } else {
                        arg0.field777 = -1;
                    }
                }
                arg0.field765 = var5.field945;
            }
        }
        if (arg0.field795 > 0) {
            arg0.field795--;
        }
    }

    @ObfuscatedName("s.ao(Lg;III)V")
    public static void method146(class3 arg0, int arg1, int arg2) {
        if (arg0.field777 == arg1 && arg1 != -1) {
            int var3 = class40.method547(arg1).field944;
            if (var3 == 1) {
                arg0.field793 = 0;
                arg0.field767 = 0;
                arg0.field795 = arg2;
                arg0.field796 = 0;
            }
            if (var3 == 2) {
                arg0.field796 = 0;
            }
        } else if (arg1 == -1 || arg0.field777 == -1 || class40.method547(arg1).field946 >= class40.method547(arg0.field777).field946) {
            arg0.field777 = arg1;
            arg0.field793 = 0;
            arg0.field767 = 0;
            arg0.field795 = arg2;
            arg0.field796 = 0;
            arg0.field806 = arg0.field780;
        }
    }

    @ObfuscatedName("aj.af(I)I")
    public static int method596() {
        return field483 ? 2 : 1;
    }

    @ObfuscatedName("cf.ay(I)V")
    public static void method1805() {
        field284.method2429(230);
        field284.method2145(method596());
        field284.method2319(Statics.field178);
        field284.method2319(Statics.field2125);
    }

    @ObfuscatedName("dy.aq(B)V")
    public static void method2465() {
        client var0 = Statics.field259;
        synchronized (Statics.field259) {
            Container var1 = Statics.field259.method2728();
            if (var1 != null) {
                Statics.field131 = Math.max(var1.getSize().width, Statics.field1148);
                Statics.field1851 = Math.max(var1.getSize().height, Statics.field2562);
                if (Statics.field2058 == var1) {
                    Insets var2 = Statics.field2058.getInsets();
                    Statics.field131 -= var2.right + var2.left;
                    Statics.field1851 -= var2.top + var2.bottom;
                }
                if (Statics.field131 <= 0) {
                    Statics.field131 = 1;
                }
                if (Statics.field1851 <= 0) {
                    Statics.field1851 = 1;
                }
                if (method596() == 1) {
                    Statics.field178 = field485;
                    Statics.field2125 = field486 * 503;
                } else {
                    Statics.field178 = Math.min(Statics.field131, 7680);
                    Statics.field2125 = Math.min(Statics.field1851, 2160);
                }
                field2123 = (Statics.field131 - Statics.field178) / 2;
                field2113 = 0;
                Statics.field1094.setSize(Statics.field178, Statics.field2125);
                Statics.field1376 = class73.method1363(Statics.field178, Statics.field2125, Statics.field1094);
                if (Statics.field2058 == var1) {
                    Insets var3 = Statics.field2058.getInsets();
                    Statics.field1094.setLocation(field2123 + var3.left, field2113 + var3.top);
                } else {
                    Statics.field1094.setLocation(field2123, field2113);
                }
                int var4 = Statics.field178;
                int var5 = Statics.field2125;
                if (Statics.field131 < var4) {
                    int var6 = Statics.field131;
                }
                if (Statics.field1851 < var5) {
                    int var7 = Statics.field1851;
                }
                if (Statics.field2828 != null) {
                    try {
                        Statics.method2509(Statics.field259, "resize", new Object[] { method596() });
                    } catch (Throwable var10) {
                    }
                }
                if (field258 != -1) {
                    method74(true);
                }
                method811();
            }
        }
    }

    @ObfuscatedName("aq.aw(B)V")
    public static void method811() {
        int var0 = field2123;
        int var1 = field2113;
        int var2 = Statics.field131 - Statics.field178 - var0;
        int var3 = Statics.field1851 - Statics.field2125 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field259.method2728();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field2058 == var4) {
                Insets var7 = Statics.field2058.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1851);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field131, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field131 + var5 - var2, var6, var2, Statics.field1851);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1851 + var6 - var3, Statics.field131, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("e.ap(IIIIZB)V")
    public static final void method63(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field525 - field470) * var5 / 100 + field470;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field327) {
            short var8 = field327;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field529) {
                var6 = field529;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class75.method1580();
                    class75.method1575(arg0, arg1, var10, arg3, -16777216);
                    class75.method1575(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field531) {
            short var11 = field531;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field528) {
                var6 = field528;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class75.method1580();
                    class75.method1575(arg0, arg1, arg2, var13, -16777216);
                    class75.method1575(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field536 = arg3 * var6 / 334 << 1;
        if (field441 != arg2 || field316 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < 9; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var18 = class86.field1510[var16];
                var14[var15] = var17 * var18 >> 16;
            }
            class81.method1672(var14, 500, 800, arg2, arg3);
        }
        field532 = arg0;
        field533 = arg1;
        field441 = arg2;
        field316 = arg3;
    }

    @ObfuscatedName("r.ac(Lam;B)V")
    public static final void method154(class31 arg0) {
        if (Statics.field2098.field802 >> 7 == field504 && Statics.field2098.field762 >> 7 == field282) {
            field504 = 0;
        }
        int var1 = field386;
        if (class31.field727 == arg0 || class31.field720 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class31.field727 == arg0) {
                var3 = Statics.field2098;
                var4 = 33538048;
            } else if (class31.field720 == arg0) {
                var3 = field385[field341];
                var4 = field341 << 14;
            } else {
                var3 = field385[field482[var2]];
                var4 = field482[var2] << 14;
                if (class31.field722 == arg0 && field341 == field482[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method19() && !var3.field54) {
                var3.field52 = false;
                if ((field267 && field386 > 50 || field386 > 200) && class31.field727 != arg0 && var3.field789 == var3.field766) {
                    var3.field52 = true;
                }
                int var5 = var3.field802 >> 7;
                int var6 = var3.field762 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field42 == null || field423 < var3.field41 || field423 >= var3.field47) {
                        if ((var3.field802 & 0x7F) == 64 && (var3.field762 & 0x7F) == 64) {
                            if (field369 == field368[var5][var6]) {
                                continue;
                            }
                            field368[var5][var6] = field369;
                        }
                        var3.field35 = method2468(var3.field802, var3.field762, Statics.field991);
                        Statics.field1939.method1648(Statics.field991, var3.field802, var3.field762, var3.field35, 60, var3, var3.field763, var4, var3.field765);
                    } else {
                        var3.field52 = false;
                        var3.field35 = method2468(var3.field802, var3.field762, Statics.field991);
                        Statics.field1939.method1794(Statics.field991, var3.field802, var3.field762, var3.field35, 60, var3, var3.field763, var4, var3.field48, var3.field37, var3.field50, var3.field46);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ec.av(ZB)V")
    public static final void method2773(boolean arg0) {
        for (int var1 = 0; var1 < field505; var1++) {
            class32 var2 = field365[field466[var1]];
            int var3 = (field466[var1] << 14) + 536870912;
            if (var2 != null && var2.method19() && var2.field729.field854 == arg0 && var2.field729.method679()) {
                int var4 = var2.field802 >> 7;
                int var5 = var2.field762 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field808 == 1 && (var2.field802 & 0x7F) == 64 && (var2.field762 & 0x7F) == 64) {
                        if (field369 == field368[var4][var5]) {
                            continue;
                        }
                        field368[var4][var5] = field369;
                    }
                    if (!var2.field729.field862) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1939.method1648(Statics.field991, var2.field802, var2.field762, method2468(var2.field802 + (var2.field808 * 64 - 64), var2.field762 + (var2.field808 * 64 - 64), Statics.field991), var2.field808 * 64 - 64 + 60, var2, var2.field763, var3, var2.field765);
                }
            }
        }
    }

    @ObfuscatedName("dy.ai(I)V")
    public static final void method2466() {
        for (class28 var0 = (class28) field403.method3396(); var0 != null; var0 = (class28) field403.method3398()) {
            if (Statics.field991 != var0.field665 || var0.field672) {
                var0.method3482();
            } else if (field423 >= var0.field670) {
                var0.method600(field537);
                if (var0.field672) {
                    var0.method3482();
                } else {
                    Statics.field1939.method1648(var0.field665, var0.field664, var0.field667, var0.field668, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("fz.ax(I)I")
    public static final int method2979() {
        if (Statics.field2828.field135) {
            return Statics.field991;
        } else {
            int var0 = method2468(Statics.field1829, Statics.field1147, Statics.field991);
            return var0 - Statics.field2210 >= 800 || (class6.field71[Statics.field991][Statics.field1829 >> 7][Statics.field1147 >> 7] & 0x4) == 0 ? 3 : Statics.field991;
        }
    }

    @ObfuscatedName("ex.ae(Lat;IIIIII)V")
    public static final void method2759(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method19()) {
            return;
        }
        if (arg0 instanceof class32) {
            class37 var6 = ((class32) arg0).field729;
            if (var6.field837 != null) {
                var6 = var6.method678();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field386) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field54) {
                return;
            }
            if (var8.field43 != -1 || var8.field38 != -1) {
                Statics.method2792(arg0, arg0.field810 + 15);
                if (field370 > -1) {
                    if (var8.field43 != -1) {
                        Statics.field1865[var8.field43].method1459(field370 + arg2 - 12, field534 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field38 != -1) {
                        Statics.field728[var8.field38].method1459(field370 + arg2 - 12, field534 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field279 == 10 && field281 == field482[arg1]) {
                Statics.method2792(arg0, arg0.field810 + 15);
                if (field370 > -1) {
                    Statics.field340[1].method1459(field370 + arg2 - 12, field534 + arg3 - var7);
                }
            }
        } else {
            class37 var9 = ((class32) arg0).field729;
            if (var9.field837 != null) {
                var9 = var9.method678();
            }
            if (var9.field857 >= 0 && var9.field857 < Statics.field728.length) {
                Statics.method2792(arg0, arg0.field810 + 15);
                if (field370 > -1) {
                    Statics.field728[var9.field857].method1459(field370 + arg2 - 12, field534 + arg3 - 30);
                }
            }
            if (field279 == 1 && field280 == field466[arg1 - field386] && field423 % 20 < 10) {
                Statics.method2792(arg0, arg0.field810 + 15);
                if (field370 > -1) {
                    Statics.field340[0].method1459(field370 + arg2 - 12, field534 + arg3 - 28);
                }
            }
        }
        if (arg0.field772 != null && (arg1 >= field386 || !arg0.field776 && (field488 == 4 || !arg0.field775 && (field488 == 0 || field488 == 3 || field488 == 1 && method491(((class3) arg0).field49, false))))) {
            Statics.method2792(arg0, arg0.field810);
            if (field370 > -1 && field523 < field359) {
                field499[field523] = Statics.field1802.method3611(arg0.field772) / 2;
                field306[field523] = Statics.field1802.field3088;
                field360[field523] = field370;
                field376[field523] = field534;
                field413[field523] = arg0.field778;
                field484[field523] = arg0.field779;
                field387[field523] = arg0.field819;
                field367[field523] = arg0.field772;
                field523++;
            }
        }
        if (arg0.field794 > field423) {
            Statics.method2792(arg0, arg0.field810 + 15);
            if (field370 > -1) {
                int var10;
                if (arg1 < field386) {
                    var10 = 30;
                } else {
                    class37 var11 = ((class32) arg0).field729;
                    var10 = var11.field829;
                }
                int var12 = arg0.field773 * var10 / arg0.field785;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field773 > 0) {
                    var12 = 1;
                }
                class75.method1575(field370 + arg2 - var10 / 2, field534 + arg3 - 3, var12, 5, 65280);
                class75.method1575(field370 + arg2 - var10 / 2 + var12, field534 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field782[var13] > field423) {
                Statics.method2792(arg0, arg0.field810 / 2);
                if (field370 > -1) {
                    if (var13 == 1) {
                        field534 -= 20;
                    }
                    if (var13 == 2) {
                        field370 -= 15;
                        field534 -= 10;
                    }
                    if (var13 == 3) {
                        field370 += 15;
                        field534 -= 10;
                    }
                    Statics.field1948[arg0.field786[var13]].method1459(field370 + arg2 - 12, field534 + arg3 - 12);
                    Statics.field1960.method3667(Integer.toString(arg0.field783[var13]), field370 + arg2 - 1, field534 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("au.ak(IIIB)V")
    public static final void method608(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field370 = -1;
            field534 = -1;
            return;
        }
        int var3 = method2468(arg0, arg1, Statics.field991) - arg2;
        int var4 = arg0 - Statics.field1829;
        int var5 = var3 - Statics.field2210;
        int var6 = arg1 - Statics.field1147;
        int var7 = class86.field1510[Statics.field13];
        int var8 = class86.field1501[Statics.field13];
        int var9 = class86.field1510[Statics.field1971];
        int var10 = class86.field1501[Statics.field1971];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field370 = field536 * var11 / var15 + field441 / 2;
            field534 = field536 * var14 / var15 + field316 / 2;
        } else {
            field370 = -1;
            field534 = -1;
        }
    }

    @ObfuscatedName("dd.ad(IIIS)I")
    public static final int method2468(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field71[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field89[var5][var3][var4] + class6.field89[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field89[var5][var3][var4 + 1] + class6.field89[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("m.bf(IIIIII)V")
    public static final void method498(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field229 == arg0 && Statics.field2839 == arg1 && field464 == arg2 || !field267) {
            return;
        }
        Statics.field229 = arg0;
        Statics.field2839 = arg1;
        field464 = arg2;
        if (!field267) {
            field464 = 0;
        }
        method165(25);
        Statics.method2869(class148.field2432, true);
        int var5 = Statics.field2052;
        int var6 = Statics.field613;
        Statics.field2052 = (arg0 - 6) * 8;
        Statics.field613 = (arg1 - 6) * 8;
        int var7 = Statics.field2052 - var5;
        int var8 = Statics.field613 - var6;
        int var9 = Statics.field2052;
        int var10 = Statics.field613;
        for (int var11 = 0; var11 < 32768; var11++) {
            class32 var12 = field365[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field815[var13] -= var7;
                    var12.field816[var13] -= var8;
                }
                var12.field802 -= var7 * 128;
                var12.field762 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field385[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field815[var16] -= var7;
                    var15.field816[var16] -= var8;
                }
                var15.field802 -= var7 * 128;
                var15.field762 -= var8 * 128;
            }
        }
        Statics.field991 = arg2;
        Statics.field2098.method657(arg3, arg4, false);
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
                        field400[var27][var23][var24] = field400[var27][var25][var26];
                    } else {
                        field400[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field401.method3396(); var28 != null; var28 = (class16) field401.method3398()) {
            var28.field222 -= var7;
            var28.field223 -= var8;
            if (var28.field222 < 0 || var28.field223 < 0 || var28.field222 >= 104 || var28.field223 >= 104) {
                var28.method3482();
            }
        }
        if (field504 != 0) {
            field504 -= var7;
            field282 -= var8;
        }
        field512 = 0;
        field518 = false;
        field336 = -1;
        field403.method3406();
        field402.method3406();
    }

    @ObfuscatedName("z.bn(ZB)V")
    public static final void method76(boolean arg0) {
        method2597();
        field310++;
        if (field310 < 50 && !arg0) {
            return;
        }
        field310 = 0;
        if (field315 || Statics.field113 == null) {
            return;
        }
        field284.method2429(2);
        try {
            Statics.field113.method2649(field284.field1897, 0, field284.field1902);
            field284.field1902 = 0;
        } catch (IOException var2) {
            field315 = true;
        }
    }

    @ObfuscatedName("du.ba(B)V")
    public static final void method2536() {
        method76(false);
        field317 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field59.length; var1++) {
            if (Statics.field654[var1] != -1 && Statics.field59[var1] == null) {
                Statics.field59[var1] = Statics.field16.method2874(Statics.field654[var1], 0);
                if (Statics.field59[var1] == null) {
                    var0 = false;
                    field317++;
                }
            }
            if (Statics.field125[var1] != -1 && Statics.field207[var1] == null) {
                Statics.field207[var1] = Statics.field16.method2945(Statics.field125[var1], 0, Statics.field122[var1]);
                if (Statics.field207[var1] == null) {
                    var0 = false;
                    field317++;
                }
            }
        }
        if (!var0) {
            field321 = 1;
            return;
        }
        field319 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field59.length; var3++) {
            byte[] var4 = Statics.field207[var3];
            if (var4 != null) {
                int var5 = (Statics.field1968[var3] >> 8) * 64 - Statics.field2052;
                int var6 = (Statics.field1968[var3] & 0xFF) * 64 - Statics.field613;
                if (field453) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class111 var9 = new class111(var4);
                int var10 = -1;
                label493: while (true) {
                    int var11 = var9.method2173();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2173();
                            if (var16 == 0) {
                                continue label493;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2205() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class38 var22 = class38.method167(var10);
                                if (var19 != 22 || !field267 || var22.field890 != 0 || var22.field917 == 1 || var22.field909) {
                                    if (!var22.method712()) {
                                        field319++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2173();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2205();
                    }
                }
            }
        }
        if (!var2) {
            field321 = 2;
            return;
        }
        if (field321 != 0) {
            Statics.method2869(class148.field2432 + class2.field24 + class2.field33 + 100 + "%" + class2.field22, true);
        }
        method2597();
        method152();
        method2597();
        Statics.field1939.method1686();
        method2597();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field322[var23].method3741();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field71[var24][var25][var26] = 0;
                }
            }
        }
        method2597();
        class6.field72 = 99;
        Statics.field92 = new byte[4][104][104];
        Statics.field74 = new byte[4][104][104];
        Statics.field78 = new byte[4][104][104];
        Statics.field649 = new byte[4][104][104];
        Statics.field931 = new int[4][105][105];
        Statics.field76 = new byte[4][105][105];
        Statics.field77 = new int[105][105];
        Statics.field921 = new int[104];
        Statics.field1098 = new int[104];
        Statics.field1979 = new int[104];
        Statics.field2057 = new int[104];
        Statics.field2824 = new int[104];
        int var27 = Statics.field59.length;
        class22.method656();
        method76(true);
        if (!field453) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field1968[var28] >> 8) * 64 - Statics.field2052;
                int var30 = (Statics.field1968[var28] & 0xFF) * 64 - Statics.field613;
                byte[] var31 = Statics.field59[var28];
                if (var31 != null) {
                    method2597();
                    class6.method1364(var31, var29, var30, Statics.field229 * 8 - 48, Statics.field2839 * 8 - 48, field322);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field1968[var32] >> 8) * 64 - Statics.field2052;
                int var34 = (Statics.field1968[var32] & 0xFF) * 64 - Statics.field613;
                byte[] var35 = Statics.field59[var32];
                if (var35 == null && Statics.field2839 < 800) {
                    method2597();
                    class6.method962(var33, var34, 64, 64);
                }
            }
            method76(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field207[var36];
                if (var37 != null) {
                    int var38 = (Statics.field1968[var36] >> 8) * 64 - Statics.field2052;
                    int var39 = (Statics.field1968[var36] & 0xFF) * 64 - Statics.field613;
                    method2597();
                    class6.method642(var37, var38, var39, Statics.field1939, field322);
                }
            }
        }
        if (field453) {
            for (int var40 = 0; var40 < 4; var40++) {
                method2597();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        boolean var43 = false;
                        int var44 = field324[var40][var41][var42];
                        if (var44 != -1) {
                            int var45 = var44 >> 24 & 0x3;
                            int var46 = var44 >> 1 & 0x3;
                            int var47 = var44 >> 14 & 0x3FF;
                            int var48 = var44 >> 3 & 0x7FF;
                            int var49 = (var47 / 8 << 8) + var48 / 8;
                            for (int var50 = 0; var50 < Statics.field1968.length; var50++) {
                                if (Statics.field1968[var50] == var49 && Statics.field59[var50] != null) {
                                    class6.method2093(Statics.field59[var50], var40, var41 * 8, var42 * 8, var45, (var47 & 0x7) * 8, (var48 & 0x7) * 8, var46, field322);
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var43) {
                            int var51 = var40;
                            int var52 = var41 * 8;
                            int var53 = var42 * 8;
                            for (int var54 = 0; var54 < 8; var54++) {
                                for (int var55 = 0; var55 < 8; var55++) {
                                    class6.field89[var51][var52 + var54][var53 + var55] = 0;
                                }
                            }
                            if (var52 > 0) {
                                for (int var56 = 1; var56 < 8; var56++) {
                                    class6.field89[var51][var52][var53 + var56] = class6.field89[var51][var52 - 1][var53 + var56];
                                }
                            }
                            if (var53 > 0) {
                                for (int var57 = 1; var57 < 8; var57++) {
                                    class6.field89[var51][var52 + var57][var53] = class6.field89[var51][var52 + var57][var53 - 1];
                                }
                            }
                            if (var52 > 0 && class6.field89[var51][var52 - 1][var53] != 0) {
                                class6.field89[var51][var52][var53] = class6.field89[var51][var52 - 1][var53];
                            } else if (var53 > 0 && class6.field89[var51][var52][var53 - 1] != 0) {
                                class6.field89[var51][var52][var53] = class6.field89[var51][var52][var53 - 1];
                            } else if (var52 > 0 && var53 > 0 && class6.field89[var51][var52 - 1][var53 - 1] != 0) {
                                class6.field89[var51][var52][var53] = class6.field89[var51][var52 - 1][var53 - 1];
                            }
                        }
                    }
                }
            }
            for (int var58 = 0; var58 < 13; var58++) {
                for (int var59 = 0; var59 < 13; var59++) {
                    int var60 = field324[0][var58][var59];
                    if (var60 == -1) {
                        class6.method962(var58 * 8, var59 * 8, 8, 8);
                    }
                }
            }
            method76(true);
            for (int var61 = 0; var61 < 4; var61++) {
                method2597();
                for (int var62 = 0; var62 < 13; var62++) {
                    label334: for (int var63 = 0; var63 < 13; var63++) {
                        int var64 = field324[var61][var62][var63];
                        if (var64 != -1) {
                            int var65 = var64 >> 24 & 0x3;
                            int var66 = var64 >> 1 & 0x3;
                            int var67 = var64 >> 14 & 0x3FF;
                            int var68 = var64 >> 3 & 0x7FF;
                            int var69 = (var67 / 8 << 8) + var68 / 8;
                            for (int var70 = 0; var70 < Statics.field1968.length; var70++) {
                                if (Statics.field1968[var70] == var69 && Statics.field207[var70] != null) {
                                    byte[] var71 = Statics.field207[var70];
                                    int var72 = var62 * 8;
                                    int var73 = var63 * 8;
                                    int var74 = (var67 & 0x7) * 8;
                                    int var75 = (var68 & 0x7) * 8;
                                    class81 var76 = Statics.field1939;
                                    class220[] var77 = field322;
                                    class111 var78 = new class111(var71);
                                    int var79 = -1;
                                    while (true) {
                                        int var80 = var78.method2173();
                                        if (var80 == 0) {
                                            continue label334;
                                        }
                                        var79 += var80;
                                        int var81 = 0;
                                        while (true) {
                                            int var82 = var78.method2173();
                                            if (var82 == 0) {
                                                break;
                                            }
                                            var81 += var82 - 1;
                                            int var83 = var81 & 0x3F;
                                            int var84 = var81 >> 6 & 0x3F;
                                            int var85 = var81 >> 12;
                                            int var86 = var78.method2205();
                                            int var87 = var86 >> 2;
                                            int var88 = var86 & 0x3;
                                            if (var65 == var85 && var84 >= var74 && var84 < var74 + 8 && var83 >= var75 && var83 < var75 + 8) {
                                                class38 var89 = class38.method167(var79);
                                                int var90 = var72 + class168.method1807(var84 & 0x7, var83 & 0x7, var66, var89.field886, var89.field887, var88);
                                                int var92 = var84 & 0x7;
                                                int var93 = var83 & 0x7;
                                                int var95 = var89.field886;
                                                int var96 = var89.field887;
                                                if ((var88 & 0x1) == 1) {
                                                    int var97 = var95;
                                                    var95 = var96;
                                                    var96 = var97;
                                                }
                                                int var98 = var66 & 0x3;
                                                int var99;
                                                if (var98 == 0) {
                                                    var99 = var93;
                                                } else if (var98 == 1) {
                                                    var99 = 7 - var92 - (var95 - 1);
                                                } else if (var98 == 2) {
                                                    var99 = 7 - var93 - (var96 - 1);
                                                } else {
                                                    var99 = var92;
                                                }
                                                int var100 = var73 + var99;
                                                if (var90 > 0 && var100 > 0 && var90 < 103 && var100 < 103) {
                                                    int var101 = var61;
                                                    if ((class6.field71[1][var90][var100] & 0x2) == 2) {
                                                        var101 = var61 - 1;
                                                    }
                                                    class220 var102 = null;
                                                    if (var101 >= 0) {
                                                        var102 = var77[var101];
                                                    }
                                                    class6.method11(var61, var90, var100, var79, var66 + var88 & 0x3, var87, var76, var102);
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
        method76(true);
        method152();
        method2597();
        class6.method510(Statics.field1939, field322);
        method76(true);
        int var103 = class6.field72;
        if (var103 > Statics.field991) {
            var103 = Statics.field991;
        }
        if (var103 < Statics.field991 - 1) {
            int var104 = Statics.field991 - 1;
        }
        if (field267) {
            Statics.field1939.method1638(class6.field72);
        } else {
            Statics.field1939.method1638(0);
        }
        for (int var105 = 0; var105 < 104; var105++) {
            for (int var106 = 0; var106 < 104; var106++) {
                method704(var105, var106);
            }
        }
        method2597();
        for (class16 var107 = (class16) field401.method3396(); var107 != null; var107 = (class16) field401.method3398()) {
            if (var107.field231 == -1) {
                var107.field230 = 0;
                method493(var107);
            } else {
                var107.method3482();
            }
        }
        class38.field874.method3333();
        if (Statics.field2058 != null) {
            field284.method2429(184);
            field284.method2148(1057001181);
        }
        if (!field453) {
            int var108 = (Statics.field229 - 6) / 8;
            int var109 = (Statics.field229 + 6) / 8;
            int var110 = (Statics.field2839 - 6) / 8;
            int var111 = (Statics.field2839 + 6) / 8;
            for (int var112 = var108 - 1; var112 <= var109 + 1; var112++) {
                for (int var113 = var110 - 1; var113 <= var111 + 1; var113++) {
                    if (var112 < var108 || var112 > var109 || var113 < var110 || var113 > var111) {
                        Statics.field16.method2901("m" + var112 + "_" + var113);
                        Statics.field16.method2901("l" + var112 + "_" + var113);
                    }
                }
            }
        }
        method165(30);
        method2597();
        Statics.field92 = (byte[][][]) null;
        Statics.field74 = (byte[][][]) null;
        Statics.field78 = (byte[][][]) null;
        Statics.field649 = (byte[][][]) null;
        Statics.field931 = (int[][][]) null;
        Statics.field76 = (byte[][][]) null;
        Statics.field77 = (int[][]) null;
        Statics.field921 = null;
        Statics.field1098 = null;
        Statics.field1979 = null;
        Statics.field2057 = null;
        Statics.field2824 = null;
        field284.method2429(217);
        class136.method124();
    }

    @ObfuscatedName("b.bj(IIIIII)V")
    public static final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1939.method1645(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1939.method1667(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1120.field1332;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class38 var13 = class38.method167(var12);
            if (var13.field907 == -1) {
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
                class76 var14 = Statics.field357[var13.field907];
                if (var14 != null) {
                    int var15 = (var13.field886 * 4 - var14.field1348) / 2;
                    int var16 = (var13.field887 * 4 - var14.field1351) / 2;
                    var14.method1613(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field887) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1939.method1665(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1939.method1667(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class38 var22 = class38.method167(var21);
            if (var22.field907 != -1) {
                class76 var23 = Statics.field357[var22.field907];
                if (var23 != null) {
                    int var24 = (var22.field886 * 4 - var23.field1348) / 2;
                    int var25 = (var22.field887 * 4 - var23.field1351) / 2;
                    var23.method1613(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field887) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1120.field1332;
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
        int var29 = Statics.field1939.method1666(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class38 var31 = class38.method167(var30);
        if (var31.field907 == -1) {
            return;
        }
        class76 var32 = Statics.field357[var31.field907];
        if (var32 != null) {
            int var33 = (var31.field886 * 4 - var32.field1348) / 2;
            int var34 = (var31.field887 * 4 - var32.field1351) / 2;
            var32.method1613(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field887) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("eo.bc(I)V")
    public static final void method2663() {
        if (field399 == 72) {
            int var0 = field524.method2205();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2922;
            int var2 = (var0 & 0x7) + Statics.field1931;
            int var3 = field524.method2186();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field325[var4];
            int var7 = field524.method2195();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method860(Statics.field991, var1, var2, var6, var7, var4, var5, 0, -1);
            }
            return;
        }
        if (field399 == 10) {
            int var8 = field524.method2205();
            int var9 = (var8 >> 4 & 0x7) + Statics.field2922;
            int var10 = (var8 & 0x7) + Statics.field1931;
            int var11 = field524.method2339();
            int var12 = field524.method2205();
            int var13 = var12 >> 4 & 0xF;
            int var14 = var12 & 0x7;
            int var15 = field524.method2205();
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                int var16 = var13 + 1;
                if (Statics.field2098.field815[0] >= var9 - var16 && Statics.field2098.field815[0] <= var9 + var16 && Statics.field2098.field816[0] >= var10 - var16 && Statics.field2098.field816[0] <= var10 + var16 && field290 != 0 && var14 > 0 && field512 < 50) {
                    field513[field512] = var11;
                    field514[field512] = var14;
                    field515[field512] = var15;
                    field339[field512] = null;
                    field516[field512] = (var9 << 16) + (var10 << 8) + var13;
                    field512++;
                }
            }
        }
        if (field399 == 175) {
            int var17 = field524.method2205();
            int var18 = (var17 >> 4 & 0x7) + Statics.field2922;
            int var19 = (var17 & 0x7) + Statics.field1931;
            int var20 = field524.method2339();
            int var21 = field524.method2205();
            int var22 = field524.method2339();
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                int var23 = var18 * 128 + 64;
                int var24 = var19 * 128 + 64;
                class28 var25 = new class28(var20, Statics.field991, var23, var24, method2468(var23, var24, Statics.field991) - var21, var22, field423);
                field403.method3391(var25);
            }
        } else if (field399 == 210) {
            int var26 = field524.method2205();
            int var27 = var26 >> 2;
            int var28 = var26 & 0x3;
            int var29 = field325[var27];
            int var30 = field524.method2187();
            int var31 = (var30 >> 4 & 0x7) + Statics.field2922;
            int var32 = (var30 & 0x7) + Statics.field1931;
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                method860(Statics.field991, var31, var32, var29, -1, var27, var28, 0, -1);
            }
        } else if (field399 == 24) {
            int var33 = field524.method2205();
            int var34 = (var33 >> 4 & 0x7) + Statics.field2922;
            int var35 = (var33 & 0x7) + Statics.field1931;
            int var36 = field524.method2195();
            int var37 = field524.method2186();
            int var38 = var37 >> 2;
            int var39 = var37 & 0x3;
            int var40 = field325[var38];
            if (var34 >= 0 && var35 >= 0 && var34 < 103 && var35 < 103) {
                if (var40 == 0) {
                    class82 var41 = Statics.field1939.method1659(Statics.field991, var34, var35);
                    if (var41 != null) {
                        int var42 = var41.field1453 >> 14 & 0x7FFF;
                        if (var38 == 2) {
                            var41.field1457 = new class12(var42, 2, var39 + 4, Statics.field991, var34, var35, var36, false, var41.field1457);
                            var41.field1452 = new class12(var42, 2, var39 + 1 & 0x3, Statics.field991, var34, var35, var36, false, var41.field1452);
                        } else {
                            var41.field1457 = new class12(var42, var38, var39, Statics.field991, var34, var35, var36, false, var41.field1457);
                        }
                    }
                }
                if (var40 == 1) {
                    class89 var43 = Statics.field1939.method1740(Statics.field991, var34, var35);
                    if (var43 != null) {
                        int var44 = var43.field1531 >> 14 & 0x7FFF;
                        if (var38 == 4 || var38 == 5) {
                            var43.field1529 = new class12(var44, 4, var39, Statics.field991, var34, var35, var36, false, var43.field1529);
                        } else if (var38 == 6) {
                            var43.field1529 = new class12(var44, 4, var39 + 4, Statics.field991, var34, var35, var36, false, var43.field1529);
                        } else if (var38 == 7) {
                            var43.field1529 = new class12(var44, 4, (var39 + 2 & 0x3) + 4, Statics.field991, var34, var35, var36, false, var43.field1529);
                        } else if (var38 == 8) {
                            var43.field1529 = new class12(var44, 4, var39 + 4, Statics.field991, var34, var35, var36, false, var43.field1529);
                            var43.field1530 = new class12(var44, 4, (var39 + 2 & 0x3) + 4, Statics.field991, var34, var35, var36, false, var43.field1530);
                        }
                    }
                }
                if (var40 == 2) {
                    class93 var45 = Statics.field1939.method1661(Statics.field991, var34, var35);
                    if (var38 == 11) {
                        var38 = 10;
                    }
                    if (var45 != null) {
                        var45.field1591 = new class12(var45.field1596 >> 14 & 0x7FFF, var38, var39, Statics.field991, var34, var35, var36, false, var45.field1591);
                    }
                }
                if (var40 == 3) {
                    class88 var46 = Statics.field1939.method1662(Statics.field991, var34, var35);
                    if (var46 != null) {
                        var46.field1515 = new class12(var46.field1512 >> 14 & 0x7FFF, 22, var39, Statics.field991, var34, var35, var36, false, var46.field1515);
                    }
                }
            }
        } else if (field399 == 192) {
            int var47 = field524.method2205();
            int var48 = (var47 >> 4 & 0x7) + Statics.field2922;
            int var49 = (var47 & 0x7) + Statics.field1931;
            int var50 = field524.method2339();
            int var51 = field524.method2339();
            int var52 = field524.method2339();
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                class190 var53 = field400[Statics.field991][var48][var49];
                if (var53 != null) {
                    for (class27 var54 = (class27) var53.method3396(); var54 != null; var54 = (class27) var53.method3398()) {
                        if ((var50 & 0x7FFF) == var54.field662 && var54.field658 == var51) {
                            var54.field658 = var52;
                            break;
                        }
                    }
                    method704(var48, var49);
                }
            }
        } else {
            if (field399 == 195) {
                byte var55 = field524.method2189();
                int var56 = field524.method2186();
                int var57 = var56 >> 2;
                int var58 = var56 & 0x3;
                int var59 = field325[var57];
                int var60 = field524.method2339();
                byte var61 = field524.method2365();
                byte var62 = field524.method2365();
                int var63 = field524.method2186();
                int var64 = (var63 >> 4 & 0x7) + Statics.field2922;
                int var65 = (var63 & 0x7) + Statics.field1931;
                int var66 = field524.method2193();
                int var67 = field524.method2194();
                int var68 = field524.method2193();
                byte var69 = field524.method2365();
                class3 var70;
                if (field312 == var68) {
                    var70 = Statics.field2098;
                } else {
                    var70 = field385[var68];
                }
                if (var70 != null) {
                    class38 var71 = class38.method167(var60);
                    int var72;
                    int var73;
                    if (var58 == 1 || var58 == 3) {
                        var72 = var71.field887;
                        var73 = var71.field886;
                    } else {
                        var72 = var71.field886;
                        var73 = var71.field887;
                    }
                    int var74 = (var72 >> 1) + var64;
                    int var75 = (var72 + 1 >> 1) + var64;
                    int var76 = (var73 >> 1) + var65;
                    int var77 = (var73 + 1 >> 1) + var65;
                    int[][] var78 = class6.field89[Statics.field991];
                    int var79 = var78[var74][var76] + var78[var75][var76] + var78[var74][var77] + var78[var75][var77] >> 2;
                    int var80 = (var64 << 7) + (var72 << 6);
                    int var81 = (var65 << 7) + (var73 << 6);
                    class100 var82 = var71.method714(var57, var58, var78, var80, var79, var81);
                    if (var82 != null) {
                        method860(Statics.field991, var64, var65, var59, -1, 0, 0, var66 + 1, var67 + 1);
                        var70.field41 = field423 + var66;
                        var70.field47 = field423 + var67;
                        var70.field42 = var82;
                        var70.field44 = var64 * 128 + var72 * 64;
                        var70.field51 = var65 * 128 + var73 * 64;
                        var70.field45 = var79;
                        if (var69 > var62) {
                            byte var83 = var69;
                            var69 = var62;
                            var62 = var83;
                        }
                        if (var61 > var55) {
                            byte var84 = var61;
                            var61 = var55;
                            var55 = var84;
                        }
                        var70.field48 = var64 + var69;
                        var70.field50 = var62 + var64;
                        var70.field37 = var61 + var65;
                        var70.field46 = var55 + var65;
                    }
                }
            }
            if (field399 == 251) {
                int var85 = field524.method2205();
                int var86 = (var85 >> 4 & 0x7) + Statics.field2922;
                int var87 = (var85 & 0x7) + Statics.field1931;
                int var88 = var86 + field524.method2199();
                int var89 = var87 + field524.method2199();
                int var90 = field524.method2163();
                int var91 = field524.method2339();
                int var92 = field524.method2205() * 4;
                int var93 = field524.method2205() * 4;
                int var94 = field524.method2339();
                int var95 = field524.method2339();
                int var96 = field524.method2205();
                int var97 = field524.method2205();
                if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104 && var91 != 65535) {
                    int var98 = var86 * 128 + 64;
                    int var99 = var87 * 128 + 64;
                    int var100 = var88 * 128 + 64;
                    int var101 = var89 * 128 + 64;
                    class7 var102 = new class7(var91, Statics.field991, var98, var99, method2468(var98, var99, Statics.field991) - var92, field423 + var94, field423 + var95, var96, var97, var90, var93);
                    var102.method68(var100, var101, method2468(var100, var101, Statics.field991) - var93, field423 + var94);
                    field402.method3391(var102);
                }
            } else if (field399 == 123) {
                int var103 = field524.method2205();
                int var104 = (var103 >> 4 & 0x7) + Statics.field2922;
                int var105 = (var103 & 0x7) + Statics.field1931;
                int var106 = field524.method2339();
                if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                    class190 var107 = field400[Statics.field991][var104][var105];
                    if (var107 != null) {
                        for (class27 var108 = (class27) var107.method3396(); var108 != null; var108 = (class27) var107.method3398()) {
                            if ((var106 & 0x7FFF) == var108.field662) {
                                var108.method3482();
                                break;
                            }
                        }
                        if (var107.method3396() == null) {
                            field400[Statics.field991][var104][var105] = null;
                        }
                        method704(var104, var105);
                    }
                }
            } else if (field399 == 68) {
                int var109 = field524.method2187();
                int var110 = (var109 >> 4 & 0x7) + Statics.field2922;
                int var111 = (var109 & 0x7) + Statics.field1931;
                int var112 = field524.method2193();
                int var113 = field524.method2195();
                if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                    class27 var114 = new class27();
                    var114.field662 = var113;
                    var114.field658 = var112;
                    if (field400[Statics.field991][var110][var111] == null) {
                        field400[Statics.field991][var110][var111] = new class190();
                    }
                    field400[Statics.field991][var110][var111].method3391(var114);
                    method704(var110, var111);
                }
            }
        }
    }

    @ObfuscatedName("al.bh(IIIIIIIIII)V")
    public static final void method860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field401.method3396(); var10 != null; var10 = (class16) field401.method3398()) {
            if (var10.field232 == arg0 && var10.field222 == arg1 && var10.field223 == arg2 && var10.field221 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field232 = arg0;
            var9.field221 = arg3;
            var9.field222 = arg1;
            var9.field223 = arg2;
            method493(var9);
            field401.method3391(var9);
        }
        var9.field226 = arg4;
        var9.field228 = arg5;
        var9.field234 = arg6;
        var9.field230 = arg7;
        var9.field231 = arg8;
    }

    @ObfuscatedName("x.bd(Ls;B)V")
    public static final void method493(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field221 == 0) {
            var1 = Statics.field1939.method1645(arg0.field232, arg0.field222, arg0.field223);
        }
        if (arg0.field221 == 1) {
            var1 = Statics.field1939.method1664(arg0.field232, arg0.field222, arg0.field223);
        }
        if (arg0.field221 == 2) {
            var1 = Statics.field1939.method1665(arg0.field232, arg0.field222, arg0.field223);
        }
        if (arg0.field221 == 3) {
            var1 = Statics.field1939.method1666(arg0.field232, arg0.field222, arg0.field223);
        }
        if (var1 != 0) {
            int var5 = Statics.field1939.method1667(arg0.field232, arg0.field222, arg0.field223, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field224 = var2;
        arg0.field220 = var3;
        arg0.field225 = var4;
    }

    @ObfuscatedName("eh.by(I)V")
    public static final void method2633() {
        for (class16 var0 = (class16) field401.method3396(); var0 != null; var0 = (class16) field401.method3398()) {
            if (var0.field231 > 0) {
                var0.field231--;
            }
            if (var0.field231 == 0) {
                if (var0.field224 >= 0) {
                    int var1 = var0.field224;
                    int var2 = var0.field220;
                    class38 var3 = class38.method167(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method711(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method15(var0.field232, var0.field221, var0.field222, var0.field223, var0.field224, var0.field225, var0.field220);
                var0.method3482();
            } else {
                if (var0.field230 > 0) {
                    var0.field230--;
                }
                if (var0.field230 == 0 && var0.field222 >= 1 && var0.field223 >= 1 && var0.field222 <= 102 && var0.field223 <= 102) {
                    if (var0.field226 >= 0) {
                        int var5 = var0.field226;
                        int var6 = var0.field228;
                        class38 var7 = class38.method167(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method711(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method15(var0.field232, var0.field221, var0.field222, var0.field223, var0.field226, var0.field234, var0.field228);
                    var0.field230 = -1;
                    if (var0.field226 == var0.field224 && var0.field224 == -1) {
                        var0.method3482();
                    } else if (var0.field226 == var0.field224 && var0.field234 == var0.field225 && var0.field228 == var0.field220) {
                        var0.method3482();
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.bk(IIIIIIIB)V")
    public static final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field267 && Statics.field991 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1939.method1645(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1939.method1664(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1939.method1665(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1939.method1666(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1939.method1667(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1939.method1654(arg0, arg2, arg3);
                class38 var15 = class38.method167(var12);
                if (var15.field917 != 0) {
                    field322[arg0].method3747(arg2, arg3, var13, var14, var15.field893);
                }
            }
            if (arg1 == 1) {
                Statics.field1939.method1655(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1939.method1675(arg0, arg2, arg3);
                class38 var16 = class38.method167(var12);
                if (var16.field886 + arg2 > 103 || var16.field886 + arg3 > 103 || var16.field887 + arg2 > 103 || var16.field887 + arg3 > 103) {
                    return;
                }
                if (var16.field917 != 0) {
                    field322[arg0].method3752(arg2, arg3, var16.field886, var16.field887, var14, var16.field893);
                }
            }
            if (arg1 == 3) {
                Statics.field1939.method1657(arg0, arg2, arg3);
                class38 var17 = class38.method167(var12);
                if (var17.field917 == 1) {
                    field322[arg0].method3750(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field71[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class81 var19 = Statics.field1939;
        class220 var20 = field322[arg0];
        class38 var21 = class38.method167(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field887;
            var23 = var21.field886;
        } else {
            var22 = var21.field886;
            var23 = var21.field887;
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
        int[][] var28 = class6.field89[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field890 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field911 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class80 var34;
            if (var21.field870 == -1 && var21.field894 == null) {
                var34 = var21.method714(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class12(arg4, 22, arg5, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1643(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field917 == 1) {
                var20.method3743(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class80 var57;
            if (var21.field870 == -1 && var21.field894 == null) {
                var57 = var21.method714(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class12(arg4, 10, arg5, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            if (var57 != null) {
                var19.method1720(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field917 != 0) {
                var20.method3760(arg2, arg3, var22, var23, var21.field893);
            }
        } else if (arg6 >= 12) {
            class80 var35;
            if (var21.field870 == -1 && var21.field894 == null) {
                var35 = var21.method714(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1720(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field917 != 0) {
                var20.method3760(arg2, arg3, var22, var23, var21.field893);
            }
        } else if (arg6 == 0) {
            class80 var36;
            if (var21.field870 == -1 && var21.field894 == null) {
                var36 = var21.method714(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class12(arg4, 0, arg5, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1695(arg0, arg2, arg3, var29, var36, (class80) null, class6.field93[arg5], 0, var32, var33);
            if (var21.field917 != 0) {
                var20.method3742(arg2, arg3, arg6, arg5, var21.field893);
            }
        } else if (arg6 == 1) {
            class80 var37;
            if (var21.field870 == -1 && var21.field894 == null) {
                var37 = var21.method714(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class12(arg4, 1, arg5, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1695(arg0, arg2, arg3, var29, var37, (class80) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field917 != 0) {
                var20.method3742(arg2, arg3, arg6, arg5, var21.field893);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class80 var39;
            class80 var40;
            if (var21.field870 == -1 && var21.field894 == null) {
                var39 = var21.method714(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method714(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class12(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field870, true, (class80) null);
                var40 = new class12(arg4, 2, var38, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1695(arg0, arg2, arg3, var29, var39, var40, class6.field93[arg5], class6.field93[var38], var32, var33);
            if (var21.field917 != 0) {
                var20.method3742(arg2, arg3, arg6, arg5, var21.field893);
            }
        } else if (arg6 == 3) {
            class80 var41;
            if (var21.field870 == -1 && var21.field894 == null) {
                var41 = var21.method714(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class12(arg4, 3, arg5, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1695(arg0, arg2, arg3, var29, var41, (class80) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field917 != 0) {
                var20.method3742(arg2, arg3, arg6, arg5, var21.field893);
            }
        } else if (arg6 == 9) {
            class80 var42;
            if (var21.field870 == -1 && var21.field894 == null) {
                var42 = var21.method714(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1720(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field917 != 0) {
                var20.method3760(arg2, arg3, var22, var23, var21.field893);
            }
        } else if (arg6 == 4) {
            class80 var43;
            if (var21.field870 == -1 && var21.field894 == null) {
                var43 = var21.method714(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1646(arg0, arg2, arg3, var29, var43, (class80) null, class6.field93[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1645(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class38.method167(var45 >> 14 & 0x7FFF).field895;
            }
            class80 var46;
            if (var21.field870 == -1 && var21.field894 == null) {
                var46 = var21.method714(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1646(arg0, arg2, arg3, var29, var46, (class80) null, class6.field93[arg5], 0, class6.field82[arg5] * var44, class6.field83[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1645(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class38.method167(var48 >> 14 & 0x7FFF).field895 / 2;
            }
            class80 var49;
            if (var21.field870 == -1 && var21.field894 == null) {
                var49 = var21.method714(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1646(arg0, arg2, arg3, var29, var49, (class80) null, 256, arg5, class6.field80[arg5] * var47, class6.field85[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class80 var51;
            if (var21.field870 == -1 && var21.field894 == null) {
                var51 = var21.method714(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class12(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1646(arg0, arg2, arg3, var29, var51, (class80) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1645(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class38.method167(var53 >> 14 & 0x7FFF).field895 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class80 var55;
            class80 var56;
            if (var21.field870 == -1 && var21.field894 == null) {
                var55 = var21.method714(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method714(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field870, true, (class80) null);
                var56 = new class12(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field870, true, (class80) null);
            }
            var19.method1646(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field80[arg5] * var52, class6.field85[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("as.bo(III)V")
    public static final void method704(int arg0, int arg1) {
        class190 var2 = field400[Statics.field991][arg0][arg1];
        if (var2 == null) {
            Statics.field1939.method1658(Statics.field991, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class27 var5 = null;
        for (class27 var6 = (class27) var2.method3396(); var6 != null; var6 = (class27) var2.method3398()) {
            class47 var7 = class47.method859(var6.field662);
            long var8 = (long) var7.field1061;
            if (var7.field1060 == 1) {
                var8 = (long) (var6.field658 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1939.method1658(Statics.field991, arg0, arg1);
            return;
        }
        var2.method3415(var5);
        class27 var10 = null;
        class27 var11 = null;
        for (class27 var12 = (class27) var2.method3396(); var12 != null; var12 = (class27) var2.method3398()) {
            if (var5.field662 != var12.field662) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field662 != var12.field662 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1939.method1644(Statics.field991, arg0, arg1, method2468(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field991), var5, var13, var10, var11);
    }

    @ObfuscatedName("dm.bi(I)V")
    public static final void method2098() {
        int var0 = field524.method2420(8);
        if (var0 < field386) {
            for (int var1 = var0; var1 < field386; var1++) {
                field355[++field500 - 1] = field482[var1];
            }
        }
        if (var0 > field386) {
            throw new RuntimeException("");
        }
        field386 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field482[var2];
            class3 var4 = field385[var3];
            int var5 = field524.method2420(1);
            if (var5 == 0) {
                field482[++field386 - 1] = var3;
                var4.field809 = field423;
            } else {
                int var6 = field524.method2420(2);
                if (var6 == 0) {
                    field482[++field386 - 1] = var3;
                    var4.field809 = field423;
                    field389[++field388 - 1] = var3;
                } else if (var6 == 1) {
                    field482[++field386 - 1] = var3;
                    var4.field809 = field423;
                    int var7 = field524.method2420(3);
                    var4.method662(var7, false);
                    int var8 = field524.method2420(1);
                    if (var8 == 1) {
                        field389[++field388 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field482[++field386 - 1] = var3;
                    var4.field809 = field423;
                    int var9 = field524.method2420(3);
                    var4.method662(var9, true);
                    int var10 = field524.method2420(3);
                    var4.method662(var10, true);
                    int var11 = field524.method2420(1);
                    if (var11 == 1) {
                        field389[++field388 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field355[++field500 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("as.be(S)V")
    public static final void method705() {
        for (int var0 = 0; var0 < field388; var0++) {
            int var1 = field389[var0];
            class3 var2 = field385[var1];
            int var3 = field524.method2205();
            if ((var3 & 0x40) != 0) {
                var3 += field524.method2205() << 8;
            }
            method1881(var1, var2, var3);
        }
    }

    @ObfuscatedName("cm.bq(ILg;II)V")
    public static final void method1881(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x80) != 0) {
            int var3 = field524.method2187();
            byte[] var4 = new byte[var3];
            class111 var5 = new class111(var4);
            field524.method2294(var4, 0, var3);
            field390[arg0] = var5;
            arg1.method25(var5);
        }
        if ((arg2 & 0x1) != 0) {
            int var6 = field524.method2194();
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = field524.method2187();
            method146(arg1, var6, var7);
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field764 = field524.method2195();
            if (arg1.field764 == 65535) {
                arg1.field764 = -1;
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field772 = field524.method2170();
            if (arg1.field772.charAt(0) == '~') {
                arg1.field772 = arg1.field772.substring(1);
                class11.method590(2, arg1.field49, arg1.field772);
            } else if (Statics.field2098 == arg1) {
                class11.method590(2, arg1.field49, arg1.field772);
            }
            arg1.field775 = false;
            arg1.field778 = 0;
            arg1.field779 = 0;
            arg1.field819 = 150;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field817 = field524.method2352();
            arg1.field804 = field524.method2205();
            arg1.field803 = field524.method2186();
            arg1.field774 = field524.method2186();
            arg1.field807 = field524.method2193() + field423;
            arg1.field761 = field524.method2194() + field423;
            arg1.field770 = field524.method2205();
            arg1.field780 = 1;
            arg1.field806 = 0;
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field797 = field524.method2195();
            int var8 = field524.method2165();
            arg1.field801 = var8 >> 16;
            arg1.field800 = (var8 & 0xFFFF) + field423;
            arg1.field798 = 0;
            arg1.field799 = 0;
            if (arg1.field800 > field423) {
                arg1.field798 = -1;
            }
            if (arg1.field797 == 65535) {
                arg1.field797 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var9 = field524.method2195();
            int var10 = field524.method2186();
            arg1.method661(var9, var10, field423);
            arg1.field794 = field423 + 300;
            arg1.field773 = field524.method2205();
            arg1.field785 = field524.method2352();
        }
        if ((arg2 & 0x100) != 0) {
            int var11 = field524.method2194();
            int var12 = field524.method2187();
            arg1.method661(var11, var12, field423);
            arg1.field794 = field423 + 300;
            arg1.field773 = field524.method2352();
            arg1.field785 = field524.method2186();
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field805 = field524.method2195();
            arg1.field788 = field524.method2195();
        }
        if ((arg2 & 0x4) == 0) {
            return;
        }
        int var13 = field524.method2339();
        class143 var14 = (class143) class101.method529(class143.method864(), field524.method2352());
        boolean var15 = field524.method2186() == 1;
        int var16 = field524.method2186();
        int var17 = field524.field1902;
        if (arg1.field49 != null && arg1.field36 != null) {
            boolean var18 = false;
            if (var14.field2175 && method2784(arg1.field49)) {
                var18 = true;
            }
            if (!var18 && field384 == 0 && !arg1.field54) {
                field435.field1902 = 0;
                field524.method2336(field435.field1897, 0, var16);
                field435.field1902 = 0;
                class111 var19 = field435;
                String var23;
                try {
                    int var20 = var19.method2173();
                    if (var20 > 32767) {
                        var20 = 32767;
                    }
                    byte[] var21 = new byte[var20];
                    var19.field1902 += Statics.field3082.method2087(var19.field1897, var19.field1902, var21, 0, var20);
                    String var22 = Statics.method29(var21, 0, var20);
                    var23 = var22;
                } catch (Exception var28) {
                    var23 = "Cabbage";
                }
                String var26 = class214.method3615(class154.method26(var23));
                arg1.field772 = var26.trim();
                arg1.field778 = var13 >> 8;
                arg1.field779 = var13 & 0xFF;
                arg1.field819 = 150;
                arg1.field775 = var15;
                arg1.field776 = Statics.field2098 != arg1 && var14.field2175 && field490 != "" && var26.toLowerCase().indexOf(field490) == -1;
                int var27;
                if (var14.field2182) {
                    var27 = var15 ? 91 : 1;
                } else {
                    var27 = var15 ? 90 : 2;
                }
                if (var14.field2181 == -1) {
                    class11.method590(var27, arg1.field49, var26);
                } else {
                    class11.method590(var27, class2.method1058(var14.field2181) + arg1.field49, var26);
                }
            }
        }
        field524.field1902 = var16 + var17;
    }

    @ObfuscatedName("at.bg(ZI)V")
    public static final void method668(boolean arg0) {
        field500 = 0;
        field388 = 0;
        method595();
        while (field524.method2423(field307) >= 27) {
            int var1 = field524.method2420(15);
            if (var1 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field365[var1] == null) {
                field365[var1] = new class32();
                var17 = true;
            }
            class32 var18 = field365[var1];
            field466[++field505 - 1] = var1;
            var18.field809 = field423;
            int var19 = field530[field524.method2420(3)];
            if (var17) {
                var18.field811 = var18.field763 = var19;
            }
            int var20 = field524.method2420(1);
            if (var20 == 1) {
                field389[++field388 - 1] = var1;
            }
            var18.field729 = class37.method2412(field524.method2420(14));
            int var21;
            if (arg0) {
                var21 = field524.method2420(8);
                if (var21 > 127) {
                    var21 -= 256;
                }
            } else {
                var21 = field524.method2420(5);
                if (var21 > 15) {
                    var21 -= 32;
                }
            }
            int var22;
            if (arg0) {
                var22 = field524.method2420(8);
                if (var22 > 127) {
                    var22 -= 256;
                }
            } else {
                var22 = field524.method2420(5);
                if (var22 > 15) {
                    var22 -= 32;
                }
            }
            int var23 = field524.method2420(1);
            var18.field808 = var18.field729.field849;
            var18.field813 = var18.field729.field858;
            if (var18.field813 == 0) {
                var18.field763 = 0;
            }
            var18.field769 = var18.field729.field841;
            var18.field787 = var18.field729.field833;
            var18.field771 = var18.field729.field863;
            var18.field820 = var18.field729.field844;
            var18.field766 = var18.field729.field838;
            var18.field814 = var18.field729.field839;
            var18.field768 = var18.field729.field861;
            var18.method657(Statics.field2098.field815[0] + var22, Statics.field2098.field816[0] + var21, var23 == 1);
        }
        field524.method2421();
        for (int var2 = 0; var2 < field388; var2++) {
            int var3 = field389[var2];
            class32 var4 = field365[var3];
            int var5 = field524.method2205();
            if ((var5 & 0x8) != 0) {
                var4.field805 = field524.method2193();
                var4.field788 = field524.method2195();
            }
            if ((var5 & 0x20) != 0) {
                var4.field797 = field524.method2195();
                int var6 = field524.method2204();
                var4.field801 = var6 >> 16;
                var4.field800 = (var6 & 0xFFFF) + field423;
                var4.field798 = 0;
                var4.field799 = 0;
                if (var4.field800 > field423) {
                    var4.field798 = -1;
                }
                if (var4.field797 == 65535) {
                    var4.field797 = -1;
                }
            }
            if ((var5 & 0x10) != 0) {
                int var7 = field524.method2352();
                int var8 = field524.method2186();
                var4.method661(var7, var8, field423);
                var4.field794 = field423 + 300;
                var4.field773 = field524.method2195();
                var4.field785 = field524.method2195();
            }
            if ((var5 & 0x40) != 0) {
                var4.field772 = field524.method2170();
                var4.field819 = 100;
            }
            if ((var5 & 0x2) != 0) {
                var4.field764 = field524.method2195();
                if (var4.field764 == 65535) {
                    var4.field764 = -1;
                }
            }
            if ((var5 & 0x4) != 0) {
                var4.field729 = class37.method2412(field524.method2339());
                var4.field808 = var4.field729.field849;
                var4.field813 = var4.field729.field858;
                var4.field769 = var4.field729.field841;
                var4.field787 = var4.field729.field833;
                var4.field771 = var4.field729.field863;
                var4.field820 = var4.field729.field844;
                var4.field766 = var4.field729.field838;
                var4.field814 = var4.field729.field839;
                var4.field768 = var4.field729.field861;
            }
            if ((var5 & 0x1) != 0) {
                int var9 = field524.method2186();
                int var10 = field524.method2186();
                var4.method661(var9, var10, field423);
                var4.field794 = field423 + 300;
                var4.field773 = field524.method2195();
                var4.field785 = field524.method2193();
            }
            if ((var5 & 0x80) != 0) {
                int var11 = field524.method2339();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = field524.method2186();
                if (var4.field777 == var11 && var11 != -1) {
                    int var13 = class40.method547(var11).field944;
                    if (var13 == 1) {
                        var4.field793 = 0;
                        var4.field767 = 0;
                        var4.field795 = var12;
                        var4.field796 = 0;
                    }
                    if (var13 == 2) {
                        var4.field796 = 0;
                    }
                } else if (var11 == -1 || var4.field777 == -1 || class40.method547(var11).field946 >= class40.method547(var4.field777).field946) {
                    var4.field777 = var11;
                    var4.field793 = 0;
                    var4.field767 = 0;
                    var4.field795 = var12;
                    var4.field796 = 0;
                    var4.field806 = var4.field780;
                }
            }
        }
        for (int var14 = 0; var14 < field500; var14++) {
            int var15 = field355[var14];
            if (field423 != field365[var15].field809) {
                field365[var15].field729 = null;
                field365[var15] = null;
            }
        }
        if (field307 != field524.field1902) {
            throw new RuntimeException(field524.field1902 + class2.field29 + field307);
        }
        for (int var16 = 0; var16 < field505; var16++) {
            if (field365[field466[var16]] == null) {
                throw new RuntimeException(var16 + class2.field29 + field505);
            }
        }
    }

    @ObfuscatedName("aj.bp(I)V")
    public static final void method595() {
        field524.method2422();
        int var0 = field524.method2420(8);
        if (var0 < field505) {
            for (int var1 = var0; var1 < field505; var1++) {
                field355[++field500 - 1] = field466[var1];
            }
        }
        if (var0 > field505) {
            throw new RuntimeException("");
        }
        field505 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field466[var2];
            class32 var4 = field365[var3];
            int var5 = field524.method2420(1);
            if (var5 == 0) {
                field466[++field505 - 1] = var3;
                var4.field809 = field423;
            } else {
                int var6 = field524.method2420(2);
                if (var6 == 0) {
                    field466[++field505 - 1] = var3;
                    var4.field809 = field423;
                    field389[++field388 - 1] = var3;
                } else if (var6 == 1) {
                    field466[++field505 - 1] = var3;
                    var4.field809 = field423;
                    int var7 = field524.method2420(3);
                    var4.method662(var7, false);
                    int var8 = field524.method2420(1);
                    if (var8 == 1) {
                        field389[++field388 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field466[++field505 - 1] = var3;
                    var4.field809 = field423;
                    int var9 = field524.method2420(3);
                    var4.method662(var9, true);
                    int var10 = field524.method2420(3);
                    var4.method662(var10, true);
                    int var11 = field524.method2420(1);
                    if (var11 == 1) {
                        field389[++field388 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field355[++field500 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("r.br(I)V")
    public static final void method153() {
        int var0 = Statics.field1843;
        int var1 = Statics.field758;
        int var2 = Statics.field2047;
        int var3 = Statics.field211;
        int var4 = 6116423;
        class75.method1575(var0, var1, var2, var3, var4);
        class75.method1575(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class75.method1557(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1802.method3616(class148.field2325, var0 + 3, var1 + 14, var4, -1);
        int var5 = class132.field2071;
        int var6 = class132.field2072 * 76101137;
        for (int var7 = 0; var7 < field320; var7++) {
            int var8 = (field320 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class215 var10 = Statics.field1802;
            String var11;
            if (field366[var7].length() > 0) {
                var11 = field414[var7] + class148.field2383 + field366[var7];
            } else {
                var11 = field414[var7];
            }
            var10.method3616(var11, var0 + 3, var8, var9, 0);
        }
        method895(Statics.field1843, Statics.field758, Statics.field2047, Statics.field211);
    }

    @ObfuscatedName("s.bl(IIIII)V")
    public static final void method150(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field472; var4++) {
            if (field479[var4] + field477[var4] > arg0 && field477[var4] < arg0 + arg2 && field519[var4] + field480[var4] > arg1 && field519[var4] < arg1 + arg3) {
                field474[var4] = true;
            }
        }
    }

    @ObfuscatedName("av.bu(IIIII)V")
    public static final void method895(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field472; var4++) {
            if (field479[var4] + field477[var4] > arg0 && field477[var4] < arg0 + arg2 && field519[var4] + field480[var4] > arg1 && field519[var4] < arg1 + arg3) {
                field475[var4] = true;
            }
        }
    }

    @ObfuscatedName("cj.bv(III)V")
    public static final void method1630(int arg0, int arg1) {
        int var2 = Statics.field1802.method3611(class148.field2325);
        for (int var3 = 0; var3 < field320; var3++) {
            class215 var4 = Statics.field1802;
            String var5;
            if (field366[var3].length() > 0) {
                var5 = field414[var3] + class148.field2383 + field366[var3];
            } else {
                var5 = field414[var3];
            }
            int var6 = var4.method3611(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field320 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field178) {
            var8 = Statics.field178 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2125) {
            var9 = Statics.field2125 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field408 = true;
        Statics.field1843 = var8;
        Statics.field758 = var9;
        Statics.field2047 = var2;
        Statics.field211 = field320 * 15 + 22;
    }

    @ObfuscatedName("i.bb(II)Z")
    public static final boolean method126(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field545[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("s.bs(IB)V")
    public static final void method142(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field347[arg0];
        int var2 = field411[arg0];
        int var3 = field545[arg0];
        int var4 = field433[arg0];
        String var5 = field414[arg0];
        String var6 = field366[arg0];
        method1982(var1, var2, var3, var4, var5, var6, class132.field2077, class132.field2079);
    }

    @ObfuscatedName("co.bz(Lah;IIS)V")
    public static final void method1991(class29 arg0, int arg1, int arg2) {
        method1982(arg0.field677, arg0.field680, arg0.field679, arg0.field684, arg0.field681, arg0.field681, arg1, arg2);
    }

    @ObfuscatedName("cx.bm(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1982(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1003) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            class32 var8 = field365[arg3];
            if (var8 != null) {
                class37 var9 = var8.field729;
                if (var9.field837 != null) {
                    var9 = var9.method678();
                }
                if (var9 != null) {
                    field284.method2429(38);
                    field284.method2228(var9.field843);
                }
            }
        }
        if (arg2 == 15) {
            class3 var10 = field385[arg3];
            if (var10 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(252);
                field284.method2320(field447);
                field284.method2184(class129.field2027[82] ? 1 : 0);
                field284.method2191(arg3);
                field284.method2148(Statics.field988);
            }
        }
        if (arg2 == 30 && field332 == null) {
            method75(arg1, arg0);
            field332 = class164.method2815(arg1, arg0);
            method147(field332);
        }
        if (arg2 == 2) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(74);
            field284.method2319(Statics.field613 + arg1);
            field284.method2148(Statics.field988);
            field284.method2320(field447);
            field284.method2320(Statics.field2052 + arg0);
            field284.method2184(class129.field2027[82] ? 1 : 0);
            field284.method2319(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 38) {
            method3006();
            class164 var11 = class164.method2744(arg1);
            field508 = 1;
            Statics.field2005 = arg0;
            Statics.field756 = arg1;
            Statics.field629 = arg3;
            method147(var11);
            field421 = class2.method2969(16748608) + class47.method859(arg3).field1049 + class2.method2969(16777215);
            if (field421 == null) {
                field421 = "null";
            }
            return;
        }
        if (arg2 == 13) {
            class32 var12 = field365[arg3];
            if (var12 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(178);
                field284.method2281(class129.field2027[82] ? 1 : 0);
                field284.method2191(arg3);
            }
        }
        if (arg2 == 49) {
            class3 var13 = field385[arg3];
            if (var13 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(222);
                field284.method2281(class129.field2027[82] ? 1 : 0);
                field284.method2319(arg3);
            }
        }
        if (arg2 == 47) {
            class3 var14 = field385[arg3];
            if (var14 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(244);
                field284.method2281(class129.field2027[82] ? 1 : 0);
                field284.method2191(arg3);
            }
        }
        if (arg2 == 26) {
            method13();
        }
        if (arg2 == 50) {
            class3 var15 = field385[arg3];
            if (var15 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(68);
                field284.method2191(arg3);
                field284.method2184(class129.field2027[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(152);
            field284.method2228(Statics.field2052 + arg0);
            field284.method2319(arg3 >> 14 & 0x7FFF);
            field284.method2228(Statics.field629);
            field284.method2184(class129.field2027[82] ? 1 : 0);
            field284.method2191(Statics.field2005);
            field284.method2319(Statics.field613 + arg1);
            field284.method2200(Statics.field756);
        }
        if (arg2 == 32) {
            field284.method2429(77);
            field284.method2319(arg3);
            field284.method2200(Statics.field988);
            field284.method2354(arg1);
            field284.method2319(field447);
            field284.method2191(arg0);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 46) {
            class3 var16 = field385[arg3];
            if (var16 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(237);
                field284.method2183(class129.field2027[82] ? 1 : 0);
                field284.method2191(arg3);
            }
        }
        if (arg2 == 1005) {
            class164 var17 = class164.method2744(arg1);
            if (var17 == null || var17.field2693[arg0] < 100000) {
                field284.method2429(144);
                field284.method2191(arg3);
            } else {
                class11.method590(27, "", var17.field2693[arg0] + " x " + class47.method859(arg3).field1049);
            }
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 29) {
            field284.method2429(166);
            field284.method2148(arg1);
            class164 var18 = class164.method2744(arg1);
            if (var18.field2774 != null && var18.field2774[0][0] == 5) {
                int var19 = var18.field2774[0][1];
                if (class167.field2816[var19] != var18.field2799[0]) {
                    class167.field2816[var19] = var18.field2799[0];
                    method125(var19);
                }
            }
        }
        if (arg2 == 12) {
            class32 var20 = field365[arg3];
            if (var20 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(105);
                field284.method2319(arg3);
                field284.method2183(class129.field2027[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(236);
            field284.method2228(arg3);
            field284.method2228(Statics.field2052 + arg0);
            field284.method2191(Statics.field629);
            field284.method2148(Statics.field756);
            field284.method2145(class129.field2027[82] ? 1 : 0);
            field284.method2320(Statics.field2005);
            field284.method2191(Statics.field613 + arg1);
        }
        if (arg2 == 48) {
            class3 var21 = field385[arg3];
            if (var21 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(232);
                field284.method2281(class129.field2027[82] ? 1 : 0);
                field284.method2319(arg3);
            }
        }
        if (arg2 == 44) {
            class3 var22 = field385[arg3];
            if (var22 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(49);
                field284.method2184(class129.field2027[82] ? 1 : 0);
                field284.method2319(arg3);
            }
        }
        if (arg2 == 6) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(110);
            field284.method2320(Statics.field613 + arg1);
            field284.method2145(class129.field2027[82] ? 1 : 0);
            field284.method2228(Statics.field2052 + arg0);
            field284.method2319(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1002) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field284.method2429(221);
            field284.method2228(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 20) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(64);
            field284.method2319(arg3);
            field284.method2281(class129.field2027[82] ? 1 : 0);
            field284.method2228(Statics.field2052 + arg0);
            field284.method2228(Statics.field613 + arg1);
        }
        if (arg2 == 24) {
            class164 var23 = class164.method2744(arg1);
            boolean var24 = true;
            if (var23.field2672 > 0) {
                var24 = Statics.method2080(var23);
            }
            if (var24) {
                field284.method2429(166);
                field284.method2148(arg1);
            }
        }
        if (arg2 == 36) {
            field284.method2429(41);
            field284.method2354(arg1);
            field284.method2320(arg3);
            field284.method2191(arg0);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 9) {
            class32 var25 = field365[arg3];
            if (var25 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(223);
                field284.method2320(arg3);
                field284.method2184(class129.field2027[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field284.method2429(19);
            field284.method2228(arg0);
            field284.method2228(arg3);
            field284.method2354(arg1);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 42) {
            field284.method2429(234);
            field284.method2191(arg0);
            field284.method2200(arg1);
            field284.method2319(arg3);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 17) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(11);
            field284.method2320(Statics.field613 + arg1);
            field284.method2184(class129.field2027[82] ? 1 : 0);
            field284.method2228(arg3);
            field284.method2320(field447);
            field284.method2191(Statics.field2052 + arg0);
            field284.method2200(Statics.field988);
        }
        if (arg2 == 4) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(50);
            field284.method2320(Statics.field2052 + arg0);
            field284.method2228(Statics.field613 + arg1);
            field284.method2319(arg3 >> 14 & 0x7FFF);
            field284.method2184(class129.field2027[82] ? 1 : 0);
        }
        if (arg2 == 8) {
            class32 var26 = field365[arg3];
            if (var26 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(34);
                field284.method2145(class129.field2027[82] ? 1 : 0);
                field284.method2320(arg3);
                field284.method2201(Statics.field988);
                field284.method2320(field447);
            }
        }
        if (arg2 == 22) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(126);
            field284.method2191(Statics.field613 + arg1);
            field284.method2228(arg3);
            field284.method2145(class129.field2027[82] ? 1 : 0);
            field284.method2228(Statics.field2052 + arg0);
        }
        if (arg2 == 51) {
            class3 var27 = field385[arg3];
            if (var27 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(249);
                field284.method2184(class129.field2027[82] ? 1 : 0);
                field284.method2320(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var28 = field385[arg3];
            if (var28 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(121);
                field284.method2145(class129.field2027[82] ? 1 : 0);
                field284.method2319(arg3);
            }
        }
        if (arg2 == 5) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(56);
            field284.method2191(arg3 >> 14 & 0x7FFF);
            field284.method2281(class129.field2027[82] ? 1 : 0);
            field284.method2320(Statics.field2052 + arg0);
            field284.method2191(Statics.field613 + arg1);
        }
        if (arg2 == 35) {
            field284.method2429(71);
            field284.method2228(arg0);
            field284.method2148(arg1);
            field284.method2320(arg3);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 18) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(155);
            field284.method2228(Statics.field613 + arg1);
            field284.method2320(Statics.field2052 + arg0);
            field284.method2281(class129.field2027[82] ? 1 : 0);
            field284.method2191(arg3);
        }
        if (arg2 == 19) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(125);
            field284.method2191(arg3);
            field284.method2320(Statics.field613 + arg1);
            field284.method2145(class129.field2027[82] ? 1 : 0);
            field284.method2228(Statics.field2052 + arg0);
        }
        if (arg2 == 14) {
            class3 var29 = field385[arg3];
            if (var29 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(92);
                field284.method2191(Statics.field2005);
                field284.method2200(Statics.field756);
                field284.method2184(class129.field2027[82] ? 1 : 0);
                field284.method2191(Statics.field629);
                field284.method2191(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field1939.method1711(Statics.field991, arg0, arg1);
        }
        if (arg2 == 39) {
            field284.method2429(98);
            field284.method2320(arg0);
            field284.method2228(arg3);
            field284.method2354(arg1);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 21) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(123);
            field284.method2281(class129.field2027[82] ? 1 : 0);
            field284.method2319(arg3);
            field284.method2319(Statics.field2052 + arg0);
            field284.method2320(Statics.field613 + arg1);
        }
        if (arg2 == 7) {
            class32 var30 = field365[arg3];
            if (var30 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(109);
                field284.method2183(class129.field2027[82] ? 1 : 0);
                field284.method2228(arg3);
                field284.method2201(Statics.field756);
                field284.method2320(Statics.field629);
                field284.method2228(Statics.field2005);
            }
        }
        if (arg2 == 31) {
            field284.method2429(247);
            field284.method2228(arg0);
            field284.method2228(arg3);
            field284.method2200(arg1);
            field284.method2201(Statics.field756);
            field284.method2320(Statics.field2005);
            field284.method2228(Statics.field629);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 34) {
            field284.method2429(224);
            field284.method2200(arg1);
            field284.method2320(arg0);
            field284.method2191(arg3);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 43) {
            field284.method2429(35);
            field284.method2200(arg1);
            field284.method2228(arg3);
            field284.method2319(arg0);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 25) {
            class164 var31 = class164.method2815(arg1, arg0);
            if (var31 != null) {
                method3006();
                int var32 = class169.method1895(method588(var31));
                int var33 = var31.field2786;
                class164 var34 = class164.method2815(arg1, arg0);
                if (var34 != null && var34.field2757 != null) {
                    class1 var35 = new class1();
                    var35.field3 = var34;
                    var35.field11 = var34.field2757;
                    class34.method607(var35);
                }
                field424 = var33;
                field422 = true;
                Statics.field988 = arg1;
                field447 = arg0;
                Statics.field121 = var32;
                method147(var34);
                field508 = 0;
                field425 = method2373(var31);
                if (field425 == null) {
                    field425 = "Null";
                }
                if (var31.field2667) {
                    field362 = var31.field2736 + class2.method2969(16777215);
                } else {
                    field362 = class2.method2969(65280) + var31.field2791 + class2.method2969(16777215);
                }
            }
            return;
        }
        if (arg2 == 1004) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field284.method2429(144);
            field284.method2191(arg3);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class164 var36 = class164.method2815(arg1, arg0);
            if (var36 != null) {
                int var37 = var36.field2786;
                class164 var38 = class164.method2815(arg1, arg0);
                if (var38 != null) {
                    if (var38.field2766 != null) {
                        class1 var39 = new class1();
                        var39.field3 = var38;
                        var39.field6 = arg3;
                        var39.field10 = arg5;
                        var39.field11 = var38.field2766;
                        class34.method607(var39);
                    }
                    boolean var40 = true;
                    if (var38.field2672 > 0) {
                        var40 = Statics.method2080(var38);
                    }
                    if (var40 && class169.method67(method588(var38), arg3 - 1)) {
                        if (arg3 == 1) {
                            field284.method2429(103);
                            field284.method2148(arg1);
                            field284.method2319(arg0);
                            field284.method2319(var37);
                        }
                        if (arg3 == 2) {
                            field284.method2429(66);
                            field284.method2148(arg1);
                            field284.method2319(arg0);
                            field284.method2319(var37);
                        }
                        if (arg3 == 3) {
                            field284.method2429(250);
                            field284.method2148(arg1);
                            field284.method2319(arg0);
                            field284.method2319(var37);
                        }
                        if (arg3 == 4) {
                            field284.method2429(62);
                            field284.method2148(arg1);
                            field284.method2319(arg0);
                            field284.method2319(var37);
                        }
                        if (arg3 == 5) {
                            field284.method2429(177);
                            field284.method2148(arg1);
                            field284.method2319(arg0);
                            field284.method2319(var37);
                        }
                        if (arg3 == 6) {
                            field284.method2429(186);
                            field284.method2148(arg1);
                            field284.method2319(arg0);
                            field284.method2319(var37);
                        }
                        if (arg3 == 7) {
                            field284.method2429(245);
                            field284.method2148(arg1);
                            field284.method2319(arg0);
                            field284.method2319(var37);
                        }
                        if (arg3 == 8) {
                            field284.method2429(133);
                            field284.method2148(arg1);
                            field284.method2319(arg0);
                            field284.method2319(var37);
                        }
                        if (arg3 == 9) {
                            field284.method2429(136);
                            field284.method2148(arg1);
                            field284.method2319(arg0);
                            field284.method2319(var37);
                        }
                        if (arg3 == 10) {
                            field284.method2429(85);
                            field284.method2148(arg1);
                            field284.method2319(arg0);
                            field284.method2319(var37);
                        }
                    }
                }
            }
        }
        if (arg2 == 1001) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(181);
            field284.method2183(class129.field2027[82] ? 1 : 0);
            field284.method2319(arg3 >> 14 & 0x7FFF);
            field284.method2319(Statics.field613 + arg1);
            field284.method2319(Statics.field2052 + arg0);
        }
        if (arg2 == 58) {
            class164 var41 = class164.method2815(arg1, arg0);
            if (var41 != null) {
                field284.method2429(187);
                field284.method2319(field424);
                field284.method2191(arg0);
                field284.method2319(var41.field2786);
                field284.method2320(field447);
                field284.method2201(arg1);
                field284.method2354(Statics.field988);
            }
        }
        if (arg2 == 33) {
            field284.method2429(58);
            field284.method2228(arg0);
            field284.method2201(arg1);
            field284.method2191(arg3);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 40) {
            field284.method2429(131);
            field284.method2200(arg1);
            field284.method2320(arg0);
            field284.method2320(arg3);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (arg2 == 28) {
            field284.method2429(166);
            field284.method2148(arg1);
            class164 var42 = class164.method2744(arg1);
            if (var42.field2774 != null && var42.field2774[0][0] == 5) {
                int var43 = var42.field2774[0][1];
                class167.field2816[var43] = 1 - class167.field2816[var43];
                method125(var43);
            }
        }
        if (arg2 == 3) {
            field372 = arg6;
            field373 = arg7;
            field375 = 2;
            field374 = 0;
            field504 = arg0;
            field282 = arg1;
            field284.method2429(253);
            field284.method2145(class129.field2027[82] ? 1 : 0);
            field284.method2320(Statics.field613 + arg1);
            field284.method2228(arg3 >> 14 & 0x7FFF);
            field284.method2319(Statics.field2052 + arg0);
        }
        if (arg2 == 11) {
            class32 var44 = field365[arg3];
            if (var44 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(149);
                field284.method2145(class129.field2027[82] ? 1 : 0);
                field284.method2319(arg3);
            }
        }
        if (arg2 == 10) {
            class32 var45 = field365[arg3];
            if (var45 != null) {
                field372 = arg6;
                field373 = arg7;
                field375 = 2;
                field374 = 0;
                field504 = arg0;
                field282 = arg1;
                field284.method2429(1);
                field284.method2191(arg3);
                field284.method2145(class129.field2027[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field284.method2429(189);
            field284.method2200(arg1);
            field284.method2319(arg3);
            field284.method2228(arg0);
            field301 = 0;
            Statics.field2185 = class164.method2744(arg1);
            field377 = arg0;
        }
        if (field508 != 0) {
            field508 = 0;
            method147(class164.method2744(Statics.field756));
        }
        if (field422) {
            method3006();
        }
        if (Statics.field2185 != null && field301 == 0) {
            method147(Statics.field2185);
        }
    }

    @ObfuscatedName("fg.bw(B)V")
    public static void method3006() {
        if (!field422) {
            return;
        }
        class164 var0 = class164.method2815(Statics.field988, field447);
        if (var0 != null && var0.field2758 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field11 = var0.field2758;
            class34.method607(var1);
        }
        field422 = false;
        method147(var0);
    }

    @ObfuscatedName("q.cj(IIB)V")
    public static void method75(int arg0, int arg1) {
        field284.method2429(7);
        field284.method2201(arg0);
        field284.method2319(arg1);
    }

    @ObfuscatedName("g.cr(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method24(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field408 || field320 >= 500) {
            return;
        }
        field414[field320] = arg0;
        field366[field320] = arg1;
        field545[field320] = arg2;
        field433[field320] = arg3;
        field347[field320] = arg4;
        field411[field320] = arg5;
        field320++;
    }

    @ObfuscatedName("j.ck(I)V")
    public static void method137() {
        for (int var0 = 0; var0 < field320; var0++) {
            if (Statics.method513(field545[var0])) {
                if (var0 < field320 - 1) {
                    for (int var1 = var0; var1 < field320 - 1; var1++) {
                        field414[var1] = field414[var1 + 1];
                        field366[var1] = field366[var1 + 1];
                        field545[var1] = field545[var1 + 1];
                        field433[var1] = field433[var1 + 1];
                        field347[var1] = field347[var1 + 1];
                        field411[var1] = field411[var1 + 1];
                    }
                }
                field320--;
            }
        }
    }

    @ObfuscatedName("e.cg(IIIII)V")
    public static final void method64(int arg0, int arg1, int arg2, int arg3) {
        if (field508 == 0 && !field422) {
            method24(class148.field2486, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class100.field1745; var6++) {
            int var7 = class100.field1760[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field1939.method1667(Statics.field991, var8, var9, var7) >= 0) {
                    class38 var12 = class38.method167(var11);
                    if (var12.field894 != null) {
                        var12 = var12.method717();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field508 == 1) {
                        method24(class148.field2373, field421 + " " + class2.field23 + " " + class2.method2969(65535) + var12.field881, 1, var7, var8, var9);
                    } else if (!field422) {
                        String[] var13 = var12.field898;
                        if (field438) {
                            var13 = method2105(var13);
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
                                    method24(var13[var14], class2.method2969(65535) + var12.field881, var15, var7, var8, var9);
                                }
                            }
                        }
                        method24(class148.field2326, class2.method2969(65535) + var12.field881, 1002, var12.field878 << 14, var8, var9);
                    } else if ((Statics.field121 & 0x4) == 4) {
                        method24(field425, field362 + " " + class2.field23 + " " + class2.method2969(65535) + var12.field881, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class32 var16 = field365[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field729.field849 == 1 && (var16.field802 & 0x7F) == 64 && (var16.field762 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field505; var17++) {
                            class32 var18 = field365[field466[var17]];
                            if (var18 != null && var16 != var18 && var18.field729.field849 == 1 && var16.field802 == var18.field802 && var16.field762 == var18.field762) {
                                method3070(var18.field729, field466[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field386; var19++) {
                            class3 var20 = field385[field482[var19]];
                            if (var20 != null && var16.field802 == var20.field802 && var16.field762 == var20.field762) {
                                method6(var20, field482[var19], var8, var9);
                            }
                        }
                    }
                    method3070(var16.field729, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field385[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field802 & 0x7F) == 64 && (var21.field762 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field505; var22++) {
                            class32 var23 = field365[field466[var22]];
                            if (var23 != null && var23.field729.field849 == 1 && var21.field802 == var23.field802 && var21.field762 == var23.field762) {
                                method3070(var23.field729, field466[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field386; var24++) {
                            class3 var25 = field385[field482[var24]];
                            if (var25 != null && var21 != var25 && var21.field802 == var25.field802 && var21.field762 == var25.field762) {
                                method6(var25, field482[var24], var8, var9);
                            }
                        }
                    }
                    if (field341 == var11) {
                        var4 = var7;
                    } else {
                        method6(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class190 var26 = field400[Statics.field991][var8][var9];
                    if (var26 != null) {
                        for (class27 var27 = (class27) var26.method3411(); var27 != null; var27 = (class27) var26.method3399()) {
                            class47 var28 = class47.method859(var27.field662);
                            if (field508 == 1) {
                                method24(class148.field2373, field421 + " " + class2.field23 + " " + class2.method2969(16748608) + var28.field1049, 16, var27.field662, var8, var9);
                            } else if (!field422) {
                                String[] var29 = var28.field1064;
                                if (field438) {
                                    var29 = method2105(var29);
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
                                        method24(var29[var30], class2.method2969(16748608) + var28.field1049, var31, var27.field662, var8, var9);
                                    } else if (var30 == 2) {
                                        method24(class148.field2223, class2.method2969(16748608) + var28.field1049, 20, var27.field662, var8, var9);
                                    }
                                }
                                method24(class148.field2326, class2.method2969(16748608) + var28.field1049, 1004, var27.field662, var8, var9);
                            } else if ((Statics.field121 & 0x1) == 1) {
                                method24(field425, field362 + " " + class2.field23 + " " + class2.method2969(16748608) + var28.field1049, 17, var27.field662, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field385[field341];
            method6(var34, field341, var32, var33);
        }
    }

    @ObfuscatedName("fi.cu(Las;IIII)V")
    public static final void method3070(class37 arg0, int arg1, int arg2, int arg3) {
        if (field320 >= 400) {
            return;
        }
        if (arg0.field837 != null) {
            arg0 = arg0.method678();
        }
        if (arg0 == null || !arg0.field862 || arg0.field864 && field495 != arg1) {
            return;
        }
        String var4 = arg0.field859;
        if (arg0.field851 != 0) {
            int var6 = arg0.field851;
            int var7 = Statics.field2098.field39;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2969(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2969(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2969(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2969(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2969(65280);
            } else if (var8 > 6) {
                var9 = class2.method2969(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2969(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2969(12648192);
            } else {
                var9 = class2.method2969(16776960);
            }
            var4 = var4 + var9 + " " + class2.field33 + class148.field2379 + arg0.field851 + class2.field22;
        }
        if (field508 == 1) {
            method24(class148.field2373, field421 + " " + class2.field23 + " " + class2.method2969(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field422) {
            String[] var10 = arg0.field869;
            if (field438) {
                var10 = method2105(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class148.field2375)) {
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
                        method24(var10[var11], class2.method2969(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class148.field2375)) {
                        short var14 = 0;
                        if (field288 == class19.field550 || field288 == class19.field552 && arg0.field851 > Statics.field2098.field39) {
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
                        method24(var10[var13], class2.method2969(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method24(class148.field2326, class2.method2969(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field121 & 0x2) == 2) {
            method24(field425, field362 + " " + class2.field23 + " " + class2.method2969(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("y.cf(Lg;IIII)V")
    public static final void method6(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2098 == arg0 || field320 >= 400) {
            return;
        }
        String var9;
        if (arg0.field40 == 0) {
            String var4 = arg0.field49;
            int var5 = arg0.field39;
            int var6 = Statics.field2098.field39;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2969(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2969(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2969(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2969(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2969(65280);
            } else if (var7 > 6) {
                var8 = class2.method2969(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2969(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2969(12648192);
            } else {
                var8 = class2.method2969(16776960);
            }
            var9 = var4 + var8 + " " + class2.field33 + class148.field2379 + arg0.field39 + class2.field22;
        } else {
            var9 = arg0.field49 + " " + class2.field33 + class148.field2380 + arg0.field40 + class2.field22;
        }
        if (field508 == 1) {
            method24(class148.field2373, field421 + " " + class2.field23 + " " + class2.method2969(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field422) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field396[var10] != null) {
                    short var11 = 0;
                    if (field396[var10].equalsIgnoreCase(class148.field2375)) {
                        if (field288 == class19.field550 || field288 == class19.field552 && arg0.field39 > Statics.field2098.field39) {
                            var11 = 2000;
                        }
                        if (Statics.field2098.field53 != 0 && arg0.field53 != 0) {
                            if (Statics.field2098.field53 == arg0.field53) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field397[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field395[var10] + var11;
                    method24(field396[var10], class2.method2969(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field121 & 0x8) == 8) {
            method24(field425, field362 + " " + class2.field23 + " " + class2.method2969(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field320; var14++) {
            if (field545[var14] == 23) {
                field366[var14] = class2.method2969(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("dt.cy(IIIIIIIII)V")
    public static final void method2457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class164.method511(arg0)) {
            Statics.field920 = null;
            method2092(Statics.field2685[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field920 != null) {
                method2092(Statics.field920, -1412584499, arg1, arg2, arg3, arg4, Statics.field826, Statics.field1321, arg7);
                Statics.field920 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field474[var8] = true;
            }
        } else {
            field474[arg7] = true;
        }
    }

    @ObfuscatedName("dv.cs([Lfb;IIIIIIIII)V")
    public static final void method2092(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75.method1549(arg2, arg3, arg4, arg5);
        class86.method1809();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class164 var10 = arg0[var9];
            if (var10 != null && (var10.field2687 == arg1 || arg1 == -1412584499 && field361 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field477[field472] = var10.field2681 + arg6;
                    field519[field472] = var10.field2682 + arg7;
                    field479[field472] = var10.field2683;
                    field480[field472] = var10.field2684;
                    var11 = ++field472 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2749 = var11;
                var10.field2796 = field423;
                if (!var10.field2667 || !method792(var10)) {
                    if (var10.field2672 > 0) {
                        method3320(var10);
                    }
                    int var12 = var10.field2681 + arg6;
                    int var13 = var10.field2682 + arg7;
                    int var14 = var10.field2698;
                    if (field361 == var10) {
                        if (arg1 != -1412584499 && !var10.field2759) {
                            Statics.field920 = arg0;
                            Statics.field826 = arg6;
                            Statics.field1321 = arg7;
                            continue;
                        }
                        if (field451 && field445) {
                            int var15 = class132.field2071;
                            int var16 = class132.field2072 * 76101137;
                            int var17 = var15 - field442;
                            int var18 = var16 - field443;
                            if (var17 < field446) {
                                var17 = field446;
                            }
                            if (var10.field2683 + var17 > field446 + field511.field2683) {
                                var17 = field446 + field511.field2683 - var10.field2683;
                            }
                            if (var18 < field335) {
                                var18 = field335;
                            }
                            if (var10.field2684 + var18 > field335 + field511.field2684) {
                                var18 = field335 + field511.field2684 - var10.field2684;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2759) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2670 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2670 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2683 + var12;
                        int var26 = var10.field2684 + var13;
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
                        int var29 = var10.field2683 + var12;
                        int var30 = var10.field2684 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2667 || var19 < var21 && var20 < var22) {
                        if (var10.field2672 != 0) {
                            if (var10.field2672 == 1336) {
                                if (field277) {
                                    var13 += 15;
                                    Statics.field2059.method3618("Fps:" + field2120, var10.field2683 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field267) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field267) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2059.method3618("Mem:" + var32 + "k", var10.field2683 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2672 == 1337) {
                                field489 = var12;
                                field417 = var13;
                                int var36 = var10.field2683;
                                int var37 = var10.field2684;
                                field369++;
                                method154(class31.field727);
                                boolean var38 = false;
                                if (field341 >= 0) {
                                    for (int var39 = 0; var39 < field386; var39++) {
                                        if (field341 == field482[var39]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method154(class31.field720);
                                }
                                method2773(true);
                                method154(var38 ? class31.field722 : class31.field721);
                                method2773(false);
                                for (class7 var40 = (class7) field402.method3396(); var40 != null; var40 = (class7) field402.method3398()) {
                                    if (Statics.field991 != var40.field95 || field423 > var40.field108) {
                                        var40.method3482();
                                    } else if (field423 >= var40.field94) {
                                        if (var40.field101 > 0) {
                                            class32 var41 = field365[var40.field101 - 1];
                                            if (var41 != null && var41.field802 >= 0 && var41.field802 < 13312 && var41.field762 >= 0 && var41.field762 < 13312) {
                                                var40.method68(var41.field802, var41.field762, method2468(var41.field802, var41.field762, var40.field95) - var40.field99, field423);
                                            }
                                        }
                                        if (var40.field101 < 0) {
                                            int var42 = -var40.field101 - 1;
                                            class3 var43;
                                            if (field312 == var42) {
                                                var43 = Statics.field2098;
                                            } else {
                                                var43 = field385[var42];
                                            }
                                            if (var43 != null && var43.field802 >= 0 && var43.field802 < 13312 && var43.field762 >= 0 && var43.field762 < 13312) {
                                                var40.method68(var43.field802, var43.field762, method2468(var43.field802, var43.field762, var40.field95) - var40.field99, field423);
                                            }
                                        }
                                        var40.method69(field537);
                                        Statics.field1939.method1648(Statics.field991, (int) var40.field106, (int) var40.field107, (int) var40.field98, 60, var40, var40.field114, -1, false);
                                    }
                                }
                                method2466();
                                method63(var12, var13, var36, var37, true);
                                int var44 = field532;
                                int var45 = field533;
                                int var46 = field441;
                                int var47 = field316;
                                class75.method1549(var44, var45, var44 + var46, var45 + var47);
                                class86.method1809();
                                if (!field518) {
                                    int var48 = field349;
                                    if (field406 / 256 > var48) {
                                        var48 = field406 / 256;
                                    }
                                    if (field404[4] && field427[4] + 128 > var48) {
                                        var48 = field427[4] + 128;
                                    }
                                    int var49 = field350 + field330 & 0x7FF;
                                    int var50 = Statics.field601;
                                    int var51 = method2468(Statics.field2098.field802, Statics.field2098.field762, Statics.field991) - 50;
                                    int var52 = Statics.field1034;
                                    int var53 = var48 * 3 + 600;
                                    int var54 = 2048 - var48 & 0x7FF;
                                    int var55 = 2048 - var49 & 0x7FF;
                                    int var56 = 0;
                                    int var57 = 0;
                                    int var58 = var53;
                                    if (var54 != 0) {
                                        int var59 = class86.field1510[var54];
                                        int var60 = class86.field1501[var54];
                                        int var61 = var57 * var60 - var53 * var59 >> 16;
                                        var58 = var57 * var59 + var53 * var60 >> 16;
                                        var57 = var61;
                                    }
                                    if (var55 != 0) {
                                        int var62 = class86.field1510[var55];
                                        int var63 = class86.field1501[var55];
                                        int var64 = var56 * var63 + var58 * var62 >> 16;
                                        var58 = var58 * var63 - var56 * var62 >> 16;
                                        var56 = var64;
                                    }
                                    Statics.field1829 = var50 - var56;
                                    Statics.field2210 = var51 - var57;
                                    Statics.field1147 = var52 - var58;
                                    Statics.field13 = var48;
                                    Statics.field1971 = var49;
                                }
                                int var77;
                                if (field518) {
                                    var77 = method2979();
                                } else {
                                    int var65;
                                    if (Statics.field2828.field135) {
                                        var65 = Statics.field991;
                                    } else {
                                        int var66 = 3;
                                        if (Statics.field13 < 310) {
                                            int var67 = Statics.field1829 >> 7;
                                            int var68 = Statics.field1147 >> 7;
                                            int var69 = Statics.field2098.field802 >> 7;
                                            int var70 = Statics.field2098.field762 >> 7;
                                            if ((class6.field71[Statics.field991][var67][var68] & 0x4) != 0) {
                                                var66 = Statics.field991;
                                            }
                                            int var71;
                                            if (var69 > var67) {
                                                var71 = var69 - var67;
                                            } else {
                                                var71 = var67 - var69;
                                            }
                                            int var72;
                                            if (var70 > var68) {
                                                var72 = var70 - var68;
                                            } else {
                                                var72 = var68 - var70;
                                            }
                                            if (var71 > var72) {
                                                int var73 = var72 * 65536 / var71;
                                                int var74 = 32768;
                                                while (var67 != var69) {
                                                    if (var67 < var69) {
                                                        var67++;
                                                    } else if (var67 > var69) {
                                                        var67--;
                                                    }
                                                    if ((class6.field71[Statics.field991][var67][var68] & 0x4) != 0) {
                                                        var66 = Statics.field991;
                                                    }
                                                    var74 += var73;
                                                    if (var74 >= 65536) {
                                                        var74 -= 65536;
                                                        if (var68 < var70) {
                                                            var68++;
                                                        } else if (var68 > var70) {
                                                            var68--;
                                                        }
                                                        if ((class6.field71[Statics.field991][var67][var68] & 0x4) != 0) {
                                                            var66 = Statics.field991;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var75 = var71 * 65536 / var72;
                                                int var76 = 32768;
                                                while (var68 != var70) {
                                                    if (var68 < var70) {
                                                        var68++;
                                                    } else if (var68 > var70) {
                                                        var68--;
                                                    }
                                                    if ((class6.field71[Statics.field991][var67][var68] & 0x4) != 0) {
                                                        var66 = Statics.field991;
                                                    }
                                                    var76 += var75;
                                                    if (var76 >= 65536) {
                                                        var76 -= 65536;
                                                        if (var67 < var69) {
                                                            var67++;
                                                        } else if (var67 > var69) {
                                                            var67--;
                                                        }
                                                        if ((class6.field71[Statics.field991][var67][var68] & 0x4) != 0) {
                                                            var66 = Statics.field991;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field71[Statics.field991][Statics.field2098.field802 >> 7][Statics.field2098.field762 >> 7] & 0x4) != 0) {
                                            var66 = Statics.field991;
                                        }
                                        var65 = var66;
                                    }
                                    var77 = var65;
                                }
                                int var78 = Statics.field1829;
                                int var79 = Statics.field2210;
                                int var80 = Statics.field1147;
                                int var81 = Statics.field13;
                                int var82 = Statics.field1971;
                                for (int var83 = 0; var83 < 5; var83++) {
                                    if (field404[var83]) {
                                        int var84 = (int) (Math.random() * (double) (field293[var83] * 2 + 1) - (double) field293[var83] + Math.sin((double) field363[var83] / 100.0D * (double) field308[var83]) * (double) field427[var83]);
                                        if (var83 == 0) {
                                            Statics.field1829 += var84;
                                        }
                                        if (var83 == 1) {
                                            Statics.field2210 += var84;
                                        }
                                        if (var83 == 2) {
                                            Statics.field1147 += var84;
                                        }
                                        if (var83 == 3) {
                                            Statics.field1971 = Statics.field1971 + var84 & 0x7FF;
                                        }
                                        if (var83 == 4) {
                                            Statics.field13 += var84;
                                            if (Statics.field13 < 128) {
                                                Statics.field13 = 128;
                                            }
                                            if (Statics.field13 > 383) {
                                                Statics.field13 = 383;
                                            }
                                        }
                                    }
                                }
                                int var85 = class132.field2071;
                                int var86 = class132.field2072 * 76101137;
                                if (class132.field2068 != 0) {
                                    var85 = class132.field2077;
                                    var86 = class132.field2079;
                                }
                                if (var85 >= var44 && var85 < var44 + var46 && var86 >= var45 && var86 < var45 + var47) {
                                    class100.field1758 = true;
                                    class100.field1745 = 0;
                                    class100.field1789 = var85 - var44;
                                    class100.field1790 = var86 - var45;
                                } else {
                                    class100.field1758 = false;
                                    class100.field1745 = 0;
                                }
                                method2597();
                                class75.method1575(var44, var45, var46, var47, 0);
                                method2597();
                                int var87 = class86.field1496;
                                class86.field1496 = field536;
                                Statics.field1939.method1681(Statics.field1829, Statics.field2210, Statics.field1147, Statics.field13, Statics.field1971, var77);
                                class86.field1496 = var87;
                                method2597();
                                Statics.field1939.method1746();
                                field523 = 0;
                                boolean var88 = false;
                                int var89 = -1;
                                for (int var90 = -1; var90 < field505 + field386; var90++) {
                                    class35 var91;
                                    if (var90 == -1) {
                                        var91 = Statics.field2098;
                                    } else if (var90 < field386) {
                                        var91 = field385[field482[var90]];
                                        if (field341 == field482[var90]) {
                                            var88 = true;
                                            var89 = var90;
                                            continue;
                                        }
                                    } else {
                                        var91 = field365[field466[var90 - field386]];
                                    }
                                    method2759(var91, var90, var44, var45, var46, var47);
                                }
                                if (var88) {
                                    method2759(field385[field341], var89, var44, var45, var46, var47);
                                }
                                for (int var92 = 0; var92 < field523; var92++) {
                                    int var93 = field360[var92];
                                    int var94 = field376[var92];
                                    int var95 = field499[var92];
                                    int var96 = field306[var92];
                                    boolean var97 = true;
                                    while (var97) {
                                        var97 = false;
                                        for (int var98 = 0; var98 < var92; var98++) {
                                            if (var94 + 2 > field376[var98] - field306[var98] && var94 - var96 < field376[var98] + 2 && var93 - var95 < field499[var98] + field360[var98] && var93 + var95 > field360[var98] - field499[var98] && field376[var98] - field306[var98] < var94) {
                                                var94 = field376[var98] - field306[var98];
                                                var97 = true;
                                            }
                                        }
                                    }
                                    field370 = field360[var92];
                                    field534 = field376[var92] = var94;
                                    String var99 = field367[var92];
                                    if (field456 == 0) {
                                        int var100 = 16776960;
                                        if (field413[var92] < 6) {
                                            var100 = field487[field413[var92]];
                                        }
                                        if (field413[var92] == 6) {
                                            var100 = field369 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field413[var92] == 7) {
                                            var100 = field369 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field413[var92] == 8) {
                                            var100 = field369 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field413[var92] == 9) {
                                            int var101 = 150 - field387[var92];
                                            if (var101 < 50) {
                                                var100 = var101 * 1280 + 16711680;
                                            } else if (var101 < 100) {
                                                var100 = 16776960 - (var101 - 50) * 327680;
                                            } else if (var101 < 150) {
                                                var100 = (var101 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field413[var92] == 10) {
                                            int var102 = 150 - field387[var92];
                                            if (var102 < 50) {
                                                var100 = var102 * 5 + 16711680;
                                            } else if (var102 < 100) {
                                                var100 = 16711935 - (var102 - 50) * 327680;
                                            } else if (var102 < 150) {
                                                var100 = (var102 - 100) * 327680 + 255 - (var102 - 100) * 5;
                                            }
                                        }
                                        if (field413[var92] == 11) {
                                            int var103 = 150 - field387[var92];
                                            if (var103 < 50) {
                                                var100 = 16777215 - var103 * 327685;
                                            } else if (var103 < 100) {
                                                var100 = (var103 - 50) * 327685 + 65280;
                                            } else if (var103 < 150) {
                                                var100 = 16777215 - (var103 - 100) * 327680;
                                            }
                                        }
                                        if (field484[var92] == 0) {
                                            Statics.field1802.method3667(var99, field370 + var44, field534 + var45, var100, 0);
                                        }
                                        if (field484[var92] == 1) {
                                            Statics.field1802.method3672(var99, field370 + var44, field534 + var45, var100, 0, field369);
                                        }
                                        if (field484[var92] == 2) {
                                            Statics.field1802.method3692(var99, field370 + var44, field534 + var45, var100, 0, field369);
                                        }
                                        if (field484[var92] == 3) {
                                            Statics.field1802.method3622(var99, field370 + var44, field534 + var45, var100, 0, field369, 150 - field387[var92]);
                                        }
                                        if (field484[var92] == 4) {
                                            int var104 = (150 - field387[var92]) * (Statics.field1802.method3611(var99) + 100) / 150;
                                            class75.method1550(field370 + var44 - 50, var45, field370 + var44 + 50, var45 + var47);
                                            Statics.field1802.method3616(var99, field370 + var44 + 50 - var104, field534 + var45, var100, 0);
                                            class75.method1549(var44, var45, var44 + var46, var45 + var47);
                                        }
                                        if (field484[var92] == 5) {
                                            int var105 = 150 - field387[var92];
                                            int var106 = 0;
                                            if (var105 < 25) {
                                                var106 = var105 - 25;
                                            } else if (var105 > 125) {
                                                var106 = var105 - 125;
                                            }
                                            class75.method1550(var44, field534 + var45 - Statics.field1802.field3088 - 1, var44 + var46, field534 + var45 + 5);
                                            Statics.field1802.method3667(var99, field370 + var44, field534 + var45 + var106, var100, 0);
                                            class75.method1549(var44, var45, var44 + var46, var45 + var47);
                                        }
                                    } else {
                                        Statics.field1802.method3667(var99, field370 + var44, field534 + var45, 16776960, 0);
                                    }
                                }
                                if (field279 == 2) {
                                    method608((field478 - Statics.field2052 << 7) + field285, (field283 - Statics.field613 << 7) + field286, field274 * 2);
                                    if (field370 > -1 && field423 % 20 < 10) {
                                        Statics.field340[0].method1459(field370 + var44 - 12, field534 + var45 - 28);
                                    }
                                }
                                ((class90) Statics.field1507).method1886(field537);
                                if (field375 == 1) {
                                    Statics.field415[field374 / 100].method1459(field372 - 8, field373 - 8);
                                }
                                if (field375 == 2) {
                                    Statics.field415[field374 / 100 + 4].method1459(field372 - 8, field373 - 8);
                                }
                                field384 = 0;
                                int var107 = (Statics.field2098.field802 >> 7) + Statics.field2052;
                                int var108 = (Statics.field2098.field762 >> 7) + Statics.field613;
                                if (var107 >= 3053 && var107 <= 3156 && var108 >= 3056 && var108 <= 3136) {
                                    field384 = 1;
                                }
                                if (var107 >= 3072 && var107 <= 3118 && var108 >= 9492 && var108 <= 9535) {
                                    field384 = 1;
                                }
                                if (field384 == 1 && var107 >= 3139 && var107 <= 3199 && var108 >= 3008 && var108 <= 3062) {
                                    field384 = 0;
                                }
                                Statics.field1829 = var78;
                                Statics.field2210 = var79;
                                Statics.field1147 = var80;
                                Statics.field13 = var81;
                                Statics.field1971 = var82;
                                if (field300 && class162.method2793(true, false) == 0) {
                                    field300 = false;
                                }
                                if (field300) {
                                    class75.method1575(var44, var45, var46, var47, 0);
                                    Statics.method2869(class148.field2432, false);
                                }
                                field474[var10.field2749] = true;
                                class75.method1549(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2672 == 1338) {
                                method2597();
                                class166 var109 = var10.method3030();
                                if (var109 != null) {
                                    class75.method1549(var12, var13, var109.field2814 + var12, var109.field2809 + var13);
                                    if (field506 == 2 || field506 == 5) {
                                        class75.method1594(var12, var13, 0, var109.field2813, var109.field2810);
                                    } else {
                                        int var110 = field350 + field333 & 0x7FF;
                                        int var111 = Statics.field2098.field802 / 32 + 48;
                                        int var112 = 464 - Statics.field2098.field762 / 32;
                                        Statics.field1120.method1484(var12, var13, var109.field2814, var109.field2809, var111, var112, var110, field503 + 256, var109.field2813, var109.field2810);
                                        for (int var113 = 0; var113 < field420; var113++) {
                                            int var114 = field501[var113] * 4 + 2 - Statics.field2098.field802 / 32;
                                            int var115 = field502[var113] * 4 + 2 - Statics.field2098.field762 / 32;
                                            method606(var12, var13, var114, var115, field398[var113], var109);
                                        }
                                        int var116 = 0;
                                        while (true) {
                                            if (var116 >= 104) {
                                                for (int var121 = 0; var121 < field505; var121++) {
                                                    class32 var122 = field365[field466[var121]];
                                                    if (var122 != null && var122.method19()) {
                                                        class37 var123 = var122.field729;
                                                        if (var123 != null && var123.field837 != null) {
                                                            var123 = var123.method678();
                                                        }
                                                        if (var123 != null && var123.field850 && var123.field862) {
                                                            int var124 = var122.field802 / 32 - Statics.field2098.field802 / 32;
                                                            int var125 = var122.field762 / 32 - Statics.field2098.field762 / 32;
                                                            method606(var12, var13, var124, var125, Statics.field1310[1], var109);
                                                        }
                                                    }
                                                }
                                                for (int var126 = 0; var126 < field386; var126++) {
                                                    class3 var127 = field385[field482[var126]];
                                                    if (var127 != null && var127.method19() && !var127.field54) {
                                                        int var128 = var127.field802 / 32 - Statics.field2098.field802 / 32;
                                                        int var129 = var127.field762 / 32 - Statics.field2098.field762 / 32;
                                                        boolean var130 = false;
                                                        if (method491(var127.field49, true)) {
                                                            var130 = true;
                                                        }
                                                        boolean var131 = false;
                                                        for (int var132 = 0; var132 < Statics.field168; var132++) {
                                                            if (var127.field49.equals(Statics.field1800[var132].field599)) {
                                                                var131 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var133 = false;
                                                        if (Statics.field2098.field53 != 0 && var127.field53 != 0 && Statics.field2098.field53 == var127.field53) {
                                                            var133 = true;
                                                        }
                                                        if (var130) {
                                                            method606(var12, var13, var128, var129, Statics.field1310[3], var109);
                                                        } else if (var133) {
                                                            method606(var12, var13, var128, var129, Statics.field1310[4], var109);
                                                        } else if (var131) {
                                                            method606(var12, var13, var128, var129, Statics.field1310[5], var109);
                                                        } else {
                                                            method606(var12, var13, var128, var129, Statics.field1310[2], var109);
                                                        }
                                                    }
                                                }
                                                if (field279 != 0 && field423 % 20 < 10) {
                                                    if (field279 == 1 && field280 >= 0 && field280 < field365.length) {
                                                        class32 var134 = field365[field280];
                                                        if (var134 != null) {
                                                            int var135 = var134.field802 / 32 - Statics.field2098.field802 / 32;
                                                            int var136 = var134.field762 / 32 - Statics.field2098.field762 / 32;
                                                            method134(var12, var13, var135, var136, Statics.field342[1], var109);
                                                        }
                                                    }
                                                    if (field279 == 2) {
                                                        int var137 = field478 * 4 - Statics.field2052 * 4 + 2 - Statics.field2098.field802 / 32;
                                                        int var138 = field283 * 4 - Statics.field613 * 4 + 2 - Statics.field2098.field762 / 32;
                                                        method134(var12, var13, var137, var138, Statics.field342[1], var109);
                                                    }
                                                    if (field279 == 10 && field281 >= 0 && field281 < field385.length) {
                                                        class3 var139 = field385[field281];
                                                        if (var139 != null) {
                                                            int var140 = var139.field802 / 32 - Statics.field2098.field802 / 32;
                                                            int var141 = var139.field762 / 32 - Statics.field2098.field762 / 32;
                                                            method134(var12, var13, var140, var141, Statics.field342[1], var109);
                                                        }
                                                    }
                                                }
                                                if (field504 != 0) {
                                                    int var142 = field504 * 4 + 2 - Statics.field2098.field802 / 32;
                                                    int var143 = field282 * 4 + 2 - Statics.field2098.field762 / 32;
                                                    method606(var12, var13, var142, var143, Statics.field342[0], var109);
                                                }
                                                if (!Statics.field2098.field54) {
                                                    class75.method1575(var109.field2814 / 2 + var12 - 1, var109.field2809 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var117 = 0; var117 < 104; var117++) {
                                                class190 var118 = field400[Statics.field991][var116][var117];
                                                if (var118 != null) {
                                                    int var119 = var116 * 4 + 2 - Statics.field2098.field802 / 32;
                                                    int var120 = var117 * 4 + 2 - Statics.field2098.field762 / 32;
                                                    method606(var12, var13, var119, var120, Statics.field1310[0], var109);
                                                }
                                            }
                                            var116++;
                                        }
                                    }
                                    field475[var11] = true;
                                }
                                class75.method1549(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2672 == 1339) {
                                class166 var144 = var10.method3030();
                                if (var144 != null) {
                                    if (field506 < 3) {
                                        Statics.field242.method1484(var12, var13, var144.field2814, var144.field2809, 25, 25, field350, 256, var144.field2813, var144.field2810);
                                    } else {
                                        class75.method1594(var12, var13, 0, var144.field2813, var144.field2810);
                                    }
                                }
                                class75.method1549(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2670 == 0) {
                            if (!var10.field2667 && method792(var10) && Statics.field1980 != var10) {
                                continue;
                            }
                            if (!var10.field2667) {
                                if (var10.field2690 > var10.field2692 - var10.field2684) {
                                    var10.field2690 = var10.field2692 - var10.field2684;
                                }
                                if (var10.field2690 < 0) {
                                    var10.field2690 = 0;
                                }
                            }
                            method2092(arg0, var10.field2792, var19, var20, var21, var22, var12 - var10.field2785, var13 - var10.field2690, var11);
                            if (var10.field2790 != null) {
                                method2092(var10.field2790, var10.field2792, var19, var20, var21, var22, var12 - var10.field2785, var13 - var10.field2690, var11);
                            }
                            class4 var145 = (class4) field522.method3357((long) var10.field2792);
                            if (var145 != null) {
                                method2457(var145.field61, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class75.method1549(arg2, arg3, arg4, arg5);
                            class86.method1809();
                        }
                        if (field483 || field476[var11] || field481 > 1) {
                            if (var10.field2670 == 0 && !var10.field2667 && var10.field2692 > var10.field2684) {
                                method526(var10.field2683 + var12, var13, var10.field2690, var10.field2684, var10.field2692);
                            }
                            if (var10.field2670 != 1) {
                                if (var10.field2670 == 2) {
                                    int var146 = 0;
                                    for (int var147 = 0; var147 < var10.field2680; var147++) {
                                        for (int var148 = 0; var148 < var10.field2747; var148++) {
                                            int var149 = (var10.field2732 + 32) * var148 + var12;
                                            int var150 = (var10.field2733 + 32) * var147 + var13;
                                            if (var146 < 20) {
                                                var149 += var10.field2734[var146];
                                                var150 += var10.field2768[var146];
                                            }
                                            if (var10.field2784[var146] > 0) {
                                                boolean var151 = false;
                                                boolean var152 = false;
                                                int var153 = var10.field2784[var146] - 1;
                                                if (var149 + 32 > arg2 && var149 < arg4 && var150 + 32 > arg3 && var150 < arg5 || Statics.field1672 == var10 && field378 == var146) {
                                                    class74 var154;
                                                    if (field508 == 1 && Statics.field2005 == var146 && Statics.field756 == var10.field2792) {
                                                        var154 = class47.method706(var153, var10.field2693[var146], 2, 0, 2, false);
                                                    } else {
                                                        var154 = class47.method706(var153, var10.field2693[var146], 1, 3153952, 2, false);
                                                    }
                                                    if (var154 == null) {
                                                        method147(var10);
                                                    } else if (Statics.field1672 == var10 && field378 == var146) {
                                                        int var155 = class132.field2071 - field379;
                                                        int var156 = class132.field2072 * 76101137 - field380;
                                                        if (var155 < 5 && var155 > -5) {
                                                            var155 = 0;
                                                        }
                                                        if (var156 < 5 && var156 > -5) {
                                                            var156 = 0;
                                                        }
                                                        if (field383 < 5) {
                                                            var155 = 0;
                                                            var156 = 0;
                                                        }
                                                        var154.method1492(var149 + var155, var150 + var156, 128);
                                                        if (arg1 != -1) {
                                                            class164 var157 = arg0[arg1 & 0xFFFF];
                                                            if (var150 + var156 < class75.field1343 && var157.field2690 > 0) {
                                                                int var158 = field537 * (class75.field1343 - var150 - var156) / 3;
                                                                if (var158 > field537 * 10) {
                                                                    var158 = field537 * 10;
                                                                }
                                                                if (var158 > var157.field2690) {
                                                                    var158 = var157.field2690;
                                                                }
                                                                var157.field2690 -= var158;
                                                                field380 += var158;
                                                                method147(var157);
                                                            }
                                                            if (var150 + var156 + 32 > class75.field1339 && var157.field2690 < var157.field2692 - var157.field2684) {
                                                                int var159 = field537 * (var150 + var156 + 32 - class75.field1339) / 3;
                                                                if (var159 > field537 * 10) {
                                                                    var159 = field537 * 10;
                                                                }
                                                                if (var159 > var157.field2692 - var157.field2684 - var157.field2690) {
                                                                    var159 = var157.field2692 - var157.field2684 - var157.field2690;
                                                                }
                                                                var157.field2690 += var159;
                                                                field380 -= var159;
                                                                method147(var157);
                                                            }
                                                        }
                                                    } else if (Statics.field2185 == var10 && field377 == var146) {
                                                        var154.method1492(var149, var150, 128);
                                                    } else {
                                                        var154.method1459(var149, var150);
                                                    }
                                                }
                                            } else if (var10.field2737 != null && var146 < 20) {
                                                class74 var160 = var10.method3015(var146);
                                                if (var160 != null) {
                                                    var160.method1459(var149, var150);
                                                } else if (class164.field2666) {
                                                    method147(var10);
                                                }
                                            }
                                            var146++;
                                        }
                                    }
                                } else if (var10.field2670 == 3) {
                                    int var161;
                                    if (method2781(var10)) {
                                        var161 = var10.field2694;
                                        if (Statics.field1980 == var10 && var10.field2696 != 0) {
                                            var161 = var10.field2696;
                                        }
                                    } else {
                                        var161 = var10.field2688;
                                        if (Statics.field1980 == var10 && var10.field2778 != 0) {
                                            var161 = var10.field2778;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2697) {
                                            class75.method1575(var12, var13, var10.field2683, var10.field2684, var161);
                                        } else {
                                            class75.method1557(var12, var13, var10.field2683, var10.field2684, var161);
                                        }
                                    } else if (var10.field2697) {
                                        class75.method1554(var12, var13, var10.field2683, var10.field2684, var161, 256 - (var14 & 0xFF));
                                    } else {
                                        class75.method1558(var12, var13, var10.field2683, var10.field2684, var161, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2670 == 4) {
                                    class215 var162 = var10.method3038();
                                    if (var162 != null) {
                                        String var163 = var10.field2726;
                                        int var164;
                                        if (method2781(var10)) {
                                            var164 = var10.field2694;
                                            if (Statics.field1980 == var10 && var10.field2696 != 0) {
                                                var164 = var10.field2696;
                                            }
                                            if (var10.field2727.length() > 0) {
                                                var163 = var10.field2727;
                                            }
                                        } else {
                                            var164 = var10.field2688;
                                            if (Statics.field1980 == var10 && var10.field2778 != 0) {
                                                var164 = var10.field2778;
                                            }
                                        }
                                        if (var10.field2667 && var10.field2786 != -1) {
                                            class47 var165 = class47.method859(var10.field2786);
                                            var163 = var165.field1049;
                                            if (var163 == null) {
                                                var163 = "null";
                                            }
                                            if ((var165.field1060 == 1 || var10.field2787 != 1) && var10.field2787 != -1) {
                                                var163 = class2.method2969(16748608) + var163 + class2.field25 + " " + 'x' + method130(var10.field2787);
                                            }
                                        }
                                        if (field332 == var10) {
                                            class148 var10000 = (class148) null;
                                            var163 = class148.field2381;
                                            var164 = var10.field2688;
                                        }
                                        if (!var10.field2667) {
                                            var163 = method1898(var163, var10);
                                        }
                                        var162.method3619(var163, var12, var13, var10.field2683, var10.field2684, var164, var10.field2731 ? 0 : -1, var10.field2729, var10.field2730, var10.field2728);
                                    } else if (class164.field2666) {
                                        method147(var10);
                                    }
                                } else if (var10.field2670 == 5) {
                                    if (var10.field2667) {
                                        class74 var167;
                                        if (var10.field2786 == -1) {
                                            var167 = var10.method3014(false);
                                        } else {
                                            var167 = class47.method706(var10.field2786, var10.field2787, var10.field2765, var10.field2706, var10.field2724, false);
                                        }
                                        if (var167 != null) {
                                            int var168 = var167.field1327;
                                            int var169 = var167.field1335;
                                            if (var10.field2704) {
                                                class75.method1550(var12, var13, var10.field2683 + var12, var10.field2684 + var13);
                                                int var170 = (var10.field2683 + (var168 - 1)) / var168;
                                                int var171 = (var10.field2684 + (var169 - 1)) / var169;
                                                for (int var172 = 0; var172 < var170; var172++) {
                                                    for (int var173 = 0; var173 < var171; var173++) {
                                                        if (var10.field2703 != 0) {
                                                            var167.method1472(var168 / 2 + var168 * var172 + var12, var169 / 2 + var169 * var173 + var13, var10.field2703, 4096);
                                                        } else if (var14 == 0) {
                                                            var167.method1459(var168 * var172 + var12, var169 * var173 + var13);
                                                        } else {
                                                            var167.method1492(var168 * var172 + var12, var169 * var173 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method1549(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var174 = var10.field2683 * 4096 / var168;
                                                if (var10.field2703 != 0) {
                                                    var167.method1472(var10.field2683 / 2 + var12, var10.field2684 / 2 + var13, var10.field2703, var174);
                                                } else if (var14 != 0) {
                                                    var167.method1467(var12, var13, var10.field2683, var10.field2684, 256 - (var14 & 0xFF));
                                                } else if (var10.field2683 == var168 && var10.field2684 == var169) {
                                                    var167.method1459(var12, var13);
                                                } else {
                                                    var167.method1461(var12, var13, var10.field2683, var10.field2684);
                                                }
                                            }
                                        } else if (class164.field2666) {
                                            method147(var10);
                                        }
                                    } else {
                                        class74 var166 = var10.method3014(method2781(var10));
                                        if (var166 != null) {
                                            var166.method1459(var12, var13);
                                        } else if (class164.field2666) {
                                            method147(var10);
                                        }
                                    }
                                } else if (var10.field2670 == 6) {
                                    boolean var175 = method2781(var10);
                                    int var176;
                                    if (var175) {
                                        var176 = var10.field2714;
                                    } else {
                                        var176 = var10.field2721;
                                    }
                                    class100 var177 = null;
                                    int var178 = 0;
                                    if (var10.field2786 != -1) {
                                        class47 var179 = class47.method859(var10.field2786);
                                        if (var179 != null) {
                                            class47 var180 = var179.method921(var10.field2787);
                                            var177 = var180.method904(1);
                                            if (var177 == null) {
                                                method147(var10);
                                            } else {
                                                var177.method2000();
                                                var178 = var177.field1383 / 2;
                                            }
                                        }
                                    } else if (var10.field2709 == 5) {
                                        if (var10.field2745 == 0) {
                                            var177 = field543.method3096((class40) null, -1, (class40) null, -1);
                                        } else {
                                            var177 = Statics.field2098.method16();
                                        }
                                    } else if (var176 == -1) {
                                        var177 = var10.method3016((class40) null, -1, var175, Statics.field2098.field36);
                                        if (var177 == null && class164.field2666) {
                                            method147(var10);
                                        }
                                    } else {
                                        class40 var181 = class40.method547(var176);
                                        var177 = var10.method3016(var181, var10.field2788, var175, Statics.field2098.field36);
                                        if (var177 == null && class164.field2666) {
                                            method147(var10);
                                        }
                                    }
                                    class86.method1812(var10.field2683 / 2 + var12, var10.field2684 / 2 + var13);
                                    int var182 = var10.field2762 * class86.field1510[var10.field2739] >> 16;
                                    int var183 = var10.field2762 * class86.field1501[var10.field2739] >> 16;
                                    if (var177 != null) {
                                        if (var10.field2667) {
                                            var177.method2000();
                                            if (var10.field2723) {
                                                var177.method2013(0, var10.field2673, var10.field2719, var10.field2739, var10.field2715, var10.field2716 + var178 + var182, var10.field2716 + var183, var10.field2762);
                                            } else {
                                                var177.method2012(0, var10.field2673, var10.field2719, var10.field2739, var10.field2715, var10.field2716 + var178 + var182, var10.field2716 + var183);
                                            }
                                        } else {
                                            var177.method2012(0, var10.field2673, 0, var10.field2739, 0, var182, var183);
                                        }
                                    }
                                    class86.method1811();
                                } else {
                                    if (var10.field2670 == 7) {
                                        class215 var184 = var10.method3038();
                                        if (var184 == null) {
                                            if (class164.field2666) {
                                                method147(var10);
                                            }
                                            continue;
                                        }
                                        int var185 = 0;
                                        for (int var186 = 0; var186 < var10.field2680; var186++) {
                                            for (int var187 = 0; var187 < var10.field2747; var187++) {
                                                if (var10.field2784[var185] > 0) {
                                                    class47 var188 = class47.method859(var10.field2784[var185] - 1);
                                                    String var189;
                                                    if (var188.field1060 != 1 && var10.field2693[var185] == 1) {
                                                        var189 = class2.method2969(16748608) + var188.field1049 + class2.field25;
                                                    } else {
                                                        var189 = class2.method2969(16748608) + var188.field1049 + class2.field25 + " " + 'x' + method130(var10.field2693[var185]);
                                                    }
                                                    int var190 = (var10.field2732 + 115) * var187 + var12;
                                                    int var191 = (var10.field2733 + 12) * var186 + var13;
                                                    if (var10.field2729 == 0) {
                                                        var184.method3616(var189, var190, var191, var10.field2688, var10.field2731 ? 0 : -1);
                                                    } else if (var10.field2729 == 1) {
                                                        var184.method3667(var189, var10.field2683 / 2 + var190, var191, var10.field2688, var10.field2731 ? 0 : -1);
                                                    } else {
                                                        var184.method3618(var189, var10.field2683 + var190 - 1, var191, var10.field2688, var10.field2731 ? 0 : -1);
                                                    }
                                                }
                                                var185++;
                                            }
                                        }
                                    }
                                    if (var10.field2670 == 8 && Statics.field2923 == var10 && field419 == field418) {
                                        int var192 = 0;
                                        int var193 = 0;
                                        class215 var194 = Statics.field2059;
                                        String var195 = var10.field2726;
                                        String var196 = method1898(var195, var10);
                                        while (var196.length() > 0) {
                                            int var197 = var196.indexOf(class2.field24);
                                            String var198;
                                            if (var197 == -1) {
                                                var198 = var196;
                                                var196 = "";
                                            } else {
                                                var198 = var196.substring(0, var197);
                                                var196 = var196.substring(var197 + 4);
                                            }
                                            int var199 = var194.method3611(var198);
                                            if (var199 > var192) {
                                                var192 = var199;
                                            }
                                            var193 += var194.field3088 + 1;
                                        }
                                        var192 += 6;
                                        var193 += 7;
                                        int var200 = var10.field2683 + var12 - 5 - var192;
                                        int var201 = var10.field2684 + var13 + 5;
                                        if (var200 < var12 + 5) {
                                            var200 = var12 + 5;
                                        }
                                        if (var192 + var200 > arg4) {
                                            var200 = arg4 - var192;
                                        }
                                        if (var193 + var201 > arg5) {
                                            var201 = arg5 - var193;
                                        }
                                        class75.method1575(var200, var201, var192, var193, 16777120);
                                        class75.method1557(var200, var201, var192, var193, 0);
                                        String var202 = var10.field2726;
                                        int var203 = var194.field3088 + var201 + 2;
                                        String var204 = method1898(var202, var10);
                                        while (var204.length() > 0) {
                                            int var205 = var204.indexOf(class2.field24);
                                            String var206;
                                            if (var205 == -1) {
                                                var206 = var204;
                                                var204 = "";
                                            } else {
                                                var206 = var204.substring(0, var205);
                                                var204 = var204.substring(var205 + 4);
                                            }
                                            var194.method3616(var206, var200 + 3, var203, 0, -1);
                                            var203 += var194.field3088 + 1;
                                        }
                                    }
                                    if (var10.field2670 == 9) {
                                        if (var10.field2699 == 1) {
                                            int var207;
                                            int var208;
                                            int var209;
                                            int var210;
                                            if (var10.field2700) {
                                                var207 = var12;
                                                var208 = var10.field2684 + var13;
                                                var209 = var10.field2683 + var12;
                                                var210 = var13;
                                            } else {
                                                var207 = var12;
                                                var208 = var13;
                                                var209 = var10.field2683 + var12;
                                                var210 = var10.field2684 + var13;
                                            }
                                            class75.method1563(var207, var208, var209, var210, var10.field2688);
                                        } else {
                                            int var211 = var10.field2683 >= 0 ? var10.field2683 : -var10.field2683;
                                            int var212 = var10.field2684 >= 0 ? var10.field2684 : -var10.field2684;
                                            int var213 = var211;
                                            if (var211 < var212) {
                                                var213 = var212;
                                            }
                                            if (var213 != 0) {
                                                int var214 = (var10.field2683 << 16) / var213;
                                                int var215 = (var10.field2684 << 16) / var213;
                                                if (var215 <= var214) {
                                                    var214 = -var214;
                                                } else {
                                                    var215 = -var215;
                                                }
                                                int var216 = var10.field2699 * var215 >> 17;
                                                int var217 = var10.field2699 * var215 + 1 >> 17;
                                                int var218 = var10.field2699 * var214 >> 17;
                                                int var219 = var10.field2699 * var214 + 1 >> 17;
                                                int var220 = var12 + var216;
                                                int var221 = var12 - var217;
                                                int var222 = var10.field2683 + var12 - var217;
                                                int var223 = var10.field2683 + var12 + var216;
                                                int var224 = var13 + var218;
                                                int var225 = var13 - var219;
                                                int var226 = var10.field2684 + var13 - var219;
                                                int var227 = var10.field2684 + var13 + var218;
                                                class86.method1817(var220, var221, var222);
                                                class86.method1820(var224, var225, var226, var220, var221, var222, var10.field2688);
                                                class86.method1817(var220, var222, var223);
                                                class86.method1820(var224, var226, var227, var220, var222, var223, var10.field2688);
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

    @ObfuscatedName("cz.cm(Ljava/lang/String;Lfb;S)Ljava/lang/String;")
    public static String method1898(String arg0, class164 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method532(method93(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field781 != null) {
                    var5 = class154.method2085(Statics.field781.field2139);
                    if (Statics.field781.field2134 != null) {
                        var5 = (String) Statics.field781.field2134;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("w.ce(IS)Ljava/lang/String;")
    public static final String method130(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field29 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2969(65408) + var1.substring(0, var1.length() - 8) + class148.field2441 + " " + class2.field33 + var1 + class2.field22 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method2969(16777215) + var1.substring(0, var1.length() - 4) + class148.field2415 + " " + class2.field33 + var1 + class2.field22 + class2.field25;
        } else {
            return " " + class2.method2969(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("q.cn(ZB)V")
    public static final void method74(boolean arg0) {
        int var1 = field258;
        int var2 = Statics.field178;
        int var3 = Statics.field2125;
        if (class164.method511(var1)) {
            method701(Statics.field2685[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("as.cb(Lfb;I)V")
    public static void method703(class164 arg0) {
        class164 var1 = arg0.field2687 == -1 ? null : class164.method2744(arg0.field2687);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field178;
            var3 = Statics.field2125;
        } else {
            var2 = var1.field2683;
            var3 = var1.field2684;
        }
        method1803(arg0, var2, var3, false);
        method486(arg0, var2, var3);
    }

    @ObfuscatedName("b.cl([Lfb;Lfb;ZB)V")
    public static void method97(class164[] arg0, class164 arg1, boolean arg2) {
        int var3 = arg1.field2691 == 0 ? arg1.field2683 : arg1.field2691;
        int var4 = arg1.field2692 == 0 ? arg1.field2684 : arg1.field2692;
        method701(arg0, arg1.field2792, var3, var4, arg2);
        if (arg1.field2790 != null) {
            method701(arg1.field2790, arg1.field2792, var3, var4, arg2);
        }
        class4 var5 = (class4) field522.method3357((long) arg1.field2792);
        if (var5 != null) {
            int var6 = var5.field61;
            if (class164.method511(var6)) {
                method701(Statics.field2685[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2672 == 1337) {
        }
    }

    @ObfuscatedName("as.cw([Lfb;IIIZB)V")
    public static void method701(class164[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class164 var6 = arg0[var5];
            if (var6 != null && var6.field2687 == arg1) {
                method1803(var6, arg2, arg3, arg4);
                method486(var6, arg2, arg3);
                if (var6.field2785 > var6.field2691 - var6.field2683) {
                    var6.field2785 = var6.field2691 - var6.field2683;
                }
                if (var6.field2785 < 0) {
                    var6.field2785 = 0;
                }
                if (var6.field2690 > var6.field2692 - var6.field2684) {
                    var6.field2690 = var6.field2692 - var6.field2684;
                }
                if (var6.field2690 < 0) {
                    var6.field2690 = 0;
                }
                if (var6.field2670 == 0) {
                    method97(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cu.cz(Lfb;IIZB)V")
    public static void method1803(class164 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2683;
        int var5 = arg0.field2684;
        if (arg0.field2675 == 0) {
            arg0.field2683 = arg0.field2747;
        } else if (arg0.field2675 == 1) {
            arg0.field2683 = arg1 - arg0.field2747;
        } else if (arg0.field2675 == 2) {
            arg0.field2683 = arg0.field2747 * arg1 >> 14;
        }
        if (arg0.field2676 == 0) {
            arg0.field2684 = arg0.field2680;
        } else if (arg0.field2676 == 1) {
            arg0.field2684 = arg2 - arg0.field2680;
        } else if (arg0.field2676 == 2) {
            arg0.field2684 = arg0.field2680 * arg2 >> 14;
        }
        if (arg0.field2675 == 4) {
            arg0.field2683 = arg0.field2782 * arg0.field2684 / arg0.field2695;
        }
        if (arg0.field2676 == 4) {
            arg0.field2684 = arg0.field2695 * arg0.field2683 / arg0.field2782;
        }
        if (field437 && arg0.field2670 == 0) {
            if (arg0.field2684 < 5 && arg0.field2683 < 5) {
                arg0.field2684 = 5;
                arg0.field2683 = 5;
            } else {
                if (arg0.field2684 <= 0) {
                    arg0.field2684 = 5;
                }
                if (arg0.field2683 <= 0) {
                    arg0.field2683 = 5;
                }
            }
        }
        if (arg0.field2672 == 1337) {
            field439 = arg0;
        }
        if (arg3 && arg0.field2668 != null && (arg0.field2683 != var4 || arg0.field2684 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field11 = arg0.field2668;
            field468.method3391(var6);
        }
    }

    @ObfuscatedName("client.cc(Lfb;IIB)V")
    public static void method486(class164 arg0, int arg1, int arg2) {
        if (arg0.field2722 == 0) {
            arg0.field2681 = arg0.field2677;
        } else if (arg0.field2722 == 1) {
            arg0.field2681 = (arg1 - arg0.field2683) / 2 + arg0.field2677;
        } else if (arg0.field2722 == 2) {
            arg0.field2681 = arg1 - arg0.field2683 - arg0.field2677;
        } else if (arg0.field2722 == 3) {
            arg0.field2681 = arg0.field2677 * arg1 >> 14;
        } else if (arg0.field2722 == 4) {
            arg0.field2681 = (arg0.field2677 * arg1 >> 14) + (arg1 - arg0.field2683) / 2;
        } else {
            arg0.field2681 = arg1 - arg0.field2683 - (arg0.field2677 * arg1 >> 14);
        }
        if (arg0.field2674 == 0) {
            arg0.field2682 = arg0.field2678;
        } else if (arg0.field2674 == 1) {
            arg0.field2682 = (arg2 - arg0.field2684) / 2 + arg0.field2678;
        } else if (arg0.field2674 == 2) {
            arg0.field2682 = arg2 - arg0.field2684 - arg0.field2678;
        } else if (arg0.field2674 == 3) {
            arg0.field2682 = arg0.field2678 * arg2 >> 14;
        } else if (arg0.field2674 == 4) {
            arg0.field2682 = (arg0.field2678 * arg2 >> 14) + (arg2 - arg0.field2684) / 2;
        } else {
            arg0.field2682 = arg2 - arg0.field2684 - (arg0.field2678 * arg2 >> 14);
        }
        if (!field437 || arg0.field2670 != 0) {
            return;
        }
        if (arg0.field2681 < 0) {
            arg0.field2681 = 0;
        } else if (arg0.field2683 + arg0.field2681 > arg1) {
            arg0.field2681 = arg1 - arg0.field2683;
        }
        if (arg0.field2682 < 0) {
            arg0.field2682 = 0;
        } else if (arg0.field2684 + arg0.field2682 > arg2) {
            arg0.field2682 = arg2 - arg0.field2684;
        }
    }

    @ObfuscatedName("p.cq(IIIIII)V")
    public static final void method526(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field165[0].method1613(arg0, arg1);
        Statics.field165[1].method1613(arg0, arg1 + arg3 - 16);
        class75.method1575(arg0, arg1 + 16, 16, arg3 - 32, field343);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class75.method1575(arg0, arg1 + 16 + var6, 16, var5, field344);
        class75.method1546(arg0, arg1 + 16 + var6, var5, field346);
        class75.method1546(arg0 + 1, arg1 + 16 + var6, var5, field346);
        class75.method1592(arg0, arg1 + 16 + var6, 16, field346);
        class75.method1592(arg0, arg1 + 17 + var6, 16, field346);
        class75.method1546(arg0 + 15, arg1 + 16 + var6, var5, field345);
        class75.method1546(arg0 + 14, arg1 + 17 + var6, var5 - 1, field345);
        class75.method1592(arg0, arg1 + 15 + var6 + var5, 16, field345);
        class75.method1592(arg0 + 1, arg1 + 14 + var6 + var5, 15, field345);
    }

    @ObfuscatedName("c.cx(II)Ljava/lang/String;")
    public static final String method532(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("eu.co(Lfb;I)Z")
    public static final boolean method2781(class164 arg0) {
        if (arg0.field2779 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2779.length; var1++) {
            int var2 = method93(arg0, var1);
            int var3 = arg0.field2799[var1];
            if (arg0.field2779[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2779[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2779[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("v.ci(Lfb;II)I")
    public static final int method93(class164 arg0, int arg1) {
        if (arg0.field2774 == null || arg1 >= arg0.field2774.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2774[arg1];
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
                    var7 = field353[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field302[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field409[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class164 var11 = class164.method2744(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class47.method859(var12).field1062 || field265)) {
                        for (int var13 = 0; var13 < var11.field2784.length; var13++) {
                            if (var12 + 1 == var11.field2784[var13]) {
                                var7 += var11.field2693[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class167.field2816[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class146.field2207[field302[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class167.field2816[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2098.field39;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class146.field2209[var14]) {
                            var7 += field302[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class164 var17 = class164.method2744(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class47.method859(var18).field1062 || field265)) {
                        for (int var19 = 0; var19 < var17.field2784.length; var19++) {
                            if (var18 + 1 == var17.field2784[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field270;
                }
                if (var6 == 12) {
                    var7 = field318;
                }
                if (var6 == 13) {
                    int var20 = class167.field2816[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class167.method14(var22);
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
                    var7 = (Statics.field2098.field802 >> 7) + Statics.field2052;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2098.field762 >> 7) + Statics.field613;
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

    @ObfuscatedName("ab.ch(IIIIIIII)V")
    public static final void method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class164.method511(arg0)) {
            method3117(Statics.field2685[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("fo.ca([Lfb;IIIIIIII)V")
    public static final void method3117(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class164 var9 = arg0[var8];
            if (var9 != null && (!var9.field2667 || var9.field2670 == 0 || var9.field2746 || method588(var9) != 0 || field511 == var9 || var9.field2672 == 1338) && var9.field2687 == arg1 && (!var9.field2667 || !method792(var9))) {
                int var10 = var9.field2681 + arg6;
                int var11 = var9.field2682 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2670 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2670 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2683 + var10;
                    int var19 = var9.field2684 + var11;
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
                    int var22 = var9.field2683 + var10;
                    int var23 = var9.field2684 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field361 == var9) {
                    field448 = true;
                    field449 = var10;
                    field450 = var11;
                }
                if (!var9.field2667 || var12 < var14 && var13 < var15) {
                    int var24 = class132.field2071;
                    int var25 = class132.field2072 * 76101137;
                    if (class132.field2068 != 0) {
                        var24 = class132.field2077;
                        var25 = class132.field2079;
                    }
                    if (var9.field2672 == 1337) {
                        if (!field300 && !field408 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method64(var24, var25, var12, var13);
                        }
                    } else if (var9.field2672 != 1338) {
                        if (!field408 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var40 = var24 - var10;
                            int var41 = var25 - var11;
                            if (var9.field2713 == 1) {
                                method24(var9.field2783, "", 24, 0, 0, var9.field2792);
                            }
                            if (var9.field2713 == 2 && !field422) {
                                String var42 = method2373(var9);
                                if (var42 != null) {
                                    method24(var42, class2.method2969(65280) + var9.field2791, 25, 0, -1, var9.field2792);
                                }
                            }
                            if (var9.field2713 == 3) {
                                method24(class148.field2382, "", 26, 0, 0, var9.field2792);
                            }
                            if (var9.field2713 == 4) {
                                method24(var9.field2783, "", 28, 0, 0, var9.field2792);
                            }
                            if (var9.field2713 == 5) {
                                method24(var9.field2783, "", 29, 0, 0, var9.field2792);
                            }
                            if (var9.field2713 == 6 && field332 == null) {
                                method24(var9.field2783, "", 30, 0, -1, var9.field2792);
                            }
                            if (var9.field2670 == 2) {
                                int var43 = 0;
                                for (int var44 = 0; var44 < var9.field2684; var44++) {
                                    for (int var45 = 0; var45 < var9.field2683; var45++) {
                                        int var46 = (var9.field2732 + 32) * var45;
                                        int var47 = (var9.field2733 + 32) * var44;
                                        if (var43 < 20) {
                                            var46 += var9.field2734[var43];
                                            var47 += var9.field2768[var43];
                                        }
                                        if (var40 >= var46 && var41 >= var47 && var40 < var46 + 32 && var41 < var47 + 32) {
                                            field517 = var43;
                                            Statics.field129 = var9;
                                            if (var9.field2784[var43] > 0) {
                                                label996: {
                                                    class47 var48 = class47.method859(var9.field2784[var43] - 1);
                                                    if (field508 == 1) {
                                                        int var49 = method588(var9);
                                                        boolean var50 = (var49 >> 30 & 0x1) != 0;
                                                        if (var50) {
                                                            if (Statics.field756 != var9.field2792 || Statics.field2005 != var43) {
                                                                method24(class148.field2373, field421 + " " + class2.field23 + " " + class2.method2969(16748608) + var48.field1049, 31, var48.field1071, var43, var9.field2792);
                                                            }
                                                            break label996;
                                                        }
                                                    }
                                                    if (field422) {
                                                        int var51 = method588(var9);
                                                        boolean var52 = (var51 >> 30 & 0x1) != 0;
                                                        if (var52) {
                                                            if ((Statics.field121 & 0x10) == 16) {
                                                                method24(field425, field362 + " " + class2.field23 + " " + class2.method2969(16748608) + var48.field1049, 32, var48.field1071, var43, var9.field2792);
                                                            }
                                                            break label996;
                                                        }
                                                    }
                                                    String[] var53 = var48.field1058;
                                                    if (field438) {
                                                        var53 = method2105(var53);
                                                    }
                                                    int var54 = method588(var9);
                                                    boolean var55 = (var54 >> 30 & 0x1) != 0;
                                                    if (var55) {
                                                        for (int var56 = 4; var56 >= 3; var56--) {
                                                            if (var53 != null && var53[var56] != null) {
                                                                byte var57;
                                                                if (var56 == 3) {
                                                                    var57 = 36;
                                                                } else {
                                                                    var57 = 37;
                                                                }
                                                                method24(var53[var56], class2.method2969(16748608) + var48.field1049, var57, var48.field1071, var43, var9.field2792);
                                                            } else if (var56 == 4) {
                                                                method24(class148.field2224, class2.method2969(16748608) + var48.field1049, 37, var48.field1071, var43, var9.field2792);
                                                            }
                                                        }
                                                    }
                                                    int var58 = method588(var9);
                                                    boolean var59 = (var58 >> 31 & 0x1) != 0;
                                                    if (var59) {
                                                        method24(class148.field2373, class2.method2969(16748608) + var48.field1049, 38, var48.field1071, var43, var9.field2792);
                                                    }
                                                    int var60 = method588(var9);
                                                    boolean var61 = (var60 >> 30 & 0x1) != 0;
                                                    if (var61 && var53 != null) {
                                                        for (int var62 = 2; var62 >= 0; var62--) {
                                                            if (var53[var62] != null) {
                                                                byte var63 = 0;
                                                                if (var62 == 0) {
                                                                    var63 = 33;
                                                                }
                                                                if (var62 == 1) {
                                                                    var63 = 34;
                                                                }
                                                                if (var62 == 2) {
                                                                    var63 = 35;
                                                                }
                                                                method24(var53[var62], class2.method2969(16748608) + var48.field1049, var63, var48.field1071, var43, var9.field2792);
                                                            }
                                                        }
                                                    }
                                                    String[] var64 = var9.field2659;
                                                    if (field438) {
                                                        var64 = method2105(var64);
                                                    }
                                                    if (var64 != null) {
                                                        for (int var65 = 4; var65 >= 0; var65--) {
                                                            if (var64[var65] != null) {
                                                                byte var66 = 0;
                                                                if (var65 == 0) {
                                                                    var66 = 39;
                                                                }
                                                                if (var65 == 1) {
                                                                    var66 = 40;
                                                                }
                                                                if (var65 == 2) {
                                                                    var66 = 41;
                                                                }
                                                                if (var65 == 3) {
                                                                    var66 = 42;
                                                                }
                                                                if (var65 == 4) {
                                                                    var66 = 43;
                                                                }
                                                                method24(var64[var65], class2.method2969(16748608) + var48.field1049, var66, var48.field1071, var43, var9.field2792);
                                                            }
                                                        }
                                                    }
                                                    method24(class148.field2326, class2.method2969(16748608) + var48.field1049, 1005, var48.field1071, var43, var9.field2792);
                                                }
                                            }
                                        }
                                        var43++;
                                    }
                                }
                            }
                            if (var9.field2667) {
                                if (field422) {
                                    int var67 = method588(var9);
                                    boolean var68 = (var67 >> 21 & 0x1) != 0;
                                    if (var68 && (Statics.field121 & 0x20) == 32) {
                                        method24(field425, field362 + " " + class2.field23 + " " + var9.field2736, 58, 0, var9.field2669, var9.field2792);
                                    }
                                } else {
                                    for (int var69 = 9; var69 >= 5; var69--) {
                                        String var70 = method2790(var9, var69);
                                        if (var70 != null) {
                                            method24(var70, var9.field2736, 1007, var69 + 1, var9.field2669, var9.field2792);
                                        }
                                    }
                                    String var71 = method2373(var9);
                                    if (var71 != null) {
                                        method24(var71, var9.field2736, 25, 0, var9.field2669, var9.field2792);
                                    }
                                    for (int var72 = 4; var72 >= 0; var72--) {
                                        String var73 = method2790(var9, var72);
                                        if (var73 != null) {
                                            method24(var73, var9.field2736, 57, var72 + 1, var9.field2669, var9.field2792);
                                        }
                                    }
                                    int var74 = method588(var9);
                                    boolean var75 = (var74 & 0x1) != 0;
                                    if (var75) {
                                        method24(class148.field2228, "", 30, 0, var9.field2669, var9.field2792);
                                    }
                                }
                            }
                        }
                        if (var9.field2670 == 0) {
                            if (!var9.field2667 && method792(var9) && Statics.field1980 != var9) {
                                continue;
                            }
                            method3117(arg0, var9.field2792, var12, var13, var14, var15, var10 - var9.field2785, var11 - var9.field2690);
                            if (var9.field2790 != null) {
                                method3117(var9.field2790, var9.field2792, var12, var13, var14, var15, var10 - var9.field2785, var11 - var9.field2690);
                            }
                            class4 var76 = (class4) field522.method3357((long) var9.field2792);
                            if (var76 != null) {
                                if (var76.field63 == 0 && class132.field2071 >= var12 && class132.field2072 * 76101137 >= var13 && class132.field2071 < var14 && class132.field2072 * 76101137 < var15 && !field408 && !field437) {
                                    field414[0] = class148.field2393;
                                    field366[0] = "";
                                    field545[0] = 1006;
                                    field320 = 1;
                                }
                                method638(var76.field61, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2667) {
                            if (var9.field2718 && class132.field2071 >= var12 && class132.field2072 * 76101137 >= var13 && class132.field2071 < var14 && class132.field2072 * 76101137 < var15) {
                                for (class1 var77 = (class1) field468.method3396(); var77 != null; var77 = (class1) field468.method3398()) {
                                    if (var77.field2) {
                                        var77.method3482();
                                        var77.field3.field2775 = false;
                                    }
                                }
                                if (Statics.field254 == 0) {
                                    field361 = null;
                                    field511 = null;
                                }
                                if (!field408) {
                                    field414[0] = class148.field2393;
                                    field366[0] = "";
                                    field545[0] = 1006;
                                    field320 = 1;
                                }
                            }
                            boolean var78;
                            if (class132.field2071 >= var12 && class132.field2072 * 76101137 >= var13 && class132.field2071 < var14 && class132.field2072 * 76101137 < var15) {
                                var78 = true;
                            } else {
                                var78 = false;
                            }
                            boolean var79 = false;
                            if ((class132.field2070 == 1 || !Statics.field213 && class132.field2070 == 4) && var78) {
                                var79 = true;
                            }
                            boolean var80 = false;
                            if ((class132.field2068 == 1 || !Statics.field213 && class132.field2068 == 4) && class132.field2077 >= var12 && class132.field2079 >= var13 && class132.field2077 < var14 && class132.field2079 < var15) {
                                var80 = true;
                            }
                            if (var80) {
                                method2089(var9, class132.field2077 - var10, class132.field2079 - var11);
                            }
                            if (field361 != null && field361 != var9 && var78) {
                                int var81 = method588(var9);
                                boolean var82 = (var81 >> 20 & 0x1) != 0;
                                if (var82) {
                                    field444 = var9;
                                }
                            }
                            if (field511 == var9) {
                                field445 = true;
                                field446 = var10;
                                field335 = var11;
                            }
                            if (var9.field2746) {
                                if (var78 && field467 != 0 && var9.field2767 != null) {
                                    class1 var83 = new class1();
                                    var83.field2 = true;
                                    var83.field3 = var9;
                                    var83.field5 = field467;
                                    var83.field11 = var9.field2767;
                                    field468.method3391(var83);
                                }
                                if (field361 != null || Statics.field1672 != null || field408) {
                                    var80 = false;
                                    var79 = false;
                                    var78 = false;
                                }
                                if (!var9.field2763 && var80) {
                                    var9.field2763 = true;
                                    if (var9.field2748 != null) {
                                        class1 var84 = new class1();
                                        var84.field2 = true;
                                        var84.field3 = var9;
                                        var84.field4 = class132.field2077 - var10;
                                        var84.field5 = class132.field2079 - var11;
                                        var84.field11 = var9.field2748;
                                        field468.method3391(var84);
                                    }
                                }
                                if (var9.field2763 && var79 && var9.field2756 != null) {
                                    class1 var85 = new class1();
                                    var85.field2 = true;
                                    var85.field3 = var9;
                                    var85.field4 = class132.field2071 - var10;
                                    var85.field5 = class132.field2072 * 76101137 - var11;
                                    var85.field11 = var9.field2756;
                                    field468.method3391(var85);
                                }
                                if (var9.field2763 && !var79) {
                                    var9.field2763 = false;
                                    if (var9.field2710 != null) {
                                        class1 var86 = new class1();
                                        var86.field2 = true;
                                        var86.field3 = var9;
                                        var86.field4 = class132.field2071 - var10;
                                        var86.field5 = class132.field2072 * 76101137 - var11;
                                        var86.field11 = var9.field2710;
                                        field541.method3391(var86);
                                    }
                                }
                                if (var79 && var9.field2751 != null) {
                                    class1 var87 = new class1();
                                    var87.field2 = true;
                                    var87.field3 = var9;
                                    var87.field4 = class132.field2071 - var10;
                                    var87.field5 = class132.field2072 * 76101137 - var11;
                                    var87.field11 = var9.field2751;
                                    field468.method3391(var87);
                                }
                                if (!var9.field2775 && var78) {
                                    var9.field2775 = true;
                                    if (var9.field2743 != null) {
                                        class1 var88 = new class1();
                                        var88.field2 = true;
                                        var88.field3 = var9;
                                        var88.field4 = class132.field2071 - var10;
                                        var88.field5 = class132.field2072 * 76101137 - var11;
                                        var88.field11 = var9.field2743;
                                        field468.method3391(var88);
                                    }
                                }
                                if (var9.field2775 && var78 && var9.field2753 != null) {
                                    class1 var89 = new class1();
                                    var89.field2 = true;
                                    var89.field3 = var9;
                                    var89.field4 = class132.field2071 - var10;
                                    var89.field5 = class132.field2072 * 76101137 - var11;
                                    var89.field11 = var9.field2753;
                                    field468.method3391(var89);
                                }
                                if (var9.field2775 && !var78) {
                                    var9.field2775 = false;
                                    if (var9.field2754 != null) {
                                        class1 var90 = new class1();
                                        var90.field2 = true;
                                        var90.field3 = var9;
                                        var90.field4 = class132.field2071 - var10;
                                        var90.field5 = class132.field2072 * 76101137 - var11;
                                        var90.field11 = var9.field2754;
                                        field541.method3391(var90);
                                    }
                                }
                                if (var9.field2717 != null) {
                                    class1 var91 = new class1();
                                    var91.field3 = var9;
                                    var91.field11 = var9.field2717;
                                    field469.method3391(var91);
                                }
                                if (var9.field2679 != null && field454 > var9.field2794) {
                                    if (var9.field2761 == null || field454 - var9.field2794 > 32) {
                                        class1 var96 = new class1();
                                        var96.field3 = var9;
                                        var96.field11 = var9.field2679;
                                        field468.method3391(var96);
                                    } else {
                                        label745: for (int var92 = var9.field2794; var92 < field454; var92++) {
                                            int var93 = field430[var92 & 0x1F];
                                            for (int var94 = 0; var94 < var9.field2761.length; var94++) {
                                                if (var9.field2761[var94] == var93) {
                                                    class1 var95 = new class1();
                                                    var95.field3 = var9;
                                                    var95.field11 = var9.field2679;
                                                    field468.method3391(var95);
                                                    break label745;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2794 = field454;
                                }
                                if (var9.field2657 != null && field266 > var9.field2795) {
                                    if (var9.field2769 == null || field266 - var9.field2795 > 32) {
                                        class1 var101 = new class1();
                                        var101.field3 = var9;
                                        var101.field11 = var9.field2657;
                                        field468.method3391(var101);
                                    } else {
                                        label721: for (int var97 = var9.field2795; var97 < field266; var97++) {
                                            int var98 = field455[var97 & 0x1F];
                                            for (int var99 = 0; var99 < var9.field2769.length; var99++) {
                                                if (var9.field2769[var99] == var98) {
                                                    class1 var100 = new class1();
                                                    var100.field3 = var9;
                                                    var100.field11 = var9.field2657;
                                                    field468.method3391(var100);
                                                    break label721;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2795 = field266;
                                }
                                if (var9.field2750 != null && field458 > var9.field2798) {
                                    if (var9.field2764 == null || field458 - var9.field2798 > 32) {
                                        class1 var106 = new class1();
                                        var106.field3 = var9;
                                        var106.field11 = var9.field2750;
                                        field468.method3391(var106);
                                    } else {
                                        label697: for (int var102 = var9.field2798; var102 < field458; var102++) {
                                            int var103 = field457[var102 & 0x1F];
                                            for (int var104 = 0; var104 < var9.field2764.length; var104++) {
                                                if (var9.field2764[var104] == var103) {
                                                    class1 var105 = new class1();
                                                    var105.field3 = var9;
                                                    var105.field11 = var9.field2750;
                                                    field468.method3391(var105);
                                                    break label697;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2798 = field458;
                                }
                                if (field459 > var9.field2793 && var9.field2720 != null) {
                                    class1 var107 = new class1();
                                    var107.field3 = var9;
                                    var107.field11 = var9.field2720;
                                    field468.method3391(var107);
                                }
                                if (field460 > var9.field2793 && var9.field2686 != null) {
                                    class1 var108 = new class1();
                                    var108.field3 = var9;
                                    var108.field11 = var9.field2686;
                                    field468.method3391(var108);
                                }
                                if (field452 > var9.field2793 && var9.field2771 != null) {
                                    class1 var109 = new class1();
                                    var109.field3 = var9;
                                    var109.field11 = var9.field2771;
                                    field468.method3391(var109);
                                }
                                if (field462 > var9.field2793 && var9.field2776 != null) {
                                    class1 var110 = new class1();
                                    var110.field3 = var9;
                                    var110.field11 = var9.field2776;
                                    field468.method3391(var110);
                                }
                                if (field463 > var9.field2793 && var9.field2689 != null) {
                                    class1 var111 = new class1();
                                    var111.field3 = var9;
                                    var111.field11 = var9.field2689;
                                    field468.method3391(var111);
                                }
                                if (field314 > var9.field2793 && var9.field2772 != null) {
                                    class1 var112 = new class1();
                                    var112.field3 = var9;
                                    var112.field11 = var9.field2772;
                                    field468.method3391(var112);
                                }
                                var9.field2793 = field521;
                                if (var9.field2735 != null) {
                                    for (int var113 = 0; var113 < field493; var113++) {
                                        class1 var114 = new class1();
                                        var114.field3 = var9;
                                        var114.field17 = field381[var113];
                                        var114.field1 = field494[var113];
                                        var114.field11 = var9.field2735;
                                        field468.method3391(var114);
                                    }
                                }
                            }
                        }
                        if (!var9.field2667 && field361 == null && Statics.field1672 == null && !field408) {
                            if ((var9.field2781 >= 0 || var9.field2778 != 0) && class132.field2071 >= var12 && class132.field2072 * 76101137 >= var13 && class132.field2071 < var14 && class132.field2072 * 76101137 < var15) {
                                if (var9.field2781 >= 0) {
                                    Statics.field1980 = arg0[var9.field2781];
                                } else {
                                    Statics.field1980 = var9;
                                }
                            }
                            if (var9.field2670 == 8 && class132.field2071 >= var12 && class132.field2072 * 76101137 >= var13 && class132.field2071 < var14 && class132.field2072 * 76101137 < var15) {
                                Statics.field2923 = var9;
                            }
                            if (var9.field2692 > var9.field2684) {
                                int var115 = var9.field2683 + var10;
                                int var116 = var9.field2684;
                                int var117 = var9.field2692;
                                int var118 = class132.field2071;
                                int var119 = class132.field2072 * 76101137;
                                if (field391) {
                                    field348 = 32;
                                } else {
                                    field348 = 0;
                                }
                                field391 = false;
                                if (class132.field2070 == 1 || !Statics.field213 && class132.field2070 == 4) {
                                    if (var118 >= var115 && var118 < var115 + 16 && var119 >= var11 && var119 < var11 + 16) {
                                        var9.field2690 -= 4;
                                        method147(var9);
                                    } else if (var118 >= var115 && var118 < var115 + 16 && var119 >= var11 + var116 - 16 && var119 < var11 + var116) {
                                        var9.field2690 += 4;
                                        method147(var9);
                                    } else if (var118 >= var115 - field348 && var118 < field348 + var115 + 16 && var119 >= var11 + 16 && var119 < var11 + var116 - 16) {
                                        int var120 = (var116 - 32) * var116 / var117;
                                        if (var120 < 8) {
                                            var120 = 8;
                                        }
                                        int var121 = var119 - var11 - 16 - var120 / 2;
                                        int var122 = var116 - 32 - var120;
                                        var9.field2690 = (var117 - var116) * var121 / var122;
                                        method147(var9);
                                        field391 = true;
                                    }
                                }
                                if (field467 != 0) {
                                    int var123 = var9.field2683;
                                    if (var118 >= var115 - var123 && var119 >= var11 && var118 < var115 + 16 && var119 <= var11 + var116) {
                                        var9.field2690 += field467 * 45;
                                        method147(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field506 == 0 || field506 == 3) && (class132.field2068 == 1 || !Statics.field213 && class132.field2068 == 4)) {
                        class166 var26 = var9.method3030();
                        if (var26 != null) {
                            int var27 = class132.field2077 - var10;
                            int var28 = class132.field2079 - var11;
                            if (var26.method3069(var27, var28)) {
                                int var29 = var27 - var26.field2814 / 2;
                                int var30 = var28 - var26.field2809 / 2;
                                int var31 = field350 + field333 & 0x7FF;
                                int var32 = class86.field1510[var31];
                                int var33 = class86.field1501[var31];
                                int var34 = (field503 + 256) * var32 >> 8;
                                int var35 = (field503 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field2098.field802 + var36 >> 7;
                                int var39 = Statics.field2098.field762 - var37 >> 7;
                                field284.method2429(238);
                                field284.method2145(18);
                                field284.method2319(Statics.field613 + var39);
                                field284.method2319(Statics.field2052 + var38);
                                field284.method2184(class129.field2027[82] ? (class129.field2027[81] ? 2 : 1) : 0);
                                field284.method2145(var29);
                                field284.method2145(var30);
                                field284.method2319(field350);
                                field284.method2145(57);
                                field284.method2145(field333);
                                field284.method2145(field503);
                                field284.method2145(89);
                                field284.method2319(Statics.field2098.field802);
                                field284.method2319(Statics.field2098.field762);
                                field284.method2145(63);
                                field504 = var38;
                                field282 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.ct(III)V")
    public static final void method896(int arg0, int arg1) {
        if (class164.method511(arg0)) {
            method128(Statics.field2685[arg0], arg1);
        }
    }

    @ObfuscatedName("i.cv([Lfb;II)V")
    public static final void method128(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2670 == 0) {
                    if (var3.field2790 != null) {
                        method128(var3.field2790, arg1);
                    }
                    class4 var4 = (class4) field522.method3357((long) var3.field2792);
                    if (var4 != null) {
                        method896(var4.field61, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2773 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field11 = var3.field2773;
                    class34.method607(var5);
                }
                if (arg1 == 1 && var3.field2741 != null) {
                    if (var3.field2669 >= 0) {
                        class164 var6 = class164.method2744(var3.field2792);
                        if (var6 == null || var6.field2790 == null || var3.field2669 >= var6.field2790.length || var6.field2790[var3.field2669] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field11 = var3.field2741;
                    class34.method607(var7);
                }
            }
        }
    }

    @ObfuscatedName("dv.cp(Lfb;III)V")
    public static final void method2089(class164 arg0, int arg1, int arg2) {
        if (field361 != null || field408 || arg0 == null) {
            return;
        }
        class164 var3 = method2434(arg0);
        if (var3 == null) {
            var3 = arg0.field2760;
        }
        if (var3 == null) {
            return;
        }
        field361 = arg0;
        class164 var5 = method2434(arg0);
        if (var5 == null) {
            var5 = arg0.field2760;
        }
        field511 = var5;
        field442 = arg1;
        field443 = arg2;
        Statics.field254 = 0;
        field451 = false;
        if (field320 > 0) {
            method2797(field320 - 1);
        }
        return;
    }

    @ObfuscatedName("et.dv(IB)V")
    public static void method2797(int arg0) {
        Statics.field1516 = new class29();
        Statics.field1516.field677 = field347[arg0];
        Statics.field1516.field680 = field411[arg0];
        Statics.field1516.field679 = field545[arg0];
        Statics.field1516.field684 = field433[arg0];
        Statics.field1516.field681 = field414[arg0];
    }

    @ObfuscatedName("s.ds(Lfb;S)V")
    public static void method147(class164 arg0) {
        if (field473 == arg0.field2796) {
            field474[arg0.field2749] = true;
        }
    }

    @ObfuscatedName("r.dm(I)V")
    public static void method157() {
        for (class4 var0 = (class4) field522.method3360(); var0 != null; var0 = (class4) field522.method3373()) {
            int var1 = var0.field61;
            if (class164.method511(var1)) {
                boolean var2 = true;
                class164[] var3 = Statics.field2685[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2667;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3024;
                    class164 var6 = class164.method2744(var5);
                    if (var6 != null) {
                        method147(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("di.di([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2105(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("et.dg(II)V")
    public static final void method2795(int arg0) {
        if (!class164.method511(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2685[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3 != null) {
                var3.field2788 = 0;
                var3.field2789 = 0;
            }
        }
    }

    @ObfuscatedName("af.dj([Lfb;IB)V")
    public static final void method766(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null && var3.field2687 == arg1 && (!var3.field2667 || !method792(var3))) {
                if (var3.field2670 == 0) {
                    if (!var3.field2667 && method792(var3) && Statics.field1980 != var3) {
                        continue;
                    }
                    method766(arg0, var3.field2792);
                    if (var3.field2790 != null) {
                        method766(var3.field2790, var3.field2792);
                    }
                    class4 var4 = (class4) field522.method3357((long) var3.field2792);
                    if (var4 != null) {
                        int var5 = var4.field61;
                        if (class164.method511(var5)) {
                            method766(Statics.field2685[var5], -1);
                        }
                    }
                }
                if (var3.field2670 == 6) {
                    if (var3.field2721 != -1 || var3.field2714 != -1) {
                        boolean var6 = method2781(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2714;
                        } else {
                            var7 = var3.field2721;
                        }
                        if (var7 != -1) {
                            class40 var8 = class40.method547(var7);
                            var3.field2789 += field537;
                            while (var3.field2789 > var8.field950[var3.field2788]) {
                                var3.field2789 -= var8.field950[var3.field2788];
                                var3.field2788++;
                                if (var3.field2788 >= var8.field949.length) {
                                    var3.field2788 -= var8.field943;
                                    if (var3.field2788 < 0 || var3.field2788 >= var8.field949.length) {
                                        var3.field2788 = 0;
                                    }
                                }
                                method147(var3);
                            }
                        }
                    }
                    if (var3.field2752 != 0 && !var3.field2667) {
                        int var9 = var3.field2752 >> 16;
                        int var10 = var3.field2752 << 16 >> 16;
                        int var11 = field537 * var9;
                        int var12 = field537 * var10;
                        var3.field2739 = var3.field2739 + var11 & 0x7FF;
                        var3.field2673 = var3.field2673 + var12 & 0x7FF;
                        method147(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.dw(II)V")
    public static final void method125(int arg0) {
        method157();
        for (class22 var1 = (class22) class22.field585.method3396(); var1 != null; var1 = (class22) class22.field585.method3398()) {
            if (var1.field594 != null) {
                var1.method515();
            }
        }
        int var2 = class48.method102(arg0).field1095;
        if (var2 == 0) {
            return;
        }
        int var3 = class167.field2816[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class86.method1814(0.9D);
                ((class90) Statics.field1507).method1887(0.9D);
            }
            if (var3 == 2) {
                class86.method1814(0.8D);
                ((class90) Statics.field1507).method1887(0.8D);
            }
            if (var3 == 3) {
                class86.method1814(0.7D);
                ((class90) Statics.field1507).method1887(0.7D);
            }
            if (var3 == 4) {
                class86.method1814(0.6D);
                ((class90) Statics.field1507).method1887(0.6D);
            }
            class47.method80();
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
            if (field412 != var4) {
                if (field412 == 0 && field429 != -1) {
                    class174.method2487(Statics.field830, field429, 0, var4, false);
                    field509 = false;
                } else if (var4 == 0) {
                    class174.method2786();
                    field509 = false;
                } else {
                    class174.method2737(var4);
                }
                field412 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field520 = 127;
            }
            if (var3 == 1) {
                field520 = 96;
            }
            if (var3 == 2) {
                field520 = 64;
            }
            if (var3 == 3) {
                field520 = 32;
            }
            if (var3 == 4) {
                field520 = 0;
            }
        }
        if (var2 == 5) {
            field407 = var3;
        }
        if (var2 == 6) {
            field456 = var3;
        }
        if (var2 == 9) {
            field393 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field290 = 127;
            }
            if (var3 == 1) {
                field290 = 96;
            }
            if (var3 == 2) {
                field290 = 64;
            }
            if (var3 == 3) {
                field290 = 32;
            }
            if (var3 == 4) {
                field290 = 0;
            }
        }
        if (var2 == 17) {
            field495 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class19[] var5 = new class19[] { class19.field561, class19.field550, class19.field552 };
            field288 = (class19) class101.method529(var5, var3);
            if (field288 == null) {
                field288 = class19.field552;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field341 = -1;
        } else {
            field341 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("fm.dc(Lfb;I)V")
    public static final void method3320(class164 arg0) {
        int var1 = arg0.field2672;
        if (var1 == 324) {
            if (field544 == -1) {
                field544 = arg0.field2701;
                field510 = arg0.field2702;
            }
            if (field543.field2831) {
                arg0.field2701 = field544;
            } else {
                arg0.field2701 = field510;
            }
        } else if (var1 == 325) {
            if (field544 == -1) {
                field544 = arg0.field2701;
                field510 = arg0.field2702;
            }
            if (field543.field2831) {
                arg0.field2701 = field510;
            } else {
                arg0.field2701 = field544;
            }
        } else if (var1 == 327) {
            arg0.field2739 = 150;
            arg0.field2673 = (int) (Math.sin((double) field423 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2709 = 5;
            arg0.field2745 = 0;
        } else if (var1 == 328) {
            arg0.field2739 = 150;
            arg0.field2673 = (int) (Math.sin((double) field423 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2709 = 5;
            arg0.field2745 = 1;
        }
    }

    @ObfuscatedName("k.de(I)V")
    public static final void method13() {
        field284.method2429(51);
        for (class4 var0 = (class4) field522.method3360(); var0 != null; var0 = (class4) field522.method3373()) {
            if (var0.field63 == 0 || var0.field63 == 3) {
                method2095(var0, true);
            }
        }
        if (field332 != null) {
            method147(field332);
            field332 = null;
        }
    }

    @ObfuscatedName("af.db(IIII)Ln;")
    public static final class4 method763(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field61 = arg1;
        var3.field63 = arg2;
        field522.method3358(var3, (long) arg0);
        method2795(arg1);
        class164 var4 = class164.method2744(arg0);
        method147(var4);
        if (field332 != null) {
            method147(field332);
            field332 = null;
        }
        method137();
        method97(Statics.field2685[arg0 >> 16], var4, false);
        class34.method2972(arg1);
        if (field258 != -1) {
            method896(field258, 1);
        }
        return var3;
    }

    @ObfuscatedName("ds.dt(Ln;ZB)V")
    public static final void method2095(class4 arg0, boolean arg1) {
        int var2 = arg0.field61;
        int var3 = (int) arg0.field3024;
        arg0.method3482();
        if (arg1) {
            class164.method1365(var2);
        }
        for (class192 var4 = (class192) field471.method3360(); var4 != null; var4 = (class192) field471.method3373()) {
            if ((var4.field3024 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3482();
            }
        }
        class164 var5 = class164.method2744(var3);
        if (var5 != null) {
            method147(var5);
        }
        method137();
        if (field258 != -1) {
            method896(field258, 1);
        }
    }

    @ObfuscatedName("j.dd(IIIILbb;Lfi;I)V")
    public static final void method134(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method606(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field350 + field333 & 0x7FF;
        int var8 = class86.field1510[var7];
        int var9 = class86.field1501[var7];
        int var10 = var8 * 256 / (field503 + 256);
        int var11 = var9 * 256 / (field503 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1999.method1471(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("au.dh(IIIILbb;Lfi;I)V")
    public static final void method606(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field350 + field333 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class86.field1510[var6];
        int var9 = class86.field1501[var6];
        int var10 = var8 * 256 / (field503 + 256);
        int var11 = var9 * 256 / (field503 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1469(arg5.field2814 / 2 + var12 - arg4.field1327 / 2, arg5.field2809 / 2 - var13 - arg4.field1335 / 2, arg0, arg1, arg5.field2814, arg5.field2809, arg5.field2813, arg5.field2810);
        } else {
            arg4.method1459(arg5.field2814 / 2 + arg0 + var12 - arg4.field1327 / 2, arg5.field2809 / 2 + arg1 - var13 - arg4.field1335 / 2);
        }
    }

    @ObfuscatedName("x.dx(Ljava/lang/String;ZS)Z")
    public static boolean method491(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class155.method2081(arg0, Statics.field1455);
        for (int var3 = 0; var3 < field271; var3++) {
            if (var2.equalsIgnoreCase(class155.method2081(field539[var3].field239, Statics.field1455)) && (!arg1 || field539[var3].field240 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class155.method2081(Statics.field2098.field49, Statics.field1455))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("eu.dr(Ljava/lang/String;B)Z")
    public static boolean method2784(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class155.method2081(arg0, Statics.field1455);
        for (int var2 = 0; var2 < field431; var2++) {
            class8 var3 = field542[var2];
            if (var1.equalsIgnoreCase(class155.method2081(var3.field123, Statics.field1455))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class155.method2081(var3.field124, Statics.field1455))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ek.da(Ljava/lang/String;ZI)V")
    public static final void method2746(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field431 < 100 || field392 == 1) || field431 >= 400) {
            class11.method590(31, "", class148.field2477);
            return;
        }
        String var2 = class155.method2081(arg0, Statics.field1455);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field431; var3++) {
            class8 var4 = field542[var3];
            String var5 = class155.method2081(var4.field123, Statics.field1455);
            if (var5 != null && var5.equals(var2)) {
                class11.method590(31, "", arg0 + class148.field2368);
                return;
            }
            if (var4.field124 != null) {
                String var6 = class155.method2081(var4.field124, Statics.field1455);
                if (var6 != null && var6.equals(var2)) {
                    class11.method590(31, "", arg0 + class148.field2368);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field271; var7++) {
            class17 var8 = field539[var7];
            String var9 = class155.method2081(var8.field239, Statics.field1455);
            if (var9 != null && var9.equals(var2)) {
                class11.method590(31, "", class148.field2397 + arg0 + class148.field2398);
                return;
            }
            if (var8.field247 != null) {
                String var10 = class155.method2081(var8.field247, Statics.field1455);
                if (var10 != null && var10.equals(var2)) {
                    class11.method590(31, "", class148.field2397 + arg0 + class148.field2398);
                    return;
                }
            }
        }
        if (class155.method2081(Statics.field2098.field49, Statics.field1455).equals(var2)) {
            class11.method590(31, "", class148.field2394);
        } else {
            field284.method2429(94);
            field284.method2145(class111.method699(arg0));
            field284.method2298(arg0);
        }
    }

    @ObfuscatedName("s.dq(Ljava/lang/String;I)V")
    public static final void method148(String arg0) {
        if (Statics.field1800 != null) {
            field284.method2429(132);
            field284.method2145(class111.method699(arg0));
            field284.method2298(arg0);
        }
    }

    @ObfuscatedName("o.dk(Lfb;I)I")
    public static int method588(class164 arg0) {
        class192 var1 = (class192) field471.method3357(((long) arg0.field2792 << 32) + (long) arg0.field2669);
        return var1 == null ? arg0.field2738 : var1.field3011;
    }

    @ObfuscatedName("db.dp(Lfb;I)Lfb;")
    public static class164 method2434(class164 arg0) {
        int var1 = method588(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class164.method2744(arg0.field2687);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ay.dl(Lfb;I)Z")
    public static boolean method792(class164 arg0) {
        if (field437) {
            if (method588(arg0) != 0) {
                return false;
            }
            if (arg0.field2670 == 0) {
                return false;
            }
        }
        return arg0.field2671;
    }

    @ObfuscatedName("el.dz(Lfb;II)Ljava/lang/String;")
    public static String method2790(class164 arg0, int arg1) {
        int var2 = method588(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2766 == null) {
            return null;
        } else if (arg0.field2777 == null || arg0.field2777.length <= arg1 || arg0.field2777[arg1] == null || arg0.field2777[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2777[arg1];
        }
    }

    @ObfuscatedName("dw.du(Lfb;I)Ljava/lang/String;")
    public static String method2373(class164 arg0) {
        if (class169.method1895(method588(arg0)) == 0) {
            return null;
        } else if (arg0.field2665 == null || arg0.field2665.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2665;
        }
    }

    @ObfuscatedName("t.df(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method31(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field264 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field264 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field264 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field264 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field264 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field292 != null) {
            var3 = "/p=" + Statics.field292;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field492 + "/a=" + Statics.field2509 + var3 + "/";
    }
}

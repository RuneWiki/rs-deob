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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class136 {

    @ObfuscatedName("client.w")
    public static class220[] field318 = new class220[4];

    @ObfuscatedName("client.e")
    public static boolean field256 = true;

    @ObfuscatedName("client.h")
    public static int field257 = 1;

    @ObfuscatedName("client.q")
    public static int field295 = 0;

    @ObfuscatedName("client.c")
    public static int field493 = 0;

    @ObfuscatedName("client.m")
    public static boolean field455 = false;

    @ObfuscatedName("client.b")
    public static boolean field263 = false;

    @ObfuscatedName("client.v")
    public static int field423 = 0;

    @ObfuscatedName("client.o")
    public static int field266 = 0;

    @ObfuscatedName("client.a")
    public static boolean field267 = true;

    @ObfuscatedName("client.p")
    public static int field268 = 0;

    @ObfuscatedName("client.t")
    public static long field269 = -1L;

    @ObfuscatedName("client.j")
    public static int field270 = -1;

    @ObfuscatedName("client.r")
    public static int field330 = -1;

    @ObfuscatedName("client.at")
    public static int field272 = -1;

    @ObfuscatedName("client.av")
    public static boolean field273 = true;

    @ObfuscatedName("client.ar")
    public static boolean field294 = false;

    @ObfuscatedName("client.aq")
    public static int field452 = 0;

    @ObfuscatedName("client.as")
    public static int field365 = 0;

    @ObfuscatedName("client.ad")
    public static int field513 = 0;

    @ObfuscatedName("client.ap")
    public static int field278 = 0;

    @ObfuscatedName("client.an")
    public static int field279 = 0;

    @ObfuscatedName("client.au")
    public static int field280 = 0;

    @ObfuscatedName("client.aw")
    public static int field281 = 0;

    @ObfuscatedName("client.ag")
    public static int field524 = 0;

    @ObfuscatedName("client.ah")
    public static int field264 = 0;

    @ObfuscatedName("client.ao")
    public static class111 field378 = new class111(new byte[5000]);

    @ObfuscatedName("client.ab")
    public static class19 field437 = class19.field541;

    @ObfuscatedName("client.ay")
    public static int field287 = 0;

    @ObfuscatedName("client.az")
    public static int field505 = 0;

    @ObfuscatedName("client.am")
    public static int field289 = 0;

    @ObfuscatedName("client.bp")
    public static int field424 = 0;

    @ObfuscatedName("client.bq")
    public static int field508 = 0;

    @ObfuscatedName("client.be")
    public static int field387 = 0;

    @ObfuscatedName("client.bo")
    public static int field364 = 0;

    @ObfuscatedName("client.bv")
    public static int field356 = 0;

    @ObfuscatedName("client.cd")
    public static class32[] field536 = new class32[32768];

    @ObfuscatedName("client.cu")
    public static int field296 = 0;

    @ObfuscatedName("client.cf")
    public static int[] field297 = new int[32768];

    @ObfuscatedName("client.ck")
    public static class114 field521 = new class114(5000);

    @ObfuscatedName("client.cv")
    public static class114 field300 = new class114(5000);

    @ObfuscatedName("client.cy")
    public static class114 field301 = new class114(5000);

    @ObfuscatedName("client.cp")
    public static int field284 = 0;

    @ObfuscatedName("client.cn")
    public static int field303 = 0;

    @ObfuscatedName("client.cz")
    public static int field411 = 0;

    @ObfuscatedName("client.ch")
    public static int field529 = 0;

    @ObfuscatedName("client.cl")
    public static int field309 = 0;

    @ObfuscatedName("client.ci")
    public static int field307 = 0;

    @ObfuscatedName("client.cg")
    public static int field308 = 0;

    @ObfuscatedName("client.ce")
    public static int field506 = 0;

    @ObfuscatedName("client.ct")
    public static boolean field310 = false;

    @ObfuscatedName("client.cb")
    public static int field312 = 0;

    @ObfuscatedName("client.di")
    public static int field313 = 0;

    @ObfuscatedName("client.du")
    public static int field480 = 1;

    @ObfuscatedName("client.dl")
    public static int field315 = 0;

    @ObfuscatedName("client.dt")
    public static int field258 = 1;

    @ObfuscatedName("client.do")
    public static int field385 = 0;

    @ObfuscatedName("client.dz")
    public static boolean field319 = false;

    @ObfuscatedName("client.dc")
    public static int[][][] field320 = new int[4][13][13];

    @ObfuscatedName("client.dk")
    public static final int[] field321 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dh")
    public static int field322 = 0;

    @ObfuscatedName("client.dq")
    public static int field470 = 2;

    @ObfuscatedName("client.dm")
    public static int field431 = 0;

    @ObfuscatedName("client.dp")
    public static int field325 = 2;

    @ObfuscatedName("client.ds")
    public static int field341 = 0;

    @ObfuscatedName("client.dr")
    public static int field327 = 1;

    @ObfuscatedName("client.dg")
    public static int field328 = 0;

    @ObfuscatedName("client.en")
    public static int field404 = 0;

    @ObfuscatedName("client.eh")
    public static int field492 = 2;

    @ObfuscatedName("client.ei")
    public static int field291 = 0;

    @ObfuscatedName("client.ef")
    public static int field332 = 1;

    @ObfuscatedName("client.el")
    public static int field333 = 0;

    @ObfuscatedName("client.eo")
    public static int field334 = 0;

    @ObfuscatedName("client.ev")
    public static int field503 = 2301979;

    @ObfuscatedName("client.ex")
    public static int field336 = 5063219;

    @ObfuscatedName("client.ee")
    public static int field337 = 3353893;

    @ObfuscatedName("client.ew")
    public static int field444 = 7759444;

    @ObfuscatedName("client.eg")
    public static boolean field339 = false;

    @ObfuscatedName("client.er")
    public static int field340 = 0;

    @ObfuscatedName("client.fw")
    public static int field415 = 128;

    @ObfuscatedName("client.fc")
    public static int field342 = 0;

    @ObfuscatedName("client.fn")
    public static int field343 = 0;

    @ObfuscatedName("client.fq")
    public static int field290 = 0;

    @ObfuscatedName("client.fj")
    public static int field345 = 0;

    @ObfuscatedName("client.fl")
    public static int field346 = 0;

    @ObfuscatedName("client.fr")
    public static int field347 = 0;

    @ObfuscatedName("client.ft")
    public static boolean field348 = false;

    @ObfuscatedName("client.fv")
    public static int field349 = 0;

    @ObfuscatedName("client.fs")
    public static int field350 = 0;

    @ObfuscatedName("client.fb")
    public static int field351 = 50;

    @ObfuscatedName("client.fa")
    public static int[] field293 = new int[field351];

    @ObfuscatedName("client.fk")
    public static int[] field353 = new int[field351];

    @ObfuscatedName("client.fx")
    public static int[] field354 = new int[field351];

    @ObfuscatedName("client.fp")
    public static int[] field355 = new int[field351];

    @ObfuscatedName("client.fo")
    public static int[] field271 = new int[field351];

    @ObfuscatedName("client.fg")
    public static int[] field357 = new int[field351];

    @ObfuscatedName("client.fz")
    public static int[] field358 = new int[field351];

    @ObfuscatedName("client.fy")
    public static String[] field359 = new String[field351];

    @ObfuscatedName("client.fu")
    public static int[][] field360 = new int[104][104];

    @ObfuscatedName("client.gv")
    public static int field361 = 0;

    @ObfuscatedName("client.gm")
    public static int field362 = -1;

    @ObfuscatedName("client.gd")
    public static int field453 = -1;

    @ObfuscatedName("client.gb")
    public static int field414 = 0;

    @ObfuscatedName("client.gq")
    public static int field384 = 0;

    @ObfuscatedName("client.gl")
    public static int field366 = 0;

    @ObfuscatedName("client.gr")
    public static int field323 = 0;

    @ObfuscatedName("client.gp")
    public static int field368 = 0;

    @ObfuscatedName("client.gj")
    public static int field369 = 0;

    @ObfuscatedName("client.go")
    public static int field370 = 0;

    @ObfuscatedName("client.gc")
    public static int field371 = 0;

    @ObfuscatedName("client.gh")
    public static int field363 = 0;

    @ObfuscatedName("client.gx")
    public static int field373 = 0;

    @ObfuscatedName("client.gn")
    public static boolean field374 = false;

    @ObfuscatedName("client.gg")
    public static int field375 = 0;

    @ObfuscatedName("client.ga")
    public static int field376 = 0;

    @ObfuscatedName("client.gi")
    public static class3[] field262 = new class3[2048];

    @ObfuscatedName("client.gy")
    public static int field317 = 0;

    @ObfuscatedName("client.gt")
    public static int[] field379 = new int[2048];

    @ObfuscatedName("client.gs")
    public static int field380 = 0;

    @ObfuscatedName("client.gk")
    public static int[] field381 = new int[2048];

    @ObfuscatedName("client.hh")
    public static class111[] field473 = new class111[2048];

    @ObfuscatedName("client.hz")
    public static int field409 = -1;

    @ObfuscatedName("client.he")
    public static int field306 = 0;

    @ObfuscatedName("client.hj")
    public static int field305 = 0;

    @ObfuscatedName("client.hg")
    public static int[] field386 = new int[1000];

    @ObfuscatedName("client.ho")
    public static final int[] field324 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hp")
    public static String[] field388 = new String[8];

    @ObfuscatedName("client.hl")
    public static boolean[] field389 = new boolean[8];

    @ObfuscatedName("client.hk")
    public static int[] field390 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hf")
    public static int field391 = -1;

    @ObfuscatedName("client.hm")
    public static class190[][][] field465 = new class190[4][104][104];

    @ObfuscatedName("client.hb")
    public static class190 field393 = new class190();

    @ObfuscatedName("client.hi")
    public static class190 field394 = new class190();

    @ObfuscatedName("client.hy")
    public static class190 field395 = new class190();

    @ObfuscatedName("client.hu")
    public static int[] field396 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field314 = new int[25];

    @ObfuscatedName("client.ht")
    public static int[] field398 = new int[25];

    @ObfuscatedName("client.hq")
    public static int field399 = 0;

    @ObfuscatedName("client.ha")
    public static boolean field400 = false;

    @ObfuscatedName("client.ia")
    public static int field401 = 0;

    @ObfuscatedName("client.in")
    public static int[] field299 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field403 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field440 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field405 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field406 = new String[500];

    @ObfuscatedName("client.id")
    public static String[] field407 = new String[500];

    @ObfuscatedName("client.iq")
    public static int field457 = -1;

    @ObfuscatedName("client.im")
    public static int field402 = -1;

    @ObfuscatedName("client.il")
    public static int field410 = 0;

    @ObfuscatedName("client.ie")
    public static int field436 = 50;

    @ObfuscatedName("client.ib")
    public static int field412 = 0;

    @ObfuscatedName("client.it")
    public static String field283 = null;

    @ObfuscatedName("client.ig")
    public static boolean field408 = false;

    @ObfuscatedName("client.iv")
    public static int field502 = -1;

    @ObfuscatedName("client.ic")
    public static int field417 = -1;

    @ObfuscatedName("client.io")
    public static String field418 = null;

    @ObfuscatedName("client.jb")
    public static String field352 = null;

    @ObfuscatedName("client.ja")
    public static int field420 = -1;

    @ObfuscatedName("client.jq")
    public static class187 field421 = new class187(8);

    @ObfuscatedName("client.jr")
    public static int field422 = 0;

    @ObfuscatedName("client.jh")
    public static int field304 = 0;

    @ObfuscatedName("client.jj")
    public static class164 field276 = null;

    @ObfuscatedName("client.jg")
    public static int field425 = 0;

    @ObfuscatedName("client.je")
    public static int field426 = 0;

    @ObfuscatedName("client.jw")
    public static int field259 = 0;

    @ObfuscatedName("client.jc")
    public static int field428 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field517 = false;

    @ObfuscatedName("client.jv")
    public static boolean field392 = false;

    @ObfuscatedName("client.jx")
    public static boolean field292 = false;

    @ObfuscatedName("client.js")
    public static class164 field432 = null;

    @ObfuscatedName("client.ji")
    public static class164 field433 = null;

    @ObfuscatedName("client.jt")
    public static class164 field434 = null;

    @ObfuscatedName("client.jy")
    public static int field435 = 0;

    @ObfuscatedName("client.jk")
    public static int field326 = 0;

    @ObfuscatedName("client.jo")
    public static class164 field539 = null;

    @ObfuscatedName("client.ju")
    public static boolean field438 = false;

    @ObfuscatedName("client.jm")
    public static int field277 = -1;

    @ObfuscatedName("client.jp")
    public static int field419 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field441 = false;

    @ObfuscatedName("client.jl")
    public static int field331 = -1;

    @ObfuscatedName("client.jf")
    public static int field443 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field344 = false;

    @ObfuscatedName("client.kb")
    public static int field445 = 1;

    @ObfuscatedName("client.ki")
    public static int[] field446 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field447 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field448 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field335 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field497 = new int[32];

    @ObfuscatedName("client.kc")
    public static int field451 = 0;

    @ObfuscatedName("client.kz")
    public static int field463 = 0;

    @ObfuscatedName("client.kf")
    public static int field275 = 0;

    @ObfuscatedName("client.kq")
    public static int field454 = 0;

    @ObfuscatedName("client.kk")
    public static int field442 = 0;

    @ObfuscatedName("client.kn")
    public static int field456 = 0;

    @ObfuscatedName("client.ks")
    public static int field530 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field458 = new int[2000];

    @ObfuscatedName("client.kt")
    public static String[] field459 = new String[1000];

    @ObfuscatedName("client.kp")
    public static int field460 = 0;

    @ObfuscatedName("client.kl")
    public static class190 field461 = new class190();

    @ObfuscatedName("client.kw")
    public static class190 field462 = new class190();

    @ObfuscatedName("client.ka")
    public static class190 field255 = new class190();

    @ObfuscatedName("client.lu")
    public static class187 field464 = new class187(512);

    @ObfuscatedName("client.lh")
    public static int field397 = 0;

    @ObfuscatedName("client.lf")
    public static int field466 = -2;

    @ObfuscatedName("client.lm")
    public static boolean[] field467 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field468 = new boolean[100];

    @ObfuscatedName("client.la")
    public static boolean[] field469 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static int[] field372 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field471 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field472 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field261 = new int[100];

    @ObfuscatedName("client.lr")
    public static int field474 = 0;

    @ObfuscatedName("client.lj")
    public static long field475 = 0L;

    @ObfuscatedName("client.lb")
    public static boolean field476 = true;

    @ObfuscatedName("client.ln")
    public static int field382 = 765;

    @ObfuscatedName("client.lw")
    public static int field478 = 1;

    @ObfuscatedName("client.lo")
    public static int[] field479 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ld")
    public static int field427 = 0;

    @ObfuscatedName("client.ll")
    public static int field481 = 0;

    @ObfuscatedName("client.li")
    public static String field482 = "";

    @ObfuscatedName("client.md")
    public static long[] field483 = new long[100];

    @ObfuscatedName("client.mc")
    public static int field484 = 0;

    @ObfuscatedName("client.mo")
    public static int field288 = 0;

    @ObfuscatedName("client.mn")
    public static int[] field486 = new int[128];

    @ObfuscatedName("client.mq")
    public static int[] field487 = new int[128];

    @ObfuscatedName("client.ms")
    public static long field488 = -1L;

    @ObfuscatedName("client.mz")
    public static String field489 = null;

    @ObfuscatedName("client.mj")
    public static String field490 = null;

    @ObfuscatedName("client.ml")
    public static int field377 = -1;

    @ObfuscatedName("client.mi")
    public static int field511 = 0;

    @ObfuscatedName("client.mv")
    public static int[] field338 = new int[1000];

    @ObfuscatedName("client.my")
    public static int[] field494 = new int[1000];

    @ObfuscatedName("client.mt")
    public static class74[] field495 = new class74[1000];

    @ObfuscatedName("client.mx")
    public static int field496 = 0;

    @ObfuscatedName("client.mh")
    public static int field302 = 0;

    @ObfuscatedName("client.ne")
    public static int field523 = 0;

    @ObfuscatedName("client.nu")
    public static int field499 = 255;

    @ObfuscatedName("client.nn")
    public static int field500 = -1;

    @ObfuscatedName("client.nw")
    public static boolean field501 = false;

    @ObfuscatedName("client.ng")
    public static int field265 = 127;

    @ObfuscatedName("client.nf")
    public static int field383 = 127;

    @ObfuscatedName("client.no")
    public static int field504 = 0;

    @ObfuscatedName("client.na")
    public static int[] field491 = new int[50];

    @ObfuscatedName("client.nh")
    public static int[] field282 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field507 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field439 = new int[50];

    @ObfuscatedName("client.nr")
    public static class54[] field509 = new class54[50];

    @ObfuscatedName("client.nv")
    public static boolean field510 = false;

    @ObfuscatedName("client.ox")
    public static boolean[] field329 = new boolean[5];

    @ObfuscatedName("client.om")
    public static int[] field512 = new int[5];

    @ObfuscatedName("client.oo")
    public static int[] field477 = new int[5];

    @ObfuscatedName("client.og")
    public static int[] field514 = new int[5];

    @ObfuscatedName("client.oe")
    public static int[] field515 = new int[5];

    @ObfuscatedName("client.oi")
    public static short field516 = 256;

    @ObfuscatedName("client.oa")
    public static short field367 = 205;

    @ObfuscatedName("client.od")
    public static short field274 = 256;

    @ObfuscatedName("client.on")
    public static short field519 = 320;

    @ObfuscatedName("client.or")
    public static short field520 = 1;

    @ObfuscatedName("client.ol")
    public static short field429 = 32767;

    @ObfuscatedName("client.oc")
    public static short field522 = 1;

    @ObfuscatedName("client.ot")
    public static short field416 = 32767;

    @ObfuscatedName("client.ov")
    public static int field498 = 0;

    @ObfuscatedName("client.os")
    public static int field525 = 0;

    @ObfuscatedName("client.oq")
    public static int field526 = 0;

    @ObfuscatedName("client.oz")
    public static int field527 = 0;

    @ObfuscatedName("client.oj")
    public static int field528 = 0;

    @ObfuscatedName("client.oy")
    public static int field254 = 0;

    @ObfuscatedName("client.ou")
    public static int field518 = 0;

    @ObfuscatedName("client.op")
    public static class17[] field449 = new class17[400];

    @ObfuscatedName("client.ps")
    public static class186 field532 = new class186();

    @ObfuscatedName("client.pm")
    public static int field533 = 0;

    @ObfuscatedName("client.po")
    public static class8[] field534 = new class8[400];

    @ObfuscatedName("client.pd")
    public static class170 field535 = new class170();

    @ObfuscatedName("client.pp")
    public static int field531 = -1;

    @ObfuscatedName("client.pq")
    public static int field537 = -1;

    @ObfuscatedName("client.pl")
    public static class211[] field538 = new class211[8];

    @ObfuscatedName("client.h(I)V")
    public final void method431() {
    }

    public final void init() {
        if (!this.method2665()) {
            return;
        }
        class181[] var1 = class181.method2475();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class181 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2962);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2962)) {
                    case 1:
                        Statics.field1525 = var4;
                        break;
                    case 2:
                        Statics.field285 = Integer.parseInt(var4);
                    case 3:
                    case 5:
                    case 11:
                    default:
                        break;
                    case 4:
                        field493 = Integer.parseInt(var4);
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class2.field27)) {
                            field455 = true;
                        } else {
                            field455 = false;
                        }
                        break;
                    case 7:
                        int var5 = Integer.parseInt(var4);
                        class144[] var6 = class144.method1623();
                        int var7 = 0;
                        class144 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class144 var8 = var6[var7];
                            if (var8.field2165 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field3081 = var9;
                        break;
                    case 8:
                        Statics.field1939 = var4;
                        break;
                    case 9:
                        field295 = Integer.parseInt(var4);
                        break;
                    case 10:
                        Statics.field260 = (class145) class101.method146(class145.method1992(), Integer.parseInt(var4));
                        if (Statics.field260 == class145.field2178) {
                            Statics.field316 = class203.field3036;
                        } else {
                            Statics.field316 = class203.field3038;
                        }
                        break;
                    case 12:
                        if (var4.equalsIgnoreCase(class2.field27)) {
                        }
                        break;
                    case 13:
                        field257 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field1865 = Integer.parseInt(var4);
                        break;
                    case 15:
                        field423 = Integer.parseInt(var4);
                }
            }
        }
        class81.field1440 = false;
        field263 = false;
        Statics.field992 = this.getCodeBase().getHost();
        String var10 = Statics.field3081.field2168;
        byte var11 = 0;
        try {
            Statics.field2127 = 16;
            Statics.field2017 = var11;
            try {
                Statics.field181 = System.getProperty("os.name");
            } catch (Exception var56) {
                Statics.field181 = "Unknown";
            }
            Statics.field3045 = Statics.field181.toLowerCase();
            try {
                Statics.field2120 = System.getProperty("user.home");
                if (Statics.field2120 != null) {
                    Statics.field2120 = Statics.field2120 + "/";
                }
            } catch (Exception var55) {
            }
            try {
                if (Statics.field3045.startsWith("win")) {
                    if (Statics.field2120 == null) {
                        Statics.field2120 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2120 == null) {
                    Statics.field2120 = System.getenv("HOME");
                }
                if (Statics.field2120 != null) {
                    Statics.field2120 = Statics.field2120 + "/";
                }
            } catch (Exception var54) {
            }
            if (Statics.field2120 == null) {
                Statics.field2120 = "~/";
            }
            Statics.field450 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2120, "/tmp/", "" };
            Statics.field2108 = new String[] { ".jagex_cache_" + Statics.field2017, ".file_store_" + Statics.field2017 };
            int var15 = 0;
            label259: while (var15 < 4) {
                String var16 = var15 == 0 ? "" : "" + var15;
                Statics.field2121 = new File(Statics.field2120, "jagex_cl_oldschool_" + var10 + var16 + ".dat");
                String var17 = null;
                String var18 = null;
                boolean var19 = false;
                if (Statics.field2121.exists()) {
                    try {
                        class218 var20 = new class218(Statics.field2121, "rw", 10000L);
                        class111 var21 = new class111((int) var20.method3690());
                        while (var21.field1888 < var21.field1886.length) {
                            int var22 = var20.method3691(var21.field1886, var21.field1888, var21.field1886.length - var21.field1888);
                            if (var22 == -1) {
                                throw new IOException();
                            }
                            var21.field1888 += var22;
                        }
                        var21.field1888 = 0;
                        int var23 = var21.method2155();
                        if (var23 < 1 || var23 > 3) {
                            throw new IOException("" + var23);
                        }
                        int var24 = 0;
                        if (var23 > 1) {
                            var24 = var21.method2155();
                        }
                        if (var23 <= 2) {
                            var17 = var21.method2164();
                            if (var24 == 1) {
                                var18 = var21.method2164();
                            }
                        } else {
                            var17 = var21.method2254();
                            if (var24 == 1) {
                                var18 = var21.method2254();
                            }
                        }
                        var20.method3689();
                    } catch (IOException var58) {
                        var58.printStackTrace();
                    }
                    if (var17 != null) {
                        File var26 = new File(var17);
                        if (!var26.exists()) {
                            var17 = null;
                        }
                    }
                    if (var17 != null) {
                        File var27 = new File(var17, "test.dat");
                        if (!class141.method850(var27, true)) {
                            var17 = null;
                        }
                    }
                }
                if (var17 == null && var15 == 0) {
                    label235: for (int var28 = 0; var28 < Statics.field2108.length; var28++) {
                        for (int var29 = 0; var29 < Statics.field450.length; var29++) {
                            File var30 = new File(Statics.field450[var29] + Statics.field2108[var28] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var30.exists() && class141.method850(new File(var30, "test.dat"), true)) {
                                var17 = var30.toString();
                                var19 = true;
                                break label235;
                            }
                        }
                    }
                }
                if (var17 == null) {
                    var17 = Statics.field2120 + File.separatorChar + "jagexcache" + var16 + File.separatorChar + "oldschool" + File.separatorChar + var10 + File.separatorChar;
                    var19 = true;
                }
                if (var18 != null) {
                    File var31 = new File(var18);
                    File var32 = new File(var17);
                    try {
                        File[] var33 = var31.listFiles();
                        File[] var34 = var33;
                        for (int var35 = 0; var35 < var34.length; var35++) {
                            File var36 = var34[var35];
                            File var37 = new File(var32, var36.getName());
                            boolean var38 = var36.renameTo(var37);
                            if (!var38) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var57) {
                        var57.printStackTrace();
                    }
                    var19 = true;
                }
                if (var19) {
                    File var40 = new File(var17);
                    Object var41 = null;
                    try {
                        class218 var42 = new class218(Statics.field2121, "rw", 10000L);
                        class111 var43 = new class111(500);
                        var43.method2140(3);
                        var43.method2140(var41 == null ? 0 : 1);
                        var43.method2148(var40.getPath());
                        if (var41 != null) {
                            var43.method2148(((File) var41).getPath());
                        }
                        var42.method3688(var43.field1886, 0, var43.field1888);
                        var42.method3689();
                    } catch (IOException var53) {
                        var53.printStackTrace();
                    }
                }
                File var45 = new File(var17);
                Statics.field2122 = var45;
                if (!Statics.field2122.exists()) {
                    Statics.field2122.mkdirs();
                }
                File[] var46 = Statics.field2122.listFiles();
                if (var46 == null) {
                    break;
                }
                File[] var47 = var46;
                int var48 = 0;
                while (true) {
                    if (var48 >= var47.length) {
                        break label259;
                    }
                    File var49 = var47[var48];
                    if (!class141.method850(var49, false)) {
                        var15++;
                        break;
                    }
                    var48++;
                }
            }
            File var50 = Statics.field2122;
            Statics.field1970 = var50;
            if (!Statics.field1970.exists()) {
                throw new RuntimeException("");
            }
            class127.field1975 = true;
            class141.method2358();
            class141.field2126 = new class219(new class218(class127.method1897("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class141.field2133 = new class219(new class218(class127.method1897("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2128 = new class219[Statics.field2127];
            for (int var51 = 0; var51 < Statics.field2127; var51++) {
                Statics.field2128[var51] = new class219(new class218(class127.method1897("main_file_cache.idx" + var51), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var59) {
            class140.method1403((String) null, var59);
        }
        Statics.field430 = this;
        this.method2663(765, 503, 82);
    }

    @ObfuscatedName("client.l(B)V")
    public final void method205() {
        Statics.field723 = field493 == 0 ? 43594 : field257 + 40000;
        Statics.field836 = field493 == 0 ? 443 : field257 + 50000;
        Statics.field195 = Statics.field723;
        Statics.field2555 = class165.field2786;
        Statics.field2824 = class165.field2784;
        Statics.field595 = class165.field2785;
        Statics.field236 = class165.field2783;
        class129.method2473();
        class129.method2493(Statics.field1869);
        class132.method673(Statics.field1869);
        class137 var1;
        try {
            var1 = new class137();
        } catch (Throwable var4) {
            var1 = null;
        }
        Statics.field2796 = var1;
        if (Statics.field2796 != null) {
            Statics.field2796.method2477(Statics.field1869);
        }
        Statics.field120 = new class126(255, class141.field2126, class141.field2133, 500000);
        Statics.field1691 = class9.method2091();
        Statics.field159 = this.getToolkit().getSystemClipboard();
        class130.method3034(this, Statics.field547);
        if (field493 != 0) {
            field294 = true;
        }
        int var3 = Statics.field1691.field127;
        field475 = 0L;
        if (var3 >= 2) {
            field476 = true;
        } else {
            field476 = false;
        }
        method1803();
        if (field266 >= 25) {
            field521.method2402(75);
            field521.method2140(method1879());
            field521.method2322(Statics.field1984);
            field521.method2322(Statics.field1384);
        }
        field2089 = true;
    }

    @ObfuscatedName("client.c(I)V")
    public final void method172() {
        field268++;
        this.method335();
        class161.method2472();
        class174.method2755();
        method824();
        class129 var1 = class129.field1991;
        synchronized (class129.field1991) {
            class129.field2014++;
            class129.field2006 = class129.field2013;
            class129.field2002 = 0;
            if (class129.field1988 >= 0) {
                while (class129.field2005 != class129.field1988) {
                    int var3 = class129.field2004[class129.field2005];
                    class129.field2005 = class129.field2005 + 1 & 0x7F;
                    if (var3 < 0) {
                        class129.field2010[~var3] = false;
                    } else {
                        if (!class129.field2010[var3] && class129.field2002 < class129.field1993.length - 1) {
                            class129.field1993[++class129.field2002 - 1] = var3;
                        }
                        class129.field2010[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class129.field2010[var2] = false;
                }
                class129.field1988 = class129.field2005;
            }
            class129.field2013 = class129.field2012;
        }
        class132 var5 = class132.field2046;
        synchronized (class132.field2046) {
            class132.field2036 = class132.field2033;
            class132.field2037 = class132.field2042;
            class132.field2038 = class132.field2035;
            class132.field2043 = class132.field2039;
            class132.field2034 = class132.field2040;
            class132.field2045 = class132.field2041;
            class132.field2044 = class132.field2051;
            class132.field2039 = 0;
        }
        if (Statics.field2796 != null) {
            int var7 = Statics.field2796.method2483();
            field460 = var7;
        }
        int var10002;
        if (field266 == 0) {
            method155();
            class136.method1452();
        } else if (field266 == 5) {
            class30.method2968(this);
            method155();
            class136.method1452();
        } else if (field266 == 10 || field266 == 11) {
            class30.method2968(this);
        } else if (field266 == 20) {
            class30.method2968(this);
            method674();
        } else if (field266 == 25) {
            method3291(false);
            field313 = 0;
            boolean var8 = true;
            for (int var9 = 0; var9 < Statics.field1874.length; var9++) {
                if (Statics.field2612[var9] != -1 && Statics.field1874[var9] == null) {
                    Statics.field1874[var9] = Statics.field202.method2859(Statics.field2612[var9], 0);
                    if (Statics.field1874[var9] == null) {
                        var8 = false;
                        field313++;
                    }
                }
                if (Statics.field567[var9] != -1 && Statics.field2548[var9] == null) {
                    Statics.field2548[var9] = Statics.field202.method2866(Statics.field567[var9], 0, Statics.field234[var9]);
                    if (Statics.field2548[var9] == null) {
                        var8 = false;
                        field313++;
                    }
                }
            }
            if (var8) {
                field315 = 0;
                boolean var10 = true;
                for (int var11 = 0; var11 < Statics.field1874.length; var11++) {
                    byte[] var12 = Statics.field2548[var11];
                    if (var12 != null) {
                        int var13 = (Statics.field919[var11] >> 8) * 64 - Statics.field1903;
                        int var14 = (Statics.field919[var11] & 0xFF) * 64 - Statics.field311;
                        if (field319) {
                            var13 = 10;
                            var14 = 10;
                        }
                        var10 &= class6.method1993(var12, var13, var14);
                    }
                }
                if (var10) {
                    if (field385 != 0) {
                        method2878(class148.field2211 + class2.field16 + class2.field17 + 100 + "%" + class2.field18, true);
                    }
                    method824();
                    method801();
                    method824();
                    Statics.field1890.method1625();
                    method824();
                    System.gc();
                    for (int var15 = 0; var15 < 4; var15++) {
                        field318[var15].method3755();
                    }
                    for (int var16 = 0; var16 < 4; var16++) {
                        for (int var17 = 0; var17 < 104; var17++) {
                            for (int var18 = 0; var18 < 104; var18++) {
                                class6.field65[var16][var17][var18] = 0;
                            }
                        }
                    }
                    method824();
                    class6.method2074();
                    int var19 = Statics.field1874.length;
                    for (class22 var20 = (class22) class22.field577.method3382(); var20 != null; var20 = (class22) class22.field577.method3384()) {
                        if (var20.field576 != null) {
                            Statics.field241.method1001(var20.field576);
                            var20.field576 = null;
                        }
                        if (var20.field573 != null) {
                            Statics.field241.method1001(var20.field573);
                            var20.field573 = null;
                        }
                    }
                    class22.field577.method3376();
                    method3291(true);
                    if (!field319) {
                        int var21 = 0;
                        label4073: while (true) {
                            if (var21 >= var19) {
                                for (int var35 = 0; var35 < var19; var35++) {
                                    int var36 = (Statics.field919[var35] >> 8) * 64 - Statics.field1903;
                                    int var37 = (Statics.field919[var35] & 0xFF) * 64 - Statics.field311;
                                    byte[] var38 = Statics.field1874[var35];
                                    if (var38 == null && Statics.field606 < 800) {
                                        method824();
                                        class6.method1091(var36, var37, 64, 64);
                                    }
                                }
                                method3291(true);
                                int var39 = 0;
                                while (true) {
                                    if (var39 >= var19) {
                                        break label4073;
                                    }
                                    byte[] var40 = Statics.field2548[var39];
                                    if (var40 != null) {
                                        int var41 = (Statics.field919[var39] >> 8) * 64 - Statics.field1903;
                                        int var42 = (Statics.field919[var39] & 0xFF) * 64 - Statics.field311;
                                        method824();
                                        class81 var43 = Statics.field1890;
                                        class220[] var44 = field318;
                                        class111 var45 = new class111(var40);
                                        int var46 = -1;
                                        while (true) {
                                            int var47 = var45.method2168();
                                            if (var47 == 0) {
                                                break;
                                            }
                                            var46 += var47;
                                            int var48 = 0;
                                            while (true) {
                                                int var49 = var45.method2168();
                                                if (var49 == 0) {
                                                    break;
                                                }
                                                var48 += var49 - 1;
                                                int var50 = var48 & 0x3F;
                                                int var51 = var48 >> 6 & 0x3F;
                                                int var52 = var48 >> 12;
                                                int var53 = var45.method2155();
                                                int var54 = var53 >> 2;
                                                int var55 = var53 & 0x3;
                                                int var56 = var41 + var51;
                                                int var57 = var42 + var50;
                                                if (var56 > 0 && var57 > 0 && var56 < 103 && var57 < 103) {
                                                    int var58 = var52;
                                                    if ((class6.field65[1][var56][var57] & 0x2) == 2) {
                                                        var58 = var52 - 1;
                                                    }
                                                    class220 var59 = null;
                                                    if (var58 >= 0) {
                                                        var59 = var44[var58];
                                                    }
                                                    class6.method516(var52, var56, var57, var46, var55, var54, var43, var59);
                                                }
                                            }
                                        }
                                    }
                                    var39++;
                                }
                            }
                            int var22 = (Statics.field919[var21] >> 8) * 64 - Statics.field1903;
                            int var23 = (Statics.field919[var21] & 0xFF) * 64 - Statics.field311;
                            byte[] var24 = Statics.field1874[var21];
                            if (var24 != null) {
                                method824();
                                int var25 = Statics.field1382 * 8 - 48;
                                int var26 = Statics.field606 * 8 - 48;
                                class220[] var27 = field318;
                                int var28 = 0;
                                label4070: while (true) {
                                    if (var28 >= 4) {
                                        class111 var31 = new class111(var24);
                                        int var32 = 0;
                                        while (true) {
                                            if (var32 >= 4) {
                                                break label4070;
                                            }
                                            for (int var33 = 0; var33 < 64; var33++) {
                                                for (int var34 = 0; var34 < 64; var34++) {
                                                    class6.method1439(var31, var32, var22 + var33, var23 + var34, var25, var26, 0);
                                                }
                                            }
                                            var32++;
                                        }
                                    }
                                    for (int var29 = 0; var29 < 64; var29++) {
                                        for (int var30 = 0; var30 < 64; var30++) {
                                            if (var22 + var29 > 0 && var22 + var29 < 103 && var23 + var30 > 0 && var23 + var30 < 103) {
                                                var27[var28].field3140[var22 + var29][var23 + var30] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var28++;
                                }
                            }
                            var21++;
                        }
                    }
                    if (field319) {
                        int var60 = 0;
                        label4006: while (true) {
                            if (var60 >= 4) {
                                for (int var91 = 0; var91 < 13; var91++) {
                                    for (int var92 = 0; var92 < 13; var92++) {
                                        int var93 = field320[0][var91][var92];
                                        if (var93 == -1) {
                                            class6.method1091(var91 * 8, var92 * 8, 8, 8);
                                        }
                                    }
                                }
                                method3291(true);
                                int var94 = 0;
                                while (true) {
                                    if (var94 >= 4) {
                                        break label4006;
                                    }
                                    method824();
                                    for (int var95 = 0; var95 < 13; var95++) {
                                        label3929: for (int var96 = 0; var96 < 13; var96++) {
                                            int var97 = field320[var94][var95][var96];
                                            if (var97 != -1) {
                                                int var98 = var97 >> 24 & 0x3;
                                                int var99 = var97 >> 1 & 0x3;
                                                int var100 = var97 >> 14 & 0x3FF;
                                                int var101 = var97 >> 3 & 0x7FF;
                                                int var102 = (var100 / 8 << 8) + var101 / 8;
                                                for (int var103 = 0; var103 < Statics.field919.length; var103++) {
                                                    if (Statics.field919[var103] == var102 && Statics.field2548[var103] != null) {
                                                        byte[] var104 = Statics.field2548[var103];
                                                        int var105 = var95 * 8;
                                                        int var106 = var96 * 8;
                                                        int var107 = (var100 & 0x7) * 8;
                                                        int var108 = (var101 & 0x7) * 8;
                                                        class81 var109 = Statics.field1890;
                                                        class220[] var110 = field318;
                                                        class111 var111 = new class111(var104);
                                                        int var112 = -1;
                                                        while (true) {
                                                            int var113 = var111.method2168();
                                                            if (var113 == 0) {
                                                                continue label3929;
                                                            }
                                                            var112 += var113;
                                                            int var114 = 0;
                                                            while (true) {
                                                                int var115 = var111.method2168();
                                                                if (var115 == 0) {
                                                                    break;
                                                                }
                                                                var114 += var115 - 1;
                                                                int var116 = var114 & 0x3F;
                                                                int var117 = var114 >> 6 & 0x3F;
                                                                int var118 = var114 >> 12;
                                                                int var119 = var111.method2155();
                                                                int var120 = var119 >> 2;
                                                                int var121 = var119 & 0x3;
                                                                if (var98 == var118 && var117 >= var107 && var117 < var107 + 8 && var116 >= var108 && var116 < var108 + 8) {
                                                                    class38 var122 = class38.method595(var112);
                                                                    int var124 = var117 & 0x7;
                                                                    int var125 = var116 & 0x7;
                                                                    int var127 = var122.field882;
                                                                    int var128 = var122.field905;
                                                                    if ((var121 & 0x1) == 1) {
                                                                        int var129 = var127;
                                                                        var127 = var128;
                                                                        var128 = var129;
                                                                    }
                                                                    int var130 = var99 & 0x3;
                                                                    int var131;
                                                                    if (var130 == 0) {
                                                                        var131 = var124;
                                                                    } else if (var130 == 1) {
                                                                        var131 = var125;
                                                                    } else if (var130 == 2) {
                                                                        var131 = 7 - var124 - (var127 - 1);
                                                                    } else {
                                                                        var131 = 7 - var125 - (var128 - 1);
                                                                    }
                                                                    int var132 = var105 + var131;
                                                                    int var134 = var117 & 0x7;
                                                                    int var135 = var116 & 0x7;
                                                                    int var137 = var122.field882;
                                                                    int var138 = var122.field905;
                                                                    if ((var121 & 0x1) == 1) {
                                                                        int var139 = var137;
                                                                        var137 = var138;
                                                                        var138 = var139;
                                                                    }
                                                                    int var140 = var99 & 0x3;
                                                                    int var141;
                                                                    if (var140 == 0) {
                                                                        var141 = var135;
                                                                    } else if (var140 == 1) {
                                                                        var141 = 7 - var134 - (var137 - 1);
                                                                    } else if (var140 == 2) {
                                                                        var141 = 7 - var135 - (var138 - 1);
                                                                    } else {
                                                                        var141 = var134;
                                                                    }
                                                                    int var142 = var106 + var141;
                                                                    if (var132 > 0 && var142 > 0 && var132 < 103 && var142 < 103) {
                                                                        int var143 = var94;
                                                                        if ((class6.field65[1][var132][var142] & 0x2) == 2) {
                                                                            var143 = var94 - 1;
                                                                        }
                                                                        class220 var144 = null;
                                                                        if (var143 >= 0) {
                                                                            var144 = var110[var143];
                                                                        }
                                                                        class6.method516(var94, var132, var142, var112, var99 + var121 & 0x3, var120, var109, var144);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var94++;
                                }
                            }
                            method824();
                            for (int var61 = 0; var61 < 13; var61++) {
                                for (int var62 = 0; var62 < 13; var62++) {
                                    boolean var63 = false;
                                    int var64 = field320[var60][var61][var62];
                                    if (var64 != -1) {
                                        int var65 = var64 >> 24 & 0x3;
                                        int var66 = var64 >> 1 & 0x3;
                                        int var67 = var64 >> 14 & 0x3FF;
                                        int var68 = var64 >> 3 & 0x7FF;
                                        int var69 = (var67 / 8 << 8) + var68 / 8;
                                        for (int var70 = 0; var70 < Statics.field919.length; var70++) {
                                            if (Statics.field919[var70] == var69 && Statics.field1874[var70] != null) {
                                                byte[] var71 = Statics.field1874[var70];
                                                int var72 = var61 * 8;
                                                int var73 = var62 * 8;
                                                int var74 = (var67 & 0x7) * 8;
                                                int var75 = (var68 & 0x7) * 8;
                                                class220[] var76 = field318;
                                                for (int var77 = 0; var77 < 8; var77++) {
                                                    for (int var78 = 0; var78 < 8; var78++) {
                                                        if (var72 + var77 > 0 && var72 + var77 < 103 && var73 + var78 > 0 && var73 + var78 < 103) {
                                                            var76[var60].field3140[var72 + var77][var73 + var78] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class111 var79 = new class111(var71);
                                                for (int var80 = 0; var80 < 4; var80++) {
                                                    for (int var81 = 0; var81 < 64; var81++) {
                                                        for (int var82 = 0; var82 < 64; var82++) {
                                                            if (var65 == var80 && var81 >= var74 && var81 < var74 + 8 && var82 >= var75 && var82 < var75 + 8) {
                                                                int var86 = var81 & 0x7;
                                                                int var87 = var82 & 0x7;
                                                                int var89 = var66 & 0x3;
                                                                int var90;
                                                                if (var89 == 0) {
                                                                    var90 = var86;
                                                                } else if (var89 == 1) {
                                                                    var90 = var87;
                                                                } else if (var89 == 2) {
                                                                    var90 = 7 - var86;
                                                                } else {
                                                                    var90 = 7 - var87;
                                                                }
                                                                class6.method1439(var79, var60, var72 + var90, var73 + class168.method600(var81 & 0x7, var82 & 0x7, var66), 0, 0, var66);
                                                            } else {
                                                                class6.method1439(var79, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var63 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var63) {
                                        class6.method2785(var60, var61 * 8, var62 * 8);
                                    }
                                }
                            }
                            var60++;
                        }
                    }
                    method3291(true);
                    method801();
                    method824();
                    class81 var145 = Statics.field1890;
                    class220[] var146 = field318;
                    for (int var147 = 0; var147 < 4; var147++) {
                        for (int var148 = 0; var148 < 104; var148++) {
                            for (int var149 = 0; var149 < 104; var149++) {
                                if ((class6.field65[var147][var148][var149] & 0x1) == 1) {
                                    int var150 = var147;
                                    if ((class6.field65[1][var148][var149] & 0x2) == 2) {
                                        var150 = var147 - 1;
                                    }
                                    if (var150 >= 0) {
                                        var146[var150].method3742(var148, var149);
                                    }
                                }
                            }
                        }
                    }
                    class6.field72 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field72 < -8) {
                        class6.field72 = -8;
                    }
                    if (class6.field72 > 8) {
                        class6.field72 = 8;
                    }
                    class6.field66 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field66 < -16) {
                        class6.field66 = -16;
                    }
                    if (class6.field66 > 16) {
                        class6.field66 = 16;
                    }
                    for (int var151 = 0; var151 < 4; var151++) {
                        byte[][] var152 = Statics.field2188[var151];
                        int var153 = (int) Math.sqrt(5100.0D);
                        int var154 = var153 * 768 >> 8;
                        for (int var155 = 1; var155 < 103; var155++) {
                            for (int var156 = 1; var156 < 103; var156++) {
                                int var157 = class6.field83[var151][var156 + 1][var155] - class6.field83[var151][var156 - 1][var155];
                                int var158 = class6.field83[var151][var156][var155 + 1] - class6.field83[var151][var156][var155 - 1];
                                int var159 = (int) Math.sqrt((double) (var158 * var158 + var157 * var157 + 65536));
                                int var160 = (var157 << 8) / var159;
                                int var161 = 65536 / var159;
                                int var162 = (var158 << 8) / var159;
                                int var163 = (var162 * -50 + var160 * -50 + var161 * -10) / var154 + 96;
                                int var164 = (var152[var156][var155] >> 1) + (var152[var156][var155 + 1] >> 3) + (var152[var156][var155 - 1] >> 2) + (var152[var156 - 1][var155] >> 2) + (var152[var156 + 1][var155] >> 3);
                                Statics.field69[var156][var155] = var163 - var164;
                            }
                        }
                        for (int var165 = 0; var165 < 104; var165++) {
                            Statics.field70[var165] = 0;
                            Statics.field1142[var165] = 0;
                            Statics.field2563[var165] = 0;
                            Statics.field71[var165] = 0;
                            Statics.field726[var165] = 0;
                        }
                        for (int var166 = -5; var166 < 109; var166++) {
                            for (int var167 = 0; var167 < 104; var167++) {
                                int var168 = var166 + 5;
                                if (var168 >= 0 && var168 < 104) {
                                    int var169 = Statics.field3065[var151][var168][var167] & 0xFF;
                                    if (var169 > 0) {
                                        int var170 = var169 - 1;
                                        class39 var171 = (class39) class39.field921.method3315((long) var170);
                                        class39 var172;
                                        if (var171 == null) {
                                            byte[] var173 = Statics.field923.method2859(1, var170);
                                            class39 var174 = new class39();
                                            if (var173 != null) {
                                                var174.method733(new class111(var173), var170);
                                            }
                                            var174.method721();
                                            class39.field921.method3317(var174, (long) var170);
                                            var172 = var174;
                                        } else {
                                            var172 = var171;
                                        }
                                        Statics.field70[var167] += var172.field920;
                                        Statics.field1142[var167] += var172.field924;
                                        Statics.field2563[var167] += var172.field925;
                                        Statics.field71[var167] += var172.field926;
                                        var10002 = Statics.field726[var167]++;
                                    }
                                }
                                int var176 = var166 - 5;
                                if (var176 >= 0 && var176 < 104) {
                                    int var177 = Statics.field3065[var151][var176][var167] & 0xFF;
                                    if (var177 > 0) {
                                        int var178 = var177 - 1;
                                        class39 var179 = (class39) class39.field921.method3315((long) var178);
                                        class39 var180;
                                        if (var179 == null) {
                                            byte[] var181 = Statics.field923.method2859(1, var178);
                                            class39 var182 = new class39();
                                            if (var181 != null) {
                                                var182.method733(new class111(var181), var178);
                                            }
                                            var182.method721();
                                            class39.field921.method3317(var182, (long) var178);
                                            var180 = var182;
                                        } else {
                                            var180 = var179;
                                        }
                                        Statics.field70[var167] -= var180.field920;
                                        Statics.field1142[var167] -= var180.field924;
                                        Statics.field2563[var167] -= var180.field925;
                                        Statics.field71[var167] -= var180.field926;
                                        var10002 = Statics.field726[var167]--;
                                    }
                                }
                            }
                            if (var166 >= 1 && var166 < 103) {
                                int var184 = 0;
                                int var185 = 0;
                                int var186 = 0;
                                int var187 = 0;
                                int var188 = 0;
                                for (int var189 = -5; var189 < 109; var189++) {
                                    int var190 = var189 + 5;
                                    if (var190 >= 0 && var190 < 104) {
                                        var184 += Statics.field70[var190];
                                        var185 += Statics.field1142[var190];
                                        var186 += Statics.field2563[var190];
                                        var187 += Statics.field71[var190];
                                        var188 += Statics.field726[var190];
                                    }
                                    int var191 = var189 - 5;
                                    if (var191 >= 0 && var191 < 104) {
                                        var184 -= Statics.field70[var191];
                                        var185 -= Statics.field1142[var191];
                                        var186 -= Statics.field2563[var191];
                                        var187 -= Statics.field71[var191];
                                        var188 -= Statics.field726[var191];
                                    }
                                    if (var189 >= 1 && var189 < 103) {
                                        if (field263 && (class6.field65[0][var166][var189] & 0x2) == 0) {
                                            if ((class6.field65[var151][var166][var189] & 0x10) != 0) {
                                                continue;
                                            }
                                            int var192;
                                            if ((class6.field65[var151][var166][var189] & 0x8) != 0) {
                                                var192 = 0;
                                            } else if (var151 <= 0 || (class6.field65[1][var166][var189] & 0x2) == 0) {
                                                var192 = var151;
                                            } else {
                                                var192 = var151 - 1;
                                            }
                                            if (field312 != var192) {
                                                continue;
                                            }
                                        }
                                        if (var151 < class6.field68) {
                                            class6.field68 = var151;
                                        }
                                        int var193 = Statics.field3065[var151][var166][var189] & 0xFF;
                                        int var194 = Statics.field67[var151][var166][var189] & 0xFF;
                                        if (var193 > 0 || var194 > 0) {
                                            int var195 = class6.field83[var151][var166][var189];
                                            int var196 = class6.field83[var151][var166 + 1][var189];
                                            int var197 = class6.field83[var151][var166 + 1][var189 + 1];
                                            int var198 = class6.field83[var151][var166][var189 + 1];
                                            int var199 = Statics.field69[var166][var189];
                                            int var200 = Statics.field69[var166 + 1][var189];
                                            int var201 = Statics.field69[var166 + 1][var189 + 1];
                                            int var202 = Statics.field69[var166][var189 + 1];
                                            int var203 = -1;
                                            int var204 = -1;
                                            if (var193 > 0) {
                                                int var205 = var184 * 256 / var187;
                                                int var206 = var185 / var188;
                                                int var207 = var186 / var188;
                                                var203 = class6.method2518(var205, var206, var207);
                                                int var208 = class6.field72 + var205 & 0xFF;
                                                int var209 = class6.field66 + var207;
                                                if (var209 < 0) {
                                                    var209 = 0;
                                                } else if (var209 > 255) {
                                                    var209 = 255;
                                                }
                                                var204 = class6.method2518(var208, var206, var209);
                                            }
                                            if (var151 > 0) {
                                                boolean var210 = true;
                                                if (var193 == 0 && Statics.field817[var151][var166][var189] != 0) {
                                                    var210 = false;
                                                }
                                                if (var194 > 0) {
                                                    int var211 = var194 - 1;
                                                    class43 var212 = (class43) class43.field989.method3315((long) var211);
                                                    class43 var213;
                                                    if (var212 == null) {
                                                        byte[] var214 = Statics.field996.method2859(4, var211);
                                                        class43 var215 = new class43();
                                                        if (var214 != null) {
                                                            var215.method827(new class111(var214), var211);
                                                        }
                                                        var215.method826();
                                                        class43.field989.method3317(var215, (long) var211);
                                                        var213 = var215;
                                                    } else {
                                                        var213 = var212;
                                                    }
                                                    if (!var213.field988) {
                                                        var210 = false;
                                                    }
                                                }
                                                if (var210 && var195 == var196 && var195 == var197 && var195 == var198) {
                                                    Statics.field1843[var151][var166][var189] |= 0x924;
                                                }
                                            }
                                            int var216 = 0;
                                            if (var204 != -1) {
                                                var216 = class86.field1496[class6.method3081(var204, 96)];
                                            }
                                            if (var194 == 0) {
                                                var145.method1708(var151, var166, var189, 0, 0, -1, var195, var196, var197, var198, class6.method3081(var203, var199), class6.method3081(var203, var200), class6.method3081(var203, var201), class6.method3081(var203, var202), 0, 0, 0, 0, var216, 0);
                                            } else {
                                                int var217 = Statics.field817[var151][var166][var189] + 1;
                                                byte var218 = Statics.field86[var151][var166][var189];
                                                int var219 = var194 - 1;
                                                class43 var220 = (class43) class43.field989.method3315((long) var219);
                                                class43 var221;
                                                if (var220 == null) {
                                                    byte[] var222 = Statics.field996.method2859(4, var219);
                                                    class43 var223 = new class43();
                                                    if (var222 != null) {
                                                        var223.method827(new class111(var222), var219);
                                                    }
                                                    var223.method826();
                                                    class43.field989.method3317(var223, (long) var219);
                                                    var221 = var223;
                                                } else {
                                                    var221 = var220;
                                                }
                                                int var225 = var221.field991;
                                                int var226;
                                                int var227;
                                                if (var225 >= 0) {
                                                    var226 = Statics.field1509.method1864(var225);
                                                    var227 = -1;
                                                } else if (var221.field990 == 16711935) {
                                                    var227 = -2;
                                                    var225 = -1;
                                                    var226 = -2;
                                                } else {
                                                    var227 = class6.method2518(var221.field994, var221.field995, var221.field998);
                                                    int var228 = class6.field72 + var221.field994 & 0xFF;
                                                    int var229 = class6.field66 + var221.field998;
                                                    if (var229 < 0) {
                                                        var229 = 0;
                                                    } else if (var229 > 255) {
                                                        var229 = 255;
                                                    }
                                                    var226 = class6.method2518(var228, var221.field995, var229);
                                                }
                                                int var230 = 0;
                                                if (var226 != -2) {
                                                    var230 = class86.field1496[class6.method19(var226, 96)];
                                                }
                                                if (var221.field993 != -1) {
                                                    int var231 = class6.field72 + var221.field997 & 0xFF;
                                                    int var232 = class6.field66 + var221.field1002;
                                                    if (var232 < 0) {
                                                        var232 = 0;
                                                    } else if (var232 > 255) {
                                                        var232 = 255;
                                                    }
                                                    int var233 = class6.method2518(var231, var221.field1001, var232);
                                                    var230 = class86.field1496[class6.method19(var233, 96)];
                                                }
                                                var145.method1708(var151, var166, var189, var217, var218, var225, var195, var196, var197, var198, class6.method3081(var203, var199), class6.method3081(var203, var200), class6.method3081(var203, var201), class6.method3081(var203, var202), class6.method19(var227, var199), class6.method19(var227, var200), class6.method19(var227, var201), class6.method19(var227, var202), var216, var230);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var234 = 1; var234 < 103; var234++) {
                            for (int var235 = 1; var235 < 103; var235++) {
                                int var240;
                                if ((class6.field65[var151][var235][var234] & 0x8) != 0) {
                                    var240 = 0;
                                } else if (var151 <= 0 || (class6.field65[1][var235][var234] & 0x2) == 0) {
                                    var240 = var151;
                                } else {
                                    var240 = var151 - 1;
                                }
                                var145.method1771(var151, var235, var234, var240);
                            }
                        }
                        Statics.field3065[var151] = (byte[][]) null;
                        Statics.field67[var151] = (byte[][]) null;
                        Statics.field817[var151] = (byte[][]) null;
                        Statics.field86[var151] = (byte[][]) null;
                        Statics.field2188[var151] = (byte[][]) null;
                    }
                    var145.method1656(-50, -10, -50);
                    for (int var241 = 0; var241 < 104; var241++) {
                        for (int var242 = 0; var242 < 104; var242++) {
                            if ((class6.field65[1][var241][var242] & 0x2) == 2) {
                                var145.method1777(var241, var242);
                            }
                        }
                    }
                    int var243 = 1;
                    int var244 = 2;
                    int var245 = 4;
                    for (int var246 = 0; var246 < 4; var246++) {
                        if (var246 > 0) {
                            var243 <<= 0x3;
                            var244 <<= 0x3;
                            var245 <<= 0x3;
                        }
                        for (int var247 = 0; var247 <= var246; var247++) {
                            for (int var248 = 0; var248 <= 104; var248++) {
                                for (int var249 = 0; var249 <= 104; var249++) {
                                    if ((Statics.field1843[var247][var249][var248] & var243) != 0) {
                                        int var250 = var248;
                                        int var251 = var248;
                                        int var252 = var247;
                                        int var253 = var247;
                                        while (var250 > 0 && (Statics.field1843[var247][var249][var250 - 1] & var243) != 0) {
                                            var250--;
                                        }
                                        while (var251 < 104 && (Statics.field1843[var247][var249][var251 + 1] & var243) != 0) {
                                            var251++;
                                        }
                                        label3639: while (var252 > 0) {
                                            for (int var254 = var250; var254 <= var251; var254++) {
                                                if ((Statics.field1843[var252 - 1][var249][var254] & var243) == 0) {
                                                    break label3639;
                                                }
                                            }
                                            var252--;
                                        }
                                        label3628: while (var253 < var246) {
                                            for (int var255 = var250; var255 <= var251; var255++) {
                                                if ((Statics.field1843[var253 + 1][var249][var255] & var243) == 0) {
                                                    break label3628;
                                                }
                                            }
                                            var253++;
                                        }
                                        int var256 = (var253 + 1 - var252) * (var251 - var250 + 1);
                                        if (var256 >= 8) {
                                            short var257 = 240;
                                            int var258 = class6.field83[var253][var249][var250] - var257;
                                            int var259 = class6.field83[var252][var249][var250];
                                            class81.method1668(var246, 1, var249 * 128, var249 * 128, var250 * 128, var251 * 128 + 128, var258, var259);
                                            for (int var260 = var252; var260 <= var253; var260++) {
                                                for (int var261 = var250; var261 <= var251; var261++) {
                                                    Statics.field1843[var260][var249][var261] &= ~var243;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1843[var247][var249][var248] & var244) != 0) {
                                        int var262 = var249;
                                        int var263 = var249;
                                        int var264 = var247;
                                        int var265 = var247;
                                        while (var262 > 0 && (Statics.field1843[var247][var262 - 1][var248] & var244) != 0) {
                                            var262--;
                                        }
                                        while (var263 < 104 && (Statics.field1843[var247][var263 + 1][var248] & var244) != 0) {
                                            var263++;
                                        }
                                        label3692: while (var264 > 0) {
                                            for (int var266 = var262; var266 <= var263; var266++) {
                                                if ((Statics.field1843[var264 - 1][var266][var248] & var244) == 0) {
                                                    break label3692;
                                                }
                                            }
                                            var264--;
                                        }
                                        label3681: while (var265 < var246) {
                                            for (int var267 = var262; var267 <= var263; var267++) {
                                                if ((Statics.field1843[var265 + 1][var267][var248] & var244) == 0) {
                                                    break label3681;
                                                }
                                            }
                                            var265++;
                                        }
                                        int var268 = (var265 + 1 - var264) * (var263 - var262 + 1);
                                        if (var268 >= 8) {
                                            short var269 = 240;
                                            int var270 = class6.field83[var265][var262][var248] - var269;
                                            int var271 = class6.field83[var264][var262][var248];
                                            class81.method1668(var246, 2, var262 * 128, var263 * 128 + 128, var248 * 128, var248 * 128, var270, var271);
                                            for (int var272 = var264; var272 <= var265; var272++) {
                                                for (int var273 = var262; var273 <= var263; var273++) {
                                                    Statics.field1843[var272][var273][var248] &= ~var244;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1843[var247][var249][var248] & var245) != 0) {
                                        int var274 = var249;
                                        int var275 = var249;
                                        int var276 = var248;
                                        int var277 = var248;
                                        while (var276 > 0 && (Statics.field1843[var247][var249][var276 - 1] & var245) != 0) {
                                            var276--;
                                        }
                                        while (var277 < 104 && (Statics.field1843[var247][var249][var277 + 1] & var245) != 0) {
                                            var277++;
                                        }
                                        label3745: while (var274 > 0) {
                                            for (int var278 = var276; var278 <= var277; var278++) {
                                                if ((Statics.field1843[var247][var274 - 1][var278] & var245) == 0) {
                                                    break label3745;
                                                }
                                            }
                                            var274--;
                                        }
                                        label3734: while (var275 < 104) {
                                            for (int var279 = var276; var279 <= var277; var279++) {
                                                if ((Statics.field1843[var247][var275 + 1][var279] & var245) == 0) {
                                                    break label3734;
                                                }
                                            }
                                            var275++;
                                        }
                                        if ((var275 - var274 + 1) * (var277 - var276 + 1) >= 4) {
                                            int var280 = class6.field83[var247][var274][var276];
                                            class81.method1668(var246, 4, var274 * 128, var275 * 128 + 128, var276 * 128, var277 * 128 + 128, var280, var280);
                                            for (int var281 = var274; var281 <= var275; var281++) {
                                                for (int var282 = var276; var282 <= var277; var282++) {
                                                    Statics.field1843[var247][var281][var282] &= ~var245;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method3291(true);
                    int var283 = class6.field68;
                    if (var283 > Statics.field863) {
                        var283 = Statics.field863;
                    }
                    if (var283 < Statics.field863 - 1) {
                        int var284 = Statics.field863 - 1;
                    }
                    if (field263) {
                        Statics.field1890.method1626(class6.field68);
                    } else {
                        Statics.field1890.method1626(0);
                    }
                    for (int var285 = 0; var285 < 104; var285++) {
                        for (int var286 = 0; var286 < 104; var286++) {
                            method1068(var285, var286);
                        }
                    }
                    method824();
                    method34();
                    class38.field870.method3319();
                    if (Statics.field1864 != null) {
                        field521.method2402(242);
                        field521.method2143(1057001181);
                    }
                    if (!field319) {
                        int var287 = (Statics.field1382 - 6) / 8;
                        int var288 = (Statics.field1382 + 6) / 8;
                        int var289 = (Statics.field606 - 6) / 8;
                        int var290 = (Statics.field606 + 6) / 8;
                        for (int var291 = var287 - 1; var291 <= var288 + 1; var291++) {
                            for (int var292 = var289 - 1; var292 <= var290 + 1; var292++) {
                                if (var291 < var287 || var291 > var288 || var292 < var289 || var292 > var290) {
                                    Statics.field202.method2916("m" + var291 + "_" + var292);
                                    Statics.field202.method2916("l" + var291 + "_" + var292);
                                }
                            }
                        }
                    }
                    method873(30);
                    method824();
                    class6.method1622();
                    field521.method2402(212);
                    class136.method1452();
                } else {
                    field385 = 2;
                }
            } else {
                field385 = 1;
            }
        }
        if (field266 == 30) {
            if (field452 > 1) {
                field452--;
            }
            if (field309 > 0) {
                field309--;
            }
            if (field310) {
                field310 = false;
                if (field309 > 0) {
                    method2();
                } else {
                    method873(40);
                    Statics.field1092 = Statics.field3073;
                    Statics.field3073 = null;
                }
            } else {
                if (!field400) {
                    field406[0] = class148.field2289;
                    field407[0] = "";
                    field440[0] = 1006;
                    field401 = 1;
                }
                for (int var293 = 0; var293 < 100; var293++) {
                    boolean var294;
                    if (Statics.field3073 == null) {
                        var294 = false;
                    } else {
                        label4380: {
                            try {
                                int var295 = Statics.field3073.method2637();
                                if (var295 == 0) {
                                    var294 = false;
                                    break label4380;
                                }
                                if (field303 == -1) {
                                    Statics.field3073.method2652(field301.field1886, 0, 1);
                                    field301.field1888 = 0;
                                    field303 = field301.method2419();
                                    field284 = class179.field2942[field303];
                                    var295--;
                                }
                                if (field284 == -1) {
                                    if (var295 <= 0) {
                                        var294 = false;
                                        break label4380;
                                    }
                                    Statics.field3073.method2652(field301.field1886, 0, 1);
                                    field284 = field301.field1886[0] & 0xFF;
                                    var295--;
                                }
                                if (field284 == -2) {
                                    if (var295 <= 1) {
                                        var294 = false;
                                        break label4380;
                                    }
                                    Statics.field3073.method2652(field301.field1886, 0, 2);
                                    field301.field1888 = 0;
                                    field284 = field301.method2157();
                                    var295 -= 2;
                                }
                                if (var295 < field284) {
                                    var294 = false;
                                    break label4380;
                                }
                                field301.field1888 = 0;
                                Statics.field3073.method2652(field301.field1886, 0, field284);
                                field411 = 0;
                                field506 = field308;
                                field308 = field307;
                                field307 = field303;
                                if (field303 == 30) {
                                    int var296 = field301.method2348();
                                    class15 var297 = (class15) class15.field199.method3354((long) var296);
                                    if (var297 != null) {
                                        var297.method3474();
                                    }
                                    field448[++field335 - 1 & 0x1F] = var296 & 0x7FFF;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 227) {
                                    int var298 = field301.method2160();
                                    int var299 = field301.method2157();
                                    class164 var300 = class164.method2517(var298);
                                    if (var300 != null && var300.field2653 == 0) {
                                        if (var299 > var300.field2675 - var300.field2667) {
                                            var299 = var300.field2675 - var300.field2667;
                                        }
                                        if (var299 < 0) {
                                            var299 = 0;
                                        }
                                        if (var300.field2673 != var299) {
                                            var300.field2673 = var299;
                                            method2103(var300);
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 57) {
                                    int var301 = field301.method2197();
                                    int var302 = field301.method2348();
                                    int var303 = field301.method2268();
                                    class4 var304 = (class4) field421.method3354((long) var301);
                                    if (var304 != null) {
                                        method75(var304, var304.field53 != var302);
                                    }
                                    method3492(var301, var302, var303);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 41) {
                                    int var305 = field301.method2160();
                                    boolean var306 = field301.method2183() == 1;
                                    class164 var307 = class164.method2517(var305);
                                    if (var307.field2671 != var306) {
                                        var307.field2671 = var306;
                                        method2103(var307);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 195) {
                                    method2782(true);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 184) {
                                    int var308 = field284 + field301.field1888;
                                    int var309 = field301.method2157();
                                    int var310 = field301.method2157();
                                    if (field420 != var309) {
                                        field420 = var309;
                                        method1898(false);
                                        method606(field420);
                                        class34.method517(field420);
                                        for (int var311 = 0; var311 < 100; var311++) {
                                            field467[var311] = true;
                                        }
                                    }
                                    while (var310-- > 0) {
                                        int var312 = field301.method2160();
                                        int var313 = field301.method2157();
                                        int var314 = field301.method2155();
                                        class4 var315 = (class4) field421.method3354((long) var312);
                                        if (var315 != null && var315.field53 != var313) {
                                            method75(var315, true);
                                            var315 = null;
                                        }
                                        if (var315 == null) {
                                            var315 = method3492(var312, var313, var314);
                                        }
                                        var315.field51 = true;
                                    }
                                    for (class4 var316 = (class4) field421.method3345(); var316 != null; var316 = (class4) field421.method3358()) {
                                        if (var316.field51) {
                                            var316.field51 = false;
                                        } else {
                                            method75(var316, true);
                                        }
                                    }
                                    field464 = new class187(512);
                                    while (field301.field1888 < var308) {
                                        int var317 = field301.method2160();
                                        int var318 = field301.method2157();
                                        int var319 = field301.method2157();
                                        int var320 = field301.method2160();
                                        for (int var321 = var318; var321 <= var319; var321++) {
                                            long var322 = ((long) var317 << 32) + (long) var321;
                                            field464.method3346(new class192(var320), var322);
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 99) {
                                    Statics.field24 = field301.method2268();
                                    Statics.field649 = field301.method2183();
                                    while (field301.field1888 < field284) {
                                        field303 = field301.method2155();
                                        Statics.method2470();
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 22) {
                                    field518 = 1;
                                    field275 = field445;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 130) {
                                    method1801(field301.method2163());
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 255) {
                                    field496 = field301.method2155();
                                    if (field496 == 255) {
                                        field496 = 0;
                                    }
                                    field302 = field301.method2155();
                                    if (field302 == 255) {
                                        field302 = 0;
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 145) {
                                    for (int var324 = 0; var324 < field262.length; var324++) {
                                        if (field262[var324] != null) {
                                            field262[var324].field787 = -1;
                                        }
                                    }
                                    for (int var325 = 0; var325 < field536.length; var325++) {
                                        if (field536[var325] != null) {
                                            field536[var325].field787 = -1;
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 16) {
                                    method2926();
                                    field425 = field301.method2155();
                                    field530 = field445;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 247) {
                                    int var326 = field301.method2160();
                                    Statics.field14 = Statics.field813.method2524(var326);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 43) {
                                    int var327 = field301.method2183();
                                    String var328 = field301.method2163();
                                    int var329 = field301.method2183();
                                    if (var327 >= 1 && var327 <= 8) {
                                        if (var328.equalsIgnoreCase("null")) {
                                            var328 = null;
                                        }
                                        field388[var327 - 1] = var328;
                                        field389[var327 - 1] = var329 == 0;
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 191) {
                                    int var330 = field301.method2189();
                                    field420 = var330;
                                    method1898(false);
                                    method606(var330);
                                    class34.method517(field420);
                                    for (int var331 = 0; var331 < 100; var331++) {
                                        field467[var331] = true;
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 207) {
                                    field305 = 0;
                                    field380 = 0;
                                    field301.method2403();
                                    int var332 = field301.method2421(1);
                                    if (var332 != 0) {
                                        int var333 = field301.method2421(2);
                                        if (var333 == 0) {
                                            field381[++field380 - 1] = 2047;
                                        } else if (var333 == 1) {
                                            int var334 = field301.method2421(3);
                                            Statics.field633.method622(var334, false);
                                            int var335 = field301.method2421(1);
                                            if (var335 == 1) {
                                                field381[++field380 - 1] = 2047;
                                            }
                                        } else if (var333 == 2) {
                                            int var336 = field301.method2421(3);
                                            Statics.field633.method622(var336, true);
                                            int var337 = field301.method2421(3);
                                            Statics.field633.method622(var337, true);
                                            int var338 = field301.method2421(1);
                                            if (var338 == 1) {
                                                field381[++field380 - 1] = 2047;
                                            }
                                        } else if (var333 == 3) {
                                            int var339 = field301.method2421(7);
                                            int var340 = field301.method2421(1);
                                            if (var340 == 1) {
                                                field381[++field380 - 1] = 2047;
                                            }
                                            Statics.field863 = field301.method2421(2);
                                            int var341 = field301.method2421(7);
                                            int var342 = field301.method2421(1);
                                            Statics.field633.method621(var339, var341, var342 == 1);
                                        }
                                    }
                                    method1991();
                                    while (field301.method2407(field284) >= 11) {
                                        int var343 = field301.method2421(11);
                                        if (var343 == 2047) {
                                            break;
                                        }
                                        boolean var344 = false;
                                        if (field262[var343] == null) {
                                            field262[var343] = new class3();
                                            if (field473[var343] != null) {
                                                field262[var343].method11(field473[var343]);
                                            }
                                            var344 = true;
                                        }
                                        field379[++field317 - 1] = var343;
                                        class3 var345 = field262[var343];
                                        var345.field796 = field268;
                                        int var346 = field301.method2421(5);
                                        if (var346 > 15) {
                                            var346 -= 32;
                                        }
                                        int var347 = field301.method2421(1);
                                        if (var347 == 1) {
                                            field381[++field380 - 1] = var343;
                                        }
                                        int var348 = field301.method2421(1);
                                        int var349 = field390[field301.method2421(3)];
                                        if (var344) {
                                            var345.field806 = var345.field768 = var349;
                                        }
                                        int var350 = field301.method2421(5);
                                        if (var350 > 15) {
                                            var350 -= 32;
                                        }
                                        var345.method621(Statics.field633.field810[0] + var346, Statics.field633.field811[0] + var350, var348 == 1);
                                    }
                                    field301.method2406();
                                    for (int var351 = 0; var351 < field380; var351++) {
                                        int var352 = field381[var351];
                                        class3 var353 = field262[var352];
                                        int var354 = field301.method2155();
                                        if ((var354 & 0x8) != 0) {
                                            var354 += field301.method2155() << 8;
                                        }
                                        if ((var354 & 0x2) != 0) {
                                            int var355 = field301.method2155();
                                            byte[] var356 = new byte[var355];
                                            class111 var357 = new class111(var356);
                                            field301.method2305(var356, 0, var355);
                                            field473[var352] = var357;
                                            var353.method11(var357);
                                        }
                                        if ((var354 & 0x10) != 0) {
                                            var353.field769 = field301.method2163();
                                            if (var353.field769.charAt(0) == '~') {
                                                var353.field769 = var353.field769.substring(1);
                                                class11.method582(2, var353.field30, var353.field769);
                                            } else if (Statics.field633 == var353) {
                                                class11.method582(2, var353.field30, var353.field769);
                                            }
                                            var353.field770 = false;
                                            var353.field773 = 0;
                                            var353.field774 = 0;
                                            var353.field781 = 150;
                                        }
                                        if ((var354 & 0x20) != 0) {
                                            int var358 = field301.method2189();
                                            if (var358 == 65535) {
                                                var358 = -1;
                                            }
                                            int var359 = field301.method2182();
                                            method2660(var353, var358, var359);
                                        }
                                        if ((var354 & 0x80) != 0) {
                                            int var360 = field301.method2157();
                                            class143 var361 = (class143) class101.method146(class143.method3096(), field301.method2182());
                                            boolean var362 = field301.method2182() == 1;
                                            int var363 = field301.method2182();
                                            int var364 = field301.field1888;
                                            if (var353.field30 != null && var353.field29 != null) {
                                                boolean var365 = false;
                                                if (var361.field2159 && method2659(var353.field30)) {
                                                    var365 = true;
                                                }
                                                if (!var365 && field376 == 0 && !var353.field28) {
                                                    field378.field1888 = 0;
                                                    field301.method2353(field378.field1886, 0, var363);
                                                    field378.field1888 = 0;
                                                    String var366 = class214.method3658(class154.method1445(class213.method3548(field378)));
                                                    var353.field769 = var366.trim();
                                                    var353.field773 = var360 >> 8;
                                                    var353.field774 = var360 & 0xFF;
                                                    var353.field781 = 150;
                                                    var353.field770 = var362;
                                                    var353.field771 = Statics.field633 != var353 && var361.field2159 && field482 != "" && var366.toLowerCase().indexOf(field482) == -1;
                                                    int var367;
                                                    if (var361.field2154) {
                                                        var367 = var362 ? 91 : 1;
                                                    } else {
                                                        var367 = var362 ? 90 : 2;
                                                    }
                                                    if (var361.field2157 == -1) {
                                                        class11.method582(var367, var353.field30, var366);
                                                    } else {
                                                        int var369 = var361.field2157;
                                                        String var370 = "<img=" + var369 + ">";
                                                        class11.method582(var367, var370 + var353.field30, var366);
                                                    }
                                                }
                                            }
                                            field301.field1888 = var363 + var364;
                                        }
                                        if ((var354 & 0x100) != 0) {
                                            int var371 = field301.method2156();
                                            int var372 = field301.method2155();
                                            var353.method628(var371, var372, field268);
                                            var353.field778 = field268 + 300;
                                            var353.field779 = field301.method2268();
                                            var353.field790 = field301.method2268();
                                        }
                                        if ((var354 & 0x1) != 0) {
                                            var353.field782 = field301.method2157();
                                            var353.field783 = field301.method2189();
                                        }
                                        if ((var354 & 0x40) != 0) {
                                            int var373 = field301.method2348();
                                            int var374 = field301.method2155();
                                            var353.method628(var373, var374, field268);
                                            var353.field778 = field268 + 300;
                                            var353.field779 = field301.method2155();
                                            var353.field790 = field301.method2182();
                                        }
                                        if ((var354 & 0x400) != 0) {
                                            var353.field797 = field301.method2183();
                                            var353.field816 = field301.method2155();
                                            var353.field798 = field301.method2182();
                                            var353.field800 = field301.method2155();
                                            var353.field801 = field301.method2156() + field268;
                                            var353.field802 = field301.method2157() + field268;
                                            var353.field803 = field301.method2155();
                                            var353.field809 = 1;
                                            var353.field814 = 0;
                                        }
                                        if ((var354 & 0x4) != 0) {
                                            var353.field789 = field301.method2157();
                                            if (var353.field789 == 65535) {
                                                var353.field789 = -1;
                                            }
                                        }
                                        if ((var354 & 0x200) != 0) {
                                            var353.field767 = field301.method2189();
                                            int var375 = field301.method2197();
                                            var353.field756 = var375 >> 16;
                                            var353.field795 = (var375 & 0xFFFF) + field268;
                                            var353.field759 = 0;
                                            var353.field794 = 0;
                                            if (var353.field795 > field268) {
                                                var353.field759 = -1;
                                            }
                                            if (var353.field767 == 65535) {
                                                var353.field767 = -1;
                                            }
                                        }
                                    }
                                    for (int var376 = 0; var376 < field305; var376++) {
                                        int var377 = field386[var376];
                                        if (field268 != field262[var377].field796) {
                                            field262[var377] = null;
                                        }
                                    }
                                    if (field284 != field301.field1888) {
                                        throw new RuntimeException(field301.field1888 + class2.field15 + field284);
                                    }
                                    for (int var378 = 0; var378 < field317; var378++) {
                                        if (field262[field379[var378]] == null) {
                                            throw new RuntimeException(var378 + class2.field15 + field317);
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 189) {
                                    String var379 = field301.method2163();
                                    int var380 = field301.method2199();
                                    class164 var381 = class164.method2517(var380);
                                    if (!var379.equals(var381.field2709)) {
                                        var381.field2709 = var379;
                                        method2103(var381);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 80) {
                                    class24 var382 = new class24();
                                    var382.field616 = field301.method2163();
                                    var382.field608 = field301.method2157();
                                    int var383 = field301.method2160();
                                    var382.field614 = var383;
                                    method873(45);
                                    Statics.field3073.method2661();
                                    Statics.field3073 = null;
                                    class30.method564(var382);
                                    field303 = -1;
                                    var294 = false;
                                    break label4380;
                                }
                                if (field303 == 64) {
                                    method603(true);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 147) {
                                    field510 = true;
                                    Statics.field1088 = field301.method2155();
                                    Statics.field578 = field301.method2155();
                                    Statics.field2096 = field301.method2157();
                                    Statics.field114 = field301.method2155();
                                    Statics.field862 = field301.method2155();
                                    if (Statics.field862 >= 100) {
                                        int var384 = Statics.field1088 * 128 + 64;
                                        int var385 = Statics.field578 * 128 + 64;
                                        int var386 = method125(var384, var385, Statics.field863) - Statics.field2096;
                                        int var387 = var384 - Statics.field1996;
                                        int var388 = var386 - Statics.field1125;
                                        int var389 = var385 - Statics.field652;
                                        int var390 = (int) Math.sqrt((double) (var387 * var387 + var389 * var389));
                                        Statics.field113 = (int) (Math.atan2((double) var388, (double) var390) * 325.949D) & 0x7FF;
                                        Statics.field2151 = (int) (Math.atan2((double) var387, (double) var389) * -325.949D) & 0x7FF;
                                        if (Statics.field113 < 128) {
                                            Statics.field113 = 128;
                                        }
                                        if (Statics.field113 > 383) {
                                            Statics.field113 = 383;
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 220) {
                                    int var391 = field301.method2348();
                                    int var392 = field301.method2156();
                                    int var393 = field301.method2198();
                                    int var394 = field301.method2348();
                                    class164 var395 = class164.method2517(var393);
                                    if (var395.field2776 != var391 || var395.field2701 != var394 || var395.field2703 != var392) {
                                        var395.field2776 = var391;
                                        var395.field2701 = var394;
                                        var395.field2703 = var392;
                                        method2103(var395);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 45) {
                                    while (field301.field1888 < field284) {
                                        boolean var396 = field301.method2155() == 1;
                                        String var397 = field301.method2163();
                                        String var398 = field301.method2163();
                                        int var399 = field301.method2157();
                                        int var400 = field301.method2155();
                                        int var401 = field301.method2155();
                                        boolean var402 = (var401 & 0x2) != 0;
                                        boolean var403 = (var401 & 0x1) != 0;
                                        if (var399 > 0) {
                                            field301.method2163();
                                            field301.method2155();
                                            field301.method2160();
                                        }
                                        field301.method2163();
                                        for (int var404 = 0; var404 < field254; var404++) {
                                            class17 var405 = field449[var404];
                                            if (var396) {
                                                if (var398.equals(var405.field233)) {
                                                    var405.field233 = var397;
                                                    var405.field229 = var398;
                                                    var397 = null;
                                                    break;
                                                }
                                            } else if (var397.equals(var405.field233)) {
                                                if (var405.field230 != var399) {
                                                    boolean var406 = true;
                                                    for (class36 var407 = (class36) field532.method3344(); var407 != null; var407 = (class36) field532.method3336()) {
                                                        if (var407.field821.equals(var397)) {
                                                            if (var399 != 0 && var407.field822 == 0) {
                                                                var407.method3466();
                                                                var406 = false;
                                                            } else if (var399 == 0 && var407.field822 != 0) {
                                                                var407.method3466();
                                                                var406 = false;
                                                            }
                                                        }
                                                    }
                                                    if (var406) {
                                                        field532.method3335(new class36(var397, var399));
                                                    }
                                                    var405.field230 = var399;
                                                }
                                                var405.field229 = var398;
                                                var405.field237 = var400;
                                                var405.field232 = var402;
                                                var405.field231 = var403;
                                                var397 = null;
                                                break;
                                            }
                                        }
                                        if (var397 != null && field254 < 400) {
                                            class17 var408 = new class17();
                                            field449[field254] = var408;
                                            var408.field233 = var397;
                                            var408.field229 = var398;
                                            var408.field230 = var399;
                                            var408.field237 = var400;
                                            var408.field232 = var402;
                                            var408.field231 = var403;
                                            field254++;
                                        }
                                    }
                                    field518 = 2;
                                    field275 = field445;
                                    boolean var409 = false;
                                    int var410 = field254;
                                    while (var410 > 0) {
                                        boolean var411 = true;
                                        var410--;
                                        for (int var412 = 0; var412 < var410; var412++) {
                                            boolean var413 = false;
                                            class17 var414 = field449[var412];
                                            class17 var415 = field449[var412 + 1];
                                            if (field257 != var414.field230 && field257 == var415.field230) {
                                                var413 = true;
                                            }
                                            if (!var413 && var414.field230 == 0 && var415.field230 != 0) {
                                                var413 = true;
                                            }
                                            if (!var413 && !var414.field232 && var415.field232) {
                                                var413 = true;
                                            }
                                            if (!var413 && !var414.field231 && var415.field231) {
                                                var413 = true;
                                            }
                                            if (var413) {
                                                class17 var416 = field449[var412];
                                                field449[var412] = field449[var412 + 1];
                                                field449[var412 + 1] = var416;
                                                var411 = false;
                                            }
                                        }
                                        if (var411) {
                                            break;
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 165) {
                                    field510 = true;
                                    Statics.field917 = field301.method2155();
                                    Statics.field1961 = field301.method2155();
                                    Statics.field1283 = field301.method2157();
                                    Statics.field2550 = field301.method2155();
                                    Statics.field2134 = field301.method2155();
                                    if (Statics.field2134 >= 100) {
                                        Statics.field1996 = Statics.field917 * 128 + 64;
                                        Statics.field652 = Statics.field1961 * 128 + 64;
                                        Statics.field1125 = method125(Statics.field1996, Statics.field652, Statics.field863) - Statics.field1283;
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 170) {
                                    int var417 = field301.method2168();
                                    boolean var418 = field301.method2155() == 1;
                                    String var419 = "";
                                    boolean var420 = false;
                                    if (var418) {
                                        var419 = field301.method2163();
                                        if (method2659(var419)) {
                                            var420 = true;
                                        }
                                    }
                                    String var421 = field301.method2163();
                                    if (!var420) {
                                        class11.method582(var417, var419, var421);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 74) {
                                    int var422 = field301.method2199();
                                    class164 var423 = class164.method2517(var422);
                                    var423.field2692 = 3;
                                    var423.field2647 = Statics.field633.field29.method3053();
                                    method2103(var423);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 21) {
                                    if (field420 != -1) {
                                        method73(field420, 0);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 154) {
                                    field510 = false;
                                    for (int var424 = 0; var424 < 5; var424++) {
                                        field329[var424] = false;
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 103) {
                                    Statics.field24 = field301.method2268();
                                    Statics.field649 = field301.method2183();
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 7) {
                                    int var425 = field301.method2199();
                                    int var426 = field301.method2156();
                                    int var427 = var426 >> 10 & 0x1F;
                                    int var428 = var426 >> 5 & 0x1F;
                                    int var429 = var426 & 0x1F;
                                    int var430 = (var429 << 3) + (var427 << 19) + (var428 << 11);
                                    class164 var431 = class164.method2517(var425);
                                    if (var431.field2720 != var430) {
                                        var431.field2720 = var430;
                                        method2103(var431);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 148) {
                                    int var432 = field301.method2157();
                                    int var433 = field301.method2155();
                                    int var434 = field301.method2157();
                                    method3530(var432, var433, var434);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 169) {
                                    Statics.field2964 = class122.method1802(field301.method2155());
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 17) {
                                    int var435 = field301.method2197();
                                    int var436 = field301.method2189();
                                    if (var436 == 65535) {
                                        var436 = -1;
                                    }
                                    int var437 = field301.method2198();
                                    int var438 = field301.method2156();
                                    if (var438 == 65535) {
                                        var438 = -1;
                                    }
                                    for (int var439 = var436; var439 <= var438; var439++) {
                                        long var440 = ((long) var435 << 32) + (long) var439;
                                        class199 var442 = field464.method3354(var440);
                                        if (var442 != null) {
                                            var442.method3474();
                                        }
                                        field464.method3346(new class192(var437), var440);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 208) {
                                    field452 = field301.method2157() * 30;
                                    field530 = field445;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 67) {
                                    int var443 = field301.method2198();
                                    int var444 = field301.method2160();
                                    class4 var445 = (class4) field421.method3354((long) var444);
                                    class4 var446 = (class4) field421.method3354((long) var443);
                                    if (var446 != null) {
                                        method75(var446, var445 == null || var445.field53 != var446.field53);
                                    }
                                    if (var445 != null) {
                                        var445.method3474();
                                        field421.method3346(var445, (long) var443);
                                    }
                                    class164 var447 = class164.method2517(var444);
                                    if (var447 != null) {
                                        method2103(var447);
                                    }
                                    class164 var448 = class164.method2517(var443);
                                    if (var448 != null) {
                                        method2103(var448);
                                        method2754(Statics.field2642[var448.field2651 >>> 16], var448, true);
                                    }
                                    if (field420 != -1) {
                                        method73(field420, 1);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 110) {
                                    int var449 = field301.method2160();
                                    class4 var450 = (class4) field421.method3354((long) var449);
                                    if (var450 != null) {
                                        method75(var450, true);
                                    }
                                    if (field276 != null) {
                                        method2103(field276);
                                        field276 = null;
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 132) {
                                    int var451 = field301.method2155();
                                    int var452 = field301.method2155();
                                    int var453 = field301.method2155();
                                    int var454 = field301.method2155();
                                    field329[var451] = true;
                                    field512[var451] = var452;
                                    field477[var451] = var453;
                                    field514[var451] = var454;
                                    field515[var451] = 0;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 65) {
                                    int var455 = field301.method2160();
                                    int var456 = field301.method2157();
                                    if (var455 < -70000) {
                                        var456 += 32768;
                                    }
                                    class164 var457;
                                    if (var455 >= 0) {
                                        var457 = class164.method2517(var455);
                                    } else {
                                        var457 = null;
                                    }
                                    if (var457 != null) {
                                        for (int var458 = 0; var458 < var457.field2764.length; var458++) {
                                            var457.field2764[var458] = 0;
                                            var457.field2768[var458] = 0;
                                        }
                                    }
                                    class15.method1878(var456);
                                    int var459 = field301.method2157();
                                    for (int var460 = 0; var460 < var459; var460++) {
                                        int var461 = field301.method2155();
                                        if (var461 == 255) {
                                            var461 = field301.method2197();
                                        }
                                        int var462 = field301.method2156();
                                        if (var457 != null && var460 < var457.field2764.length) {
                                            var457.field2764[var460] = var462;
                                            var457.field2768[var460] = var461;
                                        }
                                        class15.method2440(var456, var460, var462 - 1, var461);
                                    }
                                    if (var457 != null) {
                                        method2103(var457);
                                    }
                                    method2926();
                                    field448[++field335 - 1 & 0x1F] = var456 & 0x7FFF;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 131) {
                                    String var463 = field301.method2163();
                                    long var464 = (long) field301.method2157();
                                    long var466 = (long) field301.method2315();
                                    class143 var468 = (class143) class101.method146(class143.method3096(), field301.method2155());
                                    long var469 = (var464 << 32) + var466;
                                    boolean var471 = false;
                                    for (int var472 = 0; var472 < 100; var472++) {
                                        if (field483[var472] == var469) {
                                            var471 = true;
                                            break;
                                        }
                                    }
                                    if (method2659(var463)) {
                                        var471 = true;
                                    }
                                    if (!var471 && field376 == 0) {
                                        field483[field484] = var469;
                                        field484 = (field484 + 1) % 100;
                                        String var473 = class214.method3658(class154.method1445(class213.method3548(field301)));
                                        byte var474;
                                        if (var468.field2154) {
                                            var474 = 7;
                                        } else {
                                            var474 = 3;
                                        }
                                        if (var468.field2157 == -1) {
                                            class11.method582(var474, var463, var473);
                                        } else {
                                            class11.method582(var474, Statics.method2574(var468.field2157) + var463, var473);
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 243) {
                                    int var475 = field301.method2160();
                                    int var476 = field301.method2192();
                                    class164 var477 = class164.method2517(var475);
                                    if (var477.field2696 != var476 || var476 == -1) {
                                        var477.field2696 = var476;
                                        var477.field2771 = 0;
                                        var477.field2772 = 0;
                                        method2103(var477);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 44) {
                                    for (int var478 = 0; var478 < Statics.field1086; var478++) {
                                        class48 var479 = class48.method571(var478);
                                        if (var479 != null) {
                                            class167.field2799[var478] = 0;
                                            class167.field2805[var478] = 0;
                                        }
                                    }
                                    method2926();
                                    field447 += 32;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 66) {
                                    int var480 = field301.method2183();
                                    int var481 = field301.method2268();
                                    int var482 = field301.method2155();
                                    Statics.field863 = var480 >> 1;
                                    Statics.field633.method621(var482, var481, (var480 & 0x1) == 1);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 126) {
                                    String var483 = field301.method2163();
                                    long var484 = field301.method2161();
                                    long var486 = (long) field301.method2157();
                                    long var488 = (long) field301.method2315();
                                    class143 var490 = (class143) class101.method146(class143.method3096(), field301.method2155());
                                    long var491 = (var486 << 32) + var488;
                                    boolean var493 = false;
                                    for (int var494 = 0; var494 < 100; var494++) {
                                        if (field483[var494] == var491) {
                                            var493 = true;
                                            break;
                                        }
                                    }
                                    if (var490.field2159 && method2659(var483)) {
                                        var493 = true;
                                    }
                                    if (!var493 && field376 == 0) {
                                        field483[field484] = var491;
                                        field484 = (field484 + 1) % 100;
                                        String var495 = class214.method3658(class154.method1445(class213.method3548(field301)));
                                        if (var490.field2157 == -1) {
                                            class11.method36(9, var483, var495, class153.method2744(var484));
                                        } else {
                                            class11.method36(9, Statics.method2574(var490.field2157) + var483, var495, class153.method2744(var484));
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 49) {
                                    method603(false);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 187) {
                                    int var496 = field301.method2160();
                                    int var497 = field301.method2199();
                                    int var498 = field301.method2156();
                                    if (var498 == 65535) {
                                        var498 = -1;
                                    }
                                    class164 var499 = class164.method2517(var497);
                                    if (var499.field2777) {
                                        var499.field2685 = var498;
                                        var499.field2770 = var496;
                                        class47 var501 = class47.method496(var498);
                                        var499.field2776 = var501.field1045;
                                        var499.field2701 = var501.field1032;
                                        var499.field2702 = var501.field1042;
                                        var499.field2698 = var501.field1051;
                                        var499.field2699 = var501.field1052;
                                        var499.field2703 = var501.field1048;
                                        if (var501.field1076 == 1) {
                                            var499.field2707 = 1;
                                        } else {
                                            var499.field2707 = 2;
                                        }
                                        if (var499.field2704 > 0) {
                                            var499.field2703 = var499.field2703 * 32 / var499.field2704;
                                        } else if (var499.field2662 > 0) {
                                            var499.field2703 = var499.field2703 * 32 / var499.field2662;
                                        }
                                        method2103(var499);
                                    } else {
                                        if (var498 == -1) {
                                            var499.field2692 = 0;
                                            field303 = -1;
                                            var294 = true;
                                            break label4380;
                                        }
                                        class47 var500 = class47.method496(var498);
                                        var499.field2692 = 4;
                                        var499.field2647 = var498;
                                        var499.field2776 = var500.field1045;
                                        var499.field2701 = var500.field1032;
                                        var499.field2703 = var500.field1048 * 100 / var496;
                                        method2103(var499);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 69) {
                                    method2782(false);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 236) {
                                    int var502 = field301.method2160();
                                    int var503 = field301.method2157();
                                    if (var502 < -70000) {
                                        var503 += 32768;
                                    }
                                    class164 var504;
                                    if (var502 >= 0) {
                                        var504 = class164.method2517(var502);
                                    } else {
                                        var504 = null;
                                    }
                                    while (field301.field1888 < field284) {
                                        int var505 = field301.method2168();
                                        int var506 = field301.method2157();
                                        int var507 = 0;
                                        if (var506 != 0) {
                                            var507 = field301.method2155();
                                            if (var507 == 255) {
                                                var507 = field301.method2160();
                                            }
                                        }
                                        if (var504 != null && var505 >= 0 && var505 < var504.field2764.length) {
                                            var504.field2764[var505] = var506;
                                            var504.field2768[var505] = var507;
                                        }
                                        class15.method2440(var503, var505, var506 - 1, var507);
                                    }
                                    if (var504 != null) {
                                        method2103(var504);
                                    }
                                    method2926();
                                    field448[++field335 - 1 & 0x1F] = var503 & 0x7FFF;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 119) {
                                    field427 = field301.method2155();
                                    field481 = field301.method2155();
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 201) {
                                    boolean var508 = field301.method2155() == 1;
                                    if (var508) {
                                        Statics.field1297 = class107.method2784() - field301.method2161();
                                        Statics.field1150 = new class212(field301, true);
                                    } else {
                                        Statics.field1150 = null;
                                    }
                                    field456 = field445;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 182) {
                                    class114 var509 = field301;
                                    int var510 = field284;
                                    class201 var511 = new class201();
                                    var511.field3021 = var509.method2155();
                                    var511.field3018 = var509.method2160();
                                    var511.field3020 = new int[var511.field3021];
                                    var511.field3025 = new int[var511.field3021];
                                    var511.field3022 = new Field[var511.field3021];
                                    var511.field3023 = new int[var511.field3021];
                                    var511.field3024 = new Method[var511.field3021];
                                    var511.field3019 = new byte[var511.field3021][][];
                                    for (int var512 = 0; var512 < var511.field3021; var512++) {
                                        try {
                                            int var513 = var509.method2155();
                                            if (var513 == 0 || var513 == 1 || var513 == 2) {
                                                String var514 = var509.method2163();
                                                String var515 = var509.method2163();
                                                int var516 = 0;
                                                if (var513 == 1) {
                                                    var516 = var509.method2160();
                                                }
                                                var511.field3020[var512] = var513;
                                                var511.field3023[var512] = var516;
                                                if (class202.method3303(var514).getClassLoader() == null) {
                                                    throw new SecurityException();
                                                }
                                                var511.field3022[var512] = class202.method3303(var514).getDeclaredField(var515);
                                            } else if (var513 == 3 || var513 == 4) {
                                                String var517 = var509.method2163();
                                                String var518 = var509.method2163();
                                                int var519 = var509.method2155();
                                                String[] var520 = new String[var519];
                                                for (int var521 = 0; var521 < var519; var521++) {
                                                    var520[var521] = var509.method2163();
                                                }
                                                String var522 = var509.method2163();
                                                byte[][] var523 = new byte[var519][];
                                                if (var513 == 3) {
                                                    for (int var524 = 0; var524 < var519; var524++) {
                                                        int var525 = var509.method2160();
                                                        var523[var524] = new byte[var525];
                                                        var509.method2305(var523[var524], 0, var525);
                                                    }
                                                }
                                                var511.field3020[var512] = var513;
                                                Class[] var526 = new Class[var519];
                                                for (int var527 = 0; var527 < var519; var527++) {
                                                    var526[var527] = class202.method3303(var520[var527]);
                                                }
                                                Class var528 = class202.method3303(var522);
                                                if (class202.method3303(var517).getClassLoader() == null) {
                                                    throw new SecurityException();
                                                }
                                                Method[] var529 = class202.method3303(var517).getDeclaredMethods();
                                                Method[] var530 = var529;
                                                for (int var531 = 0; var531 < var530.length; var531++) {
                                                    Method var532 = var530[var531];
                                                    if (var532.getName().equals(var518)) {
                                                        Class[] var533 = var532.getParameterTypes();
                                                        if (var526.length == var533.length) {
                                                            boolean var534 = true;
                                                            for (int var535 = 0; var535 < var526.length; var535++) {
                                                                if (var526[var535] != var533[var535]) {
                                                                    var534 = false;
                                                                    break;
                                                                }
                                                            }
                                                            if (var534 && var528 == var532.getReturnType()) {
                                                                var511.field3024[var512] = var532;
                                                            }
                                                        }
                                                    }
                                                }
                                                var511.field3019[var512] = var523;
                                            }
                                        } catch (ClassNotFoundException var719) {
                                            var511.field3025[var512] = -1;
                                        } catch (SecurityException var720) {
                                            var511.field3025[var512] = -2;
                                        } catch (NullPointerException var721) {
                                            var511.field3025[var512] = -3;
                                        } catch (Exception var722) {
                                            var511.field3025[var512] = -4;
                                        } catch (Throwable var723) {
                                            var511.field3025[var512] = -5;
                                        }
                                    }
                                    class202.field3027.method3425(var511);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 107) {
                                    for (int var541 = 0; var541 < class167.field2805.length; var541++) {
                                        if (class167.field2805[var541] != class167.field2799[var541]) {
                                            class167.field2805[var541] = class167.field2799[var541];
                                            method157(var541);
                                            field446[++field447 - 1 & 0x1F] = var541;
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 68) {
                                    field365 = field301.method2155();
                                    if (field365 == 1) {
                                        field513 = field301.method2157();
                                    }
                                    if (field365 >= 2 && field365 <= 6) {
                                        if (field365 == 2) {
                                            field524 = 64;
                                            field264 = 64;
                                        }
                                        if (field365 == 3) {
                                            field524 = 0;
                                            field264 = 64;
                                        }
                                        if (field365 == 4) {
                                            field524 = 128;
                                            field264 = 64;
                                        }
                                        if (field365 == 5) {
                                            field524 = 64;
                                            field264 = 0;
                                        }
                                        if (field365 == 6) {
                                            field524 = 64;
                                            field264 = 128;
                                        }
                                        field365 = 2;
                                        field279 = field301.method2157();
                                        field280 = field301.method2157();
                                        field281 = field301.method2155();
                                    }
                                    if (field365 == 10) {
                                        field278 = field301.method2157();
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 174) {
                                    int var542 = field301.method2348();
                                    byte var543 = field301.method2255();
                                    class167.field2799[var542] = var543;
                                    if (class167.field2805[var542] != var543) {
                                        class167.field2805[var542] = var543;
                                        method157(var542);
                                    }
                                    field446[++field447 - 1 & 0x1F] = var542;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 105) {
                                    int var544 = field301.method2197();
                                    class164 var545 = class164.method2517(var544);
                                    for (int var546 = 0; var546 < var545.field2764.length; var546++) {
                                        var545.field2764[var546] = -1;
                                        var545.field2764[var546] = 0;
                                    }
                                    method2103(var545);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 232) {
                                    method2926();
                                    field426 = field301.method2166();
                                    field530 = field445;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 194) {
                                    int var547 = field301.method2192();
                                    int var548 = field301.method2197();
                                    int var549 = field301.method2191();
                                    class164 var550 = class164.method2517(var548);
                                    if (var550.field2719 != var547 || var550.field2661 != var549 || var550.field2660 != 0 || var550.field2657 != 0) {
                                        var550.field2719 = var547;
                                        var550.field2661 = var549;
                                        var550.field2660 = 0;
                                        var550.field2657 = 0;
                                        method2103(var550);
                                        method2503(var550);
                                        if (var550.field2653 == 0) {
                                            method2754(Statics.field2642[var548 >> 16], var550, false);
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 180) {
                                    while (field301.field1888 < field284) {
                                        int var551 = field301.method2155();
                                        boolean var552 = (var551 & 0x1) == 1;
                                        String var553 = field301.method2163();
                                        String var554 = field301.method2163();
                                        field301.method2163();
                                        for (int var555 = 0; var555 < field533; var555++) {
                                            class8 var556 = field534[var555];
                                            if (var552) {
                                                if (var554.equals(var556.field122)) {
                                                    var556.field122 = var553;
                                                    var556.field119 = var554;
                                                    var553 = null;
                                                    break;
                                                }
                                            } else if (var553.equals(var556.field122)) {
                                                var556.field122 = var553;
                                                var556.field119 = var554;
                                                var553 = null;
                                                break;
                                            }
                                        }
                                        if (var553 != null && field533 < 400) {
                                            class8 var557 = new class8();
                                            field534[field533] = var557;
                                            var557.field122 = var553;
                                            var557.field119 = var554;
                                            field533++;
                                        }
                                    }
                                    field275 = field445;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 37) {
                                    Statics.field24 = field301.method2183();
                                    Statics.field649 = field301.method2268();
                                    for (int var558 = Statics.field649; var558 < Statics.field649 + 8; var558++) {
                                        for (int var559 = Statics.field24; var559 < Statics.field24 + 8; var559++) {
                                            if (field465[Statics.field863][var558][var559] != null) {
                                                field465[Statics.field863][var558][var559] = null;
                                                method1068(var558, var559);
                                            }
                                        }
                                    }
                                    for (class16 var560 = (class16) field393.method3382(); var560 != null; var560 = (class16) field393.method3384()) {
                                        if (var560.field209 >= Statics.field649 && var560.field209 < Statics.field649 + 8 && var560.field212 >= Statics.field24 && var560.field212 < Statics.field24 + 8 && Statics.field863 == var560.field223) {
                                            var560.field220 = 0;
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 143) {
                                    int var561 = field301.method2156();
                                    if (var561 == 65535) {
                                        var561 = -1;
                                    }
                                    if (var561 == -1 && !field501) {
                                        class174.method2070();
                                    } else if (var561 != -1 && field500 != var561 && field499 != 0 && !field501) {
                                        class174.method566(2, Statics.field819, var561, 0, field499, false);
                                    }
                                    field500 = var561;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 251) {
                                    int var562 = field301.method2315();
                                    int var563 = field301.method2157();
                                    if (var563 == 65535) {
                                        var563 = -1;
                                    }
                                    if (field499 != 0 && var563 != -1) {
                                        class174.method167(Statics.field190, var563, 0, field499, false);
                                        field501 = true;
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 72) {
                                    method2();
                                    field303 = -1;
                                    var294 = false;
                                    break label4380;
                                }
                                if (field303 == 124) {
                                    field523 = field301.method2155();
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 172) {
                                    int var564 = field301.method2348();
                                    int var565 = field301.method2348();
                                    int var566 = field301.method2197();
                                    class164 var567 = class164.method2517(var566);
                                    var567.field2705 = (var564 << 16) + var565;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 6) {
                                    field454 = field445;
                                    if (field284 == 0) {
                                        field489 = null;
                                        field490 = null;
                                        Statics.field601 = 0;
                                        Statics.field2490 = null;
                                        field303 = -1;
                                        var294 = true;
                                        break label4380;
                                    }
                                    field490 = field301.method2163();
                                    long var568 = field301.method2161();
                                    field489 = class153.method107(var568);
                                    Statics.field548 = field301.method2173();
                                    int var570 = field301.method2155();
                                    if (var570 == 255) {
                                        field303 = -1;
                                        var294 = true;
                                        break label4380;
                                    }
                                    Statics.field601 = var570;
                                    class23[] var571 = new class23[100];
                                    for (int var572 = 0; var572 < Statics.field601; var572++) {
                                        var571[var572] = new class23();
                                        var571[var572].field599 = field301.method2163();
                                        var571[var572].field600 = class155.method2657(var571[var572].field599, Statics.field316);
                                        var571[var572].field593 = field301.method2157();
                                        var571[var572].field594 = field301.method2173();
                                        field301.method2163();
                                        if (var571[var572].field599.equals(Statics.field633.field30)) {
                                            Statics.field1122 = var571[var572].field594;
                                        }
                                    }
                                    boolean var573 = false;
                                    int var574 = Statics.field601;
                                    while (var574 > 0) {
                                        boolean var575 = true;
                                        var574--;
                                        for (int var576 = 0; var576 < var574; var576++) {
                                            if (var571[var576].field600.compareTo(var571[var576 + 1].field600) > 0) {
                                                class23 var577 = var571[var576];
                                                var571[var576] = var571[var576 + 1];
                                                var571[var576 + 1] = var577;
                                                var575 = false;
                                            }
                                        }
                                        if (var575) {
                                            break;
                                        }
                                    }
                                    Statics.field2490 = var571;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 92) {
                                    String var578 = field301.method2163();
                                    Object[] var579 = new Object[var578.length() + 1];
                                    for (int var580 = var578.length() - 1; var580 >= 0; var580--) {
                                        if (var578.charAt(var580) == 's') {
                                            var579[var580 + 1] = field301.method2163();
                                        } else {
                                            var579[var580 + 1] = Integer.valueOf(field301.method2160());
                                        }
                                    }
                                    var579[0] = Integer.valueOf(field301.method2160());
                                    class1 var581 = new class1();
                                    var581.field7 = var579;
                                    class34.method613(var581);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 13) {
                                    method2926();
                                    int var582 = field301.method2183();
                                    int var583 = field301.method2197();
                                    int var584 = field301.method2268();
                                    field398[var584] = var583;
                                    field396[var584] = var582;
                                    field314[var584] = 1;
                                    for (int var585 = 0; var585 < 98; var585++) {
                                        if (var583 >= class146.field2186[var585]) {
                                            field314[var584] = var585 + 2;
                                        }
                                    }
                                    field497[++field451 - 1 & 0x1F] = var584;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 116) {
                                    String var586 = field301.method2163();
                                    int var587 = field301.method2157();
                                    byte var588 = field301.method2173();
                                    boolean var589 = false;
                                    if (var588 == -128) {
                                        var589 = true;
                                    }
                                    if (var589) {
                                        if (Statics.field601 == 0) {
                                            field303 = -1;
                                            var294 = true;
                                            break label4380;
                                        }
                                        boolean var590 = false;
                                        int var591;
                                        for (var591 = 0; var591 < Statics.field601 && (!Statics.field2490[var591].field599.equals(var586) || Statics.field2490[var591].field593 != var587); var591++) {
                                        }
                                        if (var591 < Statics.field601) {
                                            while (var591 < Statics.field601 - 1) {
                                                Statics.field2490[var591] = Statics.field2490[var591 + 1];
                                                var591++;
                                            }
                                            Statics.field601--;
                                            Statics.field2490[Statics.field601] = null;
                                        }
                                    } else {
                                        field301.method2163();
                                        class23 var592 = new class23();
                                        var592.field599 = var586;
                                        var592.field600 = class155.method2657(var592.field599, Statics.field316);
                                        var592.field593 = var587;
                                        var592.field594 = var588;
                                        int var593;
                                        for (var593 = Statics.field601 - 1; var593 >= 0; var593--) {
                                            int var594 = Statics.field2490[var593].field600.compareTo(var592.field600);
                                            if (var594 == 0) {
                                                Statics.field2490[var593].field593 = var587;
                                                Statics.field2490[var593].field594 = var588;
                                                if (var586.equals(Statics.field633.field30)) {
                                                    Statics.field1122 = var588;
                                                }
                                                field454 = field445;
                                                field303 = -1;
                                                var294 = true;
                                                break label4380;
                                            }
                                            if (var594 < 0) {
                                                break;
                                            }
                                        }
                                        if (Statics.field601 >= Statics.field2490.length) {
                                            field303 = -1;
                                            var294 = true;
                                            break label4380;
                                        }
                                        for (int var595 = Statics.field601 - 1; var595 > var593; var595--) {
                                            Statics.field2490[var595 + 1] = Statics.field2490[var595];
                                        }
                                        if (Statics.field601 == 0) {
                                            Statics.field2490 = new class23[100];
                                        }
                                        Statics.field2490[var593 + 1] = var592;
                                        Statics.field601++;
                                        if (var586.equals(Statics.field633.field30)) {
                                            Statics.field1122 = var588;
                                        }
                                    }
                                    field454 = field445;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 53) {
                                    field301.field1888 += 28;
                                    if (field301.method2177()) {
                                        class114 var596 = field301;
                                        int var597 = field301.field1888 - 28;
                                        if (class141.field2125 != null) {
                                            try {
                                                class141.field2125.method3713(0L);
                                                class141.field2125.method3718(var596.field1886, var597, 24);
                                            } catch (Exception var715) {
                                            }
                                        }
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 151 || field303 == 215 || field303 == 178 || field303 == 248 || field303 == 125 || field303 == 157 || field303 == 252 || field303 == 228 || field303 == 109 || field303 == 19) {
                                    Statics.method2470();
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 225) {
                                    int var599 = field301.method2155();
                                    if (field301.method2155() == 0) {
                                        field538[var599] = new class211();
                                        field301.field1888 += 18;
                                    } else {
                                        field301.field1888--;
                                        field538[var599] = new class211(field301, false);
                                    }
                                    field442 = field445;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 175) {
                                    int var600 = field301.method2156();
                                    int var601 = field301.method2197();
                                    class164 var602 = class164.method2517(var601);
                                    if (var602.field2692 != 1 || var602.field2647 != var600) {
                                        var602.field2692 = 1;
                                        var602.field2647 = var600;
                                        method2103(var602);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 32) {
                                    int var603 = field301.method2160();
                                    int var604 = field301.method2156();
                                    class167.field2799[var604] = var603;
                                    if (class167.field2805[var604] != var603) {
                                        class167.field2805[var604] = var603;
                                        method157(var604);
                                    }
                                    field446[++field447 - 1 & 0x1F] = var604;
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 89) {
                                    String var605 = field301.method2163();
                                    String var606 = class214.method3658(class154.method1445(class213.method3548(field301)));
                                    class11.method582(6, var605, var606);
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                if (field303 == 35) {
                                    int var607 = field301.method2160();
                                    int var608 = field301.method2156();
                                    class164 var609 = class164.method2517(var607);
                                    if (var609.field2692 != 2 || var609.field2647 != var608) {
                                        var609.field2692 = 2;
                                        var609.field2647 = var608;
                                        method2103(var609);
                                    }
                                    field303 = -1;
                                    var294 = true;
                                    break label4380;
                                }
                                class140.method1403("" + field303 + class2.field15 + field308 + class2.field15 + field506 + class2.field15 + field284, (Throwable) null);
                                method2();
                            } catch (IOException var724) {
                                if (field309 > 0) {
                                    method2();
                                } else {
                                    method873(40);
                                    Statics.field1092 = Statics.field3073;
                                    Statics.field3073 = null;
                                }
                            } catch (Exception var725) {
                                String var612 = "" + field303 + class2.field15 + field308 + class2.field15 + field506 + class2.field15 + field284 + class2.field15 + (Statics.field1903 + Statics.field633.field810[0]) + class2.field15 + (Statics.field311 + Statics.field633.field811[0]) + class2.field15;
                                for (int var613 = 0; var613 < field284 && var613 < 50; var613++) {
                                    var612 = var612 + field301.field1886[var613] + class2.field15;
                                }
                                class140.method1403(var612, var725);
                                method2();
                            }
                            var294 = true;
                        }
                    }
                    if (!var294) {
                        break;
                    }
                }
                if (field266 == 30) {
                    while (class202.method132()) {
                        field521.method2402(170);
                        field521.method2140(0);
                        int var614 = field521.field1888;
                        class202.method495(field521);
                        field521.method2205(field521.field1888 - var614);
                    }
                    Object var615 = Statics.field663.field189;
                    synchronized (Statics.field663.field189) {
                        if (!field256) {
                            Statics.field663.field182 = 0;
                        } else if (class132.field2043 != 0 || Statics.field663.field182 >= 40) {
                            field521.method2402(234);
                            field521.method2140(0);
                            int var616 = field521.field1888;
                            int var617 = 0;
                            for (int var618 = 0; var618 < Statics.field663.field182 && field521.field1888 - var616 < 240; var618++) {
                                var617++;
                                int var619 = Statics.field663.field186[var618];
                                if (var619 < 0) {
                                    var619 = 0;
                                } else if (var619 > 502) {
                                    var619 = 502;
                                }
                                int var620 = Statics.field663.field185[var618];
                                if (var620 < 0) {
                                    var620 = 0;
                                } else if (var620 > 764) {
                                    var620 = 764;
                                }
                                int var621 = var619 * 765 + var620;
                                if (Statics.field663.field186[var618] == -1 && Statics.field663.field185[var618] == -1) {
                                    var620 = -1;
                                    var619 = -1;
                                    var621 = 524287;
                                }
                                if (field270 != var620 || field330 != var619) {
                                    int var622 = var620 - field270;
                                    field270 = var620;
                                    int var623 = var619 - field330;
                                    field330 = var619;
                                    if (field272 < 8 && var622 >= -32 && var622 <= 31 && var623 >= -32 && var623 <= 31) {
                                        var622 += 32;
                                        var623 += 32;
                                        field521.method2322((field272 << 12) + (var622 << 6) + var623);
                                        field272 = 0;
                                    } else if (field272 < 8) {
                                        field521.method2273((field272 << 19) + 8388608 + var621);
                                        field272 = 0;
                                    } else {
                                        field521.method2143((field272 << 19) + -1073741824 + var621);
                                        field272 = 0;
                                    }
                                } else if (field272 < 2047) {
                                    field272++;
                                }
                            }
                            field521.method2205(field521.field1888 - var616);
                            if (var617 >= Statics.field663.field182) {
                                Statics.field663.field182 = 0;
                            } else {
                                Statics.field663.field182 -= var617;
                                for (int var624 = 0; var624 < Statics.field663.field182; var624++) {
                                    Statics.field663.field185[var624] = Statics.field663.field185[var617 + var624];
                                    Statics.field663.field186[var624] = Statics.field663.field186[var617 + var624];
                                }
                            }
                        }
                    }
                    if (class132.field2043 == 1 || !Statics.field121 && class132.field2043 == 4 || class132.field2043 == 2) {
                        long var626 = (class132.field2044 - field269) / 50L;
                        if (var626 > 4095L) {
                            var626 = 4095L;
                        }
                        field269 = class132.field2044;
                        int var628 = class132.field2045;
                        if (var628 < 0) {
                            var628 = 0;
                        } else if (var628 > Statics.field1384) {
                            var628 = Statics.field1384;
                        }
                        int var629 = class132.field2034;
                        if (var629 < 0) {
                            var629 = 0;
                        } else if (var629 > Statics.field1984) {
                            var629 = Statics.field1984;
                        }
                        int var630 = (int) var626;
                        field521.method2402(235);
                        field521.method2322((class132.field2043 == 2 ? 1 : 0) + (var630 << 1));
                        field521.method2322(var629);
                        field521.method2322(var628);
                    }
                    if (class129.field2002 > 0) {
                        field521.method2402(20);
                        field521.method2322(0);
                        int var631 = field521.field1888;
                        long var632 = class107.method2784();
                        for (int var634 = 0; var634 < class129.field2002; var634++) {
                            long var635 = var632 - field488;
                            if (var635 > 16777215L) {
                                var635 = 16777215L;
                            }
                            field488 = var632;
                            field521.method2193((int) var635);
                            field521.method2178(class129.field1993[var634]);
                        }
                        field521.method2151(field521.field1888 - var631);
                    }
                    if (field347 > 0) {
                        field347--;
                    }
                    if (class129.field2010[96] || class129.field2010[97] || class129.field2010[98] || class129.field2010[99]) {
                        field348 = true;
                    }
                    if (field348 && field347 <= 0) {
                        field347 = 20;
                        field348 = false;
                        field521.method2402(68);
                        field521.method2187(field415);
                        field521.method2322(field342);
                    }
                    if (Statics.field2076 && !field273) {
                        field273 = true;
                        field521.method2402(74);
                        field521.method2140(1);
                    }
                    if (!Statics.field2076 && field273) {
                        field273 = false;
                        field521.method2402(74);
                        field521.method2140(0);
                    }
                    if (field263 && Statics.field863 != field312) {
                        method102(Statics.field1382, Statics.field606, Statics.field863, Statics.field633.field810[0], Statics.field633.field811[0]);
                    } else if (Statics.field863 != field377) {
                        field377 = Statics.field863;
                        method2624(Statics.field863);
                    }
                    if (field266 == 30) {
                        for (class16 var637 = (class16) field393.method3382(); var637 != null; var637 = (class16) field393.method3384()) {
                            if (var637.field220 > 0) {
                                var637.field220--;
                            }
                            if (var637.field220 != 0) {
                                if (var637.field219 > 0) {
                                    var637.field219--;
                                }
                                if (var637.field219 == 0 && var637.field209 >= 1 && var637.field212 >= 1 && var637.field209 <= 102 && var637.field212 <= 102) {
                                    if (var637.field216 >= 0) {
                                        int var638 = var637.field216;
                                        int var639 = var637.field214;
                                        class38 var640 = class38.method595(var638);
                                        if (var639 == 11) {
                                            var639 = 10;
                                        }
                                        if (var639 >= 5 && var639 <= 8) {
                                            var639 = 4;
                                        }
                                        boolean var641 = var640.method695(var639);
                                        if (!var641) {
                                            continue;
                                        }
                                    }
                                    method121(var637.field223, var637.field210, var637.field209, var637.field212, var637.field216, var637.field217, var637.field214);
                                    var637.field219 = -1;
                                    if (var637.field221 == var637.field216 && var637.field221 == -1) {
                                        var637.method3474();
                                    } else if (var637.field221 == var637.field216 && var637.field226 == var637.field217 && var637.field215 == var637.field214) {
                                        var637.method3474();
                                    }
                                }
                            } else if (var637.field221 < 0 || class6.method3033(var637.field221, var637.field215)) {
                                method121(var637.field223, var637.field210, var637.field209, var637.field212, var637.field221, var637.field226, var637.field215);
                                var637.method3474();
                            }
                        }
                        for (int var642 = 0; var642 < field504; var642++) {
                            var10002 = field507[var642]--;
                            if (field507[var642] >= -10) {
                                class54 var644 = field509[var642];
                                if (var644 == null) {
                                    class54 var727 = (class54) null;
                                    var644 = class54.method1084(Statics.field2539, field491[var642], 0);
                                    if (var644 == null) {
                                        continue;
                                    }
                                    field507[var642] += var644.method1081();
                                    field509[var642] = var644;
                                }
                                if (field507[var642] < 0) {
                                    int var651;
                                    if (field439[var642] == 0) {
                                        var651 = field265;
                                    } else {
                                        int var645 = (field439[var642] & 0xFF) * 128;
                                        int var646 = field439[var642] >> 16 & 0xFF;
                                        int var647 = var646 * 128 + 64 - Statics.field633.field777;
                                        if (var647 < 0) {
                                            var647 = -var647;
                                        }
                                        int var648 = field439[var642] >> 8 & 0xFF;
                                        int var649 = var648 * 128 + 64 - Statics.field633.field757;
                                        if (var649 < 0) {
                                            var649 = -var649;
                                        }
                                        int var650 = var647 + var649 - 128;
                                        if (var650 > var645) {
                                            field507[var642] = -100;
                                            continue;
                                        }
                                        if (var650 < 0) {
                                            var650 = 0;
                                        }
                                        var651 = field383 * (var645 - var650) / var645;
                                    }
                                    if (var651 > 0) {
                                        class58 var652 = var644.method1080().method1117(Statics.field1850);
                                        class60 var653 = class60.method1141(var652, 100, var651);
                                        var653.method1176(field282[var642] - 1);
                                        Statics.field241.method1000(var653);
                                    }
                                    field507[var642] = -100;
                                }
                            } else {
                                field504--;
                                for (int var643 = var642; var643 < field504; var643++) {
                                    field491[var643] = field491[var643 + 1];
                                    field509[var643] = field509[var643 + 1];
                                    field282[var643] = field282[var643 + 1];
                                    field507[var643] = field507[var643 + 1];
                                    field439[var643] = field439[var643 + 1];
                                }
                                var642--;
                            }
                        }
                        if (field501 && !class174.method2625()) {
                            if (field499 != 0 && field500 != -1) {
                                class174.method167(Statics.field819, field500, 0, field499, false);
                            }
                            field501 = false;
                        }
                        field411++;
                        if (field411 <= 750) {
                            for (int var654 = -1; var654 < field317; var654++) {
                                int var655;
                                if (var654 == -1) {
                                    var655 = 2047;
                                } else {
                                    var655 = field379[var654];
                                }
                                class3 var656 = field262[var655];
                                if (var656 != null) {
                                    Statics.method133(var656, 1);
                                }
                            }
                            method2748();
                            method2078();
                            field334++;
                            if (field323 != 0) {
                                field366 += 20;
                                if (field366 >= 400) {
                                    field323 = 0;
                                }
                            }
                            if (Statics.field969 != null) {
                                field368++;
                                if (field368 >= 15) {
                                    method2103(Statics.field969);
                                    Statics.field969 = null;
                                }
                            }
                            class164 var657 = Statics.field1564;
                            class164 var658 = Statics.field1858;
                            Statics.field1564 = null;
                            Statics.field1858 = null;
                            field539 = null;
                            field441 = false;
                            field438 = false;
                            field288 = 0;
                            while (true) {
                                while (class129.method841() && field288 < 128) {
                                    if (field259 >= 2 && class129.field2010[82] && Statics.field204 == 66) {
                                        String var659 = "";
                                        Iterator var660 = class11.field145.iterator();
                                        while (var660.hasNext()) {
                                            class33 var661 = (class33) var660.next();
                                            var659 = var659 + var661.field729 + ':' + var661.field734 + '\n';
                                        }
                                        Statics.field159.setContents(new StringSelection(var659), (ClipboardOwner) null);
                                    } else {
                                        field487[field288] = Statics.field204;
                                        field486[field288] = Statics.field1860;
                                        field288++;
                                    }
                                }
                                int var664 = field420;
                                int var665 = Statics.field1984;
                                int var666 = Statics.field1384;
                                if (class164.method2633(var664)) {
                                    method3106(Statics.field2642[var664], -1, 0, 0, var665, var666, 0, 0);
                                }
                                field445++;
                                while (true) {
                                    class1 var667;
                                    class164 var668;
                                    class164 var669;
                                    do {
                                        var667 = (class1) field462.method3380();
                                        if (var667 == null) {
                                            while (true) {
                                                class1 var670;
                                                class164 var671;
                                                class164 var672;
                                                do {
                                                    var670 = (class1) field255.method3380();
                                                    if (var670 == null) {
                                                        while (true) {
                                                            class1 var673;
                                                            class164 var674;
                                                            class164 var675;
                                                            do {
                                                                var673 = (class1) field461.method3380();
                                                                if (var673 == null) {
                                                                    method9();
                                                                    if (field433 != null) {
                                                                        method2103(field433);
                                                                        Statics.field1937++;
                                                                        if (field441 && field438) {
                                                                            int var676 = class132.field2037;
                                                                            int var677 = class132.field2038;
                                                                            int var678 = var676 - field435;
                                                                            int var679 = var677 - field326;
                                                                            if (var678 < field277) {
                                                                                var678 = field277;
                                                                            }
                                                                            if (field433.field2677 + var678 > field277 + field434.field2677) {
                                                                                var678 = field277 + field434.field2677 - field433.field2677;
                                                                            }
                                                                            if (var679 < field419) {
                                                                                var679 = field419;
                                                                            }
                                                                            if (field433.field2667 + var679 > field419 + field434.field2667) {
                                                                                var679 = field419 + field434.field2667 - field433.field2667;
                                                                            }
                                                                            int var680 = var678 - field331;
                                                                            int var681 = var679 - field443;
                                                                            int var682 = field433.field2725;
                                                                            if (Statics.field1937 > field433.field2666 && (var680 > var682 || var680 < -var682 || var681 > var682 || var681 < -var682)) {
                                                                                field344 = true;
                                                                            }
                                                                            int var683 = field434.field2672 + (var678 - field277);
                                                                            int var684 = field434.field2673 + (var679 - field419);
                                                                            if (field433.field2738 != null && field344) {
                                                                                class1 var685 = new class1();
                                                                                var685.field3 = field433;
                                                                                var685.field4 = var683;
                                                                                var685.field10 = var684;
                                                                                var685.field7 = field433.field2738;
                                                                                class34.method613(var685);
                                                                            }
                                                                            if (class132.field2036 == 0) {
                                                                                if (field344) {
                                                                                    if (field433.field2739 != null) {
                                                                                        class1 var686 = new class1();
                                                                                        var686.field3 = field433;
                                                                                        var686.field4 = var683;
                                                                                        var686.field10 = var684;
                                                                                        var686.field13 = field539;
                                                                                        var686.field7 = field433.field2739;
                                                                                        class34.method613(var686);
                                                                                    }
                                                                                    if (field539 != null && method2889(field433) != null) {
                                                                                        field521.method2402(229);
                                                                                        field521.method2322(field433.field2685);
                                                                                        field521.method2186(field433.field2652);
                                                                                        field521.method2322(field539.field2685);
                                                                                        field521.method2234(field539.field2651);
                                                                                        field521.method2187(field539.field2652);
                                                                                        field521.method2194(field433.field2651);
                                                                                    }
                                                                                } else {
                                                                                    label2686: {
                                                                                        label2685: {
                                                                                            if (field399 != 1) {
                                                                                                int var687 = field401 - 1;
                                                                                                boolean var688;
                                                                                                if (var687 < 0) {
                                                                                                    var688 = false;
                                                                                                } else {
                                                                                                    int var689 = field440[var687];
                                                                                                    if (var689 >= 2000) {
                                                                                                        var689 -= 2000;
                                                                                                    }
                                                                                                    if (var689 == 1007) {
                                                                                                        var688 = true;
                                                                                                    } else {
                                                                                                        var688 = false;
                                                                                                    }
                                                                                                }
                                                                                                if (!var688) {
                                                                                                    break label2685;
                                                                                                }
                                                                                            }
                                                                                            if (field401 > 2) {
                                                                                                method2586(field435 + field331, field443 + field326);
                                                                                                break label2686;
                                                                                            }
                                                                                        }
                                                                                        if (field401 > 0) {
                                                                                            int var690 = field435 + field331;
                                                                                            int var691 = field443 + field326;
                                                                                            method565(Statics.field207, var690, var691);
                                                                                            Statics.field207 = null;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                field433 = null;
                                                                            }
                                                                        } else if (Statics.field1937 > 1) {
                                                                            field433 = null;
                                                                        }
                                                                    }
                                                                    if (Statics.field540 != null) {
                                                                        method2103(Statics.field540);
                                                                        field375++;
                                                                        if (class132.field2036 == 0) {
                                                                            if (!field374) {
                                                                                label2654: {
                                                                                    label2653: {
                                                                                        if (field399 != 1) {
                                                                                            int var700 = field401 - 1;
                                                                                            boolean var701;
                                                                                            if (var700 < 0) {
                                                                                                var701 = false;
                                                                                            } else {
                                                                                                int var702 = field440[var700];
                                                                                                if (var702 >= 2000) {
                                                                                                    var702 -= 2000;
                                                                                                }
                                                                                                if (var702 == 1007) {
                                                                                                    var701 = true;
                                                                                                } else {
                                                                                                    var701 = false;
                                                                                                }
                                                                                            }
                                                                                            if (!var701) {
                                                                                                break label2653;
                                                                                            }
                                                                                        }
                                                                                        if (field401 > 2) {
                                                                                            method2586(field371, field363);
                                                                                            break label2654;
                                                                                        }
                                                                                    }
                                                                                    if (field401 > 0) {
                                                                                        int var703 = field371;
                                                                                        int var704 = field363;
                                                                                        method565(Statics.field207, var703, var704);
                                                                                        Statics.field207 = null;
                                                                                    }
                                                                                }
                                                                            } else if (Statics.field540 == Statics.field211 && field373 != field370) {
                                                                                class164 var692 = Statics.field540;
                                                                                byte var693 = 0;
                                                                                if (field304 == 1 && var692.field2655 == 206) {
                                                                                    var693 = 1;
                                                                                }
                                                                                if (var692.field2764[field373] <= 0) {
                                                                                    var693 = 0;
                                                                                }
                                                                                int var694 = method573(var692);
                                                                                boolean var695 = (var694 >> 29 & 0x1) != 0;
                                                                                if (var695) {
                                                                                    int var696 = field370;
                                                                                    int var697 = field373;
                                                                                    var692.field2764[var697] = var692.field2764[var696];
                                                                                    var692.field2768[var697] = var692.field2768[var696];
                                                                                    var692.field2764[var696] = -1;
                                                                                    var692.field2768[var696] = 0;
                                                                                } else if (var693 == 1) {
                                                                                    int var698 = field370;
                                                                                    int var699 = field373;
                                                                                    while (var698 != var699) {
                                                                                        if (var698 > var699) {
                                                                                            var692.method2986(var698 - 1, var698);
                                                                                            var698--;
                                                                                        } else if (var698 < var699) {
                                                                                            var692.method2986(var698 + 1, var698);
                                                                                            var698++;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    var692.method2986(field373, field370);
                                                                                }
                                                                                field521.method2402(219);
                                                                                field521.method2178(var693);
                                                                                field521.method2186(field370);
                                                                                field521.method2143(Statics.field540.field2651);
                                                                                field521.method2186(field373);
                                                                            }
                                                                            field368 = 10;
                                                                            class132.field2043 = 0;
                                                                            Statics.field540 = null;
                                                                        } else if (field375 >= 5 && (class132.field2037 > field371 + 5 || class132.field2037 < field371 - 5 || class132.field2038 > field363 + 5 || class132.field2038 < field363 - 5)) {
                                                                            field374 = true;
                                                                        }
                                                                    }
                                                                    if (class81.field1405 != -1) {
                                                                        int var705 = class81.field1405;
                                                                        int var706 = class81.field1422;
                                                                        field521.method2402(161);
                                                                        field521.method2140(5);
                                                                        field521.method2322(Statics.field311 + var706);
                                                                        field521.method2299(class129.field2010[82] ? (class129.field2010[81] ? 2 : 1) : 0);
                                                                        field521.method2141(Statics.field1903 + var705);
                                                                        class81.field1405 = -1;
                                                                        field414 = class132.field2034;
                                                                        field384 = class132.field2045;
                                                                        field323 = 1;
                                                                        field366 = 0;
                                                                        field496 = var705;
                                                                        field302 = var706;
                                                                    }
                                                                    if (Statics.field1564 != var657) {
                                                                        if (var657 != null) {
                                                                            method2103(var657);
                                                                        }
                                                                        if (Statics.field1564 != null) {
                                                                            method2103(Statics.field1564);
                                                                        }
                                                                    }
                                                                    if (Statics.field1858 != var658 && field436 == field410) {
                                                                        if (var658 != null) {
                                                                            method2103(var658);
                                                                        }
                                                                        if (Statics.field1858 != null) {
                                                                            method2103(Statics.field1858);
                                                                        }
                                                                    }
                                                                    if (Statics.field1858 == null) {
                                                                        if (field410 > 0) {
                                                                            field410--;
                                                                        }
                                                                    } else if (field410 < field436) {
                                                                        field410++;
                                                                        if (field436 == field410) {
                                                                            method2103(Statics.field1858);
                                                                        }
                                                                    }
                                                                    method620();
                                                                    if (field510) {
                                                                        method124();
                                                                    }
                                                                    for (int var707 = 0; var707 < 5; var707++) {
                                                                        var10002 = field515[var707]++;
                                                                    }
                                                                    int var708 = ++class132.field2032 - 1;
                                                                    int var710 = class129.method1900();
                                                                    if (var708 > 15000 && var710 > 15000) {
                                                                        field309 = 250;
                                                                        class132.method2399(14500);
                                                                        field521.method2402(183);
                                                                    }
                                                                    field328++;
                                                                    if (field328 > 500) {
                                                                        field328 = 0;
                                                                        int var711 = (int) (Math.random() * 8.0D);
                                                                        if ((var711 & 0x1) == 1) {
                                                                            field322 += field470;
                                                                        }
                                                                        if ((var711 & 0x2) == 2) {
                                                                            field431 += field325;
                                                                        }
                                                                        if ((var711 & 0x4) == 4) {
                                                                            field341 += field327;
                                                                        }
                                                                    }
                                                                    if (field322 < -50) {
                                                                        field470 = 2;
                                                                    }
                                                                    if (field322 > 50) {
                                                                        field470 = -2;
                                                                    }
                                                                    if (field431 < -55) {
                                                                        field325 = 2;
                                                                    }
                                                                    if (field431 > 55) {
                                                                        field325 = -2;
                                                                    }
                                                                    if (field341 < -40) {
                                                                        field327 = 1;
                                                                    }
                                                                    if (field341 > 40) {
                                                                        field327 = -1;
                                                                    }
                                                                    field333++;
                                                                    if (field333 > 500) {
                                                                        field333 = 0;
                                                                        int var712 = (int) (Math.random() * 8.0D);
                                                                        if ((var712 & 0x1) == 1) {
                                                                            field404 += field492;
                                                                        }
                                                                        if ((var712 & 0x2) == 2) {
                                                                            field291 += field332;
                                                                        }
                                                                    }
                                                                    if (field404 < -60) {
                                                                        field492 = 2;
                                                                    }
                                                                    if (field404 > 60) {
                                                                        field492 = -2;
                                                                    }
                                                                    if (field291 < -20) {
                                                                        field332 = 1;
                                                                    }
                                                                    if (field291 > 10) {
                                                                        field332 = -1;
                                                                    }
                                                                    for (class36 var713 = (class36) field532.method3344(); var713 != null; var713 = (class36) field532.method3336()) {
                                                                        if ((long) var713.field818 < class107.method2784() / 1000L - 5L) {
                                                                            if (var713.field822 > 0) {
                                                                                class11.method582(5, "", var713.field821 + class148.field2349);
                                                                            }
                                                                            if (var713.field822 == 0) {
                                                                                class11.method582(5, "", var713.field821 + class148.field2350);
                                                                            }
                                                                            var713.method3466();
                                                                        }
                                                                    }
                                                                    field529++;
                                                                    if (field529 > 50) {
                                                                        field521.method2402(198);
                                                                    }
                                                                    try {
                                                                        if (Statics.field3073 != null && field521.field1888 > 0) {
                                                                            Statics.field3073.method2648(field521.field1886, 0, field521.field1888);
                                                                            field521.field1888 = 0;
                                                                            field529 = 0;
                                                                            return;
                                                                        }
                                                                    } catch (IOException var717) {
                                                                        if (field309 > 0) {
                                                                            method2();
                                                                        } else {
                                                                            method873(40);
                                                                            Statics.field1092 = Statics.field3073;
                                                                            Statics.field3073 = null;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                var674 = var673.field3;
                                                                if (var674.field2652 < 0) {
                                                                    break;
                                                                }
                                                                var675 = class164.method2517(var674.field2774);
                                                            } while (var675 == null || var675.field2743 == null || var674.field2652 >= var675.field2743.length || var675.field2743[var674.field2652] != var674);
                                                            class34.method613(var673);
                                                        }
                                                    }
                                                    var671 = var670.field3;
                                                    if (var671.field2652 < 0) {
                                                        break;
                                                    }
                                                    var672 = class164.method2517(var671.field2774);
                                                } while (var672 == null || var672.field2743 == null || var671.field2652 >= var672.field2743.length || var672.field2743[var671.field2652] != var671);
                                                class34.method613(var670);
                                            }
                                        }
                                        var668 = var667.field3;
                                        if (var668.field2652 < 0) {
                                            break;
                                        }
                                        var669 = class164.method2517(var668.field2774);
                                    } while (var669 == null || var669.field2743 == null || var668.field2652 >= var669.field2743.length || var669.field2743[var668.field2652] != var668);
                                    class34.method613(var667);
                                }
                            }
                        } else if (field309 > 0) {
                            method2();
                        } else {
                            method873(40);
                            Statics.field1092 = Statics.field3073;
                            Statics.field3073 = null;
                        }
                    }
                }
            }
        } else if (field266 == 40 || field266 == 45) {
            method674();
        }
    }

    @ObfuscatedName("client.f(I)V")
    public final void method173() {
        boolean var1 = class174.method719();
        if (var1 && field501 && Statics.field1027 != null) {
            Statics.field1027.method1045();
        }
        if (field266 == 10 || field266 == 20 || field266 == 30) {
            if (field475 != 0L && class107.method2784() > field475) {
                method152(method1879());
            } else if (field2091) {
                method1376();
            }
        }
        Dimension var2 = this.method2673();
        if (Statics.field173 != var2.width || Statics.field81 != var2.height || field2077) {
            method1803();
            field475 = class107.method2784() + 500L;
            field2077 = false;
        }
        boolean var3 = false;
        if (field2089) {
            field2089 = false;
            var3 = true;
            for (int var4 = 0; var4 < 100; var4++) {
                field467[var4] = true;
            }
        }
        if (var3) {
            method785();
        }
        if (field266 == 0) {
            int var5 = class30.field698;
            String var6 = class30.field699;
            Color var7 = null;
            try {
                Graphics var8 = Statics.field1869.getGraphics();
                if (Statics.field871 == null) {
                    Statics.field871 = new Font("Helvetica", 1, 13);
                    Statics.field1325 = Statics.field1869.getFontMetrics(Statics.field871);
                }
                if (var3) {
                    var8.setColor(Color.black);
                    var8.fillRect(0, 0, Statics.field1984, Statics.field1384);
                }
                if (var7 == null) {
                    var7 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1020 == null) {
                        Statics.field1020 = Statics.field1869.createImage(304, 34);
                    }
                    Graphics var9 = Statics.field1020.getGraphics();
                    var9.setColor(var7);
                    var9.drawRect(0, 0, 303, 33);
                    var9.fillRect(2, 2, var5 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(1, 1, 301, 31);
                    var9.fillRect(var5 * 3 + 2, 2, 300 - var5 * 3, 30);
                    var9.setFont(Statics.field871);
                    var9.setColor(Color.white);
                    var9.drawString(var6, (304 - Statics.field1325.stringWidth(var6)) / 2, 22);
                    var8.drawImage(Statics.field1020, Statics.field1984 / 2 - 152, Statics.field1384 / 2 - 18, (ImageObserver) null);
                } catch (Exception var22) {
                    int var11 = Statics.field1984 / 2 - 152;
                    int var12 = Statics.field1384 / 2 - 18;
                    var8.setColor(var7);
                    var8.drawRect(var11, var12, 303, 33);
                    var8.fillRect(var11 + 2, var12 + 2, var5 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(var11 + 1, var12 + 1, 301, 31);
                    var8.fillRect(var5 * 3 + var11 + 2, var12 + 2, 300 - var5 * 3, 30);
                    var8.setFont(Statics.field871);
                    var8.setColor(Color.white);
                    var8.drawString(var6, var11 + (304 - Statics.field1325.stringWidth(var6)) / 2, var12 + 22);
                }
            } catch (Exception var23) {
                Statics.field1869.repaint();
            }
        } else if (field266 == 5) {
            class30.method735(Statics.field2863, Statics.field1148, Statics.field586, var3);
        } else if (field266 == 10 || field266 == 11) {
            class30.method735(Statics.field2863, Statics.field1148, Statics.field586, var3);
        } else if (field266 == 20) {
            class30.method735(Statics.field2863, Statics.field1148, Statics.field586, var3);
        } else if (field266 == 25) {
            if (field385 == 1) {
                if (field313 > field480) {
                    field480 = field313;
                }
                int var14 = (field480 * 50 - field313 * 50) / field480;
                method2878(class148.field2211 + class2.field16 + class2.field17 + var14 + "%" + class2.field18, false);
            } else if (field385 == 2) {
                if (field315 > field258) {
                    field258 = field315;
                }
                int var15 = (field258 * 50 - field315 * 50) / field258 + 50;
                method2878(class148.field2211 + class2.field16 + class2.field17 + var15 + "%" + class2.field18, false);
            } else {
                method2878(class148.field2211, false);
            }
        } else if (field266 == 30) {
            method159();
        } else if (field266 == 40) {
            method2878(class148.field2471 + class2.field16 + class148.field2213, false);
        } else if (field266 == 45) {
            method2878(class148.field2345, false);
        }
        if (field266 == 30 && field474 == 0 && !var3) {
            try {
                Graphics var16 = Statics.field1869.getGraphics();
                for (int var17 = 0; var17 < field397; var17++) {
                    if (field468[var17]) {
                        Statics.field999.method1368(var16, field372[var17], field471[var17], field472[var17], field261[var17]);
                        field468[var17] = false;
                    }
                }
            } catch (Exception var25) {
                Statics.field1869.repaint();
            }
        } else if (field266 > 0) {
            try {
                Graphics var19 = Statics.field1869.getGraphics();
                Statics.field999.method1367(var19, 0, 0);
                for (int var20 = 0; var20 < field397; var20++) {
                    field468[var20] = false;
                }
            } catch (Exception var24) {
                Statics.field1869.repaint();
            }
        }
    }

    @ObfuscatedName("client.s(I)V")
    public final void method174() {
        if (Statics.field663 != null) {
            Statics.field663.field183 = false;
        }
        Statics.field663 = null;
        if (Statics.field3073 != null) {
            Statics.field3073.method2661();
            Statics.field3073 = null;
        }
        if (class129.field1991 != null) {
            class129 var1 = class129.field1991;
            synchronized (class129.field1991) {
                class129.field1991 = null;
            }
        }
        if (class132.field2046 != null) {
            class132 var3 = class132.field2046;
            synchronized (class132.field2046) {
                class132.field2046 = null;
            }
        }
        Statics.field2796 = null;
        if (Statics.field1027 != null) {
            Statics.field1027.method1046();
        }
        if (Statics.field52 != null) {
            Statics.field52.method1046();
        }
        class162.method26();
        class161.method2947();
        class141.method550();
    }

    @ObfuscatedName("ay.m(II)V")
    public static void method873(int arg0) {
        if (field266 == arg0) {
            return;
        }
        if (field266 == 0) {
            class136.method553();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field508 = 0;
            field387 = 0;
            field364 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1092 != null) {
            Statics.field1092.method2661();
            Statics.field1092 = null;
        }
        if (field266 == 25) {
            field385 = 0;
            field313 = 0;
            field480 = 1;
            field315 = 0;
            field258 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class30.method363(Statics.field1869, Statics.field2545, Statics.field56, true, 0);
        } else if (arg0 == 20) {
            class30.method363(Statics.field1869, Statics.field2545, Statics.field56, true, field266 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class30.method363(Statics.field1869, Statics.field2545, Statics.field56, false, 4);
        } else if (Statics.field2568) {
            Statics.field683 = null;
            Statics.field684 = null;
            Statics.field685 = null;
            Statics.field2944 = null;
            Statics.field48 = null;
            Statics.field686 = null;
            Statics.field636 = null;
            Statics.field2811 = null;
            Statics.field705 = null;
            Statics.field1872 = null;
            Statics.field1615 = null;
            Statics.field1976 = null;
            Statics.field2023 = null;
            Statics.field2146 = null;
            Statics.field1699 = null;
            Statics.field2148 = null;
            Statics.field696 = null;
            Statics.field722 = null;
            Statics.field927 = null;
            Statics.field2818 = null;
            Statics.field1618 = null;
            Statics.field3030 = null;
            class174.field2858 = 1;
            Statics.field2859 = null;
            Statics.field1085 = -1;
            Statics.field1522 = -1;
            Statics.field2860 = 0;
            Statics.field1284 = false;
            Statics.field2137 = 2;
            class162.method794(true);
            Statics.field2568 = false;
        }
        field266 = arg0;
    }

    @ObfuscatedName("client.y(I)V")
    public void method335() {
        if (field266 == 1000) {
            return;
        }
        long var1 = class107.method2784();
        int var3 = (int) (var1 - Statics.field2617);
        Statics.field2617 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class162.field2631 += var3;
        boolean var4;
        if (class162.field2626 == 0 && class162.field2622 == 0 && class162.field2625 == 0 && class162.field2619 == 0) {
            var4 = true;
        } else if (Statics.field2634 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class162.field2631 > 30000) {
                        throw new IOException();
                    }
                    while (class162.field2622 < 20 && class162.field2619 > 0) {
                        class163 var5 = (class163) class162.field2633.method3345();
                        class111 var6 = new class111(4);
                        var6.method2140(1);
                        var6.method2273((int) var5.field3013);
                        Statics.field2634.method2648(var6.field1886, 0, 4);
                        class162.field2620.method3346(var5, var5.field3013);
                        class162.field2619--;
                        class162.field2622++;
                    }
                    while (class162.field2626 < 20 && class162.field2625 > 0) {
                        class163 var7 = (class163) class162.field2616.method3439();
                        class111 var8 = new class111(4);
                        var8.method2140(0);
                        var8.method2273((int) var7.field3013);
                        Statics.field2634.method2648(var8.field1886, 0, 4);
                        var7.method3450();
                        class162.field2615.method3346(var7, var7.field3013);
                        class162.field2625--;
                        class162.field2626++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2634.method2637();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class162.field2631 = 0;
                        byte var11 = 0;
                        if (Statics.field3052 == null) {
                            var11 = 8;
                        } else if (class162.field2628 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class162.field2627.field1888;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2634.method2652(class162.field2627.field1886, class162.field2627.field1888, var12);
                            if (class162.field2632 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class162.field2627.field1886[class162.field2627.field1888 + var13] ^= class162.field2632;
                                }
                            }
                            class162.field2627.field1888 += var12;
                            if (class162.field2627.field1888 < var11) {
                                break;
                            }
                            if (Statics.field3052 == null) {
                                class162.field2627.field1888 = 0;
                                int var14 = class162.field2627.method2155();
                                int var15 = class162.field2627.method2157();
                                int var16 = class162.field2627.method2155();
                                int var17 = class162.field2627.method2160();
                                long var18 = (long) ((var14 << 16) + var15);
                                class163 var20 = (class163) class162.field2620.method3354(var18);
                                Statics.field130 = true;
                                if (var20 == null) {
                                    var20 = (class163) class162.field2615.method3354(var18);
                                    Statics.field130 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3052 = var20;
                                Statics.field3026 = new class111(var17 + var21 + Statics.field3052.field2639);
                                Statics.field3026.method2140(var16);
                                Statics.field3026.method2143(var17);
                                class162.field2628 = 8;
                                class162.field2627.field1888 = 0;
                            } else if (class162.field2628 == 0) {
                                if (class162.field2627.field1886[0] == -1) {
                                    class162.field2628 = 1;
                                    class162.field2627.field1888 = 0;
                                } else {
                                    Statics.field3052 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3026.field1886.length - Statics.field3052.field2639;
                            int var23 = 512 - class162.field2628;
                            if (var23 > var22 - Statics.field3026.field1888) {
                                var23 = var22 - Statics.field3026.field1888;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2634.method2652(Statics.field3026.field1886, Statics.field3026.field1888, var23);
                            if (class162.field2632 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3026.field1886[Statics.field3026.field1888 + var24] ^= class162.field2632;
                                }
                            }
                            Statics.field3026.field1888 += var23;
                            class162.field2628 += var23;
                            if (Statics.field3026.field1888 == var22) {
                                if (Statics.field3052.field3013 == 16711935L) {
                                    Statics.field2115 = Statics.field3026;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class159 var26 = class162.field2618[var25];
                                        if (var26 != null) {
                                            Statics.field2115.field1888 = var25 * 8 + 5;
                                            int var27 = Statics.field2115.method2160();
                                            int var28 = Statics.field2115.method2160();
                                            var26.method2929(var27, var28);
                                        }
                                    }
                                } else {
                                    class162.field2630.reset();
                                    class162.field2630.update(Statics.field3026.field1886, 0, var22);
                                    int var29 = (int) class162.field2630.getValue();
                                    if (Statics.field3052.field2638 != var29) {
                                        try {
                                            Statics.field2634.method2661();
                                        } catch (Exception var35) {
                                        }
                                        class162.field2621++;
                                        Statics.field2634 = null;
                                        class162.field2632 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class162.field2621 = 0;
                                    class162.field2635 = 0;
                                    Statics.field3052.field2637.method2930((int) (Statics.field3052.field3013 & 0xFFFFL), Statics.field3026.field1886, (Statics.field3052.field3013 & 0xFF0000L) == 16711680L, Statics.field130);
                                }
                                Statics.field3052.method3474();
                                if (Statics.field130) {
                                    class162.field2622--;
                                } else {
                                    class162.field2626--;
                                }
                                class162.field2628 = 0;
                                Statics.field3052 = null;
                                Statics.field3026 = null;
                            } else {
                                if (class162.field2628 != 512) {
                                    break;
                                }
                                class162.field2628 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2634.method2661();
                } catch (Exception var34) {
                }
                class162.field2635++;
                Statics.field2634 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method479();
        }
    }

    @ObfuscatedName("client.b(I)V")
    public void method479() {
        if (class162.field2621 >= 4) {
            this.method2671("js5crc");
            field266 = 1000;
            return;
        }
        if (class162.field2635 >= 4) {
            if (field266 <= 5) {
                this.method2671("js5io");
                field266 = 1000;
                return;
            }
            field289 = 3000;
            class162.field2635 = 3;
        }
        if (--field289 + 1 > 0) {
            return;
        }
        try {
            if (field505 == 0) {
                Statics.field1454 = Statics.field813.method2522(Statics.field992, Statics.field195);
                field505++;
            }
            if (field505 == 1) {
                if (Statics.field1454.field2103 == 2) {
                    this.method211(-1);
                    return;
                }
                if (Statics.field1454.field2103 == 1) {
                    field505++;
                }
            }
            if (field505 == 2) {
                Statics.field25 = new class135((Socket) Statics.field1454.field2106, Statics.field813);
                class111 var1 = new class111(5);
                var1.method2140(15);
                var1.method2143(82);
                Statics.field25.method2648(var1.field1886, 0, 5);
                field505++;
                Statics.field2024 = class107.method2784();
            }
            if (field505 == 3) {
                if (field266 <= 5 || Statics.field25.method2637() > 0) {
                    int var2 = Statics.field25.method2636();
                    if (var2 != 0) {
                        this.method211(var2);
                        return;
                    }
                    field505++;
                } else if (class107.method2784() - Statics.field2024 > 30000L) {
                    this.method211(-2);
                    return;
                }
            }
            if (field505 == 4) {
                class162.method1096(Statics.field25, field266 > 20);
                Statics.field1454 = null;
                Statics.field25 = null;
                field505 = 0;
                field424 = 0;
            }
        } catch (IOException var4) {
            this.method211(-3);
        }
    }

    @ObfuscatedName("client.v(II)V")
    public void method211(int arg0) {
        Statics.field1454 = null;
        Statics.field25 = null;
        field505 = 0;
        if (Statics.field723 == Statics.field195) {
            Statics.field195 = Statics.field836;
        } else {
            Statics.field195 = Statics.field723;
        }
        field424++;
        if (field424 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field266 <= 5) {
                this.method2671("js5connect_full");
                field266 = 1000;
            } else {
                field289 = 3000;
            }
        } else if (field424 >= 2 && arg0 == 6) {
            this.method2671("js5connect_outofdate");
            field266 = 1000;
        } else if (field424 >= 4) {
            if (field266 <= 5) {
                this.method2671("js5connect");
                field266 = 1000;
            } else {
                field289 = 3000;
            }
        }
    }

    @ObfuscatedName("u.z(I)V")
    public static void method155() {
        if (field287 == 0) {
            Statics.field1890 = new class81(4, 104, 104, class6.field83);
            for (int var0 = 0; var0 < 4; var0++) {
                field318[var0] = new class220(104, 104);
            }
            Statics.field1604 = new class74(512, 512);
            class30.field699 = class148.field2214;
            class30.field698 = 5;
            field287 = 20;
        } else if (field287 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class86.field1512[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class81.method1692(var1, 500, 800, 512, 334);
            class30.field699 = class148.field2375;
            class30.field698 = 10;
            field287 = 30;
        } else if (field287 == 30) {
            Statics.field1448 = method1893(0, false, true, true);
            Statics.field146 = method1893(1, false, true, true);
            Statics.field1381 = method1893(2, true, false, true);
            Statics.field1703 = method1893(3, false, true, true);
            Statics.field2539 = method1893(4, false, true, true);
            Statics.field202 = method1893(5, true, true, true);
            Statics.field819 = method1893(6, true, true, false);
            Statics.field672 = method1893(7, false, true, true);
            Statics.field56 = method1893(8, false, true, true);
            Statics.field2804 = method1893(9, false, true, true);
            Statics.field2545 = method1893(10, false, true, true);
            Statics.field190 = method1893(11, false, true, true);
            Statics.field194 = method1893(12, false, true, true);
            Statics.field2484 = method1893(13, true, false, true);
            Statics.field74 = method1893(14, false, true, false);
            Statics.field1024 = method1893(15, false, true, true);
            class30.field699 = class148.field2216;
            class30.field698 = 20;
            field287 = 40;
        } else if (field287 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1448.method2944() * 4 / 100;
            int var8 = var7 + Statics.field146.method2944() * 4 / 100;
            int var9 = var8 + Statics.field1381.method2944() * 2 / 100;
            int var10 = var9 + Statics.field1703.method2944() * 2 / 100;
            int var11 = var10 + Statics.field2539.method2944() * 6 / 100;
            int var12 = var11 + Statics.field202.method2944() * 4 / 100;
            int var13 = var12 + Statics.field819.method2944() * 2 / 100;
            int var14 = var13 + Statics.field672.method2944() * 60 / 100;
            int var15 = var14 + Statics.field56.method2944() * 2 / 100;
            int var16 = var15 + Statics.field2804.method2944() * 2 / 100;
            int var17 = var16 + Statics.field2545.method2944() * 2 / 100;
            int var18 = var17 + Statics.field190.method2944() * 2 / 100;
            int var19 = var18 + Statics.field194.method2944() * 2 / 100;
            int var20 = var19 + Statics.field2484.method2944() * 2 / 100;
            int var21 = var20 + Statics.field74.method2944() * 2 / 100;
            int var22 = var21 + Statics.field1024.method2944() * 2 / 100;
            if (var22 == 100) {
                class30.field699 = class148.field2218;
                class30.field698 = 30;
                field287 = 45;
            } else {
                if (var22 != 0) {
                    class30.field699 = class148.field2217 + var22 + "%";
                }
                class30.field698 = 30;
            }
        } else if (field287 == 45) {
            boolean var23 = !field263;
            Statics.field1118 = 22050;
            Statics.field1103 = var23;
            Statics.field1282 = 2;
            class175 var24 = new class175();
            var24.method3252(9, 128);
            Statics.field1027 = class52.method25(Statics.field813, Statics.field1869, 0, 22050);
            Statics.field1027.method1036(var24);
            class174.method2774(Statics.field1024, Statics.field74, Statics.field2539, var24);
            Statics.field52 = class52.method25(Statics.field813, Statics.field1869, 1, 2048);
            Statics.field241 = new class51();
            Statics.field52.method1036(Statics.field241);
            Statics.field1850 = new class70(22050, Statics.field1118);
            class30.field699 = class148.field2219;
            class30.field698 = 35;
            field287 = 50;
        } else if (field287 == 50) {
            int var25 = 0;
            if (Statics.field1148 == null) {
                Statics.field1148 = class72.method2087(Statics.field56, Statics.field2484, "p11_full", "");
            } else {
                var25++;
            }
            if (Statics.field586 == null) {
                Statics.field586 = class72.method2087(Statics.field56, Statics.field2484, "p12_full", "");
            } else {
                var25++;
            }
            if (Statics.field2863 == null) {
                Statics.field2863 = class72.method2087(Statics.field56, Statics.field2484, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class30.field699 = class148.field2220 + var25 * 100 / 3 + "%";
                class30.field698 = 40;
            } else {
                Statics.field2117 = new class151(true);
                class30.field699 = class148.field2221;
                class30.field698 = 40;
                field287 = 60;
            }
        } else if (field287 == 60) {
            class159 var26 = Statics.field2545;
            class159 var27 = Statics.field56;
            int var28 = 0;
            if (var26.method2860("title.jpg", "")) {
                var28++;
            }
            if (var27.method2860("logo", "")) {
                var28++;
            }
            if (var27.method2860("titlebox", "")) {
                var28++;
            }
            if (var27.method2860("titlebutton", "")) {
                var28++;
            }
            if (var27.method2860("runes", "")) {
                var28++;
            }
            if (var27.method2860("title_mute", "")) {
                var28++;
            }
            if (var27.method2877("options_radio_buttons,0")) {
                var28++;
            }
            if (var27.method2877("options_radio_buttons,2")) {
                var28++;
            }
            var27.method2860("sl_back", "");
            var27.method2860("sl_flags", "");
            var27.method2860("sl_arrows", "");
            var27.method2860("sl_stars", "");
            var27.method2860("sl_button", "");
            byte var31 = 8;
            if (var28 < var31) {
                class30.field699 = class148.field2372 + var28 * 100 / var31 + "%";
                class30.field698 = 50;
            } else {
                class30.field699 = class148.field2379;
                class30.field698 = 50;
                method873(5);
                field287 = 70;
            }
        } else if (field287 == 70) {
            if (Statics.field1381.method2899()) {
                class43.method3482(Statics.field1381);
                class159 var33 = Statics.field1381;
                Statics.field923 = var33;
                class42.method2076(Statics.field1381, Statics.field672);
                class159 var34 = Statics.field1381;
                class159 var35 = Statics.field672;
                boolean var36 = field263;
                Statics.field867 = var34;
                Statics.field868 = var35;
                class38.field918 = var36;
                class37.method31(Statics.field1381, Statics.field672);
                Statics.method737(Statics.field1381, Statics.field672, field455, Statics.field1148);
                class40.method519(Statics.field1381, Statics.field1448, Statics.field146);
                class41.method151(Statics.field1381, Statics.field672);
                class44.method1365(Statics.field1381);
                class159 var37 = Statics.field1381;
                Statics.field1089 = var37;
                Statics.field1086 = Statics.field1089.method2898(16);
                class164.method2588(Statics.field1703, Statics.field672, Statics.field56, Statics.field2484);
                class159 var38 = Statics.field1381;
                Statics.field1025 = var38;
                class45.method650(Statics.field1381);
                class30.field699 = class148.field2225;
                class30.field698 = 60;
                field287 = 80;
            } else {
                class30.field699 = class148.field2224 + Statics.field1381.method2934() + "%";
                class30.field698 = 60;
            }
        } else if (field287 == 80) {
            int var39 = 0;
            if (Statics.field2062 == null) {
                Statics.field2062 = class72.method1989(Statics.field56, "compass", "");
            } else {
                var39++;
            }
            if (Statics.field1832 == null) {
                Statics.field1832 = class72.method1989(Statics.field56, "mapedge", "");
            } else {
                var39++;
            }
            if (Statics.field2182 == null) {
                Statics.field2182 = class72.method23(Statics.field56, "mapscene", "");
            } else {
                var39++;
            }
            if (Statics.field174 == null) {
                Statics.field174 = class72.method1443(Statics.field56, "mapfunction", "");
            } else {
                var39++;
            }
            if (Statics.field218 == null) {
                Statics.field218 = class72.method1443(Statics.field56, "hitmarks", "");
            } else {
                var39++;
            }
            if (Statics.field112 == null) {
                Statics.field112 = class72.method1443(Statics.field56, "headicons_pk", "");
            } else {
                var39++;
            }
            if (Statics.field2801 == null) {
                Statics.field2801 = class72.method1443(Statics.field56, "headicons_prayer", "");
            } else {
                var39++;
            }
            if (Statics.field1698 == null) {
                Statics.field1698 = class72.method1443(Statics.field56, "headicons_hint", "");
            } else {
                var39++;
            }
            if (Statics.field2031 == null) {
                Statics.field2031 = class72.method1443(Statics.field56, "mapmarker", "");
            } else {
                var39++;
            }
            if (Statics.field2169 == null) {
                Statics.field2169 = class72.method1443(Statics.field56, "cross", "");
            } else {
                var39++;
            }
            if (Statics.field2095 == null) {
                Statics.field2095 = class72.method1443(Statics.field56, "mapdots", "");
            } else {
                var39++;
            }
            if (Statics.field2170 == null) {
                Statics.field2170 = class72.method23(Statics.field56, "scrollbar", "");
            } else {
                var39++;
            }
            if (Statics.field1385 == null) {
                Statics.field1385 = class72.method23(Statics.field56, "mod_icons", "");
            } else {
                var39++;
            }
            if (var39 < 13) {
                class30.field699 = class148.field2384 + var39 * 100 / 13 + "%";
                class30.field698 = 70;
            } else {
                Statics.field3092 = Statics.field1385;
                Statics.field1832.method1498();
                int var40 = (int) (Math.random() * 21.0D) - 10;
                int var41 = (int) (Math.random() * 21.0D) - 10;
                int var42 = (int) (Math.random() * 21.0D) - 10;
                int var43 = (int) (Math.random() * 41.0D) - 20;
                for (int var44 = 0; var44 < Statics.field174.length; var44++) {
                    Statics.field174[var44].method1464(var40 + var43, var41 + var43, var42 + var43);
                }
                Statics.field2182[0].method1594(var40 + var43, var41 + var43, var42 + var43);
                class30.field699 = class148.field2432;
                class30.field698 = 70;
                field287 = 90;
            }
        } else if (field287 == 90) {
            if (Statics.field2804.method2899()) {
                class90 var45 = new class90(Statics.field2804, Statics.field56, 20, 0.8D, field263 ? 64 : 128);
                class86.method1811(var45);
                class86.method1810(0.8D);
                class30.field699 = class148.field2229;
                class30.field698 = 90;
                field287 = 110;
            } else {
                class30.field699 = class148.field2228 + Statics.field2804.method2934() + "%";
                class30.field698 = 90;
            }
        } else if (field287 == 110) {
            Statics.field663 = new class13();
            Statics.field813.method2523(Statics.field663, 10);
            class30.field699 = class148.field2230;
            class30.field698 = 94;
            field287 = 120;
        } else if (field287 == 120) {
            if (Statics.field2545.method2860("huffman", "")) {
                class105 var46 = new class105(Statics.field2545.method2875("huffman", ""));
                Statics.field3082 = var46;
                class30.field699 = class148.field2443;
                class30.field698 = 96;
                field287 = 130;
            } else {
                class30.field699 = class148.field2231 + "%";
                class30.field698 = 96;
            }
        } else if (field287 == 130) {
            if (!Statics.field1703.method2899()) {
                class30.field699 = class148.field2304 + Statics.field1703.method2934() * 4 / 5 + "%";
                class30.field698 = 100;
            } else if (!Statics.field194.method2899()) {
                class30.field699 = class148.field2304 + (80 + Statics.field194.method2934() / 6) + "%";
                class30.field698 = 100;
            } else if (Statics.field2484.method2899()) {
                class30.field699 = class148.field2234;
                class30.field698 = 100;
                field287 = 140;
            } else {
                class30.field699 = class148.field2304 + (96 + Statics.field2484.method2934() / 20) + "%";
                class30.field698 = 100;
            }
        } else if (field287 == 140) {
            method873(10);
        }
    }

    @ObfuscatedName("cz.u(IZZZB)Lfi;")
    public static class159 method1893(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class126 var4 = null;
        if (class141.field2126 != null) {
            var4 = new class126(arg0, class141.field2126, Statics.field2128[arg0], 1000000);
        }
        return new class159(var4, Statics.field120, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ag.g(B)V")
    public static final void method674() {
        try {
            if (field508 == 0) {
                if (Statics.field3073 != null) {
                    Statics.field3073.method2661();
                    Statics.field3073 = null;
                }
                Statics.field298 = null;
                field310 = false;
                field387 = 0;
                field508 = 1;
            }
            if (field508 == 1) {
                if (Statics.field298 == null) {
                    Statics.field298 = Statics.field813.method2522(Statics.field992, Statics.field195);
                }
                if (Statics.field298.field2103 == 2) {
                    throw new IOException();
                }
                if (Statics.field298.field2103 == 1) {
                    Statics.field3073 = new class135((Socket) Statics.field298.field2106, Statics.field813);
                    Statics.field298 = null;
                    field508 = 2;
                }
            }
            if (field508 == 2) {
                field521.field1888 = 0;
                field521.method2140(14);
                Statics.field3073.method2648(field521.field1886, 0, 1);
                field301.field1888 = 0;
                field508 = 3;
            }
            if (field508 == 3) {
                if (Statics.field1027 != null) {
                    Statics.field1027.method1043();
                }
                if (Statics.field52 != null) {
                    Statics.field52.method1043();
                }
                int var0 = Statics.field3073.method2636();
                if (Statics.field1027 != null) {
                    Statics.field1027.method1043();
                }
                if (Statics.field52 != null) {
                    Statics.field52.method1043();
                }
                if (var0 != 0) {
                    method2088(var0);
                    return;
                }
                field301.field1888 = 0;
                field508 = 5;
            }
            if (field508 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field521.field1888 = 0;
                field521.method2140(1);
                field521.method2140(class30.field706.method487());
                field521.method2143(var1[0]);
                field521.method2143(var1[1]);
                field521.method2143(var1[2]);
                field521.method2143(var1[3]);
                switch(class30.field706.field2495) {
                    case 0:
                        field521.field1888 += 8;
                        break;
                    case 1:
                    case 3:
                        field521.method2273(Statics.field710);
                        field521.field1888 += 5;
                        break;
                    case 2:
                        field521.method2143((Integer) Statics.field1691.field129.get(class154.method882(class30.field704)));
                        field521.field1888 += 4;
                }
                field521.method2146(class30.field695);
                field521.method2175(class5.field54, class5.field61);
                field300.field1888 = 0;
                if (field266 == 40) {
                    field300.method2140(18);
                } else {
                    field300.method2140(16);
                }
                field300.method2322(0);
                int var2 = field300.field1888;
                field300.method2143(82);
                field300.method2318(field521.field1886, 0, field521.field1888);
                int var3 = field300.field1888;
                field300.method2146(class30.field704);
                field300.method2140((field476 ? 1 : 0) << 1 | (field263 ? 1 : 0));
                field300.method2322(Statics.field1984);
                field300.method2322(Statics.field1384);
                class141.method570(field300);
                field300.method2146(Statics.field1525);
                field300.method2143(Statics.field1865);
                class111 var4 = new class111(Statics.field2117.method2792());
                Statics.field2117.method2790(var4);
                field300.method2318(var4.field1886, 0, var4.field1886.length);
                field300.method2140(Statics.field285);
                field300.method2143(Statics.field1448.field2578);
                field300.method2143(Statics.field146.field2578);
                field300.method2143(Statics.field1381.field2578);
                field300.method2143(Statics.field1703.field2578);
                field300.method2143(Statics.field2539.field2578);
                field300.method2143(Statics.field202.field2578);
                field300.method2143(Statics.field819.field2578);
                field300.method2143(Statics.field672.field2578);
                field300.method2143(Statics.field56.field2578);
                field300.method2143(Statics.field2804.field2578);
                field300.method2143(Statics.field2545.field2578);
                field300.method2143(Statics.field190.field2578);
                field300.method2143(Statics.field194.field2578);
                field300.method2143(Statics.field2484.field2578);
                field300.method2143(Statics.field74.field2578);
                field300.method2143(Statics.field1024.field2578);
                field300.method2301(var1, var3, field300.field1888);
                field300.method2151(field300.field1888 - var2);
                Statics.field3073.method2648(field300.field1886, 0, field300.field1888);
                field521.method2401(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field301.method2401(var1);
                field508 = 6;
            }
            if (field508 == 6 && Statics.field3073.method2637() > 0) {
                int var6 = Statics.field3073.method2636();
                if (var6 == 21 && field266 == 20) {
                    field508 = 7;
                } else if (var6 == 2) {
                    field508 = 9;
                } else if (var6 == 15 && field266 == 40) {
                    method84();
                    return;
                } else if (var6 == 23 && field364 < 1) {
                    field364++;
                    field508 = 0;
                } else {
                    method2088(var6);
                    return;
                }
            }
            if (field508 == 7 && Statics.field3073.method2637() > 0) {
                field356 = (Statics.field3073.method2636() + 3) * 60;
                field508 = 8;
            }
            if (field508 == 8) {
                field387 = 0;
                class30.method1986(class148.field2238, class148.field2414, field356 / 60 + class148.field2240);
                if (--field356 <= 0) {
                    field508 = 0;
                }
            } else {
                if (field508 == 9 && Statics.field3073.method2637() >= 13) {
                    boolean var7 = Statics.field3073.method2636() == 1;
                    Statics.field3073.method2652(field301.field1886, 0, 4);
                    field301.field1888 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field301.method2419() << 24;
                        int var10 = var9 | field301.method2419() << 16;
                        int var11 = var10 | field301.method2419() << 8;
                        int var12 = var11 | field301.method2419();
                        int var13 = class154.method882(class30.field704);
                        if (Statics.field1691.field129.size() >= 10 && !Statics.field1691.field129.containsKey(var13)) {
                            Iterator var14 = Statics.field1691.field129.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field1691.field129.put(var13, var12);
                        class9.method2360();
                    }
                    field259 = Statics.field3073.method2636();
                    field517 = Statics.field3073.method2636() == 1;
                    field409 = Statics.field3073.method2636();
                    field409 <<= 0x8;
                    field409 += Statics.field3073.method2636();
                    field306 = Statics.field3073.method2636();
                    Statics.field3073.method2652(field301.field1886, 0, 1);
                    field301.field1888 = 0;
                    field303 = field301.method2419();
                    Statics.field3073.method2652(field301.field1886, 0, 2);
                    field301.field1888 = 0;
                    field284 = field301.method2157();
                    if (field306 == 1) {
                        try {
                            class124.method2490(Statics.field430, "zap");
                        } catch (Throwable var32) {
                        }
                    } else {
                        try {
                            client var16 = Statics.field430;
                            JSObject.getWindow(var16).call("unzap", (Object[]) null);
                        } catch (Throwable var31) {
                        }
                    }
                    field508 = 10;
                }
                if (field508 != 10) {
                    field387++;
                    if (field387 > 2000) {
                        if (field364 < 1) {
                            if (Statics.field723 == Statics.field195) {
                                Statics.field195 = Statics.field836;
                            } else {
                                Statics.field195 = Statics.field723;
                            }
                            field364++;
                            field508 = 0;
                        } else {
                            method2088(-3);
                        }
                    }
                } else if (Statics.field3073.method2637() >= field284) {
                    field301.field1888 = 0;
                    Statics.field3073.method2652(field301.field1886, 0, field284);
                    field269 = -1L;
                    field272 = -1;
                    Statics.field663.field182 = 0;
                    Statics.field2076 = true;
                    field273 = true;
                    field488 = -1L;
                    class202.field3027 = new class193();
                    field521.field1888 = 0;
                    field301.field1888 = 0;
                    field303 = -1;
                    field307 = -1;
                    field308 = -1;
                    field506 = -1;
                    field411 = 0;
                    field452 = 0;
                    field309 = 0;
                    field365 = 0;
                    field401 = 0;
                    field400 = false;
                    class132.method2399(0);
                    class11.method1616();
                    field412 = 0;
                    field408 = false;
                    field504 = 0;
                    field322 = (int) (Math.random() * 100.0D) - 50;
                    field431 = (int) (Math.random() * 110.0D) - 55;
                    field341 = (int) (Math.random() * 80.0D) - 40;
                    field404 = (int) (Math.random() * 120.0D) - 60;
                    field291 = (int) (Math.random() * 30.0D) - 20;
                    field342 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field523 = 0;
                    field377 = -1;
                    field496 = 0;
                    field302 = 0;
                    field437 = class19.field541;
                    field317 = 0;
                    field296 = 0;
                    for (int var18 = 0; var18 < 2048; var18++) {
                        field262[var18] = null;
                        field473[var18] = null;
                    }
                    for (int var19 = 0; var19 < 32768; var19++) {
                        field536[var19] = null;
                    }
                    Statics.field633 = field262[2047] = new class3();
                    field391 = -1;
                    field394.method3376();
                    field395.method3376();
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 104; var21++) {
                            for (int var22 = 0; var22 < 104; var22++) {
                                field465[var20][var21][var22] = null;
                            }
                        }
                    }
                    field393 = new class190();
                    field518 = 0;
                    field254 = 0;
                    field533 = 0;
                    for (int var23 = 0; var23 < Statics.field1086; var23++) {
                        class48 var24 = class48.method571(var23);
                        if (var24 != null) {
                            class167.field2799[var23] = 0;
                            class167.field2805[var23] = 0;
                        }
                    }
                    for (int var25 = 0; var25 < field458.length; var25++) {
                        field458[var25] = -1;
                    }
                    field428 = -1;
                    if (field420 != -1) {
                        class164.method872(field420);
                    }
                    for (class4 var26 = (class4) field421.method3345(); var26 != null; var26 = (class4) field421.method3358()) {
                        method75(var26, true);
                    }
                    field420 = -1;
                    field421 = new class187(8);
                    field276 = null;
                    field400 = false;
                    field401 = 0;
                    field535.method3060((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var27 = 0; var27 < 8; var27++) {
                        field388[var27] = null;
                        field389[var27] = false;
                    }
                    class15.method932();
                    field267 = true;
                    for (int var28 = 0; var28 < 100; var28++) {
                        field467[var28] = true;
                    }
                    field521.method2402(75);
                    field521.method2140(method1879());
                    field521.method2322(Statics.field1984);
                    field521.method2322(Statics.field1384);
                    field489 = null;
                    Statics.field601 = 0;
                    Statics.field2490 = null;
                    for (int var29 = 0; var29 < 8; var29++) {
                        field538[var29] = new class211();
                    }
                    Statics.field1150 = null;
                    Statics.field1382 = -1;
                    method2782(false);
                    field303 = -1;
                }
            }
        } catch (IOException var33) {
            if (field364 < 1) {
                if (Statics.field723 == Statics.field195) {
                    Statics.field195 = Statics.field836;
                } else {
                    Statics.field195 = Statics.field723;
                }
                field364++;
                field508 = 0;
            } else {
                method2088(-2);
            }
        }
    }

    @ObfuscatedName("c.k(I)V")
    public static void method84() {
        field521.field1888 = 0;
        field301.field1888 = 0;
        field303 = -1;
        field307 = -1;
        field308 = -1;
        field506 = -1;
        field284 = 0;
        field411 = 0;
        field452 = 0;
        field401 = 0;
        field400 = false;
        field523 = 0;
        field496 = 0;
        for (int var0 = 0; var0 < field262.length; var0++) {
            if (field262[var0] != null) {
                field262[var0].field789 = -1;
            }
        }
        for (int var1 = 0; var1 < field536.length; var1++) {
            if (field536[var1] != null) {
                field536[var1].field789 = -1;
            }
        }
        class15.method932();
        method873(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field467[var2] = true;
        }
        field521.method2402(75);
        field521.method2140(method1879());
        field521.method2322(Statics.field1984);
        field521.method2322(Statics.field1384);
    }

    @ObfuscatedName("dd.o(II)V")
    public static void method2088(int arg0) {
        if (arg0 == -3) {
            class30.method1986(class148.field2241, class148.field2242, class148.field2243);
        } else if (arg0 == -2) {
            class30.method1986(class148.field2244, class148.field2278, class148.field2246);
        } else if (arg0 == -1) {
            class30.method1986(class148.field2247, class148.field2248, class148.field2380);
        } else if (arg0 == 3) {
            class30.method1986(class148.field2250, class148.field2251, class148.field2236);
        } else if (arg0 == 4) {
            class30.method1986(class148.field2253, class148.field2254, class148.field2255);
        } else if (arg0 == 5) {
            class30.method1986(class148.field2256, class148.field2257, class148.field2449);
        } else if (arg0 == 6) {
            class30.method1986(class148.field2259, class148.field2260, class148.field2261);
        } else if (arg0 == 7) {
            class30.method1986(class148.field2262, class148.field2263, class148.field2264);
        } else if (arg0 == 8) {
            class30.method1986(class148.field2265, class148.field2266, class148.field2201);
        } else if (arg0 == 9) {
            class30.method1986(class148.field2268, class148.field2269, class148.field2270);
        } else if (arg0 == 10) {
            class30.method1986(class148.field2311, class148.field2272, class148.field2205);
        } else if (arg0 == 11) {
            class30.method1986(class148.field2274, class148.field2412, class148.field2273);
        } else if (arg0 == 12) {
            class30.method1986(class148.field2277, class148.field2429, class148.field2279);
        } else if (arg0 == 13) {
            class30.method1986(class148.field2280, class148.field2281, class148.field2282);
        } else if (arg0 == 14) {
            class30.method1986(class148.field2283, class148.field2284, class148.field2285);
        } else if (arg0 == 16) {
            class30.method1986(class148.field2286, class148.field2305, class148.field2373);
        } else if (arg0 == 17) {
            class30.method1986(class148.field2206, class148.field2290, class148.field2291);
        } else if (arg0 == 18) {
            class30.method1986(class148.field2300, class148.field2293, class148.field2407);
        } else if (arg0 == 19) {
            class30.method1986(class148.field2295, class148.field2296, class148.field2297);
        } else if (arg0 == 20) {
            class30.method1986(class148.field2298, class148.field2299, class148.field2401);
        } else if (arg0 == 22) {
            class30.method1986(class148.field2301, class148.field2302, class148.field2303);
        } else if (arg0 == 23) {
            class30.method1986(class148.field2252, class148.field2203, class148.field2306);
        } else if (arg0 == 24) {
            class30.method1986(class148.field2363, class148.field2386, class148.field2292);
        } else if (arg0 == 25) {
            class30.method1986(class148.field2422, class148.field2222, class148.field2312);
        } else if (arg0 == 26) {
            class30.method1986(class148.field2313, class148.field2461, class148.field2403);
        } else if (arg0 == 27) {
            class30.method1986(class148.field2445, class148.field2309, class148.field2437);
        } else if (arg0 == 31) {
            class30.method1986(class148.field2325, class148.field2318, class148.field2327);
        } else if (arg0 == 32) {
            class30.method1986(class148.field2328, class148.field2474, class148.field2330);
        } else if (arg0 == 37) {
            class30.method1986(class148.field2331, class148.field2404, class148.field2420);
        } else if (arg0 == 38) {
            class30.method1986(class148.field2334, class148.field2335, class148.field2336);
        } else if (arg0 == 55) {
            class30.method1986(class148.field2337, class148.field2338, class148.field2339);
        } else if (arg0 == 56) {
            class30.method1986(class148.field2340, class148.field2341, class148.field2342);
            method873(11);
            return;
        } else if (arg0 == 57) {
            class30.method1986(class148.field2343, class148.field2249, class148.field2276);
            method873(11);
            return;
        } else {
            class30.method1986(class148.field2346, class148.field2347, class148.field2348);
        }
        method873(10);
    }

    @ObfuscatedName("n.a(B)V")
    public static final void method2() {
        if (Statics.field3073 != null) {
            Statics.field3073.method2661();
            Statics.field3073 = null;
        }
        method801();
        Statics.field1890.method1625();
        for (int var0 = 0; var0 < 4; var0++) {
            field318[var0].method3755();
        }
        System.gc();
        class174.field2858 = 1;
        Statics.field2859 = null;
        Statics.field1085 = -1;
        Statics.field1522 = -1;
        Statics.field2860 = 0;
        Statics.field1284 = false;
        Statics.field2137 = 2;
        field500 = -1;
        field501 = false;
        for (class22 var1 = (class22) class22.field577.method3382(); var1 != null; var1 = (class22) class22.field577.method3384()) {
            if (var1.field576 != null) {
                Statics.field241.method1001(var1.field576);
                var1.field576 = null;
            }
            if (var1.field573 != null) {
                Statics.field241.method1001(var1.field573);
                var1.field573 = null;
            }
        }
        class22.field577.method3376();
        method873(10);
    }

    @ObfuscatedName("ab.p(S)V")
    public static final void method801() {
        class43.method538();
        class39.field921.method3319();
        class42.method599();
        Statics.method162();
        class37.field827.method3319();
        class37.field850.method3319();
        class47.field1062.method3319();
        class47.field1038.method3319();
        class47.field1039.method3319();
        class40.field931.method3319();
        class40.field935.method3319();
        class41.method1454();
        class44.method518();
        class48.field1087.method3319();
        class170.method2786();
        class164.field2645.method3319();
        class164.field2646.method3319();
        class164.field2755.method3319();
        class164.field2648.method3319();
        ((class90) Statics.field1509).method1882();
        class20.field553.method3319();
        Statics.field1448.method2871();
        Statics.field146.method2871();
        Statics.field1703.method2871();
        Statics.field2539.method2871();
        Statics.field202.method2871();
        Statics.field819.method2871();
        Statics.field672.method2871();
        Statics.field56.method2871();
        Statics.field2804.method2871();
        Statics.field2545.method2871();
        Statics.field190.method2871();
        Statics.field194.method2871();
    }

    @ObfuscatedName("ab.t(I)V")
    public static final void method824() {
        if (Statics.field52 != null) {
            Statics.field52.method1037();
        }
        if (Statics.field1027 != null) {
            Statics.field1027.method1037();
        }
    }

    @ObfuscatedName("eh.x(Lac;IIII)V")
    public static void method2612(class40 arg0, int arg1, int arg2, int arg3) {
        if (field504 >= 50 || field383 == 0 || arg0.field939 == null || arg1 >= arg0.field939.length) {
            return;
        }
        int var4 = arg0.field939[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field491[field504] = var5;
        field282[field504] = var6;
        field507[field504] = 0;
        field509[field504] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field439[field504] = (var8 << 16) + (var9 << 8) + var7;
        field504++;
    }

    @ObfuscatedName("gk.d(IIII)V")
    public static void method3530(int arg0, int arg1, int arg2) {
        if (field265 == 0 || arg1 == 0 || field504 >= 50) {
            return;
        }
        field491[field504] = arg0;
        field282[field504] = arg1;
        field507[field504] = arg2;
        field509[field504] = null;
        field439[field504] = 0;
        field504++;
    }

    @ObfuscatedName("x.j(Lfq;III)V")
    public static final void method520(class164 arg0, int arg1, int arg2) {
        if (field523 != 0 && field523 != 3 || class132.field2043 != 1 && Statics.field121 || class132.field2043 != 4) {
            return;
        }
        class166 var3 = arg0.method2991();
        if (var3 == null) {
            return;
        }
        int var4 = class132.field2034 - arg1;
        int var5 = class132.field2045 - arg2;
        if (!var3.method3037(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2791 / 2;
        int var7 = var5 - var3.field2790 / 2;
        int var8 = field404 + field342 & 0x7FF;
        int var9 = class86.field1512[var8];
        int var10 = class86.field1513[var8];
        int var11 = (field291 + 256) * var9 >> 8;
        int var12 = (field291 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field633.field777 + var13 >> 7;
        int var16 = Statics.field633.field757 - var14 >> 7;
        field521.method2402(245);
        field521.method2140(18);
        field521.method2322(Statics.field311 + var16);
        field521.method2299(class129.field2010[82] ? (class129.field2010[81] ? 2 : 1) : 0);
        field521.method2141(Statics.field1903 + var15);
        field521.method2140(var6);
        field521.method2140(var7);
        field521.method2322(field342);
        field521.method2140(57);
        field521.method2140(field404);
        field521.method2140(field291);
        field521.method2140(89);
        field521.method2322(Statics.field633.field777);
        field521.method2322(Statics.field633.field757);
        field521.method2140(63);
        field496 = var15;
        field302 = var16;
    }

    @ObfuscatedName("cj.r(I)V")
    public static final void method2078() {
        for (int var0 = -1; var0 < field317; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field379[var0];
            }
            class3 var2 = field262[var1];
            if (var2 != null && var2.field781 > 0) {
                var2.field781--;
                if (var2.field781 == 0) {
                    var2.field769 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field296; var3++) {
            int var4 = field297[var3];
            class32 var5 = field536[var4];
            if (var5 != null && var5.field781 > 0) {
                var5.field781--;
                if (var5.field781 == 0) {
                    var5.field769 = null;
                }
            }
        }
    }

    @ObfuscatedName("y.at(I)V")
    public static final void method124() {
        int var0 = Statics.field917 * 128 + 64;
        int var1 = Statics.field1961 * 128 + 64;
        int var2 = method125(var0, var1, Statics.field863) - Statics.field1283;
        if (Statics.field1996 < var0) {
            Statics.field1996 += Statics.field2134 * (var0 - Statics.field1996) / 1000 + Statics.field2550;
            if (Statics.field1996 > var0) {
                Statics.field1996 = var0;
            }
        }
        if (Statics.field1996 > var0) {
            Statics.field1996 -= Statics.field2134 * (Statics.field1996 - var0) / 1000 + Statics.field2550;
            if (Statics.field1996 < var0) {
                Statics.field1996 = var0;
            }
        }
        if (Statics.field1125 < var2) {
            Statics.field1125 += Statics.field2134 * (var2 - Statics.field1125) / 1000 + Statics.field2550;
            if (Statics.field1125 > var2) {
                Statics.field1125 = var2;
            }
        }
        if (Statics.field1125 > var2) {
            Statics.field1125 -= Statics.field2134 * (Statics.field1125 - var2) / 1000 + Statics.field2550;
            if (Statics.field1125 < var2) {
                Statics.field1125 = var2;
            }
        }
        if (Statics.field652 < var1) {
            Statics.field652 += Statics.field2134 * (var1 - Statics.field652) / 1000 + Statics.field2550;
            if (Statics.field652 > var1) {
                Statics.field652 = var1;
            }
        }
        if (Statics.field652 > var1) {
            Statics.field652 -= Statics.field2134 * (Statics.field652 - var1) / 1000 + Statics.field2550;
            if (Statics.field652 < var1) {
                Statics.field652 = var1;
            }
        }
        int var3 = Statics.field1088 * 128 + 64;
        int var4 = Statics.field578 * 128 + 64;
        int var5 = method125(var3, var4, Statics.field863) - Statics.field2096;
        int var6 = var3 - Statics.field1996;
        int var7 = var5 - Statics.field1125;
        int var8 = var4 - Statics.field652;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field113 < var10) {
            Statics.field113 += Statics.field862 * (var10 - Statics.field113) / 1000 + Statics.field114;
            if (Statics.field113 > var10) {
                Statics.field113 = var10;
            }
        }
        if (Statics.field113 > var10) {
            Statics.field113 -= Statics.field862 * (Statics.field113 - var10) / 1000 + Statics.field114;
            if (Statics.field113 < var10) {
                Statics.field113 = var10;
            }
        }
        int var12 = var11 - Statics.field2151;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2151 += Statics.field862 * var12 / 1000 + Statics.field114;
            Statics.field2151 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2151 -= Statics.field862 * -var12 / 1000 + Statics.field114;
            Statics.field2151 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2151;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2151 = var11;
        }
    }

    @ObfuscatedName("au.av(I)V")
    public static final void method620() {
        int var0 = field322 + Statics.field633.field777;
        int var1 = field431 + Statics.field633.field757;
        if (Statics.field22 - var0 < -500 || Statics.field22 - var0 > 500 || Statics.field929 - var1 < -500 || Statics.field929 - var1 > 500) {
            Statics.field22 = var0;
            Statics.field929 = var1;
        }
        if (Statics.field22 != var0) {
            Statics.field22 += (var0 - Statics.field22) / 16;
        }
        if (Statics.field929 != var1) {
            Statics.field929 += (var1 - Statics.field929) / 16;
        }
        if (class132.field2036 == 4 && Statics.field121) {
            int var2 = class132.field2038 - field346;
            field290 = var2 * 2;
            field346 = var2 == -1 || var2 == 1 ? class132.field2038 : (field346 + class132.field2038) / 2;
            int var3 = field345 - class132.field2037;
            field343 = var3 * 2;
            field345 = var3 == -1 || var3 == 1 ? class132.field2037 : (field345 + class132.field2037) / 2;
        } else {
            if (class129.field2010[96]) {
                field343 += (-24 - field343) / 2;
            } else if (class129.field2010[97]) {
                field343 += (24 - field343) / 2;
            } else {
                field343 /= 2;
            }
            if (class129.field2010[98]) {
                field290 += (12 - field290) / 2;
            } else if (class129.field2010[99]) {
                field290 += (-12 - field290) / 2;
            } else {
                field290 /= 2;
            }
            field346 = class132.field2038;
            field345 = class132.field2037;
        }
        field342 = field343 / 2 + field342 & 0x7FF;
        field415 += field290 / 2;
        if (field415 < 128) {
            field415 = 128;
        }
        if (field415 > 383) {
            field415 = 383;
        }
        int var4 = Statics.field22 >> 7;
        int var5 = Statics.field929 >> 7;
        int var6 = method125(Statics.field22, Statics.field929, Statics.field863);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field863;
                    if (var10 < 3 && (class6.field65[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field83[var10][var8][var9];
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
        if (var12 > field349) {
            field349 += (var12 - field349) / 24;
        } else if (var12 < field349) {
            field349 += (var12 - field349) / 80;
        }
    }

    @ObfuscatedName("es.ar(I)V")
    public static final void method2748() {
        for (int var0 = 0; var0 < field296; var0++) {
            int var1 = field297[var0];
            class32 var2 = field536[var1];
            if (var2 != null) {
                Statics.method133(var2, var2.field725.field830);
            }
        }
    }

    @ObfuscatedName("ap.as(Lau;B)V")
    public static final void method607(class35 arg0) {
        int var1 = arg0.field801 - field268;
        int var2 = arg0.field797 * 128 + arg0.field760 * 64;
        int var3 = arg0.field816 * 128 + arg0.field760 * 64;
        arg0.field777 += (var2 - arg0.field777) / var1;
        arg0.field757 += (var3 - arg0.field757) / var1;
        arg0.field766 = 0;
        if (arg0.field803 == 0) {
            arg0.field806 = 1024;
        }
        if (arg0.field803 == 1) {
            arg0.field806 = 1536;
        }
        if (arg0.field803 == 2) {
            arg0.field806 = 0;
        }
        if (arg0.field803 == 3) {
            arg0.field806 = 512;
        }
    }

    @ObfuscatedName("cg.ad(Lau;B)V")
    public static final void method1904(class35 arg0) {
        if (field268 == arg0.field802 || arg0.field787 == -1 || arg0.field792 != 0 || arg0.field793 + 1 > class40.method122(arg0.field787).field938[arg0.field788]) {
            int var1 = arg0.field802 - arg0.field801;
            int var2 = field268 - arg0.field801;
            int var3 = arg0.field797 * 128 + arg0.field760 * 64;
            int var4 = arg0.field816 * 128 + arg0.field760 * 64;
            int var5 = arg0.field798 * 128 + arg0.field760 * 64;
            int var6 = arg0.field800 * 128 + arg0.field760 * 64;
            arg0.field777 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field757 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field766 = 0;
        if (arg0.field803 == 0) {
            arg0.field806 = 1024;
        }
        if (arg0.field803 == 1) {
            arg0.field806 = 1536;
        }
        if (arg0.field803 == 2) {
            arg0.field806 = 0;
        }
        if (arg0.field803 == 3) {
            arg0.field806 = 512;
        }
        arg0.field768 = arg0.field806;
    }

    @ObfuscatedName("m.ap(Lau;B)V")
    public static final void method119(class35 arg0) {
        if (arg0.field785 == 0) {
            return;
        }
        if (arg0.field789 != -1 && arg0.field789 < 32768) {
            class32 var1 = field536[arg0.field789];
            if (var1 != null) {
                int var2 = arg0.field777 - var1.field777;
                int var3 = arg0.field757 - var1.field757;
                if (var2 != 0 || var3 != 0) {
                    arg0.field806 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field789 >= 32768) {
            int var4 = arg0.field789 - 32768;
            if (field409 == var4) {
                var4 = 2047;
            }
            class3 var5 = field262[var4];
            if (var5 != null) {
                int var6 = arg0.field777 - var5.field777;
                int var7 = arg0.field757 - var5.field757;
                if (var6 != 0 || var7 != 0) {
                    arg0.field806 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field782 != 0 || arg0.field783 != 0) && (arg0.field809 == 0 || arg0.field766 > 0)) {
            int var8 = arg0.field777 - (arg0.field782 * 64 - Statics.field1903 * 64 - Statics.field1903 * 64);
            int var9 = arg0.field757 - (arg0.field783 * 64 - Statics.field311 * 64 - Statics.field311 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field806 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field782 = 0;
            arg0.field783 = 0;
        }
        int var10 = arg0.field806 - arg0.field768 & 0x7FF;
        if (var10 == 0) {
            arg0.field807 = 0;
            return;
        }
        arg0.field807++;
        if (var10 > 1024) {
            arg0.field768 -= arg0.field785;
            boolean var11 = true;
            if (var10 < arg0.field785 || var10 > 2048 - arg0.field785) {
                arg0.field768 = arg0.field806;
                var11 = false;
            }
            if (arg0.field799 == arg0.field761 && (arg0.field807 > 25 || var11)) {
                if (arg0.field762 == -1) {
                    arg0.field799 = arg0.field764;
                } else {
                    arg0.field799 = arg0.field762;
                }
            }
        } else {
            arg0.field768 += arg0.field785;
            boolean var12 = true;
            if (var10 < arg0.field785 || var10 > 2048 - arg0.field785) {
                arg0.field768 = arg0.field806;
                var12 = false;
            }
            if (arg0.field799 == arg0.field761 && (arg0.field807 > 25 || var12)) {
                if (arg0.field815 == -1) {
                    arg0.field799 = arg0.field764;
                } else {
                    arg0.field799 = arg0.field815;
                }
            }
        }
        arg0.field768 &= 0x7FF;
    }

    @ObfuscatedName("el.an(Li;III)V")
    public static void method2660(class3 arg0, int arg1, int arg2) {
        if (arg0.field787 == arg1 && arg1 != -1) {
            int var3 = class40.method122(arg1).field949;
            if (var3 == 1) {
                arg0.field788 = 0;
                arg0.field793 = 0;
                arg0.field792 = arg2;
                arg0.field791 = 0;
            }
            if (var3 == 2) {
                arg0.field791 = 0;
            }
        } else if (arg1 == -1 || arg0.field787 == -1 || class40.method122(arg1).field945 >= class40.method122(arg0.field787).field945) {
            arg0.field787 = arg1;
            arg0.field788 = 0;
            arg0.field793 = 0;
            arg0.field792 = arg2;
            arg0.field791 = 0;
            arg0.field814 = arg0.field809;
        }
    }

    @ObfuscatedName("cn.au(S)I")
    public static int method1879() {
        return field476 ? 2 : 1;
    }

    @ObfuscatedName("u.aw(II)V")
    public static void method152(int arg0) {
        field475 = 0L;
        if (arg0 >= 2) {
            field476 = true;
        } else {
            field476 = false;
        }
        method1803();
        if (field266 >= 25) {
            field521.method2402(75);
            field521.method2140(method1879());
            field521.method2322(Statics.field1984);
            field521.method2322(Statics.field1384);
        }
        field2089 = true;
    }

    @ObfuscatedName("bv.ag(I)V")
    public static void method1376() {
        class129.method2775(Statics.field1869);
        Canvas var0 = Statics.field1869;
        var0.removeMouseListener(class132.field2046);
        var0.removeMouseMotionListener(class132.field2046);
        var0.removeFocusListener(class132.field2046);
        class132.field2033 = 0;
        if (Statics.field2796 != null) {
            Statics.field2796.method2478(Statics.field1869);
        }
        Statics.field430.method2674();
        Statics.field1869.setBackground(Color.black);
        class129.method2493(Statics.field1869);
        class132.method673(Statics.field1869);
        if (Statics.field2796 != null) {
            Statics.field2796.method2477(Statics.field1869);
        }
        if (field420 != -1) {
            method1898(false);
        }
        field2077 = true;
    }

    @ObfuscatedName("ck.ah(I)V")
    public static void method1803() {
        client var0 = Statics.field430;
        synchronized (Statics.field430) {
            Container var1 = Statics.field430.method2672();
            if (var1 != null) {
                Statics.field173 = Math.max(var1.getSize().width, Statics.field560);
                Statics.field81 = Math.max(var1.getSize().height, Statics.field1936);
                if (Statics.field1864 == var1) {
                    Insets var2 = Statics.field1864.getInsets();
                    Statics.field173 -= var2.right + var2.left;
                    Statics.field81 -= var2.top + var2.bottom;
                }
                if (Statics.field173 <= 0) {
                    Statics.field173 = 1;
                }
                if (Statics.field81 <= 0) {
                    Statics.field81 = 1;
                }
                if (method1879() == 1) {
                    Statics.field1984 = field382;
                    Statics.field1384 = field478 * 503;
                } else {
                    Statics.field1984 = Math.min(Statics.field173, 7680);
                    Statics.field1384 = Math.min(Statics.field81, 2160);
                }
                field2088 = (Statics.field173 - Statics.field1984) / 2;
                field2090 = 0;
                Statics.field1869.setSize(Statics.field1984, Statics.field1384);
                Statics.field999 = class73.method1903(Statics.field1984, Statics.field1384, Statics.field1869);
                if (Statics.field1864 == var1) {
                    Insets var3 = Statics.field1864.getInsets();
                    Statics.field1869.setLocation(field2088 + var3.left, field2090 + var3.top);
                } else {
                    Statics.field1869.setLocation(field2088, field2090);
                }
                method2965();
                if (field420 != -1) {
                    method1898(true);
                }
                method785();
            }
        }
    }

    @ObfuscatedName("fw.ao(I)V")
    public static void method2965() {
        int var0 = Statics.field1984;
        int var1 = Statics.field1384;
        if (Statics.field173 < var0) {
            int var2 = Statics.field173;
        }
        if (Statics.field81 < var1) {
            int var3 = Statics.field81;
        }
        if (Statics.field1691 == null) {
            return;
        }
        try {
            client var4 = Statics.field430;
            Object[] var5 = new Object[] { method1879() };
            JSObject.getWindow(var4).call("resize", var5);
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("af.ac(I)V")
    public static void method785() {
        int var0 = field2088;
        int var1 = field2090;
        int var2 = Statics.field173 - Statics.field1984 - var0;
        int var3 = Statics.field81 - Statics.field1384 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field430.method2672();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1864 == var4) {
                Insets var7 = Statics.field1864.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field81);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field173, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field173 + var5 - var2, var6, var2, Statics.field81);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field81 + var6 - var3, Statics.field173, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("g.af(B)V")
    public static final void method159() {
        if (field420 != -1) {
            int var0 = field420;
            if (class164.method2633(var0)) {
                method1340(Statics.field2642[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field397; var1++) {
            if (field467[var1]) {
                field468[var1] = true;
            }
            field469[var1] = field467[var1];
            field467[var1] = false;
        }
        field466 = field268;
        field457 = -1;
        field402 = -1;
        Statics.field211 = null;
        if (field420 != -1) {
            field397 = 0;
            method3031(field420, 0, 0, Statics.field1984, Statics.field1384, 0, 0, -1);
        }
        class75.method1534();
        if (field400) {
            method156();
        } else if (field457 != -1) {
            method30(field457, field402);
        }
        if (field474 == 3) {
            for (int var2 = 0; var2 < field397; var2++) {
                if (field469[var2]) {
                    class75.method1574(field372[var2], field471[var2], field472[var2], field261[var2], 16711935, 128);
                } else if (field468[var2]) {
                    class75.method1574(field372[var2], field471[var2], field472[var2], field261[var2], 16711680, 128);
                }
            }
        }
        int var3 = Statics.field863;
        int var4 = Statics.field633.field777;
        int var5 = Statics.field633.field757;
        int var6 = field334;
        for (class22 var7 = (class22) class22.field577.method3382(); var7 != null; var7 = (class22) class22.field577.method3384()) {
            if (var7.field575 != -1 || var7.field579 != null) {
                int var8 = 0;
                if (var4 > var7.field572) {
                    var8 += var4 - var7.field572;
                } else if (var4 < var7.field570) {
                    var8 += var7.field570 - var4;
                }
                if (var5 > var7.field585) {
                    var8 += var5 - var7.field585;
                } else if (var5 < var7.field571) {
                    var8 += var7.field571 - var5;
                }
                if (var8 - 64 > var7.field574 || field383 == 0 || var7.field568 != var3) {
                    if (var7.field576 != null) {
                        Statics.field241.method1001(var7.field576);
                        var7.field576 = null;
                    }
                    if (var7.field573 != null) {
                        Statics.field241.method1001(var7.field573);
                        var7.field573 = null;
                    }
                } else {
                    var8 -= 64;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = field383 * (var7.field574 - var8) / var7.field574;
                    class54 var10000;
                    if (var7.field576 != null) {
                        var7.field576.method1142(var9);
                    } else if (var7.field575 >= 0) {
                        var10000 = (class54) null;
                        class54 var10 = class54.method1084(Statics.field2539, var7.field575, 0);
                        if (var10 != null) {
                            class58 var11 = var10.method1080().method1117(Statics.field1850);
                            class60 var12 = class60.method1141(var11, 100, var9);
                            var12.method1176(-1);
                            Statics.field241.method1000(var12);
                            var7.field576 = var12;
                        }
                    }
                    if (var7.field573 != null) {
                        var7.field573.method1142(var9);
                        if (!var7.field573.method3470()) {
                            var7.field573 = null;
                        }
                    } else if (var7.field579 != null && (var7.field580 -= var6) <= 0) {
                        int var13 = (int) (Math.random() * (double) var7.field579.length);
                        var10000 = (class54) null;
                        class54 var14 = class54.method1084(Statics.field2539, var7.field579[var13], 0);
                        if (var14 != null) {
                            class58 var15 = var14.method1080().method1117(Statics.field1850);
                            class60 var16 = class60.method1141(var15, 100, var9);
                            var16.method1176(0);
                            Statics.field241.method1000(var16);
                            var7.field573 = var16;
                            var7.field580 = var7.field569 + (int) (Math.random() * (double) (var7.field583 - var7.field569));
                        }
                    }
                }
            }
        }
        field334 = 0;
    }

    @ObfuscatedName("fd.ab(Ljava/lang/String;ZI)V")
    public static final void method2878(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field586.method3589(arg0, 250);
        int var6 = Statics.field586.method3590(arg0, 250) * 13;
        class75.method1567(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class75.method1543(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field586.method3631(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method563(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1869.getGraphics();
                Statics.field999.method1367(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1869.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field397; var13++) {
            if (field472[var13] + field372[var13] > var9 && field372[var13] < var9 + var11 && field471[var13] + field261[var13] > var10 && field471[var13] < var10 + var12) {
                field468[var13] = true;
            }
        }
    }

    @ObfuscatedName("t.ai(IIIII)V")
    public static final void method508(int arg0, int arg1, int arg2, int arg3) {
        field361++;
        method1987(class31.field720);
        boolean var4 = false;
        if (field391 >= 0) {
            for (int var5 = 0; var5 < field317; var5++) {
                if (field391 == field379[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method1987(class31.field718);
        }
        method1997(true);
        method1987(var4 ? class31.field721 : class31.field719);
        method1997(false);
        method8();
        for (class28 var6 = (class28) field395.method3382(); var6 != null; var6 = (class28) field395.method3384()) {
            if (Statics.field863 != var6.field655 || var6.field662) {
                var6.method3474();
            } else if (field268 >= var6.field654) {
                var6.method567(field334);
                if (var6.field662) {
                    var6.method3474();
                } else {
                    Statics.field1890.method1793(var6.field655, var6.field669, var6.field657, var6.field653, 60, var6, 0, -1, false);
                }
            }
        }
        method950(arg0, arg1, arg2, arg3, true);
        int var7 = field498;
        int var8 = field525;
        int var9 = field526;
        int var10 = field527;
        class75.method1566(var7, var8, var7 + var9, var8 + var10);
        class86.method1806();
        if (!field510) {
            int var11 = field415;
            if (field349 / 256 > var11) {
                var11 = field349 / 256;
            }
            if (field329[4] && field477[4] + 128 > var11) {
                var11 = field477[4] + 128;
            }
            int var12 = field342 + field341 & 0x7FF;
            int var13 = Statics.field22;
            int var14 = method125(Statics.field633.field777, Statics.field633.field757, Statics.field863) - 50;
            int var15 = Statics.field929;
            int var16 = var11 * 3 + 600;
            int var17 = 2048 - var11 & 0x7FF;
            int var18 = 2048 - var12 & 0x7FF;
            int var19 = 0;
            int var20 = 0;
            int var21 = var16;
            if (var17 != 0) {
                int var22 = class86.field1512[var17];
                int var23 = class86.field1513[var17];
                int var24 = var20 * var23 - var16 * var22 >> 16;
                var21 = var20 * var22 + var16 * var23 >> 16;
                var20 = var24;
            }
            if (var18 != 0) {
                int var25 = class86.field1512[var18];
                int var26 = class86.field1513[var18];
                int var27 = var19 * var26 + var21 * var25 >> 16;
                var21 = var21 * var26 - var19 * var25 >> 16;
                var19 = var27;
            }
            Statics.field1996 = var13 - var19;
            Statics.field1125 = var14 - var20;
            Statics.field652 = var15 - var21;
            Statics.field113 = var11;
            Statics.field2151 = var12;
        }
        int var40;
        if (field510) {
            var40 = method29();
        } else {
            int var28;
            if (Statics.field1691.field124) {
                var28 = Statics.field863;
            } else {
                int var29 = 3;
                if (Statics.field113 < 310) {
                    int var30 = Statics.field1996 >> 7;
                    int var31 = Statics.field652 >> 7;
                    int var32 = Statics.field633.field777 >> 7;
                    int var33 = Statics.field633.field757 >> 7;
                    if ((class6.field65[Statics.field863][var30][var31] & 0x4) != 0) {
                        var29 = Statics.field863;
                    }
                    int var34;
                    if (var32 > var30) {
                        var34 = var32 - var30;
                    } else {
                        var34 = var30 - var32;
                    }
                    int var35;
                    if (var33 > var31) {
                        var35 = var33 - var31;
                    } else {
                        var35 = var31 - var33;
                    }
                    if (var34 > var35) {
                        int var36 = var35 * 65536 / var34;
                        int var37 = 32768;
                        while (var30 != var32) {
                            if (var30 < var32) {
                                var30++;
                            } else if (var30 > var32) {
                                var30--;
                            }
                            if ((class6.field65[Statics.field863][var30][var31] & 0x4) != 0) {
                                var29 = Statics.field863;
                            }
                            var37 += var36;
                            if (var37 >= 65536) {
                                var37 -= 65536;
                                if (var31 < var33) {
                                    var31++;
                                } else if (var31 > var33) {
                                    var31--;
                                }
                                if ((class6.field65[Statics.field863][var30][var31] & 0x4) != 0) {
                                    var29 = Statics.field863;
                                }
                            }
                        }
                    } else {
                        int var38 = var34 * 65536 / var35;
                        int var39 = 32768;
                        while (var31 != var33) {
                            if (var31 < var33) {
                                var31++;
                            } else if (var31 > var33) {
                                var31--;
                            }
                            if ((class6.field65[Statics.field863][var30][var31] & 0x4) != 0) {
                                var29 = Statics.field863;
                            }
                            var39 += var38;
                            if (var39 >= 65536) {
                                var39 -= 65536;
                                if (var30 < var32) {
                                    var30++;
                                } else if (var30 > var32) {
                                    var30--;
                                }
                                if ((class6.field65[Statics.field863][var30][var31] & 0x4) != 0) {
                                    var29 = Statics.field863;
                                }
                            }
                        }
                    }
                }
                if ((class6.field65[Statics.field863][Statics.field633.field777 >> 7][Statics.field633.field757 >> 7] & 0x4) != 0) {
                    var29 = Statics.field863;
                }
                var28 = var29;
            }
            var40 = var28;
        }
        int var41 = Statics.field1996;
        int var42 = Statics.field1125;
        int var43 = Statics.field652;
        int var44 = Statics.field113;
        int var45 = Statics.field2151;
        for (int var46 = 0; var46 < 5; var46++) {
            if (field329[var46]) {
                int var47 = (int) (Math.random() * (double) (field512[var46] * 2 + 1) - (double) field512[var46] + Math.sin((double) field514[var46] / 100.0D * (double) field515[var46]) * (double) field477[var46]);
                if (var46 == 0) {
                    Statics.field1996 += var47;
                }
                if (var46 == 1) {
                    Statics.field1125 += var47;
                }
                if (var46 == 2) {
                    Statics.field652 += var47;
                }
                if (var46 == 3) {
                    Statics.field2151 = Statics.field2151 + var47 & 0x7FF;
                }
                if (var46 == 4) {
                    Statics.field113 += var47;
                    if (Statics.field113 < 128) {
                        Statics.field113 = 128;
                    }
                    if (Statics.field113 > 383) {
                        Statics.field113 = 383;
                    }
                }
            }
        }
        int var48 = class132.field2037;
        int var49 = class132.field2038;
        if (class132.field2043 != 0) {
            var48 = class132.field2034;
            var49 = class132.field2045;
        }
        if (var48 >= var7 && var48 < var7 + var9 && var49 >= var8 && var49 < var8 + var10) {
            class100.field1779 = true;
            class100.field1782 = 0;
            class100.field1780 = var48 - var7;
            class100.field1756 = var49 - var8;
        } else {
            class100.field1779 = false;
            class100.field1782 = 0;
        }
        method824();
        class75.method1567(var7, var8, var9, var10, 0);
        method824();
        int var50 = class86.field1498;
        class86.field1498 = field528;
        Statics.field1890.method1663(Statics.field1996, Statics.field1125, Statics.field652, Statics.field113, Statics.field2151, var40);
        class86.field1498 = var50;
        method824();
        Statics.field1890.method1639();
        field350 = 0;
        boolean var51 = false;
        int var52 = -1;
        for (int var53 = -1; var53 < field317 + field296; var53++) {
            class35 var54;
            if (var53 == -1) {
                var54 = Statics.field633;
            } else if (var53 < field317) {
                var54 = field262[field379[var53]];
                if (field391 == field379[var53]) {
                    var51 = true;
                    var52 = var53;
                    continue;
                }
            } else {
                var54 = field536[field297[var53 - field317]];
            }
            method2635(var54, var53, var7, var8, var9, var10);
        }
        if (var51) {
            method2635(field262[field391], var52, var7, var8, var9, var10);
        }
        for (int var55 = 0; var55 < field350; var55++) {
            int var56 = field293[var55];
            int var57 = field353[var55];
            int var58 = field355[var55];
            int var59 = field354[var55];
            boolean var60 = true;
            while (var60) {
                var60 = false;
                for (int var61 = 0; var61 < var55; var61++) {
                    if (var57 + 2 > field353[var61] - field354[var61] && var57 - var59 < field353[var61] + 2 && var56 - var58 < field355[var61] + field293[var61] && var56 + var58 > field293[var61] - field355[var61] && field353[var61] - field354[var61] < var57) {
                        var57 = field353[var61] - field354[var61];
                        var60 = true;
                    }
                }
            }
            field362 = field293[var55];
            field453 = field353[var55] = var57;
            String var62 = field359[var55];
            if (field422 == 0) {
                int var63 = 16776960;
                if (field271[var55] < 6) {
                    var63 = field479[field271[var55]];
                }
                if (field271[var55] == 6) {
                    var63 = field361 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field271[var55] == 7) {
                    var63 = field361 % 20 < 10 ? 255 : 65535;
                }
                if (field271[var55] == 8) {
                    var63 = field361 % 20 < 10 ? 45056 : 8454016;
                }
                if (field271[var55] == 9) {
                    int var64 = 150 - field358[var55];
                    if (var64 < 50) {
                        var63 = var64 * 1280 + 16711680;
                    } else if (var64 < 100) {
                        var63 = 16776960 - (var64 - 50) * 327680;
                    } else if (var64 < 150) {
                        var63 = (var64 - 100) * 5 + 65280;
                    }
                }
                if (field271[var55] == 10) {
                    int var65 = 150 - field358[var55];
                    if (var65 < 50) {
                        var63 = var65 * 5 + 16711680;
                    } else if (var65 < 100) {
                        var63 = 16711935 - (var65 - 50) * 327680;
                    } else if (var65 < 150) {
                        var63 = (var65 - 100) * 327680 + 255 - (var65 - 100) * 5;
                    }
                }
                if (field271[var55] == 11) {
                    int var66 = 150 - field358[var55];
                    if (var66 < 50) {
                        var63 = 16777215 - var66 * 327685;
                    } else if (var66 < 100) {
                        var63 = (var66 - 50) * 327685 + 65280;
                    } else if (var66 < 150) {
                        var63 = 16777215 - (var66 - 100) * 327680;
                    }
                }
                if (field357[var55] == 0) {
                    Statics.field2863.method3666(var62, field362 + var7, field453 + var8, var63, 0);
                }
                if (field357[var55] == 1) {
                    Statics.field2863.method3596(var62, field362 + var7, field453 + var8, var63, 0, field361);
                }
                if (field357[var55] == 2) {
                    Statics.field2863.method3597(var62, field362 + var7, field453 + var8, var63, 0, field361);
                }
                if (field357[var55] == 3) {
                    Statics.field2863.method3598(var62, field362 + var7, field453 + var8, var63, 0, field361, 150 - field358[var55]);
                }
                if (field357[var55] == 4) {
                    int var67 = (150 - field358[var55]) * (Statics.field2863.method3674(var62) + 100) / 150;
                    class75.method1582(field362 + var7 - 50, var8, field362 + var7 + 50, var8 + var10);
                    Statics.field2863.method3592(var62, field362 + var7 + 50 - var67, field453 + var8, var63, 0);
                    class75.method1566(var7, var8, var7 + var9, var8 + var10);
                }
                if (field357[var55] == 5) {
                    int var68 = 150 - field358[var55];
                    int var69 = 0;
                    if (var68 < 25) {
                        var69 = var68 - 25;
                    } else if (var68 > 125) {
                        var69 = var68 - 125;
                    }
                    class75.method1582(var7, field453 + var8 - Statics.field2863.field3104 - 1, var7 + var9, field453 + var8 + 5);
                    Statics.field2863.method3666(var62, field362 + var7, field453 + var8 + var69, var63, 0);
                    class75.method1566(var7, var8, var7 + var9, var8 + var10);
                }
            } else {
                Statics.field2863.method3666(var62, field362 + var7, field453 + var8, 16776960, 0);
            }
        }
        if (field365 == 2) {
            method572((field279 - Statics.field1903 << 7) + field524, (field280 - Statics.field311 << 7) + field264, field281 * 2);
            if (field362 > -1 && field268 % 20 < 10) {
                Statics.field1698[0].method1467(field362 + var7 - 12, field453 + var8 - 28);
            }
        }
        ((class90) Statics.field1509).method1883(field334);
        if (field323 == 1) {
            Statics.field2169[field366 / 100].method1467(field414 - 8, field384 - 8);
        }
        if (field323 == 2) {
            Statics.field2169[field366 / 100 + 4].method1467(field414 - 8, field384 - 8);
        }
        method2777();
        Statics.field1996 = var41;
        Statics.field1125 = var42;
        Statics.field652 = var43;
        Statics.field113 = var44;
        Statics.field2151 = var45;
        if (field267 && class162.method1892(true, false) == 0) {
            field267 = false;
        }
        if (field267) {
            class75.method1567(var7, var8, var9, var10, 0);
            method2878(class148.field2211, false);
        }
    }

    @ObfuscatedName("am.ay(IIIIZB)V")
    public static final void method950(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field367 - field516) * var5 / 100 + field516;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field522) {
            short var8 = field522;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field429) {
                var6 = field429;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class75.method1534();
                    class75.method1567(arg0, arg1, var10, arg3, -16777216);
                    class75.method1567(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field416) {
            short var11 = field416;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field520) {
                var6 = field520;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class75.method1534();
                    class75.method1567(arg0, arg1, arg2, var13, -16777216);
                    class75.method1567(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
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
                int var18 = class86.field1512[var16];
                var14[var15] = var17 * var18 >> 16;
            }
            class81.method1692(var14, 500, 800, arg2, arg3);
        }
        field498 = arg0;
        field525 = arg1;
        field526 = arg2;
        field527 = arg3;
    }

    @ObfuscatedName("cr.ak(Las;B)V")
    public static final void method1987(class31 arg0) {
        if (Statics.field633.field777 >> 7 == field496 && Statics.field633.field757 >> 7 == field302) {
            field496 = 0;
        }
        int var1 = field317;
        if (class31.field720 == arg0 || class31.field718 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class31.field720 == arg0) {
                var3 = Statics.field633;
                var4 = 33538048;
            } else if (class31.field718 == arg0) {
                var3 = field262[field391];
                var4 = field391 << 14;
            } else {
                var3 = field262[field379[var2]];
                var4 = field379[var2] << 14;
                if (class31.field721 == arg0 && field391 == field379[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method13() && !var3.field28) {
                var3.field34 = false;
                if ((field263 && field317 > 50 || field317 > 200) && class31.field720 != arg0 && var3.field799 == var3.field761) {
                    var3.field34 = true;
                }
                int var5 = var3.field777 >> 7;
                int var6 = var3.field757 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field40 == null || field268 < var3.field35 || field268 >= var3.field36) {
                        if ((var3.field777 & 0x7F) == 64 && (var3.field757 & 0x7F) == 64) {
                            if (field361 == field360[var5][var6]) {
                                continue;
                            }
                            field360[var5][var6] = field361;
                        }
                        var3.field37 = method125(var3.field777, var3.field757, Statics.field863);
                        Statics.field1890.method1793(Statics.field863, var3.field777, var3.field757, var3.field37, 60, var3, var3.field768, var4, var3.field780);
                    } else {
                        var3.field34 = false;
                        var3.field37 = method125(var3.field777, var3.field757, Statics.field863);
                        Statics.field1890.method1637(Statics.field863, var3.field777, var3.field757, var3.field37, 60, var3, var3.field768, var4, var3.field41, var3.field42, var3.field43, var3.field45);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.aj(ZI)V")
    public static final void method1997(boolean arg0) {
        for (int var1 = 0; var1 < field296; var1++) {
            class32 var2 = field536[field297[var1]];
            int var3 = (field297[var1] << 14) + 536870912;
            if (var2 != null && var2.method13() && var2.field725.field849 == arg0 && var2.field725.method648()) {
                int var4 = var2.field777 >> 7;
                int var5 = var2.field757 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field760 == 1 && (var2.field777 & 0x7F) == 64 && (var2.field757 & 0x7F) == 64) {
                        if (field361 == field360[var4][var5]) {
                            continue;
                        }
                        field360[var4][var5] = field361;
                    }
                    if (!var2.field725.field857) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1890.method1793(Statics.field863, var2.field777, var2.field757, method125(var2.field777 + (var2.field760 * 64 - 64), var2.field757 + (var2.field760 * 64 - 64), Statics.field863), var2.field760 * 64 - 64 + 60, var2, var2.field768, var3, var2.field780);
                }
            }
        }
    }

    @ObfuscatedName("w.az(I)V")
    public static final void method8() {
        for (class7 var0 = (class7) field394.method3382(); var0 != null; var0 = (class7) field394.method3384()) {
            if (Statics.field863 != var0.field88 || field268 > var0.field103) {
                var0.method3474();
            } else if (field268 >= var0.field93) {
                if (var0.field97 > 0) {
                    class32 var1 = field536[var0.field97 - 1];
                    if (var1 != null && var1.field777 >= 0 && var1.field777 < 13312 && var1.field757 >= 0 && var1.field757 < 13312) {
                        var0.method76(var1.field777, var1.field757, method125(var1.field777, var1.field757, var0.field88) - var0.field107, field268);
                    }
                }
                if (var0.field97 < 0) {
                    int var2 = -var0.field97 - 1;
                    class3 var3;
                    if (field409 == var2) {
                        var3 = Statics.field633;
                    } else {
                        var3 = field262[var2];
                    }
                    if (var3 != null && var3.field777 >= 0 && var3.field777 < 13312 && var3.field757 >= 0 && var3.field757 < 13312) {
                        var0.method76(var3.field777, var3.field757, method125(var3.field777, var3.field757, var0.field88) - var0.field107, field268);
                    }
                }
                var0.method77(field334);
                Statics.field1890.method1793(Statics.field863, (int) var0.field99, (int) var0.field100, (int) var0.field101, 60, var0, var0.field111, -1, false);
            }
        }
    }

    @ObfuscatedName("e.am(I)I")
    public static final int method29() {
        if (Statics.field1691.field124) {
            return Statics.field863;
        } else {
            int var0 = method125(Statics.field1996, Statics.field652, Statics.field863);
            return var0 - Statics.field1125 >= 800 || (class6.field65[Statics.field863][Statics.field1996 >> 7][Statics.field652 >> 7] & 0x4) == 0 ? 3 : Statics.field863;
        }
    }

    @ObfuscatedName("el.ax(Lau;IIIIII)V")
    public static final void method2635(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method13()) {
            return;
        }
        if (arg0 instanceof class32) {
            class37 var6 = ((class32) arg0).field725;
            if (var6.field854 != null) {
                var6 = var6.method671();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field317) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field28) {
                return;
            }
            if (var8.field39 != -1 || var8.field31 != -1) {
                method627(arg0, arg0.field772 + 15);
                if (field362 > -1) {
                    if (var8.field39 != -1) {
                        Statics.field112[var8.field39].method1467(field362 + arg2 - 12, field453 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field31 != -1) {
                        Statics.field2801[var8.field31].method1467(field362 + arg2 - 12, field453 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field365 == 10 && field278 == field379[arg1]) {
                method627(arg0, arg0.field772 + 15);
                if (field362 > -1) {
                    Statics.field1698[1].method1467(field362 + arg2 - 12, field453 + arg3 - var7);
                }
            }
        } else {
            class37 var9 = ((class32) arg0).field725;
            if (var9.field854 != null) {
                var9 = var9.method671();
            }
            if (var9.field852 >= 0 && var9.field852 < Statics.field2801.length) {
                method627(arg0, arg0.field772 + 15);
                if (field362 > -1) {
                    Statics.field2801[var9.field852].method1467(field362 + arg2 - 12, field453 + arg3 - 30);
                }
            }
            if (field365 == 1 && field513 == field297[arg1 - field317] && field268 % 20 < 10) {
                method627(arg0, arg0.field772 + 15);
                if (field362 > -1) {
                    Statics.field1698[0].method1467(field362 + arg2 - 12, field453 + arg3 - 28);
                }
            }
        }
        if (arg0.field769 != null && (arg1 >= field317 || !arg0.field771 && (field427 == 4 || !arg0.field770 && (field427 == 0 || field427 == 3 || field427 == 1 && method21(((class3) arg0).field30, false))))) {
            method627(arg0, arg0.field772);
            if (field362 > -1 && field350 < field351) {
                field355[field350] = Statics.field2863.method3674(arg0.field769) / 2;
                field354[field350] = Statics.field2863.field3104;
                field293[field350] = field362;
                field353[field350] = field453;
                field271[field350] = arg0.field773;
                field357[field350] = arg0.field774;
                field358[field350] = arg0.field781;
                field359[field350] = arg0.field769;
                field350++;
            }
        }
        if (arg0.field778 > field268) {
            method627(arg0, arg0.field772 + 15);
            if (field362 > -1) {
                int var10;
                if (arg1 < field317) {
                    var10 = 30;
                } else {
                    class37 var11 = ((class32) arg0).field725;
                    var10 = var11.field860;
                }
                int var12 = arg0.field779 * var10 / arg0.field790;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field779 > 0) {
                    var12 = 1;
                }
                class75.method1567(field362 + arg2 - var10 / 2, field453 + arg3 - 3, var12, 5, 65280);
                class75.method1567(field362 + arg2 - var10 / 2 + var12, field453 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field758[var13] > field268) {
                method627(arg0, arg0.field772 / 2);
                if (field362 > -1) {
                    if (var13 == 1) {
                        field453 -= 20;
                    }
                    if (var13 == 2) {
                        field362 -= 15;
                        field453 -= 10;
                    }
                    if (var13 == 3) {
                        field362 += 15;
                        field453 -= 10;
                    }
                    Statics.field218[arg0.field776[var13]].method1467(field362 + arg2 - 12, field453 + arg3 - 12);
                    Statics.field1148.method3666(Integer.toString(arg0.field775[var13]), field362 + arg2 - 1, field453 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ez.al(I)V")
    public static final void method2777() {
        field376 = 0;
        int var0 = (Statics.field633.field777 >> 7) + Statics.field1903;
        int var1 = (Statics.field633.field757 >> 7) + Statics.field311;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field376 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field376 = 1;
        }
        if (field376 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field376 = 0;
        }
    }

    @ObfuscatedName("au.aa(Lau;II)V")
    public static final void method627(class35 arg0, int arg1) {
        method572(arg0.field777, arg0.field757, arg1);
    }

    @ObfuscatedName("ar.ae(IIIB)V")
    public static final void method572(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field362 = -1;
            field453 = -1;
            return;
        }
        int var3 = method125(arg0, arg1, Statics.field863) - arg2;
        int var4 = arg0 - Statics.field1996;
        int var5 = var3 - Statics.field1125;
        int var6 = arg1 - Statics.field652;
        int var7 = class86.field1512[Statics.field113];
        int var8 = class86.field1513[Statics.field113];
        int var9 = class86.field1512[Statics.field2151];
        int var10 = class86.field1513[Statics.field2151];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field362 = field528 * var11 / var15 + field526 / 2;
            field453 = field528 * var14 / var15 + field527 / 2;
        } else {
            field362 = -1;
            field453 = -1;
        }
    }

    @ObfuscatedName("b.bj(IIIB)I")
    public static final int method125(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field65[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field83[var5][var3][var4] + class6.field83[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field83[var5][var3][var4 + 1] + class6.field83[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ep.bg(ZB)V")
    public static final void method2782(boolean arg0) {
        field319 = arg0;
        if (!field319) {
            int var1 = (field284 - field301.field1888) / 16;
            Statics.field234 = new int[var1][4];
            for (int var2 = 0; var2 < var1; var2++) {
                for (int var3 = 0; var3 < 4; var3++) {
                    Statics.field234[var2][var3] = field301.method2197();
                }
            }
            int var4 = field301.method2157();
            int var5 = field301.method2157();
            int var6 = field301.method2189();
            int var7 = field301.method2183();
            int var8 = field301.method2189();
            Statics.field919 = new int[var1];
            Statics.field2612 = new int[var1];
            Statics.field567 = new int[var1];
            Statics.field1874 = new byte[var1][];
            Statics.field2548 = new byte[var1][];
            boolean var9 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var4 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field919[var10] = var13;
                        Statics.field2612[var10] = Statics.field202.method2925("m" + var11 + "_" + var12);
                        Statics.field567[var10] = Statics.field202.method2925("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method102(var4, var8, var7, var6, var5);
            return;
        }
        int var14 = field301.method2189();
        int var15 = field301.method2189();
        field301.method2403();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field301.method2421(1);
                    if (var19 == 1) {
                        field320[var16][var17][var18] = field301.method2421(26);
                    } else {
                        field320[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field301.method2406();
        int var20 = (field284 - field301.field1888) / 16;
        Statics.field234 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field234[var21][var22] = field301.method2199();
            }
        }
        int var23 = field301.method2156();
        int var24 = field301.method2156();
        int var25 = field301.method2183();
        Statics.field919 = new int[var20];
        Statics.field2612 = new int[var20];
        Statics.field567 = new int[var20];
        Statics.field1874 = new byte[var20][];
        Statics.field2548 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field320[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field919[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field919[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field2612[var26] = Statics.field202.method2925("m" + var35 + "_" + var36);
                            Statics.field567[var26] = Statics.field202.method2925("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method102(var23, var24, var25, var14, var15);
    }

    @ObfuscatedName("s.bw(IIIIII)V")
    public static final void method102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1382 == arg0 && Statics.field606 == arg1 && field312 == arg2 || !field263) {
            return;
        }
        Statics.field1382 = arg0;
        Statics.field606 = arg1;
        field312 = arg2;
        if (!field263) {
            field312 = 0;
        }
        method873(25);
        method2878(class148.field2211, true);
        int var5 = Statics.field1903;
        int var6 = Statics.field311;
        Statics.field1903 = (arg0 - 6) * 8;
        Statics.field311 = (arg1 - 6) * 8;
        int var7 = Statics.field1903 - var5;
        int var8 = Statics.field311 - var6;
        int var9 = Statics.field1903;
        int var10 = Statics.field311;
        for (int var11 = 0; var11 < 32768; var11++) {
            class32 var12 = field536[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field810[var13] -= var7;
                    var12.field811[var13] -= var8;
                }
                var12.field777 -= var7 * 128;
                var12.field757 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field262[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field810[var16] -= var7;
                    var15.field811[var16] -= var8;
                }
                var15.field777 -= var7 * 128;
                var15.field757 -= var8 * 128;
            }
        }
        Statics.field863 = arg2;
        Statics.field633.method621(arg3, arg4, false);
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
                        field465[var27][var23][var24] = field465[var27][var25][var26];
                    } else {
                        field465[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field393.method3382(); var28 != null; var28 = (class16) field393.method3384()) {
            var28.field209 -= var7;
            var28.field212 -= var8;
            if (var28.field209 < 0 || var28.field212 < 0 || var28.field209 >= 104 || var28.field212 >= 104) {
                var28.method3474();
            }
        }
        if (field496 != 0) {
            field496 -= var7;
            field302 -= var8;
        }
        field504 = 0;
        field510 = false;
        field377 = -1;
        field395.method3376();
        field394.method3376();
    }

    @ObfuscatedName("fx.bi(ZS)V")
    public static final void method3291(boolean arg0) {
        method824();
        field529++;
        if (field529 < 50 && !arg0) {
            return;
        }
        field529 = 0;
        if (field310 || Statics.field3073 == null) {
            return;
        }
        field521.method2402(198);
        try {
            Statics.field3073.method2648(field521.field1886, 0, field521.field1888);
            field521.field1888 = 0;
        } catch (IOException var2) {
            field310 = true;
        }
    }

    @ObfuscatedName("ei.bh(II)V")
    public static final void method2624(int arg0) {
        int[] var1 = Statics.field1604.field1337;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field65[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1890.method1659(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field65[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1890.method1659(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1604.method1458();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field65[arg0][var10][var9] & 0x18) == 0) {
                    method856(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field65[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method856(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field511 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1890.method1654(Statics.field863, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class38.method595(var14).field895;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field318[Statics.field863].field3140;
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
                        field495[field511] = Statics.field174[var15];
                        field338[field511] = var16;
                        field494[field511] = var17;
                        field511++;
                    }
                }
            }
        }
        Statics.field999.method1446();
    }

    @ObfuscatedName("ay.bb(IIIIIS)V")
    public static final void method856(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1890.method1629(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1890.method1760(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1604.field1337;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class38 var13 = class38.method595(var12);
            if (var13.field896 == -1) {
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
                class76 var14 = Statics.field2182[var13.field896];
                if (var14 != null) {
                    int var15 = (var13.field882 * 4 - var14.field1351) / 2;
                    int var16 = (var13.field905 * 4 - var14.field1352) / 2;
                    var14.method1595(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field905) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1890.method1653(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1890.method1760(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class38 var22 = class38.method595(var21);
            if (var22.field896 != -1) {
                class76 var23 = Statics.field2182[var22.field896];
                if (var23 != null) {
                    int var24 = (var22.field882 * 4 - var23.field1351) / 2;
                    int var25 = (var22.field905 * 4 - var23.field1352) / 2;
                    var23.method1595(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field905) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1604.field1337;
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
        int var29 = Statics.field1890.method1654(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class38 var31 = class38.method595(var30);
        if (var31.field896 == -1) {
            return;
        }
        class76 var32 = Statics.field2182[var31.field896];
        if (var32 != null) {
            int var33 = (var31.field882 * 4 - var32.field1351) / 2;
            int var34 = (var31.field905 * 4 - var32.field1352) / 2;
            var32.method1595(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field905) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ai.bu(IIIIIIIIII)V")
    public static final void method847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field393.method3382(); var10 != null; var10 = (class16) field393.method3384()) {
            if (var10.field223 == arg0 && var10.field209 == arg1 && var10.field212 == arg2 && var10.field210 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field223 = arg0;
            var9.field210 = arg3;
            var9.field209 = arg1;
            var9.field212 = arg2;
            method852(var9);
            field393.method3377(var9);
        }
        var9.field216 = arg4;
        var9.field214 = arg5;
        var9.field217 = arg6;
        var9.field219 = arg7;
        var9.field220 = arg8;
    }

    @ObfuscatedName("h.bc(B)V")
    public static final void method34() {
        for (class16 var0 = (class16) field393.method3382(); var0 != null; var0 = (class16) field393.method3384()) {
            if (var0.field220 == -1) {
                var0.field219 = 0;
                method852(var0);
            } else {
                var0.method3474();
            }
        }
    }

    @ObfuscatedName("ai.ba(Lu;I)V")
    public static final void method852(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field210 == 0) {
            var1 = Statics.field1890.method1629(arg0.field223, arg0.field209, arg0.field212);
        }
        if (arg0.field210 == 1) {
            var1 = Statics.field1890.method1781(arg0.field223, arg0.field209, arg0.field212);
        }
        if (arg0.field210 == 2) {
            var1 = Statics.field1890.method1653(arg0.field223, arg0.field209, arg0.field212);
        }
        if (arg0.field210 == 3) {
            var1 = Statics.field1890.method1654(arg0.field223, arg0.field209, arg0.field212);
        }
        if (var1 != 0) {
            int var5 = Statics.field1890.method1760(arg0.field223, arg0.field209, arg0.field212, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field221 = var2;
        arg0.field215 = var3;
        arg0.field226 = var4;
    }

    @ObfuscatedName("y.bd(IIIIIIII)V")
    public static final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field263 && Statics.field863 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1890.method1629(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1890.method1781(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1890.method1653(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1890.method1654(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1890.method1760(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1890.method1642(arg0, arg2, arg3);
                class38 var15 = class38.method595(var12);
                if (var15.field884 != 0) {
                    field318[arg0].method3745(arg2, arg3, var13, var14, var15.field908);
                }
            }
            if (arg1 == 1) {
                Statics.field1890.method1643(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1890.method1644(arg0, arg2, arg3);
                class38 var16 = class38.method595(var12);
                if (var16.field882 + arg2 > 103 || var16.field882 + arg3 > 103 || var16.field905 + arg2 > 103 || var16.field905 + arg3 > 103) {
                    return;
                }
                if (var16.field884 != 0) {
                    field318[arg0].method3739(arg2, arg3, var16.field882, var16.field905, var14, var16.field908);
                }
            }
            if (arg1 == 3) {
                Statics.field1890.method1690(arg0, arg2, arg3);
                class38 var17 = class38.method595(var12);
                if (var17.field884 == 1) {
                    field318[arg0].method3748(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field65[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class81 var19 = Statics.field1890;
        class220 var20 = field318[arg0];
        class38 var21 = class38.method595(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field905;
            var23 = var21.field882;
        } else {
            var22 = var21.field882;
            var23 = var21.field905;
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
        int[][] var28 = class6.field83[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field916 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field907 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class80 var34;
            if (var21.field890 == -1 && var21.field889 == null) {
                var34 = var21.method681(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class12(arg4, 22, arg5, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1652(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field884 == 1) {
                var20.method3743(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class80 var57;
            if (var21.field890 == -1 && var21.field889 == null) {
                var57 = var21.method681(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class12(arg4, 10, arg5, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            if (var57 != null) {
                var19.method1730(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field884 != 0) {
                var20.method3741(arg2, arg3, var22, var23, var21.field908);
            }
        } else if (arg6 >= 12) {
            class80 var35;
            if (var21.field890 == -1 && var21.field889 == null) {
                var35 = var21.method681(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1730(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field884 != 0) {
                var20.method3741(arg2, arg3, var22, var23, var21.field908);
            }
        } else if (arg6 == 0) {
            class80 var36;
            if (var21.field890 == -1 && var21.field889 == null) {
                var36 = var21.method681(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class12(arg4, 0, arg5, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1633(arg0, arg2, arg3, var29, var36, (class80) null, class6.field73[arg5], 0, var32, var33);
            if (var21.field884 != 0) {
                var20.method3740(arg2, arg3, arg6, arg5, var21.field908);
            }
        } else if (arg6 == 1) {
            class80 var37;
            if (var21.field890 == -1 && var21.field889 == null) {
                var37 = var21.method681(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class12(arg4, 1, arg5, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1633(arg0, arg2, arg3, var29, var37, (class80) null, class6.field79[arg5], 0, var32, var33);
            if (var21.field884 != 0) {
                var20.method3740(arg2, arg3, arg6, arg5, var21.field908);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class80 var39;
            class80 var40;
            if (var21.field890 == -1 && var21.field889 == null) {
                var39 = var21.method681(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method681(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class12(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field890, true, (class80) null);
                var40 = new class12(arg4, 2, var38, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1633(arg0, arg2, arg3, var29, var39, var40, class6.field73[arg5], class6.field73[var38], var32, var33);
            if (var21.field884 != 0) {
                var20.method3740(arg2, arg3, arg6, arg5, var21.field908);
            }
        } else if (arg6 == 3) {
            class80 var41;
            if (var21.field890 == -1 && var21.field889 == null) {
                var41 = var21.method681(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class12(arg4, 3, arg5, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1633(arg0, arg2, arg3, var29, var41, (class80) null, class6.field79[arg5], 0, var32, var33);
            if (var21.field884 != 0) {
                var20.method3740(arg2, arg3, arg6, arg5, var21.field908);
            }
        } else if (arg6 == 9) {
            class80 var42;
            if (var21.field890 == -1 && var21.field889 == null) {
                var42 = var21.method681(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1730(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field884 != 0) {
                var20.method3741(arg2, arg3, var22, var23, var21.field908);
            }
        } else if (arg6 == 4) {
            class80 var43;
            if (var21.field890 == -1 && var21.field889 == null) {
                var43 = var21.method681(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1743(arg0, arg2, arg3, var29, var43, (class80) null, class6.field73[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1629(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class38.method595(var45 >> 14 & 0x7FFF).field886;
            }
            class80 var46;
            if (var21.field890 == -1 && var21.field889 == null) {
                var46 = var21.method681(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1743(arg0, arg2, arg3, var29, var46, (class80) null, class6.field73[arg5], 0, class6.field75[arg5] * var44, class6.field76[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1629(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class38.method595(var48 >> 14 & 0x7FFF).field886 / 2;
            }
            class80 var49;
            if (var21.field890 == -1 && var21.field889 == null) {
                var49 = var21.method681(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1743(arg0, arg2, arg3, var29, var49, (class80) null, 256, arg5, class6.field77[arg5] * var47, class6.field78[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class80 var51;
            if (var21.field890 == -1 && var21.field889 == null) {
                var51 = var21.method681(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class12(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1743(arg0, arg2, arg3, var29, var51, (class80) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1629(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class38.method595(var53 >> 14 & 0x7FFF).field886 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class80 var55;
            class80 var56;
            if (var21.field890 == -1 && var21.field889 == null) {
                var55 = var21.method681(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method681(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field890, true, (class80) null);
                var56 = new class12(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field890, true, (class80) null);
            }
            var19.method1743(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field77[arg5] * var52, class6.field78[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ae.bn(IIB)V")
    public static final void method1068(int arg0, int arg1) {
        class190 var2 = field465[Statics.field863][arg0][arg1];
        if (var2 == null) {
            Statics.field1890.method1646(Statics.field863, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class27 var5 = null;
        for (class27 var6 = (class27) var2.method3382(); var6 != null; var6 = (class27) var2.method3384()) {
            class47 var7 = class47.method496(var6.field647);
            long var8 = (long) var7.field1054;
            if (var7.field1076 == 1) {
                var8 = (long) (var6.field646 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1890.method1646(Statics.field863, arg0, arg1);
            return;
        }
        var2.method3378(var5);
        class27 var10 = null;
        class27 var11 = null;
        for (class27 var12 = (class27) var2.method3382(); var12 != null; var12 = (class27) var2.method3384()) {
            if (var5.field647 != var12.field647) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field647 != var12.field647 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1890.method1632(Statics.field863, arg0, arg1, method125(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field863), var5, var13, var10, var11);
    }

    @ObfuscatedName("cr.bm(I)V")
    public static final void method1991() {
        int var0 = field301.method2421(8);
        if (var0 < field317) {
            for (int var1 = var0; var1 < field317; var1++) {
                field386[++field305 - 1] = field379[var1];
            }
        }
        if (var0 > field317) {
            throw new RuntimeException("");
        }
        field317 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field379[var2];
            class3 var4 = field262[var3];
            int var5 = field301.method2421(1);
            if (var5 == 0) {
                field379[++field317 - 1] = var3;
                var4.field796 = field268;
            } else {
                int var6 = field301.method2421(2);
                if (var6 == 0) {
                    field379[++field317 - 1] = var3;
                    var4.field796 = field268;
                    field381[++field380 - 1] = var3;
                } else if (var6 == 1) {
                    field379[++field317 - 1] = var3;
                    var4.field796 = field268;
                    int var7 = field301.method2421(3);
                    var4.method622(var7, false);
                    int var8 = field301.method2421(1);
                    if (var8 == 1) {
                        field381[++field380 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field379[++field317 - 1] = var3;
                    var4.field796 = field268;
                    int var9 = field301.method2421(3);
                    var4.method622(var9, true);
                    int var10 = field301.method2421(3);
                    var4.method622(var10, true);
                    int var11 = field301.method2421(1);
                    if (var11 == 1) {
                        field381[++field380 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field386[++field305 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ap.bp(ZI)V")
    public static final void method603(boolean arg0) {
        field305 = 0;
        field380 = 0;
        field301.method2403();
        int var1 = field301.method2421(8);
        if (var1 < field296) {
            for (int var2 = var1; var2 < field296; var2++) {
                field386[++field305 - 1] = field297[var2];
            }
        }
        if (var1 > field296) {
            throw new RuntimeException("");
        }
        field296 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field297[var3];
            class32 var5 = field536[var4];
            int var6 = field301.method2421(1);
            if (var6 == 0) {
                field297[++field296 - 1] = var4;
                var5.field796 = field268;
            } else {
                int var7 = field301.method2421(2);
                if (var7 == 0) {
                    field297[++field296 - 1] = var4;
                    var5.field796 = field268;
                    field381[++field380 - 1] = var4;
                } else if (var7 == 1) {
                    field297[++field296 - 1] = var4;
                    var5.field796 = field268;
                    int var8 = field301.method2421(3);
                    var5.method622(var8, false);
                    int var9 = field301.method2421(1);
                    if (var9 == 1) {
                        field381[++field380 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field297[++field296 - 1] = var4;
                    var5.field796 = field268;
                    int var10 = field301.method2421(3);
                    var5.method622(var10, true);
                    int var11 = field301.method2421(3);
                    var5.method622(var11, true);
                    int var12 = field301.method2421(1);
                    if (var12 == 1) {
                        field381[++field380 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field386[++field305 - 1] = var4;
                }
            }
        }
        method2075(arg0);
        method3029();
        for (int var13 = 0; var13 < field305; var13++) {
            int var14 = field386[var13];
            if (field268 != field536[var14].field796) {
                field536[var14].field725 = null;
                field536[var14] = null;
            }
        }
        if (field284 != field301.field1888) {
            throw new RuntimeException(field301.field1888 + class2.field15 + field284);
        }
        for (int var15 = 0; var15 < field296; var15++) {
            if (field536[field297[var15]] == null) {
                throw new RuntimeException(var15 + class2.field15 + field296);
            }
        }
    }

    @ObfuscatedName("ca.bq(ZI)V")
    public static final void method2075(boolean arg0) {
        while (true) {
            if (field301.method2407(field284) >= 27) {
                int var1 = field301.method2421(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field536[var1] == null) {
                        field536[var1] = new class32();
                        var2 = true;
                    }
                    class32 var3 = field536[var1];
                    field297[++field296 - 1] = var1;
                    var3.field796 = field268;
                    int var4 = field301.method2421(1);
                    if (var4 == 1) {
                        field381[++field380 - 1] = var1;
                    }
                    int var5;
                    if (arg0) {
                        var5 = field301.method2421(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field301.method2421(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6;
                    if (arg0) {
                        var6 = field301.method2421(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field301.method2421(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field301.method2421(1);
                    var3.field725 = class37.method2077(field301.method2421(14));
                    int var8 = field390[field301.method2421(3)];
                    if (var2) {
                        var3.field806 = var3.field768 = var8;
                    }
                    var3.field760 = var3.field725.field830;
                    var3.field785 = var3.field725.field853;
                    if (var3.field785 == 0) {
                        var3.field768 = 0;
                    }
                    var3.field764 = var3.field725.field845;
                    var3.field765 = var3.field725.field837;
                    var3.field812 = var3.field725.field838;
                    var3.field805 = var3.field725.field839;
                    var3.field761 = var3.field725.field855;
                    var3.field762 = var3.field725.field834;
                    var3.field815 = var3.field725.field835;
                    var3.method621(Statics.field633.field810[0] + var5, Statics.field633.field811[0] + var6, var7 == 1);
                    continue;
                }
            }
            field301.method2406();
            return;
        }
    }

    @ObfuscatedName("fq.bf(B)V")
    public static final void method3029() {
        for (int var0 = 0; var0 < field380; var0++) {
            int var1 = field381[var0];
            class32 var2 = field536[var1];
            int var3 = field301.method2155();
            if ((var3 & 0x1) != 0) {
                int var4 = field301.method2155();
                int var5 = field301.method2183();
                var2.method628(var4, var5, field268);
                var2.field778 = field268 + 300;
                var2.field779 = field301.method2189();
                var2.field790 = field301.method2156();
            }
            if ((var3 & 0x40) != 0) {
                var2.field789 = field301.method2157();
                if (var2.field789 == 65535) {
                    var2.field789 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field767 = field301.method2348();
                int var6 = field301.method2199();
                var2.field756 = var6 >> 16;
                var2.field795 = (var6 & 0xFFFF) + field268;
                var2.field759 = 0;
                var2.field794 = 0;
                if (var2.field795 > field268) {
                    var2.field759 = -1;
                }
                if (var2.field767 == 65535) {
                    var2.field767 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field769 = field301.method2163();
                var2.field781 = 100;
            }
            if ((var3 & 0x2) != 0) {
                var2.field782 = field301.method2348();
                var2.field783 = field301.method2157();
            }
            if ((var3 & 0x10) != 0) {
                var2.field725 = class37.method2077(field301.method2189());
                var2.field760 = var2.field725.field830;
                var2.field785 = var2.field725.field853;
                var2.field764 = var2.field725.field845;
                var2.field765 = var2.field725.field837;
                var2.field812 = var2.field725.field838;
                var2.field805 = var2.field725.field839;
                var2.field761 = var2.field725.field855;
                var2.field762 = var2.field725.field834;
                var2.field815 = var2.field725.field835;
            }
            if ((var3 & 0x8) != 0) {
                int var7 = field301.method2157();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field301.method2182();
                if (var2.field787 == var7 && var7 != -1) {
                    int var9 = class40.method122(var7).field949;
                    if (var9 == 1) {
                        var2.field788 = 0;
                        var2.field793 = 0;
                        var2.field792 = var8;
                        var2.field791 = 0;
                    }
                    if (var9 == 2) {
                        var2.field791 = 0;
                    }
                } else if (var7 == -1 || var2.field787 == -1 || class40.method122(var7).field945 >= class40.method122(var2.field787).field945) {
                    var2.field787 = var7;
                    var2.field788 = 0;
                    var2.field793 = 0;
                    var2.field792 = var8;
                    var2.field791 = 0;
                    var2.field814 = var2.field809;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var10 = field301.method2268();
                int var11 = field301.method2155();
                var2.method628(var10, var11, field268);
                var2.field778 = field268 + 300;
                var2.field779 = field301.method2157();
                var2.field790 = field301.method2348();
            }
        }
    }

    @ObfuscatedName("e.be(III)V")
    public static final void method30(int arg0, int arg1) {
        if (field401 < 2 && field412 == 0 && !field408) {
            return;
        }
        String var2;
        if (field412 == 1 && field401 < 2) {
            var2 = class148.field2352 + class148.field2267 + field283 + " " + class2.field19;
        } else if (field408 && field401 < 2) {
            var2 = field418 + class148.field2267 + field352 + " " + class2.field19;
        } else {
            int var3 = field401 - 1;
            String var4;
            if (field407[var3].length() > 0) {
                var4 = field406[var3] + class148.field2267 + field407[var3];
            } else {
                var4 = field406[var3];
            }
            var2 = var4;
        }
        if (field401 > 2) {
            var2 = var2 + class2.method2712(16777215) + " " + '/' + " " + (field401 - 2) + class148.field2362;
        }
        Statics.field2863.method3638(var2, arg0 + 4, arg1 + 15, 16777215, 0, field268 / 1000);
    }

    @ObfuscatedName("u.bo(I)V")
    public static final void method156() {
        int var0 = Statics.field104;
        int var1 = Statics.field235;
        int var2 = Statics.field1488;
        int var3 = Statics.field715;
        int var4 = 6116423;
        class75.method1567(var0, var1, var2, var3, var4);
        class75.method1567(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class75.method1543(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field2863.method3592(class148.field2355, var0 + 3, var1 + 14, var4, -1);
        int var5 = class132.field2037;
        int var6 = class132.field2038;
        for (int var7 = 0; var7 < field401; var7++) {
            int var8 = (field401 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class215 var10 = Statics.field2863;
            String var11;
            if (field407[var7].length() > 0) {
                var11 = field406[var7] + class148.field2267 + field407[var7];
            } else {
                var11 = field406[var7];
            }
            var10.method3592(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field104;
        int var13 = Statics.field235;
        int var14 = Statics.field1488;
        int var15 = Statics.field715;
        for (int var16 = 0; var16 < field397; var16++) {
            if (field472[var16] + field372[var16] > var12 && field372[var16] < var12 + var14 && field471[var16] + field261[var16] > var13 && field471[var16] < var13 + var15) {
                field468[var16] = true;
            }
        }
    }

    @ObfuscatedName("r.bv(IIIIB)V")
    public static final void method563(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field397; var4++) {
            if (field472[var4] + field372[var4] > arg0 && field372[var4] < arg0 + arg2 && field471[var4] + field261[var4] > arg1 && field471[var4] < arg1 + arg3) {
                field467[var4] = true;
            }
        }
    }

    @ObfuscatedName("w.bx(B)V")
    public static final void method9() {
        Statics.method2359();
        if (Statics.field540 != null || field433 != null) {
            return;
        }
        int var18;
        int var19;
        label228: {
            int var0 = class132.field2043;
            if (field400) {
                if (var0 != 1 && (Statics.field121 || var0 != 4)) {
                    int var1 = class132.field2037;
                    int var2 = class132.field2038;
                    if (var1 < Statics.field104 - 10 || var1 > Statics.field1488 + Statics.field104 + 10 || var2 < Statics.field235 - 10 || var2 > Statics.field715 + Statics.field235 + 10) {
                        field400 = false;
                        method563(Statics.field104, Statics.field235, Statics.field1488, Statics.field715);
                    }
                }
                if (var0 == 1 || !Statics.field121 && var0 == 4) {
                    int var3 = Statics.field104;
                    int var4 = Statics.field235;
                    int var5 = Statics.field1488;
                    int var6 = class132.field2034;
                    int var7 = class132.field2045;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field401; var9++) {
                        int var10 = (field401 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1 && var8 >= 0) {
                        int var11 = field299[var8];
                        int var12 = field403[var8];
                        int var13 = field440[var8];
                        int var14 = field405[var8];
                        String var15 = field406[var8];
                        String var16 = field407[var8];
                        method597(var11, var12, var13, var14, var15, var16, class132.field2034, class132.field2045);
                    }
                    field400 = false;
                    method563(Statics.field104, Statics.field235, Statics.field1488, Statics.field715);
                }
            } else {
                if ((var0 == 1 || !Statics.field121 && var0 == 4) && field401 > 0) {
                    int var17 = field440[field401 - 1];
                    if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                        var18 = field299[field401 - 1];
                        var19 = field403[field401 - 1];
                        class164 var20 = class164.method2517(var19);
                        if (class169.method1799(method573(var20))) {
                            break label228;
                        }
                        int var21 = method573(var20);
                        boolean var22 = (var21 >> 29 & 0x1) != 0;
                        if (var22) {
                            break label228;
                        }
                    }
                }
                if (var0 == 1 || !Statics.field121 && var0 == 4) {
                    label235: {
                        if (field399 != 1 || field401 <= 2) {
                            int var28 = field401 - 1;
                            boolean var29;
                            if (var28 < 0) {
                                var29 = false;
                            } else {
                                int var30 = field440[var28];
                                if (var30 >= 2000) {
                                    var30 -= 2000;
                                }
                                if (var30 == 1007) {
                                    var29 = true;
                                } else {
                                    var29 = false;
                                }
                            }
                            if (!var29) {
                                break label235;
                            }
                        }
                        var0 = 2;
                    }
                }
                if ((var0 == 1 || !Statics.field121 && var0 == 4) && field401 > 0) {
                    int var31 = field401 - 1;
                    if (var31 >= 0) {
                        int var32 = field299[var31];
                        int var33 = field403[var31];
                        int var34 = field440[var31];
                        int var35 = field405[var31];
                        String var36 = field406[var31];
                        String var37 = field407[var31];
                        method597(var32, var33, var34, var35, var36, var37, class132.field2034, class132.field2045);
                    }
                }
                if (var0 == 2 && field401 > 0) {
                    method2586(class132.field2034, class132.field2045);
                }
            }
            return;
        }
        if (Statics.field540 != null && !field374 && field399 != 1) {
            int var23 = field401 - 1;
            boolean var24;
            if (var23 < 0) {
                var24 = false;
            } else {
                int var25 = field440[var23];
                if (var25 >= 2000) {
                    var25 -= 2000;
                }
                if (var25 == 1007) {
                    var24 = true;
                } else {
                    var24 = false;
                }
            }
            if (!var24 && field401 > 0) {
                int var26 = field371;
                int var27 = field363;
                method565(Statics.field207, var26, var27);
                Statics.field207 = null;
            }
        }
        field374 = false;
        field375 = 0;
        if (Statics.field540 != null) {
            method2103(Statics.field540);
        }
        Statics.field540 = class164.method2517(var19);
        field370 = var18;
        field371 = class132.field2034;
        field363 = class132.field2045;
        if (field401 > 0) {
            method2467(field401 - 1);
        }
        method2103(Statics.field540);
    }

    @ObfuscatedName("dg.bs(III)V")
    public static final void method2586(int arg0, int arg1) {
        int var2 = Statics.field2863.method3674(class148.field2355);
        for (int var3 = 0; var3 < field401; var3++) {
            class215 var4 = Statics.field2863;
            String var5;
            if (field407[var3].length() > 0) {
                var5 = field406[var3] + class148.field2267 + field407[var3];
            } else {
                var5 = field406[var3];
            }
            int var6 = var4.method3674(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field401 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1984) {
            var8 = Statics.field1984 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1384) {
            var9 = Statics.field1384 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field400 = true;
        Statics.field104 = var8;
        Statics.field235 = var9;
        Statics.field1488 = var2;
        Statics.field715 = field401 * 15 + 22;
    }

    @ObfuscatedName("at.bl(Lar;III)V")
    public static final void method565(class29 arg0, int arg1, int arg2) {
        method597(arg0.field676, arg0.field674, arg0.field678, arg0.field680, arg0.field677, arg0.field677, arg1, arg2);
    }

    @ObfuscatedName("as.bz(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method597(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 21) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(0);
            field521.method2322(arg3);
            field521.method2178(class129.field2010[82] ? 1 : 0);
            field521.method2187(Statics.field311 + arg1);
            field521.method2186(Statics.field1903 + arg0);
        }
        if (arg2 == 15) {
            class3 var8 = field262[arg3];
            if (var8 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(196);
                field521.method2141(field502);
                field521.method2178(class129.field2010[82] ? 1 : 0);
                field521.method2187(arg3);
                field521.method2194(Statics.field2061);
            }
        }
        if (arg2 == 47) {
            class3 var9 = field262[arg3];
            if (var9 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(247);
                field521.method2140(class129.field2010[82] ? 1 : 0);
                field521.method2322(arg3);
            }
        }
        if (arg2 == 49) {
            class3 var10 = field262[arg3];
            if (var10 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(230);
                field521.method2187(arg3);
                field521.method2140(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 45) {
            class3 var11 = field262[arg3];
            if (var11 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(213);
                field521.method2299(class129.field2010[82] ? 1 : 0);
                field521.method2141(arg3);
            }
        }
        if (arg2 == 30 && field276 == null) {
            field521.method2402(248);
            field521.method2141(arg0);
            field521.method2331(arg1);
            field276 = class164.method1360(arg1, arg0);
            method2103(field276);
        }
        if (arg2 == 14) {
            class3 var12 = field262[arg3];
            if (var12 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(140);
                field521.method2322(Statics.field1958);
                field521.method2234(Statics.field413);
                field521.method2141(arg3);
                field521.method2187(Statics.field158);
                field521.method2180(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(102);
            field521.method2140(class129.field2010[82] ? 1 : 0);
            field521.method2186(Statics.field311 + arg1);
            field521.method2186(Statics.field1903 + arg0);
            field521.method2186(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 13) {
            class32 var13 = field536[arg3];
            if (var13 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(34);
                field521.method2322(arg3);
                field521.method2178(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class164 var14 = class164.method2517(arg1);
            if (var14 == null || var14.field2768[arg0] < 100000) {
                field521.method2402(162);
                field521.method2187(arg3);
            } else {
                class11.method582(27, "", var14.field2768[arg0] + " x " + class47.method496(arg3).field1037);
            }
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 43) {
            field521.method2402(100);
            field521.method2322(arg3);
            field521.method2322(arg0);
            field521.method2331(arg1);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 18) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(43);
            field521.method2322(Statics.field311 + arg1);
            field521.method2322(arg3);
            field521.method2180(class129.field2010[82] ? 1 : 0);
            field521.method2187(Statics.field1903 + arg0);
        }
        if (arg2 == 4) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(120);
            field521.method2322(Statics.field1903 + arg0);
            field521.method2187(arg3 >> 14 & 0x7FFF);
            field521.method2140(class129.field2010[82] ? 1 : 0);
            field521.method2322(Statics.field311 + arg1);
        }
        if (arg2 == 44) {
            class3 var15 = field262[arg3];
            if (var15 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(110);
                field521.method2141(arg3);
                field521.method2140(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method2089();
            class164 var16 = class164.method2517(arg1);
            field412 = 1;
            Statics.field1958 = arg0;
            Statics.field413 = arg1;
            Statics.field158 = arg3;
            method2103(var16);
            field283 = class2.method2712(16748608) + class47.method496(arg3).field1037 + class2.method2712(16777215);
            if (field283 == null) {
                field283 = "null";
            }
            return;
        }
        if (arg2 == 37) {
            field521.method2402(123);
            field521.method2141(arg0);
            field521.method2186(arg3);
            field521.method2194(arg1);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 34) {
            field521.method2402(19);
            field521.method2143(arg1);
            field521.method2322(arg0);
            field521.method2322(arg3);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 22) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(222);
            field521.method2140(class129.field2010[82] ? 1 : 0);
            field521.method2141(arg3);
            field521.method2187(Statics.field311 + arg1);
            field521.method2141(Statics.field1903 + arg0);
        }
        if (arg2 == 1001) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(35);
            field521.method2322(Statics.field1903 + arg0);
            field521.method2140(class129.field2010[82] ? 1 : 0);
            field521.method2141(arg3 >> 14 & 0x7FFF);
            field521.method2141(Statics.field311 + arg1);
        }
        if (arg2 == 12) {
            class32 var17 = field536[arg3];
            if (var17 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(157);
                field521.method2140(class129.field2010[82] ? 1 : 0);
                field521.method2186(arg3);
            }
        }
        if (arg2 == 40) {
            field521.method2402(126);
            field521.method2186(arg0);
            field521.method2331(arg1);
            field521.method2141(arg3);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 11) {
            class32 var18 = field536[arg3];
            if (var18 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(246);
                field521.method2299(class129.field2010[82] ? 1 : 0);
                field521.method2186(arg3);
            }
        }
        if (arg2 == 58) {
            class164 var19 = class164.method1360(arg1, arg0);
            if (var19 != null) {
                field521.method2402(241);
                field521.method2194(arg1);
                field521.method2143(Statics.field2061);
                field521.method2186(var19.field2685);
                field521.method2141(arg0);
                field521.method2186(field417);
                field521.method2186(field502);
            }
        }
        if (arg2 == 23) {
            Statics.field1890.method1756(Statics.field863, arg0, arg1);
        }
        if (arg2 == 36) {
            field521.method2402(195);
            field521.method2143(arg1);
            field521.method2141(arg0);
            field521.method2186(arg3);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 3) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(80);
            field521.method2186(Statics.field1903 + arg0);
            field521.method2299(class129.field2010[82] ? 1 : 0);
            field521.method2141(Statics.field311 + arg1);
            field521.method2186(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1004) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field521.method2402(162);
            field521.method2187(arg3);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class164 var20 = class164.method1360(arg1, arg0);
            if (var20 != null) {
                method793(arg3, arg1, arg0, var20.field2685, arg5);
            }
        }
        if (arg2 == 39) {
            field521.method2402(30);
            field521.method2143(arg1);
            field521.method2187(arg0);
            field521.method2186(arg3);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 7) {
            class32 var21 = field536[arg3];
            if (var21 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(199);
                field521.method2194(Statics.field413);
                field521.method2140(class129.field2010[82] ? 1 : 0);
                field521.method2141(arg3);
                field521.method2141(Statics.field158);
                field521.method2141(Statics.field1958);
            }
        }
        if (arg2 == 10) {
            class32 var22 = field536[arg3];
            if (var22 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(121);
                field521.method2141(arg3);
                field521.method2178(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 24) {
            class164 var23 = class164.method2517(arg1);
            boolean var24 = true;
            if (var23.field2655 > 0) {
                var24 = method1431(var23);
            }
            if (var24) {
                field521.method2402(149);
                field521.method2143(arg1);
            }
        }
        if (arg2 == 1003) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            class32 var25 = field536[arg3];
            if (var25 != null) {
                class37 var26 = var25.field725;
                if (var26.field854 != null) {
                    var26 = var26.method671();
                }
                if (var26 != null) {
                    field521.method2402(26);
                    field521.method2187(var26.field828);
                }
            }
        }
        if (arg2 == 1) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(150);
            field521.method2186(Statics.field1958);
            field521.method2186(arg3 >> 14 & 0x7FFF);
            field521.method2186(Statics.field158);
            field521.method2186(Statics.field311 + arg1);
            field521.method2180(class129.field2010[82] ? 1 : 0);
            field521.method2143(Statics.field413);
            field521.method2141(Statics.field1903 + arg0);
        }
        if (arg2 == 46) {
            class3 var27 = field262[arg3];
            if (var27 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(179);
                field521.method2178(class129.field2010[82] ? 1 : 0);
                field521.method2187(arg3);
            }
        }
        if (arg2 == 8) {
            class32 var28 = field536[arg3];
            if (var28 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(53);
                field521.method2180(class129.field2010[82] ? 1 : 0);
                field521.method2143(Statics.field2061);
                field521.method2141(arg3);
                field521.method2187(field502);
            }
        }
        if (arg2 == 48) {
            class3 var29 = field262[arg3];
            if (var29 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(153);
                field521.method2322(arg3);
                field521.method2180(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(56);
            field521.method2186(Statics.field1958);
            field521.method2140(class129.field2010[82] ? 1 : 0);
            field521.method2141(Statics.field158);
            field521.method2194(Statics.field413);
            field521.method2186(Statics.field311 + arg1);
            field521.method2187(Statics.field1903 + arg0);
            field521.method2187(arg3);
        }
        if (arg2 == 29) {
            field521.method2402(149);
            field521.method2143(arg1);
            class164 var30 = class164.method2517(arg1);
            if (var30.field2641 != null && var30.field2641[0][0] == 5) {
                int var31 = var30.field2641[0][1];
                if (class167.field2805[var31] != var30.field2763[0]) {
                    class167.field2805[var31] = var30.field2763[0];
                    method157(var31);
                }
            }
        }
        if (arg2 == 25) {
            class164 var32 = class164.method1360(arg1, arg0);
            if (var32 != null) {
                method2089();
                int var33 = method573(var32);
                int var34 = var33 >> 11 & 0x3F;
                int var36 = var32.field2685;
                class164 var37 = class164.method1360(arg1, arg0);
                if (var37 != null && var37.field2740 != null) {
                    class1 var38 = new class1();
                    var38.field3 = var37;
                    var38.field7 = var37.field2740;
                    class34.method613(var38);
                }
                field417 = var36;
                field408 = true;
                Statics.field2061 = arg1;
                field502 = arg0;
                Statics.field1848 = var34;
                method2103(var37);
                field412 = 0;
                int var39 = method573(var32);
                int var40 = var39 >> 11 & 0x3F;
                String var41;
                if (var40 == 0) {
                    var41 = null;
                } else if (var32.field2728 == null || var32.field2728.trim().length() == 0) {
                    var41 = null;
                } else {
                    var41 = var32.field2728;
                }
                field418 = var41;
                if (field418 == null) {
                    field418 = "Null";
                }
                if (var32.field2777) {
                    field352 = var32.field2722 + class2.method2712(16777215);
                } else {
                    field352 = class2.method2712(65280) + var32.field2765 + class2.method2712(16777215);
                }
            }
            return;
        }
        if (arg2 == 17) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(106);
            field521.method2180(class129.field2010[82] ? 1 : 0);
            field521.method2322(arg3);
            field521.method2322(Statics.field1903 + arg0);
            field521.method2141(Statics.field311 + arg1);
            field521.method2187(field502);
            field521.method2194(Statics.field2061);
        }
        if (arg2 == 31) {
            field521.method2402(94);
            field521.method2187(arg3);
            field521.method2186(arg0);
            field521.method2194(arg1);
            field521.method2143(Statics.field413);
            field521.method2187(Statics.field1958);
            field521.method2141(Statics.field158);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 9) {
            class32 var42 = field536[arg3];
            if (var42 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(51);
                field521.method2187(arg3);
                field521.method2180(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field521.method2402(149);
            field521.method2143(arg1);
            class164 var43 = class164.method2517(arg1);
            if (var43.field2641 != null && var43.field2641[0][0] == 5) {
                int var44 = var43.field2641[0][1];
                class167.field2805[var44] = 1 - class167.field2805[var44];
                method157(var44);
            }
        }
        if (arg2 == 42) {
            field521.method2402(4);
            field521.method2141(arg0);
            field521.method2194(arg1);
            field521.method2322(arg3);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 50) {
            class3 var45 = field262[arg3];
            if (var45 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(89);
                field521.method2322(arg3);
                field521.method2299(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var46 = field262[arg3];
            if (var46 != null) {
                field414 = arg6;
                field384 = arg7;
                field323 = 2;
                field366 = 0;
                field496 = arg0;
                field302 = arg1;
                field521.method2402(9);
                field521.method2141(arg3);
                field521.method2180(class129.field2010[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field521.method2402(164);
            field521.method2331(arg1);
            field521.method2322(arg3);
            field521.method2186(arg0);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 32) {
            field521.method2402(221);
            field521.method2187(arg3);
            field521.method2143(Statics.field2061);
            field521.method2187(field502);
            field521.method2234(arg1);
            field521.method2186(arg0);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 19) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(85);
            field521.method2187(Statics.field311 + arg1);
            field521.method2141(arg3);
            field521.method2141(Statics.field1903 + arg0);
            field521.method2180(class129.field2010[82] ? 1 : 0);
        }
        if (arg2 == 20) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(119);
            field521.method2186(Statics.field1903 + arg0);
            field521.method2322(Statics.field311 + arg1);
            field521.method2178(class129.field2010[82] ? 1 : 0);
            field521.method2186(arg3);
        }
        if (arg2 == 6) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(236);
            field521.method2322(Statics.field1903 + arg0);
            field521.method2178(class129.field2010[82] ? 1 : 0);
            field521.method2187(arg3 >> 14 & 0x7FFF);
            field521.method2141(Statics.field311 + arg1);
        }
        if (arg2 == 1002) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field521.method2402(49);
            field521.method2186(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 2) {
            field414 = arg6;
            field384 = arg7;
            field323 = 2;
            field366 = 0;
            field496 = arg0;
            field302 = arg1;
            field521.method2402(115);
            field521.method2234(Statics.field2061);
            field521.method2186(Statics.field311 + arg1);
            field521.method2178(class129.field2010[82] ? 1 : 0);
            field521.method2322(arg3 >> 14 & 0x7FFF);
            field521.method2141(field502);
            field521.method2187(Statics.field1903 + arg0);
        }
        if (arg2 == 33) {
            field521.method2402(109);
            field521.method2186(arg3);
            field521.method2141(arg0);
            field521.method2234(arg1);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 41) {
            field521.method2402(151);
            field521.method2322(arg3);
            field521.method2322(arg0);
            field521.method2331(arg1);
            field368 = 0;
            Statics.field969 = class164.method2517(arg1);
            field369 = arg0;
        }
        if (arg2 == 26) {
            method2821();
        }
        if (field412 != 0) {
            field412 = 0;
            method2103(class164.method2517(Statics.field413));
        }
        if (field408) {
            method2089();
        }
        if (Statics.field969 != null && field368 == 0) {
            method2103(Statics.field969);
        }
    }

    @ObfuscatedName("dd.bk(I)V")
    public static void method2089() {
        if (!field408) {
            return;
        }
        class164 var0 = class164.method1360(Statics.field2061, field502);
        if (var0 != null && var0.field2741 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field7 = var0.field2741;
            class34.method613(var1);
        }
        field408 = false;
        method2103(var0);
    }

    @ObfuscatedName("z.br(IIS)V")
    public static void method135(int arg0, int arg1) {
        field521.method2402(248);
        field521.method2141(arg1);
        field521.method2331(arg0);
    }

    @ObfuscatedName("af.by(IIIILjava/lang/String;B)V")
    public static void method793(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class164 var5 = class164.method1360(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2749 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field8 = arg0;
            var6.field9 = arg4;
            var6.field7 = var5.field2749;
            class34.method613(var6);
        }
        boolean var7 = true;
        if (var5.field2655 > 0) {
            var7 = method1431(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method573(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field521.method2402(209);
            field521.method2143(arg1);
            field521.method2322(arg2);
            field521.method2322(arg3);
        }
        if (arg0 == 2) {
            field521.method2402(91);
            field521.method2143(arg1);
            field521.method2322(arg2);
            field521.method2322(arg3);
        }
        if (arg0 == 3) {
            field521.method2402(156);
            field521.method2143(arg1);
            field521.method2322(arg2);
            field521.method2322(arg3);
        }
        if (arg0 == 4) {
            field521.method2402(145);
            field521.method2143(arg1);
            field521.method2322(arg2);
            field521.method2322(arg3);
        }
        if (arg0 == 5) {
            field521.method2402(142);
            field521.method2143(arg1);
            field521.method2322(arg2);
            field521.method2322(arg3);
        }
        if (arg0 == 6) {
            field521.method2402(173);
            field521.method2143(arg1);
            field521.method2322(arg2);
            field521.method2322(arg3);
        }
        if (arg0 == 7) {
            field521.method2402(178);
            field521.method2143(arg1);
            field521.method2322(arg2);
            field521.method2322(arg3);
        }
        if (arg0 == 8) {
            field521.method2402(187);
            field521.method2143(arg1);
            field521.method2322(arg2);
            field521.method2322(arg3);
        }
        if (arg0 == 9) {
            field521.method2402(131);
            field521.method2143(arg1);
            field521.method2322(arg2);
            field521.method2322(arg3);
        }
        if (arg0 == 10) {
            field521.method2402(254);
            field521.method2143(arg1);
            field521.method2322(arg2);
            field521.method2322(arg3);
        }
    }

    @ObfuscatedName("ac.cu(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method773(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field400 || field401 >= 500) {
            return;
        }
        field406[field401] = arg0;
        field407[field401] = arg1;
        field440[field401] = arg2;
        field405[field401] = arg3;
        field299[field401] = arg4;
        field403[field401] = arg5;
        field401++;
    }

    @ObfuscatedName("s.cf(I)V")
    public static void method105() {
        for (int var0 = 0; var0 < field401; var0++) {
            if (method634(field440[var0])) {
                if (var0 < field401 - 1) {
                    for (int var1 = var0; var1 < field401 - 1; var1++) {
                        field406[var1] = field406[var1 + 1];
                        field407[var1] = field407[var1 + 1];
                        field440[var1] = field440[var1 + 1];
                        field405[var1] = field405[var1 + 1];
                        field299[var1] = field299[var1 + 1];
                        field403[var1] = field403[var1 + 1];
                    }
                }
                field401--;
            }
        }
    }

    @ObfuscatedName("au.co(IB)Z")
    public static boolean method634(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("h.cq(IIIII)V")
    public static final void method35(int arg0, int arg1, int arg2, int arg3) {
        if (field412 == 0 && !field408) {
            method773(class148.field2357, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class100.field1782; var6++) {
            int var7 = class100.field1783[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field1890.method1760(Statics.field863, var8, var9, var7) >= 0) {
                    class38 var12 = class38.method595(var11);
                    if (var12.field889 != null) {
                        var12 = var12.method684();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field412 == 1) {
                        method773(class148.field2352, field283 + " " + class2.field19 + " " + class2.method2712(65535) + var12.field877, 1, var7, var8, var9);
                    } else if (!field408) {
                        String[] var13 = var12.field883;
                        if (field292) {
                            var13 = method163(var13);
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
                                    method773(var13[var14], class2.method2712(65535) + var12.field877, var15, var7, var8, var9);
                                }
                            }
                        }
                        method773(class148.field2353, class2.method2712(65535) + var12.field877, 1002, var12.field887 << 14, var8, var9);
                    } else if ((Statics.field1848 & 0x4) == 4) {
                        method773(field418, field352 + " " + class2.field19 + " " + class2.method2712(65535) + var12.field877, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class32 var16 = field536[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field725.field830 == 1 && (var16.field777 & 0x7F) == 64 && (var16.field757 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field296; var17++) {
                            class32 var18 = field536[field297[var17]];
                            if (var18 != null && var16 != var18 && var18.field725.field830 == 1 && var16.field777 == var18.field777 && var16.field757 == var18.field757) {
                                method2787(var18.field725, field297[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field317; var19++) {
                            class3 var20 = field262[field379[var19]];
                            if (var20 != null && var16.field777 == var20.field777 && var16.field757 == var20.field757) {
                                Statics.method884(var20, field379[var19], var8, var9);
                            }
                        }
                    }
                    method2787(var16.field725, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field262[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field777 & 0x7F) == 64 && (var21.field757 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field296; var22++) {
                            class32 var23 = field536[field297[var22]];
                            if (var23 != null && var23.field725.field830 == 1 && var21.field777 == var23.field777 && var21.field757 == var23.field757) {
                                method2787(var23.field725, field297[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field317; var24++) {
                            class3 var25 = field262[field379[var24]];
                            if (var25 != null && var21 != var25 && var21.field777 == var25.field777 && var21.field757 == var25.field757) {
                                Statics.method884(var25, field379[var24], var8, var9);
                            }
                        }
                    }
                    if (field391 == var11) {
                        var4 = var7;
                    } else {
                        Statics.method884(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class190 var26 = field465[Statics.field863][var8][var9];
                    if (var26 != null) {
                        for (class27 var27 = (class27) var26.method3383(); var27 != null; var27 = (class27) var26.method3390()) {
                            class47 var28 = class47.method496(var27.field647);
                            if (field412 == 1) {
                                method773(class148.field2352, field283 + " " + class2.field19 + " " + class2.method2712(16748608) + var28.field1037, 16, var27.field647, var8, var9);
                            } else if (!field408) {
                                String[] var29 = var28.field1056;
                                if (field292) {
                                    var29 = method163(var29);
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
                                        method773(var29[var30], class2.method2712(16748608) + var28.field1037, var31, var27.field647, var8, var9);
                                    } else if (var30 == 2) {
                                        method773(class148.field2202, class2.method2712(16748608) + var28.field1037, 20, var27.field647, var8, var9);
                                    }
                                }
                                method773(class148.field2353, class2.method2712(16748608) + var28.field1037, 1004, var27.field647, var8, var9);
                            } else if ((Statics.field1848 & 0x1) == 1) {
                                method773(field418, field352 + " " + class2.field19 + " " + class2.method2712(16748608) + var28.field1037, 17, var27.field647, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field262[field391];
            Statics.method884(var34, field391, var32, var33);
        }
    }

    @ObfuscatedName("ea.cs(Lag;IIII)V")
    public static final void method2787(class37 arg0, int arg1, int arg2, int arg3) {
        if (field401 >= 400) {
            return;
        }
        if (arg0.field854 != null) {
            arg0 = arg0.method671();
        }
        if (arg0 == null || !arg0.field857 || arg0.field859 && field428 != arg1) {
            return;
        }
        String var4 = arg0.field861;
        if (arg0.field846 != 0) {
            var4 = var4 + method20(arg0.field846, Statics.field633.field32) + " " + class2.field17 + class148.field2358 + arg0.field846 + class2.field18;
        }
        if (field412 == 1) {
            method773(class148.field2352, field283 + " " + class2.field19 + " " + class2.method2712(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field408) {
            String[] var5 = arg0.field844;
            if (field292) {
                var5 = method163(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class148.field2402)) {
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
                        method773(var5[var6], class2.method2712(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class148.field2402)) {
                        short var9 = 0;
                        if (field437 == class19.field545 || field437 == class19.field541 && arg0.field846 > Statics.field633.field32) {
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
                        method773(var5[var8], class2.method2712(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method773(class148.field2353, class2.method2712(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1848 & 0x2) == 2) {
            method773(field418, field352 + " " + class2.field19 + " " + class2.method2712(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("i.cv(III)Ljava/lang/String;")
    public static final String method20(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2712(16711680);
        } else if (var2 < -6) {
            return class2.method2712(16723968);
        } else if (var2 < -3) {
            return class2.method2712(16740352);
        } else if (var2 < 0) {
            return class2.method2712(16756736);
        } else if (var2 > 9) {
            return class2.method2712(65280);
        } else if (var2 > 6) {
            return class2.method2712(4259584);
        } else if (var2 > 3) {
            return class2.method2712(8453888);
        } else if (var2 > 0) {
            return class2.method2712(12648192);
        } else {
            return class2.method2712(16776960);
        }
    }

    @ObfuscatedName("fj.cy(IIIIIIIII)V")
    public static final void method3031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class164.method2633(arg0)) {
            Statics.field85 = null;
            method488(Statics.field2642[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field85 != null) {
                method488(Statics.field85, -1412584499, arg1, arg2, arg3, arg4, Statics.field1932, Statics.field665, arg7);
                Statics.field85 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field467[var8] = true;
            }
        } else {
            field467[arg7] = true;
        }
    }

    @ObfuscatedName("o.cp([Lfq;IIIIIIIII)V")
    public static final void method488(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75.method1566(arg2, arg3, arg4, arg5);
        class86.method1806();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class164 var10 = arg0[var9];
            if (var10 != null && (var10.field2774 == arg1 || arg1 == -1412584499 && field433 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field372[field397] = var10.field2664 + arg6;
                    field471[field397] = var10.field2665 + arg7;
                    field472[field397] = var10.field2677;
                    field261[field397] = var10.field2667;
                    var11 = ++field397 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2773 = var11;
                var10.field2781 = field268;
                if (!var10.field2777 || !method3573(var10)) {
                    if (var10.field2655 > 0) {
                        int var12 = var10.field2655;
                        if (var12 == 324) {
                            if (field531 == -1) {
                                field531 = var10.field2684;
                                field537 = var10.field2744;
                            }
                            if (field535.field2821) {
                                var10.field2684 = field531;
                            } else {
                                var10.field2684 = field537;
                            }
                        } else if (var12 == 325) {
                            if (field531 == -1) {
                                field531 = var10.field2684;
                                field537 = var10.field2744;
                            }
                            if (field535.field2821) {
                                var10.field2684 = field537;
                            } else {
                                var10.field2684 = field531;
                            }
                        } else if (var12 == 327) {
                            var10.field2776 = 150;
                            var10.field2701 = (int) (Math.sin((double) field268 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2692 = 5;
                            var10.field2647 = 0;
                        } else if (var12 == 328) {
                            var10.field2776 = 150;
                            var10.field2701 = (int) (Math.sin((double) field268 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2692 = 5;
                            var10.field2647 = 1;
                        }
                    }
                    int var13 = var10.field2664 + arg6;
                    int var14 = var10.field2665 + arg7;
                    int var15 = var10.field2659;
                    if (field433 == var10) {
                        if (arg1 != -1412584499 && !var10.field2727) {
                            Statics.field85 = arg0;
                            Statics.field1932 = arg6;
                            Statics.field665 = arg7;
                            continue;
                        }
                        if (field344 && field438) {
                            int var16 = class132.field2037;
                            int var17 = class132.field2038;
                            int var18 = var16 - field435;
                            int var19 = var17 - field326;
                            if (var18 < field277) {
                                var18 = field277;
                            }
                            if (var10.field2677 + var18 > field277 + field434.field2677) {
                                var18 = field277 + field434.field2677 - var10.field2677;
                            }
                            if (var19 < field419) {
                                var19 = field419;
                            }
                            if (var10.field2667 + var19 > field419 + field434.field2667) {
                                var19 = field419 + field434.field2667 - var10.field2667;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2727) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2653 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2653 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2677 + var13;
                        int var27 = var10.field2667 + var14;
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
                        int var30 = var10.field2677 + var13;
                        int var31 = var10.field2667 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2777 || var20 < var22 && var21 < var23) {
                        if (var10.field2655 != 0) {
                            if (var10.field2655 == 1336) {
                                if (field294) {
                                    var14 += 15;
                                    Statics.field586.method3593("Fps:" + field2084, var10.field2677 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field263) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field263) {
                                        var34 = 16711680;
                                    }
                                    Statics.field586.method3593("Mem:" + var33 + "k", var10.field2677 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2655 == 1337) {
                                field457 = var13;
                                field402 = var14;
                                method508(var13, var14, var10.field2677, var10.field2667);
                                field467[var10.field2773] = true;
                                class75.method1566(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2655 == 1338) {
                                method28(var10, var13, var14, var11);
                                class75.method1566(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2655 == 1339) {
                                class166 var35 = var10.method2991();
                                if (var35 != null) {
                                    if (field523 < 3) {
                                        Statics.field2062.method1478(var13, var14, var35.field2791, var35.field2790, 25, 25, field342, 256, var35.field2792, var35.field2789);
                                    } else {
                                        class75.method1536(var13, var14, 0, var35.field2792, var35.field2789);
                                    }
                                }
                                class75.method1566(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2653 == 0) {
                            if (!var10.field2777 && method3573(var10) && Statics.field1564 != var10) {
                                continue;
                            }
                            if (!var10.field2777) {
                                if (var10.field2673 > var10.field2675 - var10.field2667) {
                                    var10.field2673 = var10.field2675 - var10.field2667;
                                }
                                if (var10.field2673 < 0) {
                                    var10.field2673 = 0;
                                }
                            }
                            method488(arg0, var10.field2651, var20, var21, var22, var23, var13 - var10.field2672, var14 - var10.field2673, var11);
                            if (var10.field2743 != null) {
                                method488(var10.field2743, var10.field2651, var20, var21, var22, var23, var13 - var10.field2672, var14 - var10.field2673, var11);
                            }
                            class4 var36 = (class4) field421.method3354((long) var10.field2651);
                            if (var36 != null) {
                                method3031(var36.field53, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class75.method1566(arg2, arg3, arg4, arg5);
                            class86.method1806();
                        }
                        if (field476 || field469[var11] || field474 > 1) {
                            if (var10.field2653 == 0 && !var10.field2777 && var10.field2675 > var10.field2667) {
                                int var37 = var10.field2677 + var13;
                                int var38 = var10.field2673;
                                int var39 = var10.field2667;
                                int var40 = var10.field2675;
                                Statics.field2170[0].method1595(var37, var14);
                                Statics.field2170[1].method1595(var37, var14 + var39 - 16);
                                class75.method1567(var37, var14 + 16, 16, var39 - 32, field503);
                                int var41 = (var39 - 32) * var39 / var40;
                                if (var41 < 8) {
                                    var41 = 8;
                                }
                                int var42 = (var39 - 32 - var41) * var38 / (var40 - var39);
                                class75.method1567(var37, var14 + 16 + var42, 16, var41, field336);
                                class75.method1547(var37, var14 + 16 + var42, var41, field444);
                                class75.method1547(var37 + 1, var14 + 16 + var42, var41, field444);
                                class75.method1545(var37, var14 + 16 + var42, 16, field444);
                                class75.method1545(var37, var14 + 17 + var42, 16, field444);
                                class75.method1547(var37 + 15, var14 + 16 + var42, var41, field337);
                                class75.method1547(var37 + 14, var14 + 17 + var42, var41 - 1, field337);
                                class75.method1545(var37, var14 + 15 + var42 + var41, 16, field337);
                                class75.method1545(var37 + 1, var14 + 14 + var42 + var41, 15, field337);
                            }
                            if (var10.field2653 != 1) {
                                if (var10.field2653 == 2) {
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < var10.field2682; var44++) {
                                        for (int var45 = 0; var45 < var10.field2662; var45++) {
                                            int var46 = (var10.field2715 + 32) * var45 + var13;
                                            int var47 = (var10.field2724 + 32) * var44 + var14;
                                            if (var43 < 20) {
                                                var46 += var10.field2669[var43];
                                                var47 += var10.field2663[var43];
                                            }
                                            if (var10.field2764[var43] > 0) {
                                                boolean var48 = false;
                                                boolean var49 = false;
                                                int var50 = var10.field2764[var43] - 1;
                                                if (var46 + 32 > arg2 && var46 < arg4 && var47 + 32 > arg3 && var47 < arg5 || Statics.field540 == var10 && field370 == var43) {
                                                    class74 var51;
                                                    if (field412 == 1 && Statics.field1958 == var43 && Statics.field413 == var10.field2651) {
                                                        var51 = class47.method1(var50, var10.field2768[var43], 2, 0, 2, false);
                                                    } else {
                                                        var51 = class47.method1(var50, var10.field2768[var43], 1, 3153952, 2, false);
                                                    }
                                                    if (var51 == null) {
                                                        method2103(var10);
                                                    } else if (Statics.field540 == var10 && field370 == var43) {
                                                        int var52 = class132.field2037 - field371;
                                                        int var53 = class132.field2038 - field363;
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (var53 < 5 && var53 > -5) {
                                                            var53 = 0;
                                                        }
                                                        if (field375 < 5) {
                                                            var52 = 0;
                                                            var53 = 0;
                                                        }
                                                        var51.method1522(var46 + var52, var47 + var53, 128);
                                                        if (arg1 != -1) {
                                                            class164 var54 = arg0[arg1 & 0xFFFF];
                                                            if (var47 + var53 < class75.field1343 && var54.field2673 > 0) {
                                                                int var55 = field334 * (class75.field1343 - var47 - var53) / 3;
                                                                if (var55 > field334 * 10) {
                                                                    var55 = field334 * 10;
                                                                }
                                                                if (var55 > var54.field2673) {
                                                                    var55 = var54.field2673;
                                                                }
                                                                var54.field2673 -= var55;
                                                                field363 += var55;
                                                                method2103(var54);
                                                            }
                                                            if (var47 + var53 + 32 > class75.field1340 && var54.field2673 < var54.field2675 - var54.field2667) {
                                                                int var56 = field334 * (var47 + var53 + 32 - class75.field1340) / 3;
                                                                if (var56 > field334 * 10) {
                                                                    var56 = field334 * 10;
                                                                }
                                                                if (var56 > var54.field2675 - var54.field2667 - var54.field2673) {
                                                                    var56 = var54.field2675 - var54.field2667 - var54.field2673;
                                                                }
                                                                var54.field2673 += var56;
                                                                field363 -= var56;
                                                                method2103(var54);
                                                            }
                                                        }
                                                    } else if (Statics.field969 == var10 && field369 == var43) {
                                                        var51.method1522(var46, var47, 128);
                                                    } else {
                                                        var51.method1467(var46, var47);
                                                    }
                                                }
                                            } else if (var10.field2670 != null && var43 < 20) {
                                                class74 var57 = var10.method2989(var43);
                                                if (var57 != null) {
                                                    var57.method1467(var46, var47);
                                                } else if (class164.field2649) {
                                                    method2103(var10);
                                                }
                                            }
                                            var43++;
                                        }
                                    }
                                } else if (var10.field2653 == 3) {
                                    int var58;
                                    if (method143(var10)) {
                                        var58 = var10.field2686;
                                        if (Statics.field1564 == var10 && var10.field2679 != 0) {
                                            var58 = var10.field2679;
                                        }
                                    } else {
                                        var58 = var10.field2720;
                                        if (Statics.field1564 == var10 && var10.field2759 != 0) {
                                            var58 = var10.field2759;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2680) {
                                            class75.method1567(var13, var14, var10.field2677, var10.field2667, var58);
                                        } else {
                                            class75.method1543(var13, var14, var10.field2677, var10.field2667, var58);
                                        }
                                    } else if (var10.field2680) {
                                        class75.method1574(var13, var14, var10.field2677, var10.field2667, var58, 256 - (var15 & 0xFF));
                                    } else {
                                        class75.method1589(var13, var14, var10.field2677, var10.field2667, var58, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2653 == 4) {
                                    class215 var59 = var10.method2996();
                                    if (var59 != null) {
                                        String var60 = var10.field2709;
                                        int var61;
                                        if (method143(var10)) {
                                            var61 = var10.field2686;
                                            if (Statics.field1564 == var10 && var10.field2679 != 0) {
                                                var61 = var10.field2679;
                                            }
                                            if (var10.field2762.length() > 0) {
                                                var60 = var10.field2762;
                                            }
                                        } else {
                                            var61 = var10.field2720;
                                            if (Statics.field1564 == var10 && var10.field2759 != 0) {
                                                var61 = var10.field2759;
                                            }
                                        }
                                        if (var10.field2777 && var10.field2685 != -1) {
                                            class47 var62 = class47.method496(var10.field2685);
                                            var60 = var62.field1037;
                                            if (var60 == null) {
                                                var60 = "null";
                                            }
                                            if ((var62.field1076 == 1 || var10.field2770 != 1) && var10.field2770 != -1) {
                                                var60 = class2.method2712(16748608) + var60 + class2.field21 + " " + 'x' + method609(var10.field2770);
                                            }
                                        }
                                        if (field276 == var10) {
                                            class148 var10000 = (class148) null;
                                            var60 = class148.field2345;
                                            var61 = var10.field2720;
                                        }
                                        if (!var10.field2777) {
                                            var60 = method22(var60, var10);
                                        }
                                        var59.method3631(var60, var13, var14, var10.field2677, var10.field2667, var61, var10.field2780 ? 0 : -1, var10.field2712, var10.field2713, var10.field2711);
                                    } else if (class164.field2649) {
                                        method2103(var10);
                                    }
                                } else if (var10.field2653 == 5) {
                                    if (var10.field2777) {
                                        class74 var64;
                                        if (var10.field2685 == -1) {
                                            var64 = var10.method2987(false);
                                        } else {
                                            var64 = class47.method1(var10.field2685, var10.field2770, var10.field2688, var10.field2689, var10.field2707, false);
                                        }
                                        if (var64 != null) {
                                            int var65 = var64.field1333;
                                            int var66 = var64.field1334;
                                            if (var10.field2687) {
                                                class75.method1582(var13, var14, var10.field2677 + var13, var10.field2667 + var14);
                                                int var67 = (var10.field2677 + (var65 - 1)) / var65;
                                                int var68 = (var10.field2667 + (var66 - 1)) / var66;
                                                for (int var69 = 0; var69 < var67; var69++) {
                                                    for (int var70 = 0; var70 < var68; var70++) {
                                                        if (var10.field2691 != 0) {
                                                            var64.method1480(var65 / 2 + var65 * var69 + var13, var66 / 2 + var66 * var70 + var14, var10.field2691, 4096);
                                                        } else if (var15 == 0) {
                                                            var64.method1467(var65 * var69 + var13, var66 * var70 + var14);
                                                        } else {
                                                            var64.method1522(var65 * var69 + var13, var66 * var70 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method1566(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var71 = var10.field2677 * 4096 / var65;
                                                if (var10.field2691 != 0) {
                                                    var64.method1480(var10.field2677 / 2 + var13, var10.field2667 / 2 + var14, var10.field2691, var71);
                                                } else if (var15 != 0) {
                                                    var64.method1475(var13, var14, var10.field2677, var10.field2667, 256 - (var15 & 0xFF));
                                                } else if (var10.field2677 == var65 && var10.field2667 == var66) {
                                                    var64.method1467(var13, var14);
                                                } else {
                                                    var64.method1515(var13, var14, var10.field2677, var10.field2667);
                                                }
                                            }
                                        } else if (class164.field2649) {
                                            method2103(var10);
                                        }
                                    } else {
                                        class74 var63 = var10.method2987(method143(var10));
                                        if (var63 != null) {
                                            var63.method1467(var13, var14);
                                        } else if (class164.field2649) {
                                            method2103(var10);
                                        }
                                    }
                                } else if (var10.field2653 == 6) {
                                    boolean var72 = method143(var10);
                                    int var73;
                                    if (var72) {
                                        var73 = var10.field2697;
                                    } else {
                                        var73 = var10.field2696;
                                    }
                                    class100 var74 = null;
                                    int var75 = 0;
                                    if (var10.field2685 != -1) {
                                        class47 var76 = class47.method496(var10.field2685);
                                        if (var76 != null) {
                                            class47 var77 = var76.method938(var10.field2770);
                                            var74 = var77.method919(1);
                                            if (var74 == null) {
                                                method2103(var10);
                                            } else {
                                                var74.method2001();
                                                var75 = var74.field1383 / 2;
                                            }
                                        }
                                    } else if (var10.field2692 == 5) {
                                        if (var10.field2647 == 0) {
                                            var74 = field535.method3080((class40) null, -1, (class40) null, -1);
                                        } else {
                                            var74 = Statics.field633.method12();
                                        }
                                    } else if (var73 == -1) {
                                        var74 = var10.method2990((class40) null, -1, var72, Statics.field633.field29);
                                        if (var74 == null && class164.field2649) {
                                            method2103(var10);
                                        }
                                    } else {
                                        class40 var78 = class40.method122(var73);
                                        var74 = var10.method2990(var78, var10.field2771, var72, Statics.field633.field29);
                                        if (var74 == null && class164.field2649) {
                                            method2103(var10);
                                        }
                                    }
                                    class86.method1809(var10.field2677 / 2 + var13, var10.field2667 / 2 + var14);
                                    int var79 = var10.field2703 * class86.field1512[var10.field2776] >> 16;
                                    int var80 = var10.field2703 * class86.field1513[var10.field2776] >> 16;
                                    if (var74 != null) {
                                        if (var10.field2777) {
                                            var74.method2001();
                                            if (var10.field2706) {
                                                var74.method2014(0, var10.field2701, var10.field2702, var10.field2776, var10.field2698, var10.field2699 + var75 + var79, var10.field2699 + var80, var10.field2703);
                                            } else {
                                                var74.method2021(0, var10.field2701, var10.field2702, var10.field2776, var10.field2698, var10.field2699 + var75 + var79, var10.field2699 + var80);
                                            }
                                        } else {
                                            var74.method2021(0, var10.field2701, 0, var10.field2776, 0, var79, var80);
                                        }
                                    }
                                    class86.method1861();
                                } else {
                                    if (var10.field2653 == 7) {
                                        class215 var81 = var10.method2996();
                                        if (var81 == null) {
                                            if (class164.field2649) {
                                                method2103(var10);
                                            }
                                            continue;
                                        }
                                        int var82 = 0;
                                        for (int var83 = 0; var83 < var10.field2682; var83++) {
                                            for (int var84 = 0; var84 < var10.field2662; var84++) {
                                                if (var10.field2764[var82] > 0) {
                                                    class47 var85 = class47.method496(var10.field2764[var82] - 1);
                                                    String var86;
                                                    if (var85.field1076 != 1 && var10.field2768[var82] == 1) {
                                                        var86 = class2.method2712(16748608) + var85.field1037 + class2.field21;
                                                    } else {
                                                        var86 = class2.method2712(16748608) + var85.field1037 + class2.field21 + " " + 'x' + method609(var10.field2768[var82]);
                                                    }
                                                    int var87 = (var10.field2715 + 115) * var84 + var13;
                                                    int var88 = (var10.field2724 + 12) * var83 + var14;
                                                    if (var10.field2712 == 0) {
                                                        var81.method3592(var86, var87, var88, var10.field2720, var10.field2780 ? 0 : -1);
                                                    } else if (var10.field2712 == 1) {
                                                        var81.method3666(var86, var10.field2677 / 2 + var87, var88, var10.field2720, var10.field2780 ? 0 : -1);
                                                    } else {
                                                        var81.method3593(var86, var10.field2677 + var87 - 1, var88, var10.field2720, var10.field2780 ? 0 : -1);
                                                    }
                                                }
                                                var82++;
                                            }
                                        }
                                    }
                                    if (var10.field2653 == 8 && Statics.field1858 == var10 && field436 == field410) {
                                        int var89 = 0;
                                        int var90 = 0;
                                        class215 var91 = Statics.field586;
                                        String var92 = var10.field2709;
                                        String var93 = method22(var92, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class2.field16);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            int var96 = var91.method3674(var95);
                                            if (var96 > var89) {
                                                var89 = var96;
                                            }
                                            var90 += var91.field3104 + 1;
                                        }
                                        var89 += 6;
                                        var90 += 7;
                                        int var97 = var10.field2677 + var13 - 5 - var89;
                                        int var98 = var10.field2667 + var14 + 5;
                                        if (var97 < var13 + 5) {
                                            var97 = var13 + 5;
                                        }
                                        if (var89 + var97 > arg4) {
                                            var97 = arg4 - var89;
                                        }
                                        if (var90 + var98 > arg5) {
                                            var98 = arg5 - var90;
                                        }
                                        class75.method1567(var97, var98, var89, var90, 16777120);
                                        class75.method1543(var97, var98, var89, var90, 0);
                                        String var99 = var10.field2709;
                                        int var100 = var91.field3104 + var98 + 2;
                                        String var101 = method22(var99, var10);
                                        while (var101.length() > 0) {
                                            int var102 = var101.indexOf(class2.field16);
                                            String var103;
                                            if (var102 == -1) {
                                                var103 = var101;
                                                var101 = "";
                                            } else {
                                                var103 = var101.substring(0, var102);
                                                var101 = var101.substring(var102 + 4);
                                            }
                                            var91.method3592(var103, var97 + 3, var100, 0, -1);
                                            var100 += var91.field3104 + 1;
                                        }
                                    }
                                    if (var10.field2653 == 9) {
                                        if (var10.field2681 == 1) {
                                            int var104;
                                            int var105;
                                            int var106;
                                            int var107;
                                            if (var10.field2683) {
                                                var104 = var13;
                                                var105 = var10.field2667 + var14;
                                                var106 = var10.field2677 + var13;
                                                var107 = var14;
                                            } else {
                                                var104 = var13;
                                                var105 = var14;
                                                var106 = var10.field2677 + var13;
                                                var107 = var10.field2667 + var14;
                                            }
                                            class75.method1549(var104, var105, var106, var107, var10.field2720);
                                        } else {
                                            int var108 = var10.field2677 >= 0 ? var10.field2677 : -var10.field2677;
                                            int var109 = var10.field2667 >= 0 ? var10.field2667 : -var10.field2667;
                                            int var110 = var108;
                                            if (var108 < var109) {
                                                var110 = var109;
                                            }
                                            if (var110 != 0) {
                                                int var111 = (var10.field2677 << 16) / var110;
                                                int var112 = (var10.field2667 << 16) / var110;
                                                if (var112 <= var111) {
                                                    var111 = -var111;
                                                } else {
                                                    var112 = -var112;
                                                }
                                                int var113 = var10.field2681 * var112 >> 17;
                                                int var114 = var10.field2681 * var112 + 1 >> 17;
                                                int var115 = var10.field2681 * var111 >> 17;
                                                int var116 = var10.field2681 * var111 + 1 >> 17;
                                                int var117 = var13 + var113;
                                                int var118 = var13 - var114;
                                                int var119 = var10.field2677 + var13 - var114;
                                                int var120 = var10.field2677 + var13 + var113;
                                                int var121 = var14 + var115;
                                                int var122 = var14 - var116;
                                                int var123 = var10.field2667 + var14 - var116;
                                                int var124 = var10.field2667 + var14 + var115;
                                                class86.method1817(var117, var118, var119);
                                                class86.method1829(var121, var122, var123, var117, var118, var119, var10.field2720);
                                                class86.method1817(var117, var119, var120);
                                                class86.method1829(var121, var123, var124, var117, var119, var120, var10.field2720);
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

    @ObfuscatedName("i.cn(Ljava/lang/String;Lfq;B)Ljava/lang/String;")
    public static String method22(String arg0, class164 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2079(arg1, var2 - 1);
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
                if (Statics.field14 != null) {
                    int var9 = Statics.field14.field2098;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field14.field2106 != null) {
                        var8 = (String) Statics.field14.field2106;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ap.cz(II)Ljava/lang/String;")
    public static final String method609(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field15 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2712(65408) + var1.substring(0, var1.length() - 8) + class148.field2450 + " " + class2.field17 + var1 + class2.field18 + class2.field21;
        } else if (var1.length() > 6) {
            return " " + class2.method2712(16777215) + var1.substring(0, var1.length() - 4) + class148.field2365 + " " + class2.field17 + var1 + class2.field18 + class2.field21;
        } else {
            return " " + class2.method2712(16776960) + var1 + class2.field21;
        }
    }

    @ObfuscatedName("ch.ch(ZI)V")
    public static final void method1898(boolean arg0) {
        method2461(field420, Statics.field1984, Statics.field1384, arg0);
    }

    @ObfuscatedName("dq.cl(Lfq;B)V")
    public static void method2503(class164 arg0) {
        class164 var1 = arg0.field2774 == -1 ? null : class164.method2517(arg0.field2774);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1984;
            var3 = Statics.field1384;
        } else {
            var2 = var1.field2677;
            var3 = var1.field2667;
        }
        method2948(arg0, var2, var3, false);
        method134(arg0, var2, var3);
    }

    @ObfuscatedName("es.ci([Lfq;Lfq;ZI)V")
    public static void method2754(class164[] arg0, class164 arg1, boolean arg2) {
        int var3 = arg1.field2674 == 0 ? arg1.field2677 : arg1.field2674;
        int var4 = arg1.field2675 == 0 ? arg1.field2667 : arg1.field2675;
        method2418(arg0, arg1.field2651, var3, var4, arg2);
        if (arg1.field2743 != null) {
            method2418(arg1.field2743, arg1.field2651, var3, var4, arg2);
        }
        class4 var5 = (class4) field421.method3354((long) arg1.field2651);
        if (var5 != null) {
            method2461(var5.field53, var3, var4, arg2);
        }
        if (arg1.field2655 == 1337) {
        }
    }

    @ObfuscatedName("dx.cg(IIIZB)V")
    public static final void method2461(int arg0, int arg1, int arg2, boolean arg3) {
        if (class164.method2633(arg0)) {
            method2418(Statics.field2642[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dy.ce([Lfq;IIIZB)V")
    public static void method2418(class164[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class164 var6 = arg0[var5];
            if (var6 != null && var6.field2774 == arg1) {
                method2948(var6, arg2, arg3, arg4);
                method134(var6, arg2, arg3);
                if (var6.field2672 > var6.field2674 - var6.field2677) {
                    var6.field2672 = var6.field2674 - var6.field2677;
                }
                if (var6.field2672 < 0) {
                    var6.field2672 = 0;
                }
                if (var6.field2673 > var6.field2675 - var6.field2667) {
                    var6.field2673 = var6.field2675 - var6.field2667;
                }
                if (var6.field2673 < 0) {
                    var6.field2673 = 0;
                }
                if (var6.field2653 == 0) {
                    method2754(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ff.ct(Lfq;IIZI)V")
    public static void method2948(class164 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2677;
        int var5 = arg0.field2667;
        if (arg0.field2658 == 0) {
            arg0.field2677 = arg0.field2662;
        } else if (arg0.field2658 == 1) {
            arg0.field2677 = arg1 - arg0.field2662;
        } else if (arg0.field2658 == 2) {
            arg0.field2677 = arg0.field2662 * arg1 >> 14;
        }
        if (arg0.field2758 == 0) {
            arg0.field2667 = arg0.field2682;
        } else if (arg0.field2758 == 1) {
            arg0.field2667 = arg2 - arg0.field2682;
        } else if (arg0.field2758 == 2) {
            arg0.field2667 = arg0.field2682 * arg2 >> 14;
        }
        if (arg0.field2658 == 4) {
            arg0.field2677 = arg0.field2668 * arg0.field2667 / arg0.field2767;
        }
        if (arg0.field2758 == 4) {
            arg0.field2667 = arg0.field2767 * arg0.field2677 / arg0.field2668;
        }
        if (field392 && arg0.field2653 == 0) {
            if (arg0.field2667 < 5 && arg0.field2677 < 5) {
                arg0.field2667 = 5;
                arg0.field2677 = 5;
            } else {
                if (arg0.field2667 <= 0) {
                    arg0.field2667 = 5;
                }
                if (arg0.field2677 <= 0) {
                    arg0.field2677 = 5;
                }
            }
        }
        if (arg0.field2655 == 1337) {
            field432 = arg0;
        }
        if (arg3 && arg0.field2723 != null && (arg0.field2677 != var4 || arg0.field2667 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field7 = arg0.field2723;
            field461.method3377(var6);
        }
    }

    @ObfuscatedName("v.cr(Lfq;III)V")
    public static void method134(class164 arg0, int arg1, int arg2) {
        if (arg0.field2660 == 0) {
            arg0.field2664 = arg0.field2719;
        } else if (arg0.field2660 == 1) {
            arg0.field2664 = (arg1 - arg0.field2677) / 2 + arg0.field2719;
        } else if (arg0.field2660 == 2) {
            arg0.field2664 = arg1 - arg0.field2677 - arg0.field2719;
        } else if (arg0.field2660 == 3) {
            arg0.field2664 = arg0.field2719 * arg1 >> 14;
        } else if (arg0.field2660 == 4) {
            arg0.field2664 = (arg0.field2719 * arg1 >> 14) + (arg1 - arg0.field2677) / 2;
        } else {
            arg0.field2664 = arg1 - arg0.field2677 - (arg0.field2719 * arg1 >> 14);
        }
        if (arg0.field2657 == 0) {
            arg0.field2665 = arg0.field2661;
        } else if (arg0.field2657 == 1) {
            arg0.field2665 = (arg2 - arg0.field2667) / 2 + arg0.field2661;
        } else if (arg0.field2657 == 2) {
            arg0.field2665 = arg2 - arg0.field2667 - arg0.field2661;
        } else if (arg0.field2657 == 3) {
            arg0.field2665 = arg0.field2661 * arg2 >> 14;
        } else if (arg0.field2657 == 4) {
            arg0.field2665 = (arg0.field2661 * arg2 >> 14) + (arg2 - arg0.field2667) / 2;
        } else {
            arg0.field2665 = arg2 - arg0.field2667 - (arg0.field2661 * arg2 >> 14);
        }
        if (!field392 || arg0.field2653 != 0) {
            return;
        }
        if (arg0.field2664 < 0) {
            arg0.field2664 = 0;
        } else if (arg0.field2677 + arg0.field2664 > arg1) {
            arg0.field2664 = arg1 - arg0.field2677;
        }
        if (arg0.field2665 < 0) {
            arg0.field2665 = 0;
        } else if (arg0.field2667 + arg0.field2665 > arg2) {
            arg0.field2665 = arg2 - arg0.field2667;
        }
    }

    @ObfuscatedName("an.cc(Lfq;IIIIIIB)V")
    public static final void method619(class164 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field339) {
            field340 = 32;
        } else {
            field340 = 0;
        }
        field339 = false;
        if (class132.field2036 == 1 || !Statics.field121 && class132.field2036 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2673 -= 4;
                method2103(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2673 += 4;
                method2103(arg0);
            } else if (arg5 >= arg1 - field340 && arg5 < field340 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2673 = (arg4 - arg3) * var8 / var9;
                method2103(arg0);
                field339 = true;
            }
        }
        if (field460 == 0) {
            return;
        }
        int var10 = arg0.field2677;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2673 += field460 * 45;
            method2103(arg0);
        }
    }

    @ObfuscatedName("z.cx(Lfq;I)Z")
    public static final boolean method143(class164 arg0) {
        if (arg0.field2656 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2656.length; var1++) {
            int var2 = method2079(arg0, var1);
            int var3 = arg0.field2763[var1];
            if (arg0.field2656[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2656[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2656[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cm.cw(Lfq;II)I")
    public static final int method2079(class164 arg0, int arg1) {
        if (arg0.field2641 == null || arg1 >= arg0.field2641.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2641[arg1];
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
                    var7 = field396[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field314[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field398[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class164 var11 = class164.method2517(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class47.method496(var12).field1055 || field455)) {
                        for (int var13 = 0; var13 < var11.field2764.length; var13++) {
                            if (var12 + 1 == var11.field2764[var13]) {
                                var7 += var11.field2768[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class167.field2805[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class146.field2186[field314[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class167.field2805[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field633.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class146.field2185[var14]) {
                            var7 += field314[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class164 var17 = class164.method2517(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class47.method496(var18).field1055 || field455)) {
                        for (int var19 = 0; var19 < var17.field2764.length; var19++) {
                            if (var18 + 1 == var17.field2764[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field425;
                }
                if (var6 == 12) {
                    var7 = field426;
                }
                if (var6 == 13) {
                    int var20 = class167.field2805[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class167.method1895(var22);
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
                    var7 = (Statics.field633.field777 >> 7) + Statics.field1903;
                }
                if (var6 == 19) {
                    var7 = (Statics.field633.field757 >> 7) + Statics.field311;
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

    @ObfuscatedName("fs.ca([Lfq;IIIIIIII)V")
    public static final void method3106(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class164 var9 = arg0[var8];
            if (var9 != null && (!var9.field2777 || var9.field2653 == 0 || var9.field2729 || method573(var9) != 0 || field434 == var9 || var9.field2655 == 1338) && var9.field2774 == arg1 && (!var9.field2777 || !method3573(var9))) {
                int var10 = var9.field2664 + arg6;
                int var11 = var9.field2665 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2653 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2653 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2677 + var10;
                    int var19 = var9.field2667 + var11;
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
                    int var22 = var9.field2677 + var10;
                    int var23 = var9.field2667 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field433 == var9) {
                    field441 = true;
                    field331 = var10;
                    field443 = var11;
                }
                if (!var9.field2777 || var12 < var14 && var13 < var15) {
                    int var24 = class132.field2037;
                    int var25 = class132.field2038;
                    if (class132.field2043 != 0) {
                        var24 = class132.field2034;
                        var25 = class132.field2045;
                    }
                    if (var9.field2655 == 1337) {
                        if (!field267 && !field400 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method35(var24, var25, var12, var13);
                        }
                    } else if (var9.field2655 == 1338) {
                        method520(var9, var10, var11);
                    } else {
                        if (!field400 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2654 == 1) {
                                method773(var9.field2766, "", 24, 0, 0, var9.field2651);
                            }
                            if (var9.field2654 == 2 && !field408) {
                                int var28 = method573(var9);
                                int var29 = var28 >> 11 & 0x3F;
                                String var30;
                                if (var29 == 0) {
                                    var30 = null;
                                } else if (var9.field2728 == null || var9.field2728.trim().length() == 0) {
                                    var30 = null;
                                } else {
                                    var30 = var9.field2728;
                                }
                                if (var30 != null) {
                                    method773(var30, class2.method2712(65280) + var9.field2765, 25, 0, -1, var9.field2651);
                                }
                            }
                            if (var9.field2654 == 3) {
                                method773(class148.field2361, "", 26, 0, 0, var9.field2651);
                            }
                            if (var9.field2654 == 4) {
                                method773(var9.field2766, "", 28, 0, 0, var9.field2651);
                            }
                            if (var9.field2654 == 5) {
                                method773(var9.field2766, "", 29, 0, 0, var9.field2651);
                            }
                            if (var9.field2654 == 6 && field276 == null) {
                                method773(var9.field2766, "", 30, 0, -1, var9.field2651);
                            }
                            if (var9.field2653 == 2) {
                                int var32 = 0;
                                for (int var33 = 0; var33 < var9.field2667; var33++) {
                                    for (int var34 = 0; var34 < var9.field2677; var34++) {
                                        int var35 = (var9.field2715 + 32) * var34;
                                        int var36 = (var9.field2724 + 32) * var33;
                                        if (var32 < 20) {
                                            var35 += var9.field2669[var32];
                                            var36 += var9.field2663[var32];
                                        }
                                        if (var26 >= var35 && var27 >= var36 && var26 < var35 + 32 && var27 < var36 + 32) {
                                            field373 = var32;
                                            Statics.field211 = var9;
                                            if (var9.field2764[var32] > 0) {
                                                label982: {
                                                    class47 var37 = class47.method496(var9.field2764[var32] - 1);
                                                    if (field412 == 1) {
                                                        int var38 = method573(var9);
                                                        boolean var39 = (var38 >> 30 & 0x1) != 0;
                                                        if (var39) {
                                                            if (Statics.field413 != var9.field2651 || Statics.field1958 != var32) {
                                                                method773(class148.field2352, field283 + " " + class2.field19 + " " + class2.method2712(16748608) + var37.field1037, 31, var37.field1049, var32, var9.field2651);
                                                            }
                                                            break label982;
                                                        }
                                                    }
                                                    if (field408) {
                                                        int var40 = method573(var9);
                                                        boolean var41 = (var40 >> 30 & 0x1) != 0;
                                                        if (var41) {
                                                            if ((Statics.field1848 & 0x10) == 16) {
                                                                method773(field418, field352 + " " + class2.field19 + " " + class2.method2712(16748608) + var37.field1037, 32, var37.field1049, var32, var9.field2651);
                                                            }
                                                            break label982;
                                                        }
                                                    }
                                                    String[] var42 = var37.field1047;
                                                    if (field292) {
                                                        var42 = method163(var42);
                                                    }
                                                    int var43 = method573(var9);
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
                                                                method773(var42[var45], class2.method2712(16748608) + var37.field1037, var46, var37.field1049, var32, var9.field2651);
                                                            } else if (var45 == 4) {
                                                                method773(class148.field2294, class2.method2712(16748608) + var37.field1037, 37, var37.field1049, var32, var9.field2651);
                                                            }
                                                        }
                                                    }
                                                    class169 var10000 = (class169) null;
                                                    if (class169.method2573(method573(var9))) {
                                                        method773(class148.field2352, class2.method2712(16748608) + var37.field1037, 38, var37.field1049, var32, var9.field2651);
                                                    }
                                                    int var47 = method573(var9);
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
                                                                method773(var42[var49], class2.method2712(16748608) + var37.field1037, var50, var37.field1049, var32, var9.field2651);
                                                            }
                                                        }
                                                    }
                                                    String[] var51 = var9.field2745;
                                                    if (field292) {
                                                        var51 = method163(var51);
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
                                                                method773(var51[var52], class2.method2712(16748608) + var37.field1037, var53, var37.field1049, var32, var9.field2651);
                                                            }
                                                        }
                                                    }
                                                    method773(class148.field2353, class2.method2712(16748608) + var37.field1037, 1005, var37.field1049, var32, var9.field2651);
                                                }
                                            }
                                        }
                                        var32++;
                                    }
                                }
                            }
                            if (var9.field2777) {
                                if (field408) {
                                    int var54 = method573(var9);
                                    boolean var55 = (var54 >> 21 & 0x1) != 0;
                                    if (var55 && (Statics.field1848 & 0x20) == 32) {
                                        method773(field418, field352 + " " + class2.field19 + " " + var9.field2722, 58, 0, var9.field2652, var9.field2651);
                                    }
                                } else {
                                    for (int var56 = 9; var56 >= 5; var56--) {
                                        int var57 = method573(var9);
                                        boolean var58 = (var57 >> var56 + 1 & 0x1) != 0;
                                        String var59;
                                        if (!var58 && var9.field2749 == null) {
                                            var59 = null;
                                        } else if (var9.field2700 == null || var9.field2700.length <= var56 || var9.field2700[var56] == null || var9.field2700[var56].trim().length() == 0) {
                                            var59 = null;
                                        } else {
                                            var59 = var9.field2700[var56];
                                        }
                                        if (var59 != null) {
                                            method773(var59, var9.field2722, 1007, var56 + 1, var9.field2652, var9.field2651);
                                        }
                                    }
                                    int var61 = method573(var9);
                                    int var62 = var61 >> 11 & 0x3F;
                                    String var63;
                                    if (var62 == 0) {
                                        var63 = null;
                                    } else if (var9.field2728 == null || var9.field2728.trim().length() == 0) {
                                        var63 = null;
                                    } else {
                                        var63 = var9.field2728;
                                    }
                                    if (var63 != null) {
                                        method773(var63, var9.field2722, 25, 0, var9.field2652, var9.field2651);
                                    }
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        int var66 = method573(var9);
                                        boolean var67 = (var66 >> var65 + 1 & 0x1) != 0;
                                        String var68;
                                        if (!var67 && var9.field2749 == null) {
                                            var68 = null;
                                        } else if (var9.field2700 == null || var9.field2700.length <= var65 || var9.field2700[var65] == null || var9.field2700[var65].trim().length() == 0) {
                                            var68 = null;
                                        } else {
                                            var68 = var9.field2700[var65];
                                        }
                                        if (var68 != null) {
                                            method773(var68, var9.field2722, 57, var65 + 1, var9.field2652, var9.field2651);
                                        }
                                    }
                                    int var70 = method573(var9);
                                    boolean var71 = (var70 & 0x1) != 0;
                                    if (var71) {
                                        method773(class148.field2207, "", 30, 0, var9.field2652, var9.field2651);
                                    }
                                }
                            }
                        }
                        if (var9.field2653 == 0) {
                            if (!var9.field2777 && method3573(var9) && Statics.field1564 != var9) {
                                continue;
                            }
                            method3106(arg0, var9.field2651, var12, var13, var14, var15, var10 - var9.field2672, var11 - var9.field2673);
                            if (var9.field2743 != null) {
                                method3106(var9.field2743, var9.field2651, var12, var13, var14, var15, var10 - var9.field2672, var11 - var9.field2673);
                            }
                            class4 var72 = (class4) field421.method3354((long) var9.field2651);
                            if (var72 != null) {
                                if (var72.field49 == 0 && class132.field2037 >= var12 && class132.field2038 >= var13 && class132.field2037 < var14 && class132.field2038 < var15 && !field400 && !field392) {
                                    field406[0] = class148.field2289;
                                    field407[0] = "";
                                    field440[0] = 1006;
                                    field401 = 1;
                                }
                                int var73 = var72.field53;
                                if (class164.method2633(var73)) {
                                    method3106(Statics.field2642[var73], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2777) {
                            if (var9.field2782 && class132.field2037 >= var12 && class132.field2038 >= var13 && class132.field2037 < var14 && class132.field2038 < var15) {
                                for (class1 var74 = (class1) field461.method3382(); var74 != null; var74 = (class1) field461.method3384()) {
                                    if (var74.field2) {
                                        var74.method3474();
                                        var74.field3.field2717 = false;
                                    }
                                }
                                if (Statics.field1937 == 0) {
                                    field433 = null;
                                    field434 = null;
                                }
                                if (!field400) {
                                    field406[0] = class148.field2289;
                                    field407[0] = "";
                                    field440[0] = 1006;
                                    field401 = 1;
                                }
                            }
                            boolean var75;
                            if (class132.field2037 >= var12 && class132.field2038 >= var13 && class132.field2037 < var14 && class132.field2038 < var15) {
                                var75 = true;
                            } else {
                                var75 = false;
                            }
                            boolean var76 = false;
                            if ((class132.field2036 == 1 || !Statics.field121 && class132.field2036 == 4) && var75) {
                                var76 = true;
                            }
                            boolean var77 = false;
                            if ((class132.field2043 == 1 || !Statics.field121 && class132.field2043 == 4) && class132.field2034 >= var12 && class132.field2045 >= var13 && class132.field2034 < var14 && class132.field2045 < var15) {
                                var77 = true;
                            }
                            if (var77) {
                                Statics.method3481(var9, class132.field2034 - var10, class132.field2045 - var11);
                            }
                            if (field433 != null && field433 != var9 && var75 && class169.method2405(method573(var9))) {
                                field539 = var9;
                            }
                            if (field434 == var9) {
                                field438 = true;
                                field277 = var10;
                                field419 = var11;
                            }
                            if (var9.field2729) {
                                if (var75 && field460 != 0 && var9.field2695 != null) {
                                    class1 var78 = new class1();
                                    var78.field2 = true;
                                    var78.field3 = var9;
                                    var78.field10 = field460;
                                    var78.field7 = var9.field2695;
                                    field461.method3377(var78);
                                }
                                if (field433 != null || Statics.field540 != null || field400) {
                                    var77 = false;
                                    var76 = false;
                                    var75 = false;
                                }
                                if (!var9.field2775 && var77) {
                                    var9.field2775 = true;
                                    if (var9.field2731 != null) {
                                        class1 var79 = new class1();
                                        var79.field2 = true;
                                        var79.field3 = var9;
                                        var79.field4 = class132.field2034 - var10;
                                        var79.field10 = class132.field2045 - var11;
                                        var79.field7 = var9.field2731;
                                        field461.method3377(var79);
                                    }
                                }
                                if (var9.field2775 && var76 && var9.field2732 != null) {
                                    class1 var80 = new class1();
                                    var80.field2 = true;
                                    var80.field3 = var9;
                                    var80.field4 = class132.field2037 - var10;
                                    var80.field10 = class132.field2038 - var11;
                                    var80.field7 = var9.field2732;
                                    field461.method3377(var80);
                                }
                                if (var9.field2775 && !var76) {
                                    var9.field2775 = false;
                                    if (var9.field2733 != null) {
                                        class1 var81 = new class1();
                                        var81.field2 = true;
                                        var81.field3 = var9;
                                        var81.field4 = class132.field2037 - var10;
                                        var81.field10 = class132.field2038 - var11;
                                        var81.field7 = var9.field2733;
                                        field255.method3377(var81);
                                    }
                                }
                                if (var76 && var9.field2734 != null) {
                                    class1 var82 = new class1();
                                    var82.field2 = true;
                                    var82.field3 = var9;
                                    var82.field4 = class132.field2037 - var10;
                                    var82.field10 = class132.field2038 - var11;
                                    var82.field7 = var9.field2734;
                                    field461.method3377(var82);
                                }
                                if (!var9.field2717 && var75) {
                                    var9.field2717 = true;
                                    if (var9.field2769 != null) {
                                        class1 var83 = new class1();
                                        var83.field2 = true;
                                        var83.field3 = var9;
                                        var83.field4 = class132.field2037 - var10;
                                        var83.field10 = class132.field2038 - var11;
                                        var83.field7 = var9.field2769;
                                        field461.method3377(var83);
                                    }
                                }
                                if (var9.field2717 && var75 && var9.field2676 != null) {
                                    class1 var84 = new class1();
                                    var84.field2 = true;
                                    var84.field3 = var9;
                                    var84.field4 = class132.field2037 - var10;
                                    var84.field10 = class132.field2038 - var11;
                                    var84.field7 = var9.field2676;
                                    field461.method3377(var84);
                                }
                                if (var9.field2717 && !var75) {
                                    var9.field2717 = false;
                                    if (var9.field2737 != null) {
                                        class1 var85 = new class1();
                                        var85.field2 = true;
                                        var85.field3 = var9;
                                        var85.field4 = class132.field2037 - var10;
                                        var85.field10 = class132.field2038 - var11;
                                        var85.field7 = var9.field2737;
                                        field255.method3377(var85);
                                    }
                                }
                                if (var9.field2748 != null) {
                                    class1 var86 = new class1();
                                    var86.field3 = var9;
                                    var86.field7 = var9.field2748;
                                    field462.method3377(var86);
                                }
                                if (var9.field2742 != null && field447 > var9.field2735) {
                                    if (var9.field2693 == null || field447 - var9.field2735 > 32) {
                                        class1 var91 = new class1();
                                        var91.field3 = var9;
                                        var91.field7 = var9.field2742;
                                        field461.method3377(var91);
                                    } else {
                                        label691: for (int var87 = var9.field2735; var87 < field447; var87++) {
                                            int var88 = field446[var87 & 0x1F];
                                            for (int var89 = 0; var89 < var9.field2693.length; var89++) {
                                                if (var9.field2693[var89] == var88) {
                                                    class1 var90 = new class1();
                                                    var90.field3 = var9;
                                                    var90.field7 = var9.field2742;
                                                    field461.method3377(var90);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2735 = field447;
                                }
                                if (var9.field2718 != null && field335 > var9.field2778) {
                                    if (var9.field2736 == null || field335 - var9.field2778 > 32) {
                                        class1 var96 = new class1();
                                        var96.field3 = var9;
                                        var96.field7 = var9.field2718;
                                        field461.method3377(var96);
                                    } else {
                                        label667: for (int var92 = var9.field2778; var92 < field335; var92++) {
                                            int var93 = field448[var92 & 0x1F];
                                            for (int var94 = 0; var94 < var9.field2736.length; var94++) {
                                                if (var9.field2736[var94] == var93) {
                                                    class1 var95 = new class1();
                                                    var95.field3 = var9;
                                                    var95.field7 = var9.field2718;
                                                    field461.method3377(var95);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2778 = field335;
                                }
                                if (var9.field2746 != null && field451 > var9.field2779) {
                                    if (var9.field2747 == null || field451 - var9.field2779 > 32) {
                                        class1 var101 = new class1();
                                        var101.field3 = var9;
                                        var101.field7 = var9.field2746;
                                        field461.method3377(var101);
                                    } else {
                                        label643: for (int var97 = var9.field2779; var97 < field451; var97++) {
                                            int var98 = field497[var97 & 0x1F];
                                            for (int var99 = 0; var99 < var9.field2747.length; var99++) {
                                                if (var9.field2747[var99] == var98) {
                                                    class1 var100 = new class1();
                                                    var100.field3 = var9;
                                                    var100.field7 = var9.field2746;
                                                    field461.method3377(var100);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2779 = field451;
                                }
                                if (field463 > var9.field2750 && var9.field2751 != null) {
                                    class1 var102 = new class1();
                                    var102.field3 = var9;
                                    var102.field7 = var9.field2751;
                                    field461.method3377(var102);
                                }
                                if (field275 > var9.field2750 && var9.field2753 != null) {
                                    class1 var103 = new class1();
                                    var103.field3 = var9;
                                    var103.field7 = var9.field2753;
                                    field461.method3377(var103);
                                }
                                if (field454 > var9.field2750 && var9.field2754 != null) {
                                    class1 var104 = new class1();
                                    var104.field3 = var9;
                                    var104.field7 = var9.field2754;
                                    field461.method3377(var104);
                                }
                                if (field442 > var9.field2750 && var9.field2710 != null) {
                                    class1 var105 = new class1();
                                    var105.field3 = var9;
                                    var105.field7 = var9.field2710;
                                    field461.method3377(var105);
                                }
                                if (field456 > var9.field2750 && var9.field2760 != null) {
                                    class1 var106 = new class1();
                                    var106.field3 = var9;
                                    var106.field7 = var9.field2760;
                                    field461.method3377(var106);
                                }
                                if (field530 > var9.field2750 && var9.field2678 != null) {
                                    class1 var107 = new class1();
                                    var107.field3 = var9;
                                    var107.field7 = var9.field2678;
                                    field461.method3377(var107);
                                }
                                var9.field2750 = field445;
                                if (var9.field2752 != null) {
                                    for (int var108 = 0; var108 < field288; var108++) {
                                        class1 var109 = new class1();
                                        var109.field3 = var9;
                                        var109.field1 = field487[var108];
                                        var109.field6 = field486[var108];
                                        var109.field7 = var9.field2752;
                                        field461.method3377(var109);
                                    }
                                }
                            }
                        }
                        if (!var9.field2777 && field433 == null && Statics.field540 == null && !field400) {
                            if ((var9.field2714 >= 0 || var9.field2759 != 0) && class132.field2037 >= var12 && class132.field2038 >= var13 && class132.field2037 < var14 && class132.field2038 < var15) {
                                if (var9.field2714 >= 0) {
                                    Statics.field1564 = arg0[var9.field2714];
                                } else {
                                    Statics.field1564 = var9;
                                }
                            }
                            if (var9.field2653 == 8 && class132.field2037 >= var12 && class132.field2038 >= var13 && class132.field2037 < var14 && class132.field2038 < var15) {
                                Statics.field1858 = var9;
                            }
                            if (var9.field2675 > var9.field2667) {
                                method619(var9, var9.field2677 + var10, var11, var9.field2667, var9.field2675, class132.field2037, class132.field2038);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.cj(III)V")
    public static final void method73(int arg0, int arg1) {
        if (class164.method2633(arg0)) {
            method33(Statics.field2642[arg0], arg1);
        }
    }

    @ObfuscatedName("h.cm([Lfq;IB)V")
    public static final void method33(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2653 == 0) {
                    if (var3.field2743 != null) {
                        method33(var3.field2743, arg1);
                    }
                    class4 var4 = (class4) field421.method3354((long) var3.field2651);
                    if (var4 != null) {
                        method73(var4.field53, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2756 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field7 = var3.field2756;
                    class34.method613(var5);
                }
                if (arg1 == 1 && var3.field2757 != null) {
                    if (var3.field2652 >= 0) {
                        class164 var6 = class164.method2517(var3.field2651);
                        if (var6 == null || var6.field2743 == null || var3.field2652 >= var6.field2743.length || var6.field2743[var3.field2652] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field7 = var3.field2757;
                    class34.method613(var7);
                }
            }
        }
    }

    @ObfuscatedName("dk.dd(II)V")
    public static void method2467(int arg0) {
        Statics.field207 = new class29();
        Statics.field207.field676 = field299[arg0];
        Statics.field207.field674 = field403[arg0];
        Statics.field207.field678 = field440[arg0];
        Statics.field207.field680 = field405[arg0];
        Statics.field207.field677 = field406[arg0];
    }

    @ObfuscatedName("du.dw(Lfq;I)V")
    public static void method2103(class164 arg0) {
        if (field466 == arg0.field2781) {
            field467[arg0.field2773] = true;
        }
    }

    @ObfuscatedName("fd.di(I)V")
    public static void method2926() {
        for (class4 var0 = (class4) field421.method3345(); var0 != null; var0 = (class4) field421.method3358()) {
            int var1 = var0.field53;
            if (class164.method2633(var1)) {
                boolean var2 = true;
                class164[] var3 = Statics.field2642[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2777;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3013;
                    class164 var6 = class164.method2517(var5);
                    if (var6 != null) {
                        method2103(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.du([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method163(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ap.dl(II)V")
    public static final void method606(int arg0) {
        if (!class164.method2633(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2642[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3 != null) {
                var3.field2771 = 0;
                var3.field2772 = 0;
            }
        }
    }

    @ObfuscatedName("bf.dt([Lfq;II)V")
    public static final void method1340(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null && var3.field2774 == arg1 && (!var3.field2777 || !method3573(var3))) {
                if (var3.field2653 == 0) {
                    if (!var3.field2777 && method3573(var3) && Statics.field1564 != var3) {
                        continue;
                    }
                    method1340(arg0, var3.field2651);
                    if (var3.field2743 != null) {
                        method1340(var3.field2743, var3.field2651);
                    }
                    class4 var4 = (class4) field421.method3354((long) var3.field2651);
                    if (var4 != null) {
                        int var5 = var4.field53;
                        if (class164.method2633(var5)) {
                            method1340(Statics.field2642[var5], -1);
                        }
                    }
                }
                if (var3.field2653 == 6) {
                    if (var3.field2696 != -1 || var3.field2697 != -1) {
                        boolean var6 = method143(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2697;
                        } else {
                            var7 = var3.field2696;
                        }
                        if (var7 != -1) {
                            class40 var8 = class40.method122(var7);
                            var3.field2772 += field334;
                            while (var3.field2772 > var8.field938[var3.field2771]) {
                                var3.field2772 -= var8.field938[var3.field2771];
                                var3.field2771++;
                                if (var3.field2771 >= var8.field936.length) {
                                    var3.field2771 -= var8.field940;
                                    if (var3.field2771 < 0 || var3.field2771 >= var8.field936.length) {
                                        var3.field2771 = 0;
                                    }
                                }
                                method2103(var3);
                            }
                        }
                    }
                    if (var3.field2705 != 0 && !var3.field2777) {
                        int var9 = var3.field2705 >> 16;
                        int var10 = var3.field2705 << 16 >> 16;
                        int var11 = field334 * var9;
                        int var12 = field334 * var10;
                        var3.field2776 = var3.field2776 + var11 & 0x7FF;
                        var3.field2701 = var3.field2701 + var12 & 0x7FF;
                        method2103(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.do(II)V")
    public static final void method157(int arg0) {
        method2926();
        for (class22 var1 = (class22) class22.field577.method3382(); var1 != null; var1 = (class22) class22.field577.method3384()) {
            if (var1.field581 != null) {
                var1.method506();
            }
        }
        int var2 = class48.method571(arg0).field1091;
        if (var2 == 0) {
            return;
        }
        int var3 = class167.field2805[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class86.method1810(0.9D);
                ((class90) Statics.field1509).method1880(0.9D);
            }
            if (var3 == 2) {
                class86.method1810(0.8D);
                ((class90) Statics.field1509).method1880(0.8D);
            }
            if (var3 == 3) {
                class86.method1810(0.7D);
                ((class90) Statics.field1509).method1880(0.7D);
            }
            if (var3 == 4) {
                class86.method1810(0.6D);
                ((class90) Statics.field1509).method1880(0.6D);
            }
            class47.method2658();
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
                if (field499 == 0 && field500 != -1) {
                    class174.method167(Statics.field819, field500, 0, var4, false);
                    field501 = false;
                } else if (var4 == 0) {
                    class174.method2070();
                    field501 = false;
                } else {
                    Statics.method147(var4);
                }
                field499 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field265 = 127;
            }
            if (var3 == 1) {
                field265 = 96;
            }
            if (var3 == 2) {
                field265 = 64;
            }
            if (var3 == 3) {
                field265 = 32;
            }
            if (var3 == 4) {
                field265 = 0;
            }
        }
        if (var2 == 5) {
            field399 = var3;
        }
        if (var2 == 6) {
            field422 = var3;
        }
        if (var2 == 9) {
            field304 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field383 = 127;
            }
            if (var3 == 1) {
                field383 = 96;
            }
            if (var3 == 2) {
                field383 = 64;
            }
            if (var3 == 3) {
                field383 = 32;
            }
            if (var3 == 4) {
                field383 = 0;
            }
        }
        if (var2 == 17) {
            field428 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class19[] var5 = new class19[] { class19.field542, class19.field541, class19.field545 };
            field437 = (class19) class101.method146(var5, var3);
            if (field437 == null) {
                field437 = class19.field541;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field391 = -1;
        } else {
            field391 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("eg.dn(I)V")
    public static final void method2821() {
        field521.method2402(111);
        for (class4 var0 = (class4) field421.method3345(); var0 != null; var0 = (class4) field421.method3358()) {
            if (var0.field49 == 0 || var0.field49 == 3) {
                method75(var0, true);
            }
        }
        if (field276 != null) {
            method2103(field276);
            field276 = null;
        }
    }

    @ObfuscatedName("gi.df(IIII)Le;")
    public static final class4 method3492(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field53 = arg1;
        var3.field49 = arg2;
        field421.method3346(var3, (long) arg0);
        method606(arg1);
        class164 var4 = class164.method2517(arg0);
        method2103(var4);
        if (field276 != null) {
            method2103(field276);
            field276 = null;
        }
        method105();
        method2754(Statics.field2642[arg0 >> 16], var4, false);
        class34.method517(arg1);
        if (field420 != -1) {
            method73(field420, 1);
        }
        return var3;
    }

    @ObfuscatedName("q.dy(Le;ZI)V")
    public static final void method75(class4 arg0, boolean arg1) {
        int var2 = arg0.field53;
        int var3 = (int) arg0.field3013;
        arg0.method3474();
        if (arg1) {
            class164.method872(var2);
        }
        method1901(var2);
        class164 var4 = class164.method2517(var3);
        if (var4 != null) {
            method2103(var4);
        }
        method105();
        if (field420 != -1) {
            method73(field420, 1);
        }
    }

    @ObfuscatedName("bx.db(Lfq;I)Z")
    public static final boolean method1431(class164 arg0) {
        int var1 = arg0.field2655;
        if (var1 == 205) {
            field309 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field535.method3057(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field535.method3054(var4, var5 == 1);
        }
        if (var1 == 324) {
            field535.method3055(false);
        }
        if (var1 == 325) {
            field535.method3055(true);
        }
        if (var1 == 326) {
            field521.method2402(189);
            field535.method3056(field521);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("e.da(Lfq;IIII)V")
    public static final void method28(class164 arg0, int arg1, int arg2, int arg3) {
        method824();
        class166 var4 = arg0.method2991();
        if (var4 == null) {
            return;
        }
        class75.method1566(arg1, arg2, var4.field2791 + arg1, var4.field2790 + arg2);
        if (field523 == 2 || field523 == 5) {
            class75.method1536(arg1, arg2, 0, var4.field2792, var4.field2789);
        } else {
            int var5 = field404 + field342 & 0x7FF;
            int var6 = Statics.field633.field777 / 32 + 48;
            int var7 = 464 - Statics.field633.field757 / 32;
            Statics.field1604.method1478(arg1, arg2, var4.field2791, var4.field2790, var6, var7, var5, field291 + 256, var4.field2792, var4.field2789);
            for (int var8 = 0; var8 < field511; var8++) {
                int var9 = field338[var8] * 4 + 2 - Statics.field633.field777 / 32;
                int var10 = field494[var8] * 4 + 2 - Statics.field633.field757 / 32;
                method3051(arg1, arg2, var9, var10, field495[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class190 var13 = field465[Statics.field863][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field633.field777 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field633.field757 / 32;
                        method3051(arg1, arg2, var14, var15, Statics.field2095[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field296; var16++) {
                class32 var17 = field536[field297[var16]];
                if (var17 != null && var17.method13()) {
                    class37 var18 = var17.field725;
                    if (var18 != null && var18.field854 != null) {
                        var18 = var18.method671();
                    }
                    if (var18 != null && var18.field833 && var18.field857) {
                        int var19 = var17.field777 / 32 - Statics.field633.field777 / 32;
                        int var20 = var17.field757 / 32 - Statics.field633.field757 / 32;
                        method3051(arg1, arg2, var19, var20, Statics.field2095[1], var4);
                    }
                }
            }
            for (int var21 = 0; var21 < field317; var21++) {
                class3 var22 = field262[field379[var21]];
                if (var22 != null && var22.method13() && !var22.field28) {
                    int var23 = var22.field777 / 32 - Statics.field633.field777 / 32;
                    int var24 = var22.field757 / 32 - Statics.field633.field757 / 32;
                    boolean var25 = false;
                    if (method21(var22.field30, true)) {
                        var25 = true;
                    }
                    boolean var26 = false;
                    for (int var27 = 0; var27 < Statics.field601; var27++) {
                        if (var22.field30.equals(Statics.field2490[var27].field599)) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (Statics.field633.field46 != 0 && var22.field46 != 0 && Statics.field633.field46 == var22.field46) {
                        var28 = true;
                    }
                    if (var25) {
                        method3051(arg1, arg2, var23, var24, Statics.field2095[3], var4);
                    } else if (var28) {
                        method3051(arg1, arg2, var23, var24, Statics.field2095[4], var4);
                    } else if (var26) {
                        method3051(arg1, arg2, var23, var24, Statics.field2095[5], var4);
                    } else {
                        method3051(arg1, arg2, var23, var24, Statics.field2095[2], var4);
                    }
                }
            }
            if (field365 != 0 && field268 % 20 < 10) {
                if (field365 == 1 && field513 >= 0 && field513 < field536.length) {
                    class32 var29 = field536[field513];
                    if (var29 != null) {
                        int var30 = var29.field777 / 32 - Statics.field633.field777 / 32;
                        int var31 = var29.field757 / 32 - Statics.field633.field757 / 32;
                        method32(arg1, arg2, var30, var31, Statics.field2031[1], var4);
                    }
                }
                if (field365 == 2) {
                    int var32 = field279 * 4 - Statics.field1903 * 4 + 2 - Statics.field633.field777 / 32;
                    int var33 = field280 * 4 - Statics.field311 * 4 + 2 - Statics.field633.field757 / 32;
                    method32(arg1, arg2, var32, var33, Statics.field2031[1], var4);
                }
                if (field365 == 10 && field278 >= 0 && field278 < field262.length) {
                    class3 var34 = field262[field278];
                    if (var34 != null) {
                        int var35 = var34.field777 / 32 - Statics.field633.field777 / 32;
                        int var36 = var34.field757 / 32 - Statics.field633.field757 / 32;
                        method32(arg1, arg2, var35, var36, Statics.field2031[1], var4);
                    }
                }
            }
            if (field496 != 0) {
                int var37 = field496 * 4 + 2 - Statics.field633.field777 / 32;
                int var38 = field302 * 4 + 2 - Statics.field633.field757 / 32;
                method3051(arg1, arg2, var37, var38, Statics.field2031[0], var4);
            }
            if (!Statics.field633.field28) {
                class75.method1567(var4.field2791 / 2 + arg1 - 1, var4.field2790 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field468[arg3] = true;
    }

    @ObfuscatedName("e.dv(IIIILbl;Lfl;I)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3051(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field404 + field342 & 0x7FF;
        int var8 = class86.field1512[var7];
        int var9 = class86.field1513[var7];
        int var10 = var8 * 256 / (field291 + 256);
        int var11 = var9 * 256 / (field291 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1832.method1456(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("ft.dx(IIIILbl;Lfl;I)V")
    public static final void method3051(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field404 + field342 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class86.field1512[var6];
        int var9 = class86.field1513[var6];
        int var10 = var8 * 256 / (field291 + 256);
        int var11 = var9 * 256 / (field291 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1477(arg5.field2791 / 2 + var12 - arg4.field1333 / 2, arg5.field2790 / 2 - var13 - arg4.field1334 / 2, arg0, arg1, arg5.field2791, arg5.field2790, arg5.field2792, arg5.field2789);
        } else {
            arg4.method1467(arg5.field2791 / 2 + arg0 + var12 - arg4.field1333 / 2, arg5.field2790 / 2 + arg1 - var13 - arg4.field1334 / 2);
        }
    }

    @ObfuscatedName("i.dz(Ljava/lang/String;ZS)Z")
    public static boolean method21(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class155.method2657(arg0, Statics.field316);
        for (int var3 = 0; var3 < field254; var3++) {
            if (var2.equalsIgnoreCase(class155.method2657(field449[var3].field233, Statics.field316)) && (!arg1 || field449[var3].field230 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class155.method2657(Statics.field633.field30, Statics.field316))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("el.dc(Ljava/lang/String;I)Z")
    public static boolean method2659(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class155.method2657(arg0, Statics.field316);
        for (int var2 = 0; var2 < field533; var2++) {
            class8 var3 = field534[var2];
            if (var1.equalsIgnoreCase(class155.method2657(var3.field122, Statics.field316))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class155.method2657(var3.field119, Statics.field316))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("eb.dk(Ljava/lang/String;B)V")
    public static final void method2783(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method2657(arg0, Statics.field316);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field254; var2++) {
            class17 var3 = field449[var2];
            String var4 = var3.field233;
            String var5 = class155.method2657(var4, Statics.field316);
            if (class121.method24(arg0, var1, var4, var5)) {
                field254--;
                for (int var6 = var2; var6 < field254; var6++) {
                    field449[var6] = field449[var6 + 1];
                }
                field275 = field445;
                field521.method2402(210);
                class114 var7 = field521;
                int var8 = arg0.length() + 1;
                var7.method2140(var8);
                field521.method2146(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("du.dj(Ljava/lang/String;I)V")
    public static final void method2102(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method2657(arg0, Statics.field316);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field533; var2++) {
            class8 var3 = field534[var2];
            String var4 = var3.field122;
            String var5 = class155.method2657(var4, Statics.field316);
            if (class121.method24(arg0, var1, var4, var5)) {
                field533--;
                for (int var6 = var2; var6 < field533; var6++) {
                    field534[var6] = field534[var6 + 1];
                }
                field275 = field445;
                field521.method2402(182);
                class114 var7 = field521;
                int var8 = arg0.length() + 1;
                var7.method2140(var8);
                field521.method2146(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ef.de(Ljava/lang/String;IB)V")
    public static final void method2632(String arg0, int arg1) {
        field521.method2402(218);
        class114 var2 = field521;
        int var3 = arg0.length() + 1;
        var2.method2140(var3 + 1);
        field521.method2140(arg1);
        field521.method2146(arg0);
    }

    @ObfuscatedName("ay.dh(Ljava/lang/String;I)V")
    public static final void method871(String arg0) {
        if (Statics.field2490 == null) {
            return;
        }
        field521.method2402(105);
        class114 var1 = field521;
        int var2 = arg0.length() + 1;
        var1.method2140(var2);
        field521.method2146(arg0);
    }

    @ObfuscatedName("fh.dq(Ljava/lang/String;I)V")
    public static final void method2855(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        field521.method2402(117);
        class114 var1 = field521;
        int var2 = arg0.length() + 1;
        var1.method2140(var2);
        field521.method2146(arg0);
    }

    @ObfuscatedName("au.dm(B)V")
    public static final void method636() {
        field521.method2402(117);
        field521.method2140(0);
    }

    @ObfuscatedName("ci.dp(IB)V")
    public static void method1901(int arg0) {
        for (class192 var1 = (class192) field464.method3345(); var1 != null; var1 = (class192) field464.method3358()) {
            if ((var1.field3013 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3474();
            }
        }
    }

    @ObfuscatedName("ar.ds(Lfq;I)I")
    public static int method573(class164 arg0) {
        class192 var1 = (class192) field464.method3354(((long) arg0.field2651 << 32) + (long) arg0.field2652);
        return var1 == null ? arg0.field2721 : var1.field2999;
    }

    @ObfuscatedName("fd.dr(Lfq;I)Lfq;")
    public static class164 method2889(class164 arg0) {
        int var1 = class169.method2837(method573(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class164.method2517(arg0.field2774);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("hz.dg(Lfq;B)Z")
    public static boolean method3573(class164 arg0) {
        if (field392) {
            if (method573(arg0) != 0) {
                return false;
            }
            if (arg0.field2653 == 0) {
                return false;
            }
        }
        return arg0.field2671;
    }

    @ObfuscatedName("d.en(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method552(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field493 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field493 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field493 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field493 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field493 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1525 != null) {
            var3 = "/p=" + Statics.field1525;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field423 + "/a=" + Statics.field1865 + var3 + "/";
    }

    @ObfuscatedName("ck.eh(Ljava/lang/String;I)V")
    public static void method1801(String arg0) {
        Statics.field1525 = arg0;
        try {
            String var1 = Statics.field430.getParameter(class181.field2959.field2962);
            String var2 = Statics.field430.getParameter(class181.field2960.field2962);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class107.method2784() + 94608000000L;
                class103.field1836.setTime(new Date(var6));
                int var8 = class103.field1836.get(7);
                int var9 = class103.field1836.get(5);
                int var10 = class103.field1836.get(2);
                int var11 = class103.field1836.get(1);
                int var12 = class103.field1836.get(11);
                int var13 = class103.field1836.get(12);
                int var14 = class103.field1836.get(13);
                String var15 = class103.field1834[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class103.field1835[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field430;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }
}

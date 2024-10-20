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
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.u")
    public static boolean field338 = true;

    @ObfuscatedName("client.k")
    public static int field260 = 1;

    @ObfuscatedName("client.j")
    public static int field461 = 0;

    @ObfuscatedName("client.g")
    public static int field520 = 0;

    @ObfuscatedName("client.a")
    public static boolean field263 = false;

    @ObfuscatedName("client.v")
    public static boolean field259 = false;

    @ObfuscatedName("client.c")
    public static int field265 = 0;

    @ObfuscatedName("client.b")
    public static int field382 = 0;

    @ObfuscatedName("client.f")
    public static boolean field267 = true;

    @ObfuscatedName("client.d")
    public static int field423 = 0;

    @ObfuscatedName("client.q")
    public static long field345 = -1L;

    @ObfuscatedName("client.w")
    public static class108[] field433 = new class108[4];

    @ObfuscatedName("client.z")
    public static int field270 = -1;

    @ObfuscatedName("client.t")
    public static int field271 = -1;

    @ObfuscatedName("client.aq")
    public static int field406 = -1;

    @ObfuscatedName("client.an")
    public static boolean field326 = true;

    @ObfuscatedName("client.av")
    public static boolean field274 = false;

    @ObfuscatedName("client.ac")
    public static int field306 = 0;

    @ObfuscatedName("client.ar")
    public static int field276 = 0;

    @ObfuscatedName("client.ah")
    public static int field277 = 0;

    @ObfuscatedName("client.ab")
    public static int field278 = 0;

    @ObfuscatedName("client.au")
    public static int field524 = 0;

    @ObfuscatedName("client.ao")
    public static int field459 = 0;

    @ObfuscatedName("client.am")
    public static int field281 = 0;

    @ObfuscatedName("client.aa")
    public static int field282 = 0;

    @ObfuscatedName("client.aj")
    public static int field283 = 0;

    @ObfuscatedName("client.az")
    public static class21 field344 = class21.field541;

    @ObfuscatedName("client.af")
    public static int field285 = 0;

    @ObfuscatedName("client.ax")
    public static int field452 = 0;

    @ObfuscatedName("client.ag")
    public static int field288 = 0;

    @ObfuscatedName("client.bo")
    public static int field397 = 0;

    @ObfuscatedName("client.be")
    public static int field514 = 0;

    @ObfuscatedName("client.by")
    public static int field292 = 0;

    @ObfuscatedName("client.bc")
    public static int field293 = 0;

    @ObfuscatedName("client.bm")
    public static int field466 = 0;

    @ObfuscatedName("client.cs")
    public static class35[] field296 = new class35[32768];

    @ObfuscatedName("client.cz")
    public static int field297 = 0;

    @ObfuscatedName("client.cc")
    public static int[] field298 = new int[32768];

    @ObfuscatedName("client.ci")
    public static int field299 = 0;

    @ObfuscatedName("client.cx")
    public static int[] field499 = new int[250];

    @ObfuscatedName("client.cb")
    public static class122 field301 = new class122(5000);

    @ObfuscatedName("client.cm")
    public static class122 field302 = new class122(5000);

    @ObfuscatedName("client.cp")
    public static class122 field428 = new class122(15000);

    @ObfuscatedName("client.ck")
    public static int field304 = 0;

    @ObfuscatedName("client.cu")
    public static int field305 = 0;

    @ObfuscatedName("client.cf")
    public static int field268 = 0;

    @ObfuscatedName("client.cj")
    public static int field307 = 0;

    @ObfuscatedName("client.cl")
    public static int field272 = 0;

    @ObfuscatedName("client.cq")
    public static int field309 = 0;

    @ObfuscatedName("client.co")
    public static int field310 = 0;

    @ObfuscatedName("client.ce")
    public static int field489 = 0;

    @ObfuscatedName("client.cw")
    public static boolean field512 = false;

    @ObfuscatedName("client.dl")
    public static int field497 = 0;

    @ObfuscatedName("client.dp")
    public static int field314 = 1;

    @ObfuscatedName("client.dm")
    public static int field315 = 0;

    @ObfuscatedName("client.dk")
    public static int field316 = 1;

    @ObfuscatedName("client.dt")
    public static int field317 = 0;

    @ObfuscatedName("client.dg")
    public static boolean field322 = false;

    @ObfuscatedName("client.ds")
    public static int[][][] field320 = new int[4][13][13];

    @ObfuscatedName("client.dw")
    public static final int[] field465 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.do")
    public static int field482 = 0;

    @ObfuscatedName("client.dj")
    public static int field323 = 2;

    @ObfuscatedName("client.dh")
    public static int field324 = 0;

    @ObfuscatedName("client.dz")
    public static int field269 = 2;

    @ObfuscatedName("client.dv")
    public static int field390 = 0;

    @ObfuscatedName("client.di")
    public static int field342 = 1;

    @ObfuscatedName("client.en")
    public static int field318 = 0;

    @ObfuscatedName("client.ef")
    public static int field329 = 0;

    @ObfuscatedName("client.ec")
    public static int field330 = 2;

    @ObfuscatedName("client.ee")
    public static int field492 = 0;

    @ObfuscatedName("client.ej")
    public static int field332 = 1;

    @ObfuscatedName("client.eh")
    public static int field333 = 0;

    @ObfuscatedName("client.ew")
    public static int field334 = 0;

    @ObfuscatedName("client.ek")
    public static int field337 = 2301979;

    @ObfuscatedName("client.ei")
    public static int field530 = 5063219;

    @ObfuscatedName("client.eg")
    public static int field311 = 3353893;

    @ObfuscatedName("client.ez")
    public static int field325 = 7759444;

    @ObfuscatedName("client.er")
    public static boolean field341 = false;

    @ObfuscatedName("client.em")
    public static int field287 = 0;

    @ObfuscatedName("client.fz")
    public static int field343 = 128;

    @ObfuscatedName("client.fv")
    public static int field273 = 0;

    @ObfuscatedName("client.fp")
    public static int field506 = 0;

    @ObfuscatedName("client.fq")
    public static int field516 = 0;

    @ObfuscatedName("client.fw")
    public static int field261 = 0;

    @ObfuscatedName("client.fx")
    public static int field348 = 0;

    @ObfuscatedName("client.fl")
    public static int field349 = 50;

    @ObfuscatedName("client.fc")
    public static int field455 = 0;

    @ObfuscatedName("client.fo")
    public static boolean field351 = false;

    @ObfuscatedName("client.fd")
    public static int field352 = 0;

    @ObfuscatedName("client.fb")
    public static int field353 = 0;

    @ObfuscatedName("client.ft")
    public static int field354 = 50;

    @ObfuscatedName("client.fk")
    public static int[] field266 = new int[field354];

    @ObfuscatedName("client.ff")
    public static int[] field279 = new int[field354];

    @ObfuscatedName("client.fu")
    public static int[] field357 = new int[field354];

    @ObfuscatedName("client.fs")
    public static int[] field358 = new int[field354];

    @ObfuscatedName("client.fn")
    public static int[] field413 = new int[field354];

    @ObfuscatedName("client.fr")
    public static int[] field360 = new int[field354];

    @ObfuscatedName("client.fg")
    public static int[] field415 = new int[field354];

    @ObfuscatedName("client.gn")
    public static String[] field362 = new String[field354];

    @ObfuscatedName("client.gz")
    public static int[][] field363 = new int[104][104];

    @ObfuscatedName("client.gf")
    public static int field364 = 0;

    @ObfuscatedName("client.gi")
    public static int field365 = -1;

    @ObfuscatedName("client.gr")
    public static int field366 = -1;

    @ObfuscatedName("client.gm")
    public static int field421 = 0;

    @ObfuscatedName("client.ga")
    public static int field371 = 0;

    @ObfuscatedName("client.gj")
    public static int field264 = 0;

    @ObfuscatedName("client.go")
    public static int field370 = 0;

    @ObfuscatedName("client.gt")
    public static int field313 = 0;

    @ObfuscatedName("client.gl")
    public static int field372 = 0;

    @ObfuscatedName("client.gp")
    public static int field368 = 0;

    @ObfuscatedName("client.gy")
    public static int field374 = 0;

    @ObfuscatedName("client.gw")
    public static int field290 = 0;

    @ObfuscatedName("client.gc")
    public static int field308 = 0;

    @ObfuscatedName("client.gk")
    public static boolean field377 = false;

    @ObfuscatedName("client.gu")
    public static int field378 = 0;

    @ObfuscatedName("client.gx")
    public static int field379 = 0;

    @ObfuscatedName("client.ge")
    public static class3[] field469 = new class3[2048];

    @ObfuscatedName("client.gq")
    public static int field381 = -1;

    @ObfuscatedName("client.gs")
    public static int field339 = 0;

    @ObfuscatedName("client.hq")
    public static int field383 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field384 = new int[1000];

    @ObfuscatedName("client.ha")
    public static final int[] field438 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hv")
    public static String[] field407 = new String[8];

    @ObfuscatedName("client.hc")
    public static boolean[] field387 = new boolean[8];

    @ObfuscatedName("client.hf")
    public static int[] field388 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hy")
    public static int field389 = -1;

    @ObfuscatedName("client.hx")
    public static class199[][][] field359 = new class199[4][104][104];

    @ObfuscatedName("client.hp")
    public static class199 field391 = new class199();

    @ObfuscatedName("client.hm")
    public static class199 field392 = new class199();

    @ObfuscatedName("client.hl")
    public static class199 field393 = new class199();

    @ObfuscatedName("client.hn")
    public static int[] field394 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field395 = new int[25];

    @ObfuscatedName("client.ht")
    public static int[] field396 = new int[25];

    @ObfuscatedName("client.hu")
    public static int field523 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field398 = false;

    @ObfuscatedName("client.hr")
    public static int field399 = 0;

    @ObfuscatedName("client.hk")
    public static int[] field400 = new int[500];

    @ObfuscatedName("client.hi")
    public static int[] field401 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field402 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field403 = new int[500];

    @ObfuscatedName("client.iu")
    public static String[] field404 = new String[500];

    @ObfuscatedName("client.if")
    public static String[] field405 = new String[500];

    @ObfuscatedName("client.ih")
    public static int field319 = -1;

    @ObfuscatedName("client.is")
    public static int field458 = -1;

    @ObfuscatedName("client.iv")
    public static int field408 = 0;

    @ObfuscatedName("client.im")
    public static int field376 = 50;

    @ObfuscatedName("client.ij")
    public static int field420 = 0;

    @ObfuscatedName("client.it")
    public static String field536 = null;

    @ObfuscatedName("client.il")
    public static boolean field327 = false;

    @ObfuscatedName("client.io")
    public static int field373 = -1;

    @ObfuscatedName("client.ik")
    public static int field414 = -1;

    @ObfuscatedName("client.ib")
    public static String field450 = null;

    @ObfuscatedName("client.in")
    public static String field340 = null;

    @ObfuscatedName("client.iw")
    public static int field262 = -1;

    @ObfuscatedName("client.iy")
    public static class196 field517 = new class196(8);

    @ObfuscatedName("client.ia")
    public static int field419 = 0;

    @ObfuscatedName("client.js")
    public static int field280 = 0;

    @ObfuscatedName("client.jl")
    public static class173 field416 = null;

    @ObfuscatedName("client.jm")
    public static int field422 = 0;

    @ObfuscatedName("client.jn")
    public static int field294 = 0;

    @ObfuscatedName("client.jj")
    public static int field493 = 0;

    @ObfuscatedName("client.jg")
    public static int field441 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field426 = false;

    @ObfuscatedName("client.ja")
    public static boolean field427 = false;

    @ObfuscatedName("client.jx")
    public static boolean field453 = false;

    @ObfuscatedName("client.jp")
    public static class173 field429 = null;

    @ObfuscatedName("client.jb")
    public static class173 field430 = null;

    @ObfuscatedName("client.jt")
    public static class173 field431 = null;

    @ObfuscatedName("client.jd")
    public static int field432 = 0;

    @ObfuscatedName("client.ji")
    public static int field321 = 0;

    @ObfuscatedName("client.jk")
    public static class173 field434 = null;

    @ObfuscatedName("client.jr")
    public static boolean field533 = false;

    @ObfuscatedName("client.jc")
    public static int field436 = -1;

    @ObfuscatedName("client.jh")
    public static int field437 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field503 = false;

    @ObfuscatedName("client.jv")
    public static int field439 = -1;

    @ObfuscatedName("client.ju")
    public static int field440 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field312 = false;

    @ObfuscatedName("client.kt")
    public static int field442 = 1;

    @ObfuscatedName("client.kz")
    public static int[] field443 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field444 = 0;

    @ObfuscatedName("client.kg")
    public static int[] field445 = new int[32];

    @ObfuscatedName("client.km")
    public static int field446 = 0;

    @ObfuscatedName("client.ke")
    public static int[] field447 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field448 = 0;

    @ObfuscatedName("client.kh")
    public static int field449 = 0;

    @ObfuscatedName("client.kx")
    public static int field361 = 0;

    @ObfuscatedName("client.ko")
    public static int field451 = 0;

    @ObfuscatedName("client.kk")
    public static int field369 = 0;

    @ObfuscatedName("client.kc")
    public static int field291 = 0;

    @ObfuscatedName("client.kq")
    public static int field454 = 0;

    @ObfuscatedName("client.kn")
    public static int field425 = 0;

    @ObfuscatedName("client.ks")
    public static class199 field456 = new class199();

    @ObfuscatedName("client.kf")
    public static class199 field457 = new class199();

    @ObfuscatedName("client.kw")
    public static class199 field435 = new class199();

    @ObfuscatedName("client.ku")
    public static class196 field510 = new class196(512);

    @ObfuscatedName("client.kr")
    public static int field460 = 0;

    @ObfuscatedName("client.kd")
    public static int field300 = -2;

    @ObfuscatedName("client.kb")
    public static boolean[] field462 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field463 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static boolean[] field464 = new boolean[100];

    @ObfuscatedName("client.la")
    public static int[] field258 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field380 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field467 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field468 = new int[100];

    @ObfuscatedName("client.lm")
    public static int field412 = 0;

    @ObfuscatedName("client.lk")
    public static long field470 = 0L;

    @ObfuscatedName("client.lw")
    public static boolean field471 = true;

    @ObfuscatedName("client.lg")
    public static int field472 = 765;

    @ObfuscatedName("client.lf")
    public static int field473 = 1;

    @ObfuscatedName("client.ly")
    public static int[] field501 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lb")
    public static int field475 = 0;

    @ObfuscatedName("client.lr")
    public static int field289 = 0;

    @ObfuscatedName("client.lz")
    public static String field477 = "";

    @ObfuscatedName("client.ll")
    public static long[] field478 = new long[100];

    @ObfuscatedName("client.lj")
    public static int field479 = 0;

    @ObfuscatedName("client.ls")
    public static int field480 = 0;

    @ObfuscatedName("client.ln")
    public static int[] field481 = new int[128];

    @ObfuscatedName("client.mt")
    public static int[] field367 = new int[128];

    @ObfuscatedName("client.mg")
    public static long field483 = -1L;

    @ObfuscatedName("client.ms")
    public static String field484 = null;

    @ObfuscatedName("client.mw")
    public static String field485 = null;

    @ObfuscatedName("client.mz")
    public static int field486 = -1;

    @ObfuscatedName("client.mx")
    public static int field409 = 0;

    @ObfuscatedName("client.mh")
    public static int[] field488 = new int[1000];

    @ObfuscatedName("client.mk")
    public static int[] field355 = new int[1000];

    @ObfuscatedName("client.ma")
    public static class79[] field490 = new class79[1000];

    @ObfuscatedName("client.mp")
    public static int field491 = 0;

    @ObfuscatedName("client.my")
    public static int field519 = 0;

    @ObfuscatedName("client.mq")
    public static int field474 = 0;

    @ObfuscatedName("client.mv")
    public static int field411 = 255;

    @ObfuscatedName("client.mf")
    public static int field495 = -1;

    @ObfuscatedName("client.mc")
    public static boolean field496 = false;

    @ObfuscatedName("client.nw")
    public static int field418 = 127;

    @ObfuscatedName("client.ni")
    public static int field498 = 127;

    @ObfuscatedName("client.ne")
    public static int field386 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field500 = new int[50];

    @ObfuscatedName("client.no")
    public static int[] field275 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field502 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field424 = new int[50];

    @ObfuscatedName("client.nf")
    public static class59[] field504 = new class59[50];

    @ObfuscatedName("client.nd")
    public static boolean field505 = false;

    @ObfuscatedName("client.nx")
    public static boolean[] field350 = new boolean[5];

    @ObfuscatedName("client.og")
    public static int[] field507 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field508 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field509 = new int[5];

    @ObfuscatedName("client.op")
    public static int[] field328 = new int[5];

    @ObfuscatedName("client.oh")
    public static short field511 = 256;

    @ObfuscatedName("client.oc")
    public static short field526 = 205;

    @ObfuscatedName("client.ol")
    public static short field513 = 256;

    @ObfuscatedName("client.ot")
    public static short field476 = 320;

    @ObfuscatedName("client.oe")
    public static short field515 = 1;

    @ObfuscatedName("client.os")
    public static short field346 = 32767;

    @ObfuscatedName("client.oq")
    public static short field385 = 1;

    @ObfuscatedName("client.ov")
    public static short field487 = 32767;

    @ObfuscatedName("client.oo")
    public static int field375 = 0;

    @ObfuscatedName("client.od")
    public static int field257 = 0;

    @ObfuscatedName("client.oz")
    public static int field521 = 0;

    @ObfuscatedName("client.or")
    public static int field522 = 0;

    @ObfuscatedName("client.ok")
    public static int field347 = 0;

    @ObfuscatedName("client.on")
    public static int field410 = 0;

    @ObfuscatedName("client.oy")
    public static int field525 = 0;

    @ObfuscatedName("client.ob")
    public static class18[] field284 = new class18[400];

    @ObfuscatedName("client.oa")
    public static class195 field527 = new class195();

    @ObfuscatedName("client.of")
    public static int field528 = 0;

    @ObfuscatedName("client.oj")
    public static class8[] field529 = new class8[400];

    @ObfuscatedName("client.ow")
    public static class179 field417 = new class179();

    @ObfuscatedName("client.pm")
    public static int field531 = -1;

    @ObfuscatedName("client.pq")
    public static int field532 = -1;

    @ObfuscatedName("client.pj")
    public static class220[] field331 = new class220[8];

    @ObfuscatedName("client.pw")
    public static long field534 = -1L;

    @ObfuscatedName("client.py")
    public static long field535 = -1L;

    @ObfuscatedName("client.pa")
    public static final class11 field303 = new class11();

    @ObfuscatedName("client.px")
    public static int[] field537 = new int[50];

    @ObfuscatedName("client.pk")
    public static int[] field538 = new int[50];

    @ObfuscatedName("client.k(I)V")
    public final void method243() {
    }

    public final void init() {
        if (!this.method2888()) {
            return;
        }
        class190[] var1 = class190.method2308();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class190 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3036);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3036)) {
                    case 1:
                        field461 = Integer.parseInt(var4);
                        break;
                    case 2:
                        Statics.field154 = var4;
                        break;
                    case 3:
                        Statics.field3156 = var4;
                        break;
                    case 4:
                        Statics.field1943 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field2148 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field265 = Integer.parseInt(var4);
                        break;
                    case 7:
                        if (var4.equalsIgnoreCase(class2.field27)) {
                        }
                    case 8:
                    case 11:
                    case 13:
                    default:
                        break;
                    case 9:
                        field260 = Integer.parseInt(var4);
                        break;
                    case 10:
                        class154[] var10 = new class154[] { class154.field2254, class154.field2252, class154.field2255, class154.field2251, class154.field2261, class154.field2259 };
                        Statics.field2560 = (class154) class109.method995(var10, Integer.parseInt(var4));
                        if (Statics.field2560 == class154.field2255) {
                            Statics.field1826 = class212.field3111;
                        } else {
                            Statics.field1826 = class212.field3114;
                        }
                        break;
                    case 12:
                        int var5 = Integer.parseInt(var4);
                        class153[] var6 = class153.method957();
                        int var7 = 0;
                        class153 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class153 var8 = var6[var7];
                            if (var8.field2245 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field199 = var9;
                        break;
                    case 14:
                        if (var4.equalsIgnoreCase(class2.field27)) {
                            field263 = true;
                        } else {
                            field263 = false;
                        }
                        break;
                    case 15:
                        field520 = Integer.parseInt(var4);
                }
            }
        }
        method1594();
        Statics.field212 = this.getCodeBase().getHost();
        String var11 = Statics.field199.field2247;
        byte var12 = 0;
        try {
            Statics.field2204 = 16;
            Statics.field252 = var12;
            try {
                Statics.field3096 = System.getProperty("os.name");
            } catch (Exception var50) {
                Statics.field3096 = "Unknown";
            }
            Statics.field2196 = Statics.field3096.toLowerCase();
            try {
                Statics.field2046 = System.getProperty("user.home");
                if (Statics.field2046 != null) {
                    Statics.field2046 = Statics.field2046 + "/";
                }
            } catch (Exception var49) {
            }
            try {
                if (Statics.field2196.startsWith("win")) {
                    if (Statics.field2046 == null) {
                        Statics.field2046 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2046 == null) {
                    Statics.field2046 = System.getenv("HOME");
                }
                if (Statics.field2046 != null) {
                    Statics.field2046 = Statics.field2046 + "/";
                }
            } catch (Exception var48) {
            }
            if (Statics.field2046 == null) {
                Statics.field2046 = "~/";
            }
            Statics.field1936 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2046, "/tmp/", "" };
            Statics.field1175 = new String[] { ".jagex_cache_" + Statics.field252, ".file_store_" + Statics.field252 };
            int var16 = 0;
            label241: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field2202 = new File(Statics.field2046, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field2202.exists()) {
                    try {
                        class227 var21 = new class227(Statics.field2202, "rw", 10000L);
                        class119 var22 = new class119((int) var21.method3932());
                        while (var22.field1955 < var22.field1959.length) {
                            int var23 = var21.method3922(var22.field1959, var22.field1955, var22.field1959.length - var22.field1955);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field1955 += var23;
                        }
                        var22.field1955 = 0;
                        int var24 = var22.method2562();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method2562();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method2390();
                            if (var25 == 1) {
                                var19 = var22.method2390();
                            }
                        } else {
                            var18 = var22.method2412();
                            if (var25 == 1) {
                                var19 = var22.method2412();
                            }
                        }
                        var21.method3921();
                    } catch (IOException var52) {
                        var52.printStackTrace();
                    }
                    if (var18 != null) {
                        File var27 = new File(var18);
                        if (!var27.exists()) {
                            var18 = null;
                        }
                    }
                    if (var18 != null) {
                        File var28 = new File(var18, "test.dat");
                        if (!class149.method920(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label216: for (int var29 = 0; var29 < Statics.field1175.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field1936.length; var30++) {
                            File var31 = new File(Statics.field1936[var30] + Statics.field1175[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && class149.method920(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label216;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field2046 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
                    var20 = true;
                }
                if (var19 != null) {
                    File var32 = new File(var19);
                    File var33 = new File(var18);
                    try {
                        File[] var34 = var32.listFiles();
                        File[] var35 = var34;
                        for (int var36 = 0; var36 < var35.length; var36++) {
                            File var37 = var35[var36];
                            File var38 = new File(var33, var37.getName());
                            boolean var39 = var37.renameTo(var38);
                            if (!var39) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var51) {
                        var51.printStackTrace();
                    }
                    var20 = true;
                }
                if (var20) {
                    class149.method585(new File(var18), (File) null);
                }
                File var41 = new File(var18);
                Statics.field2203 = var41;
                if (!Statics.field2203.exists()) {
                    Statics.field2203.mkdirs();
                }
                File[] var42 = Statics.field2203.listFiles();
                if (var42 == null) {
                    break;
                }
                File[] var43 = var42;
                int var44 = 0;
                while (true) {
                    if (var44 >= var43.length) {
                        break label241;
                    }
                    File var45 = var43[var44];
                    if (!class149.method920(var45, false)) {
                        var16++;
                        break;
                    }
                    var44++;
                }
            }
            class135.method3517(Statics.field2203);
            class149.method2173();
            class149.field2207 = new class228(new class227(class135.method2996("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2205 = new class228(new class227(class135.method2996("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2209 = new class228[Statics.field2204];
            for (int var46 = 0; var46 < Statics.field2204; var46++) {
                Statics.field2209[var46] = new class228(new class227(class135.method2996("main_file_cache.idx" + var46), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var53) {
            class148.method1554((String) null, var53);
        }
        Statics.field494 = this;
        this.method2886(765, 503, 90);
    }

    @ObfuscatedName("bu.i(B)V")
    public static final void method1594() {
        class86.field1422 = false;
        field259 = false;
    }

    @ObfuscatedName("client.x(I)V")
    public final void method386() {
        Statics.field295 = field520 == 0 ? 43594 : field260 + 40000;
        Statics.field1979 = field520 == 0 ? 443 : field260 + 50000;
        Statics.field3188 = Statics.field295;
        Statics.field2577 = class174.field2868;
        Statics.field2875 = class174.field2866;
        Statics.field1724 = class174.field2867;
        Statics.field2899 = class174.field2865;
        class137.method185();
        class137.method3347(Statics.field1559);
        Canvas var1 = Statics.field1559;
        var1.addMouseListener(class140.field2131);
        var1.addMouseMotionListener(class140.field2131);
        var1.addFocusListener(class140.field2131);
        class145 var2;
        try {
            var2 = new class145();
        } catch (Throwable var16) {
            var2 = null;
        }
        Statics.field1401 = var2;
        if (Statics.field1401 != null) {
            Statics.field1401.method2711(Statics.field1559);
        }
        Statics.field88 = new class134(255, class149.field2207, class149.field2205, 500000);
        class227 var4 = null;
        class9 var5 = new class9();
        try {
            var4 = class149.method4("", Statics.field2560.field2256, false);
            byte[] var6 = new byte[(int) var4.method3932()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method3922(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class9(new class119(var6));
        } catch (Exception var17) {
        }
        try {
            if (var4 != null) {
                var4.method3921();
            }
        } catch (Exception var15) {
        }
        Statics.field2665 = var5;
        Statics.field1970 = this.getToolkit().getSystemClipboard();
        String var13 = Statics.field1575;
        class138.field2107 = this;
        class138.field2102 = var13;
        if (field520 != 0) {
            field274 = true;
        }
        int var14 = Statics.field2665.field134;
        field470 = 0L;
        if (var14 >= 2) {
            field471 = true;
        } else {
            field471 = false;
        }
        method1627();
        if (field382 >= 25) {
            method603();
        }
        field2162 = true;
    }

    @ObfuscatedName("client.g(B)V")
    public final void method424() {
        field423++;
        this.method249();
        class170.method750();
        class183.method2730();
        method3223();
        class137 var1 = class137.field2092;
        synchronized (class137.field2092) {
            class137.field2097++;
            class137.field2094 = class137.field2098;
            class137.field2093 = 0;
            if (class137.field2078 >= 0) {
                while (class137.field2088 != class137.field2078) {
                    int var3 = class137.field2087[class137.field2088];
                    class137.field2088 = class137.field2088 + 1 & 0x7F;
                    if (var3 < 0) {
                        class137.field2089[~var3] = false;
                    } else {
                        if (!class137.field2089[var3] && class137.field2093 < class137.field2084.length - 1) {
                            class137.field2084[++class137.field2093 - 1] = var3;
                        }
                        class137.field2089[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class137.field2089[var2] = false;
                }
                class137.field2078 = class137.field2088;
            }
            class137.field2098 = class137.field2095;
        }
        class140 var5 = class140.field2131;
        synchronized (class140.field2131) {
            class140.field2120 = class140.field2117;
            class140.field2121 = class140.field2115;
            class140.field2122 = class140.field2119;
            class140.field2130 = class140.field2123;
            class140.field2128 = class140.field2124;
            class140.field2129 = class140.field2125;
            class140.field2127 = class140.field2126;
            class140.field2123 = 0;
        }
        if (Statics.field1401 != null) {
            int var7 = Statics.field1401.method2703();
            field425 = var7;
        }
        if (field382 == 0) {
            method3000();
            class144.method1014();
        } else if (field382 == 5) {
            class32.method171(this);
            method3000();
            class144.method1014();
        } else if (field382 == 10 || field382 == 11) {
            class32.method171(this);
        } else if (field382 == 20) {
            class32.method171(this);
            method188();
        } else if (field382 == 25) {
            method165();
        }
        if (field382 == 30) {
            if (field306 > 1) {
                field306--;
            }
            if (field489 > 0) {
                field489--;
            }
            if (field512) {
                field512 = false;
                if (field489 > 0) {
                    method769();
                } else {
                    method781(40);
                    Statics.field839 = Statics.field1511;
                    Statics.field1511 = null;
                }
            } else {
                if (!field398) {
                    field404[0] = class157.field2468;
                    field405[0] = "";
                    field402[0] = 1006;
                    field399 = 1;
                }
                for (int var8 = 0; var8 < 100 && method132(); var8++) {
                }
                if (field382 == 30) {
                    while (class211.method196()) {
                        field301.method2648(239);
                        field301.method2366(0);
                        int var9 = field301.field1955;
                        class211.method3713(field301);
                        field301.method2533(field301.field1955 - var9);
                    }
                    Object var10 = Statics.field2042.field180;
                    synchronized (Statics.field2042.field180) {
                        if (!field338) {
                            Statics.field2042.field183 = 0;
                        } else if (class140.field2130 != 0 || Statics.field2042.field183 >= 40) {
                            field301.method2648(140);
                            field301.method2366(0);
                            int var11 = field301.field1955;
                            int var12 = 0;
                            for (int var13 = 0; var13 < Statics.field2042.field183 && field301.field1955 - var11 < 240; var13++) {
                                var12++;
                                int var14 = Statics.field2042.field185[var13];
                                if (var14 < 0) {
                                    var14 = 0;
                                } else if (var14 > 502) {
                                    var14 = 502;
                                }
                                int var15 = Statics.field2042.field181[var13];
                                if (var15 < 0) {
                                    var15 = 0;
                                } else if (var15 > 764) {
                                    var15 = 764;
                                }
                                int var16 = var14 * 765 + var15;
                                if (Statics.field2042.field185[var13] == -1 && Statics.field2042.field181[var13] == -1) {
                                    var15 = -1;
                                    var14 = -1;
                                    var16 = 524287;
                                }
                                if (field270 != var15 || field271 != var14) {
                                    int var17 = var15 - field270;
                                    field270 = var15;
                                    int var18 = var14 - field271;
                                    field271 = var14;
                                    if (field406 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                        var17 += 32;
                                        var18 += 32;
                                        field301.method2466((field406 << 12) + (var17 << 6) + var18);
                                        field406 = 0;
                                    } else if (field406 < 8) {
                                        field301.method2381((field406 << 19) + 8388608 + var16);
                                        field406 = 0;
                                    } else {
                                        field301.method2514((field406 << 19) + -1073741824 + var16);
                                        field406 = 0;
                                    }
                                } else if (field406 < 2047) {
                                    field406++;
                                }
                            }
                            field301.method2533(field301.field1955 - var11);
                            if (var12 >= Statics.field2042.field183) {
                                Statics.field2042.field183 = 0;
                            } else {
                                Statics.field2042.field183 -= var12;
                                for (int var19 = 0; var19 < Statics.field2042.field183; var19++) {
                                    Statics.field2042.field181[var19] = Statics.field2042.field181[var12 + var19];
                                    Statics.field2042.field185[var19] = Statics.field2042.field185[var12 + var19];
                                }
                            }
                        }
                    }
                    if (class140.field2130 == 1 || !Statics.field2882 && class140.field2130 == 4 || class140.field2130 == 2) {
                        long var21 = (class140.field2127 - field345) / 50L;
                        if (var21 > 4095L) {
                            var21 = 4095L;
                        }
                        field345 = class140.field2127;
                        int var23 = class140.field2129;
                        if (var23 < 0) {
                            var23 = 0;
                        } else if (var23 > Statics.field2210) {
                            var23 = Statics.field2210;
                        }
                        int var24 = class140.field2128;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 > Statics.field942) {
                            var24 = Statics.field942;
                        }
                        int var25 = (int) var21;
                        field301.method2648(49);
                        field301.method2466((class140.field2130 == 2 ? 1 : 0) + (var25 << 1));
                        field301.method2466(var24);
                        field301.method2466(var23);
                    }
                    if (class137.field2093 > 0) {
                        field301.method2648(137);
                        field301.method2466(0);
                        int var26 = field301.field1955;
                        long var27 = class115.method2177();
                        for (int var29 = 0; var29 < class137.field2093; var29++) {
                            long var30 = var27 - field483;
                            if (var30 > 16777215L) {
                                var30 = 16777215L;
                            }
                            field483 = var27;
                            field301.method2406(class137.field2084[var29]);
                            field301.method2580((int) var30);
                        }
                        field301.method2377(field301.field1955 - var26);
                    }
                    if (field455 > 0) {
                        field455--;
                    }
                    if (class137.field2089[96] || class137.field2089[97] || class137.field2089[98] || class137.field2089[99]) {
                        field351 = true;
                    }
                    if (field351 && field455 <= 0) {
                        field455 = 20;
                        field351 = false;
                        field301.method2648(26);
                        field301.method2496(field273);
                        field301.method2466(field343);
                    }
                    if (Statics.field2024 && !field326) {
                        field326 = true;
                        field301.method2648(42);
                        field301.method2366(1);
                    }
                    if (!Statics.field2024 && field326) {
                        field326 = false;
                        field301.method2648(42);
                        field301.method2366(0);
                    }
                    method68();
                    if (field382 == 30) {
                        method3006();
                        int var10002;
                        for (int var32 = 0; var32 < field386; var32++) {
                            var10002 = field502[var32]--;
                            if (field502[var32] >= -10) {
                                class59 var34 = field504[var32];
                                if (var34 == null) {
                                    class59 var10000 = (class59) null;
                                    var34 = class59.method1243(Statics.field732, field500[var32], 0);
                                    if (var34 == null) {
                                        continue;
                                    }
                                    field502[var32] += var34.method1253();
                                    field504[var32] = var34;
                                }
                                if (field502[var32] < 0) {
                                    int var41;
                                    if (field424[var32] == 0) {
                                        var41 = field418;
                                    } else {
                                        int var35 = (field424[var32] & 0xFF) * 128;
                                        int var36 = field424[var32] >> 16 & 0xFF;
                                        int var37 = var36 * 128 + 64 - Statics.field989.field815;
                                        if (var37 < 0) {
                                            var37 = -var37;
                                        }
                                        int var38 = field424[var32] >> 8 & 0xFF;
                                        int var39 = var38 * 128 + 64 - Statics.field989.field805;
                                        if (var39 < 0) {
                                            var39 = -var39;
                                        }
                                        int var40 = var37 + var39 - 128;
                                        if (var40 > var35) {
                                            field502[var32] = -100;
                                            continue;
                                        }
                                        if (var40 < 0) {
                                            var40 = 0;
                                        }
                                        var41 = field498 * (var35 - var40) / var35;
                                    }
                                    if (var41 > 0) {
                                        class63 var42 = var34.method1244().method1286(Statics.field2110);
                                        class65 var43 = class65.method1304(var42, 100, var41);
                                        var43.method1344(field275[var32] - 1);
                                        Statics.field1822.method1150(var43);
                                    }
                                    field502[var32] = -100;
                                }
                            } else {
                                field386--;
                                for (int var33 = var32; var33 < field386; var33++) {
                                    field500[var33] = field500[var33 + 1];
                                    field504[var33] = field504[var33 + 1];
                                    field275[var33] = field275[var33 + 1];
                                    field502[var33] = field502[var33 + 1];
                                    field424[var33] = field424[var33 + 1];
                                }
                                var32--;
                            }
                        }
                        if (field496 && !class183.method3280()) {
                            if (field411 != 0 && field495 != -1) {
                                class183.method1626(Statics.field773, field495, 0, field411, false);
                            }
                            field496 = false;
                        }
                        field268++;
                        if (field268 <= 750) {
                            int var44 = class33.field720;
                            int[] var45 = class33.field725;
                            for (int var46 = 0; var46 < var44; var46++) {
                                class3 var47 = field469[var45[var46]];
                                if (var47 != null) {
                                    method159(var47, 1);
                                }
                            }
                            method671();
                            int[] var48 = class33.field725;
                            for (int var49 = 0; var49 < class33.field720; var49++) {
                                class3 var50 = field469[var48[var49]];
                                if (var50 != null && var50.field793 > 0) {
                                    var50.field793--;
                                    if (var50.field793 == 0) {
                                        var50.field790 = null;
                                    }
                                }
                            }
                            for (int var51 = 0; var51 < field297; var51++) {
                                int var52 = field298[var51];
                                class35 var53 = field296[var52];
                                if (var53 != null && var53.field793 > 0) {
                                    var53.field793--;
                                    if (var53.field793 == 0) {
                                        var53.field790 = null;
                                    }
                                }
                            }
                            field334++;
                            if (field370 != 0) {
                                field264 += 20;
                                if (field264 >= 400) {
                                    field370 = 0;
                                }
                            }
                            if (Statics.field1564 != null) {
                                field313++;
                                if (field313 >= 15) {
                                    method172(Statics.field1564);
                                    Statics.field1564 = null;
                                }
                            }
                            class173 var54 = Statics.field742;
                            class173 var55 = Statics.field880;
                            Statics.field742 = null;
                            Statics.field880 = null;
                            field434 = null;
                            field503 = false;
                            field533 = false;
                            field480 = 0;
                            while (true) {
                                while (class137.method135() && field480 < 128) {
                                    if (field493 >= 2 && class137.field2089[82] && Statics.field1573 == 66) {
                                        String var56 = "";
                                        Iterator var57 = class12.field161.iterator();
                                        while (var57.hasNext()) {
                                            class36 var58 = (class36) var57.next();
                                            var56 = var56 + var58.field751 + ':' + var58.field754 + '\n';
                                        }
                                        Statics.field1970.setContents(new StringSelection(var56), (ClipboardOwner) null);
                                    } else {
                                        field367[field480] = Statics.field1573;
                                        field481[field480] = Statics.field2644;
                                        field480++;
                                    }
                                }
                                if (field262 != -1) {
                                    int var61 = field262;
                                    int var62 = Statics.field942;
                                    int var63 = Statics.field2210;
                                    if (class173.method2979(var61)) {
                                        method2860(Statics.field2766[var61], -1, 0, 0, var62, var63, 0, 0);
                                    }
                                }
                                field442++;
                                while (true) {
                                    class1 var64;
                                    class173 var65;
                                    class173 var66;
                                    do {
                                        var64 = (class1) field457.method3609();
                                        if (var64 == null) {
                                            while (true) {
                                                class1 var67;
                                                class173 var68;
                                                class173 var69;
                                                do {
                                                    var67 = (class1) field435.method3609();
                                                    if (var67 == null) {
                                                        while (true) {
                                                            class1 var70;
                                                            class173 var71;
                                                            class173 var72;
                                                            do {
                                                                var70 = (class1) field456.method3609();
                                                                if (var70 == null) {
                                                                    method681();
                                                                    if (field430 != null) {
                                                                        method3250();
                                                                    }
                                                                    if (Statics.field881 != null) {
                                                                        method172(Statics.field881);
                                                                        field378++;
                                                                        if (class140.field2120 == 0) {
                                                                            if (field377) {
                                                                                if (Statics.field881 == Statics.field121 && field368 != field308) {
                                                                                    class173 var73 = Statics.field881;
                                                                                    byte var74 = 0;
                                                                                    if (field280 == 1 && var73.field2735 == 206) {
                                                                                        var74 = 1;
                                                                                    }
                                                                                    if (var73.field2847[field308] <= 0) {
                                                                                        var74 = 0;
                                                                                    }
                                                                                    int var75 = method34(var73);
                                                                                    boolean var76 = (var75 >> 29 & 0x1) != 0;
                                                                                    if (var76) {
                                                                                        int var77 = field368;
                                                                                        int var78 = field308;
                                                                                        var73.field2847[var78] = var73.field2847[var77];
                                                                                        var73.field2848[var78] = var73.field2848[var77];
                                                                                        var73.field2847[var77] = -1;
                                                                                        var73.field2848[var77] = 0;
                                                                                    } else if (var74 == 1) {
                                                                                        int var79 = field368;
                                                                                        int var80 = field308;
                                                                                        while (var79 != var80) {
                                                                                            if (var79 > var80) {
                                                                                                var73.method3230(var79 - 1, var79);
                                                                                                var79--;
                                                                                            } else if (var79 < var80) {
                                                                                                var73.method3230(var79 + 1, var79);
                                                                                                var79++;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var73.method3230(field308, field368);
                                                                                    }
                                                                                    field301.method2648(114);
                                                                                    field301.method2415(field368);
                                                                                    field301.method2514(Statics.field881.field2732);
                                                                                    field301.method2415(field308);
                                                                                    field301.method2366(var74);
                                                                                }
                                                                            } else if ((field523 == 1 || method1994(field399 - 1)) && field399 > 2) {
                                                                                method2090(field374, field290);
                                                                            } else if (field399 > 0) {
                                                                                int var81 = field374;
                                                                                int var82 = field290;
                                                                                method154(Statics.field126, var81, var82);
                                                                                Statics.field126 = null;
                                                                            }
                                                                            field313 = 10;
                                                                            class140.field2130 = 0;
                                                                            Statics.field881 = null;
                                                                        } else if (field378 >= 5 && (class140.field2121 > field374 + 5 || class140.field2121 < field374 - 5 || class140.field2122 > field290 + 5 || class140.field2122 < field290 - 5)) {
                                                                            field377 = true;
                                                                        }
                                                                    }
                                                                    if (class86.field1465 != -1) {
                                                                        int var83 = class86.field1465;
                                                                        int var84 = class86.field1414;
                                                                        field301.method2648(174);
                                                                        field301.method2366(5);
                                                                        field301.method2415(Statics.field2112 + var83);
                                                                        field301.method2404(class137.field2089[82] ? (class137.field2089[81] ? 2 : 1) : 0);
                                                                        field301.method2466(Statics.field2677 + var84);
                                                                        class86.field1465 = -1;
                                                                        field421 = class140.field2128;
                                                                        field371 = class140.field2129;
                                                                        field370 = 1;
                                                                        field264 = 0;
                                                                        field491 = var83;
                                                                        field519 = var84;
                                                                    }
                                                                    if (Statics.field742 != var54) {
                                                                        if (var54 != null) {
                                                                            method172(var54);
                                                                        }
                                                                        if (Statics.field742 != null) {
                                                                            method172(Statics.field742);
                                                                        }
                                                                    }
                                                                    if (Statics.field880 != var55 && field408 == field376) {
                                                                        if (var55 != null) {
                                                                            method172(var55);
                                                                        }
                                                                        if (Statics.field880 != null) {
                                                                            method172(Statics.field880);
                                                                        }
                                                                    }
                                                                    if (Statics.field880 == null) {
                                                                        if (field408 > 0) {
                                                                            field408--;
                                                                        }
                                                                    } else if (field408 < field376) {
                                                                        field408++;
                                                                        if (field408 == field376) {
                                                                            method172(Statics.field880);
                                                                        }
                                                                    }
                                                                    method199();
                                                                    if (field505) {
                                                                        method1817();
                                                                    }
                                                                    for (int var85 = 0; var85 < 5; var85++) {
                                                                        var10002 = field328[var85]++;
                                                                    }
                                                                    Statics.field13.method236();
                                                                    int var86 = class140.method2752();
                                                                    int var87 = class137.field2097;
                                                                    if (var86 > 15000 && var87 > 15000) {
                                                                        field489 = 250;
                                                                        class140.method3165(14500);
                                                                        field301.method2648(217);
                                                                    }
                                                                    field318++;
                                                                    if (field318 > 500) {
                                                                        field318 = 0;
                                                                        int var89 = (int) (Math.random() * 8.0D);
                                                                        if ((var89 & 0x1) == 1) {
                                                                            field482 += field323;
                                                                        }
                                                                        if ((var89 & 0x2) == 2) {
                                                                            field324 += field269;
                                                                        }
                                                                        if ((var89 & 0x4) == 4) {
                                                                            field390 += field342;
                                                                        }
                                                                    }
                                                                    if (field482 < -50) {
                                                                        field323 = 2;
                                                                    }
                                                                    if (field482 > 50) {
                                                                        field323 = -2;
                                                                    }
                                                                    if (field324 < -55) {
                                                                        field269 = 2;
                                                                    }
                                                                    if (field324 > 55) {
                                                                        field269 = -2;
                                                                    }
                                                                    if (field390 < -40) {
                                                                        field342 = 1;
                                                                    }
                                                                    if (field390 > 40) {
                                                                        field342 = -1;
                                                                    }
                                                                    field333++;
                                                                    if (field333 > 500) {
                                                                        field333 = 0;
                                                                        int var90 = (int) (Math.random() * 8.0D);
                                                                        if ((var90 & 0x1) == 1) {
                                                                            field329 += field330;
                                                                        }
                                                                        if ((var90 & 0x2) == 2) {
                                                                            field492 += field332;
                                                                        }
                                                                    }
                                                                    if (field329 < -60) {
                                                                        field330 = 2;
                                                                    }
                                                                    if (field329 > 60) {
                                                                        field330 = -2;
                                                                    }
                                                                    if (field492 < -20) {
                                                                        field332 = 1;
                                                                    }
                                                                    if (field492 > 10) {
                                                                        field332 = -1;
                                                                    }
                                                                    for (class39 var91 = (class39) field527.method3562(); var91 != null; var91 = (class39) field527.method3563()) {
                                                                        if ((long) var91.field841 < class115.method2177() / 1000L - 5L) {
                                                                            if (var91.field840 > 0) {
                                                                                class12.method2685(5, "", var91.field838 + class157.field2556);
                                                                            }
                                                                            if (var91.field840 == 0) {
                                                                                class12.method2685(5, "", var91.field838 + class157.field2432);
                                                                            }
                                                                            var91.method3698();
                                                                        }
                                                                    }
                                                                    field307++;
                                                                    if (field307 > 50) {
                                                                        field301.method2648(25);
                                                                    }
                                                                    try {
                                                                        if (Statics.field1511 != null && field301.field1955 > 0) {
                                                                            Statics.field1511.method2866(field301.field1959, 0, field301.field1955);
                                                                            field301.field1955 = 0;
                                                                            field307 = 0;
                                                                            return;
                                                                        }
                                                                    } catch (IOException var94) {
                                                                        if (field489 > 0) {
                                                                            method769();
                                                                        } else {
                                                                            method781(40);
                                                                            Statics.field839 = Statics.field1511;
                                                                            Statics.field1511 = null;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                var71 = var70.field3;
                                                                if (var71.field2861 < 0) {
                                                                    break;
                                                                }
                                                                var72 = class173.method47(var71.field2834);
                                                            } while (var72 == null || var72.field2853 == null || var71.field2861 >= var72.field2853.length || var72.field2853[var71.field2861] != var71);
                                                            class37.method616(var70);
                                                        }
                                                    }
                                                    var68 = var67.field3;
                                                    if (var68.field2861 < 0) {
                                                        break;
                                                    }
                                                    var69 = class173.method47(var68.field2834);
                                                } while (var69 == null || var69.field2853 == null || var68.field2861 >= var69.field2853.length || var69.field2853[var68.field2861] != var68);
                                                class37.method616(var67);
                                            }
                                        }
                                        var65 = var64.field3;
                                        if (var65.field2861 < 0) {
                                            break;
                                        }
                                        var66 = class173.method47(var65.field2834);
                                    } while (var66 == null || var66.field2853 == null || var65.field2861 >= var66.field2853.length || var66.field2853[var65.field2861] != var65);
                                    class37.method616(var64);
                                }
                            }
                        } else if (field489 > 0) {
                            method769();
                        } else {
                            method781(40);
                            Statics.field839 = Statics.field1511;
                            Statics.field1511 = null;
                        }
                    }
                }
            }
        } else if (field382 == 40 || field382 == 45) {
            method188();
        }
    }

    @ObfuscatedName("client.e(I)V")
    public final void method247() {
        boolean var1;
        label200: {
            try {
                if (class183.field2933 == 2) {
                    if (Statics.field1723 == null) {
                        Statics.field1723 = class180.method3333(Statics.field2932, Statics.field3181, Statics.field1501);
                        if (Statics.field1723 == null) {
                            var1 = false;
                            break label200;
                        }
                    }
                    if (Statics.field2931 == null) {
                        Statics.field2931 = new class60(Statics.field2929, Statics.field2934);
                    }
                    if (Statics.field2930.method3425(Statics.field1723, Statics.field2628, Statics.field2931, 22050)) {
                        Statics.field2930.method3426();
                        Statics.field2930.method3423(Statics.field2035);
                        Statics.field2930.method3454(Statics.field1723, Statics.field2881);
                        class183.field2933 = 0;
                        Statics.field1723 = null;
                        Statics.field2931 = null;
                        Statics.field2932 = null;
                        var1 = true;
                        break label200;
                    }
                }
            } catch (Exception var29) {
                var29.printStackTrace();
                Statics.field2930.method3514();
                class183.field2933 = 0;
                Statics.field1723 = null;
                Statics.field2931 = null;
                Statics.field2932 = null;
            }
            var1 = false;
        }
        if (var1 && field496 && Statics.field117 != null) {
            Statics.field117.method1194();
        }
        if (field382 == 10 || field382 == 20 || field382 == 30) {
            if (field470 != 0L && class115.method2177() > field470) {
                int var4 = method728();
                field470 = 0L;
                if (var4 >= 2) {
                    field471 = true;
                } else {
                    field471 = false;
                }
                method1627();
                if (field382 >= 25) {
                    method603();
                }
                field2162 = true;
            } else if (field2177) {
                method170();
            }
        }
        Dimension var5 = this.method2900();
        if (Statics.field552 != var5.width || Statics.field1915 != var5.height || field2176) {
            method1627();
            field470 = class115.method2177() + 500L;
            field2176 = false;
        }
        boolean var6 = false;
        if (field2162) {
            field2162 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field462[var7] = true;
            }
        }
        if (var6) {
            method189();
        }
        if (field382 == 0) {
            int var8 = class32.field694;
            String var9 = class32.field710;
            Color var10 = null;
            try {
                Graphics var11 = Statics.field1559.getGraphics();
                if (Statics.field1579 == null) {
                    Statics.field1579 = new Font("Helvetica", 1, 13);
                    Statics.field256 = Statics.field1559.getFontMetrics(Statics.field1579);
                }
                if (var6) {
                    var11.setColor(Color.black);
                    var11.fillRect(0, 0, Statics.field942, Statics.field2210);
                }
                if (var10 == null) {
                    var10 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1722 == null) {
                        Statics.field1722 = Statics.field1559.createImage(304, 34);
                    }
                    Graphics var12 = Statics.field1722.getGraphics();
                    var12.setColor(var10);
                    var12.drawRect(0, 0, 303, 33);
                    var12.fillRect(2, 2, var8 * 3, 30);
                    var12.setColor(Color.black);
                    var12.drawRect(1, 1, 301, 31);
                    var12.fillRect(var8 * 3 + 2, 2, 300 - var8 * 3, 30);
                    var12.setFont(Statics.field1579);
                    var12.setColor(Color.white);
                    var12.drawString(var9, (304 - Statics.field256.stringWidth(var9)) / 2, 22);
                    var11.drawImage(Statics.field1722, Statics.field942 / 2 - 152, Statics.field2210 / 2 - 18, (ImageObserver) null);
                } catch (Exception var25) {
                    int var14 = Statics.field942 / 2 - 152;
                    int var15 = Statics.field2210 / 2 - 18;
                    var11.setColor(var10);
                    var11.drawRect(var14, var15, 303, 33);
                    var11.fillRect(var14 + 2, var15 + 2, var8 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(var14 + 1, var15 + 1, 301, 31);
                    var11.fillRect(var8 * 3 + var14 + 2, var15 + 2, 300 - var8 * 3, 30);
                    var11.setFont(Statics.field1579);
                    var11.setColor(Color.white);
                    var11.drawString(var9, var14 + (304 - Statics.field256.stringWidth(var9)) / 2, var15 + 22);
                }
            } catch (Exception var26) {
                Statics.field1559.repaint();
            }
        } else if (field382 == 5) {
            class32.method683(Statics.field164, Statics.field1024, Statics.field145, var6);
        } else if (field382 == 10 || field382 == 11) {
            class32.method683(Statics.field164, Statics.field1024, Statics.field145, var6);
        } else if (field382 == 20) {
            class32.method683(Statics.field164, Statics.field1024, Statics.field145, var6);
        } else if (field382 == 25) {
            if (field317 == 1) {
                if (field497 > field314) {
                    field314 = field497;
                }
                int var17 = (field314 * 50 - field497 * 50) / field314;
                method2305(class157.field2293 + class2.field18 + class2.field17 + var17 + "%" + class2.field21, false);
            } else if (field317 == 2) {
                if (field315 > field316) {
                    field316 = field315;
                }
                int var18 = (field316 * 50 - field315 * 50) / field316 + 50;
                method2305(class157.field2293 + class2.field18 + class2.field17 + var18 + "%" + class2.field21, false);
            } else {
                method2305(class157.field2293, false);
            }
        } else if (field382 == 30) {
            method192();
        } else if (field382 == 40) {
            method2305(class157.field2393 + class2.field18 + class157.field2295, false);
        } else if (field382 == 45) {
            method2305(class157.field2442, false);
        }
        if (field382 == 30 && field412 == 0 && !var6) {
            try {
                Graphics var19 = Statics.field1559.getGraphics();
                for (int var20 = 0; var20 < field460; var20++) {
                    if (field463[var20]) {
                        Statics.field2145.method1558(var19, field258[var20], field380[var20], field467[var20], field468[var20]);
                        field463[var20] = false;
                    }
                }
            } catch (Exception var28) {
                Statics.field1559.repaint();
            }
        } else if (field382 > 0) {
            try {
                Graphics var22 = Statics.field1559.getGraphics();
                Statics.field2145.method1557(var22, 0, 0);
                for (int var23 = 0; var23 < field460; var23++) {
                    field463[var23] = false;
                }
            } catch (Exception var27) {
                Statics.field1559.repaint();
            }
        }
    }

    @ObfuscatedName("client.p(B)V")
    public final void method248() {
        if (Statics.field13.method212()) {
            Statics.field13.method241();
        }
        if (Statics.field2042 != null) {
            Statics.field2042.field182 = false;
        }
        Statics.field2042 = null;
        if (Statics.field1511 != null) {
            Statics.field1511.method2883();
            Statics.field1511 = null;
        }
        class137.method2181();
        class140.method2625();
        Statics.field1401 = null;
        if (Statics.field117 != null) {
            Statics.field117.method1208();
        }
        if (Statics.field639 != null) {
            Statics.field639.method1208();
        }
        if (Statics.field3140 != null) {
            Statics.field3140.method2883();
        }
        class170.method2655();
        class149.method602();
    }

    @ObfuscatedName("at.a(II)V")
    public static void method781(int arg0) {
        if (field382 == arg0) {
            return;
        }
        if (field382 == 0) {
            Statics.field1722 = null;
            Statics.field1579 = null;
            Statics.field256 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field514 = 0;
            field292 = 0;
            field293 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field839 != null) {
            Statics.field839.method2883();
            Statics.field839 = null;
        }
        if (field382 == 25) {
            field317 = 0;
            field497 = 0;
            field314 = 1;
            field315 = 0;
            field316 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method116(Statics.field1559, Statics.field15, Statics.field2023, true, 0);
        } else if (arg0 == 20) {
            class32.method116(Statics.field1559, Statics.field15, Statics.field2023, true, field382 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method116(Statics.field1559, Statics.field15, Statics.field2023, false, 4);
        } else {
            class32.method2987();
        }
        field382 = arg0;
    }

    @ObfuscatedName("client.v(I)V")
    public void method249() {
        if (field382 == 1000) {
            return;
        }
        long var1 = class115.method2177();
        int var3 = (int) (var1 - Statics.field2693);
        Statics.field2693 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class171.field2704 += var3;
        boolean var4;
        if (class171.field2696 == 0 && class171.field2697 == 0 && class171.field2700 == 0 && class171.field2695 == 0) {
            var4 = true;
        } else if (Statics.field3140 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class171.field2704 > 30000) {
                        throw new IOException();
                    }
                    while (class171.field2697 < 20 && class171.field2695 > 0) {
                        class172 var5 = (class172) class171.field2694.method3574();
                        class119 var6 = new class119(4);
                        var6.method2366(1);
                        var6.method2381((int) var5.field3095);
                        Statics.field3140.method2866(var6.field1959, 0, 4);
                        class171.field2692.method3572(var5, var5.field3095);
                        class171.field2695--;
                        class171.field2697++;
                    }
                    while (class171.field2696 < 20 && class171.field2700 > 0) {
                        class172 var7 = (class172) class171.field2698.method3669();
                        class119 var8 = new class119(4);
                        var8.method2366(0);
                        var8.method2381((int) var7.field3095);
                        Statics.field3140.method2866(var8.field1959, 0, 4);
                        var7.method3685();
                        class171.field2710.method3572(var7, var7.field3095);
                        class171.field2700--;
                        class171.field2696++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3140.method2867();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class171.field2704 = 0;
                        byte var11 = 0;
                        if (Statics.field1976 == null) {
                            var11 = 8;
                        } else if (class171.field2712 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class171.field2703.field1955;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3140.method2868(class171.field2703.field1959, class171.field2703.field1955, var12);
                            if (class171.field2708 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class171.field2703.field1959[class171.field2703.field1955 + var13] ^= class171.field2708;
                                }
                            }
                            class171.field2703.field1955 += var12;
                            if (class171.field2703.field1955 < var11) {
                                break;
                            }
                            if (Statics.field1976 == null) {
                                class171.field2703.field1955 = 0;
                                int var14 = class171.field2703.method2562();
                                int var15 = class171.field2703.method2541();
                                int var16 = class171.field2703.method2562();
                                int var17 = class171.field2703.method2386();
                                long var18 = (long) ((var14 << 16) + var15);
                                class172 var20 = (class172) class171.field2692.method3571(var18);
                                Statics.field124 = true;
                                if (var20 == null) {
                                    var20 = (class172) class171.field2710.method3571(var18);
                                    Statics.field124 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1976 = var20;
                                Statics.field1345 = new class119(var17 + var21 + Statics.field1976.field2715);
                                Statics.field1345.method2366(var16);
                                Statics.field1345.method2514(var17);
                                class171.field2712 = 8;
                                class171.field2703.field1955 = 0;
                            } else if (class171.field2712 == 0) {
                                if (class171.field2703.field1959[0] == -1) {
                                    class171.field2712 = 1;
                                    class171.field2703.field1955 = 0;
                                } else {
                                    Statics.field1976 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1345.field1959.length - Statics.field1976.field2715;
                            int var23 = 512 - class171.field2712;
                            if (var23 > var22 - Statics.field1345.field1955) {
                                var23 = var22 - Statics.field1345.field1955;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3140.method2868(Statics.field1345.field1959, Statics.field1345.field1955, var23);
                            if (class171.field2708 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1345.field1959[Statics.field1345.field1955 + var24] ^= class171.field2708;
                                }
                            }
                            Statics.field1345.field1955 += var23;
                            class171.field2712 += var23;
                            if (Statics.field1345.field1955 == var22) {
                                if (Statics.field1976.field3095 == 16711935L) {
                                    Statics.field1330 = Statics.field1345;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class168 var26 = class171.field2707[var25];
                                        if (var26 != null) {
                                            Statics.field1330.field1955 = var25 * 8 + 5;
                                            int var27 = Statics.field1330.method2386();
                                            int var28 = Statics.field1330.method2386();
                                            var26.method3162(var27, var28);
                                        }
                                    }
                                } else {
                                    class171.field2699.reset();
                                    class171.field2699.update(Statics.field1345.field1959, 0, var22);
                                    int var29 = (int) class171.field2699.getValue();
                                    if (Statics.field1976.field2719 != var29) {
                                        try {
                                            Statics.field3140.method2883();
                                        } catch (Exception var35) {
                                        }
                                        class171.field2701++;
                                        Statics.field3140 = null;
                                        class171.field2708 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class171.field2701 = 0;
                                    class171.field2706 = 0;
                                    Statics.field1976.field2714.method3178((int) (Statics.field1976.field3095 & 0xFFFFL), Statics.field1345.field1959, (Statics.field1976.field3095 & 0xFF0000L) == 16711680L, Statics.field124);
                                }
                                Statics.field1976.method3702();
                                if (Statics.field124) {
                                    class171.field2697--;
                                } else {
                                    class171.field2696--;
                                }
                                class171.field2712 = 0;
                                Statics.field1976 = null;
                                Statics.field1345 = null;
                            } else {
                                if (class171.field2712 != 512) {
                                    break;
                                }
                                class171.field2712 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3140.method2883();
                } catch (Exception var34) {
                }
                class171.field2706++;
                Statics.field3140 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method378();
        }
    }

    @ObfuscatedName("client.c(I)V")
    public void method378() {
        if (class171.field2701 >= 4) {
            this.method2896("js5crc");
            field382 = 1000;
            return;
        }
        if (class171.field2706 >= 4) {
            if (field382 <= 5) {
                this.method2896("js5io");
                field382 = 1000;
                return;
            }
            field288 = 3000;
            class171.field2706 = 3;
        }
        if (--field288 + 1 > 0) {
            return;
        }
        try {
            if (field452 == 0) {
                Statics.field721 = Statics.field2048.method2757(Statics.field212, Statics.field3188);
                field452++;
            }
            if (field452 == 1) {
                if (Statics.field721.field2191 == 2) {
                    this.method251(-1);
                    return;
                }
                if (Statics.field721.field2191 == 1) {
                    field452++;
                }
            }
            if (field452 == 2) {
                Statics.field286 = new class143((Socket) Statics.field721.field2183, Statics.field2048);
                class119 var1 = new class119(5);
                var1.method2366(15);
                var1.method2514(90);
                Statics.field286.method2866(var1.field1959, 0, 5);
                field452++;
                Statics.field167 = class115.method2177();
            }
            if (field452 == 3) {
                if (field382 <= 5 || Statics.field286.method2867() > 0) {
                    int var2 = Statics.field286.method2876();
                    if (var2 != 0) {
                        this.method251(var2);
                        return;
                    }
                    field452++;
                } else if (class115.method2177() - Statics.field167 > 30000L) {
                    this.method251(-2);
                    return;
                }
            }
            if (field452 == 4) {
                class171.method2995(Statics.field286, field382 > 20);
                Statics.field721 = null;
                Statics.field286 = null;
                field452 = 0;
                field397 = 0;
            }
        } catch (IOException var4) {
            this.method251(-3);
        }
    }

    @ObfuscatedName("client.s(II)V")
    public void method251(int arg0) {
        Statics.field721 = null;
        Statics.field286 = null;
        field452 = 0;
        if (Statics.field3188 == Statics.field295) {
            Statics.field3188 = Statics.field1979;
        } else {
            Statics.field3188 = Statics.field295;
        }
        field397++;
        if (field397 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field382 <= 5) {
                this.method2896("js5connect_full");
                field382 = 1000;
            } else {
                field288 = 3000;
            }
        } else if (field397 >= 2 && arg0 == 6) {
            this.method2896("js5connect_outofdate");
            field382 = 1000;
        } else if (field397 >= 4) {
            if (field382 <= 5) {
                this.method2896("js5connect");
                field382 = 1000;
            } else {
                field288 = 3000;
            }
        }
    }

    @ObfuscatedName("em.r(S)V")
    public static void method3000() {
        if (field285 == 0) {
            Statics.field788 = new class86(4, 104, 104, class6.field81);
            for (int var0 = 0; var0 < 4; var0++) {
                field433[var0] = new class108(104, 104);
            }
            Statics.field197 = new class79(512, 512);
            class32.field710 = class157.field2296;
            class32.field694 = 5;
            field285 = 20;
        } else if (field285 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1530[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1823(var1, 500, 800, 512, 334);
            class32.field710 = class157.field2297;
            class32.field694 = 10;
            field285 = 30;
        } else if (field285 == 30) {
            Statics.field2250 = method1999(0, false, true, true);
            Statics.field1327 = method1999(1, false, true, true);
            Statics.field1551 = method1999(2, true, false, true);
            Statics.field2630 = method1999(3, false, true, true);
            Statics.field732 = method1999(4, false, true, true);
            Statics.field1827 = method1999(5, true, true, true);
            Statics.field773 = method1999(6, true, true, false);
            Statics.field128 = method1999(7, false, true, true);
            Statics.field2023 = method1999(8, false, true, true);
            Statics.field842 = method1999(9, false, true, true);
            Statics.field15 = method1999(10, false, true, true);
            Statics.field2143 = method1999(11, false, true, true);
            Statics.field2142 = method1999(12, false, true, true);
            Statics.field1635 = method1999(13, true, false, true);
            Statics.field3185 = method1999(14, false, true, false);
            Statics.field356 = method1999(15, false, true, true);
            class32.field710 = class157.field2363;
            class32.field694 = 20;
            field285 = 40;
        } else if (field285 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2250.method3163() * 4 / 100;
            int var8 = var7 + Statics.field1327.method3163() * 4 / 100;
            int var9 = var8 + Statics.field1551.method3163() * 2 / 100;
            int var10 = var9 + Statics.field2630.method3163() * 2 / 100;
            int var11 = var10 + Statics.field732.method3163() * 6 / 100;
            int var12 = var11 + Statics.field1827.method3163() * 4 / 100;
            int var13 = var12 + Statics.field773.method3163() * 2 / 100;
            int var14 = var13 + Statics.field128.method3163() * 60 / 100;
            int var15 = var14 + Statics.field2023.method3163() * 2 / 100;
            int var16 = var15 + Statics.field842.method3163() * 2 / 100;
            int var17 = var16 + Statics.field15.method3163() * 2 / 100;
            int var18 = var17 + Statics.field2143.method3163() * 2 / 100;
            int var19 = var18 + Statics.field2142.method3163() * 2 / 100;
            int var20 = var19 + Statics.field1635.method3163() * 2 / 100;
            int var21 = var20 + Statics.field3185.method3163() * 2 / 100;
            int var22 = var21 + Statics.field356.method3163() * 2 / 100;
            if (var22 == 100) {
                class32.field710 = class157.field2300;
                class32.field694 = 30;
                field285 = 45;
            } else {
                if (var22 != 0) {
                    class32.field710 = class157.field2350 + var22 + "%";
                }
                class32.field694 = 30;
            }
        } else if (field285 == 45) {
            class57.method775(22050, !field259, 2);
            class184 var23 = new class184();
            var23.method3430(9, 128);
            Statics.field117 = class57.method2684(Statics.field2048, Statics.field1559, 0, 22050);
            Statics.field117.method1214(var23);
            class183.method2179(Statics.field356, Statics.field3185, Statics.field732, var23);
            Statics.field639 = class57.method2684(Statics.field2048, Statics.field1559, 1, 2048);
            Statics.field1822 = new class56();
            Statics.field639.method1214(Statics.field1822);
            Statics.field2110 = new class75(22050, Statics.field1139);
            class32.field710 = class157.field2301;
            class32.field694 = 35;
            field285 = 50;
        } else if (field285 == 50) {
            int var24 = 0;
            if (Statics.field1024 == null) {
                Statics.field1024 = class77.method925(Statics.field2023, Statics.field1635, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field145 == null) {
                Statics.field145 = class77.method925(Statics.field2023, Statics.field1635, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field164 == null) {
                Statics.field164 = class77.method925(Statics.field2023, Statics.field1635, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class32.field710 = class157.field2429 + var24 * 100 / 3 + "%";
                class32.field694 = 40;
            } else {
                Statics.field2026 = new class160(true);
                class32.field710 = class157.field2470;
                class32.field694 = 40;
                field285 = 60;
            }
        } else if (field285 == 60) {
            int var25 = class32.method669(Statics.field15, Statics.field2023);
            int var26 = class32.method1074();
            if (var25 < var26) {
                class32.field710 = class157.field2304 + var25 * 100 / var26 + "%";
                class32.field694 = 50;
            } else {
                class32.field710 = class157.field2305;
                class32.field694 = 50;
                method781(5);
                field285 = 70;
            }
        } else if (field285 == 70) {
            if (Statics.field1551.method3084()) {
                class47.method153(Statics.field1551);
                class168 var27 = Statics.field1551;
                Statics.field3143 = var27;
                class168 var28 = Statics.field1551;
                class168 var29 = Statics.field128;
                Statics.field996 = var28;
                Statics.field991 = var29;
                Statics.field3136 = Statics.field996.method3090(3);
                class41.method1013(Statics.field1551, Statics.field128, field259);
                class168 var30 = Statics.field1551;
                class168 var31 = Statics.field128;
                Statics.field855 = var30;
                Statics.field850 = var31;
                class168 var32 = Statics.field1551;
                class168 var33 = Statics.field128;
                boolean var34 = field263;
                class224 var35 = Statics.field1024;
                Statics.field1107 = var32;
                Statics.field2874 = var33;
                Statics.field2691 = var34;
                Statics.field2886 = Statics.field1107.method3090(10);
                Statics.field1108 = var35;
                class168 var36 = Statics.field1551;
                class168 var37 = Statics.field2250;
                class168 var38 = Statics.field1327;
                Statics.field950 = var36;
                Statics.field951 = var37;
                Statics.field962 = var38;
                class168 var39 = Statics.field1551;
                class168 var40 = Statics.field128;
                Statics.field984 = var39;
                Statics.field971 = var40;
                class168 var41 = Statics.field1551;
                Statics.field1039 = var41;
                class168 var42 = Statics.field1551;
                Statics.field3187 = var42;
                Statics.field1121 = Statics.field3187.method3090(16);
                class173.method2998(Statics.field2630, Statics.field128, Statics.field2023, Statics.field1635);
                class168 var43 = Statics.field1551;
                Statics.field1067 = var43;
                class168 var44 = Statics.field1551;
                Statics.field1055 = var44;
                class168 var45 = Statics.field1551;
                Statics.field1007 = var45;
                class50.method811(Statics.field1551);
                Statics.field13 = new class20();
                class32.field710 = class157.field2307;
                class32.field694 = 60;
                field285 = 80;
            } else {
                class32.field710 = class157.field2306 + Statics.field1551.method3169() + "%";
                class32.field694 = 60;
            }
        } else if (field285 == 80) {
            int var46 = 0;
            if (Statics.field89 == null) {
                class168 var47 = Statics.field2023;
                int var48 = var47.method3081("compass");
                int var49 = var47.method3116(var48, "");
                class79 var50 = Statics.method2982(var47, var48, var49);
                Statics.field89 = var50;
            } else {
                var46++;
            }
            if (Statics.field214 == null) {
                class168 var51 = Statics.field2023;
                int var52 = var51.method3081("mapedge");
                int var53 = var51.method3116(var52, "");
                class79 var54 = Statics.method2982(var51, var52, var53);
                Statics.field214 = var54;
            } else {
                var46++;
            }
            if (Statics.field609 == null) {
                Statics.field609 = class77.method990(Statics.field2023, "mapscene", "");
            } else {
                var46++;
            }
            if (Statics.field997 == null) {
                Statics.field997 = class77.method774(Statics.field2023, "mapfunction", "");
            } else {
                var46++;
            }
            if (Statics.field644 == null) {
                Statics.field644 = class77.method774(Statics.field2023, "hitmarks", "");
            } else {
                var46++;
            }
            if (Statics.field736 == null) {
                Statics.field736 = class77.method774(Statics.field2023, "headicons_pk", "");
            } else {
                var46++;
            }
            if (Statics.field1312 == null) {
                Statics.field1312 = class77.method774(Statics.field2023, "headicons_prayer", "");
            } else {
                var46++;
            }
            if (Statics.field1504 == null) {
                Statics.field1504 = class77.method774(Statics.field2023, "headicons_hint", "");
            } else {
                var46++;
            }
            if (Statics.field335 == null) {
                Statics.field335 = class77.method774(Statics.field2023, "mapmarker", "");
            } else {
                var46++;
            }
            if (Statics.field336 == null) {
                Statics.field336 = class77.method774(Statics.field2023, "cross", "");
            } else {
                var46++;
            }
            if (Statics.field2085 == null) {
                Statics.field2085 = class77.method774(Statics.field2023, "mapdots", "");
            } else {
                var46++;
            }
            if (Statics.field1001 == null) {
                Statics.field1001 = class77.method990(Statics.field2023, "scrollbar", "");
            } else {
                var46++;
            }
            if (Statics.field596 == null) {
                Statics.field596 = class77.method990(Statics.field2023, "mod_icons", "");
            } else {
                var46++;
            }
            if (var46 < 13) {
                class32.field710 = class157.field2308 + var46 * 100 / 13 + "%";
                class32.field694 = 70;
            } else {
                Statics.field3159 = Statics.field596;
                Statics.field214.method1642();
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 41.0D) - 20;
                for (int var59 = 0; var59 < Statics.field997.length; var59++) {
                    Statics.field997[var59].method1641(var55 + var58, var56 + var58, var57 + var58);
                }
                Statics.field609[0].method1792(var55 + var58, var56 + var58, var57 + var58);
                class32.field710 = class157.field2309;
                class32.field694 = 70;
                field285 = 90;
            }
        } else if (field285 == 90) {
            if (Statics.field842.method3084()) {
                class95 var60 = new class95(Statics.field842, Statics.field2023, 20, 0.8D, field259 ? 64 : 128);
                class91.method2005(var60);
                class91.method2006(0.8D);
                class32.field710 = class157.field2311;
                class32.field694 = 90;
                field285 = 110;
            } else {
                class32.field710 = class157.field2310 + Statics.field842.method3169() + "%";
                class32.field694 = 90;
            }
        } else if (field285 == 110) {
            Statics.field2042 = new class14();
            Statics.field2048.method2756(Statics.field2042, 10);
            class32.field710 = class157.field2513;
            class32.field694 = 94;
            field285 = 120;
        } else if (field285 == 120) {
            if (Statics.field15.method3132("huffman", "")) {
                class113 var61 = new class113(Statics.field15.method3097("huffman", ""));
                class222.method2692(var61);
                class32.field710 = class157.field2314;
                class32.field694 = 96;
                field285 = 130;
            } else {
                class32.field710 = class157.field2313 + "%";
                class32.field694 = 96;
            }
        } else if (field285 == 130) {
            if (!Statics.field2630.method3084()) {
                class32.field710 = class157.field2483 + Statics.field2630.method3169() * 4 / 5 + "%";
                class32.field694 = 100;
            } else if (!Statics.field2142.method3084()) {
                class32.field710 = class157.field2483 + (80 + Statics.field2142.method3169() / 6) + "%";
                class32.field694 = 100;
            } else if (Statics.field1635.method3084()) {
                class32.field710 = class157.field2553;
                class32.field694 = 100;
                field285 = 140;
            } else {
                class32.field710 = class157.field2483 + (96 + Statics.field1635.method3169() / 20) + "%";
                class32.field694 = 100;
            }
        } else if (field285 == 140) {
            method781(10);
        }
    }

    @ObfuscatedName("ck.h(IZZZS)Lfl;")
    public static class168 method1999(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2207 != null) {
            var4 = new class134(arg0, class149.field2207, Statics.field2209[arg0], 1000000);
        }
        return new class168(var4, Statics.field88, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("n.n(B)V")
    public static final void method188() {
        try {
            if (field514 == 0) {
                if (Statics.field1511 != null) {
                    Statics.field1511.method2883();
                    Statics.field1511 = null;
                }
                Statics.field179 = null;
                field512 = false;
                field292 = 0;
                field514 = 1;
            }
            if (field514 == 1) {
                if (Statics.field179 == null) {
                    Statics.field179 = Statics.field2048.method2757(Statics.field212, Statics.field3188);
                }
                if (Statics.field179.field2191 == 2) {
                    throw new IOException();
                }
                if (Statics.field179.field2191 == 1) {
                    Statics.field1511 = new class143((Socket) Statics.field179.field2183, Statics.field2048);
                    Statics.field179 = null;
                    field514 = 2;
                }
            }
            if (field514 == 2) {
                field301.field1955 = 0;
                field301.method2366(14);
                Statics.field1511.method2866(field301.field1959, 0, 1);
                field428.field1955 = 0;
                field514 = 3;
            }
            if (field514 == 3) {
                if (Statics.field117 != null) {
                    Statics.field117.method1226();
                }
                if (Statics.field639 != null) {
                    Statics.field639.method1226();
                }
                int var0 = Statics.field1511.method2876();
                if (Statics.field117 != null) {
                    Statics.field117.method1226();
                }
                if (Statics.field639 != null) {
                    Statics.field639.method1226();
                }
                if (var0 != 0) {
                    method158(var0);
                    return;
                }
                field428.field1955 = 0;
                field514 = 5;
            }
            if (field514 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field301.field1955 = 0;
                field301.method2366(1);
                field301.method2366(class32.field698.method579());
                field301.method2514(var1[0]);
                field301.method2514(var1[1]);
                field301.method2514(var1[2]);
                field301.method2514(var1[3]);
                switch(class32.field698.field2572) {
                    case 0:
                        field301.method2514((Integer) Statics.field2665.field136.get(class163.method2079(class32.field700)));
                        field301.field1955 += 4;
                        break;
                    case 1:
                        field301.field1955 += 8;
                        break;
                    case 2:
                    case 3:
                        field301.method2381(Statics.field1052);
                        field301.field1955 += 5;
                }
                field301.method2372(class32.field693);
                field301.method2419(class5.field69, class5.field66);
                field302.field1955 = 0;
                if (field382 == 40) {
                    field302.method2366(18);
                } else {
                    field302.method2366(16);
                }
                field302.method2466(0);
                int var2 = field302.field1955;
                field302.method2514(90);
                field302.method2375(field301.field1959, 0, field301.field1955);
                int var3 = field302.field1955;
                field302.method2372(class32.field700);
                field302.method2366((field471 ? 1 : 0) << 1 | (field259 ? 1 : 0));
                field302.method2466(Statics.field942);
                field302.method2466(Statics.field2210);
                class149.method2675(field302);
                field302.method2372(Statics.field3156);
                field302.method2514(Statics.field1943);
                class119 var4 = new class119(Statics.field2026.method3014());
                Statics.field2026.method3011(var4);
                field302.method2375(var4.field1959, 0, var4.field1959.length);
                field302.method2366(Statics.field2148);
                field302.method2514(Statics.field2250.field2650);
                field302.method2514(Statics.field1327.field2650);
                field302.method2514(Statics.field1551.field2650);
                field302.method2514(Statics.field2630.field2650);
                field302.method2514(Statics.field732.field2650);
                field302.method2514(Statics.field1827.field2650);
                field302.method2514(Statics.field773.field2650);
                field302.method2514(Statics.field128.field2650);
                field302.method2514(Statics.field2023.field2650);
                field302.method2514(Statics.field842.field2650);
                field302.method2514(Statics.field15.field2650);
                field302.method2514(Statics.field2143.field2650);
                field302.method2514(Statics.field2142.field2650);
                field302.method2514(Statics.field1635.field2650);
                field302.method2514(Statics.field3185.field2650);
                field302.method2514(Statics.field356.field2650);
                field302.method2399(var1, var3, field302.field1955);
                field302.method2377(field302.field1955 - var2);
                Statics.field1511.method2866(field302.field1959, 0, field302.field1955);
                field301.method2631(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field428.method2631(var1);
                field514 = 6;
            }
            if (field514 == 6 && Statics.field1511.method2867() > 0) {
                int var6 = Statics.field1511.method2876();
                if (var6 == 21 && field382 == 20) {
                    field514 = 7;
                } else if (var6 == 2) {
                    field514 = 9;
                } else if (var6 == 15 && field382 == 40) {
                    field304 = -1;
                    field514 = 13;
                } else if (var6 == 23 && field293 < 1) {
                    field293++;
                    field514 = 0;
                } else if (var6 == 29) {
                    field514 = 11;
                } else {
                    method158(var6);
                    return;
                }
            }
            if (field514 == 7 && Statics.field1511.method2867() > 0) {
                field466 = (Statics.field1511.method2876() + 3) * 60;
                field514 = 8;
            }
            if (field514 == 8) {
                field292 = 0;
                class32.method768(class157.field2320, class157.field2321, field466 / 60 + class157.field2360);
                if (--field466 <= 0) {
                    field514 = 0;
                }
            } else {
                if (field514 == 9 && Statics.field1511.method2867() >= 13) {
                    boolean var7 = Statics.field1511.method2876() == 1;
                    Statics.field1511.method2868(field428.field1959, 0, 4);
                    field428.field1955 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field428.method2633() << 24;
                        int var10 = var9 | field428.method2633() << 16;
                        int var11 = var10 | field428.method2633() << 8;
                        int var12 = var11 | field428.method2633();
                        int var13 = class163.method2079(class32.field700);
                        if (Statics.field2665.field136.size() >= 10 && !Statics.field2665.field136.containsKey(var13)) {
                            Iterator var14 = Statics.field2665.field136.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field2665.field136.put(var13, var12);
                        class9.method3224();
                    }
                    field493 = Statics.field1511.method2876();
                    field426 = Statics.field1511.method2876() == 1;
                    field381 = Statics.field1511.method2876();
                    field381 <<= 0x8;
                    field381 += Statics.field1511.method2876();
                    field339 = Statics.field1511.method2876();
                    Statics.field1511.method2868(field428.field1959, 0, 1);
                    field428.field1955 = 0;
                    field305 = field428.method2633();
                    Statics.field1511.method2868(field428.field1959, 0, 2);
                    field428.field1955 = 0;
                    field304 = field428.method2541();
                    if (field339 == 1) {
                        try {
                            client var15 = Statics.field494;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var41) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field494;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var40) {
                        }
                    }
                    field514 = 10;
                }
                if (field514 != 10) {
                    if (field514 == 11 && Statics.field1511.method2867() >= 2) {
                        field428.field1955 = 0;
                        Statics.field1511.method2868(field428.field1959, 0, 2);
                        field428.field1955 = 0;
                        Statics.field547 = field428.method2541();
                        field514 = 12;
                    }
                    if (field514 == 12 && Statics.field1511.method2867() >= Statics.field547) {
                        field428.field1955 = 0;
                        Statics.field1511.method2868(field428.field1959, 0, Statics.field547);
                        field428.field1955 = 0;
                        String var31 = field428.method2389();
                        String var32 = field428.method2389();
                        String var33 = field428.method2389();
                        class32.method768(var31, var32, var33);
                        method781(10);
                    }
                    if (field514 == 13) {
                        if (field304 == -1) {
                            if (Statics.field1511.method2867() < 2) {
                                return;
                            }
                            Statics.field1511.method2868(field428.field1959, 0, 2);
                            field428.field1955 = 0;
                            field304 = field428.method2541();
                        }
                        if (Statics.field1511.method2867() >= field304) {
                            Statics.field1511.method2868(field428.field1959, 0, field304);
                            field428.field1955 = 0;
                            int var34 = field304;
                            field301.field1955 = 0;
                            field428.field1955 = 0;
                            field305 = -1;
                            field272 = -1;
                            field309 = -1;
                            field310 = -1;
                            field304 = 0;
                            field268 = 0;
                            field306 = 0;
                            field399 = 0;
                            field398 = false;
                            field474 = 0;
                            field491 = 0;
                            for (int var35 = 0; var35 < 2048; var35++) {
                                field469[var35] = null;
                            }
                            Statics.field989 = null;
                            for (int var36 = 0; var36 < field296.length; var36++) {
                                class35 var37 = field296[var36];
                                if (var37 != null) {
                                    var37.field835 = -1;
                                    var37.field803 = false;
                                }
                            }
                            class16.method3017();
                            method781(30);
                            for (int var38 = 0; var38 < 100; var38++) {
                                field462[var38] = true;
                            }
                            method603();
                            class33.method582(field428);
                            if (field428.field1955 != var34) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field292++;
                        if (field292 > 2000) {
                            if (field293 < 1) {
                                if (Statics.field3188 == Statics.field295) {
                                    Statics.field3188 = Statics.field1979;
                                } else {
                                    Statics.field3188 = Statics.field295;
                                }
                                field293++;
                                field514 = 0;
                            } else {
                                method158(-3);
                            }
                        }
                    }
                } else if (Statics.field1511.method2867() >= field304) {
                    field428.field1955 = 0;
                    Statics.field1511.method2868(field428.field1959, 0, field304);
                    field345 = -1L;
                    field406 = -1;
                    Statics.field2042.field183 = 0;
                    Statics.field2024 = true;
                    field326 = true;
                    field483 = -1L;
                    class211.method104();
                    field301.field1955 = 0;
                    field428.field1955 = 0;
                    field305 = -1;
                    field272 = -1;
                    field309 = -1;
                    field310 = -1;
                    field268 = 0;
                    field306 = 0;
                    field489 = 0;
                    field276 = 0;
                    field399 = 0;
                    field398 = false;
                    class140.method3165(0);
                    class12.field160.clear();
                    class12.field161.method3591();
                    class12.field162.method3642();
                    class12.field163 = 0;
                    field420 = 0;
                    field327 = false;
                    field386 = 0;
                    field482 = (int) (Math.random() * 100.0D) - 50;
                    field324 = (int) (Math.random() * 110.0D) - 55;
                    field390 = (int) (Math.random() * 80.0D) - 40;
                    field329 = (int) (Math.random() * 120.0D) - 60;
                    field492 = (int) (Math.random() * 30.0D) - 20;
                    field273 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field474 = 0;
                    field486 = -1;
                    field491 = 0;
                    field519 = 0;
                    field344 = class21.field541;
                    field297 = 0;
                    class33.field720 = 0;
                    for (int var19 = 0; var19 < 2048; var19++) {
                        class33.field719[var19] = null;
                        class33.field727[var19] = 1;
                    }
                    for (int var20 = 0; var20 < 2048; var20++) {
                        field469[var20] = null;
                    }
                    for (int var21 = 0; var21 < 32768; var21++) {
                        field296[var21] = null;
                    }
                    field389 = -1;
                    field392.method3605();
                    field393.method3605();
                    for (int var22 = 0; var22 < 4; var22++) {
                        for (int var23 = 0; var23 < 104; var23++) {
                            for (int var24 = 0; var24 < 104; var24++) {
                                field359[var22][var23][var24] = null;
                            }
                        }
                    }
                    field391 = new class199();
                    field525 = 0;
                    field410 = 0;
                    field528 = 0;
                    for (int var25 = 0; var25 < Statics.field1121; var25++) {
                        class53 var26 = class53.method3027(var25);
                        if (var26 != null) {
                            class176.field2879[var25] = 0;
                            class176.field2878[var25] = 0;
                        }
                    }
                    Statics.field13.method207();
                    field441 = -1;
                    if (field262 != -1) {
                        class173.method855(field262);
                    }
                    for (class4 var27 = (class4) field517.method3574(); var27 != null; var27 = (class4) field517.method3573()) {
                        method2172(var27, true);
                    }
                    field262 = -1;
                    field517 = new class196(8);
                    field416 = null;
                    field398 = false;
                    field399 = 0;
                    field417.method3309((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var28 = 0; var28 < 8; var28++) {
                        field407[var28] = null;
                        field387[var28] = false;
                    }
                    class16.method3017();
                    field267 = true;
                    for (int var29 = 0; var29 < 100; var29++) {
                        field462[var29] = true;
                    }
                    method603();
                    field484 = null;
                    Statics.field2683 = 0;
                    Statics.field2214 = null;
                    for (int var30 = 0; var30 < 8; var30++) {
                        field331[var30] = new class220();
                    }
                    Statics.field189 = null;
                    class33.method582(field428);
                    Statics.field1334 = -1;
                    method122(false);
                    field305 = -1;
                }
            }
        } catch (IOException var42) {
            if (field293 < 1) {
                if (Statics.field3188 == Statics.field295) {
                    Statics.field3188 = Statics.field1979;
                } else {
                    Statics.field3188 = Statics.field295;
                }
                field293++;
                field514 = 0;
            } else {
                method158(-2);
            }
        }
    }

    @ObfuscatedName("c.b(II)V")
    public static void method158(int arg0) {
        if (arg0 == -3) {
            class32.method768(class157.field2323, class157.field2324, class157.field2325);
        } else if (arg0 == -2) {
            class32.method768(class157.field2326, class157.field2485, class157.field2328);
        } else if (arg0 == -1) {
            class32.method768(class157.field2356, class157.field2330, class157.field2331);
        } else if (arg0 == 3) {
            class32.method768(class157.field2332, class157.field2333, class157.field2550);
        } else if (arg0 == 4) {
            class32.method768(class157.field2433, class157.field2336, class157.field2337);
        } else if (arg0 == 5) {
            class32.method768(class157.field2338, class157.field2339, class157.field2369);
        } else if (arg0 == 6) {
            class32.method768(class157.field2341, class157.field2342, class157.field2343);
        } else if (arg0 == 7) {
            class32.method768(class157.field2377, class157.field2345, class157.field2523);
        } else if (arg0 == 8) {
            class32.method768(class157.field2347, class157.field2358, class157.field2290);
        } else if (arg0 == 9) {
            class32.method768(class157.field2334, class157.field2312, class157.field2365);
        } else if (arg0 == 10) {
            class32.method768(class157.field2340, class157.field2354, class157.field2355);
        } else if (arg0 == 11) {
            class32.method768(class157.field2426, class157.field2357, class157.field2494);
        } else if (arg0 == 12) {
            class32.method768(class157.field2359, class157.field2492, class157.field2520);
        } else if (arg0 == 13) {
            class32.method768(class157.field2372, class157.field2379, class157.field2364);
        } else if (arg0 == 14) {
            class32.method768(class157.field2452, class157.field2366, class157.field2367);
        } else if (arg0 == 16) {
            class32.method768(class157.field2368, class157.field2486, class157.field2352);
        } else if (arg0 == 17) {
            class32.method768(class157.field2371, class157.field2509, class157.field2373);
        } else if (arg0 == 18) {
            class32.method768(class157.field2374, class157.field2375, class157.field2376);
        } else if (arg0 == 19) {
            class32.method768(class157.field2473, class157.field2378, class157.field2417);
        } else if (arg0 == 20) {
            class32.method768(class157.field2380, class157.field2381, class157.field2382);
        } else if (arg0 == 22) {
            class32.method768(class157.field2383, class157.field2510, class157.field2385);
        } else if (arg0 == 23) {
            class32.method768(class157.field2386, class157.field2500, class157.field2388);
        } else if (arg0 == 24) {
            class32.method768(class157.field2389, class157.field2390, class157.field2480);
        } else if (arg0 == 25) {
            class32.method768(class157.field2392, class157.field2515, class157.field2322);
        } else if (arg0 == 26) {
            class32.method768(class157.field2395, class157.field2396, class157.field2397);
        } else if (arg0 == 27) {
            class32.method768(class157.field2398, class157.field2399, class157.field2400);
        } else if (arg0 == 31) {
            class32.method768(class157.field2407, class157.field2408, class157.field2409);
        } else if (arg0 == 32) {
            class32.method768(class157.field2410, class157.field2411, class157.field2412);
        } else if (arg0 == 37) {
            class32.method768(class157.field2413, class157.field2414, class157.field2415);
        } else if (arg0 == 38) {
            class32.method768(class157.field2316, class157.field2549, class157.field2418);
        } else if (arg0 == 55) {
            class32.method768(class157.field2419, class157.field2420, class157.field2421);
        } else if (arg0 == 56) {
            class32.method768(class157.field2422, class157.field2291, class157.field2424);
            method781(11);
            return;
        } else if (arg0 == 57) {
            class32.method768(class157.field2464, class157.field2391, class157.field2427);
            method781(11);
            return;
        } else {
            class32.method768(class157.field2289, class157.field2544, class157.field2466);
        }
        method781(10);
    }

    @ObfuscatedName("aj.f(I)V")
    public static final void method769() {
        if (Statics.field1511 != null) {
            Statics.field1511.method2883();
            Statics.field1511 = null;
        }
        method2693();
        Statics.field788.method1927();
        for (int var0 = 0; var0 < 4; var0++) {
            field433[var0].method2281();
        }
        System.gc();
        class183.method743(2);
        field495 = -1;
        field496 = false;
        for (class24 var1 = (class24) class24.field575.method3611(); var1 != null; var1 = (class24) class24.field575.method3613()) {
            if (var1.field579 != null) {
                Statics.field1822.method1151(var1.field579);
                var1.field579 = null;
            }
            if (var1.field584 != null) {
                Statics.field1822.method1151(var1.field584);
                var1.field584 = null;
            }
        }
        class24.field575.method3605();
        method781(10);
    }

    @ObfuscatedName("dv.d(I)V")
    public static final void method2693() {
        class47.method3533();
        class42.field943.method3540();
        class45.method155();
        class41.method654();
        class40.method680();
        class52.method2();
        class43.field964.method3540();
        class43.field953.method3540();
        class44.field987.method3540();
        class44.field974.method3540();
        class48.method601();
        class53.field1126.method3540();
        class179.field2901.method3540();
        class173.field2793.method3540();
        class173.field2726.method3540();
        class173.field2727.method3540();
        class173.field2728.method3540();
        ((class95) Statics.field1532).method2080();
        class23.field562.method3540();
        Statics.field2250.method3160();
        Statics.field1327.method3160();
        Statics.field2630.method3160();
        Statics.field732.method3160();
        Statics.field1827.method3160();
        Statics.field773.method3160();
        Statics.field128.method3160();
        Statics.field2023.method3160();
        Statics.field842.method3160();
        Statics.field15.method3160();
        Statics.field2143.method3160();
        Statics.field2142.method3160();
    }

    @ObfuscatedName("fo.q(I)V")
    public static final void method3223() {
        if (Statics.field639 != null) {
            Statics.field639.method1192();
        }
        if (Statics.field117 != null) {
            Statics.field117.method1192();
        }
    }

    @ObfuscatedName("es.o(Laf;IIIB)V")
    public static void method2966(class43 arg0, int arg1, int arg2, int arg3) {
        if (field386 >= 50 || field498 == 0 || arg0.field958 == null || arg1 >= arg0.field958.length) {
            return;
        }
        int var4 = arg0.field958[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field500[field386] = var5;
        field275[field386] = var6;
        field502[field386] = 0;
        field504[field386] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field424[field386] = (var8 << 16) + (var9 << 8) + var7;
        field386++;
    }

    @ObfuscatedName("f.w(IIII)V")
    public static void method204(int arg0, int arg1, int arg2) {
        if (field418 == 0 || arg1 == 0 || field386 >= 50) {
            return;
        }
        field500[field386] = arg0;
        field275[field386] = arg1;
        field502[field386] = arg2;
        field504[field386] = null;
        field424[field386] = 0;
        field386++;
    }

    @ObfuscatedName("u.z(IB)V")
    public static void method45(int arg0) {
        if (arg0 == -1 && !field496) {
            Statics.field2930.method3514();
            class183.field2933 = 1;
            Statics.field2932 = null;
        } else if (arg0 != -1 && field495 != arg0 && field411 != 0 && !field496) {
            class183.method2182(2, Statics.field773, arg0, 0, field411, false);
        }
        field495 = arg0;
    }

    @ObfuscatedName("c.t(III)V")
    public static void method164(int arg0, int arg1) {
        if (field411 != 0 && arg0 != -1) {
            class183.method1626(Statics.field2143, arg0, 0, field411, false);
            field496 = true;
        }
    }

    @ObfuscatedName("j.aq(I)V")
    public static final void method68() {
        if (Statics.field19 == field486) {
            return;
        }
        field486 = Statics.field19;
        int var0 = Statics.field19;
        int[] var1 = Statics.field197.field1355;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field73[var0][var6][var4] & 0x18) == 0) {
                    Statics.field788.method1855(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class6.field73[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field788.method1855(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field197.method1640();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field73[var0][var10][var9] & 0x18) == 0) {
                    method991(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class6.field73[var0 + 1][var10][var9] & 0x8) != 0) {
                    method991(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field409 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field788.method1857(Statics.field19, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method85(var14).field910;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field433[Statics.field19].field1852;
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
                        field490[field409] = Statics.field997[var15];
                        field488[field409] = var16;
                        field355[field409] = var17;
                        field409++;
                    }
                }
            }
        }
        Statics.field2145.method1628();
    }

    @ObfuscatedName("k.an(Lfd;III)V")
    public static final void method51(class173 arg0, int arg1, int arg2) {
        if (field474 != 0 && field474 != 3 || class140.field2130 != 1 && Statics.field2882 || class140.field2130 != 4) {
            return;
        }
        class175 var3 = arg0.method3271(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2128 - arg1;
        int var5 = class140.field2129 - arg2;
        if (!var3.method3276(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2876 / 2;
        int var7 = var5 - var3.field2871 / 2;
        int var8 = field329 + field273 & 0x7FF;
        int var9 = class91.field1530[var8];
        int var10 = class91.field1536[var8];
        int var11 = (field492 + 256) * var9 >> 8;
        int var12 = (field492 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field989.field815 + var13 >> 7;
        int var16 = Statics.field989.field805 - var14 >> 7;
        field301.method2648(47);
        field301.method2366(18);
        field301.method2415(Statics.field2112 + var15);
        field301.method2404(class137.field2089[82] ? (class137.field2089[81] ? 2 : 1) : 0);
        field301.method2466(Statics.field2677 + var16);
        field301.method2366(var6);
        field301.method2366(var7);
        field301.method2466(field273);
        field301.method2366(57);
        field301.method2366(field329);
        field301.method2366(field492);
        field301.method2366(89);
        field301.method2466(Statics.field989.field815);
        field301.method2466(Statics.field989.field805);
        field301.method2366(63);
        field491 = var15;
        field519 = var16;
    }

    @ObfuscatedName("ap.av(Ljava/lang/String;I)V")
    public static final void method777(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2665.field132 = !Statics.field2665.field132;
            class9.method3224();
            if (Statics.field2665.field132) {
                class12.method2685(99, "", "Roofs are now all hidden");
            } else {
                class12.method2685(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field274 = !field274;
        }
        if (field493 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field274 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field274 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field489 > 0) {
                    method769();
                } else {
                    method781(40);
                    Statics.field839 = Statics.field1511;
                    Statics.field1511 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field520 == 2) {
                throw new RuntimeException();
            }
        }
        field301.method2648(255);
        field301.method2366(arg0.length() + 1);
        field301.method2372(arg0);
    }

    @ObfuscatedName("cv.ac(I)V")
    public static final void method1817() {
        int var0 = Statics.field2717 * 128 + 64;
        int var1 = Statics.field2141 * 128 + 64;
        int var2 = method39(var0, var1, Statics.field19) - Statics.field129;
        if (Statics.field1134 < var0) {
            Statics.field1134 += Statics.field578 * (var0 - Statics.field1134) / 1000 + Statics.field675;
            if (Statics.field1134 > var0) {
                Statics.field1134 = var0;
            }
        }
        if (Statics.field1134 > var0) {
            Statics.field1134 -= Statics.field578 * (Statics.field1134 - var0) / 1000 + Statics.field675;
            if (Statics.field1134 < var0) {
                Statics.field1134 = var0;
            }
        }
        if (Statics.field233 < var2) {
            Statics.field233 += Statics.field578 * (var2 - Statics.field233) / 1000 + Statics.field675;
            if (Statics.field233 > var2) {
                Statics.field233 = var2;
            }
        }
        if (Statics.field233 > var2) {
            Statics.field233 -= Statics.field578 * (Statics.field233 - var2) / 1000 + Statics.field675;
            if (Statics.field233 < var2) {
                Statics.field233 = var2;
            }
        }
        if (Statics.field184 < var1) {
            Statics.field184 += Statics.field578 * (var1 - Statics.field184) / 1000 + Statics.field675;
            if (Statics.field184 > var1) {
                Statics.field184 = var1;
            }
        }
        if (Statics.field184 > var1) {
            Statics.field184 -= Statics.field578 * (Statics.field184 - var1) / 1000 + Statics.field675;
            if (Statics.field184 < var1) {
                Statics.field184 = var1;
            }
        }
        int var3 = Statics.field2966 * 128 + 64;
        int var4 = Statics.field1905 * 128 + 64;
        int var5 = method39(var3, var4, Statics.field19) - Statics.field2041;
        int var6 = var3 - Statics.field1134;
        int var7 = var5 - Statics.field233;
        int var8 = var4 - Statics.field184;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field239 < var10) {
            Statics.field239 += Statics.field1922 * (var10 - Statics.field239) / 1000 + Statics.field2132;
            if (Statics.field239 > var10) {
                Statics.field239 = var10;
            }
        }
        if (Statics.field239 > var10) {
            Statics.field239 -= Statics.field1922 * (Statics.field239 - var10) / 1000 + Statics.field2132;
            if (Statics.field239 < var10) {
                Statics.field239 = var10;
            }
        }
        int var12 = var11 - Statics.field760;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field760 += Statics.field1922 * var12 / 1000 + Statics.field2132;
            Statics.field760 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field760 -= Statics.field1922 * -var12 / 1000 + Statics.field2132;
            Statics.field760 &= 0x7FF;
        }
        int var13 = var11 - Statics.field760;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field760 = var11;
        }
    }

    @ObfuscatedName("b.ar(B)V")
    public static final void method199() {
        int var0 = field482 + Statics.field989.field815;
        int var1 = field324 + Statics.field989.field805;
        if (Statics.field122 - var0 < -500 || Statics.field122 - var0 > 500 || Statics.field186 - var1 < -500 || Statics.field186 - var1 > 500) {
            Statics.field122 = var0;
            Statics.field186 = var1;
        }
        if (Statics.field122 != var0) {
            Statics.field122 += (var0 - Statics.field122) / 16;
        }
        if (Statics.field186 != var1) {
            Statics.field186 += (var1 - Statics.field186) / 16;
        }
        if (class140.field2120 == 4 && Statics.field2882) {
            int var2 = class140.field2122 - field348;
            field516 = var2 * 2;
            field348 = var2 == -1 || var2 == 1 ? class140.field2122 : (field348 + class140.field2122) / 2;
            int var3 = field261 - class140.field2121;
            field506 = var3 * 2;
            field261 = var3 == -1 || var3 == 1 ? class140.field2121 : (field261 + class140.field2121) / 2;
        } else {
            if (class137.field2089[96]) {
                field506 += (-24 - field506) / 2;
            } else if (class137.field2089[97]) {
                field506 += (24 - field506) / 2;
            } else {
                field506 /= 2;
            }
            if (class137.field2089[98]) {
                field516 += (12 - field516) / 2;
            } else if (class137.field2089[99]) {
                field516 += (-12 - field516) / 2;
            } else {
                field516 /= 2;
            }
            field348 = class140.field2122;
            field261 = class140.field2121;
        }
        field273 = field506 / 2 + field273 & 0x7FF;
        field343 += field516 / 2;
        if (field343 < 128) {
            field343 = 128;
        }
        if (field343 > 383) {
            field343 = 383;
        }
        int var4 = Statics.field122 >> 7;
        int var5 = Statics.field186 >> 7;
        int var6 = method39(Statics.field122, Statics.field186, Statics.field19);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field19;
                    if (var10 < 3 && (class6.field73[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field81[var10][var8][var9];
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
        if (var12 > field352) {
            field352 += (var12 - field352) / 24;
        } else if (var12 < field352) {
            field352 += (var12 - field352) / 80;
        }
    }

    @ObfuscatedName("an.ah(I)V")
    public static final void method671() {
        for (int var0 = 0; var0 < field297; var0++) {
            int var1 = field298[var0];
            class35 var2 = field296[var1];
            if (var2 != null) {
                method159(var2, var2.field747.field876);
            }
        }
    }

    @ObfuscatedName("c.ab(Laj;II)V")
    public static final void method159(class38 arg0, int arg1) {
        if (arg0.field822 > field423) {
            method665(arg0);
        } else if (arg0.field823 >= field423) {
            if (field423 == arg0.field823 || arg0.field808 == -1 || arg0.field811 != 0 || arg0.field810 + 1 > class43.method2262(arg0.field808).field957[arg0.field828]) {
                int var2 = arg0.field823 - arg0.field822;
                int var3 = field423 - arg0.field822;
                int var4 = arg0.field802 * 128 + arg0.field801 * 64;
                int var5 = arg0.field820 * 128 + arg0.field801 * 64;
                int var6 = arg0.field819 * 128 + arg0.field801 * 64;
                int var7 = arg0.field801 * 64 + arg0.field800 * 128;
                arg0.field815 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field805 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field817 = 0;
            arg0.field827 = arg0.field824;
            arg0.field779 = arg0.field827;
        } else {
            method113(arg0);
        }
        if (arg0.field815 < 128 || arg0.field805 < 128 || arg0.field815 >= 13184 || arg0.field805 >= 13184) {
            arg0.field808 = -1;
            arg0.field813 = -1;
            arg0.field822 = 0;
            arg0.field823 = 0;
            arg0.field815 = arg0.field831[0] * 128 + arg0.field801 * 64;
            arg0.field805 = arg0.field832[0] * 128 + arg0.field801 * 64;
            arg0.method765();
        }
        if (Statics.field989 == arg0 && (arg0.field815 < 1536 || arg0.field805 < 1536 || arg0.field815 >= 11776 || arg0.field805 >= 11776)) {
            arg0.field808 = -1;
            arg0.field813 = -1;
            arg0.field822 = 0;
            arg0.field823 = 0;
            arg0.field815 = arg0.field831[0] * 128 + arg0.field801 * 64;
            arg0.field805 = arg0.field832[0] * 128 + arg0.field801 * 64;
            arg0.method765();
        }
        method52(arg0);
        arg0.field833 = false;
        if (arg0.field792 != -1) {
            class43 var8 = class43.method2262(arg0.field792);
            if (var8 == null || var8.field955 == null) {
                arg0.field792 = -1;
            } else {
                arg0.field807++;
                if (arg0.field806 < var8.field955.length && arg0.field807 > var8.field957[arg0.field806]) {
                    arg0.field807 = 1;
                    arg0.field806++;
                    method2966(var8, arg0.field806, arg0.field815, arg0.field805);
                }
                if (arg0.field806 >= var8.field955.length) {
                    arg0.field807 = 0;
                    arg0.field806 = 0;
                    method2966(var8, arg0.field806, arg0.field815, arg0.field805);
                }
            }
        }
        if (arg0.field813 != -1 && field423 >= arg0.field780) {
            if (arg0.field814 < 0) {
                arg0.field814 = 0;
            }
            int var9 = class44.method875(arg0.field813).field977;
            if (var9 == -1) {
                arg0.field813 = -1;
            } else {
                class43 var10 = class43.method2262(var9);
                if (var10 == null || var10.field955 == null) {
                    arg0.field813 = -1;
                } else {
                    arg0.field781++;
                    if (arg0.field814 < var10.field955.length && arg0.field781 > var10.field957[arg0.field814]) {
                        arg0.field781 = 1;
                        arg0.field814++;
                        method2966(var10, arg0.field814, arg0.field815, arg0.field805);
                    }
                    if (arg0.field814 >= var10.field955.length && (arg0.field814 < 0 || arg0.field814 >= var10.field955.length)) {
                        arg0.field813 = -1;
                    }
                }
            }
        }
        if (arg0.field808 != -1 && arg0.field811 <= 1) {
            class43 var11 = class43.method2262(arg0.field808);
            if (var11.field966 == 1 && arg0.field825 > 0 && arg0.field822 <= field423 && arg0.field823 < field423) {
                arg0.field811 = 1;
                return;
            }
        }
        if (arg0.field808 != -1 && arg0.field811 == 0) {
            class43 var12 = class43.method2262(arg0.field808);
            if (var12 == null || var12.field955 == null) {
                arg0.field808 = -1;
            } else {
                arg0.field810++;
                if (arg0.field828 < var12.field955.length && arg0.field810 > var12.field957[arg0.field828]) {
                    arg0.field810 = 1;
                    arg0.field828++;
                    method2966(var12, arg0.field828, arg0.field815, arg0.field805);
                }
                if (arg0.field828 >= var12.field955.length) {
                    arg0.field828 -= var12.field956;
                    arg0.field812++;
                    if (arg0.field812 >= var12.field965) {
                        arg0.field808 = -1;
                    } else if (arg0.field828 >= 0 && arg0.field828 < var12.field955.length) {
                        method2966(var12, arg0.field828, arg0.field815, arg0.field805);
                    } else {
                        arg0.field808 = -1;
                    }
                }
                arg0.field833 = var12.field961;
            }
        }
        if (arg0.field811 > 0) {
            arg0.field811--;
        }
    }

    @ObfuscatedName("an.au(Laj;I)V")
    public static final void method665(class38 arg0) {
        int var1 = arg0.field822 - field423;
        int var2 = arg0.field802 * 128 + arg0.field801 * 64;
        int var3 = arg0.field820 * 128 + arg0.field801 * 64;
        arg0.field815 += (var2 - arg0.field815) / var1;
        arg0.field805 += (var3 - arg0.field805) / var1;
        arg0.field817 = 0;
        arg0.field827 = arg0.field824;
    }

    @ObfuscatedName("g.ao(Laj;B)V")
    public static final void method113(class38 arg0) {
        arg0.field792 = arg0.field782;
        if (arg0.field830 == 0) {
            arg0.field817 = 0;
            return;
        }
        if (arg0.field808 != -1 && arg0.field811 == 0) {
            class43 var1 = class43.method2262(arg0.field808);
            if (arg0.field825 > 0 && var1.field966 == 0) {
                arg0.field817++;
                return;
            }
            if (arg0.field825 <= 0 && var1.field967 == 0) {
                arg0.field817++;
                return;
            }
        }
        int var2 = arg0.field815;
        int var3 = arg0.field805;
        int var4 = arg0.field831[arg0.field830 - 1] * 128 + arg0.field801 * 64;
        int var5 = arg0.field832[arg0.field830 - 1] * 128 + arg0.field801 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field827 = 1280;
            } else if (var3 > var5) {
                arg0.field827 = 1792;
            } else {
                arg0.field827 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field827 = 768;
            } else if (var3 > var5) {
                arg0.field827 = 256;
            } else {
                arg0.field827 = 512;
            }
        } else if (var3 < var5) {
            arg0.field827 = 1024;
        } else if (var3 > var5) {
            arg0.field827 = 0;
        }
        byte var6 = arg0.field834[arg0.field830 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field815 = var4;
            arg0.field805 = var5;
            arg0.field830--;
            if (arg0.field825 > 0) {
                arg0.field825--;
            }
            return;
        }
        int var7 = arg0.field827 - arg0.field779 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field791;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field786;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field821;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field787;
        }
        if (var8 == -1) {
            var8 = arg0.field786;
        }
        arg0.field792 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class35) {
            var10 = ((class35) arg0).field747.field877;
        }
        if (var10) {
            if (arg0.field827 != arg0.field779 && arg0.field835 == -1 && arg0.field829 != 0) {
                var9 = 2;
            }
            if (arg0.field830 > 2) {
                var9 = 6;
            }
            if (arg0.field830 > 3) {
                var9 = 8;
            }
            if (arg0.field817 > 0 && arg0.field830 > 1) {
                var9 = 8;
                arg0.field817--;
            }
        } else {
            if (arg0.field830 > 1) {
                var9 = 6;
            }
            if (arg0.field830 > 2) {
                var9 = 8;
            }
            if (arg0.field817 > 0 && arg0.field830 > 1) {
                var9 = 8;
                arg0.field817--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field792 == arg0.field786 && arg0.field789 != -1) {
            arg0.field792 = arg0.field789;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field815 += var9;
                if (arg0.field815 > var4) {
                    arg0.field815 = var4;
                }
            } else if (var2 > var4) {
                arg0.field815 -= var9;
                if (arg0.field815 < var4) {
                    arg0.field815 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field805 += var9;
                if (arg0.field805 > var5) {
                    arg0.field805 = var5;
                }
            } else if (var3 > var5) {
                arg0.field805 -= var9;
                if (arg0.field805 < var5) {
                    arg0.field805 = var5;
                }
            }
        }
        if (arg0.field815 == var4 && arg0.field805 == var5) {
            arg0.field830--;
            if (arg0.field825 > 0) {
                arg0.field825--;
            }
        }
    }

    @ObfuscatedName("k.am(Laj;B)V")
    public static final void method52(class38 arg0) {
        if (arg0.field829 == 0) {
            return;
        }
        if (arg0.field835 != -1) {
            class38 var1 = null;
            if (arg0.field835 < 32768) {
                var1 = field296[arg0.field835];
            } else if (arg0.field835 >= 32768) {
                var1 = field469[arg0.field835 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field815 - var1.field815;
                int var3 = arg0.field805 - var1.field805;
                if (var2 != 0 || var3 != 0) {
                    arg0.field827 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field803) {
                arg0.field835 = -1;
                arg0.field803 = false;
            }
        }
        if (arg0.field804 != -1 && (arg0.field830 == 0 || arg0.field817 > 0)) {
            arg0.field827 = arg0.field804;
            arg0.field804 = -1;
        }
        int var4 = arg0.field827 - arg0.field779 & 0x7FF;
        if (var4 == 0 && arg0.field803) {
            arg0.field835 = -1;
            arg0.field803 = false;
        }
        if (var4 == 0) {
            arg0.field818 = 0;
            return;
        }
        arg0.field818++;
        if (var4 > 1024) {
            arg0.field779 -= arg0.field829;
            boolean var5 = true;
            if (var4 < arg0.field829 || var4 > 2048 - arg0.field829) {
                arg0.field779 = arg0.field827;
                var5 = false;
            }
            if (arg0.field792 == arg0.field782 && (arg0.field818 > 25 || var5)) {
                if (arg0.field783 == -1) {
                    arg0.field792 = arg0.field786;
                } else {
                    arg0.field792 = arg0.field783;
                }
            }
        } else {
            arg0.field779 += arg0.field829;
            boolean var6 = true;
            if (var4 < arg0.field829 || var4 > 2048 - arg0.field829) {
                arg0.field779 = arg0.field827;
                var6 = false;
            }
            if (arg0.field792 == arg0.field782 && (arg0.field818 > 25 || var6)) {
                if (arg0.field784 == -1) {
                    arg0.field792 = arg0.field786;
                } else {
                    arg0.field792 = arg0.field784;
                }
            }
        }
        arg0.field779 &= 0x7FF;
    }

    @ObfuscatedName("l.aa(Ly;III)V")
    public static void method8(class3 arg0, int arg1, int arg2) {
        if (arg0.field808 == arg1 && arg1 != -1) {
            int var3 = class43.method2262(arg1).field968;
            if (var3 == 1) {
                arg0.field828 = 0;
                arg0.field810 = 0;
                arg0.field811 = arg2;
                arg0.field812 = 0;
            }
            if (var3 == 2) {
                arg0.field812 = 0;
            }
        } else if (arg1 == -1 || arg0.field808 == -1 || class43.method2262(arg1).field970 >= class43.method2262(arg0.field808).field970) {
            arg0.field808 = arg1;
            arg0.field828 = 0;
            arg0.field810 = 0;
            arg0.field811 = arg2;
            arg0.field812 = 0;
            arg0.field825 = arg0.field830;
        }
    }

    @ObfuscatedName("ab.aj(I)I")
    public static int method728() {
        return field471 ? 2 : 1;
    }

    @ObfuscatedName("c.ap(B)V")
    public static void method170() {
        Canvas var0 = Statics.field1559;
        var0.removeKeyListener(class137.field2092);
        var0.removeFocusListener(class137.field2092);
        class137.field2078 = -1;
        Canvas var1 = Statics.field1559;
        var1.removeMouseListener(class140.field2131);
        var1.removeMouseMotionListener(class140.field2131);
        var1.removeFocusListener(class140.field2131);
        class140.field2117 = 0;
        if (Statics.field1401 != null) {
            Statics.field1401.method2702(Statics.field1559);
        }
        Statics.field494.method2887();
        Statics.field1559.setBackground(Color.black);
        class137.method3347(Statics.field1559);
        Canvas var2 = Statics.field1559;
        var2.addMouseListener(class140.field2131);
        var2.addMouseMotionListener(class140.field2131);
        var2.addFocusListener(class140.field2131);
        if (Statics.field1401 != null) {
            Statics.field1401.method2711(Statics.field1559);
        }
        if (field262 != -1) {
            method2830(false);
        }
        field2176 = true;
    }

    @ObfuscatedName("o.at(B)V")
    public static void method603() {
        field301.method2648(36);
        field301.method2366(method728());
        field301.method2466(Statics.field942);
        field301.method2466(Statics.field2210);
    }

    @ObfuscatedName("bf.az(I)V")
    public static void method1627() {
        client var0 = Statics.field494;
        synchronized (Statics.field494) {
            Container var1 = Statics.field494.method2906();
            if (var1 != null) {
                Statics.field552 = Math.max(var1.getSize().width, Statics.field1311);
                Statics.field1915 = Math.max(var1.getSize().height, Statics.field2006);
                if (Statics.field1914 == var1) {
                    Insets var2 = Statics.field1914.getInsets();
                    Statics.field552 -= var2.right + var2.left;
                    Statics.field1915 -= var2.top + var2.bottom;
                }
                if (Statics.field552 <= 0) {
                    Statics.field552 = 1;
                }
                if (Statics.field1915 <= 0) {
                    Statics.field1915 = 1;
                }
                if (method728() == 1) {
                    Statics.field942 = field472;
                    Statics.field2210 = field473 * 503;
                } else {
                    Statics.field942 = Math.min(Statics.field552, 7680);
                    Statics.field2210 = Math.min(Statics.field1915, 2160);
                }
                field2172 = (Statics.field552 - Statics.field942) / 2;
                field2171 = 0;
                Statics.field1559.setSize(Statics.field942, Statics.field2210);
                Statics.field2145 = class78.method43(Statics.field942, Statics.field2210, Statics.field1559);
                if (Statics.field1914 == var1) {
                    Insets var3 = Statics.field1914.getInsets();
                    Statics.field1559.setLocation(field2172 + var3.left, field2171 + var3.top);
                } else {
                    Statics.field1559.setLocation(field2172, field2171);
                }
                int var4 = Statics.field942;
                int var5 = Statics.field2210;
                if (Statics.field552 < var4) {
                    int var6 = Statics.field552;
                }
                if (Statics.field1915 < var5) {
                    int var7 = Statics.field1915;
                }
                if (Statics.field2665 != null) {
                    try {
                        class132.method2718(Statics.field494, "resize", new Object[] { method728() });
                    } catch (Throwable var13) {
                    }
                }
                if (field262 != -1) {
                    int var9 = field262;
                    int var10 = Statics.field942;
                    int var11 = Statics.field2210;
                    if (class173.method2979(var9)) {
                        method2300(Statics.field2766[var9], -1, var10, var11, true);
                    }
                }
                method189();
            }
        }
    }

    @ObfuscatedName("n.ai(I)V")
    public static void method189() {
        int var0 = field2172;
        int var1 = field2171;
        int var2 = Statics.field552 - Statics.field942 - var0;
        int var3 = Statics.field1915 - Statics.field2210 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field494.method2906();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1914 == var4) {
                Insets var7 = Statics.field1914.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1915);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field552, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field552 + var5 - var2, var6, var2, Statics.field1915);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1915 + var6 - var3, Statics.field552, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("n.af(B)V")
    public static final void method192() {
        if (field262 != -1) {
            int var0 = field262;
            if (class173.method2979(var0)) {
                method127(Statics.field2766[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field460; var1++) {
            if (field462[var1]) {
                field463[var1] = true;
            }
            field464[var1] = field462[var1];
            field462[var1] = false;
        }
        field300 = field423;
        field319 = -1;
        field458 = -1;
        Statics.field121 = null;
        if (field262 != -1) {
            field460 = 0;
            method2317(field262, 0, 0, Statics.field942, Statics.field2210, 0, 0, -1);
        }
        class80.method1751();
        if (field398) {
            int var5 = Statics.field1933;
            int var6 = Statics.field1992;
            int var7 = Statics.field1031;
            int var8 = Statics.field1509;
            int var9 = 6116423;
            class80.method1735(var5, var6, var7, var8, var9);
            class80.method1735(var5 + 1, var6 + 1, var7 - 2, 16, 0);
            class80.method1737(var5 + 1, var6 + 18, var7 - 2, var8 - 19, 0);
            Statics.field164.method3826(class157.field2405, var5 + 3, var6 + 14, var9, -1);
            int var10 = class140.field2121;
            int var11 = class140.field2122;
            for (int var12 = 0; var12 < field399; var12++) {
                int var13 = (field399 - 1 - var12) * 15 + var6 + 31;
                int var14 = 16777215;
                if (var10 > var5 && var10 < var5 + var7 && var11 > var13 - 13 && var11 < var13 + 3) {
                    var14 = 16776960;
                }
                Statics.field164.method3826(method182(var12), var5 + 3, var13, var14, 0);
            }
            int var15 = Statics.field1933;
            int var16 = Statics.field1992;
            int var17 = Statics.field1031;
            int var18 = Statics.field1509;
            for (int var19 = 0; var19 < field460; var19++) {
                if (field467[var19] + field258[var19] > var15 && field258[var19] < var15 + var17 && field468[var19] + field380[var19] > var16 && field380[var19] < var16 + var18) {
                    field463[var19] = true;
                }
            }
        } else if (field319 != -1) {
            int var2 = field319;
            int var3 = field458;
            if (field399 >= 2 || field420 != 0 || field327) {
                String var4;
                if (field420 == 1 && field399 < 2) {
                    var4 = class157.field2539 + class157.field2444 + field536 + " " + class2.field22;
                } else if (field327 && field399 < 2) {
                    var4 = field450 + class157.field2444 + field340 + " " + class2.field22;
                } else {
                    var4 = method182(field399 - 1);
                }
                if (field399 > 2) {
                    var4 = var4 + class2.method2885(16777215) + " " + '/' + " " + (field399 - 2) + class157.field2438;
                }
                Statics.field164.method3827(var4, var2 + 4, var3 + 15, 16777215, 0, field423 / 1000);
            }
        }
        if (field412 == 3) {
            for (int var20 = 0; var20 < field460; var20++) {
                if (field464[var20]) {
                    class80.method1734(field258[var20], field380[var20], field467[var20], field468[var20], 16711935, 128);
                } else if (field463[var20]) {
                    class80.method1734(field258[var20], field380[var20], field467[var20], field468[var20], 16711680, 128);
                }
            }
        }
        class24.method2667(Statics.field19, Statics.field989.field815, Statics.field989.field805, field334);
        field334 = 0;
    }

    @ObfuscatedName("dm.aw(Ljava/lang/String;ZI)V")
    public static final void method2305(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field145.method3823(arg0, 250);
        int var6 = Statics.field145.method3839(arg0, 250) * 13;
        class80.method1735(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1737(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field145.method3829(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method655(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1559.getGraphics();
                Statics.field2145.method1557(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1559.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field460; var13++) {
            if (field467[var13] + field258[var13] > var9 && field258[var13] < var9 + var11 && field468[var13] + field380[var13] > var10 && field380[var13] < var10 + var12) {
                field463[var13] = true;
            }
        }
    }

    @ObfuscatedName("as.al(IIIIZB)V")
    public static final void method1033(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field526 - field511) * var5 / 100 + field511;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field385) {
            short var8 = field385;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field346) {
                var6 = field346;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1751();
                    class80.method1735(arg0, arg1, var10, arg3, -16777216);
                    class80.method1735(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field487) {
            short var11 = field487;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field515) {
                var6 = field515;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1751();
                    class80.method1735(arg0, arg1, arg2, var13, -16777216);
                    class80.method1735(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field476 - field513) * var5 / 100 + field513;
        field347 = arg3 * var6 * var14 / 85504 << 1;
        if (field521 != arg2 || field522 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1530[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1823(var15, 500, 800, arg2, arg3);
        }
        field375 = arg0;
        field257 = arg1;
        field521 = arg2;
        field522 = arg3;
    }

    @ObfuscatedName("h.ax(Lau;B)V")
    public static final void method186(class34 arg0) {
        if (Statics.field989.field815 >> 7 == field491 && Statics.field989.field805 >> 7 == field519) {
            field491 = 0;
        }
        int var1 = class33.field720;
        int[] var2 = class33.field725;
        int var3 = var1;
        if (class34.field737 == arg0 || class34.field741 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field737 == arg0) {
                var5 = Statics.field989;
                var6 = Statics.field989.field52 << 14;
            } else if (class34.field741 == arg0) {
                var5 = field469[field389];
                var6 = field389 << 14;
            } else {
                var5 = field469[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field739 == arg0 && field389 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method20() && !var5.field44) {
                var5.field48 = false;
                if ((field259 && var1 > 50 || var1 > 200) && class34.field737 != arg0 && var5.field792 == var5.field782) {
                    var5.field48 = true;
                }
                int var7 = var5.field815 >> 7;
                int var8 = var5.field805 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field43 == null || field423 < var5.field38 || field423 >= var5.field50) {
                        if ((var5.field815 & 0x7F) == 64 && (var5.field805 & 0x7F) == 64) {
                            if (field364 == field363[var7][var8]) {
                                continue;
                            }
                            field363[var7][var8] = field364;
                        }
                        var5.field51 = method39(var5.field815, var5.field805, Statics.field19);
                        Statics.field788.method1948(Statics.field19, var5.field815, var5.field805, var5.field51, 60, var5, var5.field779, var6, var5.field833);
                    } else {
                        var5.field48 = false;
                        var5.field51 = method39(var5.field815, var5.field805, Statics.field19);
                        Statics.field788.method1833(Statics.field19, var5.field815, var5.field805, var5.field51, 60, var5, var5.field779, var6, var5.field31, var5.field45, var5.field40, var5.field37);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.ag(ZB)V")
    public static final void method742(boolean arg0) {
        for (int var1 = 0; var1 < field297; var1++) {
            class35 var2 = field296[field298[var1]];
            int var3 = (field298[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field747.field868 == arg0 && var2.field747.method787()) {
                int var4 = var2.field815 >> 7;
                int var5 = var2.field805 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field801 == 1 && (var2.field815 & 0x7F) == 64 && (var2.field805 & 0x7F) == 64) {
                        if (field364 == field363[var4][var5]) {
                            continue;
                        }
                        field363[var4][var5] = field364;
                    }
                    if (!var2.field747.field863) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field788.method1948(Statics.field19, var2.field815, var2.field805, method39(var2.field815 + (var2.field801 * 64 - 64), var2.field805 + (var2.field801 * 64 - 64), Statics.field19), var2.field801 * 64 - 64 + 60, var2, var2.field779, var3, var2.field833);
                }
            }
        }
    }

    @ObfuscatedName("au.ad(I)I")
    public static final int method734() {
        if (Statics.field2665.field132) {
            return Statics.field19;
        } else {
            int var0 = method39(Statics.field1134, Statics.field184, Statics.field19);
            return var0 - Statics.field233 >= 800 || (class6.field73[Statics.field19][Statics.field1134 >> 7][Statics.field184 >> 7] & 0x4) == 0 ? 3 : Statics.field19;
        }
    }

    @ObfuscatedName("t.ae(IIB)V")
    public static final void method657(int arg0, int arg1) {
        if (field276 == 2) {
            method1199((field524 - Statics.field2112 << 7) + field282, (field459 - Statics.field2677 << 7) + field283, field281 * 2);
            if (field365 > -1 && field423 % 20 < 10) {
                Statics.field1504[0].method1650(field365 + arg0 - 12, field366 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("dk.as(Laj;IIIIII)V")
    public static final void method2306(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method20()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field747;
            if (var6.field849 != null) {
                var6 = var6.method786();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field720;
        int[] var8 = class33.field725;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field44) {
                return;
            }
            if (var10.field33 != -1 || var10.field34 != -1) {
                method779(arg0, arg0.field826 + 15);
                if (field365 > -1) {
                    if (var10.field33 != -1) {
                        Statics.field736[var10.field33].method1650(field365 + arg2 - 12, field366 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field34 != -1) {
                        Statics.field1312[var10.field34].method1650(field365 + arg2 - 12, field366 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field276 == 10 && field278 == var8[arg1]) {
                method779(arg0, arg0.field826 + 15);
                if (field365 > -1) {
                    Statics.field1504[1].method1650(field365 + arg2 - 12, field366 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field747;
            if (var11.field849 != null) {
                var11 = var11.method786();
            }
            if (var11.field871 >= 0 && var11.field871 < Statics.field1312.length) {
                method779(arg0, arg0.field826 + 15);
                if (field365 > -1) {
                    Statics.field1312[var11.field871].method1650(field365 + arg2 - 12, field366 + arg3 - 30);
                }
            }
            if (field276 == 1 && field277 == field298[arg1 - var7] && field423 % 20 < 10) {
                method779(arg0, arg0.field826 + 15);
                if (field365 > -1) {
                    Statics.field1504[0].method1650(field365 + arg2 - 12, field366 + arg3 - 28);
                }
            }
        }
        if (arg0.field790 != null && (arg1 >= var7 || !arg0.field785 && (field475 == 4 || !arg0.field816 && (field475 == 0 || field475 == 3 || field475 == 1 && Statics.method928(((class3) arg0).field47, false))))) {
            method779(arg0, arg0.field826);
            if (field365 > -1 && field353 < field354) {
                field358[field353] = Statics.field164.method3821(arg0.field790) / 2;
                field357[field353] = Statics.field164.field3165;
                field266[field353] = field365;
                field279[field353] = field366;
                field413[field353] = arg0.field794;
                field360[field353] = arg0.field795;
                field415[field353] = arg0.field793;
                field362[field353] = arg0.field790;
                field353++;
            }
        }
        if (arg0.field799 > field423) {
            method779(arg0, arg0.field826 + 15);
            if (field365 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field747;
                    var12 = var13.field879;
                }
                int var14 = arg0.field778 * var12 / arg0.field797;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field778 > 0) {
                    var14 = 1;
                }
                class80.method1735(field365 + arg2 - var12 / 2, field366 + arg3 - 3, var14, 5, 65280);
                class80.method1735(field365 + arg2 - var12 / 2 + var14, field366 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field798[var15] > field423) {
                method779(arg0, arg0.field826 / 2);
                if (field365 > -1) {
                    if (var15 == 1) {
                        field366 -= 20;
                    }
                    if (var15 == 2) {
                        field365 -= 15;
                        field366 -= 10;
                    }
                    if (var15 == 3) {
                        field365 += 15;
                        field366 -= 10;
                    }
                    Statics.field644[arg0.field777[var15]].method1650(field365 + arg2 - 12, field366 + arg3 - 12);
                    Statics.field1024.method3828(Integer.toString(arg0.field796[var15]), field365 + arg2 - 1, field366 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ah.ay(IIIIB)V")
    public static final void method712(int arg0, int arg1, int arg2, int arg3) {
        field353 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field720;
        int[] var7 = class33.field725;
        for (int var8 = 0; var8 < field297 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field469[var7[var8]];
                if (field389 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field296[field298[var8 - var6]];
            }
            method2306(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2306(field469[field389], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field353; var10++) {
            int var11 = field266[var10];
            int var12 = field279[var10];
            int var13 = field358[var10];
            int var14 = field357[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field279[var16] - field357[var16] && var12 - var14 < field279[var16] + 2 && var11 - var13 < field358[var16] + field266[var16] && var11 + var13 > field266[var16] - field358[var16] && field279[var16] - field357[var16] < var12) {
                        var12 = field279[var16] - field357[var16];
                        var15 = true;
                    }
                }
            }
            field365 = field266[var10];
            field366 = field279[var10] = var12;
            String var17 = field362[var10];
            if (field419 == 0) {
                int var18 = 16776960;
                if (field413[var10] < 6) {
                    var18 = field501[field413[var10]];
                }
                if (field413[var10] == 6) {
                    var18 = field364 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field413[var10] == 7) {
                    var18 = field364 % 20 < 10 ? 255 : 65535;
                }
                if (field413[var10] == 8) {
                    var18 = field364 % 20 < 10 ? 45056 : 8454016;
                }
                if (field413[var10] == 9) {
                    int var19 = 150 - field415[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field413[var10] == 10) {
                    int var20 = 150 - field415[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field413[var10] == 11) {
                    int var21 = 150 - field415[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field360[var10] == 0) {
                    Statics.field164.method3828(var17, field365 + arg0, field366 + arg1, var18, 0);
                }
                if (field360[var10] == 1) {
                    Statics.field164.method3845(var17, field365 + arg0, field366 + arg1, var18, 0, field364);
                }
                if (field360[var10] == 2) {
                    Statics.field164.method3831(var17, field365 + arg0, field366 + arg1, var18, 0, field364);
                }
                if (field360[var10] == 3) {
                    Statics.field164.method3848(var17, field365 + arg0, field366 + arg1, var18, 0, field364, 150 - field415[var10]);
                }
                if (field360[var10] == 4) {
                    int var22 = (150 - field415[var10]) * (Statics.field164.method3821(var17) + 100) / 150;
                    class80.method1730(field365 + arg0 - 50, arg1, field365 + arg0 + 50, arg1 + arg3);
                    Statics.field164.method3826(var17, field365 + arg0 + 50 - var22, field366 + arg1, var18, 0);
                    class80.method1784(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field360[var10] == 5) {
                    int var23 = 150 - field415[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1730(arg0, field366 + arg1 - Statics.field164.field3165 - 1, arg0 + arg2, field366 + arg1 + 5);
                    Statics.field164.method3828(var17, field365 + arg0, field366 + arg1 + var24, var18, 0);
                    class80.method1784(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field164.method3828(var17, field365 + arg0, field366 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("s.bz(I)V")
    public static final void method173() {
        field379 = 0;
        int var0 = (Statics.field989.field815 >> 7) + Statics.field2112;
        int var1 = (Statics.field989.field805 >> 7) + Statics.field2677;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field379 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field379 = 1;
        }
        if (field379 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field379 = 0;
        }
    }

    @ObfuscatedName("er.bx(IIIII)V")
    public static final void method2999(int arg0, int arg1, int arg2, int arg3) {
        if (field370 == 1) {
            Statics.field336[field264 / 100].method1650(field421 - 8, field371 - 8);
        }
        if (field370 == 2) {
            Statics.field336[field264 / 100 + 4].method1650(field421 - 8, field371 - 8);
        }
        method173();
    }

    @ObfuscatedName("ap.bq(Laj;II)V")
    public static final void method779(class38 arg0, int arg1) {
        method1199(arg0.field815, arg0.field805, arg1);
    }

    @ObfuscatedName("bi.bg(IIII)V")
    public static final void method1199(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field365 = -1;
            field366 = -1;
            return;
        }
        int var3 = method39(arg0, arg1, Statics.field19) - arg2;
        int var4 = arg0 - Statics.field1134;
        int var5 = var3 - Statics.field233;
        int var6 = arg1 - Statics.field184;
        int var7 = class91.field1530[Statics.field239];
        int var8 = class91.field1536[Statics.field239];
        int var9 = class91.field1530[Statics.field760];
        int var10 = class91.field1536[Statics.field760];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field365 = field347 * var11 / var15 + field521 / 2;
            field366 = field347 * var14 / var15 + field522 / 2;
        } else {
            field365 = -1;
            field366 = -1;
        }
    }

    @ObfuscatedName("y.bi(IIII)I")
    public static final int method39(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field73[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field81[var5][var3][var4] + class6.field81[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field81[var5][var3][var4 + 1] + class6.field81[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("e.bd(ZI)V")
    public static final void method122(boolean arg0) {
        field322 = arg0;
        if (!field322) {
            int var1 = field428.method2572();
            int var2 = field428.method2418();
            int var3 = (field304 - field428.field1955) / 16;
            Statics.field539 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field539[var4][var5] = field428.method2386();
                }
            }
            Statics.field2685 = new int[var3];
            Statics.field67 = new int[var3];
            Statics.field2249 = new int[var3];
            Statics.field2639 = new byte[var3][];
            Statics.field1560 = new byte[var3][];
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
                        Statics.field2685[var7] = var10;
                        Statics.field67[var7] = Statics.field1827.method3081("m" + var8 + "_" + var9);
                        Statics.field2249[var7] = Statics.field1827.method3081("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method762(var2, var1);
            return;
        }
        int var11 = field428.method2541();
        int var12 = field428.method2572();
        field428.method2637();
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 13; var14++) {
                for (int var15 = 0; var15 < 13; var15++) {
                    int var16 = field428.method2640(1);
                    if (var16 == 1) {
                        field320[var13][var14][var15] = field428.method2640(26);
                    } else {
                        field320[var13][var14][var15] = -1;
                    }
                }
            }
        }
        field428.method2635();
        int var17 = (field304 - field428.field1955) / 16;
        Statics.field539 = new int[var17][4];
        for (int var18 = 0; var18 < var17; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field539[var18][var19] = field428.method2386();
            }
        }
        Statics.field2685 = new int[var17];
        Statics.field67 = new int[var17];
        Statics.field2249 = new int[var17];
        Statics.field2639 = new byte[var17][];
        Statics.field1560 = new byte[var17][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field320[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2685[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2685[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field67[var20] = Statics.field1827.method3081("m" + var29 + "_" + var30);
                            Statics.field2249[var20] = Statics.field1827.method3081("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method762(var11, var12);
    }

    @ObfuscatedName("aa.bw(III)V")
    public static final void method762(int arg0, int arg1) {
        if (Statics.field1334 == arg0 && Statics.field2711 == arg1) {
            return;
        }
        Statics.field1334 = arg0;
        Statics.field2711 = arg1;
        method781(25);
        method2305(class157.field2293, true);
        int var2 = Statics.field2112;
        int var3 = Statics.field2677;
        Statics.field2112 = (arg0 - 6) * 8;
        Statics.field2677 = (arg1 - 6) * 8;
        int var4 = Statics.field2112 - var2;
        int var5 = Statics.field2677 - var3;
        int var6 = Statics.field2112;
        int var7 = Statics.field2677;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field296[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field831[var10] -= var4;
                    var9.field832[var10] -= var5;
                }
                var9.field815 -= var4 * 128;
                var9.field805 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field469[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field831[var13] -= var4;
                    var12.field832[var13] -= var5;
                }
                var12.field815 -= var4 * 128;
                var12.field805 -= var5 * 128;
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
                        field359[var24][var20][var21] = field359[var24][var22][var23];
                    } else {
                        field359[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field391.method3611(); var25 != null; var25 = (class17) field391.method3613()) {
            var25.field204 -= var4;
            var25.field205 -= var5;
            if (var25.field204 < 0 || var25.field205 < 0 || var25.field204 >= 104 || var25.field205 >= 104) {
                var25.method3702();
            }
        }
        if (field491 != 0) {
            field491 -= var4;
            field519 -= var5;
        }
        field386 = 0;
        field505 = false;
        field486 = -1;
        field393.method3605();
        field392.method3605();
    }

    @ObfuscatedName("ar.br(ZS)V")
    public static final void method684(boolean arg0) {
        method3223();
        field307++;
        if (field307 < 50 && !arg0) {
            return;
        }
        field307 = 0;
        if (field512 || Statics.field1511 == null) {
            return;
        }
        field301.method2648(25);
        try {
            Statics.field1511.method2866(field301.field1959, 0, field301.field1955);
            field301.field1955 = 0;
        } catch (IOException var2) {
            field512 = true;
        }
    }

    @ObfuscatedName("c.bb(I)V")
    public static final void method165() {
        method684(false);
        field497 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2639.length; var1++) {
            if (Statics.field67[var1] != -1 && Statics.field2639[var1] == null) {
                Statics.field2639[var1] = Statics.field1827.method3080(Statics.field67[var1], 0);
                if (Statics.field2639[var1] == null) {
                    var0 = false;
                    field497++;
                }
            }
            if (Statics.field2249[var1] != -1 && Statics.field1560[var1] == null) {
                Statics.field1560[var1] = Statics.field1827.method3082(Statics.field2249[var1], 0, Statics.field539[var1]);
                if (Statics.field1560[var1] == null) {
                    var0 = false;
                    field497++;
                }
            }
        }
        if (!var0) {
            field317 = 1;
            return;
        }
        field315 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2639.length; var3++) {
            byte[] var4 = Statics.field1560[var3];
            if (var4 != null) {
                int var5 = (Statics.field2685[var3] >> 8) * 64 - Statics.field2112;
                int var6 = (Statics.field2685[var3] & 0xFF) * 64 - Statics.field2677;
                if (field322) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class119 var9 = new class119(var4);
                int var10 = -1;
                label1091: while (true) {
                    int var11 = var9.method2394();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2394();
                            if (var16 == 0) {
                                continue label1091;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2562() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class41 var22 = class41.method85(var10);
                                if (var19 != 22 || !field259 || var22.field901 != 0 || var22.field899 == 1 || var22.field920) {
                                    if (!var22.method818()) {
                                        field315++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2394();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2562();
                    }
                }
            }
        }
        if (!var2) {
            field317 = 2;
            return;
        }
        if (field317 != 0) {
            method2305(class157.field2293 + class2.field18 + class2.field17 + 100 + "%" + class2.field21, true);
        }
        method3223();
        method2693();
        method3223();
        Statics.field788.method1927();
        method3223();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field433[var23].method2281();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field73[var24][var25][var26] = 0;
                }
            }
        }
        method3223();
        class6.method3289();
        int var27 = Statics.field2639.length;
        for (class24 var28 = (class24) class24.field575.method3611(); var28 != null; var28 = (class24) class24.field575.method3613()) {
            if (var28.field579 != null) {
                Statics.field1822.method1151(var28.field579);
                var28.field579 = null;
            }
            if (var28.field584 != null) {
                Statics.field1822.method1151(var28.field584);
                var28.field584 = null;
            }
        }
        class24.field575.method3605();
        method684(true);
        if (!field322) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field2685[var29] >> 8) * 64 - Statics.field2112;
                int var31 = (Statics.field2685[var29] & 0xFF) * 64 - Statics.field2677;
                byte[] var32 = Statics.field2639[var29];
                if (var32 != null) {
                    method3223();
                    class6.method114(var32, var30, var31, Statics.field1334 * 8 - 48, Statics.field2711 * 8 - 48, field433);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field2685[var33] >> 8) * 64 - Statics.field2112;
                int var35 = (Statics.field2685[var33] & 0xFF) * 64 - Statics.field2677;
                byte[] var36 = Statics.field2639[var33];
                if (var36 == null && Statics.field2711 < 800) {
                    method3223();
                    class6.method2677(var34, var35, 64, 64);
                }
            }
            method684(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field1560[var37];
                if (var38 != null) {
                    int var39 = (Statics.field2685[var37] >> 8) * 64 - Statics.field2112;
                    int var40 = (Statics.field2685[var37] & 0xFF) * 64 - Statics.field2677;
                    method3223();
                    class86 var41 = Statics.field788;
                    class108[] var42 = field433;
                    class119 var43 = new class119(var38);
                    int var44 = -1;
                    while (true) {
                        int var45 = var43.method2394();
                        if (var45 == 0) {
                            break;
                        }
                        var44 += var45;
                        int var46 = 0;
                        while (true) {
                            int var47 = var43.method2394();
                            if (var47 == 0) {
                                break;
                            }
                            var46 += var47 - 1;
                            int var48 = var46 & 0x3F;
                            int var49 = var46 >> 6 & 0x3F;
                            int var50 = var46 >> 12;
                            int var51 = var43.method2562();
                            int var52 = var51 >> 2;
                            int var53 = var51 & 0x3;
                            int var54 = var39 + var49;
                            int var55 = var40 + var48;
                            if (var54 > 0 && var55 > 0 && var54 < 103 && var55 < 103) {
                                int var56 = var50;
                                if ((class6.field73[1][var54][var55] & 0x2) == 2) {
                                    var56 = var50 - 1;
                                }
                                class108 var57 = null;
                                if (var56 >= 0) {
                                    var57 = var42[var56];
                                }
                                class6.method288(var50, var54, var55, var44, var53, var52, var41, var57);
                            }
                        }
                    }
                }
            }
        }
        if (field322) {
            for (int var58 = 0; var58 < 4; var58++) {
                method3223();
                for (int var59 = 0; var59 < 13; var59++) {
                    for (int var60 = 0; var60 < 13; var60++) {
                        boolean var61 = false;
                        int var62 = field320[var58][var59][var60];
                        if (var62 != -1) {
                            int var63 = var62 >> 24 & 0x3;
                            int var64 = var62 >> 1 & 0x3;
                            int var65 = var62 >> 14 & 0x3FF;
                            int var66 = var62 >> 3 & 0x7FF;
                            int var67 = (var65 / 8 << 8) + var66 / 8;
                            for (int var68 = 0; var68 < Statics.field2685.length; var68++) {
                                if (Statics.field2685[var68] == var67 && Statics.field2639[var68] != null) {
                                    byte[] var69 = Statics.field2639[var68];
                                    int var70 = var59 * 8;
                                    int var71 = var60 * 8;
                                    int var72 = (var65 & 0x7) * 8;
                                    int var73 = (var66 & 0x7) * 8;
                                    class108[] var74 = field433;
                                    for (int var75 = 0; var75 < 8; var75++) {
                                        for (int var76 = 0; var76 < 8; var76++) {
                                            if (var70 + var75 > 0 && var70 + var75 < 103 && var71 + var76 > 0 && var71 + var76 < 103) {
                                                var74[var58].field1852[var70 + var75][var71 + var76] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class119 var77 = new class119(var69);
                                    for (int var78 = 0; var78 < 4; var78++) {
                                        for (int var79 = 0; var79 < 64; var79++) {
                                            for (int var80 = 0; var80 < 64; var80++) {
                                                if (var63 == var78 && var79 >= var72 && var79 < var72 + 8 && var80 >= var73 && var80 < var73 + 8) {
                                                    int var83 = var70 + class177.method2985(var79 & 0x7, var80 & 0x7, var64);
                                                    int var85 = var79 & 0x7;
                                                    int var86 = var80 & 0x7;
                                                    int var88 = var64 & 0x3;
                                                    int var89;
                                                    if (var88 == 0) {
                                                        var89 = var86;
                                                    } else if (var88 == 1) {
                                                        var89 = 7 - var85;
                                                    } else if (var88 == 2) {
                                                        var89 = 7 - var86;
                                                    } else {
                                                        var89 = var85;
                                                    }
                                                    class6.method280(var77, var58, var83, var71 + var89, 0, 0, var64);
                                                } else {
                                                    class6.method280(var77, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var61 = true;
                                    break;
                                }
                            }
                        }
                        if (!var61) {
                            class6.method2747(var58, var59 * 8, var60 * 8);
                        }
                    }
                }
            }
            for (int var90 = 0; var90 < 13; var90++) {
                for (int var91 = 0; var91 < 13; var91++) {
                    int var92 = field320[0][var90][var91];
                    if (var92 == -1) {
                        class6.method2677(var90 * 8, var91 * 8, 8, 8);
                    }
                }
            }
            method684(true);
            for (int var93 = 0; var93 < 4; var93++) {
                method3223();
                for (int var94 = 0; var94 < 13; var94++) {
                    for (int var95 = 0; var95 < 13; var95++) {
                        int var96 = field320[var93][var94][var95];
                        if (var96 != -1) {
                            int var97 = var96 >> 24 & 0x3;
                            int var98 = var96 >> 1 & 0x3;
                            int var99 = var96 >> 14 & 0x3FF;
                            int var100 = var96 >> 3 & 0x7FF;
                            int var101 = (var99 / 8 << 8) + var100 / 8;
                            for (int var102 = 0; var102 < Statics.field2685.length; var102++) {
                                if (Statics.field2685[var102] == var101 && Statics.field1560[var102] != null) {
                                    Statics.method3744(Statics.field1560[var102], var93, var94 * 8, var95 * 8, var97, (var99 & 0x7) * 8, (var100 & 0x7) * 8, var98, Statics.field788, field433);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method684(true);
        method2693();
        method3223();
        class86 var103 = Statics.field788;
        class108[] var104 = field433;
        for (int var105 = 0; var105 < 4; var105++) {
            for (int var106 = 0; var106 < 104; var106++) {
                for (int var107 = 0; var107 < 104; var107++) {
                    if ((class6.field73[var105][var106][var107] & 0x1) == 1) {
                        int var108 = var105;
                        if ((class6.field73[1][var106][var107] & 0x2) == 2) {
                            var108 = var105 - 1;
                        }
                        if (var108 >= 0) {
                            var104[var108].method2271(var106, var107);
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
        class6.field72 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field72 < -16) {
            class6.field72 = -16;
        }
        if (class6.field72 > 16) {
            class6.field72 = 16;
        }
        for (int var109 = 0; var109 < 4; var109++) {
            byte[][] var110 = Statics.field2012[var109];
            int var111 = (int) Math.sqrt(5100.0D);
            int var112 = var111 * 768 >> 8;
            for (int var113 = 1; var113 < 103; var113++) {
                for (int var114 = 1; var114 < 103; var114++) {
                    int var115 = class6.field81[var109][var114 + 1][var113] - class6.field81[var109][var114 - 1][var113];
                    int var116 = class6.field81[var109][var114][var113 + 1] - class6.field81[var109][var114][var113 - 1];
                    int var117 = (int) Math.sqrt((double) (var116 * var116 + var115 * var115 + 65536));
                    int var118 = (var115 << 8) / var117;
                    int var119 = 65536 / var117;
                    int var120 = (var116 << 8) / var117;
                    int var121 = (var120 * -50 + var118 * -50 + var119 * -10) / var112 + 96;
                    int var122 = (var110[var114][var113] >> 1) + (var110[var114][var113 + 1] >> 3) + (var110[var114][var113 - 1] >> 2) + (var110[var114 - 1][var113] >> 2) + (var110[var114 + 1][var113] >> 3);
                    Statics.field75[var114][var113] = var121 - var122;
                }
            }
            for (int var123 = 0; var123 < 104; var123++) {
                Statics.field76[var123] = 0;
                Statics.field77[var123] = 0;
                Statics.field249[var123] = 0;
                Statics.field1027[var123] = 0;
                Statics.field1044[var123] = 0;
            }
            for (int var124 = -5; var124 < 109; var124++) {
                for (int var125 = 0; var125 < 104; var125++) {
                    int var126 = var124 + 5;
                    int var10002;
                    if (var126 >= 0 && var126 < 104) {
                        int var127 = Statics.field1061[var109][var126][var125] & 0xFF;
                        if (var127 > 0) {
                            class42 var128 = class42.method1(var127 - 1);
                            Statics.field76[var125] += var128.field939;
                            Statics.field77[var125] += var128.field937;
                            Statics.field249[var125] += var128.field938;
                            Statics.field1027[var125] += var128.field934;
                            var10002 = Statics.field1044[var125]++;
                        }
                    }
                    int var129 = var124 - 5;
                    if (var129 >= 0 && var129 < 104) {
                        int var130 = Statics.field1061[var109][var129][var125] & 0xFF;
                        if (var130 > 0) {
                            class42 var131 = class42.method1(var130 - 1);
                            Statics.field76[var125] -= var131.field939;
                            Statics.field77[var125] -= var131.field937;
                            Statics.field249[var125] -= var131.field938;
                            Statics.field1027[var125] -= var131.field934;
                            var10002 = Statics.field1044[var125]--;
                        }
                    }
                }
                if (var124 >= 1 && var124 < 103) {
                    int var132 = 0;
                    int var133 = 0;
                    int var134 = 0;
                    int var135 = 0;
                    int var136 = 0;
                    for (int var137 = -5; var137 < 109; var137++) {
                        int var138 = var137 + 5;
                        if (var138 >= 0 && var138 < 104) {
                            var132 += Statics.field76[var138];
                            var133 += Statics.field77[var138];
                            var134 += Statics.field249[var138];
                            var135 += Statics.field1027[var138];
                            var136 += Statics.field1044[var138];
                        }
                        int var139 = var137 - 5;
                        if (var139 >= 0 && var139 < 104) {
                            var132 -= Statics.field76[var139];
                            var133 -= Statics.field77[var139];
                            var134 -= Statics.field249[var139];
                            var135 -= Statics.field1027[var139];
                            var136 -= Statics.field1044[var139];
                        }
                        if (var137 >= 1 && var137 < 103 && (!field259 || (class6.field73[0][var124][var137] & 0x2) != 0 || (class6.field73[var109][var124][var137] & 0x10) == 0)) {
                            if (var109 < class6.field74) {
                                class6.field74 = var109;
                            }
                            int var140 = Statics.field1061[var109][var124][var137] & 0xFF;
                            int var141 = Statics.field59[var109][var124][var137] & 0xFF;
                            if (var140 > 0 || var141 > 0) {
                                int var142 = class6.field81[var109][var124][var137];
                                int var143 = class6.field81[var109][var124 + 1][var137];
                                int var144 = class6.field81[var109][var124 + 1][var137 + 1];
                                int var145 = class6.field81[var109][var124][var137 + 1];
                                int var146 = Statics.field75[var124][var137];
                                int var147 = Statics.field75[var124 + 1][var137];
                                int var148 = Statics.field75[var124 + 1][var137 + 1];
                                int var149 = Statics.field75[var124][var137 + 1];
                                int var150 = -1;
                                int var151 = -1;
                                if (var140 > 0) {
                                    int var152 = var132 * 256 / var135;
                                    int var153 = var133 / var136;
                                    int var154 = var134 / var136;
                                    var150 = class6.method2696(var152, var153, var154);
                                    int var155 = class6.field86 + var152 & 0xFF;
                                    int var156 = class6.field72 + var154;
                                    if (var156 < 0) {
                                        var156 = 0;
                                    } else if (var156 > 255) {
                                        var156 = 255;
                                    }
                                    var151 = class6.method2696(var155, var153, var156);
                                }
                                if (var109 > 0) {
                                    boolean var157 = true;
                                    if (var140 == 0 && Statics.field2144[var109][var124][var137] != 0) {
                                        var157 = false;
                                    }
                                    if (var141 > 0) {
                                        int var158 = var141 - 1;
                                        class47 var159 = (class47) class47.field1013.method3537((long) var158);
                                        class47 var160;
                                        if (var159 == null) {
                                            byte[] var161 = Statics.field1018.method3080(4, var158);
                                            class47 var162 = new class47();
                                            if (var161 != null) {
                                                var162.method971(new class119(var161), var158);
                                            }
                                            var162.method969();
                                            class47.field1013.method3539(var162, (long) var158);
                                            var160 = var162;
                                        } else {
                                            var160 = var159;
                                        }
                                        if (!var160.field1016) {
                                            var157 = false;
                                        }
                                    }
                                    if (var157 && var142 == var143 && var142 == var144 && var142 == var145) {
                                        Statics.field1051[var109][var124][var137] |= 0x924;
                                    }
                                }
                                int var163 = 0;
                                if (var151 != -1) {
                                    var163 = class91.field1531[class6.method2319(var151, 96)];
                                }
                                if (var141 == 0) {
                                    var103.method1826(var109, var124, var137, 0, 0, -1, var142, var143, var144, var145, class6.method2319(var150, var146), class6.method2319(var150, var147), class6.method2319(var150, var148), class6.method2319(var150, var149), 0, 0, 0, 0, var163, 0);
                                } else {
                                    int var164 = Statics.field2144[var109][var124][var137] + 1;
                                    byte var165 = Statics.field2632[var109][var124][var137];
                                    int var166 = var141 - 1;
                                    class47 var167 = (class47) class47.field1013.method3537((long) var166);
                                    class47 var168;
                                    if (var167 == null) {
                                        byte[] var169 = Statics.field1018.method3080(4, var166);
                                        class47 var170 = new class47();
                                        if (var169 != null) {
                                            var170.method971(new class119(var169), var166);
                                        }
                                        var170.method969();
                                        class47.field1013.method3539(var170, (long) var166);
                                        var168 = var170;
                                    } else {
                                        var168 = var167;
                                    }
                                    int var172 = var168.field1015;
                                    int var173;
                                    int var174;
                                    if (var172 >= 0) {
                                        var173 = Statics.field1532.method2063(var172);
                                        var174 = -1;
                                    } else if (var168.field1014 == 16711935) {
                                        var174 = -2;
                                        var172 = -1;
                                        var173 = -2;
                                    } else {
                                        var174 = class6.method2696(var168.field1023, var168.field1020, var168.field1019);
                                        int var175 = class6.field86 + var168.field1023 & 0xFF;
                                        int var176 = class6.field72 + var168.field1019;
                                        if (var176 < 0) {
                                            var176 = 0;
                                        } else if (var176 > 255) {
                                            var176 = 255;
                                        }
                                        var173 = class6.method2696(var175, var168.field1020, var176);
                                    }
                                    int var177 = 0;
                                    if (var173 != -2) {
                                        var177 = class91.field1531[class6.method619(var173, 96)];
                                    }
                                    if (var168.field1025 != -1) {
                                        int var178 = class6.field86 + var168.field1021 & 0xFF;
                                        int var179 = class6.field72 + var168.field1012;
                                        if (var179 < 0) {
                                            var179 = 0;
                                        } else if (var179 > 255) {
                                            var179 = 255;
                                        }
                                        int var180 = class6.method2696(var178, var168.field1022, var179);
                                        var177 = class91.field1531[class6.method619(var180, 96)];
                                    }
                                    var103.method1826(var109, var124, var137, var164, var165, var172, var142, var143, var144, var145, class6.method2319(var150, var146), class6.method2319(var150, var147), class6.method2319(var150, var148), class6.method2319(var150, var149), class6.method619(var174, var146), class6.method619(var174, var147), class6.method619(var174, var148), class6.method619(var174, var149), var163, var177);
                                }
                            }
                        }
                    }
                }
            }
            for (int var181 = 1; var181 < 103; var181++) {
                for (int var182 = 1; var182 < 103; var182++) {
                    int var187;
                    if ((class6.field73[var109][var182][var181] & 0x8) != 0) {
                        var187 = 0;
                    } else if (var109 <= 0 || (class6.field73[1][var182][var181] & 0x2) == 0) {
                        var187 = var109;
                    } else {
                        var187 = var109 - 1;
                    }
                    var103.method1849(var109, var182, var181, var187);
                }
            }
            Statics.field1061[var109] = (byte[][]) null;
            Statics.field59[var109] = (byte[][]) null;
            Statics.field2144[var109] = (byte[][]) null;
            Statics.field2632[var109] = (byte[][]) null;
            Statics.field2012[var109] = (byte[][]) null;
        }
        var103.method1852(-50, -10, -50);
        for (int var188 = 0; var188 < 104; var188++) {
            for (int var189 = 0; var189 < 104; var189++) {
                if ((class6.field73[1][var188][var189] & 0x2) == 2) {
                    var103.method1938(var188, var189);
                }
            }
        }
        int var190 = 1;
        int var191 = 2;
        int var192 = 4;
        for (int var193 = 0; var193 < 4; var193++) {
            if (var193 > 0) {
                var190 <<= 0x3;
                var191 <<= 0x3;
                var192 <<= 0x3;
            }
            for (int var194 = 0; var194 <= var193; var194++) {
                for (int var195 = 0; var195 <= 104; var195++) {
                    for (int var196 = 0; var196 <= 104; var196++) {
                        if ((Statics.field1051[var194][var196][var195] & var190) != 0) {
                            int var197 = var195;
                            int var198 = var195;
                            int var199 = var194;
                            int var200 = var194;
                            while (var197 > 0 && (Statics.field1051[var194][var196][var197 - 1] & var190) != 0) {
                                var197--;
                            }
                            while (var198 < 104 && (Statics.field1051[var194][var196][var198 + 1] & var190) != 0) {
                                var198++;
                            }
                            label650: while (var199 > 0) {
                                for (int var201 = var197; var201 <= var198; var201++) {
                                    if ((Statics.field1051[var199 - 1][var196][var201] & var190) == 0) {
                                        break label650;
                                    }
                                }
                                var199--;
                            }
                            label639: while (var200 < var193) {
                                for (int var202 = var197; var202 <= var198; var202++) {
                                    if ((Statics.field1051[var200 + 1][var196][var202] & var190) == 0) {
                                        break label639;
                                    }
                                }
                                var200++;
                            }
                            int var203 = (var200 + 1 - var199) * (var198 - var197 + 1);
                            if (var203 >= 8) {
                                short var204 = 240;
                                int var205 = class6.field81[var200][var196][var197] - var204;
                                int var206 = class6.field81[var199][var196][var197];
                                class86.method1824(var193, 1, var196 * 128, var196 * 128, var197 * 128, var198 * 128 + 128, var205, var206);
                                for (int var207 = var199; var207 <= var200; var207++) {
                                    for (int var208 = var197; var208 <= var198; var208++) {
                                        Statics.field1051[var207][var196][var208] &= ~var190;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1051[var194][var196][var195] & var191) != 0) {
                            int var209 = var196;
                            int var210 = var196;
                            int var211 = var194;
                            int var212 = var194;
                            while (var209 > 0 && (Statics.field1051[var194][var209 - 1][var195] & var191) != 0) {
                                var209--;
                            }
                            while (var210 < 104 && (Statics.field1051[var194][var210 + 1][var195] & var191) != 0) {
                                var210++;
                            }
                            label703: while (var211 > 0) {
                                for (int var213 = var209; var213 <= var210; var213++) {
                                    if ((Statics.field1051[var211 - 1][var213][var195] & var191) == 0) {
                                        break label703;
                                    }
                                }
                                var211--;
                            }
                            label692: while (var212 < var193) {
                                for (int var214 = var209; var214 <= var210; var214++) {
                                    if ((Statics.field1051[var212 + 1][var214][var195] & var191) == 0) {
                                        break label692;
                                    }
                                }
                                var212++;
                            }
                            int var215 = (var212 + 1 - var211) * (var210 - var209 + 1);
                            if (var215 >= 8) {
                                short var216 = 240;
                                int var217 = class6.field81[var212][var209][var195] - var216;
                                int var218 = class6.field81[var211][var209][var195];
                                class86.method1824(var193, 2, var209 * 128, var210 * 128 + 128, var195 * 128, var195 * 128, var217, var218);
                                for (int var219 = var211; var219 <= var212; var219++) {
                                    for (int var220 = var209; var220 <= var210; var220++) {
                                        Statics.field1051[var219][var220][var195] &= ~var191;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1051[var194][var196][var195] & var192) != 0) {
                            int var221 = var196;
                            int var222 = var196;
                            int var223 = var195;
                            int var224 = var195;
                            while (var223 > 0 && (Statics.field1051[var194][var196][var223 - 1] & var192) != 0) {
                                var223--;
                            }
                            while (var224 < 104 && (Statics.field1051[var194][var196][var224 + 1] & var192) != 0) {
                                var224++;
                            }
                            label756: while (var221 > 0) {
                                for (int var225 = var223; var225 <= var224; var225++) {
                                    if ((Statics.field1051[var194][var221 - 1][var225] & var192) == 0) {
                                        break label756;
                                    }
                                }
                                var221--;
                            }
                            label745: while (var222 < 104) {
                                for (int var226 = var223; var226 <= var224; var226++) {
                                    if ((Statics.field1051[var194][var222 + 1][var226] & var192) == 0) {
                                        break label745;
                                    }
                                }
                                var222++;
                            }
                            if ((var222 - var221 + 1) * (var224 - var223 + 1) >= 4) {
                                int var227 = class6.field81[var194][var221][var223];
                                class86.method1824(var193, 4, var221 * 128, var222 * 128 + 128, var223 * 128, var224 * 128 + 128, var227, var227);
                                for (int var228 = var221; var228 <= var222; var228++) {
                                    for (int var229 = var223; var229 <= var224; var229++) {
                                        Statics.field1051[var194][var228][var229] &= ~var192;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method684(true);
        int var230 = class6.field74;
        if (var230 > Statics.field19) {
            var230 = Statics.field19;
        }
        if (var230 < Statics.field19 - 1) {
            int var231 = Statics.field19 - 1;
        }
        if (field259) {
            Statics.field788.method1982(class6.field74);
        } else {
            Statics.field788.method1982(0);
        }
        for (int var232 = 0; var232 < 104; var232++) {
            for (int var233 = 0; var233 < 104; var233++) {
                method989(var232, var233);
            }
        }
        method3223();
        method125();
        class41.field885.method3540();
        if (Statics.field1914 != null) {
            field301.method2648(96);
            field301.method2514(1057001181);
        }
        if (!field322) {
            int var234 = (Statics.field1334 - 6) / 8;
            int var235 = (Statics.field1334 + 6) / 8;
            int var236 = (Statics.field2711 - 6) / 8;
            int var237 = (Statics.field2711 + 6) / 8;
            for (int var238 = var234 - 1; var238 <= var235 + 1; var238++) {
                for (int var239 = var236 - 1; var239 <= var237 + 1; var239++) {
                    if (var238 < var234 || var238 > var235 || var239 < var236 || var239 > var237) {
                        Statics.field1827.method3118("m" + var238 + "_" + var239);
                        Statics.field1827.method3118("l" + var238 + "_" + var239);
                    }
                }
            }
        }
        method781(30);
        method3223();
        class6.method3002();
        field301.method2648(145);
        class144.method1014();
    }

    @ObfuscatedName("ag.ba(IIIIII)V")
    public static final void method991(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field788.method1856(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field788.method1851(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field197.field1355;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method85(var12);
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
                class81 var14 = Statics.field609[var13.field911];
                if (var14 != null) {
                    int var15 = (var13.field930 * 4 - var14.field1376) / 2;
                    int var16 = (var13.field898 * 4 - var14.field1374) / 2;
                    var14.method1790(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field898) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field788.method1844(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field788.method1851(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method85(var21);
            if (var22.field911 != -1) {
                class81 var23 = Statics.field609[var22.field911];
                if (var23 != null) {
                    int var24 = (var22.field930 * 4 - var23.field1376) / 2;
                    int var25 = (var22.field898 * 4 - var23.field1374) / 2;
                    var23.method1790(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field898) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field197.field1355;
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
        int var29 = Statics.field788.method1857(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method85(var30);
        if (var31.field911 == -1) {
            return;
        }
        class81 var32 = Statics.field609[var31.field911];
        if (var32 != null) {
            int var33 = (var31.field930 * 4 - var32.field1376) / 2;
            int var34 = (var31.field898 * 4 - var32.field1374) / 2;
            var32.method1790(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field898) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("p.bt(I)Z")
    public static final boolean method132() {
        if (Statics.field1511 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1511.method2867();
            if (var0 == 0) {
                return false;
            }
            if (field305 == -1) {
                Statics.field1511.method2868(field428.field1959, 0, 1);
                field428.field1955 = 0;
                field305 = field428.method2633();
                field304 = class188.field3009[field305];
                var0--;
            }
            if (field304 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1511.method2868(field428.field1959, 0, 1);
                field304 = field428.field1959[0] & 0xFF;
                var0--;
            }
            if (field304 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1511.method2868(field428.field1959, 0, 2);
                field428.field1955 = 0;
                field304 = field428.method2541();
                var0 -= 2;
            }
            if (var0 < field304) {
                return false;
            }
            field428.field1955 = 0;
            Statics.field1511.method2868(field428.field1959, 0, field304);
            field268 = 0;
            field310 = field309;
            field309 = field272;
            field272 = field305;
            if (field305 == 244) {
                int var1 = field428.method2386();
                int var2 = field428.method2416();
                class173 var3 = class173.method47(var1);
                if (var3.field2772 != 1 || var3.field2737 != var2) {
                    var3.field2772 = 1;
                    var3.field2737 = var2;
                    method172(var3);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 202) {
                int var4 = field428.method2541();
                int var5 = field428.method2365();
                class176.field2879[var4] = var5;
                if (class176.field2878[var4] != var5) {
                    class176.field2878[var4] = var5;
                    method2322(var4);
                }
                field443[++field444 - 1 & 0x1F] = var4;
                field305 = -1;
                return true;
            }
            if (field305 == 218) {
                method122(true);
                field305 = -1;
                return true;
            }
            if (field305 == 77) {
                method915(false);
                field305 = -1;
                return true;
            }
            if (field305 == 211) {
                String var6 = field428.method2389();
                int var7 = field428.method2428();
                class173 var8 = class173.method47(var7);
                if (!var6.equals(var8.field2856)) {
                    var8.field2856 = var6;
                    method172(var8);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 178) {
                Statics.field218 = class130.method161(field428.method2562());
                field305 = -1;
                return true;
            }
            if (field305 == 119) {
                method122(false);
                field305 = -1;
                return true;
            }
            if (field305 == 2) {
                method3192();
                field294 = field428.method2384();
                field454 = field442;
                field305 = -1;
                return true;
            }
            if (field305 == 171) {
                int var9 = field428.method2562();
                if (field428.method2562() == 0) {
                    field331[var9] = new class220();
                    field428.field1955 += 18;
                } else {
                    field428.field1955--;
                    field331[var9] = new class220(field428, false);
                }
                field369 = field442;
                field305 = -1;
                return true;
            }
            if (field305 == 150) {
                int var10 = field428.method2386();
                class4 var11 = (class4) field517.method3571((long) var10);
                if (var11 != null) {
                    method2172(var11, true);
                }
                if (field416 != null) {
                    method172(field416);
                    field416 = null;
                }
                field305 = -1;
                return true;
            }
            if (field305 == 165) {
                int var12 = field428.method2365();
                int var13 = field428.method2572();
                int var14 = field428.method2541();
                int var15 = field428.method2416();
                class173 var16 = class173.method47(var12);
                if (var16.field2780 != var15 || var16.field2837 != var13 || var16.field2783 != var14) {
                    var16.field2780 = var15;
                    var16.field2837 = var13;
                    var16.field2783 = var14;
                    method172(var16);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 87) {
                int var17 = field428.method2416();
                class16.method2819(var17);
                field445[++field446 - 1 & 0x1F] = var17 & 0x7FFF;
                field305 = -1;
                return true;
            }
            if (field305 == 4) {
                method769();
                field305 = -1;
                return false;
            }
            if (field305 == 235) {
                int var18 = field428.method2365();
                int var19 = field428.method2491();
                int var20 = field428.method2572();
                if (var20 == 65535) {
                    var20 = -1;
                }
                class173 var21 = class173.method47(var18);
                if (var21.field2730) {
                    var21.field2849 = var20;
                    var21.field2850 = var19;
                    class52 var23 = class52.method168(var20);
                    var21.field2780 = var23.field1084;
                    var21.field2837 = var23.field1085;
                    var21.field2723 = var23.field1086;
                    var21.field2795 = var23.field1087;
                    var21.field2748 = var23.field1081;
                    var21.field2783 = var23.field1114;
                    if (var23.field1089 == 1) {
                        var21.field2787 = 1;
                    } else {
                        var21.field2787 = 2;
                    }
                    if (var21.field2784 > 0) {
                        var21.field2783 = var21.field2783 * 32 / var21.field2784;
                    } else if (var21.field2742 > 0) {
                        var21.field2783 = var21.field2783 * 32 / var21.field2742;
                    }
                    method172(var21);
                } else if (var20 == -1) {
                    var21.field2772 = 0;
                    field305 = -1;
                    return true;
                } else {
                    class52 var22 = class52.method168(var20);
                    var21.field2772 = 4;
                    var21.field2737 = var20;
                    var21.field2780 = var22.field1084;
                    var21.field2837 = var22.field1085;
                    var21.field2783 = var22.field1114 * 100 / var19;
                    method172(var21);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 173) {
                boolean var24 = field428.method2562() == 1;
                if (var24) {
                    Statics.field1925 = class115.method2177() - field428.method2387();
                    Statics.field189 = new class221(field428, true);
                } else {
                    Statics.field189 = null;
                }
                field291 = field442;
                field305 = -1;
                return true;
            }
            if (field305 == 54) {
                int var25 = field428.method2438();
                int var26 = field428.method2386();
                class173 var27 = class173.method47(var26);
                if (var27.field2859 != var25 || var25 == -1) {
                    var27.field2859 = var25;
                    var27.field2851 = 0;
                    var27.field2852 = 0;
                    method172(var27);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 231) {
                int var28 = field428.method2386();
                int var29 = field428.method2541();
                if (var28 < -70000) {
                    var29 += 32768;
                }
                class173 var30;
                if (var28 >= 0) {
                    var30 = class173.method47(var28);
                } else {
                    var30 = null;
                }
                while (field428.field1955 < field304) {
                    int var31 = field428.method2394();
                    int var32 = field428.method2541();
                    int var33 = 0;
                    if (var32 != 0) {
                        var33 = field428.method2562();
                        if (var33 == 255) {
                            var33 = field428.method2386();
                        }
                    }
                    if (var30 != null && var31 >= 0 && var31 < var30.field2847.length) {
                        var30.field2847[var31] = var32;
                        var30.field2848[var31] = var33;
                    }
                    class16.method2264(var29, var31, var32 - 1, var33);
                }
                if (var30 != null) {
                    method172(var30);
                }
                method3192();
                field445[++field446 - 1 & 0x1F] = var29 & 0x7FFF;
                field305 = -1;
                return true;
            }
            if (field305 == 166) {
                int var34 = field428.method2418();
                field262 = var34;
                int var35 = field262;
                int var36 = Statics.field942;
                int var37 = Statics.field2210;
                if (class173.method2979(var35)) {
                    method2300(Statics.field2766[var35], -1, var36, var37, false);
                }
                method1256(var34);
                class37.method653(field262);
                for (int var38 = 0; var38 < 100; var38++) {
                    field462[var38] = true;
                }
                field305 = -1;
                return true;
            }
            if (field305 == 203) {
                String var39 = field428.method2389();
                long var40 = (long) field428.method2541();
                long var42 = (long) field428.method2385();
                class152 var44 = (class152) class109.method995(class152.method2303(), field428.method2562());
                long var45 = (var40 << 32) + var42;
                boolean var47 = false;
                for (int var48 = 0; var48 < 100; var48++) {
                    if (field478[var48] == var45) {
                        var47 = true;
                        break;
                    }
                }
                if (method2170(var39)) {
                    var47 = true;
                }
                if (!var47 && field379 == 0) {
                    field478[field479] = var45;
                    field479 = (field479 + 1) % 100;
                    String var49 = class223.method3825(Statics.method3064(class222.method580(field428)));
                    byte var50;
                    if (var44.field2235) {
                        var50 = 7;
                    } else {
                        var50 = 3;
                    }
                    if (var44.field2234 == -1) {
                        class12.method2685(var50, var39, var49);
                    } else {
                        int var52 = var44.field2234;
                        String var53 = "<img=" + var52 + ">";
                        class12.method2685(var50, var53 + var39, var49);
                    }
                }
                field305 = -1;
                return true;
            }
            if (field305 == 249) {
                int var54 = field428.method2418();
                int var55 = field428.method2386();
                int var56 = field428.method2416();
                class173 var57 = class173.method47(var55);
                var57.field2830 = (var56 << 16) + var54;
                field305 = -1;
                return true;
            }
            if (field305 == 189) {
                for (int var58 = 0; var58 < class176.field2878.length; var58++) {
                    if (class176.field2879[var58] != class176.field2878[var58]) {
                        class176.field2878[var58] = class176.field2879[var58];
                        method2322(var58);
                        field443[++field444 - 1 & 0x1F] = var58;
                    }
                }
                field305 = -1;
                return true;
            }
            if (field305 == 55) {
                int var59 = field428.method2386();
                class173 var60 = class173.method47(var59);
                for (int var61 = 0; var61 < var60.field2847.length; var61++) {
                    var60.field2847[var61] = -1;
                    var60.field2847[var61] = 0;
                }
                method172(var60);
                field305 = -1;
                return true;
            }
            if (field305 == 71) {
                field451 = field442;
                if (field304 == 0) {
                    field484 = null;
                    field485 = null;
                    Statics.field2683 = 0;
                    Statics.field2214 = null;
                    field305 = -1;
                    return true;
                }
                field485 = field428.method2389();
                long var62 = field428.method2387();
                long var64 = var62;
                String var66;
                if (var62 <= 0L || var62 >= 6582952005840035281L) {
                    var66 = null;
                } else if (var62 % 37L == 0L) {
                    var66 = null;
                } else {
                    int var67 = 0;
                    for (long var68 = var62; var68 != 0L; var68 /= 37L) {
                        var67++;
                    }
                    StringBuilder var70 = new StringBuilder(var67);
                    while (var64 != 0L) {
                        long var71 = var64;
                        var64 /= 37L;
                        var70.append(class162.field2626[(int) (var71 - var64 * 37L)]);
                    }
                    var66 = var70.reverse().toString();
                }
                field484 = var66;
                Statics.field1820 = field428.method2382();
                int var73 = field428.method2562();
                if (var73 == 255) {
                    field305 = -1;
                    return true;
                }
                Statics.field2683 = var73;
                class25[] var74 = new class25[100];
                for (int var75 = 0; var75 < Statics.field2683; var75++) {
                    var74[var75] = new class25();
                    var74[var75].field594 = field428.method2389();
                    var74[var75].field592 = class164.method1092(var74[var75].field594, Statics.field1826);
                    var74[var75].field591 = field428.method2541();
                    var74[var75].field593 = field428.method2382();
                    field428.method2389();
                    if (var74[var75].field594.equals(Statics.field989.field47)) {
                        Statics.field1828 = var74[var75].field593;
                    }
                }
                boolean var76 = false;
                int var77 = Statics.field2683;
                while (var77 > 0) {
                    boolean var78 = true;
                    var77--;
                    for (int var79 = 0; var79 < var77; var79++) {
                        if (var74[var79].field592.compareTo(var74[var79 + 1].field592) > 0) {
                            class25 var80 = var74[var79];
                            var74[var79] = var74[var79 + 1];
                            var74[var79 + 1] = var80;
                            var78 = false;
                        }
                    }
                    if (var78) {
                        break;
                    }
                }
                Statics.field2214 = var74;
                field305 = -1;
                return true;
            }
            if (field305 == 170) {
                field276 = field428.method2562();
                if (field276 == 1) {
                    field277 = field428.method2541();
                }
                if (field276 >= 2 && field276 <= 6) {
                    if (field276 == 2) {
                        field282 = 64;
                        field283 = 64;
                    }
                    if (field276 == 3) {
                        field282 = 0;
                        field283 = 64;
                    }
                    if (field276 == 4) {
                        field282 = 128;
                        field283 = 64;
                    }
                    if (field276 == 5) {
                        field282 = 64;
                        field283 = 0;
                    }
                    if (field276 == 6) {
                        field282 = 64;
                        field283 = 128;
                    }
                    field276 = 2;
                    field524 = field428.method2541();
                    field459 = field428.method2541();
                    field281 = field428.method2562();
                }
                if (field276 == 10) {
                    field278 = field428.method2541();
                }
                field305 = -1;
                return true;
            }
            if (field305 == 136) {
                field505 = false;
                for (int var81 = 0; var81 < 5; var81++) {
                    field350[var81] = false;
                }
                field305 = -1;
                return true;
            }
            if (field305 == 41) {
                String var82 = field428.method2389();
                String var83 = class223.method3825(Statics.method3064(class222.method580(field428)));
                class12.method2685(6, var82, var83);
                field305 = -1;
                return true;
            }
            if (field305 == 30) {
                field428.field1955 += 28;
                if (field428.method2403()) {
                    class122 var84 = field428;
                    int var85 = field428.field1955 - 28;
                    if (class149.field2199 != null) {
                        try {
                            class149.field2199.method3938(0L);
                            class149.field2199.method3942(var84.field1959, var85, 24);
                        } catch (Exception var272) {
                        }
                    }
                }
                field305 = -1;
                return true;
            }
            if (field305 == 56) {
                String var87 = field428.method2389();
                int var88 = field428.method2541();
                byte var89 = field428.method2382();
                boolean var90 = false;
                if (var89 == -128) {
                    var90 = true;
                }
                if (var90) {
                    if (Statics.field2683 == 0) {
                        field305 = -1;
                        return true;
                    }
                    boolean var91 = false;
                    int var92;
                    for (var92 = 0; var92 < Statics.field2683 && (!Statics.field2214[var92].field594.equals(var87) || Statics.field2214[var92].field591 != var88); var92++) {
                    }
                    if (var92 < Statics.field2683) {
                        while (var92 < Statics.field2683 - 1) {
                            Statics.field2214[var92] = Statics.field2214[var92 + 1];
                            var92++;
                        }
                        Statics.field2683--;
                        Statics.field2214[Statics.field2683] = null;
                    }
                } else {
                    field428.method2389();
                    class25 var93 = new class25();
                    var93.field594 = var87;
                    var93.field592 = class164.method1092(var93.field594, Statics.field1826);
                    var93.field591 = var88;
                    var93.field593 = var89;
                    int var94;
                    for (var94 = Statics.field2683 - 1; var94 >= 0; var94--) {
                        int var95 = Statics.field2214[var94].field592.compareTo(var93.field592);
                        if (var95 == 0) {
                            Statics.field2214[var94].field591 = var88;
                            Statics.field2214[var94].field593 = var89;
                            if (var87.equals(Statics.field989.field47)) {
                                Statics.field1828 = var89;
                            }
                            field451 = field442;
                            field305 = -1;
                            return true;
                        }
                        if (var95 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2683 >= Statics.field2214.length) {
                        field305 = -1;
                        return true;
                    }
                    for (int var96 = Statics.field2683 - 1; var96 > var94; var96--) {
                        Statics.field2214[var96 + 1] = Statics.field2214[var96];
                    }
                    if (Statics.field2683 == 0) {
                        Statics.field2214 = new class25[100];
                    }
                    Statics.field2214[var94 + 1] = var93;
                    Statics.field2683++;
                    if (var87.equals(Statics.field989.field47)) {
                        Statics.field1828 = var89;
                    }
                }
                field451 = field442;
                field305 = -1;
                return true;
            }
            if (field305 == 134) {
                class26 var97 = new class26();
                var97.field610 = field428.method2389();
                var97.field607 = field428.method2541();
                int var98 = field428.method2386();
                var97.field608 = var98;
                method781(45);
                Statics.field1511.method2883();
                Statics.field1511 = null;
                class32.method675(var97);
                field305 = -1;
                return false;
            }
            if (field305 == 32) {
                method3192();
                int var99 = field428.method2409();
                int var100 = field428.method2386();
                int var101 = field428.method2408();
                field396[var101] = var100;
                field394[var101] = var99;
                field395[var101] = 1;
                for (int var102 = 0; var102 < 98; var102++) {
                    if (var100 >= class155.field2264[var102]) {
                        field395[var101] = var102 + 2;
                    }
                }
                field447[++field448 - 1 & 0x1F] = var101;
                field305 = -1;
                return true;
            }
            if (field305 == 67) {
                field525 = 1;
                field361 = field442;
                field305 = -1;
                return true;
            }
            if (field305 == 180) {
                method915(true);
                field305 = -1;
                return true;
            }
            if (field305 == 42) {
                String var103 = field428.method2389();
                Object[] var104 = new Object[var103.length() + 1];
                for (int var105 = var103.length() - 1; var105 >= 0; var105--) {
                    if (var103.charAt(var105) == 's') {
                        var104[var105 + 1] = field428.method2389();
                    } else {
                        var104[var105 + 1] = Integer.valueOf(field428.method2386());
                    }
                }
                var104[0] = Integer.valueOf(field428.method2386());
                class1 var106 = new class1();
                var106.field8 = var104;
                class37.method616(var106);
                field305 = -1;
                return true;
            }
            if (field305 == 117) {
                while (field428.field1955 < field304) {
                    boolean var107 = field428.method2562() == 1;
                    String var108 = field428.method2389();
                    String var109 = field428.method2389();
                    int var110 = field428.method2541();
                    int var111 = field428.method2562();
                    int var112 = field428.method2562();
                    boolean var113 = (var112 & 0x2) != 0;
                    boolean var114 = (var112 & 0x1) != 0;
                    if (var110 > 0) {
                        field428.method2389();
                        field428.method2562();
                        field428.method2386();
                    }
                    field428.method2389();
                    for (int var115 = 0; var115 < field410; var115++) {
                        class18 var116 = field284[var115];
                        if (var107) {
                            if (var109.equals(var116.field228)) {
                                var116.field228 = var108;
                                var116.field223 = var109;
                                var108 = null;
                                break;
                            }
                        } else if (var108.equals(var116.field228)) {
                            if (var116.field224 != var110) {
                                boolean var117 = true;
                                for (class39 var118 = (class39) field527.method3562(); var118 != null; var118 = (class39) field527.method3563()) {
                                    if (var118.field838.equals(var108)) {
                                        if (var110 != 0 && var118.field840 == 0) {
                                            var118.method3698();
                                            var117 = false;
                                        } else if (var110 == 0 && var118.field840 != 0) {
                                            var118.method3698();
                                            var117 = false;
                                        }
                                    }
                                }
                                if (var117) {
                                    field527.method3561(new class39(var108, var110));
                                }
                                var116.field224 = var110;
                            }
                            var116.field223 = var109;
                            var116.field225 = var111;
                            var116.field226 = var113;
                            var116.field227 = var114;
                            var108 = null;
                            break;
                        }
                    }
                    if (var108 != null && field410 < 400) {
                        class18 var119 = new class18();
                        field284[field410] = var119;
                        var119.field228 = var108;
                        var119.field223 = var109;
                        var119.field224 = var110;
                        var119.field225 = var111;
                        var119.field226 = var113;
                        var119.field227 = var114;
                        field410++;
                    }
                }
                field525 = 2;
                field361 = field442;
                boolean var120 = false;
                int var121 = field410;
                while (var121 > 0) {
                    boolean var122 = true;
                    var121--;
                    for (int var123 = 0; var123 < var121; var123++) {
                        boolean var124 = false;
                        class18 var125 = field284[var123];
                        class18 var126 = field284[var123 + 1];
                        if (field260 != var125.field224 && field260 == var126.field224) {
                            var124 = true;
                        }
                        if (!var124 && var125.field224 == 0 && var126.field224 != 0) {
                            var124 = true;
                        }
                        if (!var124 && !var125.field226 && var126.field226) {
                            var124 = true;
                        }
                        if (!var124 && !var125.field227 && var126.field227) {
                            var124 = true;
                        }
                        if (var124) {
                            class18 var127 = field284[var123];
                            field284[var123] = field284[var123 + 1];
                            field284[var123 + 1] = var127;
                            var122 = false;
                        }
                    }
                    if (var122) {
                        break;
                    }
                }
                field305 = -1;
                return true;
            }
            if (field305 == 208) {
                field475 = field428.method2562();
                field289 = field428.method2562();
                field305 = -1;
                return true;
            }
            if (field305 == 238) {
                class122 var128 = field428;
                int var129 = field304;
                class33.field731 = 0;
                class33.method755(var128);
                class33.method955(var128);
                if (var128.field1955 != var129) {
                    throw new RuntimeException(var128.field1955 + " " + var129);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 157) {
                byte var130 = field428.method2444();
                int var131 = field428.method2572();
                class176.field2879[var131] = var130;
                if (class176.field2878[var131] != var130) {
                    class176.field2878[var131] = var130;
                    method2322(var131);
                }
                field443[++field444 - 1 & 0x1F] = var131;
                field305 = -1;
                return true;
            }
            if (field305 == 79) {
                method3342(field428.method2389());
                field305 = -1;
                return true;
            }
            if (field305 == 204) {
                field505 = true;
                Statics.field2966 = field428.method2562();
                Statics.field1905 = field428.method2562();
                Statics.field2041 = field428.method2541();
                Statics.field2132 = field428.method2562();
                Statics.field1922 = field428.method2562();
                if (Statics.field1922 >= 100) {
                    int var132 = Statics.field2966 * 128 + 64;
                    int var133 = Statics.field1905 * 128 + 64;
                    int var134 = method39(var132, var133, Statics.field19) - Statics.field2041;
                    int var135 = var132 - Statics.field1134;
                    int var136 = var134 - Statics.field233;
                    int var137 = var133 - Statics.field184;
                    int var138 = (int) Math.sqrt((double) (var135 * var135 + var137 * var137));
                    Statics.field239 = (int) (Math.atan2((double) var136, (double) var138) * 325.949D) & 0x7FF;
                    Statics.field760 = (int) (Math.atan2((double) var135, (double) var137) * -325.949D) & 0x7FF;
                    if (Statics.field239 < 128) {
                        Statics.field239 = 128;
                    }
                    if (Statics.field239 > 383) {
                        Statics.field239 = 383;
                    }
                }
                field305 = -1;
                return true;
            }
            if (field305 == 45) {
                int var139 = field428.method2395();
                int var140 = field428.method2562();
                String var141 = field428.method2389();
                if (var140 >= 1 && var140 <= 8) {
                    if (var141.equalsIgnoreCase("null")) {
                        var141 = null;
                    }
                    field407[var140 - 1] = var141;
                    field387[var140 - 1] = var139 == 0;
                }
                field305 = -1;
                return true;
            }
            if (field305 == 139) {
                int var142 = field428.method2386();
                int var143 = field428.method2418();
                class173 var144 = class173.method47(var142);
                if (var144.field2772 != 2 || var144.field2737 != var143) {
                    var144.field2772 = 2;
                    var144.field2737 = var143;
                    method172(var144);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 223) {
                field474 = field428.method2562();
                field305 = -1;
                return true;
            }
            if (field305 == 83) {
                int var145 = field428.method2386();
                int var146 = field428.method2541();
                if (var145 < -70000) {
                    var146 += 32768;
                }
                class173 var147;
                if (var145 >= 0) {
                    var147 = class173.method47(var145);
                } else {
                    var147 = null;
                }
                if (var147 != null) {
                    for (int var148 = 0; var148 < var147.field2847.length; var148++) {
                        var147.field2847[var148] = 0;
                        var147.field2848[var148] = 0;
                    }
                }
                class16.method2861(var146);
                int var149 = field428.method2541();
                for (int var150 = 0; var150 < var149; var150++) {
                    int var151 = field428.method2395();
                    if (var151 == 255) {
                        var151 = field428.method2365();
                    }
                    int var152 = field428.method2541();
                    if (var147 != null && var150 < var147.field2847.length) {
                        var147.field2847[var150] = var152;
                        var147.field2848[var150] = var151;
                    }
                    class16.method2264(var146, var150, var152 - 1, var151);
                }
                if (var147 != null) {
                    method172(var147);
                }
                method3192();
                field445[++field446 - 1 & 0x1F] = var146 & 0x7FFF;
                field305 = -1;
                return true;
            }
            if (field305 == 210) {
                int var153 = field428.method2491();
                class173 var154 = class173.method47(var153);
                var154.field2772 = 3;
                var154.field2737 = Statics.field989.field32.method3307();
                method172(var154);
                field305 = -1;
                return true;
            }
            if (field305 == 5) {
                String var155 = field428.method2389();
                long var156 = field428.method2387();
                long var158 = (long) field428.method2541();
                long var160 = (long) field428.method2385();
                class152 var162 = (class152) class109.method995(class152.method2303(), field428.method2562());
                long var163 = (var158 << 32) + var160;
                boolean var165 = false;
                for (int var166 = 0; var166 < 100; var166++) {
                    if (field478[var166] == var163) {
                        var165 = true;
                        break;
                    }
                }
                if (var162.field2236 && method2170(var155)) {
                    var165 = true;
                }
                if (!var165 && field379 == 0) {
                    field478[field479] = var163;
                    field479 = (field479 + 1) % 100;
                    String var167 = class223.method3825(Statics.method3064(class222.method580(field428)));
                    if (var162.field2234 == -1) {
                        Statics.method1003(9, var155, var167, class162.method178(var156));
                    } else {
                        int var168 = var162.field2234;
                        String var169 = "<img=" + var168 + ">";
                        Statics.method1003(9, var169 + var155, var167, class162.method178(var156));
                    }
                }
                field305 = -1;
                return true;
            }
            if (field305 == 206) {
                method3192();
                field422 = field428.method2562();
                field454 = field442;
                field305 = -1;
                return true;
            }
            if (field305 == 248) {
                class211.method3021(field428, field304);
                field305 = -1;
                return true;
            }
            if (field305 == 92) {
                int var170 = field428.method2409();
                int var171 = field428.method2416();
                int var172 = field428.method2428();
                class4 var173 = (class4) field517.method3571((long) var172);
                if (var173 != null) {
                    method2172(var173, var173.field58 != var171);
                }
                method2751(var172, var171, var170);
                field305 = -1;
                return true;
            }
            if (field305 == 151) {
                int var174 = field428.method2562();
                int var175 = field428.method2562();
                int var176 = field428.method2562();
                int var177 = field428.method2562();
                field350[var174] = true;
                field507[var174] = var175;
                field508[var174] = var176;
                field509[var174] = var177;
                field328[var174] = 0;
                field305 = -1;
                return true;
            }
            if (field305 == 10) {
                int var178 = field428.method2386();
                int var179 = field428.method2572();
                class173 var180 = class173.method47(var178);
                if (var180 != null && var180.field2733 == 0) {
                    if (var179 > var180.field2755 - var180.field2797) {
                        var179 = var180.field2755 - var180.field2797;
                    }
                    if (var179 < 0) {
                        var179 = 0;
                    }
                    if (var180.field2753 != var179) {
                        var180.field2753 = var179;
                        method172(var180);
                    }
                }
                field305 = -1;
                return true;
            }
            if (field305 == 0) {
                int var181 = field428.method2394();
                boolean var182 = field428.method2562() == 1;
                String var183 = "";
                boolean var184 = false;
                if (var182) {
                    var183 = field428.method2389();
                    if (method2170(var183)) {
                        var184 = true;
                    }
                }
                String var185 = field428.method2389();
                if (!var184) {
                    class12.method2685(var181, var183, var185);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 172 || field305 == 29 || field305 == 6 || field305 == 140 || field305 == 104 || field305 == 120 || field305 == 153 || field305 == 17 || field305 == 205 || field305 == 81) {
                method29();
                field305 = -1;
                return true;
            }
            if (field305 == 229) {
                while (field428.field1955 < field304) {
                    int var186 = field428.method2562();
                    boolean var187 = (var186 & 0x1) == 1;
                    String var188 = field428.method2389();
                    String var189 = field428.method2389();
                    field428.method2389();
                    for (int var190 = 0; var190 < field528; var190++) {
                        class8 var191 = field529[var190];
                        if (var187) {
                            if (var189.equals(var191.field123)) {
                                var191.field123 = var188;
                                var191.field120 = var189;
                                var188 = null;
                                break;
                            }
                        } else if (var188.equals(var191.field123)) {
                            var191.field123 = var188;
                            var191.field120 = var189;
                            var188 = null;
                            break;
                        }
                    }
                    if (var188 != null && field528 < 400) {
                        class8 var192 = new class8();
                        field529[field528] = var192;
                        var192.field123 = var188;
                        var192.field120 = var189;
                        field528++;
                    }
                }
                field361 = field442;
                field305 = -1;
                return true;
            }
            if (field305 == 253) {
                int var193 = field304 + field428.field1955;
                int var194 = field428.method2541();
                int var195 = field428.method2541();
                if (field262 != var194) {
                    field262 = var194;
                    int var196 = field262;
                    int var197 = Statics.field942;
                    int var198 = Statics.field2210;
                    if (class173.method2979(var196)) {
                        method2300(Statics.field2766[var196], -1, var197, var198, false);
                    }
                    method1256(field262);
                    class37.method653(field262);
                    for (int var199 = 0; var199 < 100; var199++) {
                        field462[var199] = true;
                    }
                }
                while (var195-- > 0) {
                    int var200 = field428.method2386();
                    int var201 = field428.method2541();
                    int var202 = field428.method2562();
                    class4 var203 = (class4) field517.method3571((long) var200);
                    if (var203 != null && var203.field58 != var201) {
                        method2172(var203, true);
                        var203 = null;
                    }
                    if (var203 == null) {
                        var203 = method2751(var200, var201, var202);
                    }
                    var203.field64 = true;
                }
                for (class4 var204 = (class4) field517.method3574(); var204 != null; var204 = (class4) field517.method3573()) {
                    if (var204.field64) {
                        var204.field64 = false;
                    } else {
                        method2172(var204, true);
                    }
                }
                field510 = new class196(512);
                while (field428.field1955 < var193) {
                    int var205 = field428.method2386();
                    int var206 = field428.method2541();
                    int var207 = field428.method2541();
                    int var208 = field428.method2386();
                    for (int var209 = var206; var209 <= var207; var209++) {
                        long var210 = ((long) var205 << 32) + (long) var209;
                        field510.method3572(new class201(var208), var210);
                    }
                }
                field305 = -1;
                return true;
            }
            if (field305 == 35) {
                boolean var212 = field428.method2408() == 1;
                int var213 = field428.method2428();
                class173 var214 = class173.method47(var213);
                if (var214.field2751 != var212) {
                    var214.field2751 = var212;
                    method172(var214);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 11) {
                int var215 = field428.method2386();
                int var216 = field428.method2386();
                if (Statics.field1911 == null || !Statics.field1911.isValid()) {
                    try {
                        Iterator var217 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var217.hasNext()) {
                            GarbageCollectorMXBean var218 = (GarbageCollectorMXBean) var217.next();
                            if (var218.isValid()) {
                                Statics.field1911 = var218;
                                field535 = -1L;
                                field534 = -1L;
                            }
                        }
                    } catch (Throwable var273) {
                    }
                }
                long var220 = class115.method2177();
                int var222 = -1;
                if (Statics.field1911 != null) {
                    long var223 = Statics.field1911.getCollectionTime();
                    if (field534 != -1L) {
                        long var225 = var223 - field534;
                        long var227 = var220 - field535;
                        if (var227 != 0L) {
                            var222 = (int) (var225 * 100L / var227);
                        }
                    }
                    field534 = var223;
                    field535 = var220;
                }
                field301.method2648(88);
                field301.method2405(var222);
                field301.method2406(field2169);
                field301.method2487(var215);
                field301.method2487(var216);
                field305 = -1;
                return true;
            }
            if (field305 == 95) {
                int var229 = field428.method2386();
                int var230 = field428.method2428();
                int var231 = field428.method2541();
                if (var231 == 65535) {
                    var231 = -1;
                }
                int var232 = field428.method2416();
                if (var232 == 65535) {
                    var232 = -1;
                }
                for (int var233 = var232; var233 <= var231; var233++) {
                    long var234 = ((long) var230 << 32) + (long) var233;
                    class208 var236 = field510.method3571(var234);
                    if (var236 != null) {
                        var236.method3702();
                    }
                    field510.method3572(new class201(var229), var234);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 239) {
                Statics.field595 = field428.method2409();
                Statics.field709 = field428.method2395();
                for (int var237 = Statics.field595; var237 < Statics.field595 + 8; var237++) {
                    for (int var238 = Statics.field709; var238 < Statics.field709 + 8; var238++) {
                        if (field359[Statics.field19][var237][var238] != null) {
                            field359[Statics.field19][var237][var238] = null;
                            method989(var237, var238);
                        }
                    }
                }
                for (class17 var239 = (class17) field391.method3611(); var239 != null; var239 = (class17) field391.method3613()) {
                    if (var239.field204 >= Statics.field595 && var239.field204 < Statics.field595 + 8 && var239.field205 >= Statics.field709 && var239.field205 < Statics.field709 + 8 && Statics.field19 == var239.field203) {
                        var239.field213 = 0;
                    }
                }
                field305 = -1;
                return true;
            }
            if (field305 == 129) {
                int var240 = field428.method2541();
                if (var240 == 65535) {
                    var240 = -1;
                }
                method45(var240);
                field305 = -1;
                return true;
            }
            if (field305 == 82) {
                int var241 = field428.method2385();
                int var242 = field428.method2418();
                if (var242 == 65535) {
                    var242 = -1;
                }
                method164(var242, var241);
                field305 = -1;
                return true;
            }
            if (field305 == 21) {
                int var243 = field428.method2541();
                int var244 = field428.method2562();
                int var245 = field428.method2541();
                method204(var243, var244, var245);
                field305 = -1;
                return true;
            }
            if (field305 == 201) {
                field306 = field428.method2572() * 30;
                field454 = field442;
                field305 = -1;
                return true;
            }
            if (field305 == 24) {
                Statics.field595 = field428.method2562();
                Statics.field709 = field428.method2395();
                while (field428.field1955 < field304) {
                    field305 = field428.method2562();
                    method29();
                }
                field305 = -1;
                return true;
            }
            if (field305 == 234) {
                int var246 = field428.method2541();
                int var247 = field428.method2491();
                int var248 = var246 >> 10 & 0x1F;
                int var249 = var246 >> 5 & 0x1F;
                int var250 = var246 & 0x1F;
                int var251 = (var250 << 3) + (var248 << 19) + (var249 << 11);
                class173 var252 = class173.method47(var247);
                if (var252.field2756 != var251) {
                    var252.field2756 = var251;
                    method172(var252);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 16) {
                for (int var253 = 0; var253 < Statics.field1121; var253++) {
                    class53 var254 = class53.method3027(var253);
                    if (var254 != null) {
                        class176.field2879[var253] = 0;
                        class176.field2878[var253] = 0;
                    }
                }
                method3192();
                field444 += 32;
                field305 = -1;
                return true;
            }
            if (field305 == 135) {
                field491 = field428.method2562();
                if (field491 == 255) {
                    field491 = 0;
                }
                field519 = field428.method2562();
                if (field519 == 255) {
                    field519 = 0;
                }
                field305 = -1;
                return true;
            }
            if (field305 == 214) {
                int var255 = field428.method2420();
                int var256 = field428.method2421();
                int var257 = field428.method2428();
                class173 var258 = class173.method47(var257);
                if (var258.field2740 != var256 || var258.field2741 != var255 || var258.field2736 != 0 || var258.field2754 != 0) {
                    var258.field2740 = var256;
                    var258.field2741 = var255;
                    var258.field2736 = 0;
                    var258.field2754 = 0;
                    method172(var258);
                    method2180(var258);
                    if (var258.field2733 == 0) {
                        Statics.method870(Statics.field2766[var257 >> 16], var258, false);
                    }
                }
                field305 = -1;
                return true;
            }
            if (field305 == 128) {
                int var259 = field428.method2365();
                Statics.field116 = Statics.field2048.method2759(var259);
                field305 = -1;
                return true;
            }
            if (field305 == 144) {
                Statics.field595 = field428.method2562();
                Statics.field709 = field428.method2408();
                field305 = -1;
                return true;
            }
            if (field305 == 47) {
                if (field262 != -1) {
                    method3406(field262, 0);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 221) {
                field505 = true;
                Statics.field2717 = field428.method2562();
                Statics.field2141 = field428.method2562();
                Statics.field129 = field428.method2541();
                Statics.field675 = field428.method2562();
                Statics.field578 = field428.method2562();
                if (Statics.field578 >= 100) {
                    Statics.field1134 = Statics.field2717 * 128 + 64;
                    Statics.field184 = Statics.field2141 * 128 + 64;
                    Statics.field233 = method39(Statics.field1134, Statics.field184, Statics.field19) - Statics.field129;
                }
                field305 = -1;
                return true;
            }
            if (field305 == 177) {
                int var260 = field428.method2428();
                int var261 = field428.method2365();
                class4 var262 = (class4) field517.method3571((long) var261);
                class4 var263 = (class4) field517.method3571((long) var260);
                if (var263 != null) {
                    method2172(var263, var262 == null || var262.field58 != var263.field58);
                }
                if (var262 != null) {
                    var262.method3702();
                    field517.method3572(var262, (long) var260);
                }
                class173 var264 = class173.method47(var261);
                if (var264 != null) {
                    method172(var264);
                }
                class173 var265 = class173.method47(var260);
                if (var265 != null) {
                    method172(var265);
                    Statics.method870(Statics.field2766[var265.field2732 >>> 16], var265, true);
                }
                if (field262 != -1) {
                    method3406(field262, 1);
                }
                field305 = -1;
                return true;
            }
            if (field305 == 14) {
                for (int var266 = 0; var266 < field469.length; var266++) {
                    if (field469[var266] != null) {
                        field469[var266].field808 = -1;
                    }
                }
                for (int var267 = 0; var267 < field296.length; var267++) {
                    if (field296[var267] != null) {
                        field296[var267].field808 = -1;
                    }
                }
                field305 = -1;
                return true;
            }
            class148.method1554("" + field305 + class2.field25 + field309 + class2.field25 + field310 + class2.field25 + field304, (Throwable) null);
            method769();
        } catch (IOException var274) {
            if (field489 > 0) {
                method769();
            } else {
                method781(40);
                Statics.field839 = Statics.field1511;
                Statics.field1511 = null;
            }
        } catch (Exception var275) {
            String var270 = "" + field305 + class2.field25 + field309 + class2.field25 + field310 + class2.field25 + field304 + class2.field25 + (Statics.field2112 + Statics.field989.field831[0]) + class2.field25 + (Statics.field2677 + Statics.field989.field832[0]) + class2.field25;
            for (int var271 = 0; var271 < field304 && var271 < 50; var271++) {
                var270 = var270 + field428.field1959[var271] + class2.field25;
            }
            class148.method1554(var270, var275);
            method769();
        }
        return true;
    }

    @ObfuscatedName("y.bk(B)V")
    public static final void method29() {
        if (field305 == 81) {
            int var0 = field428.method2409();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field465[var1];
            int var4 = field428.method2395();
            int var5 = (var4 >> 4 & 0x7) + Statics.field595;
            int var6 = (var4 & 0x7) + Statics.field709;
            int var7 = field428.method2541();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                method2651(Statics.field19, var5, var6, var3, var7, var1, var2, 0, -1);
            }
        } else if (field305 == 17) {
            int var8 = field428.method2408();
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = field465[var9];
            int var12 = field428.method2572();
            int var13 = field428.method2562();
            int var14 = (var13 >> 4 & 0x7) + Statics.field595;
            int var15 = (var13 & 0x7) + Statics.field709;
            if (var14 >= 0 && var15 >= 0 && var14 < 103 && var15 < 103) {
                if (var11 == 0) {
                    class87 var16 = Statics.field788.method1958(Statics.field19, var14, var15);
                    if (var16 != null) {
                        int var17 = var16.field1480 >> 14 & 0x7FFF;
                        if (var9 == 2) {
                            var16.field1483 = new class13(var17, 2, var10 + 4, Statics.field19, var14, var15, var12, false, var16.field1483);
                            var16.field1473 = new class13(var17, 2, var10 + 1 & 0x3, Statics.field19, var14, var15, var12, false, var16.field1473);
                        } else {
                            var16.field1483 = new class13(var17, var9, var10, Statics.field19, var14, var15, var12, false, var16.field1483);
                        }
                    }
                }
                if (var11 == 1) {
                    class94 var18 = Statics.field788.method1822(Statics.field19, var14, var15);
                    if (var18 != null) {
                        int var19 = var18.field1554 >> 14 & 0x7FFF;
                        if (var9 == 4 || var9 == 5) {
                            var18.field1558 = new class13(var19, 4, var10, Statics.field19, var14, var15, var12, false, var18.field1558);
                        } else if (var9 == 6) {
                            var18.field1558 = new class13(var19, 4, var10 + 4, Statics.field19, var14, var15, var12, false, var18.field1558);
                        } else if (var9 == 7) {
                            var18.field1558 = new class13(var19, 4, (var10 + 2 & 0x3) + 4, Statics.field19, var14, var15, var12, false, var18.field1558);
                        } else if (var9 == 8) {
                            var18.field1558 = new class13(var19, 4, var10 + 4, Statics.field19, var14, var15, var12, false, var18.field1558);
                            var18.field1557 = new class13(var19, 4, (var10 + 2 & 0x3) + 4, Statics.field19, var14, var15, var12, false, var18.field1557);
                        }
                    }
                }
                if (var11 == 2) {
                    class98 var20 = Statics.field788.method1845(Statics.field19, var14, var15);
                    if (var9 == 11) {
                        var9 = 10;
                    }
                    if (var20 != null) {
                        var20.field1613 = new class13(var20.field1620 >> 14 & 0x7FFF, var9, var10, Statics.field19, var14, var15, var12, false, var20.field1613);
                    }
                }
                if (var11 == 3) {
                    class93 var21 = Statics.field788.method1846(Statics.field19, var14, var15);
                    if (var21 != null) {
                        var21.field1539 = new class13(var21.field1541 >> 14 & 0x7FFF, 22, var10, Statics.field19, var14, var15, var12, false, var21.field1539);
                    }
                }
            }
        } else if (field305 == 104) {
            int var22 = field428.method2562();
            int var23 = (var22 >> 4 & 0x7) + Statics.field595;
            int var24 = (var22 & 0x7) + Statics.field709;
            int var25 = var23 + field428.method2382();
            int var26 = var24 + field428.method2382();
            int var27 = field428.method2384();
            int var28 = field428.method2541();
            int var29 = field428.method2562() * 4;
            int var30 = field428.method2562() * 4;
            int var31 = field428.method2541();
            int var32 = field428.method2541();
            int var33 = field428.method2562();
            int var34 = field428.method2562();
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && var28 != 65535) {
                int var35 = var23 * 128 + 64;
                int var36 = var24 * 128 + 64;
                int var37 = var25 * 128 + 64;
                int var38 = var26 * 128 + 64;
                class7 var39 = new class7(var28, Statics.field19, var35, var36, method39(var35, var36, Statics.field19) - var29, field423 + var31, field423 + var32, var33, var34, var27, var30);
                var39.method88(var37, var38, method39(var37, var38, Statics.field19) - var30, field423 + var31);
                field392.method3606(var39);
            }
        } else if (field305 == 120) {
            int var40 = field428.method2409();
            int var41 = (var40 >> 4 & 0x7) + Statics.field595;
            int var42 = (var40 & 0x7) + Statics.field709;
            int var43 = field428.method2418();
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                class199 var44 = field359[Statics.field19][var41][var42];
                if (var44 != null) {
                    for (class29 var45 = (class29) var44.method3611(); var45 != null; var45 = (class29) var44.method3613()) {
                        if ((var43 & 0x7FFF) == var45.field650) {
                            var45.method3702();
                            break;
                        }
                    }
                    if (var44.method3611() == null) {
                        field359[Statics.field19][var41][var42] = null;
                    }
                    method989(var41, var42);
                }
            }
        } else if (field305 == 205) {
            int var46 = field428.method2408();
            int var47 = (var46 >> 4 & 0x7) + Statics.field595;
            int var48 = (var46 & 0x7) + Statics.field709;
            int var49 = field428.method2409();
            int var50 = var49 >> 2;
            int var51 = var49 & 0x3;
            int var52 = field465[var50];
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                method2651(Statics.field19, var47, var48, var52, -1, var50, var51, 0, -1);
            }
        } else if (field305 == 29) {
            int var53 = field428.method2562();
            int var54 = (var53 >> 4 & 0x7) + Statics.field595;
            int var55 = (var53 & 0x7) + Statics.field709;
            int var56 = field428.method2541();
            int var57 = field428.method2541();
            int var58 = field428.method2541();
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                class199 var59 = field359[Statics.field19][var54][var55];
                if (var59 != null) {
                    for (class29 var60 = (class29) var59.method3611(); var60 != null; var60 = (class29) var59.method3613()) {
                        if ((var56 & 0x7FFF) == var60.field650 && var60.field643 == var57) {
                            var60.field643 = var58;
                            break;
                        }
                    }
                    method989(var54, var55);
                }
            }
        } else if (field305 == 140) {
            int var61 = field428.method2562();
            int var62 = (var61 >> 4 & 0x7) + Statics.field595;
            int var63 = (var61 & 0x7) + Statics.field709;
            int var64 = field428.method2541();
            int var65 = field428.method2562();
            int var66 = field428.method2541();
            if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                int var67 = var62 * 128 + 64;
                int var68 = var63 * 128 + 64;
                class30 var69 = new class30(var64, Statics.field19, var67, var68, method39(var67, var68, Statics.field19) - var65, var66, field423);
                field393.method3606(var69);
            }
        } else if (field305 == 153) {
            int var70 = field428.method2416();
            int var71 = field428.method2572();
            int var72 = field428.method2409();
            int var73 = (var72 >> 4 & 0x7) + Statics.field595;
            int var74 = (var72 & 0x7) + Statics.field709;
            if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                class29 var75 = new class29();
                var75.field650 = var71;
                var75.field643 = var70;
                if (field359[Statics.field19][var73][var74] == null) {
                    field359[Statics.field19][var73][var74] = new class199();
                }
                field359[Statics.field19][var73][var74].method3606(var75);
                method989(var73, var74);
            }
        } else {
            if (field305 == 172) {
                int var76 = field428.method2562();
                int var77 = (var76 >> 4 & 0x7) + Statics.field595;
                int var78 = (var76 & 0x7) + Statics.field709;
                int var79 = field428.method2541();
                int var80 = field428.method2562();
                int var81 = var80 >> 4 & 0xF;
                int var82 = var80 & 0x7;
                int var83 = field428.method2562();
                if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                    int var84 = var81 + 1;
                    if (Statics.field989.field831[0] >= var77 - var84 && Statics.field989.field831[0] <= var77 + var84 && Statics.field989.field832[0] >= var78 - var84 && Statics.field989.field832[0] <= var78 + var84 && field498 != 0 && var82 > 0 && field386 < 50) {
                        field500[field386] = var79;
                        field275[field386] = var82;
                        field502[field386] = var83;
                        field504[field386] = null;
                        field424[field386] = (var77 << 16) + (var78 << 8) + var81;
                        field386++;
                    }
                }
            }
            if (field305 == 6) {
                int var85 = field428.method2572();
                int var86 = field428.method2416();
                byte var87 = field428.method2425();
                byte var88 = field428.method2425();
                int var89 = field428.method2408();
                int var90 = var89 >> 2;
                int var91 = var89 & 0x3;
                int var92 = field465[var90];
                int var93 = field428.method2416();
                byte var94 = field428.method2411();
                int var95 = field428.method2562();
                int var96 = (var95 >> 4 & 0x7) + Statics.field595;
                int var97 = (var95 & 0x7) + Statics.field709;
                byte var98 = field428.method2411();
                int var99 = field428.method2541();
                class3 var100;
                if (field381 == var86) {
                    var100 = Statics.field989;
                } else {
                    var100 = field469[var86];
                }
                if (var100 != null) {
                    class41 var101 = class41.method85(var93);
                    int var102;
                    int var103;
                    if (var91 == 1 || var91 == 3) {
                        var102 = var101.field898;
                        var103 = var101.field930;
                    } else {
                        var102 = var101.field930;
                        var103 = var101.field898;
                    }
                    int var104 = (var102 >> 1) + var96;
                    int var105 = (var102 + 1 >> 1) + var96;
                    int var106 = (var103 >> 1) + var97;
                    int var107 = (var103 + 1 >> 1) + var97;
                    int[][] var108 = class6.field81[Statics.field19];
                    int var109 = var108[var104][var106] + var108[var105][var106] + var108[var104][var107] + var108[var105][var107] >> 2;
                    int var110 = (var96 << 7) + (var102 << 6);
                    int var111 = (var97 << 7) + (var103 << 6);
                    class105 var112 = var101.method833(var90, var91, var108, var110, var109, var111);
                    if (var112 != null) {
                        method2651(Statics.field19, var96, var97, var92, -1, 0, 0, var85 + 1, var99 + 1);
                        var100.field38 = field423 + var85;
                        var100.field50 = field423 + var99;
                        var100.field43 = var112;
                        var100.field46 = var96 * 128 + var102 * 64;
                        var100.field42 = var97 * 128 + var103 * 64;
                        var100.field41 = var109;
                        if (var94 > var98) {
                            byte var113 = var94;
                            var94 = var98;
                            var98 = var113;
                        }
                        if (var87 > var88) {
                            byte var114 = var87;
                            var87 = var88;
                            var88 = var114;
                        }
                        var100.field31 = var94 + var96;
                        var100.field40 = var96 + var98;
                        var100.field45 = var87 + var97;
                        var100.field37 = var88 + var97;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dw.bo(IIIIIIIIIB)V")
    public static final void method2651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field391.method3611(); var10 != null; var10 = (class17) field391.method3613()) {
            if (var10.field203 == arg0 && var10.field204 == arg1 && var10.field205 == arg2 && var10.field202 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field203 = arg0;
            var9.field202 = arg3;
            var9.field204 = arg1;
            var9.field205 = arg2;
            method656(var9);
            field391.method3606(var9);
        }
        var9.field209 = arg4;
        var9.field219 = arg5;
        var9.field210 = arg6;
        var9.field211 = arg7;
        var9.field213 = arg8;
    }

    @ObfuscatedName("e.be(I)V")
    public static final void method125() {
        for (class17 var0 = (class17) field391.method3611(); var0 != null; var0 = (class17) field391.method3613()) {
            if (var0.field213 == -1) {
                var0.field211 = 0;
                method656(var0);
            } else {
                var0.method3702();
            }
        }
    }

    @ObfuscatedName("t.by(Lh;S)V")
    public static final void method656(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field202 == 0) {
            var1 = Statics.field788.method1856(arg0.field203, arg0.field204, arg0.field205);
        }
        if (arg0.field202 == 1) {
            var1 = Statics.field788.method1848(arg0.field203, arg0.field204, arg0.field205);
        }
        if (arg0.field202 == 2) {
            var1 = Statics.field788.method1844(arg0.field203, arg0.field204, arg0.field205);
        }
        if (arg0.field202 == 3) {
            var1 = Statics.field788.method1857(arg0.field203, arg0.field204, arg0.field205);
        }
        if (var1 != 0) {
            int var5 = Statics.field788.method1851(arg0.field203, arg0.field204, arg0.field205, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field206 = var2;
        arg0.field208 = var3;
        arg0.field207 = var4;
    }

    @ObfuscatedName("fh.bc(I)V")
    public static final void method3006() {
        for (class17 var0 = (class17) field391.method3611(); var0 != null; var0 = (class17) field391.method3613()) {
            if (var0.field213 > 0) {
                var0.field213--;
            }
            if (var0.field213 != 0) {
                if (var0.field211 > 0) {
                    var0.field211--;
                }
                if (var0.field211 == 0 && var0.field204 >= 1 && var0.field205 >= 1 && var0.field204 <= 102 && var0.field205 <= 102) {
                    if (var0.field209 >= 0) {
                        int var1 = var0.field209;
                        int var2 = var0.field219;
                        class41 var3 = class41.method85(var1);
                        if (var2 == 11) {
                            var2 = 10;
                        }
                        if (var2 >= 5 && var2 <= 8) {
                            var2 = 4;
                        }
                        boolean var4 = var3.method815(var2);
                        if (!var4) {
                            continue;
                        }
                    }
                    method595(var0.field203, var0.field202, var0.field204, var0.field205, var0.field209, var0.field210, var0.field219);
                    var0.field211 = -1;
                    if (var0.field209 == var0.field206 && var0.field206 == -1) {
                        var0.method3702();
                    } else if (var0.field209 == var0.field206 && var0.field210 == var0.field207 && var0.field219 == var0.field208) {
                        var0.method3702();
                    }
                }
            } else if (var0.field206 < 0 || Statics.method2983(var0.field206, var0.field208)) {
                method595(var0.field203, var0.field202, var0.field204, var0.field205, var0.field206, var0.field207, var0.field208);
                var0.method3702();
            }
        }
    }

    @ObfuscatedName("q.bm(IIIIIIIB)V")
    public static final void method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field259 && Statics.field19 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field788.method1856(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field788.method1848(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field788.method1844(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field788.method1857(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field788.method1851(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field788.method1935(arg0, arg2, arg3);
                class41 var15 = class41.method85(var12);
                if (var15.field899 != 0) {
                    field433[arg0].method2290(arg2, arg3, var13, var14, var15.field900);
                }
            }
            if (arg1 == 1) {
                Statics.field788.method1839(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field788.method1969(arg0, arg2, arg3);
                class41 var16 = class41.method85(var12);
                if (var16.field930 + arg2 > 103 || var16.field930 + arg3 > 103 || var16.field898 + arg2 > 103 || var16.field898 + arg3 > 103) {
                    return;
                }
                if (var16.field899 != 0) {
                    field433[arg0].method2275(arg2, arg3, var16.field930, var16.field898, var14, var16.field900);
                }
            }
            if (arg1 == 3) {
                Statics.field788.method1841(arg0, arg2, arg3);
                class41 var17 = class41.method85(var12);
                if (var17.field899 == 1) {
                    field433[arg0].method2274(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field73[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class86 var19 = Statics.field788;
        class108 var20 = field433[arg0];
        class41 var21 = class41.method85(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field898;
            var23 = var21.field930;
        } else {
            var22 = var21.field930;
            var23 = var21.field898;
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
        int[][] var28 = class6.field81[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field901 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field922 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field889 == -1 && var21.field923 == null) {
                var34 = var21.method833(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1921(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field899 == 1) {
                var20.method2272(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field889 == -1 && var21.field923 == null) {
                var57 = var21.method833(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1831(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field899 != 0) {
                var20.method2282(arg2, arg3, var22, var23, var21.field900);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field889 == -1 && var21.field923 == null) {
                var35 = var21.method833(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1831(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field899 != 0) {
                var20.method2282(arg2, arg3, var22, var23, var21.field900);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field889 == -1 && var21.field923 == null) {
                var36 = var21.method833(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1926(arg0, arg2, arg3, var29, var36, (class85) null, class6.field90[arg5], 0, var32, var33);
            if (var21.field899 != 0) {
                var20.method2269(arg2, arg3, arg6, arg5, var21.field900);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field889 == -1 && var21.field923 == null) {
                var37 = var21.method833(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1926(arg0, arg2, arg3, var29, var37, (class85) null, class6.field87[arg5], 0, var32, var33);
            if (var21.field899 != 0) {
                var20.method2269(arg2, arg3, arg6, arg5, var21.field900);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field889 == -1 && var21.field923 == null) {
                var39 = var21.method833(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method833(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field889, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1926(arg0, arg2, arg3, var29, var39, var40, class6.field90[arg5], class6.field90[var38], var32, var33);
            if (var21.field899 != 0) {
                var20.method2269(arg2, arg3, arg6, arg5, var21.field900);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field889 == -1 && var21.field923 == null) {
                var41 = var21.method833(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1926(arg0, arg2, arg3, var29, var41, (class85) null, class6.field87[arg5], 0, var32, var33);
            if (var21.field899 != 0) {
                var20.method2269(arg2, arg3, arg6, arg5, var21.field900);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field889 == -1 && var21.field923 == null) {
                var42 = var21.method833(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1831(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field899 != 0) {
                var20.method2282(arg2, arg3, var22, var23, var21.field900);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field889 == -1 && var21.field923 == null) {
                var43 = var21.method833(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1830(arg0, arg2, arg3, var29, var43, (class85) null, class6.field90[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1856(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method85(var45 >> 14 & 0x7FFF).field906;
            }
            class85 var46;
            if (var21.field889 == -1 && var21.field923 == null) {
                var46 = var21.method833(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1830(arg0, arg2, arg3, var29, var46, (class85) null, class6.field90[arg5], 0, class6.field82[arg5] * var44, class6.field80[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1856(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method85(var48 >> 14 & 0x7FFF).field906 / 2;
            }
            class85 var49;
            if (var21.field889 == -1 && var21.field923 == null) {
                var49 = var21.method833(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1830(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field84[arg5] * var47, class6.field85[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field889 == -1 && var21.field923 == null) {
                var51 = var21.method833(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1830(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1856(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method85(var53 >> 14 & 0x7FFF).field906 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field889 == -1 && var21.field923 == null) {
                var55 = var21.method833(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method833(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field889, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field889, true, (class85) null);
            }
            var19.method1830(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field84[arg5] * var52, class6.field85[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ag.bv(III)V")
    public static final void method989(int arg0, int arg1) {
        class199 var2 = field359[Statics.field19][arg0][arg1];
        if (var2 == null) {
            Statics.field788.method1842(Statics.field19, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3611(); var6 != null; var6 = (class29) var2.method3613()) {
            class52 var7 = class52.method168(var6.field650);
            long var8 = (long) var7.field1088;
            if (var7.field1089 == 1) {
                var8 = (long) (var6.field643 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field788.method1842(Statics.field19, arg0, arg1);
            return;
        }
        var2.method3633(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3611(); var12 != null; var12 = (class29) var2.method3613()) {
            if (var5.field650 != var12.field650) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field650 != var12.field650 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field788.method1950(Statics.field19, arg0, arg1, method39(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field19), var5, var13, var10, var11);
    }

    @ObfuscatedName("aw.bp(ZI)V")
    public static final void method915(boolean arg0) {
        field383 = 0;
        field299 = 0;
        method618();
        while (field428.method2636(field304) >= 27) {
            int var1 = field428.method2640(15);
            if (var1 == 32767) {
                break;
            }
            boolean var5 = false;
            if (field296[var1] == null) {
                field296[var1] = new class35();
                var5 = true;
            }
            class35 var6 = field296[var1];
            field298[++field297 - 1] = var1;
            var6.field836 = field423;
            int var7 = field428.method2640(1);
            if (var7 == 1) {
                field499[++field299 - 1] = var1;
            }
            var6.field747 = class40.method50(field428.method2640(14));
            int var8;
            if (arg0) {
                var8 = field428.method2640(8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = field428.method2640(5);
                if (var8 > 15) {
                    var8 -= 32;
                }
            }
            int var9;
            if (arg0) {
                var9 = field428.method2640(8);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = field428.method2640(5);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10 = field428.method2640(1);
            int var11 = field388[field428.method2640(3)];
            if (var5) {
                var6.field827 = var6.field779 = var11;
            }
            var6.field801 = var6.field747.field876;
            var6.field829 = var6.field747.field872;
            if (var6.field829 == 0) {
                var6.field779 = 0;
            }
            var6.field786 = var6.field747.field843;
            var6.field791 = var6.field747.field854;
            var6.field787 = var6.field747.field873;
            var6.field821 = var6.field747.field858;
            var6.field782 = var6.field747.field844;
            var6.field783 = var6.field747.field852;
            var6.field784 = var6.field747.field878;
            var6.method737(Statics.field989.field831[0] + var8, Statics.field989.field832[0] + var9, var10 == 1);
        }
        field428.method2635();
        method1995();
        for (int var2 = 0; var2 < field383; var2++) {
            int var3 = field384[var2];
            if (field423 != field296[var3].field836) {
                field296[var3].field747 = null;
                field296[var3] = null;
            }
        }
        if (field304 != field428.field1955) {
            throw new RuntimeException(field428.field1955 + class2.field25 + field304);
        }
        for (int var4 = 0; var4 < field297; var4++) {
            if (field296[field298[var4]] == null) {
                throw new RuntimeException(var4 + class2.field25 + field297);
            }
        }
    }

    @ObfuscatedName("z.bh(B)V")
    public static final void method618() {
        field428.method2637();
        int var0 = field428.method2640(8);
        if (var0 < field297) {
            for (int var1 = var0; var1 < field297; var1++) {
                field384[++field383 - 1] = field298[var1];
            }
        }
        if (var0 > field297) {
            throw new RuntimeException("");
        }
        field297 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field298[var2];
            class35 var4 = field296[var3];
            int var5 = field428.method2640(1);
            if (var5 == 0) {
                field298[++field297 - 1] = var3;
                var4.field836 = field423;
            } else {
                int var6 = field428.method2640(2);
                if (var6 == 0) {
                    field298[++field297 - 1] = var3;
                    var4.field836 = field423;
                    field499[++field299 - 1] = var3;
                } else if (var6 == 1) {
                    field298[++field297 - 1] = var3;
                    var4.field836 = field423;
                    int var7 = field428.method2640(3);
                    var4.method736(var7, (byte) 1);
                    int var8 = field428.method2640(1);
                    if (var8 == 1) {
                        field499[++field299 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field298[++field297 - 1] = var3;
                    var4.field836 = field423;
                    int var9 = field428.method2640(3);
                    var4.method736(var9, (byte) 2);
                    int var10 = field428.method2640(3);
                    var4.method736(var10, (byte) 2);
                    int var11 = field428.method2640(1);
                    if (var11 == 1) {
                        field499[++field299 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field384[++field383 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("cp.bs(I)V")
    public static final void method1995() {
        for (int var0 = 0; var0 < field299; var0++) {
            int var1 = field499[var0];
            class35 var2 = field296[var1];
            int var3 = field428.method2562();
            if ((var3 & 0x20) != 0) {
                var2.field790 = field428.method2389();
                var2.field793 = 100;
            }
            if ((var3 & 0x80) != 0) {
                int var4 = field428.method2418();
                int var5 = field428.method2416();
                int var6 = var2.field815 - (var4 - Statics.field2112 - Statics.field2112) * 64;
                int var7 = var2.field805 - (var5 - Statics.field2677 - Statics.field2677) * 64;
                if (var6 != 0 || var7 != 0) {
                    var2.field804 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var8 = field428.method2418();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = field428.method2395();
                if (var2.field808 == var8 && var8 != -1) {
                    int var10 = class43.method2262(var8).field968;
                    if (var10 == 1) {
                        var2.field828 = 0;
                        var2.field810 = 0;
                        var2.field811 = var9;
                        var2.field812 = 0;
                    }
                    if (var10 == 2) {
                        var2.field812 = 0;
                    }
                } else if (var8 == -1 || var2.field808 == -1 || class43.method2262(var8).field970 >= class43.method2262(var2.field808).field970) {
                    var2.field808 = var8;
                    var2.field828 = 0;
                    var2.field810 = 0;
                    var2.field811 = var9;
                    var2.field812 = 0;
                    var2.field825 = var2.field830;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field835 = field428.method2541();
                if (var2.field835 == 65535) {
                    var2.field835 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field747 = class40.method50(field428.method2416());
                var2.field801 = var2.field747.field876;
                var2.field829 = var2.field747.field872;
                var2.field786 = var2.field747.field843;
                var2.field791 = var2.field747.field854;
                var2.field787 = var2.field747.field873;
                var2.field821 = var2.field747.field858;
                var2.field782 = var2.field747.field844;
                var2.field783 = var2.field747.field852;
                var2.field784 = var2.field747.field878;
            }
            if ((var3 & 0x2) != 0) {
                int var11 = field428.method2409();
                int var12 = field428.method2409();
                var2.method766(var11, var12, field423);
                var2.field799 = field423 + 300;
                var2.field778 = field428.method2541();
                var2.field797 = field428.method2418();
            }
            if ((var3 & 0x8) != 0) {
                var2.field813 = field428.method2541();
                int var13 = field428.method2365();
                var2.field809 = var13 >> 16;
                var2.field780 = (var13 & 0xFFFF) + field423;
                var2.field814 = 0;
                var2.field781 = 0;
                if (var2.field780 > field423) {
                    var2.field814 = -1;
                }
                if (var2.field813 == 65535) {
                    var2.field813 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var14 = field428.method2409();
                int var15 = field428.method2562();
                var2.method766(var14, var15, field423);
                var2.field799 = field423 + 300;
                var2.field778 = field428.method2541();
                var2.field797 = field428.method2541();
            }
        }
    }

    @ObfuscatedName("et.bj(Ly;IIBI)V")
    public static final void method2829(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field831[0];
        int var5 = arg0.field832[0];
        if (var4 < 0 || var4 >= 104 || var5 < 0 || var5 >= 104 || arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
            return;
        }
        int var8 = arg0.method15();
        field303.field1823 = arg1;
        field303.field1833 = arg2;
        field303.field1824 = 1;
        field303.field1825 = 1;
        class11 var9 = field303;
        int var10 = class106.method44(var4, var5, var8, var9, field433[arg0.field55], true, field537, field538);
        if (var10 >= 1) {
            for (int var11 = 0; var11 < var10 - 1; var11++) {
                arg0.method21(field537[var11], field538[var11], arg3);
            }
        }
    }

    @ObfuscatedName("t.bl(IIIII)V")
    public static final void method655(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field460; var4++) {
            if (field467[var4] + field258[var4] > arg0 && field258[var4] < arg0 + arg2 && field468[var4] + field380[var4] > arg1 && field380[var4] < arg1 + arg3) {
                field462[var4] = true;
            }
        }
    }

    @ObfuscatedName("ac.bn(B)V")
    public static final void method681() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field399 - 1; var1++) {
                if (field402[var1] < 1000 && field402[var1 + 1] > 1000) {
                    String var2 = field405[var1];
                    field405[var1] = field405[var1 + 1];
                    field405[var1 + 1] = var2;
                    String var3 = field404[var1];
                    field404[var1] = field404[var1 + 1];
                    field404[var1 + 1] = var3;
                    int var4 = field402[var1];
                    field402[var1] = field402[var1 + 1];
                    field402[var1 + 1] = var4;
                    int var5 = field400[var1];
                    field400[var1] = field400[var1 + 1];
                    field400[var1 + 1] = var5;
                    int var6 = field401[var1];
                    field401[var1] = field401[var1 + 1];
                    field401[var1 + 1] = var6;
                    int var7 = field403[var1];
                    field403[var1] = field403[var1 + 1];
                    field403[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field881 != null || field430 != null) {
            return;
        }
        int var20;
        int var21;
        label217: {
            int var8 = class140.field2130;
            if (field398) {
                if (var8 != 1 && (Statics.field2882 || var8 != 4)) {
                    int var9 = class140.field2121;
                    int var10 = class140.field2122;
                    if (var9 < Statics.field1933 - 10 || var9 > Statics.field1933 + Statics.field1031 + 10 || var10 < Statics.field1992 - 10 || var10 > Statics.field1992 + Statics.field1509 + 10) {
                        field398 = false;
                        method655(Statics.field1933, Statics.field1992, Statics.field1031, Statics.field1509);
                    }
                }
                if (var8 == 1 || !Statics.field2882 && var8 == 4) {
                    int var11 = Statics.field1933;
                    int var12 = Statics.field1992;
                    int var13 = Statics.field1031;
                    int var14 = class140.field2128;
                    int var15 = class140.field2129;
                    int var16 = -1;
                    for (int var17 = 0; var17 < field399; var17++) {
                        int var18 = (field399 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1) {
                        method6(var16);
                    }
                    field398 = false;
                    method655(Statics.field1933, Statics.field1992, Statics.field1031, Statics.field1509);
                }
            } else {
                if ((var8 == 1 || !Statics.field2882 && var8 == 4) && field399 > 0) {
                    int var19 = field402[field399 - 1];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field400[field399 - 1];
                        var21 = field401[field399 - 1];
                        class173 var22 = class173.method47(var21);
                        if (class178.method659(method34(var22))) {
                            break label217;
                        }
                        int var23 = method34(var22);
                        boolean var24 = (var23 >> 29 & 0x1) != 0;
                        if (var24) {
                            break label217;
                        }
                    }
                }
                if ((var8 == 1 || !Statics.field2882 && var8 == 4) && (field523 == 1 && field399 > 2 || method1994(field399 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !Statics.field2882 && var8 == 4) && field399 > 0) {
                    method6(field399 - 1);
                }
                if (var8 == 2 && field399 > 0) {
                    method2090(class140.field2128, class140.field2129);
                }
            }
            return;
        }
        if (Statics.field881 != null && !field377 && field523 != 1 && !method1994(field399 - 1) && field399 > 0) {
            int var25 = field374;
            int var26 = field290;
            method154(Statics.field126, var25, var26);
            Statics.field126 = null;
        }
        field377 = false;
        field378 = 0;
        if (Statics.field881 != null) {
            method172(Statics.field881);
        }
        Statics.field881 = class173.method47(var21);
        field368 = var20;
        field374 = class140.field2128;
        field290 = class140.field2129;
        if (field399 > 0) {
            method1524(field399 - 1);
        }
        method172(Statics.field881);
    }

    @ObfuscatedName("cd.bu(III)V")
    public static final void method2090(int arg0, int arg1) {
        int var2 = Statics.field164.method3821(class157.field2405);
        for (int var3 = 0; var3 < field399; var3++) {
            int var4 = Statics.field164.method3821(method182(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field399 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field942) {
            var6 = Statics.field942 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field2210) {
            var7 = Statics.field2210 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field398 = true;
        Statics.field1933 = var6;
        Statics.field1992 = var7;
        Statics.field1031 = var2;
        Statics.field1509 = field399 * 15 + 22;
    }

    @ObfuscatedName("cp.bf(IB)Z")
    public static final boolean method1994(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field402[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("l.cs(II)V")
    public static final void method6(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field400[arg0];
        int var2 = field401[arg0];
        int var3 = field402[arg0];
        int var4 = field403[arg0];
        String var5 = field404[arg0];
        String var6 = field405[arg0];
        method2591(var1, var2, var3, var4, var5, var6, class140.field2128, class140.field2129);
    }

    @ObfuscatedName("a.cz(Lar;III)V")
    public static final void method154(class31 arg0, int arg1, int arg2) {
        method2591(arg0.field667, arg0.field670, arg0.field665, arg0.field666, arg0.field676, arg0.field676, arg1, arg2);
    }

    @ObfuscatedName("dx.cc(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method2591(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(160);
            field301.method2423(Statics.field1506);
            field301.method2415(Statics.field941);
            field301.method2440(Statics.field2112 + arg0);
            field301.method2466(arg3 >> 14 & 0x7FFF);
            field301.method2415(Statics.field1093);
            field301.method2405(class137.field2089[82] ? 1 : 0);
            field301.method2496(Statics.field2677 + arg1);
        }
        if (arg2 == 3) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(83);
            field301.method2466(arg3 >> 14 & 0x7FFF);
            field301.method2440(Statics.field2677 + arg1);
            field301.method2366(class137.field2089[82] ? 1 : 0);
            field301.method2415(Statics.field2112 + arg0);
        }
        if (arg2 == 41) {
            field301.method2648(102);
            field301.method2514(arg1);
            field301.method2496(arg0);
            field301.method2466(arg3);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 48) {
            class3 var8 = field469[arg3];
            if (var8 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(109);
                field301.method2406(class137.field2089[82] ? 1 : 0);
                field301.method2415(arg3);
            }
        }
        if (arg2 == 2) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(50);
            field301.method2487(Statics.field1619);
            field301.method2496(field373);
            field301.method2366(class137.field2089[82] ? 1 : 0);
            field301.method2440(Statics.field2112 + arg0);
            field301.method2466(arg3 >> 14 & 0x7FFF);
            field301.method2415(Statics.field2677 + arg1);
        }
        if (arg2 == 22) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(118);
            field301.method2415(arg3);
            field301.method2466(Statics.field2677 + arg1);
            field301.method2366(class137.field2089[82] ? 1 : 0);
            field301.method2440(Statics.field2112 + arg0);
        }
        if (arg2 == 30 && field416 == null) {
            method2781(arg1, arg0);
            field416 = class173.method956(arg1, arg0);
            method172(field416);
        }
        if (arg2 == 49) {
            class3 var9 = field469[arg3];
            if (var9 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(111);
                field301.method2466(arg3);
                field301.method2405(class137.field2089[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(175);
            field301.method2440(Statics.field2677 + arg1);
            field301.method2496(Statics.field2112 + arg0);
            field301.method2496(arg3 >> 14 & 0x7FFF);
            field301.method2405(class137.field2089[82] ? 1 : 0);
        }
        if (arg2 == 8) {
            class35 var10 = field296[arg3];
            if (var10 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(31);
                field301.method2496(field373);
                field301.method2440(arg3);
                field301.method2404(class137.field2089[82] ? 1 : 0);
                field301.method2432(Statics.field1619);
            }
        }
        if (arg2 == 18) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(241);
            field301.method2496(arg3);
            field301.method2404(class137.field2089[82] ? 1 : 0);
            field301.method2440(Statics.field2677 + arg1);
            field301.method2496(Statics.field2112 + arg0);
        }
        if (arg2 == 31) {
            field301.method2648(156);
            field301.method2440(Statics.field1093);
            field301.method2466(arg0);
            field301.method2487(Statics.field1506);
            field301.method2423(arg1);
            field301.method2415(arg3);
            field301.method2415(Statics.field941);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 16) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(126);
            field301.method2496(arg3);
            field301.method2404(class137.field2089[82] ? 1 : 0);
            field301.method2415(Statics.field2677 + arg1);
            field301.method2496(Statics.field941);
            field301.method2466(Statics.field2112 + arg0);
            field301.method2432(Statics.field1506);
            field301.method2440(Statics.field1093);
        }
        if (arg2 == 40) {
            field301.method2648(75);
            field301.method2466(arg0);
            field301.method2423(arg1);
            field301.method2496(arg3);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 36) {
            field301.method2648(233);
            field301.method2440(arg3);
            field301.method2423(arg1);
            field301.method2466(arg0);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 32) {
            field301.method2648(70);
            field301.method2487(Statics.field1619);
            field301.method2496(arg0);
            field301.method2466(field373);
            field301.method2432(arg1);
            field301.method2415(arg3);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 26) {
            field301.method2648(66);
            for (class4 var11 = (class4) field517.method3574(); var11 != null; var11 = (class4) field517.method3573()) {
                if (var11.field62 == 0 || var11.field62 == 3) {
                    method2172(var11, true);
                }
            }
            if (field416 != null) {
                method172(field416);
                field416 = null;
            }
        }
        if (arg2 == 1002) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field301.method2648(131);
            field301.method2440(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 46) {
            class3 var12 = field469[arg3];
            if (var12 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(168);
                field301.method2496(arg3);
                field301.method2405(class137.field2089[82] ? 1 : 0);
            }
        }
        if (arg2 == 45) {
            class3 var13 = field469[arg3];
            if (var13 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(86);
                field301.method2440(arg3);
                field301.method2366(class137.field2089[82] ? 1 : 0);
            }
        }
        if (arg2 == 1003) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            class35 var14 = field296[arg3];
            if (var14 != null) {
                class40 var15 = var14.field747;
                if (var15.field849 != null) {
                    var15 = var15.method786();
                }
                if (var15 != null) {
                    field301.method2648(61);
                    field301.method2440(var15.field847);
                }
            }
        }
        if (arg2 == 44) {
            class3 var16 = field469[arg3];
            if (var16 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(227);
                field301.method2406(class137.field2089[82] ? 1 : 0);
                field301.method2496(arg3);
            }
        }
        if (arg2 == 24) {
            class173 var17 = class173.method47(arg1);
            boolean var18 = true;
            if (var17.field2735 > 0) {
                var18 = method3(var17);
            }
            if (var18) {
                field301.method2648(177);
                field301.method2514(arg1);
            }
        }
        if (arg2 == 1001) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(186);
            field301.method2496(arg3 >> 14 & 0x7FFF);
            field301.method2496(Statics.field2677 + arg1);
            field301.method2440(Statics.field2112 + arg0);
            field301.method2405(class137.field2089[82] ? 1 : 0);
        }
        if (arg2 == 7) {
            class35 var19 = field296[arg3];
            if (var19 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(176);
                field301.method2440(Statics.field1093);
                field301.method2404(class137.field2089[82] ? 1 : 0);
                field301.method2423(Statics.field1506);
                field301.method2415(Statics.field941);
                field301.method2496(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var20 = field469[arg3];
            if (var20 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(117);
                field301.method2440(arg3);
                field301.method2406(class137.field2089[82] ? 1 : 0);
                field301.method2496(Statics.field1093);
                field301.method2466(Statics.field941);
                field301.method2423(Statics.field1506);
            }
        }
        if (arg2 == 13) {
            class35 var21 = field296[arg3];
            if (var21 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(108);
                field301.method2404(class137.field2089[82] ? 1 : 0);
                field301.method2496(arg3);
            }
        }
        if (arg2 == 39) {
            field301.method2648(144);
            field301.method2466(arg3);
            field301.method2466(arg0);
            field301.method2423(arg1);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 10) {
            class35 var22 = field296[arg3];
            if (var22 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(58);
                field301.method2440(arg3);
                field301.method2405(class137.field2089[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class173 var23 = class173.method956(arg1, arg0);
            if (var23 != null) {
                field301.method2648(196);
                field301.method2487(Statics.field1619);
                field301.method2440(field414);
                field301.method2496(arg0);
                field301.method2466(var23.field2849);
                field301.method2496(field373);
                field301.method2487(arg1);
            }
        }
        if (arg2 == 28) {
            field301.method2648(177);
            field301.method2514(arg1);
            class173 var24 = class173.method47(arg1);
            if (var24.field2841 != null && var24.field2841[0][0] == 5) {
                int var25 = var24.field2841[0][1];
                class176.field2878[var25] = 1 - class176.field2878[var25];
                method2322(var25);
            }
        }
        if (arg2 == 23) {
            Statics.field788.method1858(Statics.field19, arg0, arg1);
        }
        if (arg2 == 12) {
            class35 var26 = field296[arg3];
            if (var26 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(77);
                field301.method2496(arg3);
                field301.method2405(class137.field2089[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field301.method2648(167);
            field301.method2440(arg0);
            field301.method2487(arg1);
            field301.method2496(arg3);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 51) {
            class3 var27 = field469[arg3];
            if (var27 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(134);
                field301.method2366(class137.field2089[82] ? 1 : 0);
                field301.method2440(arg3);
            }
        }
        if (arg2 == 1005) {
            class173 var28 = class173.method47(arg1);
            if (var28 == null || var28.field2848[arg0] < 100000) {
                field301.method2648(169);
                field301.method2440(arg3);
            } else {
                class12.method2685(27, "", var28.field2848[arg0] + " x " + class52.method168(arg3).field1082);
            }
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 50) {
            class3 var29 = field469[arg3];
            if (var29 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(46);
                field301.method2496(arg3);
                field301.method2406(class137.field2089[82] ? 1 : 0);
            }
        }
        if (arg2 == 4) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(220);
            field301.method2496(arg3 >> 14 & 0x7FFF);
            field301.method2415(Statics.field2112 + arg0);
            field301.method2366(class137.field2089[82] ? 1 : 0);
            field301.method2466(Statics.field2677 + arg1);
        }
        if (arg2 == 43) {
            field301.method2648(136);
            field301.method2440(arg0);
            field301.method2440(arg3);
            field301.method2432(arg1);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 1004) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field301.method2648(169);
            field301.method2440(arg3);
        }
        if (arg2 == 29) {
            field301.method2648(177);
            field301.method2514(arg1);
            class173 var30 = class173.method47(arg1);
            if (var30.field2841 != null && var30.field2841[0][0] == 5) {
                int var31 = var30.field2841[0][1];
                if (class176.field2878[var31] != var30.field2843[0]) {
                    class176.field2878[var31] = var30.field2843[0];
                    method2322(var31);
                }
            }
        }
        if (arg2 == 17) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(45);
            field301.method2496(Statics.field2677 + arg1);
            field301.method2466(field373);
            field301.method2440(Statics.field2112 + arg0);
            field301.method2466(arg3);
            field301.method2366(class137.field2089[82] ? 1 : 0);
            field301.method2487(Statics.field1619);
        }
        if (arg2 == 33) {
            field301.method2648(206);
            field301.method2440(arg3);
            field301.method2415(arg0);
            field301.method2514(arg1);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 19) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(4);
            field301.method2415(Statics.field2112 + arg0);
            field301.method2366(class137.field2089[82] ? 1 : 0);
            field301.method2496(arg3);
            field301.method2440(Statics.field2677 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var32 = class173.method956(arg1, arg0);
            if (var32 != null) {
                Statics.method1633(arg3, arg1, arg0, var32.field2849, arg5);
            }
        }
        if (arg2 == 5) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(98);
            field301.method2406(class137.field2089[82] ? 1 : 0);
            field301.method2415(Statics.field2112 + arg0);
            field301.method2440(Statics.field2677 + arg1);
            field301.method2415(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 38) {
            method1998();
            class173 var33 = class173.method47(arg1);
            field420 = 1;
            Statics.field941 = arg0;
            Statics.field1506 = arg1;
            Statics.field1093 = arg3;
            method172(var33);
            field536 = class2.method2885(16748608) + class52.method168(arg3).field1082 + class2.method2885(16777215);
            if (field536 == null) {
                field536 = "null";
            }
            return;
        }
        if (arg2 == 47) {
            class3 var34 = field469[arg3];
            if (var34 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(208);
                field301.method2405(class137.field2089[82] ? 1 : 0);
                field301.method2466(arg3);
            }
        }
        if (arg2 == 25) {
            class173 var35 = class173.method956(arg1, arg0);
            if (var35 != null) {
                method1998();
                int var36 = method34(var35);
                int var37 = var36 >> 11 & 0x3F;
                int var39 = var35.field2849;
                class173 var40 = class173.method956(arg1, arg0);
                if (var40 != null && var40.field2820 != null) {
                    class1 var41 = new class1();
                    var41.field3 = var40;
                    var41.field8 = var40.field2820;
                    class37.method616(var41);
                }
                field414 = var39;
                field327 = true;
                Statics.field1619 = arg1;
                field373 = arg0;
                Statics.field1353 = var37;
                method172(var40);
                field420 = 0;
                field450 = method3004(var35);
                if (field450 == null) {
                    field450 = "Null";
                }
                if (var35.field2730) {
                    field340 = var35.field2802 + class2.method2885(16777215);
                } else {
                    field340 = class2.method2885(65280) + var35.field2845 + class2.method2885(16777215);
                }
            }
            return;
        }
        if (arg2 == 21) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(1);
            field301.method2440(Statics.field2677 + arg1);
            field301.method2404(class137.field2089[82] ? 1 : 0);
            field301.method2496(Statics.field2112 + arg0);
            field301.method2466(arg3);
        }
        if (arg2 == 11) {
            class35 var42 = field296[arg3];
            if (var42 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(94);
                field301.method2405(class137.field2089[82] ? 1 : 0);
                field301.method2496(arg3);
            }
        }
        if (arg2 == 37) {
            field301.method2648(19);
            field301.method2466(arg0);
            field301.method2432(arg1);
            field301.method2496(arg3);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 9) {
            class35 var43 = field296[arg3];
            if (var43 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(234);
                field301.method2415(arg3);
                field301.method2366(class137.field2089[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field301.method2648(122);
            field301.method2496(arg0);
            field301.method2466(arg3);
            field301.method2487(arg1);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (arg2 == 20) {
            field421 = arg6;
            field371 = arg7;
            field370 = 2;
            field264 = 0;
            field491 = arg0;
            field519 = arg1;
            field301.method2648(55);
            field301.method2466(Statics.field2112 + arg0);
            field301.method2415(Statics.field2677 + arg1);
            field301.method2406(class137.field2089[82] ? 1 : 0);
            field301.method2415(arg3);
        }
        if (arg2 == 15) {
            class3 var44 = field469[arg3];
            if (var44 != null) {
                field421 = arg6;
                field371 = arg7;
                field370 = 2;
                field264 = 0;
                field491 = arg0;
                field519 = arg1;
                field301.method2648(171);
                field301.method2496(arg3);
                field301.method2405(class137.field2089[82] ? 1 : 0);
                field301.method2415(field373);
                field301.method2487(Statics.field1619);
            }
        }
        if (arg2 == 34) {
            field301.method2648(138);
            field301.method2432(arg1);
            field301.method2496(arg3);
            field301.method2466(arg0);
            field313 = 0;
            Statics.field1564 = class173.method47(arg1);
            field372 = arg0;
        }
        if (field420 != 0) {
            field420 = 0;
            method172(class173.method47(Statics.field1506));
        }
        if (field327) {
            method1998();
        }
        if (Statics.field1564 != null && field313 == 0) {
            method172(Statics.field1564);
        }
    }

    @ObfuscatedName("ai.ci(ILjava/lang/String;I)V")
    public static void method865(int arg0, String arg1) {
        int var2 = class33.field720;
        int[] var3 = class33.field725;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field469[var3[var5]];
            if (var6 != null && Statics.field989 != var6 && var6.field47 != null && var6.field47.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field301.method2648(227);
                    field301.method2406(0);
                    field301.method2496(var3[var5]);
                } else if (arg0 == 4) {
                    field301.method2648(208);
                    field301.method2405(0);
                    field301.method2466(var3[var5]);
                } else if (arg0 == 6) {
                    field301.method2648(111);
                    field301.method2466(var3[var5]);
                    field301.method2405(0);
                } else if (arg0 == 7) {
                    field301.method2648(46);
                    field301.method2496(var3[var5]);
                    field301.method2406(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method2685(4, "", class157.field2498 + arg1);
        }
    }

    @ObfuscatedName("ck.cx(I)V")
    public static void method1998() {
        if (!field327) {
            return;
        }
        class173 var0 = class173.method956(Statics.field1619, field373);
        if (var0 != null && var0.field2821 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field8 = var0.field2821;
            class37.method616(var1);
        }
        field327 = false;
        method172(var0);
    }

    @ObfuscatedName("eh.cg(IIB)V")
    public static void method2781(int arg0, int arg1) {
        field301.method2648(20);
        field301.method2514(arg0);
        field301.method2496(arg1);
    }

    @ObfuscatedName("am.ch(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method752(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field398 || field399 >= 500) {
            return;
        }
        field404[field399] = arg0;
        field405[field399] = arg1;
        field402[field399] = arg2;
        field403[field399] = arg3;
        field400[field399] = arg4;
        field401[field399] = arg5;
        field399++;
    }

    @ObfuscatedName("ew.cb(I)V")
    public static void method2792() {
        for (int var0 = 0; var0 < field399; var0++) {
            int var1 = field402[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field399 - 1) {
                    for (int var3 = var0; var3 < field399 - 1; var3++) {
                        field404[var3] = field404[var3 + 1];
                        field405[var3] = field405[var3 + 1];
                        field402[var3] = field402[var3 + 1];
                        field403[var3] = field403[var3 + 1];
                        field400[var3] = field400[var3 + 1];
                        field401[var3] = field401[var3 + 1];
                    }
                }
                field399--;
            }
        }
    }

    @ObfuscatedName("h.cm(II)Ljava/lang/String;")
    public static String method182(int arg0) {
        return field405[arg0].length() > 0 ? field404[arg0] + class157.field2444 + field405[arg0] : field404[arg0];
    }

    @ObfuscatedName("ez.cp(IIIII)V")
    public static final void method2997(int arg0, int arg1, int arg2, int arg3) {
        if (field420 == 0 && !field327) {
            method752(class157.field2439, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class105.field1804; var6++) {
            int var7 = class105.field1754[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field788.method1851(Statics.field19, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method85(var11);
                    if (var12.field923 != null) {
                        var12 = var12.method832();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field420 == 1) {
                        method752(class157.field2539, field536 + " " + class2.field22 + " " + class2.method2885(65535) + var12.field892, 1, var7, var8, var9);
                    } else if (!field327) {
                        String[] var13 = var12.field909;
                        if (field453) {
                            var13 = method100(var13);
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
                                    method752(var13[var14], class2.method2885(65535) + var12.field892, var15, var7, var8, var9);
                                }
                            }
                        }
                        method752(class157.field2540, class2.method2885(65535) + var12.field892, 1002, var12.field931 << 14, var8, var9);
                    } else if ((Statics.field1353 & 0x4) == 4) {
                        method752(field450, field340 + " " + class2.field22 + " " + class2.method2885(65535) + var12.field892, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field296[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field747.field876 == 1 && (var16.field815 & 0x7F) == 64 && (var16.field805 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field297; var17++) {
                            class35 var18 = field296[field298[var17]];
                            if (var18 != null && var16 != var18 && var18.field747.field876 == 1 && var16.field815 == var18.field815 && var16.field805 == var18.field805) {
                                method3171(var18.field747, field298[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field720;
                        int[] var20 = class33.field725;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field469[var20[var21]];
                            if (var22 != null && var16.field815 == var22.field815 && var16.field805 == var22.field805) {
                                method2716(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method3171(var16.field747, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field469[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field815 & 0x7F) == 64 && (var23.field805 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field297; var24++) {
                            class35 var25 = field296[field298[var24]];
                            if (var25 != null && var25.field747.field876 == 1 && var23.field815 == var25.field815 && var23.field805 == var25.field805) {
                                method3171(var25.field747, field298[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field720;
                        int[] var27 = class33.field725;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field469[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field815 == var29.field815 && var23.field805 == var29.field805) {
                                method2716(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field389 == var11) {
                        var4 = var7;
                    } else {
                        method2716(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class199 var30 = field359[Statics.field19][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3612(); var31 != null; var31 = (class29) var30.method3614()) {
                            class52 var32 = class52.method168(var31.field650);
                            if (field420 == 1) {
                                method752(class157.field2539, field536 + " " + class2.field22 + " " + class2.method2885(16748608) + var32.field1082, 16, var31.field650, var8, var9);
                            } else if (!field327) {
                                String[] var33 = var32.field1070;
                                if (field453) {
                                    var33 = method100(var33);
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
                                        method752(var33[var34], class2.method2885(16748608) + var32.field1082, var35, var31.field650, var8, var9);
                                    } else if (var34 == 2) {
                                        method752(class157.field2284, class2.method2885(16748608) + var32.field1082, 20, var31.field650, var8, var9);
                                    }
                                }
                                method752(class157.field2540, class2.method2885(16748608) + var32.field1082, 1004, var31.field650, var8, var9);
                            } else if ((Statics.field1353 & 0x1) == 1) {
                                method752(field450, field340 + " " + class2.field22 + " " + class2.method2885(16748608) + var32.field1082, 17, var31.field650, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field469[field389];
            method2716(var38, field389, var36, var37);
        }
    }

    @ObfuscatedName("fl.ck(Lat;IIIB)V")
    public static final void method3171(class40 arg0, int arg1, int arg2, int arg3) {
        if (field399 >= 400) {
            return;
        }
        if (arg0.field849 != null) {
            arg0 = arg0.method786();
        }
        if (arg0 == null || !arg0.field863 || arg0.field856 && field441 != arg1) {
            return;
        }
        String var4 = arg0.field848;
        if (arg0.field865 != 0) {
            int var6 = arg0.field865;
            int var7 = Statics.field989.field35;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2885(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2885(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2885(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2885(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2885(65280);
            } else if (var8 > 6) {
                var9 = class2.method2885(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2885(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2885(12648192);
            } else {
                var9 = class2.method2885(16776960);
            }
            var4 = var4 + var9 + " " + class2.field17 + class157.field2440 + arg0.field865 + class2.field21;
        }
        if (field420 == 1) {
            method752(class157.field2539, field536 + " " + class2.field22 + " " + class2.method2885(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field327) {
            String[] var10 = arg0.field874;
            if (field453) {
                var10 = method100(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class157.field2484)) {
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
                        method752(var10[var11], class2.method2885(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class157.field2484)) {
                        short var14 = 0;
                        if (field344 == class21.field542 || field344 == class21.field541 && arg0.field865 > Statics.field989.field35) {
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
                        method752(var10[var13], class2.method2885(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method752(class157.field2540, class2.method2885(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1353 & 0x2) == 2) {
            method752(field450, field340 + " " + class2.field22 + " " + class2.method2885(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("en.cu(Ly;IIIB)V")
    public static final void method2716(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field989 == arg0 || field399 >= 400) {
            return;
        }
        String var9;
        if (arg0.field36 == 0) {
            String var4 = arg0.field47;
            int var5 = arg0.field35;
            int var6 = Statics.field989.field35;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2885(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2885(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2885(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2885(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2885(65280);
            } else if (var7 > 6) {
                var8 = class2.method2885(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2885(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2885(12648192);
            } else {
                var8 = class2.method2885(16776960);
            }
            var9 = var4 + var8 + " " + class2.field17 + class157.field2440 + arg0.field35 + class2.field21;
        } else {
            var9 = arg0.field47 + " " + class2.field17 + class157.field2441 + arg0.field36 + class2.field21;
        }
        if (field420 == 1) {
            method752(class157.field2539, field536 + " " + class2.field22 + " " + class2.method2885(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field327) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field407[var10] != null) {
                    short var11 = 0;
                    if (field407[var10].equalsIgnoreCase(class157.field2484)) {
                        if (field344 == class21.field542 || field344 == class21.field541 && arg0.field35 > Statics.field989.field35) {
                            var11 = 2000;
                        }
                        if (Statics.field989.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field989.field49 == arg0.field49) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field387[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field438[var10] + var11;
                    method752(field407[var10], class2.method2885(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1353 & 0x8) == 8) {
            method752(field450, field340 + " " + class2.field22 + " " + class2.method2885(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field399; var14++) {
            if (field402[var14] == 23) {
                field405[var14] = class2.method2885(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("dc.cf(IIIIIIIII)V")
    public static final void method2317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method2979(arg0)) {
            Statics.field157 = null;
            method760(Statics.field2766[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field157 != null) {
                method760(Statics.field157, -1412584499, arg1, arg2, arg3, arg4, Statics.field2160, Statics.field1352, arg7);
                Statics.field157 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field462[var8] = true;
            }
        } else {
            field462[arg7] = true;
        }
    }

    @ObfuscatedName("aa.cj([Lfd;IIIIIIIIB)V")
    public static final void method760(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1784(arg2, arg3, arg4, arg5);
        class91.method2001();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2834 == arg1 || arg1 == -1412584499 && field430 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field258[field460] = var10.field2744 + arg6;
                    field380[field460] = var10.field2745 + arg7;
                    field467[field460] = var10.field2746;
                    field468[field460] = var10.field2797;
                    var11 = ++field460 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2773 = var11;
                var10.field2752 = field423;
                if (!var10.field2730 || !method11(var10)) {
                    if (var10.field2735 > 0) {
                        int var12 = var10.field2735;
                        if (var12 == 324) {
                            if (field531 == -1) {
                                field531 = var10.field2764;
                                field532 = var10.field2765;
                            }
                            if (field417.field2895) {
                                var10.field2764 = field531;
                            } else {
                                var10.field2764 = field532;
                            }
                        } else if (var12 == 325) {
                            if (field531 == -1) {
                                field531 = var10.field2764;
                                field532 = var10.field2765;
                            }
                            if (field417.field2895) {
                                var10.field2764 = field532;
                            } else {
                                var10.field2764 = field531;
                            }
                        } else if (var12 == 327) {
                            var10.field2780 = 150;
                            var10.field2837 = (int) (Math.sin((double) field423 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2772 = 5;
                            var10.field2737 = 0;
                        } else if (var12 == 328) {
                            var10.field2780 = 150;
                            var10.field2837 = (int) (Math.sin((double) field423 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2772 = 5;
                            var10.field2737 = 1;
                        }
                    }
                    int var13 = var10.field2744 + arg6;
                    int var14 = var10.field2745 + arg7;
                    int var15 = var10.field2761;
                    if (field430 == var10) {
                        if (arg1 != -1412584499 && !var10.field2825) {
                            Statics.field157 = arg0;
                            Statics.field2160 = arg6;
                            Statics.field1352 = arg7;
                            continue;
                        }
                        if (field312 && field533) {
                            int var16 = class140.field2121;
                            int var17 = class140.field2122;
                            int var18 = var16 - field432;
                            int var19 = var17 - field321;
                            if (var18 < field436) {
                                var18 = field436;
                            }
                            if (var10.field2746 + var18 > field436 + field431.field2746) {
                                var18 = field436 + field431.field2746 - var10.field2746;
                            }
                            if (var19 < field437) {
                                var19 = field437;
                            }
                            if (var10.field2797 + var19 > field437 + field431.field2797) {
                                var19 = field437 + field431.field2797 - var10.field2797;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2825) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2733 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2733 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2746 + var13;
                        int var27 = var10.field2797 + var14;
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
                        int var30 = var10.field2746 + var13;
                        int var31 = var10.field2797 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2730 || var20 < var22 && var21 < var23) {
                        if (var10.field2735 != 0) {
                            if (var10.field2735 == 1336) {
                                if (field274) {
                                    var14 += 15;
                                    Statics.field145.method3888("Fps:" + field2169, var10.field2746 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field259) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field259) {
                                        var34 = 16711680;
                                    }
                                    Statics.field145.method3888("Mem:" + var33 + "k", var10.field2746 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2735 == 1337) {
                                field319 = var13;
                                field458 = var14;
                                int var37 = var10.field2746;
                                int var38 = var10.field2797;
                                field364++;
                                method186(class34.field737);
                                boolean var39 = false;
                                if (field389 >= 0) {
                                    int var40 = class33.field720;
                                    int[] var41 = class33.field725;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field389 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method186(class34.field741);
                                }
                                method742(true);
                                method186(var39 ? class34.field739 : class34.field738);
                                method742(false);
                                for (class7 var43 = (class7) field392.method3611(); var43 != null; var43 = (class7) field392.method3613()) {
                                    if (Statics.field19 != var43.field93 || field423 > var43.field112) {
                                        var43.method3702();
                                    } else if (field423 >= var43.field97) {
                                        if (var43.field101 > 0) {
                                            class35 var44 = field296[var43.field101 - 1];
                                            if (var44 != null && var44.field815 >= 0 && var44.field815 < 13312 && var44.field805 >= 0 && var44.field805 < 13312) {
                                                var43.method88(var44.field815, var44.field805, method39(var44.field815, var44.field805, var43.field93) - var43.field115, field423);
                                            }
                                        }
                                        if (var43.field101 < 0) {
                                            int var45 = -var43.field101 - 1;
                                            class3 var46;
                                            if (field381 == var45) {
                                                var46 = Statics.field989;
                                            } else {
                                                var46 = field469[var45];
                                            }
                                            if (var46 != null && var46.field815 >= 0 && var46.field815 < 13312 && var46.field805 >= 0 && var46.field805 < 13312) {
                                                var43.method88(var46.field815, var46.field805, method39(var46.field815, var46.field805, var43.field93) - var43.field115, field423);
                                            }
                                        }
                                        var43.method87(field334);
                                        Statics.field788.method1948(Statics.field19, (int) var43.field96, (int) var43.field104, (int) var43.field109, 60, var43, var43.field111, -1, false);
                                    }
                                }
                                for (class30 var47 = (class30) field393.method3611(); var47 != null; var47 = (class30) field393.method3613()) {
                                    if (Statics.field19 != var47.field654 || var47.field660) {
                                        var47.method3702();
                                    } else if (field423 >= var47.field653) {
                                        var47.method677(field334);
                                        if (var47.field660) {
                                            var47.method3702();
                                        } else {
                                            Statics.field788.method1948(var47.field654, var47.field655, var47.field656, var47.field658, 60, var47, 0, -1, false);
                                        }
                                    }
                                }
                                method1033(var13, var14, var37, var38, true);
                                int var48 = field375;
                                int var49 = field257;
                                int var50 = field521;
                                int var51 = field522;
                                class80.method1784(var48, var49, var48 + var50, var49 + var51);
                                class91.method2001();
                                if (!field505) {
                                    int var52 = field343;
                                    if (field352 / 256 > var52) {
                                        var52 = field352 / 256;
                                    }
                                    if (field350[4] && field508[4] + 128 > var52) {
                                        var52 = field508[4] + 128;
                                    }
                                    int var53 = field390 + field273 & 0x7FF;
                                    int var54 = Statics.field122;
                                    int var55 = method39(Statics.field989.field815, Statics.field989.field805, Statics.field19) - field349;
                                    int var56 = Statics.field186;
                                    int var57 = var52 * 3 + 600;
                                    int var58 = 2048 - var52 & 0x7FF;
                                    int var59 = 2048 - var53 & 0x7FF;
                                    int var60 = 0;
                                    int var61 = 0;
                                    int var62 = var57;
                                    if (var58 != 0) {
                                        int var63 = class91.field1530[var58];
                                        int var64 = class91.field1536[var58];
                                        int var65 = var61 * var64 - var57 * var63 >> 16;
                                        var62 = var61 * var63 + var57 * var64 >> 16;
                                        var61 = var65;
                                    }
                                    if (var59 != 0) {
                                        int var66 = class91.field1530[var59];
                                        int var67 = class91.field1536[var59];
                                        int var68 = var60 * var67 + var62 * var66 >> 16;
                                        var62 = var62 * var67 - var60 * var66 >> 16;
                                        var60 = var68;
                                    }
                                    Statics.field1134 = var54 - var60;
                                    Statics.field233 = var55 - var61;
                                    Statics.field184 = var56 - var62;
                                    Statics.field239 = var52;
                                    Statics.field760 = var53;
                                }
                                int var69;
                                if (field505) {
                                    var69 = method734();
                                } else {
                                    var69 = Statics.method121();
                                }
                                int var70 = Statics.field1134;
                                int var71 = Statics.field233;
                                int var72 = Statics.field184;
                                int var73 = Statics.field239;
                                int var74 = Statics.field760;
                                for (int var75 = 0; var75 < 5; var75++) {
                                    if (field350[var75]) {
                                        int var76 = (int) (Math.random() * (double) (field507[var75] * 2 + 1) - (double) field507[var75] + Math.sin((double) field509[var75] / 100.0D * (double) field328[var75]) * (double) field508[var75]);
                                        if (var75 == 0) {
                                            Statics.field1134 += var76;
                                        }
                                        if (var75 == 1) {
                                            Statics.field233 += var76;
                                        }
                                        if (var75 == 2) {
                                            Statics.field184 += var76;
                                        }
                                        if (var75 == 3) {
                                            Statics.field760 = Statics.field760 + var76 & 0x7FF;
                                        }
                                        if (var75 == 4) {
                                            Statics.field239 += var76;
                                            if (Statics.field239 < 128) {
                                                Statics.field239 = 128;
                                            }
                                            if (Statics.field239 > 383) {
                                                Statics.field239 = 383;
                                            }
                                        }
                                    }
                                }
                                int var77 = class140.field2121;
                                int var78 = class140.field2122;
                                if (class140.field2130 != 0) {
                                    var77 = class140.field2128;
                                    var78 = class140.field2129;
                                }
                                if (var77 >= var48 && var77 < var48 + var50 && var78 >= var49 && var78 < var49 + var51) {
                                    class105.field1801 = true;
                                    class105.field1804 = 0;
                                    class105.field1802 = var77 - var48;
                                    class105.field1803 = var78 - var49;
                                } else {
                                    class105.field1801 = false;
                                    class105.field1804 = 0;
                                }
                                method3223();
                                class80.method1735(var48, var49, var50, var51, 0);
                                method3223();
                                int var79 = class91.field1525;
                                class91.field1525 = field347;
                                Statics.field788.method1859(Statics.field1134, Statics.field233, Statics.field184, Statics.field239, Statics.field760, var69);
                                class91.field1525 = var79;
                                method3223();
                                Statics.field788.method1989();
                                method712(var48, var49, var50, var51);
                                method657(var48, var49);
                                ((class95) Statics.field1532).method2081(field334);
                                method2999(var48, var49, var50, var51);
                                Statics.field1134 = var70;
                                Statics.field233 = var71;
                                Statics.field184 = var72;
                                Statics.field239 = var73;
                                Statics.field760 = var74;
                                if (field267 && class171.method1272(true, false) == 0) {
                                    field267 = false;
                                }
                                if (field267) {
                                    class80.method1735(var48, var49, var50, var51, 0);
                                    method2305(class157.field2293, false);
                                }
                                field462[var10.field2773] = true;
                                class80.method1784(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2735 == 1338) {
                                method3223();
                                class175 var80 = var10.method3271(false);
                                if (var80 != null) {
                                    class80.method1784(var13, var14, var80.field2876 + var13, var80.field2871 + var14);
                                    if (field474 == 2 || field474 == 5) {
                                        class80.method1744(var13, var14, 0, var80.field2873, var80.field2872);
                                    } else {
                                        int var81 = field329 + field273 & 0x7FF;
                                        int var82 = Statics.field989.field815 / 32 + 48;
                                        int var83 = 464 - Statics.field989.field805 / 32;
                                        Statics.field197.method1660(var13, var14, var80.field2876, var80.field2871, var82, var83, var81, field492 + 256, var80.field2873, var80.field2872);
                                        for (int var84 = 0; var84 < field409; var84++) {
                                            int var85 = field488[var84] * 4 + 2 - Statics.field989.field815 / 32;
                                            int var86 = field355[var84] * 4 + 2 - Statics.field989.field805 / 32;
                                            method1034(var13, var14, var85, var86, field490[var84], var80);
                                        }
                                        int var87 = 0;
                                        while (true) {
                                            if (var87 >= 104) {
                                                for (int var92 = 0; var92 < field297; var92++) {
                                                    class35 var93 = field296[field298[var92]];
                                                    if (var93 != null && var93.method20()) {
                                                        class40 var94 = var93.field747;
                                                        if (var94 != null && var94.field849 != null) {
                                                            var94 = var94.method786();
                                                        }
                                                        if (var94 != null && var94.field864 && var94.field863) {
                                                            int var95 = var93.field815 / 32 - Statics.field989.field815 / 32;
                                                            int var96 = var93.field805 / 32 - Statics.field989.field805 / 32;
                                                            method1034(var13, var14, var95, var96, Statics.field2085[1], var80);
                                                        }
                                                    }
                                                }
                                                int var97 = class33.field720;
                                                int[] var98 = class33.field725;
                                                for (int var99 = 0; var99 < var97; var99++) {
                                                    class3 var100 = field469[var98[var99]];
                                                    if (var100 != null && var100.method20() && !var100.field44 && Statics.field989 != var100) {
                                                        int var101 = var100.field815 / 32 - Statics.field989.field815 / 32;
                                                        int var102 = var100.field805 / 32 - Statics.field989.field805 / 32;
                                                        boolean var103 = false;
                                                        if (Statics.method928(var100.field47, true)) {
                                                            var103 = true;
                                                        }
                                                        boolean var104 = false;
                                                        for (int var105 = 0; var105 < Statics.field2683; var105++) {
                                                            if (var100.field47.equals(Statics.field2214[var105].field594)) {
                                                                var104 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var106 = false;
                                                        if (Statics.field989.field49 != 0 && var100.field49 != 0 && Statics.field989.field49 == var100.field49) {
                                                            var106 = true;
                                                        }
                                                        if (var103) {
                                                            method1034(var13, var14, var101, var102, Statics.field2085[3], var80);
                                                        } else if (var106) {
                                                            method1034(var13, var14, var101, var102, Statics.field2085[4], var80);
                                                        } else if (var104) {
                                                            method1034(var13, var14, var101, var102, Statics.field2085[5], var80);
                                                        } else {
                                                            method1034(var13, var14, var101, var102, Statics.field2085[2], var80);
                                                        }
                                                    }
                                                }
                                                if (field276 != 0 && field423 % 20 < 10) {
                                                    if (field276 == 1 && field277 >= 0 && field277 < field296.length) {
                                                        class35 var107 = field296[field277];
                                                        if (var107 != null) {
                                                            int var108 = var107.field815 / 32 - Statics.field989.field815 / 32;
                                                            int var109 = var107.field805 / 32 - Statics.field989.field805 / 32;
                                                            method2958(var13, var14, var108, var109, Statics.field335[1], var80);
                                                        }
                                                    }
                                                    if (field276 == 2) {
                                                        int var110 = field524 * 4 - Statics.field2112 * 4 + 2 - Statics.field989.field815 / 32;
                                                        int var111 = field459 * 4 - Statics.field2677 * 4 + 2 - Statics.field989.field805 / 32;
                                                        method2958(var13, var14, var110, var111, Statics.field335[1], var80);
                                                    }
                                                    if (field276 == 10 && field278 >= 0 && field278 < field469.length) {
                                                        class3 var112 = field469[field278];
                                                        if (var112 != null) {
                                                            int var113 = var112.field815 / 32 - Statics.field989.field815 / 32;
                                                            int var114 = var112.field805 / 32 - Statics.field989.field805 / 32;
                                                            method2958(var13, var14, var113, var114, Statics.field335[1], var80);
                                                        }
                                                    }
                                                }
                                                if (field491 != 0) {
                                                    int var115 = field491 * 4 + 2 - Statics.field989.field815 / 32;
                                                    int var116 = field519 * 4 + 2 - Statics.field989.field805 / 32;
                                                    method1034(var13, var14, var115, var116, Statics.field335[0], var80);
                                                }
                                                if (!Statics.field989.field44) {
                                                    class80.method1735(var80.field2876 / 2 + var13 - 1, var80.field2871 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var88 = 0; var88 < 104; var88++) {
                                                class199 var89 = field359[Statics.field19][var87][var88];
                                                if (var89 != null) {
                                                    int var90 = var87 * 4 + 2 - Statics.field989.field815 / 32;
                                                    int var91 = var88 * 4 + 2 - Statics.field989.field805 / 32;
                                                    method1034(var13, var14, var90, var91, Statics.field2085[0], var80);
                                                }
                                            }
                                            var87++;
                                        }
                                    }
                                    field463[var11] = true;
                                }
                                class80.method1784(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2735 == 1339) {
                                method187(var10, var13, var14, var11);
                                class80.method1784(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2733 == 0) {
                            if (!var10.field2730 && method11(var10) && Statics.field742 != var10) {
                                continue;
                            }
                            if (!var10.field2730) {
                                if (var10.field2753 > var10.field2755 - var10.field2797) {
                                    var10.field2753 = var10.field2755 - var10.field2797;
                                }
                                if (var10.field2753 < 0) {
                                    var10.field2753 = 0;
                                }
                            }
                            method760(arg0, var10.field2732, var20, var21, var22, var23, var13 - var10.field2815, var14 - var10.field2753, var11);
                            if (var10.field2853 != null) {
                                method760(var10.field2853, var10.field2732, var20, var21, var22, var23, var13 - var10.field2815, var14 - var10.field2753, var11);
                            }
                            class4 var117 = (class4) field517.method3571((long) var10.field2732);
                            if (var117 != null) {
                                method2317(var117.field58, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1784(arg2, arg3, arg4, arg5);
                            class91.method2001();
                        }
                        if (field471 || field464[var11] || field412 > 1) {
                            if (var10.field2733 == 0 && !var10.field2730 && var10.field2755 > var10.field2797) {
                                method2729(var10.field2746 + var13, var14, var10.field2753, var10.field2797, var10.field2755);
                            }
                            if (var10.field2733 != 1) {
                                if (var10.field2733 == 2) {
                                    int var118 = 0;
                                    for (int var119 = 0; var119 < var10.field2743; var119++) {
                                        for (int var120 = 0; var120 < var10.field2742; var120++) {
                                            int var121 = (var10.field2824 + 32) * var120 + var13;
                                            int var122 = (var10.field2796 + 32) * var119 + var14;
                                            if (var118 < 20) {
                                                var121 += var10.field2804[var118];
                                                var122 += var10.field2798[var118];
                                            }
                                            if (var10.field2847[var118] > 0) {
                                                boolean var123 = false;
                                                boolean var124 = false;
                                                int var125 = var10.field2847[var118] - 1;
                                                if (var121 + 32 > arg2 && var121 < arg4 && var122 + 32 > arg3 && var122 < arg5 || Statics.field881 == var10 && field368 == var118) {
                                                    class79 var126;
                                                    if (field420 == 1 && Statics.field941 == var118 && Statics.field1506 == var10.field2732) {
                                                        var126 = class52.method1528(var125, var10.field2848[var118], 2, 0, 2, false);
                                                    } else {
                                                        var126 = class52.method1528(var125, var10.field2848[var118], 1, 3153952, 2, false);
                                                    }
                                                    if (var126 == null) {
                                                        method172(var10);
                                                    } else if (Statics.field881 == var10 && field368 == var118) {
                                                        int var127 = class140.field2121 - field374;
                                                        int var128 = class140.field2122 - field290;
                                                        if (var127 < 5 && var127 > -5) {
                                                            var127 = 0;
                                                        }
                                                        if (var128 < 5 && var128 > -5) {
                                                            var128 = 0;
                                                        }
                                                        if (field378 < 5) {
                                                            var127 = 0;
                                                            var128 = 0;
                                                        }
                                                        var126.method1656(var121 + var127, var122 + var128, 128);
                                                        if (arg1 != -1) {
                                                            class173 var129 = arg0[arg1 & 0xFFFF];
                                                            if (var122 + var128 < class80.field1369 && var129.field2753 > 0) {
                                                                int var130 = field334 * (class80.field1369 - var122 - var128) / 3;
                                                                if (var130 > field334 * 10) {
                                                                    var130 = field334 * 10;
                                                                }
                                                                if (var130 > var129.field2753) {
                                                                    var130 = var129.field2753;
                                                                }
                                                                var129.field2753 -= var130;
                                                                field290 += var130;
                                                                method172(var129);
                                                            }
                                                            if (var122 + var128 + 32 > class80.field1370 && var129.field2753 < var129.field2755 - var129.field2797) {
                                                                int var131 = field334 * (var122 + var128 + 32 - class80.field1370) / 3;
                                                                if (var131 > field334 * 10) {
                                                                    var131 = field334 * 10;
                                                                }
                                                                if (var131 > var129.field2755 - var129.field2797 - var129.field2753) {
                                                                    var131 = var129.field2755 - var129.field2797 - var129.field2753;
                                                                }
                                                                var129.field2753 += var131;
                                                                field290 -= var131;
                                                                method172(var129);
                                                            }
                                                        }
                                                    } else if (Statics.field1564 == var10 && field372 == var118) {
                                                        var126.method1656(var121, var122, 128);
                                                    } else {
                                                        var126.method1650(var121, var122);
                                                    }
                                                }
                                            } else if (var10.field2799 != null && var118 < 20) {
                                                class79 var132 = var10.method3233(var118);
                                                if (var132 != null) {
                                                    var132.method1650(var121, var122);
                                                } else if (class173.field2729) {
                                                    method172(var10);
                                                }
                                            }
                                            var118++;
                                        }
                                    }
                                } else if (var10.field2733 == 3) {
                                    int var133;
                                    if (method1261(var10)) {
                                        var133 = var10.field2781;
                                        if (Statics.field742 == var10 && var10.field2759 != 0) {
                                            var133 = var10.field2759;
                                        }
                                    } else {
                                        var133 = var10.field2756;
                                        if (Statics.field742 == var10 && var10.field2807 != 0) {
                                            var133 = var10.field2807;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2760) {
                                            class80.method1735(var13, var14, var10.field2746, var10.field2797, var133);
                                        } else {
                                            class80.method1737(var13, var14, var10.field2746, var10.field2797, var133);
                                        }
                                    } else if (var10.field2760) {
                                        class80.method1734(var13, var14, var10.field2746, var10.field2797, var133, 256 - (var15 & 0xFF));
                                    } else {
                                        class80.method1738(var13, var14, var10.field2746, var10.field2797, var133, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2733 == 4) {
                                    class224 var134 = var10.method3232();
                                    if (var134 != null) {
                                        String var135 = var10.field2856;
                                        int var136;
                                        if (method1261(var10)) {
                                            var136 = var10.field2781;
                                            if (Statics.field742 == var10 && var10.field2759 != 0) {
                                                var136 = var10.field2759;
                                            }
                                            if (var10.field2790.length() > 0) {
                                                var135 = var10.field2790;
                                            }
                                        } else {
                                            var136 = var10.field2756;
                                            if (Statics.field742 == var10 && var10.field2807 != 0) {
                                                var136 = var10.field2807;
                                            }
                                        }
                                        if (var10.field2730 && var10.field2849 != -1) {
                                            class52 var137 = class52.method168(var10.field2849);
                                            var135 = var137.field1082;
                                            if (var135 == null) {
                                                var135 = "null";
                                            }
                                            if ((var137.field1089 == 1 || var10.field2850 != 1) && var10.field2850 != -1) {
                                                var135 = class2.method2885(16748608) + var135 + class2.field24 + " " + 'x' + method741(var10.field2850);
                                            }
                                        }
                                        if (field416 == var10) {
                                            class157 var10000 = (class157) null;
                                            var135 = class157.field2442;
                                            var136 = var10.field2756;
                                        }
                                        if (!var10.field2730) {
                                            var135 = method2748(var135, var10);
                                        }
                                        var134.method3829(var135, var13, var14, var10.field2746, var10.field2797, var136, var10.field2794 ? 0 : -1, var10.field2792, var10.field2724, var10.field2860);
                                    } else if (class173.field2729) {
                                        method172(var10);
                                    }
                                } else if (var10.field2733 == 5) {
                                    if (var10.field2730) {
                                        class79 var139;
                                        if (var10.field2849 == -1) {
                                            var139 = var10.method3231(false);
                                        } else {
                                            var139 = class52.method1528(var10.field2849, var10.field2850, var10.field2768, var10.field2750, var10.field2787, false);
                                        }
                                        if (var139 != null) {
                                            int var140 = var139.field1365;
                                            int var141 = var139.field1360;
                                            if (var10.field2854) {
                                                class80.method1730(var13, var14, var10.field2746 + var13, var10.field2797 + var14);
                                                int var142 = (var10.field2746 + (var140 - 1)) / var140;
                                                int var143 = (var10.field2797 + (var141 - 1)) / var141;
                                                for (int var144 = 0; var144 < var142; var144++) {
                                                    for (int var145 = 0; var145 < var143; var145++) {
                                                        if (var10.field2816 != 0) {
                                                            var139.method1662(var140 / 2 + var140 * var144 + var13, var141 / 2 + var141 * var145 + var14, var10.field2816, 4096);
                                                        } else if (var15 == 0) {
                                                            var139.method1650(var140 * var144 + var13, var141 * var145 + var14);
                                                        } else {
                                                            var139.method1656(var140 * var144 + var13, var141 * var145 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1784(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var146 = var10.field2746 * 4096 / var140;
                                                if (var10.field2816 != 0) {
                                                    var139.method1662(var10.field2746 / 2 + var13, var10.field2797 / 2 + var14, var10.field2816, var146);
                                                } else if (var15 != 0) {
                                                    var139.method1658(var13, var14, var10.field2746, var10.field2797, 256 - (var15 & 0xFF));
                                                } else if (var10.field2746 == var140 && var10.field2797 == var141) {
                                                    var139.method1650(var13, var14);
                                                } else {
                                                    var139.method1652(var13, var14, var10.field2746, var10.field2797);
                                                }
                                            }
                                        } else if (class173.field2729) {
                                            method172(var10);
                                        }
                                    } else {
                                        class79 var138 = var10.method3231(method1261(var10));
                                        if (var138 != null) {
                                            var138.method1650(var13, var14);
                                        } else if (class173.field2729) {
                                            method172(var10);
                                        }
                                    }
                                } else if (var10.field2733 == 6) {
                                    boolean var147 = method1261(var10);
                                    int var148;
                                    if (var147) {
                                        var148 = var10.field2777;
                                    } else {
                                        var148 = var10.field2859;
                                    }
                                    class105 var149 = null;
                                    int var150 = 0;
                                    if (var10.field2849 != -1) {
                                        class52 var151 = class52.method168(var10.field2849);
                                        if (var151 != null) {
                                            class52 var152 = var151.method1045(var10.field2850);
                                            var149 = var152.method1065(1);
                                            if (var149 == null) {
                                                method172(var10);
                                            } else {
                                                var149.method2188();
                                                var150 = var149.field1408 / 2;
                                            }
                                        }
                                    } else if (var10.field2772 == 5) {
                                        if (var10.field2737 == 0) {
                                            var149 = field417.method3305((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var149 = Statics.field989.method16();
                                        }
                                    } else if (var148 == -1) {
                                        var149 = var10.method3234((class43) null, -1, var147, Statics.field989.field32);
                                        if (var149 == null && class173.field2729) {
                                            method172(var10);
                                        }
                                    } else {
                                        class43 var153 = class43.method2262(var148);
                                        var149 = var10.method3234(var153, var10.field2851, var147, Statics.field989.field32);
                                        if (var149 == null && class173.field2729) {
                                            method172(var10);
                                        }
                                    }
                                    class91.method2017(var10.field2746 / 2 + var13, var10.field2797 / 2 + var14);
                                    int var154 = var10.field2783 * class91.field1530[var10.field2780] >> 16;
                                    int var155 = var10.field2783 * class91.field1536[var10.field2780] >> 16;
                                    if (var149 != null) {
                                        if (var10.field2730) {
                                            var149.method2188();
                                            if (var10.field2786) {
                                                var149.method2201(0, var10.field2837, var10.field2723, var10.field2780, var10.field2795, var10.field2748 + var150 + var154, var10.field2748 + var155, var10.field2783);
                                            } else {
                                                var149.method2200(0, var10.field2837, var10.field2723, var10.field2780, var10.field2795, var10.field2748 + var150 + var154, var10.field2748 + var155);
                                            }
                                        } else {
                                            var149.method2200(0, var10.field2837, 0, var10.field2780, 0, var154, var155);
                                        }
                                    }
                                    class91.method2032();
                                } else {
                                    if (var10.field2733 == 7) {
                                        class224 var156 = var10.method3232();
                                        if (var156 == null) {
                                            if (class173.field2729) {
                                                method172(var10);
                                            }
                                            continue;
                                        }
                                        int var157 = 0;
                                        for (int var158 = 0; var158 < var10.field2743; var158++) {
                                            for (int var159 = 0; var159 < var10.field2742; var159++) {
                                                if (var10.field2847[var157] > 0) {
                                                    class52 var160 = class52.method168(var10.field2847[var157] - 1);
                                                    String var161;
                                                    if (var160.field1089 != 1 && var10.field2848[var157] == 1) {
                                                        var161 = class2.method2885(16748608) + var160.field1082 + class2.field24;
                                                    } else {
                                                        var161 = class2.method2885(16748608) + var160.field1082 + class2.field24 + " " + 'x' + method741(var10.field2848[var157]);
                                                    }
                                                    int var162 = (var10.field2824 + 115) * var159 + var13;
                                                    int var163 = (var10.field2796 + 12) * var158 + var14;
                                                    if (var10.field2792 == 0) {
                                                        var156.method3826(var161, var162, var163, var10.field2756, var10.field2794 ? 0 : -1);
                                                    } else if (var10.field2792 == 1) {
                                                        var156.method3828(var161, var10.field2746 / 2 + var162, var163, var10.field2756, var10.field2794 ? 0 : -1);
                                                    } else {
                                                        var156.method3888(var161, var10.field2746 + var162 - 1, var163, var10.field2756, var10.field2794 ? 0 : -1);
                                                    }
                                                }
                                                var157++;
                                            }
                                        }
                                    }
                                    if (var10.field2733 == 8 && Statics.field880 == var10 && field408 == field376) {
                                        int var164 = 0;
                                        int var165 = 0;
                                        class224 var166 = Statics.field145;
                                        String var167 = var10.field2856;
                                        String var168 = method2748(var167, var10);
                                        while (var168.length() > 0) {
                                            int var169 = var168.indexOf(class2.field18);
                                            String var170;
                                            if (var169 == -1) {
                                                var170 = var168;
                                                var168 = "";
                                            } else {
                                                var170 = var168.substring(0, var169);
                                                var168 = var168.substring(var169 + 4);
                                            }
                                            int var171 = var166.method3821(var170);
                                            if (var171 > var164) {
                                                var164 = var171;
                                            }
                                            var165 += var166.field3165 + 1;
                                        }
                                        var164 += 6;
                                        var165 += 7;
                                        int var172 = var10.field2746 + var13 - 5 - var164;
                                        int var173 = var10.field2797 + var14 + 5;
                                        if (var172 < var13 + 5) {
                                            var172 = var13 + 5;
                                        }
                                        if (var164 + var172 > arg4) {
                                            var172 = arg4 - var164;
                                        }
                                        if (var165 + var173 > arg5) {
                                            var173 = arg5 - var165;
                                        }
                                        class80.method1735(var172, var173, var164, var165, 16777120);
                                        class80.method1737(var172, var173, var164, var165, 0);
                                        String var174 = var10.field2856;
                                        int var175 = var166.field3165 + var173 + 2;
                                        String var176 = method2748(var174, var10);
                                        while (var176.length() > 0) {
                                            int var177 = var176.indexOf(class2.field18);
                                            String var178;
                                            if (var177 == -1) {
                                                var178 = var176;
                                                var176 = "";
                                            } else {
                                                var178 = var176.substring(0, var177);
                                                var176 = var176.substring(var177 + 4);
                                            }
                                            var166.method3826(var178, var172 + 3, var175, 0, -1);
                                            var175 += var166.field3165 + 1;
                                        }
                                    }
                                    if (var10.field2733 == 9) {
                                        if (var10.field2762 == 1) {
                                            int var179;
                                            int var180;
                                            int var181;
                                            int var182;
                                            if (var10.field2763) {
                                                var179 = var13;
                                                var180 = var10.field2797 + var14;
                                                var181 = var10.field2746 + var13;
                                                var182 = var14;
                                            } else {
                                                var179 = var13;
                                                var180 = var14;
                                                var181 = var10.field2746 + var13;
                                                var182 = var10.field2797 + var14;
                                            }
                                            class80.method1728(var179, var180, var181, var182, var10.field2756);
                                        } else {
                                            int var183 = var10.field2746 >= 0 ? var10.field2746 : -var10.field2746;
                                            int var184 = var10.field2797 >= 0 ? var10.field2797 : -var10.field2797;
                                            int var185 = var183;
                                            if (var183 < var184) {
                                                var185 = var184;
                                            }
                                            if (var185 != 0) {
                                                int var186 = (var10.field2746 << 16) / var185;
                                                int var187 = (var10.field2797 << 16) / var185;
                                                if (var187 <= var186) {
                                                    var186 = -var186;
                                                } else {
                                                    var187 = -var187;
                                                }
                                                int var188 = var10.field2762 * var187 >> 17;
                                                int var189 = var10.field2762 * var187 + 1 >> 17;
                                                int var190 = var10.field2762 * var186 >> 17;
                                                int var191 = var10.field2762 * var186 + 1 >> 17;
                                                int var192 = var13 + var188;
                                                int var193 = var13 - var189;
                                                int var194 = var10.field2746 + var13 - var189;
                                                int var195 = var10.field2746 + var13 + var188;
                                                int var196 = var14 + var190;
                                                int var197 = var14 - var191;
                                                int var198 = var10.field2797 + var14 - var191;
                                                int var199 = var10.field2797 + var14 + var190;
                                                class91.method2009(var192, var193, var194);
                                                class91.method2012(var196, var197, var198, var192, var193, var194, var10.field2756);
                                                class91.method2009(var192, var194, var195);
                                                class91.method2012(var196, var198, var199, var192, var194, var195, var10.field2756);
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

    @ObfuscatedName("ej.cl(Ljava/lang/String;Lfd;I)Ljava/lang/String;")
    public static String method2748(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method614(arg1, var2 - 1);
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
                if (Statics.field116 != null) {
                    var8 = class163.method776(Statics.field116.field2189);
                    if (Statics.field116.field2183 != null) {
                        var8 = (String) Statics.field116.field2183;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ao.cq(II)Ljava/lang/String;")
    public static final String method741(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field25 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2885(65408) + var1.substring(0, var1.length() - 8) + class157.field2445 + " " + class2.field17 + var1 + class2.field21 + class2.field24;
        } else if (var1.length() > 6) {
            return " " + class2.method2885(16777215) + var1.substring(0, var1.length() - 4) + class157.field2329 + " " + class2.field17 + var1 + class2.field21 + class2.field24;
        } else {
            return " " + class2.method2885(16776960) + var1 + class2.field24;
        }
    }

    @ObfuscatedName("et.co(ZB)V")
    public static final void method2830(boolean arg0) {
        int var1 = field262;
        int var2 = Statics.field942;
        int var3 = Statics.field2210;
        if (class173.method2979(var1)) {
            method2300(Statics.field2766[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("cn.ce(Lfd;I)V")
    public static void method2180(class173 arg0) {
        class173 var1 = arg0.field2834 == -1 ? null : class173.method47(arg0.field2834);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field942;
            var3 = Statics.field2210;
        } else {
            var2 = var1.field2746;
            var3 = var1.field2797;
        }
        method1819(arg0, var2, var3, false);
        method197(arg0, var2, var3);
    }

    @ObfuscatedName("dl.cd([Lfd;IIIZI)V")
    public static void method2300(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2834 == arg1) {
                method1819(var6, arg2, arg3, arg4);
                method197(var6, arg2, arg3);
                if (var6.field2815 > var6.field2725 - var6.field2746) {
                    var6.field2815 = var6.field2725 - var6.field2746;
                }
                if (var6.field2815 < 0) {
                    var6.field2815 = 0;
                }
                if (var6.field2753 > var6.field2755 - var6.field2797) {
                    var6.field2753 = var6.field2755 - var6.field2797;
                }
                if (var6.field2753 < 0) {
                    var6.field2753 = 0;
                }
                if (var6.field2733 == 0) {
                    Statics.method870(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cv.cy(Lfd;IIZB)V")
    public static void method1819(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2746;
        int var5 = arg0.field2797;
        if (arg0.field2738 == 0) {
            arg0.field2746 = arg0.field2742;
        } else if (arg0.field2738 == 1) {
            arg0.field2746 = arg1 - arg0.field2742;
        } else if (arg0.field2738 == 2) {
            arg0.field2746 = arg0.field2742 * arg1 >> 14;
        }
        if (arg0.field2739 == 0) {
            arg0.field2797 = arg0.field2743;
        } else if (arg0.field2739 == 1) {
            arg0.field2797 = arg2 - arg0.field2743;
        } else if (arg0.field2739 == 2) {
            arg0.field2797 = arg0.field2743 * arg2 >> 14;
        }
        if (arg0.field2738 == 4) {
            arg0.field2746 = arg0.field2797 * arg0.field2791 / arg0.field2749;
        }
        if (arg0.field2739 == 4) {
            arg0.field2797 = arg0.field2749 * arg0.field2746 / arg0.field2791;
        }
        if (field427 && arg0.field2733 == 0) {
            if (arg0.field2797 < 5 && arg0.field2746 < 5) {
                arg0.field2797 = 5;
                arg0.field2746 = 5;
            } else {
                if (arg0.field2797 <= 0) {
                    arg0.field2797 = 5;
                }
                if (arg0.field2746 <= 0) {
                    arg0.field2746 = 5;
                }
            }
        }
        if (arg0.field2735 == 1337) {
            field429 = arg0;
        }
        if (arg3 && arg0.field2838 != null && (arg0.field2746 != var4 || arg0.field2797 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field8 = arg0.field2838;
            field456.method3606(var6);
        }
    }

    @ObfuscatedName("b.ca(Lfd;III)V")
    public static void method197(class173 arg0, int arg1, int arg2) {
        if (arg0.field2736 == 0) {
            arg0.field2744 = arg0.field2740;
        } else if (arg0.field2736 == 1) {
            arg0.field2744 = (arg1 - arg0.field2746) / 2 + arg0.field2740;
        } else if (arg0.field2736 == 2) {
            arg0.field2744 = arg1 - arg0.field2746 - arg0.field2740;
        } else if (arg0.field2736 == 3) {
            arg0.field2744 = arg0.field2740 * arg1 >> 14;
        } else if (arg0.field2736 == 4) {
            arg0.field2744 = (arg0.field2740 * arg1 >> 14) + (arg1 - arg0.field2746) / 2;
        } else {
            arg0.field2744 = arg1 - arg0.field2746 - (arg0.field2740 * arg1 >> 14);
        }
        if (arg0.field2754 == 0) {
            arg0.field2745 = arg0.field2741;
        } else if (arg0.field2754 == 1) {
            arg0.field2745 = (arg2 - arg0.field2797) / 2 + arg0.field2741;
        } else if (arg0.field2754 == 2) {
            arg0.field2745 = arg2 - arg0.field2797 - arg0.field2741;
        } else if (arg0.field2754 == 3) {
            arg0.field2745 = arg0.field2741 * arg2 >> 14;
        } else if (arg0.field2754 == 4) {
            arg0.field2745 = (arg0.field2741 * arg2 >> 14) + (arg2 - arg0.field2797) / 2;
        } else {
            arg0.field2745 = arg2 - arg0.field2797 - (arg0.field2741 * arg2 >> 14);
        }
        if (!field427 || arg0.field2733 != 0) {
            return;
        }
        if (arg0.field2744 < 0) {
            arg0.field2744 = 0;
        } else if (arg0.field2746 + arg0.field2744 > arg1) {
            arg0.field2744 = arg1 - arg0.field2746;
        }
        if (arg0.field2745 < 0) {
            arg0.field2745 = 0;
        } else if (arg0.field2797 + arg0.field2745 > arg2) {
            arg0.field2745 = arg2 - arg0.field2797;
        }
    }

    @ObfuscatedName("cg.cr(Lfd;IIIIIII)V")
    public static final void method1813(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field341) {
            field287 = 32;
        } else {
            field287 = 0;
        }
        field341 = false;
        if (class140.field2120 == 1 || !Statics.field2882 && class140.field2120 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2753 -= 4;
                method172(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2753 += 4;
                method172(arg0);
            } else if (arg5 >= arg1 - field287 && arg5 < field287 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2753 = (arg4 - arg3) * var8 / var9;
                method172(arg0);
                field341 = true;
            }
        }
        if (field425 == 0) {
            return;
        }
        int var10 = arg0.field2746;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2753 += field425 * 45;
            method172(arg0);
        }
    }

    @ObfuscatedName("ec.ct(IIIIII)V")
    public static final void method2729(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1001[0].method1790(arg0, arg1);
        Statics.field1001[1].method1790(arg0, arg1 + arg3 - 16);
        class80.method1735(arg0, arg1 + 16, 16, arg3 - 32, field337);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class80.method1735(arg0, arg1 + 16 + var6, 16, var5, field530);
        class80.method1741(arg0, arg1 + 16 + var6, var5, field325);
        class80.method1741(arg0 + 1, arg1 + 16 + var6, var5, field325);
        class80.method1739(arg0, arg1 + 16 + var6, 16, field325);
        class80.method1739(arg0, arg1 + 17 + var6, 16, field325);
        class80.method1741(arg0 + 15, arg1 + 16 + var6, var5, field311);
        class80.method1741(arg0 + 14, arg1 + 17 + var6, var5 - 1, field311);
        class80.method1739(arg0, arg1 + 15 + var6 + var5, 16, field311);
        class80.method1739(arg0 + 1, arg1 + 14 + var6 + var5, 15, field311);
    }

    @ObfuscatedName("br.cn(Lfd;I)Z")
    public static final boolean method1261(class173 arg0) {
        if (arg0.field2842 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2842.length; var1++) {
            int var2 = method614(arg0, var1);
            int var3 = arg0.field2843[var1];
            if (arg0.field2842[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2842[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2842[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("w.db(Lfd;II)I")
    public static final int method614(class173 arg0, int arg1) {
        if (arg0.field2841 == null || arg1 >= arg0.field2841.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2841[arg1];
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
                    var7 = field394[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field395[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field396[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method47(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method168(var12).field1091 || field263)) {
                        for (int var13 = 0; var13 < var11.field2847.length; var13++) {
                            if (var12 + 1 == var11.field2847[var13]) {
                                var7 += var11.field2848[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2878[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2264[field395[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2878[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field989.field35;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2263[var14]) {
                            var7 += field395[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method47(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method168(var18).field1091 || field263)) {
                        for (int var19 = 0; var19 < var17.field2847.length; var19++) {
                            if (var18 + 1 == var17.field2847[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field422;
                }
                if (var6 == 12) {
                    var7 = field294;
                }
                if (var6 == 13) {
                    int var20 = class176.field2878[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method2171(var22);
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
                    var7 = (Statics.field989.field815 >> 7) + Statics.field2112;
                }
                if (var6 == 19) {
                    var7 = (Statics.field989.field805 >> 7) + Statics.field2677;
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

    @ObfuscatedName("aj.du(Lfd;IIB)V")
    public static final void method772(class173 arg0, int arg1, int arg2) {
        if (arg0.field2734 == 1) {
            method752(arg0.field2776, "", 24, 0, 0, arg0.field2732);
        }
        if (arg0.field2734 == 2 && !field327) {
            String var3 = method3004(arg0);
            if (var3 != null) {
                method752(var3, class2.method2885(65280) + arg0.field2845, 25, 0, -1, arg0.field2732);
            }
        }
        if (arg0.field2734 == 3) {
            method752(class157.field2443, "", 26, 0, 0, arg0.field2732);
        }
        if (arg0.field2734 == 4) {
            method752(arg0.field2776, "", 28, 0, 0, arg0.field2732);
        }
        if (arg0.field2734 == 5) {
            method752(arg0.field2776, "", 29, 0, 0, arg0.field2732);
        }
        if (arg0.field2734 == 6 && field416 == null) {
            method752(arg0.field2776, "", 30, 0, -1, arg0.field2732);
        }
        if (arg0.field2733 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2797; var5++) {
                for (int var6 = 0; var6 < arg0.field2746; var6++) {
                    int var7 = (arg0.field2824 + 32) * var6;
                    int var8 = (arg0.field2796 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2804[var4];
                        var8 += arg0.field2798[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field308 = var4;
                        Statics.field121 = arg0;
                        if (arg0.field2847[var4] > 0) {
                            label293: {
                                class52 var9 = class52.method168(arg0.field2847[var4] - 1);
                                if (field420 == 1) {
                                    int var10 = method34(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field1506 != arg0.field2732 || Statics.field941 != var4) {
                                            method752(class157.field2539, field536 + " " + class2.field22 + " " + class2.method2885(16748608) + var9.field1082, 31, var9.field1112, var4, arg0.field2732);
                                        }
                                        break label293;
                                    }
                                }
                                if (field327) {
                                    int var12 = method34(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1353 & 0x10) == 16) {
                                            method752(field450, field340 + " " + class2.field22 + " " + class2.method2885(16748608) + var9.field1082, 32, var9.field1112, var4, arg0.field2732);
                                        }
                                        break label293;
                                    }
                                }
                                String[] var14 = var9.field1103;
                                if (field453) {
                                    var14 = method100(var14);
                                }
                                int var15 = method34(arg0);
                                boolean var16 = (var15 >> 30 & 0x1) != 0;
                                if (var16) {
                                    for (int var17 = 4; var17 >= 3; var17--) {
                                        if (var14 != null && var14[var17] != null) {
                                            byte var18;
                                            if (var17 == 3) {
                                                var18 = 36;
                                            } else {
                                                var18 = 37;
                                            }
                                            method752(var14[var17], class2.method2885(16748608) + var9.field1082, var18, var9.field1112, var4, arg0.field2732);
                                        } else if (var17 == 4) {
                                            method752(class157.field2285, class2.method2885(16748608) + var9.field1082, 37, var9.field1112, var4, arg0.field2732);
                                        }
                                    }
                                }
                                int var19 = method34(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    method752(class157.field2539, class2.method2885(16748608) + var9.field1082, 38, var9.field1112, var4, arg0.field2732);
                                }
                                int var21 = method34(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22 && var14 != null) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        if (var14[var23] != null) {
                                            byte var24 = 0;
                                            if (var23 == 0) {
                                                var24 = 33;
                                            }
                                            if (var23 == 1) {
                                                var24 = 34;
                                            }
                                            if (var23 == 2) {
                                                var24 = 35;
                                            }
                                            method752(var14[var23], class2.method2885(16748608) + var9.field1082, var24, var9.field1112, var4, arg0.field2732);
                                        }
                                    }
                                }
                                String[] var25 = arg0.field2800;
                                if (field453) {
                                    var25 = method100(var25);
                                }
                                if (var25 != null) {
                                    for (int var26 = 4; var26 >= 0; var26--) {
                                        if (var25[var26] != null) {
                                            byte var27 = 0;
                                            if (var26 == 0) {
                                                var27 = 39;
                                            }
                                            if (var26 == 1) {
                                                var27 = 40;
                                            }
                                            if (var26 == 2) {
                                                var27 = 41;
                                            }
                                            if (var26 == 3) {
                                                var27 = 42;
                                            }
                                            if (var26 == 4) {
                                                var27 = 43;
                                            }
                                            method752(var25[var26], class2.method2885(16748608) + var9.field1082, var27, var9.field1112, var4, arg0.field2732);
                                        }
                                    }
                                }
                                method752(class157.field2540, class2.method2885(16748608) + var9.field1082, 1005, var9.field1112, var4, arg0.field2732);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2730) {
            return;
        }
        if (field327) {
            int var28 = method34(arg0);
            boolean var29 = (var28 >> 21 & 0x1) != 0;
            if (var29 && (Statics.field1353 & 0x20) == 32) {
                method752(field450, field340 + " " + class2.field22 + " " + arg0.field2802, 58, 0, arg0.field2861, arg0.field2732);
            }
            return;
        }
        for (int var30 = 9; var30 >= 5; var30--) {
            String var31 = method1552(arg0, var30);
            if (var31 != null) {
                method752(var31, arg0.field2802, 1007, var30 + 1, arg0.field2861, arg0.field2732);
            }
        }
        String var32 = method3004(arg0);
        if (var32 != null) {
            method752(var32, arg0.field2802, 25, 0, arg0.field2861, arg0.field2732);
        }
        for (int var33 = 4; var33 >= 0; var33--) {
            String var34 = method1552(arg0, var33);
            if (var34 != null) {
                method752(var34, arg0.field2802, 57, var33 + 1, arg0.field2861, arg0.field2732);
            }
        }
        int var35 = method34(arg0);
        boolean var36 = (var35 & 0x1) != 0;
        if (var36) {
            method752(class157.field2287, "", 30, 0, arg0.field2861, arg0.field2732);
        }
    }

    @ObfuscatedName("el.dr([Lfd;IIIIIIII)V")
    public static final void method2860(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2730 || var9.field2733 == 0 || var9.field2809 || method34(var9) != 0 || field431 == var9 || var9.field2735 == 1338) && var9.field2834 == arg1 && (!var9.field2730 || !method11(var9))) {
                int var10 = var9.field2744 + arg6;
                int var11 = var9.field2745 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2733 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2733 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2746 + var10;
                    int var19 = var9.field2797 + var11;
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
                    int var22 = var9.field2746 + var10;
                    int var23 = var9.field2797 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field430 == var9) {
                    field503 = true;
                    field439 = var10;
                    field440 = var11;
                }
                if (!var9.field2730 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2121;
                    int var25 = class140.field2122;
                    if (class140.field2130 != 0) {
                        var24 = class140.field2128;
                        var25 = class140.field2129;
                    }
                    if (var9.field2735 == 1337) {
                        if (!field267 && !field398 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2997(var24, var25, var12, var13);
                        }
                    } else if (var9.field2735 == 1338) {
                        method51(var9, var10, var11);
                    } else {
                        if (!field398 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method772(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2733 == 0) {
                            if (!var9.field2730 && method11(var9) && Statics.field742 != var9) {
                                continue;
                            }
                            method2860(arg0, var9.field2732, var12, var13, var14, var15, var10 - var9.field2815, var11 - var9.field2753);
                            if (var9.field2853 != null) {
                                method2860(var9.field2853, var9.field2732, var12, var13, var14, var15, var10 - var9.field2815, var11 - var9.field2753);
                            }
                            class4 var26 = (class4) field517.method3571((long) var9.field2732);
                            if (var26 != null) {
                                if (var26.field62 == 0 && class140.field2121 >= var12 && class140.field2122 >= var13 && class140.field2121 < var14 && class140.field2122 < var15 && !field398 && !field427) {
                                    for (class1 var27 = (class1) field456.method3611(); var27 != null; var27 = (class1) field456.method3613()) {
                                        if (var27.field2) {
                                            var27.method3702();
                                            var27.field3.field2855 = false;
                                        }
                                    }
                                    if (Statics.field153 == 0) {
                                        field430 = null;
                                        field431 = null;
                                    }
                                    if (!field398) {
                                        field404[0] = class157.field2468;
                                        field405[0] = "";
                                        field402[0] = 1006;
                                        field399 = 1;
                                    }
                                }
                                int var28 = var26.field58;
                                if (class173.method2979(var28)) {
                                    method2860(Statics.field2766[var28], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2730) {
                            if (var9.field2862) {
                                if (class140.field2121 >= var12 && class140.field2122 >= var13 && class140.field2121 < var14 && class140.field2122 < var15) {
                                    for (class1 var29 = (class1) field456.method3611(); var29 != null; var29 = (class1) field456.method3613()) {
                                        if (var29.field2) {
                                            var29.method3702();
                                            var29.field3.field2855 = false;
                                        }
                                    }
                                    if (Statics.field153 == 0) {
                                        field430 = null;
                                        field431 = null;
                                    }
                                    if (!field398) {
                                        field404[0] = class157.field2468;
                                        field405[0] = "";
                                        field402[0] = 1006;
                                        field399 = 1;
                                    }
                                }
                            } else if (var9.field2846 && class140.field2121 >= var12 && class140.field2122 >= var13 && class140.field2121 < var14 && class140.field2122 < var15) {
                                for (class1 var30 = (class1) field456.method3611(); var30 != null; var30 = (class1) field456.method3613()) {
                                    if (var30.field2 && var30.field3.field2782 == var30.field8) {
                                        var30.method3702();
                                    }
                                }
                            }
                            boolean var31;
                            if (class140.field2121 >= var12 && class140.field2122 >= var13 && class140.field2121 < var14 && class140.field2122 < var15) {
                                var31 = true;
                            } else {
                                var31 = false;
                            }
                            boolean var32 = false;
                            if ((class140.field2120 == 1 || !Statics.field2882 && class140.field2120 == 4) && var31) {
                                var32 = true;
                            }
                            boolean var33 = false;
                            if ((class140.field2130 == 1 || !Statics.field2882 && class140.field2130 == 4) && class140.field2128 >= var12 && class140.field2129 >= var13 && class140.field2128 < var14 && class140.field2129 < var15) {
                                var33 = true;
                            }
                            if (var33) {
                                method2320(var9, class140.field2128 - var10, class140.field2129 - var11);
                            }
                            if (field430 != null && field430 != var9 && var31 && class178.method99(method34(var9))) {
                                field434 = var9;
                            }
                            if (field431 == var9) {
                                field533 = true;
                                field436 = var10;
                                field437 = var11;
                            }
                            if (var9.field2809) {
                                if (var31 && field425 != 0 && var9.field2782 != null) {
                                    class1 var34 = new class1();
                                    var34.field2 = true;
                                    var34.field3 = var9;
                                    var34.field10 = field425;
                                    var34.field8 = var9.field2782;
                                    field456.method3606(var34);
                                }
                                if (field430 != null || Statics.field881 != null || field398) {
                                    var33 = false;
                                    var32 = false;
                                    var31 = false;
                                }
                                if (!var9.field2722 && var33) {
                                    var9.field2722 = true;
                                    if (var9.field2822 != null) {
                                        class1 var35 = new class1();
                                        var35.field2 = true;
                                        var35.field3 = var9;
                                        var35.field4 = class140.field2128 - var10;
                                        var35.field10 = class140.field2129 - var11;
                                        var35.field8 = var9.field2822;
                                        field456.method3606(var35);
                                    }
                                }
                                if (var9.field2722 && var32 && var9.field2812 != null) {
                                    class1 var36 = new class1();
                                    var36.field2 = true;
                                    var36.field3 = var9;
                                    var36.field4 = class140.field2121 - var10;
                                    var36.field10 = class140.field2122 - var11;
                                    var36.field8 = var9.field2812;
                                    field456.method3606(var36);
                                }
                                if (var9.field2722 && !var32) {
                                    var9.field2722 = false;
                                    if (var9.field2813 != null) {
                                        class1 var37 = new class1();
                                        var37.field2 = true;
                                        var37.field3 = var9;
                                        var37.field4 = class140.field2121 - var10;
                                        var37.field10 = class140.field2122 - var11;
                                        var37.field8 = var9.field2813;
                                        field435.method3606(var37);
                                    }
                                }
                                if (var32 && var9.field2814 != null) {
                                    class1 var38 = new class1();
                                    var38.field2 = true;
                                    var38.field3 = var9;
                                    var38.field4 = class140.field2121 - var10;
                                    var38.field10 = class140.field2122 - var11;
                                    var38.field8 = var9.field2814;
                                    field456.method3606(var38);
                                }
                                if (!var9.field2855 && var31) {
                                    var9.field2855 = true;
                                    if (var9.field2808 != null) {
                                        class1 var39 = new class1();
                                        var39.field2 = true;
                                        var39.field3 = var9;
                                        var39.field4 = class140.field2121 - var10;
                                        var39.field10 = class140.field2122 - var11;
                                        var39.field8 = var9.field2808;
                                        field456.method3606(var39);
                                    }
                                }
                                if (var9.field2855 && var31 && var9.field2757 != null) {
                                    class1 var40 = new class1();
                                    var40.field2 = true;
                                    var40.field3 = var9;
                                    var40.field4 = class140.field2121 - var10;
                                    var40.field10 = class140.field2122 - var11;
                                    var40.field8 = var9.field2757;
                                    field456.method3606(var40);
                                }
                                if (var9.field2855 && !var31) {
                                    var9.field2855 = false;
                                    if (var9.field2817 != null) {
                                        class1 var41 = new class1();
                                        var41.field2 = true;
                                        var41.field3 = var9;
                                        var41.field4 = class140.field2121 - var10;
                                        var41.field10 = class140.field2122 - var11;
                                        var41.field8 = var9.field2817;
                                        field435.method3606(var41);
                                    }
                                }
                                if (var9.field2828 != null) {
                                    class1 var42 = new class1();
                                    var42.field3 = var9;
                                    var42.field8 = var9.field2828;
                                    field457.method3606(var42);
                                }
                                if (var9.field2779 != null && field444 > var9.field2857) {
                                    if (var9.field2823 == null || field444 - var9.field2857 > 32) {
                                        class1 var47 = new class1();
                                        var47.field3 = var9;
                                        var47.field8 = var9.field2779;
                                        field456.method3606(var47);
                                    } else {
                                        label498: for (int var43 = var9.field2857; var43 < field444; var43++) {
                                            int var44 = field443[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var9.field2823.length; var45++) {
                                                if (var9.field2823[var45] == var44) {
                                                    class1 var46 = new class1();
                                                    var46.field3 = var9;
                                                    var46.field8 = var9.field2779;
                                                    field456.method3606(var46);
                                                    break label498;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2857 = field444;
                                }
                                if (var9.field2863 != null && field446 > var9.field2858) {
                                    if (var9.field2832 == null || field446 - var9.field2858 > 32) {
                                        class1 var52 = new class1();
                                        var52.field3 = var9;
                                        var52.field8 = var9.field2863;
                                        field456.method3606(var52);
                                    } else {
                                        label474: for (int var48 = var9.field2858; var48 < field446; var48++) {
                                            int var49 = field445[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var9.field2832.length; var50++) {
                                                if (var9.field2832[var50] == var49) {
                                                    class1 var51 = new class1();
                                                    var51.field3 = var9;
                                                    var51.field8 = var9.field2863;
                                                    field456.method3606(var51);
                                                    break label474;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2858 = field446;
                                }
                                if (var9.field2826 != null && field448 > var9.field2829) {
                                    if (var9.field2827 == null || field448 - var9.field2829 > 32) {
                                        class1 var57 = new class1();
                                        var57.field3 = var9;
                                        var57.field8 = var9.field2826;
                                        field456.method3606(var57);
                                    } else {
                                        label450: for (int var53 = var9.field2829; var53 < field448; var53++) {
                                            int var54 = field447[var53 & 0x1F];
                                            for (int var55 = 0; var55 < var9.field2827.length; var55++) {
                                                if (var9.field2827[var55] == var54) {
                                                    class1 var56 = new class1();
                                                    var56.field3 = var9;
                                                    var56.field8 = var9.field2826;
                                                    field456.method3606(var56);
                                                    break label450;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2829 = field448;
                                }
                                if (field449 > var9.field2774 && var9.field2767 != null) {
                                    class1 var58 = new class1();
                                    var58.field3 = var9;
                                    var58.field8 = var9.field2767;
                                    field456.method3606(var58);
                                }
                                if (field361 > var9.field2774 && var9.field2833 != null) {
                                    class1 var59 = new class1();
                                    var59.field3 = var9;
                                    var59.field8 = var9.field2833;
                                    field456.method3606(var59);
                                }
                                if (field451 > var9.field2774 && var9.field2789 != null) {
                                    class1 var60 = new class1();
                                    var60.field3 = var9;
                                    var60.field8 = var9.field2789;
                                    field456.method3606(var60);
                                }
                                if (field369 > var9.field2774 && var9.field2839 != null) {
                                    class1 var61 = new class1();
                                    var61.field3 = var9;
                                    var61.field8 = var9.field2839;
                                    field456.method3606(var61);
                                }
                                if (field291 > var9.field2774 && var9.field2840 != null) {
                                    class1 var62 = new class1();
                                    var62.field3 = var9;
                                    var62.field8 = var9.field2840;
                                    field456.method3606(var62);
                                }
                                if (field454 > var9.field2774 && var9.field2835 != null) {
                                    class1 var63 = new class1();
                                    var63.field3 = var9;
                                    var63.field8 = var9.field2835;
                                    field456.method3606(var63);
                                }
                                var9.field2774 = field442;
                                if (var9.field2731 != null) {
                                    for (int var64 = 0; var64 < field480; var64++) {
                                        class1 var65 = new class1();
                                        var65.field3 = var9;
                                        var65.field9 = field367[var64];
                                        var65.field16 = field481[var64];
                                        var65.field8 = var9.field2731;
                                        field456.method3606(var65);
                                    }
                                }
                            }
                        }
                        if (!var9.field2730 && field430 == null && Statics.field881 == null && !field398) {
                            if ((var9.field2844 >= 0 || var9.field2807 != 0) && class140.field2121 >= var12 && class140.field2122 >= var13 && class140.field2121 < var14 && class140.field2122 < var15) {
                                if (var9.field2844 >= 0) {
                                    Statics.field742 = arg0[var9.field2844];
                                } else {
                                    Statics.field742 = var9;
                                }
                            }
                            if (var9.field2733 == 8 && class140.field2121 >= var12 && class140.field2122 >= var13 && class140.field2121 < var14 && class140.field2122 < var15) {
                                Statics.field880 = var9;
                            }
                            if (var9.field2755 > var9.field2797) {
                                method1813(var9, var9.field2746 + var10, var11, var9.field2797, var9.field2755, class140.field2121, class140.field2122);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gn.dl(III)V")
    public static final void method3406(int arg0, int arg1) {
        if (class173.method2979(arg0)) {
            method2176(Statics.field2766[arg0], arg1);
        }
    }

    @ObfuscatedName("ct.dp([Lfd;IB)V")
    public static final void method2176(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2733 == 0) {
                    if (var3.field2853 != null) {
                        method2176(var3.field2853, arg1);
                    }
                    class4 var4 = (class4) field517.method3571((long) var3.field2732);
                    if (var4 != null) {
                        method3406(var4.field58, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2836 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field8 = var3.field2836;
                    class37.method616(var5);
                }
                if (arg1 == 1 && var3.field2785 != null) {
                    if (var3.field2861 >= 0) {
                        class173 var6 = class173.method47(var3.field2732);
                        if (var6 == null || var6.field2853 == null || var3.field2861 >= var6.field2853.length || var6.field2853[var3.field2861] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field8 = var3.field2785;
                    class37.method616(var7);
                }
            }
        }
    }

    @ObfuscatedName("dn.dm(Lfd;III)V")
    public static final void method2320(class173 arg0, int arg1, int arg2) {
        if (field430 != null || field398 || arg0 == null) {
            return;
        }
        class173 var3 = arg0;
        int var4 = method34(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class173 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class173.method47(var3.field2834);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class173 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2778;
        }
        if (var9 == null) {
            return;
        }
        field430 = arg0;
        class173 var11 = arg0;
        int var12 = method34(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class173 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class173.method47(var11.field2834);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class173 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2778;
        }
        field431 = var17;
        field432 = arg1;
        field321 = arg2;
        Statics.field153 = 0;
        field312 = false;
        if (field399 > 0) {
            int var19 = field399 - 1;
            Statics.field126 = new class31();
            Statics.field126.field667 = field400[var19];
            Statics.field126.field670 = field401[var19];
            Statics.field126.field665 = field402[var19];
            Statics.field126.field666 = field403[var19];
            Statics.field126.field676 = field404[var19];
        }
        return;
    }

    @ObfuscatedName("fd.dk(I)V")
    public static final void method3250() {
        method172(field430);
        Statics.field153++;
        if (field503 && field533) {
            int var0 = class140.field2121;
            int var1 = class140.field2122;
            int var2 = var0 - field432;
            int var3 = var1 - field321;
            if (var2 < field436) {
                var2 = field436;
            }
            if (field430.field2746 + var2 > field436 + field431.field2746) {
                var2 = field436 + field431.field2746 - field430.field2746;
            }
            if (var3 < field437) {
                var3 = field437;
            }
            if (field430.field2797 + var3 > field437 + field431.field2797) {
                var3 = field437 + field431.field2797 - field430.field2797;
            }
            int var4 = var2 - field439;
            int var5 = var3 - field440;
            int var6 = field430.field2805;
            if (Statics.field153 > field430.field2806 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field312 = true;
            }
            int var7 = field431.field2815 + (var2 - field436);
            int var8 = field431.field2753 + (var3 - field437);
            if (field430.field2818 != null && field312) {
                class1 var9 = new class1();
                var9.field3 = field430;
                var9.field4 = var7;
                var9.field10 = var8;
                var9.field8 = field430.field2818;
                class37.method616(var9);
            }
            if (class140.field2120 == 0) {
                if (field312) {
                    if (field430.field2819 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field430;
                        var10.field4 = var7;
                        var10.field10 = var8;
                        var10.field7 = field434;
                        var10.field8 = field430.field2819;
                        class37.method616(var10);
                    }
                    if (field434 != null) {
                        class173 var11 = field430;
                        int var12 = method34(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class173 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class173.method47(var11.field2834);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field301.method2648(252);
                            field301.method2440(field434.field2849);
                            field301.method2432(field430.field2732);
                            field301.method2496(field434.field2861);
                            field301.method2440(field430.field2861);
                            field301.method2487(field434.field2732);
                            field301.method2496(field430.field2849);
                        }
                    }
                } else if ((field523 == 1 || method1994(field399 - 1)) && field399 > 2) {
                    method2090(field439 + field432, field440 + field321);
                } else if (field399 > 0) {
                    int var17 = field439 + field432;
                    int var18 = field440 + field321;
                    method154(Statics.field126, var17, var18);
                    Statics.field126 = null;
                }
                field430 = null;
            }
        } else if (Statics.field153 > 1) {
            field430 = null;
        }
    }

    @ObfuscatedName("bs.dt(II)V")
    public static void method1524(int arg0) {
        Statics.field126 = new class31();
        Statics.field126.field667 = field400[arg0];
        Statics.field126.field670 = field401[arg0];
        Statics.field126.field665 = field402[arg0];
        Statics.field126.field666 = field403[arg0];
        Statics.field126.field676 = field404[arg0];
    }

    @ObfuscatedName("s.dc(Lfd;I)V")
    public static void method172(class173 arg0) {
        if (field300 == arg0.field2752) {
            field462[arg0.field2773] = true;
        }
    }

    @ObfuscatedName("fm.dn(I)V")
    public static void method3192() {
        for (class4 var0 = (class4) field517.method3574(); var0 != null; var0 = (class4) field517.method3573()) {
            int var1 = var0.field58;
            if (class173.method2979(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2766[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2730;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3095;
                    class173 var6 = class173.method47(var5);
                    if (var6 != null) {
                        method172(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.df([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method100(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("br.dq(II)V")
    public static final void method1256(int arg0) {
        if (!class173.method2979(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2766[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2851 = 0;
                var3.field2852 = 0;
            }
        }
    }

    @ObfuscatedName("p.da([Lfd;II)V")
    public static final void method127(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2834 == arg1 && (!var3.field2730 || !method11(var3))) {
                if (var3.field2733 == 0) {
                    if (!var3.field2730 && method11(var3) && Statics.field742 != var3) {
                        continue;
                    }
                    method127(arg0, var3.field2732);
                    if (var3.field2853 != null) {
                        method127(var3.field2853, var3.field2732);
                    }
                    class4 var4 = (class4) field517.method3571((long) var3.field2732);
                    if (var4 != null) {
                        int var5 = var4.field58;
                        if (class173.method2979(var5)) {
                            method127(Statics.field2766[var5], -1);
                        }
                    }
                }
                if (var3.field2733 == 6) {
                    if (var3.field2859 != -1 || var3.field2777 != -1) {
                        boolean var6 = method1261(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2777;
                        } else {
                            var7 = var3.field2859;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method2262(var7);
                            var3.field2852 += field334;
                            while (var3.field2852 > var8.field957[var3.field2851]) {
                                var3.field2852 -= var8.field957[var3.field2851];
                                var3.field2851++;
                                if (var3.field2851 >= var8.field955.length) {
                                    var3.field2851 -= var8.field956;
                                    if (var3.field2851 < 0 || var3.field2851 >= var8.field955.length) {
                                        var3.field2851 = 0;
                                    }
                                }
                                method172(var3);
                            }
                        }
                    }
                    if (var3.field2830 != 0 && !var3.field2730) {
                        int var9 = var3.field2830 >> 16;
                        int var10 = var3.field2830 << 16 >> 16;
                        int var11 = field334 * var9;
                        int var12 = field334 * var10;
                        var3.field2780 = var3.field2780 + var11 & 0x7FF;
                        var3.field2837 = var3.field2837 + var12 & 0x7FF;
                        method172(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.dy(II)V")
    public static final void method2322(int arg0) {
        method3192();
        class24.method967();
        int var1 = class53.method3027(arg0).field1122;
        if (var1 == 0) {
            return;
        }
        int var2 = class176.field2878[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class91.method2006(0.9D);
                ((class95) Statics.field1532).method2087(0.9D);
            }
            if (var2 == 2) {
                class91.method2006(0.8D);
                ((class95) Statics.field1532).method2087(0.8D);
            }
            if (var2 == 3) {
                class91.method2006(0.7D);
                ((class95) Statics.field1532).method2087(0.7D);
            }
            if (var2 == 4) {
                class91.method2006(0.6D);
                ((class95) Statics.field1532).method2087(0.6D);
            }
            class52.field1074.method3540();
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
            if (field411 != var3) {
                if (field411 == 0 && field495 != -1) {
                    class183.method1626(Statics.field773, field495, 0, var3, false);
                    field496 = false;
                } else if (var3 == 0) {
                    Statics.field2930.method3514();
                    class183.field2933 = 1;
                    Statics.field2932 = null;
                    field496 = false;
                } else if (class183.field2933 == 0) {
                    Statics.field2930.method3423(var3);
                } else {
                    Statics.field2035 = var3;
                }
                field411 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field418 = 127;
            }
            if (var2 == 1) {
                field418 = 96;
            }
            if (var2 == 2) {
                field418 = 64;
            }
            if (var2 == 3) {
                field418 = 32;
            }
            if (var2 == 4) {
                field418 = 0;
            }
        }
        if (var1 == 5) {
            field523 = var2;
        }
        if (var1 == 6) {
            field419 = var2;
        }
        if (var1 == 9) {
            field280 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field498 = 127;
            }
            if (var2 == 1) {
                field498 = 96;
            }
            if (var2 == 2) {
                field498 = 64;
            }
            if (var2 == 3) {
                field498 = 32;
            }
            if (var2 == 4) {
                field498 = 0;
            }
        }
        if (var1 == 17) {
            field441 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class21[] var4 = new class21[] { class21.field541, class21.field543, class21.field542 };
            field344 = (class21) class109.method995(var4, var2);
            if (field344 == null) {
                field344 = class21.field541;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field389 = -1;
        } else {
            field389 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("ej.dx(IIII)Lu;")
    public static final class4 method2751(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field58 = arg1;
        var3.field62 = arg2;
        field517.method3572(var3, (long) arg0);
        method1256(arg1);
        class173 var4 = class173.method47(arg0);
        method172(var4);
        if (field416 != null) {
            method172(field416);
            field416 = null;
        }
        method2792();
        Statics.method870(Statics.field2766[arg0 >> 16], var4, false);
        class37.method653(arg1);
        if (field262 != -1) {
            method3406(field262, 1);
        }
        return var3;
    }

    @ObfuscatedName("ca.dg(Lu;ZI)V")
    public static final void method2172(class4 arg0, boolean arg1) {
        int var2 = arg0.field58;
        int var3 = (int) arg0.field3095;
        arg0.method3702();
        if (arg1) {
            class173.method855(var2);
        }
        for (class201 var4 = (class201) field510.method3574(); var4 != null; var4 = (class201) field510.method3573()) {
            if ((var4.field3095 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3702();
            }
        }
        class173 var5 = class173.method47(var3);
        if (var5 != null) {
            method172(var5);
        }
        method2792();
        if (field262 != -1) {
            method3406(field262, 1);
        }
    }

    @ObfuscatedName("m.ds(Lfd;I)Z")
    public static final boolean method3(class173 arg0) {
        int var1 = arg0.field2735;
        if (var1 == 205) {
            field489 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field417.method3299(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field417.method3301(var4, var5 == 1);
        }
        if (var1 == 324) {
            field417.method3303(false);
        }
        if (var1 == 325) {
            field417.method3303(true);
        }
        if (var1 == 326) {
            field301.method2648(151);
            field417.method3304(field301);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("n.dw(Lfd;IIII)V")
    public static final void method187(class173 arg0, int arg1, int arg2, int arg3) {
        class175 var4 = arg0.method3271(false);
        if (var4 == null) {
            return;
        }
        if (field474 < 3) {
            Statics.field89.method1660(arg1, arg2, var4.field2876, var4.field2871, 25, 25, field273, 256, var4.field2873, var4.field2872);
        } else {
            class80.method1744(arg1, arg2, 0, var4.field2873, var4.field2872);
        }
    }

    @ObfuscatedName("ea.de(IIIILcs;Lft;I)V")
    public static final void method2958(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1034(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field329 + field273 & 0x7FF;
        int var8 = class91.field1530[var7];
        int var9 = class91.field1536[var7];
        int var10 = var8 * 256 / (field492 + 256);
        int var11 = var9 * 256 / (field492 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field214.method1661(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("as.dd(IIIILcs;Lft;B)V")
    public static final void method1034(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field329 + field273 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1530[var6];
        int var9 = class91.field1536[var6];
        int var10 = var8 * 256 / (field492 + 256);
        int var11 = var9 * 256 / (field492 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1659(arg5.field2876 / 2 + var12 - arg4.field1365 / 2, arg5.field2871 / 2 - var13 - arg4.field1360 / 2, arg0, arg1, arg5.field2876, arg5.field2871, arg5.field2873, arg5.field2872);
        } else {
            arg4.method1650(arg5.field2876 / 2 + arg0 + var12 - arg4.field1365 / 2, arg5.field2871 / 2 + arg1 - var13 - arg4.field1360 / 2);
        }
    }

    @ObfuscatedName("ca.dj(Ljava/lang/String;B)Z")
    public static boolean method2170(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method1092(arg0, Statics.field1826);
        for (int var2 = 0; var2 < field528; var2++) {
            class8 var3 = field529[var2];
            if (var1.equalsIgnoreCase(class164.method1092(var3.field123, Statics.field1826))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method1092(var3.field120, Statics.field1826))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("a.dh(Ljava/lang/String;IB)V")
    public static final void method151(String arg0, int arg1) {
        field301.method2648(237);
        field301.method2366(class119.method2753(arg0) + 1);
        field301.method2366(arg1);
        field301.method2372(arg0);
    }

    @ObfuscatedName("n.dv(Ljava/lang/String;I)V")
    public static final void method191(String arg0) {
        if (!arg0.equals("")) {
            field301.method2648(253);
            field301.method2366(class119.method2753(arg0));
            field301.method2372(arg0);
        }
    }

    @ObfuscatedName("p.di(I)V")
    public static final void method133() {
        field301.method2648(253);
        field301.method2366(0);
    }

    @ObfuscatedName("y.en(Lfd;B)I")
    public static int method34(class173 arg0) {
        class201 var1 = (class201) field510.method3571(((long) arg0.field2732 << 32) + (long) arg0.field2861);
        return var1 == null ? arg0.field2801 : var1.field3080;
    }

    @ObfuscatedName("l.ef(Lfd;I)Z")
    public static boolean method11(class173 arg0) {
        if (field427) {
            if (method34(arg0) != 0) {
                return false;
            }
            if (arg0.field2733 == 0) {
                return false;
            }
        }
        return arg0.field2751;
    }

    @ObfuscatedName("bl.ec(Lfd;IB)Ljava/lang/String;")
    public static String method1552(class173 arg0, int arg1) {
        if (!class178.method1992(method34(arg0), arg1) && arg0.field2758 == null) {
            return null;
        } else if (arg0.field2803 == null || arg0.field2803.length <= arg1 || arg0.field2803[arg1] == null || arg0.field2803[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2803[arg1];
        }
    }

    @ObfuscatedName("fj.ee(Lfd;B)Ljava/lang/String;")
    public static String method3004(class173 arg0) {
        int var1 = method34(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2811 == null || arg0.field2811.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2811;
        }
    }

    @ObfuscatedName("g.ej(Ljava/lang/String;ZS)Ljava/lang/String;")
    public static String method112(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field520 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field520 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field520 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field520 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field520 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field3156 != null) {
            var3 = "/p=" + Statics.field3156;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field265 + "/a=" + Statics.field1943 + var3 + "/";
    }

    @ObfuscatedName("fr.eh(Ljava/lang/String;B)V")
    public static void method3342(String arg0) {
        Statics.field3156 = arg0;
        try {
            String var1 = Statics.field494.getParameter(class190.field3042.field3036);
            String var2 = Statics.field494.getParameter(class190.field3043.field3036);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class115.method2177() + 94608000000L;
                class111.field1913.setTime(new Date(var6));
                int var8 = class111.field1913.get(7);
                int var9 = class111.field1913.get(5);
                int var10 = class111.field1913.get(2);
                int var11 = class111.field1913.get(1);
                int var12 = class111.field1913.get(11);
                int var13 = class111.field1913.get(12);
                int var14 = class111.field1913.get(13);
                String var15 = class111.field1916[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class111.field1910[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field494;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }
}

package deob;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;

public final class client extends class131 {

    @ObfuscatedName("client.f")
    public static boolean field240 = true;

    @ObfuscatedName("client.e")
    public static int field241 = 1;

    @ObfuscatedName("client.d")
    public static int field242 = 0;

    @ObfuscatedName("client.v")
    public static int field244 = 0;

    @ObfuscatedName("client.u")
    public static boolean field245 = false;

    @ObfuscatedName("client.g")
    public static boolean field246 = false;

    @ObfuscatedName("client.a")
    public static int field247 = 0;

    @ObfuscatedName("client.w")
    public static class197[] field460 = new class197[4];

    @ObfuscatedName("client.l")
    public static int field248 = 0;

    @ObfuscatedName("client.q")
    public static boolean field324 = true;

    @ObfuscatedName("client.p")
    public static int field250 = 0;

    @ObfuscatedName("client.r")
    public static long field251 = -1L;

    @ObfuscatedName("client.b")
    public static int field252 = -1;

    @ObfuscatedName("client.h")
    public static int field253 = -1;

    @ObfuscatedName("client.i")
    public static int field384 = -1;

    @ObfuscatedName("client.o")
    public static boolean field255 = true;

    @ObfuscatedName("client.m")
    public static boolean field256 = false;

    @ObfuscatedName("client.ak")
    public static int field257 = 0;

    @ObfuscatedName("client.aw")
    public static int field258 = 0;

    @ObfuscatedName("client.af")
    public static int field259 = 0;

    @ObfuscatedName("client.ab")
    public static int field321 = 0;

    @ObfuscatedName("client.ao")
    public static int field368 = 0;

    @ObfuscatedName("client.ah")
    public static int field264 = 0;

    @ObfuscatedName("client.ae")
    public static int field262 = 0;

    @ObfuscatedName("client.ax")
    public static int field413 = 0;

    @ObfuscatedName("client.ar")
    public static int field265 = 0;

    @ObfuscatedName("client.aq")
    public static class107 field266 = new class107(new byte[5000]);

    @ObfuscatedName("client.an")
    public static class18 field360 = class18.field507;

    @ObfuscatedName("client.av")
    public static int field496 = 0;

    @ObfuscatedName("client.au")
    public static int field369 = 0;

    @ObfuscatedName("client.aj")
    public static int field272 = 0;

    @ObfuscatedName("client.bd")
    public static int field303 = 0;

    @ObfuscatedName("client.bl")
    public static int field276 = 0;

    @ObfuscatedName("client.bz")
    public static int field277 = 0;

    @ObfuscatedName("client.bx")
    public static int field278 = 0;

    @ObfuscatedName("client.bk")
    public static int field391 = 0;

    @ObfuscatedName("client.bb")
    public static class30[] field280 = new class30[32768];

    @ObfuscatedName("client.bw")
    public static int field281 = 0;

    @ObfuscatedName("client.bq")
    public static int[] field282 = new int[32768];

    @ObfuscatedName("client.cp")
    public static class110 field284 = new class110(5000);

    @ObfuscatedName("client.cr")
    public static class110 field285 = new class110(5000);

    @ObfuscatedName("client.cv")
    public static class110 field403 = new class110(5000);

    @ObfuscatedName("client.cq")
    public static int field371 = 0;

    @ObfuscatedName("client.co")
    public static int field376 = 0;

    @ObfuscatedName("client.cn")
    public static int field289 = 0;

    @ObfuscatedName("client.cz")
    public static int field290 = 0;

    @ObfuscatedName("client.cl")
    public static int field291 = 0;

    @ObfuscatedName("client.ci")
    public static int field292 = 0;

    @ObfuscatedName("client.cm")
    public static int field393 = 0;

    @ObfuscatedName("client.cs")
    public static int field294 = 0;

    @ObfuscatedName("client.ca")
    public static boolean field295 = false;

    @ObfuscatedName("client.ce")
    public static int field489 = 0;

    @ObfuscatedName("client.cu")
    public static int field471 = 0;

    @ObfuscatedName("client.dd")
    public static int field298 = 1;

    @ObfuscatedName("client.dn")
    public static int field299 = 0;

    @ObfuscatedName("client.db")
    public static int field300 = 1;

    @ObfuscatedName("client.dj")
    public static int field301 = 0;

    @ObfuscatedName("client.du")
    public static boolean field305 = false;

    @ObfuscatedName("client.dv")
    public static int[][][] field306 = new int[4][13][13];

    @ObfuscatedName("client.di")
    public static final int[] field491 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dp")
    public static int field455 = 0;

    @ObfuscatedName("client.dx")
    public static int field309 = 2;

    @ObfuscatedName("client.dy")
    public static int field310 = 0;

    @ObfuscatedName("client.dw")
    public static int field311 = 2;

    @ObfuscatedName("client.ds")
    public static int field312 = 0;

    @ObfuscatedName("client.dz")
    public static int field459 = 1;

    @ObfuscatedName("client.dq")
    public static int field380 = 0;

    @ObfuscatedName("client.dg")
    public static int field315 = 0;

    @ObfuscatedName("client.dl")
    public static int field364 = 2;

    @ObfuscatedName("client.df")
    public static int field317 = 0;

    @ObfuscatedName("client.eh")
    public static int field488 = 1;

    @ObfuscatedName("client.em")
    public static int field319 = 0;

    @ObfuscatedName("client.ea")
    public static int field456 = 0;

    @ObfuscatedName("client.ew")
    public static int field322 = 2301979;

    @ObfuscatedName("client.eq")
    public static int field323 = 5063219;

    @ObfuscatedName("client.ei")
    public static int field337 = 3353893;

    @ObfuscatedName("client.ex")
    public static int field325 = 7759444;

    @ObfuscatedName("client.ez")
    public static boolean field327 = false;

    @ObfuscatedName("client.fd")
    public static int field450 = 0;

    @ObfuscatedName("client.fi")
    public static int field328 = 128;

    @ObfuscatedName("client.fq")
    public static int field254 = 0;

    @ObfuscatedName("client.fw")
    public static int field370 = 0;

    @ObfuscatedName("client.fj")
    public static int field331 = 0;

    @ObfuscatedName("client.fp")
    public static int field397 = 0;

    @ObfuscatedName("client.fm")
    public static int field333 = 0;

    @ObfuscatedName("client.fy")
    public static int field505 = 0;

    @ObfuscatedName("client.fn")
    public static boolean field260 = false;

    @ObfuscatedName("client.fg")
    public static int field336 = 0;

    @ObfuscatedName("client.ft")
    public static int field478 = 0;

    @ObfuscatedName("client.fh")
    public static int field338 = 50;

    @ObfuscatedName("client.fk")
    public static int[] field446 = new int[field338];

    @ObfuscatedName("client.fl")
    public static int[] field340 = new int[field338];

    @ObfuscatedName("client.fz")
    public static int[] field341 = new int[field338];

    @ObfuscatedName("client.fc")
    public static int[] field416 = new int[field338];

    @ObfuscatedName("client.fs")
    public static int[] field343 = new int[field338];

    @ObfuscatedName("client.fx")
    public static int[] field344 = new int[field338];

    @ObfuscatedName("client.fe")
    public static int[] field345 = new int[field338];

    @ObfuscatedName("client.gb")
    public static String[] field238 = new String[field338];

    @ObfuscatedName("client.ge")
    public static int[][] field347 = new int[104][104];

    @ObfuscatedName("client.gk")
    public static int field348 = 0;

    @ObfuscatedName("client.gm")
    public static int field349 = -1;

    @ObfuscatedName("client.gu")
    public static int field350 = -1;

    @ObfuscatedName("client.gj")
    public static int field351 = 0;

    @ObfuscatedName("client.gd")
    public static int field408 = 0;

    @ObfuscatedName("client.gc")
    public static int field353 = 0;

    @ObfuscatedName("client.gr")
    public static int field354 = 0;

    @ObfuscatedName("client.gv")
    public static int field355 = 0;

    @ObfuscatedName("client.gi")
    public static int field356 = 0;

    @ObfuscatedName("client.go")
    public static int field357 = 0;

    @ObfuscatedName("client.gf")
    public static int field358 = 0;

    @ObfuscatedName("client.gl")
    public static int field318 = 0;

    @ObfuscatedName("client.gx")
    public static int field287 = 0;

    @ObfuscatedName("client.gz")
    public static boolean field334 = false;

    @ObfuscatedName("client.gt")
    public static int field335 = 0;

    @ObfuscatedName("client.gp")
    public static int field363 = 0;

    @ObfuscatedName("client.ga")
    public static class3[] field268 = new class3[2048];

    @ObfuscatedName("client.gy")
    public static int field293 = 0;

    @ObfuscatedName("client.gq")
    public static int[] field366 = new int[2048];

    @ObfuscatedName("client.ha")
    public static int field367 = 0;

    @ObfuscatedName("client.hd")
    public static int[] field332 = new int[2048];

    @ObfuscatedName("client.hk")
    public static class107[] field320 = new class107[2048];

    @ObfuscatedName("client.hg")
    public static int field390 = -1;

    @ObfuscatedName("client.hl")
    public static int field271 = 0;

    @ObfuscatedName("client.hc")
    public static int field372 = 0;

    @ObfuscatedName("client.hs")
    public static int[] field492 = new int[1000];

    @ObfuscatedName("client.hv")
    public static final int[] field374 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hi")
    public static String[] field375 = new String[8];

    @ObfuscatedName("client.hh")
    public static boolean[] field472 = new boolean[8];

    @ObfuscatedName("client.hn")
    public static int[] field377 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ho")
    public static int field378 = -1;

    @ObfuscatedName("client.hm")
    public static class177[][][] field379 = new class177[4][104][104];

    @ObfuscatedName("client.hb")
    public static class177 field296 = new class177();

    @ObfuscatedName("client.hw")
    public static class177 field381 = new class177();

    @ObfuscatedName("client.hy")
    public static class177 field405 = new class177();

    @ObfuscatedName("client.ht")
    public static int[] field383 = new int[25];

    @ObfuscatedName("client.hp")
    public static int[] field382 = new int[25];

    @ObfuscatedName("client.hu")
    public static int[] field385 = new int[25];

    @ObfuscatedName("client.hj")
    public static int field373 = 0;

    @ObfuscatedName("client.hr")
    public static boolean field387 = false;

    @ObfuscatedName("client.ip")
    public static int field388 = 0;

    @ObfuscatedName("client.ii")
    public static int[] field389 = new int[500];

    @ObfuscatedName("client.iv")
    public static int[] field481 = new int[500];

    @ObfuscatedName("client.iy")
    public static int[] field326 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field392 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field425 = new String[500];

    @ObfuscatedName("client.iq")
    public static String[] field394 = new String[500];

    @ObfuscatedName("client.if")
    public static int field395 = -1;

    @ObfuscatedName("client.iw")
    public static int field396 = -1;

    @ObfuscatedName("client.ir")
    public static int field342 = 0;

    @ObfuscatedName("client.ih")
    public static int field398 = 50;

    @ObfuscatedName("client.ig")
    public static int field421 = 0;

    @ObfuscatedName("client.it")
    public static String field400 = null;

    @ObfuscatedName("client.ia")
    public static boolean field401 = false;

    @ObfuscatedName("client.in")
    public static int field402 = -1;

    @ObfuscatedName("client.ie")
    public static int field410 = -1;

    @ObfuscatedName("client.jw")
    public static String field404 = null;

    @ObfuscatedName("client.jp")
    public static String field330 = null;

    @ObfuscatedName("client.jr")
    public static int field406 = -1;

    @ObfuscatedName("client.jb")
    public static class174 field407 = new class174(8);

    @ObfuscatedName("client.jn")
    public static int field286 = 0;

    @ObfuscatedName("client.jx")
    public static int field409 = 0;

    @ObfuscatedName("client.jj")
    public static class152 field451 = null;

    @ObfuscatedName("client.jv")
    public static int field307 = 0;

    @ObfuscatedName("client.jz")
    public static int field412 = 0;

    @ObfuscatedName("client.jd")
    public static int field432 = 0;

    @ObfuscatedName("client.jm")
    public static int field414 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field415 = false;

    @ObfuscatedName("client.ju")
    public static boolean field339 = false;

    @ObfuscatedName("client.jt")
    public static boolean field417 = false;

    @ObfuscatedName("client.jg")
    public static class152 field418 = null;

    @ObfuscatedName("client.js")
    public static class152 field442 = null;

    @ObfuscatedName("client.jo")
    public static int field420 = 0;

    @ObfuscatedName("client.jf")
    public static int field424 = 0;

    @ObfuscatedName("client.ji")
    public static class152 field422 = null;

    @ObfuscatedName("client.ja")
    public static boolean field261 = false;

    @ObfuscatedName("client.je")
    public static int field365 = -1;

    @ObfuscatedName("client.jl")
    public static int field263 = -1;

    @ObfuscatedName("client.jk")
    public static boolean field426 = false;

    @ObfuscatedName("client.jc")
    public static int field427 = -1;

    @ObfuscatedName("client.jy")
    public static int field428 = -1;

    @ObfuscatedName("client.kv")
    public static boolean field429 = false;

    @ObfuscatedName("client.kr")
    public static int field430 = 1;

    @ObfuscatedName("client.ks")
    public static int[] field431 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field297 = 0;

    @ObfuscatedName("client.km")
    public static int[] field433 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field359 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field435 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field436 = 0;

    @ObfuscatedName("client.ky")
    public static int field437 = 0;

    @ObfuscatedName("client.kl")
    public static int field438 = 0;

    @ObfuscatedName("client.kd")
    public static int field439 = 0;

    @ObfuscatedName("client.kg")
    public static int field440 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field441 = new int[2000];

    @ObfuscatedName("client.ku")
    public static String[] field469 = new String[1000];

    @ObfuscatedName("client.kp")
    public static int field443 = 0;

    @ObfuscatedName("client.kk")
    public static class177 field308 = new class177();

    @ObfuscatedName("client.kj")
    public static class177 field445 = new class177();

    @ObfuscatedName("client.kb")
    public static class177 field444 = new class177();

    @ObfuscatedName("client.kt")
    public static class174 field447 = new class174(512);

    @ObfuscatedName("client.ln")
    public static int field448 = 0;

    @ObfuscatedName("client.lq")
    public static int field449 = -2;

    @ObfuscatedName("client.la")
    public static boolean[] field454 = new boolean[100];

    @ObfuscatedName("client.lx")
    public static boolean[] field314 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static boolean[] field452 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static int[] field316 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field362 = new int[100];

    @ObfuscatedName("client.lc")
    public static int[] field399 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field423 = new int[100];

    @ObfuscatedName("client.ld")
    public static int field457 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field458 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lw")
    public static int field361 = 0;

    @ObfuscatedName("client.le")
    public static int field461 = 0;

    @ObfuscatedName("client.lo")
    public static long[] field462 = new long[100];

    @ObfuscatedName("client.lp")
    public static int field463 = 0;

    @ObfuscatedName("client.ll")
    public static int field464 = 0;

    @ObfuscatedName("client.lf")
    public static int[] field465 = new int[128];

    @ObfuscatedName("client.ly")
    public static int[] field346 = new int[128];

    @ObfuscatedName("client.lj")
    public static long field476 = -1L;

    @ObfuscatedName("client.li")
    public static String field468 = null;

    @ObfuscatedName("client.lm")
    public static String field275 = null;

    @ObfuscatedName("client.mh")
    public static int field470 = -1;

    @ObfuscatedName("client.mt")
    public static int field411 = 0;

    @ObfuscatedName("client.ma")
    public static int[] field288 = new int[1000];

    @ObfuscatedName("client.mp")
    public static int[] field473 = new int[1000];

    @ObfuscatedName("client.mo")
    public static class72[] field474 = new class72[1000];

    @ObfuscatedName("client.ml")
    public static int field475 = 0;

    @ObfuscatedName("client.ms")
    public static int field503 = 0;

    @ObfuscatedName("client.mq")
    public static int field477 = 0;

    @ObfuscatedName("client.mk")
    public static int field419 = 255;

    @ObfuscatedName("client.me")
    public static int field479 = -1;

    @ObfuscatedName("client.mf")
    public static boolean field480 = false;

    @ObfuscatedName("client.mu")
    public static int field304 = 127;

    @ObfuscatedName("client.mr")
    public static int field482 = 127;

    @ObfuscatedName("client.nc")
    public static int field483 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field484 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field485 = new int[50];

    @ObfuscatedName("client.nf")
    public static int[] field486 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field487 = new int[50];

    @ObfuscatedName("client.nh")
    public static class52[] field493 = new class52[50];

    @ObfuscatedName("client.nl")
    public static boolean field279 = false;

    @ObfuscatedName("client.ny")
    public static boolean[] field490 = new boolean[5];

    @ObfuscatedName("client.nt")
    public static int[] field329 = new int[5];

    @ObfuscatedName("client.no")
    public static int[] field453 = new int[5];

    @ObfuscatedName("client.nq")
    public static int[] field494 = new int[5];

    @ObfuscatedName("client.nx")
    public static int[] field386 = new int[5];

    @ObfuscatedName("client.nm")
    public static int field495 = 0;

    @ObfuscatedName("client.os")
    public static int field352 = 0;

    @ObfuscatedName("client.ok")
    public static class16[] field497 = new class16[400];

    @ObfuscatedName("client.og")
    public static class173 field498 = new class173();

    @ObfuscatedName("client.oq")
    public static int field499 = 0;

    @ObfuscatedName("client.ox")
    public static class8[] field500 = new class8[400];

    @ObfuscatedName("client.oy")
    public static class157 field501 = new class157();

    @ObfuscatedName("client.op")
    public static int field502 = -1;

    @ObfuscatedName("client.of")
    public static int field283 = -1;

    @ObfuscatedName("client.s(B)V")
    public final void method180() {
    }

    public final void init() {
        if (!this.method2616()) {
            return;
        }
        class168[] var1 = class168.method3159();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class168 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2810);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2810)) {
                    case 1:
                        int var5 = Integer.parseInt(var4);
                        class138[] var6 = new class138[] { class138.field2096, class138.field2097, class138.field2098, class138.field2099 };
                        class138[] var7 = var6;
                        int var8 = 0;
                        class138 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class138 var9 = var7[var8];
                            if (var9.field2101 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field243 = var10;
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class2.field23)) {
                            field245 = true;
                        } else {
                            field245 = false;
                        }
                        break;
                    case 3:
                        field242 = Integer.parseInt(var4);
                        break;
                    case 4:
                        field247 = Integer.parseInt(var4);
                    case 5:
                    default:
                        break;
                    case 6:
                        field244 = Integer.parseInt(var4);
                        break;
                    case 7:
                        if (var4.equalsIgnoreCase(class2.field23)) {
                        }
                        break;
                    case 8:
                        field241 = Integer.parseInt(var4);
                        break;
                    case 9:
                        class139[] var11 = new class139[] { class139.field2112, class139.field2105, class139.field2113, class139.field2109, class139.field2106, class139.field2108 };
                        Statics.field1896 = (class139) class99.method801(var11, Integer.parseInt(var4));
                        if (Statics.field1896 == class139.field2112) {
                            Statics.field1904 = class190.field2883;
                        } else {
                            Statics.field1904 = class190.field2890;
                        }
                        break;
                    case 10:
                        Statics.field2922 = var4;
                }
            }
        }
        method464();
        Statics.field928 = this.getCodeBase().getHost();
        String var12 = Statics.field243.field2100;
        byte var13 = 0;
        try {
            class136.method2828("oldschool", var12, var13, 16);
        } catch (Exception var15) {
            Statics.method96((String) null, var15);
        }
        Statics.field239 = this;
        this.method2606(765, 503, 58);
    }

    @ObfuscatedName("y.e(I)V")
    public static final void method464() {
        class79.field1375 = false;
        field246 = false;
    }

    @ObfuscatedName("client.d(I)V")
    public final void method270() {
        Statics.field1567 = field244 == 0 ? 43594 : field241 + 40000;
        Statics.field2102 = field244 == 0 ? 443 : field241 + 50000;
        Statics.field623 = Statics.field1567;
        Statics.field779 = class153.field2646;
        Statics.field2477 = class153.field2648;
        Statics.field24 = class153.field2647;
        Statics.field79 = class153.field2645;
        class124.method2403();
        class124.method787(Statics.field510);
        class127.method237(Statics.field510);
        Statics.field1414 = class118.method33();
        if (Statics.field1414 != null) {
            Statics.field1414.method2412(Statics.field510);
        }
        Statics.field610 = new class121(255, class136.field2086, class136.field2082, 500000);
        class195 var1 = null;
        class9 var2 = new class9();
        try {
            var1 = class136.method484("", Statics.field1896.field2111, false);
            byte[] var3 = new byte[(int) var1.method3436()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method3451(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class9(new class107(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method3435();
            }
        } catch (Exception var9) {
        }
        Statics.field1815 = var2;
        Statics.field1920 = this.getToolkit().getSystemClipboard();
        class125.method28(this, Statics.field941);
        if (field244 != 0) {
            field256 = true;
        }
    }

    @ObfuscatedName("client.n(B)V")
    public final void method184() {
        field250++;
        this.method281();
        class149.method745();
        try {
            if (class161.field2708 == 1) {
                int var1 = Statics.field2714.method3035();
                if (var1 > 0 && Statics.field2714.method3039()) {
                    int var2 = var1 - Statics.field2704;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2714.method3069(var2);
                } else {
                    Statics.field2714.method3038();
                    Statics.field2714.method3058();
                    if (Statics.field2716 == null) {
                        class161.field2708 = 0;
                    } else {
                        class161.field2708 = 2;
                    }
                    Statics.field1241 = null;
                    Statics.field2651 = null;
                }
            }
        } catch (Exception var515) {
            var515.printStackTrace();
            Statics.field2714.method3038();
            class161.field2708 = 0;
            Statics.field1241 = null;
            Statics.field2651 = null;
            Statics.field2716 = null;
        }
        method749();
        class124.method3();
        class127 var4 = class127.field1998;
        synchronized (class127.field1998) {
            class127.field2005 = class127.field1994;
            class127.field1996 = class127.field1995;
            class127.field1999 = class127.field1992 * 1302528007;
            class127.field2004 = class127.field2000;
            class127.field1993 = class127.field2001;
            class127.field2006 = class127.field2002;
            class127.field2007 = class127.field2003;
            class127.field2000 = 0;
        }
        if (Statics.field1414 != null) {
            int var6 = Statics.field1414.method2415();
            field443 = var6;
        }
        if (field248 == 0) {
            method548();
            Statics.field1807.method2436();
            for (int var7 = 0; var7 < 32; var7++) {
                field2055[var7] = 0L;
            }
            for (int var8 = 0; var8 < 32; var8++) {
                field2051[var8] = 0L;
            }
            Statics.field136 = 0;
        } else if (field248 == 5) {
            class28.method780(this);
            method548();
            Statics.field1807.method2436();
            for (int var9 = 0; var9 < 32; var9++) {
                field2055[var9] = 0L;
            }
            for (int var10 = 0; var10 < 32; var10++) {
                field2051[var10] = 0L;
            }
            Statics.field136 = 0;
        } else if (field248 == 10 || field248 == 11) {
            class28.method780(this);
        } else if (field248 == 20) {
            class28.method780(this);
            method620();
        } else if (field248 == 25) {
            method9();
        }
        if (field248 == 30) {
            if (field257 > 1) {
                field257--;
            }
            if (field291 > 0) {
                field291--;
            }
            if (field295) {
                field295 = false;
                if (field291 > 0) {
                    method130();
                } else {
                    method565(40);
                    Statics.field249 = Statics.field529;
                    Statics.field529 = null;
                }
            } else {
                if (!field387) {
                    field425[0] = class142.field2372;
                    field394[0] = "";
                    field326[0] = 1006;
                    field388 = 1;
                }
                for (int var11 = 0; var11 < 100; var11++) {
                    boolean var12;
                    if (Statics.field529 == null) {
                        var12 = false;
                    } else {
                        label3508: {
                            try {
                                int var13 = Statics.field529.method2582();
                                if (var13 == 0) {
                                    var12 = false;
                                    break label3508;
                                }
                                if (field376 == -1) {
                                    Statics.field529.method2586(field403.field1831, 0, 1);
                                    field403.field1830 = 0;
                                    field376 = field403.method2350();
                                    field371 = class166.field2807[field376];
                                    var13--;
                                }
                                if (field371 == -1) {
                                    if (var13 <= 0) {
                                        var12 = false;
                                        break label3508;
                                    }
                                    Statics.field529.method2586(field403.field1831, 0, 1);
                                    field371 = field403.field1831[0] & 0xFF;
                                    var13--;
                                }
                                if (field371 == -2) {
                                    if (var13 <= 1) {
                                        var12 = false;
                                        break label3508;
                                    }
                                    Statics.field529.method2586(field403.field1831, 0, 2);
                                    field403.field1830 = 0;
                                    field371 = field403.method2103();
                                    var13 -= 2;
                                }
                                if (var13 < field371) {
                                    var12 = false;
                                    break label3508;
                                }
                                field403.field1830 = 0;
                                Statics.field529.method2586(field403.field1831, 0, field371);
                                field289 = 0;
                                field294 = field393;
                                field393 = field292;
                                field292 = field376;
                                if (field376 == 253) {
                                    while (field403.field1830 < field371) {
                                        int var14 = field403.method2101();
                                        boolean var15 = (var14 & 0x1) == 1;
                                        String var16 = field403.method2109();
                                        String var17 = field403.method2109();
                                        field403.method2109();
                                        for (int var18 = 0; var18 < field499; var18++) {
                                            class8 var19 = field500[var18];
                                            if (var15) {
                                                if (var17.equals(var19.field128)) {
                                                    var19.field128 = var16;
                                                    var19.field124 = var17;
                                                    var16 = null;
                                                    break;
                                                }
                                            } else if (var16.equals(var19.field128)) {
                                                var19.field128 = var16;
                                                var19.field124 = var17;
                                                var16 = null;
                                                break;
                                            }
                                        }
                                        if (var16 != null && field499 < 400) {
                                            class8 var20 = new class8();
                                            field500[field499] = var20;
                                            var20.field128 = var16;
                                            var20.field124 = var17;
                                            field499++;
                                        }
                                    }
                                    field438 = field430;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 207) {
                                    int var21 = field403.method2103();
                                    int var22 = field403.method2206();
                                    class152 var23 = class152.method868(var22);
                                    if (var23 != null && var23.field2528 == 0) {
                                        if (var21 > var23.field2542 - var23.field2533) {
                                            var21 = var23.field2542 - var23.field2533;
                                        }
                                        if (var21 < 0) {
                                            var21 = 0;
                                        }
                                        if (var23.field2540 != var21) {
                                            var23.field2540 = var21;
                                            Statics.method122(var23);
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 114) {
                                    int var24 = field403.method2103();
                                    int var25 = field403.method2101();
                                    int var26 = field403.method2103();
                                    if (field304 != 0 && var25 != 0 && field483 < 50) {
                                        field484[field483] = var24;
                                        field485[field483] = var25;
                                        field486[field483] = var26;
                                        field493[field483] = null;
                                        field487[field483] = 0;
                                        field483++;
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 238) {
                                    int var30 = field403.method2101();
                                    class117[] var31 = new class117[] { class117.field1902, class117.field1894, class117.field1893 };
                                    class117[] var32 = var31;
                                    int var33 = 0;
                                    class117 var35;
                                    while (true) {
                                        if (var33 >= var32.length) {
                                            var35 = null;
                                            break;
                                        }
                                        class117 var34 = var32[var33];
                                        if (var34.field1895 == var30) {
                                            var35 = var34;
                                            break;
                                        }
                                        var33++;
                                    }
                                    Statics.field1796 = var35;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 148) {
                                    int var36 = field403.method2114();
                                    boolean var37 = field403.method2101() == 1;
                                    String var38 = "";
                                    boolean var39 = false;
                                    if (var37) {
                                        var38 = field403.method2109();
                                        if (method2691(var38)) {
                                            var39 = true;
                                        }
                                    }
                                    String var40 = field403.method2109();
                                    if (!var39) {
                                        class10.method551(var36, var38, var40);
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 181) {
                                    int var41 = field403.method2106();
                                    class4 var42 = (class4) field407.method3204((long) var41);
                                    if (var42 != null) {
                                        method129(var42, true);
                                    }
                                    if (field451 != null) {
                                        Statics.method122(field451);
                                        field451 = null;
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 191) {
                                    int var43 = field403.method2136();
                                    if (var43 == 65535) {
                                        var43 = -1;
                                    }
                                    int var44 = field403.method2106();
                                    int var45 = field403.method2106();
                                    int var46 = field403.method2134();
                                    if (var46 == 65535) {
                                        var46 = -1;
                                    }
                                    for (int var47 = var46; var47 <= var43; var47++) {
                                        long var48 = ((long) var44 << 32) + (long) var47;
                                        class186 var50 = field447.method3204(var48);
                                        if (var50 != null) {
                                            var50.method3316();
                                        }
                                        field447.method3212(new class179(var45), var48);
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 87) {
                                    String var51 = field403.method2109();
                                    long var52 = (long) field403.method2103();
                                    long var54 = (long) field403.method2304();
                                    int var56 = field403.method2101();
                                    long var57 = (var52 << 32) + var54;
                                    boolean var59 = false;
                                    for (int var60 = 0; var60 < 100; var60++) {
                                        if (field462[var60] == var57) {
                                            var59 = true;
                                            break;
                                        }
                                    }
                                    if (method2691(var51)) {
                                        var59 = true;
                                    }
                                    if (!var59 && field363 == 0) {
                                        field462[field463] = var57;
                                        field463 = (field463 + 1) % 100;
                                        class110 var61 = field403;
                                        String var62 = class191.method670(var61, 32767);
                                        String var63 = class192.method3388(class199.method501(var62));
                                        if (var56 == 2 || var56 == 3) {
                                            class10.method551(7, class2.method36(1) + var51, var63);
                                        } else if (var56 == 1) {
                                            class10.method551(7, class2.method36(0) + var51, var63);
                                        } else {
                                            class10.method551(3, var51, var63);
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 67) {
                                    field477 = field403.method2101();
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 161) {
                                    if (field406 != -1) {
                                        int var64 = field406;
                                        if (class152.method1930(var64)) {
                                            method165(Statics.field2595[var64], 0);
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 44) {
                                    String var65 = field403.method2109();
                                    int var66 = field403.method2106();
                                    class152 var67 = class152.method868(var66);
                                    if (!var65.equals(var67.field2573)) {
                                        var67.field2573 = var65;
                                        Statics.method122(var67);
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 208) {
                                    field279 = true;
                                    Statics.field2469 = field403.method2101();
                                    Statics.field1043 = field403.method2101();
                                    Statics.field1260 = field403.method2103();
                                    Statics.field1072 = field403.method2101();
                                    Statics.field78 = field403.method2101();
                                    if (Statics.field78 >= 100) {
                                        int var68 = Statics.field2469 * 128 + 64;
                                        int var69 = Statics.field1043 * 128 + 64;
                                        int var70 = method487(var68, var69, Statics.field588) - Statics.field1260;
                                        int var71 = var68 - Statics.field201;
                                        int var72 = var70 - Statics.field1940;
                                        int var73 = var69 - Statics.field157;
                                        int var74 = (int) Math.sqrt((double) (var71 * var71 + var73 * var73));
                                        Statics.field1255 = (int) (Math.atan2((double) var72, (double) var74) * 325.949D) & 0x7FF;
                                        Statics.field53 = (int) (Math.atan2((double) var71, (double) var73) * -325.949D) & 0x7FF;
                                        if (Statics.field1255 < 128) {
                                            Statics.field1255 = 128;
                                        }
                                        if (Statics.field1255 > 383) {
                                            Statics.field1255 = 383;
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 147) {
                                    method3484(false);
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 2) {
                                    field372 = 0;
                                    field367 = 0;
                                    field403.method2347();
                                    int var75 = field403.method2357(1);
                                    if (var75 != 0) {
                                        int var76 = field403.method2357(2);
                                        if (var76 == 0) {
                                            field332[++field367 - 1] = 2047;
                                        } else if (var76 == 1) {
                                            int var77 = field403.method2357(3);
                                            Statics.field1452.method567(var77, false);
                                            int var78 = field403.method2357(1);
                                            if (var78 == 1) {
                                                field332[++field367 - 1] = 2047;
                                            }
                                        } else if (var76 == 2) {
                                            int var79 = field403.method2357(3);
                                            Statics.field1452.method567(var79, true);
                                            int var80 = field403.method2357(3);
                                            Statics.field1452.method567(var80, true);
                                            int var81 = field403.method2357(1);
                                            if (var81 == 1) {
                                                field332[++field367 - 1] = 2047;
                                            }
                                        } else if (var76 == 3) {
                                            int var82 = field403.method2357(1);
                                            int var83 = field403.method2357(1);
                                            if (var83 == 1) {
                                                field332[++field367 - 1] = 2047;
                                            }
                                            int var84 = field403.method2357(7);
                                            int var85 = field403.method2357(7);
                                            Statics.field588 = field403.method2357(2);
                                            Statics.field1452.method566(var85, var84, var82 == 1);
                                        }
                                    }
                                    int var86 = field403.method2357(8);
                                    if (var86 < field293) {
                                        for (int var87 = var86; var87 < field293; var87++) {
                                            field492[++field372 - 1] = field366[var87];
                                        }
                                    }
                                    if (var86 > field293) {
                                        throw new RuntimeException("");
                                    }
                                    field293 = 0;
                                    for (int var88 = 0; var88 < var86; var88++) {
                                        int var89 = field366[var88];
                                        class3 var90 = field268[var89];
                                        int var91 = field403.method2357(1);
                                        if (var91 == 0) {
                                            field366[++field293 - 1] = var89;
                                            var90.field761 = field250;
                                        } else {
                                            int var92 = field403.method2357(2);
                                            if (var92 == 0) {
                                                field366[++field293 - 1] = var89;
                                                var90.field761 = field250;
                                                field332[++field367 - 1] = var89;
                                            } else if (var92 == 1) {
                                                field366[++field293 - 1] = var89;
                                                var90.field761 = field250;
                                                int var93 = field403.method2357(3);
                                                var90.method567(var93, false);
                                                int var94 = field403.method2357(1);
                                                if (var94 == 1) {
                                                    field332[++field367 - 1] = var89;
                                                }
                                            } else if (var92 == 2) {
                                                field366[++field293 - 1] = var89;
                                                var90.field761 = field250;
                                                int var95 = field403.method2357(3);
                                                var90.method567(var95, true);
                                                int var96 = field403.method2357(3);
                                                var90.method567(var96, true);
                                                int var97 = field403.method2357(1);
                                                if (var97 == 1) {
                                                    field332[++field367 - 1] = var89;
                                                }
                                            } else if (var92 == 3) {
                                                field492[++field372 - 1] = var89;
                                            }
                                        }
                                    }
                                    method51();
                                    for (int var98 = 0; var98 < field367; var98++) {
                                        int var99 = field332[var98];
                                        class3 var100 = field268[var99];
                                        int var101 = field403.method2101();
                                        if ((var101 & 0x40) != 0) {
                                            var101 += field403.method2101() << 8;
                                        }
                                        if ((var101 & 0x100) != 0) {
                                            int var102 = field403.method2134();
                                            int var103 = field403.method2126();
                                            var100.method569(var102, var103, field250);
                                            var100.field735 = field250 + 300;
                                            var100.field736 = field403.method2297();
                                            var100.field734 = field403.method2126();
                                        }
                                        if ((var101 & 0x8) != 0) {
                                            int var104 = field403.method2135();
                                            if (var104 == 65535) {
                                                var104 = -1;
                                            }
                                            int var105 = field403.method2126();
                                            method171(var100, var104, var105);
                                        }
                                        if ((var101 & 0x10) != 0) {
                                            var100.field738 = field403.method2134();
                                            if (var100.field738 == 65535) {
                                                var100.field738 = -1;
                                            }
                                        }
                                        if ((var101 & 0x1) != 0) {
                                            var100.field730 = field403.method2103();
                                            var100.field740 = field403.method2135();
                                        }
                                        if ((var101 & 0x2) != 0) {
                                            int var106 = field403.method2134();
                                            int var107 = field403.method2101();
                                            var100.method569(var106, var107, field250);
                                            var100.field735 = field250 + 300;
                                            var100.field736 = field403.method2127();
                                            var100.field734 = field403.method2297();
                                        }
                                        if ((var101 & 0x200) != 0) {
                                            var100.field757 = field403.method2101();
                                            var100.field756 = field403.method2101();
                                            var100.field755 = field403.method2126();
                                            var100.field731 = field403.method2297();
                                            var100.field758 = field403.method2136() + field250;
                                            var100.field759 = field403.method2136() + field250;
                                            var100.field760 = field403.method2127();
                                            var100.field766 = 1;
                                            var100.field714 = 0;
                                        }
                                        if ((var101 & 0x20) != 0) {
                                            int var108 = field403.method2134();
                                            int var109 = field403.method2101();
                                            boolean var110 = field403.method2101() == 1;
                                            int var111 = field403.method2127();
                                            int var112 = field403.field1830;
                                            if (var100.field50 != null && var100.field34 != null) {
                                                boolean var113 = false;
                                                if (var109 <= 1 && method2691(var100.field50)) {
                                                    var113 = true;
                                                }
                                                if (!var113 && field363 == 0 && !var100.field52) {
                                                    field266.field1830 = 0;
                                                    field403.method2148(field266.field1831, 0, var111);
                                                    field266.field1830 = 0;
                                                    class107 var114 = field266;
                                                    String var115 = class191.method670(var114, 32767);
                                                    String var116 = class192.method3388(class199.method501(var115));
                                                    var100.field727 = var116.trim();
                                                    var100.field728 = var108 >> 8;
                                                    var100.field751 = var108 & 0xFF;
                                                    var100.field729 = 150;
                                                    var100.field744 = var110;
                                                    if (var109 == 2 || var109 == 3) {
                                                        class10.method551(var110 ? 91 : 1, class2.method36(1) + var100.field50, var116);
                                                    } else if (var109 == 1) {
                                                        class10.method551(var110 ? 91 : 1, class2.method36(0) + var100.field50, var116);
                                                    } else {
                                                        class10.method551(var110 ? 90 : 2, var100.field50, var116);
                                                    }
                                                }
                                            }
                                            field403.field1830 = var111 + var112;
                                        }
                                        if ((var101 & 0x80) != 0) {
                                            int var117 = field403.method2101();
                                            byte[] var118 = new byte[var117];
                                            class107 var119 = new class107(var118);
                                            field403.method2149(var118, 0, var117);
                                            field320[var99] = var119;
                                            var100.method16(var119);
                                        }
                                        if ((var101 & 0x4) != 0) {
                                            var100.field727 = field403.method2109();
                                            if (var100.field727.charAt(0) == '~') {
                                                var100.field727 = var100.field727.substring(1);
                                                class10.method551(2, var100.field50, var100.field727);
                                            } else if (Statics.field1452 == var100) {
                                                class10.method551(2, var100.field50, var100.field727);
                                            }
                                            var100.field744 = false;
                                            var100.field728 = 0;
                                            var100.field751 = 0;
                                            var100.field729 = 150;
                                        }
                                        if ((var101 & 0x400) != 0) {
                                            var100.field749 = field403.method2135();
                                            int var120 = field403.method2206();
                                            var100.field737 = var120 >> 16;
                                            var100.field752 = (var120 & 0xFFFF) + field250;
                                            var100.field750 = 0;
                                            var100.field747 = 0;
                                            if (var100.field752 > field250) {
                                                var100.field750 = -1;
                                            }
                                            if (var100.field749 == 65535) {
                                                var100.field749 = -1;
                                            }
                                        }
                                    }
                                    for (int var121 = 0; var121 < field372; var121++) {
                                        int var122 = field492[var121];
                                        if (field250 != field268[var122].field761) {
                                            field268[var122] = null;
                                        }
                                    }
                                    if (field371 != field403.field1830) {
                                        throw new RuntimeException(field403.field1830 + class2.field20 + field371);
                                    }
                                    for (int var123 = 0; var123 < field293; var123++) {
                                        if (field268[field366[var123]] == null) {
                                            throw new RuntimeException(var123 + class2.field20 + field293);
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 154) {
                                    field372 = 0;
                                    field367 = 0;
                                    field403.method2347();
                                    int var124 = field403.method2357(8);
                                    if (var124 < field281) {
                                        for (int var125 = var124; var125 < field281; var125++) {
                                            field492[++field372 - 1] = field282[var125];
                                        }
                                    }
                                    if (var124 > field281) {
                                        throw new RuntimeException("");
                                    }
                                    field281 = 0;
                                    for (int var126 = 0; var126 < var124; var126++) {
                                        int var127 = field282[var126];
                                        class30 var128 = field280[var127];
                                        int var129 = field403.method2357(1);
                                        if (var129 == 0) {
                                            field282[++field281 - 1] = var127;
                                            var128.field761 = field250;
                                        } else {
                                            int var130 = field403.method2357(2);
                                            if (var130 == 0) {
                                                field282[++field281 - 1] = var127;
                                                var128.field761 = field250;
                                                field332[++field367 - 1] = var127;
                                            } else if (var130 == 1) {
                                                field282[++field281 - 1] = var127;
                                                var128.field761 = field250;
                                                int var131 = field403.method2357(3);
                                                var128.method567(var131, false);
                                                int var132 = field403.method2357(1);
                                                if (var132 == 1) {
                                                    field332[++field367 - 1] = var127;
                                                }
                                            } else if (var130 == 2) {
                                                field282[++field281 - 1] = var127;
                                                var128.field761 = field250;
                                                int var133 = field403.method2357(3);
                                                var128.method567(var133, true);
                                                int var134 = field403.method2357(3);
                                                var128.method567(var134, true);
                                                int var135 = field403.method2357(1);
                                                if (var135 == 1) {
                                                    field332[++field367 - 1] = var127;
                                                }
                                            } else if (var130 == 3) {
                                                field492[++field372 - 1] = var127;
                                            }
                                        }
                                    }
                                    method462();
                                    for (int var136 = 0; var136 < field367; var136++) {
                                        int var137 = field332[var136];
                                        class30 var138 = field280[var137];
                                        int var139 = field403.method2101();
                                        if ((var139 & 0x20) != 0) {
                                            var138.field738 = field403.method2103();
                                            if (var138.field738 == 65535) {
                                                var138.field738 = -1;
                                            }
                                        }
                                        if ((var139 & 0x8) != 0) {
                                            int var140 = field403.method2297();
                                            int var141 = field403.method2127();
                                            var138.method569(var140, var141, field250);
                                            var138.field735 = field250 + 300;
                                            var138.field736 = field403.method2134();
                                            var138.field734 = field403.method2103();
                                        }
                                        if ((var139 & 0x80) != 0) {
                                            var138.field727 = field403.method2109();
                                            var138.field729 = 100;
                                        }
                                        if ((var139 & 0x40) != 0) {
                                            int var142 = field403.method2297();
                                            int var143 = field403.method2297();
                                            var138.method569(var142, var143, field250);
                                            var138.field735 = field250 + 300;
                                            var138.field736 = field403.method2135();
                                            var138.field734 = field403.method2136();
                                        }
                                        if ((var139 & 0x1) != 0) {
                                            var138.field749 = field403.method2136();
                                            int var144 = field403.method2145();
                                            var138.field737 = var144 >> 16;
                                            var138.field752 = (var144 & 0xFFFF) + field250;
                                            var138.field750 = 0;
                                            var138.field747 = 0;
                                            if (var138.field752 > field250) {
                                                var138.field750 = -1;
                                            }
                                            if (var138.field749 == 65535) {
                                                var138.field749 = -1;
                                            }
                                        }
                                        if ((var139 & 0x10) != 0) {
                                            int var145 = field403.method2134();
                                            if (var145 == 65535) {
                                                var145 = -1;
                                            }
                                            int var146 = field403.method2101();
                                            if (var138.field767 == var145 && var145 != -1) {
                                                int var147 = Statics.method448(var145).field889;
                                                if (var147 == 1) {
                                                    var138.field745 = 0;
                                                    var138.field746 = 0;
                                                    var138.field762 = var146;
                                                    var138.field739 = 0;
                                                }
                                                if (var147 == 2) {
                                                    var138.field739 = 0;
                                                }
                                            } else if (var145 == -1 || var138.field767 == -1 || Statics.method448(var145).field901 >= Statics.method448(var138.field767).field901) {
                                                var138.field767 = var145;
                                                var138.field745 = 0;
                                                var138.field746 = 0;
                                                var138.field762 = var146;
                                                var138.field739 = 0;
                                                var138.field714 = var138.field766;
                                            }
                                        }
                                        if ((var139 & 0x2) != 0) {
                                            var138.field730 = field403.method2103();
                                            var138.field740 = field403.method2103();
                                        }
                                        if ((var139 & 0x4) != 0) {
                                            var138.field680 = class35.method121(field403.method2135());
                                            var138.field718 = var138.field680.field789;
                                            var138.field765 = var138.field680.field811;
                                            var138.field722 = var138.field680.field802;
                                            var138.field723 = var138.field680.field795;
                                            var138.field753 = var138.field680.field786;
                                            var138.field725 = var138.field680.field797;
                                            var138.field719 = var138.field680.field791;
                                            var138.field720 = var138.field680.field792;
                                            var138.field754 = var138.field680.field818;
                                        }
                                    }
                                    for (int var148 = 0; var148 < field372; var148++) {
                                        int var149 = field492[var148];
                                        if (field250 != field280[var149].field761) {
                                            field280[var149].field680 = null;
                                            field280[var149] = null;
                                        }
                                    }
                                    if (field371 != field403.field1830) {
                                        throw new RuntimeException(field403.field1830 + class2.field20 + field371);
                                    }
                                    for (int var150 = 0; var150 < field281; var150++) {
                                        if (field280[field282[var150]] == null) {
                                            throw new RuntimeException(var150 + class2.field20 + field281);
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 212) {
                                    class110 var151 = field403;
                                    int var152 = field371;
                                    class188 var153 = new class188();
                                    var153.field2872 = var151.method2101();
                                    var153.field2878 = var151.method2106();
                                    var153.field2870 = new int[var153.field2872];
                                    var153.field2873 = new int[var153.field2872];
                                    var153.field2874 = new Field[var153.field2872];
                                    var153.field2875 = new int[var153.field2872];
                                    var153.field2876 = new Method[var153.field2872];
                                    var153.field2877 = new byte[var153.field2872][][];
                                    for (int var154 = 0; var154 < var153.field2872; var154++) {
                                        try {
                                            int var155 = var151.method2101();
                                            if (var155 == 0 || var155 == 1 || var155 == 2) {
                                                String var156 = var151.method2109();
                                                String var157 = var151.method2109();
                                                int var158 = 0;
                                                if (var155 == 1) {
                                                    var158 = var151.method2106();
                                                }
                                                var153.field2870[var154] = var155;
                                                var153.field2875[var154] = var158;
                                                if (class189.method1577(var156).getClassLoader() == null) {
                                                    throw new SecurityException();
                                                }
                                                var153.field2874[var154] = class189.method1577(var156).getDeclaredField(var157);
                                            } else if (var155 == 3 || var155 == 4) {
                                                String var159 = var151.method2109();
                                                String var160 = var151.method2109();
                                                int var161 = var151.method2101();
                                                String[] var162 = new String[var161];
                                                for (int var163 = 0; var163 < var161; var163++) {
                                                    var162[var163] = var151.method2109();
                                                }
                                                String var164 = var151.method2109();
                                                byte[][] var165 = new byte[var161][];
                                                if (var155 == 3) {
                                                    for (int var166 = 0; var166 < var161; var166++) {
                                                        int var167 = var151.method2106();
                                                        var165[var166] = new byte[var167];
                                                        var151.method2112(var165[var166], 0, var167);
                                                    }
                                                }
                                                var153.field2870[var154] = var155;
                                                Class[] var168 = new Class[var161];
                                                for (int var169 = 0; var169 < var161; var169++) {
                                                    var168[var169] = class189.method1577(var162[var169]);
                                                }
                                                Class var170 = class189.method1577(var164);
                                                if (class189.method1577(var159).getClassLoader() == null) {
                                                    throw new SecurityException();
                                                }
                                                Method[] var171 = class189.method1577(var159).getDeclaredMethods();
                                                Method[] var172 = var171;
                                                for (int var173 = 0; var173 < var172.length; var173++) {
                                                    Method var174 = var172[var173];
                                                    if (var174.getName().equals(var160)) {
                                                        Class[] var175 = var174.getParameterTypes();
                                                        if (var168.length == var175.length) {
                                                            boolean var176 = true;
                                                            for (int var177 = 0; var177 < var168.length; var177++) {
                                                                if (var168[var177] != var175[var177]) {
                                                                    var176 = false;
                                                                    break;
                                                                }
                                                            }
                                                            if (var176 && var170 == var174.getReturnType()) {
                                                                var153.field2876[var154] = var174;
                                                            }
                                                        }
                                                    }
                                                }
                                                var153.field2877[var154] = var165;
                                            }
                                        } catch (ClassNotFoundException var508) {
                                            var153.field2873[var154] = -1;
                                        } catch (SecurityException var509) {
                                            var153.field2873[var154] = -2;
                                        } catch (NullPointerException var510) {
                                            var153.field2873[var154] = -3;
                                        } catch (Exception var511) {
                                            var153.field2873[var154] = -4;
                                        } catch (Throwable var512) {
                                            var153.field2873[var154] = -5;
                                        }
                                    }
                                    class189.field2879.method3279(var153);
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 52) {
                                    int var183 = field371 + field403.field1830;
                                    int var184 = field403.method2103();
                                    int var185 = field403.method2103();
                                    if (field406 != var184) {
                                        field406 = var184;
                                        Statics.method177(field406);
                                        class32.method541(field406);
                                        for (int var186 = 0; var186 < 100; var186++) {
                                            field454[var186] = true;
                                        }
                                    }
                                    while (var185-- > 0) {
                                        int var187 = field403.method2106();
                                        int var188 = field403.method2103();
                                        int var189 = field403.method2101();
                                        class4 var190 = (class4) field407.method3204((long) var187);
                                        if (var190 != null && var190.field63 != var188) {
                                            method129(var190, true);
                                            var190 = null;
                                        }
                                        if (var190 == null) {
                                            var190 = method1749(var187, var188, var189);
                                        }
                                        var190.field57 = true;
                                    }
                                    for (class4 var191 = (class4) field407.method3202(); var191 != null; var191 = (class4) field407.method3203()) {
                                        if (var191.field57) {
                                            var191.field57 = false;
                                        } else {
                                            method129(var191, true);
                                        }
                                    }
                                    field447 = new class174(512);
                                    while (field403.field1830 < var183) {
                                        int var192 = field403.method2106();
                                        int var193 = field403.method2103();
                                        int var194 = field403.method2103();
                                        int var195 = field403.method2106();
                                        for (int var196 = var193; var196 <= var194; var196++) {
                                            long var197 = ((long) var192 << 32) + (long) var196;
                                            field447.method3212(new class179(var195), var197);
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 89) {
                                    int var199 = field403.method2134();
                                    if (var199 == 65535) {
                                        var199 = -1;
                                    }
                                    if (var199 == -1 && !field480) {
                                        class161.method2434();
                                    } else if (var199 != -1 && field479 != var199 && field419 != 0 && !field480) {
                                        class161.method562(2, Statics.field2401, var199, 0, field419, false);
                                    }
                                    field479 = var199;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 156) {
                                    int var200 = field403.method2141();
                                    int var201 = field403.method2103();
                                    if (var201 == 65535) {
                                        var201 = -1;
                                    }
                                    method2485(var201, var200);
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 29) {
                                    int var202 = field403.method2145();
                                    boolean var203 = field403.method2101() == 1;
                                    class152 var204 = class152.method868(var202);
                                    if (var204.field2552 != var203) {
                                        var204.field2552 = var203;
                                        Statics.method122(var204);
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 199) {
                                    int var205 = field403.method2136();
                                    if (var205 == 65535) {
                                        var205 = -1;
                                    }
                                    int var206 = field403.method2206();
                                    int var207 = field403.method2305();
                                    class152 var208 = class152.method868(var207);
                                    if (var208.field2582) {
                                        var208.field2564 = var205;
                                        var208.field2631 = var206;
                                        class45 var210 = class45.method504(var205);
                                        var208.field2566 = var210.field1005;
                                        var208.field2567 = var210.field1041;
                                        var208.field2568 = var210.field1013;
                                        var208.field2603 = var210.field1014;
                                        var208.field2525 = var210.field1015;
                                        var208.field2524 = var210.field1010;
                                        if (var208.field2622 > 0) {
                                            var208.field2524 = var208.field2524 * 32 / var208.field2622;
                                        }
                                        Statics.method122(var208);
                                    } else {
                                        if (var205 == -1) {
                                            var208.field2558 = 0;
                                            field376 = -1;
                                            var12 = true;
                                            break label3508;
                                        }
                                        class45 var209 = class45.method504(var205);
                                        var208.field2558 = 4;
                                        var208.field2597 = var205;
                                        var208.field2566 = var209.field1005;
                                        var208.field2567 = var209.field1041;
                                        var208.field2524 = var209.field1010 * 100 / var206;
                                        Statics.method122(var208);
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 252) {
                                    int var211 = field403.method2103();
                                    int var212 = field403.method2206();
                                    int var213 = field403.method2136();
                                    class152 var214 = class152.method868(var212);
                                    var214.field2570 = (var213 << 16) + var211;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 184) {
                                    int var215 = field403.method2305();
                                    class152 var216 = class152.method868(var215);
                                    var216.field2558 = 3;
                                    var216.field2597 = Statics.field1452.field34.method2934();
                                    Statics.method122(var216);
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 159) {
                                    int var217 = field403.method2305();
                                    int var218 = field403.method2136();
                                    class152 var219 = class152.method868(var217);
                                    if (var219.field2558 != 1 || var219.field2597 != var218) {
                                        var219.field2558 = 1;
                                        var219.field2597 = var218;
                                        Statics.method122(var219);
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 192) {
                                    field352 = 1;
                                    field438 = field430;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 133) {
                                    int var220 = field403.method2101();
                                    int var221 = field403.method2127();
                                    int var222 = field403.method2126();
                                    Statics.field588 = var220 >> 1;
                                    Statics.field1452.method566(var222, var221, (var220 & 0x1) == 1);
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 53) {
                                    method39();
                                    int var223 = field403.method2127();
                                    int var224 = field403.method2101();
                                    int var225 = field403.method2106();
                                    field385[var223] = var225;
                                    field383[var223] = var224;
                                    field382[var223] = 1;
                                    for (int var226 = 0; var226 < 98; var226++) {
                                        if (var225 >= class140.field2121[var226]) {
                                            field382[var223] = var226 + 2;
                                        }
                                    }
                                    field435[++field436 - 1 & 0x1F] = var223;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 81) {
                                    for (int var227 = 0; var227 < field268.length; var227++) {
                                        if (field268[var227] != null) {
                                            field268[var227].field767 = -1;
                                        }
                                    }
                                    for (int var228 = 0; var228 < field280.length; var228++) {
                                        if (field280[var228] != null) {
                                            field280[var228].field767 = -1;
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 0) {
                                    int var229 = field403.method2145();
                                    int var230 = field403.method2224();
                                    class152 var231 = class152.method868(var229);
                                    if (var231.field2562 != var230 || var230 == -1) {
                                        var231.field2562 = var230;
                                        var231.field2632 = 0;
                                        var231.field2606 = 0;
                                        Statics.method122(var231);
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 41) {
                                    int var232 = field403.method2106();
                                    int var233 = field403.method2103();
                                    if (var232 < -70000) {
                                        var233 += 32768;
                                    }
                                    class152 var234;
                                    if (var232 >= 0) {
                                        var234 = class152.method868(var232);
                                    } else {
                                        var234 = null;
                                    }
                                    if (var234 != null) {
                                        for (int var235 = 0; var235 < var234.field2607.length; var235++) {
                                            var234.field2607[var235] = 0;
                                            var234.field2629[var235] = 0;
                                        }
                                    }
                                    class14.method574(var233);
                                    int var236 = field403.method2103();
                                    for (int var237 = 0; var237 < var236; var237++) {
                                        int var238 = field403.method2103();
                                        int var239 = field403.method2101();
                                        if (var239 == 255) {
                                            var239 = field403.method2106();
                                        }
                                        if (var234 != null && var237 < var234.field2607.length) {
                                            var234.field2607[var237] = var238;
                                            var234.field2629[var237] = var239;
                                        }
                                        class14.method92(var233, var237, var238 - 1, var239);
                                    }
                                    if (var234 != null) {
                                        Statics.method122(var234);
                                    }
                                    method39();
                                    field433[++field359 - 1 & 0x1F] = var233 & 0x7FFF;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 222) {
                                    int var240 = field403.method2101();
                                    int var241 = field403.method2101();
                                    int var242 = field403.method2101();
                                    int var243 = field403.method2101();
                                    field490[var240] = true;
                                    field329[var240] = var241;
                                    field453[var240] = var242;
                                    field494[var240] = var243;
                                    field386[var240] = 0;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 240) {
                                    method39();
                                    field307 = field403.method2101();
                                    field440 = field430;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 136) {
                                    field279 = true;
                                    Statics.field181 = field403.method2101();
                                    Statics.field193 = field403.method2101();
                                    Statics.field2011 = field403.method2103();
                                    Statics.field182 = field403.method2101();
                                    Statics.field1339 = field403.method2101();
                                    if (Statics.field1339 >= 100) {
                                        Statics.field201 = Statics.field181 * 128 + 64;
                                        Statics.field157 = Statics.field193 * 128 + 64;
                                        Statics.field1940 = method487(Statics.field201, Statics.field157, Statics.field588) - Statics.field2011;
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 118) {
                                    for (int var244 = 0; var244 < Statics.field1045; var244++) {
                                        class46 var245 = class46.method583(var244);
                                        if (var245 != null) {
                                            class154.field2658[var244] = 0;
                                            class154.field2650[var244] = 0;
                                        }
                                    }
                                    method39();
                                    field297 += 32;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 83) {
                                    field279 = false;
                                    for (int var246 = 0; var246 < 5; var246++) {
                                        field490[var246] = false;
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 61) {
                                    class22 var247 = new class22();
                                    var247.field566 = field403.method2109();
                                    var247.field563 = field403.method2103();
                                    int var248 = field403.method2106();
                                    var247.field565 = var248;
                                    method565(45);
                                    Statics.field529.method2583();
                                    Statics.field529 = null;
                                    class28.method141(var247);
                                    field376 = -1;
                                    var12 = false;
                                    break label3508;
                                }
                                if (field376 == 15) {
                                    method3484(true);
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 32) {
                                    int var249 = field403.method2106();
                                    int var250 = field403.method2103();
                                    if (var249 < -70000) {
                                        var250 += 32768;
                                    }
                                    class152 var251;
                                    if (var249 >= 0) {
                                        var251 = class152.method868(var249);
                                    } else {
                                        var251 = null;
                                    }
                                    while (field403.field1830 < field371) {
                                        int var252 = field403.method2114();
                                        int var253 = field403.method2103();
                                        int var254 = 0;
                                        if (var253 != 0) {
                                            var254 = field403.method2101();
                                            if (var254 == 255) {
                                                var254 = field403.method2106();
                                            }
                                        }
                                        if (var251 != null && var252 >= 0 && var252 < var251.field2607.length) {
                                            var251.field2607[var252] = var253;
                                            var251.field2629[var252] = var254;
                                        }
                                        class14.method92(var250, var252, var253 - 1, var254);
                                    }
                                    if (var251 != null) {
                                        Statics.method122(var251);
                                    }
                                    method39();
                                    field433[++field359 - 1 & 0x1F] = var250 & 0x7FFF;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 213) {
                                    int var255 = field403.method2145();
                                    class152 var256 = class152.method868(var255);
                                    for (int var257 = 0; var257 < var256.field2607.length; var257++) {
                                        var256.field2607[var257] = -1;
                                        var256.field2607[var257] = 0;
                                    }
                                    Statics.method122(var256);
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 177) {
                                    field257 = field403.method2136() * 30;
                                    field440 = field430;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 95) {
                                    int var258 = field403.method2206();
                                    Statics.field267 = Statics.field2036.method2469(var258);
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 105) {
                                    String var259 = field403.method2109();
                                    long var260 = field403.method2107();
                                    long var262 = (long) field403.method2103();
                                    long var264 = (long) field403.method2304();
                                    int var266 = field403.method2101();
                                    long var267 = (var262 << 32) + var264;
                                    boolean var269 = false;
                                    for (int var270 = 0; var270 < 100; var270++) {
                                        if (field462[var270] == var267) {
                                            var269 = true;
                                            break;
                                        }
                                    }
                                    if (var266 <= 1 && method2691(var259)) {
                                        var269 = true;
                                    }
                                    if (!var269 && field363 == 0) {
                                        field462[field463] = var267;
                                        field463 = (field463 + 1) % 100;
                                        class110 var271 = field403;
                                        String var272 = class191.method670(var271, 32767);
                                        String var273 = class192.method3388(class199.method501(var272));
                                        if (var266 == 2 || var266 == 3) {
                                            class10.method2822(9, class2.method36(1) + var259, var273, class198.method2693(var260));
                                        } else if (var266 == 1) {
                                            class10.method2822(9, class2.method36(0) + var259, var273, class198.method2693(var260));
                                        } else {
                                            class10.method2822(9, var259, var273, class198.method2693(var260));
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 210) {
                                    method39();
                                    field412 = field403.method2104();
                                    field440 = field430;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 228) {
                                    int var274 = field403.method2134();
                                    int var275 = field403.method2103();
                                    int var276 = field403.method2305();
                                    int var277 = field403.method2136();
                                    class152 var278 = class152.method868(var276);
                                    if (var278.field2566 != var275 || var278.field2567 != var274 || var278.field2524 != var277) {
                                        var278.field2566 = var275;
                                        var278.field2567 = var274;
                                        var278.field2524 = var277;
                                        Statics.method122(var278);
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 34) {
                                    method130();
                                    field376 = -1;
                                    var12 = false;
                                    break label3508;
                                }
                                if (field376 == 209) {
                                    Statics.field165 = field403.method2127();
                                    Statics.field139 = field403.method2127();
                                    for (int var279 = Statics.field139; var279 < Statics.field139 + 8; var279++) {
                                        for (int var280 = Statics.field165; var280 < Statics.field165 + 8; var280++) {
                                            if (field379[Statics.field588][var279][var280] != null) {
                                                field379[Statics.field588][var279][var280] = null;
                                                method802(var279, var280);
                                            }
                                        }
                                    }
                                    for (class15 var281 = (class15) field296.method3239(); var281 != null; var281 = (class15) field296.method3248()) {
                                        if (var281.field209 >= Statics.field139 && var281.field209 < Statics.field139 + 8 && var281.field205 >= Statics.field165 && var281.field205 < Statics.field165 + 8 && Statics.field588 == var281.field215) {
                                            var281.field214 = 0;
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 96) {
                                    for (int var282 = 0; var282 < class154.field2650.length; var282++) {
                                        if (class154.field2658[var282] != class154.field2650[var282]) {
                                            class154.field2650[var282] = class154.field2658[var282];
                                            method31(var282);
                                            field431[++field297 - 1 & 0x1F] = var282;
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 157) {
                                    field439 = field430;
                                    if (field371 == 0) {
                                        field468 = null;
                                        field275 = null;
                                        Statics.field600 = 0;
                                        Statics.field1887 = null;
                                        field376 = -1;
                                        var12 = true;
                                        break label3508;
                                    }
                                    field275 = field403.method2109();
                                    long var283 = field403.method2107();
                                    long var285 = var283;
                                    String var287;
                                    if (var283 <= 0L || var283 >= 6582952005840035281L) {
                                        var287 = null;
                                    } else if (var283 % 37L == 0L) {
                                        var287 = null;
                                    } else {
                                        int var288 = 0;
                                        for (long var289 = var283; var289 != 0L; var289 /= 37L) {
                                            var288++;
                                        }
                                        StringBuilder var291 = new StringBuilder(var288);
                                        while (var285 != 0L) {
                                            long var292 = var285;
                                            var285 /= 37L;
                                            var291.append(class198.field2955[(int) (var292 - var285 * 37L)]);
                                        }
                                        var287 = var291.reverse().toString();
                                    }
                                    field468 = var287;
                                    Statics.field1337 = field403.method2102();
                                    int var294 = field403.method2101();
                                    if (var294 == 255) {
                                        field376 = -1;
                                        var12 = true;
                                        break label3508;
                                    }
                                    Statics.field600 = var294;
                                    class21[] var295 = new class21[100];
                                    for (int var296 = 0; var296 < Statics.field600; var296++) {
                                        var295[var296] = new class21();
                                        var295[var296].field557 = field403.method2109();
                                        var295[var296].field552 = class200.method2604(var295[var296].field557, Statics.field1904);
                                        var295[var296].field555 = field403.method2103();
                                        var295[var296].field554 = field403.method2102();
                                        field403.method2109();
                                        if (var295[var296].field557.equals(Statics.field1452.field50)) {
                                            Statics.field778 = var295[var296].field554;
                                        }
                                    }
                                    boolean var297 = false;
                                    int var298 = Statics.field600;
                                    while (var298 > 0) {
                                        boolean var299 = true;
                                        var298--;
                                        for (int var300 = 0; var300 < var298; var300++) {
                                            if (var295[var300].field552.compareTo(var295[var300 + 1].field552) > 0) {
                                                class21 var301 = var295[var300];
                                                var295[var300] = var295[var300 + 1];
                                                var295[var300 + 1] = var301;
                                                var299 = false;
                                            }
                                        }
                                        if (var299) {
                                            break;
                                        }
                                    }
                                    Statics.field1887 = var295;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 23) {
                                    int var302 = field403.method2297();
                                    String var303 = field403.method2109();
                                    int var304 = field403.method2101();
                                    if (var302 >= 1 && var302 <= 8) {
                                        if (var303.equalsIgnoreCase("null")) {
                                            var303 = null;
                                        }
                                        field375[var302 - 1] = var303;
                                        field472[var302 - 1] = var304 == 0;
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 7) {
                                    while (field403.field1830 < field371) {
                                        boolean var305 = field403.method2101() == 1;
                                        String var306 = field403.method2109();
                                        String var307 = field403.method2109();
                                        int var308 = field403.method2103();
                                        int var309 = field403.method2101();
                                        int var310 = field403.method2101();
                                        boolean var311 = (var310 & 0x2) != 0;
                                        boolean var312 = (var310 & 0x1) != 0;
                                        if (var308 > 0) {
                                            field403.method2109();
                                            field403.method2101();
                                            field403.method2106();
                                        }
                                        field403.method2109();
                                        for (int var313 = 0; var313 < field495; var313++) {
                                            class16 var314 = field497[var313];
                                            if (var305) {
                                                if (var307.equals(var314.field221)) {
                                                    var314.field221 = var306;
                                                    var314.field219 = var307;
                                                    var306 = null;
                                                    break;
                                                }
                                            } else if (var306.equals(var314.field221)) {
                                                if (var314.field225 != var308) {
                                                    boolean var315 = true;
                                                    for (class34 var316 = (class34) field498.method3189(); var316 != null; var316 = (class34) field498.method3190()) {
                                                        if (var316.field774.equals(var306)) {
                                                            if (var308 != 0 && var316.field781 == 0) {
                                                                var316.method3312();
                                                                var315 = false;
                                                            } else if (var308 == 0 && var316.field781 != 0) {
                                                                var316.method3312();
                                                                var315 = false;
                                                            }
                                                        }
                                                    }
                                                    if (var315) {
                                                        field498.method3187(new class34(var306, var308));
                                                    }
                                                    var314.field225 = var308;
                                                }
                                                var314.field219 = var307;
                                                var314.field220 = var309;
                                                var314.field218 = var311;
                                                var314.field222 = var312;
                                                var306 = null;
                                                break;
                                            }
                                        }
                                        if (var306 != null && field495 < 400) {
                                            class16 var317 = new class16();
                                            field497[field495] = var317;
                                            var317.field221 = var306;
                                            var317.field219 = var307;
                                            var317.field225 = var308;
                                            var317.field220 = var309;
                                            var317.field218 = var311;
                                            var317.field222 = var312;
                                            field495++;
                                        }
                                    }
                                    field352 = 2;
                                    field438 = field430;
                                    boolean var318 = false;
                                    int var319 = field495;
                                    while (var319 > 0) {
                                        boolean var320 = true;
                                        var319--;
                                        for (int var321 = 0; var321 < var319; var321++) {
                                            boolean var322 = false;
                                            class16 var323 = field497[var321];
                                            class16 var324 = field497[var321 + 1];
                                            if (field241 != var323.field225 && field241 == var324.field225) {
                                                var322 = true;
                                            }
                                            if (!var322 && var323.field225 == 0 && var324.field225 != 0) {
                                                var322 = true;
                                            }
                                            if (!var322 && !var323.field218 && var324.field218) {
                                                var322 = true;
                                            }
                                            if (!var322 && !var323.field222 && var324.field222) {
                                                var322 = true;
                                            }
                                            if (var322) {
                                                class16 var325 = field497[var321];
                                                field497[var321] = field497[var321 + 1];
                                                field497[var321 + 1] = var325;
                                                var320 = false;
                                            }
                                        }
                                        if (var320) {
                                            break;
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 203) {
                                    field361 = field403.method2101();
                                    field461 = field403.method2101();
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 225) {
                                    int var326 = field403.method2136();
                                    byte var327 = field403.method2102();
                                    class154.field2658[var326] = var327;
                                    if (class154.field2650[var326] != var327) {
                                        class154.field2650[var326] = var327;
                                        method31(var326);
                                    }
                                    field431[++field297 - 1 & 0x1F] = var326;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 149) {
                                    field258 = field403.method2101();
                                    if (field258 == 1) {
                                        field259 = field403.method2103();
                                    }
                                    if (field258 >= 2 && field258 <= 6) {
                                        if (field258 == 2) {
                                            field413 = 64;
                                            field265 = 64;
                                        }
                                        if (field258 == 3) {
                                            field413 = 0;
                                            field265 = 64;
                                        }
                                        if (field258 == 4) {
                                            field413 = 128;
                                            field265 = 64;
                                        }
                                        if (field258 == 5) {
                                            field413 = 64;
                                            field265 = 0;
                                        }
                                        if (field258 == 6) {
                                            field413 = 64;
                                            field265 = 128;
                                        }
                                        field258 = 2;
                                        field368 = field403.method2103();
                                        field264 = field403.method2103();
                                        field262 = field403.method2101();
                                    }
                                    if (field258 == 10) {
                                        field321 = field403.method2103();
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 151) {
                                    field403.field1830 += 28;
                                    if (field403.method2121()) {
                                        class110 var328 = field403;
                                        int var329 = field403.field1830 - 28;
                                        if (class136.field2080 != null) {
                                            try {
                                                class136.field2080.method3459(0L);
                                                class136.field2080.method3463(var328.field1831, var329, 24);
                                            } catch (Exception var504) {
                                            }
                                        }
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 183) {
                                    int var331 = field403.method2305();
                                    int var332 = field403.method2103();
                                    int var333 = var332 >> 10 & 0x1F;
                                    int var334 = var332 >> 5 & 0x1F;
                                    int var335 = var332 & 0x1F;
                                    int var336 = (var335 << 3) + (var333 << 19) + (var334 << 11);
                                    class152 var337 = class152.method868(var331);
                                    if (var337.field2638 != var336) {
                                        var337.field2638 = var336;
                                        Statics.method122(var337);
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 146) {
                                    int var338 = field403.method2134();
                                    int var339 = field403.method2305();
                                    class152 var340 = class152.method868(var339);
                                    if (var340.field2558 != 2 || var340.field2597 != var338) {
                                        var340.field2558 = 2;
                                        var340.field2597 = var338;
                                        Statics.method122(var340);
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 71 || field376 == 178 || field376 == 168 || field376 == 14 || field376 == 80 || field376 == 227 || field376 == 196 || field376 == 171 || field376 == 237 || field376 == 21) {
                                    method1296();
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 112) {
                                    Statics.field165 = field403.method2127();
                                    Statics.field139 = field403.method2101();
                                    while (field403.field1830 < field371) {
                                        field376 = field403.method2101();
                                        method1296();
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 38) {
                                    int var341 = field403.method2136();
                                    int var342 = field403.method2297();
                                    int var343 = field403.method2206();
                                    class4 var344 = (class4) field407.method3204((long) var343);
                                    if (var344 != null) {
                                        method129(var344, var344.field63 != var341);
                                    }
                                    method1749(var343, var341, var342);
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 6) {
                                    Statics.field139 = field403.method2297();
                                    Statics.field165 = field403.method2297();
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 198) {
                                    String var345 = field403.method2109();
                                    int var346 = field403.method2103();
                                    byte var347 = field403.method2102();
                                    boolean var348 = false;
                                    if (var347 == -128) {
                                        var348 = true;
                                    }
                                    if (var348) {
                                        if (Statics.field600 == 0) {
                                            field376 = -1;
                                            var12 = true;
                                            break label3508;
                                        }
                                        boolean var349 = false;
                                        int var350;
                                        for (var350 = 0; var350 < Statics.field600 && (!Statics.field1887[var350].field557.equals(var345) || Statics.field1887[var350].field555 != var346); var350++) {
                                        }
                                        if (var350 < Statics.field600) {
                                            while (var350 < Statics.field600 - 1) {
                                                Statics.field1887[var350] = Statics.field1887[var350 + 1];
                                                var350++;
                                            }
                                            Statics.field600--;
                                            Statics.field1887[Statics.field600] = null;
                                        }
                                    } else {
                                        field403.method2109();
                                        class21 var351 = new class21();
                                        var351.field557 = var345;
                                        var351.field552 = class200.method2604(var351.field557, Statics.field1904);
                                        var351.field555 = var346;
                                        var351.field554 = var347;
                                        int var352;
                                        for (var352 = Statics.field600 - 1; var352 >= 0; var352--) {
                                            int var353 = Statics.field1887[var352].field552.compareTo(var351.field557);
                                            if (var353 == 0) {
                                                Statics.field1887[var352].field555 = var346;
                                                Statics.field1887[var352].field554 = var347;
                                                if (var345.equals(Statics.field1452.field50)) {
                                                    Statics.field778 = var347;
                                                }
                                                field439 = field430;
                                                field376 = -1;
                                                var12 = true;
                                                break label3508;
                                            }
                                            if (var353 < 0) {
                                                break;
                                            }
                                        }
                                        if (Statics.field600 >= Statics.field1887.length) {
                                            field376 = -1;
                                            var12 = true;
                                            break label3508;
                                        }
                                        for (int var354 = Statics.field600 - 1; var354 > var352; var354--) {
                                            Statics.field1887[var354 + 1] = Statics.field1887[var354];
                                        }
                                        if (Statics.field600 == 0) {
                                            Statics.field1887 = new class21[100];
                                        }
                                        Statics.field1887[var352 + 1] = var351;
                                        Statics.field600++;
                                        if (var345.equals(Statics.field1452.field50)) {
                                            Statics.field778 = var347;
                                        }
                                    }
                                    field439 = field430;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 226) {
                                    int var355 = field403.method2135();
                                    class14.method1746(var355);
                                    field433[++field359 - 1 & 0x1F] = var355 & 0x7FFF;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 248) {
                                    int var356 = field403.method2136();
                                    field406 = var356;
                                    Statics.method177(var356);
                                    class32.method541(field406);
                                    for (int var357 = 0; var357 < 100; var357++) {
                                        field454[var357] = true;
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 30) {
                                    int var358 = field403.method2145();
                                    int var359 = field403.method2135();
                                    class154.field2658[var359] = var358;
                                    if (class154.field2650[var359] != var358) {
                                        class154.field2650[var359] = var358;
                                        method31(var359);
                                    }
                                    field431[++field297 - 1 & 0x1F] = var359;
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 155) {
                                    String var360 = field403.method2109();
                                    Object[] var361 = new Object[var360.length() + 1];
                                    for (int var362 = var360.length() - 1; var362 >= 0; var362--) {
                                        if (var360.charAt(var362) == 's') {
                                            var361[var362 + 1] = field403.method2109();
                                        } else {
                                            var361[var362 + 1] = Integer.valueOf(field403.method2106());
                                        }
                                    }
                                    var361[0] = Integer.valueOf(field403.method2106());
                                    class1 var363 = new class1();
                                    var363.field5 = var361;
                                    class32.method2405(var363, 200000);
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 57) {
                                    field475 = field403.method2101();
                                    if (field475 == 255) {
                                        field475 = 0;
                                    }
                                    field503 = field403.method2101();
                                    if (field503 == 255) {
                                        field503 = 0;
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 115) {
                                    String var364 = field403.method2109();
                                    class110 var365 = field403;
                                    String var366 = class191.method670(var365, 32767);
                                    String var367 = class192.method3388(class199.method501(var366));
                                    class10.method551(6, var364, var367);
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                if (field376 == 10) {
                                    int var368 = field403.method2206();
                                    int var369 = field403.method2137();
                                    int var370 = field403.method2105();
                                    class152 var371 = class152.method868(var368);
                                    int var372 = var371.field2560 + var369;
                                    int var373 = var371.field2536 + var370;
                                    if (var371.field2531 != var372 || var371.field2532 != var373) {
                                        var371.field2531 = var372;
                                        var371.field2532 = var373;
                                        Statics.method122(var371);
                                    }
                                    field376 = -1;
                                    var12 = true;
                                    break label3508;
                                }
                                Statics.method96("" + field376 + class2.field20 + field393 + class2.field20 + field294 + class2.field20 + field371, (Throwable) null);
                                method130();
                            } catch (IOException var513) {
                                if (field291 > 0) {
                                    method130();
                                } else {
                                    method565(40);
                                    Statics.field249 = Statics.field529;
                                    Statics.field529 = null;
                                }
                            } catch (Exception var514) {
                                String var376 = "" + field376 + class2.field20 + field393 + class2.field20 + field294 + class2.field20 + field371 + class2.field20 + (Statics.field200 + Statics.field1452.field771[0]) + class2.field20 + (Statics.field56 + Statics.field1452.field768[0]) + class2.field20;
                                for (int var377 = 0; var377 < field371 && var377 < 50; var377++) {
                                    var376 = var376 + field403.field1831[var377] + class2.field20;
                                }
                                Statics.method96(var376, var514);
                                method130();
                            }
                            var12 = true;
                        }
                    }
                    if (!var12) {
                        break;
                    }
                }
                if (field248 == 30) {
                    while (true) {
                        class188 var378 = (class188) class189.field2879.method3274();
                        boolean var379;
                        if (var378 == null) {
                            var379 = false;
                        } else {
                            var379 = true;
                        }
                        if (!var379) {
                            Object var381 = Statics.field2957.field164;
                            synchronized (Statics.field2957.field164) {
                                if (!field240) {
                                    Statics.field2957.field171 = 0;
                                } else if (class127.field2004 != 0 || Statics.field2957.field171 >= 40) {
                                    field284.method2345(251);
                                    field284.method2214(0);
                                    int var382 = field284.field1830;
                                    int var383 = 0;
                                    for (int var384 = 0; var384 < Statics.field2957.field171 && field284.field1830 - var382 < 240; var384++) {
                                        var383++;
                                        int var385 = Statics.field2957.field168[var384];
                                        if (var385 < 0) {
                                            var385 = 0;
                                        } else if (var385 > 502) {
                                            var385 = 502;
                                        }
                                        int var386 = Statics.field2957.field166[var384];
                                        if (var386 < 0) {
                                            var386 = 0;
                                        } else if (var386 > 764) {
                                            var386 = 764;
                                        }
                                        int var387 = var385 * 765 + var386;
                                        if (Statics.field2957.field168[var384] == -1 && Statics.field2957.field166[var384] == -1) {
                                            var386 = -1;
                                            var385 = -1;
                                            var387 = 524287;
                                        }
                                        if (field252 != var386 || field253 != var385) {
                                            int var388 = var386 - field252;
                                            field252 = var386;
                                            int var389 = var385 - field253;
                                            field253 = var385;
                                            if (field384 < 8 && var388 >= -32 && var388 <= 31 && var389 >= -32 && var389 <= 31) {
                                                var388 += 32;
                                                var389 += 32;
                                                field284.method2251((field384 << 12) + (var388 << 6) + var389);
                                                field384 = 0;
                                            } else if (field384 < 8) {
                                                field284.method2176((field384 << 19) + 8388608 + var387);
                                                field384 = 0;
                                            } else {
                                                field284.method2090((field384 << 19) + -1073741824 + var387);
                                                field384 = 0;
                                            }
                                        } else if (field384 < 2047) {
                                            field384++;
                                        }
                                    }
                                    field284.method2098(field284.field1830 - var382);
                                    if (var383 >= Statics.field2957.field171) {
                                        Statics.field2957.field171 = 0;
                                    } else {
                                        Statics.field2957.field171 -= var383;
                                        for (int var390 = 0; var390 < Statics.field2957.field171; var390++) {
                                            Statics.field2957.field166[var390] = Statics.field2957.field166[var383 + var390];
                                            Statics.field2957.field168[var390] = Statics.field2957.field168[var383 + var390];
                                        }
                                    }
                                }
                            }
                            if (class127.field2004 == 1 || !Statics.field776 && class127.field2004 == 4 || class127.field2004 == 2) {
                                long var392 = (class127.field2007 - field251) / 50L;
                                if (var392 > 4095L) {
                                    var392 = 4095L;
                                }
                                field251 = class127.field2007;
                                int var394 = class127.field2006;
                                if (var394 < 0) {
                                    var394 = 0;
                                } else if (var394 > 502) {
                                    var394 = 502;
                                }
                                int var395 = class127.field1993;
                                if (var395 < 0) {
                                    var395 = 0;
                                } else if (var395 > 764) {
                                    var395 = 764;
                                }
                                int var396 = var394 * 765 + var395;
                                byte var397 = 0;
                                if (class127.field2004 == 2) {
                                    var397 = 1;
                                }
                                int var398 = (int) var392;
                                field284.method2345(49);
                                field284.method2090((var397 << 19) + (var398 << 20) + var396);
                            }
                            if (class124.field1961 > 0) {
                                field284.method2345(193);
                                field284.method2251(0);
                                int var399 = field284.field1830;
                                long var400 = class103.method2037();
                                for (int var402 = 0; var402 < class124.field1961; var402++) {
                                    long var403 = var400 - field476;
                                    if (var403 > 16777215L) {
                                        var403 = 16777215L;
                                    }
                                    field476 = var400;
                                    field284.method2214(class124.field1963[var402]);
                                    field284.method2140((int) var403);
                                }
                                field284.method2085(field284.field1830 - var399);
                            }
                            if (field505 > 0) {
                                field505--;
                            }
                            if (class124.field1957[96] || class124.field1957[97] || class124.field1957[98] || class124.field1957[99]) {
                                field260 = true;
                            }
                            if (field260 && field505 <= 0) {
                                field505 = 20;
                                field260 = false;
                                field284.method2345(97);
                                field284.method2131(field328);
                                field284.method2251(field254);
                            }
                            if (Statics.field1267 && !field255) {
                                field255 = true;
                                field284.method2345(10);
                                field284.method2214(1);
                            }
                            if (!Statics.field1267 && field255) {
                                field255 = false;
                                field284.method2345(10);
                                field284.method2214(0);
                            }
                            if (field246 && Statics.field588 != field489) {
                                Statics.method2689(Statics.field69, Statics.field2649, Statics.field588, Statics.field1452.field771[0], Statics.field1452.field768[0]);
                            } else if (Statics.field588 != field470) {
                                field470 = Statics.field588;
                                int var405 = Statics.field588;
                                int[] var406 = Statics.field513.field1287;
                                int var407 = var406.length;
                                for (int var408 = 0; var408 < var407; var408++) {
                                    var406[var408] = 0;
                                }
                                int var409 = 1;
                                while (true) {
                                    if (var409 >= 103) {
                                        int var412 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var413 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field513.method1485();
                                        for (int var414 = 1; var414 < 103; var414++) {
                                            for (int var415 = 1; var415 < 103; var415++) {
                                                if ((class6.field80[var405][var415][var414] & 0x18) == 0) {
                                                    method147(var405, var415, var414, var412, var413);
                                                }
                                                if (var405 < 3 && (class6.field80[var405 + 1][var415][var414] & 0x8) != 0) {
                                                    method147(var405 + 1, var415, var414, var412, var413);
                                                }
                                            }
                                        }
                                        field411 = 0;
                                        for (int var416 = 0; var416 < 104; var416++) {
                                            for (int var417 = 0; var417 < 104; var417++) {
                                                int var418 = Statics.field62.method1713(Statics.field588, var416, var417);
                                                if (var418 != 0) {
                                                    int var419 = var418 >> 14 & 0x7FFF;
                                                    int var420 = class36.method83(var419).field852;
                                                    if (var420 >= 0) {
                                                        int var421 = var416;
                                                        int var422 = var417;
                                                        if (var420 != 22 && var420 != 29 && var420 != 34 && var420 != 36 && var420 != 46 && var420 != 47 && var420 != 48) {
                                                            int[][] var423 = field460[Statics.field588].field2952;
                                                            for (int var424 = 0; var424 < 10; var424++) {
                                                                int var425 = (int) (Math.random() * 4.0D);
                                                                if (var425 == 0 && var421 > 0 && var421 > var416 - 3 && (var423[var421 - 1][var422] & 0x1240108) == 0) {
                                                                    var421--;
                                                                }
                                                                if (var425 == 1 && var421 < 103 && var421 < var416 + 3 && (var423[var421 + 1][var422] & 0x1240180) == 0) {
                                                                    var421++;
                                                                }
                                                                if (var425 == 2 && var422 > 0 && var422 > var417 - 3 && (var423[var421][var422 - 1] & 0x1240102) == 0) {
                                                                    var422--;
                                                                }
                                                                if (var425 == 3 && var422 < 103 && var422 < var417 + 3 && (var423[var421][var422 + 1] & 0x1240120) == 0) {
                                                                    var422++;
                                                                }
                                                            }
                                                        }
                                                        field474[field411] = Statics.field511[var420];
                                                        field288[field411] = var421;
                                                        field473[field411] = var422;
                                                        field411++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field1333.method1391();
                                        break;
                                    }
                                    int var410 = (103 - var409) * 2048 + 24628;
                                    for (int var411 = 1; var411 < 103; var411++) {
                                        if ((class6.field80[var405][var411][var409] & 0x18) == 0) {
                                            Statics.field62.method1678(var406, var410, 512, var405, var411, var409);
                                        }
                                        if (var405 < 3 && (class6.field80[var405 + 1][var411][var409] & 0x8) != 0) {
                                            Statics.field62.method1678(var406, var410, 512, var405 + 1, var411, var409);
                                        }
                                        var410 += 4;
                                    }
                                    var409++;
                                }
                            }
                            if (field248 == 30) {
                                Statics.method587();
                                int var10002;
                                for (int var426 = 0; var426 < field483; var426++) {
                                    var10002 = field486[var426]--;
                                    if (field486[var426] >= -10) {
                                        class52 var428 = field493[var426];
                                        if (var428 == null) {
                                            class52 var516 = (class52) null;
                                            var428 = class52.method1014(Statics.field592, field484[var426], 0);
                                            if (var428 == null) {
                                                continue;
                                            }
                                            field486[var426] += var428.method1011();
                                            field493[var426] = var428;
                                        }
                                        if (field486[var426] < 0) {
                                            int var435;
                                            if (field487[var426] == 0) {
                                                var435 = field304;
                                            } else {
                                                int var429 = (field487[var426] & 0xFF) * 128;
                                                int var430 = field487[var426] >> 16 & 0xFF;
                                                int var431 = var430 * 128 + 64 - Statics.field1452.field772;
                                                if (var431 < 0) {
                                                    var431 = -var431;
                                                }
                                                int var432 = field487[var426] >> 8 & 0xFF;
                                                int var433 = var432 * 128 + 64 - Statics.field1452.field715;
                                                if (var433 < 0) {
                                                    var433 = -var433;
                                                }
                                                int var434 = var431 + var433 - 128;
                                                if (var434 > var429) {
                                                    field486[var426] = -100;
                                                    continue;
                                                }
                                                if (var434 < 0) {
                                                    var434 = 0;
                                                }
                                                var435 = field482 * (var429 - var434) / var429;
                                            }
                                            if (var435 > 0) {
                                                class56 var436 = var428.method1010().method1051(Statics.field605);
                                                class58 var437 = class58.method1072(var436, 100, var435);
                                                var437.method1075(field485[var426] - 1);
                                                Statics.field1445.method924(var437);
                                            }
                                            field486[var426] = -100;
                                        }
                                    } else {
                                        field483--;
                                        for (int var427 = var426; var427 < field483; var427++) {
                                            field484[var427] = field484[var427 + 1];
                                            field493[var427] = field493[var427 + 1];
                                            field485[var427] = field485[var427 + 1];
                                            field486[var427] = field486[var427 + 1];
                                            field487[var427] = field487[var427 + 1];
                                        }
                                        var426--;
                                    }
                                }
                                if (field480 && !class161.method2428()) {
                                    if (field419 != 0 && field479 != -1) {
                                        class161.method1932(Statics.field2401, field479, 0, field419, false);
                                    }
                                    field480 = false;
                                }
                                field289++;
                                if (field289 <= 750) {
                                    method460();
                                    for (int var438 = 0; var438 < field281; var438++) {
                                        int var439 = field282[var438];
                                        class30 var440 = field280[var439];
                                        if (var440 != null) {
                                            method476(var440, var440.field680.field789);
                                        }
                                    }
                                    for (int var441 = -1; var441 < field293; var441++) {
                                        int var442;
                                        if (var441 == -1) {
                                            var442 = 2047;
                                        } else {
                                            var442 = field366[var441];
                                        }
                                        class3 var443 = field268[var442];
                                        if (var443 != null && var443.field729 > 0) {
                                            var443.field729--;
                                            if (var443.field729 == 0) {
                                                var443.field727 = null;
                                            }
                                        }
                                    }
                                    for (int var444 = 0; var444 < field281; var444++) {
                                        int var445 = field282[var444];
                                        class30 var446 = field280[var445];
                                        if (var446 != null && var446.field729 > 0) {
                                            var446.field729--;
                                            if (var446.field729 == 0) {
                                                var446.field727 = null;
                                            }
                                        }
                                    }
                                    field456++;
                                    if (field354 != 0) {
                                        field353 += 20;
                                        if (field353 >= 400) {
                                            field354 = 0;
                                        }
                                    }
                                    if (Statics.field2 != null) {
                                        field355++;
                                        if (field355 >= 15) {
                                            Statics.method122(Statics.field2);
                                            Statics.field2 = null;
                                        }
                                    }
                                    class152 var447 = Statics.field1871;
                                    class152 var448 = Statics.field541;
                                    Statics.field1871 = null;
                                    Statics.field541 = null;
                                    field422 = null;
                                    field426 = false;
                                    field261 = false;
                                    field464 = 0;
                                    while (true) {
                                        while (class124.method458() && field464 < 128) {
                                            if (field432 >= 2 && class124.field1957[82] && Statics.field2017 == 66) {
                                                String var449 = class10.method1392();
                                                Statics.field1920.setContents(new StringSelection(var449), (ClipboardOwner) null);
                                            } else {
                                                field346[field464] = Statics.field2017;
                                                field465[field464] = Statics.field1334;
                                                field464++;
                                            }
                                        }
                                        int var450 = field406;
                                        if (class152.method1930(var450)) {
                                            method475(Statics.field2595[var450], -1, 0, 0, 765, 503, 0, 0);
                                        }
                                        field430++;
                                        while (true) {
                                            class1 var451;
                                            class152 var452;
                                            class152 var453;
                                            do {
                                                var451 = (class1) field445.method3237();
                                                if (var451 == null) {
                                                    while (true) {
                                                        class1 var454;
                                                        class152 var455;
                                                        class152 var456;
                                                        do {
                                                            var454 = (class1) field444.method3237();
                                                            if (var454 == null) {
                                                                while (true) {
                                                                    class1 var457;
                                                                    class152 var458;
                                                                    class152 var459;
                                                                    do {
                                                                        var457 = (class1) field308.method3237();
                                                                        if (var457 == null) {
                                                                            method4();
                                                                            if (Statics.field313 == null && field418 == null) {
                                                                                int var460 = class127.field2004;
                                                                                if (field387) {
                                                                                    if (var460 != 1 && (Statics.field776 || var460 != 4)) {
                                                                                        int var461 = class127.field1996;
                                                                                        int var462 = class127.field1999 * 1288203703;
                                                                                        if (var461 < Statics.field1513 - 10 || var461 > Statics.field1656 + Statics.field1513 + 10 || var462 < Statics.field49 - 10 || var462 > Statics.field697 + Statics.field49 + 10) {
                                                                                            field387 = false;
                                                                                            method768(Statics.field1513, Statics.field49, Statics.field1656, Statics.field697);
                                                                                        }
                                                                                    }
                                                                                    if (var460 == 1 || !Statics.field776 && var460 == 4) {
                                                                                        int var463 = Statics.field1513;
                                                                                        int var464 = Statics.field49;
                                                                                        int var465 = Statics.field1656;
                                                                                        int var466 = class127.field1993;
                                                                                        int var467 = class127.field2006;
                                                                                        int var468 = -1;
                                                                                        for (int var469 = 0; var469 < field388; var469++) {
                                                                                            int var470 = (field388 - 1 - var469) * 15 + var464 + 31;
                                                                                            if (var466 > var463 && var466 < var463 + var465 && var467 > var470 - 13 && var467 < var470 + 3) {
                                                                                                var468 = var469;
                                                                                            }
                                                                                        }
                                                                                        if (var468 != -1) {
                                                                                            method2912(var468);
                                                                                        }
                                                                                        field387 = false;
                                                                                        method768(Statics.field1513, Statics.field49, Statics.field1656, Statics.field697);
                                                                                    }
                                                                                } else {
                                                                                    label3639: {
                                                                                        if ((var460 == 1 || !Statics.field776 && var460 == 4) && field388 > 0) {
                                                                                            int var471 = field326[field388 - 1];
                                                                                            if (var471 == 39 || var471 == 40 || var471 == 41 || var471 == 42 || var471 == 43 || var471 == 33 || var471 == 34 || var471 == 35 || var471 == 36 || var471 == 37 || var471 == 38 || var471 == 1005) {
                                                                                                int var472 = field389[field388 - 1];
                                                                                                int var473 = field481[field388 - 1];
                                                                                                class152 var474 = class152.method868(var473);
                                                                                                if (class156.method98(method132(var474)) || class156.method1317(method132(var474))) {
                                                                                                    if (Statics.field313 != null && !field334 && field373 != 1 && !method1741(field388 - 1) && field388 > 0) {
                                                                                                        method166(field358, field318);
                                                                                                    }
                                                                                                    field334 = false;
                                                                                                    field335 = 0;
                                                                                                    if (Statics.field313 != null) {
                                                                                                        Statics.method122(Statics.field313);
                                                                                                    }
                                                                                                    Statics.field313 = class152.method868(var473);
                                                                                                    field357 = var472;
                                                                                                    field358 = class127.field1993;
                                                                                                    field318 = class127.field2006;
                                                                                                    if (field388 > 0) {
                                                                                                        int var475 = field388 - 1;
                                                                                                        Statics.field1265 = new class27();
                                                                                                        Statics.field1265.field626 = field389[var475];
                                                                                                        Statics.field1265.field622 = field481[var475];
                                                                                                        Statics.field1265.field625 = field326[var475];
                                                                                                        Statics.field1265.field621 = field392[var475];
                                                                                                        Statics.field1265.field624 = field425[var475];
                                                                                                    }
                                                                                                    Statics.method122(Statics.field313);
                                                                                                    break label3639;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if ((var460 == 1 || !Statics.field776 && var460 == 4) && (field373 == 1 && field388 > 2 || method1741(field388 - 1))) {
                                                                                            var460 = 2;
                                                                                        }
                                                                                        if ((var460 == 1 || !Statics.field776 && var460 == 4) && field388 > 0) {
                                                                                            method2912(field388 - 1);
                                                                                        }
                                                                                        if (var460 == 2 && field388 > 0) {
                                                                                            method1938(class127.field1993, class127.field2006);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field418 != null) {
                                                                                method158();
                                                                            }
                                                                            if (Statics.field313 != null) {
                                                                                Statics.method122(Statics.field313);
                                                                                field335++;
                                                                                if (class127.field2005 == 0) {
                                                                                    if (field334) {
                                                                                        if (Statics.field313 == Statics.field2705 && field357 != field287) {
                                                                                            class152 var476 = Statics.field313;
                                                                                            byte var477 = 0;
                                                                                            if (field409 == 1 && var476.field2530 == 206) {
                                                                                                var477 = 1;
                                                                                            }
                                                                                            if (var476.field2607[field287] <= 0) {
                                                                                                var477 = 0;
                                                                                            }
                                                                                            if (class156.method1317(method132(var476))) {
                                                                                                int var478 = field357;
                                                                                                int var479 = field287;
                                                                                                var476.field2607[var479] = var476.field2607[var478];
                                                                                                var476.field2629[var479] = var476.field2629[var478];
                                                                                                var476.field2607[var478] = -1;
                                                                                                var476.field2629[var478] = 0;
                                                                                            } else if (var477 == 1) {
                                                                                                int var480 = field357;
                                                                                                int var481 = field287;
                                                                                                while (var480 != var481) {
                                                                                                    if (var480 > var481) {
                                                                                                        var476.method2868(var480 - 1, var480);
                                                                                                        var480--;
                                                                                                    } else if (var480 < var481) {
                                                                                                        var476.method2868(var480 + 1, var480);
                                                                                                        var480++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var476.method2868(field287, field357);
                                                                                            }
                                                                                            field284.method2345(201);
                                                                                            field284.method2131(field357);
                                                                                            field284.method2214(var477);
                                                                                            field284.method2131(field287);
                                                                                            field284.method2143(Statics.field313.field2526);
                                                                                        }
                                                                                    } else if ((field373 == 1 || method1741(field388 - 1)) && field388 > 2) {
                                                                                        method1938(field358, field318);
                                                                                    } else if (field388 > 0) {
                                                                                        method166(field358, field318);
                                                                                    }
                                                                                    field355 = 10;
                                                                                    class127.field2004 = 0;
                                                                                    Statics.field313 = null;
                                                                                } else if (field335 >= 5 && (class127.field1996 > field358 + 5 || class127.field1996 < field358 - 5 || class127.field1999 * 1288203703 > field318 + 5 || class127.field1999 * 1288203703 < field318 - 5)) {
                                                                                    field334 = true;
                                                                                }
                                                                            }
                                                                            if (class79.field1378 != -1) {
                                                                                int var482 = class79.field1378;
                                                                                int var483 = class79.field1385;
                                                                                field284.method2345(158);
                                                                                field284.method2214(5);
                                                                                field284.method2131(Statics.field56 + var483);
                                                                                field284.method2124(class124.field1957[82] ? (class124.field1957[81] ? 2 : 1) : 0);
                                                                                field284.method2251(Statics.field200 + var482);
                                                                                class79.field1378 = -1;
                                                                                field351 = class127.field1993;
                                                                                field408 = class127.field2006;
                                                                                field354 = 1;
                                                                                field353 = 0;
                                                                                field475 = var482;
                                                                                field503 = var483;
                                                                            }
                                                                            if (Statics.field1871 != var447) {
                                                                                if (var447 != null) {
                                                                                    Statics.method122(var447);
                                                                                }
                                                                                if (Statics.field1871 != null) {
                                                                                    Statics.method122(Statics.field1871);
                                                                                }
                                                                            }
                                                                            if (Statics.field541 != var448 && field398 == field342) {
                                                                                if (var448 != null) {
                                                                                    Statics.method122(var448);
                                                                                }
                                                                                if (Statics.field541 != null) {
                                                                                    Statics.method122(Statics.field541);
                                                                                }
                                                                            }
                                                                            if (Statics.field541 == null) {
                                                                                if (field342 > 0) {
                                                                                    field342--;
                                                                                }
                                                                            } else if (field342 < field398) {
                                                                                field342++;
                                                                                if (field398 == field342) {
                                                                                    Statics.method122(Statics.field541);
                                                                                }
                                                                            }
                                                                            int var484 = field455 + Statics.field1452.field772;
                                                                            int var485 = field310 + Statics.field1452.field715;
                                                                            if (Statics.field2467 - var484 < -500 || Statics.field2467 - var484 > 500 || Statics.field223 - var485 < -500 || Statics.field223 - var485 > 500) {
                                                                                Statics.field2467 = var484;
                                                                                Statics.field223 = var485;
                                                                            }
                                                                            if (Statics.field2467 != var484) {
                                                                                Statics.field2467 += (var484 - Statics.field2467) / 16;
                                                                            }
                                                                            if (Statics.field223 != var485) {
                                                                                Statics.field223 += (var485 - Statics.field223) / 16;
                                                                            }
                                                                            if (class127.field2005 == 4 && Statics.field776) {
                                                                                int var486 = class127.field1999 * 1288203703 - field333;
                                                                                field331 = var486 * 2;
                                                                                field333 = var486 == -1 || var486 == 1 ? class127.field1999 * 1288203703 : (field333 + class127.field1999 * 1288203703) / 2;
                                                                                int var487 = field397 - class127.field1996;
                                                                                field370 = var487 * 2;
                                                                                field397 = var487 == -1 || var487 == 1 ? class127.field1996 : (field397 + class127.field1996) / 2;
                                                                            } else {
                                                                                if (class124.field1957[96]) {
                                                                                    field370 += (-24 - field370) / 2;
                                                                                } else if (class124.field1957[97]) {
                                                                                    field370 += (24 - field370) / 2;
                                                                                } else {
                                                                                    field370 /= 2;
                                                                                }
                                                                                if (class124.field1957[98]) {
                                                                                    field331 += (12 - field331) / 2;
                                                                                } else if (class124.field1957[99]) {
                                                                                    field331 += (-12 - field331) / 2;
                                                                                } else {
                                                                                    field331 /= 2;
                                                                                }
                                                                                field333 = class127.field1999 * 1288203703;
                                                                                field397 = class127.field1996;
                                                                            }
                                                                            field254 = field370 / 2 + field254 & 0x7FF;
                                                                            field328 += field331 / 2;
                                                                            if (field328 < 128) {
                                                                                field328 = 128;
                                                                            }
                                                                            if (field328 > 383) {
                                                                                field328 = 383;
                                                                            }
                                                                            int var488 = Statics.field2467 >> 7;
                                                                            int var489 = Statics.field223 >> 7;
                                                                            int var490 = method487(Statics.field2467, Statics.field223, Statics.field588);
                                                                            int var491 = 0;
                                                                            if (var488 > 3 && var489 > 3 && var488 < 100 && var489 < 100) {
                                                                                for (int var492 = var488 - 4; var492 <= var488 + 4; var492++) {
                                                                                    for (int var493 = var489 - 4; var493 <= var489 + 4; var493++) {
                                                                                        int var494 = Statics.field588;
                                                                                        if (var494 < 3 && (class6.field80[1][var492][var493] & 0x2) == 2) {
                                                                                            var494++;
                                                                                        }
                                                                                        int var495 = var490 - class6.field94[var494][var492][var493];
                                                                                        if (var495 > var491) {
                                                                                            var491 = var495;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var496 = var491 * 192;
                                                                            if (var496 > 98048) {
                                                                                var496 = 98048;
                                                                            }
                                                                            if (var496 < 32768) {
                                                                                var496 = 32768;
                                                                            }
                                                                            if (var496 > field336) {
                                                                                field336 += (var496 - field336) / 24;
                                                                            } else if (var496 < field336) {
                                                                                field336 += (var496 - field336) / 80;
                                                                            }
                                                                            if (field279) {
                                                                                method1826();
                                                                            }
                                                                            for (int var497 = 0; var497 < 5; var497++) {
                                                                                var10002 = field386[var497]++;
                                                                            }
                                                                            int var498 = class127.method2342();
                                                                            int var499 = class124.method485();
                                                                            if (var498 > 15000 && var499 > 15000) {
                                                                                field291 = 250;
                                                                                class127.field2008 = 14500;
                                                                                field284.method2345(28);
                                                                            }
                                                                            field380++;
                                                                            if (field380 > 500) {
                                                                                field380 = 0;
                                                                                int var500 = (int) (Math.random() * 8.0D);
                                                                                if ((var500 & 0x1) == 1) {
                                                                                    field455 += field309;
                                                                                }
                                                                                if ((var500 & 0x2) == 2) {
                                                                                    field310 += field311;
                                                                                }
                                                                                if ((var500 & 0x4) == 4) {
                                                                                    field312 += field459;
                                                                                }
                                                                            }
                                                                            if (field455 < -50) {
                                                                                field309 = 2;
                                                                            }
                                                                            if (field455 > 50) {
                                                                                field309 = -2;
                                                                            }
                                                                            if (field310 < -55) {
                                                                                field311 = 2;
                                                                            }
                                                                            if (field310 > 55) {
                                                                                field311 = -2;
                                                                            }
                                                                            if (field312 < -40) {
                                                                                field459 = 1;
                                                                            }
                                                                            if (field312 > 40) {
                                                                                field459 = -1;
                                                                            }
                                                                            field319++;
                                                                            if (field319 > 500) {
                                                                                field319 = 0;
                                                                                int var501 = (int) (Math.random() * 8.0D);
                                                                                if ((var501 & 0x1) == 1) {
                                                                                    field315 += field364;
                                                                                }
                                                                                if ((var501 & 0x2) == 2) {
                                                                                    field317 += field488;
                                                                                }
                                                                            }
                                                                            if (field315 < -60) {
                                                                                field364 = 2;
                                                                            }
                                                                            if (field315 > 60) {
                                                                                field364 = -2;
                                                                            }
                                                                            if (field317 < -20) {
                                                                                field488 = 1;
                                                                            }
                                                                            if (field317 > 10) {
                                                                                field488 = -1;
                                                                            }
                                                                            for (class34 var502 = (class34) field498.method3189(); var502 != null; var502 = (class34) field498.method3190()) {
                                                                                if ((long) var502.field777 < class103.method2037() / 1000L - 5L) {
                                                                                    if (var502.field781 > 0) {
                                                                                        class10.method551(5, "", var502.field774 + class142.field2374);
                                                                                    }
                                                                                    if (var502.field781 == 0) {
                                                                                        class10.method551(5, "", var502.field774 + class142.field2284);
                                                                                    }
                                                                                    var502.method3312();
                                                                                }
                                                                            }
                                                                            field290++;
                                                                            if (field290 > 50) {
                                                                                field284.method2345(195);
                                                                            }
                                                                            try {
                                                                                if (Statics.field529 != null && field284.field1830 > 0) {
                                                                                    Statics.field529.method2585(field284.field1831, 0, field284.field1830);
                                                                                    field284.field1830 = 0;
                                                                                    field290 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var506) {
                                                                                if (field291 > 0) {
                                                                                    method130();
                                                                                } else {
                                                                                    method565(40);
                                                                                    Statics.field249 = Statics.field529;
                                                                                    Statics.field529 = null;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        var458 = var457.field15;
                                                                        if (var458.field2641 < 0) {
                                                                            break;
                                                                        }
                                                                        var459 = class152.method868(var458.field2537);
                                                                    } while (var459 == null || var459.field2634 == null || var458.field2641 >= var459.field2634.length || var459.field2634[var458.field2641] != var458);
                                                                    class32.method2405(var457, 200000);
                                                                }
                                                            }
                                                            var455 = var454.field15;
                                                            if (var455.field2641 < 0) {
                                                                break;
                                                            }
                                                            var456 = class152.method868(var455.field2537);
                                                        } while (var456 == null || var456.field2634 == null || var455.field2641 >= var456.field2634.length || var456.field2634[var455.field2641] != var455);
                                                        class32.method2405(var454, 200000);
                                                    }
                                                }
                                                var452 = var451.field15;
                                                if (var452.field2641 < 0) {
                                                    break;
                                                }
                                                var453 = class152.method868(var452.field2537);
                                            } while (var453 == null || var453.field2634 == null || var452.field2641 >= var453.field2634.length || var453.field2634[var452.field2641] != var452);
                                            class32.method2405(var451, 200000);
                                        }
                                    }
                                } else if (field291 > 0) {
                                    method130();
                                } else {
                                    method565(40);
                                    Statics.field249 = Statics.field529;
                                    Statics.field529 = null;
                                }
                            }
                            break;
                        }
                        field284.method2345(21);
                        field284.method2214(0);
                        int var380 = field284.field1830;
                        class189.method3326(field284);
                        field284.method2098(field284.field1830 - var380);
                    }
                }
            }
        } else if (field248 == 40 || field248 == 45) {
            method620();
        }
    }

    @ObfuscatedName("client.v(B)V")
    public final void method418() {
        boolean var1;
        label157: {
            try {
                if (class161.field2708 == 2) {
                    if (Statics.field1241 == null) {
                        Statics.field1241 = class158.method2961(Statics.field2716, Statics.field2025, Statics.field1087);
                        if (Statics.field1241 == null) {
                            var1 = false;
                            break label157;
                        }
                    }
                    if (Statics.field2651 == null) {
                        Statics.field2651 = new class53(Statics.field2706, Statics.field2711);
                    }
                    if (Statics.field2714.method3136(Statics.field1241, Statics.field2707, Statics.field2651, 22050)) {
                        Statics.field2714.method3037();
                        Statics.field2714.method3069(Statics.field2710);
                        Statics.field2714.method3067(Statics.field1241, Statics.field1851);
                        class161.field2708 = 0;
                        Statics.field1241 = null;
                        Statics.field2651 = null;
                        Statics.field2716 = null;
                        var1 = true;
                        break label157;
                    }
                }
            } catch (Exception var25) {
                var25.printStackTrace();
                Statics.field2714.method3038();
                class161.field2708 = 0;
                Statics.field1241 = null;
                Statics.field2651 = null;
                Statics.field2716 = null;
            }
            var1 = false;
        }
        if (var1 && field480 && Statics.field970 != null) {
            Statics.field970.method975();
        }
        if (field2053) {
            class124.method619(Statics.field510);
            class127.method1743(Statics.field510);
            if (Statics.field1414 != null) {
                Statics.field1414.method2414(Statics.field510);
            }
            this.method2638();
            class124.method787(Statics.field510);
            class127.method237(Statics.field510);
            if (Statics.field1414 != null) {
                Statics.field1414.method2412(Statics.field510);
            }
        }
        if (field248 == 0) {
            int var4 = class28.field645;
            String var5 = class28.field632;
            Color var6 = null;
            try {
                Graphics var7 = Statics.field510.getGraphics();
                if (Statics.field1787 == null) {
                    Statics.field1787 = new Font("Helvetica", 1, 13);
                    Statics.field1876 = Statics.field510.getFontMetrics(Statics.field1787);
                }
                if (field2041) {
                    field2041 = false;
                    var7.setColor(Color.black);
                    var7.fillRect(0, 0, Statics.field927, Statics.field630);
                }
                if (var6 == null) {
                    var6 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1082 == null) {
                        Statics.field1082 = Statics.field510.createImage(304, 34);
                    }
                    Graphics var8 = Statics.field1082.getGraphics();
                    var8.setColor(var6);
                    var8.drawRect(0, 0, 303, 33);
                    var8.fillRect(2, 2, var4 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(1, 1, 301, 31);
                    var8.fillRect(var4 * 3 + 2, 2, 300 - var4 * 3, 30);
                    var8.setFont(Statics.field1787);
                    var8.setColor(Color.white);
                    var8.drawString(var5, (304 - Statics.field1876.stringWidth(var5)) / 2, 22);
                    var7.drawImage(Statics.field1082, Statics.field927 / 2 - 152, Statics.field630 / 2 - 18, (ImageObserver) null);
                } catch (Exception var21) {
                    int var10 = Statics.field927 / 2 - 152;
                    int var11 = Statics.field630 / 2 - 18;
                    var7.setColor(var6);
                    var7.drawRect(var10, var11, 303, 33);
                    var7.fillRect(var10 + 2, var11 + 2, var4 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                    var7.fillRect(var4 * 3 + var10 + 2, var11 + 2, 300 - var4 * 3, 30);
                    var7.setFont(Statics.field1787);
                    var7.setColor(Color.white);
                    var7.drawString(var5, var10 + (304 - Statics.field1876.stringWidth(var5)) / 2, var11 + 22);
                }
            } catch (Exception var22) {
                Statics.field510.repaint();
            }
        } else if (field248 == 5) {
            class28.method27(Statics.field875, Statics.field1848);
        } else if (field248 == 10 || field248 == 11) {
            class28.method27(Statics.field875, Statics.field1848);
        } else if (field248 == 20) {
            class28.method27(Statics.field875, Statics.field1848);
        } else if (field248 == 25) {
            if (field301 == 1) {
                if (field471 > field298) {
                    field298 = field471;
                }
                int var13 = (field298 * 50 - field471 * 50) / field298;
                method127(class142.field2358 + class2.field25 + class2.field22 + var13 + "%" + class2.field28, false);
            } else if (field301 == 2) {
                if (field299 > field300) {
                    field300 = field299;
                }
                int var14 = (field300 * 50 - field299 * 50) / field300 + 50;
                method127(class142.field2358 + class2.field25 + class2.field22 + var14 + "%" + class2.field28, false);
            } else {
                method127(class142.field2358, false);
            }
        } else if (field248 == 30) {
            method1572();
        } else if (field248 == 40) {
            method127(class142.field2179 + class2.field25 + class142.field2147, false);
        } else if (field248 == 45) {
            method127(class142.field2346, false);
        }
        if (field248 == 30 && field457 == 0 && !field2041) {
            try {
                Graphics var15 = Statics.field510.getGraphics();
                for (int var16 = 0; var16 < field448; var16++) {
                    if (field314[var16]) {
                        Statics.field1333.method1345(var15, field316[var16], field362[var16], field399[var16], field423[var16]);
                        field314[var16] = false;
                    }
                }
            } catch (Exception var24) {
                Statics.field510.repaint();
            }
        } else if (field248 > 0) {
            try {
                Graphics var18 = Statics.field510.getGraphics();
                Statics.field1333.method1330(var18, 0, 0);
                field2041 = false;
                for (int var19 = 0; var19 < field448; var19++) {
                    field314[var19] = false;
                }
            } catch (Exception var23) {
                Statics.field510.repaint();
            }
        }
    }

    @ObfuscatedName("client.z(I)V")
    public final void method186() {
        if (Statics.field2957 != null) {
            Statics.field2957.field172 = false;
        }
        Statics.field2957 = null;
        if (Statics.field529 != null) {
            Statics.field529.method2583();
            Statics.field529 = null;
        }
        if (class124.field1960 != null) {
            class124 var1 = class124.field1960;
            synchronized (class124.field1960) {
                class124.field1960 = null;
            }
        }
        class127.method159();
        Statics.field1414 = null;
        if (Statics.field970 != null) {
            Statics.field970.method967();
        }
        if (Statics.field775 != null) {
            Statics.field775.method967();
        }
        if (Statics.field2498 != null) {
            Statics.field2498.method2583();
        }
        class149.method1830();
        class136.method2382();
    }

    @ObfuscatedName("ah.j(II)V")
    public static void method565(int arg0) {
        if (field248 == arg0) {
            return;
        }
        if (field248 == 0) {
            class131.method1037();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field276 = 0;
            field277 = 0;
            field278 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field249 != null) {
            Statics.field249.method2583();
            Statics.field249 = null;
        }
        if (field248 == 25) {
            field301 = 0;
            field471 = 0;
            field298 = 1;
            field299 = 0;
            field300 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method457(Statics.field510, Statics.field2110, Statics.field2441, true, 0);
        } else if (arg0 == 20) {
            class28.method457(Statics.field510, Statics.field2110, Statics.field2441, true, field248 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method457(Statics.field510, Statics.field2110, Statics.field2441, false, 4);
        } else {
            class28.method2030();
        }
        field248 = arg0;
    }

    @ObfuscatedName("client.u(I)V")
    public void method281() {
        if (field248 == 1000) {
            return;
        }
        long var1 = class103.method2037();
        int var3 = (int) (var1 - Statics.field2503);
        Statics.field2503 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class150.field2494 += var3;
        boolean var4;
        if (class150.field2497 == 0 && class150.field2492 == 0 && class150.field2495 == 0 && class150.field2490 == 0) {
            var4 = true;
        } else if (Statics.field2498 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class150.field2494 > 30000) {
                        throw new IOException();
                    }
                    while (class150.field2492 < 20 && class150.field2490 > 0) {
                        class151 var5 = (class151) class150.field2489.method3202();
                        class107 var6 = new class107(4);
                        var6.method2214(1);
                        var6.method2176((int) var5.field2864);
                        Statics.field2498.method2585(var6.field1831, 0, 4);
                        class150.field2496.method3212(var5, var5.field2864);
                        class150.field2490--;
                        class150.field2492++;
                    }
                    while (class150.field2497 < 20 && class150.field2495 > 0) {
                        class151 var7 = (class151) class150.field2508.method3283();
                        class107 var8 = new class107(4);
                        var8.method2214(0);
                        var8.method2176((int) var7.field2864);
                        Statics.field2498.method2585(var8.field1831, 0, 4);
                        var7.method3299();
                        class150.field2488.method3212(var7, var7.field2864);
                        class150.field2495--;
                        class150.field2497++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2498.method2582();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class150.field2494 = 0;
                        byte var11 = 0;
                        if (Statics.field2114 == null) {
                            var11 = 8;
                        } else if (class150.field2500 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class150.field2499.field1830;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2498.method2586(class150.field2499.field1831, class150.field2499.field1830, var12);
                            if (class150.field2486 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class150.field2499.field1831[class150.field2499.field1830 + var13] ^= class150.field2486;
                                }
                            }
                            class150.field2499.field1830 += var12;
                            if (class150.field2499.field1830 < var11) {
                                break;
                            }
                            if (Statics.field2114 == null) {
                                class150.field2499.field1830 = 0;
                                int var14 = class150.field2499.method2101();
                                int var15 = class150.field2499.method2103();
                                int var16 = class150.field2499.method2101();
                                int var17 = class150.field2499.method2106();
                                long var18 = (long) ((var14 << 16) + var15);
                                class151 var20 = (class151) class150.field2496.method3204(var18);
                                Statics.field2487 = true;
                                if (var20 == null) {
                                    var20 = (class151) class150.field2488.method3204(var18);
                                    Statics.field2487 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2114 = var20;
                                Statics.field1504 = new class107(var17 + var21 + Statics.field2114.field2511);
                                Statics.field1504.method2214(var16);
                                Statics.field1504.method2090(var17);
                                class150.field2500 = 8;
                                class150.field2499.field1830 = 0;
                            } else if (class150.field2500 == 0) {
                                if (class150.field2499.field1831[0] == -1) {
                                    class150.field2500 = 1;
                                    class150.field2499.field1830 = 0;
                                } else {
                                    Statics.field2114 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1504.field1831.length - Statics.field2114.field2511;
                            int var23 = 512 - class150.field2500;
                            if (var23 > var22 - Statics.field1504.field1830) {
                                var23 = var22 - Statics.field1504.field1830;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2498.method2586(Statics.field1504.field1831, Statics.field1504.field1830, var23);
                            if (class150.field2486 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1504.field1831[Statics.field1504.field1830 + var24] ^= class150.field2486;
                                }
                            }
                            Statics.field1504.field1830 += var23;
                            class150.field2500 += var23;
                            if (Statics.field1504.field1830 == var22) {
                                if (Statics.field2114.field2864 == 16711935L) {
                                    Statics.field598 = Statics.field1504;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class147 var26 = class150.field2502[var25];
                                        if (var26 != null) {
                                            Statics.field598.field1830 = var25 * 8 + 5;
                                            int var27 = Statics.field598.method2106();
                                            int var28 = Statics.field598.method2106();
                                            var26.method2797(var27, var28);
                                        }
                                    }
                                } else {
                                    class150.field2501.reset();
                                    class150.field2501.update(Statics.field1504.field1831, 0, var22);
                                    int var29 = (int) class150.field2501.getValue();
                                    if (Statics.field2114.field2509 != var29) {
                                        try {
                                            Statics.field2498.method2583();
                                        } catch (Exception var35) {
                                        }
                                        class150.field2491++;
                                        Statics.field2498 = null;
                                        class150.field2486 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class150.field2491 = 0;
                                    class150.field2505 = 0;
                                    Statics.field2114.field2513.method2813((int) (Statics.field2114.field2864 & 0xFFFFL), Statics.field1504.field1831, (Statics.field2114.field2864 & 0xFF0000L) == 16711680L, Statics.field2487);
                                }
                                Statics.field2114.method3316();
                                if (Statics.field2487) {
                                    class150.field2492--;
                                } else {
                                    class150.field2497--;
                                }
                                class150.field2500 = 0;
                                Statics.field2114 = null;
                                Statics.field1504 = null;
                            } else {
                                if (class150.field2500 != 512) {
                                    break;
                                }
                                class150.field2500 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2498.method2583();
                } catch (Exception var34) {
                }
                class150.field2505++;
                Statics.field2498 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method361();
        }
    }

    @ObfuscatedName("client.g(B)V")
    public void method361() {
        if (class150.field2491 >= 4) {
            this.method2631("js5crc");
            field248 = 1000;
            return;
        }
        if (class150.field2505 >= 4) {
            if (field248 <= 5) {
                this.method2631("js5io");
                field248 = 1000;
                return;
            }
            field272 = 3000;
            class150.field2505 = 3;
        }
        if (--field272 + 1 > 0) {
            return;
        }
        try {
            if (field369 == 0) {
                Statics.field59 = Statics.field2036.method2472(Statics.field928, Statics.field623);
                field369++;
            }
            if (field369 == 1) {
                if (Statics.field59.field2061 == 2) {
                    this.method344(-1);
                    return;
                }
                if (Statics.field59.field2061 == 1) {
                    field369++;
                }
            }
            if (field369 == 2) {
                Statics.field1284 = new class130((Socket) Statics.field59.field2065, Statics.field2036);
                class107 var1 = new class107(5);
                var1.method2214(15);
                var1.method2090(58);
                Statics.field1284.method2585(var1.field1831, 0, 5);
                field369++;
                Statics.field273 = class103.method2037();
            }
            if (field369 == 3) {
                if (field248 <= 5 || Statics.field1284.method2582() > 0) {
                    int var2 = Statics.field1284.method2587();
                    if (var2 != 0) {
                        this.method344(var2);
                        return;
                    }
                    field369++;
                } else if (class103.method2037() - Statics.field273 > 30000L) {
                    this.method344(-2);
                    return;
                }
            }
            if (field369 == 4) {
                class150.method1745(Statics.field1284, field248 > 20);
                Statics.field59 = null;
                Statics.field1284 = null;
                field369 = 0;
                field303 = 0;
            }
        } catch (IOException var4) {
            this.method344(-3);
        }
    }

    @ObfuscatedName("client.a(IB)V")
    public void method344(int arg0) {
        Statics.field59 = null;
        Statics.field1284 = null;
        field369 = 0;
        if (Statics.field623 == Statics.field1567) {
            Statics.field623 = Statics.field2102;
        } else {
            Statics.field623 = Statics.field1567;
        }
        field303++;
        if (field303 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field248 <= 5) {
                this.method2631("js5connect_full");
                field248 = 1000;
            } else {
                field272 = 3000;
            }
        } else if (field303 >= 2 && arg0 == 6) {
            this.method2631("js5connect_outofdate");
            field248 = 1000;
        } else if (field303 >= 4) {
            if (field248 <= 5) {
                this.method2631("js5connect");
                field248 = 1000;
            } else {
                field272 = 3000;
            }
        }
    }

    @ObfuscatedName("af.c(I)V")
    public static void method548() {
        if (field496 == 0) {
            Statics.field62 = new class79(4, 104, 104, class6.field94);
            for (int var0 = 0; var0 < 4; var0++) {
                field460[var0] = new class197(104, 104);
            }
            Statics.field513 = new class72(512, 512);
            class28.field632 = class142.field2148;
            class28.field645 = 5;
            field496 = 20;
        } else if (field496 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1461[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1606(var1, 500, 800, 512, 334);
            class28.field632 = class142.field2192;
            class28.field645 = 10;
            field496 = 30;
        } else if (field496 == 30) {
            Statics.field628 = method2543(0, false, true, true);
            Statics.field2504 = method2543(1, false, true, true);
            Statics.field708 = method2543(2, true, false, true);
            Statics.field915 = method2543(3, false, true, true);
            Statics.field592 = method2543(4, false, true, true);
            Statics.field2428 = method2543(5, true, true, true);
            Statics.field2401 = method2543(6, true, true, false);
            Statics.field2481 = method2543(7, false, true, true);
            Statics.field2441 = method2543(8, false, true, true);
            Statics.field274 = method2543(9, false, true, true);
            Statics.field2110 = method2543(10, false, true, true);
            Statics.field2924 = method2543(11, false, true, true);
            Statics.field175 = method2543(12, false, true, true);
            Statics.field1986 = method2543(13, true, false, true);
            Statics.field144 = method2543(14, false, true, false);
            Statics.field1044 = method2543(15, false, true, true);
            class28.field632 = class142.field2150;
            class28.field645 = 20;
            field496 = 40;
        } else if (field496 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field628.method2807() * 4 / 100;
            int var8 = var7 + Statics.field2504.method2807() * 4 / 100;
            int var9 = var8 + Statics.field708.method2807() * 2 / 100;
            int var10 = var9 + Statics.field915.method2807() * 2 / 100;
            int var11 = var10 + Statics.field592.method2807() * 6 / 100;
            int var12 = var11 + Statics.field2428.method2807() * 4 / 100;
            int var13 = var12 + Statics.field2401.method2807() * 2 / 100;
            int var14 = var13 + Statics.field2481.method2807() * 60 / 100;
            int var15 = var14 + Statics.field2441.method2807() * 2 / 100;
            int var16 = var15 + Statics.field274.method2807() * 2 / 100;
            int var17 = var16 + Statics.field2110.method2807() * 2 / 100;
            int var18 = var17 + Statics.field2924.method2807() * 2 / 100;
            int var19 = var18 + Statics.field175.method2807() * 2 / 100;
            int var20 = var19 + Statics.field1986.method2807() * 2 / 100;
            int var21 = var20 + Statics.field144.method2807() * 2 / 100;
            int var22 = var21 + Statics.field1044.method2807() * 2 / 100;
            if (var22 == 100) {
                class28.field632 = class142.field2146;
                class28.field645 = 30;
                field496 = 45;
            } else {
                if (var22 != 0) {
                    class28.field632 = class142.field2151 + var22 + "%";
                }
                class28.field645 = 30;
            }
        } else if (field496 == 45) {
            boolean var23 = !field246;
            Statics.field1085 = 22050;
            Statics.field1061 = var23;
            Statics.field1086 = 2;
            class162 var24 = new class162();
            var24.method3083(9, 128);
            Statics.field970 = class50.method590(Statics.field2036, Statics.field510, 0, 22050);
            Statics.field970.method968(var24);
            class147 var25 = Statics.field1044;
            class147 var26 = Statics.field144;
            class147 var27 = Statics.field592;
            Statics.field2707 = var25;
            Statics.field2711 = var26;
            Statics.field2706 = var27;
            Statics.field2714 = var24;
            Statics.field775 = class50.method590(Statics.field2036, Statics.field510, 1, 2048);
            Statics.field1445 = new class49();
            Statics.field775.method968(Statics.field1445);
            Statics.field605 = new class68(22050, Statics.field1085);
            class28.field632 = class142.field2153;
            class28.field645 = 35;
            field496 = 50;
        } else if (field496 == 50) {
            int var28 = 0;
            if (Statics.field1848 == null) {
                class147 var29 = Statics.field2441;
                class147 var30 = Statics.field1986;
                int var31 = var29.method2724("p11_full");
                int var32 = var29.method2725(var31, "");
                class193 var33;
                if (class70.method1027(var29, var31, var32)) {
                    var33 = class70.method155(var30.method2709(var31, var32));
                } else {
                    var33 = null;
                }
                Statics.field1848 = var33;
            } else {
                var28++;
            }
            if (Statics.field1083 == null) {
                class147 var35 = Statics.field2441;
                class147 var36 = Statics.field1986;
                int var37 = var35.method2724("p12_full");
                int var38 = var35.method2725(var37, "");
                class193 var39;
                if (class70.method1027(var35, var37, var38)) {
                    var39 = class70.method155(var36.method2709(var37, var38));
                } else {
                    var39 = null;
                }
                Statics.field1083 = var39;
            } else {
                var28++;
            }
            if (Statics.field875 == null) {
                class147 var41 = Statics.field2441;
                class147 var42 = Statics.field1986;
                int var43 = var41.method2724("b12_full");
                int var44 = var41.method2725(var43, "");
                class193 var45;
                if (class70.method1027(var41, var43, var44)) {
                    var45 = class70.method155(var42.method2709(var43, var44));
                } else {
                    var45 = null;
                }
                Statics.field875 = var45;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class28.field632 = class142.field2154 + var28 * 100 / 3 + "%";
                class28.field645 = 40;
            } else {
                Statics.field19 = new class145(true);
                class28.field632 = class142.field2155;
                class28.field645 = 40;
                field496 = 60;
            }
        } else if (field496 == 60) {
            int var47 = class28.method161(Statics.field2110, Statics.field2441);
            int var48 = class28.method771();
            if (var47 < var48) {
                class28.field632 = class142.field2156 + var47 * 100 / var48 + "%";
                class28.field645 = 50;
            } else {
                class28.field632 = class142.field2157;
                class28.field645 = 50;
                method565(5);
                field496 = 70;
            }
        } else if (field496 == 70) {
            if (Statics.field708.method2713()) {
                class147 var49 = Statics.field708;
                Statics.field951 = var49;
                class37.method108(Statics.field708);
                class40.method126(Statics.field708, Statics.field2481);
                class36.method137(Statics.field708, Statics.field2481, field246);
                class147 var50 = Statics.field708;
                class147 var51 = Statics.field2481;
                Statics.field814 = var50;
                Statics.field783 = var51;
                class147 var52 = Statics.field708;
                class147 var53 = Statics.field2481;
                boolean var54 = field245;
                class193 var55 = Statics.field1848;
                Statics.field1032 = var52;
                Statics.field997 = var53;
                Statics.field998 = var54;
                Statics.field1032.method2719(10);
                Statics.field1002 = var55;
                class38.method136(Statics.field708, Statics.field628, Statics.field2504);
                class39.method507(Statics.field708, Statics.field2481);
                class147 var56 = Statics.field708;
                Statics.field976 = var56;
                class147 var57 = Statics.field708;
                Statics.field1051 = var57;
                Statics.field1045 = Statics.field1051.method2719(16);
                class152.method1835(Statics.field915, Statics.field2481, Statics.field2441, Statics.field1986);
                class147 var58 = Statics.field708;
                Statics.field2663 = var58;
                class43.method2531(Statics.field708);
                class28.field632 = class142.field2159;
                class28.field645 = 60;
                field496 = 80;
            } else {
                class28.field632 = class142.field2158 + Statics.field708.method2801() + "%";
                class28.field645 = 60;
            }
        } else if (field496 == 80) {
            int var59 = 0;
            if (Statics.field691 == null) {
                Statics.field691 = class70.method715(Statics.field2441, "compass", "");
            } else {
                var59++;
            }
            if (Statics.field1071 == null) {
                Statics.field1071 = class70.method715(Statics.field2441, "mapedge", "");
            } else {
                var59++;
            }
            if (Statics.field1905 == null) {
                Statics.field1905 = class70.method508(Statics.field2441, "mapscene", "");
            } else {
                var59++;
            }
            if (Statics.field511 == null) {
                Statics.field511 = class70.method82(Statics.field2441, "mapfunction", "");
            } else {
                var59++;
            }
            if (Statics.field2514 == null) {
                Statics.field2514 = class70.method82(Statics.field2441, "hitmarks", "");
            } else {
                var59++;
            }
            if (Statics.field1497 == null) {
                Statics.field1497 = class70.method82(Statics.field2441, "headicons_pk", "");
            } else {
                var59++;
            }
            if (Statics.field2124 == null) {
                Statics.field2124 = class70.method82(Statics.field2441, "headicons_prayer", "");
            } else {
                var59++;
            }
            if (Statics.field955 == null) {
                Statics.field955 = class70.method82(Statics.field2441, "headicons_hint", "");
            } else {
                var59++;
            }
            if (Statics.field158 == null) {
                Statics.field158 = class70.method82(Statics.field2441, "mapmarker", "");
            } else {
                var59++;
            }
            if (Statics.field7 == null) {
                Statics.field7 = class70.method82(Statics.field2441, "cross", "");
            } else {
                var59++;
            }
            if (Statics.field126 == null) {
                Statics.field126 = class70.method82(Statics.field2441, "mapdots", "");
            } else {
                var59++;
            }
            if (Statics.field2465 == null) {
                Statics.field2465 = class70.method508(Statics.field2441, "scrollbar", "");
            } else {
                var59++;
            }
            if (Statics.field2472 == null) {
                Statics.field2472 = class70.method508(Statics.field2441, "mod_icons", "");
            } else {
                var59++;
            }
            if (Statics.field504 == null) {
                Statics.field504 = class70.method506(Statics.field2441, "mapback", "");
            } else {
                var59++;
            }
            if (var59 < 14) {
                class28.field632 = class142.field2160 + var59 * 100 / 14 + "%";
                class28.field645 = 70;
            } else {
                Statics.field2913 = Statics.field2472;
                Statics.field1071.method1486();
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 41.0D) - 20;
                for (int var64 = 0; var64 < Statics.field511.length; var64++) {
                    Statics.field511[var64].method1418(var60 + var63, var61 + var63, var62 + var63);
                }
                Statics.field1905[0].method1546(var60 + var63, var61 + var63, var62 + var63);
                Statics.field1861 = new int[33];
                Statics.field682 = new int[33];
                Statics.field176 = new int[151];
                Statics.field466 = new int[151];
                for (int var65 = 0; var65 < 33; var65++) {
                    int var66 = 999;
                    int var67 = 0;
                    for (int var68 = 0; var68 < 34; var68++) {
                        if (Statics.field504.field1311[Statics.field504.field1308 * var65 + var68] == 0) {
                            if (var66 == 999) {
                                var66 = var68;
                            }
                        } else if (var66 != 999) {
                            var67 = var68;
                            break;
                        }
                    }
                    Statics.field1861[var65] = var66;
                    Statics.field682[var65] = var67 - var66;
                }
                for (int var69 = 5; var69 < 156; var69++) {
                    int var70 = 999;
                    int var71 = 0;
                    for (int var72 = 25; var72 < 172; var72++) {
                        if (Statics.field504.field1311[Statics.field504.field1308 * var69 + var72] == 0 && var72 > 34 || var69 > 34) {
                            if (var70 == 999) {
                                var70 = var72;
                            }
                        } else if (var70 != 999) {
                            var71 = var72;
                            break;
                        }
                    }
                    Statics.field176[var69 - 5] = var70 - 25;
                    Statics.field466[var69 - 5] = var71 - var70;
                }
                class28.field632 = class142.field2161;
                class28.field645 = 70;
                field496 = 90;
            }
        } else if (field496 == 90) {
            if (Statics.field274.method2713()) {
                class88 var73 = new class88(Statics.field274, Statics.field2441, 20, 0.8D, field246 ? 64 : 128);
                class84.method1755(var73);
                class84.method1756(0.8D);
                class28.field632 = class142.field2163;
                class28.field645 = 90;
                field496 = 110;
            } else {
                class28.field632 = class142.field2381 + Statics.field274.method2801() + "%";
                class28.field645 = 90;
            }
        } else if (field496 == 110) {
            Statics.field2957 = new class12();
            Statics.field2036.method2468(Statics.field2957, 10);
            class28.field632 = class142.field2237;
            class28.field645 = 94;
            field496 = 120;
        } else if (field496 == 120) {
            if (Statics.field2110.method2711("huffman", "")) {
                class102 var74 = new class102(Statics.field2110.method2726("huffman", ""));
                Statics.field2893 = var74;
                class28.field632 = class142.field2236;
                class28.field645 = 96;
                field496 = 130;
            } else {
                class28.field632 = class142.field2259 + "%";
                class28.field645 = 96;
            }
        } else if (field496 == 130) {
            if (!Statics.field915.method2713()) {
                class28.field632 = class142.field2167 + Statics.field915.method2801() * 4 / 5 + "%";
                class28.field645 = 100;
            } else if (!Statics.field175.method2713()) {
                class28.field632 = class142.field2167 + (80 + Statics.field175.method2801() / 6) + "%";
                class28.field645 = 100;
            } else if (Statics.field1986.method2713()) {
                class28.field632 = class142.field2168;
                class28.field645 = 100;
                field496 = 140;
            } else {
                class28.field632 = class142.field2167 + (96 + Statics.field1986.method2801() / 20) + "%";
                class28.field645 = 100;
            }
        } else if (field496 == 140) {
            method565(10);
        }
    }

    @ObfuscatedName("dz.w(IZZZI)Leo;")
    public static class147 method2543(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2086 != null) {
            var4 = new class121(arg0, class136.field2086, Statics.field185[arg0], 1000000);
        }
        return new class147(var4, Statics.field610, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ar.l(I)V")
    public static final void method620() {
        try {
            if (field276 == 0) {
                if (Statics.field529 != null) {
                    Statics.field529.method2583();
                    Statics.field529 = null;
                }
                Statics.field202 = null;
                field295 = false;
                field277 = 0;
                field276 = 1;
            }
            if (field276 == 1) {
                if (Statics.field202 == null) {
                    Statics.field202 = Statics.field2036.method2472(Statics.field928, Statics.field623);
                }
                if (Statics.field202.field2061 == 2) {
                    throw new IOException();
                }
                if (Statics.field202.field2061 == 1) {
                    Statics.field529 = new class130((Socket) Statics.field202.field2065, Statics.field2036);
                    Statics.field202 = null;
                    field276 = 2;
                }
            }
            if (field276 == 2) {
                field284.field1830 = 0;
                field284.method2214(14);
                Statics.field529.method2585(field284.field1831, 0, 1);
                field403.field1830 = 0;
                field276 = 3;
            }
            if (field276 == 3) {
                if (Statics.field970 != null) {
                    Statics.field970.method963();
                }
                if (Statics.field775 != null) {
                    Statics.field775.method963();
                }
                int var0 = Statics.field529.method2587();
                if (Statics.field970 != null) {
                    Statics.field970.method963();
                }
                if (Statics.field775 != null) {
                    Statics.field775.method963();
                }
                if (var0 != 0) {
                    method545(var0);
                    return;
                }
                field403.field1830 = 0;
                field276 = 5;
            }
            if (field276 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field284.field1830 = 0;
                field284.method2214(1);
                field284.method2214(class28.field666.method451());
                field284.method2090(var1[0]);
                field284.method2090(var1[1]);
                field284.method2090(var1[2]);
                field284.method2090(var1[3]);
                switch(class28.field666.field2396) {
                    case 0:
                        field284.method2090((Integer) Statics.field1815.field133.get(class199.method550(class28.field651)));
                        field284.field1830 += 4;
                        break;
                    case 1:
                        field284.field1830 += 8;
                        break;
                    case 2:
                    case 3:
                        field284.method2176(Statics.field506);
                        field284.field1830 += 5;
                }
                field284.method2092(class28.field652);
                field284.method2119(class5.field70, class5.field68);
                field285.field1830 = 0;
                if (field248 == 40) {
                    field285.method2214(18);
                } else {
                    field285.method2214(16);
                }
                field285.method2251(0);
                int var2 = field285.field1830;
                field285.method2090(58);
                field285.method2095(field284.field1831, 0, field284.field1830);
                int var3 = field285.field1830;
                field285.method2092(class28.field651);
                field285.method2214(field246 ? 1 : 0);
                class136.method133(field285);
                class107 var4 = new class107(Statics.field19.method2697());
                Statics.field19.method2696(var4);
                field285.method2095(var4.field1831, 0, var4.field1831.length);
                field285.method2090(Statics.field628.field2448);
                field285.method2090(Statics.field2504.field2448);
                field285.method2090(Statics.field708.field2448);
                field285.method2090(Statics.field915.field2448);
                field285.method2090(Statics.field592.field2448);
                field285.method2090(Statics.field2428.field2448);
                field285.method2090(Statics.field2401.field2448);
                field285.method2090(Statics.field2481.field2448);
                field285.method2090(Statics.field2441.field2448);
                field285.method2090(Statics.field274.field2448);
                field285.method2090(Statics.field2110.field2448);
                field285.method2090(Statics.field2924.field2448);
                field285.method2090(Statics.field175.field2448);
                field285.method2090(Statics.field1986.field2448);
                field285.method2090(Statics.field144.field2448);
                field285.method2090(Statics.field1044.field2448);
                field285.method2117(var1, var3, field285.field1830);
                field285.method2085(field285.field1830 - var2);
                Statics.field529.method2585(field285.field1831, 0, field285.field1830);
                field284.method2353(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field403.method2353(var1);
                field276 = 6;
            }
            if (field276 == 6 && Statics.field529.method2582() > 0) {
                int var6 = Statics.field529.method2587();
                if (var6 == 21 && field248 == 20) {
                    field276 = 7;
                } else if (var6 == 2) {
                    field276 = 9;
                } else if (var6 == 15 && field248 == 40) {
                    method140();
                    return;
                } else if (var6 == 23 && field278 < 1) {
                    field278++;
                    field276 = 0;
                } else {
                    method545(var6);
                    return;
                }
            }
            if (field276 == 7 && Statics.field529.method2582() > 0) {
                field391 = (Statics.field529.method2587() + 3) * 60;
                field276 = 8;
            }
            if (field276 == 8) {
                field277 = 0;
                Statics.method13(class142.field2261, class142.field2173, field391 / 60 + class142.field2309);
                if (--field391 <= 0) {
                    field276 = 0;
                }
            } else {
                if (field276 == 9 && Statics.field529.method2582() >= 13) {
                    boolean var7 = Statics.field529.method2587() == 1;
                    Statics.field529.method2586(field403.field1831, 0, 4);
                    field403.field1830 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field403.method2350() << 24;
                        int var10 = var9 | field403.method2350() << 16;
                        int var11 = var10 | field403.method2350() << 8;
                        int var12 = var11 | field403.method2350();
                        int var13 = class199.method550(class28.field651);
                        if (Statics.field1815.field133.size() >= 10 && !Statics.field1815.field133.containsKey(var13)) {
                            Iterator var14 = Statics.field1815.field133.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field1815.field133.put(var13, var12);
                        class9.method2668();
                    }
                    field432 = Statics.field529.method2587();
                    field415 = Statics.field529.method2587() == 1;
                    field390 = Statics.field529.method2587();
                    field390 <<= 0x8;
                    field390 += Statics.field529.method2587();
                    field271 = Statics.field529.method2587();
                    Statics.field529.method2586(field403.field1831, 0, 1);
                    field403.field1830 = 0;
                    field376 = field403.method2350();
                    Statics.field529.method2586(field403.field1831, 0, 2);
                    field403.field1830 = 0;
                    field371 = field403.method2103();
                    if (field271 == 1) {
                        try {
                            class119.method2430(Statics.field239, "zap");
                        } catch (Throwable var33) {
                        }
                    } else {
                        try {
                            class119.method2430(Statics.field239, "unzap");
                        } catch (Throwable var32) {
                        }
                    }
                    field276 = 10;
                }
                if (field276 != 10) {
                    field277++;
                    if (field277 > 2000) {
                        if (field278 < 1) {
                            if (Statics.field623 == Statics.field1567) {
                                Statics.field623 = Statics.field2102;
                            } else {
                                Statics.field623 = Statics.field1567;
                            }
                            field278++;
                            field276 = 0;
                        } else {
                            method545(-3);
                        }
                    }
                } else if (Statics.field529.method2582() >= field371) {
                    field403.field1830 = 0;
                    Statics.field529.method2586(field403.field1831, 0, field371);
                    field251 = -1L;
                    field384 = -1;
                    Statics.field2957.field171 = 0;
                    Statics.field1267 = true;
                    field255 = true;
                    field476 = -1L;
                    class189.method2904();
                    field284.field1830 = 0;
                    field403.field1830 = 0;
                    field376 = -1;
                    field292 = -1;
                    field393 = -1;
                    field294 = -1;
                    field289 = 0;
                    field257 = 0;
                    field291 = 0;
                    field258 = 0;
                    field388 = 0;
                    field387 = false;
                    class127.field2008 = 0;
                    class10.field141.clear();
                    class10.field143.method3221();
                    class10.field140.method3265();
                    class10.field142 = 0;
                    field421 = 0;
                    field401 = false;
                    field483 = 0;
                    field455 = (int) (Math.random() * 100.0D) - 50;
                    field310 = (int) (Math.random() * 110.0D) - 55;
                    field312 = (int) (Math.random() * 80.0D) - 40;
                    field315 = (int) (Math.random() * 120.0D) - 60;
                    field317 = (int) (Math.random() * 30.0D) - 20;
                    field254 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field477 = 0;
                    field470 = -1;
                    field475 = 0;
                    field503 = 0;
                    field360 = class18.field507;
                    field293 = 0;
                    field281 = 0;
                    for (int var17 = 0; var17 < 2048; var17++) {
                        field268[var17] = null;
                        field320[var17] = null;
                    }
                    for (int var18 = 0; var18 < 32768; var18++) {
                        field280[var18] = null;
                    }
                    Statics.field1452 = field268[2047] = new class3();
                    field378 = -1;
                    field381.method3241();
                    field405.method3241();
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                field379[var19][var20][var21] = null;
                            }
                        }
                    }
                    field296 = new class177();
                    field352 = 0;
                    field495 = 0;
                    field499 = 0;
                    for (int var22 = 0; var22 < Statics.field1045; var22++) {
                        class46 var23 = class46.method583(var22);
                        if (var23 != null) {
                            class154.field2658[var22] = 0;
                            class154.field2650[var22] = 0;
                        }
                    }
                    for (int var24 = 0; var24 < field441.length; var24++) {
                        field441[var24] = -1;
                    }
                    field414 = -1;
                    if (field406 != -1) {
                        int var25 = field406;
                        if (var25 != -1 && Statics.field2517[var25]) {
                            Statics.field2518.method2721(var25);
                            if (Statics.field2595[var25] != null) {
                                boolean var26 = true;
                                for (int var27 = 0; var27 < Statics.field2595[var25].length; var27++) {
                                    if (Statics.field2595[var25][var27] != null) {
                                        if (Statics.field2595[var25][var27].field2528 == 2) {
                                            var26 = false;
                                        } else {
                                            Statics.field2595[var25][var27] = null;
                                        }
                                    }
                                }
                                if (var26) {
                                    Statics.field2595[var25] = null;
                                }
                                Statics.field2517[var25] = false;
                            }
                        }
                    }
                    for (class4 var28 = (class4) field407.method3202(); var28 != null; var28 = (class4) field407.method3203()) {
                        method129(var28, true);
                    }
                    field406 = -1;
                    field407 = new class174(8);
                    field451 = null;
                    field387 = false;
                    field388 = 0;
                    field501.method2927((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var29 = 0; var29 < 8; var29++) {
                        field375[var29] = null;
                        field472[var29] = false;
                    }
                    class14.method2050();
                    field324 = true;
                    for (int var30 = 0; var30 < 100; var30++) {
                        field454[var30] = true;
                    }
                    field468 = null;
                    Statics.field600 = 0;
                    Statics.field1887 = null;
                    Statics.field69 = -1;
                    method3484(false);
                    field376 = -1;
                }
            }
        } catch (IOException var34) {
            if (field278 < 1) {
                if (Statics.field623 == Statics.field1567) {
                    Statics.field623 = Statics.field2102;
                } else {
                    Statics.field623 = Statics.field1567;
                }
                field278++;
                field276 = 0;
            } else {
                method545(-2);
            }
        }
    }

    @ObfuscatedName("c.q(I)V")
    public static void method140() {
        field284.field1830 = 0;
        field403.field1830 = 0;
        field376 = -1;
        field292 = -1;
        field393 = -1;
        field294 = -1;
        field371 = 0;
        field289 = 0;
        field257 = 0;
        field388 = 0;
        field387 = false;
        field477 = 0;
        field475 = 0;
        for (int var0 = 0; var0 < field268.length; var0++) {
            if (field268[var0] != null) {
                field268[var0].field738 = -1;
            }
        }
        for (int var1 = 0; var1 < field280.length; var1++) {
            if (field280[var1] != null) {
                field280[var1].field738 = -1;
            }
        }
        class14.method2050();
        method565(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field454[var2] = true;
        }
    }

    @ObfuscatedName("aw.x(II)V")
    public static void method545(int arg0) {
        if (arg0 == -3) {
            Statics.method13(class142.field2175, class142.field2211, class142.field2177);
        } else if (arg0 == -2) {
            Statics.method13(class142.field2178, class142.field2203, class142.field2180);
        } else if (arg0 == -1) {
            Statics.method13(class142.field2181, class142.field2327, class142.field2183);
        } else if (arg0 == 3) {
            Statics.method13(class142.field2184, class142.field2185, class142.field2186);
        } else if (arg0 == 4) {
            Statics.method13(class142.field2329, class142.field2188, class142.field2189);
        } else if (arg0 == 5) {
            Statics.method13(class142.field2363, class142.field2191, class142.field2344);
        } else if (arg0 == 6) {
            Statics.method13(class142.field2253, class142.field2194, class142.field2243);
        } else if (arg0 == 7) {
            Statics.method13(class142.field2196, class142.field2139, class142.field2228);
        } else if (arg0 == 8) {
            Statics.method13(class142.field2199, class142.field2200, class142.field2201);
        } else if (arg0 == 9) {
            Statics.method13(class142.field2202, class142.field2271, class142.field2204);
        } else if (arg0 == 10) {
            Statics.method13(class142.field2205, class142.field2206, class142.field2362);
        } else if (arg0 == 11) {
            Statics.method13(class142.field2208, class142.field2209, class142.field2342);
        } else if (arg0 == 12) {
            Statics.method13(class142.field2241, class142.field2212, class142.field2213);
        } else if (arg0 == 13) {
            Statics.method13(class142.field2214, class142.field2138, class142.field2216);
        } else if (arg0 == 14) {
            Statics.method13(class142.field2172, class142.field2218, class142.field2300);
        } else if (arg0 == 16) {
            Statics.method13(class142.field2164, class142.field2221, class142.field2222);
        } else if (arg0 == 17) {
            Statics.method13(class142.field2198, class142.field2235, class142.field2225);
        } else if (arg0 == 18) {
            Statics.method13(class142.field2287, class142.field2162, class142.field2303);
        } else if (arg0 == 19) {
            Statics.method13(class142.field2361, class142.field2136, class142.field2231);
        } else if (arg0 == 20) {
            Statics.method13(class142.field2265, class142.field2233, class142.field2234);
        } else if (arg0 == 22) {
            Statics.method13(class142.field2165, class142.field2195, class142.field2321);
        } else if (arg0 == 23) {
            Statics.method13(class142.field2238, class142.field2239, class142.field2240);
        } else if (arg0 == 24) {
            Statics.method13(class142.field2272, class142.field2242, class142.field2227);
        } else if (arg0 == 25) {
            Statics.method13(class142.field2244, class142.field2245, class142.field2190);
        } else if (arg0 == 26) {
            Statics.method13(class142.field2145, class142.field2294, class142.field2366);
        } else if (arg0 == 27) {
            Statics.method13(class142.field2250, class142.field2251, class142.field2252);
        } else if (arg0 == 31) {
            Statics.method13(class142.field2364, class142.field2248, class142.field2166);
        } else if (arg0 == 32) {
            Statics.method13(class142.field2343, class142.field2263, class142.field2264);
        } else if (arg0 == 37) {
            Statics.method13(class142.field2269, class142.field2266, class142.field2230);
        } else if (arg0 == 38) {
            Statics.method13(class142.field2360, class142.field2176, class142.field2270);
        } else if (arg0 == 55) {
            Statics.method13(class142.field2319, class142.field2278, class142.field2273);
        } else if (arg0 == 56) {
            Statics.method13(class142.field2215, class142.field2275, class142.field2276);
            method565(11);
            return;
        } else if (arg0 == 57) {
            Statics.method13(class142.field2277, class142.field2268, class142.field2279);
            method565(11);
            return;
        } else {
            Statics.method13(class142.field2280, class142.field2281, class142.field2282);
        }
        method565(10);
    }

    @ObfuscatedName("a.p(I)V")
    public static final void method130() {
        if (Statics.field529 != null) {
            Statics.field529.method2583();
            Statics.field529 = null;
        }
        method97();
        Statics.field62.method1580();
        for (int var0 = 0; var0 < 4; var0++) {
            field460[var0].method3485();
        }
        System.gc();
        class161.method1742(2);
        field479 = -1;
        field480 = false;
        class20.method10();
        method565(10);
    }

    @ObfuscatedName("z.y(B)V")
    public static final void method97() {
        class41.method154();
        class37.field879.method3171();
        class40.method11();
        class36.method95();
        class35.field784.method3171();
        class35.field793.method3171();
        class45.field999.method3171();
        class45.field1000.method3171();
        class45.field1011.method3171();
        class38.method552();
        class39.method94();
        class42.field965.method3171();
        class46.method1940();
        class157.field2676.method3171();
        class152.field2516.method3171();
        class152.field2522.method3171();
        class152.field2523.method3171();
        ((class88) Statics.field1473).method1832();
        class19.field520.method3171();
        Statics.field628.method2722();
        Statics.field2504.method2722();
        Statics.field915.method2722();
        Statics.field592.method2722();
        Statics.field2428.method2722();
        Statics.field2401.method2722();
        Statics.field2481.method2722();
        Statics.field2441.method2722();
        Statics.field274.method2722();
        Statics.field2110.method2722();
        Statics.field2924.method2722();
        Statics.field175.method2722();
    }

    @ObfuscatedName("at.r(S)V")
    public static final void method749() {
        if (Statics.field775 != null) {
            Statics.field775.method974();
        }
        if (Statics.field970 != null) {
            Statics.field970.method974();
        }
    }

    @ObfuscatedName("cm.k(Laz;IIIB)V")
    public static void method1846(class38 arg0, int arg1, int arg2, int arg3) {
        if (field483 >= 50 || field482 == 0 || arg0.field897 == null || arg1 >= arg0.field897.length) {
            return;
        }
        int var4 = arg0.field897[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field484[field483] = var5;
        field485[field483] = var6;
        field486[field483] = 0;
        field493[field483] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field487[field483] = (var8 << 16) + (var9 << 8) + var7;
        field483++;
    }

    @ObfuscatedName("dy.b(III)V")
    public static void method2485(int arg0, int arg1) {
        if (field419 != 0 && arg0 != -1) {
            class161.method1932(Statics.field2924, arg0, 0, field419, false);
            field480 = true;
        }
    }

    @ObfuscatedName("cz.h(III)V")
    public static final void method1831(int arg0, int arg1) {
        if (field477 != 0 && field477 != 3 || class127.field2004 != 1 && Statics.field776 || class127.field2004 != 4) {
            return;
        }
        int var2 = class127.field1993 - 25 - arg0;
        int var3 = class127.field2006 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field315 + field254 & 0x7FF;
        int var5 = class84.field1461[var4];
        int var6 = class84.field1471[var4];
        int var7 = (field317 + 256) * var5 >> 8;
        int var8 = (field317 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field1452.field772 + var9 >> 7;
        int var12 = Statics.field1452.field715 - var10 >> 7;
        field284.method2345(213);
        field284.method2214(18);
        field284.method2131(Statics.field56 + var12);
        field284.method2124(class124.field1957[82] ? (class124.field1957[81] ? 2 : 1) : 0);
        field284.method2251(Statics.field200 + var11);
        field284.method2214(var2);
        field284.method2214(var3);
        field284.method2251(field254);
        field284.method2214(57);
        field284.method2214(field315);
        field284.method2214(field317);
        field284.method2214(89);
        field284.method2251(Statics.field1452.field772);
        field284.method2251(Statics.field1452.field715);
        field284.method2214(63);
        field475 = var11;
        field503 = var12;
    }

    @ObfuscatedName("aw.i(Ljava/lang/String;I)V")
    public static final void method544(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1815.field131 = !Statics.field1815.field131;
            class9.method2668();
            if (Statics.field1815.field131) {
                class10.method551(99, "", "Roofs are now all hidden");
            } else {
                class10.method551(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field432 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field256 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field256 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field291 > 0) {
                    method130();
                } else {
                    method565(40);
                    Statics.field249 = Statics.field529;
                    Statics.field529 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field244 == 2) {
                throw new RuntimeException();
            }
        }
        field284.method2345(43);
        field284.method2214(arg0.length() + 1);
        field284.method2092(arg0);
    }

    @ObfuscatedName("co.o(B)V")
    public static final void method1826() {
        int var0 = Statics.field181 * 128 + 64;
        int var1 = Statics.field193 * 128 + 64;
        int var2 = method487(var0, var1, Statics.field588) - Statics.field2011;
        if (Statics.field201 < var0) {
            Statics.field201 += Statics.field1339 * (var0 - Statics.field201) / 1000 + Statics.field182;
            if (Statics.field201 > var0) {
                Statics.field201 = var0;
            }
        }
        if (Statics.field201 > var0) {
            Statics.field201 -= Statics.field1339 * (Statics.field201 - var0) / 1000 + Statics.field182;
            if (Statics.field201 < var0) {
                Statics.field201 = var0;
            }
        }
        if (Statics.field1940 < var2) {
            Statics.field1940 += Statics.field1339 * (var2 - Statics.field1940) / 1000 + Statics.field182;
            if (Statics.field1940 > var2) {
                Statics.field1940 = var2;
            }
        }
        if (Statics.field1940 > var2) {
            Statics.field1940 -= Statics.field1339 * (Statics.field1940 - var2) / 1000 + Statics.field182;
            if (Statics.field1940 < var2) {
                Statics.field1940 = var2;
            }
        }
        if (Statics.field157 < var1) {
            Statics.field157 += Statics.field1339 * (var1 - Statics.field157) / 1000 + Statics.field182;
            if (Statics.field157 > var1) {
                Statics.field157 = var1;
            }
        }
        if (Statics.field157 > var1) {
            Statics.field157 -= Statics.field1339 * (Statics.field157 - var1) / 1000 + Statics.field182;
            if (Statics.field157 < var1) {
                Statics.field157 = var1;
            }
        }
        int var3 = Statics.field2469 * 128 + 64;
        int var4 = Statics.field1043 * 128 + 64;
        int var5 = method487(var3, var4, Statics.field588) - Statics.field1260;
        int var6 = var3 - Statics.field201;
        int var7 = var5 - Statics.field1940;
        int var8 = var4 - Statics.field157;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1255 < var10) {
            Statics.field1255 += Statics.field78 * (var10 - Statics.field1255) / 1000 + Statics.field1072;
            if (Statics.field1255 > var10) {
                Statics.field1255 = var10;
            }
        }
        if (Statics.field1255 > var10) {
            Statics.field1255 -= Statics.field78 * (Statics.field1255 - var10) / 1000 + Statics.field1072;
            if (Statics.field1255 < var10) {
                Statics.field1255 = var10;
            }
        }
        int var12 = var11 - Statics.field53;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field53 += Statics.field78 * var12 / 1000 + Statics.field1072;
            Statics.field53 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field53 -= Statics.field78 * -var12 / 1000 + Statics.field1072;
            Statics.field53 &= 0x7FF;
        }
        int var13 = var11 - Statics.field53;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field53 = var11;
        }
    }

    @ObfuscatedName("y.m(I)V")
    public static final void method460() {
        for (int var0 = -1; var0 < field293; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field366[var0];
            }
            class3 var2 = field268[var1];
            if (var2 != null) {
                method476(var2, 1);
            }
        }
    }

    @ObfuscatedName("k.ak(Lae;II)V")
    public static final void method476(class33 arg0, int arg1) {
        if (arg0.field758 > field250) {
            int var2 = arg0.field758 - field250;
            int var3 = arg0.field757 * 128 + arg0.field718 * 64;
            int var4 = arg0.field756 * 128 + arg0.field718 * 64;
            arg0.field772 += (var3 - arg0.field772) / var2;
            arg0.field715 += (var4 - arg0.field715) / var2;
            arg0.field770 = 0;
            if (arg0.field760 == 0) {
                arg0.field763 = 1024;
            }
            if (arg0.field760 == 1) {
                arg0.field763 = 1536;
            }
            if (arg0.field760 == 2) {
                arg0.field763 = 0;
            }
            if (arg0.field760 == 3) {
                arg0.field763 = 512;
            }
        } else if (arg0.field759 >= field250) {
            method2522(arg0);
        } else {
            arg0.field742 = arg0.field719;
            if (arg0.field766 == 0) {
                arg0.field770 = 0;
            } else {
                label331: {
                    if (arg0.field767 != -1 && arg0.field762 == 0) {
                        class38 var5 = Statics.method448(arg0.field767);
                        if (arg0.field714 > 0 && var5.field890 == 0) {
                            arg0.field770++;
                            break label331;
                        }
                        if (arg0.field714 <= 0 && var5.field906 == 0) {
                            arg0.field770++;
                            break label331;
                        }
                    }
                    int var6 = arg0.field772;
                    int var7 = arg0.field715;
                    int var8 = arg0.field771[arg0.field766 - 1] * 128 + arg0.field718 * 64;
                    int var9 = arg0.field768[arg0.field766 - 1] * 128 + arg0.field718 * 64;
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        if (var6 < var8) {
                            if (var7 < var9) {
                                arg0.field763 = 1280;
                            } else if (var7 > var9) {
                                arg0.field763 = 1792;
                            } else {
                                arg0.field763 = 1536;
                            }
                        } else if (var6 > var8) {
                            if (var7 < var9) {
                                arg0.field763 = 768;
                            } else if (var7 > var9) {
                                arg0.field763 = 256;
                            } else {
                                arg0.field763 = 512;
                            }
                        } else if (var7 < var9) {
                            arg0.field763 = 1024;
                        } else if (var7 > var9) {
                            arg0.field763 = 0;
                        }
                        int var10 = arg0.field763 - arg0.field716 & 0x7FF;
                        if (var10 > 1024) {
                            var10 -= 2048;
                        }
                        int var11 = arg0.field723;
                        if (var10 >= -256 && var10 <= 256) {
                            var11 = arg0.field722;
                        } else if (var10 >= 256 && var10 < 768) {
                            var11 = arg0.field725;
                        } else if (var10 >= -768 && var10 <= -256) {
                            var11 = arg0.field753;
                        }
                        if (var11 == -1) {
                            var11 = arg0.field722;
                        }
                        arg0.field742 = var11;
                        int var12 = 4;
                        boolean var13 = true;
                        if (arg0 instanceof class30) {
                            var13 = ((class30) arg0).field680.field805;
                        }
                        if (var13) {
                            if (arg0.field763 != arg0.field716 && arg0.field738 == -1 && arg0.field765 != 0) {
                                var12 = 2;
                            }
                            if (arg0.field766 > 2) {
                                var12 = 6;
                            }
                            if (arg0.field766 > 3) {
                                var12 = 8;
                            }
                            if (arg0.field770 > 0 && arg0.field766 > 1) {
                                var12 = 8;
                                arg0.field770--;
                            }
                        } else {
                            if (arg0.field766 > 1) {
                                var12 = 6;
                            }
                            if (arg0.field766 > 2) {
                                var12 = 8;
                            }
                            if (arg0.field770 > 0 && arg0.field766 > 1) {
                                var12 = 8;
                                arg0.field770--;
                            }
                        }
                        if (arg0.field769[arg0.field766 - 1]) {
                            var12 <<= 0x1;
                        }
                        if (var12 >= 8 && arg0.field742 == arg0.field722 && arg0.field726 != -1) {
                            arg0.field742 = arg0.field726;
                        }
                        if (var6 < var8) {
                            arg0.field772 += var12;
                            if (arg0.field772 > var8) {
                                arg0.field772 = var8;
                            }
                        } else if (var6 > var8) {
                            arg0.field772 -= var12;
                            if (arg0.field772 < var8) {
                                arg0.field772 = var8;
                            }
                        }
                        if (var7 < var9) {
                            arg0.field715 += var12;
                            if (arg0.field715 > var9) {
                                arg0.field715 = var9;
                            }
                        } else if (var7 > var9) {
                            arg0.field715 -= var12;
                            if (arg0.field715 < var9) {
                                arg0.field715 = var9;
                            }
                        }
                        if (arg0.field772 == var8 && arg0.field715 == var9) {
                            arg0.field766--;
                            if (arg0.field714 > 0) {
                                arg0.field714--;
                            }
                        }
                    } else {
                        arg0.field772 = var8;
                        arg0.field715 = var9;
                    }
                }
            }
        }
        if (arg0.field772 < 128 || arg0.field715 < 128 || arg0.field772 >= 13184 || arg0.field715 >= 13184) {
            arg0.field767 = -1;
            arg0.field749 = -1;
            arg0.field758 = 0;
            arg0.field759 = 0;
            arg0.field772 = arg0.field771[0] * 128 + arg0.field718 * 64;
            arg0.field715 = arg0.field768[0] * 128 + arg0.field718 * 64;
            arg0.method568();
        }
        if (Statics.field1452 == arg0 && (arg0.field772 < 1536 || arg0.field715 < 1536 || arg0.field772 >= 11776 || arg0.field715 >= 11776)) {
            arg0.field767 = -1;
            arg0.field749 = -1;
            arg0.field758 = 0;
            arg0.field759 = 0;
            arg0.field772 = arg0.field771[0] * 128 + arg0.field718 * 64;
            arg0.field715 = arg0.field768[0] * 128 + arg0.field718 * 64;
            arg0.method568();
        }
        if (arg0.field765 != 0) {
            if (arg0.field738 != -1 && arg0.field738 < 32768) {
                class30 var14 = field280[arg0.field738];
                if (var14 != null) {
                    int var15 = arg0.field772 - var14.field772;
                    int var16 = arg0.field715 - var14.field715;
                    if (var15 != 0 || var16 != 0) {
                        arg0.field763 = (int) (Math.atan2((double) var15, (double) var16) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field738 >= 32768) {
                int var17 = arg0.field738 - 32768;
                if (field390 == var17) {
                    var17 = 2047;
                }
                class3 var18 = field268[var17];
                if (var18 != null) {
                    int var19 = arg0.field772 - var18.field772;
                    int var20 = arg0.field715 - var18.field715;
                    if (var19 != 0 || var20 != 0) {
                        arg0.field763 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field730 != 0 || arg0.field740 != 0) && (arg0.field766 == 0 || arg0.field770 > 0)) {
                int var21 = arg0.field772 - (arg0.field730 * 64 - Statics.field200 * 64 - Statics.field200 * 64);
                int var22 = arg0.field715 - (arg0.field740 * 64 - Statics.field56 * 64 - Statics.field56 * 64);
                if (var21 != 0 || var22 != 0) {
                    arg0.field763 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                }
                arg0.field730 = 0;
                arg0.field740 = 0;
            }
            int var23 = arg0.field763 - arg0.field716 & 0x7FF;
            if (var23 == 0) {
                arg0.field764 = 0;
            } else {
                arg0.field764++;
                if (var23 > 1024) {
                    arg0.field716 -= arg0.field765;
                    boolean var24 = true;
                    if (var23 < arg0.field765 || var23 > 2048 - arg0.field765) {
                        arg0.field716 = arg0.field763;
                        var24 = false;
                    }
                    if (arg0.field742 == arg0.field719 && (arg0.field764 > 25 || var24)) {
                        if (arg0.field720 == -1) {
                            arg0.field742 = arg0.field722;
                        } else {
                            arg0.field742 = arg0.field720;
                        }
                    }
                } else {
                    arg0.field716 += arg0.field765;
                    boolean var25 = true;
                    if (var23 < arg0.field765 || var23 > 2048 - arg0.field765) {
                        arg0.field716 = arg0.field763;
                        var25 = false;
                    }
                    if (arg0.field742 == arg0.field719 && (arg0.field764 > 25 || var25)) {
                        if (arg0.field754 == -1) {
                            arg0.field742 = arg0.field722;
                        } else {
                            arg0.field742 = arg0.field754;
                        }
                    }
                }
                arg0.field716 &= 0x7FF;
            }
        }
        method2688(arg0);
    }

    @ObfuscatedName("dw.aw(Lae;I)V")
    public static final void method2522(class33 arg0) {
        if (field250 == arg0.field759 || arg0.field767 == -1 || arg0.field762 != 0 || arg0.field746 + 1 > Statics.method448(arg0.field767).field896[arg0.field745]) {
            int var1 = arg0.field759 - arg0.field758;
            int var2 = field250 - arg0.field758;
            int var3 = arg0.field757 * 128 + arg0.field718 * 64;
            int var4 = arg0.field756 * 128 + arg0.field718 * 64;
            int var5 = arg0.field755 * 128 + arg0.field718 * 64;
            int var6 = arg0.field731 * 128 + arg0.field718 * 64;
            arg0.field772 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field715 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field770 = 0;
        if (arg0.field760 == 0) {
            arg0.field763 = 1024;
        }
        if (arg0.field760 == 1) {
            arg0.field763 = 1536;
        }
        if (arg0.field760 == 2) {
            arg0.field763 = 0;
        }
        if (arg0.field760 == 3) {
            arg0.field763 = 512;
        }
        arg0.field716 = arg0.field763;
    }

    @ObfuscatedName("ee.af(Lae;S)V")
    public static final void method2688(class33 arg0) {
        arg0.field717 = false;
        if (arg0.field742 != -1) {
            class38 var1 = Statics.method448(arg0.field742);
            if (var1 == null || var1.field894 == null) {
                arg0.field742 = -1;
            } else {
                arg0.field743++;
                if (arg0.field724 < var1.field894.length && arg0.field743 > var1.field896[arg0.field724]) {
                    arg0.field743 = 1;
                    arg0.field724++;
                    method1846(var1, arg0.field724, arg0.field772, arg0.field715);
                }
                if (arg0.field724 >= var1.field894.length) {
                    arg0.field743 = 0;
                    arg0.field724 = 0;
                    method1846(var1, arg0.field724, arg0.field772, arg0.field715);
                }
            }
        }
        if (arg0.field749 != -1 && field250 >= arg0.field752) {
            if (arg0.field750 < 0) {
                arg0.field750 = 0;
            }
            int var2 = class39.method123(arg0.field749).field916;
            if (var2 == -1) {
                arg0.field749 = -1;
            } else {
                class38 var3 = Statics.method448(var2);
                if (var3 == null || var3.field894 == null) {
                    arg0.field749 = -1;
                } else {
                    arg0.field747++;
                    if (arg0.field750 < var3.field894.length && arg0.field747 > var3.field896[arg0.field750]) {
                        arg0.field747 = 1;
                        arg0.field750++;
                        method1846(var3, arg0.field750, arg0.field772, arg0.field715);
                    }
                    if (arg0.field750 >= var3.field894.length && (arg0.field750 < 0 || arg0.field750 >= var3.field894.length)) {
                        arg0.field749 = -1;
                    }
                }
            }
        }
        if (arg0.field767 != -1 && arg0.field762 <= 1) {
            class38 var4 = Statics.method448(arg0.field767);
            if (var4.field890 == 1 && arg0.field714 > 0 && arg0.field758 <= field250 && arg0.field759 < field250) {
                arg0.field762 = 1;
                return;
            }
        }
        if (arg0.field767 != -1 && arg0.field762 == 0) {
            class38 var5 = Statics.method448(arg0.field767);
            if (var5 == null || var5.field894 == null) {
                arg0.field767 = -1;
            } else {
                arg0.field746++;
                if (arg0.field745 < var5.field894.length && arg0.field746 > var5.field896[arg0.field745]) {
                    arg0.field746 = 1;
                    arg0.field745++;
                    method1846(var5, arg0.field745, arg0.field772, arg0.field715);
                }
                if (arg0.field745 >= var5.field894.length) {
                    arg0.field745 -= var5.field898;
                    arg0.field739++;
                    if (arg0.field739 >= var5.field891) {
                        arg0.field767 = -1;
                    } else if (arg0.field745 >= 0 && arg0.field745 < var5.field894.length) {
                        method1846(var5, arg0.field745, arg0.field772, arg0.field715);
                    } else {
                        arg0.field767 = -1;
                    }
                }
                arg0.field717 = var5.field900;
            }
        }
        if (arg0.field762 > 0) {
            arg0.field762--;
        }
    }

    @ObfuscatedName("x.ab(Lf;III)V")
    public static void method171(class3 arg0, int arg1, int arg2) {
        if (arg0.field767 == arg1 && arg1 != -1) {
            int var3 = Statics.method448(arg1).field889;
            if (var3 == 1) {
                arg0.field745 = 0;
                arg0.field746 = 0;
                arg0.field762 = arg2;
                arg0.field739 = 0;
            }
            if (var3 == 2) {
                arg0.field739 = 0;
            }
        } else if (arg1 == -1 || arg0.field767 == -1 || Statics.method448(arg1).field901 >= Statics.method448(arg0.field767).field901) {
            arg0.field767 = arg1;
            arg0.field745 = 0;
            arg0.field746 = 0;
            arg0.field762 = arg2;
            arg0.field739 = 0;
            arg0.field714 = arg0.field766;
        }
    }

    @ObfuscatedName("bw.ao(I)V")
    public static final void method1572() {
        if (field406 != -1) {
            int var0 = field406;
            if (class152.method1930(var0)) {
                method1844(Statics.field2595[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field448; var1++) {
            if (field454[var1]) {
                field314[var1] = true;
            }
            field452[var1] = field454[var1];
            field454[var1] = false;
        }
        field449 = field250;
        field395 = -1;
        field396 = -1;
        Statics.field2705 = null;
        if (field406 != -1) {
            field448 = 0;
            method157(field406, 0, 0, 765, 503, 0, 0, -1);
        }
        class73.method1490();
        if (field387) {
            method30();
        } else if (field395 != -1) {
            int var2 = field395;
            int var3 = field396;
            if (field388 >= 2 || field421 != 0 || field401) {
                String var4;
                if (field421 == 1 && field388 < 2) {
                    var4 = class142.field2297 + class142.field2296 + field400 + " " + class2.field30;
                } else if (field401 && field388 < 2) {
                    var4 = field404 + class142.field2296 + field330 + " " + class2.field30;
                } else {
                    var4 = method168(field388 - 1);
                }
                if (field388 > 2) {
                    var4 = var4 + class2.method584(16777215) + " " + '/' + " " + (field388 - 2) + class142.field2290;
                }
                Statics.field875.method3412(var4, var2 + 4, var3 + 15, 16777215, 0, field250 / 1000);
            }
        }
        if (field457 == 3) {
            for (int var5 = 0; var5 < field448; var5++) {
                if (field452[var5]) {
                    class73.method1496(field316[var5], field362[var5], field399[var5], field423[var5], 16711935, 128);
                } else if (field314[var5]) {
                    class73.method1496(field316[var5], field362[var5], field399[var5], field423[var5], 16711680, 128);
                }
            }
        }
        int var6 = Statics.field588;
        int var7 = Statics.field1452.field772;
        int var8 = Statics.field1452.field715;
        int var9 = field456;
        for (class20 var10 = (class20) class20.field545.method3239(); var10 != null; var10 = (class20) class20.field545.method3248()) {
            if (var10.field539 != -1 || var10.field543 != null) {
                int var11 = 0;
                if (var7 > var10.field534) {
                    var11 += var7 - var10.field534;
                } else if (var7 < var10.field532) {
                    var11 += var10.field532 - var7;
                }
                if (var8 > var10.field535) {
                    var11 += var8 - var10.field535;
                } else if (var8 < var10.field533) {
                    var11 += var10.field533 - var8;
                }
                if (var11 - 64 > var10.field537 || field482 == 0 || var10.field530 != var6) {
                    if (var10.field538 != null) {
                        Statics.field1445.method958(var10.field538);
                        var10.field538 = null;
                    }
                    if (var10.field531 != null) {
                        Statics.field1445.method958(var10.field531);
                        var10.field531 = null;
                    }
                } else {
                    var11 -= 64;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = field482 * (var10.field537 - var11) / var10.field537;
                    class52 var10000;
                    if (var10.field538 != null) {
                        var10.field538.method1076(var12);
                    } else if (var10.field539 >= 0) {
                        var10000 = (class52) null;
                        class52 var13 = class52.method1014(Statics.field592, var10.field539, 0);
                        if (var13 != null) {
                            class56 var14 = var13.method1010().method1051(Statics.field605);
                            class58 var15 = class58.method1072(var14, 100, var12);
                            var15.method1075(-1);
                            Statics.field1445.method924(var15);
                            var10.field538 = var15;
                        }
                    }
                    if (var10.field531 != null) {
                        var10.field531.method1076(var12);
                        if (!var10.field531.method3317()) {
                            var10.field531 = null;
                        }
                    } else if (var10.field543 != null && (var10.field542 -= var9) <= 0) {
                        int var16 = (int) (Math.random() * (double) var10.field543.length);
                        var10000 = (class52) null;
                        class52 var17 = class52.method1014(Statics.field592, var10.field543[var16], 0);
                        if (var17 != null) {
                            class56 var18 = var17.method1010().method1051(Statics.field605);
                            class58 var19 = class58.method1072(var18, 100, var12);
                            var19.method1075(0);
                            Statics.field1445.method924(var19);
                            var10.field531 = var19;
                            var10.field542 = var10.field546 + (int) (Math.random() * (double) (var10.field540 - var10.field546));
                        }
                    }
                }
            }
        }
        field456 = 0;
    }

    @ObfuscatedName("g.ah(Ljava/lang/String;ZI)V")
    public static final void method127(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1083.method3347(arg0, 250);
        int var6 = Statics.field1083.method3423(arg0, 250) * 13;
        class73.method1497(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1526(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1083.method3353(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method768(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field510.getGraphics();
                Statics.field1333.method1330(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field510.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field448; var13++) {
            if (field399[var13] + field316[var13] > var9 && field316[var13] < var9 + var11 && field423[var13] + field362[var13] > var10 && field362[var13] < var10 + var12) {
                field314[var13] = true;
            }
        }
    }

    @ObfuscatedName("bq.ae(Laf;I)V")
    public static final void method1578(class29 arg0) {
        if (Statics.field1452.field772 >> 7 == field475 && Statics.field1452.field715 >> 7 == field503) {
            field475 = 0;
        }
        int var1 = field293;
        if (class29.field672 == arg0 || class29.field671 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field672 == arg0) {
                var3 = Statics.field1452;
                var4 = 33538048;
            } else if (class29.field671 == arg0) {
                var3 = field268[field378];
                var4 = field378 << 14;
            } else {
                var3 = field268[field366[var2]];
                var4 = field366[var2] << 14;
                if (class29.field673 == arg0 && field378 == field366[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method18() && !var3.field52) {
                var3.field38 = false;
                if ((field246 && field293 > 50 || field293 > 200) && class29.field672 != arg0 && var3.field742 == var3.field719) {
                    var3.field38 = true;
                }
                int var5 = var3.field772 >> 7;
                int var6 = var3.field715 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field45 == null || field250 < var3.field40 || field250 >= var3.field41) {
                        if ((var3.field772 & 0x7F) == 64 && (var3.field715 & 0x7F) == 64) {
                            if (field348 == field347[var5][var6]) {
                                continue;
                            }
                            field347[var5][var6] = field348;
                        }
                        var3.field54 = method487(var3.field772, var3.field715, Statics.field588);
                        Statics.field62.method1591(Statics.field588, var3.field772, var3.field715, var3.field54, 60, var3, var3.field716, var4, var3.field717);
                    } else {
                        var3.field38 = false;
                        var3.field54 = method487(var3.field772, var3.field715, Statics.field588);
                        Statics.field62.method1592(Statics.field588, var3.field772, var3.field715, var3.field54, 60, var3, var3.field716, var4, var3.field46, var3.field33, var3.field48, var3.field47);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.ax(ZB)V")
    public static final void method499(boolean arg0) {
        for (int var1 = 0; var1 < field281; var1++) {
            class30 var2 = field280[field282[var1]];
            int var3 = (field282[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field680.field807 == arg0 && var2.field680.method599()) {
                int var4 = var2.field772 >> 7;
                int var5 = var2.field715 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field718 == 1 && (var2.field772 & 0x7F) == 64 && (var2.field715 & 0x7F) == 64) {
                        if (field348 == field347[var4][var5]) {
                            continue;
                        }
                        field347[var4][var5] = field348;
                    }
                    if (!var2.field680.field815) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field62.method1591(Statics.field588, var2.field772, var2.field715, method487(var2.field772 + (var2.field718 * 64 - 64), var2.field715 + (var2.field718 * 64 - 64), Statics.field588), var2.field718 * 64 - 64 + 60, var2, var2.field716, var3, var2.field717);
                }
            }
        }
    }

    @ObfuscatedName("ax.ar(B)V")
    public static final void method588() {
        for (class26 var0 = (class26) field405.method3239(); var0 != null; var0 = (class26) field405.method3248()) {
            if (Statics.field588 != var0.field611 || var0.field618) {
                var0.method3316();
            } else if (field250 >= var0.field612) {
                var0.method502(field456);
                if (var0.field618) {
                    var0.method3316();
                } else {
                    Statics.field62.method1591(var0.field611, var0.field619, var0.field613, var0.field614, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("dq.aq(S)I")
    public static final int method2566() {
        if (Statics.field1815.field131) {
            return Statics.field588;
        }
        int var0 = 3;
        if (Statics.field1255 < 310) {
            int var1 = Statics.field201 >> 7;
            int var2 = Statics.field157 >> 7;
            int var3 = Statics.field1452.field772 >> 7;
            int var4 = Statics.field1452.field715 >> 7;
            if ((class6.field80[Statics.field588][var1][var2] & 0x4) != 0) {
                var0 = Statics.field588;
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
                    if ((class6.field80[Statics.field588][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field588;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field80[Statics.field588][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field588;
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
                    if ((class6.field80[Statics.field588][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field588;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field80[Statics.field588][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field588;
                        }
                    }
                }
            }
        }
        if ((class6.field80[Statics.field588][Statics.field1452.field772 >> 7][Statics.field1452.field715 >> 7] & 0x4) != 0) {
            var0 = Statics.field588;
        }
        return var0;
    }

    @ObfuscatedName("e.am(III)V")
    public static final void method29(int arg0, int arg1) {
        if (field258 == 2) {
            method2666((field368 - Statics.field200 << 7) + field413, (field264 - Statics.field56 << 7) + field265, field262 * 2);
            if (field349 > -1 && field250 % 20 < 10) {
                Statics.field955[0].method1410(field349 + arg0 - 12, field350 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("d.az(Lae;IIIIII)V")
    public static final void method38(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method18()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field680;
            if (var6.field817 != null) {
                var6 = var6.method593();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field293) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field52) {
                return;
            }
            if (var8.field35 != -1 || var8.field36 != -1) {
                method800(arg0, arg0.field721 + 15);
                if (field349 > -1) {
                    if (var8.field35 != -1) {
                        Statics.field1497[var8.field35].method1410(field349 + arg2 - 12, field350 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field36 != -1) {
                        Statics.field2124[var8.field36].method1410(field349 + arg2 - 12, field350 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field258 == 10 && field321 == field366[arg1]) {
                method800(arg0, arg0.field721 + 15);
                if (field349 > -1) {
                    Statics.field955[1].method1410(field349 + arg2 - 12, field350 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field680;
            if (var9.field817 != null) {
                var9 = var9.method593();
            }
            if (var9.field810 >= 0 && var9.field810 < Statics.field2124.length) {
                method800(arg0, arg0.field721 + 15);
                if (field349 > -1) {
                    Statics.field2124[var9.field810].method1410(field349 + arg2 - 12, field350 + arg3 - 30);
                }
            }
            if (field258 == 1 && field259 == field282[arg1 - field293] && field250 % 20 < 10) {
                method800(arg0, arg0.field721 + 15);
                if (field349 > -1) {
                    Statics.field955[0].method1410(field349 + arg2 - 12, field350 + arg3 - 28);
                }
            }
        }
        if (arg0.field727 != null && (arg1 >= field293 || field361 == 4 || !arg0.field744 && (field361 == 0 || field361 == 3 || field361 == 1 && method2409(((class3) arg0).field50, false)))) {
            method800(arg0, arg0.field721);
            if (field349 > -1 && field478 < field338) {
                field416[field478] = Statics.field875.method3345(arg0.field727) / 2;
                field341[field478] = Statics.field875.field2917;
                field446[field478] = field349;
                field340[field478] = field350;
                field343[field478] = arg0.field728;
                field344[field478] = arg0.field751;
                field345[field478] = arg0.field729;
                field238[field478] = arg0.field727;
                field478++;
            }
        }
        if (arg0.field735 > field250) {
            method800(arg0, arg0.field721 + 15);
            if (field349 > -1) {
                int var10;
                if (arg1 < field293) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field680;
                    var10 = var11.field812;
                }
                int var12 = arg0.field736 * var10 / arg0.field734;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field736 > 0) {
                    var12 = 1;
                }
                class73.method1497(field349 + arg2 - var10 / 2, field350 + arg3 - 3, var12, 5, 65280);
                class73.method1497(field349 + arg2 - var10 / 2 + var12, field350 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field748[var13] > field250) {
                method800(arg0, arg0.field721 / 2);
                if (field349 > -1) {
                    if (var13 == 1) {
                        field350 -= 20;
                    }
                    if (var13 == 2) {
                        field349 -= 15;
                        field350 -= 10;
                    }
                    if (var13 == 3) {
                        field349 += 15;
                        field350 -= 10;
                    }
                    Statics.field2514[arg0.field733[var13]].method1410(field349 + arg2 - 12, field350 + arg3 - 12);
                    Statics.field1848.method3407(Integer.toString(arg0.field732[var13]), field349 + arg2 - 1, field350 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("an.an(B)V")
    public static final void method741() {
        field363 = 0;
        int var0 = (Statics.field1452.field772 >> 7) + Statics.field200;
        int var1 = (Statics.field1452.field715 >> 7) + Statics.field56;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field363 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field363 = 1;
        }
        if (field363 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field363 = 0;
        }
    }

    @ObfuscatedName("aa.at(Lae;II)V")
    public static final void method800(class33 arg0, int arg1) {
        method2666(arg0.field772, arg0.field715, arg1);
    }

    @ObfuscatedName("eh.av(IIII)V")
    public static final void method2666(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field349 = -1;
            field350 = -1;
            return;
        }
        int var3 = method487(arg0, arg1, Statics.field588) - arg2;
        int var4 = arg0 - Statics.field201;
        int var5 = var3 - Statics.field1940;
        int var6 = arg1 - Statics.field157;
        int var7 = class84.field1461[Statics.field1255];
        int var8 = class84.field1471[Statics.field1255];
        int var9 = class84.field1461[Statics.field53];
        int var10 = class84.field1471[Statics.field53];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field349 = (var11 << 9) / var15 + 256;
            field350 = (var14 << 9) / var15 + 167;
        } else {
            field349 = -1;
            field350 = -1;
        }
    }

    @ObfuscatedName("h.aa(IIII)I")
    public static final int method487(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field80[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field94[var5][var3][var4] + class6.field94[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field94[var5][var3][var4 + 1] + class6.field94[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("au.ag(IIIIIII)V")
    public static final void method826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class84.field1461[var6];
            int var12 = class84.field1471[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class84.field1461[var7];
            int var15 = class84.field1471[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field201 = arg0 - var8;
        Statics.field1940 = arg1 - var9;
        Statics.field157 = arg2 - var10;
        Statics.field1255 = arg3;
        Statics.field53 = arg4;
    }

    @ObfuscatedName("go.au(ZI)V")
    public static final void method3484(boolean arg0) {
        field305 = arg0;
        if (!field305) {
            int var1 = field403.method2134();
            int var2 = field403.method2127();
            int var3 = field403.method2135();
            int var4 = field403.method2135();
            int var5 = field403.method2136();
            int var6 = (field371 - field403.field1830) / 16;
            Statics.field60 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field60[var7][var8] = field403.method2106();
                }
            }
            Statics.field302 = new int[var6];
            Statics.field32 = new int[var6];
            Statics.field122 = new int[var6];
            Statics.field2085 = new byte[var6][];
            Statics.field434 = new byte[var6][];
            boolean var9 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var5 / 8 == 48) {
                var9 = true;
            }
            if (var4 / 8 == 48 && var5 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var5 - 6) / 8; var12 <= (var5 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field302[var10] = var13;
                        Statics.field32[var10] = Statics.field2428.method2724("m" + var11 + "_" + var12);
                        Statics.field122[var10] = Statics.field2428.method2724("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            Statics.method2689(var4, var5, var2, var3, var1);
            return;
        }
        int var14 = field403.method2103();
        int var15 = field403.method2126();
        int var16 = field403.method2103();
        int var17 = field403.method2134();
        int var18 = field403.method2134();
        field403.method2347();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field403.method2357(1);
                    if (var22 == 1) {
                        field306[var19][var20][var21] = field403.method2357(26);
                    } else {
                        field306[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field403.method2349();
        int var23 = (field371 - field403.field1830) / 16;
        Statics.field60 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field60[var24][var25] = field403.method2145();
            }
        }
        Statics.field302 = new int[var23];
        Statics.field32 = new int[var23];
        Statics.field122 = new int[var23];
        Statics.field2085 = new byte[var23][];
        Statics.field434 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field306[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field302[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field302[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field32[var26] = Statics.field2428.method2724("m" + var35 + "_" + var36);
                            Statics.field122[var26] = Statics.field2428.method2724("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        Statics.method2689(var17, var16, var15, var18, var14);
    }

    @ObfuscatedName("cm.ay(ZS)V")
    public static final void method1845(boolean arg0) {
        method749();
        field290++;
        if (field290 < 50 && !arg0) {
            return;
        }
        field290 = 0;
        if (field295 || Statics.field529 == null) {
            return;
        }
        field284.method2345(195);
        try {
            Statics.field529.method2585(field284.field1831, 0, field284.field1830);
            field284.field1830 = 0;
        } catch (IOException var2) {
            field295 = true;
        }
    }

    @ObfuscatedName("s.ac(I)V")
    public static final void method9() {
        method1845(false);
        field471 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2085.length; var1++) {
            if (Statics.field32[var1] != -1 && Statics.field2085[var1] == null) {
                Statics.field2085[var1] = Statics.field2428.method2709(Statics.field32[var1], 0);
                if (Statics.field2085[var1] == null) {
                    var0 = false;
                    field471++;
                }
            }
            if (Statics.field122[var1] != -1 && Statics.field434[var1] == null) {
                Statics.field434[var1] = Statics.field2428.method2735(Statics.field122[var1], 0, Statics.field60[var1]);
                if (Statics.field434[var1] == null) {
                    var0 = false;
                    field471++;
                }
            }
        }
        if (!var0) {
            field301 = 1;
            return;
        }
        field299 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2085.length; var3++) {
            byte[] var4 = Statics.field434[var3];
            if (var4 != null) {
                int var5 = (Statics.field302[var3] >> 8) * 64 - Statics.field200;
                int var6 = (Statics.field302[var3] & 0xFF) * 64 - Statics.field56;
                if (field305) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class107 var9 = new class107(var4);
                int var10 = -1;
                label1119: while (true) {
                    int var11 = var9.method2114();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2114();
                            if (var16 == 0) {
                                continue label1119;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2101() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class36 var22 = class36.method83(var10);
                                if (var19 != 22 || !field246 || var22.field843 != 0 || var22.field841 == 1 || var22.field873) {
                                    if (!var22.method622()) {
                                        field299++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2114();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2101();
                    }
                }
            }
        }
        if (!var2) {
            field301 = 2;
            return;
        }
        if (field301 != 0) {
            method127(class142.field2358 + class2.field25 + class2.field22 + 100 + "%" + class2.field28, true);
        }
        method749();
        method97();
        method749();
        Statics.field62.method1580();
        method749();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field460[var23].method3485();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field80[var24][var25][var26] = 0;
                }
            }
        }
        method749();
        class6.method2903();
        int var27 = Statics.field2085.length;
        class20.method10();
        method1845(true);
        if (!field305) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field302[var28] >> 8) * 64 - Statics.field200;
                int var30 = (Statics.field302[var28] & 0xFF) * 64 - Statics.field56;
                byte[] var31 = Statics.field2085[var28];
                if (var31 != null) {
                    method749();
                    int var32 = Statics.field69 * 8 - 48;
                    int var33 = Statics.field2649 * 8 - 48;
                    class197[] var34 = field460;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field2952[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class107 var38 = new class107(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class6.method2826(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field302[var42] >> 8) * 64 - Statics.field200;
                int var44 = (Statics.field302[var42] & 0xFF) * 64 - Statics.field56;
                byte[] var45 = Statics.field2085[var42];
                if (var45 == null && Statics.field2649 < 800) {
                    method749();
                    class6.method2452(var43, var44, 64, 64);
                }
            }
            method1845(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field434[var46];
                if (var47 != null) {
                    int var48 = (Statics.field302[var46] >> 8) * 64 - Statics.field200;
                    int var49 = (Statics.field302[var46] & 0xFF) * 64 - Statics.field56;
                    method749();
                    class6.method557(var47, var48, var49, Statics.field62, field460);
                }
            }
        }
        if (field305) {
            for (int var50 = 0; var50 < 4; var50++) {
                method749();
                for (int var51 = 0; var51 < 13; var51++) {
                    for (int var52 = 0; var52 < 13; var52++) {
                        boolean var53 = false;
                        int var54 = field306[var50][var51][var52];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < Statics.field302.length; var60++) {
                                if (Statics.field302[var60] == var59 && Statics.field2085[var60] != null) {
                                    class6.method162(Statics.field2085[var60], var50, var51 * 8, var52 * 8, var55, (var57 & 0x7) * 8, (var58 & 0x7) * 8, var56, field460);
                                    var53 = true;
                                    break;
                                }
                            }
                        }
                        if (!var53) {
                            class6.method2308(var50, var51 * 8, var52 * 8);
                        }
                    }
                }
            }
            for (int var61 = 0; var61 < 13; var61++) {
                for (int var62 = 0; var62 < 13; var62++) {
                    int var63 = field306[0][var61][var62];
                    if (var63 == -1) {
                        class6.method2452(var61 * 8, var62 * 8, 8, 8);
                    }
                }
            }
            method1845(true);
            for (int var64 = 0; var64 < 4; var64++) {
                method749();
                for (int var65 = 0; var65 < 13; var65++) {
                    label958: for (int var66 = 0; var66 < 13; var66++) {
                        int var67 = field306[var64][var65][var66];
                        if (var67 != -1) {
                            int var68 = var67 >> 24 & 0x3;
                            int var69 = var67 >> 1 & 0x3;
                            int var70 = var67 >> 14 & 0x3FF;
                            int var71 = var67 >> 3 & 0x7FF;
                            int var72 = (var70 / 8 << 8) + var71 / 8;
                            for (int var73 = 0; var73 < Statics.field302.length; var73++) {
                                if (Statics.field302[var73] == var72 && Statics.field434[var73] != null) {
                                    byte[] var74 = Statics.field434[var73];
                                    int var75 = var65 * 8;
                                    int var76 = var66 * 8;
                                    int var77 = (var70 & 0x7) * 8;
                                    int var78 = (var71 & 0x7) * 8;
                                    class79 var79 = Statics.field62;
                                    class197[] var80 = field460;
                                    class107 var81 = new class107(var74);
                                    int var82 = -1;
                                    while (true) {
                                        int var83 = var81.method2114();
                                        if (var83 == 0) {
                                            continue label958;
                                        }
                                        var82 += var83;
                                        int var84 = 0;
                                        while (true) {
                                            int var85 = var81.method2114();
                                            if (var85 == 0) {
                                                break;
                                            }
                                            var84 += var85 - 1;
                                            int var86 = var84 & 0x3F;
                                            int var87 = var84 >> 6 & 0x3F;
                                            int var88 = var84 >> 12;
                                            int var89 = var81.method2101();
                                            int var90 = var89 >> 2;
                                            int var91 = var89 & 0x3;
                                            if (var68 == var88 && var87 >= var77 && var87 < var77 + 8 && var86 >= var78 && var86 < var78 + 8) {
                                                class36 var92 = class36.method83(var82);
                                                int var94 = var87 & 0x7;
                                                int var95 = var86 & 0x7;
                                                int var97 = var92.field839;
                                                int var98 = var92.field833;
                                                if ((var91 & 0x1) == 1) {
                                                    int var99 = var97;
                                                    var97 = var98;
                                                    var98 = var99;
                                                }
                                                int var100 = var69 & 0x3;
                                                int var101;
                                                if (var100 == 0) {
                                                    var101 = var94;
                                                } else if (var100 == 1) {
                                                    var101 = var95;
                                                } else if (var100 == 2) {
                                                    var101 = 7 - var94 - (var97 - 1);
                                                } else {
                                                    var101 = 7 - var95 - (var98 - 1);
                                                }
                                                int var102 = var75 + var101;
                                                int var104 = var87 & 0x7;
                                                int var105 = var86 & 0x7;
                                                int var107 = var92.field839;
                                                int var108 = var92.field833;
                                                if ((var91 & 0x1) == 1) {
                                                    int var109 = var107;
                                                    var107 = var108;
                                                    var108 = var109;
                                                }
                                                int var110 = var69 & 0x3;
                                                int var111;
                                                if (var110 == 0) {
                                                    var111 = var105;
                                                } else if (var110 == 1) {
                                                    var111 = 7 - var104 - (var107 - 1);
                                                } else if (var110 == 2) {
                                                    var111 = 7 - var105 - (var108 - 1);
                                                } else {
                                                    var111 = var104;
                                                }
                                                int var112 = var76 + var111;
                                                if (var102 > 0 && var112 > 0 && var102 < 103 && var112 < 103) {
                                                    int var113 = var64;
                                                    if ((class6.field80[1][var102][var112] & 0x2) == 2) {
                                                        var113 = var64 - 1;
                                                    }
                                                    class197 var114 = null;
                                                    if (var113 >= 0) {
                                                        var114 = var80[var113];
                                                    }
                                                    class6.method25(var64, var102, var112, var82, var69 + var91 & 0x3, var90, var79, var114);
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
        method1845(true);
        method97();
        method749();
        class79 var115 = Statics.field62;
        class197[] var116 = field460;
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 < 104; var118++) {
                for (int var119 = 0; var119 < 104; var119++) {
                    if ((class6.field80[var117][var118][var119] & 0x1) == 1) {
                        int var120 = var117;
                        if ((class6.field80[1][var118][var119] & 0x2) == 2) {
                            var120 = var117 - 1;
                        }
                        if (var120 >= 0) {
                            var116[var120].method3488(var118, var119);
                        }
                    }
                }
            }
        }
        class6.field92 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field92 < -8) {
            class6.field92 = -8;
        }
        if (class6.field92 > 8) {
            class6.field92 = 8;
        }
        class6.field82 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field82 < -16) {
            class6.field82 = -16;
        }
        if (class6.field82 > 16) {
            class6.field82 = 16;
        }
        for (int var121 = 0; var121 < 4; var121++) {
            byte[][] var122 = Statics.field2398[var121];
            int var123 = (int) Math.sqrt(5100.0D);
            int var124 = var123 * 768 >> 8;
            for (int var125 = 1; var125 < 103; var125++) {
                for (int var126 = 1; var126 < 103; var126++) {
                    int var127 = class6.field94[var121][var126 + 1][var125] - class6.field94[var121][var126 - 1][var125];
                    int var128 = class6.field94[var121][var126][var125 + 1] - class6.field94[var121][var126][var125 - 1];
                    int var129 = (int) Math.sqrt((double) (var128 * var128 + var127 * var127 + 65536));
                    int var130 = (var127 << 8) / var129;
                    int var131 = 65536 / var129;
                    int var132 = (var128 << 8) / var129;
                    int var133 = (var132 * -50 + var130 * -50 + var131 * -10) / var124 + 96;
                    int var134 = (var122[var126][var125] >> 1) + (var122[var126][var125 + 1] >> 3) + (var122[var126][var125 - 1] >> 2) + (var122[var126 - 1][var125] >> 2) + (var122[var126 + 1][var125] >> 3);
                    Statics.field89[var126][var125] = var133 - var134;
                }
            }
            for (int var135 = 0; var135 < 104; var135++) {
                Statics.field1813[var135] = 0;
                Statics.field1863[var135] = 0;
                Statics.field1901[var135] = 0;
                Statics.field85[var135] = 0;
                Statics.field129[var135] = 0;
            }
            for (int var136 = -5; var136 < 109; var136++) {
                for (int var137 = 0; var137 < 104; var137++) {
                    int var138 = var136 + 5;
                    int var10002;
                    if (var138 >= 0 && var138 < 104) {
                        int var139 = Statics.field2966[var121][var138][var137] & 0xFF;
                        if (var139 > 0) {
                            class37 var140 = class37.method2690(var139 - 1);
                            Statics.field1813[var137] += var140.field881;
                            Statics.field1863[var137] += var140.field878;
                            Statics.field1901[var137] += var140.field883;
                            Statics.field85[var137] += var140.field885;
                            var10002 = Statics.field129[var137]++;
                        }
                    }
                    int var141 = var136 - 5;
                    if (var141 >= 0 && var141 < 104) {
                        int var142 = Statics.field2966[var121][var141][var137] & 0xFF;
                        if (var142 > 0) {
                            class37 var143 = class37.method2690(var142 - 1);
                            Statics.field1813[var137] -= var143.field881;
                            Statics.field1863[var137] -= var143.field878;
                            Statics.field1901[var137] -= var143.field883;
                            Statics.field85[var137] -= var143.field885;
                            var10002 = Statics.field129[var137]--;
                        }
                    }
                }
                if (var136 >= 1 && var136 < 103) {
                    int var144 = 0;
                    int var145 = 0;
                    int var146 = 0;
                    int var147 = 0;
                    int var148 = 0;
                    for (int var149 = -5; var149 < 109; var149++) {
                        int var150 = var149 + 5;
                        if (var150 >= 0 && var150 < 104) {
                            var144 += Statics.field1813[var150];
                            var145 += Statics.field1863[var150];
                            var146 += Statics.field1901[var150];
                            var147 += Statics.field85[var150];
                            var148 += Statics.field129[var150];
                        }
                        int var151 = var149 - 5;
                        if (var151 >= 0 && var151 < 104) {
                            var144 -= Statics.field1813[var151];
                            var145 -= Statics.field1863[var151];
                            var146 -= Statics.field1901[var151];
                            var147 -= Statics.field85[var151];
                            var148 -= Statics.field129[var151];
                        }
                        if (var149 >= 1 && var149 < 103 && (!field246 || (class6.field80[0][var136][var149] & 0x2) != 0 || (class6.field80[var121][var136][var149] & 0x10) == 0 && class6.method139(var121, var136, var149) == field489)) {
                            if (var121 < class6.field81) {
                                class6.field81 = var121;
                            }
                            int var152 = Statics.field2966[var121][var136][var149] & 0xFF;
                            int var153 = Statics.field93[var121][var136][var149] & 0xFF;
                            if (var152 > 0 || var153 > 0) {
                                int var154 = class6.field94[var121][var136][var149];
                                int var155 = class6.field94[var121][var136 + 1][var149];
                                int var156 = class6.field94[var121][var136 + 1][var149 + 1];
                                int var157 = class6.field94[var121][var136][var149 + 1];
                                int var158 = Statics.field89[var136][var149];
                                int var159 = Statics.field89[var136 + 1][var149];
                                int var160 = Statics.field89[var136 + 1][var149 + 1];
                                int var161 = Statics.field89[var136][var149 + 1];
                                int var162 = -1;
                                int var163 = -1;
                                if (var152 > 0) {
                                    int var164 = var144 * 256 / var147;
                                    int var165 = var145 / var148;
                                    int var166 = var146 / var148;
                                    var162 = class6.method138(var164, var165, var166);
                                    int var167 = class6.field92 + var164 & 0xFF;
                                    int var168 = class6.field82 + var166;
                                    if (var168 < 0) {
                                        var168 = 0;
                                    } else if (var168 > 255) {
                                        var168 = 255;
                                    }
                                    var163 = class6.method138(var167, var165, var168);
                                }
                                if (var121 > 0) {
                                    boolean var169 = true;
                                    if (var152 == 0 && Statics.field83[var121][var136][var149] != 0) {
                                        var169 = false;
                                    }
                                    if (var153 > 0) {
                                        int var170 = var153 - 1;
                                        class41 var171 = (class41) class41.field952.method3170((long) var170);
                                        class41 var172;
                                        if (var171 == null) {
                                            byte[] var173 = Statics.field951.method2709(4, var170);
                                            class41 var174 = new class41();
                                            if (var173 != null) {
                                                var174.method774(new class107(var173), var170);
                                            }
                                            var174.method773();
                                            class41.field952.method3168(var174, (long) var170);
                                            var172 = var174;
                                        } else {
                                            var172 = var171;
                                        }
                                        if (!var172.field962) {
                                            var169 = false;
                                        }
                                    }
                                    if (var169 && var154 == var155 && var154 == var156 && var154 == var157) {
                                        Statics.field2479[var121][var136][var149] |= 0x924;
                                    }
                                }
                                int var175 = 0;
                                if (var163 != -1) {
                                    var175 = class84.field1470[class6.method2603(var163, 96)];
                                }
                                if (var153 == 0) {
                                    var115.method1585(var121, var136, var149, 0, 0, -1, var154, var155, var156, var157, class6.method2603(var162, var158), class6.method2603(var162, var159), class6.method2603(var162, var160), class6.method2603(var162, var161), 0, 0, 0, 0, var175, 0);
                                } else {
                                    int var176 = Statics.field83[var121][var136][var149] + 1;
                                    byte var177 = Statics.field608[var121][var136][var149];
                                    int var178 = var153 - 1;
                                    class41 var179 = (class41) class41.field952.method3170((long) var178);
                                    class41 var180;
                                    if (var179 == null) {
                                        byte[] var181 = Statics.field951.method2709(4, var178);
                                        class41 var182 = new class41();
                                        if (var181 != null) {
                                            var182.method774(new class107(var181), var178);
                                        }
                                        var182.method773();
                                        class41.field952.method3168(var182, (long) var178);
                                        var180 = var182;
                                    } else {
                                        var180 = var179;
                                    }
                                    int var184 = var180.field950;
                                    int var185;
                                    int var186;
                                    if (var184 >= 0) {
                                        var185 = Statics.field1473.method1817(var184);
                                        var186 = -1;
                                    } else if (var180.field949 == 16711935) {
                                        var186 = -2;
                                        var184 = -1;
                                        var185 = -2;
                                    } else {
                                        var186 = class6.method138(var180.field948, var180.field954, var180.field953);
                                        int var187 = class6.field92 + var180.field948 & 0xFF;
                                        int var188 = class6.field82 + var180.field953;
                                        if (var188 < 0) {
                                            var188 = 0;
                                        } else if (var188 > 255) {
                                            var188 = 255;
                                        }
                                        var185 = class6.method138(var187, var180.field954, var188);
                                    }
                                    int var189 = 0;
                                    if (var185 != -2) {
                                        var189 = class84.field1470[class6.method553(var185, 96)];
                                    }
                                    if (var180.field947 != -1) {
                                        int var190 = class6.field92 + var180.field956 & 0xFF;
                                        int var191 = class6.field82 + var180.field958;
                                        if (var191 < 0) {
                                            var191 = 0;
                                        } else if (var191 > 255) {
                                            var191 = 255;
                                        }
                                        int var192 = class6.method138(var190, var180.field957, var191);
                                        var189 = class84.field1470[class6.method553(var192, 96)];
                                    }
                                    var115.method1585(var121, var136, var149, var176, var177, var184, var154, var155, var156, var157, class6.method2603(var162, var158), class6.method2603(var162, var159), class6.method2603(var162, var160), class6.method2603(var162, var161), class6.method553(var186, var158), class6.method553(var186, var159), class6.method553(var186, var160), class6.method553(var186, var161), var175, var189);
                                }
                            }
                        }
                    }
                }
            }
            for (int var193 = 1; var193 < 103; var193++) {
                for (int var194 = 1; var194 < 103; var194++) {
                    var115.method1723(var121, var194, var193, class6.method139(var121, var194, var193));
                }
            }
            Statics.field2966[var121] = (byte[][]) null;
            Statics.field93[var121] = (byte[][]) null;
            Statics.field83[var121] = (byte[][]) null;
            Statics.field608[var121] = (byte[][]) null;
            Statics.field2398[var121] = (byte[][]) null;
        }
        var115.method1611(-50, -10, -50);
        for (int var195 = 0; var195 < 104; var195++) {
            for (int var196 = 0; var196 < 104; var196++) {
                if ((class6.field80[1][var195][var196] & 0x2) == 2) {
                    var115.method1582(var195, var196);
                }
            }
        }
        int var197 = 1;
        int var198 = 2;
        int var199 = 4;
        for (int var200 = 0; var200 < 4; var200++) {
            if (var200 > 0) {
                var197 <<= 0x3;
                var198 <<= 0x3;
                var199 <<= 0x3;
            }
            for (int var201 = 0; var201 <= var200; var201++) {
                for (int var202 = 0; var202 <= 104; var202++) {
                    for (int var203 = 0; var203 <= 104; var203++) {
                        if ((Statics.field2479[var201][var203][var202] & var197) != 0) {
                            int var204 = var202;
                            int var205 = var202;
                            int var206 = var201;
                            int var207 = var201;
                            while (var204 > 0 && (Statics.field2479[var201][var203][var204 - 1] & var197) != 0) {
                                var204--;
                            }
                            while (var205 < 104 && (Statics.field2479[var201][var203][var205 + 1] & var197) != 0) {
                                var205++;
                            }
                            label691: while (var206 > 0) {
                                for (int var208 = var204; var208 <= var205; var208++) {
                                    if ((Statics.field2479[var206 - 1][var203][var208] & var197) == 0) {
                                        break label691;
                                    }
                                }
                                var206--;
                            }
                            label680: while (var207 < var200) {
                                for (int var209 = var204; var209 <= var205; var209++) {
                                    if ((Statics.field2479[var207 + 1][var203][var209] & var197) == 0) {
                                        break label680;
                                    }
                                }
                                var207++;
                            }
                            int var210 = (var207 + 1 - var206) * (var205 - var204 + 1);
                            if (var210 >= 8) {
                                short var211 = 240;
                                int var212 = class6.field94[var207][var203][var204] - var211;
                                int var213 = class6.field94[var206][var203][var204];
                                class79.method1583(var200, 1, var203 * 128, var203 * 128, var204 * 128, var205 * 128 + 128, var212, var213);
                                for (int var214 = var206; var214 <= var207; var214++) {
                                    for (int var215 = var204; var215 <= var205; var215++) {
                                        Statics.field2479[var214][var203][var215] &= ~var197;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2479[var201][var203][var202] & var198) != 0) {
                            int var216 = var203;
                            int var217 = var203;
                            int var218 = var201;
                            int var219 = var201;
                            while (var216 > 0 && (Statics.field2479[var201][var216 - 1][var202] & var198) != 0) {
                                var216--;
                            }
                            while (var217 < 104 && (Statics.field2479[var201][var217 + 1][var202] & var198) != 0) {
                                var217++;
                            }
                            label744: while (var218 > 0) {
                                for (int var220 = var216; var220 <= var217; var220++) {
                                    if ((Statics.field2479[var218 - 1][var220][var202] & var198) == 0) {
                                        break label744;
                                    }
                                }
                                var218--;
                            }
                            label733: while (var219 < var200) {
                                for (int var221 = var216; var221 <= var217; var221++) {
                                    if ((Statics.field2479[var219 + 1][var221][var202] & var198) == 0) {
                                        break label733;
                                    }
                                }
                                var219++;
                            }
                            int var222 = (var219 + 1 - var218) * (var217 - var216 + 1);
                            if (var222 >= 8) {
                                short var223 = 240;
                                int var224 = class6.field94[var219][var216][var202] - var223;
                                int var225 = class6.field94[var218][var216][var202];
                                class79.method1583(var200, 2, var216 * 128, var217 * 128 + 128, var202 * 128, var202 * 128, var224, var225);
                                for (int var226 = var218; var226 <= var219; var226++) {
                                    for (int var227 = var216; var227 <= var217; var227++) {
                                        Statics.field2479[var226][var227][var202] &= ~var198;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2479[var201][var203][var202] & var199) != 0) {
                            int var228 = var203;
                            int var229 = var203;
                            int var230 = var202;
                            int var231 = var202;
                            while (var230 > 0 && (Statics.field2479[var201][var203][var230 - 1] & var199) != 0) {
                                var230--;
                            }
                            while (var231 < 104 && (Statics.field2479[var201][var203][var231 + 1] & var199) != 0) {
                                var231++;
                            }
                            label797: while (var228 > 0) {
                                for (int var232 = var230; var232 <= var231; var232++) {
                                    if ((Statics.field2479[var201][var228 - 1][var232] & var199) == 0) {
                                        break label797;
                                    }
                                }
                                var228--;
                            }
                            label786: while (var229 < 104) {
                                for (int var233 = var230; var233 <= var231; var233++) {
                                    if ((Statics.field2479[var201][var229 + 1][var233] & var199) == 0) {
                                        break label786;
                                    }
                                }
                                var229++;
                            }
                            if ((var229 - var228 + 1) * (var231 - var230 + 1) >= 4) {
                                int var234 = class6.field94[var201][var228][var230];
                                class79.method1583(var200, 4, var228 * 128, var229 * 128 + 128, var230 * 128, var231 * 128 + 128, var234, var234);
                                for (int var235 = var228; var235 <= var229; var235++) {
                                    for (int var236 = var230; var236 <= var231; var236++) {
                                        Statics.field2479[var201][var235][var236] &= ~var199;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method1845(true);
        int var237 = class6.field81;
        if (var237 > Statics.field588) {
            var237 = Statics.field588;
        }
        if (var237 < Statics.field588 - 1) {
            int var238 = Statics.field588 - 1;
        }
        if (field246) {
            Statics.field62.method1581(class6.field81);
        } else {
            Statics.field62.method1581(0);
        }
        for (int var239 = 0; var239 < 104; var239++) {
            for (int var240 = 0; var240 < 104; var240++) {
                method802(var239, var240);
            }
        }
        method749();
        for (class15 var241 = (class15) field296.method3239(); var241 != null; var241 = (class15) field296.method3248()) {
            if (var241.field214 == -1) {
                var241.field212 = 0;
                method1032(var241);
            } else {
                var241.method3316();
            }
        }
        class36.field827.method3171();
        if (Statics.field994 != null) {
            field284.method2345(105);
            field284.method2090(1057001181);
        }
        if (!field305) {
            int var242 = (Statics.field69 - 6) / 8;
            int var243 = (Statics.field69 + 6) / 8;
            int var244 = (Statics.field2649 - 6) / 8;
            int var245 = (Statics.field2649 + 6) / 8;
            for (int var246 = var242 - 1; var246 <= var243 + 1; var246++) {
                for (int var247 = var244 - 1; var247 <= var245 + 1; var247++) {
                    if (var246 < var242 || var246 > var243 || var247 < var244 || var247 > var245) {
                        Statics.field2428.method2729("m" + var246 + "_" + var247);
                        Statics.field2428.method2729("l" + var246 + "_" + var247);
                    }
                }
            }
        }
        method565(30);
        method749();
        class6.method825();
        field284.method2345(216);
        Statics.field1807.method2436();
        for (int var248 = 0; var248 < 32; var248++) {
            field2055[var248] = 0L;
        }
        for (int var249 = 0; var249 < 32; var249++) {
            field2051[var249] = 0L;
        }
        Statics.field136 = 0;
    }

    @ObfuscatedName("w.al(IIIIIS)V")
    public static final void method147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field62.method1740(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field62.method1641(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field513.field1287;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method83(var12);
            if (var13.field853 == -1) {
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
                class74 var14 = Statics.field1905[var13.field853];
                if (var14 != null) {
                    int var15 = (var13.field839 * 4 - var14.field1308) / 2;
                    int var16 = (var13.field833 * 4 - var14.field1309) / 2;
                    var14.method1547(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field833) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field62.method1664(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field62.method1641(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method83(var21);
            if (var22.field853 != -1) {
                class74 var23 = Statics.field1905[var22.field853];
                if (var23 != null) {
                    int var24 = (var22.field839 * 4 - var23.field1308) / 2;
                    int var25 = (var22.field833 * 4 - var23.field1309) / 2;
                    var23.method1547(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field833) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field513.field1287;
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
        int var29 = Statics.field62.method1713(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method83(var30);
        if (var31.field853 == -1) {
            return;
        }
        class74 var32 = Statics.field1905[var31.field853];
        if (var32 != null) {
            int var33 = (var31.field839 * 4 - var32.field1308) / 2;
            int var34 = (var31.field833 * 4 - var32.field1309) / 2;
            var32.method1547(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field833) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bz.as(B)V")
    public static final void method1296() {
        if (field376 == 14) {
            int var0 = field403.method2101();
            int var1 = (var0 >> 4 & 0x7) + Statics.field139;
            int var2 = (var0 & 0x7) + Statics.field165;
            int var3 = field403.method2103();
            int var4 = field403.method2101();
            int var5 = field403.method2103();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var6 = var1 * 128 + 64;
                int var7 = var2 * 128 + 64;
                class26 var8 = new class26(var3, Statics.field588, var6, var7, method487(var6, var7, Statics.field588) - var4, var5, field250);
                field405.method3260(var8);
            }
        } else if (field376 == 21) {
            int var9 = field403.method2135();
            int var10 = field403.method2297();
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = field491[var11];
            int var14 = field403.method2127();
            int var15 = (var14 >> 4 & 0x7) + Statics.field139;
            int var16 = (var14 & 0x7) + Statics.field165;
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                method2537(Statics.field588, var15, var16, var13, var9, var11, var12, 0, -1);
            }
        } else {
            if (field376 == 71) {
                int var17 = field403.method2101();
                int var18 = (var17 >> 4 & 0x7) + Statics.field139;
                int var19 = (var17 & 0x7) + Statics.field165;
                int var20 = field403.method2103();
                int var21 = field403.method2101();
                int var22 = var21 >> 4 & 0xF;
                int var23 = var21 & 0x7;
                int var24 = field403.method2101();
                if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                    int var25 = var22 + 1;
                    if (Statics.field1452.field771[0] >= var18 - var25 && Statics.field1452.field771[0] <= var18 + var25 && Statics.field1452.field768[0] >= var19 - var25 && Statics.field1452.field768[0] <= var19 + var25 && field482 != 0 && var23 > 0 && field483 < 50) {
                        field484[field483] = var20;
                        field485[field483] = var23;
                        field486[field483] = var24;
                        field493[field483] = null;
                        field487[field483] = (var18 << 16) + (var19 << 8) + var22;
                        field483++;
                    }
                }
            }
            if (field376 == 168) {
                byte var26 = field403.method2147();
                int var27 = field403.method2134();
                byte var28 = field403.method2128();
                int var29 = field403.method2127();
                int var30 = var29 >> 2;
                int var31 = var29 & 0x3;
                int var32 = field491[var30];
                int var33 = field403.method2135();
                byte var34 = field403.method2129();
                int var35 = field403.method2127();
                int var36 = (var35 >> 4 & 0x7) + Statics.field139;
                int var37 = (var35 & 0x7) + Statics.field165;
                byte var38 = field403.method2129();
                int var39 = field403.method2103();
                int var40 = field403.method2136();
                class3 var41;
                if (field390 == var40) {
                    var41 = Statics.field1452;
                } else {
                    var41 = field268[var40];
                }
                if (var41 != null) {
                    class36 var42 = class36.method83(var27);
                    int var43;
                    int var44;
                    if (var31 == 1 || var31 == 3) {
                        var43 = var42.field833;
                        var44 = var42.field839;
                    } else {
                        var43 = var42.field839;
                        var44 = var42.field833;
                    }
                    int var45 = (var43 >> 1) + var36;
                    int var46 = (var43 + 1 >> 1) + var36;
                    int var47 = (var44 >> 1) + var37;
                    int var48 = (var44 + 1 >> 1) + var37;
                    int[][] var49 = class6.field94[Statics.field588];
                    int var50 = var49[var45][var47] + var49[var46][var47] + var49[var45][var48] + var49[var46][var48] >> 2;
                    int var51 = (var36 << 7) + (var43 << 6);
                    int var52 = (var37 << 7) + (var44 << 6);
                    class98 var53 = var42.method629(var30, var31, var49, var51, var50, var52);
                    if (var53 != null) {
                        method2537(Statics.field588, var36, var37, var32, -1, 0, 0, var33 + 1, var39 + 1);
                        var41.field40 = field250 + var33;
                        var41.field41 = field250 + var39;
                        var41.field45 = var53;
                        var41.field39 = var36 * 128 + var43 * 64;
                        var41.field44 = var37 * 128 + var44 * 64;
                        var41.field43 = var50;
                        if (var26 > var38) {
                            byte var54 = var26;
                            var26 = var38;
                            var38 = var54;
                        }
                        if (var34 > var28) {
                            byte var55 = var34;
                            var34 = var28;
                            var28 = var55;
                        }
                        var41.field46 = var26 + var36;
                        var41.field48 = var36 + var38;
                        var41.field33 = var34 + var37;
                        var41.field47 = var28 + var37;
                    }
                }
            }
            if (field376 == 227) {
                int var56 = field403.method2101();
                int var57 = (var56 >> 4 & 0x7) + Statics.field139;
                int var58 = (var56 & 0x7) + Statics.field165;
                int var59 = field403.method2103();
                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                    class177 var60 = field379[Statics.field588][var57][var58];
                    if (var60 != null) {
                        for (class25 var61 = (class25) var60.method3239(); var61 != null; var61 = (class25) var60.method3248()) {
                            if ((var59 & 0x7FFF) == var61.field604) {
                                var61.method3316();
                                break;
                            }
                        }
                        if (var60.method3239() == null) {
                            field379[Statics.field588][var57][var58] = null;
                        }
                        method802(var57, var58);
                    }
                }
            } else if (field376 == 196) {
                int var62 = field403.method2134();
                int var63 = field403.method2103();
                int var64 = field403.method2101();
                int var65 = (var64 >> 4 & 0x7) + Statics.field139;
                int var66 = (var64 & 0x7) + Statics.field165;
                if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                    class25 var67 = new class25();
                    var67.field604 = var62;
                    var67.field602 = var63;
                    if (field379[Statics.field588][var65][var66] == null) {
                        field379[Statics.field588][var65][var66] = new class177();
                    }
                    field379[Statics.field588][var65][var66].method3260(var67);
                    method802(var65, var66);
                }
            } else if (field376 == 237) {
                int var68 = field403.method2126();
                int var69 = var68 >> 2;
                int var70 = var68 & 0x3;
                int var71 = field491[var69];
                int var72 = field403.method2297();
                int var73 = (var72 >> 4 & 0x7) + Statics.field139;
                int var74 = (var72 & 0x7) + Statics.field165;
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                    method2537(Statics.field588, var73, var74, var71, -1, var69, var70, 0, -1);
                }
            } else if (field376 == 80) {
                int var75 = field403.method2101();
                int var76 = (var75 >> 4 & 0x7) + Statics.field139;
                int var77 = (var75 & 0x7) + Statics.field165;
                int var78 = var76 + field403.method2102();
                int var79 = var77 + field403.method2102();
                int var80 = field403.method2104();
                int var81 = field403.method2103();
                int var82 = field403.method2101() * 4;
                int var83 = field403.method2101() * 4;
                int var84 = field403.method2103();
                int var85 = field403.method2103();
                int var86 = field403.method2101();
                int var87 = field403.method2101();
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104 && var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104 && var81 != 65535) {
                    int var88 = var76 * 128 + 64;
                    int var89 = var77 * 128 + 64;
                    int var90 = var78 * 128 + 64;
                    int var91 = var79 * 128 + 64;
                    class7 var92 = new class7(var81, Statics.field588, var88, var89, method487(var88, var89, Statics.field588) - var82, field250 + var84, field250 + var85, var86, var87, var80, var83);
                    var92.method86(var90, var91, method487(var90, var91, Statics.field588) - var83, field250 + var84);
                    field381.method3260(var92);
                }
            } else if (field376 == 178) {
                int var93 = field403.method2101();
                int var94 = (var93 >> 4 & 0x7) + Statics.field139;
                int var95 = (var93 & 0x7) + Statics.field165;
                int var96 = field403.method2103();
                int var97 = field403.method2103();
                int var98 = field403.method2103();
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    class177 var99 = field379[Statics.field588][var94][var95];
                    if (var99 != null) {
                        for (class25 var100 = (class25) var99.method3239(); var100 != null; var100 = (class25) var99.method3248()) {
                            if ((var96 & 0x7FFF) == var100.field604 && var100.field602 == var97) {
                                var100.field602 = var98;
                                break;
                            }
                        }
                        method802(var94, var95);
                    }
                }
            } else if (field376 == 171) {
                int var101 = field403.method2297();
                int var102 = (var101 >> 4 & 0x7) + Statics.field139;
                int var103 = (var101 & 0x7) + Statics.field165;
                int var104 = field403.method2136();
                int var105 = field403.method2126();
                int var106 = var105 >> 2;
                int var107 = var105 & 0x3;
                int var108 = field491[var106];
                if (var102 >= 0 && var103 >= 0 && var102 < 103 && var103 < 103) {
                    if (var108 == 0) {
                        class80 var109 = Statics.field62.method1602(Statics.field588, var102, var103);
                        if (var109 != null) {
                            int var110 = var109.field1411 >> 14 & 0x7FFF;
                            if (var106 == 2) {
                                var109.field1410 = new class11(var110, 2, var107 + 4, Statics.field588, var102, var103, var104, false, var109.field1410);
                                var109.field1406 = new class11(var110, 2, var107 + 1 & 0x3, Statics.field588, var102, var103, var104, false, var109.field1406);
                            } else {
                                var109.field1410 = new class11(var110, var106, var107, Statics.field588, var102, var103, var104, false, var109.field1410);
                            }
                        }
                    }
                    if (var108 == 1) {
                        class87 var111 = Statics.field62.method1603(Statics.field588, var102, var103);
                        if (var111 != null) {
                            int var112 = var111.field1501 >> 14 & 0x7FFF;
                            if (var106 == 4 || var106 == 5) {
                                var111.field1499 = new class11(var112, 4, var107, Statics.field588, var102, var103, var104, false, var111.field1499);
                            } else if (var106 == 6) {
                                var111.field1499 = new class11(var112, 4, var107 + 4, Statics.field588, var102, var103, var104, false, var111.field1499);
                            } else if (var106 == 7) {
                                var111.field1499 = new class11(var112, 4, (var107 + 2 & 0x3) + 4, Statics.field588, var102, var103, var104, false, var111.field1499);
                            } else if (var106 == 8) {
                                var111.field1499 = new class11(var112, 4, var107 + 4, Statics.field588, var102, var103, var104, false, var111.field1499);
                                var111.field1500 = new class11(var112, 4, (var107 + 2 & 0x3) + 4, Statics.field588, var102, var103, var104, false, var111.field1500);
                            }
                        }
                    }
                    if (var108 == 2) {
                        class91 var113 = Statics.field62.method1604(Statics.field588, var102, var103);
                        if (var106 == 11) {
                            var106 = 10;
                        }
                        if (var113 != null) {
                            var113.field1551 = new class11(var113.field1559 >> 14 & 0x7FFF, var106, var107, Statics.field588, var102, var103, var104, false, var113.field1551);
                        }
                    }
                    if (var108 == 3) {
                        class86 var114 = Statics.field62.method1623(Statics.field588, var102, var103);
                        if (var114 != null) {
                            var114.field1491 = new class11(var114.field1481 >> 14 & 0x7FFF, 22, var107, Statics.field588, var102, var103, var104, false, var114.field1491);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dz.ai(IIIIIIIIII)V")
    public static final void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field296.method3239(); var10 != null; var10 = (class15) field296.method3248()) {
            if (var10.field215 == arg0 && var10.field209 == arg1 && var10.field205 == arg2 && var10.field203 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field215 = arg0;
            var9.field203 = arg3;
            var9.field209 = arg1;
            var9.field205 = arg2;
            method1032(var9);
            field296.method3260(var9);
        }
        var9.field204 = arg4;
        var9.field211 = arg5;
        var9.field210 = arg6;
        var9.field212 = arg7;
        var9.field214 = arg8;
    }

    @ObfuscatedName("bf.ad(Ll;I)V")
    public static final void method1032(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field203 == 0) {
            var1 = Statics.field62.method1740(arg0.field215, arg0.field209, arg0.field205);
        }
        if (arg0.field203 == 1) {
            var1 = Statics.field62.method1607(arg0.field215, arg0.field209, arg0.field205);
        }
        if (arg0.field203 == 2) {
            var1 = Statics.field62.method1664(arg0.field215, arg0.field209, arg0.field205);
        }
        if (arg0.field203 == 3) {
            var1 = Statics.field62.method1713(arg0.field215, arg0.field209, arg0.field205);
        }
        if (var1 != 0) {
            int var5 = Statics.field62.method1641(arg0.field215, arg0.field209, arg0.field205, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field213 = var2;
        arg0.field208 = var3;
        arg0.field207 = var4;
    }

    @ObfuscatedName("af.bf(IIIIIIIB)V")
    public static final void method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field246 && Statics.field588 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field62.method1740(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field62.method1607(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field62.method1664(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field62.method1713(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field62.method1641(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field62.method1589(arg0, arg2, arg3);
                class36 var15 = class36.method83(var12);
                if (var15.field841 != 0) {
                    field460[arg0].method3497(arg2, arg3, var13, var14, var15.field826);
                }
            }
            if (arg1 == 1) {
                Statics.field62.method1598(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field62.method1599(arg0, arg2, arg3);
                class36 var16 = class36.method83(var12);
                if (var16.field839 + arg2 > 103 || var16.field839 + arg3 > 103 || var16.field833 + arg2 > 103 || var16.field833 + arg3 > 103) {
                    return;
                }
                if (var16.field841 != 0) {
                    field460[arg0].method3492(arg2, arg3, var16.field839, var16.field833, var14, var16.field826);
                }
            }
            if (arg1 == 3) {
                Statics.field62.method1600(arg0, arg2, arg3);
                class36 var17 = class36.method83(var12);
                if (var17.field841 == 1) {
                    field460[arg0].method3494(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field80[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class79 var19 = Statics.field62;
        class197 var20 = field460[arg0];
        class36 var21 = class36.method83(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field833;
            var23 = var21.field839;
        } else {
            var22 = var21.field839;
            var23 = var21.field833;
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
        int[][] var28 = class6.field94[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field843 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field831 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field837 == -1 && var21.field865 == null) {
                var34 = var21.method629(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1586(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field841 == 1) {
                var20.method3495(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field837 == -1 && var21.field865 == null) {
                var57 = var21.method629(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1590(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field841 != 0) {
                var20.method3491(arg2, arg3, var22, var23, var21.field826);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field837 == -1 && var21.field865 == null) {
                var35 = var21.method629(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1590(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field841 != 0) {
                var20.method3491(arg2, arg3, var22, var23, var21.field826);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field837 == -1 && var21.field865 == null) {
                var36 = var21.method629(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1588(arg0, arg2, arg3, var29, var36, (class78) null, class6.field86[arg5], 0, var32, var33);
            if (var21.field841 != 0) {
                var20.method3493(arg2, arg3, arg6, arg5, var21.field826);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field837 == -1 && var21.field865 == null) {
                var37 = var21.method629(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1588(arg0, arg2, arg3, var29, var37, (class78) null, class6.field87[arg5], 0, var32, var33);
            if (var21.field841 != 0) {
                var20.method3493(arg2, arg3, arg6, arg5, var21.field826);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field837 == -1 && var21.field865 == null) {
                var39 = var21.method629(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method629(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field837, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1588(arg0, arg2, arg3, var29, var39, var40, class6.field86[arg5], class6.field86[var38], var32, var33);
            if (var21.field841 != 0) {
                var20.method3493(arg2, arg3, arg6, arg5, var21.field826);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field837 == -1 && var21.field865 == null) {
                var41 = var21.method629(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1588(arg0, arg2, arg3, var29, var41, (class78) null, class6.field87[arg5], 0, var32, var33);
            if (var21.field841 != 0) {
                var20.method3493(arg2, arg3, arg6, arg5, var21.field826);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field837 == -1 && var21.field865 == null) {
                var42 = var21.method629(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1590(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field841 != 0) {
                var20.method3491(arg2, arg3, var22, var23, var21.field826);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field837 == -1 && var21.field865 == null) {
                var43 = var21.method629(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1698(arg0, arg2, arg3, var29, var43, (class78) null, class6.field86[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1740(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method83(var45 >> 14 & 0x7FFF).field854;
            }
            class78 var46;
            if (var21.field837 == -1 && var21.field865 == null) {
                var46 = var21.method629(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1698(arg0, arg2, arg3, var29, var46, (class78) null, class6.field86[arg5], 0, class6.field88[arg5] * var44, class6.field84[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1740(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method83(var48 >> 14 & 0x7FFF).field854 / 2;
            }
            class78 var49;
            if (var21.field837 == -1 && var21.field865 == null) {
                var49 = var21.method629(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1698(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field90[arg5] * var47, class6.field91[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field837 == -1 && var21.field865 == null) {
                var51 = var21.method629(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1698(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1740(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method83(var53 >> 14 & 0x7FFF).field854 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field837 == -1 && var21.field865 == null) {
                var55 = var21.method629(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method629(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field837, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field837, true, (class78) null);
            }
            var19.method1698(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field90[arg5] * var52, class6.field91[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("aa.bu(III)V")
    public static final void method802(int arg0, int arg1) {
        class177 var2 = field379[Statics.field588][arg0][arg1];
        if (var2 == null) {
            Statics.field62.method1601(Statics.field588, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3239(); var6 != null; var6 = (class25) var2.method3248()) {
            class45 var7 = class45.method504(var6.field604);
            long var8 = (long) var7.field1017;
            if (var7.field1016 == 1) {
                var8 = (long) (var6.field602 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field62.method1601(Statics.field588, arg0, arg1);
            return;
        }
        var2.method3240(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3239(); var12 != null; var12 = (class25) var2.method3248()) {
            if (var5.field604 != var12.field604) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field604 != var12.field604 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field62.method1587(Statics.field588, arg0, arg1, method487(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field588), var5, var13, var10, var11);
    }

    @ObfuscatedName("n.bi(B)V")
    public static final void method51() {
        while (true) {
            if (field403.method2344(field371) >= 11) {
                int var0 = field403.method2357(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field268[var0] == null) {
                        field268[var0] = new class3();
                        if (field320[var0] != null) {
                            field268[var0].method16(field320[var0]);
                        }
                        var1 = true;
                    }
                    field366[++field293 - 1] = var0;
                    class3 var2 = field268[var0];
                    var2.field761 = field250;
                    int var3 = field403.method2357(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field377[field403.method2357(3)];
                    if (var1) {
                        var2.field763 = var2.field716 = var4;
                    }
                    int var5 = field403.method2357(1);
                    if (var5 == 1) {
                        field332[++field367 - 1] = var0;
                    }
                    int var6 = field403.method2357(1);
                    int var7 = field403.method2357(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method566(Statics.field1452.field771[0] + var3, Statics.field1452.field768[0] + var7, var6 == 1);
                    continue;
                }
            }
            field403.method2349();
            return;
        }
    }

    @ObfuscatedName("y.ba(I)V")
    public static final void method462() {
        while (true) {
            if (field403.method2344(field371) >= 27) {
                int var0 = field403.method2357(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field280[var0] == null) {
                        field280[var0] = new class30();
                        var1 = true;
                    }
                    class30 var2 = field280[var0];
                    field282[++field281 - 1] = var0;
                    var2.field761 = field250;
                    int var3 = field403.method2357(1);
                    if (var3 == 1) {
                        field332[++field367 - 1] = var0;
                    }
                    var2.field680 = class35.method121(field403.method2357(14));
                    int var4 = field377[field403.method2357(3)];
                    if (var1) {
                        var2.field763 = var2.field716 = var4;
                    }
                    int var5 = field403.method2357(1);
                    int var6 = field403.method2357(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field403.method2357(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.field718 = var2.field680.field789;
                    var2.field765 = var2.field680.field811;
                    if (var2.field765 == 0) {
                        var2.field716 = 0;
                    }
                    var2.field722 = var2.field680.field802;
                    var2.field723 = var2.field680.field795;
                    var2.field753 = var2.field680.field786;
                    var2.field725 = var2.field680.field797;
                    var2.field719 = var2.field680.field791;
                    var2.field720 = var2.field680.field792;
                    var2.field754 = var2.field680.field818;
                    var2.method566(Statics.field1452.field771[0] + var7, Statics.field1452.field768[0] + var6, var5 == 1);
                    continue;
                }
            }
            field403.method2349();
            return;
        }
    }

    @ObfuscatedName("e.bt(B)V")
    public static final void method30() {
        int var0 = Statics.field1513;
        int var1 = Statics.field49;
        int var2 = Statics.field1656;
        int var3 = Statics.field697;
        int var4 = 6116423;
        class73.method1497(var0, var1, var2, var3, var4);
        class73.method1497(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1526(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field875.method3341(class142.field2288, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field1996;
        int var6 = class127.field1999 * 1288203703;
        for (int var7 = 0; var7 < field388; var7++) {
            int var8 = (field388 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class193 var10 = Statics.field875;
            String var11;
            if (field394[var7].length() > 0) {
                var11 = field425[var7] + class142.field2296 + field394[var7];
            } else {
                var11 = field425[var7];
            }
            var10.method3341(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field1513;
        int var13 = Statics.field49;
        int var14 = Statics.field1656;
        int var15 = Statics.field697;
        for (int var16 = 0; var16 < field448; var16++) {
            if (field399[var16] + field316[var16] > var12 && field316[var16] < var12 + var14 && field423[var16] + field362[var16] > var13 && field362[var16] < var13 + var15) {
                field314[var16] = true;
            }
        }
    }

    @ObfuscatedName("at.bo(IIIII)V")
    public static final void method768(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field448; var4++) {
            if (field399[var4] + field316[var4] > arg0 && field316[var4] < arg0 + arg2 && field423[var4] + field362[var4] > arg1 && field362[var4] < arg1 + arg3) {
                field454[var4] = true;
            }
        }
    }

    @ObfuscatedName("cf.br(III)V")
    public static final void method1938(int arg0, int arg1) {
        int var2 = Statics.field875.method3345(class142.field2288);
        for (int var3 = 0; var3 < field388; var3++) {
            int var4 = Statics.field875.method3345(method168(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field388 * 15 + 21;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > 765) {
            var6 = 765 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field387 = true;
        Statics.field1513 = var6;
        Statics.field49 = var7;
        Statics.field1656 = var2;
        Statics.field697 = field388 * 15 + 22;
    }

    @ObfuscatedName("cj.be(IB)Z")
    public static final boolean method1741(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field326[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ex.bp(IB)V")
    public static final void method2912(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field389[arg0];
        int var2 = field481[arg0];
        int var3 = field326[arg0];
        int var4 = field392[arg0];
        String var5 = field425[arg0];
        String var6 = field394[arg0];
        method2580(var1, var2, var3, var4, var5, var6, class127.field1993, class127.field2006);
    }

    @ObfuscatedName("dy.bc(Lak;III)V")
    public static final void method2488(class27 arg0, int arg1, int arg2) {
        method2580(arg0.field626, arg0.field622, arg0.field625, arg0.field621, arg0.field624, arg0.field624, arg1, arg2);
    }

    @ObfuscatedName("dl.bn(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2580(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 8) {
            class30 var8 = field280[arg3];
            if (var8 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(58);
                field284.method2276(class124.field1957[82] ? 1 : 0);
                field284.method2251(arg3);
                field284.method2142(Statics.field741);
                field284.method2251(field402);
            }
        }
        if (arg2 == 1002) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field284.method2345(170);
            field284.method2278(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 13) {
            class30 var9 = field280[arg3];
            if (var9 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(247);
                field284.method2214(class124.field1957[82] ? 1 : 0);
                field284.method2251(arg3);
            }
        }
        if (arg2 == 10) {
            class30 var10 = field280[arg3];
            if (var10 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(48);
                field284.method2133(arg3);
                field284.method2301(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(66);
            field284.method2278(arg3);
            field284.method2251(Statics.field200 + arg0);
            field284.method2251(Statics.field56 + arg1);
            field284.method2301(class124.field1957[82] ? 1 : 0);
        }
        if (arg2 == 46) {
            class3 var11 = field268[arg3];
            if (var11 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(149);
                field284.method2301(class124.field1957[82] ? 1 : 0);
                field284.method2278(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var12 = field268[arg3];
            if (var12 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(99);
                field284.method2143(Statics.field741);
                field284.method2251(field402);
                field284.method2133(arg3);
                field284.method2276(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(62);
            field284.method2278(Statics.field200 + arg0);
            field284.method2124(class124.field1957[82] ? 1 : 0);
            field284.method2133(Statics.field56 + arg1);
            field284.method2278(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 24) {
            class152 var13 = class152.method868(arg1);
            boolean var14 = true;
            if (var13.field2530 > 0) {
                var14 = method582(var13);
            }
            if (var14) {
                field284.method2345(101);
                field284.method2090(arg1);
            }
        }
        if (arg2 == 25) {
            class152 var15 = class152.method2487(arg1, arg0);
            if (var15 != null) {
                method1396();
                int var16 = class156.method178(method132(var15));
                int var17 = var15.field2564;
                class152 var18 = class152.method2487(arg1, arg0);
                if (var18 != null && var18.field2586 != null) {
                    class1 var19 = new class1();
                    var19.field15 = var18;
                    var19.field5 = var18.field2586;
                    class32.method2405(var19, 200000);
                }
                field410 = var17;
                field401 = true;
                Statics.field741 = arg1;
                field402 = arg0;
                Statics.field712 = var16;
                Statics.method122(var18);
                field421 = 0;
                String var20;
                if (class156.method178(method132(var15)) == 0) {
                    var20 = null;
                } else if (var15.field2592 == null || var15.field2592.trim().length() == 0) {
                    var20 = null;
                } else {
                    var20 = var15.field2592;
                }
                field404 = var20;
                if (field404 == null) {
                    field404 = "Null";
                }
                if (var15.field2582) {
                    field330 = var15.field2630 + class2.method584(16777215);
                } else {
                    field330 = class2.method584(65280) + var15.field2561 + class2.method584(16777215);
                }
            }
            return;
        }
        if (arg2 == 23) {
            Statics.field62.method1617(Statics.field588, arg0, arg1);
        }
        if (arg2 == 6) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(191);
            field284.method2133(Statics.field200 + arg0);
            field284.method2131(arg3 >> 14 & 0x7FFF);
            field284.method2278(Statics.field56 + arg1);
            field284.method2124(class124.field1957[82] ? 1 : 0);
        }
        if (arg2 == 28) {
            field284.method2345(101);
            field284.method2090(arg1);
            class152 var21 = class152.method868(arg1);
            if (var21.field2543 != null && var21.field2543[0][0] == 5) {
                int var22 = var21.field2543[0][1];
                class154.field2650[var22] = 1 - class154.field2650[var22];
                method31(var22);
            }
        }
        if (arg2 == 16) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(107);
            field284.method2131(Statics.field56 + arg1);
            field284.method2301(class124.field1957[82] ? 1 : 0);
            field284.method2251(arg3);
            field284.method2133(Statics.field200 + arg0);
            field284.method2143(Statics.field1107);
            field284.method2133(Statics.field1275);
            field284.method2278(Statics.field120);
        }
        if (arg2 == 31) {
            field284.method2345(73);
            field284.method2251(Statics.field120);
            field284.method2131(Statics.field1275);
            field284.method2131(arg3);
            field284.method2143(arg1);
            field284.method2090(Statics.field1107);
            field284.method2133(arg0);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 37) {
            field284.method2345(231);
            field284.method2278(arg0);
            field284.method2251(arg3);
            field284.method2143(arg1);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 14) {
            class3 var23 = field268[arg3];
            if (var23 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(55);
                field284.method2251(Statics.field120);
                field284.method2251(Statics.field1275);
                field284.method2143(Statics.field1107);
                field284.method2301(class124.field1957[82] ? 1 : 0);
                field284.method2133(arg3);
            }
        }
        if (arg2 == 43) {
            field284.method2345(155);
            field284.method2090(arg1);
            field284.method2251(arg0);
            field284.method2133(arg3);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 2) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(114);
            field284.method2143(Statics.field741);
            field284.method2133(Statics.field56 + arg1);
            field284.method2278(Statics.field200 + arg0);
            field284.method2131(field402);
            field284.method2214(class124.field1957[82] ? 1 : 0);
            field284.method2131(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 29) {
            field284.method2345(101);
            field284.method2090(arg1);
            class152 var24 = class152.method868(arg1);
            if (var24.field2543 != null && var24.field2543[0][0] == 5) {
                int var25 = var24.field2543[0][1];
                if (class154.field2650[var25] != var24.field2640[0]) {
                    class154.field2650[var25] = var24.field2640[0];
                    method31(var25);
                }
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class152 var26 = class152.method2487(arg1, arg0);
            if (var26 != null) {
                int var27 = var26.field2564;
                class152 var28 = class152.method2487(arg1, arg0);
                if (var28 != null) {
                    if (var28.field2613 != null) {
                        class1 var29 = new class1();
                        var29.field15 = var28;
                        var29.field6 = arg3;
                        var29.field10 = arg5;
                        var29.field5 = var28.field2613;
                        class32.method2405(var29, 200000);
                    }
                    boolean var30 = true;
                    if (var28.field2530 > 0) {
                        var30 = method582(var28);
                    }
                    if (var30 && class156.method2408(method132(var28), arg3 - 1)) {
                        if (arg3 == 1) {
                            field284.method2345(220);
                            field284.method2090(arg1);
                            field284.method2251(arg0);
                            field284.method2251(var27);
                        }
                        if (arg3 == 2) {
                            field284.method2345(240);
                            field284.method2090(arg1);
                            field284.method2251(arg0);
                            field284.method2251(var27);
                        }
                        if (arg3 == 3) {
                            field284.method2345(230);
                            field284.method2090(arg1);
                            field284.method2251(arg0);
                            field284.method2251(var27);
                        }
                        if (arg3 == 4) {
                            field284.method2345(181);
                            field284.method2090(arg1);
                            field284.method2251(arg0);
                            field284.method2251(var27);
                        }
                        if (arg3 == 5) {
                            field284.method2345(65);
                            field284.method2090(arg1);
                            field284.method2251(arg0);
                            field284.method2251(var27);
                        }
                        if (arg3 == 6) {
                            field284.method2345(91);
                            field284.method2090(arg1);
                            field284.method2251(arg0);
                            field284.method2251(var27);
                        }
                        if (arg3 == 7) {
                            field284.method2345(225);
                            field284.method2090(arg1);
                            field284.method2251(arg0);
                            field284.method2251(var27);
                        }
                        if (arg3 == 8) {
                            field284.method2345(57);
                            field284.method2090(arg1);
                            field284.method2251(arg0);
                            field284.method2251(var27);
                        }
                        if (arg3 == 9) {
                            field284.method2345(54);
                            field284.method2090(arg1);
                            field284.method2251(arg0);
                            field284.method2251(var27);
                        }
                        if (arg3 == 10) {
                            field284.method2345(20);
                            field284.method2090(arg1);
                            field284.method2251(arg0);
                            field284.method2251(var27);
                        }
                    }
                }
            }
        }
        if (arg2 == 21) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(42);
            field284.method2278(arg3);
            field284.method2133(Statics.field200 + arg0);
            field284.method2251(Statics.field56 + arg1);
            field284.method2214(class124.field1957[82] ? 1 : 0);
        }
        if (arg2 == 50) {
            class3 var31 = field268[arg3];
            if (var31 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(189);
                field284.method2124(class124.field1957[82] ? 1 : 0);
                field284.method2251(arg3);
            }
        }
        if (arg2 == 9) {
            class30 var32 = field280[arg3];
            if (var32 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(135);
                field284.method2133(arg3);
                field284.method2301(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field284.method2345(208);
            field284.method2131(arg3);
            field284.method2251(arg0);
            field284.method2142(arg1);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 1001) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(168);
            field284.method2133(arg3 >> 14 & 0x7FFF);
            field284.method2276(class124.field1957[82] ? 1 : 0);
            field284.method2278(Statics.field56 + arg1);
            field284.method2278(Statics.field200 + arg0);
        }
        if (arg2 == 1) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(176);
            field284.method2133(Statics.field200 + arg0);
            field284.method2276(class124.field1957[82] ? 1 : 0);
            field284.method2133(Statics.field56 + arg1);
            field284.method2278(arg3 >> 14 & 0x7FFF);
            field284.method2131(Statics.field1275);
            field284.method2131(Statics.field120);
            field284.method2090(Statics.field1107);
        }
        if (arg2 == 40) {
            field284.method2345(182);
            field284.method2131(arg0);
            field284.method2251(arg3);
            field284.method2090(arg1);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 48) {
            class3 var33 = field268[arg3];
            if (var33 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(78);
                field284.method2301(class124.field1957[82] ? 1 : 0);
                field284.method2278(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var34 = field268[arg3];
            if (var34 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(188);
                field284.method2131(arg3);
                field284.method2276(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class3 var35 = field268[arg3];
            if (var35 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(22);
                field284.method2214(class124.field1957[82] ? 1 : 0);
                field284.method2278(arg3);
            }
        }
        if (arg2 == 42) {
            field284.method2345(140);
            field284.method2278(arg0);
            field284.method2278(arg3);
            field284.method2142(arg1);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 58) {
            class152 var36 = class152.method2487(arg1, arg0);
            if (var36 != null) {
                field284.method2345(148);
                field284.method2278(var36.field2564);
                field284.method2278(field410);
                field284.method2118(Statics.field741);
                field284.method2090(arg1);
                field284.method2278(field402);
                field284.method2131(arg0);
            }
        }
        if (arg2 == 11) {
            class30 var37 = field280[arg3];
            if (var37 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(100);
                field284.method2214(class124.field1957[82] ? 1 : 0);
                field284.method2133(arg3);
            }
        }
        if (arg2 == 22) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(61);
            field284.method2124(class124.field1957[82] ? 1 : 0);
            field284.method2251(Statics.field200 + arg0);
            field284.method2133(Statics.field56 + arg1);
            field284.method2131(arg3);
        }
        if (arg2 == 34) {
            field284.method2345(80);
            field284.method2133(arg3);
            field284.method2142(arg1);
            field284.method2131(arg0);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 1005) {
            class152 var38 = class152.method868(arg1);
            if (var38 == null || var38.field2629[arg0] < 100000) {
                field284.method2345(103);
                field284.method2251(arg3);
            } else {
                class10.method551(27, "", var38.field2629[arg0] + " x " + class45.method504(arg3).field1039);
            }
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 1003) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            class30 var39 = field280[arg3];
            if (var39 != null) {
                class35 var40 = var39.field680;
                if (var40.field817 != null) {
                    var40 = var40.method593();
                }
                if (var40 != null) {
                    field284.method2345(46);
                    field284.method2278(var40.field785);
                }
            }
        }
        if (arg2 == 41) {
            field284.method2345(142);
            field284.method2278(arg3);
            field284.method2278(arg0);
            field284.method2090(arg1);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 12) {
            class30 var41 = field280[arg3];
            if (var41 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(214);
                field284.method2131(arg3);
                field284.method2276(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(254);
            field284.method2251(arg3 >> 14 & 0x7FFF);
            field284.method2133(Statics.field56 + arg1);
            field284.method2131(Statics.field200 + arg0);
            field284.method2276(class124.field1957[82] ? 1 : 0);
        }
        if (arg2 == 39) {
            field284.method2345(198);
            field284.method2142(arg1);
            field284.method2131(arg3);
            field284.method2131(arg0);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 17) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(95);
            field284.method2133(field402);
            field284.method2214(class124.field1957[82] ? 1 : 0);
            field284.method2118(Statics.field741);
            field284.method2278(Statics.field56 + arg1);
            field284.method2131(Statics.field200 + arg0);
            field284.method2133(arg3);
        }
        if (arg2 == 32) {
            field284.method2345(111);
            field284.method2143(Statics.field741);
            field284.method2278(arg0);
            field284.method2251(field402);
            field284.method2133(arg3);
            field284.method2090(arg1);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 4) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(187);
            field284.method2278(Statics.field200 + arg0);
            field284.method2131(Statics.field56 + arg1);
            field284.method2131(arg3 >> 14 & 0x7FFF);
            field284.method2276(class124.field1957[82] ? 1 : 0);
        }
        if (arg2 == 51) {
            class3 var42 = field268[arg3];
            if (var42 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(85);
                field284.method2276(class124.field1957[82] ? 1 : 0);
                field284.method2133(arg3);
            }
        }
        if (arg2 == 1004) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field284.method2345(103);
            field284.method2251(arg3);
        }
        if (arg2 == 7) {
            class30 var43 = field280[arg3];
            if (var43 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(84);
                field284.method2251(Statics.field1275);
                field284.method2133(arg3);
                field284.method2090(Statics.field1107);
                field284.method2133(Statics.field120);
                field284.method2301(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            method91();
        }
        if (arg2 == 47) {
            class3 var44 = field268[arg3];
            if (var44 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(124);
                field284.method2131(arg3);
                field284.method2276(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field284.method2345(130);
            field284.method2131(arg0);
            field284.method2131(arg3);
            field284.method2090(arg1);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (arg2 == 38) {
            method1396();
            class152 var45 = class152.method868(arg1);
            field421 = 1;
            Statics.field120 = arg0;
            Statics.field1107 = arg1;
            Statics.field1275 = arg3;
            Statics.method122(var45);
            field400 = class2.method584(16748608) + class45.method504(arg3).field1039 + class2.method584(16777215);
            if (field400 == null) {
                field400 = "null";
            }
            return;
        }
        if (arg2 == 30 && field451 == null) {
            field284.method2345(13);
            field284.method2142(arg1);
            field284.method2278(arg0);
            field451 = class152.method2487(arg1, arg0);
            Statics.method122(field451);
        }
        if (arg2 == 19) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(206);
            field284.method2124(class124.field1957[82] ? 1 : 0);
            field284.method2251(Statics.field56 + arg1);
            field284.method2133(arg3);
            field284.method2251(Statics.field200 + arg0);
        }
        if (arg2 == 18) {
            field351 = arg6;
            field408 = arg7;
            field354 = 2;
            field353 = 0;
            field475 = arg0;
            field503 = arg1;
            field284.method2345(37);
            field284.method2124(class124.field1957[82] ? 1 : 0);
            field284.method2251(arg3);
            field284.method2131(Statics.field200 + arg0);
            field284.method2131(Statics.field56 + arg1);
        }
        if (arg2 == 49) {
            class3 var46 = field268[arg3];
            if (var46 != null) {
                field351 = arg6;
                field408 = arg7;
                field354 = 2;
                field353 = 0;
                field475 = arg0;
                field503 = arg1;
                field284.method2345(47);
                field284.method2131(arg3);
                field284.method2276(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field284.method2345(88);
            field284.method2278(arg0);
            field284.method2143(arg1);
            field284.method2251(arg3);
            field355 = 0;
            Statics.field2 = class152.method868(arg1);
            field356 = arg0;
        }
        if (field421 != 0) {
            field421 = 0;
            Statics.method122(class152.method868(Statics.field1107));
        }
        if (field401) {
            method1396();
        }
        if (Statics.field2 != null && field355 == 0) {
            Statics.method122(Statics.field2);
        }
    }

    @ObfuscatedName("bm.bd(I)V")
    public static void method1396() {
        if (!field401) {
            return;
        }
        class152 var0 = class152.method2487(Statics.field741, field402);
        if (var0 != null && var0.field2605 != null) {
            class1 var1 = new class1();
            var1.field15 = var0;
            var1.field5 = var0.field2605;
            class32.method2405(var1, 200000);
        }
        field401 = false;
        Statics.method122(var0);
    }

    @ObfuscatedName("s.bl(I)V")
    public static final void method4() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field388 - 1; var1++) {
                if (field326[var1] < 1000 && field326[var1 + 1] > 1000) {
                    String var2 = field394[var1];
                    field394[var1] = field394[var1 + 1];
                    field394[var1 + 1] = var2;
                    String var3 = field425[var1];
                    field425[var1] = field425[var1 + 1];
                    field425[var1 + 1] = var3;
                    int var4 = field326[var1];
                    field326[var1] = field326[var1 + 1];
                    field326[var1 + 1] = var4;
                    int var5 = field389[var1];
                    field389[var1] = field389[var1 + 1];
                    field389[var1 + 1] = var5;
                    int var6 = field481[var1];
                    field481[var1] = field481[var1 + 1];
                    field481[var1 + 1] = var6;
                    int var7 = field392[var1];
                    field392[var1] = field392[var1 + 1];
                    field392[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("cp.bz(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1744(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field387 || field388 >= 500) {
            return;
        }
        field425[field388] = arg0;
        field394[field388] = arg1;
        field326[field388] = arg2;
        field392[field388] = arg3;
        field389[field388] = arg4;
        field481[field388] = arg5;
        field388++;
    }

    @ObfuscatedName("bf.bx(I)V")
    public static void method1035() {
        for (int var0 = 0; var0 < field388; var0++) {
            if (method109(field326[var0])) {
                if (var0 < field388 - 1) {
                    for (int var1 = var0; var1 < field388 - 1; var1++) {
                        field425[var1] = field425[var1 + 1];
                        field394[var1] = field394[var1 + 1];
                        field326[var1] = field326[var1 + 1];
                        field392[var1] = field392[var1 + 1];
                        field389[var1] = field389[var1 + 1];
                        field481[var1] = field481[var1 + 1];
                    }
                }
                field388--;
            }
        }
    }

    @ObfuscatedName("u.bk(II)Z")
    public static boolean method109(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("x.bg(II)Ljava/lang/String;")
    public static String method168(int arg0) {
        return field394[arg0].length() > 0 ? field425[arg0] + class142.field2296 + field394[arg0] : field425[arg0];
    }

    @ObfuscatedName("fu.by(IIIII)V")
    public static final void method3143(int arg0, int arg1, int arg2, int arg3) {
        if (field421 == 0 && !field401) {
            method1744(class142.field2291, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class98.field1745; var5++) {
            int var6 = class98.field1723[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field62.method1641(Statics.field588, var7, var8, var6) >= 0) {
                    class36 var11 = class36.method83(var10);
                    if (var11.field865 != null) {
                        var11 = var11.method649();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field421 == 1) {
                        method1744(class142.field2297, field400 + " " + class2.field30 + " " + class2.method584(65535) + var11.field834, 1, var6, var7, var8);
                    } else if (!field401) {
                        String[] var12 = var11.field823;
                        if (field417) {
                            var12 = method556(var12);
                        }
                        if (var12 != null) {
                            for (int var13 = 4; var13 >= 0; var13--) {
                                if (var12[var13] != null) {
                                    short var14 = 0;
                                    if (var13 == 0) {
                                        var14 = 3;
                                    }
                                    if (var13 == 1) {
                                        var14 = 4;
                                    }
                                    if (var13 == 2) {
                                        var14 = 5;
                                    }
                                    if (var13 == 3) {
                                        var14 = 6;
                                    }
                                    if (var13 == 4) {
                                        var14 = 1001;
                                    }
                                    method1744(var12[var13], class2.method584(65535) + var11.field834, var14, var6, var7, var8);
                                }
                            }
                        }
                        method1744(class142.field2286, class2.method584(65535) + var11.field834, 1002, var11.field858 << 14, var7, var8);
                    } else if ((Statics.field712 & 0x4) == 4) {
                        method1744(field404, field330 + " " + class2.field30 + " " + class2.method584(65535) + var11.field834, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class30 var15 = field280[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field680.field789 == 1 && (var15.field772 & 0x7F) == 64 && (var15.field715 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field281; var16++) {
                            class30 var17 = field280[field282[var16]];
                            if (var17 != null && var15 != var17 && var17.field680.field789 == 1 && var15.field772 == var17.field772 && var15.field715 == var17.field715) {
                                method40(var17.field680, field282[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field293; var18++) {
                            class3 var19 = field268[field366[var18]];
                            if (var19 != null && var15.field772 == var19.field772 && var15.field715 == var19.field715) {
                                method2390(var19, field366[var18], var7, var8);
                            }
                        }
                    }
                    method40(var15.field680, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field268[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field772 & 0x7F) == 64 && (var20.field715 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field281; var21++) {
                            class30 var22 = field280[field282[var21]];
                            if (var22 != null && var22.field680.field789 == 1 && var20.field772 == var22.field772 && var20.field715 == var22.field715) {
                                method40(var22.field680, field282[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field293; var23++) {
                            class3 var24 = field268[field366[var23]];
                            if (var24 != null && var20 != var24 && var20.field772 == var24.field772 && var20.field715 == var24.field715) {
                                method2390(var24, field366[var23], var7, var8);
                            }
                        }
                    }
                    method2390(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field379[Statics.field588][var7][var8];
                    if (var25 != null) {
                        for (class25 var26 = (class25) var25.method3235(); var26 != null; var26 = (class25) var25.method3242()) {
                            class45 var27 = class45.method504(var26.field604);
                            if (field421 == 1) {
                                method1744(class142.field2297, field400 + " " + class2.field30 + " " + class2.method584(16748608) + var27.field1039, 16, var26.field604, var7, var8);
                            } else if (!field401) {
                                String[] var28 = var27.field1019;
                                if (field417) {
                                    var28 = method556(var28);
                                }
                                for (int var29 = 4; var29 >= 0; var29--) {
                                    if (var28 != null && var28[var29] != null) {
                                        byte var30 = 0;
                                        if (var29 == 0) {
                                            var30 = 18;
                                        }
                                        if (var29 == 1) {
                                            var30 = 19;
                                        }
                                        if (var29 == 2) {
                                            var30 = 20;
                                        }
                                        if (var29 == 3) {
                                            var30 = 21;
                                        }
                                        if (var29 == 4) {
                                            var30 = 22;
                                        }
                                        method1744(var28[var29], class2.method584(16748608) + var27.field1039, var30, var26.field604, var7, var8);
                                    } else if (var29 == 2) {
                                        method1744(class142.field2137, class2.method584(16748608) + var27.field1039, 20, var26.field604, var7, var8);
                                    }
                                }
                                method1744(class142.field2286, class2.method584(16748608) + var27.field1039, 1004, var26.field604, var7, var8);
                            } else if ((Statics.field712 & 0x1) == 1) {
                                method1744(field404, field330 + " " + class2.field30 + " " + class2.method584(16748608) + var27.field1039, 17, var26.field604, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.bm(Lar;IIII)V")
    public static final void method40(class35 arg0, int arg1, int arg2, int arg3) {
        if (field388 >= 400) {
            return;
        }
        if (arg0.field817 != null) {
            arg0 = arg0.method593();
        }
        if (arg0 == null || !arg0.field815 || arg0.field788 && field414 != arg1) {
            return;
        }
        String var4 = arg0.field787;
        if (arg0.field804 != 0) {
            var4 = var4 + method20(arg0.field804, Statics.field1452.field42) + " " + class2.field22 + class142.field2292 + arg0.field804 + class2.field28;
        }
        if (field421 == 1) {
            method1744(class142.field2297, field400 + " " + class2.field30 + " " + class2.method584(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field401) {
            String[] var5 = arg0.field816;
            if (field417) {
                var5 = method556(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class142.field2224)) {
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
                        method1744(var5[var6], class2.method584(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class142.field2224)) {
                        short var9 = 0;
                        if (field360 == class18.field512 || field360 == class18.field507 && arg0.field804 > Statics.field1452.field42) {
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
                        method1744(var5[var8], class2.method584(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method1744(class142.field2286, class2.method584(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field712 & 0x2) == 2) {
            method1744(field404, field330 + " " + class2.field30 + " " + class2.method584(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("de.bv(Lf;IIII)V")
    public static final void method2390(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1452 == arg0 || field388 >= 400) {
            return;
        }
        String var4;
        if (arg0.field37 == 0) {
            var4 = arg0.field50 + method20(arg0.field42, Statics.field1452.field42) + " " + class2.field22 + class142.field2292 + arg0.field42 + class2.field28;
        } else {
            var4 = arg0.field50 + " " + class2.field22 + class142.field2293 + arg0.field37 + class2.field28;
        }
        if (field421 == 1) {
            method1744(class142.field2297, field400 + " " + class2.field30 + " " + class2.method584(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field401) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field375[var5] != null) {
                    short var6 = 0;
                    if (field375[var5].equalsIgnoreCase(class142.field2224)) {
                        if (field360 == class18.field512 || field360 == class18.field507 && arg0.field42 > Statics.field1452.field42) {
                            var6 = 2000;
                        }
                        if (Statics.field1452.field51 != 0 && arg0.field51 != 0) {
                            if (Statics.field1452.field51 == arg0.field51) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field472[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field374[var5] + var6;
                    method1744(field375[var5], class2.method584(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field712 & 0x8) == 8) {
            method1744(field404, field330 + " " + class2.field30 + " " + class2.method584(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field388; var9++) {
            if (field326[var9] == 23) {
                field394[var9] = class2.method584(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("f.bh(III)Ljava/lang/String;")
    public static final String method20(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method584(16711680);
        } else if (var2 < -6) {
            return class2.method584(16723968);
        } else if (var2 < -3) {
            return class2.method584(16740352);
        } else if (var2 < 0) {
            return class2.method584(16756736);
        } else if (var2 > 9) {
            return class2.method584(65280);
        } else if (var2 > 6) {
            return class2.method584(4259584);
        } else if (var2 > 3) {
            return class2.method584(8453888);
        } else if (var2 > 0) {
            return class2.method584(12648192);
        } else {
            return class2.method584(16776960);
        }
    }

    @ObfuscatedName("l.bj(IIIIIIIIB)V")
    public static final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class152.method1930(arg0)) {
            Statics.field77 = null;
            method589(Statics.field2595[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field77 != null) {
                method589(Statics.field77, -1412584499, arg1, arg2, arg3, arg4, Statics.field1964, Statics.field877, arg7);
                Statics.field77 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field454[var8] = true;
            }
        } else {
            field454[arg7] = true;
        }
    }

    @ObfuscatedName("ax.bs([Lew;IIIIIIIII)V")
    public static final void method589(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1531(arg2, arg3, arg4, arg5);
        class84.method1800();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class152 var10 = arg0[var9];
            if (var10 != null && (var10.field2537 == arg1 || arg1 == -1412584499 && field418 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field316[field448] = var10.field2531 + arg6;
                    field362[field448] = var10.field2532 + arg7;
                    field399[field448] = var10.field2622;
                    field423[field448] = var10.field2533;
                    var11 = ++field448 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2601 = var11;
                var10.field2604 = field250;
                if (!var10.field2582 || !method1571(var10)) {
                    if (var10.field2530 > 0) {
                        method2848(var10);
                    }
                    int var12 = var10.field2531 + arg6;
                    int var13 = var10.field2532 + arg7;
                    int var14 = var10.field2548;
                    if (field418 == var10) {
                        if (arg1 != -1412584499 && !var10.field2591) {
                            Statics.field77 = arg0;
                            Statics.field1964 = arg6;
                            Statics.field877 = arg7;
                            continue;
                        }
                        if (field429 && field261) {
                            int var15 = class127.field1996;
                            int var16 = class127.field1999 * 1288203703;
                            int var17 = var15 - field420;
                            int var18 = var16 - field424;
                            if (var17 < field365) {
                                var17 = field365;
                            }
                            if (var10.field2622 + var17 > field365 + field442.field2622) {
                                var17 = field365 + field442.field2622 - var10.field2622;
                            }
                            if (var18 < field263) {
                                var18 = field263;
                            }
                            if (var10.field2533 + var18 > field263 + field442.field2533) {
                                var18 = field263 + field442.field2533 - var10.field2533;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2591) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2528 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2528 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2622 + var12;
                        int var26 = var10.field2533 + var13;
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
                        int var29 = var10.field2622 + var12;
                        int var30 = var10.field2533 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2582 || var19 < var21 && var20 < var22) {
                        if (var10.field2530 != 0) {
                            if (var10.field2530 == 1337) {
                                field395 = var12;
                                field396 = var13;
                                int var31 = var10.field2622;
                                int var32 = var10.field2533;
                                class73.method1531(var12, var13, var12 + var31, var13 + var32);
                                class84.method1800();
                                field348++;
                                method1578(class29.field672);
                                boolean var33 = false;
                                if (field378 >= 0) {
                                    for (int var34 = 0; var34 < field293; var34++) {
                                        if (field378 == field366[var34]) {
                                            var33 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var33) {
                                    method1578(class29.field671);
                                }
                                method499(true);
                                method1578(var33 ? class29.field673 : class29.field670);
                                method499(false);
                                for (class7 var35 = (class7) field381.method3239(); var35 != null; var35 = (class7) field381.method3248()) {
                                    if (Statics.field588 != var35.field96 || field250 > var35.field102) {
                                        var35.method3316();
                                    } else if (field250 >= var35.field101) {
                                        if (var35.field119 > 0) {
                                            class30 var36 = field280[var35.field119 - 1];
                                            if (var36 != null && var36.field772 >= 0 && var36.field772 < 13312 && var36.field715 >= 0 && var36.field715 < 13312) {
                                                var35.method86(var36.field772, var36.field715, method487(var36.field772, var36.field715, var35.field96) - var35.field100, field250);
                                            }
                                        }
                                        if (var35.field119 < 0) {
                                            int var37 = -var35.field119 - 1;
                                            class3 var38;
                                            if (field390 == var37) {
                                                var38 = Statics.field1452;
                                            } else {
                                                var38 = field268[var37];
                                            }
                                            if (var38 != null && var38.field772 >= 0 && var38.field772 < 13312 && var38.field715 >= 0 && var38.field715 < 13312) {
                                                var35.method86(var38.field772, var38.field715, method487(var38.field772, var38.field715, var35.field96) - var35.field100, field250);
                                            }
                                        }
                                        var35.method87(field456);
                                        Statics.field62.method1591(Statics.field588, (int) var35.field107, (int) var35.field108, (int) var35.field95, 60, var35, var35.field117, -1, false);
                                    }
                                }
                                method588();
                                if (!field279) {
                                    int var39 = field328;
                                    if (field336 / 256 > var39) {
                                        var39 = field336 / 256;
                                    }
                                    if (field490[4] && field453[4] + 128 > var39) {
                                        var39 = field453[4] + 128;
                                    }
                                    int var40 = field312 + field254 & 0x7FF;
                                    method826(Statics.field2467, method487(Statics.field1452.field772, Statics.field1452.field715, Statics.field588) - 50, Statics.field223, var39, var40, var39 * 3 + 600);
                                }
                                int var41;
                                if (field279) {
                                    int var42;
                                    if (Statics.field1815.field131) {
                                        var42 = Statics.field588;
                                    } else {
                                        int var43 = method487(Statics.field201, Statics.field157, Statics.field588);
                                        if (var43 - Statics.field1940 >= 800 || (class6.field80[Statics.field588][Statics.field201 >> 7][Statics.field157 >> 7] & 0x4) == 0) {
                                            var42 = 3;
                                        } else {
                                            var42 = Statics.field588;
                                        }
                                    }
                                    var41 = var42;
                                } else {
                                    var41 = method2566();
                                }
                                int var44 = Statics.field201;
                                int var45 = Statics.field1940;
                                int var46 = Statics.field157;
                                int var47 = Statics.field1255;
                                int var48 = Statics.field53;
                                for (int var49 = 0; var49 < 5; var49++) {
                                    if (field490[var49]) {
                                        int var50 = (int) (Math.random() * (double) (field329[var49] * 2 + 1) - (double) field329[var49] + Math.sin((double) field494[var49] / 100.0D * (double) field386[var49]) * (double) field453[var49]);
                                        if (var49 == 0) {
                                            Statics.field201 += var50;
                                        }
                                        if (var49 == 1) {
                                            Statics.field1940 += var50;
                                        }
                                        if (var49 == 2) {
                                            Statics.field157 += var50;
                                        }
                                        if (var49 == 3) {
                                            Statics.field53 = Statics.field53 + var50 & 0x7FF;
                                        }
                                        if (var49 == 4) {
                                            Statics.field1255 += var50;
                                            if (Statics.field1255 < 128) {
                                                Statics.field1255 = 128;
                                            }
                                            if (Statics.field1255 > 383) {
                                                Statics.field1255 = 383;
                                            }
                                        }
                                    }
                                }
                                int var51 = class127.field1996;
                                int var52 = class127.field1999 * 1288203703;
                                if (class127.field2004 != 0) {
                                    var51 = class127.field1993;
                                    var52 = class127.field2006;
                                }
                                if (var51 >= var12 && var51 < var12 + var31 && var52 >= var13 && var52 < var13 + var32) {
                                    class98.field1731 = true;
                                    class98.field1745 = 0;
                                    class98.field1740 = var51 - var12;
                                    class98.field1741 = var52 - var13;
                                } else {
                                    class98.field1731 = false;
                                    class98.field1745 = 0;
                                }
                                method749();
                                class73.method1497(var12, var13, var31, var32, 0);
                                method749();
                                Statics.field62.method1624(Statics.field201, Statics.field1940, Statics.field157, Statics.field1255, Statics.field53, var41);
                                method749();
                                Statics.field62.method1736();
                                field478 = 0;
                                boolean var53 = false;
                                int var54 = -1;
                                for (int var55 = -1; var55 < field293 + field281; var55++) {
                                    class33 var56;
                                    if (var55 == -1) {
                                        var56 = Statics.field1452;
                                    } else if (var55 < field293) {
                                        var56 = field268[field366[var55]];
                                        if (field378 == field366[var55]) {
                                            var53 = true;
                                            var54 = var55;
                                            continue;
                                        }
                                    } else {
                                        var56 = field280[field282[var55 - field293]];
                                    }
                                    method38(var56, var55, var12, var13, var31, var32);
                                }
                                if (var53) {
                                    method38(field268[field378], var54, var12, var13, var31, var32);
                                }
                                for (int var57 = 0; var57 < field478; var57++) {
                                    int var58 = field446[var57];
                                    int var59 = field340[var57];
                                    int var60 = field416[var57];
                                    int var61 = field341[var57];
                                    boolean var62 = true;
                                    while (var62) {
                                        var62 = false;
                                        for (int var63 = 0; var63 < var57; var63++) {
                                            if (var59 + 2 > field340[var63] - field341[var63] && var59 - var61 < field340[var63] + 2 && var58 - var60 < field446[var63] + field416[var63] && var58 + var60 > field446[var63] - field416[var63] && field340[var63] - field341[var63] < var59) {
                                                var59 = field340[var63] - field341[var63];
                                                var62 = true;
                                            }
                                        }
                                    }
                                    field349 = field446[var57];
                                    field350 = field340[var57] = var59;
                                    String var64 = field238[var57];
                                    if (field286 == 0) {
                                        int var65 = 16776960;
                                        if (field343[var57] < 6) {
                                            var65 = field458[field343[var57]];
                                        }
                                        if (field343[var57] == 6) {
                                            var65 = field348 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field343[var57] == 7) {
                                            var65 = field348 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field343[var57] == 8) {
                                            var65 = field348 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field343[var57] == 9) {
                                            int var66 = 150 - field345[var57];
                                            if (var66 < 50) {
                                                var65 = var66 * 1280 + 16711680;
                                            } else if (var66 < 100) {
                                                var65 = 16776960 - (var66 - 50) * 327680;
                                            } else if (var66 < 150) {
                                                var65 = (var66 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field343[var57] == 10) {
                                            int var67 = 150 - field345[var57];
                                            if (var67 < 50) {
                                                var65 = var67 * 5 + 16711680;
                                            } else if (var67 < 100) {
                                                var65 = 16711935 - (var67 - 50) * 327680;
                                            } else if (var67 < 150) {
                                                var65 = (var67 - 100) * 327680 + 255 - (var67 - 100) * 5;
                                            }
                                        }
                                        if (field343[var57] == 11) {
                                            int var68 = 150 - field345[var57];
                                            if (var68 < 50) {
                                                var65 = 16777215 - var68 * 327685;
                                            } else if (var68 < 100) {
                                                var65 = (var68 - 50) * 327685 + 65280;
                                            } else if (var68 < 150) {
                                                var65 = 16777215 - (var68 - 100) * 327680;
                                            }
                                        }
                                        if (field344[var57] == 0) {
                                            Statics.field875.method3407(var64, field349 + var12, field350 + var13, var65, 0);
                                        }
                                        if (field344[var57] == 1) {
                                            Statics.field875.method3414(var64, field349 + var12, field350 + var13, var65, 0, field348);
                                        }
                                        if (field344[var57] == 2) {
                                            Statics.field875.method3355(var64, field349 + var12, field350 + var13, var65, 0, field348);
                                        }
                                        if (field344[var57] == 3) {
                                            Statics.field875.method3356(var64, field349 + var12, field350 + var13, var65, 0, field348, 150 - field345[var57]);
                                        }
                                        if (field344[var57] == 4) {
                                            int var69 = (150 - field345[var57]) * (Statics.field875.method3345(var64) + 100) / 150;
                                            class73.method1539(field349 + var12 - 50, var13, field349 + var12 + 50, var13 + var32);
                                            Statics.field875.method3341(var64, field349 + var12 + 50 - var69, field350 + var13, var65, 0);
                                            class73.method1531(var12, var13, var12 + var31, var13 + var32);
                                        }
                                        if (field344[var57] == 5) {
                                            int var70 = 150 - field345[var57];
                                            int var71 = 0;
                                            if (var70 < 25) {
                                                var71 = var70 - 25;
                                            } else if (var70 > 125) {
                                                var71 = var70 - 125;
                                            }
                                            class73.method1539(var12, field350 + var13 - Statics.field875.field2917 - 1, var12 + var31, field350 + var13 + 5);
                                            Statics.field875.method3407(var64, field349 + var12, field350 + var13 + var71, var65, 0);
                                            class73.method1531(var12, var13, var12 + var31, var13 + var32);
                                        }
                                    } else {
                                        Statics.field875.method3407(var64, field349 + var12, field350 + var13, 16776960, 0);
                                    }
                                }
                                method29(var12, var13);
                                ((class88) Statics.field1473).method1833(field456);
                                if (field354 == 1) {
                                    Statics.field7[field353 / 100].method1410(field351 - 8, field408 - 8);
                                }
                                if (field354 == 2) {
                                    Statics.field7[field353 / 100 + 4].method1410(field351 - 8, field408 - 8);
                                }
                                method741();
                                if (field256) {
                                    int var72 = var12 + 512 - 5;
                                    int var73 = var13 + 20;
                                    Statics.field1083.method3351("Fps:" + field2048, var72, var73, 16776960, -1);
                                    int var159 = var73 + 15;
                                    Runtime var74 = Runtime.getRuntime();
                                    int var75 = (int) ((var74.totalMemory() - var74.freeMemory()) / 1024L);
                                    int var76 = 16776960;
                                    if (var75 > 32768 && field246) {
                                        var76 = 16711680;
                                    }
                                    if (var75 > 65536 && !field246) {
                                        var76 = 16711680;
                                    }
                                    Statics.field1083.method3351("Mem:" + var75 + "k", var72, var159, var76, -1);
                                    var73 = var159 + 15;
                                }
                                Statics.field201 = var44;
                                Statics.field1940 = var45;
                                Statics.field157 = var46;
                                Statics.field1255 = var47;
                                Statics.field53 = var48;
                                if (field324) {
                                    byte var77 = 0;
                                    int var78 = class150.field2492 + class150.field2490 + var77;
                                    if (var78 == 0) {
                                        field324 = false;
                                    }
                                }
                                if (field324) {
                                    class73.method1497(var12, var13, var31, var32, 0);
                                    method127(class142.field2358, false);
                                }
                                class73.method1531(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2530 == 1338) {
                                method1847(var12, var13, var11);
                                class73.method1531(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2528 == 0) {
                            if (!var10.field2582 && method1571(var10) && Statics.field1871 != var10) {
                                continue;
                            }
                            if (!var10.field2582) {
                                if (var10.field2540 > var10.field2542 - var10.field2533) {
                                    var10.field2540 = var10.field2542 - var10.field2533;
                                }
                                if (var10.field2540 < 0) {
                                    var10.field2540 = 0;
                                }
                            }
                            method589(arg0, var10.field2526, var19, var20, var21, var22, var12 - var10.field2539, var13 - var10.field2540, var11);
                            if (var10.field2634 != null) {
                                method589(var10.field2634, var10.field2526, var19, var20, var21, var22, var12 - var10.field2539, var13 - var10.field2540, var11);
                            }
                            class4 var80 = (class4) field407.method3204((long) var10.field2526);
                            if (var80 != null) {
                                method157(var80.field63, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class73.method1531(arg2, arg3, arg4, arg5);
                            class84.method1800();
                        }
                        if (field452[var11] || field457 > 1) {
                            if (var10.field2528 == 0 && !var10.field2582 && var10.field2542 > var10.field2533) {
                                method23(var10.field2622 + var12, var13, var10.field2540, var10.field2533, var10.field2542);
                            }
                            if (var10.field2528 != 1) {
                                if (var10.field2528 == 2) {
                                    int var81 = 0;
                                    for (int var82 = 0; var82 < var10.field2533; var82++) {
                                        for (int var83 = 0; var83 < var10.field2622; var83++) {
                                            int var84 = (var10.field2579 + 32) * var83 + var12;
                                            int var85 = (var10.field2580 + 32) * var82 + var13;
                                            if (var81 < 20) {
                                                var84 += var10.field2581[var81];
                                                var85 += var10.field2559[var81];
                                            }
                                            if (var10.field2607[var81] > 0) {
                                                boolean var86 = false;
                                                boolean var87 = false;
                                                int var88 = var10.field2607[var81] - 1;
                                                if (var84 + 32 > arg2 && var84 < arg4 && var85 + 32 > arg3 && var85 < arg5 || Statics.field313 == var10 && field357 == var81) {
                                                    class72 var89;
                                                    if (field421 == 1 && Statics.field120 == var81 && Statics.field1107 == var10.field2526) {
                                                        var89 = class45.method739(var88, var10.field2629[var81], 2, 0, false);
                                                    } else {
                                                        var89 = class45.method739(var88, var10.field2629[var81], 1, 3153952, false);
                                                    }
                                                    if (var89 == null) {
                                                        Statics.method122(var10);
                                                    } else if (Statics.field313 == var10 && field357 == var81) {
                                                        int var90 = class127.field1996 - field358;
                                                        int var91 = class127.field1999 * 1288203703 - field318;
                                                        if (var90 < 5 && var90 > -5) {
                                                            var90 = 0;
                                                        }
                                                        if (var91 < 5 && var91 > -5) {
                                                            var91 = 0;
                                                        }
                                                        if (field335 < 5) {
                                                            var90 = 0;
                                                            var91 = 0;
                                                        }
                                                        var89.method1441(var84 + var90, var85 + var91, 128);
                                                        if (arg1 != -1) {
                                                            class152 var92 = arg0[arg1 & 0xFFFF];
                                                            if (var85 + var91 < class73.field1301 && var92.field2540 > 0) {
                                                                int var93 = field456 * (class73.field1301 - var85 - var91) / 3;
                                                                if (var93 > field456 * 10) {
                                                                    var93 = field456 * 10;
                                                                }
                                                                if (var93 > var92.field2540) {
                                                                    var93 = var92.field2540;
                                                                }
                                                                var92.field2540 -= var93;
                                                                field318 += var93;
                                                                Statics.method122(var92);
                                                            }
                                                            if (var85 + var91 + 32 > class73.field1303 && var92.field2540 < var92.field2542 - var92.field2533) {
                                                                int var94 = field456 * (var85 + var91 + 32 - class73.field1303) / 3;
                                                                if (var94 > field456 * 10) {
                                                                    var94 = field456 * 10;
                                                                }
                                                                if (var94 > var92.field2542 - var92.field2533 - var92.field2540) {
                                                                    var94 = var92.field2542 - var92.field2533 - var92.field2540;
                                                                }
                                                                var92.field2540 += var94;
                                                                field318 -= var94;
                                                                Statics.method122(var92);
                                                            }
                                                        }
                                                    } else if (Statics.field2 == var10 && field356 == var81) {
                                                        var89.method1441(var84, var85, 128);
                                                    } else {
                                                        var89.method1410(var84, var85);
                                                    }
                                                }
                                            } else if (var10.field2534 != null && var81 < 20) {
                                                class72 var95 = var10.method2885(var81);
                                                if (var95 != null) {
                                                    var95.method1410(var84, var85);
                                                } else if (class152.field2633) {
                                                    Statics.method122(var10);
                                                }
                                            }
                                            var81++;
                                        }
                                    }
                                } else if (var10.field2528 == 3) {
                                    int var96;
                                    if (Statics.method164(var10)) {
                                        var96 = var10.field2544;
                                        if (Statics.field1871 == var10 && var10.field2546 != 0) {
                                            var96 = var10.field2546;
                                        }
                                    } else {
                                        var96 = var10.field2638;
                                        if (Statics.field1871 == var10 && var10.field2545 != 0) {
                                            var96 = var10.field2545;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2625) {
                                            class73.method1497(var12, var13, var10.field2622, var10.field2533, var96);
                                        } else {
                                            class73.method1526(var12, var13, var10.field2622, var10.field2533, var96);
                                        }
                                    } else if (var10.field2625) {
                                        class73.method1496(var12, var13, var10.field2622, var10.field2533, var96, 256 - (var14 & 0xFF));
                                    } else {
                                        class73.method1537(var12, var13, var10.field2622, var10.field2533, var96, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2528 == 4) {
                                    class193 var97 = var10.method2870();
                                    if (var97 != null) {
                                        String var98 = var10.field2573;
                                        int var99;
                                        if (Statics.method164(var10)) {
                                            var99 = var10.field2544;
                                            if (Statics.field1871 == var10 && var10.field2546 != 0) {
                                                var99 = var10.field2546;
                                            }
                                            if (var10.field2574.length() > 0) {
                                                var98 = var10.field2574;
                                            }
                                        } else {
                                            var99 = var10.field2638;
                                            if (Statics.field1871 == var10 && var10.field2545 != 0) {
                                                var99 = var10.field2545;
                                            }
                                        }
                                        if (var10.field2582 && var10.field2564 != -1) {
                                            class45 var100 = class45.method504(var10.field2564);
                                            var98 = var100.field1039;
                                            if (var98 == null) {
                                                var98 = "null";
                                            }
                                            if ((var100.field1016 == 1 || var10.field2631 != 1) && var10.field2631 != -1) {
                                                var98 = class2.method584(16748608) + var98 + class2.field26 + " " + 'x' + method34(var10.field2631);
                                            }
                                        }
                                        if (field451 == var10) {
                                            class142 var10000 = (class142) null;
                                            var98 = class142.field2346;
                                            var99 = var10.field2638;
                                        }
                                        if (!var10.field2582) {
                                            var98 = method490(var98, var10);
                                        }
                                        var97.method3353(var98, var12, var13, var10.field2622, var10.field2533, var99, var10.field2578 ? 0 : -1, var10.field2576, var10.field2577, var10.field2643);
                                    } else if (class152.field2633) {
                                        Statics.method122(var10);
                                    }
                                } else if (var10.field2528 == 5) {
                                    if (var10.field2582) {
                                        class72 var102;
                                        if (var10.field2564 == -1) {
                                            var102 = var10.method2874(false);
                                        } else {
                                            var102 = class45.method739(var10.field2564, var10.field2631, var10.field2554, var10.field2628, false);
                                        }
                                        if (var102 != null) {
                                            int var103 = var102.field1293;
                                            int var104 = var102.field1292;
                                            if (var10.field2553) {
                                                class73.method1539(var12, var13, var10.field2622 + var12, var10.field2533 + var13);
                                                int var105 = (var10.field2622 + (var103 - 1)) / var103;
                                                int var106 = (var10.field2533 + (var104 - 1)) / var104;
                                                for (int var107 = 0; var107 < var105; var107++) {
                                                    for (int var108 = 0; var108 < var106; var108++) {
                                                        if (var10.field2547 != 0) {
                                                            var102.method1465(var103 / 2 + var103 * var107 + var12, var104 / 2 + var104 * var108 + var13, var10.field2547, 4096);
                                                        } else if (var14 == 0) {
                                                            var102.method1410(var103 * var107 + var12, var104 * var108 + var13);
                                                        } else {
                                                            var102.method1441(var103 * var107 + var12, var104 * var108 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1531(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var109 = var10.field2622 * 4096 / var103;
                                                if (var10.field2547 != 0) {
                                                    var102.method1465(var10.field2622 / 2 + var12, var10.field2533 / 2 + var13, var10.field2547, var109);
                                                } else if (var14 != 0) {
                                                    var102.method1463(var12, var13, var10.field2622, var10.field2533, 256 - (var14 & 0xFF));
                                                } else if (var10.field2622 == var103 && var10.field2533 == var104) {
                                                    var102.method1410(var12, var13);
                                                } else {
                                                    var102.method1412(var12, var13, var10.field2622, var10.field2533);
                                                }
                                            }
                                        } else if (class152.field2633) {
                                            Statics.method122(var10);
                                        }
                                    } else {
                                        class72 var101 = var10.method2874(Statics.method164(var10));
                                        if (var101 != null) {
                                            var101.method1410(var12, var13);
                                        } else if (class152.field2633) {
                                            Statics.method122(var10);
                                        }
                                    }
                                } else if (var10.field2528 == 6) {
                                    boolean var110 = Statics.method164(var10);
                                    int var111;
                                    if (var110) {
                                        var111 = var10.field2563;
                                    } else {
                                        var111 = var10.field2562;
                                    }
                                    class98 var112 = null;
                                    int var113 = 0;
                                    if (var10.field2564 != -1) {
                                        class45 var114 = class45.method504(var10.field2564);
                                        if (var114 != null) {
                                            class45 var115 = var114.method834(var10.field2631);
                                            var112 = var115.method833(1);
                                            if (var112 == null) {
                                                Statics.method122(var10);
                                            } else {
                                                var112.method1949();
                                                var113 = var112.field1341 / 2;
                                            }
                                        }
                                    } else if (var10.field2558 == 5) {
                                        if (var10.field2597 == 0) {
                                            var112 = field501.method2933((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var112 = Statics.field1452.method17();
                                        }
                                    } else if (var111 == -1) {
                                        var112 = var10.method2867((class38) null, -1, var110, Statics.field1452.field34);
                                        if (var112 == null && class152.field2633) {
                                            Statics.method122(var10);
                                        }
                                    } else {
                                        class38 var116 = Statics.method448(var111);
                                        var112 = var10.method2867(var116, var10.field2632, var110, Statics.field1452.field34);
                                        if (var112 == null && class152.field2633) {
                                            Statics.method122(var10);
                                        }
                                    }
                                    class84.method1805(var10.field2622 / 2 + var12, var10.field2533 / 2 + var13);
                                    int var117 = var10.field2524 * class84.field1461[var10.field2566] >> 16;
                                    int var118 = var10.field2524 * class84.field1471[var10.field2566] >> 16;
                                    if (var112 != null) {
                                        if (var10.field2582) {
                                            var112.method1949();
                                            if (var10.field2571) {
                                                var112.method1959(0, var10.field2567, var10.field2568, var10.field2566, var10.field2603, var10.field2525 + var113 + var117, var10.field2525 + var118, var10.field2524);
                                            } else {
                                                var112.method1958(0, var10.field2567, var10.field2568, var10.field2566, var10.field2603, var10.field2525 + var113 + var117, var10.field2525 + var118);
                                            }
                                        } else {
                                            var112.method1958(0, var10.field2567, 0, var10.field2566, 0, var117, var118);
                                        }
                                    }
                                    class84.method1774();
                                } else {
                                    if (var10.field2528 == 7) {
                                        class193 var119 = var10.method2870();
                                        if (var119 == null) {
                                            if (class152.field2633) {
                                                Statics.method122(var10);
                                            }
                                            continue;
                                        }
                                        int var120 = 0;
                                        for (int var121 = 0; var121 < var10.field2533; var121++) {
                                            for (int var122 = 0; var122 < var10.field2622; var122++) {
                                                if (var10.field2607[var120] > 0) {
                                                    class45 var123 = class45.method504(var10.field2607[var120] - 1);
                                                    String var124;
                                                    if (var123.field1016 != 1 && var10.field2629[var120] == 1) {
                                                        var124 = class2.method584(16748608) + var123.field1039 + class2.field26;
                                                    } else {
                                                        var124 = class2.method584(16748608) + var123.field1039 + class2.field26 + " " + 'x' + method34(var10.field2629[var120]);
                                                    }
                                                    int var125 = (var10.field2579 + 115) * var122 + var12;
                                                    int var126 = (var10.field2580 + 12) * var121 + var13;
                                                    if (var10.field2576 == 0) {
                                                        var119.method3341(var124, var125, var126, var10.field2638, var10.field2578 ? 0 : -1);
                                                    } else if (var10.field2576 == 1) {
                                                        var119.method3407(var124, var10.field2622 / 2 + var125, var126, var10.field2638, var10.field2578 ? 0 : -1);
                                                    } else {
                                                        var119.method3351(var124, var10.field2622 + var125 - 1, var126, var10.field2638, var10.field2578 ? 0 : -1);
                                                    }
                                                }
                                                var120++;
                                            }
                                        }
                                    }
                                    if (var10.field2528 == 8 && Statics.field541 == var10 && field398 == field342) {
                                        int var127 = 0;
                                        int var128 = 0;
                                        class193 var129 = Statics.field1083;
                                        String var130 = var10.field2573;
                                        String var131 = method490(var130, var10);
                                        while (var131.length() > 0) {
                                            int var132 = var131.indexOf(class2.field25);
                                            String var133;
                                            if (var132 == -1) {
                                                var133 = var131;
                                                var131 = "";
                                            } else {
                                                var133 = var131.substring(0, var132);
                                                var131 = var131.substring(var132 + 4);
                                            }
                                            int var134 = var129.method3345(var133);
                                            if (var134 > var127) {
                                                var127 = var134;
                                            }
                                            var128 += var129.field2917 + 1;
                                        }
                                        var127 += 6;
                                        var128 += 7;
                                        int var135 = var10.field2622 + var12 - 5 - var127;
                                        int var136 = var10.field2533 + var13 + 5;
                                        if (var135 < var12 + 5) {
                                            var135 = var12 + 5;
                                        }
                                        if (var127 + var135 > arg4) {
                                            var135 = arg4 - var127;
                                        }
                                        if (var128 + var136 > arg5) {
                                            var136 = arg5 - var128;
                                        }
                                        class73.method1497(var135, var136, var127, var128, 16777120);
                                        class73.method1526(var135, var136, var127, var128, 0);
                                        String var137 = var10.field2573;
                                        int var138 = var129.field2917 + var136 + 2;
                                        String var139 = method490(var137, var10);
                                        while (var139.length() > 0) {
                                            int var140 = var139.indexOf(class2.field25);
                                            String var141;
                                            if (var140 == -1) {
                                                var141 = var139;
                                                var139 = "";
                                            } else {
                                                var141 = var139.substring(0, var140);
                                                var139 = var139.substring(var140 + 4);
                                            }
                                            var129.method3341(var141, var135 + 3, var138, 0, -1);
                                            var138 += var129.field2917 + 1;
                                        }
                                    }
                                    if (var10.field2528 == 9) {
                                        if (var10.field2549 == 1) {
                                            class73.method1521(var12, var13, var10.field2622 + var12, var10.field2533 + var13, var10.field2638);
                                        } else {
                                            int var142 = var10.field2622 >= 0 ? var10.field2622 : -var10.field2622;
                                            int var143 = var10.field2533 >= 0 ? var10.field2533 : -var10.field2533;
                                            int var144 = var142;
                                            if (var142 < var143) {
                                                var144 = var143;
                                            }
                                            if (var144 != 0) {
                                                int var145 = (var10.field2622 << 16) / var144;
                                                int var146 = (var10.field2533 << 16) / var144;
                                                if (var146 <= var145) {
                                                    var145 = -var145;
                                                } else {
                                                    var146 = -var146;
                                                }
                                                int var147 = var10.field2549 * var146 >> 17;
                                                int var148 = var10.field2549 * var146 + 1 >> 17;
                                                int var149 = var10.field2549 * var145 >> 17;
                                                int var150 = var10.field2549 * var145 + 1 >> 17;
                                                int var151 = var12 + var147;
                                                int var152 = var12 - var148;
                                                int var153 = var10.field2622 + var12 - var148;
                                                int var154 = var10.field2622 + var12 + var147;
                                                int var155 = var13 + var149;
                                                int var156 = var13 - var150;
                                                int var157 = var10.field2533 + var13 - var150;
                                                int var158 = var10.field2533 + var13 + var149;
                                                class84.method1759(var151, var152, var153);
                                                class84.method1762(var155, var156, var157, var151, var152, var153, var10.field2638);
                                                class84.method1759(var151, var153, var154);
                                                class84.method1762(var155, var157, var158, var151, var153, var154, var10.field2638);
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

    @ObfuscatedName("i.bb(Ljava/lang/String;Lew;I)Ljava/lang/String;")
    public static String method490(String arg0, class152 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method12(arg1, var2 - 1);
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
                if (Statics.field267 != null) {
                    var8 = class199.method546(Statics.field267.field2063);
                    if (Statics.field267.field2065 != null) {
                        var8 = (String) Statics.field267.field2065;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("d.bw(IB)Ljava/lang/String;")
    public static final String method34(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field20 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method584(65408) + var1.substring(0, var1.length() - 8) + class142.field2247 + " " + class2.field22 + var1 + class2.field28 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method584(16777215) + var1.substring(0, var1.length() - 4) + class142.field2299 + " " + class2.field22 + var1 + class2.field28 + class2.field26;
        } else {
            return " " + class2.method584(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("f.bq(IIIIIB)V")
    public static final void method23(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2465[0].method1547(arg0, arg1);
        Statics.field2465[1].method1547(arg0, arg1 + arg3 - 16);
        class73.method1497(arg0, arg1 + 16, 16, arg3 - 32, field322);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1497(arg0, arg1 + 16 + var6, 16, var5, field323);
        class73.method1505(arg0, arg1 + 16 + var6, var5, field325);
        class73.method1505(arg0 + 1, arg1 + 16 + var6, var5, field325);
        class73.method1501(arg0, arg1 + 16 + var6, 16, field325);
        class73.method1501(arg0, arg1 + 17 + var6, 16, field325);
        class73.method1505(arg0 + 15, arg1 + 16 + var6, var5, field337);
        class73.method1505(arg0 + 14, arg1 + 17 + var6, var5 - 1, field337);
        class73.method1501(arg0, arg1 + 15 + var6 + var5, 16, field337);
        class73.method1501(arg0 + 1, arg1 + 14 + var6 + var5, 15, field337);
    }

    @ObfuscatedName("s.cj(Lew;IB)I")
    public static final int method12(class152 arg0, int arg1) {
        if (arg0.field2543 == null || arg1 >= arg0.field2543.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2543[arg1];
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
                    var7 = field383[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field382[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field385[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class152 var11 = class152.method868(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method504(var12).field996 || field245)) {
                        for (int var13 = 0; var13 < var11.field2607.length; var13++) {
                            if (var12 + 1 == var11.field2607[var13]) {
                                var7 += var11.field2629[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class154.field2650[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2121[field382[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class154.field2650[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1452.field42;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2120[var14]) {
                            var7 += field382[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class152 var17 = class152.method868(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method504(var18).field996 || field245)) {
                        for (int var19 = 0; var19 < var17.field2607.length; var19++) {
                            if (var18 + 1 == var17.field2607[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field307;
                }
                if (var6 == 12) {
                    var7 = field412;
                }
                if (var6 == 13) {
                    int var20 = class154.field2650[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class154.method2402(var22);
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
                    var7 = (Statics.field1452.field772 >> 7) + Statics.field200;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1452.field715 >> 7) + Statics.field56;
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

    @ObfuscatedName("k.cx([Lew;IIIIIIIB)V")
    public static final void method475(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class152 var9 = arg0[var8];
            if (var9 != null && (!var9.field2582 || var9.field2528 == 0 || var9.field2593 || method132(var9) != 0 || field442 == var9) && var9.field2537 == arg1 && (!var9.field2582 || !method1571(var9))) {
                int var10 = var9.field2531 + arg6;
                int var11 = var9.field2532 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2528 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2528 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2622 + var10;
                    int var19 = var9.field2533 + var11;
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
                    int var22 = var9.field2622 + var10;
                    int var23 = var9.field2533 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field418 == var9) {
                    field426 = true;
                    field427 = var10;
                    field428 = var11;
                }
                if (!var9.field2582 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field1996;
                    int var25 = class127.field1999 * 1288203703;
                    if (class127.field2004 != 0) {
                        var24 = class127.field1993;
                        var25 = class127.field2006;
                    }
                    if (var9.field2530 == 1337) {
                        Statics.method122(var9);
                        if (!field324 && !field387 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method3143(var24, var25, var12, var13);
                        }
                    } else if (var9.field2530 == 1338) {
                        method1831(var10, var11);
                    } else {
                        if (!field387 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2609 == 1) {
                                method1744(var9.field2627, "", 24, 0, 0, var9.field2526);
                            }
                            if (var9.field2609 == 2 && !field401) {
                                String var28;
                                if (class156.method178(method132(var9)) == 0) {
                                    var28 = null;
                                } else if (var9.field2592 == null || var9.field2592.trim().length() == 0) {
                                    var28 = null;
                                } else {
                                    var28 = var9.field2592;
                                }
                                if (var28 != null) {
                                    method1744(var28, class2.method584(65280) + var9.field2561, 25, 0, -1, var9.field2526);
                                }
                            }
                            if (var9.field2609 == 3) {
                                method1744(class142.field2295, "", 26, 0, 0, var9.field2526);
                            }
                            if (var9.field2609 == 4) {
                                method1744(var9.field2627, "", 28, 0, 0, var9.field2526);
                            }
                            if (var9.field2609 == 5) {
                                method1744(var9.field2627, "", 29, 0, 0, var9.field2526);
                            }
                            if (var9.field2609 == 6 && field451 == null) {
                                method1744(var9.field2627, "", 30, 0, -1, var9.field2526);
                            }
                            if (var9.field2528 == 2) {
                                int var30 = 0;
                                for (int var31 = 0; var31 < var9.field2533; var31++) {
                                    for (int var32 = 0; var32 < var9.field2622; var32++) {
                                        int var33 = (var9.field2579 + 32) * var32;
                                        int var34 = (var9.field2580 + 32) * var31;
                                        if (var30 < 20) {
                                            var33 += var9.field2581[var30];
                                            var34 += var9.field2559[var30];
                                        }
                                        if (var26 >= var33 && var27 >= var34 && var26 < var33 + 32 && var27 < var34 + 32) {
                                            field287 = var30;
                                            Statics.field2705 = var9;
                                            if (var9.field2607[var30] > 0) {
                                                label1025: {
                                                    class45 var35 = class45.method504(var9.field2607[var30] - 1);
                                                    if (field421 == 1) {
                                                        int var36 = method132(var9);
                                                        boolean var37 = (var36 >> 30 & 0x1) != 0;
                                                        if (var37) {
                                                            if (Statics.field1107 != var9.field2526 || Statics.field120 != var30) {
                                                                method1744(class142.field2297, field400 + " " + class2.field30 + " " + class2.method584(16748608) + var35.field1039, 31, var35.field1003, var30, var9.field2526);
                                                            }
                                                            break label1025;
                                                        }
                                                    }
                                                    if (field401) {
                                                        int var38 = method132(var9);
                                                        boolean var39 = (var38 >> 30 & 0x1) != 0;
                                                        if (var39) {
                                                            if ((Statics.field712 & 0x10) == 16) {
                                                                method1744(field404, field330 + " " + class2.field30 + " " + class2.method584(16748608) + var35.field1039, 32, var35.field1003, var30, var9.field2526);
                                                            }
                                                            break label1025;
                                                        }
                                                    }
                                                    String[] var40 = var35.field1027;
                                                    if (field417) {
                                                        var40 = method556(var40);
                                                    }
                                                    int var41 = method132(var9);
                                                    boolean var42 = (var41 >> 30 & 0x1) != 0;
                                                    if (var42) {
                                                        for (int var43 = 4; var43 >= 3; var43--) {
                                                            if (var40 != null && var40[var43] != null) {
                                                                byte var44;
                                                                if (var43 == 3) {
                                                                    var44 = 36;
                                                                } else {
                                                                    var44 = 37;
                                                                }
                                                                method1744(var40[var43], class2.method584(16748608) + var35.field1039, var44, var35.field1003, var30, var9.field2526);
                                                            } else if (var43 == 4) {
                                                                method1744(class142.field2174, class2.method584(16748608) + var35.field1039, 37, var35.field1003, var30, var9.field2526);
                                                            }
                                                        }
                                                    }
                                                    int var45 = method132(var9);
                                                    boolean var46 = (var45 >> 31 & 0x1) != 0;
                                                    if (var46) {
                                                        method1744(class142.field2297, class2.method584(16748608) + var35.field1039, 38, var35.field1003, var30, var9.field2526);
                                                    }
                                                    int var47 = method132(var9);
                                                    boolean var48 = (var47 >> 30 & 0x1) != 0;
                                                    if (var48 && var40 != null) {
                                                        for (int var49 = 2; var49 >= 0; var49--) {
                                                            if (var40[var49] != null) {
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
                                                                method1744(var40[var49], class2.method584(16748608) + var35.field1039, var50, var35.field1003, var30, var9.field2526);
                                                            }
                                                        }
                                                    }
                                                    String[] var51 = var9.field2584;
                                                    if (field417) {
                                                        var51 = method556(var51);
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
                                                                method1744(var51[var52], class2.method584(16748608) + var35.field1039, var53, var35.field1003, var30, var9.field2526);
                                                            }
                                                        }
                                                    }
                                                    method1744(class142.field2286, class2.method584(16748608) + var35.field1039, 1005, var35.field1003, var30, var9.field2526);
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            if (var9.field2582) {
                                if (field401) {
                                    int var54 = method132(var9);
                                    boolean var55 = (var54 >> 21 & 0x1) != 0;
                                    if (var55 && (Statics.field712 & 0x20) == 32) {
                                        method1744(field404, field330 + " " + class2.field30 + " " + var9.field2630, 58, 0, var9.field2641, var9.field2526);
                                    }
                                } else {
                                    for (int var56 = 9; var56 >= 5; var56--) {
                                        String var57;
                                        if (!class156.method2408(method132(var9), var56) && var9.field2613 == null) {
                                            var57 = null;
                                        } else if (var9.field2587 == null || var9.field2587.length <= var56 || var9.field2587[var56] == null || var9.field2587[var56].trim().length() == 0) {
                                            var57 = null;
                                        } else {
                                            var57 = var9.field2587[var56];
                                        }
                                        if (var57 != null) {
                                            method1744(var57, var9.field2630, 1007, var56 + 1, var9.field2641, var9.field2526);
                                        }
                                    }
                                    String var59;
                                    if (class156.method178(method132(var9)) == 0) {
                                        var59 = null;
                                    } else if (var9.field2592 == null || var9.field2592.trim().length() == 0) {
                                        var59 = null;
                                    } else {
                                        var59 = var9.field2592;
                                    }
                                    if (var59 != null) {
                                        method1744(var59, var9.field2630, 25, 0, var9.field2641, var9.field2526);
                                    }
                                    for (int var61 = 4; var61 >= 0; var61--) {
                                        String var62;
                                        if (!class156.method2408(method132(var9), var61) && var9.field2613 == null) {
                                            var62 = null;
                                        } else if (var9.field2587 == null || var9.field2587.length <= var61 || var9.field2587[var61] == null || var9.field2587[var61].trim().length() == 0) {
                                            var62 = null;
                                        } else {
                                            var62 = var9.field2587[var61];
                                        }
                                        if (var62 != null) {
                                            method1744(var62, var9.field2630, 57, var61 + 1, var9.field2641, var9.field2526);
                                        }
                                    }
                                    int var64 = method132(var9);
                                    boolean var65 = (var64 & 0x1) != 0;
                                    if (var65) {
                                        method1744(class142.field2142, "", 30, 0, var9.field2641, var9.field2526);
                                    }
                                }
                            }
                        }
                        if (var9.field2528 == 0) {
                            if (!var9.field2582 && method1571(var9) && Statics.field1871 != var9) {
                                continue;
                            }
                            method475(arg0, var9.field2526, var12, var13, var14, var15, var10 - var9.field2539, var11 - var9.field2540);
                            if (var9.field2634 != null) {
                                method475(var9.field2634, var9.field2526, var12, var13, var14, var15, var10 - var9.field2539, var11 - var9.field2540);
                            }
                            class4 var66 = (class4) field407.method3204((long) var9.field2526);
                            if (var66 != null) {
                                if (var66.field55 == 0 && class127.field1996 >= var12 && class127.field1999 * 1288203703 >= var13 && class127.field1996 < var14 && class127.field1999 * 1288203703 < var15 && !field387 && !field339) {
                                    field425[0] = class142.field2372;
                                    field394[0] = "";
                                    field326[0] = 1006;
                                    field388 = 1;
                                }
                                int var67 = var66.field63;
                                if (class152.method1930(var67)) {
                                    method475(Statics.field2595[var67], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2582) {
                            if (var9.field2585 && class127.field1996 >= var12 && class127.field1999 * 1288203703 >= var13 && class127.field1996 < var14 && class127.field1999 * 1288203703 < var15) {
                                for (class1 var68 = (class1) field308.method3239(); var68 != null; var68 = (class1) field308.method3248()) {
                                    if (var68.field12) {
                                        var68.method3316();
                                        var68.field15.field2635 = false;
                                    }
                                }
                                if (Statics.field1516 == 0) {
                                    field418 = null;
                                    field442 = null;
                                }
                                if (!field387) {
                                    field425[0] = class142.field2372;
                                    field394[0] = "";
                                    field326[0] = 1006;
                                    field388 = 1;
                                }
                            }
                            boolean var69;
                            if (class127.field1996 >= var12 && class127.field1999 * 1288203703 >= var13 && class127.field1996 < var14 && class127.field1999 * 1288203703 < var15) {
                                var69 = true;
                            } else {
                                var69 = false;
                            }
                            boolean var70 = false;
                            if ((class127.field2005 == 1 || !Statics.field776 && class127.field2005 == 4) && var69) {
                                var70 = true;
                            }
                            boolean var71 = false;
                            if ((class127.field2004 == 1 || !Statics.field776 && class127.field2004 == 4) && class127.field1993 >= var12 && class127.field2006 >= var13 && class127.field1993 < var14 && class127.field2006 < var15) {
                                var71 = true;
                            }
                            if (var71) {
                                method2396(var9, class127.field1993 - var10, class127.field2006 - var11);
                            }
                            if (field418 != null && field418 != var9 && var69 && class156.method176(method132(var9))) {
                                field422 = var9;
                            }
                            if (field442 == var9) {
                                field261 = true;
                                field365 = var10;
                                field263 = var11;
                            }
                            if (var9.field2593) {
                                if (var69 && field443 != 0 && var9.field2614 != null) {
                                    class1 var72 = new class1();
                                    var72.field12 = true;
                                    var72.field15 = var9;
                                    var72.field3 = field443;
                                    var72.field5 = var9.field2614;
                                    field308.method3260(var72);
                                }
                                if (field418 != null || Statics.field313 != null || field387) {
                                    var71 = false;
                                    var70 = false;
                                    var69 = false;
                                }
                                if (!var9.field2636 && var71) {
                                    var9.field2636 = true;
                                    if (var9.field2529 != null) {
                                        class1 var73 = new class1();
                                        var73.field12 = true;
                                        var73.field15 = var9;
                                        var73.field4 = class127.field1993 - var10;
                                        var73.field3 = class127.field2006 - var11;
                                        var73.field5 = var9.field2529;
                                        field308.method3260(var73);
                                    }
                                }
                                if (var9.field2636 && var70 && var9.field2596 != null) {
                                    class1 var74 = new class1();
                                    var74.field12 = true;
                                    var74.field15 = var9;
                                    var74.field4 = class127.field1996 - var10;
                                    var74.field3 = class127.field1999 * 1288203703 - var11;
                                    var74.field5 = var9.field2596;
                                    field308.method3260(var74);
                                }
                                if (var9.field2636 && !var70) {
                                    var9.field2636 = false;
                                    if (var9.field2624 != null) {
                                        class1 var75 = new class1();
                                        var75.field12 = true;
                                        var75.field15 = var9;
                                        var75.field4 = class127.field1996 - var10;
                                        var75.field3 = class127.field1999 * 1288203703 - var11;
                                        var75.field5 = var9.field2624;
                                        field444.method3260(var75);
                                    }
                                }
                                if (var70 && var9.field2598 != null) {
                                    class1 var76 = new class1();
                                    var76.field12 = true;
                                    var76.field15 = var9;
                                    var76.field4 = class127.field1996 - var10;
                                    var76.field3 = class127.field1999 * 1288203703 - var11;
                                    var76.field5 = var9.field2598;
                                    field308.method3260(var76);
                                }
                                if (!var9.field2635 && var69) {
                                    var9.field2635 = true;
                                    if (var9.field2599 != null) {
                                        class1 var77 = new class1();
                                        var77.field12 = true;
                                        var77.field15 = var9;
                                        var77.field4 = class127.field1996 - var10;
                                        var77.field3 = class127.field1999 * 1288203703 - var11;
                                        var77.field5 = var9.field2599;
                                        field308.method3260(var77);
                                    }
                                }
                                if (var9.field2635 && var69 && var9.field2535 != null) {
                                    class1 var78 = new class1();
                                    var78.field12 = true;
                                    var78.field15 = var9;
                                    var78.field4 = class127.field1996 - var10;
                                    var78.field3 = class127.field1999 * 1288203703 - var11;
                                    var78.field5 = var9.field2535;
                                    field308.method3260(var78);
                                }
                                if (var9.field2635 && !var69) {
                                    var9.field2635 = false;
                                    if (var9.field2569 != null) {
                                        class1 var79 = new class1();
                                        var79.field12 = true;
                                        var79.field15 = var9;
                                        var79.field4 = class127.field1996 - var10;
                                        var79.field3 = class127.field1999 * 1288203703 - var11;
                                        var79.field5 = var9.field2569;
                                        field444.method3260(var79);
                                    }
                                }
                                if (var9.field2612 != null) {
                                    class1 var80 = new class1();
                                    var80.field15 = var9;
                                    var80.field5 = var9.field2612;
                                    field445.method3260(var80);
                                }
                                if (var9.field2565 != null && field297 > var9.field2521) {
                                    if (var9.field2642 == null || field297 - var9.field2521 > 32) {
                                        class1 var85 = new class1();
                                        var85.field15 = var9;
                                        var85.field5 = var9.field2565;
                                        field308.method3260(var85);
                                    } else {
                                        label734: for (int var81 = var9.field2521; var81 < field297; var81++) {
                                            int var82 = field431[var81 & 0x1F];
                                            for (int var83 = 0; var83 < var9.field2642.length; var83++) {
                                                if (var9.field2642[var83] == var82) {
                                                    class1 var84 = new class1();
                                                    var84.field15 = var9;
                                                    var84.field5 = var9.field2565;
                                                    field308.method3260(var84);
                                                    break label734;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2521 = field297;
                                }
                                if (var9.field2608 != null && field359 > var9.field2639) {
                                    if (var9.field2527 == null || field359 - var9.field2639 > 32) {
                                        class1 var90 = new class1();
                                        var90.field15 = var9;
                                        var90.field5 = var9.field2608;
                                        field308.method3260(var90);
                                    } else {
                                        label710: for (int var86 = var9.field2639; var86 < field359; var86++) {
                                            int var87 = field433[var86 & 0x1F];
                                            for (int var88 = 0; var88 < var9.field2527.length; var88++) {
                                                if (var9.field2527[var88] == var87) {
                                                    class1 var89 = new class1();
                                                    var89.field15 = var9;
                                                    var89.field5 = var9.field2608;
                                                    field308.method3260(var89);
                                                    break label710;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2639 = field359;
                                }
                                if (var9.field2610 != null && field436 > var9.field2626) {
                                    if (var9.field2611 == null || field436 - var9.field2626 > 32) {
                                        class1 var95 = new class1();
                                        var95.field15 = var9;
                                        var95.field5 = var9.field2610;
                                        field308.method3260(var95);
                                    } else {
                                        label686: for (int var91 = var9.field2626; var91 < field436; var91++) {
                                            int var92 = field435[var91 & 0x1F];
                                            for (int var93 = 0; var93 < var9.field2611.length; var93++) {
                                                if (var9.field2611[var93] == var92) {
                                                    class1 var94 = new class1();
                                                    var94.field15 = var9;
                                                    var94.field5 = var9.field2610;
                                                    field308.method3260(var94);
                                                    break label686;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2626 = field436;
                                }
                                if (field437 > var9.field2637 && var9.field2615 != null) {
                                    class1 var96 = new class1();
                                    var96.field15 = var9;
                                    var96.field5 = var9.field2615;
                                    field308.method3260(var96);
                                }
                                if (field438 > var9.field2637 && var9.field2617 != null) {
                                    class1 var97 = new class1();
                                    var97.field15 = var9;
                                    var97.field5 = var9.field2617;
                                    field308.method3260(var97);
                                }
                                if (field439 > var9.field2637 && var9.field2618 != null) {
                                    class1 var98 = new class1();
                                    var98.field15 = var9;
                                    var98.field5 = var9.field2618;
                                    field308.method3260(var98);
                                }
                                if (field440 > var9.field2637 && var9.field2619 != null) {
                                    class1 var99 = new class1();
                                    var99.field15 = var9;
                                    var99.field5 = var9.field2619;
                                    field308.method3260(var99);
                                }
                                var9.field2637 = field430;
                                if (var9.field2616 != null) {
                                    for (int var100 = 0; var100 < field464; var100++) {
                                        class1 var101 = new class1();
                                        var101.field15 = var9;
                                        var101.field8 = field346[var100];
                                        var101.field9 = field465[var100];
                                        var101.field5 = var9.field2616;
                                        field308.method3260(var101);
                                    }
                                }
                            }
                        }
                        if (!var9.field2582 && field418 == null && Statics.field313 == null && !field387) {
                            if ((var9.field2538 >= 0 || var9.field2545 != 0) && class127.field1996 >= var12 && class127.field1999 * 1288203703 >= var13 && class127.field1996 < var14 && class127.field1999 * 1288203703 < var15) {
                                if (var9.field2538 >= 0) {
                                    Statics.field1871 = arg0[var9.field2538];
                                } else {
                                    Statics.field1871 = var9;
                                }
                            }
                            if (var9.field2528 == 8 && class127.field1996 >= var12 && class127.field1999 * 1288203703 >= var13 && class127.field1996 < var14 && class127.field1999 * 1288203703 < var15) {
                                Statics.field541 = var9;
                            }
                            if (var9.field2542 > var9.field2533) {
                                int var102 = var9.field2622 + var10;
                                int var103 = var9.field2533;
                                int var104 = var9.field2542;
                                int var105 = class127.field1996;
                                int var106 = class127.field1999 * 1288203703;
                                if (field327) {
                                    field450 = 32;
                                } else {
                                    field450 = 0;
                                }
                                field327 = false;
                                if (class127.field2005 == 1 || !Statics.field776 && class127.field2005 == 4) {
                                    if (var105 >= var102 && var105 < var102 + 16 && var106 >= var11 && var106 < var11 + 16) {
                                        var9.field2540 -= 4;
                                        Statics.method122(var9);
                                    } else if (var105 >= var102 && var105 < var102 + 16 && var106 >= var11 + var103 - 16 && var106 < var11 + var103) {
                                        var9.field2540 += 4;
                                        Statics.method122(var9);
                                    } else if (var105 >= var102 - field450 && var105 < field450 + var102 + 16 && var106 >= var11 + 16 && var106 < var11 + var103 - 16) {
                                        int var107 = (var103 - 32) * var103 / var104;
                                        if (var107 < 8) {
                                            var107 = 8;
                                        }
                                        int var108 = var106 - var11 - 16 - var107 / 2;
                                        int var109 = var103 - 32 - var107;
                                        var9.field2540 = (var104 - var103) * var108 / var109;
                                        Statics.method122(var9);
                                        field327 = true;
                                    }
                                }
                                if (field443 != 0) {
                                    int var110 = var9.field2622;
                                    if (var105 >= var102 - var110 && var106 >= var11 && var105 < var102 + 16 && var106 <= var11 + var103) {
                                        var9.field2540 += field443 * 45;
                                        Statics.method122(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.cp([Lew;IB)V")
    public static final void method165(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2528 == 0) {
                    if (var3.field2634 != null) {
                        method165(var3.field2634, arg1);
                    }
                    class4 var4 = (class4) field407.method3204((long) var3.field2526);
                    if (var4 != null) {
                        int var5 = var4.field63;
                        if (class152.method1930(var5)) {
                            method165(Statics.field2595[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2620 != null) {
                    class1 var6 = new class1();
                    var6.field15 = var3;
                    var6.field5 = var3.field2620;
                    class32.method2405(var6, 200000);
                }
                if (arg1 == 1 && var3.field2621 != null) {
                    if (var3.field2641 >= 0) {
                        class152 var7 = class152.method868(var3.field2526);
                        if (var7 == null || var7.field2634 == null || var3.field2641 >= var7.field2634.length || var7.field2634[var3.field2641] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field15 = var3;
                    var8.field5 = var3.field2621;
                    class32.method2405(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("do.cr(Lew;III)V")
    public static final void method2396(class152 arg0, int arg1, int arg2) {
        if (field418 != null || field387 || arg0 == null) {
            return;
        }
        class152 var3 = method2684(arg0);
        if (var3 == null) {
            var3 = arg0.field2588;
        }
        if (var3 == null) {
            return;
        }
        field418 = arg0;
        field442 = method3158(arg0);
        field420 = arg1;
        field424 = arg2;
        Statics.field1516 = 0;
        field429 = false;
        if (field388 > 0) {
            int var5 = field388 - 1;
            Statics.field1265 = new class27();
            Statics.field1265.field626 = field389[var5];
            Statics.field1265.field622 = field481[var5];
            Statics.field1265.field625 = field326[var5];
            Statics.field1265.field621 = field392[var5];
            Statics.field1265.field624 = field425[var5];
        }
        return;
    }

    @ObfuscatedName("l.cv(I)V")
    public static final void method158() {
        Statics.method122(field418);
        Statics.field1516++;
        if (field426 && field261) {
            int var0 = class127.field1996;
            int var1 = class127.field1999 * 1288203703;
            int var2 = var0 - field420;
            int var3 = var1 - field424;
            if (var2 < field365) {
                var2 = field365;
            }
            if (field418.field2622 + var2 > field365 + field442.field2622) {
                var2 = field365 + field442.field2622 - field418.field2622;
            }
            if (var3 < field263) {
                var3 = field263;
            }
            if (field418.field2533 + var3 > field263 + field442.field2533) {
                var3 = field263 + field442.field2533 - field418.field2533;
            }
            int var4 = var2 - field427;
            int var5 = var3 - field428;
            int var6 = field418.field2589;
            if (Statics.field1516 > field418.field2590 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field429 = true;
            }
            int var7 = field442.field2539 + (var2 - field365);
            int var8 = field442.field2540 + (var3 - field263);
            if (field418.field2602 != null && field429) {
                class1 var9 = new class1();
                var9.field15 = field418;
                var9.field4 = var7;
                var9.field3 = var8;
                var9.field5 = field418.field2602;
                class32.method2405(var9, 200000);
            }
            if (class127.field2005 == 0) {
                if (field429) {
                    if (field418.field2583 != null) {
                        class1 var10 = new class1();
                        var10.field15 = field418;
                        var10.field4 = var7;
                        var10.field3 = var8;
                        var10.field11 = field422;
                        var10.field5 = field418.field2583;
                        class32.method2405(var10, 200000);
                    }
                    if (field422 != null && method2684(field418) != null) {
                        field284.method2345(87);
                        field284.method2278(field418.field2641);
                        field284.method2278(field422.field2641);
                        field284.method2090(field422.field2526);
                        field284.method2118(field418.field2526);
                        field284.method2278(field418.field2564);
                        field284.method2251(field422.field2564);
                    }
                } else if ((field373 == 1 || method1741(field388 - 1)) && field388 > 2) {
                    method1938(field427 + field420, field428 + field424);
                } else if (field388 > 0) {
                    method166(field427 + field420, field428 + field424);
                }
                field418 = null;
            }
        } else if (Statics.field1516 > 1) {
            field418 = null;
        }
    }

    @ObfuscatedName("q.cq(IIS)V")
    public static void method166(int arg0, int arg1) {
        method2488(Statics.field1265, arg0, arg1);
        Statics.field1265 = null;
    }

    @ObfuscatedName("d.cn(I)V")
    public static void method39() {
        for (class4 var0 = (class4) field407.method3202(); var0 != null; var0 = (class4) field407.method3203()) {
            int var1 = var0.field63;
            if (class152.method1930(var1)) {
                boolean var2 = true;
                class152[] var3 = Statics.field2595[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2582;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2864;
                    class152 var6 = class152.method868(var5);
                    if (var6 != null) {
                        Statics.method122(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fj.cz(Lew;B)Lew;")
    public static class152 method3158(class152 arg0) {
        class152 var1 = method2684(arg0);
        if (var1 == null) {
            var1 = arg0.field2588;
        }
        return var1;
    }

    @ObfuscatedName("ao.cl([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method556(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cm.cm([Lew;II)V")
    public static final void method1844(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null && var3.field2537 == arg1 && (!var3.field2582 || !method1571(var3))) {
                if (var3.field2528 == 0) {
                    if (!var3.field2582 && method1571(var3) && Statics.field1871 != var3) {
                        continue;
                    }
                    method1844(arg0, var3.field2526);
                    if (var3.field2634 != null) {
                        method1844(var3.field2634, var3.field2526);
                    }
                    class4 var4 = (class4) field407.method3204((long) var3.field2526);
                    if (var4 != null) {
                        int var5 = var4.field63;
                        if (class152.method1930(var5)) {
                            method1844(Statics.field2595[var5], -1);
                        }
                    }
                }
                if (var3.field2528 == 6) {
                    if (var3.field2562 != -1 || var3.field2563 != -1) {
                        boolean var6 = Statics.method164(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2563;
                        } else {
                            var7 = var3.field2562;
                        }
                        if (var7 != -1) {
                            class38 var8 = Statics.method448(var7);
                            var3.field2606 += field456;
                            while (var3.field2606 > var8.field896[var3.field2632]) {
                                var3.field2606 -= var8.field896[var3.field2632];
                                var3.field2632++;
                                if (var3.field2632 >= var8.field894.length) {
                                    var3.field2632 -= var8.field898;
                                    if (var3.field2632 < 0 || var3.field2632 >= var8.field894.length) {
                                        var3.field2632 = 0;
                                    }
                                }
                                Statics.method122(var3);
                            }
                        }
                    }
                    if (var3.field2570 != 0 && !var3.field2582) {
                        int var9 = var3.field2570 >> 16;
                        int var10 = var3.field2570 << 16 >> 16;
                        int var11 = field456 * var9;
                        int var12 = field456 * var10;
                        var3.field2566 = var3.field2566 + var11 & 0x7FF;
                        var3.field2567 = var3.field2567 + var12 & 0x7FF;
                        Statics.method122(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.cs(II)V")
    public static final void method31(int arg0) {
        method39();
        for (class20 var1 = (class20) class20.field545.method3239(); var1 != null; var1 = (class20) class20.field545.method3248()) {
            if (var1.field544 != null) {
                var1.method466();
            }
        }
        int var2 = class46.method583(arg0).field1047;
        if (var2 == 0) {
            return;
        }
        int var3 = class154.field2650[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class84.method1756(0.9D);
                ((class88) Statics.field1473).method1843(0.9D);
            }
            if (var3 == 2) {
                class84.method1756(0.8D);
                ((class88) Statics.field1473).method1843(0.8D);
            }
            if (var3 == 3) {
                class84.method1756(0.7D);
                ((class88) Statics.field1473).method1843(0.7D);
            }
            if (var3 == 4) {
                class84.method1756(0.6D);
                ((class88) Statics.field1473).method1843(0.6D);
            }
            class45.field1011.method3171();
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
            if (field419 != var4) {
                if (field419 == 0 && field479 != -1) {
                    class161.method1932(Statics.field2401, field479, 0, var4, false);
                    field480 = false;
                } else if (var4 == 0) {
                    class161.method2434();
                    field480 = false;
                } else {
                    class161.method1828(var4);
                }
                field419 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field304 = 127;
            }
            if (var3 == 1) {
                field304 = 96;
            }
            if (var3 == 2) {
                field304 = 64;
            }
            if (var3 == 3) {
                field304 = 32;
            }
            if (var3 == 4) {
                field304 = 0;
            }
        }
        if (var2 == 5) {
            field373 = var3;
        }
        if (var2 == 6) {
            field286 = var3;
        }
        if (var2 == 9) {
            field409 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field482 = 127;
            }
            if (var3 == 1) {
                field482 = 96;
            }
            if (var3 == 2) {
                field482 = 64;
            }
            if (var3 == 3) {
                field482 = 32;
            }
            if (var3 == 4) {
                field482 = 0;
            }
        }
        if (var2 == 17) {
            field414 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field360 = (class18) class99.method801(class18.method2793(), var3);
            if (field360 == null) {
                field360 = class18.field507;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field378 = -1;
        } else {
            field378 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("ek.ca(Lew;I)V")
    public static final void method2848(class152 arg0) {
        int var1 = arg0.field2530;
        if (var1 == 324) {
            if (field502 == -1) {
                field502 = arg0.field2550;
                field283 = arg0.field2551;
            }
            if (field501.field2671) {
                arg0.field2550 = field502;
            } else {
                arg0.field2550 = field283;
            }
        } else if (var1 == 325) {
            if (field502 == -1) {
                field502 = arg0.field2550;
                field283 = arg0.field2551;
            }
            if (field501.field2671) {
                arg0.field2550 = field283;
            } else {
                arg0.field2550 = field502;
            }
        } else if (var1 == 327) {
            arg0.field2566 = 150;
            arg0.field2567 = (int) (Math.sin((double) field250 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2558 = 5;
            arg0.field2597 = 0;
        } else if (var1 == 328) {
            arg0.field2566 = 150;
            arg0.field2567 = (int) (Math.sin((double) field250 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2558 = 5;
            arg0.field2597 = 1;
        }
    }

    @ObfuscatedName("v.cw(I)V")
    public static final void method91() {
        field284.method2345(211);
        for (class4 var0 = (class4) field407.method3202(); var0 != null; var0 = (class4) field407.method3203()) {
            if (var0.field55 == 0 || var0.field55 == 3) {
                method129(var0, true);
            }
        }
        if (field451 != null) {
            Statics.method122(field451);
            field451 = null;
        }
    }

    @ObfuscatedName("cr.ct(IIII)Le;")
    public static final class4 method1749(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field63 = arg1;
        var3.field55 = arg2;
        field407.method3212(var3, (long) arg0);
        Statics.method177(arg1);
        class32.method541(arg1);
        class152 var4 = class152.method868(arg0);
        if (var4 != null) {
            Statics.method122(var4);
        }
        if (field451 != null) {
            Statics.method122(field451);
            field451 = null;
        }
        method1035();
        if (field406 != -1) {
            int var5 = field406;
            if (class152.method1930(var5)) {
                method165(Statics.field2595[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("a.cf(Le;ZB)V")
    public static final void method129(class4 arg0, boolean arg1) {
        int var2 = arg0.field63;
        int var3 = (int) arg0.field2864;
        arg0.method3316();
        if (arg1) {
            class152.method2427(var2);
        }
        method1389(var2);
        class152 var4 = class152.method868(var3);
        if (var4 != null) {
            Statics.method122(var4);
        }
        method1035();
        if (field406 != -1) {
            int var5 = field406;
            if (class152.method1930(var5)) {
                method165(Statics.field2595[var5], 1);
            }
        }
    }

    @ObfuscatedName("ae.cg(Lew;I)Z")
    public static final boolean method582(class152 arg0) {
        int var1 = arg0.field2530;
        if (var1 == 205) {
            field291 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field501.method2928(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field501.method2929(var4, var5 == 1);
        }
        if (var1 == 324) {
            field501.method2930(false);
        }
        if (var1 == 325) {
            field501.method2930(true);
        }
        if (var1 == 326) {
            field284.method2345(250);
            field501.method2931(field284);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cs.cc(IIII)V")
    public static final void method1847(int arg0, int arg1, int arg2) {
        method749();
        class73.method1531(arg0, arg1, Statics.field504.field1308 + arg0, Statics.field504.field1309 + arg1);
        if (field477 == 2 || field477 == 5) {
            class73.method1530(arg0 + 25, arg1 + 5, 0, Statics.field176, Statics.field466);
        } else {
            int var3 = field315 + field254 & 0x7FF;
            int var4 = Statics.field1452.field772 / 32 + 48;
            int var5 = 464 - Statics.field1452.field715 / 32;
            Statics.field513.method1420(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field317 + 256, Statics.field176, Statics.field466);
            for (int var6 = 0; var6 < field411; var6++) {
                int var7 = field288[var6] * 4 + 2 - Statics.field1452.field772 / 32;
                int var8 = field473[var6] * 4 + 2 - Statics.field1452.field715 / 32;
                method1748(arg0, arg1, var7, var8, field474[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field379[Statics.field588][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1452.field772 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1452.field715 / 32;
                        method1748(arg0, arg1, var12, var13, Statics.field126[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field281; var14++) {
                class30 var15 = field280[field282[var14]];
                if (var15 != null && var15.method18()) {
                    class35 var16 = var15.field680;
                    if (var16 != null && var16.field817 != null) {
                        var16 = var16.method593();
                    }
                    if (var16 != null && var16.field803 && var16.field815) {
                        int var17 = var15.field772 / 32 - Statics.field1452.field772 / 32;
                        int var18 = var15.field715 / 32 - Statics.field1452.field715 / 32;
                        method1748(arg0, arg1, var17, var18, Statics.field126[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field293; var19++) {
                class3 var20 = field268[field366[var19]];
                if (var20 != null && var20.method18() && !var20.field52) {
                    int var21 = var20.field772 / 32 - Statics.field1452.field772 / 32;
                    int var22 = var20.field715 / 32 - Statics.field1452.field715 / 32;
                    boolean var23 = false;
                    if (method2409(var20.field50, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field600; var25++) {
                        if (var20.field50.equals(Statics.field1887[var25].field557)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1452.field51 != 0 && var20.field51 != 0 && Statics.field1452.field51 == var20.field51) {
                        var26 = true;
                    }
                    if (var23) {
                        method1748(arg0, arg1, var21, var22, Statics.field126[3]);
                    } else if (var26) {
                        method1748(arg0, arg1, var21, var22, Statics.field126[4]);
                    } else if (var24) {
                        method1748(arg0, arg1, var21, var22, Statics.field126[5]);
                    } else {
                        method1748(arg0, arg1, var21, var22, Statics.field126[2]);
                    }
                }
            }
            if (field258 != 0 && field250 % 20 < 10) {
                if (field258 == 1 && field259 >= 0 && field259 < field280.length) {
                    class30 var27 = field280[field259];
                    if (var27 != null) {
                        int var28 = var27.field772 / 32 - Statics.field1452.field772 / 32;
                        int var29 = var27.field715 / 32 - Statics.field1452.field715 / 32;
                        method35(arg0, arg1, var28, var29, Statics.field158[1]);
                    }
                }
                if (field258 == 2) {
                    int var30 = field368 * 4 - Statics.field200 * 4 + 2 - Statics.field1452.field772 / 32;
                    int var31 = field264 * 4 - Statics.field56 * 4 + 2 - Statics.field1452.field715 / 32;
                    method35(arg0, arg1, var30, var31, Statics.field158[1]);
                }
                if (field258 == 10 && field321 >= 0 && field321 < field268.length) {
                    class3 var32 = field268[field321];
                    if (var32 != null) {
                        int var33 = var32.field772 / 32 - Statics.field1452.field772 / 32;
                        int var34 = var32.field715 / 32 - Statics.field1452.field715 / 32;
                        method35(arg0, arg1, var33, var34, Statics.field158[1]);
                    }
                }
            }
            if (field475 != 0) {
                int var35 = field475 * 4 + 2 - Statics.field1452.field772 / 32;
                int var36 = field503 * 4 + 2 - Statics.field1452.field715 / 32;
                method1748(arg0, arg1, var35, var36, Statics.field158[0]);
            }
            if (!Statics.field1452.field52) {
                class73.method1497(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field477 < 3) {
            Statics.field691.method1420(arg0, arg1, 33, 33, 25, 25, field254, 256, Statics.field1861, Statics.field682);
        } else {
            class73.method1530(arg0, arg1, 0, Statics.field1861, Statics.field682);
        }
        if (field452[arg2]) {
            Statics.field504.method1547(arg0, arg1);
        }
        field314[arg2] = true;
    }

    @ObfuscatedName("d.cd(IIIILbv;B)V")
    public static final void method35(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1748(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field315 + field254 & 0x7FF;
        int var7 = class84.field1461[var6];
        int var8 = class84.field1471[var6];
        int var9 = var7 * 256 / (field317 + 256);
        int var10 = var8 * 256 / (field317 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1071.method1421(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("cr.cy(IIIILbv;B)V")
    public static final void method1748(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field315 + field254 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1461[var5];
        int var8 = class84.field1471[var5];
        int var9 = var7 * 256 / (field317 + 256);
        int var10 = var8 * 256 / (field317 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1424(Statics.field504, arg0 + 94 + var11 - arg4.field1293 / 2 + 4, arg1 + 83 - var12 - arg4.field1292 / 2 - 4);
        } else {
            arg4.method1410(arg0 + 94 + var11 - arg4.field1293 / 2 + 4, arg1 + 83 - var12 - arg4.field1292 / 2 - 4);
        }
    }

    @ObfuscatedName("dv.ce(Ljava/lang/String;ZB)Z")
    public static boolean method2409(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class200.method2604(arg0, Statics.field1904);
        for (int var3 = 0; var3 < field495; var3++) {
            if (var2.equalsIgnoreCase(class200.method2604(field497[var3].field221, Statics.field1904)) && (!arg1 || field497[var3].field225 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class200.method2604(Statics.field1452.field50, Statics.field1904))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ee.ch(Ljava/lang/String;B)Z")
    public static boolean method2691(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class200.method2604(arg0, Statics.field1904);
        for (int var2 = 0; var2 < field499; var2++) {
            class8 var3 = field500[var2];
            if (var1.equalsIgnoreCase(class200.method2604(var3.field128, Statics.field1904))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class200.method2604(var3.field124, Statics.field1904))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dr.cu(Ljava/lang/String;I)V")
    public static final void method2401(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        field284.method2345(24);
        class110 var1 = field284;
        int var2 = arg0.length() + 1;
        var1.method2214(var2);
        field284.method2092(arg0);
    }

    @ObfuscatedName("cn.dd(I)V")
    public static final void method1829() {
        field284.method2345(24);
        field284.method2214(0);
    }

    @ObfuscatedName("by.dn(II)V")
    public static void method1389(int arg0) {
        for (class179 var1 = (class179) field447.method3202(); var1 != null; var1 = (class179) field447.method3203()) {
            if ((long) arg0 == (var1.field2864 >> 48 & 0xFFFFL)) {
                var1.method3316();
            }
        }
    }

    @ObfuscatedName("a.db(Lew;I)I")
    public static int method132(class152 arg0) {
        class179 var1 = (class179) field447.method3204(((long) arg0.field2526 << 32) + (long) arg0.field2641);
        return var1 == null ? arg0.field2594 : var1.field2850;
    }

    @ObfuscatedName("ej.dj(Lew;I)Lew;")
    public static class152 method2684(class152 arg0) {
        int var1 = class156.method2579(method132(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class152.method868(arg0.field2537);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("bw.da(Lew;I)Z")
    public static boolean method1571(class152 arg0) {
        if (field339) {
            if (method132(arg0) != 0) {
                return false;
            }
            if (arg0.field2528 == 0) {
                return false;
            }
        }
        return arg0.field2552;
    }

    @ObfuscatedName("bk.dm(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1327(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field244 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field244 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field244 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field244 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field244 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field247 + "/";
    }
}

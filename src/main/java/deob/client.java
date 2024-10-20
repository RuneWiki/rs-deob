package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.Iterator;

public final class client extends class131 {

    @ObfuscatedName("client.i")
    public static boolean field251 = true;

    @ObfuscatedName("client.p")
    public static int field311 = 1;

    @ObfuscatedName("client.c")
    public static int field253 = 0;

    @ObfuscatedName("client.l")
    public static int field254 = 0;

    @ObfuscatedName("client.w")
    public static class197[] field318 = new class197[4];

    @ObfuscatedName("client.m")
    public static boolean field257 = false;

    @ObfuscatedName("client.b")
    public static boolean field258 = false;

    @ObfuscatedName("client.u")
    public static int field367 = 0;

    @ObfuscatedName("client.z")
    public static int field260 = 0;

    @ObfuscatedName("client.v")
    public static boolean field261 = true;

    @ObfuscatedName("client.k")
    public static int field274 = 0;

    @ObfuscatedName("client.a")
    public static long field263 = 1L;

    @ObfuscatedName("client.j")
    public static int field264 = -1;

    @ObfuscatedName("client.s")
    public static int field265 = -1;

    @ObfuscatedName("client.f")
    public static int field266 = -1;

    @ObfuscatedName("client.e")
    public static boolean field267 = true;

    @ObfuscatedName("client.q")
    public static boolean field406 = false;

    @ObfuscatedName("client.al")
    public static int field252 = 0;

    @ObfuscatedName("client.ao")
    public static int field270 = 0;

    @ObfuscatedName("client.ap")
    public static int field495 = 0;

    @ObfuscatedName("client.aa")
    public static int field272 = 0;

    @ObfuscatedName("client.ak")
    public static int field456 = 0;

    @ObfuscatedName("client.ah")
    public static int field425 = 0;

    @ObfuscatedName("client.as")
    public static int field438 = 0;

    @ObfuscatedName("client.aw")
    public static int field276 = 0;

    @ObfuscatedName("client.aj")
    public static int field338 = 0;

    @ObfuscatedName("client.af")
    public static class107 field457 = new class107(new byte[5000]);

    @ObfuscatedName("client.ai")
    public static class18 field324 = class18.field515;

    @ObfuscatedName("client.ac")
    public static int field281 = 0;

    @ObfuscatedName("client.at")
    public static int field381 = 0;

    @ObfuscatedName("client.ax")
    public static int field478 = 0;

    @ObfuscatedName("client.bj")
    public static int field284 = 0;

    @ObfuscatedName("client.bh")
    public static int field285 = 0;

    @ObfuscatedName("client.bw")
    public static int field286 = 0;

    @ObfuscatedName("client.bz")
    public static int field287 = 0;

    @ObfuscatedName("client.by")
    public static int field288 = 0;

    @ObfuscatedName("client.ba")
    public static class30[] field271 = new class30[32768];

    @ObfuscatedName("client.bo")
    public static int field424 = 0;

    @ObfuscatedName("client.bs")
    public static int[] field497 = new int[32768];

    @ObfuscatedName("client.cr")
    public static class110 field460 = new class110(5000);

    @ObfuscatedName("client.ca")
    public static class110 field298 = new class110(5000);

    @ObfuscatedName("client.cl")
    public static class110 field402 = new class110(5000);

    @ObfuscatedName("client.ch")
    public static int field295 = 0;

    @ObfuscatedName("client.cf")
    public static int field421 = 0;

    @ObfuscatedName("client.co")
    public static int field417 = 0;

    @ObfuscatedName("client.ct")
    public static int field345 = 0;

    @ObfuscatedName("client.cv")
    public static int field299 = 0;

    @ObfuscatedName("client.cp")
    public static int field300 = 0;

    @ObfuscatedName("client.cs")
    public static int field301 = 0;

    @ObfuscatedName("client.cj")
    public static int field302 = 0;

    @ObfuscatedName("client.cd")
    public static boolean field314 = false;

    @ObfuscatedName("client.ck")
    public static int field305 = 0;

    @ObfuscatedName("client.cw")
    public static int field306 = 0;

    @ObfuscatedName("client.dd")
    public static int field307 = 1;

    @ObfuscatedName("client.dq")
    public static int field308 = 0;

    @ObfuscatedName("client.dg")
    public static int field294 = 1;

    @ObfuscatedName("client.dx")
    public static int field399 = 0;

    @ObfuscatedName("client.do")
    public static boolean field313 = false;

    @ObfuscatedName("client.dr")
    public static int[][][] field426 = new int[4][13][13];

    @ObfuscatedName("client.da")
    public static final int[] field315 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dt")
    public static int field316 = 0;

    @ObfuscatedName("client.dk")
    public static int field317 = 2;

    @ObfuscatedName("client.dl")
    public static int field289 = 0;

    @ObfuscatedName("client.du")
    public static int field319 = 2;

    @ObfuscatedName("client.dy")
    public static int field320 = 0;

    @ObfuscatedName("client.dn")
    public static int field321 = 1;

    @ObfuscatedName("client.dc")
    public static int field400 = 0;

    @ObfuscatedName("client.ds")
    public static int field323 = 0;

    @ObfuscatedName("client.dz")
    public static int field491 = 2;

    @ObfuscatedName("client.di")
    public static int field450 = 0;

    @ObfuscatedName("client.en")
    public static int field297 = 1;

    @ObfuscatedName("client.ec")
    public static int field327 = 0;

    @ObfuscatedName("client.ek")
    public static int field328 = 0;

    @ObfuscatedName("client.eo")
    public static int field330 = 2301979;

    @ObfuscatedName("client.ez")
    public static int field331 = 5063219;

    @ObfuscatedName("client.ex")
    public static int field332 = 3353893;

    @ObfuscatedName("client.ep")
    public static int field378 = 7759444;

    @ObfuscatedName("client.eu")
    public static boolean field334 = false;

    @ObfuscatedName("client.ft")
    public static int field335 = 0;

    @ObfuscatedName("client.fn")
    public static int field377 = 128;

    @ObfuscatedName("client.fo")
    public static int field337 = 0;

    @ObfuscatedName("client.fh")
    public static int field269 = 0;

    @ObfuscatedName("client.fv")
    public static int field339 = 0;

    @ObfuscatedName("client.fc")
    public static int field340 = 0;

    @ObfuscatedName("client.fd")
    public static int field341 = 0;

    @ObfuscatedName("client.fl")
    public static int field342 = 0;

    @ObfuscatedName("client.fz")
    public static boolean field343 = false;

    @ObfuscatedName("client.fj")
    public static int field433 = 0;

    @ObfuscatedName("client.fs")
    public static int field466 = 0;

    @ObfuscatedName("client.fy")
    public static int field481 = 50;

    @ObfuscatedName("client.fa")
    public static int[] field347 = new int[field481];

    @ObfuscatedName("client.fr")
    public static int[] field348 = new int[field481];

    @ObfuscatedName("client.fu")
    public static int[] field349 = new int[field481];

    @ObfuscatedName("client.fm")
    public static int[] field350 = new int[field481];

    @ObfuscatedName("client.fe")
    public static int[] field351 = new int[field481];

    @ObfuscatedName("client.fg")
    public static int[] field352 = new int[field481];

    @ObfuscatedName("client.fi")
    public static int[] field353 = new int[field481];

    @ObfuscatedName("client.gl")
    public static String[] field354 = new String[field481];

    @ObfuscatedName("client.gs")
    public static int[][] field355 = new int[104][104];

    @ObfuscatedName("client.gc")
    public static int field356 = 0;

    @ObfuscatedName("client.gh")
    public static int field357 = -1;

    @ObfuscatedName("client.gv")
    public static int field277 = -1;

    @ObfuscatedName("client.gq")
    public static int field359 = 0;

    @ObfuscatedName("client.ge")
    public static int field360 = 0;

    @ObfuscatedName("client.gi")
    public static int field361 = 0;

    @ObfuscatedName("client.gw")
    public static int field362 = 0;

    @ObfuscatedName("client.gu")
    public static int field363 = 0;

    @ObfuscatedName("client.gr")
    public static int field364 = 0;

    @ObfuscatedName("client.gn")
    public static int field365 = 0;

    @ObfuscatedName("client.gt")
    public static int field366 = 0;

    @ObfuscatedName("client.gk")
    public static int field325 = 0;

    @ObfuscatedName("client.gx")
    public static int field368 = 0;

    @ObfuscatedName("client.gz")
    public static boolean field369 = false;

    @ObfuscatedName("client.gf")
    public static int field370 = 0;

    @ObfuscatedName("client.gy")
    public static int field396 = 0;

    @ObfuscatedName("client.gm")
    public static class3[] field310 = new class3[2048];

    @ObfuscatedName("client.gp")
    public static int field373 = 0;

    @ObfuscatedName("client.gj")
    public static int[] field275 = new int[2048];

    @ObfuscatedName("client.hw")
    public static int field375 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field376 = new int[2048];

    @ObfuscatedName("client.hc")
    public static class107[] field391 = new class107[2048];

    @ObfuscatedName("client.hh")
    public static int field262 = -1;

    @ObfuscatedName("client.hd")
    public static int field467 = 0;

    @ObfuscatedName("client.ha")
    public static int field380 = 0;

    @ObfuscatedName("client.hs")
    public static int[] field501 = new int[1000];

    @ObfuscatedName("client.hq")
    public static final int[] field382 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hm")
    public static String[] field508 = new String[8];

    @ObfuscatedName("client.hp")
    public static boolean[] field384 = new boolean[8];

    @ObfuscatedName("client.hb")
    public static int[] field322 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hj")
    public static int field507 = -1;

    @ObfuscatedName("client.hn")
    public static class177[][][] field387 = new class177[4][104][104];

    @ObfuscatedName("client.hu")
    public static class177 field388 = new class177();

    @ObfuscatedName("client.hi")
    public static class177 field389 = new class177();

    @ObfuscatedName("client.hx")
    public static class177 field390 = new class177();

    @ObfuscatedName("client.hl")
    public static int[] field383 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field392 = new int[25];

    @ObfuscatedName("client.he")
    public static int[] field291 = new int[25];

    @ObfuscatedName("client.hy")
    public static int field394 = 0;

    @ObfuscatedName("client.hr")
    public static boolean field395 = false;

    @ObfuscatedName("client.iv")
    public static int field358 = 0;

    @ObfuscatedName("client.ij")
    public static int[] field397 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field398 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field280 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field423 = new int[500];

    @ObfuscatedName("client.if")
    public static String[] field401 = new String[500];

    @ObfuscatedName("client.il")
    public static String[] field446 = new String[500];

    @ObfuscatedName("client.ir")
    public static int field403 = -1;

    @ObfuscatedName("client.is")
    public static int field404 = -1;

    @ObfuscatedName("client.ik")
    public static int field405 = 0;

    @ObfuscatedName("client.im")
    public static int field283 = 50;

    @ObfuscatedName("client.ia")
    public static int field407 = 0;

    @ObfuscatedName("client.it")
    public static String field408 = null;

    @ObfuscatedName("client.ih")
    public static boolean field409 = false;

    @ObfuscatedName("client.iw")
    public static int field326 = -1;

    @ObfuscatedName("client.iq")
    public static int field411 = -1;

    @ObfuscatedName("client.jz")
    public static String field412 = null;

    @ObfuscatedName("client.jk")
    public static String field413 = null;

    @ObfuscatedName("client.jl")
    public static int field416 = -1;

    @ObfuscatedName("client.jq")
    public static class174 field415 = new class174(8);

    @ObfuscatedName("client.jo")
    public static int field290 = 0;

    @ObfuscatedName("client.jx")
    public static int field410 = 0;

    @ObfuscatedName("client.jp")
    public static class152 field418 = null;

    @ObfuscatedName("client.jn")
    public static int field419 = 0;

    @ObfuscatedName("client.jj")
    public static int field420 = 0;

    @ObfuscatedName("client.jh")
    public static int field469 = 0;

    @ObfuscatedName("client.ja")
    public static int field422 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field344 = false;

    @ObfuscatedName("client.js")
    public static boolean field379 = false;

    @ObfuscatedName("client.jm")
    public static boolean field292 = false;

    @ObfuscatedName("client.jr")
    public static class152 field427 = null;

    @ObfuscatedName("client.je")
    public static class152 field279 = null;

    @ObfuscatedName("client.jw")
    public static int field428 = 0;

    @ObfuscatedName("client.jf")
    public static int field499 = 0;

    @ObfuscatedName("client.ji")
    public static class152 field430 = null;

    @ObfuscatedName("client.jd")
    public static boolean field259 = false;

    @ObfuscatedName("client.jg")
    public static int field432 = -1;

    @ObfuscatedName("client.jt")
    public static int field463 = -1;

    @ObfuscatedName("client.jv")
    public static boolean field434 = false;

    @ObfuscatedName("client.jb")
    public static int field435 = -1;

    @ObfuscatedName("client.jc")
    public static int field436 = -1;

    @ObfuscatedName("client.kn")
    public static boolean field437 = false;

    @ObfuscatedName("client.kr")
    public static int field268 = 1;

    @ObfuscatedName("client.kd")
    public static int[] field439 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field440 = 0;

    @ObfuscatedName("client.kg")
    public static int[] field441 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field442 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field443 = new int[32];

    @ObfuscatedName("client.kz")
    public static int field482 = 0;

    @ObfuscatedName("client.ko")
    public static int field445 = 0;

    @ObfuscatedName("client.km")
    public static int field458 = 0;

    @ObfuscatedName("client.ks")
    public static int field447 = 0;

    @ObfuscatedName("client.kk")
    public static int field448 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field449 = new int[2000];

    @ObfuscatedName("client.kf")
    public static String[] field333 = new String[1000];

    @ObfuscatedName("client.ky")
    public static int field451 = 0;

    @ObfuscatedName("client.ki")
    public static class177 field452 = new class177();

    @ObfuscatedName("client.ke")
    public static class177 field453 = new class177();

    @ObfuscatedName("client.kv")
    public static class177 field454 = new class177();

    @ObfuscatedName("client.kc")
    public static class174 field455 = new class174(512);

    @ObfuscatedName("client.li")
    public static int field385 = 0;

    @ObfuscatedName("client.le")
    public static int field273 = -2;

    @ObfuscatedName("client.lq")
    public static boolean[] field444 = new boolean[100];

    @ObfuscatedName("client.ln")
    public static boolean[] field459 = new boolean[100];

    @ObfuscatedName("client.la")
    public static boolean[] field309 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static int[] field461 = new int[100];

    @ObfuscatedName("client.lt")
    public static int[] field462 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field431 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field464 = new int[100];

    @ObfuscatedName("client.lk")
    public static int field465 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field512 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lx")
    public static int field372 = 0;

    @ObfuscatedName("client.ly")
    public static int field468 = 0;

    @ObfuscatedName("client.lv")
    public static long[] field386 = new long[100];

    @ObfuscatedName("client.lh")
    public static int field470 = 0;

    @ObfuscatedName("client.lc")
    public static int field471 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field472 = new int[128];

    @ObfuscatedName("client.ls")
    public static int[] field473 = new int[128];

    @ObfuscatedName("client.lj")
    public static long field474 = -1L;

    @ObfuscatedName("client.lf")
    public static String field475 = null;

    @ObfuscatedName("client.lu")
    public static String field476 = null;

    @ObfuscatedName("client.mz")
    public static int field477 = -1;

    @ObfuscatedName("client.md")
    public static int field484 = 0;

    @ObfuscatedName("client.mp")
    public static int[] field479 = new int[1000];

    @ObfuscatedName("client.mx")
    public static int[] field509 = new int[1000];

    @ObfuscatedName("client.mb")
    public static class72[] field414 = new class72[1000];

    @ObfuscatedName("client.mg")
    public static int field282 = 0;

    @ObfuscatedName("client.mm")
    public static int field483 = 0;

    @ObfuscatedName("client.mw")
    public static int field492 = 0;

    @ObfuscatedName("client.ms")
    public static int field346 = 255;

    @ObfuscatedName("client.mq")
    public static int field486 = -1;

    @ObfuscatedName("client.mf")
    public static boolean field487 = false;

    @ObfuscatedName("client.mh")
    public static int field488 = 127;

    @ObfuscatedName("client.ml")
    public static int field371 = 127;

    @ObfuscatedName("client.ns")
    public static int field490 = 0;

    @ObfuscatedName("client.nu")
    public static int[] field489 = new int[50];

    @ObfuscatedName("client.no")
    public static int[] field480 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field493 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field494 = new int[50];

    @ObfuscatedName("client.ne")
    public static class52[] field293 = new class52[50];

    @ObfuscatedName("client.na")
    public static boolean field496 = false;

    @ObfuscatedName("client.nk")
    public static boolean[] field485 = new boolean[5];

    @ObfuscatedName("client.nl")
    public static int[] field498 = new int[5];

    @ObfuscatedName("client.ny")
    public static int[] field303 = new int[5];

    @ObfuscatedName("client.nc")
    public static int[] field500 = new int[5];

    @ObfuscatedName("client.np")
    public static int[] field249 = new int[5];

    @ObfuscatedName("client.nr")
    public static int field502 = 0;

    @ObfuscatedName("client.oh")
    public static int field503 = 0;

    @ObfuscatedName("client.on")
    public static class16[] field504 = new class16[400];

    @ObfuscatedName("client.ot")
    public static class173 field505 = new class173();

    @ObfuscatedName("client.oa")
    public static int field506 = 0;

    @ObfuscatedName("client.op")
    public static class8[] field278 = new class8[400];

    @ObfuscatedName("client.og")
    public static class157 field374 = new class157();

    @ObfuscatedName("client.ox")
    public static int field296 = -1;

    @ObfuscatedName("client.om")
    public static int field510 = -1;

    @ObfuscatedName("client.i(I)V")
    public final void method289() {
    }

    public final void init() {
        if (!this.method2616()) {
            return;
        }
        class168[] var1 = new class168[] { class168.field2821, class168.field2811, class168.field2814, class168.field2813, class168.field2810, class168.field2812, class168.field2815, class168.field2808, class168.field2817, class168.field2809 };
        class168[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class168 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2818);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2818)) {
                    case 1:
                        field254 = Integer.parseInt(var5);
                        break;
                    case 2:
                        field367 = Integer.parseInt(var5);
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class2.field16)) {
                            field257 = true;
                        } else {
                            field257 = false;
                        }
                        break;
                    case 4:
                        field311 = Integer.parseInt(var5);
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class2.field16)) {
                        }
                        break;
                    case 6:
                        Statics.field976 = var5;
                    case 7:
                    default:
                        break;
                    case 8:
                        int var6 = Integer.parseInt(var5);
                        class138[] var7 = new class138[] { class138.field2077, class138.field2078, class138.field2084, class138.field2079 };
                        class138[] var8 = var7;
                        int var9 = 0;
                        class138 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class138 var10 = var8[var9];
                            if (var10.field2082 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field231 = var11;
                        break;
                    case 9:
                        class139[] var12 = new class139[] { class139.field2089, class139.field2088, class139.field2091, class139.field2092, class139.field2090, class139.field2087 };
                        Statics.field255 = (class139) class99.method704(var12, Integer.parseInt(var5));
                        if (Statics.field255 == class139.field2090) {
                            Statics.field256 = class190.field2884;
                        } else {
                            Statics.field256 = class190.field2886;
                        }
                        break;
                    case 10:
                        field253 = Integer.parseInt(var5);
                }
            }
        }
        method2650();
        Statics.field2086 = this.getCodeBase().getHost();
        String var13 = Statics.field231.field2081;
        byte var14 = 0;
        try {
            Statics.field2054 = 16;
            Statics.field1966 = var14;
            try {
                Statics.field2061 = System.getProperty("os.name");
            } catch (Exception var66) {
                Statics.field2061 = "Unknown";
            }
            Statics.field2050 = Statics.field2061.toLowerCase();
            try {
                Statics.field2062 = System.getProperty("user.home");
                if (Statics.field2062 != null) {
                    Statics.field2062 = Statics.field2062 + "/";
                }
            } catch (Exception var65) {
            }
            try {
                if (Statics.field2050.startsWith("win")) {
                    if (Statics.field2062 == null) {
                        Statics.field2062 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2062 == null) {
                    Statics.field2062 = System.getenv("HOME");
                }
                if (Statics.field2062 != null) {
                    Statics.field2062 = Statics.field2062 + "/";
                }
            } catch (Exception var64) {
            }
            if (Statics.field2062 == null) {
                Statics.field2062 = "~/";
            }
            Statics.field248 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2062, "/tmp/", "" };
            Statics.field1350 = new String[] { ".jagex_cache_" + Statics.field1966, ".file_store_" + Statics.field1966 };
            int var18 = 0;
            label298: while (var18 < 4) {
                String var19 = var18 == 0 ? "" : "" + var18;
                Statics.field2053 = new File(Statics.field2062, "jagex_cl_oldschool_" + var13 + var19 + ".dat");
                String var20 = null;
                String var21 = null;
                boolean var22 = false;
                if (Statics.field2053.exists()) {
                    try {
                        class195 var23 = new class195(Statics.field2053, "rw", 10000L);
                        class107 var24 = new class107((int) var23.method3384());
                        while (var24.field1827 < var24.field1826.length) {
                            int var25 = var23.method3388(var24.field1826, var24.field1827, var24.field1826.length - var24.field1827);
                            if (var25 == -1) {
                                throw new IOException();
                            }
                            var24.field1827 += var25;
                        }
                        var24.field1827 = 0;
                        int var26 = var24.method2118();
                        if (var26 < 1 || var26 > 3) {
                            throw new IOException("" + var26);
                        }
                        int var27 = 0;
                        if (var26 > 1) {
                            var27 = var24.method2118();
                        }
                        if (var26 <= 2) {
                            var20 = var24.method2128();
                            if (var27 == 1) {
                                var21 = var24.method2128();
                            }
                        } else {
                            var20 = var24.method2194();
                            if (var27 == 1) {
                                var21 = var24.method2194();
                            }
                        }
                        var23.method3383();
                    } catch (IOException var69) {
                        var69.printStackTrace();
                    }
                    if (var20 != null) {
                        File var29 = new File(var20);
                        if (!var29.exists()) {
                            var20 = null;
                        }
                    }
                    if (var20 != null) {
                        File var30 = new File(var20, "test.dat");
                        if (!class136.method566(var30, true)) {
                            var20 = null;
                        }
                    }
                }
                if (var20 == null && var18 == 0) {
                    label272: for (int var31 = 0; var31 < Statics.field1350.length; var31++) {
                        for (int var32 = 0; var32 < Statics.field248.length; var32++) {
                            File var33 = new File(Statics.field248[var32] + Statics.field1350[var31] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var33.exists() && class136.method566(new File(var33, "test.dat"), true)) {
                                var20 = var33.toString();
                                var22 = true;
                                break label272;
                            }
                        }
                    }
                }
                if (var20 == null) {
                    var20 = Statics.field2062 + File.separatorChar + "jagexcache" + var19 + File.separatorChar + "oldschool" + File.separatorChar + var13 + File.separatorChar;
                    var22 = true;
                }
                if (var21 != null) {
                    File var34 = new File(var21);
                    File var35 = new File(var20);
                    try {
                        File[] var36 = var34.listFiles();
                        File[] var37 = var36;
                        for (int var38 = 0; var38 < var37.length; var38++) {
                            File var39 = var37[var38];
                            File var40 = new File(var35, var39.getName());
                            boolean var41 = var39.renameTo(var40);
                            if (!var41) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var68) {
                        var68.printStackTrace();
                    }
                    var22 = true;
                }
                if (var22) {
                    File var43 = new File(var20);
                    Object var44 = null;
                    try {
                        class195 var45 = new class195(Statics.field2053, "rw", 10000L);
                        class107 var46 = new class107(500);
                        var46.method2168(3);
                        var46.method2168(var44 == null ? 0 : 1);
                        var46.method2111(var43.getPath());
                        if (var44 != null) {
                            var46.method2111(((File) var44).getPath());
                        }
                        var45.method3382(var46.field1826, 0, var46.field1827);
                        var45.method3383();
                    } catch (IOException var63) {
                        var63.printStackTrace();
                    }
                }
                File var48 = new File(var20);
                Statics.field2955 = var48;
                if (!Statics.field2955.exists()) {
                    Statics.field2955.mkdirs();
                }
                File[] var49 = Statics.field2955.listFiles();
                if (var49 != null) {
                    File[] var50 = var49;
                    for (int var51 = 0; var51 < var50.length; var51++) {
                        File var52 = var50[var51];
                        if (!class136.method566(var52, false)) {
                            var18++;
                            continue label298;
                        }
                    }
                }
                break;
            }
            File var53 = Statics.field2955;
            Statics.field1918 = var53;
            if (!Statics.field1918.exists()) {
                throw new RuntimeException("");
            }
            class122.field1919 = true;
            try {
                File var54 = new File(Statics.field2062, "random.dat");
                if (var54.exists()) {
                    class136.field2057 = new class196(new class195(var54, "rw", 25L), 24, 0);
                } else {
                    label221: for (int var55 = 0; var55 < Statics.field1350.length; var55++) {
                        for (int var56 = 0; var56 < Statics.field248.length; var56++) {
                            File var57 = new File(Statics.field248[var56] + Statics.field1350[var55] + File.separatorChar + "random.dat");
                            if (var57.exists()) {
                                class136.field2057 = new class196(new class195(var57, "rw", 25L), 24, 0);
                                break label221;
                            }
                        }
                    }
                }
                if (class136.field2057 == null) {
                    RandomAccessFile var58 = new RandomAccessFile(var54, "rw");
                    int var59 = var58.read();
                    var58.seek(0L);
                    var58.write(var59);
                    var58.seek(0L);
                    var58.close();
                    class136.field2057 = new class196(new class195(var54, "rw", 25L), 24, 0);
                }
            } catch (IOException var67) {
            }
            class136.field2064 = new class196(new class195(class122.method29("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class136.field2059 = new class196(new class195(class122.method29("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field164 = new class196[Statics.field2054];
            for (int var61 = 0; var61 < Statics.field2054; var61++) {
                Statics.field164[var61] = new class196(new class195(class122.method29("main_file_cache.idx" + var61), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var70) {
            class135.method1362((String) null, var70);
        }
        Statics.field250 = this;
        this.method2583(765, 503, 55);
    }

    @ObfuscatedName("ed.c(I)V")
    public static final void method2650() {
        class79.field1410 = false;
        field258 = false;
    }

    @ObfuscatedName("client.y(B)V")
    public final void method165() {
        Statics.field943 = field254 == 0 ? 43594 : field311 + 40000;
        Statics.field621 = field254 == 0 ? 443 : field311 + 50000;
        Statics.field123 = Statics.field943;
        Statics.field2668 = class153.field2639;
        Statics.field2665 = class153.field2633;
        Statics.field64 = class153.field2634;
        Statics.field1880 = class153.field2638;
        class124.method457();
        class124.method1769(Statics.field2015);
        class127.method2394(Statics.field2015);
        Statics.field211 = class118.method780();
        if (Statics.field211 != null) {
            Statics.field211.method2402(Statics.field2015);
        }
        Statics.field887 = new class121(255, class136.field2064, class136.field2059, 500000);
        Statics.field1998 = class9.method1876();
        Statics.field17 = this.getToolkit().getSystemClipboard();
        class125.method1962(this, Statics.field680);
        if (field254 != 0) {
            field406 = true;
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method198() {
        field274++;
        this.method168();
        class149.method2653();
        class161.method636();
        method2848();
        class124 var1 = class124.field1957;
        synchronized (class124.field1957) {
            class124.field1960++;
            class124.field1950 = class124.field1959;
            class124.field1956 = 0;
            if (class124.field1948 >= 0) {
                while (class124.field1951 != class124.field1948) {
                    int var3 = class124.field1937[class124.field1951];
                    class124.field1951 = class124.field1951 + 1 & 0x7F;
                    if (var3 < 0) {
                        class124.field1949[~var3] = false;
                    } else {
                        if (!class124.field1949[var3] && class124.field1956 < class124.field1955.length - 1) {
                            class124.field1955[++class124.field1956 - 1] = var3;
                        }
                        class124.field1949[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class124.field1949[var2] = false;
                }
                class124.field1948 = class124.field1951;
            }
            class124.field1959 = class124.field1958;
        }
        class127.method3089();
        if (Statics.field211 != null) {
            int var5 = Statics.field211.method2405();
            field451 = var5;
        }
        int var10002;
        if (field260 == 0) {
            method499();
            Statics.field1654.method2427();
            for (int var6 = 0; var6 < 32; var6++) {
                field2023[var6] = 0L;
            }
            for (int var7 = 0; var7 < 32; var7++) {
                field2017[var7] = 0L;
            }
            Statics.field1266 = 0;
        } else if (field260 == 5) {
            class28.method149(this);
            method499();
            Statics.field1654.method2427();
            for (int var8 = 0; var8 < 32; var8++) {
                field2023[var8] = 0L;
            }
            for (int var9 = 0; var9 < 32; var9++) {
                field2017[var9] = 0L;
            }
            Statics.field1266 = 0;
        } else if (field260 == 10 || field260 == 11) {
            class28.method149(this);
        } else if (field260 == 20) {
            class28.method149(this);
            method109();
        } else if (field260 == 25) {
            method152(false);
            field306 = 0;
            boolean var10 = true;
            for (int var11 = 0; var11 < Statics.field1287.length; var11++) {
                if (Statics.field2386[var11] != -1 && Statics.field1287[var11] == null) {
                    Statics.field1287[var11] = Statics.field1795.method2668(Statics.field2386[var11], 0);
                    if (Statics.field1287[var11] == null) {
                        var10 = false;
                        field306++;
                    }
                }
                if (Statics.field1647[var11] != -1 && Statics.field89[var11] == null) {
                    Statics.field89[var11] = Statics.field1795.method2669(Statics.field1647[var11], 0, Statics.field2498[var11]);
                    if (Statics.field89[var11] == null) {
                        var10 = false;
                        field306++;
                    }
                }
            }
            if (var10) {
                field308 = 0;
                boolean var12 = true;
                for (int var13 = 0; var13 < Statics.field1287.length; var13++) {
                    byte[] var14 = Statics.field89[var13];
                    if (var14 != null) {
                        int var15 = (Statics.field518[var13] >> 8) * 64 - Statics.field304;
                        int var16 = (Statics.field518[var13] & 0xFF) * 64 - Statics.field671;
                        if (field313) {
                            var15 = 10;
                            var16 = 10;
                        }
                        var12 &= class6.method1860(var14, var15, var16);
                    }
                }
                if (var12) {
                    if (field399 != 0) {
                        method2856(class142.field2311 + class2.field28 + class2.field19 + 100 + "%" + class2.field20, true);
                    }
                    method2848();
                    method31();
                    method2848();
                    Statics.field336.method1591();
                    method2848();
                    System.gc();
                    for (int var17 = 0; var17 < 4; var17++) {
                        field318[var17].method3425();
                    }
                    for (int var18 = 0; var18 < 4; var18++) {
                        for (int var19 = 0; var19 < 104; var19++) {
                            for (int var20 = 0; var20 < 104; var20++) {
                                class6.field71[var18][var19][var20] = 0;
                            }
                        }
                    }
                    method2848();
                    class6.method2579();
                    int var21 = Statics.field1287.length;
                    for (class20 var22 = (class20) class20.field542.method3170(); var22 != null; var22 = (class20) class20.field542.method3172()) {
                        if (var22.field540 != null) {
                            Statics.field585.method936(var22.field540);
                            var22.field540 = null;
                        }
                        if (var22.field541 != null) {
                            Statics.field585.method936(var22.field541);
                            var22.field541 = null;
                        }
                    }
                    class20.field542.method3174();
                    method152(true);
                    if (!field313) {
                        int var23 = 0;
                        label2568: while (true) {
                            if (var23 >= var21) {
                                for (int var37 = 0; var37 < var21; var37++) {
                                    int var38 = (Statics.field518[var37] >> 8) * 64 - Statics.field304;
                                    int var39 = (Statics.field518[var37] & 0xFF) * 64 - Statics.field671;
                                    byte[] var40 = Statics.field1287[var37];
                                    if (var40 == null && Statics.field873 < 800) {
                                        method2848();
                                        class6.method153(var38, var39, 64, 64);
                                    }
                                }
                                method152(true);
                                int var41 = 0;
                                while (true) {
                                    if (var41 >= var21) {
                                        break label2568;
                                    }
                                    byte[] var42 = Statics.field89[var41];
                                    if (var42 != null) {
                                        int var43 = (Statics.field518[var41] >> 8) * 64 - Statics.field304;
                                        int var44 = (Statics.field518[var41] & 0xFF) * 64 - Statics.field671;
                                        method2848();
                                        class79 var45 = Statics.field336;
                                        class197[] var46 = field318;
                                        class107 var47 = new class107(var42);
                                        int var48 = -1;
                                        while (true) {
                                            int var49 = var47.method2198();
                                            if (var49 == 0) {
                                                break;
                                            }
                                            var48 += var49;
                                            int var50 = 0;
                                            while (true) {
                                                int var51 = var47.method2198();
                                                if (var51 == 0) {
                                                    break;
                                                }
                                                var50 += var51 - 1;
                                                int var52 = var50 & 0x3F;
                                                int var53 = var50 >> 6 & 0x3F;
                                                int var54 = var50 >> 12;
                                                int var55 = var47.method2118();
                                                int var56 = var55 >> 2;
                                                int var57 = var55 & 0x3;
                                                int var58 = var43 + var53;
                                                int var59 = var44 + var52;
                                                if (var58 > 0 && var59 > 0 && var58 < 103 && var59 < 103) {
                                                    int var60 = var54;
                                                    if ((class6.field71[1][var58][var59] & 0x2) == 2) {
                                                        var60 = var54 - 1;
                                                    }
                                                    class197 var61 = null;
                                                    if (var60 >= 0) {
                                                        var61 = var46[var60];
                                                    }
                                                    class6.method524(var54, var58, var59, var48, var57, var56, var45, var61);
                                                }
                                            }
                                        }
                                    }
                                    var41++;
                                }
                            }
                            int var24 = (Statics.field518[var23] >> 8) * 64 - Statics.field304;
                            int var25 = (Statics.field518[var23] & 0xFF) * 64 - Statics.field671;
                            byte[] var26 = Statics.field1287[var23];
                            if (var26 != null) {
                                method2848();
                                int var27 = Statics.field1916 * 8 - 48;
                                int var28 = Statics.field873 * 8 - 48;
                                class197[] var29 = field318;
                                int var30 = 0;
                                label2565: while (true) {
                                    if (var30 >= 4) {
                                        class107 var33 = new class107(var26);
                                        int var34 = 0;
                                        while (true) {
                                            if (var34 >= 4) {
                                                break label2565;
                                            }
                                            for (int var35 = 0; var35 < 64; var35++) {
                                                for (int var36 = 0; var36 < 64; var36++) {
                                                    class6.method1588(var33, var34, var24 + var35, var25 + var36, var27, var28, 0);
                                                }
                                            }
                                            var34++;
                                        }
                                    }
                                    for (int var31 = 0; var31 < 64; var31++) {
                                        for (int var32 = 0; var32 < 64; var32++) {
                                            if (var24 + var31 > 0 && var24 + var31 < 103 && var25 + var32 > 0 && var25 + var32 < 103) {
                                                var29[var30].field2942[var24 + var31][var25 + var32] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var30++;
                                }
                            }
                            var23++;
                        }
                    }
                    if (field313) {
                        int var62 = 0;
                        label2501: while (true) {
                            if (var62 >= 4) {
                                for (int var109 = 0; var109 < 13; var109++) {
                                    for (int var110 = 0; var110 < 13; var110++) {
                                        int var111 = field426[0][var109][var110];
                                        if (var111 == -1) {
                                            class6.method153(var109 * 8, var110 * 8, 8, 8);
                                        }
                                    }
                                }
                                method152(true);
                                int var112 = 0;
                                while (true) {
                                    if (var112 >= 4) {
                                        break label2501;
                                    }
                                    method2848();
                                    for (int var113 = 0; var113 < 13; var113++) {
                                        for (int var114 = 0; var114 < 13; var114++) {
                                            int var115 = field426[var112][var113][var114];
                                            if (var115 != -1) {
                                                int var116 = var115 >> 24 & 0x3;
                                                int var117 = var115 >> 1 & 0x3;
                                                int var118 = var115 >> 14 & 0x3FF;
                                                int var119 = var115 >> 3 & 0x7FF;
                                                int var120 = (var118 / 8 << 8) + var119 / 8;
                                                for (int var121 = 0; var121 < Statics.field518.length; var121++) {
                                                    if (Statics.field518[var121] == var120 && Statics.field89[var121] != null) {
                                                        class6.method27(Statics.field89[var121], var112, var113 * 8, var114 * 8, var116, (var118 & 0x7) * 8, (var119 & 0x7) * 8, var117, Statics.field336, field318);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var112++;
                                }
                            }
                            method2848();
                            for (int var63 = 0; var63 < 13; var63++) {
                                for (int var64 = 0; var64 < 13; var64++) {
                                    boolean var65 = false;
                                    int var66 = field426[var62][var63][var64];
                                    if (var66 != -1) {
                                        int var67 = var66 >> 24 & 0x3;
                                        int var68 = var66 >> 1 & 0x3;
                                        int var69 = var66 >> 14 & 0x3FF;
                                        int var70 = var66 >> 3 & 0x7FF;
                                        int var71 = (var69 / 8 << 8) + var70 / 8;
                                        for (int var72 = 0; var72 < Statics.field518.length; var72++) {
                                            if (Statics.field518[var72] == var71 && Statics.field1287[var72] != null) {
                                                byte[] var73 = Statics.field1287[var72];
                                                int var74 = var63 * 8;
                                                int var75 = var64 * 8;
                                                int var76 = (var69 & 0x7) * 8;
                                                int var77 = (var70 & 0x7) * 8;
                                                class197[] var78 = field318;
                                                for (int var79 = 0; var79 < 8; var79++) {
                                                    for (int var80 = 0; var80 < 8; var80++) {
                                                        if (var74 + var79 > 0 && var74 + var79 < 103 && var75 + var80 > 0 && var75 + var80 < 103) {
                                                            var78[var62].field2942[var74 + var79][var75 + var80] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class107 var81 = new class107(var73);
                                                for (int var82 = 0; var82 < 4; var82++) {
                                                    for (int var83 = 0; var83 < 64; var83++) {
                                                        for (int var84 = 0; var84 < 64; var84++) {
                                                            if (var67 == var82 && var83 >= var76 && var83 < var76 + 8 && var84 >= var77 && var84 < var77 + 8) {
                                                                int var88 = var83 & 0x7;
                                                                int var89 = var84 & 0x7;
                                                                int var91 = var68 & 0x3;
                                                                int var92;
                                                                if (var91 == 0) {
                                                                    var92 = var88;
                                                                } else if (var91 == 1) {
                                                                    var92 = var89;
                                                                } else if (var91 == 2) {
                                                                    var92 = 7 - var88;
                                                                } else {
                                                                    var92 = 7 - var89;
                                                                }
                                                                int var95 = var74 + var92;
                                                                int var97 = var83 & 0x7;
                                                                int var98 = var84 & 0x7;
                                                                int var100 = var68 & 0x3;
                                                                int var101;
                                                                if (var100 == 0) {
                                                                    var101 = var98;
                                                                } else if (var100 == 1) {
                                                                    var101 = 7 - var97;
                                                                } else if (var100 == 2) {
                                                                    var101 = 7 - var98;
                                                                } else {
                                                                    var101 = var97;
                                                                }
                                                                class6.method1588(var81, var62, var95, var75 + var101, 0, 0, var68);
                                                            } else {
                                                                class6.method1588(var81, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var65 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var65) {
                                        int var102 = var62;
                                        int var103 = var63 * 8;
                                        int var104 = var64 * 8;
                                        for (int var105 = 0; var105 < 8; var105++) {
                                            for (int var106 = 0; var106 < 8; var106++) {
                                                class6.field82[var102][var103 + var105][var104 + var106] = 0;
                                            }
                                        }
                                        if (var103 > 0) {
                                            for (int var107 = 1; var107 < 8; var107++) {
                                                class6.field82[var102][var103][var104 + var107] = class6.field82[var102][var103 - 1][var104 + var107];
                                            }
                                        }
                                        if (var104 > 0) {
                                            for (int var108 = 1; var108 < 8; var108++) {
                                                class6.field82[var102][var103 + var108][var104] = class6.field82[var102][var103 + var108][var104 - 1];
                                            }
                                        }
                                        if (var103 > 0 && class6.field82[var102][var103 - 1][var104] != 0) {
                                            class6.field82[var102][var103][var104] = class6.field82[var102][var103 - 1][var104];
                                        } else if (var104 > 0 && class6.field82[var102][var103][var104 - 1] != 0) {
                                            class6.field82[var102][var103][var104] = class6.field82[var102][var103][var104 - 1];
                                        } else if (var103 > 0 && var104 > 0 && class6.field82[var102][var103 - 1][var104 - 1] != 0) {
                                            class6.field82[var102][var103][var104] = class6.field82[var102][var103 - 1][var104 - 1];
                                        }
                                    }
                                }
                            }
                            var62++;
                        }
                    }
                    method152(true);
                    method31();
                    method2848();
                    class79 var122 = Statics.field336;
                    class197[] var123 = field318;
                    for (int var124 = 0; var124 < 4; var124++) {
                        for (int var125 = 0; var125 < 104; var125++) {
                            for (int var126 = 0; var126 < 104; var126++) {
                                if ((class6.field71[var124][var125][var126] & 0x1) == 1) {
                                    int var127 = var124;
                                    if ((class6.field71[1][var125][var126] & 0x2) == 2) {
                                        var127 = var124 - 1;
                                    }
                                    if (var127 >= 0) {
                                        var123[var127].method3445(var125, var126);
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
                    class6.field86 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field86 < -16) {
                        class6.field86 = -16;
                    }
                    if (class6.field86 > 16) {
                        class6.field86 = 16;
                    }
                    for (int var128 = 0; var128 < 4; var128++) {
                        byte[][] var129 = Statics.field1877[var128];
                        int var130 = (int) Math.sqrt(5100.0D);
                        int var131 = var130 * 768 >> 8;
                        for (int var132 = 1; var132 < 103; var132++) {
                            for (int var133 = 1; var133 < 103; var133++) {
                                int var134 = class6.field82[var128][var133 + 1][var132] - class6.field82[var128][var133 - 1][var132];
                                int var135 = class6.field82[var128][var133][var132 + 1] - class6.field82[var128][var133][var132 - 1];
                                int var136 = (int) Math.sqrt((double) (var135 * var135 + var134 * var134 + 65536));
                                int var137 = (var134 << 8) / var136;
                                int var138 = 65536 / var136;
                                int var139 = (var135 << 8) / var136;
                                int var140 = (var139 * -50 + var137 * -50 + var138 * -10) / var131 + 96;
                                int var141 = (var129[var133][var132] >> 1) + (var129[var133][var132 + 1] >> 3) + (var129[var133][var132 - 1] >> 2) + (var129[var133 - 1][var132] >> 2) + (var129[var133 + 1][var132] >> 3);
                                Statics.field94[var133][var132] = var140 - var141;
                            }
                        }
                        for (int var142 = 0; var142 < 104; var142++) {
                            Statics.field1911[var142] = 0;
                            Statics.field1900[var142] = 0;
                            Statics.field144[var142] = 0;
                            Statics.field78[var142] = 0;
                            Statics.field57[var142] = 0;
                        }
                        for (int var143 = -5; var143 < 109; var143++) {
                            for (int var144 = 0; var144 < 104; var144++) {
                                int var145 = var143 + 5;
                                if (var145 >= 0 && var145 < 104) {
                                    int var146 = Statics.field77[var128][var145][var144] & 0xFF;
                                    if (var146 > 0) {
                                        class37 var147 = class37.method568(var146 - 1);
                                        Statics.field1911[var144] += var147.field883;
                                        Statics.field1900[var144] += var147.field884;
                                        Statics.field144[var144] += var147.field885;
                                        Statics.field78[var144] += var147.field888;
                                        var10002 = Statics.field57[var144]++;
                                    }
                                }
                                int var148 = var143 - 5;
                                if (var148 >= 0 && var148 < 104) {
                                    int var149 = Statics.field77[var128][var148][var144] & 0xFF;
                                    if (var149 > 0) {
                                        class37 var150 = class37.method568(var149 - 1);
                                        Statics.field1911[var144] -= var150.field883;
                                        Statics.field1900[var144] -= var150.field884;
                                        Statics.field144[var144] -= var150.field885;
                                        Statics.field78[var144] -= var150.field888;
                                        var10002 = Statics.field57[var144]--;
                                    }
                                }
                            }
                            if (var143 >= 1 && var143 < 103) {
                                int var151 = 0;
                                int var152 = 0;
                                int var153 = 0;
                                int var154 = 0;
                                int var155 = 0;
                                for (int var156 = -5; var156 < 109; var156++) {
                                    int var157 = var156 + 5;
                                    if (var157 >= 0 && var157 < 104) {
                                        var151 += Statics.field1911[var157];
                                        var152 += Statics.field1900[var157];
                                        var153 += Statics.field144[var157];
                                        var154 += Statics.field78[var157];
                                        var155 += Statics.field57[var157];
                                    }
                                    int var158 = var156 - 5;
                                    if (var158 >= 0 && var158 < 104) {
                                        var151 -= Statics.field1911[var158];
                                        var152 -= Statics.field1900[var158];
                                        var153 -= Statics.field144[var158];
                                        var154 -= Statics.field78[var158];
                                        var155 -= Statics.field57[var158];
                                    }
                                    if (var156 >= 1 && var156 < 103) {
                                        if (field258 && (class6.field71[0][var143][var156] & 0x2) == 0) {
                                            if ((class6.field71[var128][var143][var156] & 0x10) != 0) {
                                                continue;
                                            }
                                            int var159;
                                            if ((class6.field71[var128][var143][var156] & 0x8) != 0) {
                                                var159 = 0;
                                            } else if (var128 <= 0 || (class6.field71[1][var143][var156] & 0x2) == 0) {
                                                var159 = var128;
                                            } else {
                                                var159 = var128 - 1;
                                            }
                                            if (field305 != var159) {
                                                continue;
                                            }
                                        }
                                        if (var128 < class6.field88) {
                                            class6.field88 = var128;
                                        }
                                        int var160 = Statics.field77[var128][var143][var156] & 0xFF;
                                        int var161 = Statics.field74[var128][var143][var156] & 0xFF;
                                        if (var160 > 0 || var161 > 0) {
                                            int var162 = class6.field82[var128][var143][var156];
                                            int var163 = class6.field82[var128][var143 + 1][var156];
                                            int var164 = class6.field82[var128][var143 + 1][var156 + 1];
                                            int var165 = class6.field82[var128][var143][var156 + 1];
                                            int var166 = Statics.field94[var143][var156];
                                            int var167 = Statics.field94[var143 + 1][var156];
                                            int var168 = Statics.field94[var143 + 1][var156 + 1];
                                            int var169 = Statics.field94[var143][var156 + 1];
                                            int var170 = -1;
                                            int var171 = -1;
                                            if (var160 > 0) {
                                                int var172 = var151 * 256 / var154;
                                                int var173 = var152 / var155;
                                                int var174 = var153 / var155;
                                                var170 = class6.method461(var172, var173, var174);
                                                int var175 = class6.field72 + var172 & 0xFF;
                                                int var176 = class6.field86 + var174;
                                                if (var176 < 0) {
                                                    var176 = 0;
                                                } else if (var176 > 255) {
                                                    var176 = 255;
                                                }
                                                var171 = class6.method461(var175, var173, var176);
                                            }
                                            if (var128 > 0) {
                                                boolean var177 = true;
                                                if (var160 == 0 && Statics.field75[var128][var143][var156] != 0) {
                                                    var177 = false;
                                                }
                                                if (var161 > 0) {
                                                    int var178 = var161 - 1;
                                                    class41 var179 = (class41) class41.field961.method3099((long) var178);
                                                    class41 var180;
                                                    if (var179 == null) {
                                                        byte[] var181 = Statics.field959.method2668(4, var178);
                                                        class41 var182 = new class41();
                                                        if (var181 != null) {
                                                            var182.method787(new class107(var181), var178);
                                                        }
                                                        var182.method799();
                                                        class41.field961.method3101(var182, (long) var178);
                                                        var180 = var182;
                                                    } else {
                                                        var180 = var179;
                                                    }
                                                    if (!var180.field954) {
                                                        var177 = false;
                                                    }
                                                }
                                                if (var177 && var162 == var163 && var162 == var164 && var162 == var165) {
                                                    Statics.field2049[var128][var143][var156] |= 0x924;
                                                }
                                            }
                                            int var183 = 0;
                                            if (var171 != -1) {
                                                var183 = class84.field1473[class6.method2072(var171, 96)];
                                            }
                                            if (var161 == 0) {
                                                var122.method1596(var128, var143, var156, 0, 0, -1, var162, var163, var164, var165, class6.method2072(var170, var166), class6.method2072(var170, var167), class6.method2072(var170, var168), class6.method2072(var170, var169), 0, 0, 0, 0, var183, 0);
                                            } else {
                                                int var184 = Statics.field75[var128][var143][var156] + 1;
                                                byte var185 = Statics.field73[var128][var143][var156];
                                                int var186 = var161 - 1;
                                                class41 var187 = (class41) class41.field961.method3099((long) var186);
                                                class41 var188;
                                                if (var187 == null) {
                                                    byte[] var189 = Statics.field959.method2668(4, var186);
                                                    class41 var190 = new class41();
                                                    if (var189 != null) {
                                                        var190.method787(new class107(var189), var186);
                                                    }
                                                    var190.method799();
                                                    class41.field961.method3101(var190, (long) var186);
                                                    var188 = var190;
                                                } else {
                                                    var188 = var187;
                                                }
                                                int var192 = var188.field953;
                                                int var193;
                                                int var194;
                                                if (var192 >= 0) {
                                                    var193 = Statics.field1466.method1837(var192);
                                                    var194 = -1;
                                                } else if (var188.field952 == 16711935) {
                                                    var194 = -2;
                                                    var192 = -1;
                                                    var193 = -2;
                                                } else {
                                                    var194 = class6.method461(var188.field956, var188.field957, var188.field958);
                                                    int var195 = class6.field72 + var188.field956 & 0xFF;
                                                    int var196 = class6.field86 + var188.field958;
                                                    if (var196 < 0) {
                                                        var196 = 0;
                                                    } else if (var196 > 255) {
                                                        var196 = 255;
                                                    }
                                                    var193 = class6.method461(var195, var188.field957, var196);
                                                }
                                                int var197 = 0;
                                                if (var193 != -2) {
                                                    var197 = class84.field1473[class6.method1853(var193, 96)];
                                                }
                                                if (var188.field962 != -1) {
                                                    int var198 = class6.field72 + var188.field960 & 0xFF;
                                                    int var199 = class6.field86 + var188.field950;
                                                    if (var199 < 0) {
                                                        var199 = 0;
                                                    } else if (var199 > 255) {
                                                        var199 = 255;
                                                    }
                                                    int var200 = class6.method461(var198, var188.field951, var199);
                                                    var197 = class84.field1473[class6.method1853(var200, 96)];
                                                }
                                                var122.method1596(var128, var143, var156, var184, var185, var192, var162, var163, var164, var165, class6.method2072(var170, var166), class6.method2072(var170, var167), class6.method2072(var170, var168), class6.method2072(var170, var169), class6.method1853(var194, var166), class6.method1853(var194, var167), class6.method1853(var194, var168), class6.method1853(var194, var169), var183, var197);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var201 = 1; var201 < 103; var201++) {
                            for (int var202 = 1; var202 < 103; var202++) {
                                var122.method1595(var128, var202, var201, class6.method2448(var128, var202, var201));
                            }
                        }
                        Statics.field77[var128] = (byte[][]) null;
                        Statics.field74[var128] = (byte[][]) null;
                        Statics.field75[var128] = (byte[][]) null;
                        Statics.field73[var128] = (byte[][]) null;
                        Statics.field1877[var128] = (byte[][]) null;
                    }
                    var122.method1622(-50, -10, -50);
                    for (int var203 = 0; var203 < 104; var203++) {
                        for (int var204 = 0; var204 < 104; var204++) {
                            if ((class6.field71[1][var203][var204] & 0x2) == 2) {
                                var122.method1631(var203, var204);
                            }
                        }
                    }
                    int var205 = 1;
                    int var206 = 2;
                    int var207 = 4;
                    for (int var208 = 0; var208 < 4; var208++) {
                        if (var208 > 0) {
                            var205 <<= 0x3;
                            var206 <<= 0x3;
                            var207 <<= 0x3;
                        }
                        for (int var209 = 0; var209 <= var208; var209++) {
                            for (int var210 = 0; var210 <= 104; var210++) {
                                for (int var211 = 0; var211 <= 104; var211++) {
                                    if ((Statics.field2049[var209][var211][var210] & var205) != 0) {
                                        int var212 = var210;
                                        int var213 = var210;
                                        int var214 = var209;
                                        int var215 = var209;
                                        while (var212 > 0 && (Statics.field2049[var209][var211][var212 - 1] & var205) != 0) {
                                            var212--;
                                        }
                                        while (var213 < 104 && (Statics.field2049[var209][var211][var213 + 1] & var205) != 0) {
                                            var213++;
                                        }
                                        label2116: while (var214 > 0) {
                                            for (int var216 = var212; var216 <= var213; var216++) {
                                                if ((Statics.field2049[var214 - 1][var211][var216] & var205) == 0) {
                                                    break label2116;
                                                }
                                            }
                                            var214--;
                                        }
                                        label2105: while (var215 < var208) {
                                            for (int var217 = var212; var217 <= var213; var217++) {
                                                if ((Statics.field2049[var215 + 1][var211][var217] & var205) == 0) {
                                                    break label2105;
                                                }
                                            }
                                            var215++;
                                        }
                                        int var218 = (var215 + 1 - var214) * (var213 - var212 + 1);
                                        if (var218 >= 8) {
                                            short var219 = 240;
                                            int var220 = class6.field82[var215][var211][var212] - var219;
                                            int var221 = class6.field82[var214][var211][var212];
                                            class79.method1594(var208, 1, var211 * 128, var211 * 128, var212 * 128, var213 * 128 + 128, var220, var221);
                                            for (int var222 = var214; var222 <= var215; var222++) {
                                                for (int var223 = var212; var223 <= var213; var223++) {
                                                    Statics.field2049[var222][var211][var223] &= ~var205;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field2049[var209][var211][var210] & var206) != 0) {
                                        int var224 = var211;
                                        int var225 = var211;
                                        int var226 = var209;
                                        int var227 = var209;
                                        while (var224 > 0 && (Statics.field2049[var209][var224 - 1][var210] & var206) != 0) {
                                            var224--;
                                        }
                                        while (var225 < 104 && (Statics.field2049[var209][var225 + 1][var210] & var206) != 0) {
                                            var225++;
                                        }
                                        label2169: while (var226 > 0) {
                                            for (int var228 = var224; var228 <= var225; var228++) {
                                                if ((Statics.field2049[var226 - 1][var228][var210] & var206) == 0) {
                                                    break label2169;
                                                }
                                            }
                                            var226--;
                                        }
                                        label2158: while (var227 < var208) {
                                            for (int var229 = var224; var229 <= var225; var229++) {
                                                if ((Statics.field2049[var227 + 1][var229][var210] & var206) == 0) {
                                                    break label2158;
                                                }
                                            }
                                            var227++;
                                        }
                                        int var230 = (var227 + 1 - var226) * (var225 - var224 + 1);
                                        if (var230 >= 8) {
                                            short var231 = 240;
                                            int var232 = class6.field82[var227][var224][var210] - var231;
                                            int var233 = class6.field82[var226][var224][var210];
                                            class79.method1594(var208, 2, var224 * 128, var225 * 128 + 128, var210 * 128, var210 * 128, var232, var233);
                                            for (int var234 = var226; var234 <= var227; var234++) {
                                                for (int var235 = var224; var235 <= var225; var235++) {
                                                    Statics.field2049[var234][var235][var210] &= ~var206;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field2049[var209][var211][var210] & var207) != 0) {
                                        int var236 = var211;
                                        int var237 = var211;
                                        int var238 = var210;
                                        int var239 = var210;
                                        while (var238 > 0 && (Statics.field2049[var209][var211][var238 - 1] & var207) != 0) {
                                            var238--;
                                        }
                                        while (var239 < 104 && (Statics.field2049[var209][var211][var239 + 1] & var207) != 0) {
                                            var239++;
                                        }
                                        label2222: while (var236 > 0) {
                                            for (int var240 = var238; var240 <= var239; var240++) {
                                                if ((Statics.field2049[var209][var236 - 1][var240] & var207) == 0) {
                                                    break label2222;
                                                }
                                            }
                                            var236--;
                                        }
                                        label2211: while (var237 < 104) {
                                            for (int var241 = var238; var241 <= var239; var241++) {
                                                if ((Statics.field2049[var209][var237 + 1][var241] & var207) == 0) {
                                                    break label2211;
                                                }
                                            }
                                            var237++;
                                        }
                                        if ((var237 - var236 + 1) * (var239 - var238 + 1) >= 4) {
                                            int var242 = class6.field82[var209][var236][var238];
                                            class79.method1594(var208, 4, var236 * 128, var237 * 128 + 128, var238 * 128, var239 * 128 + 128, var242, var242);
                                            for (int var243 = var236; var243 <= var237; var243++) {
                                                for (int var244 = var238; var244 <= var239; var244++) {
                                                    Statics.field2049[var209][var243][var244] &= ~var207;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method152(true);
                    int var245 = class6.field88;
                    if (var245 > Statics.field221) {
                        var245 = Statics.field221;
                    }
                    if (var245 < Statics.field221 - 1) {
                        int var246 = Statics.field221 - 1;
                    }
                    if (field258) {
                        Statics.field336.method1592(class6.field88);
                    } else {
                        Statics.field336.method1592(0);
                    }
                    for (int var247 = 0; var247 < 104; var247++) {
                        for (int var248 = 0; var248 < 104; var248++) {
                            method34(var247, var248);
                        }
                    }
                    method2848();
                    for (class15 var249 = (class15) field388.method3170(); var249 != null; var249 = (class15) field388.method3172()) {
                        if (var249.field207 == -1) {
                            var249.field218 = 0;
                            method638(var249);
                        } else {
                            var249.method3261();
                        }
                    }
                    class36.field828.method3104();
                    if (Statics.field1829 != null) {
                        field460.method2339(237);
                        field460.method2174(1057001181);
                    }
                    if (!field313) {
                        int var250 = (Statics.field1916 - 6) / 8;
                        int var251 = (Statics.field1916 + 6) / 8;
                        int var252 = (Statics.field873 - 6) / 8;
                        int var253 = (Statics.field873 + 6) / 8;
                        for (int var254 = var250 - 1; var254 <= var251 + 1; var254++) {
                            for (int var255 = var252 - 1; var255 <= var253 + 1; var255++) {
                                if (var254 < var250 || var254 > var251 || var255 < var252 || var255 > var253) {
                                    Statics.field1795.method2687("m" + var254 + "_" + var255);
                                    Statics.field1795.method2687("l" + var254 + "_" + var255);
                                }
                            }
                        }
                    }
                    method482(30);
                    method2848();
                    Statics.field77 = (byte[][][]) null;
                    Statics.field74 = (byte[][][]) null;
                    Statics.field75 = (byte[][][]) null;
                    Statics.field73 = (byte[][][]) null;
                    Statics.field2049 = (int[][][]) null;
                    Statics.field1877 = (byte[][][]) null;
                    Statics.field94 = (int[][]) null;
                    Statics.field1911 = null;
                    Statics.field1900 = null;
                    Statics.field144 = null;
                    Statics.field78 = null;
                    Statics.field57 = null;
                    field460.method2339(144);
                    Statics.field1654.method2427();
                    for (int var256 = 0; var256 < 32; var256++) {
                        field2023[var256] = 0L;
                    }
                    for (int var257 = 0; var257 < 32; var257++) {
                        field2017[var257] = 0L;
                    }
                    Statics.field1266 = 0;
                } else {
                    field399 = 2;
                }
            } else {
                field399 = 1;
            }
        }
        if (field260 == 30) {
            if (field252 > 1) {
                field252--;
            }
            if (field299 > 0) {
                field299--;
            }
            if (field314) {
                field314 = false;
                method2655();
            } else {
                if (!field395) {
                    field401[0] = class142.field2354;
                    field446[0] = "";
                    field280[0] = 1006;
                    field358 = 1;
                }
                for (int var258 = 0; var258 < 100 && method1305(); var258++) {
                }
                if (field260 == 30) {
                    while (true) {
                        class188 var259 = (class188) class189.field2878.method3222();
                        boolean var260;
                        if (var259 == null) {
                            var260 = false;
                        } else {
                            var260 = true;
                        }
                        if (!var260) {
                            Object var262 = Statics.field24.field181;
                            synchronized (Statics.field24.field181) {
                                if (!field251) {
                                    Statics.field24.field175 = 0;
                                } else if (class127.field1975 != 0 || Statics.field24.field175 >= 40) {
                                    field460.method2339(174);
                                    field460.method2168(0);
                                    int var263 = field460.field1827;
                                    int var264 = 0;
                                    for (int var265 = 0; var265 < Statics.field24.field175 && field460.field1827 - var263 < 240; var265++) {
                                        var264++;
                                        int var266 = Statics.field24.field176[var265];
                                        if (var266 < 0) {
                                            var266 = 0;
                                        } else if (var266 > 502) {
                                            var266 = 502;
                                        }
                                        int var267 = Statics.field24.field179[var265];
                                        if (var267 < 0) {
                                            var267 = 0;
                                        } else if (var267 > 764) {
                                            var267 = 764;
                                        }
                                        int var268 = var266 * 765 + var267;
                                        if (Statics.field24.field176[var265] == -1 && Statics.field24.field179[var265] == -1) {
                                            var267 = -1;
                                            var266 = -1;
                                            var268 = 524287;
                                        }
                                        if (field264 != var267 || field265 != var266) {
                                            int var269 = var267 - field264;
                                            field264 = var267;
                                            int var270 = var266 - field265;
                                            field265 = var266;
                                            if (field266 < 8 && var269 >= -32 && var269 <= 31 && var270 >= -32 && var270 <= 31) {
                                                var269 += 32;
                                                var270 += 32;
                                                field460.method2185((field266 << 12) + (var269 << 6) + var270);
                                                field266 = 0;
                                            } else if (field266 < 8) {
                                                field460.method2106((field266 << 19) + 8388608 + var268);
                                                field266 = 0;
                                            } else {
                                                field460.method2174((field266 << 19) + -1073741824 + var268);
                                                field266 = 0;
                                            }
                                        } else if (field266 < 2047) {
                                            field266++;
                                        }
                                    }
                                    field460.method2115(field460.field1827 - var263);
                                    if (var264 >= Statics.field24.field175) {
                                        Statics.field24.field175 = 0;
                                    } else {
                                        Statics.field24.field175 -= var264;
                                        for (int var271 = 0; var271 < Statics.field24.field175; var271++) {
                                            Statics.field24.field179[var271] = Statics.field24.field179[var264 + var271];
                                            Statics.field24.field176[var271] = Statics.field24.field176[var264 + var271];
                                        }
                                    }
                                }
                            }
                            if (class127.field1975 == 1 || !Statics.field549 && class127.field1975 == 4 || class127.field1975 == 2) {
                                long var273 = (class127.field1989 - field263 * -1L) / 50L;
                                if (var273 > 4095L) {
                                    var273 = 4095L;
                                }
                                field263 = class127.field1989 * -1L;
                                int var275 = class127.field1988;
                                if (var275 < 0) {
                                    var275 = 0;
                                } else if (var275 > 502) {
                                    var275 = 502;
                                }
                                int var276 = class127.field1980;
                                if (var276 < 0) {
                                    var276 = 0;
                                } else if (var276 > 764) {
                                    var276 = 764;
                                }
                                int var277 = var275 * 765 + var276;
                                byte var278 = 0;
                                if (class127.field1975 == 2) {
                                    var278 = 1;
                                }
                                int var279 = (int) var273;
                                field460.method2339(132);
                                field460.method2174((var278 << 19) + (var279 << 20) + var277);
                            }
                            if (class124.field1956 > 0) {
                                field460.method2339(114);
                                field460.method2185(0);
                                int var280 = field460.field1827;
                                long var281 = class103.method1861();
                                for (int var283 = 0; var283 < class124.field1956; var283++) {
                                    long var284 = var281 - field474;
                                    if (var284 > 16777215L) {
                                        var284 = 16777215L;
                                    }
                                    field474 = var281;
                                    field460.method2110((int) var284);
                                    field460.method2168(class124.field1955[var283]);
                                }
                                field460.method2114(field460.field1827 - var280);
                            }
                            if (field342 > 0) {
                                field342--;
                            }
                            if (class124.field1949[96] || class124.field1949[97] || class124.field1949[98] || class124.field1949[99]) {
                                field343 = true;
                            }
                            if (field343 && field342 <= 0) {
                                field342 = 20;
                                field343 = false;
                                field460.method2339(193);
                                field460.method2148(field337);
                                field460.method2185(field377);
                            }
                            if (Statics.field1798 && !field267) {
                                field267 = true;
                                field460.method2339(129);
                                field460.method2168(1);
                            }
                            if (!Statics.field1798 && field267) {
                                field267 = false;
                                field460.method2339(129);
                                field460.method2168(0);
                            }
                            method28();
                            if (field260 == 30) {
                                for (class15 var286 = (class15) field388.method3170(); var286 != null; var286 = (class15) field388.method3172()) {
                                    if (var286.field207 > 0) {
                                        var286.field207--;
                                    }
                                    if (var286.field207 == 0) {
                                        if (var286.field217 >= 0) {
                                            int var287 = var286.field217;
                                            int var288 = var286.field222;
                                            class36 var289 = class36.method3(var287);
                                            if (var288 == 11) {
                                                var288 = 10;
                                            }
                                            if (var288 >= 5 && var288 <= 8) {
                                                var288 = 4;
                                            }
                                            boolean var290 = var289.method642(var288);
                                            if (!var290) {
                                                continue;
                                            }
                                        }
                                        method570(var286.field216, var286.field208, var286.field209, var286.field210, var286.field217, var286.field212, var286.field222);
                                        var286.method3261();
                                    } else {
                                        if (var286.field218 > 0) {
                                            var286.field218--;
                                        }
                                        if (var286.field218 == 0 && var286.field209 >= 1 && var286.field210 >= 1 && var286.field209 <= 102 && var286.field210 <= 102) {
                                            if (var286.field214 >= 0) {
                                                int var291 = var286.field214;
                                                int var292 = var286.field213;
                                                class36 var293 = class36.method3(var291);
                                                if (var292 == 11) {
                                                    var292 = 10;
                                                }
                                                if (var292 >= 5 && var292 <= 8) {
                                                    var292 = 4;
                                                }
                                                boolean var294 = var293.method642(var292);
                                                if (!var294) {
                                                    continue;
                                                }
                                            }
                                            method570(var286.field216, var286.field208, var286.field209, var286.field210, var286.field214, var286.field215, var286.field213);
                                            var286.field218 = -1;
                                            if (var286.field217 == var286.field214 && var286.field217 == -1) {
                                                var286.method3261();
                                            } else if (var286.field217 == var286.field214 && var286.field215 == var286.field212 && var286.field222 == var286.field213) {
                                                var286.method3261();
                                            }
                                        }
                                    }
                                }
                                for (int var295 = 0; var295 < field490; var295++) {
                                    var10002 = field493[var295]--;
                                    if (field493[var295] >= -10) {
                                        class52 var297 = field293[var295];
                                        if (var297 == null) {
                                            class52 var10000 = (class52) null;
                                            var297 = class52.method1018(Statics.field530, field489[var295], 0);
                                            if (var297 == null) {
                                                continue;
                                            }
                                            field493[var295] += var297.method1015();
                                            field293[var295] = var297;
                                        }
                                        if (field493[var295] < 0) {
                                            int var304;
                                            if (field494[var295] == 0) {
                                                var304 = field488;
                                            } else {
                                                int var298 = (field494[var295] & 0xFF) * 128;
                                                int var299 = field494[var295] >> 16 & 0xFF;
                                                int var300 = var299 * 128 + 64 - Statics.field994.field743;
                                                if (var300 < 0) {
                                                    var300 = -var300;
                                                }
                                                int var301 = field494[var295] >> 8 & 0xFF;
                                                int var302 = var301 * 128 + 64 - Statics.field994.field717;
                                                if (var302 < 0) {
                                                    var302 = -var302;
                                                }
                                                int var303 = var300 + var302 - 128;
                                                if (var303 > var298) {
                                                    field493[var295] = -100;
                                                    continue;
                                                }
                                                if (var303 < 0) {
                                                    var303 = 0;
                                                }
                                                var304 = field371 * (var298 - var303) / var298;
                                            }
                                            if (var304 > 0) {
                                                class56 var305 = var297.method1014().method1054(Statics.field544);
                                                class58 var306 = class58.method1164(var305, 100, var304);
                                                var306.method1206(field480[var295] - 1);
                                                Statics.field585.method935(var306);
                                            }
                                            field493[var295] = -100;
                                        }
                                    } else {
                                        field490--;
                                        for (int var296 = var295; var296 < field490; var296++) {
                                            field489[var296] = field489[var296 + 1];
                                            field293[var296] = field293[var296 + 1];
                                            field480[var296] = field480[var296 + 1];
                                            field493[var296] = field493[var296 + 1];
                                            field494[var296] = field494[var296 + 1];
                                        }
                                        var295--;
                                    }
                                }
                                if (field487) {
                                    boolean var307;
                                    if (class161.field2704 == 0) {
                                        var307 = Statics.field2703.method2987();
                                    } else {
                                        var307 = true;
                                    }
                                    if (!var307) {
                                        if (field346 != 0 && field486 != -1) {
                                            class161.method2649(Statics.field2083, field486, 0, field346, false);
                                        }
                                        field487 = false;
                                    }
                                }
                                field417++;
                                if (field417 > 750) {
                                    method2655();
                                } else {
                                    method2401();
                                    method72();
                                    for (int var308 = -1; var308 < field373; var308++) {
                                        int var309;
                                        if (var308 == -1) {
                                            var309 = 2047;
                                        } else {
                                            var309 = field275[var308];
                                        }
                                        class3 var310 = field310[var309];
                                        if (var310 != null && var310.field731 > 0) {
                                            var310.field731--;
                                            if (var310.field731 == 0) {
                                                var310.field729 = null;
                                            }
                                        }
                                    }
                                    for (int var311 = 0; var311 < field424; var311++) {
                                        int var312 = field497[var311];
                                        class30 var313 = field271[var312];
                                        if (var313 != null && var313.field731 > 0) {
                                            var313.field731--;
                                            if (var313.field731 == 0) {
                                                var313.field729 = null;
                                            }
                                        }
                                    }
                                    field328++;
                                    if (field362 != 0) {
                                        field361 += 20;
                                        if (field361 >= 400) {
                                            field362 = 0;
                                        }
                                    }
                                    if (Statics.field132 != null) {
                                        field363++;
                                        if (field363 >= 15) {
                                            method2502(Statics.field132);
                                            Statics.field132 = null;
                                        }
                                    }
                                    class152 var314 = Statics.field1842;
                                    class152 var315 = Statics.field1043;
                                    Statics.field1842 = null;
                                    Statics.field1043 = null;
                                    field430 = null;
                                    field434 = false;
                                    field259 = false;
                                    field471 = 0;
                                    while (true) {
                                        while (Statics.method1856() && field471 < 128) {
                                            if (field469 >= 2 && class124.field1949[82] && Statics.field987 == 66) {
                                                String var316 = "";
                                                Iterator var317 = class10.field154.iterator();
                                                while (var317.hasNext()) {
                                                    class31 var318 = (class31) var317.next();
                                                    var316 = var316 + var318.field692 + ':' + var318.field694 + '\n';
                                                }
                                                Statics.field17.setContents(new StringSelection(var316), (ClipboardOwner) null);
                                            } else {
                                                field473[field471] = Statics.field987;
                                                field472[field471] = Statics.field235;
                                                field471++;
                                            }
                                        }
                                        int var321 = field416;
                                        if (class152.method1877(var321)) {
                                            method150(Statics.field2618[var321], -1, 0, 0, 765, 503, 0, 0);
                                        }
                                        field268++;
                                        while (true) {
                                            class1 var322;
                                            class152 var323;
                                            class152 var324;
                                            do {
                                                var322 = (class1) field453.method3173();
                                                if (var322 == null) {
                                                    while (true) {
                                                        class1 var325;
                                                        class152 var326;
                                                        class152 var327;
                                                        do {
                                                            var325 = (class1) field454.method3173();
                                                            if (var325 == null) {
                                                                while (true) {
                                                                    class1 var328;
                                                                    class152 var329;
                                                                    class152 var330;
                                                                    do {
                                                                        var328 = (class1) field452.method3173();
                                                                        if (var328 == null) {
                                                                            method145();
                                                                            if (Statics.field122 == null && field427 == null) {
                                                                                int var331 = class127.field1975;
                                                                                if (field395) {
                                                                                    if (var331 != 1 && (Statics.field549 || var331 != 4)) {
                                                                                        int var332 = class127.field1974;
                                                                                        int var333 = class127.field1981;
                                                                                        if (var332 < Statics.field2758 - 10 || var332 > Statics.field2758 + Statics.field121 + 10 || var333 < Statics.field2048 - 10 || var333 > Statics.field65 + Statics.field2048 + 10) {
                                                                                            field395 = false;
                                                                                            method138(Statics.field2758, Statics.field2048, Statics.field121, Statics.field65);
                                                                                        }
                                                                                    }
                                                                                    if (var331 == 1 || !Statics.field549 && var331 == 4) {
                                                                                        int var334 = Statics.field2758;
                                                                                        int var335 = Statics.field2048;
                                                                                        int var336 = Statics.field121;
                                                                                        int var337 = class127.field1980;
                                                                                        int var338 = class127.field1988;
                                                                                        int var339 = -1;
                                                                                        for (int var340 = 0; var340 < field358; var340++) {
                                                                                            int var341 = (field358 - 1 - var340) * 15 + var335 + 31;
                                                                                            if (var337 > var334 && var337 < var334 + var336 && var338 > var341 - 13 && var338 < var341 + 3) {
                                                                                                var339 = var340;
                                                                                            }
                                                                                        }
                                                                                        if (var339 != -1) {
                                                                                            method2360(var339);
                                                                                        }
                                                                                        field395 = false;
                                                                                        method138(Statics.field2758, Statics.field2048, Statics.field121, Statics.field65);
                                                                                    }
                                                                                } else {
                                                                                    label2912: {
                                                                                        if ((var331 == 1 || !Statics.field549 && var331 == 4) && field358 > 0) {
                                                                                            int var342 = field280[field358 - 1];
                                                                                            if (var342 == 39 || var342 == 40 || var342 == 41 || var342 == 42 || var342 == 43 || var342 == 33 || var342 == 34 || var342 == 35 || var342 == 36 || var342 == 37 || var342 == 38 || var342 == 1005) {
                                                                                                label2888: {
                                                                                                    int var343 = field397[field358 - 1];
                                                                                                    int var344 = field398[field358 - 1];
                                                                                                    class152 var345 = class152.method2301(var344);
                                                                                                    int var346 = method3455(var345);
                                                                                                    boolean var347 = (var346 >> 28 & 0x1) != 0;
                                                                                                    if (!var347) {
                                                                                                        int var348 = method3455(var345);
                                                                                                        boolean var349 = (var348 >> 29 & 0x1) != 0;
                                                                                                        if (!var349) {
                                                                                                            break label2888;
                                                                                                        }
                                                                                                    }
                                                                                                    if (Statics.field122 != null && !field369 && field394 != 1) {
                                                                                                        int var350 = field358 - 1;
                                                                                                        boolean var351;
                                                                                                        if (var350 < 0) {
                                                                                                            var351 = false;
                                                                                                        } else {
                                                                                                            int var352 = field280[var350];
                                                                                                            if (var352 >= 2000) {
                                                                                                                var352 -= 2000;
                                                                                                            }
                                                                                                            if (var352 == 1007) {
                                                                                                                var351 = true;
                                                                                                            } else {
                                                                                                                var351 = false;
                                                                                                            }
                                                                                                        }
                                                                                                        if (!var351 && field358 > 0) {
                                                                                                            method30(field366, field325);
                                                                                                        }
                                                                                                    }
                                                                                                    field369 = false;
                                                                                                    field370 = 0;
                                                                                                    if (Statics.field122 != null) {
                                                                                                        method2502(Statics.field122);
                                                                                                    }
                                                                                                    Statics.field122 = class152.method2301(var344);
                                                                                                    field365 = var343;
                                                                                                    field366 = class127.field1980;
                                                                                                    field325 = class127.field1988;
                                                                                                    if (field358 > 0) {
                                                                                                        method131(field358 - 1);
                                                                                                    }
                                                                                                    method2502(Statics.field122);
                                                                                                    break label2912;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (var331 == 1 || !Statics.field549 && var331 == 4) {
                                                                                            label2905: {
                                                                                                if (field394 != 1 || field358 <= 2) {
                                                                                                    int var353 = field358 - 1;
                                                                                                    boolean var354;
                                                                                                    if (var353 < 0) {
                                                                                                        var354 = false;
                                                                                                    } else {
                                                                                                        int var355 = field280[var353];
                                                                                                        if (var355 >= 2000) {
                                                                                                            var355 -= 2000;
                                                                                                        }
                                                                                                        if (var355 == 1007) {
                                                                                                            var354 = true;
                                                                                                        } else {
                                                                                                            var354 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    if (!var354) {
                                                                                                        break label2905;
                                                                                                    }
                                                                                                }
                                                                                                var331 = 2;
                                                                                            }
                                                                                        }
                                                                                        if ((var331 == 1 || !Statics.field549 && var331 == 4) && field358 > 0) {
                                                                                            method2360(field358 - 1);
                                                                                        }
                                                                                        if (var331 == 2 && field358 > 0) {
                                                                                            Statics.method1965(class127.field1980, class127.field1988);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field427 != null) {
                                                                                method2502(field427);
                                                                                Statics.field1430++;
                                                                                if (field434 && field259) {
                                                                                    int var356 = class127.field1974;
                                                                                    int var357 = class127.field1981;
                                                                                    int var358 = var356 - field428;
                                                                                    int var359 = var357 - field499;
                                                                                    if (var358 < field432) {
                                                                                        var358 = field432;
                                                                                    }
                                                                                    if (field427.field2523 + var358 > field432 + field279.field2523) {
                                                                                        var358 = field432 + field279.field2523 - field427.field2523;
                                                                                    }
                                                                                    if (var359 < field463) {
                                                                                        var359 = field463;
                                                                                    }
                                                                                    if (field427.field2515 + var359 > field463 + field279.field2515) {
                                                                                        var359 = field463 + field279.field2515 - field427.field2515;
                                                                                    }
                                                                                    int var360 = var358 - field435;
                                                                                    int var361 = var359 - field436;
                                                                                    int var362 = field427.field2566;
                                                                                    if (Statics.field1430 > field427.field2578 && (var360 > var362 || var360 < -var362 || var361 > var362 || var361 < -var362)) {
                                                                                        field437 = true;
                                                                                    }
                                                                                    int var363 = field279.field2527 + (var358 - field432);
                                                                                    int var364 = field279.field2574 + (var359 - field463);
                                                                                    if (field427.field2590 != null && field437) {
                                                                                        class1 var365 = new class1();
                                                                                        var365.field3 = field427;
                                                                                        var365.field5 = var363;
                                                                                        var365.field6 = var364;
                                                                                        var365.field11 = field427.field2590;
                                                                                        class32.method126(var365);
                                                                                    }
                                                                                    if (class127.field1979 == 0) {
                                                                                        if (field437) {
                                                                                            if (field427.field2591 != null) {
                                                                                                class1 var366 = new class1();
                                                                                                var366.field3 = field427;
                                                                                                var366.field5 = var363;
                                                                                                var366.field6 = var364;
                                                                                                var366.field7 = field430;
                                                                                                var366.field11 = field427.field2591;
                                                                                                class32.method126(var366);
                                                                                            }
                                                                                            if (field430 != null && method562(field427) != null) {
                                                                                                field460.method2339(164);
                                                                                                field460.method2148(field427.field2605);
                                                                                                field460.method2148(field427.field2524);
                                                                                                field460.method2157(field430.field2514);
                                                                                                field460.method2148(field430.field2605);
                                                                                                field460.method2174(field427.field2514);
                                                                                                field460.method2148(field430.field2524);
                                                                                            }
                                                                                        } else {
                                                                                            label1666: {
                                                                                                label1665: {
                                                                                                    if (field394 != 1) {
                                                                                                        int var367 = field358 - 1;
                                                                                                        boolean var368;
                                                                                                        if (var367 < 0) {
                                                                                                            var368 = false;
                                                                                                        } else {
                                                                                                            int var369 = field280[var367];
                                                                                                            if (var369 >= 2000) {
                                                                                                                var369 -= 2000;
                                                                                                            }
                                                                                                            if (var369 == 1007) {
                                                                                                                var368 = true;
                                                                                                            } else {
                                                                                                                var368 = false;
                                                                                                            }
                                                                                                        }
                                                                                                        if (!var368) {
                                                                                                            break label1665;
                                                                                                        }
                                                                                                    }
                                                                                                    if (field358 > 2) {
                                                                                                        Statics.method1965(field435 + field428, field499 + field436);
                                                                                                        break label1666;
                                                                                                    }
                                                                                                }
                                                                                                if (field358 > 0) {
                                                                                                    method30(field435 + field428, field499 + field436);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        field427 = null;
                                                                                    }
                                                                                } else if (Statics.field1430 > 1) {
                                                                                    field427 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field122 != null) {
                                                                                method2502(Statics.field122);
                                                                                field370++;
                                                                                if (class127.field1979 == 0) {
                                                                                    if (!field369) {
                                                                                        label1634: {
                                                                                            label1633: {
                                                                                                if (field394 != 1) {
                                                                                                    int var378 = field358 - 1;
                                                                                                    boolean var379;
                                                                                                    if (var378 < 0) {
                                                                                                        var379 = false;
                                                                                                    } else {
                                                                                                        int var380 = field280[var378];
                                                                                                        if (var380 >= 2000) {
                                                                                                            var380 -= 2000;
                                                                                                        }
                                                                                                        if (var380 == 1007) {
                                                                                                            var379 = true;
                                                                                                        } else {
                                                                                                            var379 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    if (!var379) {
                                                                                                        break label1633;
                                                                                                    }
                                                                                                }
                                                                                                if (field358 > 2) {
                                                                                                    Statics.method1965(field366, field325);
                                                                                                    break label1634;
                                                                                                }
                                                                                            }
                                                                                            if (field358 > 0) {
                                                                                                method30(field366, field325);
                                                                                            }
                                                                                        }
                                                                                    } else if (Statics.field161 == Statics.field122 && field368 != field365) {
                                                                                        class152 var370 = Statics.field122;
                                                                                        byte var371 = 0;
                                                                                        if (field410 == 1 && var370.field2518 == 206) {
                                                                                            var371 = 1;
                                                                                        }
                                                                                        if (var370.field2616[field368] <= 0) {
                                                                                            var371 = 0;
                                                                                        }
                                                                                        int var372 = method3455(var370);
                                                                                        boolean var373 = (var372 >> 29 & 0x1) != 0;
                                                                                        if (var373) {
                                                                                            int var374 = field365;
                                                                                            int var375 = field368;
                                                                                            var370.field2616[var375] = var370.field2616[var374];
                                                                                            var370.field2617[var375] = var370.field2617[var374];
                                                                                            var370.field2616[var374] = -1;
                                                                                            var370.field2617[var374] = 0;
                                                                                        } else if (var371 == 1) {
                                                                                            int var376 = field365;
                                                                                            int var377 = field368;
                                                                                            while (var376 != var377) {
                                                                                                if (var376 > var377) {
                                                                                                    var370.method2836(var376 - 1, var376);
                                                                                                    var376--;
                                                                                                } else if (var376 < var377) {
                                                                                                    var370.method2836(var376 + 1, var376);
                                                                                                    var376++;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            var370.method2836(field368, field365);
                                                                                        }
                                                                                        field460.method2339(130);
                                                                                        field460.method2157(Statics.field122.field2514);
                                                                                        field460.method2148(field365);
                                                                                        field460.method2139(var371);
                                                                                        field460.method2185(field368);
                                                                                    }
                                                                                    field363 = 10;
                                                                                    class127.field1975 = 0;
                                                                                    Statics.field122 = null;
                                                                                } else if (field370 >= 5 && (class127.field1974 > field366 + 5 || class127.field1974 < field366 - 5 || class127.field1981 > field325 + 5 || class127.field1981 < field325 - 5)) {
                                                                                    field369 = true;
                                                                                }
                                                                            }
                                                                            if (class79.field1399 != -1) {
                                                                                int var381 = class79.field1399;
                                                                                int var382 = class79.field1415;
                                                                                field460.method2339(207);
                                                                                field460.method2168(5);
                                                                                field460.method2185(Statics.field304 + var381);
                                                                                field460.method2162(Statics.field671 + var382);
                                                                                field460.method2140(class124.field1949[82] ? (class124.field1949[81] ? 2 : 1) : 0);
                                                                                class79.field1399 = -1;
                                                                                field359 = class127.field1980;
                                                                                field360 = class127.field1988;
                                                                                field362 = 1;
                                                                                field361 = 0;
                                                                                field282 = var381;
                                                                                field483 = var382;
                                                                            }
                                                                            if (Statics.field1842 != var314) {
                                                                                if (var314 != null) {
                                                                                    method2502(var314);
                                                                                }
                                                                                if (Statics.field1842 != null) {
                                                                                    method2502(Statics.field1842);
                                                                                }
                                                                            }
                                                                            if (Statics.field1043 != var315 && field405 == field283) {
                                                                                if (var315 != null) {
                                                                                    method2502(var315);
                                                                                }
                                                                                if (Statics.field1043 != null) {
                                                                                    method2502(Statics.field1043);
                                                                                }
                                                                            }
                                                                            if (Statics.field1043 == null) {
                                                                                if (field405 > 0) {
                                                                                    field405--;
                                                                                }
                                                                            } else if (field405 < field283) {
                                                                                field405++;
                                                                                if (field405 == field283) {
                                                                                    method2502(Statics.field1043);
                                                                                }
                                                                            }
                                                                            int var383 = field316 + Statics.field994.field743;
                                                                            int var384 = field289 + Statics.field994.field717;
                                                                            if (Statics.field220 - var383 < -500 || Statics.field220 - var383 > 500 || Statics.field592 - var384 < -500 || Statics.field592 - var384 > 500) {
                                                                                Statics.field220 = var383;
                                                                                Statics.field592 = var384;
                                                                            }
                                                                            if (Statics.field220 != var383) {
                                                                                Statics.field220 += (var383 - Statics.field220) / 16;
                                                                            }
                                                                            if (Statics.field592 != var384) {
                                                                                Statics.field592 += (var384 - Statics.field592) / 16;
                                                                            }
                                                                            if (class127.field1979 == 4 && Statics.field549) {
                                                                                int var385 = class127.field1981 - field341;
                                                                                field339 = var385 * 2;
                                                                                field341 = var385 == -1 || var385 == 1 ? class127.field1981 : (field341 + class127.field1981) / 2;
                                                                                int var386 = field340 - class127.field1974;
                                                                                field269 = var386 * 2;
                                                                                field340 = var386 == -1 || var386 == 1 ? class127.field1974 : (field340 + class127.field1974) / 2;
                                                                            } else {
                                                                                if (class124.field1949[96]) {
                                                                                    field269 += (-24 - field269) / 2;
                                                                                } else if (class124.field1949[97]) {
                                                                                    field269 += (24 - field269) / 2;
                                                                                } else {
                                                                                    field269 /= 2;
                                                                                }
                                                                                if (class124.field1949[98]) {
                                                                                    field339 += (12 - field339) / 2;
                                                                                } else if (class124.field1949[99]) {
                                                                                    field339 += (-12 - field339) / 2;
                                                                                } else {
                                                                                    field339 /= 2;
                                                                                }
                                                                                field341 = class127.field1981;
                                                                                field340 = class127.field1974;
                                                                            }
                                                                            field337 = field269 / 2 + field337 & 0x7FF;
                                                                            field377 += field339 / 2;
                                                                            if (field377 < 128) {
                                                                                field377 = 128;
                                                                            }
                                                                            if (field377 > 383) {
                                                                                field377 = 383;
                                                                            }
                                                                            int var387 = Statics.field220 >> 7;
                                                                            int var388 = Statics.field592 >> 7;
                                                                            int var389 = method2503(Statics.field220, Statics.field592, Statics.field221);
                                                                            int var390 = 0;
                                                                            if (var387 > 3 && var388 > 3 && var387 < 100 && var388 < 100) {
                                                                                for (int var391 = var387 - 4; var391 <= var387 + 4; var391++) {
                                                                                    for (int var392 = var388 - 4; var392 <= var388 + 4; var392++) {
                                                                                        int var393 = Statics.field221;
                                                                                        if (var393 < 3 && (class6.field71[1][var391][var392] & 0x2) == 2) {
                                                                                            var393++;
                                                                                        }
                                                                                        int var394 = var389 - class6.field82[var393][var391][var392];
                                                                                        if (var394 > var390) {
                                                                                            var390 = var394;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var395 = var390 * 192;
                                                                            if (var395 > 98048) {
                                                                                var395 = 98048;
                                                                            }
                                                                            if (var395 < 32768) {
                                                                                var395 = 32768;
                                                                            }
                                                                            if (var395 > field433) {
                                                                                field433 += (var395 - field433) / 24;
                                                                            } else if (var395 < field433) {
                                                                                field433 += (var395 - field433) / 80;
                                                                            }
                                                                            if (field496) {
                                                                                int var396 = Statics.field170 * 128 + 64;
                                                                                int var397 = Statics.field93 * 128 + 64;
                                                                                int var398 = method2503(var396, var397, Statics.field221) - Statics.field910;
                                                                                if (Statics.field1879 < var396) {
                                                                                    Statics.field1879 += Statics.field1920 * (var396 - Statics.field1879) / 1000 + Statics.field756;
                                                                                    if (Statics.field1879 > var396) {
                                                                                        Statics.field1879 = var396;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1879 > var396) {
                                                                                    Statics.field1879 -= Statics.field1920 * (Statics.field1879 - var396) / 1000 + Statics.field756;
                                                                                    if (Statics.field1879 < var396) {
                                                                                        Statics.field1879 = var396;
                                                                                    }
                                                                                }
                                                                                if (Statics.field812 < var398) {
                                                                                    Statics.field812 += Statics.field1920 * (var398 - Statics.field812) / 1000 + Statics.field756;
                                                                                    if (Statics.field812 > var398) {
                                                                                        Statics.field812 = var398;
                                                                                    }
                                                                                }
                                                                                if (Statics.field812 > var398) {
                                                                                    Statics.field812 -= Statics.field1920 * (Statics.field812 - var398) / 1000 + Statics.field756;
                                                                                    if (Statics.field812 < var398) {
                                                                                        Statics.field812 = var398;
                                                                                    }
                                                                                }
                                                                                if (Statics.field173 < var397) {
                                                                                    Statics.field173 += Statics.field1920 * (var397 - Statics.field173) / 1000 + Statics.field756;
                                                                                    if (Statics.field173 > var397) {
                                                                                        Statics.field173 = var397;
                                                                                    }
                                                                                }
                                                                                if (Statics.field173 > var397) {
                                                                                    Statics.field173 -= Statics.field1920 * (Statics.field173 - var397) / 1000 + Statics.field756;
                                                                                    if (Statics.field173 < var397) {
                                                                                        Statics.field173 = var397;
                                                                                    }
                                                                                }
                                                                                int var399 = Statics.field986 * 128 + 64;
                                                                                int var400 = Statics.field1562 * 128 + 64;
                                                                                int var401 = method2503(var399, var400, Statics.field221) - Statics.field2499;
                                                                                int var402 = var399 - Statics.field1879;
                                                                                int var403 = var401 - Statics.field812;
                                                                                int var404 = var400 - Statics.field173;
                                                                                int var405 = (int) Math.sqrt((double) (var402 * var402 + var404 * var404));
                                                                                int var406 = (int) (Math.atan2((double) var403, (double) var405) * 325.949D) & 0x7FF;
                                                                                int var407 = (int) (Math.atan2((double) var402, (double) var404) * -325.949D) & 0x7FF;
                                                                                if (var406 < 128) {
                                                                                    var406 = 128;
                                                                                }
                                                                                if (var406 > 383) {
                                                                                    var406 = 383;
                                                                                }
                                                                                if (Statics.field683 < var406) {
                                                                                    Statics.field683 += Statics.field230 * (var406 - Statics.field683) / 1000 + Statics.field1060;
                                                                                    if (Statics.field683 > var406) {
                                                                                        Statics.field683 = var406;
                                                                                    }
                                                                                }
                                                                                if (Statics.field683 > var406) {
                                                                                    Statics.field683 -= Statics.field230 * (Statics.field683 - var406) / 1000 + Statics.field1060;
                                                                                    if (Statics.field683 < var406) {
                                                                                        Statics.field683 = var406;
                                                                                    }
                                                                                }
                                                                                int var408 = var407 - Statics.field136;
                                                                                if (var408 > 1024) {
                                                                                    var408 -= 2048;
                                                                                }
                                                                                if (var408 < -1024) {
                                                                                    var408 += 2048;
                                                                                }
                                                                                if (var408 > 0) {
                                                                                    Statics.field136 += Statics.field230 * var408 / 1000 + Statics.field1060;
                                                                                    Statics.field136 &= 0x7FF;
                                                                                }
                                                                                if (var408 < 0) {
                                                                                    Statics.field136 -= Statics.field230 * -var408 / 1000 + Statics.field1060;
                                                                                    Statics.field136 &= 0x7FF;
                                                                                }
                                                                                int var409 = var407 - Statics.field136;
                                                                                if (var409 > 1024) {
                                                                                    var409 -= 2048;
                                                                                }
                                                                                if (var409 < -1024) {
                                                                                    var409 += 2048;
                                                                                }
                                                                                if (var409 < 0 && var408 > 0 || var409 > 0 && var408 < 0) {
                                                                                    Statics.field136 = var407;
                                                                                }
                                                                            }
                                                                            for (int var410 = 0; var410 < 5; var410++) {
                                                                                var10002 = field249[var410]++;
                                                                            }
                                                                            int var411 = ++class127.field1982 - 1;
                                                                            int var413 = class124.field1960;
                                                                            if (var411 > 15000 && var413 > 15000) {
                                                                                field299 = 250;
                                                                                class127.field1982 = 14500;
                                                                                field460.method2339(118);
                                                                            }
                                                                            field400++;
                                                                            if (field400 > 500) {
                                                                                field400 = 0;
                                                                                int var415 = (int) (Math.random() * 8.0D);
                                                                                if ((var415 & 0x1) == 1) {
                                                                                    field316 += field317;
                                                                                }
                                                                                if ((var415 & 0x2) == 2) {
                                                                                    field289 += field319;
                                                                                }
                                                                                if ((var415 & 0x4) == 4) {
                                                                                    field320 += field321;
                                                                                }
                                                                            }
                                                                            if (field316 < -50) {
                                                                                field317 = 2;
                                                                            }
                                                                            if (field316 > 50) {
                                                                                field317 = -2;
                                                                            }
                                                                            if (field289 < -55) {
                                                                                field319 = 2;
                                                                            }
                                                                            if (field289 > 55) {
                                                                                field319 = -2;
                                                                            }
                                                                            if (field320 < -40) {
                                                                                field321 = 1;
                                                                            }
                                                                            if (field320 > 40) {
                                                                                field321 = -1;
                                                                            }
                                                                            field327++;
                                                                            if (field327 > 500) {
                                                                                field327 = 0;
                                                                                int var416 = (int) (Math.random() * 8.0D);
                                                                                if ((var416 & 0x1) == 1) {
                                                                                    field323 += field491;
                                                                                }
                                                                                if ((var416 & 0x2) == 2) {
                                                                                    field450 += field297;
                                                                                }
                                                                            }
                                                                            if (field323 < -60) {
                                                                                field491 = 2;
                                                                            }
                                                                            if (field323 > 60) {
                                                                                field491 = -2;
                                                                            }
                                                                            if (field450 < -20) {
                                                                                field297 = 1;
                                                                            }
                                                                            if (field450 > 10) {
                                                                                field297 = -1;
                                                                            }
                                                                            for (class34 var417 = (class34) field505.method3124(); var417 != null; var417 = (class34) field505.method3123()) {
                                                                                if ((long) var417.field782 < class103.method1861() / 1000L - 5L) {
                                                                                    if (var417.field778 > 0) {
                                                                                        class10.method9(5, "", var417.field776 + class142.field2265);
                                                                                    }
                                                                                    if (var417.field778 == 0) {
                                                                                        class10.method9(5, "", var417.field776 + class142.field2266);
                                                                                    }
                                                                                    var417.method3259();
                                                                                }
                                                                            }
                                                                            field345++;
                                                                            if (field345 > 50) {
                                                                                field460.method2339(40);
                                                                            }
                                                                            try {
                                                                                if (Statics.field1893 != null && field460.field1827 > 0) {
                                                                                    Statics.field1893.method2557(field460.field1826, 0, field460.field1827);
                                                                                    field460.field1827 = 0;
                                                                                    field345 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var419) {
                                                                                method2655();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var329 = var328.field3;
                                                                        if (var329.field2605 < 0) {
                                                                            break;
                                                                        }
                                                                        var330 = class152.method2301(var329.field2594);
                                                                    } while (var330 == null || var330.field2622 == null || var329.field2605 >= var330.field2622.length || var330.field2622[var329.field2605] != var329);
                                                                    class32.method126(var328);
                                                                }
                                                            }
                                                            var326 = var325.field3;
                                                            if (var326.field2605 < 0) {
                                                                break;
                                                            }
                                                            var327 = class152.method2301(var326.field2594);
                                                        } while (var327 == null || var327.field2622 == null || var326.field2605 >= var327.field2622.length || var327.field2622[var326.field2605] != var326);
                                                        class32.method126(var325);
                                                    }
                                                }
                                                var323 = var322.field3;
                                                if (var323.field2605 < 0) {
                                                    break;
                                                }
                                                var324 = class152.method2301(var323.field2594);
                                            } while (var324 == null || var324.field2622 == null || var323.field2605 >= var324.field2622.length || var324.field2622[var323.field2605] != var323);
                                            class32.method126(var322);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        field460.method2339(2);
                        field460.method2168(0);
                        int var261 = field460.field1827;
                        class189.method2919(field460);
                        field460.method2115(field460.field1827 - var261);
                    }
                }
            }
        } else if (field260 == 40 || field260 == 45) {
            method109();
        }
    }

    @ObfuscatedName("client.l(B)V")
    public final void method166() {
        boolean var1;
        label157: {
            try {
                if (class161.field2704 == 2) {
                    if (Statics.field1863 == null) {
                        Statics.field1863 = class158.method2906(Statics.field1000, Statics.field2700, Statics.field2706);
                        if (Statics.field1863 == null) {
                            var1 = false;
                            break label157;
                        }
                    }
                    if (Statics.field998 == null) {
                        Statics.field998 = new class53(Statics.field2705, Statics.field2701);
                    }
                    if (Statics.field2703.method2983(Statics.field1863, Statics.field2710, Statics.field998, 22050)) {
                        Statics.field2703.method3011();
                        Statics.field2703.method3043(Statics.field2707);
                        Statics.field2703.method2985(Statics.field1863, Statics.field2708);
                        class161.field2704 = 0;
                        Statics.field1863 = null;
                        Statics.field998 = null;
                        Statics.field1000 = null;
                        var1 = true;
                        break label157;
                    }
                }
            } catch (Exception var26) {
                var26.printStackTrace();
                Statics.field2703.method3035();
                class161.field2704 = 0;
                Statics.field1863 = null;
                Statics.field998 = null;
                Statics.field1000 = null;
            }
            var1 = false;
        }
        if (var1 && field487 && Statics.field192 != null) {
            Statics.field192.method974();
        }
        if (field2025) {
            Canvas var4 = Statics.field2015;
            var4.removeKeyListener(class124.field1957);
            var4.removeFocusListener(class124.field1957);
            class124.field1948 = -1;
            class127.method742(Statics.field2015);
            if (Statics.field211 != null) {
                Statics.field211.method2404(Statics.field2015);
            }
            this.method2627();
            class124.method1769(Statics.field2015);
            class127.method2394(Statics.field2015);
            if (Statics.field211 != null) {
                Statics.field211.method2402(Statics.field2015);
            }
        }
        if (field260 == 0) {
            int var5 = class28.field651;
            String var6 = class28.field635;
            Color var7 = null;
            try {
                Graphics var8 = Statics.field2015.getGraphics();
                if (Statics.field1340 == null) {
                    Statics.field1340 = new Font("Helvetica", 1, 13);
                    Statics.field1121 = Statics.field2015.getFontMetrics(Statics.field1340);
                }
                if (field2026) {
                    field2026 = false;
                    var8.setColor(Color.black);
                    var8.fillRect(0, 0, Statics.field147, Statics.field602);
                }
                if (var7 == null) {
                    var7 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field874 == null) {
                        Statics.field874 = Statics.field2015.createImage(304, 34);
                    }
                    Graphics var9 = Statics.field874.getGraphics();
                    var9.setColor(var7);
                    var9.drawRect(0, 0, 303, 33);
                    var9.fillRect(2, 2, var5 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(1, 1, 301, 31);
                    var9.fillRect(var5 * 3 + 2, 2, 300 - var5 * 3, 30);
                    var9.setFont(Statics.field1340);
                    var9.setColor(Color.white);
                    var9.drawString(var6, (304 - Statics.field1121.stringWidth(var6)) / 2, 22);
                    var8.drawImage(Statics.field874, Statics.field147 / 2 - 152, Statics.field602 / 2 - 18, (ImageObserver) null);
                } catch (Exception var22) {
                    int var11 = Statics.field147 / 2 - 152;
                    int var12 = Statics.field602 / 2 - 18;
                    var8.setColor(var7);
                    var8.drawRect(var11, var12, 303, 33);
                    var8.fillRect(var11 + 2, var12 + 2, var5 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(var11 + 1, var12 + 1, 301, 31);
                    var8.fillRect(var5 * 3 + var11 + 2, var12 + 2, 300 - var5 * 3, 30);
                    var8.setFont(Statics.field1340);
                    var8.setColor(Color.white);
                    var8.drawString(var6, var11 + (304 - Statics.field1121.stringWidth(var6)) / 2, var12 + 22);
                }
            } catch (Exception var23) {
                Statics.field2015.repaint();
            }
        } else if (field260 == 5) {
            class28.method1580(Statics.field511, Statics.field2889);
        } else if (field260 == 10 || field260 == 11) {
            class28.method1580(Statics.field511, Statics.field2889);
        } else if (field260 == 20) {
            class28.method1580(Statics.field511, Statics.field2889);
        } else if (field260 == 25) {
            if (field399 == 1) {
                if (field306 > field307) {
                    field307 = field306;
                }
                int var14 = (field307 * 50 - field306 * 50) / field307;
                method2856(class142.field2311 + class2.field28 + class2.field19 + var14 + "%" + class2.field20, false);
            } else if (field399 == 2) {
                if (field308 > field294) {
                    field294 = field308;
                }
                int var15 = (field294 * 50 - field308 * 50) / field294 + 50;
                method2856(class142.field2311 + class2.field28 + class2.field19 + var15 + "%" + class2.field20, false);
            } else {
                method2856(class142.field2311, false);
            }
        } else if (field260 == 30) {
            method1378();
        } else if (field260 == 40) {
            method2856(class142.field2234 + class2.field28 + class142.field2129, false);
        } else if (field260 == 45) {
            method2856(class142.field2276, false);
        }
        if (field260 == 30 && field465 == 0 && !field2026) {
            try {
                Graphics var16 = Statics.field2015.getGraphics();
                for (int var17 = 0; var17 < field385; var17++) {
                    if (field459[var17]) {
                        Statics.field1952.method1349(var16, field461[var17], field462[var17], field431[var17], field464[var17]);
                        field459[var17] = false;
                    }
                }
            } catch (Exception var25) {
                Statics.field2015.repaint();
            }
        } else if (field260 > 0) {
            try {
                Graphics var19 = Statics.field2015.getGraphics();
                Statics.field1952.method1363(var19, 0, 0);
                field2026 = false;
                for (int var20 = 0; var20 < field385; var20++) {
                    field459[var20] = false;
                }
            } catch (Exception var24) {
                Statics.field2015.repaint();
            }
        }
    }

    @ObfuscatedName("client.h(B)V")
    public final void method230() {
        if (Statics.field24 != null) {
            Statics.field24.field183 = false;
        }
        Statics.field24 = null;
        if (Statics.field1893 != null) {
            Statics.field1893.method2554();
            Statics.field1893 = null;
        }
        if (class124.field1957 != null) {
            class124 var1 = class124.field1957;
            synchronized (class124.field1957) {
                class124.field1957 = null;
            }
        }
        class127.method2436();
        Statics.field211 = null;
        if (Statics.field192 != null) {
            Statics.field192.method997();
        }
        if (Statics.field2000 != null) {
            Statics.field2000.method997();
        }
        class150.method604();
        class149.method577();
        class136.method2646();
    }

    @ObfuscatedName("d.n(IB)V")
    public static void method482(int arg0) {
        if (field260 == arg0) {
            return;
        }
        if (field260 == 0) {
            Statics.field874 = null;
            Statics.field1340 = null;
            Statics.field1121 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field285 = 0;
            field286 = 0;
            field287 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1869 != null) {
            Statics.field1869.method2554();
            Statics.field1869 = null;
        }
        if (field260 == 25) {
            field399 = 0;
            field306 = 0;
            field307 = 1;
            field308 = 0;
            field294 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method757(Statics.field2015, Statics.field1663, Statics.field87, true, 0);
        } else if (arg0 == 20) {
            class28.method757(Statics.field2015, Statics.field1663, Statics.field87, true, field260 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method757(Statics.field2015, Statics.field1663, Statics.field87, false, 4);
        } else {
            class28.method140();
        }
        field260 = arg0;
    }

    @ObfuscatedName("client.w(I)V")
    public void method168() {
        if (field260 != 1000) {
            boolean var1 = class150.method819();
            if (!var1) {
                this.method430();
            }
        }
    }

    @ObfuscatedName("client.m(I)V")
    public void method430() {
        if (class150.field2491 >= 4) {
            this.method2580("js5crc");
            field260 = 1000;
            return;
        }
        if (class150.field2496 >= 4) {
            if (field260 <= 5) {
                this.method2580("js5io");
                field260 = 1000;
                return;
            }
            field478 = 3000;
            class150.field2496 = 3;
        }
        if (--field478 + 1 > 0) {
            return;
        }
        try {
            if (field381 == 0) {
                Statics.field134 = Statics.field777.method2451(Statics.field2086, Statics.field123);
                field381++;
            }
            if (field381 == 1) {
                if (Statics.field134.field2036 == 2) {
                    this.method170(-1);
                    return;
                }
                if (Statics.field134.field2036 == 1) {
                    field381++;
                }
            }
            if (field381 == 2) {
                Statics.field1508 = new class130((Socket) Statics.field134.field2039, Statics.field777);
                class107 var1 = new class107(5);
                var1.method2168(15);
                var1.method2174(55);
                Statics.field1508.method2557(var1.field1826, 0, 5);
                field381++;
                Statics.field1894 = class103.method1861();
            }
            if (field381 == 3) {
                if (field260 <= 5 || Statics.field1508.method2555() > 0) {
                    int var2 = Statics.field1508.method2561();
                    if (var2 != 0) {
                        this.method170(var2);
                        return;
                    }
                    field381++;
                } else if (class103.method1861() - Statics.field1894 > 30000L) {
                    this.method170(-2);
                    return;
                }
            }
            if (field381 == 4) {
                class130 var3 = Statics.field1508;
                boolean var4 = field260 > 20;
                if (Statics.field2475 != null) {
                    try {
                        Statics.field2475.method2554();
                    } catch (Exception var14) {
                    }
                    Statics.field2475 = null;
                }
                Statics.field2475 = var3;
                class150.method2636(var4);
                class150.field2486.field1827 = 0;
                Statics.field189 = null;
                Statics.field2487 = null;
                class150.field2473 = 0;
                while (true) {
                    class151 var6 = (class151) class150.field2478.method3134();
                    if (var6 == null) {
                        while (true) {
                            class151 var7 = (class151) class150.field2483.method3134();
                            if (var7 == null) {
                                if (class150.field2485 != 0) {
                                    try {
                                        class107 var8 = new class107(4);
                                        var8.method2168(4);
                                        var8.method2168(class150.field2485);
                                        var8.method2185(0);
                                        Statics.field2475.method2557(var8.field1826, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2475.method2554();
                                        } catch (Exception var12) {
                                        }
                                        class150.field2496++;
                                        Statics.field2475 = null;
                                    }
                                }
                                class150.field2474 = 0;
                                Statics.field2492 = class103.method1861();
                                Statics.field134 = null;
                                Statics.field1508 = null;
                                field381 = 0;
                                field284 = 0;
                                return;
                            }
                            class150.field2482.method3225(var7);
                            class150.field2481.method3132(var7, var7.field2866);
                            class150.field2495++;
                            class150.field2484--;
                        }
                    }
                    class150.field2476.method3132(var6, var6.field2866);
                    class150.field2477++;
                    class150.field2490--;
                }
            }
        } catch (IOException var15) {
            this.method170(-3);
        }
    }

    @ObfuscatedName("client.x(IB)V")
    public void method170(int arg0) {
        Statics.field134 = null;
        Statics.field1508 = null;
        field381 = 0;
        if (Statics.field943 == Statics.field123) {
            Statics.field123 = Statics.field621;
        } else {
            Statics.field123 = Statics.field943;
        }
        field284++;
        if (field284 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field260 <= 5) {
                this.method2580("js5connect_full");
                field260 = 1000;
            } else {
                field478 = 3000;
            }
        } else if (field284 >= 2 && arg0 == 6) {
            this.method2580("js5connect_outofdate");
            field260 = 1000;
        } else if (field284 >= 4) {
            if (field260 <= 5) {
                this.method2580("js5connect");
                field260 = 1000;
            } else {
                field478 = 3000;
            }
        }
    }

    @ObfuscatedName("s.b(I)V")
    public static void method499() {
        if (field281 == 0) {
            Statics.field336 = new class79(4, 104, 104, class6.field82);
            for (int var0 = 0; var0 < 4; var0++) {
                field318[var0] = new class197(104, 104);
            }
            Statics.field876 = new class72(512, 512);
            class28.field635 = class142.field2130;
            class28.field651 = 5;
            field281 = 20;
        } else if (field281 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1483[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1598(var1, 500, 800, 512, 334);
            class28.field635 = class142.field2131;
            class28.field651 = 10;
            field281 = 30;
        } else if (field281 == 30) {
            Statics.field2444 = method755(0, false, true, true);
            Statics.field1052 = method755(1, false, true, true);
            Statics.field1659 = method755(2, true, false, true);
            Statics.field2042 = method755(3, false, true, true);
            Statics.field530 = method755(4, false, true, true);
            Statics.field1795 = method755(5, true, true, true);
            Statics.field2083 = method755(6, true, true, false);
            Statics.field1664 = method755(7, false, true, true);
            Statics.field87 = method755(8, false, true, true);
            Statics.field1502 = method755(9, false, true, true);
            Statics.field1663 = method755(10, false, true, true);
            Statics.field2013 = method755(11, false, true, true);
            Statics.field880 = method755(12, false, true, true);
            Statics.field70 = method755(13, true, false, true);
            Statics.field1254 = method755(14, false, true, false);
            Statics.field990 = method755(15, false, true, true);
            class28.field635 = class142.field2318;
            class28.field651 = 20;
            field281 = 40;
        } else if (field281 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2444.method2744() * 4 / 100;
            int var8 = var7 + Statics.field1052.method2744() * 4 / 100;
            int var9 = var8 + Statics.field1659.method2744() * 2 / 100;
            int var10 = var9 + Statics.field2042.method2744() * 2 / 100;
            int var11 = var10 + Statics.field530.method2744() * 6 / 100;
            int var12 = var11 + Statics.field1795.method2744() * 4 / 100;
            int var13 = var12 + Statics.field2083.method2744() * 2 / 100;
            int var14 = var13 + Statics.field1664.method2744() * 60 / 100;
            int var15 = var14 + Statics.field87.method2744() * 2 / 100;
            int var16 = var15 + Statics.field1502.method2744() * 2 / 100;
            int var17 = var16 + Statics.field1663.method2744() * 2 / 100;
            int var18 = var17 + Statics.field2013.method2744() * 2 / 100;
            int var19 = var18 + Statics.field880.method2744() * 2 / 100;
            int var20 = var19 + Statics.field70.method2744() * 2 / 100;
            int var21 = var20 + Statics.field1254.method2744() * 2 / 100;
            int var22 = var21 + Statics.field990.method2744() * 2 / 100;
            if (var22 == 100) {
                class28.field635 = class142.field2134;
                class28.field651 = 30;
                field281 = 45;
            } else {
                if (var22 != 0) {
                    class28.field635 = class142.field2118 + var22 + "%";
                }
                class28.field651 = 30;
            }
        } else if (field281 == 45) {
            boolean var23 = !field258;
            Statics.field1088 = 22050;
            Statics.field1073 = var23;
            Statics.field1074 = 2;
            class162 var24 = new class162();
            var24.method2988(9, 128);
            Statics.field192 = class50.method2651(Statics.field777, Statics.field2015, 0, 22050);
            Statics.field192.method977(var24);
            class147 var25 = Statics.field990;
            class147 var26 = Statics.field1254;
            class147 var27 = Statics.field530;
            Statics.field2710 = var25;
            Statics.field2701 = var26;
            Statics.field2705 = var27;
            Statics.field2703 = var24;
            Statics.field2000 = class50.method2651(Statics.field777, Statics.field2015, 1, 2048);
            Statics.field585 = new class49();
            Statics.field2000.method977(Statics.field585);
            Statics.field544 = new class68(22050, Statics.field1088);
            class28.field635 = class142.field2294;
            class28.field651 = 35;
            field281 = 50;
        } else if (field281 == 50) {
            int var28 = 0;
            if (Statics.field2889 == null) {
                Statics.field2889 = class70.method2064(Statics.field87, Statics.field70, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field1290 == null) {
                Statics.field1290 = class70.method2064(Statics.field87, Statics.field70, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field511 == null) {
                Statics.field511 = class70.method2064(Statics.field87, Statics.field70, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class28.field635 = class142.field2136 + var28 * 100 / 3 + "%";
                class28.field651 = 40;
            } else {
                Statics.field59 = new class145(true);
                class28.field635 = class142.field2342;
                class28.field651 = 40;
                field281 = 60;
            }
        } else if (field281 == 60) {
            class147 var29 = Statics.field1663;
            class147 var30 = Statics.field87;
            int var31 = 0;
            if (var29.method2685("title.jpg", "")) {
                var31++;
            }
            if (var30.method2685("logo", "")) {
                var31++;
            }
            if (var30.method2685("titlebox", "")) {
                var31++;
            }
            if (var30.method2685("titlebutton", "")) {
                var31++;
            }
            if (var30.method2685("runes", "")) {
                var31++;
            }
            if (var30.method2685("title_mute", "")) {
                var31++;
            }
            if (var30.method2686("options_radio_buttons,0")) {
                var31++;
            }
            if (var30.method2686("options_radio_buttons,2")) {
                var31++;
            }
            var30.method2685("sl_back", "");
            var30.method2685("sl_flags", "");
            var30.method2685("sl_arrows", "");
            var30.method2685("sl_stars", "");
            var30.method2685("sl_button", "");
            int var34 = class28.method154();
            if (var31 < var34) {
                class28.field635 = class142.field2251 + var31 * 100 / var34 + "%";
                class28.field651 = 50;
            } else {
                class28.field635 = class142.field2139;
                class28.field651 = 50;
                method482(5);
                field281 = 70;
            }
        } else if (field281 == 70) {
            if (Statics.field1659.method2672()) {
                class41.method637(Statics.field1659);
                class147 var35 = Statics.field1659;
                Statics.field882 = var35;
                class147 var36 = Statics.field1659;
                class147 var37 = Statics.field1664;
                Statics.field947 = var36;
                Statics.field932 = var37;
                Statics.field933 = Statics.field947.method2740(3);
                class36.method498(Statics.field1659, Statics.field1664, field258);
                class147 var38 = Statics.field1659;
                class147 var39 = Statics.field1664;
                Statics.field2650 = var38;
                Statics.field792 = var39;
                class45.method515(Statics.field1659, Statics.field1664, field257, Statics.field2889);
                class38.method2052(Statics.field1659, Statics.field2444, Statics.field1052);
                class147 var40 = Statics.field1659;
                class147 var41 = Statics.field1664;
                Statics.field914 = var40;
                Statics.field913 = var41;
                class42.method564(Statics.field1659);
                class147 var42 = Statics.field1659;
                Statics.field1064 = var42;
                Statics.field1057 = Statics.field1064.method2740(16);
                class147 var43 = Statics.field2042;
                class147 var44 = Statics.field1664;
                class147 var45 = Statics.field87;
                class147 var46 = Statics.field70;
                Statics.field2506 = var43;
                Statics.field2558 = var44;
                Statics.field2599 = var45;
                Statics.field2755 = var46;
                Statics.field2618 = new class152[Statics.field2506.method2679()][];
                Statics.field2505 = new boolean[Statics.field2506.method2679()];
                class147 var47 = Statics.field1659;
                Statics.field995 = var47;
                class147 var48 = Statics.field1659;
                Statics.field977 = var48;
                class28.field635 = class142.field2141;
                class28.field651 = 60;
                field281 = 80;
            } else {
                class28.field635 = class142.field2165 + Statics.field1659.method2750() + "%";
                class28.field651 = 60;
            }
        } else if (field281 == 80) {
            int var49 = 0;
            if (Statics.field2637 == null) {
                Statics.field2637 = class70.method888(Statics.field87, "compass", "");
            } else {
                var49++;
            }
            if (Statics.field2635 == null) {
                Statics.field2635 = class70.method888(Statics.field87, "mapedge", "");
            } else {
                var49++;
            }
            if (Statics.field1425 == null) {
                Statics.field1425 = class70.method569(Statics.field87, "mapscene", "");
            } else {
                var49++;
            }
            if (Statics.field1846 == null) {
                Statics.field1846 = class70.method32(Statics.field87, "mapfunction", "");
            } else {
                var49++;
            }
            if (Statics.field1806 == null) {
                Statics.field1806 = class70.method32(Statics.field87, "hitmarks", "");
            } else {
                var49++;
            }
            if (Statics.field125 == null) {
                Statics.field125 = class70.method32(Statics.field87, "headicons_pk", "");
            } else {
                var49++;
            }
            if (Statics.field158 == null) {
                Statics.field158 = class70.method32(Statics.field87, "headicons_prayer", "");
            } else {
                var49++;
            }
            if (Statics.field1870 == null) {
                Statics.field1870 = class70.method32(Statics.field87, "headicons_hint", "");
            } else {
                var49++;
            }
            if (Statics.field604 == null) {
                Statics.field604 = class70.method32(Statics.field87, "mapmarker", "");
            } else {
                var49++;
            }
            if (Statics.field124 == null) {
                Statics.field124 = class70.method32(Statics.field87, "cross", "");
            } else {
                var49++;
            }
            if (Statics.field1431 == null) {
                Statics.field1431 = class70.method32(Statics.field87, "mapdots", "");
            } else {
                var49++;
            }
            if (Statics.field329 == null) {
                Statics.field329 = class70.method569(Statics.field87, "scrollbar", "");
            } else {
                var49++;
            }
            if (Statics.field15 == null) {
                Statics.field15 = class70.method569(Statics.field87, "mod_icons", "");
            } else {
                var49++;
            }
            if (Statics.field2816 == null) {
                Statics.field2816 = class70.method4(Statics.field87, "mapback", "");
            } else {
                var49++;
            }
            if (var49 < 14) {
                class28.field635 = class142.field2142 + var49 * 100 / 14 + "%";
                class28.field651 = 70;
            } else {
                Statics.field2901 = Statics.field15;
                Statics.field2635.method1410();
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 41.0D) - 20;
                for (int var54 = 0; var54 < Statics.field1846.length; var54++) {
                    Statics.field1846[var54].method1409(var50 + var53, var51 + var53, var52 + var53);
                }
                Statics.field1425[0].method1559(var50 + var53, var51 + var53, var52 + var53);
                method2638();
                class28.field635 = class142.field2345;
                class28.field651 = 70;
                field281 = 90;
            }
        } else if (field281 == 90) {
            if (Statics.field1502.method2672()) {
                class88 var55 = new class88(Statics.field1502, Statics.field87, 20, 0.8D, field258 ? 64 : 128);
                class84.method1803(var55);
                class84.method1778(0.8D);
                class28.field635 = class142.field2145;
                class28.field651 = 90;
                field281 = 110;
            } else {
                class28.field635 = class142.field2353 + Statics.field1502.method2750() + "%";
                class28.field651 = 90;
            }
        } else if (field281 == 110) {
            Statics.field24 = new class12();
            Statics.field777.method2458(Statics.field24, 10);
            class28.field635 = class142.field2146;
            class28.field651 = 94;
            field281 = 120;
        } else if (field281 == 120) {
            if (Statics.field1663.method2685("huffman", "")) {
                class102 var56 = new class102(Statics.field1663.method2684("huffman", ""));
                Statics.field2891 = var56;
                class28.field635 = class142.field2229;
                class28.field651 = 96;
                field281 = 130;
            } else {
                class28.field635 = class142.field2147 + "%";
                class28.field651 = 96;
            }
        } else if (field281 == 130) {
            if (!Statics.field2042.method2672()) {
                class28.field635 = class142.field2149 + Statics.field2042.method2750() * 4 / 5 + "%";
                class28.field651 = 100;
            } else if (!Statics.field880.method2672()) {
                class28.field635 = class142.field2149 + (80 + Statics.field880.method2750() / 6) + "%";
                class28.field651 = 100;
            } else if (Statics.field70.method2672()) {
                class28.field635 = class142.field2226;
                class28.field651 = 100;
                field281 = 140;
            } else {
                class28.field635 = class142.field2149 + (96 + Statics.field70.method2750() / 20) + "%";
                class28.field651 = 100;
            }
        } else if (field281 == 140) {
            method482(10);
        }
    }

    @ObfuscatedName("ai.u(IZZZI)Leh;")
    public static class147 method755(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2064 != null) {
            var4 = new class121(arg0, class136.field2064, Statics.field164[arg0], 1000000);
        }
        return new class147(var4, Statics.field887, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ej.r(B)V")
    public static void method2638() {
        Statics.field1079 = new int[33];
        Statics.field1867 = new int[33];
        Statics.field1856 = new int[151];
        Statics.field1026 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field2816.field1319[Statics.field2816.field1318 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1079[var0] = var1;
            Statics.field1867[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field2816.field1319[Statics.field2816.field1318 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1856[var4 - 5] = var5 - 25;
            Statics.field1026[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("n.z(I)V")
    public static final void method109() {
        try {
            if (field285 == 0) {
                if (Statics.field1893 != null) {
                    Statics.field1893.method2554();
                    Statics.field1893 = null;
                }
                Statics.field1891 = null;
                field314 = false;
                field286 = 0;
                field285 = 1;
            }
            if (field285 == 1) {
                if (Statics.field1891 == null) {
                    Statics.field1891 = Statics.field777.method2451(Statics.field2086, Statics.field123);
                }
                if (Statics.field1891.field2036 == 2) {
                    throw new IOException();
                }
                if (Statics.field1891.field2036 == 1) {
                    Statics.field1893 = new class130((Socket) Statics.field1891.field2039, Statics.field777);
                    Statics.field1891 = null;
                    field285 = 2;
                }
            }
            if (field285 == 2) {
                field460.field1827 = 0;
                field460.method2168(14);
                Statics.field1893.method2557(field460.field1826, 0, 1);
                field402.field1827 = 0;
                field285 = 3;
            }
            if (field285 == 3) {
                if (Statics.field192 != null) {
                    Statics.field192.method998();
                }
                if (Statics.field2000 != null) {
                    Statics.field2000.method998();
                }
                int var0 = Statics.field1893.method2561();
                if (Statics.field192 != null) {
                    Statics.field192.method998();
                }
                if (Statics.field2000 != null) {
                    Statics.field2000.method998();
                }
                if (var0 != 0) {
                    method6(var0);
                    return;
                }
                field402.field1827 = 0;
                field285 = 5;
            }
            if (field285 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field460.field1827 = 0;
                field460.method2168(1);
                field460.method2168(class28.field659.method460());
                field460.method2174(var1[0]);
                field460.method2174(var1[1]);
                field460.method2174(var1[2]);
                field460.method2174(var1[3]);
                switch(class28.field659.field2385) {
                    case 0:
                    case 1:
                        field460.method2106(Statics.field1504);
                        field460.field1827 += 5;
                        break;
                    case 2:
                        field460.method2174((Integer) Statics.field1998.field139.get(class199.method144(class28.field641)));
                        field460.field1827 += 4;
                        break;
                    case 3:
                        field460.field1827 += 8;
                }
                field460.method2255(class28.field658);
                field460.method2136(class5.field66, class5.field63);
                field298.field1827 = 0;
                if (field260 == 40) {
                    field298.method2168(18);
                } else {
                    field298.method2168(16);
                }
                field298.method2185(0);
                int var2 = field298.field1827;
                field298.method2174(55);
                field298.method2112(field460.field1826, 0, field460.field1827);
                int var3 = field298.field1827;
                field298.method2255(class28.field641);
                field298.method2168(field258 ? 1 : 0);
                class110 var4 = field298;
                byte[] var5 = new byte[24];
                try {
                    class136.field2057.method3400(0L);
                    class136.field2057.method3413(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var40) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2112(var5, 0, 24);
                class107 var9 = new class107(Statics.field59.method2658());
                Statics.field59.method2659(var9);
                field298.method2112(var9.field1826, 0, var9.field1826.length);
                field298.method2174(Statics.field2444.field2435);
                field298.method2174(Statics.field1052.field2435);
                field298.method2174(Statics.field1659.field2435);
                field298.method2174(Statics.field2042.field2435);
                field298.method2174(Statics.field530.field2435);
                field298.method2174(Statics.field1795.field2435);
                field298.method2174(Statics.field2083.field2435);
                field298.method2174(Statics.field1664.field2435);
                field298.method2174(Statics.field87.field2435);
                field298.method2174(Statics.field1502.field2435);
                field298.method2174(Statics.field1663.field2435);
                field298.method2174(Statics.field2013.field2435);
                field298.method2174(Statics.field880.field2435);
                field298.method2174(Statics.field70.field2435);
                field298.method2174(Statics.field1254.field2435);
                field298.method2174(Statics.field990.field2435);
                field298.method2134(var1, var3, field298.field1827);
                field298.method2114(field298.field1827 - var2);
                Statics.field1893.method2557(field298.field1826, 0, field298.field1827);
                field460.method2338(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field402.method2338(var1);
                field285 = 6;
            }
            if (field285 == 6 && Statics.field1893.method2555() > 0) {
                int var11 = Statics.field1893.method2561();
                if (var11 == 21 && field260 == 20) {
                    field285 = 7;
                } else if (var11 == 2) {
                    field285 = 9;
                } else if (var11 == 15 && field260 == 40) {
                    method1878();
                    return;
                } else if (var11 == 23 && field287 < 1) {
                    field287++;
                    field285 = 0;
                } else {
                    method6(var11);
                    return;
                }
            }
            if (field285 == 7 && Statics.field1893.method2555() > 0) {
                field288 = (Statics.field1893.method2561() + 3) * 60;
                field285 = 8;
            }
            if (field285 == 8) {
                field286 = 0;
                class28.method1767(class142.field2195, class142.field2138, field288 / 60 + class142.field2156);
                if (--field288 <= 0) {
                    field285 = 0;
                }
            } else {
                if (field285 == 9 && Statics.field1893.method2555() >= 13) {
                    boolean var12 = Statics.field1893.method2561() == 1;
                    Statics.field1893.method2559(field402.field1826, 0, 4);
                    field402.field1827 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field402.method2353() << 24;
                        int var15 = var14 | field402.method2353() << 16;
                        int var16 = var15 | field402.method2353() << 8;
                        int var17 = var16 | field402.method2353();
                        int var18 = class199.method144(class28.field641);
                        if (Statics.field1998.field139.size() >= 10 && !Statics.field1998.field139.containsKey(var18)) {
                            Iterator var19 = Statics.field1998.field139.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field1998.field139.put(var18, var17);
                        class9.method84();
                    }
                    field469 = Statics.field1893.method2561();
                    field344 = Statics.field1893.method2561() == 1;
                    field262 = Statics.field1893.method2561();
                    field262 <<= 0x8;
                    field262 += Statics.field1893.method2561();
                    field467 = Statics.field1893.method2561();
                    Statics.field1893.method2559(field402.field1826, 0, 1);
                    field402.field1827 = 0;
                    field421 = field402.method2353();
                    Statics.field1893.method2559(field402.field1826, 0, 2);
                    field402.field1827 = 0;
                    field295 = field402.method2120();
                    if (field467 == 1) {
                        try {
                            class119.method2423(Statics.field250, "zap");
                        } catch (Throwable var39) {
                        }
                    } else {
                        try {
                            class119.method2423(Statics.field250, "unzap");
                        } catch (Throwable var38) {
                        }
                    }
                    field285 = 10;
                }
                if (field285 != 10) {
                    field286++;
                    if (field286 > 2000) {
                        if (field287 < 1) {
                            if (Statics.field943 == Statics.field123) {
                                Statics.field123 = Statics.field621;
                            } else {
                                Statics.field123 = Statics.field943;
                            }
                            field287++;
                            field285 = 0;
                        } else {
                            method6(-3);
                        }
                    }
                } else if (Statics.field1893.method2555() >= field295) {
                    field402.field1827 = 0;
                    Statics.field1893.method2559(field402.field1826, 0, field295);
                    field263 = 1L;
                    field266 = -1;
                    Statics.field24.field175 = 0;
                    Statics.field1798 = true;
                    field267 = true;
                    field474 = -1L;
                    class189.field2878 = new class180();
                    field460.field1827 = 0;
                    field402.field1827 = 0;
                    field421 = -1;
                    field300 = -1;
                    field301 = -1;
                    field302 = -1;
                    field417 = 0;
                    field252 = 0;
                    field299 = 0;
                    field270 = 0;
                    field358 = 0;
                    field395 = false;
                    class127.field1982 = 0;
                    class10.field156.clear();
                    class10.field154.method3154();
                    class10.field151.method3203();
                    class10.field152 = 0;
                    field407 = 0;
                    field409 = false;
                    field490 = 0;
                    field316 = (int) (Math.random() * 100.0D) - 50;
                    field289 = (int) (Math.random() * 110.0D) - 55;
                    field320 = (int) (Math.random() * 80.0D) - 40;
                    field323 = (int) (Math.random() * 120.0D) - 60;
                    field450 = (int) (Math.random() * 30.0D) - 20;
                    field337 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field492 = 0;
                    field477 = -1;
                    field282 = 0;
                    field483 = 0;
                    field324 = class18.field515;
                    field373 = 0;
                    field424 = 0;
                    for (int var22 = 0; var22 < 2048; var22++) {
                        field310[var22] = null;
                        field391[var22] = null;
                    }
                    for (int var23 = 0; var23 < 32768; var23++) {
                        field271[var23] = null;
                    }
                    Statics.field994 = field310[2047] = new class3();
                    field507 = -1;
                    field389.method3174();
                    field390.method3174();
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 104; var25++) {
                            for (int var26 = 0; var26 < 104; var26++) {
                                field387[var24][var25][var26] = null;
                            }
                        }
                    }
                    field388 = new class177();
                    field503 = 0;
                    field502 = 0;
                    field506 = 0;
                    for (int var27 = 0; var27 < Statics.field1057; var27++) {
                        class46 var28 = (class46) class46.field1058.method3099((long) var27);
                        class46 var29;
                        if (var28 == null) {
                            byte[] var30 = Statics.field1064.method2668(16, var27);
                            class46 var31 = new class46();
                            if (var30 != null) {
                                var31.method880(new class107(var30));
                            }
                            class46.field1058.method3101(var31, (long) var27);
                            var29 = var31;
                        } else {
                            var29 = var28;
                        }
                        if (var29 != null) {
                            class154.field2644[var27] = 0;
                            class154.field2642[var27] = 0;
                        }
                    }
                    for (int var33 = 0; var33 < field449.length; var33++) {
                        field449[var33] = -1;
                    }
                    field422 = -1;
                    if (field416 != -1) {
                        class152.method2771(field416);
                    }
                    for (class4 var34 = (class4) field415.method3134(); var34 != null; var34 = (class4) field415.method3135()) {
                        method1770(var34, true);
                    }
                    field416 = -1;
                    field415 = new class174(8);
                    field418 = null;
                    field395 = false;
                    field358 = 0;
                    field374.method2867((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var35 = 0; var35 < 8; var35++) {
                        field508[var35] = null;
                        field384[var35] = false;
                    }
                    class14.method614();
                    field261 = true;
                    for (int var36 = 0; var36 < 100; var36++) {
                        field444[var36] = true;
                    }
                    field475 = null;
                    Statics.field2640 = 0;
                    Statics.field1685 = null;
                    Statics.field1916 = -1;
                    method121(false);
                    field421 = -1;
                }
            }
        } catch (IOException var41) {
            if (field287 < 1) {
                if (Statics.field943 == Statics.field123) {
                    Statics.field123 = Statics.field621;
                } else {
                    Statics.field123 = Statics.field943;
                }
                field287++;
                field285 = 0;
            } else {
                method6(-2);
            }
        }
    }

    @ObfuscatedName("cj.v(I)V")
    public static void method1878() {
        field460.field1827 = 0;
        field402.field1827 = 0;
        field421 = -1;
        field300 = -1;
        field301 = -1;
        field302 = -1;
        field295 = 0;
        field417 = 0;
        field252 = 0;
        field358 = 0;
        field395 = false;
        field492 = 0;
        field282 = 0;
        for (int var0 = 0; var0 < field310.length; var0++) {
            if (field310[var0] != null) {
                field310[var0].field746 = -1;
            }
        }
        for (int var1 = 0; var1 < field271.length; var1++) {
            if (field271[var1] != null) {
                field271[var1].field746 = -1;
            }
        }
        class14.method614();
        method482(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field444[var2] = true;
        }
    }

    @ObfuscatedName("o.k(IB)V")
    public static void method6(int arg0) {
        if (arg0 == -3) {
            class28.method1767(class142.field2157, class142.field2158, class142.field2159);
        } else if (arg0 == -2) {
            class28.method1767(class142.field2160, class142.field2161, class142.field2162);
        } else if (arg0 == -1) {
            class28.method1767(class142.field2163, class142.field2164, class142.field2270);
        } else if (arg0 == 3) {
            class28.method1767(class142.field2166, class142.field2167, class142.field2308);
        } else if (arg0 == 4) {
            class28.method1767(class142.field2169, class142.field2124, class142.field2171);
        } else if (arg0 == 5) {
            class28.method1767(class142.field2220, class142.field2269, class142.field2184);
        } else if (arg0 == 6) {
            class28.method1767(class142.field2175, class142.field2176, class142.field2177);
        } else if (arg0 == 7) {
            class28.method1767(class142.field2178, class142.field2179, class142.field2306);
        } else if (arg0 == 8) {
            class28.method1767(class142.field2181, class142.field2182, class142.field2330);
        } else if (arg0 == 9) {
            class28.method1767(class142.field2191, class142.field2185, class142.field2186);
        } else if (arg0 == 10) {
            class28.method1767(class142.field2274, class142.field2188, class142.field2189);
        } else if (arg0 == 11) {
            class28.method1767(class142.field2190, class142.field2338, class142.field2192);
        } else if (arg0 == 12) {
            class28.method1767(class142.field2193, class142.field2194, class142.field2238);
        } else if (arg0 == 13) {
            class28.method1767(class142.field2326, class142.field2197, class142.field2198);
        } else if (arg0 == 14) {
            class28.method1767(class142.field2199, class142.field2200, class142.field2137);
        } else if (arg0 == 16) {
            class28.method1767(class142.field2202, class142.field2203, class142.field2204);
        } else if (arg0 == 17) {
            class28.method1767(class142.field2205, class142.field2206, class142.field2207);
        } else if (arg0 == 18) {
            class28.method1767(class142.field2208, class142.field2119, class142.field2210);
        } else if (arg0 == 19) {
            class28.method1767(class142.field2211, class142.field2212, class142.field2126);
        } else if (arg0 == 20) {
            class28.method1767(class142.field2214, class142.field2215, class142.field2237);
        } else if (arg0 == 22) {
            class28.method1767(class142.field2300, class142.field2218, class142.field2343);
        } else if (arg0 == 23) {
            class28.method1767(class142.field2183, class142.field2244, class142.field2222);
        } else if (arg0 == 24) {
            class28.method1767(class142.field2209, class142.field2348, class142.field2225);
        } else if (arg0 == 25) {
            class28.method1767(class142.field2314, class142.field2245, class142.field2228);
        } else if (arg0 == 26) {
            class28.method1767(class142.field2217, class142.field2230, class142.field2231);
        } else if (arg0 == 27) {
            class28.method1767(class142.field2232, class142.field2280, class142.field2359);
        } else if (arg0 == 31) {
            class28.method1767(class142.field2241, class142.field2242, class142.field2140);
        } else if (arg0 == 32) {
            class28.method1767(class142.field2285, class142.field2249, class142.field2297);
        } else if (arg0 == 37) {
            class28.method1767(class142.field2260, class142.field2248, class142.field2154);
        } else if (arg0 == 38) {
            class28.method1767(class142.field2233, class142.field2180, class142.field2252);
        } else if (arg0 == 55) {
            class28.method1767(class142.field2253, class142.field2254, class142.field2255);
        } else if (arg0 == 56) {
            class28.method1767(class142.field2256, class142.field2257, class142.field2258);
            method482(11);
            return;
        } else if (arg0 == 57) {
            class28.method1767(class142.field2295, class142.field2216, class142.field2363);
            method482(11);
            return;
        } else {
            class28.method1767(class142.field2262, class142.field2263, class142.field2339);
        }
        method482(10);
    }

    @ObfuscatedName("dl.a(I)V")
    public static final void method2465() {
        if (Statics.field1893 != null) {
            Statics.field1893.method2554();
            Statics.field1893 = null;
        }
        method31();
        Statics.field336.method1591();
        for (int var0 = 0; var0 < 4; var0++) {
            field318[var0].method3425();
        }
        System.gc();
        class161.method1966(2);
        field486 = -1;
        field487 = false;
        for (class20 var1 = (class20) class20.field542.method3170(); var1 != null; var1 = (class20) class20.field542.method3172()) {
            if (var1.field540 != null) {
                Statics.field585.method936(var1.field540);
                var1.field540 = null;
            }
            if (var1.field541 != null) {
                Statics.field585.method936(var1.field541);
                var1.field541 = null;
            }
        }
        class20.field542.method3174();
        method482(10);
    }

    @ObfuscatedName("c.d(I)V")
    public static final void method31() {
        class41.field961.method3104();
        class37.method151();
        class40.method2336();
        class36.field827.method3104();
        class36.field828.method3104();
        class36.field854.method3104();
        class36.field830.method3104();
        class35.method478();
        class45.method1852();
        class38.field898.method3104();
        class38.field895.method3104();
        class39.field915.method3104();
        class39.field929.method3104();
        class42.field968.method3104();
        class46.method1859();
        class157.field2658.method3104();
        class152.field2509.method3104();
        class152.field2510.method3104();
        class152.field2511.method3104();
        ((class88) Statics.field1466).method1864();
        class19.field524.method3104();
        Statics.field2444.method2742();
        Statics.field1052.method2742();
        Statics.field2042.method2742();
        Statics.field530.method2742();
        Statics.field1795.method2742();
        Statics.field2083.method2742();
        Statics.field1664.method2742();
        Statics.field87.method2742();
        Statics.field1502.method2742();
        Statics.field1663.method2742();
        Statics.field2013.method2742();
        Statics.field880.method2742();
    }

    @ObfuscatedName("eq.j(I)V")
    public static final void method2655() {
        if (field299 > 0) {
            method2465();
        } else {
            method482(40);
            Statics.field1869 = Statics.field1893;
            Statics.field1893 = null;
        }
    }

    @ObfuscatedName("eo.s(B)V")
    public static final void method2848() {
        if (Statics.field2000 != null) {
            Statics.field2000.method972();
        }
        if (Statics.field192 != null) {
            Statics.field192.method972();
        }
    }

    @ObfuscatedName("bz.f(Lab;IIII)V")
    public static void method1306(class38 arg0, int arg1, int arg2, int arg3) {
        if (field490 >= 50 || field371 == 0 || arg0.field899 == null || arg1 >= arg0.field899.length) {
            return;
        }
        int var4 = arg0.field899[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field489[field490] = var5;
        field480[field490] = var6;
        field493[field490] = 0;
        field293[field490] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field494[field490] = (var8 << 16) + (var9 << 8) + var7;
        field490++;
    }

    @ObfuscatedName("fd.e(IIIB)V")
    public static void method3094(int arg0, int arg1, int arg2) {
        if (field488 == 0 || arg1 == 0 || field490 >= 50) {
            return;
        }
        field489[field490] = arg0;
        field480[field490] = arg1;
        field493[field490] = arg2;
        field293[field490] = null;
        field494[field490] = 0;
        field490++;
    }

    @ObfuscatedName("cg.q(III)V")
    public static void method2053(int arg0, int arg1) {
        if (field346 != 0 && arg0 != -1) {
            class161.method2649(Statics.field2013, arg0, 0, field346, false);
            field487 = true;
        }
    }

    @ObfuscatedName("p.al(I)V")
    public static final void method28() {
        if (field258 && Statics.field221 != field305) {
            method770(Statics.field1916, Statics.field873, Statics.field221, Statics.field994.field769[0], Statics.field994.field759[0]);
        } else if (Statics.field221 != field477) {
            field477 = Statics.field221;
            method517(Statics.field221);
        }
    }

    @ObfuscatedName("b.ao(Ljava/lang/String;B)V")
    public static final void method143(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1998.field137 = !Statics.field1998.field137;
            class9.method84();
            if (Statics.field1998.field137) {
                class10.method9(99, "", "Roofs are now all hidden");
            } else {
                class10.method9(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field469 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field406 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field406 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2655();
            }
            if (arg0.equalsIgnoreCase("errortest") && field254 == 2) {
                throw new RuntimeException();
            }
        }
        field460.method2339(32);
        field460.method2168(arg0.length() + 1);
        field460.method2255(arg0);
    }

    @ObfuscatedName("dr.ap(I)V")
    public static final void method2401() {
        for (int var0 = -1; var0 < field373; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field275[var0];
            }
            class3 var2 = field310[var1];
            if (var2 != null) {
                method522(var2, 1);
            }
        }
    }

    @ObfuscatedName("y.aa(I)V")
    public static final void method72() {
        for (int var0 = 0; var0 < field424; var0++) {
            int var1 = field497[var0];
            class30 var2 = field271[var1];
            if (var2 != null) {
                method522(var2, var2.field686.field791);
            }
        }
    }

    @ObfuscatedName("q.ak(Las;II)V")
    public static final void method522(class33 arg0, int arg1) {
        if (arg0.field760 > field274) {
            method598(arg0);
        } else if (arg0.field761 >= field274) {
            if (field274 == arg0.field761 || arg0.field740 == -1 || arg0.field749 != 0 || arg0.field721 + 1 > class38.method1579(arg0.field740).field905[arg0.field747]) {
                int var2 = arg0.field761 - arg0.field760;
                int var3 = field274 - arg0.field760;
                int var4 = arg0.field722 * 128 + arg0.field720 * 64;
                int var5 = arg0.field758 * 128 + arg0.field720 * 64;
                int var6 = arg0.field757 * 128 + arg0.field720 * 64;
                int var7 = arg0.field732 * 128 + arg0.field720 * 64;
                arg0.field743 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field717 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field772 = 0;
            if (arg0.field719 == 0) {
                arg0.field765 = 1024;
            }
            if (arg0.field719 == 1) {
                arg0.field765 = 1536;
            }
            if (arg0.field719 == 2) {
                arg0.field765 = 0;
            }
            if (arg0.field719 == 3) {
                arg0.field765 = 512;
            }
            arg0.field718 = arg0.field765;
        } else {
            arg0.field762 = arg0.field754;
            if (arg0.field768 == 0) {
                arg0.field772 = 0;
            } else {
                label234: {
                    if (arg0.field740 != -1 && arg0.field749 == 0) {
                        class38 var8 = class38.method1579(arg0.field740);
                        if (arg0.field750 > 0 && var8.field891 == 0) {
                            arg0.field772++;
                            break label234;
                        }
                        if (arg0.field750 <= 0 && var8.field907 == 0) {
                            arg0.field772++;
                            break label234;
                        }
                    }
                    int var9 = arg0.field743;
                    int var10 = arg0.field717;
                    int var11 = arg0.field769[arg0.field768 - 1] * 128 + arg0.field720 * 64;
                    int var12 = arg0.field759[arg0.field768 - 1] * 128 + arg0.field720 * 64;
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        if (var9 < var11) {
                            if (var10 < var12) {
                                arg0.field765 = 1280;
                            } else if (var10 > var12) {
                                arg0.field765 = 1792;
                            } else {
                                arg0.field765 = 1536;
                            }
                        } else if (var9 > var11) {
                            if (var10 < var12) {
                                arg0.field765 = 768;
                            } else if (var10 > var12) {
                                arg0.field765 = 256;
                            } else {
                                arg0.field765 = 512;
                            }
                        } else if (var10 < var12) {
                            arg0.field765 = 1024;
                        } else if (var10 > var12) {
                            arg0.field765 = 0;
                        }
                        int var13 = arg0.field765 - arg0.field718 & 0x7FF;
                        if (var13 > 1024) {
                            var13 -= 2048;
                        }
                        int var14 = arg0.field748;
                        if (var13 >= -256 && var13 <= 256) {
                            var14 = arg0.field725;
                        } else if (var13 >= 256 && var13 < 768) {
                            var14 = arg0.field727;
                        } else if (var13 >= -768 && var13 <= -256) {
                            var14 = arg0.field726;
                        }
                        if (var14 == -1) {
                            var14 = arg0.field725;
                        }
                        arg0.field762 = var14;
                        int var15 = 4;
                        boolean var16 = true;
                        if (arg0 instanceof class30) {
                            var16 = ((class30) arg0).field686.field819;
                        }
                        if (var16) {
                            if (arg0.field765 != arg0.field718 && arg0.field746 == -1 && arg0.field767 != 0) {
                                var15 = 2;
                            }
                            if (arg0.field768 > 2) {
                                var15 = 6;
                            }
                            if (arg0.field768 > 3) {
                                var15 = 8;
                            }
                            if (arg0.field772 > 0 && arg0.field768 > 1) {
                                var15 = 8;
                                arg0.field772--;
                            }
                        } else {
                            if (arg0.field768 > 1) {
                                var15 = 6;
                            }
                            if (arg0.field768 > 2) {
                                var15 = 8;
                            }
                            if (arg0.field772 > 0 && arg0.field768 > 1) {
                                var15 = 8;
                                arg0.field772--;
                            }
                        }
                        if (arg0.field771[arg0.field768 - 1]) {
                            var15 <<= 0x1;
                        }
                        if (var15 >= 8 && arg0.field762 == arg0.field725 && arg0.field728 != -1) {
                            arg0.field762 = arg0.field728;
                        }
                        if (var9 < var11) {
                            arg0.field743 += var15;
                            if (arg0.field743 > var11) {
                                arg0.field743 = var11;
                            }
                        } else if (var9 > var11) {
                            arg0.field743 -= var15;
                            if (arg0.field743 < var11) {
                                arg0.field743 = var11;
                            }
                        }
                        if (var10 < var12) {
                            arg0.field717 += var15;
                            if (arg0.field717 > var12) {
                                arg0.field717 = var12;
                            }
                        } else if (var10 > var12) {
                            arg0.field717 -= var15;
                            if (arg0.field717 < var12) {
                                arg0.field717 = var12;
                            }
                        }
                        if (arg0.field743 == var11 && arg0.field717 == var12) {
                            arg0.field768--;
                            if (arg0.field750 > 0) {
                                arg0.field750--;
                            }
                        }
                    } else {
                        arg0.field743 = var11;
                        arg0.field717 = var12;
                    }
                }
            }
        }
        if (arg0.field743 < 128 || arg0.field717 < 128 || arg0.field743 >= 13184 || arg0.field717 >= 13184) {
            arg0.field740 = -1;
            arg0.field751 = -1;
            arg0.field760 = 0;
            arg0.field761 = 0;
            arg0.field743 = arg0.field769[0] * 128 + arg0.field720 * 64;
            arg0.field717 = arg0.field759[0] * 128 + arg0.field720 * 64;
            arg0.method586();
        }
        if (Statics.field994 == arg0 && (arg0.field743 < 1536 || arg0.field717 < 1536 || arg0.field743 >= 11776 || arg0.field717 >= 11776)) {
            arg0.field740 = -1;
            arg0.field751 = -1;
            arg0.field760 = 0;
            arg0.field761 = 0;
            arg0.field743 = arg0.field769[0] * 128 + arg0.field720 * 64;
            arg0.field717 = arg0.field759[0] * 128 + arg0.field720 * 64;
            arg0.method586();
        }
        method142(arg0);
        method518(arg0);
    }

    @ObfuscatedName("as.ah(Las;B)V")
    public static final void method598(class33 arg0) {
        int var1 = arg0.field760 - field274;
        int var2 = arg0.field722 * 128 + arg0.field720 * 64;
        int var3 = arg0.field758 * 128 + arg0.field720 * 64;
        arg0.field743 += (var2 - arg0.field743) / var1;
        arg0.field717 += (var3 - arg0.field717) / var1;
        arg0.field772 = 0;
        if (arg0.field719 == 0) {
            arg0.field765 = 1024;
        }
        if (arg0.field719 == 1) {
            arg0.field765 = 1536;
        }
        if (arg0.field719 == 2) {
            arg0.field765 = 0;
        }
        if (arg0.field719 == 3) {
            arg0.field765 = 512;
        }
    }

    @ObfuscatedName("b.as(Las;I)V")
    public static final void method142(class33 arg0) {
        if (arg0.field767 == 0) {
            return;
        }
        if (arg0.field746 != -1 && arg0.field746 < 32768) {
            class30 var1 = field271[arg0.field746];
            if (var1 != null) {
                int var2 = arg0.field743 - var1.field743;
                int var3 = arg0.field717 - var1.field717;
                if (var2 != 0 || var3 != 0) {
                    arg0.field765 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field746 >= 32768) {
            int var4 = arg0.field746 - 32768;
            if (field262 == var4) {
                var4 = 2047;
            }
            class3 var5 = field310[var4];
            if (var5 != null) {
                int var6 = arg0.field743 - var5.field743;
                int var7 = arg0.field717 - var5.field717;
                if (var6 != 0 || var7 != 0) {
                    arg0.field765 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field741 != 0 || arg0.field742 != 0) && (arg0.field768 == 0 || arg0.field772 > 0)) {
            int var8 = arg0.field743 - (arg0.field741 * 64 - Statics.field304 * 64 - Statics.field304 * 64);
            int var9 = arg0.field717 - (arg0.field742 * 64 - Statics.field671 * 64 - Statics.field671 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field765 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field741 = 0;
            arg0.field742 = 0;
        }
        int var10 = arg0.field765 - arg0.field718 & 0x7FF;
        if (var10 == 0) {
            arg0.field766 = 0;
            return;
        }
        arg0.field766++;
        if (var10 > 1024) {
            arg0.field718 -= arg0.field767;
            boolean var11 = true;
            if (var10 < arg0.field767 || var10 > 2048 - arg0.field767) {
                arg0.field718 = arg0.field765;
                var11 = false;
            }
            if (arg0.field762 == arg0.field754 && (arg0.field766 > 25 || var11)) {
                if (arg0.field716 == -1) {
                    arg0.field762 = arg0.field725;
                } else {
                    arg0.field762 = arg0.field716;
                }
            }
        } else {
            arg0.field718 += arg0.field767;
            boolean var12 = true;
            if (var10 < arg0.field767 || var10 > 2048 - arg0.field767) {
                arg0.field718 = arg0.field765;
                var12 = false;
            }
            if (arg0.field762 == arg0.field754 && (arg0.field766 > 25 || var12)) {
                if (arg0.field752 == -1) {
                    arg0.field762 = arg0.field725;
                } else {
                    arg0.field762 = arg0.field752;
                }
            }
        }
        arg0.field718 &= 0x7FF;
    }

    @ObfuscatedName("e.aw(Las;I)V")
    public static final void method518(class33 arg0) {
        arg0.field770 = false;
        if (arg0.field762 != -1) {
            class38 var1 = class38.method1579(arg0.field762);
            if (var1 == null || var1.field896 == null) {
                arg0.field762 = -1;
            } else {
                arg0.field745++;
                if (arg0.field737 < var1.field896.length && arg0.field745 > var1.field905[arg0.field737]) {
                    arg0.field745 = 1;
                    arg0.field737++;
                    method1306(var1, arg0.field737, arg0.field743, arg0.field717);
                }
                if (arg0.field737 >= var1.field896.length) {
                    arg0.field745 = 0;
                    arg0.field737 = 0;
                    method1306(var1, arg0.field737, arg0.field743, arg0.field717);
                }
            }
        }
        if (arg0.field751 != -1 && field274 >= arg0.field724) {
            if (arg0.field773 < 0) {
                arg0.field773 = 0;
            }
            int var2 = class39.method2654(arg0.field751).field912;
            if (var2 == -1) {
                arg0.field751 = -1;
            } else {
                class38 var3 = class38.method1579(var2);
                if (var3 == null || var3.field896 == null) {
                    arg0.field751 = -1;
                } else {
                    arg0.field753++;
                    if (arg0.field773 < var3.field896.length && arg0.field753 > var3.field905[arg0.field773]) {
                        arg0.field753 = 1;
                        arg0.field773++;
                        method1306(var3, arg0.field773, arg0.field743, arg0.field717);
                    }
                    if (arg0.field773 >= var3.field896.length && (arg0.field773 < 0 || arg0.field773 >= var3.field896.length)) {
                        arg0.field751 = -1;
                    }
                }
            }
        }
        if (arg0.field740 != -1 && arg0.field749 <= 1) {
            class38 var4 = class38.method1579(arg0.field740);
            if (var4.field891 == 1 && arg0.field750 > 0 && arg0.field760 <= field274 && arg0.field761 < field274) {
                arg0.field749 = 1;
                return;
            }
        }
        if (arg0.field740 != -1 && arg0.field749 == 0) {
            class38 var5 = class38.method1579(arg0.field740);
            if (var5 == null || var5.field896 == null) {
                arg0.field740 = -1;
            } else {
                arg0.field721++;
                if (arg0.field747 < var5.field896.length && arg0.field721 > var5.field905[arg0.field747]) {
                    arg0.field721 = 1;
                    arg0.field747++;
                    method1306(var5, arg0.field747, arg0.field743, arg0.field717);
                }
                if (arg0.field747 >= var5.field896.length) {
                    arg0.field747 -= var5.field900;
                    arg0.field744++;
                    if (arg0.field744 >= var5.field897) {
                        arg0.field740 = -1;
                    } else if (arg0.field747 >= 0 && arg0.field747 < var5.field896.length) {
                        method1306(var5, arg0.field747, arg0.field743, arg0.field717);
                    } else {
                        arg0.field740 = -1;
                    }
                }
                arg0.field770 = var5.field911;
            }
        }
        if (arg0.field749 > 0) {
            arg0.field749--;
        }
    }

    @ObfuscatedName("u.aj(Li;III)V")
    public static void method146(class3 arg0, int arg1, int arg2) {
        if (arg0.field740 == arg1 && arg1 != -1) {
            int var3 = class38.method1579(arg1).field909;
            if (var3 == 1) {
                arg0.field747 = 0;
                arg0.field721 = 0;
                arg0.field749 = arg2;
                arg0.field744 = 0;
            }
            if (var3 == 2) {
                arg0.field744 = 0;
            }
        } else if (arg1 == -1 || arg0.field740 == -1 || class38.method1579(arg1).field903 >= class38.method1579(arg0.field740).field903) {
            arg0.field740 = arg1;
            arg0.field747 = 0;
            arg0.field721 = 0;
            arg0.field749 = arg2;
            arg0.field744 = 0;
            arg0.field750 = arg0.field768;
        }
    }

    @ObfuscatedName("be.af(I)V")
    public static final void method1378() {
        if (field416 != -1) {
            int var0 = field416;
            if (class152.method1877(var0)) {
                method985(Statics.field2618[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field385; var1++) {
            if (field444[var1]) {
                field459[var1] = true;
            }
            field309[var1] = field444[var1];
            field444[var1] = false;
        }
        field273 = field274;
        field403 = -1;
        field404 = -1;
        Statics.field161 = null;
        if (field416 != -1) {
            field385 = 0;
            int var2 = field416;
            if (class152.method1877(var2)) {
                Statics.field138 = null;
                method115(Statics.field2618[var2], -1, 0, 0, 765, 503, 0, 0, -1);
                if (Statics.field138 != null) {
                    method115(Statics.field138, -1412584499, 0, 0, 765, 503, Statics.field1648, Statics.field2674, -1);
                    Statics.field138 = null;
                }
            } else {
                for (int var3 = 0; var3 < 100; var3++) {
                    field444[var3] = true;
                }
            }
        }
        class73.method1497();
        if (field395) {
            method582();
        } else if (field403 != -1) {
            int var4 = field403;
            int var5 = field404;
            if (field358 >= 2 || field407 != 0 || field409) {
                String var6;
                if (field407 == 1 && field358 < 2) {
                    var6 = class142.field2268 + class142.field2278 + field408 + " " + class2.field21;
                } else if (field409 && field358 < 2) {
                    var6 = field412 + class142.field2278 + field413 + " " + class2.field21;
                } else {
                    var6 = method2550(field358 - 1);
                }
                if (field358 > 2) {
                    var6 = var6 + class2.method2647(16777215) + " " + '/' + " " + (field358 - 2) + class142.field2272;
                }
                Statics.field511.method3328(var6, var4 + 4, var5 + 15, 16777215, 0, field274 / 1000);
            }
        }
        if (field465 == 3) {
            for (int var7 = 0; var7 < field385; var7++) {
                if (field309[var7]) {
                    class73.method1495(field461[var7], field462[var7], field431[var7], field464[var7], 16711935, 128);
                } else if (field459[var7]) {
                    class73.method1495(field461[var7], field462[var7], field431[var7], field464[var7], 16711680, 128);
                }
            }
        }
        int var8 = Statics.field221;
        int var9 = Statics.field994.field743;
        int var10 = Statics.field994.field717;
        int var11 = field328;
        for (class20 var12 = (class20) class20.field542.method3170(); var12 != null; var12 = (class20) class20.field542.method3172()) {
            if (var12.field550 != -1 || var12.field543 != null) {
                int var13 = 0;
                if (var9 > var12.field536) {
                    var13 += var9 - var12.field536;
                } else if (var9 < var12.field534) {
                    var13 += var12.field534 - var9;
                }
                if (var10 > var12.field537) {
                    var13 += var10 - var12.field537;
                } else if (var10 < var12.field535) {
                    var13 += var12.field535 - var10;
                }
                if (var13 - 64 > var12.field538 || field371 == 0 || var12.field551 != var8) {
                    if (var12.field540 != null) {
                        Statics.field585.method936(var12.field540);
                        var12.field540 = null;
                    }
                    if (var12.field541 != null) {
                        Statics.field585.method936(var12.field541);
                        var12.field541 = null;
                    }
                } else {
                    var13 -= 64;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var14 = field371 * (var12.field538 - var13) / var12.field538;
                    class52 var10000;
                    if (var12.field540 != null) {
                        var12.field540.method1217(var14);
                    } else if (var12.field550 >= 0) {
                        var10000 = (class52) null;
                        class52 var15 = class52.method1018(Statics.field530, var12.field550, 0);
                        if (var15 != null) {
                            class56 var16 = var15.method1014().method1054(Statics.field544);
                            class58 var17 = class58.method1164(var16, 100, var14);
                            var17.method1206(-1);
                            Statics.field585.method935(var17);
                            var12.field540 = var17;
                        }
                    }
                    if (var12.field541 != null) {
                        var12.field541.method1217(var14);
                        if (!var12.field541.method3266()) {
                            var12.field541 = null;
                        }
                    } else if (var12.field543 != null && (var12.field532 -= var11) <= 0) {
                        int var18 = (int) (Math.random() * (double) var12.field543.length);
                        var10000 = (class52) null;
                        class52 var19 = class52.method1018(Statics.field530, var12.field543[var18], 0);
                        if (var19 != null) {
                            class56 var20 = var19.method1014().method1054(Statics.field544);
                            class58 var21 = class58.method1164(var20, 100, var14);
                            var21.method1206(0);
                            Statics.field585.method935(var21);
                            var12.field541 = var21;
                            var12.field532 = var12.field539 + (int) (Math.random() * (double) (var12.field533 - var12.field539));
                        }
                    }
                }
            }
        }
        field328 = 0;
    }

    @ObfuscatedName("ep.am(Ljava/lang/String;ZS)V")
    public static final void method2856(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1290.method3299(arg0, 250);
        int var6 = Statics.field1290.method3300(arg0, 250) * 13;
        class73.method1504(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1506(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1290.method3326(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method138(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field2015.getGraphics();
                Statics.field1952.method1363(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field2015.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field385; var13++) {
            if (field461[var13] + field431[var13] > var9 && field461[var13] < var9 + var11 && field464[var13] + field462[var13] > var10 && field462[var13] < var10 + var12) {
                field459[var13] = true;
            }
        }
    }

    @ObfuscatedName("d.ab(Lap;I)V")
    public static final void method480(class29 arg0) {
        if (Statics.field994.field743 >> 7 == field282 && Statics.field994.field717 >> 7 == field483) {
            field282 = 0;
        }
        int var1 = field373;
        if (class29.field682 == arg0 || class29.field677 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field682 == arg0) {
                var3 = Statics.field994;
                var4 = 33538048;
            } else if (class29.field677 == arg0) {
                var3 = field310[field507];
                var4 = field507 << 14;
            } else {
                var3 = field310[field275[var2]];
                var4 = field275[var2] << 14;
                if (class29.field681 == arg0 && field507 == field275[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method16() && !var3.field50) {
                var3.field48 = false;
                if ((field258 && field373 > 50 || field373 > 200) && class29.field682 != arg0 && var3.field762 == var3.field754) {
                    var3.field48 = true;
                }
                int var5 = var3.field743 >> 7;
                int var6 = var3.field717 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field43 == null || field274 < var3.field38 || field274 >= var3.field37) {
                        if ((var3.field743 & 0x7F) == 64 && (var3.field717 & 0x7F) == 64) {
                            if (field356 == field355[var5][var6]) {
                                continue;
                            }
                            field355[var5][var6] = field356;
                        }
                        var3.field40 = method2503(var3.field743, var3.field717, Statics.field221);
                        Statics.field336.method1732(Statics.field221, var3.field743, var3.field717, var3.field40, 60, var3, var3.field718, var4, var3.field770);
                    } else {
                        var3.field48 = false;
                        var3.field40 = method2503(var3.field743, var3.field717, Statics.field221);
                        Statics.field336.method1603(Statics.field221, var3.field743, var3.field717, var3.field40, 60, var3, var3.field718, var4, var3.field44, var3.field45, var3.field46, var3.field31);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dc.ai(ZI)V")
    public static final void method2521(boolean arg0) {
        for (int var1 = 0; var1 < field424; var1++) {
            class30 var2 = field271[field497[var1]];
            int var3 = (field497[var1] << 14) + 536870912;
            if (var2 != null && var2.method16() && var2.field686.field818 == arg0 && var2.field686.method612()) {
                int var4 = var2.field743 >> 7;
                int var5 = var2.field717 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field720 == 1 && (var2.field743 & 0x7F) == 64 && (var2.field717 & 0x7F) == 64) {
                        if (field356 == field355[var4][var5]) {
                            continue;
                        }
                        field355[var4][var5] = field356;
                    }
                    if (!var2.field686.field786) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field336.method1732(Statics.field221, var2.field743, var2.field717, method2503(var2.field743 + (var2.field720 * 64 - 64), var2.field717 + (var2.field720 * 64 - 64), Statics.field221), var2.field720 * 64 - 64 + 60, var2, var2.field718, var3, var2.field770);
                }
            }
        }
    }

    @ObfuscatedName("eg.an(I)V")
    public static final void method2770() {
        for (class7 var0 = (class7) field389.method3170(); var0 != null; var0 = (class7) field389.method3172()) {
            if (Statics.field221 != var0.field118 || field274 > var0.field103) {
                var0.method3261();
            } else if (field274 >= var0.field105) {
                if (var0.field106 > 0) {
                    class30 var1 = field271[var0.field106 - 1];
                    if (var1 != null && var1.field743 >= 0 && var1.field743 < 13312 && var1.field717 >= 0 && var1.field717 < 13312) {
                        var0.method74(var1.field743, var1.field717, method2503(var1.field743, var1.field717, var0.field118) - var0.field101, field274);
                    }
                }
                if (var0.field106 < 0) {
                    int var2 = -var0.field106 - 1;
                    class3 var3;
                    if (field262 == var2) {
                        var3 = Statics.field994;
                    } else {
                        var3 = field310[var2];
                    }
                    if (var3 != null && var3.field743 >= 0 && var3.field743 < 13312 && var3.field717 >= 0 && var3.field717 < 13312) {
                        var0.method74(var3.field743, var3.field717, method2503(var3.field743, var3.field717, var0.field118) - var0.field101, field274);
                    }
                }
                var0.method75(field328);
                Statics.field336.method1732(Statics.field221, (int) var0.field108, (int) var0.field109, (int) var0.field110, 60, var0, var0.field116, -1, false);
            }
        }
    }

    @ObfuscatedName("eq.ac(B)I")
    public static final int method2652() {
        if (Statics.field1998.field137) {
            return Statics.field221;
        } else {
            int var0 = method2503(Statics.field1879, Statics.field173, Statics.field221);
            return var0 - Statics.field812 >= 800 || (class6.field71[Statics.field221][Statics.field1879 >> 7][Statics.field173 >> 7] & 0x4) == 0 ? 3 : Statics.field221;
        }
    }

    @ObfuscatedName("ap.au(Las;IIIIII)V")
    public static final void method563(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method16()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field686;
            if (var6.field815 != null) {
                var6 = var6.method611();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field373) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field50) {
                return;
            }
            if (var8.field33 != -1 || var8.field34 != -1) {
                method2865(arg0, arg0.field764 + 15);
                if (field357 > -1) {
                    if (var8.field33 != -1) {
                        Statics.field125[var8.field33].method1418(field357 + arg2 - 12, field277 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field34 != -1) {
                        Statics.field158[var8.field34].method1418(field357 + arg2 - 12, field277 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field270 == 10 && field272 == field275[arg1]) {
                method2865(arg0, arg0.field764 + 15);
                if (field357 > -1) {
                    Statics.field1870[1].method1418(field357 + arg2 - 12, field277 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field686;
            if (var9.field815 != null) {
                var9 = var9.method611();
            }
            if (var9.field813 >= 0 && var9.field813 < Statics.field158.length) {
                method2865(arg0, arg0.field764 + 15);
                if (field357 > -1) {
                    Statics.field158[var9.field813].method1418(field357 + arg2 - 12, field277 + arg3 - 30);
                }
            }
            if (field270 == 1 && field495 == field497[arg1 - field373] && field274 % 20 < 10) {
                method2865(arg0, arg0.field764 + 15);
                if (field357 > -1) {
                    Statics.field1870[0].method1418(field357 + arg2 - 12, field277 + arg3 - 28);
                }
            }
        }
        if (arg0.field729 != null && (arg1 >= field373 || field372 == 4 || !arg0.field735 && (field372 == 0 || field372 == 3 || field372 == 1 && Statics.method2050(((class3) arg0).field35, false)))) {
            method2865(arg0, arg0.field764);
            if (field357 > -1 && field466 < field481) {
                field350[field466] = Statics.field511.method3297(arg0.field729) / 2;
                field349[field466] = Statics.field511.field2902;
                field347[field466] = field357;
                field348[field466] = field277;
                field351[field466] = arg0.field774;
                field352[field466] = arg0.field733;
                field353[field466] = arg0.field731;
                field354[field466] = arg0.field729;
                field466++;
            }
        }
        if (arg0.field730 > field274) {
            method2865(arg0, arg0.field764 + 15);
            if (field357 > -1) {
                int var10;
                if (arg1 < field373) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field686;
                    var10 = var11.field821;
                }
                int var12 = arg0.field738 * var10 / arg0.field739;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field738 > 0) {
                    var12 = 1;
                }
                class73.method1504(field357 + arg2 - var10 / 2, field277 + arg3 - 3, var12, 5, 65280);
                class73.method1504(field357 + arg2 - var10 / 2 + var12, field277 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field736[var13] > field274) {
                method2865(arg0, arg0.field764 / 2);
                if (field357 > -1) {
                    if (var13 == 1) {
                        field277 -= 20;
                    }
                    if (var13 == 2) {
                        field357 -= 15;
                        field277 -= 10;
                    }
                    if (var13 == 3) {
                        field357 += 15;
                        field277 -= 10;
                    }
                    Statics.field1806[arg0.field723[var13]].method1418(field357 + arg2 - 12, field277 + arg3 - 12);
                    Statics.field2889.method3304(Integer.toString(arg0.field734[var13]), field357 + arg2 - 1, field277 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("l.av(IIIII)V")
    public static final void method85(int arg0, int arg1, int arg2, int arg3) {
        field466 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field424 + field373; var6++) {
            class33 var7;
            if (var6 == -1) {
                var7 = Statics.field994;
            } else if (var6 < field373) {
                var7 = field310[field275[var6]];
                if (field507 == field275[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field271[field497[var6 - field373]];
            }
            method563(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method563(field310[field507], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field466; var8++) {
            int var9 = field347[var8];
            int var10 = field348[var8];
            int var11 = field350[var8];
            int var12 = field349[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field348[var14] - field349[var14] && var10 - var12 < field348[var14] + 2 && var9 - var11 < field350[var14] + field347[var14] && var9 + var11 > field347[var14] - field350[var14] && field348[var14] - field349[var14] < var10) {
                        var10 = field348[var14] - field349[var14];
                        var13 = true;
                    }
                }
            }
            field357 = field347[var8];
            field277 = field348[var8] = var10;
            String var15 = field354[var8];
            if (field290 == 0) {
                int var16 = 16776960;
                if (field351[var8] < 6) {
                    var16 = field512[field351[var8]];
                }
                if (field351[var8] == 6) {
                    var16 = field356 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field351[var8] == 7) {
                    var16 = field356 % 20 < 10 ? 255 : 65535;
                }
                if (field351[var8] == 8) {
                    var16 = field356 % 20 < 10 ? 45056 : 8454016;
                }
                if (field351[var8] == 9) {
                    int var17 = 150 - field353[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field351[var8] == 10) {
                    int var18 = 150 - field353[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field351[var8] == 11) {
                    int var19 = 150 - field353[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field352[var8] == 0) {
                    Statics.field511.method3304(var15, field357 + arg0, field277 + arg1, var16, 0);
                }
                if (field352[var8] == 1) {
                    Statics.field511.method3305(var15, field357 + arg0, field277 + arg1, var16, 0, field356);
                }
                if (field352[var8] == 2) {
                    Statics.field511.method3306(var15, field357 + arg0, field277 + arg1, var16, 0, field356);
                }
                if (field352[var8] == 3) {
                    Statics.field511.method3307(var15, field357 + arg0, field277 + arg1, var16, 0, field356, 150 - field353[var8]);
                }
                if (field352[var8] == 4) {
                    int var20 = (150 - field353[var8]) * (Statics.field511.method3297(var15) + 100) / 150;
                    class73.method1499(field357 + arg0 - 50, arg1, field357 + arg0 + 50, arg1 + arg3);
                    Statics.field511.method3295(var15, field357 + arg0 + 50 - var20, field277 + arg1, var16, 0);
                    class73.method1536(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field352[var8] == 5) {
                    int var21 = 150 - field353[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class73.method1499(arg0, field277 + arg1 - Statics.field511.field2902 - 1, arg0 + arg2, field277 + arg1 + 5);
                    Statics.field511.method3304(var15, field357 + arg0, field277 + arg1 + var22, var16, 0);
                    class73.method1536(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field511.method3304(var15, field357 + arg0, field277 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("cg.at(I)V")
    public static final void method2054() {
        field396 = 0;
        int var0 = (Statics.field994.field743 >> 7) + Statics.field304;
        int var1 = (Statics.field994.field717 >> 7) + Statics.field671;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field396 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field396 = 1;
        }
        if (field396 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field396 = 0;
        }
    }

    @ObfuscatedName("eu.ax(Las;II)V")
    public static final void method2865(class33 arg0, int arg1) {
        method108(arg0.field743, arg0.field717, arg1);
    }

    @ObfuscatedName("n.ae(IIII)V")
    public static final void method108(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field357 = -1;
            field277 = -1;
            return;
        }
        int var3 = method2503(arg0, arg1, Statics.field221) - arg2;
        int var4 = arg0 - Statics.field1879;
        int var5 = var3 - Statics.field812;
        int var6 = arg1 - Statics.field173;
        int var7 = class84.field1483[Statics.field683];
        int var8 = class84.field1484[Statics.field683];
        int var9 = class84.field1483[Statics.field136];
        int var10 = class84.field1484[Statics.field136];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field357 = (var11 << 9) / var15 + 256;
            field277 = (var14 << 9) / var15 + 167;
        } else {
            field357 = -1;
            field277 = -1;
        }
    }

    @ObfuscatedName("dy.az(IIIB)I")
    public static final int method2503(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field82[var5][var3][var4] + class6.field82[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field82[var5][var3][var4 + 1] + class6.field82[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bd.ar(IIIIIIB)V")
    public static final void method1043(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class84.field1483[var6];
            int var12 = class84.field1484[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class84.field1483[var7];
            int var15 = class84.field1484[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1879 = arg0 - var8;
        Statics.field812 = arg1 - var9;
        Statics.field173 = arg2 - var10;
        Statics.field683 = arg3;
        Statics.field136 = arg4;
    }

    @ObfuscatedName("m.aq(ZI)V")
    public static final void method121(boolean arg0) {
        field313 = arg0;
        if (!field313) {
            int var1 = field402.method2143();
            int var2 = field402.method2262();
            int var3 = (field295 - field402.field1827) / 16;
            Statics.field2498 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2498[var4][var5] = field402.method2152();
                }
            }
            int var6 = field402.method2151();
            int var7 = field402.method2151();
            int var8 = field402.method2120();
            Statics.field518 = new int[var3];
            Statics.field2386 = new int[var3];
            Statics.field1647 = new int[var3];
            Statics.field1287 = new byte[var3][];
            Statics.field89 = new byte[var3][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field518[var10] = var13;
                        Statics.field2386[var10] = Statics.field1795.method2711("m" + var11 + "_" + var12);
                        Statics.field1647[var10] = Statics.field1795.method2711("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method770(var8, var2, var1, var7, var6);
            return;
        }
        int var14 = field402.method2120();
        int var15 = field402.method2262();
        int var16 = field402.method2150();
        int var17 = field402.method2262();
        int var18 = field402.method2159();
        field402.method2341();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field402.method2337(1);
                    if (var22 == 1) {
                        field426[var19][var20][var21] = field402.method2337(26);
                    } else {
                        field426[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field402.method2343();
        int var23 = (field295 - field402.field1827) / 16;
        Statics.field2498 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field2498[var24][var25] = field402.method2152();
            }
        }
        Statics.field518 = new int[var23];
        Statics.field2386 = new int[var23];
        Statics.field1647 = new int[var23];
        Statics.field1287 = new byte[var23][];
        Statics.field89 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field426[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field518[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field518[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field2386[var26] = Statics.field1795.method2711("m" + var35 + "_" + var36);
                            Statics.field1647[var26] = Statics.field1795.method2711("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method770(var17, var16, var18, var14, var15);
    }

    @ObfuscatedName("an.ag(IIIIII)V")
    public static final void method770(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1916 == arg0 && Statics.field873 == arg1 && field305 == arg2 || !field258) {
            return;
        }
        Statics.field1916 = arg0;
        Statics.field873 = arg1;
        field305 = arg2;
        if (!field258) {
            field305 = 0;
        }
        method482(25);
        method2856(class142.field2311, true);
        int var5 = Statics.field304;
        int var6 = Statics.field671;
        Statics.field304 = (arg0 - 6) * 8;
        Statics.field671 = (arg1 - 6) * 8;
        int var7 = Statics.field304 - var5;
        int var8 = Statics.field671 - var6;
        int var9 = Statics.field304;
        int var10 = Statics.field671;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field271[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field769[var13] -= var7;
                    var12.field759[var13] -= var8;
                }
                var12.field743 -= var7 * 128;
                var12.field717 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field310[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field769[var16] -= var7;
                    var15.field759[var16] -= var8;
                }
                var15.field743 -= var7 * 128;
                var15.field717 -= var8 * 128;
            }
        }
        Statics.field221 = arg2;
        Statics.field994.method584(arg3, arg4, false);
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
                        field387[var27][var23][var24] = field387[var27][var25][var26];
                    } else {
                        field387[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field388.method3170(); var28 != null; var28 = (class15) field388.method3172()) {
            var28.field209 -= var7;
            var28.field210 -= var8;
            if (var28.field209 < 0 || var28.field210 < 0 || var28.field209 >= 104 || var28.field210 >= 104) {
                var28.method3261();
            }
        }
        if (field282 != 0) {
            field282 -= var7;
            field483 -= var8;
        }
        field490 = 0;
        field496 = false;
        field477 = -1;
        field390.method3174();
        field389.method3174();
    }

    @ObfuscatedName("r.ay(ZB)V")
    public static final void method152(boolean arg0) {
        method2848();
        field345++;
        if (field345 < 50 && !arg0) {
            return;
        }
        field345 = 0;
        if (field314 || Statics.field1893 == null) {
            return;
        }
        field460.method2339(40);
        try {
            Statics.field1893.method2557(field460.field1826, 0, field460.field1827);
            field460.field1827 = 0;
        } catch (IOException var2) {
            field314 = true;
        }
    }

    @ObfuscatedName("e.ad(II)V")
    public static final void method517(int arg0) {
        int[] var1 = Statics.field876.field1303;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field71[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field336.method1625(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field71[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field336.method1625(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field876.method1408();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field71[arg0][var10][var9] & 0x18) == 0) {
                    method67(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field71[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method67(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field484 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field336.method1620(Statics.field221, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class36.method3(var14).field853;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field318[Statics.field221].field2942;
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
                        field414[field484] = Statics.field1846[var15];
                        field479[field484] = var16;
                        field509[field484] = var17;
                        field484++;
                    }
                }
            }
        }
        Statics.field1952.method1400();
    }

    @ObfuscatedName("y.bd(IIIIIB)V")
    public static final void method67(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field336.method1617(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field336.method1621(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field876.field1303;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method3(var12);
            if (var13.field832 == -1) {
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
                class74 var14 = Statics.field1425[var13.field832];
                if (var14 != null) {
                    int var15 = (var13.field856 * 4 - var14.field1318) / 2;
                    int var16 = (var13.field841 * 4 - var14.field1316) / 2;
                    var14.method1560(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field841) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field336.method1750(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field336.method1621(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method3(var21);
            if (var22.field832 != -1) {
                class74 var23 = Statics.field1425[var22.field832];
                if (var23 != null) {
                    int var24 = (var22.field856 * 4 - var23.field1318) / 2;
                    int var25 = (var22.field841 * 4 - var23.field1316) / 2;
                    var23.method1560(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field841) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field876.field1303;
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
        int var29 = Statics.field336.method1620(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method3(var30);
        if (var31.field832 == -1) {
            return;
        }
        class74 var32 = Statics.field1425[var31.field832];
        if (var32 != null) {
            int var33 = (var31.field856 * 4 - var32.field1318) / 2;
            int var34 = (var31.field841 * 4 - var32.field1316) / 2;
            var32.method1560(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field841) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bz.bl(I)Z")
    public static final boolean method1305() {
        if (Statics.field1893 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1893.method2555();
            if (var0 == 0) {
                return false;
            }
            if (field421 == -1) {
                Statics.field1893.method2559(field402.field1826, 0, 1);
                field402.field1827 = 0;
                field421 = field402.method2353();
                field295 = class166.field2803[field421];
                var0--;
            }
            if (field295 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1893.method2559(field402.field1826, 0, 1);
                field295 = field402.field1826[0] & 0xFF;
                var0--;
            }
            if (field295 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1893.method2559(field402.field1826, 0, 2);
                field402.field1827 = 0;
                field295 = field402.method2120();
                var0 -= 2;
            }
            if (var0 < field295) {
                return false;
            }
            field402.field1827 = 0;
            Statics.field1893.method2559(field402.field1826, 0, field295);
            field417 = 0;
            field302 = field301;
            field301 = field300;
            field300 = field421;
            if (field421 == 160) {
                field270 = field402.method2118();
                if (field270 == 1) {
                    field495 = field402.method2120();
                }
                if (field270 >= 2 && field270 <= 6) {
                    if (field270 == 2) {
                        field276 = 64;
                        field338 = 64;
                    }
                    if (field270 == 3) {
                        field276 = 0;
                        field338 = 64;
                    }
                    if (field270 == 4) {
                        field276 = 128;
                        field338 = 64;
                    }
                    if (field270 == 5) {
                        field276 = 64;
                        field338 = 0;
                    }
                    if (field270 == 6) {
                        field276 = 64;
                        field338 = 128;
                    }
                    field270 = 2;
                    field456 = field402.method2120();
                    field425 = field402.method2120();
                    field438 = field402.method2118();
                }
                if (field270 == 10) {
                    field272 = field402.method2120();
                }
                field421 = -1;
                return true;
            }
            if (field421 == 67) {
                field402.field1827 += 28;
                if (field402.method2138()) {
                    class110 var1 = field402;
                    int var2 = field402.field1827 - 28;
                    if (class136.field2057 != null) {
                        try {
                            class136.field2057.method3400(0L);
                            class136.field2057.method3407(var1.field1826, var2, 24);
                        } catch (Exception var274) {
                        }
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 70) {
                int var4 = field402.method2142();
                int var5 = field402.method2159();
                int var6 = field402.method2159();
                Statics.field221 = var4 >> 1;
                Statics.field994.method584(var6, var5, (var4 & 0x1) == 1);
                field421 = -1;
                return true;
            }
            if (field421 == 195) {
                String var7 = field402.method2126();
                Object[] var8 = new Object[var7.length() + 1];
                for (int var9 = var7.length() - 1; var9 >= 0; var9--) {
                    if (var7.charAt(var9) == 's') {
                        var8[var9 + 1] = field402.method2126();
                    } else {
                        var8[var9 + 1] = Integer.valueOf(field402.method2152());
                    }
                }
                var8[0] = Integer.valueOf(field402.method2152());
                class1 var10 = new class1();
                var10.field11 = var8;
                class32.method126(var10);
                field421 = -1;
                return true;
            }
            if (field421 == 196) {
                field496 = true;
                Statics.field170 = field402.method2118();
                Statics.field93 = field402.method2118();
                Statics.field910 = field402.method2120();
                Statics.field756 = field402.method2118();
                Statics.field1920 = field402.method2118();
                if (Statics.field1920 >= 100) {
                    Statics.field1879 = Statics.field170 * 128 + 64;
                    Statics.field173 = Statics.field93 * 128 + 64;
                    Statics.field812 = method2503(Statics.field1879, Statics.field173, Statics.field221) - Statics.field910;
                }
                field421 = -1;
                return true;
            }
            if (field421 == 50) {
                int var11 = field402.method2161();
                int var12 = field402.method2120();
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = field402.method2150();
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = field402.method2161();
                for (int var15 = var13; var15 <= var12; var15++) {
                    long var16 = ((long) var14 << 32) + (long) var15;
                    class186 var18 = field455.method3138(var16);
                    if (var18 != null) {
                        var18.method3261();
                    }
                    field455.method3132(new class179(var11), var16);
                }
                field421 = -1;
                return true;
            }
            if (field421 == 66) {
                int var19 = field402.method2159();
                int var20 = field402.method2151();
                int var21 = field402.method2160();
                class4 var22 = (class4) field415.method3138((long) var21);
                if (var22 != null) {
                    method1770(var22, var22.field60 != var20);
                }
                method2395(var21, var20, var19);
                field421 = -1;
                return true;
            }
            if (field421 == 161) {
                int var23 = field402.method2152();
                int var24 = field402.method2120();
                if (var23 < -70000) {
                    var24 += 32768;
                }
                class152 var25;
                if (var23 >= 0) {
                    var25 = class152.method2301(var23);
                } else {
                    var25 = null;
                }
                while (field402.field1827 < field295) {
                    int var26 = field402.method2198();
                    int var27 = field402.method2120();
                    int var28 = 0;
                    if (var27 != 0) {
                        var28 = field402.method2118();
                        if (var28 == 255) {
                            var28 = field402.method2152();
                        }
                    }
                    if (var25 != null && var26 >= 0 && var26 < var25.field2616.length) {
                        var25.field2616[var26] = var27;
                        var25.field2617[var26] = var28;
                    }
                    class14.method633(var24, var26, var27 - 1, var28);
                }
                if (var25 != null) {
                    method2502(var25);
                }
                method87();
                field441[++field442 - 1 & 0x1F] = var24 & 0x7FFF;
                field421 = -1;
                return true;
            }
            if (field421 == 59) {
                method567();
                field421 = -1;
                return true;
            }
            if (field421 == 132) {
                field252 = field402.method2120() * 30;
                field448 = field268;
                field421 = -1;
                return true;
            }
            if (field421 == 61) {
                class189.method2807(field402, field295);
                field421 = -1;
                return true;
            }
            if (field421 == 149) {
                method87();
                field419 = field402.method2118();
                field448 = field268;
                field421 = -1;
                return true;
            }
            if (field421 == 44) {
                int var29 = field402.method2262();
                if (var29 == 65535) {
                    var29 = -1;
                }
                if (var29 == -1 && !field487) {
                    Statics.field2703.method3035();
                    class161.field2704 = 1;
                    Statics.field1000 = null;
                } else if (var29 != -1 && field486 != var29 && field346 != 0 && !field487) {
                    class161.method465(2, Statics.field2083, var29, 0, field346, false);
                }
                field486 = var29;
                field421 = -1;
                return true;
            }
            if (field421 == 143) {
                int var30 = field402.method2122();
                int var31 = field402.method2262();
                if (var31 == 65535) {
                    var31 = -1;
                }
                method2053(var31, var30);
                field421 = -1;
                return true;
            }
            if (field421 == 191) {
                field380 = 0;
                field375 = 0;
                method2645();
                method889();
                for (int var32 = 0; var32 < field375; var32++) {
                    int var33 = field376[var32];
                    class30 var34 = field271[var33];
                    int var35 = field402.method2118();
                    if ((var35 & 0x1) != 0) {
                        var34.field686 = class35.method454(field402.method2120());
                        var34.field720 = var34.field686.field791;
                        var34.field767 = var34.field686.field814;
                        var34.field725 = var34.field686.field797;
                        var34.field748 = var34.field686.field798;
                        var34.field726 = var34.field686.field807;
                        var34.field727 = var34.field686.field800;
                        var34.field754 = var34.field686.field794;
                        var34.field716 = var34.field686.field795;
                        var34.field752 = var34.field686.field799;
                    }
                    if ((var35 & 0x10) != 0) {
                        var34.field741 = field402.method2150();
                        var34.field742 = field402.method2150();
                    }
                    if ((var35 & 0x2) != 0) {
                        var34.field746 = field402.method2262();
                        if (var34.field746 == 65535) {
                            var34.field746 = -1;
                        }
                    }
                    if ((var35 & 0x8) != 0) {
                        var34.field729 = field402.method2126();
                        var34.field731 = 100;
                    }
                    if ((var35 & 0x80) != 0) {
                        int var36 = field402.method2143();
                        int var37 = field402.method2159();
                        var34.method595(var36, var37, field274);
                        var34.field730 = field274 + 300;
                        var34.field738 = field402.method2120();
                        var34.field739 = field402.method2151();
                    }
                    if ((var35 & 0x40) != 0) {
                        int var38 = field402.method2159();
                        int var39 = field402.method2159();
                        var34.method595(var38, var39, field274);
                        var34.field730 = field274 + 300;
                        var34.field738 = field402.method2150();
                        var34.field739 = field402.method2262();
                    }
                    if ((var35 & 0x4) != 0) {
                        var34.field751 = field402.method2151();
                        int var40 = field402.method2160();
                        var34.field755 = var40 >> 16;
                        var34.field724 = (var40 & 0xFFFF) + field274;
                        var34.field773 = 0;
                        var34.field753 = 0;
                        if (var34.field724 > field274) {
                            var34.field773 = -1;
                        }
                        if (var34.field751 == 65535) {
                            var34.field751 = -1;
                        }
                    }
                    if ((var35 & 0x20) != 0) {
                        int var41 = field402.method2120();
                        if (var41 == 65535) {
                            var41 = -1;
                        }
                        int var42 = field402.method2143();
                        if (var34.field740 == var41 && var41 != -1) {
                            int var43 = class38.method1579(var41).field909;
                            if (var43 == 1) {
                                var34.field747 = 0;
                                var34.field721 = 0;
                                var34.field749 = var42;
                                var34.field744 = 0;
                            }
                            if (var43 == 2) {
                                var34.field744 = 0;
                            }
                        } else if (var41 == -1 || var34.field740 == -1 || class38.method1579(var41).field903 >= class38.method1579(var34.field740).field903) {
                            var34.field740 = var41;
                            var34.field747 = 0;
                            var34.field721 = 0;
                            var34.field749 = var42;
                            var34.field744 = 0;
                            var34.field750 = var34.field768;
                        }
                    }
                }
                for (int var44 = 0; var44 < field380; var44++) {
                    int var45 = field501[var44];
                    if (field274 != field271[var45].field763) {
                        field271[var45].field686 = null;
                        field271[var45] = null;
                    }
                }
                if (field295 != field402.field1827) {
                    throw new RuntimeException(field402.field1827 + class2.field22 + field295);
                }
                for (int var46 = 0; var46 < field424; var46++) {
                    if (field271[field497[var46]] == null) {
                        throw new RuntimeException(var46 + class2.field22 + field424);
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 250) {
                method87();
                int var47 = field402.method2118();
                int var48 = field402.method2159();
                int var49 = field402.method2161();
                field291[var47] = var49;
                field383[var47] = var48;
                field392[var47] = 1;
                for (int var50 = 0; var50 < 98; var50++) {
                    if (var49 >= class140.field2097[var50]) {
                        field392[var47] = var50 + 2;
                    }
                }
                field443[++field482 - 1 & 0x1F] = var47;
                field421 = -1;
                return true;
            }
            if (field421 == 152) {
                while (field402.field1827 < field295) {
                    int var51 = field402.method2118();
                    boolean var52 = (var51 & 0x1) == 1;
                    String var53 = field402.method2126();
                    String var54 = field402.method2126();
                    field402.method2126();
                    for (int var55 = 0; var55 < field506; var55++) {
                        class8 var56 = field278[var55];
                        if (var52) {
                            if (var54.equals(var56.field130)) {
                                var56.field130 = var53;
                                var56.field131 = var54;
                                var53 = null;
                                break;
                            }
                        } else if (var53.equals(var56.field130)) {
                            var56.field130 = var53;
                            var56.field131 = var54;
                            var53 = null;
                            break;
                        }
                    }
                    if (var53 != null && field506 < 400) {
                        class8 var57 = new class8();
                        field278[field506] = var57;
                        var57.field130 = var53;
                        var57.field131 = var54;
                        field506++;
                    }
                }
                field458 = field268;
                field421 = -1;
                return true;
            }
            if (field421 == 92) {
                class22 var58 = new class22();
                var58.field563 = field402.method2126();
                var58.field565 = field402.method2120();
                int var59 = field402.method2152();
                var58.field560 = var59;
                method482(45);
                Statics.field1893.method2554();
                Statics.field1893 = null;
                class28.method2467(var58);
                field421 = -1;
                return false;
            }
            if (field421 == 97) {
                int var60 = field402.method2262();
                int var61 = field402.method2160();
                class152 var62 = class152.method2301(var61);
                if (var62.field2517 != 2 || var62.field2504 != var60) {
                    var62.field2517 = 2;
                    var62.field2504 = var60;
                    method2502(var62);
                }
                field421 = -1;
                return true;
            }
            if (field421 == 134) {
                int var63 = field402.method2151();
                field416 = var63;
                if (class152.method1877(var63)) {
                    class152[] var64 = Statics.field2618[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        class152 var66 = var64[var65];
                        if (var66 != null) {
                            var66.field2568 = 0;
                            var66.field2621 = 0;
                        }
                    }
                }
                class32.method1589(field416);
                for (int var67 = 0; var67 < 100; var67++) {
                    field444[var67] = true;
                }
                field421 = -1;
                return true;
            }
            if (field421 == 221) {
                String var68 = field402.method2126();
                long var69 = field402.method2124();
                long var71 = (long) field402.method2120();
                long var73 = (long) field402.method2122();
                int var75 = field402.method2118();
                long var76 = (var71 << 32) + var73;
                boolean var78 = false;
                for (int var79 = 0; var79 < 100; var79++) {
                    if (field386[var79] == var76) {
                        var78 = true;
                        break;
                    }
                }
                if (var75 <= 1 && method795(var68)) {
                    var78 = true;
                }
                if (!var78 && field396 == 0) {
                    field386[field470] = var76;
                    field470 = (field470 + 1) % 100;
                    String var80 = class192.method3301(class199.method2(class191.method1402(field402)));
                    if (var75 == 2 || var75 == 3) {
                        class10.method680(9, class2.method468(1) + var68, var80, class198.method2851(var69));
                    } else if (var75 == 1) {
                        class10.method680(9, class2.method468(0) + var68, var80, class198.method2851(var69));
                    } else {
                        class10.method680(9, var68, var80, class198.method2851(var69));
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 194) {
                method121(true);
                field421 = -1;
                return true;
            }
            if (field421 == 81) {
                int var81 = field402.method2262();
                int var82 = field402.method2262();
                int var83 = field402.method2152();
                int var84 = field402.method2262();
                class152 var85 = class152.method2301(var83);
                if (var85.field2554 != var82 || var85.field2555 != var84 || var85.field2557 != var81) {
                    var85.field2554 = var82;
                    var85.field2555 = var84;
                    var85.field2557 = var81;
                    method2502(var85);
                }
                field421 = -1;
                return true;
            }
            if (field421 == 239) {
                Statics.field2645 = field402.method2118();
                Statics.field160 = field402.method2159();
                while (field402.field1827 < field295) {
                    field421 = field402.method2118();
                    method2396();
                }
                field421 = -1;
                return true;
            }
            if (field421 == 27) {
                int var86 = field402.method2118();
                class117[] var87 = new class117[] { class117.field1887, class117.field1885, class117.field1889 };
                class117[] var88 = var87;
                int var89 = 0;
                class117 var91;
                while (true) {
                    if (var89 >= var88.length) {
                        var91 = null;
                        break;
                    }
                    class117 var90 = var88[var89];
                    if (var90.field1886 == var86) {
                        var91 = var90;
                        break;
                    }
                    var89++;
                }
                Statics.field1646 = var91;
                field421 = -1;
                return true;
            }
            if (field421 == 108) {
                int var92 = field402.method2152();
                int var93 = field402.method2120();
                if (var92 < -70000) {
                    var93 += 32768;
                }
                class152 var94;
                if (var92 >= 0) {
                    var94 = class152.method2301(var92);
                } else {
                    var94 = null;
                }
                if (var94 != null) {
                    for (int var95 = 0; var95 < var94.field2616.length; var95++) {
                        var94.field2616[var95] = 0;
                        var94.field2617[var95] = 0;
                    }
                }
                class14.method2630(var93);
                int var96 = field402.method2120();
                for (int var97 = 0; var97 < var96; var97++) {
                    int var98 = field402.method2150();
                    int var99 = field402.method2143();
                    if (var99 == 255) {
                        var99 = field402.method2190();
                    }
                    if (var94 != null && var97 < var94.field2616.length) {
                        var94.field2616[var97] = var98;
                        var94.field2617[var97] = var99;
                    }
                    class14.method633(var93, var97, var98 - 1, var99);
                }
                if (var94 != null) {
                    method2502(var94);
                }
                method87();
                field441[++field442 - 1 & 0x1F] = var93 & 0x7FFF;
                field421 = -1;
                return true;
            }
            if (field421 == 86) {
                String var100 = field402.method2126();
                long var101 = (long) field402.method2120();
                long var103 = (long) field402.method2122();
                int var105 = field402.method2118();
                long var106 = (var101 << 32) + var103;
                boolean var108 = false;
                for (int var109 = 0; var109 < 100; var109++) {
                    if (field386[var109] == var106) {
                        var108 = true;
                        break;
                    }
                }
                if (method795(var100)) {
                    var108 = true;
                }
                if (!var108 && field396 == 0) {
                    field386[field470] = var106;
                    field470 = (field470 + 1) % 100;
                    String var110 = class192.method3301(class199.method2(class191.method1402(field402)));
                    if (var105 == 2 || var105 == 3) {
                        class10.method9(7, class2.method468(1) + var100, var110);
                    } else if (var105 == 1) {
                        class10.method9(7, class2.method468(0) + var100, var110);
                    } else {
                        class10.method9(3, var100, var110);
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 79) {
                field372 = field402.method2118();
                field468 = field402.method2118();
                field421 = -1;
                return true;
            }
            if (field421 == 228) {
                int var111 = field402.method2152();
                class4 var112 = (class4) field415.method3138((long) var111);
                if (var112 != null) {
                    method1770(var112, true);
                }
                if (field418 != null) {
                    method2502(field418);
                    field418 = null;
                }
                field421 = -1;
                return true;
            }
            if (field421 == 184) {
                int var113 = field402.method2152();
                Statics.field141 = Statics.field777.method2450(var113);
                field421 = -1;
                return true;
            }
            if (field421 == 172) {
                String var114 = field402.method2126();
                int var115 = field402.method2120();
                byte var116 = field402.method2253();
                boolean var117 = false;
                if (var116 == -128) {
                    var117 = true;
                }
                if (var117) {
                    if (Statics.field2640 == 0) {
                        field421 = -1;
                        return true;
                    }
                    boolean var118 = false;
                    int var119;
                    for (var119 = 0; var119 < Statics.field2640 && (!Statics.field1685[var119].field552.equals(var114) || Statics.field1685[var119].field554 != var115); var119++) {
                    }
                    if (var119 < Statics.field2640) {
                        while (var119 < Statics.field2640 - 1) {
                            Statics.field1685[var119] = Statics.field1685[var119 + 1];
                            var119++;
                        }
                        Statics.field2640--;
                        Statics.field1685[Statics.field2640] = null;
                    }
                } else {
                    field402.method2126();
                    class21 var120 = new class21();
                    var120.field552 = var114;
                    var120.field555 = class200.method3403(var120.field552, Statics.field256);
                    var120.field554 = var115;
                    var120.field558 = var116;
                    int var121;
                    for (var121 = Statics.field2640 - 1; var121 >= 0; var121--) {
                        int var122 = Statics.field1685[var121].field555.compareTo(var120.field552);
                        if (var122 == 0) {
                            Statics.field1685[var121].field554 = var115;
                            Statics.field1685[var121].field558 = var116;
                            if (var114.equals(Statics.field994.field35)) {
                                Statics.field780 = var116;
                            }
                            field447 = field268;
                            field421 = -1;
                            return true;
                        }
                        if (var122 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2640 >= Statics.field1685.length) {
                        field421 = -1;
                        return true;
                    }
                    for (int var123 = Statics.field2640 - 1; var123 > var121; var123--) {
                        Statics.field1685[var123 + 1] = Statics.field1685[var123];
                    }
                    if (Statics.field2640 == 0) {
                        Statics.field1685 = new class21[100];
                    }
                    Statics.field1685[var121 + 1] = var120;
                    Statics.field2640++;
                    if (var114.equals(Statics.field994.field35)) {
                        Statics.field780 = var116;
                    }
                }
                field447 = field268;
                field421 = -1;
                return true;
            }
            if (field421 == 127) {
                for (int var124 = 0; var124 < field310.length; var124++) {
                    if (field310[var124] != null) {
                        field310[var124].field740 = -1;
                    }
                }
                for (int var125 = 0; var125 < field271.length; var125++) {
                    if (field271[var125] != null) {
                        field271[var125].field740 = -1;
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 42) {
                int var126 = field295 + field402.field1827;
                int var127 = field402.method2120();
                int var128 = field402.method2120();
                if (field416 != var127) {
                    field416 = var127;
                    int var129 = field416;
                    if (class152.method1877(var129)) {
                        class152[] var130 = Statics.field2618[var129];
                        for (int var131 = 0; var131 < var130.length; var131++) {
                            class152 var132 = var130[var131];
                            if (var132 != null) {
                                var132.field2568 = 0;
                                var132.field2621 = 0;
                            }
                        }
                    }
                    class32.method1589(field416);
                    for (int var133 = 0; var133 < 100; var133++) {
                        field444[var133] = true;
                    }
                }
                while (var128-- > 0) {
                    int var134 = field402.method2152();
                    int var135 = field402.method2120();
                    int var136 = field402.method2118();
                    class4 var137 = (class4) field415.method3138((long) var134);
                    if (var137 != null && var137.field60 != var135) {
                        method1770(var137, true);
                        var137 = null;
                    }
                    if (var137 == null) {
                        var137 = method2395(var134, var135, var136);
                    }
                    var137.field58 = true;
                }
                for (class4 var138 = (class4) field415.method3134(); var138 != null; var138 = (class4) field415.method3135()) {
                    if (var138.field58) {
                        var138.field58 = false;
                    } else {
                        method1770(var138, true);
                    }
                }
                field455 = new class174(512);
                while (field402.field1827 < var126) {
                    int var139 = field402.method2152();
                    int var140 = field402.method2120();
                    int var141 = field402.method2120();
                    int var142 = field402.method2152();
                    for (int var143 = var140; var143 <= var141; var143++) {
                        long var144 = ((long) var139 << 32) + (long) var143;
                        field455.method3132(new class179(var142), var144);
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 12) {
                field496 = false;
                for (int var146 = 0; var146 < 5; var146++) {
                    field485[var146] = false;
                }
                field421 = -1;
                return true;
            }
            if (field421 == 179) {
                for (int var147 = 0; var147 < Statics.field1057; var147++) {
                    class46 var148 = (class46) class46.field1058.method3099((long) var147);
                    class46 var149;
                    if (var148 == null) {
                        byte[] var150 = Statics.field1064.method2668(16, var147);
                        class46 var151 = new class46();
                        if (var150 != null) {
                            var151.method880(new class107(var150));
                        }
                        class46.field1058.method3101(var151, (long) var147);
                        var149 = var151;
                    } else {
                        var149 = var148;
                    }
                    if (var149 != null) {
                        class154.field2644[var147] = 0;
                        class154.field2642[var147] = 0;
                    }
                }
                method87();
                field440 += 32;
                field421 = -1;
                return true;
            }
            if (field421 == 177) {
                field496 = true;
                Statics.field986 = field402.method2118();
                Statics.field1562 = field402.method2118();
                Statics.field2499 = field402.method2120();
                Statics.field1060 = field402.method2118();
                Statics.field230 = field402.method2118();
                if (Statics.field230 >= 100) {
                    int var153 = Statics.field986 * 128 + 64;
                    int var154 = Statics.field1562 * 128 + 64;
                    int var155 = method2503(var153, var154, Statics.field221) - Statics.field2499;
                    int var156 = var153 - Statics.field1879;
                    int var157 = var155 - Statics.field812;
                    int var158 = var154 - Statics.field173;
                    int var159 = (int) Math.sqrt((double) (var156 * var156 + var158 * var158));
                    Statics.field683 = (int) (Math.atan2((double) var157, (double) var159) * 325.949D) & 0x7FF;
                    Statics.field136 = (int) (Math.atan2((double) var156, (double) var158) * -325.949D) & 0x7FF;
                    if (Statics.field683 < 128) {
                        Statics.field683 = 128;
                    }
                    if (Statics.field683 > 383) {
                        Statics.field683 = 383;
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 46) {
                int var160 = field402.method2152();
                int var161 = field402.method2152();
                int var162 = field402.method2120();
                if (var162 == 65535) {
                    var162 = -1;
                }
                class152 var163 = class152.method2301(var160);
                if (var163.field2513) {
                    var163.field2524 = var162;
                    var163.field2528 = var161;
                    class45 var165 = class45.method1771(var162);
                    var163.field2554 = var165.field1055;
                    var163.field2555 = var165.field1019;
                    var163.field2588 = var165.field1020;
                    var163.field2519 = var165.field1004;
                    var163.field2577 = var165.field1022;
                    var163.field2557 = var165.field1017;
                    if (var163.field2523 > 0) {
                        var163.field2557 = var163.field2557 * 32 / var163.field2523;
                    }
                    method2502(var163);
                } else if (var162 == -1) {
                    var163.field2517 = 0;
                    field421 = -1;
                    return true;
                } else {
                    class45 var164 = class45.method1771(var162);
                    var163.field2517 = 4;
                    var163.field2504 = var162;
                    var163.field2554 = var164.field1055;
                    var163.field2555 = var164.field1019;
                    var163.field2557 = var164.field1017 * 100 / var161;
                    method2502(var163);
                }
                field421 = -1;
                return true;
            }
            if (field421 == 154) {
                Statics.field2645 = field402.method2143();
                Statics.field160 = field402.method2159();
                field421 = -1;
                return true;
            }
            if (field421 == 240) {
                int var166 = field402.method2142();
                String var167 = field402.method2126();
                int var168 = field402.method2118();
                if (var168 >= 1 && var168 <= 8) {
                    if (var167.equalsIgnoreCase("null")) {
                        var167 = null;
                    }
                    field508[var168 - 1] = var167;
                    field384[var168 - 1] = var166 == 0;
                }
                field421 = -1;
                return true;
            }
            if (field421 == 2) {
                boolean var169 = field402.method2159() == 1;
                int var170 = field402.method2152();
                class152 var171 = class152.method2301(var170);
                if (var171.field2619 != var169) {
                    var171.field2619 = var169;
                    method2502(var171);
                }
                field421 = -1;
                return true;
            }
            if (field421 == 114) {
                if (field416 != -1) {
                    int var172 = field416;
                    if (class152.method1877(var172)) {
                        method1(Statics.field2618[var172], 0);
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 28) {
                int var173 = field402.method2152();
                int var174 = field402.method2262();
                int var175 = var174 >> 10 & 0x1F;
                int var176 = var174 >> 5 & 0x1F;
                int var177 = var174 & 0x1F;
                int var178 = (var177 << 3) + (var175 << 19) + (var176 << 11);
                class152 var179 = class152.method2301(var173);
                if (var179.field2543 != var178) {
                    var179.field2543 = var178;
                    method2502(var179);
                }
                field421 = -1;
                return true;
            }
            if (field421 == 19) {
                field492 = field402.method2118();
                field421 = -1;
                return true;
            }
            if (field421 == 69) {
                field282 = field402.method2118();
                if (field282 == 255) {
                    field282 = 0;
                }
                field483 = field402.method2118();
                if (field483 == 255) {
                    field483 = 0;
                }
                field421 = -1;
                return true;
            }
            if (field421 == 38) {
                field447 = field268;
                if (field295 == 0) {
                    field475 = null;
                    field476 = null;
                    Statics.field2640 = 0;
                    Statics.field1685 = null;
                    field421 = -1;
                    return true;
                }
                field476 = field402.method2126();
                long var180 = field402.method2124();
                long var182 = var180;
                String var184;
                if (var180 <= 0L || var180 >= 6582952005840035281L) {
                    var184 = null;
                } else if (var180 % 37L == 0L) {
                    var184 = null;
                } else {
                    int var185 = 0;
                    for (long var186 = var180; var186 != 0L; var186 /= 37L) {
                        var185++;
                    }
                    StringBuilder var188 = new StringBuilder(var185);
                    while (var182 != 0L) {
                        long var189 = var182;
                        var182 /= 37L;
                        var188.append(class198.field2956[(int) (var189 - var182 * 37L)]);
                    }
                    var184 = var188.reverse().toString();
                }
                field475 = var184;
                Statics.field687 = field402.method2253();
                int var191 = field402.method2118();
                if (var191 == 255) {
                    field421 = -1;
                    return true;
                }
                Statics.field2640 = var191;
                class21[] var192 = new class21[100];
                for (int var193 = 0; var193 < Statics.field2640; var193++) {
                    var192[var193] = new class21();
                    var192[var193].field552 = field402.method2126();
                    var192[var193].field555 = class200.method3403(var192[var193].field552, Statics.field256);
                    var192[var193].field554 = field402.method2120();
                    var192[var193].field558 = field402.method2253();
                    field402.method2126();
                    if (var192[var193].field552.equals(Statics.field994.field35)) {
                        Statics.field780 = var192[var193].field558;
                    }
                }
                boolean var194 = false;
                int var195 = Statics.field2640;
                while (var195 > 0) {
                    boolean var196 = true;
                    var195--;
                    for (int var197 = 0; var197 < var195; var197++) {
                        if (var192[var197].field555.compareTo(var192[var197 + 1].field555) > 0) {
                            class21 var198 = var192[var197];
                            var192[var197] = var192[var197 + 1];
                            var192[var197 + 1] = var198;
                            var196 = false;
                        }
                    }
                    if (var196) {
                        break;
                    }
                }
                Statics.field1685 = var192;
                field421 = -1;
                return true;
            }
            if (field421 == 57) {
                field503 = 1;
                field458 = field268;
                field421 = -1;
                return true;
            }
            if (field421 == 190) {
                String var199 = field402.method2126();
                String var200 = class192.method3301(class199.method2(class191.method1402(field402)));
                class10.method9(6, var199, var200);
                field421 = -1;
                return true;
            }
            if (field421 == 244) {
                int var201 = field402.method2190();
                int var202 = field402.method2150();
                class152 var203 = class152.method2301(var201);
                if (var203.field2517 != 1 || var203.field2504 != var202) {
                    var203.field2517 = 1;
                    var203.field2504 = var202;
                    method2502(var203);
                }
                field421 = -1;
                return true;
            }
            if (field421 == 60) {
                int var204 = field402.method2120();
                int var205 = field402.method2190();
                class152 var206 = class152.method2301(var205);
                if (var206 != null && var206.field2581 == 0) {
                    if (var204 > var206.field2544 - var206.field2515) {
                        var204 = var206.field2544 - var206.field2515;
                    }
                    if (var204 < 0) {
                        var204 = 0;
                    }
                    if (var206.field2574 != var204) {
                        var206.field2574 = var204;
                        method2502(var206);
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 155) {
                int var207 = field402.method2150();
                int var208 = field402.method2161();
                class154.field2644[var207] = var208;
                if (class154.field2642[var207] != var208) {
                    class154.field2642[var207] = var208;
                    method2847(var207);
                }
                field439[++field440 - 1 & 0x1F] = var207;
                field421 = -1;
                return true;
            }
            if (field421 == 26) {
                int var209 = field402.method2160();
                class152 var210 = class152.method2301(var209);
                var210.field2517 = 3;
                var210.field2504 = Statics.field994.field32.method2875();
                method2502(var210);
                field421 = -1;
                return true;
            }
            if (field421 == 205) {
                for (int var211 = 0; var211 < class154.field2642.length; var211++) {
                    if (class154.field2644[var211] != class154.field2642[var211]) {
                        class154.field2642[var211] = class154.field2644[var211];
                        method2847(var211);
                        field439[++field440 - 1 & 0x1F] = var211;
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 224 || field421 == 4 || field421 == 173 || field421 == 252 || field421 == 181 || field421 == 234 || field421 == 123 || field421 == 39 || field421 == 88 || field421 == 84) {
                method2396();
                field421 = -1;
                return true;
            }
            if (field421 == 77) {
                int var212 = field402.method2150();
                int var213 = field402.method2120();
                int var214 = field402.method2190();
                class152 var215 = class152.method2301(var214);
                var215.field2612 = (var213 << 16) + var212;
                field421 = -1;
                return true;
            }
            if (field421 == 139) {
                int var216 = field402.method2118();
                int var217 = field402.method2118();
                int var218 = field402.method2118();
                int var219 = field402.method2118();
                field485[var216] = true;
                field498[var216] = var217;
                field303[var216] = var218;
                field500[var216] = var219;
                field249[var216] = 0;
                field421 = -1;
                return true;
            }
            if (field421 == 55) {
                method121(false);
                field421 = -1;
                return true;
            }
            if (field421 == 193) {
                Statics.field160 = field402.method2142();
                Statics.field2645 = field402.method2143();
                for (int var220 = Statics.field160; var220 < Statics.field160 + 8; var220++) {
                    for (int var221 = Statics.field2645; var221 < Statics.field2645 + 8; var221++) {
                        if (field387[Statics.field221][var220][var221] != null) {
                            field387[Statics.field221][var220][var221] = null;
                            method34(var220, var221);
                        }
                    }
                }
                for (class15 var222 = (class15) field388.method3170(); var222 != null; var222 = (class15) field388.method3172()) {
                    if (var222.field209 >= Statics.field160 && var222.field209 < Statics.field160 + 8 && var222.field210 >= Statics.field2645 && var222.field210 < Statics.field2645 + 8 && Statics.field221 == var222.field216) {
                        var222.field207 = 0;
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 104) {
                int var223 = field402.method2152();
                class152 var224 = class152.method2301(var223);
                for (int var225 = 0; var225 < var224.field2616.length; var225++) {
                    var224.field2616[var225] = -1;
                    var224.field2616[var225] = 0;
                }
                method2502(var224);
                field421 = -1;
                return true;
            }
            if (field421 == 89) {
                int var226 = field402.method2190();
                int var227 = field402.method2153();
                class152 var228 = class152.method2301(var226);
                if (var228.field2508 != var227 || var227 == -1) {
                    var228.field2508 = var227;
                    var228.field2568 = 0;
                    var228.field2621 = 0;
                    method2502(var228);
                }
                field421 = -1;
                return true;
            }
            if (field421 == 36) {
                int var229 = field402.method2120();
                int var230 = field402.method2118();
                int var231 = field402.method2120();
                method3094(var229, var230, var231);
                field421 = -1;
                return true;
            }
            if (field421 == 233) {
                method87();
                field420 = field402.method2252();
                field448 = field268;
                field421 = -1;
                return true;
            }
            if (field421 == 98) {
                while (field402.field1827 < field295) {
                    boolean var232 = field402.method2118() == 1;
                    String var233 = field402.method2126();
                    String var234 = field402.method2126();
                    int var235 = field402.method2120();
                    int var236 = field402.method2118();
                    int var237 = field402.method2118();
                    boolean var238 = (var237 & 0x2) != 0;
                    boolean var239 = (var237 & 0x1) != 0;
                    if (var235 > 0) {
                        field402.method2126();
                        field402.method2118();
                        field402.method2152();
                    }
                    field402.method2126();
                    for (int var240 = 0; var240 < field502; var240++) {
                        class16 var241 = field504[var240];
                        if (var232) {
                            if (var234.equals(var241.field236)) {
                                var241.field236 = var233;
                                var241.field226 = var234;
                                var233 = null;
                                break;
                            }
                        } else if (var233.equals(var241.field236)) {
                            if (var241.field227 != var235) {
                                boolean var242 = true;
                                for (class34 var243 = (class34) field505.method3124(); var243 != null; var243 = (class34) field505.method3123()) {
                                    if (var243.field776.equals(var233)) {
                                        if (var235 != 0 && var243.field778 == 0) {
                                            var243.method3259();
                                            var242 = false;
                                        } else if (var235 == 0 && var243.field778 != 0) {
                                            var243.method3259();
                                            var242 = false;
                                        }
                                    }
                                }
                                if (var242) {
                                    field505.method3122(new class34(var233, var235));
                                }
                                var241.field227 = var235;
                            }
                            var241.field226 = var234;
                            var241.field228 = var236;
                            var241.field229 = var238;
                            var241.field232 = var239;
                            var233 = null;
                            break;
                        }
                    }
                    if (var233 != null && field502 < 400) {
                        class16 var244 = new class16();
                        field504[field502] = var244;
                        var244.field236 = var233;
                        var244.field226 = var234;
                        var244.field227 = var235;
                        var244.field228 = var236;
                        var244.field229 = var238;
                        var244.field232 = var239;
                        field502++;
                    }
                }
                field503 = 2;
                field458 = field268;
                boolean var245 = false;
                int var246 = field502;
                while (var246 > 0) {
                    boolean var247 = true;
                    var246--;
                    for (int var248 = 0; var248 < var246; var248++) {
                        boolean var249 = false;
                        class16 var250 = field504[var248];
                        class16 var251 = field504[var248 + 1];
                        if (field311 != var250.field227 && field311 == var251.field227) {
                            var249 = true;
                        }
                        if (!var249 && var250.field227 == 0 && var251.field227 != 0) {
                            var249 = true;
                        }
                        if (!var249 && !var250.field229 && var251.field229) {
                            var249 = true;
                        }
                        if (!var249 && !var250.field232 && var251.field232) {
                            var249 = true;
                        }
                        if (var249) {
                            class16 var252 = field504[var248];
                            field504[var248] = field504[var248 + 1];
                            field504[var248 + 1] = var252;
                            var247 = false;
                        }
                    }
                    if (var247) {
                        break;
                    }
                }
                field421 = -1;
                return true;
            }
            if (field421 == 201) {
                byte var253 = field402.method2253();
                int var254 = field402.method2151();
                class154.field2644[var254] = var253;
                if (class154.field2642[var254] != var253) {
                    class154.field2642[var254] = var253;
                    method2847(var254);
                }
                field439[++field440 - 1 & 0x1F] = var254;
                field421 = -1;
                return true;
            }
            if (field421 == 232) {
                method2465();
                field421 = -1;
                return false;
            }
            if (field421 == 32) {
                int var255 = field402.method2120();
                class14.method1768(var255);
                field441[++field442 - 1 & 0x1F] = var255 & 0x7FFF;
                field421 = -1;
                return true;
            }
            if (field421 == 48) {
                int var256 = field402.method2154();
                int var257 = field402.method2152();
                int var258 = field402.method2252();
                class152 var259 = class152.method2301(var257);
                int var260 = var259.field2521 + var258;
                int var261 = var259.field2522 + var256;
                if (var259.field2628 != var260 || var259.field2520 != var261) {
                    var259.field2628 = var260;
                    var259.field2520 = var261;
                    method2502(var259);
                }
                field421 = -1;
                return true;
            }
            if (field421 == 102) {
                String var262 = field402.method2126();
                int var263 = field402.method2190();
                class152 var264 = class152.method2301(var263);
                if (!var262.equals(var264.field2561)) {
                    var264.field2561 = var262;
                    method2502(var264);
                }
                field421 = -1;
                return true;
            }
            if (field421 == 251) {
                int var265 = field402.method2198();
                boolean var266 = field402.method2118() == 1;
                String var267 = "";
                boolean var268 = false;
                if (var266) {
                    var267 = field402.method2126();
                    if (method795(var267)) {
                        var268 = true;
                    }
                }
                String var269 = field402.method2126();
                if (!var268) {
                    class10.method9(var265, var267, var269);
                }
                field421 = -1;
                return true;
            }
            class135.method1362("" + field421 + class2.field22 + field301 + class2.field22 + field302 + class2.field22 + field295, (Throwable) null);
            method2465();
        } catch (IOException var275) {
            method2655();
        } catch (Exception var276) {
            String var272 = "" + field421 + class2.field22 + field301 + class2.field22 + field302 + class2.field22 + field295 + class2.field22 + (Statics.field304 + Statics.field994.field769[0]) + class2.field22 + (Statics.field671 + Statics.field994.field759[0]) + class2.field22;
            for (int var273 = 0; var273 < field295 && var273 < 50; var273++) {
                var272 = var272 + field402.field1826[var273] + class2.field22;
            }
            class135.method1362(var272, var276);
            method2465();
        }
        return true;
    }

    @ObfuscatedName("dj.bi(B)V")
    public static final void method2396() {
        if (field421 == 252) {
            int var0 = field402.method2118();
            int var1 = (var0 >> 4 & 0x7) + Statics.field160;
            int var2 = (var0 & 0x7) + Statics.field2645;
            int var3 = field402.method2120();
            int var4 = field402.method2118();
            int var5 = field402.method2120();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var6 = var1 * 128 + 64;
                int var7 = var2 * 128 + 64;
                class26 var8 = new class26(var3, Statics.field221, var6, var7, method2503(var6, var7, Statics.field221) - var4, var5, field274);
                field390.method3166(var8);
            }
        } else if (field421 == 4) {
            int var9 = field402.method2118();
            int var10 = (var9 >> 4 & 0x7) + Statics.field160;
            int var11 = (var9 & 0x7) + Statics.field2645;
            int var12 = field402.method2120();
            int var13 = field402.method2120();
            int var14 = field402.method2120();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                class177 var15 = field387[Statics.field221][var10][var11];
                if (var15 != null) {
                    for (class25 var16 = (class25) var15.method3170(); var16 != null; var16 = (class25) var15.method3172()) {
                        if ((var12 & 0x7FFF) == var16.field605 && var16.field608 == var13) {
                            var16.field608 = var14;
                            break;
                        }
                    }
                    method34(var10, var11);
                }
            }
        } else if (field421 == 234) {
            int var17 = field402.method2262();
            int var18 = field402.method2143();
            int var19 = (var18 >> 4 & 0x7) + Statics.field160;
            int var20 = (var18 & 0x7) + Statics.field2645;
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class177 var21 = field387[Statics.field221][var19][var20];
                if (var21 != null) {
                    for (class25 var22 = (class25) var21.method3170(); var22 != null; var22 = (class25) var21.method3172()) {
                        if ((var17 & 0x7FFF) == var22.field605) {
                            var22.method3261();
                            break;
                        }
                    }
                    if (var21.method3170() == null) {
                        field387[Statics.field221][var19][var20] = null;
                    }
                    method34(var19, var20);
                }
            }
        } else if (field421 == 88) {
            int var23 = field402.method2143();
            int var24 = var23 >> 2;
            int var25 = var23 & 0x3;
            int var26 = field315[var24];
            int var27 = field402.method2142();
            int var28 = (var27 >> 4 & 0x7) + Statics.field160;
            int var29 = (var27 & 0x7) + Statics.field2645;
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                method758(Statics.field221, var28, var29, var26, -1, var24, var25, 0, -1);
            }
        } else {
            if (field421 == 224) {
                int var30 = field402.method2118();
                int var31 = (var30 >> 4 & 0x7) + Statics.field160;
                int var32 = (var30 & 0x7) + Statics.field2645;
                int var33 = field402.method2120();
                int var34 = field402.method2118();
                int var35 = var34 >> 4 & 0xF;
                int var36 = var34 & 0x7;
                int var37 = field402.method2118();
                if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                    int var38 = var35 + 1;
                    if (Statics.field994.field769[0] >= var31 - var38 && Statics.field994.field769[0] <= var31 + var38 && Statics.field994.field759[0] >= var32 - var38 && Statics.field994.field759[0] <= var32 + var38 && field371 != 0 && var36 > 0 && field490 < 50) {
                        field489[field490] = var33;
                        field480[field490] = var36;
                        field493[field490] = var37;
                        field293[field490] = null;
                        field494[field490] = (var31 << 16) + (var32 << 8) + var35;
                        field490++;
                    }
                }
            }
            if (field421 == 181) {
                int var39 = field402.method2118();
                int var40 = (var39 >> 4 & 0x7) + Statics.field160;
                int var41 = (var39 & 0x7) + Statics.field2645;
                int var42 = var40 + field402.method2253();
                int var43 = var41 + field402.method2253();
                int var44 = field402.method2252();
                int var45 = field402.method2120();
                int var46 = field402.method2118() * 4;
                int var47 = field402.method2118() * 4;
                int var48 = field402.method2120();
                int var49 = field402.method2120();
                int var50 = field402.method2118();
                int var51 = field402.method2118();
                if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104 && var45 != 65535) {
                    int var52 = var40 * 128 + 64;
                    int var53 = var41 * 128 + 64;
                    int var54 = var42 * 128 + 64;
                    int var55 = var43 * 128 + 64;
                    class7 var56 = new class7(var45, Statics.field221, var52, var53, method2503(var52, var53, Statics.field221) - var46, field274 + var48, field274 + var49, var50, var51, var44, var47);
                    var56.method74(var54, var55, method2503(var54, var55, Statics.field221) - var47, field274 + var48);
                    field389.method3166(var56);
                }
            } else if (field421 == 39) {
                int var57 = field402.method2120();
                int var58 = field402.method2142();
                int var59 = var58 >> 2;
                int var60 = var58 & 0x3;
                int var61 = field315[var59];
                int var62 = field402.method2159();
                int var63 = (var62 >> 4 & 0x7) + Statics.field160;
                int var64 = (var62 & 0x7) + Statics.field2645;
                if (var63 >= 0 && var64 >= 0 && var63 < 103 && var64 < 103) {
                    if (var61 == 0) {
                        class80 var65 = Statics.field336.method1761(Statics.field221, var63, var64);
                        if (var65 != null) {
                            int var66 = var65.field1417 >> 14 & 0x7FFF;
                            if (var59 == 2) {
                                var65.field1422 = new class11(var66, 2, var60 + 4, Statics.field221, var63, var64, var57, false, var65.field1422);
                                var65.field1427 = new class11(var66, 2, var60 + 1 & 0x3, Statics.field221, var63, var64, var57, false, var65.field1427);
                            } else {
                                var65.field1422 = new class11(var66, var59, var60, Statics.field221, var63, var64, var57, false, var65.field1422);
                            }
                        }
                    }
                    if (var61 == 1) {
                        class87 var67 = Statics.field336.method1614(Statics.field221, var63, var64);
                        if (var67 != null) {
                            int var68 = var67.field1505 >> 14 & 0x7FFF;
                            if (var59 == 4 || var59 == 5) {
                                var67.field1500 = new class11(var68, 4, var60, Statics.field221, var63, var64, var57, false, var67.field1500);
                            } else if (var59 == 6) {
                                var67.field1500 = new class11(var68, 4, var60 + 4, Statics.field221, var63, var64, var57, false, var67.field1500);
                            } else if (var59 == 7) {
                                var67.field1500 = new class11(var68, 4, (var60 + 2 & 0x3) + 4, Statics.field221, var63, var64, var57, false, var67.field1500);
                            } else if (var59 == 8) {
                                var67.field1500 = new class11(var68, 4, var60 + 4, Statics.field221, var63, var64, var57, false, var67.field1500);
                                var67.field1501 = new class11(var68, 4, (var60 + 2 & 0x3) + 4, Statics.field221, var63, var64, var57, false, var67.field1501);
                            }
                        }
                    }
                    if (var61 == 2) {
                        class91 var69 = Statics.field336.method1633(Statics.field221, var63, var64);
                        if (var59 == 11) {
                            var59 = 10;
                        }
                        if (var69 != null) {
                            var69.field1550 = new class11(var69.field1558 >> 14 & 0x7FFF, var59, var60, Statics.field221, var63, var64, var57, false, var69.field1550);
                        }
                    }
                    if (var61 == 3) {
                        class86 var70 = Statics.field336.method1712(Statics.field221, var63, var64);
                        if (var70 != null) {
                            var70.field1488 = new class11(var70.field1492 >> 14 & 0x7FFF, 22, var60, Statics.field221, var63, var64, var57, false, var70.field1488);
                        }
                    }
                }
            } else {
                if (field421 == 173) {
                    int var71 = field402.method2159();
                    int var72 = (var71 >> 4 & 0x7) + Statics.field160;
                    int var73 = (var71 & 0x7) + Statics.field2645;
                    byte var74 = field402.method2253();
                    byte var75 = field402.method2238();
                    int var76 = field402.method2118();
                    int var77 = var76 >> 2;
                    int var78 = var76 & 0x3;
                    int var79 = field315[var77];
                    byte var80 = field402.method2146();
                    byte var81 = field402.method2238();
                    int var82 = field402.method2151();
                    int var83 = field402.method2120();
                    int var84 = field402.method2151();
                    int var85 = field402.method2150();
                    class3 var86;
                    if (field262 == var82) {
                        var86 = Statics.field994;
                    } else {
                        var86 = field310[var82];
                    }
                    if (var86 != null) {
                        class36 var87 = class36.method3(var85);
                        int var88;
                        int var89;
                        if (var78 == 1 || var78 == 3) {
                            var88 = var87.field841;
                            var89 = var87.field856;
                        } else {
                            var88 = var87.field856;
                            var89 = var87.field841;
                        }
                        int var90 = (var88 >> 1) + var72;
                        int var91 = (var88 + 1 >> 1) + var72;
                        int var92 = (var89 >> 1) + var73;
                        int var93 = (var89 + 1 >> 1) + var73;
                        int[][] var94 = class6.field82[Statics.field221];
                        int var95 = var94[var90][var92] + var94[var91][var92] + var94[var90][var93] + var94[var91][var93] >> 2;
                        int var96 = (var72 << 7) + (var88 << 6);
                        int var97 = (var73 << 7) + (var89 << 6);
                        class98 var98 = var87.method645(var77, var78, var94, var96, var95, var97);
                        if (var98 != null) {
                            method758(Statics.field221, var72, var73, var79, -1, 0, 0, var84 + 1, var83 + 1);
                            var86.field38 = field274 + var84;
                            var86.field37 = field274 + var83;
                            var86.field43 = var98;
                            var86.field47 = var72 * 128 + var88 * 64;
                            var86.field41 = var73 * 128 + var89 * 64;
                            var86.field42 = var95;
                            if (var75 > var80) {
                                byte var99 = var75;
                                var75 = var80;
                                var80 = var99;
                            }
                            if (var74 > var81) {
                                byte var100 = var74;
                                var74 = var81;
                                var81 = var100;
                            }
                            var86.field44 = var72 + var75;
                            var86.field46 = var72 + var80;
                            var86.field45 = var73 + var74;
                            var86.field31 = var73 + var81;
                        }
                    }
                }
                if (field421 == 84) {
                    int var101 = field402.method2159();
                    int var102 = var101 >> 2;
                    int var103 = var101 & 0x3;
                    int var104 = field315[var102];
                    int var105 = field402.method2120();
                    int var106 = field402.method2118();
                    int var107 = (var106 >> 4 & 0x7) + Statics.field160;
                    int var108 = (var106 & 0x7) + Statics.field2645;
                    if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                        method758(Statics.field221, var107, var108, var104, var105, var102, var103, 0, -1);
                    }
                } else if (field421 == 123) {
                    int var109 = field402.method2262();
                    int var110 = field402.method2142();
                    int var111 = (var110 >> 4 & 0x7) + Statics.field160;
                    int var112 = (var110 & 0x7) + Statics.field2645;
                    int var113 = field402.method2151();
                    if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                        class25 var114 = new class25();
                        var114.field605 = var109;
                        var114.field608 = var113;
                        if (field387[Statics.field221][var111][var112] == null) {
                            field387[Statics.field221][var111][var112] = new class177();
                        }
                        field387[Statics.field221][var111][var112].method3166(var114);
                        method34(var111, var112);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.bc(IIIIIIIIII)V")
    public static final void method758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field388.method3170(); var10 != null; var10 = (class15) field388.method3172()) {
            if (var10.field216 == arg0 && var10.field209 == arg1 && var10.field210 == arg2 && var10.field208 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field216 = arg0;
            var9.field208 = arg3;
            var9.field209 = arg1;
            var9.field210 = arg2;
            method638(var9);
            field388.method3166(var9);
        }
        var9.field214 = arg4;
        var9.field213 = arg5;
        var9.field215 = arg6;
        var9.field218 = arg7;
        var9.field207 = arg8;
    }

    @ObfuscatedName("af.bn(Lu;I)V")
    public static final void method638(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field208 == 0) {
            var1 = Statics.field336.method1617(arg0.field216, arg0.field209, arg0.field210);
        }
        if (arg0.field208 == 1) {
            var1 = Statics.field336.method1618(arg0.field216, arg0.field209, arg0.field210);
        }
        if (arg0.field208 == 2) {
            var1 = Statics.field336.method1750(arg0.field216, arg0.field209, arg0.field210);
        }
        if (arg0.field208 == 3) {
            var1 = Statics.field336.method1620(arg0.field216, arg0.field209, arg0.field210);
        }
        if (var1 != 0) {
            int var5 = Statics.field336.method1621(arg0.field216, arg0.field209, arg0.field210, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field217 = var2;
        arg0.field222 = var3;
        arg0.field212 = var4;
    }

    @ObfuscatedName("aa.bb(IIIIIIII)V")
    public static final void method570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field258 && Statics.field221 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field336.method1617(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field336.method1618(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field336.method1750(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field336.method1620(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field336.method1621(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field336.method1608(arg0, arg2, arg3);
                class36 var15 = class36.method3(var12);
                if (var15.field842 != 0) {
                    field318[arg0].method3451(arg2, arg3, var13, var14, var15.field848);
                }
            }
            if (arg1 == 1) {
                Statics.field336.method1637(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field336.method1610(arg0, arg2, arg3);
                class36 var16 = class36.method3(var12);
                if (var16.field856 + arg2 > 103 || var16.field856 + arg3 > 103 || var16.field841 + arg2 > 103 || var16.field841 + arg3 > 103) {
                    return;
                }
                if (var16.field842 != 0) {
                    field318[arg0].method3448(arg2, arg3, var16.field856, var16.field841, var14, var16.field848);
                }
            }
            if (arg1 == 3) {
                Statics.field336.method1688(arg0, arg2, arg3);
                class36 var17 = class36.method3(var12);
                if (var17.field842 == 1) {
                    field318[arg0].method3434(arg2, arg3);
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
        class79 var19 = Statics.field336;
        class197 var20 = field318[arg0];
        class36 var21 = class36.method3(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field841;
            var23 = var21.field856;
        } else {
            var22 = var21.field856;
            var23 = var21.field841;
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
        if (var21.field844 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field858 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field872 == -1 && var21.field866 == null) {
                var34 = var21.method645(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1643(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field842 == 1) {
                var20.method3429(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field872 == -1 && var21.field866 == null) {
                var57 = var21.method645(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1713(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field842 != 0) {
                var20.method3427(arg2, arg3, var22, var23, var21.field848);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field872 == -1 && var21.field866 == null) {
                var35 = var21.method645(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1713(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field842 != 0) {
                var20.method3427(arg2, arg3, var22, var23, var21.field848);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field872 == -1 && var21.field866 == null) {
                var36 = var21.method645(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1599(arg0, arg2, arg3, var29, var36, (class78) null, class6.field79[arg5], 0, var32, var33);
            if (var21.field842 != 0) {
                var20.method3426(arg2, arg3, arg6, arg5, var21.field848);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field872 == -1 && var21.field866 == null) {
                var37 = var21.method645(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1599(arg0, arg2, arg3, var29, var37, (class78) null, class6.field80[arg5], 0, var32, var33);
            if (var21.field842 != 0) {
                var20.method3426(arg2, arg3, arg6, arg5, var21.field848);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field872 == -1 && var21.field866 == null) {
                var39 = var21.method645(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method645(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field872, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1599(arg0, arg2, arg3, var29, var39, var40, class6.field79[arg5], class6.field79[var38], var32, var33);
            if (var21.field842 != 0) {
                var20.method3426(arg2, arg3, arg6, arg5, var21.field848);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field872 == -1 && var21.field866 == null) {
                var41 = var21.method645(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1599(arg0, arg2, arg3, var29, var41, (class78) null, class6.field80[arg5], 0, var32, var33);
            if (var21.field842 != 0) {
                var20.method3426(arg2, arg3, arg6, arg5, var21.field848);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field872 == -1 && var21.field866 == null) {
                var42 = var21.method645(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1713(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field842 != 0) {
                var20.method3427(arg2, arg3, var22, var23, var21.field848);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field872 == -1 && var21.field866 == null) {
                var43 = var21.method645(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1600(arg0, arg2, arg3, var29, var43, (class78) null, class6.field79[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1617(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method3(var45 >> 14 & 0x7FFF).field849;
            }
            class78 var46;
            if (var21.field872 == -1 && var21.field866 == null) {
                var46 = var21.method645(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1600(arg0, arg2, arg3, var29, var46, (class78) null, class6.field79[arg5], 0, class6.field81[arg5] * var44, class6.field85[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1617(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method3(var48 >> 14 & 0x7FFF).field849 / 2;
            }
            class78 var49;
            if (var21.field872 == -1 && var21.field866 == null) {
                var49 = var21.method645(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1600(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field83[arg5] * var47, class6.field84[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field872 == -1 && var21.field866 == null) {
                var51 = var21.method645(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1600(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1617(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method3(var53 >> 14 & 0x7FFF).field849 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field872 == -1 && var21.field866 == null) {
                var55 = var21.method645(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method645(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field872, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field872, true, (class78) null);
            }
            var19.method1600(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field83[arg5] * var52, class6.field84[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("c.bu(IIB)V")
    public static final void method34(int arg0, int arg1) {
        class177 var2 = field387[Statics.field221][arg0][arg1];
        if (var2 == null) {
            Statics.field336.method1612(Statics.field221, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3170(); var6 != null; var6 = (class25) var2.method3172()) {
            class45 var7 = class45.method1771(var6.field605);
            long var8 = (long) var7.field1024;
            if (var7.field1023 == 1) {
                var8 = (long) (var6.field608 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field336.method1612(Statics.field221, arg0, arg1);
            return;
        }
        var2.method3167(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3170(); var12 != null; var12 = (class25) var2.method3172()) {
            if (var5.field605 != var12.field605) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field605 != var12.field605 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field336.method1667(Statics.field221, arg0, arg1, method2503(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field221), var5, var13, var10, var11);
    }

    @ObfuscatedName("ap.bq(B)V")
    public static final void method567() {
        field380 = 0;
        field375 = 0;
        field402.method2341();
        int var0 = field402.method2337(1);
        if (var0 != 0) {
            int var1 = field402.method2337(2);
            if (var1 == 0) {
                field376[++field375 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field402.method2337(3);
                Statics.field994.method585(var2, false);
                int var3 = field402.method2337(1);
                if (var3 == 1) {
                    field376[++field375 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field402.method2337(3);
                Statics.field994.method585(var4, true);
                int var5 = field402.method2337(3);
                Statics.field994.method585(var5, true);
                int var6 = field402.method2337(1);
                if (var6 == 1) {
                    field376[++field375 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field402.method2337(7);
                int var8 = field402.method2337(7);
                int var9 = field402.method2337(1);
                if (var9 == 1) {
                    field376[++field375 - 1] = 2047;
                }
                int var10 = field402.method2337(1);
                Statics.field221 = field402.method2337(2);
                Statics.field994.method584(var7, var8, var10 == 1);
            }
        }
        method1879();
        method5();
        for (int var11 = 0; var11 < field375; var11++) {
            int var12 = field376[var11];
            class3 var13 = field310[var12];
            int var14 = field402.method2118();
            if ((var14 & 0x20) != 0) {
                var14 += field402.method2118() << 8;
            }
            if ((var14 & 0x100) != 0) {
                int var15 = field402.method2151();
                int var16 = field402.method2159();
                var13.method595(var15, var16, field274);
                var13.field730 = field274 + 300;
                var13.field738 = field402.method2159();
                var13.field739 = field402.method2159();
            }
            if ((var14 & 0x8) != 0) {
                var13.field746 = field402.method2150();
                if (var13.field746 == 65535) {
                    var13.field746 = -1;
                }
            }
            if ((var14 & 0x1) != 0) {
                int var17 = field402.method2120();
                int var18 = field402.method2118();
                boolean var19 = field402.method2159() == 1;
                int var20 = field402.method2118();
                int var21 = field402.field1827;
                if (var13.field35 != null && var13.field32 != null) {
                    boolean var22 = false;
                    if (var18 <= 1 && method795(var13.field35)) {
                        var22 = true;
                    }
                    if (!var22 && field396 == 0 && !var13.field50) {
                        field457.field1827 = 0;
                        field402.method2184(field457.field1826, 0, var20);
                        field457.field1827 = 0;
                        String var23 = class192.method3301(class199.method2(class191.method1402(field457)));
                        var13.field729 = var23.trim();
                        var13.field774 = var17 >> 8;
                        var13.field733 = var17 & 0xFF;
                        var13.field731 = 150;
                        var13.field735 = var19;
                        if (var18 == 2 || var18 == 3) {
                            class10.method9(var19 ? 91 : 1, class2.method468(1) + var13.field35, var23);
                        } else if (var18 == 1) {
                            class10.method9(var19 ? 91 : 1, class2.method468(0) + var13.field35, var23);
                        } else {
                            class10.method9(var19 ? 90 : 2, var13.field35, var23);
                        }
                    }
                }
                field402.field1827 = var20 + var21;
            }
            if ((var14 & 0x40) != 0) {
                int var24 = field402.method2262();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = field402.method2142();
                method146(var13, var24, var25);
            }
            if ((var14 & 0x2) != 0) {
                int var26 = field402.method2150();
                int var27 = field402.method2159();
                var13.method595(var26, var27, field274);
                var13.field730 = field274 + 300;
                var13.field738 = field402.method2159();
                var13.field739 = field402.method2142();
            }
            if ((var14 & 0x200) != 0) {
                var13.field751 = field402.method2262();
                int var28 = field402.method2152();
                var13.field755 = var28 >> 16;
                var13.field724 = (var28 & 0xFFFF) + field274;
                var13.field773 = 0;
                var13.field753 = 0;
                if (var13.field724 > field274) {
                    var13.field773 = -1;
                }
                if (var13.field751 == 65535) {
                    var13.field751 = -1;
                }
            }
            if ((var14 & 0x400) != 0) {
                var13.field722 = field402.method2159();
                var13.field758 = field402.method2143();
                var13.field757 = field402.method2118();
                var13.field732 = field402.method2143();
                var13.field760 = field402.method2262() + field274;
                var13.field761 = field402.method2262() + field274;
                var13.field719 = field402.method2142();
                var13.field768 = 1;
                var13.field750 = 0;
            }
            if ((var14 & 0x4) != 0) {
                var13.field741 = field402.method2150();
                var13.field742 = field402.method2150();
            }
            if ((var14 & 0x10) != 0) {
                int var29 = field402.method2118();
                byte[] var30 = new byte[var29];
                class107 var31 = new class107(var30);
                field402.method2129(var30, 0, var29);
                field391[var12] = var31;
                var13.method15(var31);
            }
            if ((var14 & 0x80) != 0) {
                var13.field729 = field402.method2126();
                if (var13.field729.charAt(0) == '~') {
                    var13.field729 = var13.field729.substring(1);
                    class10.method9(2, var13.field35, var13.field729);
                } else if (Statics.field994 == var13) {
                    class10.method9(2, var13.field35, var13.field729);
                }
                var13.field735 = false;
                var13.field774 = 0;
                var13.field733 = 0;
                var13.field731 = 150;
            }
        }
        for (int var32 = 0; var32 < field380; var32++) {
            int var33 = field501[var32];
            if (field274 != field310[var33].field763) {
                field310[var33] = null;
            }
        }
        if (field295 != field402.field1827) {
            throw new RuntimeException(field402.field1827 + class2.field22 + field295);
        }
        for (int var34 = 0; var34 < field373; var34++) {
            if (field310[field275[var34]] == null) {
                throw new RuntimeException(var34 + class2.field22 + field373);
            }
        }
    }

    @ObfuscatedName("cj.bk(B)V")
    public static final void method1879() {
        int var0 = field402.method2337(8);
        if (var0 < field373) {
            for (int var1 = var0; var1 < field373; var1++) {
                field501[++field380 - 1] = field275[var1];
            }
        }
        if (var0 > field373) {
            throw new RuntimeException("");
        }
        field373 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field275[var2];
            class3 var4 = field310[var3];
            int var5 = field402.method2337(1);
            if (var5 == 0) {
                field275[++field373 - 1] = var3;
                var4.field763 = field274;
            } else {
                int var6 = field402.method2337(2);
                if (var6 == 0) {
                    field275[++field373 - 1] = var3;
                    var4.field763 = field274;
                    field376[++field375 - 1] = var3;
                } else if (var6 == 1) {
                    field275[++field373 - 1] = var3;
                    var4.field763 = field274;
                    int var7 = field402.method2337(3);
                    var4.method585(var7, false);
                    int var8 = field402.method2337(1);
                    if (var8 == 1) {
                        field376[++field375 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field275[++field373 - 1] = var3;
                    var4.field763 = field274;
                    int var9 = field402.method2337(3);
                    var4.method585(var9, true);
                    int var10 = field402.method2337(3);
                    var4.method585(var10, true);
                    int var11 = field402.method2337(1);
                    if (var11 == 1) {
                        field376[++field375 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field501[++field380 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("t.bv(B)V")
    public static final void method5() {
        while (true) {
            if (field402.method2344(field295) >= 11) {
                int var0 = field402.method2337(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field310[var0] == null) {
                        field310[var0] = new class3();
                        if (field391[var0] != null) {
                            field310[var0].method15(field391[var0]);
                        }
                        var1 = true;
                    }
                    field275[++field373 - 1] = var0;
                    class3 var2 = field310[var0];
                    var2.field763 = field274;
                    int var3 = field402.method2337(1);
                    int var4 = field402.method2337(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field402.method2337(1);
                    if (var5 == 1) {
                        field376[++field375 - 1] = var0;
                    }
                    int var6 = field402.method2337(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field322[field402.method2337(3)];
                    if (var1) {
                        var2.field765 = var2.field718 = var7;
                    }
                    var2.method584(Statics.field994.field769[0] + var6, Statics.field994.field759[0] + var4, var3 == 1);
                    continue;
                }
            }
            field402.method2343();
            return;
        }
    }

    @ObfuscatedName("ej.bj(I)V")
    public static final void method2645() {
        field402.method2341();
        int var0 = field402.method2337(8);
        if (var0 < field424) {
            for (int var1 = var0; var1 < field424; var1++) {
                field501[++field380 - 1] = field497[var1];
            }
        }
        if (var0 > field424) {
            throw new RuntimeException("");
        }
        field424 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field497[var2];
            class30 var4 = field271[var3];
            int var5 = field402.method2337(1);
            if (var5 == 0) {
                field497[++field424 - 1] = var3;
                var4.field763 = field274;
            } else {
                int var6 = field402.method2337(2);
                if (var6 == 0) {
                    field497[++field424 - 1] = var3;
                    var4.field763 = field274;
                    field376[++field375 - 1] = var3;
                } else if (var6 == 1) {
                    field497[++field424 - 1] = var3;
                    var4.field763 = field274;
                    int var7 = field402.method2337(3);
                    var4.method585(var7, false);
                    int var8 = field402.method2337(1);
                    if (var8 == 1) {
                        field376[++field375 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field497[++field424 - 1] = var3;
                    var4.field763 = field274;
                    int var9 = field402.method2337(3);
                    var4.method585(var9, true);
                    int var10 = field402.method2337(3);
                    var4.method585(var10, true);
                    int var11 = field402.method2337(1);
                    if (var11 == 1) {
                        field376[++field375 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field501[++field380 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ae.bh(B)V")
    public static final void method889() {
        while (true) {
            if (field402.method2344(field295) >= 27) {
                int var0 = field402.method2337(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field271[var0] == null) {
                        field271[var0] = new class30();
                        var1 = true;
                    }
                    class30 var2 = field271[var0];
                    field497[++field424 - 1] = var0;
                    var2.field763 = field274;
                    var2.field686 = class35.method454(field402.method2337(14));
                    int var3 = field322[field402.method2337(3)];
                    if (var1) {
                        var2.field765 = var2.field718 = var3;
                    }
                    int var4 = field402.method2337(1);
                    if (var4 == 1) {
                        field376[++field375 - 1] = var0;
                    }
                    int var5 = field402.method2337(1);
                    int var6 = field402.method2337(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field402.method2337(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.field720 = var2.field686.field791;
                    var2.field767 = var2.field686.field814;
                    if (var2.field767 == 0) {
                        var2.field718 = 0;
                    }
                    var2.field725 = var2.field686.field797;
                    var2.field748 = var2.field686.field798;
                    var2.field726 = var2.field686.field807;
                    var2.field727 = var2.field686.field800;
                    var2.field754 = var2.field686.field794;
                    var2.field716 = var2.field686.field795;
                    var2.field752 = var2.field686.field799;
                    var2.method584(Statics.field994.field769[0] + var6, Statics.field994.field759[0] + var7, var5 == 1);
                    continue;
                }
            }
            field402.method2343();
            return;
        }
    }

    @ObfuscatedName("ah.bw(I)V")
    public static final void method582() {
        int var0 = Statics.field2758;
        int var1 = Statics.field2048;
        int var2 = Statics.field121;
        int var3 = Statics.field65;
        int var4 = 6116423;
        class73.method1504(var0, var1, var2, var3, var4);
        class73.method1504(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1506(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field511.method3295(class142.field2271, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field1974;
        int var6 = class127.field1981;
        for (int var7 = 0; var7 < field358; var7++) {
            int var8 = (field358 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field511.method3295(method2550(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field2758;
        int var11 = Statics.field2048;
        int var12 = Statics.field121;
        int var13 = Statics.field65;
        for (int var14 = 0; var14 < field385; var14++) {
            if (field461[var14] + field431[var14] > var10 && field461[var14] < var10 + var12 && field464[var14] + field462[var14] > var11 && field462[var14] < var11 + var13) {
                field459[var14] = true;
            }
        }
    }

    @ObfuscatedName("b.bz(IIIIB)V")
    public static final void method138(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field385; var4++) {
            if (field461[var4] + field431[var4] > arg0 && field461[var4] < arg0 + arg2 && field464[var4] + field462[var4] > arg1 && field462[var4] < arg1 + arg3) {
                field444[var4] = true;
            }
        }
    }

    @ObfuscatedName("dm.bp(II)V")
    public static final void method2360(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field397[arg0];
        int var2 = field398[arg0];
        int var3 = field280[arg0];
        int var4 = field423[arg0];
        String var5 = field401[arg0];
        String var6 = field446[arg0];
        method1320(var1, var2, var3, var4, var5, var6, class127.field1980, class127.field1988);
    }

    @ObfuscatedName("n.bx(Lal;III)V")
    public static final void method106(class27 arg0, int arg1, int arg2) {
        method1320(arg0.field628, arg0.field626, arg0.field633, arg0.field629, arg0.field630, arg0.field630, arg1, arg2);
    }

    @ObfuscatedName("bp.be(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1320(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 38) {
            method2808();
            class152 var8 = class152.method2301(arg1);
            field407 = 1;
            Statics.field1453 = arg0;
            Statics.field972 = arg1;
            Statics.field2372 = arg3;
            method2502(var8);
            field408 = class2.method2647(16748608) + class45.method1771(arg3).field1012 + class2.method2647(16777215);
            if (field408 == null) {
                field408 = "null";
            }
            return;
        }
        if (arg2 == 20) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(226);
            field460.method2139(class124.field1949[82] ? 1 : 0);
            field460.method2185(Statics.field671 + arg1);
            field460.method2185(Statics.field304 + arg0);
            field460.method2185(arg3);
        }
        if (arg2 == 2) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(247);
            field460.method2185(Statics.field671 + arg1);
            field460.method2174(Statics.field187);
            field460.method2162(Statics.field304 + arg0);
            field460.method2185(field326);
            field460.method2139(class124.field1949[82] ? 1 : 0);
            field460.method2162(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 39) {
            field460.method2339(52);
            field460.method2148(arg3);
            field460.method2185(arg0);
            field460.method2174(arg1);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 58) {
            class152 var9 = class152.method456(arg1, arg0);
            if (var9 != null) {
                field460.method2339(234);
                field460.method2162(field326);
                field460.method2156(arg1);
                field460.method2174(Statics.field187);
                field460.method2148(var9.field2524);
                field460.method2148(arg0);
                field460.method2148(field411);
            }
        }
        if (arg2 == 19) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(97);
            field460.method2148(Statics.field304 + arg0);
            field460.method2149(arg3);
            field460.method2139(class124.field1949[82] ? 1 : 0);
            field460.method2149(Statics.field671 + arg1);
        }
        if (arg2 == 10) {
            class30 var10 = field271[arg3];
            if (var10 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(43);
                field460.method2148(arg3);
                field460.method2139(class124.field1949[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field460.method2339(187);
            field460.method2149(arg3);
            field460.method2156(arg1);
            field460.method2185(arg0);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 47) {
            class3 var11 = field310[arg3];
            if (var11 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(160);
                field460.method2185(arg3);
                field460.method2140(class124.field1949[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class3 var12 = field310[arg3];
            if (var12 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(145);
                field460.method2185(field326);
                field460.method2185(arg3);
                field460.method2140(class124.field1949[82] ? 1 : 0);
                field460.method2157(Statics.field187);
            }
        }
        if (arg2 == 37) {
            field460.method2339(219);
            field460.method2149(arg0);
            field460.method2162(arg3);
            field460.method2156(arg1);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 22) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(25);
            field460.method2162(Statics.field304 + arg0);
            field460.method2162(arg3);
            field460.method2139(class124.field1949[82] ? 1 : 0);
            field460.method2149(Statics.field671 + arg1);
        }
        if (arg2 == 28) {
            field460.method2339(204);
            field460.method2174(arg1);
            class152 var13 = class152.method2301(arg1);
            if (var13.field2550 != null && var13.field2550[0][0] == 5) {
                int var14 = var13.field2550[0][1];
                class154.field2642[var14] = 1 - class154.field2642[var14];
                method2847(var14);
            }
        }
        if (arg2 == 1001) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(87);
            field460.method2149(Statics.field304 + arg0);
            field460.method2185(Statics.field671 + arg1);
            field460.method2185(arg3 >> 14 & 0x7FFF);
            field460.method2271(class124.field1949[82] ? 1 : 0);
        }
        if (arg2 == 36) {
            field460.method2339(95);
            field460.method2156(arg1);
            field460.method2148(arg0);
            field460.method2185(arg3);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 7) {
            class30 var15 = field271[arg3];
            if (var15 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(194);
                field460.method2148(Statics.field1453);
                field460.method2156(Statics.field972);
                field460.method2185(Statics.field2372);
                field460.method2168(class124.field1949[82] ? 1 : 0);
                field460.method2185(arg3);
            }
        }
        if (arg2 == 12) {
            class30 var16 = field271[arg3];
            if (var16 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(92);
                field460.method2139(class124.field1949[82] ? 1 : 0);
                field460.method2149(arg3);
            }
        }
        if (arg2 == 6) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(155);
            field460.method2148(Statics.field304 + arg0);
            field460.method2185(arg3 >> 14 & 0x7FFF);
            field460.method2162(Statics.field671 + arg1);
            field460.method2139(class124.field1949[82] ? 1 : 0);
        }
        if (arg2 == 4) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(46);
            field460.method2149(Statics.field304 + arg0);
            field460.method2149(arg3 >> 14 & 0x7FFF);
            field460.method2162(Statics.field671 + arg1);
            field460.method2168(class124.field1949[82] ? 1 : 0);
        }
        if (arg2 == 16) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(110);
            field460.method2162(Statics.field304 + arg0);
            field460.method2149(arg3);
            field460.method2157(Statics.field972);
            field460.method2185(Statics.field671 + arg1);
            field460.method2162(Statics.field1453);
            field460.method2149(Statics.field2372);
            field460.method2168(class124.field1949[82] ? 1 : 0);
        }
        if (arg2 == 25) {
            class152 var17 = class152.method456(arg1, arg0);
            if (var17 != null) {
                method2808();
                int var18 = method3455(var17);
                int var19 = var18 >> 11 & 0x3F;
                int var21 = var17.field2524;
                class152 var22 = class152.method456(arg1, arg0);
                if (var22 != null && var22.field2592 != null) {
                    class1 var23 = new class1();
                    var23.field3 = var22;
                    var23.field11 = var22.field2592;
                    class32.method126(var23);
                }
                field411 = var21;
                field409 = true;
                Statics.field187 = arg1;
                field326 = arg0;
                Statics.field1259 = var19;
                method2502(var22);
                field407 = 0;
                field412 = method35(var17);
                if (field412 == null) {
                    field412 = "Null";
                }
                if (var17.field2513) {
                    field413 = var17.field2586 + class2.method2647(16777215);
                } else {
                    field413 = class2.method2647(65280) + var17.field2614 + class2.method2647(16777215);
                }
            }
            return;
        }
        if (arg2 == 21) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(104);
            field460.method2149(Statics.field671 + arg1);
            field460.method2148(arg3);
            field460.method2271(class124.field1949[82] ? 1 : 0);
            field460.method2149(Statics.field304 + arg0);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class152 var24 = class152.method456(arg1, arg0);
            if (var24 != null) {
                int var25 = var24.field2524;
                class152 var26 = class152.method456(arg1, arg0);
                if (var26 != null) {
                    if (var26.field2601 != null) {
                        class1 var27 = new class1();
                        var27.field3 = var26;
                        var27.field4 = arg3;
                        var27.field12 = arg5;
                        var27.field11 = var26.field2601;
                        class32.method126(var27);
                    }
                    boolean var28 = true;
                    if (var26.field2518 > 0) {
                        var28 = method80(var26);
                    }
                    if (var28) {
                        int var29 = method3455(var26);
                        int var30 = arg3 - 1;
                        boolean var31 = (var29 >> var30 + 1 & 0x1) != 0;
                        if (var31) {
                            if (arg3 == 1) {
                                field460.method2339(88);
                                field460.method2174(arg1);
                                field460.method2185(arg0);
                                field460.method2185(var25);
                            }
                            if (arg3 == 2) {
                                field460.method2339(225);
                                field460.method2174(arg1);
                                field460.method2185(arg0);
                                field460.method2185(var25);
                            }
                            if (arg3 == 3) {
                                field460.method2339(123);
                                field460.method2174(arg1);
                                field460.method2185(arg0);
                                field460.method2185(var25);
                            }
                            if (arg3 == 4) {
                                field460.method2339(195);
                                field460.method2174(arg1);
                                field460.method2185(arg0);
                                field460.method2185(var25);
                            }
                            if (arg3 == 5) {
                                field460.method2339(175);
                                field460.method2174(arg1);
                                field460.method2185(arg0);
                                field460.method2185(var25);
                            }
                            if (arg3 == 6) {
                                field460.method2339(33);
                                field460.method2174(arg1);
                                field460.method2185(arg0);
                                field460.method2185(var25);
                            }
                            if (arg3 == 7) {
                                field460.method2339(143);
                                field460.method2174(arg1);
                                field460.method2185(arg0);
                                field460.method2185(var25);
                            }
                            if (arg3 == 8) {
                                field460.method2339(228);
                                field460.method2174(arg1);
                                field460.method2185(arg0);
                                field460.method2185(var25);
                            }
                            if (arg3 == 9) {
                                field460.method2339(21);
                                field460.method2174(arg1);
                                field460.method2185(arg0);
                                field460.method2185(var25);
                            }
                            if (arg3 == 10) {
                                field460.method2339(23);
                                field460.method2174(arg1);
                                field460.method2185(arg0);
                                field460.method2185(var25);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 1004) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field460.method2339(44);
            field460.method2148(arg3);
        }
        if (arg2 == 48) {
            class3 var32 = field310[arg3];
            if (var32 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(75);
                field460.method2140(class124.field1949[82] ? 1 : 0);
                field460.method2148(arg3);
            }
        }
        if (arg2 == 30 && field418 == null) {
            field460.method2339(147);
            field460.method2185(arg0);
            field460.method2157(arg1);
            field418 = class152.method456(arg1, arg0);
            method2502(field418);
        }
        if (arg2 == 43) {
            field460.method2339(238);
            field460.method2149(arg3);
            field460.method2149(arg0);
            field460.method2157(arg1);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 23) {
            Statics.field336.method1653(Statics.field221, arg0, arg1);
        }
        if (arg2 == 50) {
            class3 var33 = field310[arg3];
            if (var33 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(12);
                field460.method2168(class124.field1949[82] ? 1 : 0);
                field460.method2162(arg3);
            }
        }
        if (arg2 == 1002) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field460.method2339(136);
            field460.method2162(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 13) {
            class30 var34 = field271[arg3];
            if (var34 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(8);
                field460.method2148(arg3);
                field460.method2168(class124.field1949[82] ? 1 : 0);
            }
        }
        if (arg2 == 1003) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            class30 var35 = field271[arg3];
            if (var35 != null) {
                class35 var36 = var35.field686;
                if (var36.field815 != null) {
                    var36 = var36.method611();
                }
                if (var36 != null) {
                    field460.method2339(249);
                    field460.method2149(var36.field803);
                }
            }
        }
        if (arg2 == 49) {
            class3 var37 = field310[arg3];
            if (var37 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(137);
                field460.method2148(arg3);
                field460.method2139(class124.field1949[82] ? 1 : 0);
            }
        }
        if (arg2 == 24) {
            class152 var38 = class152.method2301(arg1);
            boolean var39 = true;
            if (var38.field2518 > 0) {
                var39 = method80(var38);
            }
            if (var39) {
                field460.method2339(204);
                field460.method2174(arg1);
            }
        }
        if (arg2 == 9) {
            class30 var40 = field271[arg3];
            if (var40 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(66);
                field460.method2185(arg3);
                field460.method2140(class124.field1949[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var41 = field310[arg3];
            if (var41 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(152);
                field460.method2149(arg3);
                field460.method2271(class124.field1949[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field460.method2339(182);
            field460.method2156(arg1);
            field460.method2162(arg3);
            field460.method2185(arg0);
            field460.method2148(field326);
            field460.method2156(Statics.field187);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 35) {
            field460.method2339(218);
            field460.method2185(arg3);
            field460.method2174(arg1);
            field460.method2185(arg0);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 18) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(192);
            field460.method2162(Statics.field671 + arg1);
            field460.method2168(class124.field1949[82] ? 1 : 0);
            field460.method2185(arg3);
            field460.method2185(Statics.field304 + arg0);
        }
        if (arg2 == 31) {
            field460.method2339(222);
            field460.method2156(arg1);
            field460.method2162(arg3);
            field460.method2162(Statics.field1453);
            field460.method2157(Statics.field972);
            field460.method2148(arg0);
            field460.method2149(Statics.field2372);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 5) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(176);
            field460.method2149(Statics.field304 + arg0);
            field460.method2185(arg3 >> 14 & 0x7FFF);
            field460.method2140(class124.field1949[82] ? 1 : 0);
            field460.method2148(Statics.field671 + arg1);
        }
        if (arg2 == 3) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(139);
            field460.method2162(arg3 >> 14 & 0x7FFF);
            field460.method2162(Statics.field671 + arg1);
            field460.method2140(class124.field1949[82] ? 1 : 0);
            field460.method2162(Statics.field304 + arg0);
        }
        if (arg2 == 45) {
            class3 var42 = field310[arg3];
            if (var42 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(253);
                field460.method2168(class124.field1949[82] ? 1 : 0);
                field460.method2162(arg3);
            }
        }
        if (arg2 == 1) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(162);
            field460.method2149(arg3 >> 14 & 0x7FFF);
            field460.method2158(Statics.field972);
            field460.method2149(Statics.field304 + arg0);
            field460.method2148(Statics.field671 + arg1);
            field460.method2168(class124.field1949[82] ? 1 : 0);
            field460.method2149(Statics.field2372);
            field460.method2149(Statics.field1453);
        }
        if (arg2 == 42) {
            field460.method2339(125);
            field460.method2162(arg0);
            field460.method2157(arg1);
            field460.method2185(arg3);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 33) {
            field460.method2339(172);
            field460.method2158(arg1);
            field460.method2162(arg3);
            field460.method2148(arg0);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 46) {
            class3 var43 = field310[arg3];
            if (var43 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(223);
                field460.method2140(class124.field1949[82] ? 1 : 0);
                field460.method2185(arg3);
            }
        }
        if (arg2 == 1005) {
            class152 var44 = class152.method2301(arg1);
            if (var44 == null || var44.field2617[arg0] < 100000) {
                field460.method2339(44);
                field460.method2148(arg3);
            } else {
                class10.method9(27, "", var44.field2617[arg0] + " x " + class45.method1771(arg3).field1012);
            }
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 41) {
            field460.method2339(221);
            field460.method2149(arg0);
            field460.method2156(arg1);
            field460.method2148(arg3);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 14) {
            class3 var45 = field310[arg3];
            if (var45 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(98);
                field460.method2148(arg3);
                field460.method2140(class124.field1949[82] ? 1 : 0);
                field460.method2162(Statics.field1453);
                field460.method2162(Statics.field2372);
                field460.method2158(Statics.field972);
            }
        }
        if (arg2 == 8) {
            class30 var46 = field271[arg3];
            if (var46 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(140);
                field460.method2140(class124.field1949[82] ? 1 : 0);
                field460.method2185(field326);
                field460.method2148(arg3);
                field460.method2158(Statics.field187);
            }
        }
        if (arg2 == 26) {
            method71();
        }
        if (arg2 == 44) {
            class3 var47 = field310[arg3];
            if (var47 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(80);
                field460.method2139(class124.field1949[82] ? 1 : 0);
                field460.method2162(arg3);
            }
        }
        if (arg2 == 29) {
            field460.method2339(204);
            field460.method2174(arg1);
            class152 var48 = class152.method2301(arg1);
            if (var48.field2550 != null && var48.field2550[0][0] == 5) {
                int var49 = var48.field2550[0][1];
                if (class154.field2642[var49] != var48.field2526[0]) {
                    class154.field2642[var49] = var48.field2526[0];
                    method2847(var49);
                }
            }
        }
        if (arg2 == 11) {
            class30 var50 = field271[arg3];
            if (var50 != null) {
                field359 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field282 = arg0;
                field483 = arg1;
                field460.method2339(27);
                field460.method2149(arg3);
                field460.method2139(class124.field1949[82] ? 1 : 0);
            }
        }
        if (arg2 == 40) {
            field460.method2339(10);
            field460.method2149(arg3);
            field460.method2162(arg0);
            field460.method2174(arg1);
            field363 = 0;
            Statics.field132 = class152.method2301(arg1);
            field364 = arg0;
        }
        if (arg2 == 17) {
            field359 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field282 = arg0;
            field483 = arg1;
            field460.method2339(49);
            field460.method2162(Statics.field671 + arg1);
            field460.method2140(class124.field1949[82] ? 1 : 0);
            field460.method2162(field326);
            field460.method2174(Statics.field187);
            field460.method2148(Statics.field304 + arg0);
            field460.method2148(arg3);
        }
        if (field407 != 0) {
            field407 = 0;
            method2502(class152.method2301(Statics.field972));
        }
        if (field409) {
            method2808();
        }
        if (Statics.field132 != null && field363 == 0) {
            method2502(Statics.field132);
        }
    }

    @ObfuscatedName("em.bt(I)V")
    public static void method2808() {
        if (!field409) {
            return;
        }
        class152 var0 = class152.method456(Statics.field187, field326);
        if (var0 != null && var0.field2593 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field11 = var0.field2593;
            class32.method126(var1);
        }
        field409 = false;
        method2502(var0);
    }

    @ObfuscatedName("u.br(I)V")
    public static final void method145() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field358 - 1; var1++) {
                if (field280[var1] < 1000 && field280[var1 + 1] > 1000) {
                    String var2 = field446[var1];
                    field446[var1] = field446[var1 + 1];
                    field446[var1 + 1] = var2;
                    String var3 = field401[var1];
                    field401[var1] = field401[var1 + 1];
                    field401[var1 + 1] = var3;
                    int var4 = field280[var1];
                    field280[var1] = field280[var1 + 1];
                    field280[var1 + 1] = var4;
                    int var5 = field397[var1];
                    field397[var1] = field397[var1 + 1];
                    field397[var1 + 1] = var5;
                    int var6 = field398[var1];
                    field398[var1] = field398[var1 + 1];
                    field398[var1 + 1] = var6;
                    int var7 = field423[var1];
                    field423[var1] = field423[var1 + 1];
                    field423[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("cf.bm(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1858(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field395 || field358 >= 500) {
            return;
        }
        field401[field358] = arg0;
        field446[field358] = arg1;
        field280[field358] = arg2;
        field423[field358] = arg3;
        field397[field358] = arg4;
        field398[field358] = arg5;
        field358++;
    }

    @ObfuscatedName("dc.ba(IS)Ljava/lang/String;")
    public static String method2550(int arg0) {
        return field446[arg0].length() > 0 ? field401[arg0] + class142.field2278 + field446[arg0] : field401[arg0];
    }

    @ObfuscatedName("g.bo(IIIIB)V")
    public static final void method81(int arg0, int arg1, int arg2, int arg3) {
        if (field407 == 0 && !field409) {
            method1858(class142.field2273, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class98.field1746; var5++) {
            int var6 = class98.field1744[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field336.method1621(Statics.field221, var7, var8, var6) >= 0) {
                    class36 var11 = class36.method3(var10);
                    if (var11.field866 != null) {
                        var11 = var11.method648();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field407 == 1) {
                        method1858(class142.field2268, field408 + " " + class2.field21 + " " + class2.method2647(65535) + var11.field835, 1, var6, var7, var8);
                    } else if (!field409) {
                        String[] var12 = var11.field857;
                        if (field292) {
                            var12 = Statics.method684(var12);
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
                                    method1858(var12[var13], class2.method2647(65535) + var11.field835, var14, var6, var7, var8);
                                }
                            }
                        }
                        method1858(class142.field2247, class2.method2647(65535) + var11.field835, 1002, var11.field852 << 14, var7, var8);
                    } else if ((Statics.field1259 & 0x4) == 4) {
                        method1858(field412, field413 + " " + class2.field21 + " " + class2.method2647(65535) + var11.field835, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class30 var15 = field271[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field686.field791 == 1 && (var15.field743 & 0x7F) == 64 && (var15.field717 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field424; var16++) {
                            class30 var17 = field271[field497[var16]];
                            if (var17 != null && var15 != var17 && var17.field686.field791 == 1 && var15.field743 == var17.field743 && var15.field717 == var17.field717) {
                                method2854(var17.field686, field497[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field373; var18++) {
                            class3 var19 = field310[field275[var18]];
                            if (var19 != null && var15.field743 == var19.field743 && var15.field717 == var19.field717) {
                                method70(var19, field275[var18], var7, var8);
                            }
                        }
                    }
                    method2854(var15.field686, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field310[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field743 & 0x7F) == 64 && (var20.field717 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field424; var21++) {
                            class30 var22 = field271[field497[var21]];
                            if (var22 != null && var22.field686.field791 == 1 && var20.field743 == var22.field743 && var20.field717 == var22.field717) {
                                method2854(var22.field686, field497[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field373; var23++) {
                            class3 var24 = field310[field275[var23]];
                            if (var24 != null && var20 != var24 && var20.field743 == var24.field743 && var20.field717 == var24.field717) {
                                method70(var24, field275[var23], var7, var8);
                            }
                        }
                    }
                    method70(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field387[Statics.field221][var7][var8];
                    if (var25 != null) {
                        for (class25 var26 = (class25) var25.method3171(); var26 != null; var26 = (class25) var25.method3177()) {
                            class45 var27 = class45.method1771(var26.field605);
                            if (field407 == 1) {
                                method1858(class142.field2268, field408 + " " + class2.field21 + " " + class2.method2647(16748608) + var27.field1012, 16, var26.field605, var7, var8);
                            } else if (!field409) {
                                String[] var28 = var27.field1006;
                                if (field292) {
                                    var28 = Statics.method684(var28);
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
                                        method1858(var28[var29], class2.method2647(16748608) + var27.field1012, var30, var26.field605, var7, var8);
                                    } else if (var29 == 2) {
                                        method1858(class142.field2128, class2.method2647(16748608) + var27.field1012, 20, var26.field605, var7, var8);
                                    }
                                }
                                method1858(class142.field2247, class2.method2647(16748608) + var27.field1012, 1004, var26.field605, var7, var8);
                            } else if ((Statics.field1259 & 0x1) == 1) {
                                method1858(field412, field413 + " " + class2.field21 + " " + class2.method2647(16748608) + var27.field1012, 17, var26.field605, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ep.bs(Laj;IIIB)V")
    public static final void method2854(class35 arg0, int arg1, int arg2, int arg3) {
        if (field358 >= 400) {
            return;
        }
        if (arg0.field815 != null) {
            arg0 = arg0.method611();
        }
        if (arg0 == null || !arg0.field786 || arg0.field820 && field422 != arg1) {
            return;
        }
        String var4 = arg0.field790;
        if (arg0.field810 != 0) {
            int var6 = arg0.field810;
            int var7 = Statics.field994.field39;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2647(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2647(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2647(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2647(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2647(65280);
            } else if (var8 > 6) {
                var9 = class2.method2647(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2647(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2647(12648192);
            } else {
                var9 = class2.method2647(16776960);
            }
            var4 = var4 + var9 + " " + class2.field19 + class142.field2261 + arg0.field810 + class2.field20;
        }
        if (field407 == 1) {
            method1858(class142.field2268, field408 + " " + class2.field21 + " " + class2.method2647(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field409) {
            String[] var10 = arg0.field805;
            if (field292) {
                var10 = Statics.method684(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class142.field2201)) {
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
                        method1858(var10[var11], class2.method2647(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class142.field2201)) {
                        short var14 = 0;
                        if (field324 == class18.field514 || field324 == class18.field515 && arg0.field810 > Statics.field994.field39) {
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
                        method1858(var10[var13], class2.method2647(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method1858(class142.field2247, class2.method2647(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1259 & 0x2) == 2) {
            method1858(field412, field413 + " " + class2.field21 + " " + class2.method2647(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("y.bf(Li;IIII)V")
    public static final void method70(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field994 == arg0 || field358 >= 400) {
            return;
        }
        String var9;
        if (arg0.field36 == 0) {
            String var4 = arg0.field35;
            int var5 = arg0.field39;
            int var6 = Statics.field994.field39;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2647(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2647(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2647(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2647(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2647(65280);
            } else if (var7 > 6) {
                var8 = class2.method2647(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2647(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2647(12648192);
            } else {
                var8 = class2.method2647(16776960);
            }
            var9 = var4 + var8 + " " + class2.field19 + class142.field2261 + arg0.field39 + class2.field20;
        } else {
            var9 = arg0.field35 + " " + class2.field19 + class142.field2275 + arg0.field36 + class2.field20;
        }
        if (field407 == 1) {
            method1858(class142.field2268, field408 + " " + class2.field21 + " " + class2.method2647(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field409) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field508[var10] != null) {
                    short var11 = 0;
                    if (field508[var10].equalsIgnoreCase(class142.field2201)) {
                        if (field324 == class18.field514 || field324 == class18.field515 && arg0.field39 > Statics.field994.field39) {
                            var11 = 2000;
                        }
                        if (Statics.field994.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field994.field49 == arg0.field49) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field384[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field382[var10] + var11;
                    method1858(field508[var10], class2.method2647(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1259 & 0x8) == 8) {
            method1858(field412, field413 + " " + class2.field21 + " " + class2.method2647(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field358; var14++) {
            if (field280[var14] == 23) {
                field446[var14] = class2.method2647(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("w.cu([Leo;IIIIIIIII)V")
    public static final void method115(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1536(arg2, arg3, arg4, arg5);
        class84.method1773();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class152 var10 = arg0[var9];
            if (var10 != null && (var10.field2594 == arg1 || arg1 == -1412584499 && field427 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field461[field385] = var10.field2628 + arg6;
                    field462[field385] = var10.field2520 + arg7;
                    field431[field385] = var10.field2523;
                    field464[field385] = var10.field2515;
                    var11 = ++field385 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2629 = var11;
                var10.field2630 = field274;
                if (!var10.field2513 || !method114(var10)) {
                    if (var10.field2518 > 0) {
                        int var12 = var10.field2518;
                        if (var12 == 324) {
                            if (field296 == -1) {
                                field296 = var10.field2538;
                                field510 = var10.field2539;
                            }
                            if (field374.field2663) {
                                var10.field2538 = field296;
                            } else {
                                var10.field2538 = field510;
                            }
                        } else if (var12 == 325) {
                            if (field296 == -1) {
                                field296 = var10.field2538;
                                field510 = var10.field2539;
                            }
                            if (field374.field2663) {
                                var10.field2538 = field510;
                            } else {
                                var10.field2538 = field296;
                            }
                        } else if (var12 == 327) {
                            var10.field2554 = 150;
                            var10.field2555 = (int) (Math.sin((double) field274 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2517 = 5;
                            var10.field2504 = 0;
                        } else if (var12 == 328) {
                            var10.field2554 = 150;
                            var10.field2555 = (int) (Math.sin((double) field274 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2517 = 5;
                            var10.field2504 = 1;
                        }
                    }
                    int var13 = var10.field2628 + arg6;
                    int var14 = var10.field2520 + arg7;
                    int var15 = var10.field2536;
                    if (field427 == var10) {
                        if (arg1 != -1412584499 && !var10.field2579) {
                            Statics.field138 = arg0;
                            Statics.field1648 = arg6;
                            Statics.field2674 = arg7;
                            continue;
                        }
                        if (field437 && field259) {
                            int var16 = class127.field1974;
                            int var17 = class127.field1981;
                            int var18 = var16 - field428;
                            int var19 = var17 - field499;
                            if (var18 < field432) {
                                var18 = field432;
                            }
                            if (var10.field2523 + var18 > field432 + field279.field2523) {
                                var18 = field432 + field279.field2523 - var10.field2523;
                            }
                            if (var19 < field463) {
                                var19 = field463;
                            }
                            if (var10.field2515 + var19 > field463 + field279.field2515) {
                                var19 = field463 + field279.field2515 - var10.field2515;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2579) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2581 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2581 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2523 + var13;
                        int var27 = var10.field2515 + var14;
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
                        int var30 = var10.field2523 + var13;
                        int var31 = var10.field2515 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2513 || var20 < var22 && var21 < var23) {
                        if (var10.field2518 != 0) {
                            if (var10.field2518 == 1337) {
                                field403 = var13;
                                field404 = var14;
                                int var32 = var10.field2523;
                                int var33 = var10.field2515;
                                class73.method1536(var13, var14, var13 + var32, var14 + var33);
                                class84.method1773();
                                field356++;
                                method480(class29.field682);
                                boolean var34 = false;
                                if (field507 >= 0) {
                                    for (int var35 = 0; var35 < field373; var35++) {
                                        if (field507 == field275[var35]) {
                                            var34 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var34) {
                                    method480(class29.field677);
                                }
                                method2521(true);
                                method480(var34 ? class29.field681 : class29.field678);
                                method2521(false);
                                method2770();
                                for (class26 var36 = (class26) field390.method3170(); var36 != null; var36 = (class26) field390.method3172()) {
                                    if (Statics.field221 != var36.field615 || var36.field619) {
                                        var36.method3261();
                                    } else if (field274 >= var36.field612) {
                                        var36.method520(field328);
                                        if (var36.field619) {
                                            var36.method3261();
                                        } else {
                                            Statics.field336.method1732(var36.field615, var36.field613, var36.field610, var36.field616, 60, var36, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field496) {
                                    int var37 = field377;
                                    if (field433 / 256 > var37) {
                                        var37 = field433 / 256;
                                    }
                                    if (field485[4] && field303[4] + 128 > var37) {
                                        var37 = field303[4] + 128;
                                    }
                                    int var38 = field337 + field320 & 0x7FF;
                                    method1043(Statics.field220, method2503(Statics.field994.field743, Statics.field994.field717, Statics.field221) - 50, Statics.field592, var37, var38, var37 * 3 + 600);
                                }
                                int var51;
                                if (field496) {
                                    var51 = method2652();
                                } else {
                                    int var39;
                                    if (Statics.field1998.field137) {
                                        var39 = Statics.field221;
                                    } else {
                                        int var40 = 3;
                                        if (Statics.field683 < 310) {
                                            int var41 = Statics.field1879 >> 7;
                                            int var42 = Statics.field173 >> 7;
                                            int var43 = Statics.field994.field743 >> 7;
                                            int var44 = Statics.field994.field717 >> 7;
                                            if ((class6.field71[Statics.field221][var41][var42] & 0x4) != 0) {
                                                var40 = Statics.field221;
                                            }
                                            int var45;
                                            if (var43 > var41) {
                                                var45 = var43 - var41;
                                            } else {
                                                var45 = var41 - var43;
                                            }
                                            int var46;
                                            if (var44 > var42) {
                                                var46 = var44 - var42;
                                            } else {
                                                var46 = var42 - var44;
                                            }
                                            if (var45 > var46) {
                                                int var47 = var46 * 65536 / var45;
                                                int var48 = 32768;
                                                while (var41 != var43) {
                                                    if (var41 < var43) {
                                                        var41++;
                                                    } else if (var41 > var43) {
                                                        var41--;
                                                    }
                                                    if ((class6.field71[Statics.field221][var41][var42] & 0x4) != 0) {
                                                        var40 = Statics.field221;
                                                    }
                                                    var48 += var47;
                                                    if (var48 >= 65536) {
                                                        var48 -= 65536;
                                                        if (var42 < var44) {
                                                            var42++;
                                                        } else if (var42 > var44) {
                                                            var42--;
                                                        }
                                                        if ((class6.field71[Statics.field221][var41][var42] & 0x4) != 0) {
                                                            var40 = Statics.field221;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var49 = var45 * 65536 / var46;
                                                int var50 = 32768;
                                                while (var42 != var44) {
                                                    if (var42 < var44) {
                                                        var42++;
                                                    } else if (var42 > var44) {
                                                        var42--;
                                                    }
                                                    if ((class6.field71[Statics.field221][var41][var42] & 0x4) != 0) {
                                                        var40 = Statics.field221;
                                                    }
                                                    var50 += var49;
                                                    if (var50 >= 65536) {
                                                        var50 -= 65536;
                                                        if (var41 < var43) {
                                                            var41++;
                                                        } else if (var41 > var43) {
                                                            var41--;
                                                        }
                                                        if ((class6.field71[Statics.field221][var41][var42] & 0x4) != 0) {
                                                            var40 = Statics.field221;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field71[Statics.field221][Statics.field994.field743 >> 7][Statics.field994.field717 >> 7] & 0x4) != 0) {
                                            var40 = Statics.field221;
                                        }
                                        var39 = var40;
                                    }
                                    var51 = var39;
                                }
                                int var52 = Statics.field1879;
                                int var53 = Statics.field812;
                                int var54 = Statics.field173;
                                int var55 = Statics.field683;
                                int var56 = Statics.field136;
                                for (int var57 = 0; var57 < 5; var57++) {
                                    if (field485[var57]) {
                                        int var58 = (int) (Math.random() * (double) (field498[var57] * 2 + 1) - (double) field498[var57] + Math.sin((double) field500[var57] / 100.0D * (double) field249[var57]) * (double) field303[var57]);
                                        if (var57 == 0) {
                                            Statics.field1879 += var58;
                                        }
                                        if (var57 == 1) {
                                            Statics.field812 += var58;
                                        }
                                        if (var57 == 2) {
                                            Statics.field173 += var58;
                                        }
                                        if (var57 == 3) {
                                            Statics.field136 = Statics.field136 + var58 & 0x7FF;
                                        }
                                        if (var57 == 4) {
                                            Statics.field683 += var58;
                                            if (Statics.field683 < 128) {
                                                Statics.field683 = 128;
                                            }
                                            if (Statics.field683 > 383) {
                                                Statics.field683 = 383;
                                            }
                                        }
                                    }
                                }
                                int var59 = class127.field1974;
                                int var60 = class127.field1981;
                                if (class127.field1975 != 0) {
                                    var59 = class127.field1980;
                                    var60 = class127.field1988;
                                }
                                if (var59 >= var13 && var59 < var13 + var32 && var60 >= var14 && var60 < var14 + var33) {
                                    class98.field1754 = true;
                                    class98.field1746 = 0;
                                    class98.field1707 = var59 - var13;
                                    class98.field1745 = var60 - var14;
                                } else {
                                    class98.field1754 = false;
                                    class98.field1746 = 0;
                                }
                                method2848();
                                class73.method1504(var13, var14, var32, var33, 0);
                                method2848();
                                Statics.field336.method1629(Statics.field1879, Statics.field812, Statics.field173, Statics.field683, Statics.field136, var51);
                                method2848();
                                Statics.field336.method1605();
                                method85(var13, var14, var32, var33);
                                if (field270 == 2) {
                                    method108((field456 - Statics.field304 << 7) + field276, (field425 - Statics.field671 << 7) + field338, field438 * 2);
                                    if (field357 > -1 && field274 % 20 < 10) {
                                        Statics.field1870[0].method1418(field357 + var13 - 12, field277 + var14 - 28);
                                    }
                                }
                                ((class88) Statics.field1466).method1863(field328);
                                if (field362 == 1) {
                                    Statics.field124[field361 / 100].method1418(field359 - 8, field360 - 8);
                                }
                                if (field362 == 2) {
                                    Statics.field124[field361 / 100 + 4].method1418(field359 - 8, field360 - 8);
                                }
                                method2054();
                                if (field406) {
                                    int var61 = var13 + 512 - 5;
                                    int var62 = var14 + 20;
                                    Statics.field1290.method3303("Fps:" + field2018, var61, var62, 16776960, -1);
                                    int var163 = var62 + 15;
                                    Runtime var63 = Runtime.getRuntime();
                                    int var64 = (int) ((var63.totalMemory() - var63.freeMemory()) / 1024L);
                                    int var65 = 16776960;
                                    if (var64 > 32768 && field258) {
                                        var65 = 16711680;
                                    }
                                    if (var64 > 65536 && !field258) {
                                        var65 = 16711680;
                                    }
                                    Statics.field1290.method3303("Mem:" + var64 + "k", var61, var163, var65, -1);
                                    var62 = var163 + 15;
                                }
                                Statics.field1879 = var52;
                                Statics.field812 = var53;
                                Statics.field173 = var54;
                                Statics.field683 = var55;
                                Statics.field136 = var56;
                                if (field261 && class150.method2399(true, false) == 0) {
                                    field261 = false;
                                }
                                if (field261) {
                                    class73.method1504(var13, var14, var32, var33, 0);
                                    method2856(class142.field2311, false);
                                }
                                class73.method1536(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2518 == 1338) {
                                method2508(var13, var14, var11);
                                class73.method1536(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2581 == 0) {
                            if (!var10.field2513 && method114(var10) && Statics.field1842 != var10) {
                                continue;
                            }
                            if (!var10.field2513) {
                                if (var10.field2574 > var10.field2544 - var10.field2515) {
                                    var10.field2574 = var10.field2544 - var10.field2515;
                                }
                                if (var10.field2574 < 0) {
                                    var10.field2574 = 0;
                                }
                            }
                            method115(arg0, var10.field2514, var20, var21, var22, var23, var13 - var10.field2527, var14 - var10.field2574, var11);
                            if (var10.field2622 != null) {
                                method115(var10.field2622, var10.field2514, var20, var21, var22, var23, var13 - var10.field2527, var14 - var10.field2574, var11);
                            }
                            class4 var66 = (class4) field415.method3138((long) var10.field2514);
                            if (var66 != null) {
                                int var67 = var66.field60;
                                if (class152.method1877(var67)) {
                                    Statics.field138 = null;
                                    method115(Statics.field2618[var67], -1, var20, var21, var22, var23, var13, var14, var11);
                                    if (Statics.field138 != null) {
                                        method115(Statics.field138, -1412584499, var20, var21, var22, var23, Statics.field1648, Statics.field2674, var11);
                                        Statics.field138 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var68 = 0; var68 < 100; var68++) {
                                        field444[var68] = true;
                                    }
                                } else {
                                    field444[var11] = true;
                                }
                            }
                            class73.method1536(arg2, arg3, arg4, arg5);
                            class84.method1773();
                        }
                        if (field309[var11] || field465 > 1) {
                            if (var10.field2581 == 0 && !var10.field2513 && var10.field2544 > var10.field2515) {
                                int var69 = var10.field2523 + var13;
                                int var70 = var10.field2574;
                                int var71 = var10.field2515;
                                int var72 = var10.field2544;
                                Statics.field329[0].method1560(var69, var14);
                                Statics.field329[1].method1560(var69, var14 + var71 - 16);
                                class73.method1504(var69, var14 + 16, 16, var71 - 32, field330);
                                int var73 = (var71 - 32) * var71 / var72;
                                if (var73 < 8) {
                                    var73 = 8;
                                }
                                int var74 = (var71 - 32 - var73) * var70 / (var72 - var71);
                                class73.method1504(var69, var14 + 16 + var74, 16, var73, field331);
                                class73.method1510(var69, var14 + 16 + var74, var73, field378);
                                class73.method1510(var69 + 1, var14 + 16 + var74, var73, field378);
                                class73.method1508(var69, var14 + 16 + var74, 16, field378);
                                class73.method1508(var69, var14 + 17 + var74, 16, field378);
                                class73.method1510(var69 + 15, var14 + 16 + var74, var73, field332);
                                class73.method1510(var69 + 14, var14 + 17 + var74, var73 - 1, field332);
                                class73.method1508(var69, var14 + 15 + var74 + var73, 16, field332);
                                class73.method1508(var69 + 1, var14 + 14 + var74 + var73, 15, field332);
                            }
                            if (var10.field2581 != 1) {
                                if (var10.field2581 == 2) {
                                    int var75 = 0;
                                    for (int var76 = 0; var76 < var10.field2515; var76++) {
                                        for (int var77 = 0; var77 < var10.field2523; var77++) {
                                            int var78 = (var10.field2610 + 32) * var77 + var13;
                                            int var79 = (var10.field2584 + 32) * var76 + var14;
                                            if (var75 < 20) {
                                                var78 += var10.field2575[var75];
                                                var79 += var10.field2570[var75];
                                            }
                                            if (var10.field2616[var75] > 0) {
                                                boolean var80 = false;
                                                boolean var81 = false;
                                                int var82 = var10.field2616[var75] - 1;
                                                if (var78 + 32 > arg2 && var78 < arg4 && var79 + 32 > arg3 && var79 < arg5 || Statics.field122 == var10 && field365 == var75) {
                                                    class72 var83;
                                                    if (field407 == 1 && Statics.field1453 == var75 && Statics.field972 == var10.field2514) {
                                                        var83 = class45.method1865(var82, var10.field2617[var75], 2, 0, false);
                                                    } else {
                                                        var83 = class45.method1865(var82, var10.field2617[var75], 1, 3153952, false);
                                                    }
                                                    if (var83 == null) {
                                                        method2502(var10);
                                                    } else if (Statics.field122 == var10 && field365 == var75) {
                                                        int var84 = class127.field1974 - field366;
                                                        int var85 = class127.field1981 - field325;
                                                        if (var84 < 5 && var84 > -5) {
                                                            var84 = 0;
                                                        }
                                                        if (var85 < 5 && var85 > -5) {
                                                            var85 = 0;
                                                        }
                                                        if (field370 < 5) {
                                                            var84 = 0;
                                                            var85 = 0;
                                                        }
                                                        var83.method1424(var78 + var84, var79 + var85, 128);
                                                        if (arg1 != -1) {
                                                            class152 var86 = arg0[arg1 & 0xFFFF];
                                                            if (var79 + var85 < class73.field1309 && var86.field2574 > 0) {
                                                                int var87 = field328 * (class73.field1309 - var79 - var85) / 3;
                                                                if (var87 > field328 * 10) {
                                                                    var87 = field328 * 10;
                                                                }
                                                                if (var87 > var86.field2574) {
                                                                    var87 = var86.field2574;
                                                                }
                                                                var86.field2574 -= var87;
                                                                field325 += var87;
                                                                method2502(var86);
                                                            }
                                                            if (var79 + var85 + 32 > class73.field1313 && var86.field2574 < var86.field2544 - var86.field2515) {
                                                                int var88 = field328 * (var79 + var85 + 32 - class73.field1313) / 3;
                                                                if (var88 > field328 * 10) {
                                                                    var88 = field328 * 10;
                                                                }
                                                                if (var88 > var86.field2544 - var86.field2515 - var86.field2574) {
                                                                    var88 = var86.field2544 - var86.field2515 - var86.field2574;
                                                                }
                                                                var86.field2574 += var88;
                                                                field325 -= var88;
                                                                method2502(var86);
                                                            }
                                                        }
                                                    } else if (Statics.field132 == var10 && field364 == var75) {
                                                        var83.method1424(var78, var79, 128);
                                                    } else {
                                                        var83.method1418(var78, var79);
                                                    }
                                                }
                                            } else if (var10.field2571 != null && var75 < 20) {
                                                class72 var89 = var10.method2838(var75);
                                                if (var89 != null) {
                                                    var89.method1418(var78, var79);
                                                } else if (class152.field2512) {
                                                    method2502(var10);
                                                }
                                            }
                                            var75++;
                                        }
                                    }
                                } else if (var10.field2581 == 3) {
                                    int var90;
                                    if (method3088(var10)) {
                                        var90 = var10.field2556;
                                        if (Statics.field1842 == var10 && var10.field2534 != 0) {
                                            var90 = var10.field2534;
                                        }
                                    } else {
                                        var90 = var10.field2543;
                                        if (Statics.field1842 == var10 && var10.field2533 != 0) {
                                            var90 = var10.field2533;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2535) {
                                            class73.method1504(var13, var14, var10.field2523, var10.field2515, var90);
                                        } else {
                                            class73.method1506(var13, var14, var10.field2523, var10.field2515, var90);
                                        }
                                    } else if (var10.field2535) {
                                        class73.method1495(var13, var14, var10.field2523, var10.field2515, var90, 256 - (var15 & 0xFF));
                                    } else {
                                        class73.method1507(var13, var14, var10.field2523, var10.field2515, var90, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2581 == 4) {
                                    class193 var91 = var10.method2834();
                                    if (var91 != null) {
                                        String var92 = var10.field2561;
                                        int var93;
                                        if (method3088(var10)) {
                                            var93 = var10.field2556;
                                            if (Statics.field1842 == var10 && var10.field2534 != 0) {
                                                var93 = var10.field2534;
                                            }
                                            if (var10.field2620.length() > 0) {
                                                var92 = var10.field2620;
                                            }
                                        } else {
                                            var93 = var10.field2543;
                                            if (Statics.field1842 == var10 && var10.field2533 != 0) {
                                                var93 = var10.field2533;
                                            }
                                        }
                                        if (var10.field2513 && var10.field2524 != -1) {
                                            class45 var94 = class45.method1771(var10.field2524);
                                            var92 = var94.field1012;
                                            if (var92 == null) {
                                                var92 = "null";
                                            }
                                            if ((var94.field1023 == 1 || var10.field2528 != 1) && var10.field2528 != -1) {
                                                String var95 = class2.method2647(16748608) + var92 + class2.field23 + " " + 'x';
                                                int var96 = var10.field2528;
                                                String var97 = Integer.toString(var96);
                                                for (int var98 = var97.length() - 3; var98 > 0; var98 -= 3) {
                                                    var97 = var97.substring(0, var98) + class2.field22 + var97.substring(var98);
                                                }
                                                StringBuilder var10000;
                                                class142 var10001;
                                                String var99;
                                                if (var97.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method2647(65408)).append(var97.substring(0, var97.length() - 8));
                                                    var10001 = (class142) null;
                                                    var99 = var10000.append(class142.field2279).append(" ").append(class2.field19).append(var97).append(class2.field20).append(class2.field23).toString();
                                                } else if (var97.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method2647(16777215)).append(var97.substring(0, var97.length() - 4));
                                                    var10001 = (class142) null;
                                                    var99 = var10000.append(class142.field2281).append(" ").append(class2.field19).append(var97).append(class2.field20).append(class2.field23).toString();
                                                } else {
                                                    var99 = " " + class2.method2647(16776960) + var97 + class2.field23;
                                                }
                                                var92 = var95 + var99;
                                            }
                                        }
                                        if (field418 == var10) {
                                            class142 var164 = (class142) null;
                                            var92 = class142.field2276;
                                            var93 = var10.field2543;
                                        }
                                        if (!var10.field2513) {
                                            var92 = method1880(var92, var10);
                                        }
                                        var91.method3326(var92, var13, var14, var10.field2523, var10.field2515, var93, var10.field2547 ? 0 : -1, var10.field2562, var10.field2565, var10.field2563);
                                    } else if (class152.field2512) {
                                        method2502(var10);
                                    }
                                } else if (var10.field2581 == 5) {
                                    if (var10.field2513) {
                                        class72 var101;
                                        if (var10.field2524 == -1) {
                                            var101 = var10.method2814(false);
                                        } else {
                                            var101 = class45.method1865(var10.field2524, var10.field2528, var10.field2587, var10.field2546, false);
                                        }
                                        if (var101 != null) {
                                            int var102 = var101.field1302;
                                            int var103 = var101.field1306;
                                            if (var10.field2541) {
                                                class73.method1499(var13, var14, var10.field2523 + var13, var10.field2515 + var14);
                                                int var104 = (var10.field2523 + (var102 - 1)) / var102;
                                                int var105 = (var10.field2515 + (var103 - 1)) / var103;
                                                for (int var106 = 0; var106 < var104; var106++) {
                                                    for (int var107 = 0; var107 < var105; var107++) {
                                                        if (var10.field2540 != 0) {
                                                            var101.method1430(var102 / 2 + var102 * var106 + var13, var103 / 2 + var103 * var107 + var14, var10.field2540, 4096);
                                                        } else if (var15 == 0) {
                                                            var101.method1418(var102 * var106 + var13, var103 * var107 + var14);
                                                        } else {
                                                            var101.method1424(var102 * var106 + var13, var103 * var107 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1536(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var108 = var10.field2523 * 4096 / var102;
                                                if (var10.field2540 != 0) {
                                                    var101.method1430(var10.field2523 / 2 + var13, var10.field2515 / 2 + var14, var10.field2540, var108);
                                                } else if (var15 != 0) {
                                                    var101.method1466(var13, var14, var10.field2523, var10.field2515, 256 - (var15 & 0xFF));
                                                } else if (var10.field2523 == var102 && var10.field2515 == var103) {
                                                    var101.method1418(var13, var14);
                                                } else {
                                                    var101.method1420(var13, var14, var10.field2523, var10.field2515);
                                                }
                                            }
                                        } else if (class152.field2512) {
                                            method2502(var10);
                                        }
                                    } else {
                                        class72 var100 = var10.method2814(method3088(var10));
                                        if (var100 != null) {
                                            var100.method1418(var13, var14);
                                        } else if (class152.field2512) {
                                            method2502(var10);
                                        }
                                    }
                                } else if (var10.field2581 == 6) {
                                    boolean var109 = method3088(var10);
                                    int var110;
                                    if (var109) {
                                        var110 = var10.field2551;
                                    } else {
                                        var110 = var10.field2508;
                                    }
                                    class98 var111 = null;
                                    int var112 = 0;
                                    if (var10.field2524 != -1) {
                                        class45 var113 = class45.method1771(var10.field2524);
                                        if (var113 != null) {
                                            class45 var114 = var113.method833(var10.field2528);
                                            var111 = var114.method834(1);
                                            if (var111 == null) {
                                                method2502(var10);
                                            } else {
                                                var111.method1974();
                                                var112 = var111.field1351 / 2;
                                            }
                                        }
                                    } else if (var10.field2517 == 5) {
                                        if (var10.field2504 == 0) {
                                            var111 = field374.method2873((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var111 = Statics.field994.method21();
                                        }
                                    } else if (var110 == -1) {
                                        var111 = var10.method2841((class38) null, -1, var109, Statics.field994.field32);
                                        if (var111 == null && class152.field2512) {
                                            method2502(var10);
                                        }
                                    } else {
                                        class38 var115 = class38.method1579(var110);
                                        var111 = var10.method2841(var115, var10.field2568, var109, Statics.field994.field32);
                                        if (var111 == null && class152.field2512) {
                                            method2502(var10);
                                        }
                                    }
                                    class84.method1776(var10.field2523 / 2 + var13, var10.field2515 / 2 + var14);
                                    int var116 = var10.field2557 * class84.field1483[var10.field2554] >> 16;
                                    int var117 = var10.field2557 * class84.field1484[var10.field2554] >> 16;
                                    if (var111 != null) {
                                        if (var10.field2513) {
                                            var111.method1974();
                                            if (var10.field2559) {
                                                var111.method1985(0, var10.field2555, var10.field2588, var10.field2554, var10.field2519, var10.field2577 + var112 + var116, var10.field2577 + var117, var10.field2557);
                                            } else {
                                                var111.method1984(0, var10.field2555, var10.field2588, var10.field2554, var10.field2519, var10.field2577 + var112 + var116, var10.field2577 + var117);
                                            }
                                        } else {
                                            var111.method1984(0, var10.field2555, 0, var10.field2554, 0, var116, var117);
                                        }
                                    }
                                    class84.method1806();
                                } else {
                                    if (var10.field2581 == 7) {
                                        class193 var118 = var10.method2834();
                                        if (var118 == null) {
                                            if (class152.field2512) {
                                                method2502(var10);
                                            }
                                            continue;
                                        }
                                        int var119 = 0;
                                        for (int var120 = 0; var120 < var10.field2515; var120++) {
                                            for (int var121 = 0; var121 < var10.field2523; var121++) {
                                                if (var10.field2616[var119] > 0) {
                                                    class45 var122 = class45.method1771(var10.field2616[var119] - 1);
                                                    String var123;
                                                    if (var122.field1023 != 1 && var10.field2617[var119] == 1) {
                                                        var123 = class2.method2647(16748608) + var122.field1012 + class2.field23;
                                                    } else {
                                                        String var124 = class2.method2647(16748608) + var122.field1012 + class2.field23 + " " + 'x';
                                                        int var125 = var10.field2617[var119];
                                                        String var126 = Integer.toString(var125);
                                                        for (int var127 = var126.length() - 3; var127 > 0; var127 -= 3) {
                                                            var126 = var126.substring(0, var127) + class2.field22 + var126.substring(var127);
                                                        }
                                                        String var128;
                                                        if (var126.length() > 9) {
                                                            var128 = " " + class2.method2647(65408) + var126.substring(0, var126.length() - 8) + class142.field2279 + " " + class2.field19 + var126 + class2.field20 + class2.field23;
                                                        } else if (var126.length() > 6) {
                                                            var128 = " " + class2.method2647(16777215) + var126.substring(0, var126.length() - 4) + class142.field2281 + " " + class2.field19 + var126 + class2.field20 + class2.field23;
                                                        } else {
                                                            var128 = " " + class2.method2647(16776960) + var126 + class2.field23;
                                                        }
                                                        var123 = var124 + var128;
                                                    }
                                                    int var129 = (var10.field2610 + 115) * var121 + var13;
                                                    int var130 = (var10.field2584 + 12) * var120 + var14;
                                                    if (var10.field2562 == 0) {
                                                        var118.method3295(var123, var129, var130, var10.field2543, var10.field2547 ? 0 : -1);
                                                    } else if (var10.field2562 == 1) {
                                                        var118.method3304(var123, var10.field2523 / 2 + var129, var130, var10.field2543, var10.field2547 ? 0 : -1);
                                                    } else {
                                                        var118.method3303(var123, var10.field2523 + var129 - 1, var130, var10.field2543, var10.field2547 ? 0 : -1);
                                                    }
                                                }
                                                var119++;
                                            }
                                        }
                                    }
                                    if (var10.field2581 == 8 && Statics.field1043 == var10 && field405 == field283) {
                                        int var131 = 0;
                                        int var132 = 0;
                                        class193 var133 = Statics.field1290;
                                        String var134 = var10.field2561;
                                        String var135 = method1880(var134, var10);
                                        while (var135.length() > 0) {
                                            int var136 = var135.indexOf(class2.field28);
                                            String var137;
                                            if (var136 == -1) {
                                                var137 = var135;
                                                var135 = "";
                                            } else {
                                                var137 = var135.substring(0, var136);
                                                var135 = var135.substring(var136 + 4);
                                            }
                                            int var138 = var133.method3297(var137);
                                            if (var138 > var131) {
                                                var131 = var138;
                                            }
                                            var132 += var133.field2902 + 1;
                                        }
                                        var131 += 6;
                                        var132 += 7;
                                        int var139 = var10.field2523 + var13 - 5 - var131;
                                        int var140 = var10.field2515 + var14 + 5;
                                        if (var139 < var13 + 5) {
                                            var139 = var13 + 5;
                                        }
                                        if (var131 + var139 > arg4) {
                                            var139 = arg4 - var131;
                                        }
                                        if (var132 + var140 > arg5) {
                                            var140 = arg5 - var132;
                                        }
                                        class73.method1504(var139, var140, var131, var132, 16777120);
                                        class73.method1506(var139, var140, var131, var132, 0);
                                        String var141 = var10.field2561;
                                        int var142 = var133.field2902 + var140 + 2;
                                        String var143 = method1880(var141, var10);
                                        while (var143.length() > 0) {
                                            int var144 = var143.indexOf(class2.field28);
                                            String var145;
                                            if (var144 == -1) {
                                                var145 = var143;
                                                var143 = "";
                                            } else {
                                                var145 = var143.substring(0, var144);
                                                var143 = var143.substring(var144 + 4);
                                            }
                                            var133.method3295(var145, var139 + 3, var142, 0, -1);
                                            var142 += var133.field2902 + 1;
                                        }
                                    }
                                    if (var10.field2581 == 9) {
                                        if (var10.field2537 == 1) {
                                            class73.method1512(var13, var14, var10.field2523 + var13, var10.field2515 + var14, var10.field2543);
                                        } else {
                                            int var146 = var10.field2523 >= 0 ? var10.field2523 : -var10.field2523;
                                            int var147 = var10.field2515 >= 0 ? var10.field2515 : -var10.field2515;
                                            int var148 = var146;
                                            if (var146 < var147) {
                                                var148 = var147;
                                            }
                                            if (var148 != 0) {
                                                int var149 = (var10.field2523 << 16) / var148;
                                                int var150 = (var10.field2515 << 16) / var148;
                                                if (var150 <= var149) {
                                                    var149 = -var149;
                                                } else {
                                                    var150 = -var150;
                                                }
                                                int var151 = var10.field2537 * var150 >> 17;
                                                int var152 = var10.field2537 * var150 + 1 >> 17;
                                                int var153 = var10.field2537 * var149 >> 17;
                                                int var154 = var10.field2537 * var149 + 1 >> 17;
                                                int var155 = var13 + var151;
                                                int var156 = var13 - var152;
                                                int var157 = var10.field2523 + var13 - var152;
                                                int var158 = var10.field2523 + var13 + var151;
                                                int var159 = var14 + var153;
                                                int var160 = var14 - var154;
                                                int var161 = var10.field2515 + var14 - var154;
                                                int var162 = var10.field2515 + var14 + var153;
                                                class84.method1831(var155, var156, var157);
                                                class84.method1784(var159, var160, var161, var155, var156, var157, var10.field2543);
                                                class84.method1831(var155, var157, var158);
                                                class84.method1784(var159, var161, var162, var155, var157, var158, var10.field2543);
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

    @ObfuscatedName("cj.cc(Ljava/lang/String;Leo;I)Ljava/lang/String;")
    public static String method1880(String arg0, class152 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1875(method492(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field141 != null) {
                    var5 = class199.method2920(Statics.field141.field2035);
                    if (Statics.field141.field2039 != null) {
                        var5 = (String) Statics.field141.field2039;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cv.ci(II)Ljava/lang/String;")
    public static final String method1875(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("fo.cr(Leo;I)Z")
    public static final boolean method3088(class152 arg0) {
        if (arg0.field2611 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2611.length; var1++) {
            int var2 = method492(arg0, var1);
            int var3 = arg0.field2526[var1];
            if (arg0.field2611[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2611[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2611[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("j.ca(Leo;II)I")
    public static final int method492(class152 arg0, int arg1) {
        if (arg0.field2550 == null || arg1 >= arg0.field2550.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2550[arg1];
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
                    var7 = field392[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field291[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class152 var11 = class152.method2301(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method1771(var12).field1025 || field257)) {
                        for (int var13 = 0; var13 < var11.field2616.length; var13++) {
                            if (var12 + 1 == var11.field2616[var13]) {
                                var7 += var11.field2617[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class154.field2642[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2097[field392[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class154.field2642[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field994.field39;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2098[var14]) {
                            var7 += field392[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class152 var17 = class152.method2301(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method1771(var18).field1025 || field257)) {
                        for (int var19 = 0; var19 < var17.field2616.length; var19++) {
                            if (var18 + 1 == var17.field2616[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field419;
                }
                if (var6 == 12) {
                    var7 = field420;
                }
                if (var6 == 13) {
                    int var20 = class154.field2642[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = Statics.method2786(var22);
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
                    var7 = (Statics.field994.field743 >> 7) + Statics.field304;
                }
                if (var6 == 19) {
                    var7 = (Statics.field994.field717 >> 7) + Statics.field671;
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

    @ObfuscatedName("dn.cl(Leo;III)V")
    public static final void method2505(class152 arg0, int arg1, int arg2) {
        if (arg0.field2531 == 1) {
            method1858(arg0.field2615, "", 24, 0, 0, arg0.field2514);
        }
        if (arg0.field2531 == 2 && !field409) {
            String var3 = method35(arg0);
            if (var3 != null) {
                method1858(var3, class2.method2647(65280) + arg0.field2614, 25, 0, -1, arg0.field2514);
            }
        }
        if (arg0.field2531 == 3) {
            method1858(class142.field2277, "", 26, 0, 0, arg0.field2514);
        }
        if (arg0.field2531 == 4) {
            method1858(arg0.field2615, "", 28, 0, 0, arg0.field2514);
        }
        if (arg0.field2531 == 5) {
            method1858(arg0.field2615, "", 29, 0, 0, arg0.field2514);
        }
        if (arg0.field2531 == 6 && field418 == null) {
            method1858(arg0.field2615, "", 30, 0, -1, arg0.field2514);
        }
        if (arg0.field2581 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2515; var5++) {
                for (int var6 = 0; var6 < arg0.field2523; var6++) {
                    int var7 = (arg0.field2610 + 32) * var6;
                    int var8 = (arg0.field2584 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2575[var4];
                        var8 += arg0.field2570[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field368 = var4;
                        Statics.field161 = arg0;
                        if (arg0.field2616[var4] > 0) {
                            class45 var9 = class45.method1771(arg0.field2616[var4] - 1);
                            if (field407 == 1 && class156.method2523(method3455(arg0))) {
                                if (Statics.field972 != arg0.field2514 || Statics.field1453 != var4) {
                                    method1858(class142.field2268, field408 + " " + class2.field21 + " " + class2.method2647(16748608) + var9.field1012, 31, var9.field1010, var4, arg0.field2514);
                                }
                            } else if (!field409 || !class156.method2523(method3455(arg0))) {
                                String[] var10 = var9.field1034;
                                if (field292) {
                                    var10 = Statics.method684(var10);
                                }
                                if (class156.method2523(method3455(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method1858(var10[var11], class2.method2647(16748608) + var9.field1012, var12, var9.field1010, var4, arg0.field2514);
                                        } else if (var11 == 4) {
                                            method1858(class142.field2120, class2.method2647(16748608) + var9.field1012, 37, var9.field1010, var4, arg0.field2514);
                                        }
                                    }
                                }
                                if (class156.method495(method3455(arg0))) {
                                    method1858(class142.field2268, class2.method2647(16748608) + var9.field1012, 38, var9.field1010, var4, arg0.field2514);
                                }
                                if (class156.method2523(method3455(arg0)) && var10 != null) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var10[var13] != null) {
                                            byte var14 = 0;
                                            if (var13 == 0) {
                                                var14 = 33;
                                            }
                                            if (var13 == 1) {
                                                var14 = 34;
                                            }
                                            if (var13 == 2) {
                                                var14 = 35;
                                            }
                                            method1858(var10[var13], class2.method2647(16748608) + var9.field1012, var14, var9.field1010, var4, arg0.field2514);
                                        }
                                    }
                                }
                                String[] var15 = arg0.field2572;
                                if (field292) {
                                    var15 = Statics.method684(var15);
                                }
                                if (var15 != null) {
                                    for (int var16 = 4; var16 >= 0; var16--) {
                                        if (var15[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 39;
                                            }
                                            if (var16 == 1) {
                                                var17 = 40;
                                            }
                                            if (var16 == 2) {
                                                var17 = 41;
                                            }
                                            if (var16 == 3) {
                                                var17 = 42;
                                            }
                                            if (var16 == 4) {
                                                var17 = 43;
                                            }
                                            method1858(var15[var16], class2.method2647(16748608) + var9.field1012, var17, var9.field1010, var4, arg0.field2514);
                                        }
                                    }
                                }
                                method1858(class142.field2247, class2.method2647(16748608) + var9.field1012, 1005, var9.field1010, var4, arg0.field2514);
                            } else if ((Statics.field1259 & 0x10) == 16) {
                                method1858(field412, field413 + " " + class2.field21 + " " + class2.method2647(16748608) + var9.field1012, 32, var9.field1010, var4, arg0.field2514);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2513) {
            return;
        }
        if (field409) {
            int var18 = method3455(arg0);
            boolean var19 = (var18 >> 21 & 0x1) != 0;
            if (var19 && (Statics.field1259 & 0x20) == 32) {
                method1858(field412, field413 + " " + class2.field21 + " " + arg0.field2586, 58, 0, arg0.field2605, arg0.field2514);
            }
            return;
        }
        for (int var20 = 9; var20 >= 5; var20--) {
            String var21 = method2507(arg0, var20);
            if (var21 != null) {
                method1858(var21, arg0.field2586, 1007, var20 + 1, arg0.field2605, arg0.field2514);
            }
        }
        String var22 = method35(arg0);
        if (var22 != null) {
            method1858(var22, arg0.field2586, 25, 0, arg0.field2605, arg0.field2514);
        }
        for (int var23 = 4; var23 >= 0; var23--) {
            String var24 = method2507(arg0, var23);
            if (var24 != null) {
                method1858(var24, arg0.field2586, 57, var23 + 1, arg0.field2605, arg0.field2514);
            }
        }
        int var25 = method3455(arg0);
        boolean var26 = (var25 & 0x1) != 0;
        if (var26) {
            method1858(class142.field2227, "", 30, 0, arg0.field2605, arg0.field2514);
        }
    }

    @ObfuscatedName("v.ch(IIIIIIII)V")
    public static final void method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class152.method1877(arg0)) {
            method150(Statics.field2618[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("r.cf([Leo;IIIIIIIB)V")
    public static final void method150(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class152 var9 = arg0[var8];
            if (var9 != null && (!var9.field2513 || var9.field2581 == 0 || var9.field2624 || method3455(var9) != 0 || field279 == var9) && var9.field2594 == arg1 && (!var9.field2513 || !method114(var9))) {
                int var10 = var9.field2628 + arg6;
                int var11 = var9.field2520 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2581 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2581 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2523 + var10;
                    int var19 = var9.field2515 + var11;
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
                    int var22 = var9.field2523 + var10;
                    int var23 = var9.field2515 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field427 == var9) {
                    field434 = true;
                    field435 = var10;
                    field436 = var11;
                }
                if (!var9.field2513 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field1974;
                    int var25 = class127.field1981;
                    if (class127.field1975 != 0) {
                        var24 = class127.field1980;
                        var25 = class127.field1988;
                    }
                    if (var9.field2518 == 1337) {
                        method2502(var9);
                        if (!field261 && !field395 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method81(var24, var25, var12, var13);
                        }
                    } else if (var9.field2518 != 1338) {
                        if (!field395 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2505(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2581 == 0) {
                            if (!var9.field2513 && method114(var9) && Statics.field1842 != var9) {
                                continue;
                            }
                            method150(arg0, var9.field2514, var12, var13, var14, var15, var10 - var9.field2527, var11 - var9.field2574);
                            if (var9.field2622 != null) {
                                method150(var9.field2622, var9.field2514, var12, var13, var14, var15, var10 - var9.field2527, var11 - var9.field2574);
                            }
                            class4 var37 = (class4) field415.method3138((long) var9.field2514);
                            if (var37 != null) {
                                if (var37.field52 == 0 && class127.field1974 >= var12 && class127.field1981 >= var13 && class127.field1974 < var14 && class127.field1981 < var15 && !field395 && !field379) {
                                    field401[0] = class142.field2354;
                                    field446[0] = "";
                                    field280[0] = 1006;
                                    field358 = 1;
                                }
                                method464(var37.field60, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2513) {
                            if (var9.field2631 && class127.field1974 >= var12 && class127.field1981 >= var13 && class127.field1974 < var14 && class127.field1981 < var15) {
                                for (class1 var38 = (class1) field452.method3170(); var38 != null; var38 = (class1) field452.method3172()) {
                                    if (var38.field2) {
                                        var38.method3261();
                                        var38.field3.field2532 = false;
                                    }
                                }
                                if (Statics.field1430 == 0) {
                                    field427 = null;
                                    field279 = null;
                                }
                                if (!field395) {
                                    field401[0] = class142.field2354;
                                    field446[0] = "";
                                    field280[0] = 1006;
                                    field358 = 1;
                                }
                            }
                            boolean var39;
                            if (class127.field1974 >= var12 && class127.field1981 >= var13 && class127.field1974 < var14 && class127.field1981 < var15) {
                                var39 = true;
                            } else {
                                var39 = false;
                            }
                            boolean var40 = false;
                            if ((class127.field1979 == 1 || !Statics.field549 && class127.field1979 == 4) && var39) {
                                var40 = true;
                            }
                            boolean var41 = false;
                            if ((class127.field1975 == 1 || !Statics.field549 && class127.field1975 == 4) && class127.field1980 >= var12 && class127.field1988 >= var13 && class127.field1980 < var14 && class127.field1988 < var15) {
                                var41 = true;
                            }
                            if (var41) {
                                method1961(var9, class127.field1980 - var10, class127.field1988 - var11);
                            }
                            if (field427 != null && field427 != var9 && var39) {
                                int var42 = method3455(var9);
                                boolean var43 = (var42 >> 20 & 0x1) != 0;
                                if (var43) {
                                    field430 = var9;
                                }
                            }
                            if (field279 == var9) {
                                field259 = true;
                                field432 = var10;
                                field463 = var11;
                            }
                            if (var9.field2624) {
                                if (var39 && field451 != 0 && var9.field2602 != null) {
                                    class1 var44 = new class1();
                                    var44.field2 = true;
                                    var44.field3 = var9;
                                    var44.field6 = field451;
                                    var44.field11 = var9.field2602;
                                    field452.method3166(var44);
                                }
                                if (field427 != null || Statics.field122 != null || field395) {
                                    var41 = false;
                                    var40 = false;
                                    var39 = false;
                                }
                                if (!var9.field2530 && var41) {
                                    var9.field2530 = true;
                                    if (var9.field2583 != null) {
                                        class1 var45 = new class1();
                                        var45.field2 = true;
                                        var45.field3 = var9;
                                        var45.field5 = class127.field1980 - var10;
                                        var45.field6 = class127.field1988 - var11;
                                        var45.field11 = var9.field2583;
                                        field452.method3166(var45);
                                    }
                                }
                                if (var9.field2530 && var40 && var9.field2507 != null) {
                                    class1 var46 = new class1();
                                    var46.field2 = true;
                                    var46.field3 = var9;
                                    var46.field5 = class127.field1974 - var10;
                                    var46.field6 = class127.field1981 - var11;
                                    var46.field11 = var9.field2507;
                                    field452.method3166(var46);
                                }
                                if (var9.field2530 && !var40) {
                                    var9.field2530 = false;
                                    if (var9.field2585 != null) {
                                        class1 var47 = new class1();
                                        var47.field2 = true;
                                        var47.field3 = var9;
                                        var47.field5 = class127.field1974 - var10;
                                        var47.field6 = class127.field1981 - var11;
                                        var47.field11 = var9.field2585;
                                        field454.method3166(var47);
                                    }
                                }
                                if (var40 && var9.field2542 != null) {
                                    class1 var48 = new class1();
                                    var48.field2 = true;
                                    var48.field3 = var9;
                                    var48.field5 = class127.field1974 - var10;
                                    var48.field6 = class127.field1981 - var11;
                                    var48.field11 = var9.field2542;
                                    field452.method3166(var48);
                                }
                                if (!var9.field2532 && var39) {
                                    var9.field2532 = true;
                                    if (var9.field2564 != null) {
                                        class1 var49 = new class1();
                                        var49.field2 = true;
                                        var49.field3 = var9;
                                        var49.field5 = class127.field1974 - var10;
                                        var49.field6 = class127.field1981 - var11;
                                        var49.field11 = var9.field2564;
                                        field452.method3166(var49);
                                    }
                                }
                                if (var9.field2532 && var39 && var9.field2553 != null) {
                                    class1 var50 = new class1();
                                    var50.field2 = true;
                                    var50.field3 = var9;
                                    var50.field5 = class127.field1974 - var10;
                                    var50.field6 = class127.field1981 - var11;
                                    var50.field11 = var9.field2553;
                                    field452.method3166(var50);
                                }
                                if (var9.field2532 && !var39) {
                                    var9.field2532 = false;
                                    if (var9.field2589 != null) {
                                        class1 var51 = new class1();
                                        var51.field2 = true;
                                        var51.field3 = var9;
                                        var51.field5 = class127.field1974 - var10;
                                        var51.field6 = class127.field1981 - var11;
                                        var51.field11 = var9.field2589;
                                        field454.method3166(var51);
                                    }
                                }
                                if (var9.field2600 != null) {
                                    class1 var52 = new class1();
                                    var52.field3 = var9;
                                    var52.field11 = var9.field2600;
                                    field453.method3166(var52);
                                }
                                if (var9.field2613 != null && field440 > var9.field2623) {
                                    if (var9.field2598 == null || field440 - var9.field2623 > 32) {
                                        class1 var57 = new class1();
                                        var57.field3 = var9;
                                        var57.field11 = var9.field2613;
                                        field452.method3166(var57);
                                    } else {
                                        label579: for (int var53 = var9.field2623; var53 < field440; var53++) {
                                            int var54 = field439[var53 & 0x1F];
                                            for (int var55 = 0; var55 < var9.field2598.length; var55++) {
                                                if (var9.field2598[var55] == var54) {
                                                    class1 var56 = new class1();
                                                    var56.field3 = var9;
                                                    var56.field11 = var9.field2613;
                                                    field452.method3166(var56);
                                                    break label579;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2623 = field440;
                                }
                                if (var9.field2596 != null && field442 > var9.field2627) {
                                    if (var9.field2597 == null || field442 - var9.field2627 > 32) {
                                        class1 var62 = new class1();
                                        var62.field3 = var9;
                                        var62.field11 = var9.field2596;
                                        field452.method3166(var62);
                                    } else {
                                        label555: for (int var58 = var9.field2627; var58 < field442; var58++) {
                                            int var59 = field441[var58 & 0x1F];
                                            for (int var60 = 0; var60 < var9.field2597.length; var60++) {
                                                if (var9.field2597[var60] == var59) {
                                                    class1 var61 = new class1();
                                                    var61.field3 = var9;
                                                    var61.field11 = var9.field2596;
                                                    field452.method3166(var61);
                                                    break label555;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2627 = field442;
                                }
                                if (var9.field2606 != null && field482 > var9.field2626) {
                                    if (var9.field2567 == null || field482 - var9.field2626 > 32) {
                                        class1 var67 = new class1();
                                        var67.field3 = var9;
                                        var67.field11 = var9.field2606;
                                        field452.method3166(var67);
                                    } else {
                                        label531: for (int var63 = var9.field2626; var63 < field482; var63++) {
                                            int var64 = field443[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var9.field2567.length; var65++) {
                                                if (var9.field2567[var65] == var64) {
                                                    class1 var66 = new class1();
                                                    var66.field3 = var9;
                                                    var66.field11 = var9.field2606;
                                                    field452.method3166(var66);
                                                    break label531;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2626 = field482;
                                }
                                if (field445 > var9.field2625 && var9.field2603 != null) {
                                    class1 var68 = new class1();
                                    var68.field3 = var9;
                                    var68.field11 = var9.field2603;
                                    field452.method3166(var68);
                                }
                                if (field458 > var9.field2625 && var9.field2516 != null) {
                                    class1 var69 = new class1();
                                    var69.field3 = var9;
                                    var69.field11 = var9.field2516;
                                    field452.method3166(var69);
                                }
                                if (field447 > var9.field2625 && var9.field2525 != null) {
                                    class1 var70 = new class1();
                                    var70.field3 = var9;
                                    var70.field11 = var9.field2525;
                                    field452.method3166(var70);
                                }
                                if (field448 > var9.field2625 && var9.field2607 != null) {
                                    class1 var71 = new class1();
                                    var71.field3 = var9;
                                    var71.field11 = var9.field2607;
                                    field452.method3166(var71);
                                }
                                var9.field2625 = field268;
                                if (var9.field2604 != null) {
                                    for (int var72 = 0; var72 < field471; var72++) {
                                        class1 var73 = new class1();
                                        var73.field3 = var9;
                                        var73.field8 = field473[var72];
                                        var73.field9 = field472[var72];
                                        var73.field11 = var9.field2604;
                                        field452.method3166(var73);
                                    }
                                }
                            }
                        }
                        if (!var9.field2513 && field427 == null && Statics.field122 == null && !field395) {
                            if ((var9.field2569 >= 0 || var9.field2533 != 0) && class127.field1974 >= var12 && class127.field1981 >= var13 && class127.field1974 < var14 && class127.field1981 < var15) {
                                if (var9.field2569 >= 0) {
                                    Statics.field1842 = arg0[var9.field2569];
                                } else {
                                    Statics.field1842 = var9;
                                }
                            }
                            if (var9.field2581 == 8 && class127.field1974 >= var12 && class127.field1981 >= var13 && class127.field1974 < var14 && class127.field1981 < var15) {
                                Statics.field1043 = var9;
                            }
                            if (var9.field2544 > var9.field2515) {
                                int var74 = var9.field2523 + var10;
                                int var75 = var9.field2515;
                                int var76 = var9.field2544;
                                int var77 = class127.field1974;
                                int var78 = class127.field1981;
                                if (field334) {
                                    field335 = 32;
                                } else {
                                    field335 = 0;
                                }
                                field334 = false;
                                if (class127.field1979 == 1 || !Statics.field549 && class127.field1979 == 4) {
                                    if (var77 >= var74 && var77 < var74 + 16 && var78 >= var11 && var78 < var11 + 16) {
                                        var9.field2574 -= 4;
                                        method2502(var9);
                                    } else if (var77 >= var74 && var77 < var74 + 16 && var78 >= var11 + var75 - 16 && var78 < var11 + var75) {
                                        var9.field2574 += 4;
                                        method2502(var9);
                                    } else if (var77 >= var74 - field335 && var77 < field335 + var74 + 16 && var78 >= var11 + 16 && var78 < var11 + var75 - 16) {
                                        int var79 = (var75 - 32) * var75 / var76;
                                        if (var79 < 8) {
                                            var79 = 8;
                                        }
                                        int var80 = var78 - var11 - 16 - var79 / 2;
                                        int var81 = var75 - 32 - var79;
                                        var9.field2574 = (var76 - var75) * var80 / var81;
                                        method2502(var9);
                                        field334 = true;
                                    }
                                }
                                if (field451 != 0) {
                                    int var82 = var9.field2523;
                                    if (var77 >= var74 - var82 && var78 >= var11 && var77 < var74 + 16 && var78 <= var11 + var75) {
                                        var9.field2574 += field451 * 45;
                                        method2502(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field492 == 0 || field492 == 3) && (class127.field1975 == 1 || !Statics.field549 && class127.field1975 == 4)) {
                        int var26 = class127.field1980 - 25 - var10;
                        int var27 = class127.field1988 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field337 + field323 & 0x7FF;
                            int var29 = class84.field1483[var28];
                            int var30 = class84.field1484[var28];
                            int var31 = (field450 + 256) * var29 >> 8;
                            int var32 = (field450 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field994.field743 + var33 >> 7;
                            int var36 = Statics.field994.field717 - var34 >> 7;
                            field460.method2339(121);
                            field460.method2168(18);
                            field460.method2185(Statics.field304 + var35);
                            field460.method2162(Statics.field671 + var36);
                            field460.method2140(class124.field1949[82] ? (class124.field1949[81] ? 2 : 1) : 0);
                            field460.method2168(var26);
                            field460.method2168(var27);
                            field460.method2185(field337);
                            field460.method2168(57);
                            field460.method2168(field323);
                            field460.method2168(field450);
                            field460.method2168(89);
                            field460.method2185(Statics.field994.field743);
                            field460.method2185(Statics.field994.field717);
                            field460.method2168(63);
                            field282 = var35;
                            field483 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.co([Leo;II)V")
    public static final void method1(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2581 == 0) {
                    if (var3.field2622 != null) {
                        method1(var3.field2622, arg1);
                    }
                    class4 var4 = (class4) field415.method3138((long) var3.field2514);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class152.method1877(var5)) {
                            method1(Statics.field2618[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2608 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field11 = var3.field2608;
                    class32.method126(var6);
                }
                if (arg1 == 1 && var3.field2609 != null) {
                    if (var3.field2605 >= 0) {
                        class152 var7 = class152.method2301(var3.field2514);
                        if (var7 == null || var7.field2622 == null || var3.field2605 >= var7.field2622.length || var7.field2622[var3.field2605] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field11 = var3.field2609;
                    class32.method126(var8);
                }
            }
        }
    }

    @ObfuscatedName("cm.ct(Leo;III)V")
    public static final void method1961(class152 arg0, int arg1, int arg2) {
        if (field427 != null || field395 || arg0 == null || method2482(arg0) == null) {
            return;
        }
        field427 = arg0;
        field279 = method2482(arg0);
        field428 = arg1;
        field499 = arg2;
        Statics.field1430 = 0;
        field437 = false;
        if (field358 > 0) {
            method131(field358 - 1);
        }
    }

    @ObfuscatedName("b.cv(IB)V")
    public static void method131(int arg0) {
        Statics.field599 = new class27();
        Statics.field599.field628 = field397[arg0];
        Statics.field599.field626 = field398[arg0];
        Statics.field599.field633 = field280[arg0];
        Statics.field599.field629 = field423[arg0];
        Statics.field599.field630 = field401[arg0];
    }

    @ObfuscatedName("c.cp(III)V")
    public static void method30(int arg0, int arg1) {
        method106(Statics.field599, arg0, arg1);
        Statics.field599 = null;
    }

    @ObfuscatedName("dy.cs(Leo;B)V")
    public static void method2502(class152 arg0) {
        if (field273 == arg0.field2630) {
            field444[arg0.field2629] = true;
        }
    }

    @ObfuscatedName("l.cj(B)V")
    public static void method87() {
        for (class4 var0 = (class4) field415.method3134(); var0 != null; var0 = (class4) field415.method3135()) {
            int var1 = var0.field60;
            if (class152.method1877(var1)) {
                boolean var2 = true;
                class152[] var3 = Statics.field2618[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2513;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2866;
                    class152 var6 = class152.method2301(var5);
                    if (var6 != null) {
                        method2502(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("du.cd(Leo;I)Leo;")
    public static class152 method2482(class152 arg0) {
        class152 var1 = arg0;
        int var2 = class156.method793(method3455(arg0));
        class152 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class152.method2301(var1.field2594);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class152 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2576;
        }
        return var5;
    }

    @ObfuscatedName("ag.ce([Leo;II)V")
    public static final void method985(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null && var3.field2594 == arg1 && (!var3.field2513 || !method114(var3))) {
                if (var3.field2581 == 0) {
                    if (!var3.field2513 && method114(var3) && Statics.field1842 != var3) {
                        continue;
                    }
                    method985(arg0, var3.field2514);
                    if (var3.field2622 != null) {
                        method985(var3.field2622, var3.field2514);
                    }
                    class4 var4 = (class4) field415.method3138((long) var3.field2514);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class152.method1877(var5)) {
                            method985(Statics.field2618[var5], -1);
                        }
                    }
                }
                if (var3.field2581 == 6) {
                    if (var3.field2508 != -1 || var3.field2551 != -1) {
                        boolean var6 = method3088(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2551;
                        } else {
                            var7 = var3.field2508;
                        }
                        if (var7 != -1) {
                            class38 var8 = class38.method1579(var7);
                            var3.field2621 += field328;
                            while (var3.field2621 > var8.field905[var3.field2568]) {
                                var3.field2621 -= var8.field905[var3.field2568];
                                var3.field2568++;
                                if (var3.field2568 >= var8.field896.length) {
                                    var3.field2568 -= var8.field900;
                                    if (var3.field2568 < 0 || var3.field2568 >= var8.field896.length) {
                                        var3.field2568 = 0;
                                    }
                                }
                                method2502(var3);
                            }
                        }
                    }
                    if (var3.field2612 != 0 && !var3.field2513) {
                        int var9 = var3.field2612 >> 16;
                        int var10 = var3.field2612 << 16 >> 16;
                        int var11 = field328 * var9;
                        int var12 = field328 * var10;
                        var3.field2554 = var3.field2554 + var11 & 0x7FF;
                        var3.field2555 = var3.field2555 + var12 & 0x7FF;
                        method2502(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eo.cb(IS)V")
    public static final void method2847(int arg0) {
        method87();
        class20.method2073();
        class46 var1 = (class46) class46.field1058.method3099((long) arg0);
        class46 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1064.method2668(16, arg0);
            class46 var4 = new class46();
            if (var3 != null) {
                var4.method880(new class107(var3));
            }
            class46.field1058.method3101(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1056;
        if (var5 == 0) {
            return;
        }
        int var6 = class154.field2642[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class84.method1778(0.9D);
                ((class88) Statics.field1466).method1862(0.9D);
            }
            if (var6 == 2) {
                class84.method1778(0.8D);
                ((class88) Statics.field1466).method1862(0.8D);
            }
            if (var6 == 3) {
                class84.method1778(0.7D);
                ((class88) Statics.field1466).method1862(0.7D);
            }
            if (var6 == 4) {
                class84.method1778(0.6D);
                ((class88) Statics.field1466).method1862(0.6D);
            }
            Statics.method147();
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
            if (field346 != var7) {
                if (field346 == 0 && field486 != -1) {
                    class161.method2649(Statics.field2083, field486, 0, var7, false);
                    field487 = false;
                } else if (var7 == 0) {
                    Statics.field2703.method3035();
                    class161.field2704 = 1;
                    Statics.field1000 = null;
                    field487 = false;
                } else {
                    class161.method458(var7);
                }
                field346 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field488 = 127;
            }
            if (var6 == 1) {
                field488 = 96;
            }
            if (var6 == 2) {
                field488 = 64;
            }
            if (var6 == 3) {
                field488 = 32;
            }
            if (var6 == 4) {
                field488 = 0;
            }
        }
        if (var5 == 5) {
            field394 = var6;
        }
        if (var5 == 6) {
            field290 = var6;
        }
        if (var5 == 9) {
            field410 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field371 = 127;
            }
            if (var6 == 1) {
                field371 = 96;
            }
            if (var6 == 2) {
                field371 = 64;
            }
            if (var6 == 3) {
                field371 = 32;
            }
            if (var6 == 4) {
                field371 = 0;
            }
        }
        if (var5 == 17) {
            field422 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            class18[] var8 = new class18[] { class18.field515, class18.field516, class18.field514 };
            field324 = (class18) class99.method704(var8, var6);
            if (field324 == null) {
                field324 = class18.field515;
            }
        }
        if (var5 != 19) {
            return;
        }
        if (var6 == -1) {
            field507 = -1;
        } else {
            field507 = var6 & 0x7FF;
        }
    }

    @ObfuscatedName("y.cy(B)V")
    public static final void method71() {
        field460.method2339(208);
        for (class4 var0 = (class4) field415.method3134(); var0 != null; var0 = (class4) field415.method3135()) {
            if (var0.field52 == 0 || var0.field52 == 3) {
                method1770(var0, true);
            }
        }
        if (field418 != null) {
            method2502(field418);
            field418 = null;
        }
    }

    @ObfuscatedName("dj.cx(IIIS)Lp;")
    public static final class4 method2395(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field60 = arg1;
        var3.field52 = arg2;
        field415.method3132(var3, (long) arg0);
        if (class152.method1877(arg1)) {
            class152[] var4 = Statics.field2618[arg1];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class152 var6 = var4[var5];
                if (var6 != null) {
                    var6.field2568 = 0;
                    var6.field2621 = 0;
                }
            }
        }
        class32.method1589(arg1);
        class152 var7 = class152.method2301(arg0);
        if (var7 != null) {
            method2502(var7);
        }
        if (field418 != null) {
            method2502(field418);
            field418 = null;
        }
        Statics.method581();
        if (field416 != -1) {
            int var8 = field416;
            if (class152.method1877(var8)) {
                method1(Statics.field2618[var8], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("ca.cz(Lp;ZI)V")
    public static final void method1770(class4 arg0, boolean arg1) {
        int var2 = arg0.field60;
        int var3 = (int) arg0.field2866;
        arg0.method3261();
        if (arg1) {
            class152.method2771(var2);
        }
        for (class179 var4 = (class179) field455.method3134(); var4 != null; var4 = (class179) field455.method3135()) {
            if ((long) var2 == (var4.field2866 >> 48 & 0xFFFFL)) {
                var4.method3261();
            }
        }
        class152 var5 = class152.method2301(var3);
        if (var5 != null) {
            method2502(var5);
        }
        Statics.method581();
        if (field416 != -1) {
            int var6 = field416;
            if (class152.method1877(var6)) {
                method1(Statics.field2618[var6], 1);
            }
        }
    }

    @ObfuscatedName("g.cg(Leo;I)Z")
    public static final boolean method80(class152 arg0) {
        int var1 = arg0.field2518;
        if (var1 == 205) {
            field299 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field374.method2868(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field374.method2883(var4, var5 == 1);
        }
        if (var1 == 324) {
            field374.method2870(false);
        }
        if (var1 == 325) {
            field374.method2870(true);
        }
        if (var1 == 326) {
            field460.method2339(199);
            field374.method2871(field460);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dn.ck(IIII)V")
    public static final void method2508(int arg0, int arg1, int arg2) {
        method2848();
        class73.method1536(arg0, arg1, Statics.field2816.field1318 + arg0, Statics.field2816.field1316 + arg1);
        if (field492 == 2 || field492 == 5) {
            class73.method1513(arg0 + 25, arg1 + 5, 0, Statics.field1856, Statics.field1026);
        } else {
            int var3 = field337 + field323 & 0x7FF;
            int var4 = Statics.field994.field743 / 32 + 48;
            int var5 = 464 - Statics.field994.field717 / 32;
            Statics.field876.method1460(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field450 + 256, Statics.field1856, Statics.field1026);
            for (int var6 = 0; var6 < field484; var6++) {
                int var7 = field479[var6] * 4 + 2 - Statics.field994.field743 / 32;
                int var8 = field509[var6] * 4 + 2 - Statics.field994.field717 / 32;
                method119(arg0, arg1, var7, var8, field414[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field387[Statics.field221][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field994.field743 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field994.field717 / 32;
                        method119(arg0, arg1, var12, var13, Statics.field1431[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field424; var14++) {
                class30 var15 = field271[field497[var14]];
                if (var15 != null && var15.method16()) {
                    class35 var16 = var15.field686;
                    if (var16 != null && var16.field815 != null) {
                        var16 = var16.method611();
                    }
                    if (var16 != null && var16.field816 && var16.field786) {
                        int var17 = var15.field743 / 32 - Statics.field994.field743 / 32;
                        int var18 = var15.field717 / 32 - Statics.field994.field717 / 32;
                        method119(arg0, arg1, var17, var18, Statics.field1431[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field373; var19++) {
                class3 var20 = field310[field275[var19]];
                if (var20 != null && var20.method16() && !var20.field50) {
                    int var21 = var20.field743 / 32 - Statics.field994.field743 / 32;
                    int var22 = var20.field717 / 32 - Statics.field994.field717 / 32;
                    boolean var23 = false;
                    if (Statics.method2050(var20.field35, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field2640; var25++) {
                        if (var20.field35.equals(Statics.field1685[var25].field552)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field994.field49 != 0 && var20.field49 != 0 && Statics.field994.field49 == var20.field49) {
                        var26 = true;
                    }
                    if (var23) {
                        method119(arg0, arg1, var21, var22, Statics.field1431[3]);
                    } else if (var26) {
                        method119(arg0, arg1, var21, var22, Statics.field1431[4]);
                    } else if (var24) {
                        method119(arg0, arg1, var21, var22, Statics.field1431[5]);
                    } else {
                        method119(arg0, arg1, var21, var22, Statics.field1431[2]);
                    }
                }
            }
            if (field270 != 0 && field274 % 20 < 10) {
                if (field270 == 1 && field495 >= 0 && field495 < field271.length) {
                    class30 var27 = field271[field495];
                    if (var27 != null) {
                        int var28 = var27.field743 / 32 - Statics.field994.field743 / 32;
                        int var29 = var27.field717 / 32 - Statics.field994.field717 / 32;
                        method496(arg0, arg1, var28, var29, Statics.field604[1]);
                    }
                }
                if (field270 == 2) {
                    int var30 = field456 * 4 - Statics.field304 * 4 + 2 - Statics.field994.field743 / 32;
                    int var31 = field425 * 4 - Statics.field671 * 4 + 2 - Statics.field994.field717 / 32;
                    method496(arg0, arg1, var30, var31, Statics.field604[1]);
                }
                if (field270 == 10 && field272 >= 0 && field272 < field310.length) {
                    class3 var32 = field310[field272];
                    if (var32 != null) {
                        int var33 = var32.field743 / 32 - Statics.field994.field743 / 32;
                        int var34 = var32.field717 / 32 - Statics.field994.field717 / 32;
                        method496(arg0, arg1, var33, var34, Statics.field604[1]);
                    }
                }
            }
            if (field282 != 0) {
                int var35 = field282 * 4 + 2 - Statics.field994.field743 / 32;
                int var36 = field483 * 4 + 2 - Statics.field994.field717 / 32;
                method119(arg0, arg1, var35, var36, Statics.field604[0]);
            }
            if (!Statics.field994.field50) {
                class73.method1504(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field492 < 3) {
            Statics.field2637.method1460(arg0, arg1, 33, 33, 25, 25, field337, 256, Statics.field1079, Statics.field1867);
        } else {
            class73.method1513(arg0, arg1, 0, Statics.field1079, Statics.field1867);
        }
        if (field309[arg2]) {
            Statics.field2816.method1560(arg0, arg1);
        }
        field459[arg2] = true;
    }

    @ObfuscatedName("s.cn(IIIILbr;I)V")
    public static final void method496(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method119(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field337 + field323 & 0x7FF;
        int var7 = class84.field1483[var6];
        int var8 = class84.field1484[var6];
        int var9 = var7 * 256 / (field450 + 256);
        int var10 = var8 * 256 / (field450 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field2635.method1473(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("m.cq(IIIILbr;I)V")
    public static final void method119(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field337 + field323 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1483[var5];
        int var8 = class84.field1484[var5];
        int var9 = var7 * 256 / (field450 + 256);
        int var10 = var8 * 256 / (field450 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1423(Statics.field2816, arg0 + 94 + var11 - arg4.field1302 / 2 + 4, arg1 + 83 - var12 - arg4.field1306 / 2 - 4);
        } else {
            arg4.method1418(arg0 + 94 + var11 - arg4.field1302 / 2 + 4, arg1 + 83 - var12 - arg4.field1306 / 2 - 4);
        }
    }

    @ObfuscatedName("ac.dd(Ljava/lang/String;B)Z")
    public static boolean method795(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class200.method3403(arg0, Statics.field256);
        for (int var2 = 0; var2 < field506; var2++) {
            class8 var3 = field278[var2];
            if (var1.equalsIgnoreCase(class200.method3403(var3.field130, Statics.field256))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class200.method3403(var3.field131, Statics.field256))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("z.dq(Ljava/lang/String;I)V")
    public static final void method160(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field502 < 200 || field467 == 1) || field502 >= 400) {
            class10.method9(30, "", class142.field2284);
            return;
        }
        String var1 = class200.method3403(arg0, Statics.field256);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field502; var2++) {
            class16 var3 = field504[var2];
            String var4 = class200.method3403(var3.field236, Statics.field256);
            if (var4 != null && var4.equals(var1)) {
                class10.method9(30, "", arg0 + class142.field2133);
                return;
            }
            if (var3.field226 != null) {
                String var5 = class200.method3403(var3.field226, Statics.field256);
                if (var5 != null && var5.equals(var1)) {
                    class10.method9(30, "", arg0 + class142.field2133);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field506; var6++) {
            class8 var7 = field278[var6];
            String var8 = class200.method3403(var7.field130, Statics.field256);
            if (var8 != null && var8.equals(var1)) {
                class10.method9(30, "", class142.field2290 + arg0 + class142.field2291);
                return;
            }
            if (var7.field131 != null) {
                String var9 = class200.method3403(var7.field131, Statics.field256);
                if (var9 != null && var9.equals(var1)) {
                    class10.method9(30, "", class142.field2290 + arg0 + class142.field2291);
                    return;
                }
            }
        }
        if (class200.method3403(Statics.field994.field35, Statics.field256).equals(var1)) {
            class10.method9(30, "", class142.field2288);
        } else {
            field460.method2339(224);
            field460.method2168(class107.method634(arg0));
            field460.method2255(arg0);
        }
    }

    @ObfuscatedName("ez.dg(Ljava/lang/String;I)V")
    public static final void method2849(String arg0) {
        if (Statics.field1685 != null) {
            field460.method2339(166);
            field460.method2168(class107.method634(arg0));
            field460.method2255(arg0);
        }
    }

    @ObfuscatedName("gn.dx(Leo;I)I")
    public static int method3455(class152 arg0) {
        class179 var1 = (class179) field455.method3138(((long) arg0.field2514 << 32) + (long) arg0.field2605);
        return var1 == null ? arg0.field2573 : var1.field2851;
    }

    @ObfuscatedName("ao.dv(Leo;I)Leo;")
    public static class152 method562(class152 arg0) {
        int var1 = class156.method793(method3455(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class152.method2301(arg0.field2594);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("w.dm(Leo;I)Z")
    public static boolean method114(class152 arg0) {
        if (field379) {
            if (method3455(arg0) != 0) {
                return false;
            }
            if (arg0.field2581 == 0) {
                return false;
            }
        }
        return arg0.field2619;
    }

    @ObfuscatedName("dn.dp(Leo;II)Ljava/lang/String;")
    public static String method2507(class152 arg0, int arg1) {
        int var2 = method3455(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2601 == null) {
            return null;
        } else if (arg0.field2595 == null || arg0.field2595.length <= arg1 || arg0.field2595[arg1] == null || arg0.field2595[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2595[arg1];
        }
    }

    @ObfuscatedName("c.de(Leo;I)Ljava/lang/String;")
    public static String method35(class152 arg0) {
        int var1 = method3455(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2580 == null || arg0.field2580.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2580;
        }
    }

    @ObfuscatedName("k.dj(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method467(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field254 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field254 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field254 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field254 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field254 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field367 + "/";
    }
}

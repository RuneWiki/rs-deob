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
import netscape.javascript.JSObject;

public final class client extends class131 {

    @ObfuscatedName("client.j")
    public static boolean field257 = true;

    @ObfuscatedName("client.o")
    public static int field273 = 1;

    @ObfuscatedName("client.n")
    public static int field259 = 0;

    @ObfuscatedName("client.p")
    public static int field261 = 0;

    @ObfuscatedName("client.q")
    public static boolean field263 = false;

    @ObfuscatedName("client.e")
    public static boolean field264 = false;

    @ObfuscatedName("client.t")
    public static int field265 = 0;

    @ObfuscatedName("client.c")
    public static int field502 = 0;

    @ObfuscatedName("client.m")
    public static boolean field267 = true;

    @ObfuscatedName("client.i")
    public static int field376 = 0;

    @ObfuscatedName("client.h")
    public static long field271 = -1L;

    @ObfuscatedName("client.w")
    public static class195[] field301 = new class195[4];

    @ObfuscatedName("client.z")
    public static int field270 = -1;

    @ObfuscatedName("client.v")
    public static int field341 = -1;

    @ObfuscatedName("client.s")
    public static int field272 = -1;

    @ObfuscatedName("client.r")
    public static boolean field308 = true;

    @ObfuscatedName("client.d")
    public static boolean field274 = false;

    @ObfuscatedName("client.al")
    public static int field275 = 0;

    @ObfuscatedName("client.ab")
    public static int field385 = 0;

    @ObfuscatedName("client.au")
    public static int field405 = 0;

    @ObfuscatedName("client.az")
    public static int field278 = 0;

    @ObfuscatedName("client.ai")
    public static int field462 = 0;

    @ObfuscatedName("client.ay")
    public static int field295 = 0;

    @ObfuscatedName("client.ar")
    public static int field281 = 0;

    @ObfuscatedName("client.af")
    public static int field282 = 0;

    @ObfuscatedName("client.as")
    public static int field283 = 0;

    @ObfuscatedName("client.ap")
    public static class107 field284 = new class107(new byte[5000]);

    @ObfuscatedName("client.aa")
    public static class18 field285 = class18.field524;

    @ObfuscatedName("client.ae")
    public static int field286 = 0;

    @ObfuscatedName("client.ao")
    public static int field287 = 0;

    @ObfuscatedName("client.aq")
    public static int field343 = 0;

    @ObfuscatedName("client.bb")
    public static int field495 = 0;

    @ObfuscatedName("client.be")
    public static int field294 = 0;

    @ObfuscatedName("client.bd")
    public static int field449 = 0;

    @ObfuscatedName("client.by")
    public static int field454 = 0;

    @ObfuscatedName("client.br")
    public static int field418 = 0;

    @ObfuscatedName("client.bt")
    public static class30[] field297 = new class30[32768];

    @ObfuscatedName("client.ba")
    public static int field298 = 0;

    @ObfuscatedName("client.bn")
    public static int[] field299 = new int[32768];

    @ObfuscatedName("client.cx")
    public static class110 field300 = new class110(5000);

    @ObfuscatedName("client.cs")
    public static class110 field481 = new class110(5000);

    @ObfuscatedName("client.cn")
    public static class110 field302 = new class110(5000);

    @ObfuscatedName("client.cr")
    public static int field303 = 0;

    @ObfuscatedName("client.cq")
    public static int field304 = 0;

    @ObfuscatedName("client.cz")
    public static int field498 = 0;

    @ObfuscatedName("client.ck")
    public static int field306 = 0;

    @ObfuscatedName("client.cc")
    public static int field328 = 0;

    @ObfuscatedName("client.cv")
    public static int field322 = 0;

    @ObfuscatedName("client.co")
    public static int field349 = 0;

    @ObfuscatedName("client.cp")
    public static int field476 = 0;

    @ObfuscatedName("client.ct")
    public static boolean field311 = false;

    @ObfuscatedName("client.ch")
    public static int field312 = 0;

    @ObfuscatedName("client.cl")
    public static int field313 = 0;

    @ObfuscatedName("client.dj")
    public static int field314 = 1;

    @ObfuscatedName("client.da")
    public static int field315 = 0;

    @ObfuscatedName("client.dh")
    public static int field316 = 1;

    @ObfuscatedName("client.dt")
    public static int field317 = 0;

    @ObfuscatedName("client.ds")
    public static boolean field320 = false;

    @ObfuscatedName("client.dx")
    public static int[][][] field415 = new int[4][13][13];

    @ObfuscatedName("client.dv")
    public static final int[] field509 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.de")
    public static int field446 = 0;

    @ObfuscatedName("client.dz")
    public static int field255 = 2;

    @ObfuscatedName("client.di")
    public static int field296 = 0;

    @ObfuscatedName("client.du")
    public static int field326 = 2;

    @ObfuscatedName("client.dq")
    public static int field327 = 0;

    @ObfuscatedName("client.dr")
    public static int field479 = 1;

    @ObfuscatedName("client.dy")
    public static int field329 = 0;

    @ObfuscatedName("client.dc")
    public static int field330 = 0;

    @ObfuscatedName("client.dm")
    public static int field323 = 2;

    @ObfuscatedName("client.do")
    public static int field332 = 0;

    @ObfuscatedName("client.ew")
    public static int field333 = 1;

    @ObfuscatedName("client.eq")
    public static int field334 = 0;

    @ObfuscatedName("client.ej")
    public static int field421 = 0;

    @ObfuscatedName("client.ec")
    public static int field268 = 2301979;

    @ObfuscatedName("client.en")
    public static int field337 = 5063219;

    @ObfuscatedName("client.ez")
    public static int field338 = 3353893;

    @ObfuscatedName("client.eh")
    public static int field339 = 7759444;

    @ObfuscatedName("client.eu")
    public static boolean field258 = false;

    @ObfuscatedName("client.fe")
    public static int field402 = 0;

    @ObfuscatedName("client.fc")
    public static int field342 = 128;

    @ObfuscatedName("client.fb")
    public static int field458 = 0;

    @ObfuscatedName("client.fu")
    public static int field344 = 0;

    @ObfuscatedName("client.fd")
    public static int field515 = 0;

    @ObfuscatedName("client.fi")
    public static int field378 = 0;

    @ObfuscatedName("client.fo")
    public static int field412 = 0;

    @ObfuscatedName("client.fj")
    public static int field280 = 0;

    @ObfuscatedName("client.fp")
    public static boolean field360 = false;

    @ObfuscatedName("client.fx")
    public static int field350 = 0;

    @ObfuscatedName("client.fg")
    public static int field438 = 0;

    @ObfuscatedName("client.fl")
    public static int field352 = 50;

    @ObfuscatedName("client.fh")
    public static int[] field353 = new int[field352];

    @ObfuscatedName("client.fa")
    public static int[] field354 = new int[field352];

    @ObfuscatedName("client.fz")
    public static int[] field355 = new int[field352];

    @ObfuscatedName("client.fq")
    public static int[] field356 = new int[field352];

    @ObfuscatedName("client.ft")
    public static int[] field357 = new int[field352];

    @ObfuscatedName("client.ff")
    public static int[] field292 = new int[field352];

    @ObfuscatedName("client.fs")
    public static int[] field359 = new int[field352];

    @ObfuscatedName("client.gc")
    public static String[] field276 = new String[field352];

    @ObfuscatedName("client.ge")
    public static int[][] field361 = new int[104][104];

    @ObfuscatedName("client.gq")
    public static int field362 = 0;

    @ObfuscatedName("client.gr")
    public static int field363 = -1;

    @ObfuscatedName("client.gp")
    public static int field364 = -1;

    @ObfuscatedName("client.go")
    public static int field365 = 0;

    @ObfuscatedName("client.gf")
    public static int field366 = 0;

    @ObfuscatedName("client.gk")
    public static int field367 = 0;

    @ObfuscatedName("client.gy")
    public static int field290 = 0;

    @ObfuscatedName("client.gd")
    public static int field336 = 0;

    @ObfuscatedName("client.gu")
    public static int field307 = 0;

    @ObfuscatedName("client.gl")
    public static int field371 = 0;

    @ObfuscatedName("client.gn")
    public static int field373 = 0;

    @ObfuscatedName("client.gm")
    public static int field324 = 0;

    @ObfuscatedName("client.gv")
    public static int field319 = 0;

    @ObfuscatedName("client.gj")
    public static boolean field375 = false;

    @ObfuscatedName("client.gh")
    public static int field413 = 0;

    @ObfuscatedName("client.gb")
    public static int field472 = 0;

    @ObfuscatedName("client.gg")
    public static class3[] field335 = new class3[2048];

    @ObfuscatedName("client.gi")
    public static int field279 = 0;

    @ObfuscatedName("client.gz")
    public static int[] field260 = new int[2048];

    @ObfuscatedName("client.hx")
    public static int field381 = 0;

    @ObfuscatedName("client.ho")
    public static int[] field382 = new int[2048];

    @ObfuscatedName("client.hi")
    public static class107[] field383 = new class107[2048];

    @ObfuscatedName("client.hu")
    public static int field384 = -1;

    @ObfuscatedName("client.hb")
    public static int field380 = 0;

    @ObfuscatedName("client.hk")
    public static int field386 = 0;

    @ObfuscatedName("client.hl")
    public static int[] field387 = new int[1000];

    @ObfuscatedName("client.hy")
    public static final int[] field388 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hd")
    public static String[] field389 = new String[8];

    @ObfuscatedName("client.ha")
    public static boolean[] field390 = new boolean[8];

    @ObfuscatedName("client.hh")
    public static int[] field318 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hw")
    public static int field392 = -1;

    @ObfuscatedName("client.hm")
    public static class177[][][] field393 = new class177[4][104][104];

    @ObfuscatedName("client.hc")
    public static class177 field394 = new class177();

    @ObfuscatedName("client.hq")
    public static class177 field395 = new class177();

    @ObfuscatedName("client.ht")
    public static class177 field468 = new class177();

    @ObfuscatedName("client.hf")
    public static int[] field397 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field398 = new int[25];

    @ObfuscatedName("client.hr")
    public static int[] field399 = new int[25];

    @ObfuscatedName("client.he")
    public static int field400 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field401 = false;

    @ObfuscatedName("client.is")
    public static int field368 = 0;

    @ObfuscatedName("client.id")
    public static int[] field403 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field391 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field370 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field406 = new int[500];

    @ObfuscatedName("client.ic")
    public static String[] field407 = new String[500];

    @ObfuscatedName("client.in")
    public static String[] field408 = new String[500];

    @ObfuscatedName("client.il")
    public static int field409 = -1;

    @ObfuscatedName("client.ii")
    public static int field410 = -1;

    @ObfuscatedName("client.ie")
    public static int field411 = 0;

    @ObfuscatedName("client.ir")
    public static int field266 = 50;

    @ObfuscatedName("client.ik")
    public static int field346 = 0;

    @ObfuscatedName("client.it")
    public static String field414 = null;

    @ObfuscatedName("client.iv")
    public static boolean field358 = false;

    @ObfuscatedName("client.ib")
    public static int field416 = -1;

    @ObfuscatedName("client.jz")
    public static String field417 = null;

    @ObfuscatedName("client.jm")
    public static String field379 = null;

    @ObfuscatedName("client.jp")
    public static int field419 = -1;

    @ObfuscatedName("client.jh")
    public static class174 field420 = new class174(8);

    @ObfuscatedName("client.jt")
    public static int field291 = 0;

    @ObfuscatedName("client.jf")
    public static int field422 = 0;

    @ObfuscatedName("client.jq")
    public static class152 field423 = null;

    @ObfuscatedName("client.jx")
    public static int field424 = 0;

    @ObfuscatedName("client.jb")
    public static int field425 = 0;

    @ObfuscatedName("client.jo")
    public static int field453 = 0;

    @ObfuscatedName("client.jk")
    public static int field444 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field428 = false;

    @ObfuscatedName("client.jc")
    public static boolean field516 = false;

    @ObfuscatedName("client.jj")
    public static boolean field430 = false;

    @ObfuscatedName("client.jw")
    public static class152 field431 = null;

    @ObfuscatedName("client.ju")
    public static class152 field518 = null;

    @ObfuscatedName("client.jg")
    public static int field433 = 0;

    @ObfuscatedName("client.ji")
    public static int field331 = 0;

    @ObfuscatedName("client.jd")
    public static class152 field435 = null;

    @ObfuscatedName("client.jy")
    public static boolean field436 = false;

    @ObfuscatedName("client.je")
    public static int field437 = -1;

    @ObfuscatedName("client.jl")
    public static int field471 = -1;

    @ObfuscatedName("client.js")
    public static boolean field439 = false;

    @ObfuscatedName("client.jv")
    public static int field440 = -1;

    @ObfuscatedName("client.ja")
    public static int field441 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field442 = false;

    @ObfuscatedName("client.ko")
    public static int field443 = 1;

    @ObfuscatedName("client.ka")
    public static int[] field445 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field426 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field447 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field448 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field434 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field345 = 0;

    @ObfuscatedName("client.km")
    public static int field451 = 0;

    @ObfuscatedName("client.ky")
    public static int field452 = 0;

    @ObfuscatedName("client.kl")
    public static int field321 = 0;

    @ObfuscatedName("client.kg")
    public static int field351 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field455 = new int[2000];

    @ObfuscatedName("client.kt")
    public static String[] field483 = new String[1000];

    @ObfuscatedName("client.kz")
    public static int field457 = 0;

    @ObfuscatedName("client.ks")
    public static class177 field493 = new class177();

    @ObfuscatedName("client.kr")
    public static class177 field459 = new class177();

    @ObfuscatedName("client.kf")
    public static class177 field277 = new class177();

    @ObfuscatedName("client.kd")
    public static class174 field461 = new class174(512);

    @ObfuscatedName("client.lv")
    public static int field450 = 0;

    @ObfuscatedName("client.lc")
    public static int field309 = -2;

    @ObfuscatedName("client.lm")
    public static boolean[] field464 = new boolean[100];

    @ObfuscatedName("client.la")
    public static boolean[] field465 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field466 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static int[] field467 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field517 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field469 = new int[100];

    @ObfuscatedName("client.lw")
    public static int[] field470 = new int[100];

    @ObfuscatedName("client.lu")
    public static int field404 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field429 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lf")
    public static int field396 = 0;

    @ObfuscatedName("client.lr")
    public static int field474 = 0;

    @ObfuscatedName("client.lt")
    public static long[] field475 = new long[100];

    @ObfuscatedName("client.lo")
    public static int field288 = 0;

    @ObfuscatedName("client.ly")
    public static int field477 = 0;

    @ObfuscatedName("client.lq")
    public static int[] field478 = new int[128];

    @ObfuscatedName("client.ln")
    public static int[] field506 = new int[128];

    @ObfuscatedName("client.lb")
    public static long field480 = -1L;

    @ObfuscatedName("client.le")
    public static String field427 = null;

    @ObfuscatedName("client.ld")
    public static String field482 = null;

    @ObfuscatedName("client.mw")
    public static int field347 = -1;

    @ObfuscatedName("client.mb")
    public static int field484 = 0;

    @ObfuscatedName("client.mq")
    public static int[] field485 = new int[1000];

    @ObfuscatedName("client.mm")
    public static int[] field486 = new int[1000];

    @ObfuscatedName("client.mh")
    public static class72[] field487 = new class72[1000];

    @ObfuscatedName("client.me")
    public static int field377 = 0;

    @ObfuscatedName("client.ml")
    public static int field489 = 0;

    @ObfuscatedName("client.mc")
    public static int field490 = 0;

    @ObfuscatedName("client.mt")
    public static int field491 = 255;

    @ObfuscatedName("client.mx")
    public static int field348 = -1;

    @ObfuscatedName("client.mj")
    public static boolean field305 = false;

    @ObfuscatedName("client.my")
    public static int field494 = 127;

    @ObfuscatedName("client.md")
    public static int field473 = 127;

    @ObfuscatedName("client.nh")
    public static int field496 = 0;

    @ObfuscatedName("client.nc")
    public static int[] field497 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field256 = new int[50];

    @ObfuscatedName("client.no")
    public static int[] field499 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field500 = new int[50];

    @ObfuscatedName("client.nd")
    public static class52[] field501 = new class52[50];

    @ObfuscatedName("client.np")
    public static boolean field340 = false;

    @ObfuscatedName("client.nq")
    public static boolean[] field503 = new boolean[5];

    @ObfuscatedName("client.nu")
    public static int[] field432 = new int[5];

    @ObfuscatedName("client.ny")
    public static int[] field505 = new int[5];

    @ObfuscatedName("client.nf")
    public static int[] field492 = new int[5];

    @ObfuscatedName("client.nt")
    public static int[] field507 = new int[5];

    @ObfuscatedName("client.nj")
    public static int field508 = 0;

    @ObfuscatedName("client.nl")
    public static int field488 = 0;

    @ObfuscatedName("client.oe")
    public static class16[] field510 = new class16[400];

    @ObfuscatedName("client.or")
    public static class173 field511 = new class173();

    @ObfuscatedName("client.ob")
    public static int field512 = 0;

    @ObfuscatedName("client.oj")
    public static class8[] field513 = new class8[400];

    @ObfuscatedName("client.og")
    public static class157 field514 = new class157();

    @ObfuscatedName("client.ou")
    public static int field293 = -1;

    @ObfuscatedName("client.on")
    public static int field310 = -1;

    @ObfuscatedName("client.u(I)V")
    public final void method169() {
    }

    public final void init() {
        if (!this.method2603()) {
            return;
        }
        class168[] var1 = new class168[] { class168.field2815, class168.field2813, class168.field2810, class168.field2806, class168.field2808, class168.field2812, class168.field2811, class168.field2814, class168.field2807, class168.field2809 };
        class168[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class168 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2816);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2816)) {
                    case 1:
                        field265 = Integer.parseInt(var5);
                        break;
                    case 2:
                        Statics.field262 = (class139) class99.method2656(class139.method134(), Integer.parseInt(var5));
                        if (Statics.field262 == class139.field2125) {
                            Statics.field1847 = class188.field2888;
                        } else {
                            Statics.field1847 = class188.field2885;
                        }
                        break;
                    case 3:
                        field273 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field261 = Integer.parseInt(var5);
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class2.field30)) {
                        }
                        break;
                    case 6:
                        int var6 = Integer.parseInt(var5);
                        class138[] var7 = new class138[] { class138.field2115, class138.field2111, class138.field2108, class138.field2113 };
                        class138[] var8 = var7;
                        int var9 = 0;
                        class138 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class138 var10 = var8[var9];
                            if (var10.field2110 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field504 = var11;
                    case 7:
                    default:
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field30)) {
                            field263 = true;
                        } else {
                            field263 = false;
                        }
                        break;
                    case 9:
                        field259 = Integer.parseInt(var5);
                        break;
                    case 10:
                        Statics.field2952 = var5;
                }
            }
        }
        class79.field1354 = false;
        field264 = false;
        Statics.field2028 = this.getCodeBase().getHost();
        String var12 = Statics.field504.field2112;
        byte var13 = 0;
        try {
            Statics.field984 = 16;
            Statics.field895 = var13;
            try {
                Statics.field1450 = System.getProperty("os.name");
            } catch (Exception var34) {
                Statics.field1450 = "Unknown";
            }
            Statics.field2092 = Statics.field1450.toLowerCase();
            try {
                Statics.field1248 = System.getProperty("user.home");
                if (Statics.field1248 != null) {
                    Statics.field1248 = Statics.field1248 + "/";
                }
            } catch (Exception var33) {
            }
            try {
                if (Statics.field2092.startsWith("win")) {
                    if (Statics.field1248 == null) {
                        Statics.field1248 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1248 == null) {
                    Statics.field1248 = System.getenv("HOME");
                }
                if (Statics.field1248 != null) {
                    Statics.field1248 = Statics.field1248 + "/";
                }
            } catch (Exception var32) {
            }
            if (Statics.field1248 == null) {
                Statics.field1248 = "~/";
            }
            Statics.field1899 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1248, "/tmp/", "" };
            Statics.field97 = new String[] { ".jagex_cache_" + Statics.field895, ".file_store_" + Statics.field895 };
            label156: for (int var17 = 0; var17 < 4; var17++) {
                Statics.field2084 = class136.method2683("oldschool", var12, var17);
                if (!Statics.field2084.exists()) {
                    Statics.field2084.mkdirs();
                }
                File[] var18 = Statics.field2084.listFiles();
                if (var18 == null) {
                    break;
                }
                File[] var19 = var18;
                int var20 = 0;
                while (true) {
                    if (var20 >= var19.length) {
                        break label156;
                    }
                    File var21 = var19[var20];
                    if (!class136.method2071(var21, false)) {
                        break;
                    }
                    var20++;
                }
            }
            File var22 = Statics.field2084;
            Statics.field1934 = var22;
            if (!Statics.field1934.exists()) {
                throw new RuntimeException("");
            }
            class122.field1933 = true;
            try {
                File var23 = new File(Statics.field1248, "random.dat");
                if (var23.exists()) {
                    class136.field2088 = new class194(new class193(var23, "rw", 25L), 24, 0);
                } else {
                    label134: for (int var24 = 0; var24 < Statics.field97.length; var24++) {
                        for (int var25 = 0; var25 < Statics.field1899.length; var25++) {
                            File var26 = new File(Statics.field1899[var25] + Statics.field97[var24] + File.separatorChar + "random.dat");
                            if (var26.exists()) {
                                class136.field2088 = new class194(new class193(var26, "rw", 25L), 24, 0);
                                break label134;
                            }
                        }
                    }
                }
                if (class136.field2088 == null) {
                    RandomAccessFile var27 = new RandomAccessFile(var23, "rw");
                    int var28 = var27.read();
                    var27.seek(0L);
                    var27.write(var28);
                    var27.seek(0L);
                    var27.close();
                    class136.field2088 = new class194(new class193(var23, "rw", 25L), 24, 0);
                }
            } catch (IOException var35) {
            }
            class136.field2089 = new class194(new class193(class122.method1612("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class136.field2086 = new class194(new class193(class122.method1612("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field784 = new class194[Statics.field984];
            for (int var30 = 0; var30 < Statics.field984; var30++) {
                Statics.field784[var30] = new class194(new class193(class122.method1612("main_file_cache.idx" + var30), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var36) {
            class135.method3292((String) null, var36);
        }
        Statics.field269 = this;
        this.method2612(765, 503, 51);
    }

    @ObfuscatedName("client.j(I)V")
    public final void method171() {
        Statics.field896 = field261 == 0 ? 43594 : field273 + 40000;
        Statics.field1274 = field261 == 0 ? 443 : field273 + 50000;
        Statics.field369 = Statics.field896;
        Statics.field1893 = class153.field2653;
        Statics.field2673 = class153.field2651;
        Statics.field2118 = class153.field2650;
        Statics.field538 = class153.field2654;
        if (Statics.field1945.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1976[44] = 71;
            class124.field1976[45] = 26;
            class124.field1976[46] = 72;
            class124.field1976[47] = 73;
            class124.field1976[59] = 57;
            class124.field1976[61] = 27;
            class124.field1976[91] = 42;
            class124.field1976[92] = 74;
            class124.field1976[93] = 43;
            class124.field1976[192] = 28;
            class124.field1976[222] = 58;
            class124.field1976[520] = 59;
        } else {
            class124.field1976[186] = 57;
            class124.field1976[187] = 27;
            class124.field1976[188] = 71;
            class124.field1976[189] = 26;
            class124.field1976[190] = 72;
            class124.field1976[191] = 73;
            class124.field1976[192] = 58;
            class124.field1976[219] = 42;
            class124.field1976[220] = 74;
            class124.field1976[221] = 43;
            class124.field1976[222] = 59;
            class124.field1976[223] = 28;
        }
        Canvas var1 = Statics.field1978;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1956);
        var1.addFocusListener(class124.field1956);
        Canvas var2 = Statics.field1978;
        var2.addMouseListener(class127.field2009);
        var2.addMouseMotionListener(class127.field2009);
        var2.addFocusListener(class127.field2009);
        Statics.field1001 = class118.method607();
        if (Statics.field1001 != null) {
            Statics.field1001.method2454(Statics.field1978);
        }
        Statics.field679 = new class121(255, class136.field2089, class136.field2086, 500000);
        Statics.field250 = class9.method131();
        Statics.field99 = this.getToolkit().getSystemClipboard();
        class125.method1867(this, Statics.field1526);
        if (field261 != 0) {
            field274 = true;
        }
    }

    @ObfuscatedName("client.o(S)V")
    public final void method172() {
        field376++;
        this.method175();
        while (true) {
            class177 var1 = class149.field2495;
            class148 var2;
            synchronized (class149.field2495) {
                var2 = (class148) class149.field2487.method3217();
            }
            if (var2 == null) {
                class161.method2497();
                method546();
                class124.method1982();
                class127.method997();
                if (Statics.field1001 != null) {
                    int var4 = Statics.field1001.method2452();
                    field457 = var4;
                }
                if (field502 == 0) {
                    method2578();
                    Statics.field924.method2464();
                    for (int var5 = 0; var5 < 32; var5++) {
                        field2057[var5] = 0L;
                    }
                    for (int var6 = 0; var6 < 32; var6++) {
                        field2058[var6] = 0L;
                    }
                    Statics.field572 = 0;
                } else if (field502 == 5) {
                    class28.method138(this);
                    method2578();
                    Statics.field924.method2464();
                    for (int var7 = 0; var7 < 32; var7++) {
                        field2057[var7] = 0L;
                    }
                    for (int var8 = 0; var8 < 32; var8++) {
                        field2058[var8] = 0L;
                    }
                    Statics.field572 = 0;
                } else if (field502 == 10 || field502 == 11) {
                    class28.method138(this);
                } else if (field502 == 20) {
                    class28.method138(this);
                    method3109();
                } else if (field502 == 25) {
                    Statics.method158();
                }
                if (field502 == 30) {
                    method2797();
                } else if (field502 == 40 || field502 == 45) {
                    method3109();
                }
                return;
            }
            var2.field2480.method2779(var2.field2479, (int) var2.field2861, var2.field2478, false);
        }
    }

    @ObfuscatedName("client.n(I)V")
    public final void method173() {
        boolean var1;
        label297: {
            try {
                if (class161.field2705 == 2) {
                    if (Statics.field1992 == null) {
                        Statics.field1992 = class158.method2916(Statics.field2519, Statics.field2103, Statics.field2709);
                        if (Statics.field1992 == null) {
                            var1 = false;
                            break label297;
                        }
                    }
                    if (Statics.field1451 == null) {
                        Statics.field1451 = new class53(Statics.field2707, Statics.field2706);
                    }
                    if (Statics.field1003.method2999(Statics.field1992, Statics.field2711, Statics.field1451, 22050)) {
                        Statics.field1003.method3087();
                        Statics.field1003.method3020(Statics.field985);
                        Statics.field1003.method3002(Statics.field1992, Statics.field2708);
                        class161.field2705 = 0;
                        Statics.field1992 = null;
                        Statics.field1451 = null;
                        Statics.field2519 = null;
                        var1 = true;
                        break label297;
                    }
                }
            } catch (Exception var54) {
                var54.printStackTrace();
                Statics.field1003.method3003();
                class161.field2705 = 0;
                Statics.field1992 = null;
                Statics.field1451 = null;
                Statics.field2519 = null;
            }
            var1 = false;
        }
        if (var1 && field305 && Statics.field95 != null) {
            Statics.field95.method984();
        }
        if (field2061) {
            class124.method1972(Statics.field1978);
            Canvas var4 = Statics.field1978;
            var4.removeMouseListener(class127.field2009);
            var4.removeMouseMotionListener(class127.field2009);
            var4.removeFocusListener(class127.field2009);
            class127.field2001 = 0;
            if (Statics.field1001 != null) {
                Statics.field1001.method2451(Statics.field1978);
            }
            this.method2602();
            Canvas var5 = Statics.field1978;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class124.field1956);
            var5.addFocusListener(class124.field1956);
            Canvas var6 = Statics.field1978;
            var6.addMouseListener(class127.field2009);
            var6.addMouseMotionListener(class127.field2009);
            var6.addFocusListener(class127.field2009);
            if (Statics.field1001 != null) {
                Statics.field1001.method2454(Statics.field1978);
            }
        }
        if (field502 == 0) {
            int var7 = class28.field651;
            String var8 = class28.field657;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field1978.getGraphics();
                if (Statics.field893 == null) {
                    Statics.field893 = new Font("Helvetica", 1, 13);
                    Statics.field835 = Statics.field1978.getFontMetrics(Statics.field893);
                }
                if (field2059) {
                    field2059 = false;
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field160, Statics.field2025);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1809 == null) {
                        Statics.field1809 = Statics.field1978.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field1809.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field893);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field835.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field1809, Statics.field160 / 2 - 152, Statics.field2025 / 2 - 18, (ImageObserver) null);
                } catch (Exception var50) {
                    int var13 = Statics.field160 / 2 - 152;
                    int var14 = Statics.field2025 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field893);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field835.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var51) {
                Statics.field1978.repaint();
            }
        } else if (field502 == 5) {
            class28.method2(Statics.field635, Statics.field90);
        } else if (field502 == 10 || field502 == 11) {
            class28.method2(Statics.field635, Statics.field90);
        } else if (field502 == 20) {
            class28.method2(Statics.field635, Statics.field90);
        } else if (field502 == 25) {
            if (field317 == 1) {
                if (field313 > field314) {
                    field314 = field313;
                }
                int var16 = (field314 * 50 - field313 * 50) / field314;
                Statics.method2576(class142.field2361 + class2.field25 + class2.field22 + var16 + "%" + class2.field33, false);
            } else if (field317 == 2) {
                if (field315 > field316) {
                    field316 = field315;
                }
                int var17 = (field316 * 50 - field315 * 50) / field316 + 50;
                Statics.method2576(class142.field2361 + class2.field25 + class2.field22 + var17 + "%" + class2.field33, false);
            } else {
                Statics.method2576(class142.field2361, false);
            }
        } else if (field502 == 30) {
            if (field419 != -1) {
                method573(field419);
            }
            for (int var18 = 0; var18 < field450; var18++) {
                if (field464[var18]) {
                    field465[var18] = true;
                }
                field466[var18] = field464[var18];
                field464[var18] = false;
            }
            field309 = field376;
            field409 = -1;
            field410 = -1;
            Statics.field68 = null;
            if (field419 != -1) {
                field450 = 0;
                method2383(field419, 0, 0, 765, 503, 0, 0, -1);
            }
            class73.method1516();
            if (field401) {
                int var19 = Statics.field1686;
                int var20 = Statics.field181;
                int var21 = Statics.field29;
                int var22 = Statics.field1002;
                int var23 = 6116423;
                class73.method1523(var19, var20, var21, var22, var23);
                class73.method1523(var19 + 1, var20 + 1, var21 - 2, 16, 0);
                class73.method1581(var19 + 1, var20 + 18, var21 - 2, var22 - 19, 0);
                Statics.field635.method3308(class142.field2380, var19 + 3, var20 + 14, var23, -1);
                int var24 = class127.field2004;
                int var25 = class127.field2005;
                for (int var26 = 0; var26 < field368; var26++) {
                    int var27 = (field368 - 1 - var26) * 15 + var20 + 31;
                    int var28 = 16777215;
                    if (var24 > var19 && var24 < var19 + var21 && var25 > var27 - 13 && var25 < var27 + 3) {
                        var28 = 16776960;
                    }
                    Statics.field635.method3308(method126(var26), var19 + 3, var27, var28, 0);
                }
                Statics.method581(Statics.field1686, Statics.field181, Statics.field29, Statics.field1002);
            } else if (field409 != -1) {
                method576(field409, field410);
            }
            if (field404 == 3) {
                for (int var29 = 0; var29 < field450; var29++) {
                    if (field466[var29]) {
                        class73.method1522(field467[var29], field517[var29], field469[var29], field470[var29], 16711935, 128);
                    } else if (field465[var29]) {
                        class73.method1522(field467[var29], field517[var29], field469[var29], field470[var29], 16711680, 128);
                    }
                }
            }
            int var30 = Statics.field1762;
            int var31 = Statics.field578.field762;
            int var32 = Statics.field578.field726;
            int var33 = field421;
            for (class20 var34 = (class20) class20.field541.method3185(); var34 != null; var34 = (class20) class20.field541.method3187()) {
                if (var34.field548 != -1 || var34.field552 != null) {
                    int var35 = 0;
                    if (var31 > var34.field545) {
                        var35 += var31 - var34.field545;
                    } else if (var31 < var34.field543) {
                        var35 += var34.field543 - var31;
                    }
                    if (var32 > var34.field546) {
                        var35 += var32 - var34.field546;
                    } else if (var32 < var34.field544) {
                        var35 += var34.field544 - var32;
                    }
                    if (var35 - 64 > var34.field547 || field473 == 0 || var34.field549 != var30) {
                        if (var34.field542 != null) {
                            Statics.field632.method937(var34.field542);
                            var34.field542 = null;
                        }
                        if (var34.field550 != null) {
                            Statics.field632.method937(var34.field550);
                            var34.field550 = null;
                        }
                    } else {
                        var35 -= 64;
                        if (var35 < 0) {
                            var35 = 0;
                        }
                        int var36 = field473 * (var34.field547 - var35) / var34.field547;
                        class52 var10000;
                        if (var34.field542 != null) {
                            var34.field542.method1094(var36);
                        } else if (var34.field548 >= 0) {
                            var10000 = (class52) null;
                            class52 var37 = class52.method1029(Statics.field1763, var34.field548, 0);
                            if (var37 != null) {
                                class56 var38 = var37.method1024().method1064(Statics.field589);
                                class58 var39 = class58.method1134(var38, 100, var36);
                                var39.method1197(-1);
                                Statics.field632.method978(var39);
                                var34.field542 = var39;
                            }
                        }
                        if (var34.field550 != null) {
                            var34.field550.method1094(var36);
                            if (!var34.field550.method3261()) {
                                var34.field550 = null;
                            }
                        } else if (var34.field552 != null && (var34.field553 -= var33) <= 0) {
                            int var40 = (int) (Math.random() * (double) var34.field552.length);
                            var10000 = (class52) null;
                            class52 var41 = class52.method1029(Statics.field1763, var34.field552[var40], 0);
                            if (var41 != null) {
                                class56 var42 = var41.method1024().method1064(Statics.field589);
                                class58 var43 = class58.method1134(var42, 100, var36);
                                var43.method1197(0);
                                Statics.field632.method978(var43);
                                var34.field550 = var43;
                                var34.field553 = var34.field555 + (int) (Math.random() * (double) (var34.field554 - var34.field555));
                            }
                        }
                    }
                }
            }
            field421 = 0;
        } else if (field502 == 40) {
            Statics.method2576(class142.field2217 + class2.field25 + class142.field2157, false);
        } else if (field502 == 45) {
            Statics.method2576(class142.field2304, false);
        }
        if (field502 == 30 && field404 == 0 && !field2059) {
            try {
                Graphics var44 = Statics.field1978.getGraphics();
                for (int var45 = 0; var45 < field450; var45++) {
                    if (field465[var45]) {
                        Statics.field678.method1344(var44, field467[var45], field517[var45], field469[var45], field470[var45]);
                        field465[var45] = false;
                    }
                }
            } catch (Exception var53) {
                Statics.field1978.repaint();
            }
        } else if (field502 > 0) {
            try {
                Graphics var47 = Statics.field1978.getGraphics();
                Statics.field678.method1346(var47, 0, 0);
                field2059 = false;
                for (int var48 = 0; var48 < field450; var48++) {
                    field465[var48] = false;
                }
            } catch (Exception var52) {
                Statics.field1978.repaint();
            }
        }
    }

    @ObfuscatedName("client.y(I)V")
    public final void method359() {
        if (Statics.field2116 != null) {
            Statics.field2116.field187 = false;
        }
        Statics.field2116 = null;
        if (Statics.field689 != null) {
            Statics.field689.method2591();
            Statics.field689 = null;
        }
        if (class124.field1956 != null) {
            class124 var1 = class124.field1956;
            synchronized (class124.field1956) {
                class124.field1956 = null;
            }
        }
        class127.method850();
        Statics.field1001 = null;
        if (Statics.field95 != null) {
            Statics.field95.method989();
        }
        if (Statics.field2032 != null) {
            Statics.field2032.method989();
        }
        if (Statics.field2509 != null) {
            Statics.field2509.method2591();
        }
        Object var3 = class149.field2490;
        synchronized (class149.field2490) {
            if (class149.field2489 != 0) {
                class149.field2489 = 1;
                try {
                    class149.field2490.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class136.field2089.method3413();
            for (int var6 = 0; var6 < Statics.field984; var6++) {
                Statics.field784[var6].method3413();
            }
            class136.field2086.method3413();
            class136.field2088.method3413();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("bn.f(II)V")
    public static void method1617(int arg0) {
        if (field502 == arg0) {
            return;
        }
        if (field502 == 0) {
            class131.method2385();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field294 = 0;
            field449 = 0;
            field454 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field6 != null) {
            Statics.field6.method2591();
            Statics.field6 = null;
        }
        if (field502 == 25) {
            field317 = 0;
            field313 = 0;
            field314 = 1;
            field315 = 0;
            field316 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method527(Statics.field1978, Statics.field1527, Statics.field584, true, 0);
        } else if (arg0 == 20) {
            class28.method527(Statics.field1978, Statics.field1527, Statics.field584, true, field502 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method527(Statics.field1978, Statics.field1527, Statics.field584, false, 4);
        } else if (Statics.field643) {
            Statics.field675 = null;
            Statics.field661 = null;
            Statics.field639 = null;
            Statics.field205 = null;
            Statics.field641 = null;
            Statics.field1827 = null;
            Statics.field648 = null;
            Statics.field157 = null;
            Statics.field2481 = null;
            Statics.field599 = null;
            Statics.field955 = null;
            Statics.field1862 = null;
            Statics.field631 = null;
            Statics.field2104 = null;
            Statics.field610 = null;
            Statics.field145 = null;
            Statics.field167 = null;
            Statics.field1062 = null;
            Statics.field649 = null;
            Statics.field650 = null;
            Statics.field626 = null;
            Statics.field637 = null;
            class161.field2705 = 1;
            Statics.field2519 = null;
            Statics.field2103 = -1;
            Statics.field2709 = -1;
            Statics.field985 = 0;
            Statics.field2708 = false;
            Statics.field2710 = 2;
            class150.method1869(true);
            Statics.field643 = false;
        }
        field502 = arg0;
    }

    @ObfuscatedName("client.p(B)V")
    public void method175() {
        if (field502 == 1000) {
            return;
        }
        long var1 = class103.method29();
        int var3 = (int) (var1 - Statics.field2498);
        Statics.field2498 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class150.field2500 += var3;
        boolean var4;
        if (class150.field2507 == 0 && class150.field2505 == 0 && class150.field2511 == 0 && class150.field2496 == 0) {
            var4 = true;
        } else if (Statics.field2509 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class150.field2500 > 30000) {
                        throw new IOException();
                    }
                    while (class150.field2505 < 20 && class150.field2496 > 0) {
                        class151 var5 = (class151) class150.field2499.method3150();
                        class107 var6 = new class107(4);
                        var6.method2242(1);
                        var6.method2123((int) var5.field2861);
                        Statics.field2509.method2584(var6.field1844, 0, 4);
                        class150.field2501.method3147(var5, var5.field2861);
                        class150.field2496--;
                        class150.field2505++;
                    }
                    while (class150.field2507 < 20 && class150.field2511 > 0) {
                        class151 var7 = (class151) class150.field2503.method3230();
                        class107 var8 = new class107(4);
                        var8.method2242(0);
                        var8.method2123((int) var7.field2861);
                        Statics.field2509.method2584(var8.field1844, 0, 4);
                        var7.method3243();
                        class150.field2506.method3147(var7, var7.field2861);
                        class150.field2511--;
                        class150.field2507++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2509.method2585();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class150.field2500 = 0;
                        byte var11 = 0;
                        if (Statics.field2491 == null) {
                            var11 = 8;
                        } else if (class150.field2514 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class150.field2515.field1845;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2509.method2586(class150.field2515.field1844, class150.field2515.field1845, var12);
                            if (class150.field2512 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class150.field2515.field1844[class150.field2515.field1845 + var13] ^= class150.field2512;
                                }
                            }
                            class150.field2515.field1845 += var12;
                            if (class150.field2515.field1845 < var11) {
                                break;
                            }
                            if (Statics.field2491 == null) {
                                class150.field2515.field1845 = 0;
                                int var14 = class150.field2515.method2134();
                                int var15 = class150.field2515.method2136();
                                int var16 = class150.field2515.method2134();
                                int var17 = class150.field2515.method2139();
                                long var18 = (long) ((var14 << 16) + var15);
                                class151 var20 = (class151) class150.field2501.method3157(var18);
                                Statics.field1913 = true;
                                if (var20 == null) {
                                    var20 = (class151) class150.field2506.method3157(var18);
                                    Statics.field1913 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2491 = var20;
                                Statics.field971 = new class107(var17 + var21 + Statics.field2491.field2520);
                                Statics.field971.method2242(var16);
                                Statics.field971.method2124(var17);
                                class150.field2514 = 8;
                                class150.field2515.field1845 = 0;
                            } else if (class150.field2514 == 0) {
                                if (class150.field2515.field1844[0] == -1) {
                                    class150.field2514 = 1;
                                    class150.field2515.field1845 = 0;
                                } else {
                                    Statics.field2491 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field971.field1844.length - Statics.field2491.field2520;
                            int var23 = 512 - class150.field2514;
                            if (var23 > var22 - Statics.field971.field1845) {
                                var23 = var22 - Statics.field971.field1845;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2509.method2586(Statics.field971.field1844, Statics.field971.field1845, var23);
                            if (class150.field2512 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field971.field1844[Statics.field971.field1845 + var24] ^= class150.field2512;
                                }
                            }
                            Statics.field971.field1845 += var23;
                            class150.field2514 += var23;
                            if (Statics.field971.field1845 == var22) {
                                if (Statics.field2491.field2861 == 16711935L) {
                                    Statics.field681 = Statics.field971;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class147 var26 = class150.field2508[var25];
                                        if (var26 != null) {
                                            Statics.field681.field1845 = var25 * 8 + 5;
                                            int var27 = Statics.field681.method2139();
                                            int var28 = Statics.field681.method2139();
                                            var26.method2774(var27, var28);
                                        }
                                    }
                                } else {
                                    class150.field2510.reset();
                                    class150.field2510.update(Statics.field971.field1844, 0, var22);
                                    int var29 = (int) class150.field2510.getValue();
                                    if (Statics.field2491.field2518 != var29) {
                                        try {
                                            Statics.field2509.method2591();
                                        } catch (Exception var35) {
                                        }
                                        class150.field2513++;
                                        Statics.field2509 = null;
                                        class150.field2512 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class150.field2513 = 0;
                                    class150.field2502 = 0;
                                    Statics.field2491.field2517.method2786((int) (Statics.field2491.field2861 & 0xFFFFL), Statics.field971.field1844, (Statics.field2491.field2861 & 0xFF0000L) == 16711680L, Statics.field1913);
                                }
                                Statics.field2491.method3260();
                                if (Statics.field1913) {
                                    class150.field2505--;
                                } else {
                                    class150.field2507--;
                                }
                                class150.field2514 = 0;
                                Statics.field2491 = null;
                                Statics.field971 = null;
                            } else {
                                if (class150.field2514 != 512) {
                                    break;
                                }
                                class150.field2514 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2509.method2591();
                } catch (Exception var34) {
                }
                class150.field2502++;
                Statics.field2509 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method176();
        }
    }

    @ObfuscatedName("client.l(S)V")
    public void method176() {
        if (class150.field2513 >= 4) {
            this.method2601("js5crc");
            field502 = 1000;
            return;
        }
        if (class150.field2502 >= 4) {
            if (field502 <= 5) {
                this.method2601("js5io");
                field502 = 1000;
                return;
            }
            field343 = 3000;
            class150.field2502 = 3;
        }
        if (--field343 + 1 > 0) {
            return;
        }
        try {
            if (field287 == 0) {
                Statics.field921 = Statics.field1761.method2486(Statics.field2028, Statics.field369);
                field287++;
            }
            if (field287 == 1) {
                if (Statics.field921.field2070 == 2) {
                    this.method177(-1);
                    return;
                }
                if (Statics.field921.field2070 == 1) {
                    field287++;
                }
            }
            if (field287 == 2) {
                Statics.field2916 = new class130((Socket) Statics.field921.field2069, Statics.field1761);
                class107 var1 = new class107(5);
                var1.method2242(15);
                var1.method2124(51);
                Statics.field2916.method2584(var1.field1844, 0, 5);
                field287++;
                Statics.field2043 = class103.method29();
            }
            if (field287 == 3) {
                if (field502 <= 5 || Statics.field2916.method2585() > 0) {
                    int var2 = Statics.field2916.method2587();
                    if (var2 != 0) {
                        this.method177(var2);
                        return;
                    }
                    field287++;
                } else if (class103.method29() - Statics.field2043 > 30000L) {
                    this.method177(-2);
                    return;
                }
            }
            if (field287 == 4) {
                class150.method512(Statics.field2916, field502 > 20);
                Statics.field921 = null;
                Statics.field2916 = null;
                field287 = 0;
                field495 = 0;
            }
        } catch (IOException var4) {
            this.method177(-3);
        }
    }

    @ObfuscatedName("client.k(II)V")
    public void method177(int arg0) {
        Statics.field921 = null;
        Statics.field2916 = null;
        field287 = 0;
        if (Statics.field896 == Statics.field369) {
            Statics.field369 = Statics.field1274;
        } else {
            Statics.field369 = Statics.field896;
        }
        field495++;
        if (field495 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field502 <= 5) {
                this.method2601("js5connect_full");
                field502 = 1000;
            } else {
                field343 = 3000;
            }
        } else if (field495 >= 2 && arg0 == 6) {
            this.method2601("js5connect_outofdate");
            field502 = 1000;
        } else if (field495 >= 4) {
            if (field502 <= 5) {
                this.method2601("js5connect");
                field502 = 1000;
            } else {
                field343 = 3000;
            }
        }
    }

    @ObfuscatedName("dm.q(B)V")
    public static void method2578() {
        if (field286 == 0) {
            Statics.field236 = new class79(4, 104, 104, class6.field74);
            for (int var0 = 0; var0 < 4; var0++) {
                field301[var0] = new class195(104, 104);
            }
            Statics.field191 = new class72(512, 512);
            class28.field657 = class142.field2341;
            class28.field651 = 5;
            field286 = 20;
        } else if (field286 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1470[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1658(var1, 500, 800, 512, 334);
            class28.field657 = class142.field2209;
            class28.field651 = 10;
            field286 = 30;
        } else if (field286 == 30) {
            Statics.field2949 = method2806(0, false, true, true);
            Statics.field131 = method2806(1, false, true, true);
            Statics.field289 = method2806(2, true, false, true);
            Statics.field57 = method2806(3, false, true, true);
            Statics.field1763 = method2806(4, false, true, true);
            Statics.field1493 = method2806(5, true, true, true);
            Statics.field2462 = method2806(6, true, true, false);
            Statics.field1918 = method2806(7, false, true, true);
            Statics.field584 = method2806(8, false, true, true);
            Statics.field883 = method2806(9, false, true, true);
            Statics.field1527 = method2806(10, false, true, true);
            Statics.field372 = method2806(11, false, true, true);
            Statics.field2655 = method2806(12, false, true, true);
            Statics.field1560 = method2806(13, true, false, true);
            Statics.field188 = method2806(14, false, true, false);
            Statics.field528 = method2806(15, false, true, true);
            class28.field657 = class142.field2160;
            class28.field651 = 20;
            field286 = 40;
        } else if (field286 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2949.method2767() * 4 / 100;
            int var8 = var7 + Statics.field131.method2767() * 4 / 100;
            int var9 = var8 + Statics.field289.method2767() * 2 / 100;
            int var10 = var9 + Statics.field57.method2767() * 2 / 100;
            int var11 = var10 + Statics.field1763.method2767() * 6 / 100;
            int var12 = var11 + Statics.field1493.method2767() * 4 / 100;
            int var13 = var12 + Statics.field2462.method2767() * 2 / 100;
            int var14 = var13 + Statics.field1918.method2767() * 60 / 100;
            int var15 = var14 + Statics.field584.method2767() * 2 / 100;
            int var16 = var15 + Statics.field883.method2767() * 2 / 100;
            int var17 = var16 + Statics.field1527.method2767() * 2 / 100;
            int var18 = var17 + Statics.field372.method2767() * 2 / 100;
            int var19 = var18 + Statics.field2655.method2767() * 2 / 100;
            int var20 = var19 + Statics.field1560.method2767() * 2 / 100;
            int var21 = var20 + Statics.field188.method2767() * 2 / 100;
            int var22 = var21 + Statics.field528.method2767() * 2 / 100;
            if (var22 == 100) {
                class28.field657 = class142.field2162;
                class28.field651 = 30;
                field286 = 45;
            } else {
                if (var22 != 0) {
                    class28.field657 = class142.field2161 + var22 + "%";
                }
                class28.field651 = 30;
            }
        } else if (field286 == 45) {
            boolean var23 = !field264;
            Statics.field1087 = 22050;
            Statics.field1075 = var23;
            Statics.field607 = 2;
            class162 var24 = new class162();
            var24.method3028(9, 128);
            Statics.field95 = class50.method2583(Statics.field1761, Statics.field1978, 0, 22050);
            Statics.field95.method981(var24);
            class147 var25 = Statics.field528;
            class147 var26 = Statics.field188;
            class147 var27 = Statics.field1763;
            Statics.field2711 = var25;
            Statics.field2706 = var26;
            Statics.field2707 = var27;
            Statics.field1003 = var24;
            Statics.field2032 = class50.method2583(Statics.field1761, Statics.field1978, 1, 2048);
            Statics.field632 = new class49();
            Statics.field2032.method981(Statics.field632);
            Statics.field589 = new class68(22050, Statics.field1087);
            class28.field657 = class142.field2305;
            class28.field651 = 35;
            field286 = 50;
        } else if (field286 == 50) {
            int var28 = 0;
            if (Statics.field90 == null) {
                Statics.field90 = class70.method603(Statics.field584, Statics.field1560, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field61 == null) {
                Statics.field61 = class70.method603(Statics.field584, Statics.field1560, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field635 == null) {
                class147 var29 = Statics.field584;
                class147 var30 = Statics.field1560;
                int var31 = var29.method2719("b12_full");
                int var32 = var29.method2708(var31, "");
                class191 var33;
                if (class70.method728(var29, var31, var32)) {
                    var33 = class70.method749(var30.method2692(var31, var32));
                } else {
                    var33 = null;
                }
                Statics.field635 = var33;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class28.field657 = class142.field2164 + var28 * 100 / 3 + "%";
                class28.field651 = 40;
            } else {
                Statics.field224 = new class145(true);
                class28.field657 = class142.field2165;
                class28.field651 = 40;
                field286 = 60;
            }
        } else if (field286 == 60) {
            class147 var35 = Statics.field1527;
            class147 var36 = Statics.field584;
            int var37 = 0;
            if (var35.method2710("title.jpg", "")) {
                var37++;
            }
            if (var36.method2710("logo", "")) {
                var37++;
            }
            if (var36.method2710("titlebox", "")) {
                var37++;
            }
            if (var36.method2710("titlebutton", "")) {
                var37++;
            }
            if (var36.method2710("runes", "")) {
                var37++;
            }
            if (var36.method2710("title_mute", "")) {
                var37++;
            }
            if (var36.method2749("options_radio_buttons,0")) {
                var37++;
            }
            if (var36.method2749("options_radio_buttons,2")) {
                var37++;
            }
            var36.method2710("sl_back", "");
            var36.method2710("sl_flags", "");
            var36.method2710("sl_arrows", "");
            var36.method2710("sl_stars", "");
            var36.method2710("sl_button", "");
            byte var40 = 8;
            if (var37 < var40) {
                class28.field657 = class142.field2173 + var37 * 100 / var40 + "%";
                class28.field651 = 50;
            } else {
                class28.field657 = class142.field2167;
                class28.field651 = 50;
                method1617(5);
                field286 = 70;
            }
        } else if (field286 == 70) {
            if (Statics.field289.method2753()) {
                class147 var42 = Statics.field289;
                Statics.field964 = var42;
                class147 var43 = Statics.field289;
                Statics.field892 = var43;
                class40.method1887(Statics.field289, Statics.field1918);
                class147 var44 = Statics.field289;
                class147 var45 = Statics.field1918;
                boolean var46 = field264;
                Statics.field862 = var44;
                Statics.field834 = var45;
                class36.field842 = var46;
                class35.method2641(Statics.field289, Statics.field1918);
                class147 var47 = Statics.field289;
                class147 var48 = Statics.field1918;
                boolean var49 = field263;
                class191 var50 = Statics.field90;
                Statics.field1025 = var47;
                Statics.field1012 = var48;
                Statics.field1021 = var49;
                Statics.field1025.method2702(10);
                Statics.field1457 = var50;
                class147 var51 = Statics.field289;
                class147 var52 = Statics.field2949;
                class147 var53 = Statics.field131;
                Statics.field904 = var51;
                Statics.field922 = var52;
                Statics.field901 = var53;
                class147 var54 = Statics.field289;
                class147 var55 = Statics.field1918;
                Statics.field939 = var54;
                Statics.field592 = var55;
                class147 var56 = Statics.field289;
                Statics.field987 = var56;
                class147 var57 = Statics.field289;
                Statics.field1065 = var57;
                Statics.field1066 = Statics.field1065.method2702(16);
                class152.method832(Statics.field57, Statics.field1918, Statics.field584, Statics.field1560);
                class147 var58 = Statics.field289;
                Statics.field1008 = var58;
                class147 var59 = Statics.field289;
                Statics.field2033 = var59;
                class28.field657 = class142.field2169;
                class28.field651 = 60;
                field286 = 80;
            } else {
                class28.field657 = class142.field2206 + Statics.field289.method2772() + "%";
                class28.field651 = 60;
            }
        } else if (field286 == 80) {
            int var60 = 0;
            if (Statics.field2130 == null) {
                class147 var61 = Statics.field584;
                int var62 = var61.method2719("compass");
                int var63 = var61.method2708(var62, "");
                class72 var64 = class70.method1979(var61, var62, var63);
                Statics.field2130 = var64;
            } else {
                var60++;
            }
            if (Statics.field219 == null) {
                Statics.field219 = class70.method3(Statics.field584, "mapedge", "");
            } else {
                var60++;
            }
            if (Statics.field1905 == null) {
                Statics.field1905 = class70.method2479(Statics.field584, "mapscene", "");
            } else {
                var60++;
            }
            if (Statics.field28 == null) {
                Statics.field28 = class70.method115(Statics.field584, "mapfunction", "");
            } else {
                var60++;
            }
            if (Statics.field604 == null) {
                Statics.field604 = class70.method115(Statics.field584, "hitmarks", "");
            } else {
                var60++;
            }
            if (Statics.field715 == null) {
                Statics.field715 = class70.method115(Statics.field584, "headicons_pk", "");
            } else {
                var60++;
            }
            if (Statics.field1582 == null) {
                Statics.field1582 = class70.method115(Statics.field584, "headicons_prayer", "");
            } else {
                var60++;
            }
            if (Statics.field1292 == null) {
                Statics.field1292 = class70.method115(Statics.field584, "headicons_hint", "");
            } else {
                var60++;
            }
            if (Statics.field2399 == null) {
                Statics.field2399 = class70.method115(Statics.field584, "mapmarker", "");
            } else {
                var60++;
            }
            if (Statics.field1427 == null) {
                Statics.field1427 = class70.method115(Statics.field584, "cross", "");
            } else {
                var60++;
            }
            if (Statics.field222 == null) {
                Statics.field222 = class70.method115(Statics.field584, "mapdots", "");
            } else {
                var60++;
            }
            if (Statics.field374 == null) {
                Statics.field374 = class70.method2479(Statics.field584, "scrollbar", "");
            } else {
                var60++;
            }
            if (Statics.field976 == null) {
                Statics.field976 = class70.method2479(Statics.field584, "mod_icons", "");
            } else {
                var60++;
            }
            if (Statics.field942 == null) {
                Statics.field942 = class70.method65(Statics.field584, "mapback", "");
            } else {
                var60++;
            }
            if (var60 < 14) {
                class28.field657 = class142.field2318 + var60 * 100 / 14 + "%";
                class28.field651 = 70;
            } else {
                Statics.field2910 = Statics.field976;
                Statics.field219.method1427();
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 41.0D) - 20;
                for (int var69 = 0; var69 < Statics.field28.length; var69++) {
                    Statics.field28[var69].method1426(var65 + var68, var66 + var68, var67 + var68);
                }
                Statics.field1905[0].method1583(var65 + var68, var66 + var68, var67 + var68);
                method32();
                class28.field657 = class142.field2366;
                class28.field651 = 70;
                field286 = 90;
            }
        } else if (field286 == 90) {
            if (Statics.field883.method2753()) {
                class88 var70 = new class88(Statics.field883, Statics.field584, 20, 0.8D, field264 ? 64 : 128);
                class84.method1835(var70);
                class84.method1796(0.8D);
                class28.field657 = class142.field2229;
                class28.field651 = 90;
                field286 = 110;
            } else {
                class28.field657 = class142.field2376 + Statics.field883.method2772() + "%";
                class28.field651 = 90;
            }
        } else if (field286 == 110) {
            Statics.field2116 = new class12();
            Statics.field1761.method2487(Statics.field2116, 10);
            class28.field657 = class142.field2174;
            class28.field651 = 94;
            field286 = 120;
        } else if (field286 == 120) {
            if (Statics.field1527.method2710("huffman", "")) {
                class102 var71 = new class102(Statics.field1527.method2709("huffman", ""));
                Statics.field2890 = var71;
                class28.field657 = class142.field2176;
                class28.field651 = 96;
                field286 = 130;
            } else {
                class28.field657 = class142.field2175 + "%";
                class28.field651 = 96;
            }
        } else if (field286 == 130) {
            if (!Statics.field57.method2753()) {
                class28.field657 = class142.field2368 + Statics.field57.method2772() * 4 / 5 + "%";
                class28.field651 = 100;
            } else if (!Statics.field2655.method2753()) {
                class28.field657 = class142.field2368 + (80 + Statics.field2655.method2772() / 6) + "%";
                class28.field651 = 100;
            } else if (Statics.field1560.method2753()) {
                class28.field657 = class142.field2178;
                class28.field651 = 100;
                field286 = 140;
            } else {
                class28.field657 = class142.field2368 + (96 + Statics.field1560.method2772() / 20) + "%";
                class28.field651 = 100;
            }
        } else if (field286 == 140) {
            method1617(10);
        }
    }

    @ObfuscatedName("ed.e(IZZZB)Lef;")
    public static class147 method2806(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2089 != null) {
            var4 = new class121(arg0, class136.field2089, Statics.field784[arg0], 1000000);
        }
        return new class147(var4, Statics.field679, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("n.t(B)V")
    public static void method32() {
        Statics.field135 = new int[33];
        Statics.field620 = new int[33];
        Statics.field1081 = new int[151];
        Statics.field134 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field942.field1314[Statics.field942.field1312 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field135[var0] = var1;
            Statics.field620[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field942.field1314[Statics.field942.field1312 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1081[var4 - 5] = var5 - 25;
            Statics.field134[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("fv.g(I)V")
    public static final void method3109() {
        try {
            if (field294 == 0) {
                if (Statics.field689 != null) {
                    Statics.field689.method2591();
                    Statics.field689 = null;
                }
                Statics.field557 = null;
                field311 = false;
                field449 = 0;
                field294 = 1;
            }
            if (field294 == 1) {
                if (Statics.field557 == null) {
                    Statics.field557 = Statics.field1761.method2486(Statics.field2028, Statics.field369);
                }
                if (Statics.field557.field2070 == 2) {
                    throw new IOException();
                }
                if (Statics.field557.field2070 == 1) {
                    Statics.field689 = new class130((Socket) Statics.field557.field2069, Statics.field1761);
                    Statics.field557 = null;
                    field294 = 2;
                }
            }
            if (field294 == 2) {
                field300.field1845 = 0;
                field300.method2242(14);
                Statics.field689.method2584(field300.field1844, 0, 1);
                field302.field1845 = 0;
                field294 = 3;
            }
            if (field294 == 3) {
                if (Statics.field95 != null) {
                    Statics.field95.method983();
                }
                if (Statics.field2032 != null) {
                    Statics.field2032.method983();
                }
                int var0 = Statics.field689.method2587();
                if (Statics.field95 != null) {
                    Statics.field95.method983();
                }
                if (Statics.field2032 != null) {
                    Statics.field2032.method983();
                }
                if (var0 != 0) {
                    method133(var0);
                    return;
                }
                field302.field1845 = 0;
                field294 = 5;
            }
            if (field294 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field300.field1845 = 0;
                field300.method2242(1);
                field300.method2242(class28.field653.method482());
                field300.method2124(var1[0]);
                field300.method2124(var1[1]);
                field300.method2124(var1[2]);
                field300.method2124(var1[3]);
                switch(class28.field653.field2407) {
                    case 0:
                        field300.field1845 += 8;
                        break;
                    case 1:
                        field300.method2124((Integer) Statics.field250.field143.get(class197.method2058(class28.field662)));
                        field300.field1845 += 4;
                        break;
                    case 2:
                    case 3:
                        field300.method2123(Statics.field58);
                        field300.field1845 += 5;
                }
                field300.method2126(class28.field663);
                field300.method2151(class5.field67, class5.field66);
                field481.field1845 = 0;
                if (field502 == 40) {
                    field481.method2242(18);
                } else {
                    field481.method2242(16);
                }
                field481.method2277(0);
                int var2 = field481.field1845;
                field481.method2124(51);
                field481.method2129(field300.field1844, 0, field300.field1845);
                int var3 = field481.field1845;
                field481.method2126(class28.field662);
                field481.method2242(field264 ? 1 : 0);
                class136.method514(field481);
                class107 var4 = new class107(Statics.field224.method2687());
                Statics.field224.method2686(var4);
                field481.method2129(var4.field1844, 0, var4.field1844.length);
                field481.method2124(Statics.field2949.field2458);
                field481.method2124(Statics.field131.field2458);
                field481.method2124(Statics.field289.field2458);
                field481.method2124(Statics.field57.field2458);
                field481.method2124(Statics.field1763.field2458);
                field481.method2124(Statics.field1493.field2458);
                field481.method2124(Statics.field2462.field2458);
                field481.method2124(Statics.field1918.field2458);
                field481.method2124(Statics.field584.field2458);
                field481.method2124(Statics.field883.field2458);
                field481.method2124(Statics.field1527.field2458);
                field481.method2124(Statics.field372.field2458);
                field481.method2124(Statics.field2655.field2458);
                field481.method2124(Statics.field1560.field2458);
                field481.method2124(Statics.field188.field2458);
                field481.method2124(Statics.field528.field2458);
                field481.method2149(var1, var3, field481.field1845);
                field481.method2131(field481.field1845 - var2);
                Statics.field689.method2584(field481.field1844, 0, field481.field1845);
                field300.method2388(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field302.method2388(var1);
                field294 = 6;
            }
            if (field294 == 6 && Statics.field689.method2585() > 0) {
                int var6 = Statics.field689.method2587();
                if (var6 == 21 && field502 == 20) {
                    field294 = 7;
                } else if (var6 == 2) {
                    field294 = 9;
                } else if (var6 == 15 && field502 == 40) {
                    method2077();
                    return;
                } else if (var6 == 23 && field454 < 1) {
                    field454++;
                    field294 = 0;
                } else {
                    method133(var6);
                    return;
                }
            }
            if (field294 == 7 && Statics.field689.method2585() > 0) {
                field418 = (Statics.field689.method2587() + 3) * 60;
                field294 = 8;
            }
            if (field294 == 8) {
                field449 = 0;
                class28.method501(class142.field2182, class142.field2183, field418 / 60 + class142.field2184);
                if (--field418 <= 0) {
                    field294 = 0;
                }
            } else {
                if (field294 == 9 && Statics.field689.method2585() >= 13) {
                    boolean var7 = Statics.field689.method2587() == 1;
                    Statics.field689.method2586(field302.field1844, 0, 4);
                    field302.field1845 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field302.method2390() << 24;
                        int var10 = var9 | field302.method2390() << 16;
                        int var11 = var10 | field302.method2390() << 8;
                        int var12 = var11 | field302.method2390();
                        int var13 = class197.method2058(class28.field662);
                        if (Statics.field250.field143.size() >= 10 && !Statics.field250.field143.containsKey(var13)) {
                            Iterator var14 = Statics.field250.field143.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field250.field143.put(var13, var12);
                        class9.method2680();
                    }
                    field453 = Statics.field689.method2587();
                    field428 = Statics.field689.method2587() == 1;
                    field384 = Statics.field689.method2587();
                    field384 <<= 0x8;
                    field384 += Statics.field689.method2587();
                    field380 = Statics.field689.method2587();
                    Statics.field689.method2586(field302.field1844, 0, 1);
                    field302.field1845 = 0;
                    field304 = field302.method2390();
                    Statics.field689.method2586(field302.field1844, 0, 2);
                    field302.field1845 = 0;
                    field303 = field302.method2136();
                    if (field380 == 1) {
                        try {
                            client var15 = Statics.field269;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var35) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field269;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var34) {
                        }
                    }
                    field294 = 10;
                }
                if (field294 != 10) {
                    field449++;
                    if (field449 > 2000) {
                        if (field454 < 1) {
                            if (Statics.field896 == Statics.field369) {
                                Statics.field369 = Statics.field1274;
                            } else {
                                Statics.field369 = Statics.field896;
                            }
                            field454++;
                            field294 = 0;
                        } else {
                            method133(-3);
                        }
                    }
                } else if (Statics.field689.method2585() >= field303) {
                    field302.field1845 = 0;
                    Statics.field689.method2586(field302.field1844, 0, field303);
                    field271 = -1L;
                    field272 = -1;
                    Statics.field2116.field190 = 0;
                    Statics.field828 = true;
                    field308 = true;
                    field480 = -1L;
                    class187.method525();
                    field300.field1845 = 0;
                    field302.field1845 = 0;
                    field304 = -1;
                    field322 = -1;
                    field349 = -1;
                    field476 = -1;
                    field498 = 0;
                    field275 = 0;
                    field328 = 0;
                    field385 = 0;
                    field368 = 0;
                    field401 = false;
                    class127.method795(0);
                    class10.field170.clear();
                    class10.field153.method3169();
                    class10.field166.method3219();
                    class10.field152 = 0;
                    field346 = 0;
                    field358 = false;
                    field496 = 0;
                    field446 = (int) (Math.random() * 100.0D) - 50;
                    field296 = (int) (Math.random() * 110.0D) - 55;
                    field327 = (int) (Math.random() * 80.0D) - 40;
                    field330 = (int) (Math.random() * 120.0D) - 60;
                    field332 = (int) (Math.random() * 30.0D) - 20;
                    field458 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field490 = 0;
                    field347 = -1;
                    field377 = 0;
                    field489 = 0;
                    field285 = class18.field524;
                    field279 = 0;
                    field298 = 0;
                    for (int var19 = 0; var19 < 2048; var19++) {
                        field335[var19] = null;
                        field383[var19] = null;
                    }
                    for (int var20 = 0; var20 < 32768; var20++) {
                        field297[var20] = null;
                    }
                    Statics.field578 = field335[2047] = new class3();
                    field392 = -1;
                    field395.method3179();
                    field468.method3179();
                    for (int var21 = 0; var21 < 4; var21++) {
                        for (int var22 = 0; var22 < 104; var22++) {
                            for (int var23 = 0; var23 < 104; var23++) {
                                field393[var21][var22][var23] = null;
                            }
                        }
                    }
                    field394 = new class177();
                    field488 = 0;
                    field508 = 0;
                    field512 = 0;
                    for (int var24 = 0; var24 < Statics.field1066; var24++) {
                        class46 var25 = class46.method498(var24);
                        if (var25 != null) {
                            class154.field2656[var24] = 0;
                            class154.field2657[var24] = 0;
                        }
                    }
                    for (int var26 = 0; var26 < field455.length; var26++) {
                        field455[var26] = -1;
                    }
                    field444 = -1;
                    if (field419 != -1) {
                        int var27 = field419;
                        if (var27 != -1 && Statics.field2523[var27]) {
                            Statics.field2960.method2722(var27);
                            if (Statics.field2628[var27] != null) {
                                boolean var28 = true;
                                for (int var29 = 0; var29 < Statics.field2628[var27].length; var29++) {
                                    if (Statics.field2628[var27][var29] != null) {
                                        if (Statics.field2628[var27][var29].field2580 == 2) {
                                            var28 = false;
                                        } else {
                                            Statics.field2628[var27][var29] = null;
                                        }
                                    }
                                }
                                if (var28) {
                                    Statics.field2628[var27] = null;
                                }
                                Statics.field2523[var27] = false;
                            }
                        }
                    }
                    for (class4 var30 = (class4) field420.method3150(); var30 != null; var30 = (class4) field420.method3151()) {
                        method93(var30, true);
                    }
                    field419 = -1;
                    field420 = new class174(8);
                    field423 = null;
                    field401 = false;
                    field368 = 0;
                    field514.method2884((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var31 = 0; var31 < 8; var31++) {
                        field389[var31] = null;
                        field390[var31] = false;
                    }
                    class14.field203 = new class174(32);
                    field267 = true;
                    for (int var32 = 0; var32 < 100; var32++) {
                        field464[var32] = true;
                    }
                    field427 = null;
                    Statics.field2029 = 0;
                    Statics.field1452 = null;
                    Statics.field1643 = -1;
                    method474(false);
                    field304 = -1;
                }
            }
        } catch (IOException var36) {
            if (field454 < 1) {
                if (Statics.field896 == Statics.field369) {
                    Statics.field369 = Statics.field1274;
                } else {
                    Statics.field369 = Statics.field896;
                }
                field454++;
                field294 = 0;
            } else {
                method133(-2);
            }
        }
    }

    @ObfuscatedName("cl.c(I)V")
    public static void method2077() {
        field300.field1845 = 0;
        field302.field1845 = 0;
        field304 = -1;
        field322 = -1;
        field349 = -1;
        field476 = -1;
        field303 = 0;
        field498 = 0;
        field275 = 0;
        field368 = 0;
        field401 = false;
        field490 = 0;
        field377 = 0;
        for (int var0 = 0; var0 < field335.length; var0++) {
            if (field335[var0] != null) {
                field335[var0].field729 = -1;
            }
        }
        for (int var1 = 0; var1 < field297.length; var1++) {
            if (field297[var1] != null) {
                field297[var1].field729 = -1;
            }
        }
        class14.field203 = new class174(32);
        method1617(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field464[var2] = true;
        }
    }

    @ObfuscatedName("q.m(II)V")
    public static void method133(int arg0) {
        if (arg0 == -3) {
            class28.method501(class142.field2185, class142.field2186, class142.field2187);
        } else if (arg0 == -2) {
            class28.method501(class142.field2188, class142.field2228, class142.field2190);
        } else if (arg0 == -1) {
            class28.method501(class142.field2177, class142.field2215, class142.field2193);
        } else if (arg0 == 3) {
            class28.method501(class142.field2234, class142.field2340, class142.field2196);
        } else if (arg0 == 4) {
            class28.method501(class142.field2197, class142.field2198, class142.field2199);
        } else if (arg0 == 5) {
            class28.method501(class142.field2200, class142.field2201, class142.field2202);
        } else if (arg0 == 6) {
            class28.method501(class142.field2203, class142.field2204, class142.field2205);
        } else if (arg0 == 7) {
            class28.method501(class142.field2272, class142.field2207, class142.field2208);
        } else if (arg0 == 8) {
            class28.method501(class142.field2390, class142.field2210, class142.field2211);
        } else if (arg0 == 9) {
            class28.method501(class142.field2212, class142.field2357, class142.field2256);
        } else if (arg0 == 10) {
            class28.method501(class142.field2296, class142.field2216, class142.field2253);
        } else if (arg0 == 11) {
            class28.method501(class142.field2218, class142.field2219, class142.field2147);
        } else if (arg0 == 12) {
            class28.method501(class142.field2302, class142.field2222, class142.field2223);
        } else if (arg0 == 13) {
            class28.method501(class142.field2224, class142.field2194, class142.field2226);
        } else if (arg0 == 14) {
            class28.method501(class142.field2227, class142.field2316, class142.field2347);
        } else if (arg0 == 16) {
            class28.method501(class142.field2170, class142.field2231, class142.field2232);
        } else if (arg0 == 17) {
            class28.method501(class142.field2233, class142.field2375, class142.field2150);
        } else if (arg0 == 18) {
            class28.method501(class142.field2245, class142.field2237, class142.field2238);
        } else if (arg0 == 19) {
            class28.method501(class142.field2239, class142.field2236, class142.field2241);
        } else if (arg0 == 20) {
            class28.method501(class142.field2242, class142.field2243, class142.field2244);
        } else if (arg0 == 22) {
            class28.method501(class142.field2279, class142.field2246, class142.field2247);
        } else if (arg0 == 23) {
            class28.method501(class142.field2264, class142.field2249, class142.field2250);
        } else if (arg0 == 24) {
            class28.method501(class142.field2251, class142.field2252, class142.field2179);
        } else if (arg0 == 25) {
            class28.method501(class142.field2327, class142.field2255, class142.field2168);
        } else if (arg0 == 26) {
            class28.method501(class142.field2257, class142.field2235, class142.field2259);
        } else if (arg0 == 27) {
            class28.method501(class142.field2287, class142.field2261, class142.field2329);
        } else if (arg0 == 31) {
            class28.method501(class142.field2269, class142.field2291, class142.field2191);
        } else if (arg0 == 32) {
            class28.method501(class142.field2284, class142.field2270, class142.field2274);
        } else if (arg0 == 37) {
            class28.method501(class142.field2309, class142.field2276, class142.field2277);
        } else if (arg0 == 38) {
            class28.method501(class142.field2278, class142.field2158, class142.field2280);
        } else if (arg0 == 55) {
            class28.method501(class142.field2281, class142.field2273, class142.field2374);
        } else if (arg0 == 56) {
            class28.method501(class142.field2377, class142.field2285, class142.field2262);
            method1617(11);
            return;
        } else if (arg0 == 57) {
            class28.method501(class142.field2320, class142.field2288, class142.field2289);
            method1617(11);
            return;
        } else {
            class28.method501(class142.field2290, class142.field2225, class142.field2292);
        }
        method1617(10);
    }

    @ObfuscatedName("ac.i(I)V")
    public static final void method729() {
        if (Statics.field689 != null) {
            Statics.field689.method2591();
            Statics.field689 = null;
        }
        method13();
        Statics.field236.method1623();
        for (int var0 = 0; var0 < 4; var0++) {
            field301[var0].method3441();
        }
        System.gc();
        class161.field2705 = 1;
        Statics.field2519 = null;
        Statics.field2103 = -1;
        Statics.field2709 = -1;
        Statics.field985 = 0;
        Statics.field2708 = false;
        Statics.field2710 = 2;
        field348 = -1;
        field305 = false;
        class20.method7();
        method1617(10);
    }

    @ObfuscatedName("x.h(I)V")
    public static final void method13() {
        class41.method574();
        class37.field886.method3117();
        class40.method877();
        class36.method529();
        class35.field820.method3117();
        class35.field795.method3117();
        class45.field1014.method3117();
        class45.field1015.method3117();
        class45.field1016.method3117();
        class38.method2539();
        class39.method2393();
        class42.method677();
        class46.method562();
        class157.method41();
        class152.field2525.method3117();
        class152.field2600.method3117();
        class152.field2527.method3117();
        ((class88) Statics.field1460).method1873();
        class19.field532.method3117();
        Statics.field2949.method2742();
        Statics.field131.method2742();
        Statics.field57.method2742();
        Statics.field1763.method2742();
        Statics.field1493.method2742();
        Statics.field2462.method2742();
        Statics.field1918.method2742();
        Statics.field584.method2742();
        Statics.field883.method2742();
        Statics.field1527.method2742();
        Statics.field372.method2742();
        Statics.field2655.method2742();
    }

    @ObfuscatedName("bn.a(B)V")
    public static final void method1620() {
        if (field328 > 0) {
            method729();
        } else {
            method1617(40);
            Statics.field6 = Statics.field689;
            Statics.field689 = null;
        }
    }

    @ObfuscatedName("em.w(I)V")
    public static final void method2797() {
        if (field275 > 1) {
            field275--;
        }
        if (field328 > 0) {
            field328--;
        }
        if (field311) {
            field311 = false;
            method1620();
            return;
        }
        if (!field401) {
            field407[0] = class142.field2248;
            field408[0] = "";
            field370[0] = 1006;
            field368 = 1;
        }
        for (int var0 = 0; var0 < 100 && method129(); var0++) {
        }
        if (field502 != 30) {
            return;
        }
        class187.method3108(field300, 48);
        Object var1 = Statics.field2116.field183;
        synchronized (Statics.field2116.field183) {
            if (!field257) {
                Statics.field2116.field190 = 0;
            } else if (class127.field2010 != 0 || Statics.field2116.field190 >= 40) {
                field300.method2389(117);
                field300.method2242(0);
                int var2 = field300.field1845;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field2116.field190 && field300.field1845 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field2116.field185[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field2116.field186[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field2116.field185[var4] == -1 && Statics.field2116.field186[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field270 != var6 || field341 != var5) {
                        int var8 = var6 - field270;
                        field270 = var6;
                        int var9 = var5 - field341;
                        field341 = var5;
                        if (field272 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field300.method2277((field272 << 12) + (var8 << 6) + var9);
                            field272 = 0;
                        } else if (field272 < 8) {
                            field300.method2123((field272 << 19) + 8388608 + var7);
                            field272 = 0;
                        } else {
                            field300.method2124((field272 << 19) + -1073741824 + var7);
                            field272 = 0;
                        }
                    } else if (field272 < 2047) {
                        field272++;
                    }
                }
                field300.method2132(field300.field1845 - var2);
                if (var3 >= Statics.field2116.field190) {
                    Statics.field2116.field190 = 0;
                } else {
                    Statics.field2116.field190 -= var3;
                    for (int var10 = 0; var10 < Statics.field2116.field190; var10++) {
                        Statics.field2116.field186[var10] = Statics.field2116.field186[var3 + var10];
                        Statics.field2116.field185[var10] = Statics.field2116.field185[var3 + var10];
                    }
                }
            }
        }
        if (class127.field2010 == 1 || !Statics.field1901 && class127.field2010 == 4 || class127.field2010 == 2) {
            long var12 = (class127.field2017 - field271) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field271 = class127.field2017;
            int var14 = class127.field2012;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class127.field2013;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class127.field2010 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            field300.method2389(55);
            field300.method2124((var17 << 19) + (var18 << 20) + var16);
        }
        if (class124.field1972 > 0) {
            field300.method2389(65);
            field300.method2277(0);
            int var19 = field300.field1845;
            long var20 = class103.method29();
            for (int var22 = 0; var22 < class124.field1972; var22++) {
                long var23 = var20 - field480;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field480 = var20;
                field300.method2171((int) var23);
                field300.method2120(class124.field1973[var22]);
            }
            field300.method2131(field300.field1845 - var19);
        }
        if (field280 > 0) {
            field280--;
        }
        if (class124.field1971[96] || class124.field1971[97] || class124.field1971[98] || class124.field1971[99]) {
            field360 = true;
        }
        if (field360 && field280 <= 0) {
            field280 = 20;
            field360 = false;
            field300.method2389(187);
            field300.method2162(field342);
            field300.method2162(field458);
        }
        if (Statics.field828 && !field308) {
            field308 = true;
            field300.method2389(41);
            field300.method2242(1);
        }
        if (!Statics.field828 && field308) {
            field308 = false;
            field300.method2389(41);
            field300.method2242(0);
        }
        method2796();
        if (field502 != 30) {
            return;
        }
        for (class15 var25 = (class15) field394.method3185(); var25 != null; var25 = (class15) field394.method3187()) {
            if (var25.field213 > 0) {
                var25.field213--;
            }
            if (var25.field213 != 0) {
                if (var25.field220 > 0) {
                    var25.field220--;
                }
                if (var25.field220 == 0 && var25.field212 >= 1 && var25.field218 >= 1 && var25.field212 <= 102 && var25.field218 <= 102 && (var25.field210 < 0 || class6.method2055(var25.field210, var25.field223))) {
                    method2670(var25.field214, var25.field211, var25.field212, var25.field218, var25.field210, var25.field217, var25.field223);
                    var25.field220 = -1;
                    if (var25.field221 == var25.field210 && var25.field221 == -1) {
                        var25.method3260();
                    } else if (var25.field221 == var25.field210 && var25.field217 == var25.field215 && var25.field223 == var25.field216) {
                        var25.method3260();
                    }
                }
            } else if (var25.field221 < 0 || class6.method2055(var25.field221, var25.field216)) {
                method2670(var25.field214, var25.field211, var25.field212, var25.field218, var25.field221, var25.field215, var25.field216);
                var25.method3260();
            }
        }
        method1621();
        field498++;
        if (field498 > 750) {
            method1620();
            return;
        }
        for (int var26 = -1; var26 < field279; var26++) {
            int var27;
            if (var26 == -1) {
                var27 = 2047;
            } else {
                var27 = field260[var26];
            }
            class3 var28 = field335[var27];
            if (var28 != null) {
                method605(var28, 1);
            }
        }
        for (int var29 = 0; var29 < field298; var29++) {
            int var30 = field299[var29];
            class30 var31 = field297[var30];
            if (var31 != null) {
                method605(var31, var31.field692.field825);
            }
        }
        method744();
        field421++;
        if (field290 != 0) {
            field367 += 20;
            if (field367 >= 400) {
                field290 = 0;
            }
        }
        if (Statics.field564 != null) {
            field336++;
            if (field336 >= 15) {
                method535(Statics.field564);
                Statics.field564 = null;
            }
        }
        class152 var32 = Statics.field1275;
        class152 var33 = Statics.field2109;
        Statics.field1275 = null;
        Statics.field2109 = null;
        field435 = null;
        field439 = false;
        field436 = false;
        field477 = 0;
        while (class124.method1970() && field477 < 128) {
            if (field453 >= 2 && class124.field1971[82] && Statics.field1872 == 66) {
                String var34 = class10.method3106();
                Statics.field99.setContents(new StringSelection(var34), (ClipboardOwner) null);
            } else {
                field506[field477] = Statics.field1872;
                field478[field477] = Statics.field2475;
                field477++;
            }
        }
        method1009(field419, 0, 0, 765, 503, 0, 0);
        field443++;
        while (true) {
            class1 var35;
            class152 var36;
            class152 var37;
            do {
                var35 = (class1) field459.method3217();
                if (var35 == null) {
                    while (true) {
                        class1 var38;
                        class152 var39;
                        class152 var40;
                        do {
                            var38 = (class1) field277.method3217();
                            if (var38 == null) {
                                while (true) {
                                    class1 var41;
                                    class152 var42;
                                    class152 var43;
                                    do {
                                        var41 = (class1) field493.method3217();
                                        if (var41 == null) {
                                            method2051();
                                            if (Statics.field2679 == null && field431 == null) {
                                                int var44 = class127.field2010;
                                                if (field401) {
                                                    if (var44 != 1 && (Statics.field1901 || var44 != 4)) {
                                                        int var45 = class127.field2004;
                                                        int var46 = class127.field2005;
                                                        if (var45 < Statics.field1686 - 10 || var45 > Statics.field29 + Statics.field1686 + 10 || var46 < Statics.field181 - 10 || var46 > Statics.field181 + Statics.field1002 + 10) {
                                                            field401 = false;
                                                            method161(Statics.field1686, Statics.field181, Statics.field29, Statics.field1002);
                                                        }
                                                    }
                                                    if (var44 == 1 || !Statics.field1901 && var44 == 4) {
                                                        int var47 = Statics.field1686;
                                                        int var48 = Statics.field181;
                                                        int var49 = Statics.field29;
                                                        int var50 = class127.field2013;
                                                        int var51 = class127.field2012;
                                                        int var52 = -1;
                                                        for (int var53 = 0; var53 < field368; var53++) {
                                                            int var54 = (field368 - 1 - var53) * 15 + var48 + 31;
                                                            if (var50 > var47 && var50 < var47 + var49 && var51 > var54 - 13 && var51 < var54 + 3) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                        if (var52 != -1) {
                                                            method567(var52);
                                                        }
                                                        field401 = false;
                                                        method161(Statics.field1686, Statics.field181, Statics.field29, Statics.field1002);
                                                    }
                                                } else {
                                                    label974: {
                                                        int var56;
                                                        int var57;
                                                        label1036: {
                                                            if ((var44 == 1 || !Statics.field1901 && var44 == 4) && field368 > 0) {
                                                                int var55 = field370[field368 - 1];
                                                                if (var55 == 39 || var55 == 40 || var55 == 41 || var55 == 42 || var55 == 43 || var55 == 33 || var55 == 34 || var55 == 35 || var55 == 36 || var55 == 37 || var55 == 38 || var55 == 1005) {
                                                                    var56 = field403[field368 - 1];
                                                                    var57 = field391[field368 - 1];
                                                                    class152 var58 = Statics.method159(var57);
                                                                    int var59 = Statics.method2146(var58);
                                                                    boolean var60 = (var59 >> 28 & 0x1) != 0;
                                                                    if (var60) {
                                                                        break label1036;
                                                                    }
                                                                    class156 var10000 = (class156) null;
                                                                    if (class156.method5(Statics.method2146(var58))) {
                                                                        break label1036;
                                                                    }
                                                                }
                                                            }
                                                            if ((var44 == 1 || !Statics.field1901 && var44 == 4) && (field400 == 1 && field368 > 2 || method160(field368 - 1))) {
                                                                var44 = 2;
                                                            }
                                                            if ((var44 == 1 || !Statics.field1901 && var44 == 4) && field368 > 0) {
                                                                method567(field368 - 1);
                                                            }
                                                            if (var44 == 2 && field368 > 0) {
                                                                method2469(class127.field2013, class127.field2012);
                                                            }
                                                            break label974;
                                                        }
                                                        if (Statics.field2679 != null && !field375 && field400 != 1 && !method160(field368 - 1) && field368 > 0) {
                                                            method534(field373, field324);
                                                        }
                                                        field375 = false;
                                                        field413 = 0;
                                                        if (Statics.field2679 != null) {
                                                            method535(Statics.field2679);
                                                        }
                                                        Statics.field2679 = Statics.method159(var57);
                                                        field371 = var56;
                                                        field373 = class127.field2013;
                                                        field324 = class127.field2012;
                                                        if (field368 > 0) {
                                                            int var61 = field368 - 1;
                                                            Statics.field2409 = new class27();
                                                            Statics.field2409.field628 = field403[var61];
                                                            Statics.field2409.field627 = field391[var61];
                                                            Statics.field2409.field634 = field370[var61];
                                                            Statics.field2409.field629 = field406[var61];
                                                            Statics.field2409.field630 = field407[var61];
                                                        }
                                                        method535(Statics.field2679);
                                                    }
                                                }
                                            }
                                            if (field431 != null) {
                                                method30();
                                            }
                                            if (Statics.field2679 != null) {
                                                method535(Statics.field2679);
                                                field413++;
                                                if (class127.field2011 == 0) {
                                                    if (field375) {
                                                        if (Statics.field68 == Statics.field2679 && field371 != field319) {
                                                            class152 var62 = Statics.field2679;
                                                            byte var63 = 0;
                                                            if (field422 == 1 && var62.field2534 == 206) {
                                                                var63 = 1;
                                                            }
                                                            if (var62.field2563[field319] <= 0) {
                                                                var63 = 0;
                                                            }
                                                            if (class156.method5(Statics.method2146(var62))) {
                                                                int var64 = field371;
                                                                int var65 = field319;
                                                                var62.field2563[var65] = var62.field2563[var64];
                                                                var62.field2601[var65] = var62.field2601[var64];
                                                                var62.field2563[var64] = -1;
                                                                var62.field2601[var64] = 0;
                                                            } else if (var63 == 1) {
                                                                int var66 = field371;
                                                                int var67 = field319;
                                                                while (var66 != var67) {
                                                                    if (var66 > var67) {
                                                                        var62.method2850(var66 - 1, var66);
                                                                        var66--;
                                                                    } else if (var66 < var67) {
                                                                        var62.method2850(var66 + 1, var66);
                                                                        var66++;
                                                                    }
                                                                }
                                                            } else {
                                                                var62.method2850(field319, field371);
                                                            }
                                                            field300.method2389(237);
                                                            field300.method2276(Statics.field2679.field2530);
                                                            field300.method2242(var63);
                                                            field300.method2162(field371);
                                                            field300.method2277(field319);
                                                        }
                                                    } else if ((field400 == 1 || method160(field368 - 1)) && field368 > 2) {
                                                        method2469(field373, field324);
                                                    } else if (field368 > 0) {
                                                        method534(field373, field324);
                                                    }
                                                    field336 = 10;
                                                    class127.field2010 = 0;
                                                    Statics.field2679 = null;
                                                } else if (field413 >= 5 && (class127.field2004 > field373 + 5 || class127.field2004 < field373 - 5 || class127.field2005 > field324 + 5 || class127.field2005 < field324 - 5)) {
                                                    field375 = true;
                                                }
                                            }
                                            if (class79.field1384 != -1) {
                                                int var68 = class79.field1384;
                                                int var69 = class79.field1365;
                                                field300.method2389(66);
                                                field300.method2242(5);
                                                field300.method2163(Statics.field169 + var69);
                                                field300.method2162(Statics.field982 + var68);
                                                field300.method2155(class124.field1971[82] ? (class124.field1971[81] ? 2 : 1) : 0);
                                                class79.field1384 = -1;
                                                field365 = class127.field2013;
                                                field366 = class127.field2012;
                                                field290 = 1;
                                                field367 = 0;
                                                field377 = var68;
                                                field489 = var69;
                                            }
                                            if (Statics.field1275 != var32) {
                                                if (var32 != null) {
                                                    method535(var32);
                                                }
                                                if (Statics.field1275 != null) {
                                                    method535(Statics.field1275);
                                                }
                                            }
                                            if (Statics.field2109 != var33 && field411 == field266) {
                                                if (var33 != null) {
                                                    method535(var33);
                                                }
                                                if (Statics.field2109 != null) {
                                                    method535(Statics.field2109);
                                                }
                                            }
                                            if (Statics.field2109 == null) {
                                                if (field411 > 0) {
                                                    field411--;
                                                }
                                            } else if (field411 < field266) {
                                                field411++;
                                                if (field411 == field266) {
                                                    method535(Statics.field2109);
                                                }
                                            }
                                            int var70 = field446 + Statics.field578.field762;
                                            int var71 = field296 + Statics.field578.field726;
                                            if (Statics.field556 - var70 < -500 || Statics.field556 - var70 > 500 || Statics.field1929 - var71 < -500 || Statics.field1929 - var71 > 500) {
                                                Statics.field556 = var70;
                                                Statics.field1929 = var71;
                                            }
                                            if (Statics.field556 != var70) {
                                                Statics.field556 += (var70 - Statics.field556) / 16;
                                            }
                                            if (Statics.field1929 != var71) {
                                                Statics.field1929 += (var71 - Statics.field1929) / 16;
                                            }
                                            if (class127.field2011 == 4 && Statics.field1901) {
                                                int var72 = class127.field2005 - field412;
                                                field515 = var72 * 2;
                                                field412 = var72 == -1 || var72 == 1 ? class127.field2005 : (field412 + class127.field2005) / 2;
                                                int var73 = field378 - class127.field2004;
                                                field344 = var73 * 2;
                                                field378 = var73 == -1 || var73 == 1 ? class127.field2004 : (field378 + class127.field2004) / 2;
                                            } else {
                                                if (class124.field1971[96]) {
                                                    field344 += (-24 - field344) / 2;
                                                } else if (class124.field1971[97]) {
                                                    field344 += (24 - field344) / 2;
                                                } else {
                                                    field344 /= 2;
                                                }
                                                if (class124.field1971[98]) {
                                                    field515 += (12 - field515) / 2;
                                                } else if (class124.field1971[99]) {
                                                    field515 += (-12 - field515) / 2;
                                                } else {
                                                    field515 /= 2;
                                                }
                                                field412 = class127.field2005;
                                                field378 = class127.field2004;
                                            }
                                            field458 = field344 / 2 + field458 & 0x7FF;
                                            field342 += field515 / 2;
                                            if (field342 < 128) {
                                                field342 = 128;
                                            }
                                            if (field342 > 383) {
                                                field342 = 383;
                                            }
                                            int var74 = Statics.field556 >> 7;
                                            int var75 = Statics.field1929 >> 7;
                                            int var76 = method2387(Statics.field556, Statics.field1929, Statics.field1762);
                                            int var77 = 0;
                                            if (var74 > 3 && var75 > 3 && var74 < 100 && var75 < 100) {
                                                for (int var78 = var74 - 4; var78 <= var74 + 4; var78++) {
                                                    for (int var79 = var75 - 4; var79 <= var75 + 4; var79++) {
                                                        int var80 = Statics.field1762;
                                                        if (var80 < 3 && (class6.field75[1][var78][var79] & 0x2) == 2) {
                                                            var80++;
                                                        }
                                                        int var81 = var76 - class6.field74[var80][var78][var79];
                                                        if (var81 > var77) {
                                                            var77 = var81;
                                                        }
                                                    }
                                                }
                                            }
                                            int var82 = var77 * 192;
                                            if (var82 > 98048) {
                                                var82 = 98048;
                                            }
                                            if (var82 < 32768) {
                                                var82 = 32768;
                                            }
                                            if (var82 > field350) {
                                                field350 += (var82 - field350) / 24;
                                            } else if (var82 < field350) {
                                                field350 += (var82 - field350) / 80;
                                            }
                                            if (field340) {
                                                method806();
                                            }
                                            for (int var83 = 0; var83 < 5; var83++) {
                                                int var10002 = field507[var83]++;
                                            }
                                            int var84 = ++class127.field2000 - 1;
                                            int var86 = class124.method878();
                                            if (var84 > 15000 && var86 > 15000) {
                                                field328 = 250;
                                                class127.method795(14500);
                                                field300.method2389(0);
                                            }
                                            field329++;
                                            if (field329 > 500) {
                                                field329 = 0;
                                                int var87 = (int) (Math.random() * 8.0D);
                                                if ((var87 & 0x1) == 1) {
                                                    field446 += field255;
                                                }
                                                if ((var87 & 0x2) == 2) {
                                                    field296 += field326;
                                                }
                                                if ((var87 & 0x4) == 4) {
                                                    field327 += field479;
                                                }
                                            }
                                            if (field446 < -50) {
                                                field255 = 2;
                                            }
                                            if (field446 > 50) {
                                                field255 = -2;
                                            }
                                            if (field296 < -55) {
                                                field326 = 2;
                                            }
                                            if (field296 > 55) {
                                                field326 = -2;
                                            }
                                            if (field327 < -40) {
                                                field479 = 1;
                                            }
                                            if (field327 > 40) {
                                                field479 = -1;
                                            }
                                            field334++;
                                            if (field334 > 500) {
                                                field334 = 0;
                                                int var88 = (int) (Math.random() * 8.0D);
                                                if ((var88 & 0x1) == 1) {
                                                    field330 += field323;
                                                }
                                                if ((var88 & 0x2) == 2) {
                                                    field332 += field333;
                                                }
                                            }
                                            if (field330 < -60) {
                                                field323 = 2;
                                            }
                                            if (field330 > 60) {
                                                field323 = -2;
                                            }
                                            if (field332 < -20) {
                                                field333 = 1;
                                            }
                                            if (field332 > 10) {
                                                field333 = -1;
                                            }
                                            for (class34 var89 = (class34) field511.method3143(); var89 != null; var89 = (class34) field511.method3141()) {
                                                if ((long) var89.field786 < class103.method29() / 1000L - 5L) {
                                                    if (var89.field787 > 0) {
                                                        class10.method88(5, "", var89.field785 + class142.field2293);
                                                    }
                                                    if (var89.field787 == 0) {
                                                        class10.method88(5, "", var89.field785 + class142.field2151);
                                                    }
                                                    var89.method3255();
                                                }
                                            }
                                            field306++;
                                            if (field306 > 50) {
                                                field300.method2389(182);
                                            }
                                            try {
                                                if (Statics.field689 != null && field300.field1845 > 0) {
                                                    Statics.field689.method2584(field300.field1844, 0, field300.field1845);
                                                    field300.field1845 = 0;
                                                    field306 = 0;
                                                }
                                            } catch (IOException var91) {
                                                method1620();
                                            }
                                            return;
                                        }
                                        var42 = var41.field1;
                                        if (var42.field2531 < 0) {
                                            break;
                                        }
                                        var43 = Statics.method159(var42.field2582);
                                    } while (var43 == null || var43.field2633 == null || var42.field2531 >= var43.field2633.length || var43.field2633[var42.field2531] != var42);
                                    class32.method487(var41);
                                }
                            }
                            var39 = var38.field1;
                            if (var39.field2531 < 0) {
                                break;
                            }
                            var40 = Statics.method159(var39.field2582);
                        } while (var40 == null || var40.field2633 == null || var39.field2531 >= var40.field2633.length || var40.field2633[var39.field2531] != var39);
                        class32.method487(var38);
                    }
                }
                var36 = var35.field1;
                if (var36.field2531 < 0) {
                    break;
                }
                var37 = Statics.method159(var36.field2582);
            } while (var37 == null || var37.field2633 == null || var36.field2531 >= var37.field2633.length || var37.field2633[var36.field2531] != var36);
            class32.method487(var35);
        }
    }

    @ObfuscatedName("ab.z(B)V")
    public static final void method546() {
        if (Statics.field2032 != null) {
            Statics.field2032.method985();
        }
        if (Statics.field95 != null) {
            Statics.field95.method985();
        }
    }

    @ObfuscatedName("bn.v(B)V")
    public static final void method1621() {
        for (int var0 = 0; var0 < field496; var0++) {
            int var10002 = field499[var0]--;
            if (field499[var0] >= -10) {
                class52 var2 = field501[var0];
                if (var2 == null) {
                    class52 var10000 = (class52) null;
                    var2 = class52.method1029(Statics.field1763, field497[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field499[var0] += var2.method1025();
                    field501[var0] = var2;
                }
                if (field499[var0] < 0) {
                    int var9;
                    if (field500[var0] == 0) {
                        var9 = field494;
                    } else {
                        int var3 = (field500[var0] & 0xFF) * 128;
                        int var4 = field500[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field578.field762;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field500[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field578.field726;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field499[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field473 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method1024().method1064(Statics.field589);
                        class58 var11 = class58.method1134(var10, 100, var9);
                        var11.method1197(field256[var0] - 1);
                        Statics.field632.method978(var11);
                    }
                    field499[var0] = -100;
                }
            } else {
                field496--;
                for (int var1 = var0; var1 < field496; var1++) {
                    field497[var1] = field497[var1 + 1];
                    field501[var1] = field501[var1 + 1];
                    field256[var1] = field256[var1 + 1];
                    field499[var1] = field499[var1 + 1];
                    field500[var1] = field500[var1 + 1];
                }
                var0--;
            }
        }
        if (field305 && !class161.method2072()) {
            if (field491 != 0 && field348 != -1) {
                class161.method2681(Statics.field2462, field348, 0, field491, false);
            }
            field305 = false;
        }
    }

    @ObfuscatedName("x.s(Lac;IIII)V")
    public static void method22(class38 arg0, int arg1, int arg2, int arg3) {
        if (field496 >= 50 || field473 == 0 || arg0.field907 == null || arg1 >= arg0.field907.length) {
            return;
        }
        int var4 = arg0.field907[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field497[field496] = var5;
        field256[field496] = var6;
        field499[field496] = 0;
        field501[field496] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field500[field496] = (var8 << 16) + (var9 << 8) + var7;
        field496++;
    }

    @ObfuscatedName("g.r(IIII)V")
    public static void method157(int arg0, int arg1, int arg2) {
        if (field494 == 0 || arg1 == 0 || field496 >= 50) {
            return;
        }
        field497[field496] = arg0;
        field256[field496] = arg1;
        field499[field496] = arg2;
        field501[field496] = null;
        field500[field496] = 0;
        field496++;
    }

    @ObfuscatedName("cc.d(II)V")
    public static void method1886(int arg0) {
        if (arg0 == -1 && !field305) {
            Statics.field1003.method3003();
            class161.field2705 = 1;
            Statics.field2519 = null;
        } else if (arg0 != -1 && field348 != arg0 && field491 != 0 && !field305) {
            class147 var1 = Statics.field2462;
            int var2 = field491;
            class161.field2705 = 1;
            Statics.field2519 = var1;
            Statics.field2103 = arg0;
            Statics.field2709 = 0;
            Statics.field985 = var2;
            Statics.field2708 = false;
            Statics.field2710 = 2;
        }
        field348 = arg0;
    }

    @ObfuscatedName("ey.al(IIB)V")
    public static void method2825(int arg0, int arg1) {
        if (field491 != 0 && arg0 != -1) {
            class161.method2681(Statics.field372, arg0, 0, field491, false);
            field305 = true;
        }
    }

    @ObfuscatedName("ef.ab(I)V")
    public static final void method2796() {
        if (field264 && Statics.field1762 != field312) {
            method2398(Statics.field1643, Statics.field999, Statics.field1762, Statics.field578.field779[0], Statics.field578.field780[0]);
        } else if (Statics.field1762 != field347) {
            field347 = Statics.field1762;
            method2679(Statics.field1762);
        }
    }

    @ObfuscatedName("aa.au(I)V")
    public static final void method744() {
        for (int var0 = -1; var0 < field279; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field260[var0];
            }
            class3 var2 = field335[var1];
            if (var2 != null && var2.field748 > 0) {
                var2.field748--;
                if (var2.field748 == 0) {
                    var2.field738 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field298; var3++) {
            int var4 = field299[var3];
            class30 var5 = field297[var4];
            if (var5 != null && var5.field748 > 0) {
                var5.field748--;
                if (var5.field748 == 0) {
                    var5.field738 = null;
                }
            }
        }
    }

    @ObfuscatedName("ak.az(I)V")
    public static final void method806() {
        int var0 = Statics.field1887 * 128 + 64;
        int var1 = Statics.field694 * 128 + 64;
        int var2 = method2387(var0, var1, Statics.field1762) - Statics.field519;
        if (Statics.field200 < var0) {
            Statics.field200 += Statics.field693 * (var0 - Statics.field200) / 1000 + Statics.field1448;
            if (Statics.field200 > var0) {
                Statics.field200 = var0;
            }
        }
        if (Statics.field200 > var0) {
            Statics.field200 -= Statics.field693 * (Statics.field200 - var0) / 1000 + Statics.field1448;
            if (Statics.field200 < var0) {
                Statics.field200 = var0;
            }
        }
        if (Statics.field1252 < var2) {
            Statics.field1252 += Statics.field693 * (var2 - Statics.field1252) / 1000 + Statics.field1448;
            if (Statics.field1252 > var2) {
                Statics.field1252 = var2;
            }
        }
        if (Statics.field1252 > var2) {
            Statics.field1252 -= Statics.field693 * (Statics.field1252 - var2) / 1000 + Statics.field1448;
            if (Statics.field1252 < var2) {
                Statics.field1252 = var2;
            }
        }
        if (Statics.field60 < var1) {
            Statics.field60 += Statics.field693 * (var1 - Statics.field60) / 1000 + Statics.field1448;
            if (Statics.field60 > var1) {
                Statics.field60 = var1;
            }
        }
        if (Statics.field60 > var1) {
            Statics.field60 -= Statics.field693 * (Statics.field60 - var1) / 1000 + Statics.field1448;
            if (Statics.field60 < var1) {
                Statics.field60 = var1;
            }
        }
        int var3 = Statics.field177 * 128 + 64;
        int var4 = Statics.field164 * 128 + 64;
        int var5 = method2387(var3, var4, Statics.field1762) - Statics.field2106;
        int var6 = var3 - Statics.field200;
        int var7 = var5 - Statics.field1252;
        int var8 = var4 - Statics.field60;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1253 < var10) {
            Statics.field1253 += Statics.field206 * (var10 - Statics.field1253) / 1000 + Statics.field949;
            if (Statics.field1253 > var10) {
                Statics.field1253 = var10;
            }
        }
        if (Statics.field1253 > var10) {
            Statics.field1253 -= Statics.field206 * (Statics.field1253 - var10) / 1000 + Statics.field949;
            if (Statics.field1253 < var10) {
                Statics.field1253 = var10;
            }
        }
        int var12 = var11 - Statics.field240;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field240 += Statics.field206 * var12 / 1000 + Statics.field949;
            Statics.field240 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field240 -= Statics.field206 * -var12 / 1000 + Statics.field949;
            Statics.field240 &= 0x7FF;
        }
        int var13 = var11 - Statics.field240;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field240 = var11;
        }
    }

    @ObfuscatedName("ar.ai(Lar;II)V")
    public static final void method605(class33 arg0, int arg1) {
        if (arg0.field770 > field376) {
            method2571(arg0);
        } else if (arg0.field771 >= field376) {
            if (field376 == arg0.field771 || arg0.field756 == -1 || arg0.field781 != 0 || arg0.field727 + 1 > Statics.method484(arg0.field756).field900[arg0.field757]) {
                int var2 = arg0.field771 - arg0.field770;
                int var3 = field376 - arg0.field770;
                int var4 = arg0.field763 * 64 + arg0.field758 * 128;
                int var5 = arg0.field768 * 128 + arg0.field763 * 64;
                int var6 = arg0.field767 * 128 + arg0.field763 * 64;
                int var7 = arg0.field769 * 128 + arg0.field763 * 64;
                arg0.field762 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field726 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field782 = 0;
            if (arg0.field740 == 0) {
                arg0.field775 = 1024;
            }
            if (arg0.field740 == 1) {
                arg0.field775 = 1536;
            }
            if (arg0.field740 == 2) {
                arg0.field775 = 0;
            }
            if (arg0.field740 == 3) {
                arg0.field775 = 512;
            }
            arg0.field733 = arg0.field775;
        } else {
            arg0.field759 = arg0.field730;
            if (arg0.field778 == 0) {
                arg0.field782 = 0;
            } else {
                label344: {
                    if (arg0.field756 != -1 && arg0.field781 == 0) {
                        class38 var8 = Statics.method484(arg0.field756);
                        if (arg0.field736 > 0 && var8.field915 == 0) {
                            arg0.field782++;
                            break label344;
                        }
                        if (arg0.field736 <= 0 && var8.field916 == 0) {
                            arg0.field782++;
                            break label344;
                        }
                    }
                    int var9 = arg0.field762;
                    int var10 = arg0.field726;
                    int var11 = arg0.field779[arg0.field778 - 1] * 128 + arg0.field763 * 64;
                    int var12 = arg0.field780[arg0.field778 - 1] * 128 + arg0.field763 * 64;
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        if (var9 < var11) {
                            if (var10 < var12) {
                                arg0.field775 = 1280;
                            } else if (var10 > var12) {
                                arg0.field775 = 1792;
                            } else {
                                arg0.field775 = 1536;
                            }
                        } else if (var9 > var11) {
                            if (var10 < var12) {
                                arg0.field775 = 768;
                            } else if (var10 > var12) {
                                arg0.field775 = 256;
                            } else {
                                arg0.field775 = 512;
                            }
                        } else if (var10 < var12) {
                            arg0.field775 = 1024;
                        } else if (var10 > var12) {
                            arg0.field775 = 0;
                        }
                        int var13 = arg0.field775 - arg0.field733 & 0x7FF;
                        if (var13 > 1024) {
                            var13 -= 2048;
                        }
                        int var14 = arg0.field741;
                        if (var13 >= -256 && var13 <= 256) {
                            var14 = arg0.field766;
                        } else if (var13 >= 256 && var13 < 768) {
                            var14 = arg0.field772;
                        } else if (var13 >= -768 && var13 <= -256) {
                            var14 = arg0.field735;
                        }
                        if (var14 == -1) {
                            var14 = arg0.field766;
                        }
                        arg0.field759 = var14;
                        int var15 = 4;
                        boolean var16 = true;
                        if (arg0 instanceof class30) {
                            var16 = ((class30) arg0).field692.field826;
                        }
                        if (var16) {
                            if (arg0.field775 != arg0.field733 && arg0.field729 == -1 && arg0.field777 != 0) {
                                var15 = 2;
                            }
                            if (arg0.field778 > 2) {
                                var15 = 6;
                            }
                            if (arg0.field778 > 3) {
                                var15 = 8;
                            }
                            if (arg0.field782 > 0 && arg0.field778 > 1) {
                                var15 = 8;
                                arg0.field782--;
                            }
                        } else {
                            if (arg0.field778 > 1) {
                                var15 = 6;
                            }
                            if (arg0.field778 > 2) {
                                var15 = 8;
                            }
                            if (arg0.field782 > 0 && arg0.field778 > 1) {
                                var15 = 8;
                                arg0.field782--;
                            }
                        }
                        if (arg0.field753[arg0.field778 - 1]) {
                            var15 <<= 0x1;
                        }
                        if (var15 >= 8 && arg0.field766 == arg0.field759 && arg0.field734 != -1) {
                            arg0.field759 = arg0.field734;
                        }
                        if (var9 < var11) {
                            arg0.field762 += var15;
                            if (arg0.field762 > var11) {
                                arg0.field762 = var11;
                            }
                        } else if (var9 > var11) {
                            arg0.field762 -= var15;
                            if (arg0.field762 < var11) {
                                arg0.field762 = var11;
                            }
                        }
                        if (var10 < var12) {
                            arg0.field726 += var15;
                            if (arg0.field726 > var12) {
                                arg0.field726 = var12;
                            }
                        } else if (var10 > var12) {
                            arg0.field726 -= var15;
                            if (arg0.field726 < var12) {
                                arg0.field726 = var12;
                            }
                        }
                        if (arg0.field762 == var11 && arg0.field726 == var12) {
                            arg0.field778--;
                            if (arg0.field736 > 0) {
                                arg0.field736--;
                            }
                        }
                    } else {
                        arg0.field762 = var11;
                        arg0.field726 = var12;
                    }
                }
            }
        }
        if (arg0.field762 < 128 || arg0.field726 < 128 || arg0.field762 >= 13184 || arg0.field726 >= 13184) {
            arg0.field756 = -1;
            arg0.field761 = -1;
            arg0.field770 = 0;
            arg0.field771 = 0;
            arg0.field762 = arg0.field779[0] * 128 + arg0.field763 * 64;
            arg0.field726 = arg0.field780[0] * 128 + arg0.field763 * 64;
            arg0.method589();
        }
        if (Statics.field578 == arg0 && (arg0.field762 < 1536 || arg0.field726 < 1536 || arg0.field762 >= 11776 || arg0.field726 >= 11776)) {
            arg0.field756 = -1;
            arg0.field761 = -1;
            arg0.field770 = 0;
            arg0.field771 = 0;
            arg0.field762 = arg0.field779[0] * 128 + arg0.field763 * 64;
            arg0.field726 = arg0.field780[0] * 128 + arg0.field763 * 64;
            arg0.method589();
        }
        if (arg0.field777 != 0) {
            if (arg0.field729 != -1 && arg0.field729 < 32768) {
                class30 var17 = field297[arg0.field729];
                if (var17 != null) {
                    int var18 = arg0.field762 - var17.field762;
                    int var19 = arg0.field726 - var17.field726;
                    if (var18 != 0 || var19 != 0) {
                        arg0.field775 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field729 >= 32768) {
                int var20 = arg0.field729 - 32768;
                if (field384 == var20) {
                    var20 = 2047;
                }
                class3 var21 = field335[var20];
                if (var21 != null) {
                    int var22 = arg0.field762 - var21.field762;
                    int var23 = arg0.field726 - var21.field726;
                    if (var22 != 0 || var23 != 0) {
                        arg0.field775 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field751 != 0 || arg0.field752 != 0) && (arg0.field778 == 0 || arg0.field782 > 0)) {
                int var24 = arg0.field762 - (arg0.field751 * 64 - Statics.field982 * 64 - Statics.field982 * 64);
                int var25 = arg0.field726 - (arg0.field752 * 64 - Statics.field169 * 64 - Statics.field169 * 64);
                if (var24 != 0 || var25 != 0) {
                    arg0.field775 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 0x7FF;
                }
                arg0.field751 = 0;
                arg0.field752 = 0;
            }
            int var26 = arg0.field775 - arg0.field733 & 0x7FF;
            if (var26 == 0) {
                arg0.field776 = 0;
            } else {
                arg0.field776++;
                if (var26 > 1024) {
                    arg0.field733 -= arg0.field777;
                    boolean var27 = true;
                    if (var26 < arg0.field777 || var26 > 2048 - arg0.field777) {
                        arg0.field733 = arg0.field775;
                        var27 = false;
                    }
                    if (arg0.field759 == arg0.field730 && (arg0.field776 > 25 || var27)) {
                        if (arg0.field731 == -1) {
                            arg0.field759 = arg0.field766;
                        } else {
                            arg0.field759 = arg0.field731;
                        }
                    }
                } else {
                    arg0.field733 += arg0.field777;
                    boolean var28 = true;
                    if (var26 < arg0.field777 || var26 > 2048 - arg0.field777) {
                        arg0.field733 = arg0.field775;
                        var28 = false;
                    }
                    if (arg0.field759 == arg0.field730 && (arg0.field776 > 25 || var28)) {
                        if (arg0.field732 == -1) {
                            arg0.field759 = arg0.field766;
                        } else {
                            arg0.field759 = arg0.field732;
                        }
                    }
                }
                arg0.field733 &= 0x7FF;
            }
        }
        method153(arg0);
    }

    @ObfuscatedName("dy.ay(Lar;I)V")
    public static final void method2571(class33 arg0) {
        int var1 = arg0.field770 - field376;
        int var2 = arg0.field763 * 64 + arg0.field758 * 128;
        int var3 = arg0.field768 * 128 + arg0.field763 * 64;
        arg0.field762 += (var2 - arg0.field762) / var1;
        arg0.field726 += (var3 - arg0.field726) / var1;
        arg0.field782 = 0;
        if (arg0.field740 == 0) {
            arg0.field775 = 1024;
        }
        if (arg0.field740 == 1) {
            arg0.field775 = 1536;
        }
        if (arg0.field740 == 2) {
            arg0.field775 = 0;
        }
        if (arg0.field740 == 3) {
            arg0.field775 = 512;
        }
    }

    @ObfuscatedName("t.ar(Lar;B)V")
    public static final void method153(class33 arg0) {
        arg0.field728 = false;
        if (arg0.field759 != -1) {
            class38 var1 = Statics.method484(arg0.field759);
            if (var1 == null || var1.field911 == null) {
                arg0.field759 = -1;
            } else {
                arg0.field755++;
                if (arg0.field754 < var1.field911.length && arg0.field755 > var1.field900[arg0.field754]) {
                    arg0.field755 = 1;
                    arg0.field754++;
                    method22(var1, arg0.field754, arg0.field762, arg0.field726);
                }
                if (arg0.field754 >= var1.field911.length) {
                    arg0.field755 = 0;
                    arg0.field754 = 0;
                    method22(var1, arg0.field754, arg0.field762, arg0.field726);
                }
            }
        }
        if (arg0.field761 != -1 && field376 >= arg0.field764) {
            if (arg0.field750 < 0) {
                arg0.field750 = 0;
            }
            int var2 = class39.method1(arg0.field761).field932;
            if (var2 == -1) {
                arg0.field761 = -1;
            } else {
                class38 var3 = Statics.method484(var2);
                if (var3 == null || var3.field911 == null) {
                    arg0.field761 = -1;
                } else {
                    arg0.field745++;
                    if (arg0.field750 < var3.field911.length && arg0.field745 > var3.field900[arg0.field750]) {
                        arg0.field745 = 1;
                        arg0.field750++;
                        method22(var3, arg0.field750, arg0.field762, arg0.field726);
                    }
                    if (arg0.field750 >= var3.field911.length && (arg0.field750 < 0 || arg0.field750 >= var3.field911.length)) {
                        arg0.field761 = -1;
                    }
                }
            }
        }
        if (arg0.field756 != -1 && arg0.field781 <= 1) {
            class38 var4 = Statics.method484(arg0.field756);
            if (var4.field915 == 1 && arg0.field736 > 0 && arg0.field770 <= field376 && arg0.field771 < field376) {
                arg0.field781 = 1;
                return;
            }
        }
        if (arg0.field756 != -1 && arg0.field781 == 0) {
            class38 var5 = Statics.method484(arg0.field756);
            if (var5 == null || var5.field911 == null) {
                arg0.field756 = -1;
            } else {
                arg0.field727++;
                if (arg0.field757 < var5.field911.length && arg0.field727 > var5.field900[arg0.field757]) {
                    arg0.field727 = 1;
                    arg0.field757++;
                    method22(var5, arg0.field757, arg0.field762, arg0.field726);
                }
                if (arg0.field757 >= var5.field911.length) {
                    arg0.field757 -= var5.field908;
                    arg0.field760++;
                    if (arg0.field760 >= var5.field914) {
                        arg0.field756 = -1;
                    } else if (arg0.field757 >= 0 && arg0.field757 < var5.field911.length) {
                        method22(var5, arg0.field757, arg0.field762, arg0.field726);
                    } else {
                        arg0.field756 = -1;
                    }
                }
                arg0.field728 = var5.field903;
            }
        }
        if (arg0.field781 > 0) {
            arg0.field781--;
        }
    }

    @ObfuscatedName("cm.af(Lx;III)V")
    public static void method1974(class3 arg0, int arg1, int arg2) {
        if (arg0.field756 == arg1 && arg1 != -1) {
            int var3 = Statics.method484(arg1).field917;
            if (var3 == 1) {
                arg0.field757 = 0;
                arg0.field727 = 0;
                arg0.field781 = arg2;
                arg0.field760 = 0;
            }
            if (var3 == 2) {
                arg0.field760 = 0;
            }
        } else if (arg1 == -1 || arg0.field756 == -1 || Statics.method484(arg1).field919 >= Statics.method484(arg0.field756).field919) {
            arg0.field756 = arg1;
            arg0.field757 = 0;
            arg0.field727 = 0;
            arg0.field781 = arg2;
            arg0.field760 = 0;
            arg0.field736 = arg0.field778;
        }
    }

    @ObfuscatedName("cl.ap(IIIII)V")
    public static final void method2081(int arg0, int arg1, int arg2, int arg3) {
        class73.method1559(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class84.method1791();
        field362++;
        method96(class29.field686);
        boolean var4 = false;
        if (field392 >= 0) {
            for (int var5 = 0; var5 < field279; var5++) {
                if (field392 == field260[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method96(class29.field683);
        }
        method92(true);
        method96(var4 ? class29.field680 : class29.field684);
        method92(false);
        method2659();
        method805();
        if (!field340) {
            int var6 = field342;
            if (field350 / 256 > var6) {
                var6 = field350 / 256;
            }
            if (field503[4] && field505[4] + 128 > var6) {
                var6 = field505[4] + 128;
            }
            int var7 = field458 + field327 & 0x7FF;
            method745(Statics.field556, method2387(Statics.field578.field762, Statics.field578.field726, Statics.field1762) - 50, Statics.field1929, var6, var7, var6 * 3 + 600);
        }
        int var8;
        if (field340) {
            var8 = method1610();
        } else {
            var8 = method575();
        }
        int var9 = Statics.field200;
        int var10 = Statics.field1252;
        int var11 = Statics.field60;
        int var12 = Statics.field1253;
        int var13 = Statics.field240;
        for (int var14 = 0; var14 < 5; var14++) {
            if (field503[var14]) {
                int var15 = (int) (Math.random() * (double) (field432[var14] * 2 + 1) - (double) field432[var14] + Math.sin((double) field492[var14] / 100.0D * (double) field507[var14]) * (double) field505[var14]);
                if (var14 == 0) {
                    Statics.field200 += var15;
                }
                if (var14 == 1) {
                    Statics.field1252 += var15;
                }
                if (var14 == 2) {
                    Statics.field60 += var15;
                }
                if (var14 == 3) {
                    Statics.field240 = Statics.field240 + var15 & 0x7FF;
                }
                if (var14 == 4) {
                    Statics.field1253 += var15;
                    if (Statics.field1253 < 128) {
                        Statics.field1253 = 128;
                    }
                    if (Statics.field1253 > 383) {
                        Statics.field1253 = 383;
                    }
                }
            }
        }
        int var16 = class127.field2004;
        int var17 = class127.field2005;
        if (class127.field2010 != 0) {
            var16 = class127.field2013;
            var17 = class127.field2012;
        }
        if (var16 >= arg0 && var16 < arg0 + arg2 && var17 >= arg1 && var17 < arg1 + arg3) {
            class98.field1726 = true;
            class98.field1749 = 0;
            class98.field1747 = var16 - arg0;
            class98.field1748 = var17 - arg1;
        } else {
            class98.field1726 = false;
            class98.field1749 = 0;
        }
        method546();
        class73.method1523(arg0, arg1, arg2, arg3, 0);
        method546();
        Statics.field236.method1632(Statics.field200, Statics.field1252, Statics.field60, Statics.field1253, Statics.field240, var8);
        method546();
        Statics.field236.method1650();
        method787(arg0, arg1, arg2, arg3);
        Statics.method135(arg0, arg1);
        ((class88) Statics.field1460).method1875(field421);
        if (field290 == 1) {
            Statics.field1427[field367 / 100].method1435(field365 - 8, field366 - 8);
        }
        if (field290 == 2) {
            Statics.field1427[field367 / 100 + 4].method1435(field365 - 8, field366 - 8);
        }
        field472 = 0;
        int var18 = (Statics.field578.field762 >> 7) + Statics.field982;
        int var19 = (Statics.field578.field726 >> 7) + Statics.field169;
        if (var18 >= 3053 && var18 <= 3156 && var19 >= 3056 && var19 <= 3136) {
            field472 = 1;
        }
        if (var18 >= 3072 && var18 <= 3118 && var19 >= 9492 && var19 <= 9535) {
            field472 = 1;
        }
        if (field472 == 1 && var18 >= 3139 && var18 <= 3199 && var19 >= 3008 && var19 <= 3062) {
            field472 = 0;
        }
        if (field274) {
            int var20 = arg0 + 512 - 5;
            int var21 = arg1 + 20;
            Statics.field61.method3309("Fps:" + field2062, var20, var21, 16776960, -1);
            int var25 = var21 + 15;
            Runtime var22 = Runtime.getRuntime();
            int var23 = (int) ((var22.totalMemory() - var22.freeMemory()) / 1024L);
            int var24 = 16776960;
            if (var23 > 32768 && field264) {
                var24 = 16711680;
            }
            if (var23 > 65536 && !field264) {
                var24 = 16711680;
            }
            Statics.field61.method3309("Mem:" + var23 + "k", var20, var25, var24, -1);
            var21 = var25 + 15;
        }
        Statics.field200 = var9;
        Statics.field1252 = var10;
        Statics.field60 = var11;
        Statics.field1253 = var12;
        Statics.field240 = var13;
        if (field267 && class150.method91(true, false) == 0) {
            field267 = false;
        }
        if (field267) {
            class73.method1523(arg0, arg1, arg2, arg3, 0);
            Statics.method2576(class142.field2361, false);
        }
    }

    @ObfuscatedName("f.aj(Lau;I)V")
    public static final void method96(class29 arg0) {
        if (Statics.field578.field762 >> 7 == field377 && Statics.field578.field726 >> 7 == field489) {
            field377 = 0;
        }
        int var1 = field279;
        if (class29.field686 == arg0 || class29.field683 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field686 == arg0) {
                var3 = Statics.field578;
                var4 = 33538048;
            } else if (class29.field683 == arg0) {
                var3 = field335[field392];
                var4 = field392 << 14;
            } else {
                var3 = field335[field260[var2]];
                var4 = field260[var2] << 14;
                if (class29.field680 == arg0 && field392 == field260[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method12()) {
                var3.field52 = false;
                if ((field264 && field279 > 50 || field279 > 200) && class29.field686 != arg0 && var3.field759 == var3.field730) {
                    var3.field52 = true;
                }
                int var5 = var3.field762 >> 7;
                int var6 = var3.field726 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field49 == null || field376 < var3.field47 || field376 >= var3.field42) {
                        if ((var3.field762 & 0x7F) == 64 && (var3.field726 & 0x7F) == 64) {
                            if (field362 == field361[var5][var6]) {
                                continue;
                            }
                            field361[var5][var6] = field362;
                        }
                        var3.field40 = method2387(var3.field762, var3.field726, Statics.field1762);
                        Statics.field236.method1634(Statics.field1762, var3.field762, var3.field726, var3.field40, 60, var3, var3.field733, var4, var3.field728);
                    } else {
                        var3.field52 = false;
                        var3.field40 = method2387(var3.field762, var3.field726, Statics.field1762);
                        Statics.field236.method1635(Statics.field1762, var3.field762, var3.field726, var3.field40, 60, var3, var3.field733, var4, var3.field36, var3.field48, var3.field41, var3.field35);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.ac(ZB)V")
    public static final void method92(boolean arg0) {
        for (int var1 = 0; var1 < field298; var1++) {
            class30 var2 = field297[field299[var1]];
            int var3 = (field299[var1] << 14) + 536870912;
            if (var2 != null && var2.method12() && var2.field692.field817 == arg0 && var2.field692.method615()) {
                int var4 = var2.field762 >> 7;
                int var5 = var2.field726 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field763 == 1 && (var2.field762 & 0x7F) == 64 && (var2.field726 & 0x7F) == 64) {
                        if (field362 == field361[var4][var5]) {
                            continue;
                        }
                        field361[var4][var5] = field362;
                    }
                    if (!var2.field692.field823) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field236.method1634(Statics.field1762, var2.field762, var2.field726, method2387(var2.field762 + (var2.field763 * 64 - 64), var2.field726 + (var2.field763 * 64 - 64), Statics.field1762), var2.field763 * 64 - 64 + 60, var2, var2.field733, var3, var2.field728);
                }
            }
        }
    }

    @ObfuscatedName("ee.aa(I)V")
    public static final void method2659() {
        for (class7 var0 = (class7) field395.method3185(); var0 != null; var0 = (class7) field395.method3187()) {
            if (Statics.field1762 != var0.field102 || field376 > var0.field108) {
                var0.method3260();
            } else if (field376 >= var0.field121) {
                if (var0.field101 > 0) {
                    class30 var1 = field297[var0.field101 - 1];
                    if (var1 != null && var1.field762 >= 0 && var1.field762 < 13312 && var1.field726 >= 0 && var1.field726 < 13312) {
                        var0.method82(var1.field762, var1.field726, method2387(var1.field762, var1.field726, var0.field102) - var0.field106, field376);
                    }
                }
                if (var0.field101 < 0) {
                    int var2 = -var0.field101 - 1;
                    class3 var3;
                    if (field384 == var2) {
                        var3 = Statics.field578;
                    } else {
                        var3 = field335[var2];
                    }
                    if (var3 != null && var3.field762 >= 0 && var3.field762 < 13312 && var3.field726 >= 0 && var3.field726 < 13312) {
                        var0.method82(var3.field762, var3.field726, method2387(var3.field762, var3.field726, var0.field102) - var0.field106, field376);
                    }
                }
                var0.method83(field421);
                Statics.field236.method1634(Statics.field1762, (int) var0.field113, (int) var0.field114, (int) var0.field119, 60, var0, var0.field115, -1, false);
            }
        }
    }

    @ObfuscatedName("ak.ag(I)V")
    public static final void method805() {
        for (class26 var0 = (class26) field468.method3185(); var0 != null; var0 = (class26) field468.method3187()) {
            if (Statics.field1762 != var0.field614 || var0.field619) {
                var0.method3260();
            } else if (field376 >= var0.field611) {
                var0.method530(field421);
                if (var0.field619) {
                    var0.method3260();
                } else {
                    Statics.field236.method1634(var0.field614, var0.field621, var0.field622, var0.field615, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ai.ae(B)I")
    public static final int method575() {
        if (Statics.field250.field140) {
            return Statics.field1762;
        }
        int var0 = 3;
        if (Statics.field1253 < 310) {
            int var1 = Statics.field200 >> 7;
            int var2 = Statics.field60 >> 7;
            int var3 = Statics.field578.field762 >> 7;
            int var4 = Statics.field578.field726 >> 7;
            if ((class6.field75[Statics.field1762][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1762;
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
                    if ((class6.field75[Statics.field1762][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1762;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field75[Statics.field1762][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1762;
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
                    if ((class6.field75[Statics.field1762][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1762;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field75[Statics.field1762][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1762;
                        }
                    }
                }
            }
        }
        if ((class6.field75[Statics.field1762][Statics.field578.field762 >> 7][Statics.field578.field726 >> 7] & 0x4) != 0) {
            var0 = Statics.field1762;
        }
        return var0;
    }

    @ObfuscatedName("ba.ak(I)I")
    public static final int method1610() {
        if (Statics.field250.field140) {
            return Statics.field1762;
        } else {
            int var0 = method2387(Statics.field200, Statics.field60, Statics.field1762);
            return var0 - Statics.field1252 >= 800 || (class6.field75[Statics.field1762][Statics.field200 >> 7][Statics.field60 >> 7] & 0x4) == 0 ? 3 : Statics.field1762;
        }
    }

    @ObfuscatedName("t.ao(Lar;IIIIIB)V")
    public static final void method149(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method12()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field692;
            if (var6.field800 != null) {
                var6 = var6.method614();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field279) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field51 != -1 || var8.field37 != -1) {
                method152(arg0, arg0.field774 + 15);
                if (field363 > -1) {
                    if (var8.field51 != -1) {
                        Statics.field715[var8.field51].method1435(field363 + arg2 - 12, field364 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field37 != -1) {
                        Statics.field1582[var8.field37].method1435(field363 + arg2 - 12, field364 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field385 == 10 && field278 == field260[arg1]) {
                method152(arg0, arg0.field774 + 15);
                if (field363 > -1) {
                    Statics.field1292[1].method1435(field363 + arg2 - 12, field364 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field692;
            if (var9.field800 != null) {
                var9 = var9.method614();
            }
            if (var9.field829 >= 0 && var9.field829 < Statics.field1582.length) {
                method152(arg0, arg0.field774 + 15);
                if (field363 > -1) {
                    Statics.field1582[var9.field829].method1435(field363 + arg2 - 12, field364 + arg3 - 30);
                }
            }
            if (field385 == 1 && field405 == field299[arg1 - field279] && field376 % 20 < 10) {
                method152(arg0, arg0.field774 + 15);
                if (field363 > -1) {
                    Statics.field1292[0].method1435(field363 + arg2 - 12, field364 + arg3 - 28);
                }
            }
        }
        if (arg0.field738 != null && (arg1 >= field279 || field396 == 4 || !arg0.field739 && (field396 == 0 || field396 == 3 || field396 == 1 && method2538(((class3) arg0).field46, false)))) {
            method152(arg0, arg0.field774);
            if (field363 > -1 && field438 < field352) {
                field356[field438] = Statics.field635.method3342(arg0.field738) / 2;
                field355[field438] = Statics.field635.field2898;
                field353[field438] = field363;
                field354[field438] = field364;
                field357[field438] = arg0.field737;
                field292[field438] = arg0.field742;
                field359[field438] = arg0.field748;
                field276[field438] = arg0.field738;
                field438++;
            }
        }
        if (arg0.field747 > field376) {
            method152(arg0, arg0.field774 + 15);
            if (field363 > -1) {
                int var10 = arg0.field725 * 30 / arg0.field749;
                if (var10 > 30) {
                    var10 = 30;
                } else if (var10 == 0 && arg0.field725 > 0) {
                    var10 = 1;
                }
                class73.method1523(field363 + arg2 - 15, field364 + arg3 - 3, var10, 5, 65280);
                class73.method1523(field363 + arg2 - 15 + var10, field364 + arg3 - 3, 30 - var10, 5, 16711680);
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            if (arg0.field746[var11] > field376) {
                method152(arg0, arg0.field774 / 2);
                if (field363 > -1) {
                    if (var11 == 1) {
                        field364 -= 20;
                    }
                    if (var11 == 2) {
                        field363 -= 15;
                        field364 -= 10;
                    }
                    if (var11 == 3) {
                        field363 += 15;
                        field364 -= 10;
                    }
                    Statics.field604[arg0.field743[var11]].method1435(field363 + arg2 - 12, field364 + arg3 - 12);
                    Statics.field90.method3310(Integer.toString(arg0.field744[var11]), field363 + arg2 - 1, field364 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ae.aq(IIIII)V")
    public static final void method787(int arg0, int arg1, int arg2, int arg3) {
        field438 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field298 + field279; var6++) {
            class33 var7;
            if (var6 == -1) {
                var7 = Statics.field578;
            } else if (var6 < field279) {
                var7 = field335[field260[var6]];
                if (field392 == field260[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field297[field299[var6 - field279]];
            }
            method149(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method149(field335[field392], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field438; var8++) {
            int var9 = field353[var8];
            int var10 = field354[var8];
            int var11 = field356[var8];
            int var12 = field355[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field354[var14] - field355[var14] && var10 - var12 < field354[var14] + 2 && var9 - var11 < field356[var14] + field353[var14] && var9 + var11 > field353[var14] - field356[var14] && field354[var14] - field355[var14] < var10) {
                        var10 = field354[var14] - field355[var14];
                        var13 = true;
                    }
                }
            }
            field363 = field353[var8];
            field364 = field354[var8] = var10;
            String var15 = field276[var8];
            if (field291 == 0) {
                int var16 = 16776960;
                if (field357[var8] < 6) {
                    var16 = field429[field357[var8]];
                }
                if (field357[var8] == 6) {
                    var16 = field362 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field357[var8] == 7) {
                    var16 = field362 % 20 < 10 ? 255 : 65535;
                }
                if (field357[var8] == 8) {
                    var16 = field362 % 20 < 10 ? 45056 : 8454016;
                }
                if (field357[var8] == 9) {
                    int var17 = 150 - field359[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field357[var8] == 10) {
                    int var18 = 150 - field359[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field357[var8] == 11) {
                    int var19 = 150 - field359[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field292[var8] == 0) {
                    Statics.field635.method3310(var15, field363 + arg0, field364 + arg1, var16, 0);
                }
                if (field292[var8] == 1) {
                    Statics.field635.method3312(var15, field363 + arg0, field364 + arg1, var16, 0, field362);
                }
                if (field292[var8] == 2) {
                    Statics.field635.method3383(var15, field363 + arg0, field364 + arg1, var16, 0, field362);
                }
                if (field292[var8] == 3) {
                    Statics.field635.method3314(var15, field363 + arg0, field364 + arg1, var16, 0, field362, 150 - field359[var8]);
                }
                if (field292[var8] == 4) {
                    int var20 = (150 - field359[var8]) * (Statics.field635.method3342(var15) + 100) / 150;
                    class73.method1550(field363 + arg0 - 50, arg1, field363 + arg0 + 50, arg1 + arg3);
                    Statics.field635.method3308(var15, field363 + arg0 + 50 - var20, field364 + arg1, var16, 0);
                    class73.method1559(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field292[var8] == 5) {
                    int var21 = 150 - field359[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class73.method1550(arg0, field364 + arg1 - Statics.field635.field2898 - 1, arg0 + arg2, field364 + arg1 + 5);
                    Statics.field635.method3310(var15, field363 + arg0, field364 + arg1 + var22, var16, 0);
                    class73.method1559(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field635.method3310(var15, field363 + arg0, field364 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("t.av(Lar;II)V")
    public static final void method152(class33 arg0, int arg1) {
        method533(arg0.field762, arg0.field726, arg1);
    }

    @ObfuscatedName("d.am(IIIB)V")
    public static final void method533(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field363 = -1;
            field364 = -1;
            return;
        }
        int var3 = method2387(arg0, arg1, Statics.field1762) - arg2;
        int var4 = arg0 - Statics.field200;
        int var5 = var3 - Statics.field1252;
        int var6 = arg1 - Statics.field60;
        int var7 = class84.field1470[Statics.field1253];
        int var8 = class84.field1484[Statics.field1253];
        int var9 = class84.field1470[Statics.field240];
        int var10 = class84.field1484[Statics.field240];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field363 = (var11 << 9) / var15 + 256;
            field364 = (var14 << 9) / var15 + 167;
        } else {
            field363 = -1;
            field364 = -1;
        }
    }

    @ObfuscatedName("dw.at(IIII)I")
    public static final int method2387(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field75[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field74[var5][var3][var4] + class6.field74[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field74[var5][var3][var4 + 1] + class6.field74[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("aa.an(IIIIIIB)V")
    public static final void method745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class84.field1470[var6];
            int var12 = class84.field1484[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class84.field1470[var7];
            int var15 = class84.field1484[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field200 = arg0 - var8;
        Statics.field1252 = arg1 - var9;
        Statics.field60 = arg2 - var10;
        Statics.field1253 = arg3;
        Statics.field240 = arg4;
    }

    @ObfuscatedName("client.ax(ZI)V")
    public static final void method474(boolean arg0) {
        field320 = arg0;
        if (!field320) {
            int var1 = field302.method2174();
            int var2 = field302.method2136();
            int var3 = field302.method2159();
            int var4 = field302.method2167();
            int var5 = field302.method2167();
            int var6 = (field303 - field302.field1845) / 16;
            Statics.field1678 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field1678[var7][var8] = field302.method2139();
                }
            }
            Statics.field2093 = new int[var6];
            Statics.field325 = new int[var6];
            Statics.field251 = new int[var6];
            Statics.field19 = new byte[var6][];
            Statics.field1516 = new byte[var6][];
            boolean var9 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var1 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var1 - 6) / 8; var11 <= (var1 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field2093[var10] = var13;
                        Statics.field325[var10] = Statics.field1493.method2719("m" + var11 + "_" + var12);
                        Statics.field251[var10] = Statics.field1493.method2719("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2398(var1, var2, var3, var5, var4);
            return;
        }
        int var14 = field302.method2167();
        int var15 = field302.method2167();
        int var16 = field302.method2157();
        field302.method2391();
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = field302.method2392(1);
                    if (var20 == 1) {
                        field415[var17][var18][var19] = field302.method2392(26);
                    } else {
                        field415[var17][var18][var19] = -1;
                    }
                }
            }
        }
        field302.method2406();
        int var21 = (field303 - field302.field1845) / 16;
        Statics.field1678 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                Statics.field1678[var22][var23] = field302.method2175();
            }
        }
        int var24 = field302.method2167();
        int var25 = field302.method2174();
        Statics.field2093 = new int[var21];
        Statics.field325 = new int[var21];
        Statics.field251 = new int[var21];
        Statics.field19 = new byte[var21][];
        Statics.field1516 = new byte[var21][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field415[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2093[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2093[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field325[var26] = Statics.field1493.method2719("m" + var35 + "_" + var36);
                            Statics.field251[var26] = Statics.field1493.method2719("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2398(var25, var15, var16, var24, var14);
    }

    @ObfuscatedName("dw.ah(IIIIII)V")
    public static final void method2398(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1643 == arg0 && Statics.field999 == arg1 && field312 == arg2 || !field264) {
            return;
        }
        Statics.field1643 = arg0;
        Statics.field999 = arg1;
        field312 = arg2;
        if (!field264) {
            field312 = 0;
        }
        method1617(25);
        Statics.method2576(class142.field2361, true);
        int var5 = Statics.field982;
        int var6 = Statics.field169;
        Statics.field982 = (arg0 - 6) * 8;
        Statics.field169 = (arg1 - 6) * 8;
        int var7 = Statics.field982 - var5;
        int var8 = Statics.field169 - var6;
        int var9 = Statics.field982;
        int var10 = Statics.field169;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field297[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field779[var13] -= var7;
                    var12.field780[var13] -= var8;
                }
                var12.field762 -= var7 * 128;
                var12.field726 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field335[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field779[var16] -= var7;
                    var15.field780[var16] -= var8;
                }
                var15.field762 -= var7 * 128;
                var15.field726 -= var8 * 128;
            }
        }
        Statics.field1762 = arg2;
        Statics.field578.method587(arg3, arg4, false);
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
                        field393[var27][var23][var24] = field393[var27][var25][var26];
                    } else {
                        field393[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field394.method3185(); var28 != null; var28 = (class15) field394.method3187()) {
            var28.field212 -= var7;
            var28.field218 -= var8;
            if (var28.field212 < 0 || var28.field218 < 0 || var28.field212 >= 104 || var28.field218 >= 104) {
                var28.method3260();
            }
        }
        if (field377 != 0) {
            field377 -= var7;
            field489 -= var8;
        }
        field496 = 0;
        field340 = false;
        field347 = -1;
        field468.method3179();
        field395.method3179();
    }

    @ObfuscatedName("l.ad(ZB)V")
    public static final void method123(boolean arg0) {
        method546();
        field306++;
        if (field306 < 50 && !arg0) {
            return;
        }
        field306 = 0;
        if (field311 || Statics.field689 == null) {
            return;
        }
        field300.method2389(182);
        try {
            Statics.field689.method2584(field300.field1844, 0, field300.field1845);
            field300.field1845 = 0;
        } catch (IOException var2) {
            field311 = true;
        }
    }

    @ObfuscatedName("ep.bs(IS)V")
    public static final void method2679(int arg0) {
        int[] var1 = Statics.field191.field1301;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field75[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field236.method1676(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field75[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field236.method1676(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field191.method1425();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field75[arg0][var10][var9] & 0x18) == 0) {
                    method163(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field75[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method163(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field484 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field236.method1652(Statics.field1762, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class36.method28(var14).field861;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field301[Statics.field1762].field2932;
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
                        field487[field484] = Statics.field28[var15];
                        field485[field484] = var16;
                        field486[field484] = var17;
                        field484++;
                    }
                }
            }
        }
        Statics.field678.method1420();
    }

    @ObfuscatedName("c.bj(IIIIII)V")
    public static final void method163(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field236.method1689(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field236.method1755(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field191.field1301;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method28(var12);
            if (var13.field871 == -1) {
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
                class74 var14 = Statics.field1905[var13.field871];
                if (var14 != null) {
                    int var15 = (var13.field879 * 4 - var14.field1312) / 2;
                    int var16 = (var13.field873 * 4 - var14.field1315) / 2;
                    var14.method1584(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field873) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field236.method1651(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field236.method1755(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method28(var21);
            if (var22.field871 != -1) {
                class74 var23 = Statics.field1905[var22.field871];
                if (var23 != null) {
                    int var24 = (var22.field879 * 4 - var23.field1312) / 2;
                    int var25 = (var22.field873 * 4 - var23.field1315) / 2;
                    var23.method1584(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field873) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field191.field1301;
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
        int var29 = Statics.field236.method1652(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method28(var30);
        if (var31.field871 == -1) {
            return;
        }
        class74 var32 = Statics.field1905[var31.field871];
        if (var32 != null) {
            int var33 = (var31.field879 * 4 - var32.field1312) / 2;
            int var34 = (var31.field873 * 4 - var32.field1315) / 2;
            var32.method1584(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field873) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("q.bq(I)Z")
    public static final boolean method129() {
        if (Statics.field689 == null) {
            return false;
        }
        try {
            int var0 = Statics.field689.method2585();
            if (var0 == 0) {
                return false;
            }
            if (field304 == -1) {
                Statics.field689.method2586(field302.field1844, 0, 1);
                field302.field1845 = 0;
                field304 = field302.method2390();
                field303 = class166.field2801[field304];
                var0--;
            }
            if (field303 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field689.method2586(field302.field1844, 0, 1);
                field303 = field302.field1844[0] & 0xFF;
                var0--;
            }
            if (field303 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field689.method2586(field302.field1844, 0, 2);
                field302.field1845 = 0;
                field303 = field302.method2136();
                var0 -= 2;
            }
            if (var0 < field303) {
                return false;
            }
            field302.field1845 = 0;
            Statics.field689.method2586(field302.field1844, 0, field303);
            field498 = 0;
            field476 = field349;
            field349 = field322;
            field322 = field304;
            if (field304 == 246) {
                field490 = field302.method2134();
                field304 = -1;
                return true;
            }
            if (field304 == 251) {
                int var1 = field303 + field302.field1845;
                int var2 = field302.method2136();
                int var3 = field302.method2136();
                if (field419 != var2) {
                    field419 = var2;
                    method253(field419);
                    class32.method896(field419);
                    for (int var4 = 0; var4 < 100; var4++) {
                        field464[var4] = true;
                    }
                }
                while (var3-- > 0) {
                    int var5 = field302.method2139();
                    int var6 = field302.method2136();
                    int var7 = field302.method2134();
                    class4 var8 = (class4) field420.method3157((long) var5);
                    if (var8 != null && var8.field54 != var6) {
                        method93(var8, true);
                        var8 = null;
                    }
                    if (var8 == null) {
                        var8 = method112(var5, var6, var7);
                    }
                    var8.field56 = true;
                }
                for (class4 var9 = (class4) field420.method3150(); var9 != null; var9 = (class4) field420.method3151()) {
                    if (var9.field56) {
                        var9.field56 = false;
                    } else {
                        method93(var9, true);
                    }
                }
                field461 = new class174(512);
                while (field302.field1845 < var1) {
                    int var10 = field302.method2139();
                    int var11 = field302.method2136();
                    int var12 = field302.method2136();
                    int var13 = field302.method2139();
                    for (int var14 = var11; var14 <= var12; var14++) {
                        long var15 = ((long) var10 << 32) + (long) var14;
                        field461.method3147(new class179(var13), var15);
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 147) {
                if (field419 != -1) {
                    int var17 = field419;
                    if (class152.method139(var17)) {
                        method14(Statics.field2628[var17], 0);
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 133) {
                method1789();
                field425 = field302.method2153();
                field351 = field443;
                field304 = -1;
                return true;
            }
            if (field304 == 72) {
                int var18 = field302.method2147();
                boolean var19 = field302.method2134() == 1;
                String var20 = "";
                boolean var21 = false;
                if (var19) {
                    var20 = field302.method2339();
                    if (method25(var20)) {
                        var21 = true;
                    }
                }
                String var22 = field302.method2339();
                if (!var21) {
                    class10.method88(var18, var20, var22);
                }
                field304 = -1;
                return true;
            }
            if (field304 == 213) {
                method474(false);
                field304 = -1;
                return true;
            }
            if (field304 == 117) {
                int var23 = field302.method2174();
                class14 var24 = (class14) class14.field203.method3157((long) var23);
                if (var24 != null) {
                    var24.method3260();
                }
                field447[++field448 - 1 & 0x1F] = var23 & 0x7FFF;
                field304 = -1;
                return true;
            }
            if (field304 == 64) {
                int var25 = field302.method2212();
                if (var25 == 65535) {
                    var25 = -1;
                }
                method1886(var25);
                field304 = -1;
                return true;
            }
            if (field304 == 217) {
                int var26 = field302.method2167();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = field302.method2138();
                method2825(var26, var27);
                field304 = -1;
                return true;
            }
            if (field304 == 168) {
                field302.field1845 += 28;
                if (field302.method2177()) {
                    class110 var28 = field302;
                    int var29 = field302.field1845 - 28;
                    if (class136.field2088 != null) {
                        try {
                            class136.field2088.method3414(0L);
                            class136.field2088.method3419(var28.field1844, var29, 24);
                        } catch (Exception var282) {
                        }
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 245) {
                int var31 = field302.method2170();
                int var32 = field302.method2175();
                int var33 = field302.method2169();
                class152 var34 = Statics.method159(var32);
                int var35 = var34.field2537 + var33;
                int var36 = var34.field2538 + var31;
                if (var34.field2535 != var35 || var34.field2536 != var36) {
                    var34.field2535 = var35;
                    var34.field2536 = var36;
                    method535(var34);
                }
                field304 = -1;
                return true;
            }
            if (field304 == 211) {
                String var37 = field302.method2339();
                int var38 = field302.method2175();
                class152 var39 = Statics.method159(var38);
                if (!var37.equals(var39.field2625)) {
                    var39.field2625 = var37;
                    method535(var39);
                }
                field304 = -1;
                return true;
            }
            if (field304 == 244) {
                byte var40 = field302.method2160();
                int var41 = field302.method2167();
                class154.field2656[var41] = var40;
                if (class154.field2657[var41] != var40) {
                    class154.field2657[var41] = var40;
                    method3433(var41);
                }
                field445[++field426 - 1 & 0x1F] = var41;
                field304 = -1;
                return true;
            }
            if (field304 == 110) {
                int var42 = field302.method2235();
                int var43 = field302.method2174();
                int var44 = var43 >> 10 & 0x1F;
                int var45 = var43 >> 5 & 0x1F;
                int var46 = var43 & 0x1F;
                int var47 = (var46 << 3) + (var44 << 19) + (var45 << 11);
                class152 var48 = Statics.method159(var42);
                if (var48.field2547 != var47) {
                    var48.field2547 = var47;
                    method535(var48);
                }
                field304 = -1;
                return true;
            }
            if (field304 == 196) {
                int var49 = field302.method2139();
                class152 var50 = Statics.method159(var49);
                for (int var51 = 0; var51 < var50.field2563.length; var51++) {
                    var50.field2563[var51] = -1;
                    var50.field2563[var51] = 0;
                }
                method535(var50);
                field304 = -1;
                return true;
            }
            if (field304 == 98) {
                int var52 = field302.method2167();
                int var53 = field302.method2235();
                class152 var54 = Statics.method159(var53);
                if (var54.field2588 != 2 || var54.field2642 != var52) {
                    var54.field2588 = 2;
                    var54.field2642 = var52;
                    method535(var54);
                }
                field304 = -1;
                return true;
            }
            if (field304 == 161) {
                int var55 = field302.method2134();
                int var56 = field302.method2134();
                int var57 = field302.method2134();
                int var58 = field302.method2134();
                field503[var55] = true;
                field432[var55] = var56;
                field505[var55] = var57;
                field492[var55] = var58;
                field507[var55] = 0;
                field304 = -1;
                return true;
            }
            if (field304 == 183) {
                int var59 = field302.method2235();
                Statics.field98 = Statics.field1761.method2494(var59);
                field304 = -1;
                return true;
            }
            if (field304 == 74) {
                field396 = field302.method2134();
                field474 = field302.method2134();
                field304 = -1;
                return true;
            }
            if (field304 == 101 || field304 == 48 || field304 == 180 || field304 == 94 || field304 == 154 || field304 == 79 || field304 == 23 || field304 == 33 || field304 == 159 || field304 == 148) {
                method606();
                field304 = -1;
                return true;
            }
            if (field304 == 66) {
                int var60 = field302.method2212();
                field419 = var60;
                method253(var60);
                class32.method896(field419);
                for (int var61 = 0; var61 < 100; var61++) {
                    field464[var61] = true;
                }
                field304 = -1;
                return true;
            }
            if (field304 == 4) {
                method1789();
                int var62 = field302.method2159();
                int var63 = field302.method2134();
                int var64 = field302.method2235();
                field399[var62] = var64;
                field397[var62] = var63;
                field398[var62] = 1;
                for (int var65 = 0; var65 < 98; var65++) {
                    if (var64 >= class140.field2135[var65]) {
                        field398[var62] = var65 + 2;
                    }
                }
                field434[++field345 - 1 & 0x1F] = var62;
                field304 = -1;
                return true;
            }
            if (field304 == 237) {
                for (int var66 = 0; var66 < field335.length; var66++) {
                    if (field335[var66] != null) {
                        field335[var66].field756 = -1;
                    }
                }
                for (int var67 = 0; var67 < field297.length; var67++) {
                    if (field297[var67] != null) {
                        field297[var67].field756 = -1;
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 10) {
                String var68 = field302.method2339();
                String var69 = class190.method3300(class197.method881(class189.method3288(field302)));
                class10.method88(6, var68, var69);
                field304 = -1;
                return true;
            }
            if (field304 == 212) {
                while (field302.field1845 < field303) {
                    int var70 = field302.method2134();
                    boolean var71 = (var70 & 0x1) == 1;
                    String var72 = field302.method2339();
                    String var73 = field302.method2339();
                    field302.method2339();
                    for (int var74 = 0; var74 < field512; var74++) {
                        class8 var75 = field513[var74];
                        if (var71) {
                            if (var73.equals(var75.field129)) {
                                var75.field129 = var72;
                                var75.field130 = var73;
                                var72 = null;
                                break;
                            }
                        } else if (var72.equals(var75.field129)) {
                            var75.field129 = var72;
                            var75.field130 = var73;
                            var72 = null;
                            break;
                        }
                    }
                    if (var72 != null && field512 < 400) {
                        class8 var76 = new class8();
                        field513[field512] = var76;
                        var76.field129 = var72;
                        var76.field130 = var73;
                        field512++;
                    }
                }
                field452 = field443;
                field304 = -1;
                return true;
            }
            if (field304 == 43) {
                method729();
                field304 = -1;
                return false;
            }
            if (field304 == 167) {
                method474(true);
                field304 = -1;
                return true;
            }
            if (field304 == 192) {
                int var77 = field302.method2139();
                int var78 = field302.method2139();
                int var79 = field302.method2212();
                if (var79 == 65535) {
                    var79 = -1;
                }
                int var80 = field302.method2212();
                if (var80 == 65535) {
                    var80 = -1;
                }
                for (int var81 = var80; var81 <= var79; var81++) {
                    long var82 = ((long) var78 << 32) + (long) var81;
                    class184 var84 = field461.method3157(var82);
                    if (var84 != null) {
                        var84.method3260();
                    }
                    field461.method3147(new class179(var77), var82);
                }
                field304 = -1;
                return true;
            }
            if (field304 == 28) {
                int var85 = field302.method2176();
                int var86 = field302.method2205();
                class152 var87 = Statics.method159(var85);
                if (var87.field2566 != var86 || var86 == -1) {
                    var87.field2566 = var86;
                    var87.field2532 = 0;
                    var87.field2604 = 0;
                    method535(var87);
                }
                field304 = -1;
                return true;
            }
            if (field304 == 29) {
                String var88 = field302.method2339();
                long var89 = (long) field302.method2136();
                long var91 = (long) field302.method2138();
                int var93 = field302.method2134();
                long var94 = (var89 << 32) + var91;
                boolean var96 = false;
                for (int var97 = 0; var97 < 100; var97++) {
                    if (field475[var97] == var94) {
                        var96 = true;
                        break;
                    }
                }
                if (method25(var88)) {
                    var96 = true;
                }
                if (!var96 && field472 == 0) {
                    field475[field288] = var94;
                    field288 = (field288 + 1) % 100;
                    String var98 = class190.method3300(class197.method881(class189.method3288(field302)));
                    if (var93 == 2 || var93 == 3) {
                        class10.method88(7, class2.method3107(1) + var88, var98);
                    } else if (var93 == 1) {
                        class10.method88(7, class2.method3107(0) + var88, var98);
                    } else {
                        class10.method88(3, var88, var98);
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 116) {
                int var99 = field302.method2134();
                class117[] var100 = new class117[] { class117.field1914, class117.field1909, class117.field1908 };
                class117[] var101 = var100;
                int var102 = 0;
                class117 var104;
                while (true) {
                    if (var102 >= var101.length) {
                        var104 = null;
                        break;
                    }
                    class117 var103 = var101[var102];
                    if (var103.field1911 == var99) {
                        var104 = var103;
                        break;
                    }
                    var102++;
                }
                Statics.field2516 = var104;
                field304 = -1;
                return true;
            }
            if (field304 == 218) {
                int var105 = field302.method2139();
                int var106 = field302.method2136();
                if (var105 < -70000) {
                    var106 += 32768;
                }
                class152 var107;
                if (var105 >= 0) {
                    var107 = Statics.method159(var105);
                } else {
                    var107 = null;
                }
                while (field302.field1845 < field303) {
                    int var108 = field302.method2147();
                    int var109 = field302.method2136();
                    int var110 = 0;
                    if (var109 != 0) {
                        var110 = field302.method2134();
                        if (var110 == 255) {
                            var110 = field302.method2139();
                        }
                    }
                    if (var107 != null && var108 >= 0 && var108 < var107.field2563.length) {
                        var107.field2563[var108] = var109;
                        var107.field2601[var108] = var110;
                    }
                    class14.method122(var106, var108, var109 - 1, var110);
                }
                if (var107 != null) {
                    method535(var107);
                }
                method1789();
                field447[++field448 - 1 & 0x1F] = var106 & 0x7FFF;
                field304 = -1;
                return true;
            }
            if (field304 == 11) {
                String var111 = field302.method2339();
                long var112 = field302.method2227();
                long var114 = (long) field302.method2136();
                long var116 = (long) field302.method2138();
                int var118 = field302.method2134();
                long var119 = (var114 << 32) + var116;
                boolean var121 = false;
                for (int var122 = 0; var122 < 100; var122++) {
                    if (field475[var122] == var119) {
                        var121 = true;
                        break;
                    }
                }
                if (var118 <= 1 && method25(var111)) {
                    var121 = true;
                }
                if (!var121 && field472 == 0) {
                    field475[field288] = var119;
                    field288 = (field288 + 1) % 100;
                    String var123 = class190.method3300(class197.method881(class189.method3288(field302)));
                    if (var118 == 2 || var118 == 3) {
                        class10.method2862(9, class2.method3107(1) + var111, var123, class196.method3439(var112));
                    } else if (var118 == 1) {
                        class10.method2862(9, class2.method3107(0) + var111, var123, class196.method3439(var112));
                    } else {
                        class10.method2862(9, var111, var123, class196.method3439(var112));
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 176) {
                int var124 = field302.method2139();
                class4 var125 = (class4) field420.method3157((long) var124);
                if (var125 != null) {
                    method93(var125, true);
                }
                if (field423 != null) {
                    method535(field423);
                    field423 = null;
                }
                field304 = -1;
                return true;
            }
            if (field304 == 235) {
                field377 = field302.method2134();
                if (field377 == 255) {
                    field377 = 0;
                }
                field489 = field302.method2134();
                if (field489 == 255) {
                    field489 = 0;
                }
                field304 = -1;
                return true;
            }
            if (field304 == 58) {
                field488 = 1;
                field452 = field443;
                field304 = -1;
                return true;
            }
            if (field304 == 253) {
                field340 = true;
                Statics.field177 = field302.method2134();
                Statics.field164 = field302.method2134();
                Statics.field2106 = field302.method2136();
                Statics.field949 = field302.method2134();
                Statics.field206 = field302.method2134();
                if (Statics.field206 >= 100) {
                    int var126 = Statics.field177 * 128 + 64;
                    int var127 = Statics.field164 * 128 + 64;
                    int var128 = method2387(var126, var127, Statics.field1762) - Statics.field2106;
                    int var129 = var126 - Statics.field200;
                    int var130 = var128 - Statics.field1252;
                    int var131 = var127 - Statics.field60;
                    int var132 = (int) Math.sqrt((double) (var129 * var129 + var131 * var131));
                    Statics.field1253 = (int) (Math.atan2((double) var130, (double) var132) * 325.949D) & 0x7FF;
                    Statics.field240 = (int) (Math.atan2((double) var129, (double) var131) * -325.949D) & 0x7FF;
                    if (Statics.field1253 < 128) {
                        Statics.field1253 = 128;
                    }
                    if (Statics.field1253 > 383) {
                        Statics.field1253 = 383;
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 189) {
                field386 = 0;
                field381 = 0;
                field302.method2391();
                int var133 = field302.method2392(1);
                if (var133 != 0) {
                    int var134 = field302.method2392(2);
                    if (var134 == 0) {
                        field382[++field381 - 1] = 2047;
                    } else if (var134 == 1) {
                        int var135 = field302.method2392(3);
                        Statics.field578.method588(var135, false);
                        int var136 = field302.method2392(1);
                        if (var136 == 1) {
                            field382[++field381 - 1] = 2047;
                        }
                    } else if (var134 == 2) {
                        int var137 = field302.method2392(3);
                        Statics.field578.method588(var137, true);
                        int var138 = field302.method2392(3);
                        Statics.field578.method588(var138, true);
                        int var139 = field302.method2392(1);
                        if (var139 == 1) {
                            field382[++field381 - 1] = 2047;
                        }
                    } else if (var134 == 3) {
                        int var140 = field302.method2392(7);
                        int var141 = field302.method2392(1);
                        Statics.field1762 = field302.method2392(2);
                        int var142 = field302.method2392(1);
                        if (var142 == 1) {
                            field382[++field381 - 1] = 2047;
                        }
                        int var143 = field302.method2392(7);
                        Statics.field578.method587(var140, var143, var141 == 1);
                    }
                }
                method89();
                method137();
                for (int var144 = 0; var144 < field381; var144++) {
                    int var145 = field382[var144];
                    class3 var146 = field335[var145];
                    int var147 = field302.method2134();
                    if ((var147 & 0x1) != 0) {
                        var147 += field302.method2134() << 8;
                    }
                    method2682(var145, var146, var147);
                }
                for (int var148 = 0; var148 < field386; var148++) {
                    int var149 = field387[var148];
                    if (field376 != field335[var149].field773) {
                        field335[var149] = null;
                    }
                }
                if (field303 != field302.field1845) {
                    throw new RuntimeException(field302.field1845 + class2.field20 + field303);
                }
                for (int var150 = 0; var150 < field279; var150++) {
                    if (field335[field260[var150]] == null) {
                        throw new RuntimeException(var150 + class2.field20 + field279);
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 80) {
                field340 = true;
                Statics.field1887 = field302.method2134();
                Statics.field694 = field302.method2134();
                Statics.field519 = field302.method2136();
                Statics.field1448 = field302.method2134();
                Statics.field693 = field302.method2134();
                if (Statics.field693 >= 100) {
                    Statics.field200 = Statics.field1887 * 128 + 64;
                    Statics.field60 = Statics.field694 * 128 + 64;
                    Statics.field1252 = method2387(Statics.field200, Statics.field60, Statics.field1762) - Statics.field519;
                }
                field304 = -1;
                return true;
            }
            if (field304 == 171) {
                field321 = field443;
                if (field303 == 0) {
                    field427 = null;
                    field482 = null;
                    Statics.field2029 = 0;
                    Statics.field1452 = null;
                    field304 = -1;
                    return true;
                }
                field482 = field302.method2339();
                long var151 = field302.method2227();
                field427 = Statics.method496(var151);
                Statics.field53 = field302.method2135();
                int var153 = field302.method2134();
                if (var153 == 255) {
                    field304 = -1;
                    return true;
                }
                Statics.field2029 = var153;
                class21[] var154 = new class21[100];
                for (int var155 = 0; var155 < Statics.field2029; var155++) {
                    var154[var155] = new class21();
                    var154[var155].field567 = field302.method2339();
                    var154[var155].field560 = class198.method1884(var154[var155].field567, Statics.field1847);
                    var154[var155].field561 = field302.method2136();
                    var154[var155].field562 = field302.method2135();
                    field302.method2339();
                    if (var154[var155].field567.equals(Statics.field578.field46)) {
                        Statics.field154 = var154[var155].field562;
                    }
                }
                boolean var156 = false;
                int var157 = Statics.field2029;
                while (var157 > 0) {
                    boolean var158 = true;
                    var157--;
                    for (int var159 = 0; var159 < var157; var159++) {
                        if (var154[var159].field560.compareTo(var154[var159 + 1].field560) > 0) {
                            class21 var160 = var154[var159];
                            var154[var159] = var154[var159 + 1];
                            var154[var159 + 1] = var160;
                            var158 = false;
                        }
                    }
                    if (var158) {
                        break;
                    }
                }
                Statics.field1452 = var154;
                field304 = -1;
                return true;
            }
            if (field304 == 226) {
                int var161 = field302.method2235();
                class152 var162 = Statics.method159(var161);
                var162.field2588 = 3;
                var162.field2642 = Statics.field578.field34.method2891();
                method535(var162);
                field304 = -1;
                return true;
            }
            if (field304 == 93) {
                for (int var163 = 0; var163 < Statics.field1066; var163++) {
                    class46 var164 = class46.method498(var163);
                    if (var164 != null) {
                        class154.field2656[var163] = 0;
                        class154.field2657[var163] = 0;
                    }
                }
                method1789();
                field426 += 32;
                field304 = -1;
                return true;
            }
            if (field304 == 129) {
                int var165 = field302.method2174();
                int var166 = field302.method2235();
                int var167 = field302.method2167();
                int var168 = field302.method2174();
                class152 var169 = Statics.method159(var166);
                if (var169.field2570 != var167 || var169.field2607 != var168 || var169.field2620 != var165) {
                    var169.field2570 = var167;
                    var169.field2607 = var168;
                    var169.field2620 = var165;
                    method535(var169);
                }
                field304 = -1;
                return true;
            }
            if (field304 == 120) {
                int var170 = field302.method2136();
                int var171 = field302.method2134();
                int var172 = field302.method2136();
                method157(var170, var171, var172);
                field304 = -1;
                return true;
            }
            if (field304 == 187) {
                String var173 = field302.method2339();
                Object[] var174 = new Object[var173.length() + 1];
                for (int var175 = var173.length() - 1; var175 >= 0; var175--) {
                    if (var173.charAt(var175) == 's') {
                        var174[var175 + 1] = field302.method2339();
                    } else {
                        var174[var175 + 1] = Integer.valueOf(field302.method2139());
                    }
                }
                var174[0] = Integer.valueOf(field302.method2139());
                class1 var176 = new class1();
                var176.field15 = var174;
                class32.method487(var176);
                field304 = -1;
                return true;
            }
            if (field304 == 227) {
                int var177 = field302.method2167();
                if (var177 == 65535) {
                    var177 = -1;
                }
                int var178 = field302.method2235();
                int var179 = field302.method2235();
                class152 var180 = Statics.method159(var178);
                if (var180.field2529) {
                    var180.field2634 = var177;
                    var180.field2635 = var179;
                    class45 var182 = class45.method2057(var177);
                    var180.field2570 = var182.field1013;
                    var180.field2607 = var182.field1026;
                    var180.field2608 = var182.field1044;
                    var180.field2568 = var182.field1028;
                    var180.field2569 = var182.field1029;
                    var180.field2620 = var182.field1024;
                    if (var180.field2575 > 0) {
                        var180.field2620 = var180.field2620 * 32 / var180.field2575;
                    }
                    method535(var180);
                } else if (var177 == -1) {
                    var180.field2588 = 0;
                    field304 = -1;
                    return true;
                } else {
                    class45 var181 = class45.method2057(var177);
                    var180.field2588 = 4;
                    var180.field2642 = var177;
                    var180.field2570 = var181.field1013;
                    var180.field2607 = var181.field1026;
                    var180.field2620 = var181.field1024 * 100 / var179;
                    method535(var180);
                }
                field304 = -1;
                return true;
            }
            if (field304 == 152) {
                field385 = field302.method2134();
                if (field385 == 1) {
                    field405 = field302.method2136();
                }
                if (field385 >= 2 && field385 <= 6) {
                    if (field385 == 2) {
                        field282 = 64;
                        field283 = 64;
                    }
                    if (field385 == 3) {
                        field282 = 0;
                        field283 = 64;
                    }
                    if (field385 == 4) {
                        field282 = 128;
                        field283 = 64;
                    }
                    if (field385 == 5) {
                        field282 = 64;
                        field283 = 0;
                    }
                    if (field385 == 6) {
                        field282 = 64;
                        field283 = 128;
                    }
                    field385 = 2;
                    field462 = field302.method2136();
                    field295 = field302.method2136();
                    field281 = field302.method2134();
                }
                if (field385 == 10) {
                    field278 = field302.method2136();
                }
                field304 = -1;
                return true;
            }
            if (field304 == 214) {
                Statics.field527 = field302.method2159();
                Statics.field702 = field302.method2134();
                while (field302.field1845 < field303) {
                    field304 = field302.method2134();
                    method606();
                }
                field304 = -1;
                return true;
            }
            if (field304 == 75) {
                field275 = field302.method2136() * 30;
                field351 = field443;
                field304 = -1;
                return true;
            }
            if (field304 == 68) {
                boolean var183 = field302.method2159() == 1;
                int var184 = field302.method2176();
                class152 var185 = Statics.method159(var184);
                if (var185.field2542 != var183) {
                    var185.field2542 = var183;
                    method535(var185);
                }
                field304 = -1;
                return true;
            }
            if (field304 == 31) {
                for (int var186 = 0; var186 < class154.field2657.length; var186++) {
                    if (class154.field2657[var186] != class154.field2656[var186]) {
                        class154.field2657[var186] = class154.field2656[var186];
                        method3433(var186);
                        field445[++field426 - 1 & 0x1F] = var186;
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 95) {
                int var187 = field302.method2167();
                int var188 = field302.method2176();
                class152 var189 = Statics.method159(var188);
                if (var189 != null && var189.field2580 == 0) {
                    if (var187 > var189.field2546 - var189.field2540) {
                        var187 = var189.field2546 - var189.field2540;
                    }
                    if (var187 < 0) {
                        var187 = 0;
                    }
                    if (var189.field2544 != var187) {
                        var189.field2544 = var187;
                        method535(var189);
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 249) {
                String var190 = field302.method2339();
                int var191 = field302.method2136();
                byte var192 = field302.method2135();
                boolean var193 = false;
                if (var192 == -128) {
                    var193 = true;
                }
                if (var193) {
                    if (Statics.field2029 == 0) {
                        field304 = -1;
                        return true;
                    }
                    boolean var194 = false;
                    int var195;
                    for (var195 = 0; var195 < Statics.field2029 && (!Statics.field1452[var195].field567.equals(var190) || Statics.field1452[var195].field561 != var191); var195++) {
                    }
                    if (var195 < Statics.field2029) {
                        while (var195 < Statics.field2029 - 1) {
                            Statics.field1452[var195] = Statics.field1452[var195 + 1];
                            var195++;
                        }
                        Statics.field2029--;
                        Statics.field1452[Statics.field2029] = null;
                    }
                } else {
                    field302.method2339();
                    class21 var196 = new class21();
                    var196.field567 = var190;
                    var196.field560 = class198.method1884(var196.field567, Statics.field1847);
                    var196.field561 = var191;
                    var196.field562 = var192;
                    int var197;
                    for (var197 = Statics.field2029 - 1; var197 >= 0; var197--) {
                        int var198 = Statics.field1452[var197].field560.compareTo(var196.field567);
                        if (var198 == 0) {
                            Statics.field1452[var197].field561 = var191;
                            Statics.field1452[var197].field562 = var192;
                            if (var190.equals(Statics.field578.field46)) {
                                Statics.field154 = var192;
                            }
                            field321 = field443;
                            field304 = -1;
                            return true;
                        }
                        if (var198 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2029 >= Statics.field1452.length) {
                        field304 = -1;
                        return true;
                    }
                    for (int var199 = Statics.field2029 - 1; var199 > var197; var199--) {
                        Statics.field1452[var199 + 1] = Statics.field1452[var199];
                    }
                    if (Statics.field2029 == 0) {
                        Statics.field1452 = new class21[100];
                    }
                    Statics.field1452[var197 + 1] = var196;
                    Statics.field2029++;
                    if (var190.equals(Statics.field578.field46)) {
                        Statics.field154 = var192;
                    }
                }
                field321 = field443;
                field304 = -1;
                return true;
            }
            if (field304 == 5) {
                int var200 = field302.method2157();
                int var201 = field302.method2157();
                int var202 = field302.method2158();
                Statics.field1762 = var202 >> 1;
                Statics.field578.method587(var200, var201, (var202 & 0x1) == 1);
                field304 = -1;
                return true;
            }
            if (field304 == 105) {
                int var203 = field302.method2159();
                int var204 = field302.method2139();
                int var205 = field302.method2174();
                class4 var206 = (class4) field420.method3157((long) var204);
                if (var206 != null) {
                    method93(var206, var206.field54 != var205);
                }
                method112(var204, var205, var203);
                field304 = -1;
                return true;
            }
            if (field304 == 206) {
                int var207 = field302.method2235();
                int var208 = field302.method2174();
                class152 var209 = Statics.method159(var207);
                if (var209.field2588 != 1 || var209.field2642 != var208) {
                    var209.field2588 = 1;
                    var209.field2642 = var208;
                    method535(var209);
                }
                field304 = -1;
                return true;
            }
            if (field304 == 155) {
                int var210 = field302.method2176();
                int var211 = field302.method2136();
                int var212 = field302.method2136();
                class152 var213 = Statics.method159(var210);
                var213.field2574 = (var211 << 16) + var212;
                field304 = -1;
                return true;
            }
            if (field304 == 243) {
                Statics.field527 = field302.method2157();
                Statics.field702 = field302.method2159();
                for (int var214 = Statics.field527; var214 < Statics.field527 + 8; var214++) {
                    for (int var215 = Statics.field702; var215 < Statics.field702 + 8; var215++) {
                        if (field393[Statics.field1762][var214][var215] != null) {
                            field393[Statics.field1762][var214][var215] = null;
                            method834(var214, var215);
                        }
                    }
                }
                for (class15 var216 = (class15) field394.method3185(); var216 != null; var216 = (class15) field394.method3187()) {
                    if (var216.field212 >= Statics.field527 && var216.field212 < Statics.field527 + 8 && var216.field218 >= Statics.field702 && var216.field218 < Statics.field702 + 8 && Statics.field1762 == var216.field214) {
                        var216.field213 = 0;
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 91) {
                while (field302.field1845 < field303) {
                    boolean var217 = field302.method2134() == 1;
                    String var218 = field302.method2339();
                    String var219 = field302.method2339();
                    int var220 = field302.method2136();
                    int var221 = field302.method2134();
                    int var222 = field302.method2134();
                    boolean var223 = (var222 & 0x2) != 0;
                    boolean var224 = (var222 & 0x1) != 0;
                    if (var220 > 0) {
                        field302.method2339();
                        field302.method2134();
                        field302.method2139();
                    }
                    field302.method2339();
                    for (int var225 = 0; var225 < field508; var225++) {
                        class16 var226 = field510[var225];
                        if (var217) {
                            if (var219.equals(var226.field232)) {
                                var226.field232 = var218;
                                var226.field227 = var219;
                                var218 = null;
                                break;
                            }
                        } else if (var218.equals(var226.field232)) {
                            if (var226.field228 != var220) {
                                boolean var227 = true;
                                for (class34 var228 = (class34) field511.method3143(); var228 != null; var228 = (class34) field511.method3141()) {
                                    if (var228.field785.equals(var218)) {
                                        if (var220 != 0 && var228.field787 == 0) {
                                            var228.method3255();
                                            var227 = false;
                                        } else if (var220 == 0 && var228.field787 != 0) {
                                            var228.method3255();
                                            var227 = false;
                                        }
                                    }
                                }
                                if (var227) {
                                    field511.method3140(new class34(var218, var220));
                                }
                                var226.field228 = var220;
                            }
                            var226.field227 = var219;
                            var226.field229 = var221;
                            var226.field233 = var223;
                            var226.field231 = var224;
                            var218 = null;
                            break;
                        }
                    }
                    if (var218 != null && field508 < 400) {
                        class16 var229 = new class16();
                        field510[field508] = var229;
                        var229.field232 = var218;
                        var229.field227 = var219;
                        var229.field228 = var220;
                        var229.field229 = var221;
                        var229.field233 = var223;
                        var229.field231 = var224;
                        field508++;
                    }
                }
                field488 = 2;
                field452 = field443;
                boolean var230 = false;
                int var231 = field508;
                while (var231 > 0) {
                    boolean var232 = true;
                    var231--;
                    for (int var233 = 0; var233 < var231; var233++) {
                        boolean var234 = false;
                        class16 var235 = field510[var233];
                        class16 var236 = field510[var233 + 1];
                        if (field273 != var235.field228 && field273 == var236.field228) {
                            var234 = true;
                        }
                        if (!var234 && var235.field228 == 0 && var236.field228 != 0) {
                            var234 = true;
                        }
                        if (!var234 && !var235.field233 && var236.field233) {
                            var234 = true;
                        }
                        if (!var234 && !var235.field231 && var236.field231) {
                            var234 = true;
                        }
                        if (var234) {
                            class16 var237 = field510[var233];
                            field510[var233] = field510[var233 + 1];
                            field510[var233 + 1] = var237;
                            var232 = false;
                        }
                    }
                    if (var232) {
                        break;
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 150) {
                int var238 = field302.method2139();
                int var239 = field302.method2136();
                if (var238 < -70000) {
                    var239 += 32768;
                }
                class152 var240;
                if (var238 >= 0) {
                    var240 = Statics.method159(var238);
                } else {
                    var240 = null;
                }
                if (var240 != null) {
                    for (int var241 = 0; var241 < var240.field2563.length; var241++) {
                        var240.field2563[var241] = 0;
                        var240.field2601[var241] = 0;
                    }
                }
                class14.method56(var239);
                int var242 = field302.method2136();
                for (int var243 = 0; var243 < var242; var243++) {
                    int var244 = field302.method2158();
                    if (var244 == 255) {
                        var244 = field302.method2235();
                    }
                    int var245 = field302.method2212();
                    if (var240 != null && var243 < var240.field2563.length) {
                        var240.field2563[var243] = var245;
                        var240.field2601[var243] = var244;
                    }
                    class14.method122(var239, var243, var245 - 1, var244);
                }
                if (var240 != null) {
                    method535(var240);
                }
                method1789();
                field447[++field448 - 1 & 0x1F] = var239 & 0x7FFF;
                field304 = -1;
                return true;
            }
            if (field304 == 224) {
                class22 var246 = new class22();
                var246.field571 = field302.method2339();
                var246.field574 = field302.method2136();
                int var247 = field302.method2139();
                var246.field569 = var247;
                method1617(45);
                Statics.field689.method2591();
                Statics.field689 = null;
                if (var246.method505() != field263) {
                    field263 = var246.method505();
                    boolean var248 = var246.method505();
                    if (Statics.field1021 != var248) {
                        class45.field1014.method3117();
                        class45.field1015.method3117();
                        class45.field1016.method3117();
                        Statics.field1021 = var248;
                    }
                }
                Statics.field2028 = var246.field571;
                field273 = var246.field574;
                field259 = var246.field569;
                Statics.field896 = field261 == 0 ? 43594 : var246.field574 + 40000;
                Statics.field1274 = field261 == 0 ? 443 : var246.field574 + 50000;
                Statics.field369 = Statics.field896;
                field304 = -1;
                return false;
            }
            if (field304 == 205) {
                class187.method151(field302, field303);
                field304 = -1;
                return true;
            }
            if (field304 == 102) {
                String var249 = field302.method2339();
                int var250 = field302.method2159();
                int var251 = field302.method2159();
                if (var251 >= 1 && var251 <= 8) {
                    if (var249.equalsIgnoreCase("null")) {
                        var249 = null;
                    }
                    field389[var251 - 1] = var249;
                    field390[var251 - 1] = var250 == 0;
                }
                field304 = -1;
                return true;
            }
            if (field304 == 84) {
                method1789();
                field424 = field302.method2134();
                field351 = field443;
                field304 = -1;
                return true;
            }
            if (field304 == 122) {
                Statics.field527 = field302.method2157();
                Statics.field702 = field302.method2157();
                field304 = -1;
                return true;
            }
            if (field304 == 241) {
                field340 = false;
                for (int var252 = 0; var252 < 5; var252++) {
                    field503[var252] = false;
                }
                field304 = -1;
                return true;
            }
            if (field304 == 35) {
                field386 = 0;
                field381 = 0;
                field302.method2391();
                int var253 = field302.method2392(8);
                if (var253 < field298) {
                    for (int var254 = var253; var254 < field298; var254++) {
                        field387[++field386 - 1] = field299[var254];
                    }
                }
                if (var253 > field298) {
                    throw new RuntimeException("");
                }
                field298 = 0;
                for (int var255 = 0; var255 < var253; var255++) {
                    int var256 = field299[var255];
                    class30 var257 = field297[var256];
                    int var258 = field302.method2392(1);
                    if (var258 == 0) {
                        field299[++field298 - 1] = var256;
                        var257.field773 = field376;
                    } else {
                        int var259 = field302.method2392(2);
                        if (var259 == 0) {
                            field299[++field298 - 1] = var256;
                            var257.field773 = field376;
                            field382[++field381 - 1] = var256;
                        } else if (var259 == 1) {
                            field299[++field298 - 1] = var256;
                            var257.field773 = field376;
                            int var260 = field302.method2392(3);
                            var257.method588(var260, false);
                            int var261 = field302.method2392(1);
                            if (var261 == 1) {
                                field382[++field381 - 1] = var256;
                            }
                        } else if (var259 == 2) {
                            field299[++field298 - 1] = var256;
                            var257.field773 = field376;
                            int var262 = field302.method2392(3);
                            var257.method588(var262, true);
                            int var263 = field302.method2392(3);
                            var257.method588(var263, true);
                            int var264 = field302.method2392(1);
                            if (var264 == 1) {
                                field382[++field381 - 1] = var256;
                            }
                        } else if (var259 == 3) {
                            field387[++field386 - 1] = var256;
                        }
                    }
                }
                while (field302.method2409(field303) >= 27) {
                    int var265 = field302.method2392(15);
                    if (var265 == 32767) {
                        break;
                    }
                    boolean var266 = false;
                    if (field297[var265] == null) {
                        field297[var265] = new class30();
                        var266 = true;
                    }
                    class30 var267 = field297[var265];
                    field299[++field298 - 1] = var265;
                    var267.field773 = field376;
                    int var268 = field302.method2392(1);
                    if (var268 == 1) {
                        field382[++field381 - 1] = var265;
                    }
                    int var269 = field302.method2392(5);
                    if (var269 > 15) {
                        var269 -= 32;
                    }
                    int var270 = field302.method2392(5);
                    if (var270 > 15) {
                        var270 -= 32;
                    }
                    int var271 = field318[field302.method2392(3)];
                    if (var266) {
                        var267.field775 = var267.field733 = var271;
                    }
                    int var272 = field302.method2392(1);
                    var267.field692 = class35.method2793(field302.method2392(14));
                    var267.field763 = var267.field692.field825;
                    var267.field777 = var267.field692.field821;
                    if (var267.field777 == 0) {
                        var267.field733 = 0;
                    }
                    var267.field766 = var267.field692.field822;
                    var267.field741 = var267.field692.field805;
                    var267.field735 = var267.field692.field806;
                    var267.field772 = var267.field692.field794;
                    var267.field730 = var267.field692.field804;
                    var267.field731 = var267.field692.field799;
                    var267.field732 = var267.field692.field803;
                    var267.method587(Statics.field578.field779[0] + var270, Statics.field578.field780[0] + var269, var272 == 1);
                }
                field302.method2406();
                method2345();
                for (int var273 = 0; var273 < field386; var273++) {
                    int var274 = field387[var273];
                    if (field376 != field297[var274].field773) {
                        field297[var274].field692 = null;
                        field297[var274] = null;
                    }
                }
                if (field303 != field302.field1845) {
                    throw new RuntimeException(field302.field1845 + class2.field20 + field303);
                }
                for (int var275 = 0; var275 < field298; var275++) {
                    if (field297[field299[var275]] == null) {
                        throw new RuntimeException(var275 + class2.field20 + field298);
                    }
                }
                field304 = -1;
                return true;
            }
            if (field304 == 52) {
                int var276 = field302.method2212();
                int var277 = field302.method2139();
                class154.field2656[var276] = var277;
                if (class154.field2657[var276] != var277) {
                    class154.field2657[var276] = var277;
                    method3433(var276);
                }
                field445[++field426 - 1 & 0x1F] = var276;
                field304 = -1;
                return true;
            }
            class135.method3292("" + field304 + class2.field20 + field349 + class2.field20 + field476 + class2.field20 + field303, (Throwable) null);
            method729();
        } catch (IOException var283) {
            method1620();
        } catch (Exception var284) {
            String var280 = "" + field304 + class2.field20 + field349 + class2.field20 + field476 + class2.field20 + field303 + class2.field20 + (Statics.field982 + Statics.field578.field779[0]) + class2.field20 + (Statics.field169 + Statics.field578.field780[0]) + class2.field20;
            for (int var281 = 0; var281 < field303 && var281 < 50; var281++) {
                var280 = var280 + field302.field1844[var281] + class2.field20;
            }
            class135.method3292(var280, var284);
            method729();
        }
        return true;
    }

    @ObfuscatedName("af.bv(I)V")
    public static final void method606() {
        if (field304 == 180) {
            byte var0 = field302.method2161();
            int var1 = field302.method2136();
            int var2 = field302.method2158();
            int var3 = (var2 >> 4 & 0x7) + Statics.field527;
            int var4 = (var2 & 0x7) + Statics.field702;
            int var5 = field302.method2212();
            int var6 = field302.method2157();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field509[var7];
            int var10 = field302.method2212();
            int var11 = field302.method2136();
            byte var12 = field302.method2135();
            byte var13 = field302.method2161();
            byte var14 = field302.method2135();
            class3 var15;
            if (field384 == var10) {
                var15 = Statics.field578;
            } else {
                var15 = field335[var10];
            }
            if (var15 != null) {
                class36 var16 = class36.method28(var5);
                int var17;
                int var18;
                if (var8 == 1 || var8 == 3) {
                    var17 = var16.field873;
                    var18 = var16.field879;
                } else {
                    var17 = var16.field879;
                    var18 = var16.field873;
                }
                int var19 = (var17 >> 1) + var3;
                int var20 = (var17 + 1 >> 1) + var3;
                int var21 = (var18 >> 1) + var4;
                int var22 = (var18 + 1 >> 1) + var4;
                int[][] var23 = class6.field74[Statics.field1762];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var3 << 7) + (var17 << 6);
                int var26 = (var4 << 7) + (var18 << 6);
                class98 var27 = var16.method644(var7, var8, var23, var25, var24, var26);
                if (var27 != null) {
                    method23(Statics.field1762, var3, var4, var9, -1, 0, 0, var1 + 1, var11 + 1);
                    var15.field47 = field376 + var1;
                    var15.field42 = field376 + var11;
                    var15.field49 = var27;
                    var15.field43 = var3 * 128 + var17 * 64;
                    var15.field45 = var4 * 128 + var18 * 64;
                    var15.field44 = var24;
                    if (var14 > var13) {
                        byte var28 = var14;
                        var14 = var13;
                        var13 = var28;
                    }
                    if (var0 > var12) {
                        byte var29 = var0;
                        var0 = var12;
                        var12 = var29;
                    }
                    var15.field36 = var3 + var14;
                    var15.field41 = var3 + var13;
                    var15.field48 = var0 + var4;
                    var15.field35 = var4 + var12;
                }
            }
        }
        if (field304 == 154) {
            int var30 = field302.method2134();
            int var31 = (var30 >> 4 & 0x7) + Statics.field527;
            int var32 = (var30 & 0x7) + Statics.field702;
            int var33 = var31 + field302.method2135();
            int var34 = var32 + field302.method2135();
            int var35 = field302.method2153();
            int var36 = field302.method2136();
            int var37 = field302.method2134() * 4;
            int var38 = field302.method2134() * 4;
            int var39 = field302.method2136();
            int var40 = field302.method2136();
            int var41 = field302.method2134();
            int var42 = field302.method2134();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                int var46 = var34 * 128 + 64;
                class7 var47 = new class7(var36, Statics.field1762, var43, var44, method2387(var43, var44, Statics.field1762) - var37, field376 + var39, field376 + var40, var41, var42, var35, var38);
                var47.method82(var45, var46, method2387(var45, var46, Statics.field1762) - var38, field376 + var39);
                field395.method3180(var47);
            }
        } else if (field304 == 148) {
            int var48 = field302.method2159();
            int var49 = var48 >> 2;
            int var50 = var48 & 0x3;
            int var51 = field509[var49];
            int var52 = field302.method2174();
            int var53 = field302.method2134();
            int var54 = (var53 >> 4 & 0x7) + Statics.field527;
            int var55 = (var53 & 0x7) + Statics.field702;
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                method23(Statics.field1762, var54, var55, var51, var52, var49, var50, 0, -1);
            }
        } else if (field304 == 159) {
            int var56 = field302.method2134();
            int var57 = (var56 >> 4 & 0x7) + Statics.field527;
            int var58 = (var56 & 0x7) + Statics.field702;
            int var59 = field302.method2159();
            int var60 = var59 >> 2;
            int var61 = var59 & 0x3;
            int var62 = field509[var60];
            if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                method23(Statics.field1762, var57, var58, var62, -1, var60, var61, 0, -1);
            }
        } else {
            if (field304 == 101) {
                int var63 = field302.method2134();
                int var64 = (var63 >> 4 & 0x7) + Statics.field527;
                int var65 = (var63 & 0x7) + Statics.field702;
                int var66 = field302.method2136();
                int var67 = field302.method2134();
                int var68 = var67 >> 4 & 0xF;
                int var69 = var67 & 0x7;
                int var70 = field302.method2134();
                if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                    int var71 = var68 + 1;
                    if (Statics.field578.field779[0] >= var64 - var71 && Statics.field578.field779[0] <= var64 + var71 && Statics.field578.field780[0] >= var65 - var71 && Statics.field578.field780[0] <= var65 + var71 && field473 != 0 && var69 > 0 && field496 < 50) {
                        field497[field496] = var66;
                        field256[field496] = var69;
                        field499[field496] = var70;
                        field501[field496] = null;
                        field500[field496] = (var64 << 16) + (var65 << 8) + var68;
                        field496++;
                    }
                }
            }
            if (field304 == 79) {
                int var72 = field302.method2159();
                int var73 = (var72 >> 4 & 0x7) + Statics.field527;
                int var74 = (var72 & 0x7) + Statics.field702;
                int var75 = field302.method2167();
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                    class177 var76 = field393[Statics.field1762][var73][var74];
                    if (var76 != null) {
                        for (class25 var77 = (class25) var76.method3185(); var77 != null; var77 = (class25) var76.method3187()) {
                            if ((var75 & 0x7FFF) == var77.field605) {
                                var77.method3260();
                                break;
                            }
                        }
                        if (var76.method3185() == null) {
                            field393[Statics.field1762][var73][var74] = null;
                        }
                        method834(var73, var74);
                    }
                }
            } else if (field304 == 23) {
                int var78 = field302.method2212();
                int var79 = field302.method2167();
                int var80 = field302.method2159();
                int var81 = (var80 >> 4 & 0x7) + Statics.field527;
                int var82 = (var80 & 0x7) + Statics.field702;
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
                    class25 var83 = new class25();
                    var83.field605 = var78;
                    var83.field606 = var79;
                    if (field393[Statics.field1762][var81][var82] == null) {
                        field393[Statics.field1762][var81][var82] = new class177();
                    }
                    field393[Statics.field1762][var81][var82].method3180(var83);
                    method834(var81, var82);
                }
            } else if (field304 == 33) {
                int var84 = field302.method2157();
                int var85 = (var84 >> 4 & 0x7) + Statics.field527;
                int var86 = (var84 & 0x7) + Statics.field702;
                int var87 = field302.method2158();
                int var88 = var87 >> 2;
                int var89 = var87 & 0x3;
                int var90 = field509[var88];
                int var91 = field302.method2212();
                if (var85 >= 0 && var86 >= 0 && var85 < 103 && var86 < 103) {
                    if (var90 == 0) {
                        class80 var92 = Statics.field236.method1645(Statics.field1762, var85, var86);
                        if (var92 != null) {
                            int var93 = var92.field1412 >> 14 & 0x7FFF;
                            if (var88 == 2) {
                                var92.field1419 = new class11(var93, 2, var89 + 4, Statics.field1762, var85, var86, var91, false, var92.field1419);
                                var92.field1417 = new class11(var93, 2, var89 + 1 & 0x3, Statics.field1762, var85, var86, var91, false, var92.field1417);
                            } else {
                                var92.field1419 = new class11(var93, var88, var89, Statics.field1762, var85, var86, var91, false, var92.field1419);
                            }
                        }
                    }
                    if (var90 == 1) {
                        class87 var94 = Statics.field236.method1646(Statics.field1762, var85, var86);
                        if (var94 != null) {
                            int var95 = var94.field1505 >> 14 & 0x7FFF;
                            if (var88 == 4 || var88 == 5) {
                                var94.field1503 = new class11(var95, 4, var89, Statics.field1762, var85, var86, var91, false, var94.field1503);
                            } else if (var88 == 6) {
                                var94.field1503 = new class11(var95, 4, var89 + 4, Statics.field1762, var85, var86, var91, false, var94.field1503);
                            } else if (var88 == 7) {
                                var94.field1503 = new class11(var95, 4, (var89 + 2 & 0x3) + 4, Statics.field1762, var85, var86, var91, false, var94.field1503);
                            } else if (var88 == 8) {
                                var94.field1503 = new class11(var95, 4, var89 + 4, Statics.field1762, var85, var86, var91, false, var94.field1503);
                                var94.field1504 = new class11(var95, 4, (var89 + 2 & 0x3) + 4, Statics.field1762, var85, var86, var91, false, var94.field1504);
                            }
                        }
                    }
                    if (var90 == 2) {
                        class91 var96 = Statics.field236.method1647(Statics.field1762, var85, var86);
                        if (var88 == 11) {
                            var88 = 10;
                        }
                        if (var96 != null) {
                            var96.field1554 = new class11(var96.field1562 >> 14 & 0x7FFF, var88, var89, Statics.field1762, var85, var86, var91, false, var96.field1554);
                        }
                    }
                    if (var90 == 3) {
                        class86 var97 = Statics.field236.method1724(Statics.field1762, var85, var86);
                        if (var97 != null) {
                            var97.field1485 = new class11(var97.field1486 >> 14 & 0x7FFF, 22, var89, Statics.field1762, var85, var86, var91, false, var97.field1485);
                        }
                    }
                }
            } else if (field304 == 94) {
                int var98 = field302.method2134();
                int var99 = (var98 >> 4 & 0x7) + Statics.field527;
                int var100 = (var98 & 0x7) + Statics.field702;
                int var101 = field302.method2136();
                int var102 = field302.method2134();
                int var103 = field302.method2136();
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    int var104 = var99 * 128 + 64;
                    int var105 = var100 * 128 + 64;
                    class26 var106 = new class26(var101, Statics.field1762, var104, var105, method2387(var104, var105, Statics.field1762) - var102, var103, field376);
                    field468.method3180(var106);
                }
            } else if (field304 == 48) {
                int var107 = field302.method2134();
                int var108 = (var107 >> 4 & 0x7) + Statics.field527;
                int var109 = (var107 & 0x7) + Statics.field702;
                int var110 = field302.method2136();
                int var111 = field302.method2136();
                int var112 = field302.method2136();
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class177 var113 = field393[Statics.field1762][var108][var109];
                    if (var113 != null) {
                        for (class25 var114 = (class25) var113.method3185(); var114 != null; var114 = (class25) var113.method3187()) {
                            if ((var110 & 0x7FFF) == var114.field605 && var114.field606 == var111) {
                                var114.field606 = var112;
                                break;
                            }
                        }
                        method834(var108, var109);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.bi(IIIIIIIIII)V")
    public static final void method23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field394.method3185(); var10 != null; var10 = (class15) field394.method3187()) {
            if (var10.field214 == arg0 && var10.field212 == arg1 && var10.field218 == arg2 && var10.field211 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field214 = arg0;
            var9.field211 = arg3;
            var9.field212 = arg1;
            var9.field218 = arg2;
            method624(var9);
            field394.method3180(var9);
        }
        var9.field210 = arg4;
        var9.field223 = arg5;
        var9.field217 = arg6;
        var9.field220 = arg7;
        var9.field213 = arg8;
    }

    @ObfuscatedName("aw.bp(I)V")
    public static final void method818() {
        for (class15 var0 = (class15) field394.method3185(); var0 != null; var0 = (class15) field394.method3187()) {
            if (var0.field213 == -1) {
                var0.field220 = 0;
                method624(var0);
            } else {
                var0.method3260();
            }
        }
    }

    @ObfuscatedName("as.bl(Lg;B)V")
    public static final void method624(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field211 == 0) {
            var1 = Statics.field236.method1689(arg0.field214, arg0.field212, arg0.field218);
        }
        if (arg0.field211 == 1) {
            var1 = Statics.field236.method1685(arg0.field214, arg0.field212, arg0.field218);
        }
        if (arg0.field211 == 2) {
            var1 = Statics.field236.method1651(arg0.field214, arg0.field212, arg0.field218);
        }
        if (arg0.field211 == 3) {
            var1 = Statics.field236.method1652(arg0.field214, arg0.field212, arg0.field218);
        }
        if (var1 != 0) {
            int var5 = Statics.field236.method1755(arg0.field214, arg0.field212, arg0.field218, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field221 = var2;
        arg0.field216 = var3;
        arg0.field215 = var4;
    }

    @ObfuscatedName("eo.bz(IIIIIIII)V")
    public static final void method2670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field264 && Statics.field1762 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field236.method1689(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field236.method1685(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field236.method1651(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field236.method1652(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field236.method1755(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field236.method1640(arg0, arg2, arg3);
                class36 var15 = class36.method28(var12);
                if (var15.field850 != 0) {
                    field301[arg0].method3447(arg2, arg3, var13, var14, var15.field875);
                }
            }
            if (arg1 == 1) {
                Statics.field236.method1629(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field236.method1642(arg0, arg2, arg3);
                class36 var16 = class36.method28(var12);
                if (var16.field879 + arg2 > 103 || var16.field879 + arg3 > 103 || var16.field873 + arg2 > 103 || var16.field873 + arg3 > 103) {
                    return;
                }
                if (var16.field850 != 0) {
                    field301[arg0].method3465(arg2, arg3, var16.field879, var16.field873, var14, var16.field875);
                }
            }
            if (arg1 == 3) {
                Statics.field236.method1701(arg0, arg2, arg3);
                class36 var17 = class36.method28(var12);
                if (var17.field850 == 1) {
                    field301[arg0].method3450(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field75[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class79 var19 = Statics.field236;
        class195 var20 = field301[arg0];
        class36 var21 = class36.method28(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field873;
            var23 = var21.field879;
        } else {
            var22 = var21.field879;
            var23 = var21.field873;
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
        int[][] var28 = class6.field74[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field849 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field851 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field856 == -1 && var21.field852 == null) {
                var34 = var21.method644(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1643(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field850 == 1) {
                var20.method3467(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field856 == -1 && var21.field852 == null) {
                var57 = var21.method644(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1657(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field850 != 0) {
                var20.method3443(arg2, arg3, var22, var23, var21.field875);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field856 == -1 && var21.field852 == null) {
                var35 = var21.method644(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1657(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3443(arg2, arg3, var22, var23, var21.field875);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field856 == -1 && var21.field852 == null) {
                var36 = var21.method644(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1631(arg0, arg2, arg3, var29, var36, (class78) null, class6.field85[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3442(arg2, arg3, arg6, arg5, var21.field875);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field856 == -1 && var21.field852 == null) {
                var37 = var21.method644(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1631(arg0, arg2, arg3, var29, var37, (class78) null, class6.field86[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3442(arg2, arg3, arg6, arg5, var21.field875);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field856 == -1 && var21.field852 == null) {
                var39 = var21.method644(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method644(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field856, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1631(arg0, arg2, arg3, var29, var39, var40, class6.field85[arg5], class6.field85[var38], var32, var33);
            if (var21.field850 != 0) {
                var20.method3442(arg2, arg3, arg6, arg5, var21.field875);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field856 == -1 && var21.field852 == null) {
                var41 = var21.method644(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1631(arg0, arg2, arg3, var29, var41, (class78) null, class6.field86[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3442(arg2, arg3, arg6, arg5, var21.field875);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field856 == -1 && var21.field852 == null) {
                var42 = var21.method644(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1657(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3443(arg2, arg3, var22, var23, var21.field875);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field856 == -1 && var21.field852 == null) {
                var43 = var21.method644(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1641(arg0, arg2, arg3, var29, var43, (class78) null, class6.field85[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1689(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method28(var45 >> 14 & 0x7FFF).field868;
            }
            class78 var46;
            if (var21.field856 == -1 && var21.field852 == null) {
                var46 = var21.method644(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1641(arg0, arg2, arg3, var29, var46, (class78) null, class6.field85[arg5], 0, class6.field87[arg5] * var44, class6.field94[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1689(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method28(var48 >> 14 & 0x7FFF).field868 / 2;
            }
            class78 var49;
            if (var21.field856 == -1 && var21.field852 == null) {
                var49 = var21.method644(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1641(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field89[arg5] * var47, class6.field92[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field856 == -1 && var21.field852 == null) {
                var51 = var21.method644(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1641(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1689(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method28(var53 >> 14 & 0x7FFF).field868 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field856 == -1 && var21.field852 == null) {
                var55 = var21.method644(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method644(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field856, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field856, true, (class78) null);
            }
            var19.method1641(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field89[arg5] * var52, class6.field92[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ao.bx(III)V")
    public static final void method834(int arg0, int arg1) {
        class177 var2 = field393[Statics.field1762][arg0][arg1];
        if (var2 == null) {
            Statics.field236.method1706(Statics.field1762, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3185(); var6 != null; var6 = (class25) var2.method3187()) {
            class45 var7 = class45.method2057(var6.field605);
            long var8 = (long) var7.field1023;
            if (var7.field1041 == 1) {
                var8 = (long) (var6.field606 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field236.method1706(Statics.field1762, arg0, arg1);
            return;
        }
        var2.method3181(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3185(); var12 != null; var12 = (class25) var2.method3187()) {
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
        Statics.field236.method1707(Statics.field1762, arg0, arg1, method2387(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1762), var5, var13, var10, var11);
    }

    @ObfuscatedName("y.bb(B)V")
    public static final void method89() {
        int var0 = field302.method2392(8);
        if (var0 < field279) {
            for (int var1 = var0; var1 < field279; var1++) {
                field387[++field386 - 1] = field260[var1];
            }
        }
        if (var0 > field279) {
            throw new RuntimeException("");
        }
        field279 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field260[var2];
            class3 var4 = field335[var3];
            int var5 = field302.method2392(1);
            if (var5 == 0) {
                field260[++field279 - 1] = var3;
                var4.field773 = field376;
            } else {
                int var6 = field302.method2392(2);
                if (var6 == 0) {
                    field260[++field279 - 1] = var3;
                    var4.field773 = field376;
                    field382[++field381 - 1] = var3;
                } else if (var6 == 1) {
                    field260[++field279 - 1] = var3;
                    var4.field773 = field376;
                    int var7 = field302.method2392(3);
                    var4.method588(var7, false);
                    int var8 = field302.method2392(1);
                    if (var8 == 1) {
                        field382[++field381 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field260[++field279 - 1] = var3;
                    var4.field773 = field376;
                    int var9 = field302.method2392(3);
                    var4.method588(var9, true);
                    int var10 = field302.method2392(3);
                    var4.method588(var10, true);
                    int var11 = field302.method2392(1);
                    if (var11 == 1) {
                        field382[++field381 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field387[++field386 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("e.be(B)V")
    public static final void method137() {
        while (true) {
            if (field302.method2409(field303) >= 11) {
                int var0 = field302.method2392(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field335[var0] == null) {
                        field335[var0] = new class3();
                        if (field383[var0] != null) {
                            field335[var0].method11(field383[var0]);
                        }
                        var1 = true;
                    }
                    field260[++field279 - 1] = var0;
                    class3 var2 = field335[var0];
                    var2.field773 = field376;
                    int var3 = field318[field302.method2392(3)];
                    if (var1) {
                        var2.field775 = var2.field733 = var3;
                    }
                    int var4 = field302.method2392(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field302.method2392(1);
                    int var6 = field302.method2392(1);
                    if (var6 == 1) {
                        field382[++field381 - 1] = var0;
                    }
                    int var7 = field302.method2392(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method587(Statics.field578.field779[0] + var4, Statics.field578.field780[0] + var7, var5 == 1);
                    continue;
                }
            }
            field302.method2406();
            return;
        }
    }

    @ObfuscatedName("er.bf(ILx;II)V")
    public static final void method2682(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x40) != 0) {
            int var3 = field302.method2136();
            int var4 = field302.method2159();
            boolean var5 = field302.method2134() == 1;
            int var6 = field302.method2157();
            int var7 = field302.field1845;
            if (arg1.field46 != null && arg1.field34 != null) {
                boolean var8 = false;
                if (var4 <= 1 && method25(arg1.field46)) {
                    var8 = true;
                }
                if (!var8 && field472 == 0) {
                    field284.field1845 = 0;
                    field302.method2288(field284.field1844, 0, var6);
                    field284.field1845 = 0;
                    String var9 = class190.method3300(class197.method881(class189.method3288(field284)));
                    arg1.field738 = var9.trim();
                    arg1.field737 = var3 >> 8;
                    arg1.field742 = var3 & 0xFF;
                    arg1.field748 = 150;
                    arg1.field739 = var5;
                    if (var4 == 2 || var4 == 3) {
                        class10.method88(var5 ? 91 : 1, class2.method3107(1) + arg1.field46, var9);
                    } else if (var4 == 1) {
                        class10.method88(var5 ? 91 : 1, class2.method3107(0) + arg1.field46, var9);
                    } else {
                        class10.method88(var5 ? 90 : 2, arg1.field46, var9);
                    }
                }
            }
            field302.field1845 = var6 + var7;
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field758 = field302.method2158();
            arg1.field768 = field302.method2159();
            arg1.field767 = field302.method2159();
            arg1.field769 = field302.method2134();
            arg1.field770 = field302.method2167() + field376;
            arg1.field771 = field302.method2212() + field376;
            arg1.field740 = field302.method2159();
            arg1.field778 = 1;
            arg1.field736 = 0;
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field729 = field302.method2167();
            if (arg1.field729 == 65535) {
                arg1.field729 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var10 = field302.method2159();
            byte[] var11 = new byte[var10];
            class107 var12 = new class107(var11);
            field302.method2179(var11, 0, var10);
            field383[arg0] = var12;
            arg1.method11(var12);
        }
        if ((arg2 & 0x200) != 0) {
            int var13 = field302.method2158();
            int var14 = field302.method2159();
            arg1.method591(var13, var14, field376);
            arg1.field747 = field376 + 300;
            arg1.field725 = field302.method2134();
            arg1.field749 = field302.method2159();
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field738 = field302.method2339();
            if (arg1.field738.charAt(0) == '~') {
                arg1.field738 = arg1.field738.substring(1);
                class10.method88(2, arg1.field46, arg1.field738);
            } else if (Statics.field578 == arg1) {
                class10.method88(2, arg1.field46, arg1.field738);
            }
            arg1.field739 = false;
            arg1.field737 = 0;
            arg1.field742 = 0;
            arg1.field748 = 150;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field761 = field302.method2167();
            int var15 = field302.method2139();
            arg1.field765 = var15 >> 16;
            arg1.field764 = (var15 & 0xFFFF) + field376;
            arg1.field750 = 0;
            arg1.field745 = 0;
            if (arg1.field764 > field376) {
                arg1.field750 = -1;
            }
            if (arg1.field761 == 65535) {
                arg1.field761 = -1;
            }
        }
        if ((arg2 & 0x10) != 0) {
            int var16 = field302.method2174();
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = field302.method2134();
            method1974(arg1, var16, var17);
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field751 = field302.method2136();
            arg1.field752 = field302.method2174();
        }
        if ((arg2 & 0x4) == 0) {
            return;
        }
        int var18 = field302.method2134();
        int var19 = field302.method2134();
        arg1.method591(var18, var19, field376);
        arg1.field747 = field376 + 300;
        arg1.field725 = field302.method2158();
        arg1.field749 = field302.method2134();
    }

    @ObfuscatedName("dh.bd(I)V")
    public static final void method2345() {
        for (int var0 = 0; var0 < field381; var0++) {
            int var1 = field382[var0];
            class30 var2 = field297[var1];
            int var3 = field302.method2134();
            if ((var3 & 0x20) != 0) {
                int var4 = field302.method2212();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field302.method2159();
                if (var2.field756 == var4 && var4 != -1) {
                    int var6 = Statics.method484(var4).field917;
                    if (var6 == 1) {
                        var2.field757 = 0;
                        var2.field727 = 0;
                        var2.field781 = var5;
                        var2.field760 = 0;
                    }
                    if (var6 == 2) {
                        var2.field760 = 0;
                    }
                } else if (var4 == -1 || var2.field756 == -1 || Statics.method484(var4).field919 >= Statics.method484(var2.field756).field919) {
                    var2.field756 = var4;
                    var2.field757 = 0;
                    var2.field727 = 0;
                    var2.field781 = var5;
                    var2.field760 = 0;
                    var2.field736 = var2.field778;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field738 = field302.method2339();
                var2.field748 = 100;
            }
            if ((var3 & 0x10) != 0) {
                var2.field761 = field302.method2212();
                int var7 = field302.method2139();
                var2.field765 = var7 >> 16;
                var2.field764 = (var7 & 0xFFFF) + field376;
                var2.field750 = 0;
                var2.field745 = 0;
                if (var2.field764 > field376) {
                    var2.field750 = -1;
                }
                if (var2.field761 == 65535) {
                    var2.field761 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field751 = field302.method2136();
                var2.field752 = field302.method2167();
            }
            if ((var3 & 0x2) != 0) {
                int var8 = field302.method2134();
                int var9 = field302.method2157();
                var2.method591(var8, var9, field376);
                var2.field747 = field376 + 300;
                var2.field725 = field302.method2158();
                var2.field749 = field302.method2134();
            }
            if ((var3 & 0x4) != 0) {
                int var10 = field302.method2159();
                int var11 = field302.method2157();
                var2.method591(var10, var11, field376);
                var2.field747 = field376 + 300;
                var2.field725 = field302.method2157();
                var2.field749 = field302.method2159();
            }
            if ((var3 & 0x8) != 0) {
                var2.field729 = field302.method2136();
                if (var2.field729 == 65535) {
                    var2.field729 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field692 = class35.method2793(field302.method2174());
                var2.field763 = var2.field692.field825;
                var2.field777 = var2.field692.field821;
                var2.field766 = var2.field692.field822;
                var2.field741 = var2.field692.field805;
                var2.field735 = var2.field692.field806;
                var2.field772 = var2.field692.field794;
                var2.field730 = var2.field692.field804;
                var2.field731 = var2.field692.field799;
                var2.field732 = var2.field692.field803;
            }
        }
    }

    @ObfuscatedName("ay.by(IIB)V")
    public static final void method576(int arg0, int arg1) {
        if (field368 < 2 && field346 == 0 && !field358) {
            return;
        }
        String var2;
        if (field346 == 1 && field368 < 2) {
            var2 = class142.field2363 + class142.field2166 + field414 + " " + class2.field24;
        } else if (field358 && field368 < 2) {
            var2 = field417 + class142.field2166 + field379 + " " + class2.field24;
        } else {
            var2 = method126(field368 - 1);
        }
        if (field368 > 2) {
            var2 = var2 + class2.method3286(16777215) + " " + '/' + " " + (field368 - 2) + class142.field2300;
        }
        Statics.field635.method3315(var2, arg0 + 4, arg1 + 15, 16777215, 0, field376 / 1000);
    }

    @ObfuscatedName("c.br(IIIIB)V")
    public static final void method161(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field450; var4++) {
            if (field469[var4] + field467[var4] > arg0 && field467[var4] < arg0 + arg2 && field517[var4] + field470[var4] > arg1 && field517[var4] < arg1 + arg3) {
                field464[var4] = true;
            }
        }
    }

    @ObfuscatedName("dl.bh(III)V")
    public static final void method2469(int arg0, int arg1) {
        int var2 = Statics.field635.method3342(class142.field2380);
        for (int var3 = 0; var3 < field368; var3++) {
            int var4 = Statics.field635.method3342(method126(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field368 * 15 + 21;
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
        field401 = true;
        Statics.field1686 = var6;
        Statics.field181 = var7;
        Statics.field29 = var2;
        Statics.field1002 = field368 * 15 + 22;
    }

    @ObfuscatedName("g.bw(II)Z")
    public static final boolean method160(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field370[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("az.bk(II)V")
    public static final void method567(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field403[arg0];
        int var2 = field391[arg0];
        int var3 = field370[arg0];
        int var4 = field406[arg0];
        String var5 = field407[arg0];
        String var6 = field408[arg0];
        method156(var1, var2, var3, var4, var5, var6, class127.field2013, class127.field2012);
    }

    @ObfuscatedName("ay.bg(Lal;III)V")
    public static final void method585(class27 arg0, int arg1, int arg2) {
        method156(arg0.field628, arg0.field627, arg0.field634, arg0.field629, arg0.field630, arg0.field630, arg1, arg2);
    }

    @ObfuscatedName("g.bo(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method156(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1003) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            class30 var8 = field297[arg3];
            if (var8 != null) {
                class35 var9 = var8.field692;
                if (var9.field800 != null) {
                    var9 = var9.method614();
                }
                if (var9 != null) {
                    field300.method2389(6);
                    field300.method2163(var9.field796);
                }
            }
        }
        if (arg2 == 35) {
            field300.method2389(60);
            field300.method2124(arg1);
            field300.method2163(arg3);
            field300.method2162(arg0);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 4) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(208);
            field300.method2163(arg3 >> 14 & 0x7FFF);
            field300.method2163(Statics.field982 + arg0);
            field300.method2277(Statics.field169 + arg1);
            field300.method2154(class124.field1971[82] ? 1 : 0);
        }
        if (arg2 == 36) {
            field300.method2389(120);
            field300.method2277(arg3);
            field300.method2164(arg0);
            field300.method2276(arg1);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 46) {
            class3 var10 = field335[arg3];
            if (var10 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(198);
                field300.method2164(arg3);
                field300.method2120(class124.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class3 var11 = field335[arg3];
            if (var11 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(250);
                field300.method2162(arg3);
                field300.method2155(class124.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field300.method2389(12);
            field300.method2277(arg0);
            field300.method2276(arg1);
            field300.method2163(arg3);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 38) {
            method2346();
            class152 var12 = Statics.method159(arg1);
            field346 = 1;
            Statics.field23 = arg0;
            Statics.field1826 = arg1;
            Statics.field456 = arg3;
            method535(var12);
            field414 = class2.method3286(16748608) + class45.method2057(arg3).field1019 + class2.method3286(16777215);
            if (field414 == null) {
                field414 = "null";
            }
            return;
        }
        if (arg2 == 5) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(42);
            field300.method2155(class124.field1971[82] ? 1 : 0);
            field300.method2164(Statics.field982 + arg0);
            field300.method2277(arg3 >> 14 & 0x7FFF);
            field300.method2277(Statics.field169 + arg1);
        }
        if (arg2 == 51) {
            class3 var13 = field335[arg3];
            if (var13 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(23);
                field300.method2120(class124.field1971[82] ? 1 : 0);
                field300.method2277(arg3);
            }
        }
        if (arg2 == 34) {
            field300.method2389(11);
            field300.method2173(arg1);
            field300.method2164(arg0);
            field300.method2162(arg3);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 44) {
            class3 var14 = field335[arg3];
            if (var14 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(28);
                field300.method2120(class124.field1971[82] ? 1 : 0);
                field300.method2164(arg3);
            }
        }
        if (arg2 == 1002) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field300.method2389(50);
            field300.method2163(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 47) {
            class3 var15 = field335[arg3];
            if (var15 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(195);
                field300.method2163(arg3);
                field300.method2154(class124.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class3 var16 = field335[arg3];
            if (var16 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(141);
                field300.method2154(class124.field1971[82] ? 1 : 0);
                field300.method2210(Statics.field2662);
                field300.method2163(arg3);
                field300.method2277(field416);
            }
        }
        if (arg2 == 21) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(37);
            field300.method2162(arg3);
            field300.method2154(class124.field1971[82] ? 1 : 0);
            field300.method2164(Statics.field169 + arg1);
            field300.method2162(Statics.field982 + arg0);
        }
        if (arg2 == 17) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(100);
            field300.method2155(class124.field1971[82] ? 1 : 0);
            field300.method2277(Statics.field982 + arg0);
            field300.method2164(field416);
            field300.method2163(Statics.field169 + arg1);
            field300.method2162(arg3);
            field300.method2210(Statics.field2662);
        }
        if (arg2 == 41) {
            field300.method2389(172);
            field300.method2276(arg1);
            field300.method2162(arg3);
            field300.method2163(arg0);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 1005) {
            class152 var17 = Statics.method159(arg1);
            if (var17 == null || var17.field2601[arg0] < 100000) {
                field300.method2389(158);
                field300.method2277(arg3);
            } else {
                class10.method88(27, "", var17.field2601[arg0] + " x " + class45.method2057(arg3).field1019);
            }
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 40) {
            field300.method2389(151);
            field300.method2277(arg0);
            field300.method2276(arg1);
            field300.method2164(arg3);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 30 && field423 == null) {
            field300.method2389(145);
            field300.method2124(arg1);
            field300.method2163(arg0);
            field423 = class152.method526(arg1, arg0);
            method535(field423);
        }
        if (arg2 == 2) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(194);
            field300.method2163(Statics.field169 + arg1);
            field300.method2164(arg3 >> 14 & 0x7FFF);
            field300.method2276(Statics.field2662);
            field300.method2163(Statics.field982 + arg0);
            field300.method2162(field416);
            field300.method2154(class124.field1971[82] ? 1 : 0);
        }
        if (arg2 == 16) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(191);
            field300.method2120(class124.field1971[82] ? 1 : 0);
            field300.method2277(Statics.field23);
            field300.method2277(Statics.field169 + arg1);
            field300.method2162(arg3);
            field300.method2163(Statics.field982 + arg0);
            field300.method2162(Statics.field456);
            field300.method2124(Statics.field1826);
        }
        if (arg2 == 1) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(147);
            field300.method2162(Statics.field982 + arg0);
            field300.method2162(Statics.field169 + arg1);
            field300.method2242(class124.field1971[82] ? 1 : 0);
            field300.method2124(Statics.field1826);
            field300.method2164(Statics.field23);
            field300.method2277(arg3 >> 14 & 0x7FFF);
            field300.method2163(Statics.field456);
        }
        if (arg2 == 20) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(51);
            field300.method2120(class124.field1971[82] ? 1 : 0);
            field300.method2277(Statics.field169 + arg1);
            field300.method2162(arg3);
            field300.method2162(Statics.field982 + arg0);
        }
        if (arg2 == 58) {
            field300.method2389(40);
            field300.method2210(Statics.field2662);
            field300.method2277(field416);
            field300.method2276(arg1);
            field300.method2277(arg0);
        }
        if (arg2 == 1001) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(110);
            field300.method2242(class124.field1971[82] ? 1 : 0);
            field300.method2163(arg3 >> 14 & 0x7FFF);
            field300.method2162(Statics.field169 + arg1);
            field300.method2162(Statics.field982 + arg0);
        }
        if (arg2 == 43) {
            field300.method2389(168);
            field300.method2162(arg0);
            field300.method2276(arg1);
            field300.method2277(arg3);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 31) {
            field300.method2389(159);
            field300.method2277(Statics.field456);
            field300.method2277(arg3);
            field300.method2124(arg1);
            field300.method2163(arg0);
            field300.method2173(Statics.field1826);
            field300.method2277(Statics.field23);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 22) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(137);
            field300.method2163(arg3);
            field300.method2154(class124.field1971[82] ? 1 : 0);
            field300.method2162(Statics.field982 + arg0);
            field300.method2163(Statics.field169 + arg1);
        }
        if (arg2 == 3) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(113);
            field300.method2162(Statics.field169 + arg1);
            field300.method2155(class124.field1971[82] ? 1 : 0);
            field300.method2162(arg3 >> 14 & 0x7FFF);
            field300.method2164(Statics.field982 + arg0);
        }
        if (arg2 == 25) {
            class152 var18 = class152.method526(arg1, arg0);
            if (var18 != null) {
                method2346();
                method26(arg1, arg0, class156.method570(Statics.method2146(var18)));
                field346 = 0;
                field417 = method2729(var18);
                if (field417 == null) {
                    field417 = "Null";
                }
                if (var18.field2529) {
                    field379 = var18.field2590 + class2.method3286(16777215);
                } else {
                    field379 = class2.method3286(65280) + var18.field2630 + class2.method3286(16777215);
                }
            }
            return;
        }
        if (arg2 == 19) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(184);
            field300.method2163(Statics.field982 + arg0);
            field300.method2164(Statics.field169 + arg1);
            field300.method2164(arg3);
            field300.method2242(class124.field1971[82] ? 1 : 0);
        }
        if (arg2 == 11) {
            class30 var19 = field297[arg3];
            if (var19 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(101);
                field300.method2155(class124.field1971[82] ? 1 : 0);
                field300.method2277(arg3);
            }
        }
        if (arg2 == 7) {
            class30 var20 = field297[arg3];
            if (var20 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(157);
                field300.method2163(Statics.field456);
                field300.method2242(class124.field1971[82] ? 1 : 0);
                field300.method2277(Statics.field23);
                field300.method2210(Statics.field1826);
                field300.method2277(arg3);
            }
        }
        if (arg2 == 26) {
            Statics.method565();
        }
        if (arg2 == 42) {
            field300.method2389(200);
            field300.method2276(arg1);
            field300.method2162(arg3);
            field300.method2163(arg0);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 39) {
            field300.method2389(36);
            field300.method2163(arg3);
            field300.method2162(arg0);
            field300.method2276(arg1);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 13) {
            class30 var21 = field297[arg3];
            if (var21 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(127);
                field300.method2242(class124.field1971[82] ? 1 : 0);
                field300.method2163(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var22 = field335[arg3];
            if (var22 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(124);
                field300.method2154(class124.field1971[82] ? 1 : 0);
                field300.method2164(arg3);
            }
        }
        if (arg2 == 49) {
            class3 var23 = field335[arg3];
            if (var23 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(144);
                field300.method2163(arg3);
                field300.method2242(class124.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            Statics.field236.method1660(Statics.field1762, arg0, arg1);
        }
        if (arg2 == 12) {
            class30 var24 = field297[arg3];
            if (var24 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(183);
                field300.method2242(class124.field1971[82] ? 1 : 0);
                field300.method2163(arg3);
            }
        }
        if (arg2 == 8) {
            class30 var25 = field297[arg3];
            if (var25 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(170);
                field300.method2276(Statics.field2662);
                field300.method2164(field416);
                field300.method2277(arg3);
                field300.method2120(class124.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var26 = field335[arg3];
            if (var26 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(30);
                field300.method2164(Statics.field23);
                field300.method2162(arg3);
                field300.method2124(Statics.field1826);
                field300.method2277(Statics.field456);
                field300.method2242(class124.field1971[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var27 = field335[arg3];
            if (var27 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(152);
                field300.method2120(class124.field1971[82] ? 1 : 0);
                field300.method2162(arg3);
            }
        }
        if (arg2 == 6) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(229);
            field300.method2277(Statics.field169 + arg1);
            field300.method2163(Statics.field982 + arg0);
            field300.method2120(class124.field1971[82] ? 1 : 0);
            field300.method2164(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 32) {
            field300.method2389(133);
            field300.method2210(Statics.field2662);
            field300.method2277(arg3);
            field300.method2277(field416);
            field300.method2277(arg0);
            field300.method2210(arg1);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 10) {
            class30 var28 = field297[arg3];
            if (var28 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(2);
                field300.method2155(class124.field1971[82] ? 1 : 0);
                field300.method2277(arg3);
            }
        }
        if (arg2 == 24) {
            class152 var29 = Statics.method159(arg1);
            boolean var30 = true;
            if (var29.field2534 > 0) {
                var30 = method2824(var29);
            }
            if (var30) {
                field300.method2389(132);
                field300.method2124(arg1);
            }
        }
        if (arg2 == 28) {
            field300.method2389(132);
            field300.method2124(arg1);
            class152 var31 = Statics.method159(arg1);
            if (var31.field2626 != null && var31.field2626[0][0] == 5) {
                int var32 = var31.field2626[0][1];
                class154.field2657[var32] = 1 - class154.field2657[var32];
                method3433(var32);
            }
        }
        if (arg2 == 1004) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field300.method2389(158);
            field300.method2277(arg3);
        }
        if (arg2 == 33) {
            field300.method2389(154);
            field300.method2162(arg0);
            field300.method2173(arg1);
            field300.method2277(arg3);
            field336 = 0;
            Statics.field564 = Statics.method159(arg1);
            field307 = arg0;
        }
        if (arg2 == 29) {
            field300.method2389(132);
            field300.method2124(arg1);
            class152 var33 = Statics.method159(arg1);
            if (var33.field2626 != null && var33.field2626[0][0] == 5) {
                int var34 = var33.field2626[0][1];
                if (class154.field2657[var34] != var33.field2562[0]) {
                    class154.field2657[var34] = var33.field2562[0];
                    method3433(var34);
                }
            }
        }
        if (arg2 == 18) {
            field365 = arg6;
            field366 = arg7;
            field290 = 2;
            field367 = 0;
            field377 = arg0;
            field489 = arg1;
            field300.method2389(180);
            field300.method2242(class124.field1971[82] ? 1 : 0);
            field300.method2162(Statics.field169 + arg1);
            field300.method2163(arg3);
            field300.method2164(Statics.field982 + arg0);
        }
        if (arg2 == 9) {
            class30 var35 = field297[arg3];
            if (var35 != null) {
                field365 = arg6;
                field366 = arg7;
                field290 = 2;
                field367 = 0;
                field377 = arg0;
                field489 = arg1;
                field300.method2389(114);
                field300.method2154(class124.field1971[82] ? 1 : 0);
                field300.method2164(arg3);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            method879(arg3, arg1, arg0, arg5);
        }
        if (field346 != 0) {
            field346 = 0;
            method535(Statics.method159(Statics.field1826));
        }
        if (field358) {
            method2346();
        }
        if (Statics.field564 != null && field336 == 0) {
            method535(Statics.field564);
        }
    }

    @ObfuscatedName("n.bc(ILjava/lang/String;I)V")
    public static void method75(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field279; var3++) {
            class3 var4 = field335[field260[var3]];
            if (var4 != null && var4.field46 != null && var4.field46.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field300.method2389(28);
                    field300.method2120(0);
                    field300.method2164(field260[var3]);
                } else if (arg0 == 4) {
                    field300.method2389(195);
                    field300.method2163(field260[var3]);
                    field300.method2154(0);
                } else if (arg0 == 6) {
                    field300.method2389(144);
                    field300.method2163(field260[var3]);
                    field300.method2242(0);
                } else if (arg0 == 7) {
                    field300.method2389(250);
                    field300.method2162(field260[var3]);
                    field300.method2155(0);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class10.method88(4, "", class142.field2295 + arg1);
        }
    }

    @ObfuscatedName("j.bt(IIIB)V")
    public static void method26(int arg0, int arg1, int arg2) {
        class152 var3 = class152.method526(arg0, arg1);
        if (var3 != null && var3.field2572 != null) {
            class1 var4 = new class1();
            var4.field1 = var3;
            var4.field15 = var3.field2572;
            class32.method487(var4);
        }
        field358 = true;
        Statics.field2662 = arg0;
        field416 = arg1;
        Statics.field14 = arg2;
        method535(var3);
    }

    @ObfuscatedName("dh.ba(B)V")
    public static void method2346() {
        if (!field358) {
            return;
        }
        class152 var0 = class152.method526(Statics.field2662, field416);
        if (var0 != null && var0.field2541 != null) {
            class1 var1 = new class1();
            var1.field1 = var0;
            var1.field15 = var0.field2541;
            class32.method487(var1);
        }
        field358 = false;
        method535(var0);
    }

    @ObfuscatedName("aq.bn(IIILjava/lang/String;I)V")
    public static void method879(int arg0, int arg1, int arg2, String arg3) {
        class152 var4 = class152.method526(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2528 != null) {
            class1 var5 = new class1();
            var5.field1 = var4;
            var5.field12 = arg0;
            var5.field10 = arg3;
            var5.field15 = var4.field2528;
            class32.method487(var5);
        }
        boolean var6 = true;
        if (var4.field2534 > 0) {
            var6 = method2824(var4);
        }
        if (!var6) {
            return;
        }
        int var7 = Statics.method2146(var4);
        int var8 = arg0 - 1;
        boolean var9 = (var7 >> var8 + 1 & 0x1) != 0;
        if (!var9) {
            return;
        }
        if (arg0 == 1) {
            field300.method2389(21);
            field300.method2124(arg1);
            field300.method2277(arg2);
        }
        if (arg0 == 2) {
            field300.method2389(89);
            field300.method2124(arg1);
            field300.method2277(arg2);
        }
        if (arg0 == 3) {
            field300.method2389(111);
            field300.method2124(arg1);
            field300.method2277(arg2);
        }
        if (arg0 == 4) {
            field300.method2389(140);
            field300.method2124(arg1);
            field300.method2277(arg2);
        }
        if (arg0 == 5) {
            field300.method2389(245);
            field300.method2124(arg1);
            field300.method2277(arg2);
        }
        if (arg0 == 6) {
            field300.method2389(85);
            field300.method2124(arg1);
            field300.method2277(arg2);
        }
        if (arg0 == 7) {
            field300.method2389(231);
            field300.method2124(arg1);
            field300.method2277(arg2);
        }
        if (arg0 == 8) {
            field300.method2389(161);
            field300.method2124(arg1);
            field300.method2277(arg2);
        }
        if (arg0 == 9) {
            field300.method2389(105);
            field300.method2124(arg1);
            field300.method2277(arg2);
        }
        if (arg0 == 10) {
            field300.method2389(24);
            field300.method2124(arg1);
            field300.method2277(arg2);
        }
    }

    @ObfuscatedName("ce.ci(I)V")
    public static final void method2051() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field368 - 1; var1++) {
                if (field370[var1] < 1000 && field370[var1 + 1] > 1000) {
                    String var2 = field408[var1];
                    field408[var1] = field408[var1 + 1];
                    field408[var1 + 1] = var2;
                    String var3 = field407[var1];
                    field407[var1] = field407[var1 + 1];
                    field407[var1 + 1] = var3;
                    int var4 = field370[var1];
                    field370[var1] = field370[var1 + 1];
                    field370[var1 + 1] = var4;
                    int var5 = field403[var1];
                    field403[var1] = field403[var1 + 1];
                    field403[var1 + 1] = var5;
                    int var6 = field391[var1];
                    field391[var1] = field391[var1 + 1];
                    field391[var1 + 1] = var6;
                    int var7 = field406[var1];
                    field406[var1] = field406[var1 + 1];
                    field406[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("d.cj(Ljava/lang/String;Ljava/lang/String;IIIIS)V")
    public static final void method531(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field401 || field368 >= 500) {
            return;
        }
        field407[field368] = arg0;
        field408[field368] = arg1;
        field370[field368] = arg2;
        field406[field368] = arg3;
        field403[field368] = arg4;
        field391[field368] = arg5;
        field368++;
    }

    @ObfuscatedName("k.cw(IB)Ljava/lang/String;")
    public static String method126(int arg0) {
        return field408[arg0].length() > 0 ? field407[arg0] + class142.field2166 + field408[arg0] : field407[arg0];
    }

    @ObfuscatedName("k.cx(Las;IIIB)V")
    public static final void method128(class35 arg0, int arg1, int arg2, int arg3) {
        if (field368 >= 400) {
            return;
        }
        if (arg0.field800 != null) {
            arg0 = arg0.method614();
        }
        if (arg0 == null || !arg0.field823 || arg0.field827 && field444 != arg1) {
            return;
        }
        String var4 = arg0.field797;
        if (arg0.field814 != 0) {
            var4 = var4 + method1983(arg0.field814, Statics.field578.field38) + " " + class2.field22 + class142.field2221 + arg0.field814 + class2.field33;
        }
        if (field346 == 1) {
            method531(class142.field2363, field414 + " " + class2.field24 + " " + class2.method3286(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field358) {
            String[] var5 = arg0.field812;
            if (field430) {
                var5 = method2574(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class142.field2298)) {
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
                        method531(var5[var6], class2.method3286(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class142.field2298)) {
                        short var9 = 0;
                        if (field285 == class18.field522 || field285 == class18.field524 && arg0.field814 > Statics.field578.field38) {
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
                        method531(var5[var8], class2.method3286(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method531(class142.field2297, class2.method3286(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field14 & 0x2) == 2) {
            method531(field417, field379 + " " + class2.field24 + " " + class2.method3286(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dd.cs(Lx;IIII)V")
    public static final void method2446(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field578 == arg0 || field368 >= 400) {
            return;
        }
        String var4;
        if (arg0.field39 == 0) {
            var4 = arg0.field46 + method1983(arg0.field38, Statics.field578.field38) + " " + class2.field22 + class142.field2221 + arg0.field38 + class2.field33;
        } else {
            var4 = arg0.field46 + " " + class2.field22 + class142.field2275 + arg0.field39 + class2.field33;
        }
        if (field346 == 1) {
            method531(class142.field2363, field414 + " " + class2.field24 + " " + class2.method3286(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field358) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field389[var5] != null) {
                    short var6 = 0;
                    if (field389[var5].equalsIgnoreCase(class142.field2298)) {
                        if (field285 == class18.field522 || field285 == class18.field524 && arg0.field38 > Statics.field578.field38) {
                            var6 = 2000;
                        }
                        if (Statics.field578.field50 != 0 && arg0.field50 != 0) {
                            if (Statics.field578.field50 == arg0.field50) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field390[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field388[var5] + var6;
                    method531(field389[var5], class2.method3286(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field14 & 0x8) == 8) {
            method531(field417, field379 + " " + class2.field24 + " " + class2.method3286(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field368; var9++) {
            if (field370[var9] == 23) {
                field408[var9] = class2.method3286(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("cf.cn(III)Ljava/lang/String;")
    public static final String method1983(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method3286(16711680);
        } else if (var2 < -6) {
            return class2.method3286(16723968);
        } else if (var2 < -3) {
            return class2.method3286(16740352);
        } else if (var2 < 0) {
            return class2.method3286(16756736);
        } else if (var2 > 9) {
            return class2.method3286(65280);
        } else if (var2 > 6) {
            return class2.method3286(4259584);
        } else if (var2 > 3) {
            return class2.method3286(8453888);
        } else if (var2 > 0) {
            return class2.method3286(12648192);
        } else {
            return class2.method3286(16776960);
        }
    }

    @ObfuscatedName("db.cr(IIIIIIIIB)V")
    public static final void method2383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class152.method139(arg0)) {
            Statics.field63 = null;
            method2073(Statics.field2628[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field63 != null) {
                method2073(Statics.field63, -1412584499, arg1, arg2, arg3, arg4, Statics.field2484, Statics.field144, arg7);
                Statics.field63 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field464[var8] = true;
            }
        } else {
            field464[arg7] = true;
        }
    }

    @ObfuscatedName("cb.cq([Lec;IIIIIIIII)V")
    public static final void method2073(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1559(arg2, arg3, arg4, arg5);
        class84.method1791();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class152 var10 = arg0[var9];
            if (var10 != null && (var10.field2582 == arg1 || arg1 == -1412584499 && field431 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field467[field450] = var10.field2535 + arg6;
                    field517[field450] = var10.field2536 + arg7;
                    field469[field450] = var10.field2575;
                    field470[field450] = var10.field2540;
                    var11 = ++field450 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2645 = var11;
                var10.field2646 = field376;
                if (!var10.field2529 || !method528(var10)) {
                    if (var10.field2534 > 0) {
                        method486(var10);
                    }
                    int var12 = var10.field2535 + arg6;
                    int var13 = var10.field2536 + arg7;
                    int var14 = var10.field2552;
                    if (field431 == var10) {
                        if (arg1 != -1412584499 && !var10.field2595) {
                            Statics.field63 = arg0;
                            Statics.field2484 = arg6;
                            Statics.field144 = arg7;
                            continue;
                        }
                        if (field442 && field436) {
                            int var15 = class127.field2004;
                            int var16 = class127.field2005;
                            int var17 = var15 - field433;
                            int var18 = var16 - field331;
                            if (var17 < field437) {
                                var17 = field437;
                            }
                            if (var10.field2575 + var17 > field437 + field518.field2575) {
                                var17 = field437 + field518.field2575 - var10.field2575;
                            }
                            if (var18 < field471) {
                                var18 = field471;
                            }
                            if (var10.field2540 + var18 > field471 + field518.field2540) {
                                var18 = field471 + field518.field2540 - var10.field2540;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2595) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2580 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2580 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2575 + var12;
                        int var26 = var10.field2540 + var13;
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
                        int var29 = var10.field2575 + var12;
                        int var30 = var10.field2540 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2529 || var19 < var21 && var20 < var22) {
                        if (var10.field2534 != 0) {
                            if (var10.field2534 == 1337) {
                                field409 = var12;
                                field410 = var13;
                                method2081(var12, var13, var10.field2575, var10.field2540);
                                class73.method1559(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2534 == 1338) {
                                method546();
                                class73.method1559(var12, var13, Statics.field942.field1312 + var12, Statics.field942.field1315 + var13);
                                if (field490 == 2 || field490 == 5) {
                                    class73.method1519(var12 + 25, var13 + 5, 0, Statics.field1081, Statics.field134);
                                } else {
                                    int var31 = field458 + field330 & 0x7FF;
                                    int var32 = Statics.field578.field762 / 32 + 48;
                                    int var33 = 464 - Statics.field578.field726 / 32;
                                    Statics.field191.method1445(var12 + 25, var13 + 5, 146, 151, var32, var33, var31, field332 + 256, Statics.field1081, Statics.field134);
                                    for (int var34 = 0; var34 < field484; var34++) {
                                        int var35 = field485[var34] * 4 + 2 - Statics.field578.field762 / 32;
                                        int var36 = field486[var34] * 4 + 2 - Statics.field578.field726 / 32;
                                        method490(var12, var13, var35, var36, field487[var34]);
                                    }
                                    for (int var37 = 0; var37 < 104; var37++) {
                                        for (int var38 = 0; var38 < 104; var38++) {
                                            class177 var39 = field393[Statics.field1762][var37][var38];
                                            if (var39 != null) {
                                                int var40 = var37 * 4 + 2 - Statics.field578.field762 / 32;
                                                int var41 = var38 * 4 + 2 - Statics.field578.field726 / 32;
                                                method490(var12, var13, var40, var41, Statics.field222[0]);
                                            }
                                        }
                                    }
                                    for (int var42 = 0; var42 < field298; var42++) {
                                        class30 var43 = field297[field299[var42]];
                                        if (var43 != null && var43.method12()) {
                                            class35 var44 = var43.field692;
                                            if (var44 != null && var44.field800 != null) {
                                                var44 = var44.method614();
                                            }
                                            if (var44 != null && var44.field813 && var44.field823) {
                                                int var45 = var43.field762 / 32 - Statics.field578.field762 / 32;
                                                int var46 = var43.field726 / 32 - Statics.field578.field726 / 32;
                                                method490(var12, var13, var45, var46, Statics.field222[1]);
                                            }
                                        }
                                    }
                                    for (int var47 = 0; var47 < field279; var47++) {
                                        class3 var48 = field335[field260[var47]];
                                        if (var48 != null && var48.method12()) {
                                            int var49 = var48.field762 / 32 - Statics.field578.field762 / 32;
                                            int var50 = var48.field726 / 32 - Statics.field578.field726 / 32;
                                            boolean var51 = false;
                                            if (method2538(var48.field46, true)) {
                                                var51 = true;
                                            }
                                            boolean var52 = false;
                                            for (int var53 = 0; var53 < Statics.field2029; var53++) {
                                                if (var48.field46.equals(Statics.field1452[var53].field567)) {
                                                    var52 = true;
                                                    break;
                                                }
                                            }
                                            boolean var54 = false;
                                            if (Statics.field578.field50 != 0 && var48.field50 != 0 && Statics.field578.field50 == var48.field50) {
                                                var54 = true;
                                            }
                                            if (var51) {
                                                method490(var12, var13, var49, var50, Statics.field222[3]);
                                            } else if (var54) {
                                                method490(var12, var13, var49, var50, Statics.field222[4]);
                                            } else if (var52) {
                                                method490(var12, var13, var49, var50, Statics.field222[5]);
                                            } else {
                                                method490(var12, var13, var49, var50, Statics.field222[2]);
                                            }
                                        }
                                    }
                                    if (field385 != 0 && field376 % 20 < 10) {
                                        if (field385 == 1 && field405 >= 0 && field405 < field297.length) {
                                            class30 var55 = field297[field405];
                                            if (var55 != null) {
                                                int var56 = var55.field762 / 32 - Statics.field578.field762 / 32;
                                                int var57 = var55.field726 / 32 - Statics.field578.field726 / 32;
                                                method90(var12, var13, var56, var57, Statics.field2399[1]);
                                            }
                                        }
                                        if (field385 == 2) {
                                            int var58 = field462 * 4 - Statics.field982 * 4 + 2 - Statics.field578.field762 / 32;
                                            int var59 = field295 * 4 - Statics.field169 * 4 + 2 - Statics.field578.field726 / 32;
                                            method90(var12, var13, var58, var59, Statics.field2399[1]);
                                        }
                                        if (field385 == 10 && field278 >= 0 && field278 < field335.length) {
                                            class3 var60 = field335[field278];
                                            if (var60 != null) {
                                                int var61 = var60.field762 / 32 - Statics.field578.field762 / 32;
                                                int var62 = var60.field726 / 32 - Statics.field578.field726 / 32;
                                                method90(var12, var13, var61, var62, Statics.field2399[1]);
                                            }
                                        }
                                    }
                                    if (field377 != 0) {
                                        int var63 = field377 * 4 + 2 - Statics.field578.field762 / 32;
                                        int var64 = field489 * 4 + 2 - Statics.field578.field726 / 32;
                                        method490(var12, var13, var63, var64, Statics.field2399[0]);
                                    }
                                    class73.method1523(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field490 < 3) {
                                    Statics.field2130.method1445(var12, var13, 33, 33, 25, 25, field458, 256, Statics.field135, Statics.field620);
                                } else {
                                    class73.method1519(var12, var13, 0, Statics.field135, Statics.field620);
                                }
                                if (field466[var11]) {
                                    Statics.field942.method1584(var12, var13);
                                }
                                field465[var11] = true;
                                class73.method1559(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2580 == 0) {
                            if (!var10.field2529 && method528(var10) && Statics.field1275 != var10) {
                                continue;
                            }
                            if (!var10.field2529) {
                                if (var10.field2544 > var10.field2546 - var10.field2540) {
                                    var10.field2544 = var10.field2546 - var10.field2540;
                                }
                                if (var10.field2544 < 0) {
                                    var10.field2544 = 0;
                                }
                            }
                            method2073(arg0, var10.field2530, var19, var20, var21, var22, var12 - var10.field2543, var13 - var10.field2544, var11);
                            if (var10.field2633 != null) {
                                method2073(var10.field2633, var10.field2530, var19, var20, var21, var22, var12 - var10.field2543, var13 - var10.field2544, var11);
                            }
                            class4 var65 = (class4) field420.method3157((long) var10.field2530);
                            if (var65 != null) {
                                method2383(var65.field54, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class73.method1559(arg2, arg3, arg4, arg5);
                            class84.method1791();
                        }
                        if (field466[var11] || field404 > 1) {
                            if (var10.field2580 == 0 && !var10.field2529 && var10.field2546 > var10.field2540) {
                                int var66 = var10.field2575 + var12;
                                int var67 = var10.field2544;
                                int var68 = var10.field2540;
                                int var69 = var10.field2546;
                                Statics.field374[0].method1584(var66, var13);
                                Statics.field374[1].method1584(var66, var13 + var68 - 16);
                                class73.method1523(var66, var13 + 16, 16, var68 - 32, field268);
                                int var70 = (var68 - 32) * var68 / var69;
                                if (var70 < 8) {
                                    var70 = 8;
                                }
                                int var71 = (var68 - 32 - var70) * var67 / (var69 - var68);
                                class73.method1523(var66, var13 + 16 + var71, 16, var70, field337);
                                class73.method1529(var66, var13 + 16 + var71, var70, field339);
                                class73.method1529(var66 + 1, var13 + 16 + var71, var70, field339);
                                class73.method1527(var66, var13 + 16 + var71, 16, field339);
                                class73.method1527(var66, var13 + 17 + var71, 16, field339);
                                class73.method1529(var66 + 15, var13 + 16 + var71, var70, field338);
                                class73.method1529(var66 + 14, var13 + 17 + var71, var70 - 1, field338);
                                class73.method1527(var66, var13 + 15 + var71 + var70, 16, field338);
                                class73.method1527(var66 + 1, var13 + 14 + var71 + var70, 15, field338);
                            }
                            if (var10.field2580 != 1) {
                                if (var10.field2580 == 2) {
                                    int var72 = 0;
                                    for (int var73 = 0; var73 < var10.field2540; var73++) {
                                        for (int var74 = 0; var74 < var10.field2575; var74++) {
                                            int var75 = (var10.field2583 + 32) * var74 + var12;
                                            int var76 = (var10.field2584 + 32) * var73 + var13;
                                            if (var72 < 20) {
                                                var75 += var10.field2585[var72];
                                                var76 += var10.field2586[var72];
                                            }
                                            if (var10.field2563[var72] > 0) {
                                                boolean var77 = false;
                                                boolean var78 = false;
                                                int var79 = var10.field2563[var72] - 1;
                                                if (var75 + 32 > arg2 && var75 < arg4 && var76 + 32 > arg3 && var76 < arg5 || Statics.field2679 == var10 && field371 == var72) {
                                                    class72 var80;
                                                    if (field346 == 1 && Statics.field23 == var72 && Statics.field1826 == var10.field2530) {
                                                        var80 = class45.method164(var79, var10.field2601[var72], 2, 0, false);
                                                    } else {
                                                        var80 = class45.method164(var79, var10.field2601[var72], 1, 3153952, false);
                                                    }
                                                    if (var80 == null) {
                                                        method535(var10);
                                                    } else if (Statics.field2679 == var10 && field371 == var72) {
                                                        int var81 = class127.field2004 - field373;
                                                        int var82 = class127.field2005 - field324;
                                                        if (var81 < 5 && var81 > -5) {
                                                            var81 = 0;
                                                        }
                                                        if (var82 < 5 && var82 > -5) {
                                                            var82 = 0;
                                                        }
                                                        if (field413 < 5) {
                                                            var81 = 0;
                                                            var82 = 0;
                                                        }
                                                        var80.method1441(var75 + var81, var76 + var82, 128);
                                                        if (arg1 != -1) {
                                                            class152 var83 = arg0[arg1 & 0xFFFF];
                                                            if (var76 + var82 < class73.field1309 && var83.field2544 > 0) {
                                                                int var84 = field421 * (class73.field1309 - var76 - var82) / 3;
                                                                if (var84 > field421 * 10) {
                                                                    var84 = field421 * 10;
                                                                }
                                                                if (var84 > var83.field2544) {
                                                                    var84 = var83.field2544;
                                                                }
                                                                var83.field2544 -= var84;
                                                                field324 += var84;
                                                                method535(var83);
                                                            }
                                                            if (var76 + var82 + 32 > class73.field1305 && var83.field2544 < var83.field2546 - var83.field2540) {
                                                                int var85 = field421 * (var76 + var82 + 32 - class73.field1305) / 3;
                                                                if (var85 > field421 * 10) {
                                                                    var85 = field421 * 10;
                                                                }
                                                                if (var85 > var83.field2546 - var83.field2540 - var83.field2544) {
                                                                    var85 = var83.field2546 - var83.field2540 - var83.field2544;
                                                                }
                                                                var83.field2544 += var85;
                                                                field324 -= var85;
                                                                method535(var83);
                                                            }
                                                        }
                                                    } else if (Statics.field564 == var10 && field307 == var72) {
                                                        var80.method1441(var75, var76, 128);
                                                    } else {
                                                        var80.method1435(var75, var76);
                                                    }
                                                }
                                            } else if (var10.field2587 != null && var72 < 20) {
                                                class72 var86 = var10.method2852(var72);
                                                if (var86 != null) {
                                                    var86.method1435(var75, var76);
                                                } else if (class152.field2636) {
                                                    method535(var10);
                                                }
                                            }
                                            var72++;
                                        }
                                    }
                                } else if (var10.field2580 == 3) {
                                    int var87;
                                    if (method1787(var10)) {
                                        var87 = var10.field2548;
                                        if (Statics.field1275 == var10 && var10.field2550 != 0) {
                                            var87 = var10.field2550;
                                        }
                                    } else {
                                        var87 = var10.field2547;
                                        if (Statics.field1275 == var10 && var10.field2638 != 0) {
                                            var87 = var10.field2638;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2551) {
                                            class73.method1523(var12, var13, var10.field2575, var10.field2540, var87);
                                        } else {
                                            class73.method1581(var12, var13, var10.field2575, var10.field2540, var87);
                                        }
                                    } else if (var10.field2551) {
                                        class73.method1522(var12, var13, var10.field2575, var10.field2540, var87, 256 - (var14 & 0xFF));
                                    } else {
                                        class73.method1526(var12, var13, var10.field2575, var10.field2540, var87, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2580 == 4) {
                                    class191 var88 = var10.method2833();
                                    if (var88 != null) {
                                        String var89 = var10.field2625;
                                        int var90;
                                        if (method1787(var10)) {
                                            var90 = var10.field2548;
                                            if (Statics.field1275 == var10 && var10.field2550 != 0) {
                                                var90 = var10.field2550;
                                            }
                                            if (var10.field2578.length() > 0) {
                                                var89 = var10.field2578;
                                            }
                                        } else {
                                            var90 = var10.field2547;
                                            if (Statics.field1275 == var10 && var10.field2638 != 0) {
                                                var90 = var10.field2638;
                                            }
                                        }
                                        if (var10.field2529 && var10.field2634 != -1) {
                                            class45 var91 = class45.method2057(var10.field2634);
                                            var89 = var91.field1019;
                                            if (var89 == null) {
                                                var89 = "null";
                                            }
                                            if ((var91.field1041 == 1 || var10.field2635 != 1) && var10.field2635 != -1) {
                                                String var92 = class2.method3286(16748608) + var89 + class2.field26 + " " + 'x';
                                                int var93 = var10.field2635;
                                                String var94 = Integer.toString(var93);
                                                for (int var95 = var94.length() - 3; var95 > 0; var95 -= 3) {
                                                    var94 = var94.substring(0, var95) + class2.field20 + var94.substring(var95);
                                                }
                                                StringBuilder var10000;
                                                class142 var10001;
                                                String var96;
                                                if (var94.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method3286(65408)).append(var94.substring(0, var94.length() - 8));
                                                    var10001 = (class142) null;
                                                    var96 = var10000.append(class142.field2189).append(" ").append(class2.field22).append(var94).append(class2.field33).append(class2.field26).toString();
                                                } else if (var94.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method3286(16777215)).append(var94.substring(0, var94.length() - 4));
                                                    var10001 = (class142) null;
                                                    var96 = var10000.append(class142.field2220).append(" ").append(class2.field22).append(var94).append(class2.field33).append(class2.field26).toString();
                                                } else {
                                                    var96 = " " + class2.method3286(16776960) + var94 + class2.field26;
                                                }
                                                var89 = var92 + var96;
                                            }
                                        }
                                        if (field423 == var10) {
                                            class142 var160 = (class142) null;
                                            var89 = class142.field2304;
                                            var90 = var10.field2547;
                                        }
                                        if (!var10.field2529) {
                                            var89 = method497(var89, var10);
                                        }
                                        var88.method3366(var89, var12, var13, var10.field2575, var10.field2540, var90, var10.field2554 ? 0 : -1, var10.field2632, var10.field2579, var10.field2526);
                                    } else if (class152.field2636) {
                                        method535(var10);
                                    }
                                } else if (var10.field2580 == 5) {
                                    if (var10.field2529) {
                                        class72 var98;
                                        if (var10.field2634 == -1) {
                                            var98 = var10.method2832(false);
                                        } else {
                                            var98 = class45.method164(var10.field2634, var10.field2635, var10.field2611, var10.field2559, false);
                                        }
                                        if (var98 != null) {
                                            int var99 = var98.field1298;
                                            int var100 = var98.field1299;
                                            if (var10.field2557) {
                                                class73.method1550(var12, var13, var10.field2575 + var12, var10.field2540 + var13);
                                                int var101 = (var10.field2575 + (var99 - 1)) / var99;
                                                int var102 = (var10.field2540 + (var100 - 1)) / var100;
                                                for (int var103 = 0; var103 < var101; var103++) {
                                                    for (int var104 = 0; var104 < var102; var104++) {
                                                        if (var10.field2556 != 0) {
                                                            var98.method1447(var99 / 2 + var99 * var103 + var12, var100 / 2 + var100 * var104 + var13, var10.field2556, 4096);
                                                        } else if (var14 == 0) {
                                                            var98.method1435(var99 * var103 + var12, var100 * var104 + var13);
                                                        } else {
                                                            var98.method1441(var99 * var103 + var12, var100 * var104 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1559(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var105 = var10.field2575 * 4096 / var99;
                                                if (var10.field2556 != 0) {
                                                    var98.method1447(var10.field2575 / 2 + var12, var10.field2540 / 2 + var13, var10.field2556, var105);
                                                } else if (var14 != 0) {
                                                    var98.method1443(var12, var13, var10.field2575, var10.field2540, 256 - (var14 & 0xFF));
                                                } else if (var10.field2575 == var99 && var10.field2540 == var100) {
                                                    var98.method1435(var12, var13);
                                                } else {
                                                    var98.method1437(var12, var13, var10.field2575, var10.field2540);
                                                }
                                            }
                                        } else if (class152.field2636) {
                                            method535(var10);
                                        }
                                    } else {
                                        class72 var97 = var10.method2832(method1787(var10));
                                        if (var97 != null) {
                                            var97.method1435(var12, var13);
                                        } else if (class152.field2636) {
                                            method535(var10);
                                        }
                                    }
                                } else if (var10.field2580 == 6) {
                                    boolean var106 = method1787(var10);
                                    int var107;
                                    if (var106) {
                                        var107 = var10.field2567;
                                    } else {
                                        var107 = var10.field2566;
                                    }
                                    class98 var108 = null;
                                    int var109 = 0;
                                    if (var10.field2634 != -1) {
                                        class45 var110 = class45.method2057(var10.field2634);
                                        if (var110 != null) {
                                            class45 var111 = var110.method842(var10.field2635);
                                            var108 = var111.method871(1);
                                            if (var108 == null) {
                                                method535(var10);
                                            } else {
                                                var108.method1989();
                                                var109 = var108.field1346 / 2;
                                            }
                                        }
                                    } else if (var10.field2588 == 5) {
                                        if (var10.field2642 == 0) {
                                            var108 = field514.method2907((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var108 = Statics.field578.method19();
                                        }
                                    } else if (var107 == -1) {
                                        var108 = var10.method2835((class38) null, -1, var106, Statics.field578.field34);
                                        if (var108 == null && class152.field2636) {
                                            method535(var10);
                                        }
                                    } else {
                                        class38 var112 = Statics.method484(var107);
                                        var108 = var10.method2835(var112, var10.field2532, var106, Statics.field578.field34);
                                        if (var108 == null && class152.field2636) {
                                            method535(var10);
                                        }
                                    }
                                    class84.method1805(var10.field2575 / 2 + var12, var10.field2540 / 2 + var13);
                                    int var113 = var10.field2620 * class84.field1470[var10.field2570] >> 16;
                                    int var114 = var10.field2620 * class84.field1484[var10.field2570] >> 16;
                                    if (var108 != null) {
                                        if (var10.field2529) {
                                            var108.method1989();
                                            if (var10.field2615) {
                                                var108.method2024(0, var10.field2607, var10.field2608, var10.field2570, var10.field2568, var10.field2569 + var109 + var113, var10.field2569 + var114, var10.field2620);
                                            } else {
                                                var108.method2001(0, var10.field2607, var10.field2608, var10.field2570, var10.field2568, var10.field2569 + var109 + var113, var10.field2569 + var114);
                                            }
                                        } else {
                                            var108.method2001(0, var10.field2607, 0, var10.field2570, 0, var113, var114);
                                        }
                                    }
                                    class84.method1841();
                                } else {
                                    if (var10.field2580 == 7) {
                                        class191 var115 = var10.method2833();
                                        if (var115 == null) {
                                            if (class152.field2636) {
                                                method535(var10);
                                            }
                                            continue;
                                        }
                                        int var116 = 0;
                                        for (int var117 = 0; var117 < var10.field2540; var117++) {
                                            for (int var118 = 0; var118 < var10.field2575; var118++) {
                                                if (var10.field2563[var116] > 0) {
                                                    class45 var119 = class45.method2057(var10.field2563[var116] - 1);
                                                    String var120;
                                                    if (var119.field1041 != 1 && var10.field2601[var116] == 1) {
                                                        var120 = class2.method3286(16748608) + var119.field1019 + class2.field26;
                                                    } else {
                                                        String var121 = class2.method3286(16748608) + var119.field1019 + class2.field26 + " " + 'x';
                                                        int var122 = var10.field2601[var116];
                                                        String var123 = Integer.toString(var122);
                                                        for (int var124 = var123.length() - 3; var124 > 0; var124 -= 3) {
                                                            var123 = var123.substring(0, var124) + class2.field20 + var123.substring(var124);
                                                        }
                                                        String var125;
                                                        if (var123.length() > 9) {
                                                            var125 = " " + class2.method3286(65408) + var123.substring(0, var123.length() - 8) + class142.field2189 + " " + class2.field22 + var123 + class2.field33 + class2.field26;
                                                        } else if (var123.length() > 6) {
                                                            var125 = " " + class2.method3286(16777215) + var123.substring(0, var123.length() - 4) + class142.field2220 + " " + class2.field22 + var123 + class2.field33 + class2.field26;
                                                        } else {
                                                            var125 = " " + class2.method3286(16776960) + var123 + class2.field26;
                                                        }
                                                        var120 = var121 + var125;
                                                    }
                                                    int var126 = (var10.field2583 + 115) * var118 + var12;
                                                    int var127 = (var10.field2584 + 12) * var117 + var13;
                                                    if (var10.field2632 == 0) {
                                                        var115.method3308(var120, var126, var127, var10.field2547, var10.field2554 ? 0 : -1);
                                                    } else if (var10.field2632 == 1) {
                                                        var115.method3310(var120, var10.field2575 / 2 + var126, var127, var10.field2547, var10.field2554 ? 0 : -1);
                                                    } else {
                                                        var115.method3309(var120, var10.field2575 + var126 - 1, var127, var10.field2547, var10.field2554 ? 0 : -1);
                                                    }
                                                }
                                                var116++;
                                            }
                                        }
                                    }
                                    if (var10.field2580 == 8 && Statics.field2109 == var10 && field411 == field266) {
                                        int var128 = 0;
                                        int var129 = 0;
                                        class191 var130 = Statics.field61;
                                        String var131 = var10.field2625;
                                        String var132 = method497(var131, var10);
                                        while (var132.length() > 0) {
                                            int var133 = var132.indexOf(class2.field25);
                                            String var134;
                                            if (var133 == -1) {
                                                var134 = var132;
                                                var132 = "";
                                            } else {
                                                var134 = var132.substring(0, var133);
                                                var132 = var132.substring(var133 + 4);
                                            }
                                            int var135 = var130.method3342(var134);
                                            if (var135 > var128) {
                                                var128 = var135;
                                            }
                                            var129 += var130.field2898 + 1;
                                        }
                                        var128 += 6;
                                        var129 += 7;
                                        int var136 = var10.field2575 + var12 - 5 - var128;
                                        int var137 = var10.field2540 + var13 + 5;
                                        if (var136 < var12 + 5) {
                                            var136 = var12 + 5;
                                        }
                                        if (var128 + var136 > arg4) {
                                            var136 = arg4 - var128;
                                        }
                                        if (var129 + var137 > arg5) {
                                            var137 = arg5 - var129;
                                        }
                                        class73.method1523(var136, var137, var128, var129, 16777120);
                                        class73.method1581(var136, var137, var128, var129, 0);
                                        String var138 = var10.field2625;
                                        int var139 = var130.field2898 + var137 + 2;
                                        String var140 = method497(var138, var10);
                                        while (var140.length() > 0) {
                                            int var141 = var140.indexOf(class2.field25);
                                            String var142;
                                            if (var141 == -1) {
                                                var142 = var140;
                                                var140 = "";
                                            } else {
                                                var142 = var140.substring(0, var141);
                                                var140 = var140.substring(var141 + 4);
                                            }
                                            var130.method3308(var142, var136 + 3, var139, 0, -1);
                                            var139 += var130.field2898 + 1;
                                        }
                                    }
                                    if (var10.field2580 == 9) {
                                        if (var10.field2553 == 1) {
                                            class73.method1517(var12, var13, var10.field2575 + var12, var10.field2540 + var13, var10.field2547);
                                        } else {
                                            int var143 = var10.field2575 >= 0 ? var10.field2575 : -var10.field2575;
                                            int var144 = var10.field2540 >= 0 ? var10.field2540 : -var10.field2540;
                                            int var145 = var143;
                                            if (var143 < var144) {
                                                var145 = var144;
                                            }
                                            if (var145 != 0) {
                                                int var146 = (var10.field2575 << 16) / var145;
                                                int var147 = (var10.field2540 << 16) / var145;
                                                if (var147 <= var146) {
                                                    var146 = -var146;
                                                } else {
                                                    var147 = -var147;
                                                }
                                                int var148 = var10.field2553 * var147 >> 17;
                                                int var149 = var10.field2553 * var147 + 1 >> 17;
                                                int var150 = var10.field2553 * var146 >> 17;
                                                int var151 = var10.field2553 * var146 + 1 >> 17;
                                                int var152 = var12 + var148;
                                                int var153 = var12 - var149;
                                                int var154 = var10.field2575 + var12 - var149;
                                                int var155 = var10.field2575 + var12 + var148;
                                                int var156 = var13 + var150;
                                                int var157 = var13 - var151;
                                                int var158 = var10.field2540 + var13 - var151;
                                                int var159 = var10.field2540 + var13 + var150;
                                                class84.method1799(var152, var153, var154);
                                                class84.method1813(var156, var157, var158, var152, var153, var154, var10.field2547);
                                                class84.method1799(var152, var154, var155);
                                                class84.method1813(var156, var158, var159, var152, var154, var155, var10.field2547);
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

    @ObfuscatedName("a.cz(Ljava/lang/String;Lec;I)Ljava/lang/String;")
    public static String method497(String arg0, class152 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2447(method2677(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field98 != null) {
                    int var6 = Statics.field98.field2072;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field98.field2069 != null) {
                        var5 = (String) Statics.field98.field2069;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("eh.ck(Lec;IIIIIIB)V")
    public static final void method2869(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field258) {
            field402 = 32;
        } else {
            field402 = 0;
        }
        field258 = false;
        if (class127.field2011 == 1 || !Statics.field1901 && class127.field2011 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2544 -= 4;
                method535(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2544 += 4;
                method535(arg0);
            } else if (arg5 >= arg1 - field402 && arg5 < field402 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2544 = (arg4 - arg3) * var8 / var9;
                method535(arg0);
                field258 = true;
            }
        }
        if (field457 == 0) {
            return;
        }
        int var10 = arg0.field2575;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2544 += field457 * 45;
            method535(arg0);
        }
    }

    @ObfuscatedName("dd.cc(IB)Ljava/lang/String;")
    public static final String method2447(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("cj.cv(Lec;I)Z")
    public static final boolean method1787(class152 arg0) {
        if (arg0.field2609 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2609.length; var1++) {
            int var2 = method2677(arg0, var1);
            int var3 = arg0.field2562[var1];
            if (arg0.field2609[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2609[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2609[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("es.co(Lec;II)I")
    public static final int method2677(class152 arg0, int arg1) {
        if (arg0.field2626 == null || arg1 >= arg0.field2626.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2626[arg1];
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
                    var7 = field397[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field398[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field399[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class152 var11 = Statics.method159(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method2057(var12).field1032 || field263)) {
                        for (int var13 = 0; var13 < var11.field2563.length; var13++) {
                            if (var12 + 1 == var11.field2563[var13]) {
                                var7 += var11.field2601[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class154.field2657[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2135[field398[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class154.field2657[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field578.field38;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2134[var14]) {
                            var7 += field398[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class152 var17 = Statics.method159(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method2057(var18).field1032 || field263)) {
                        for (int var19 = 0; var19 < var17.field2563.length; var19++) {
                            if (var18 + 1 == var17.field2563[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field424;
                }
                if (var6 == 12) {
                    var7 = field425;
                }
                if (var6 == 13) {
                    int var20 = class154.field2657[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class154.method140(var22);
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
                    var7 = (Statics.field578.field762 >> 7) + Statics.field982;
                }
                if (var6 == 19) {
                    var7 = (Statics.field578.field726 >> 7) + Statics.field169;
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

    @ObfuscatedName("ax.cp(IIIIIIIS)V")
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class152.method139(arg0)) {
            method86(Statics.field2628[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("y.ct([Lec;IIIIIIII)V")
    public static final void method86(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class152 var9 = arg0[var8];
            if (var9 != null && (!var9.field2529 || var9.field2580 == 0 || var9.field2597 || Statics.method2146(var9) != 0 || field518 == var9) && var9.field2582 == arg1 && (!var9.field2529 || !method528(var9))) {
                int var10 = var9.field2535 + arg6;
                int var11 = var9.field2536 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2580 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2580 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2575 + var10;
                    int var19 = var9.field2540 + var11;
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
                    int var22 = var9.field2575 + var10;
                    int var23 = var9.field2540 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field431 == var9) {
                    field439 = true;
                    field440 = var10;
                    field441 = var11;
                }
                if (!var9.field2529 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2004;
                    int var25 = class127.field2005;
                    if (class127.field2010 != 0) {
                        var24 = class127.field2013;
                        var25 = class127.field2012;
                    }
                    if (var9.field2534 == 1337) {
                        method535(var9);
                        if (!field267 && !field401 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field346 == 0 && !field358) {
                                method531(class142.field2301, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            for (int var27 = 0; var27 < class98.field1749; var27++) {
                                int var28 = class98.field1750[var27];
                                int var29 = var28 & 0x7F;
                                int var30 = var28 >> 7 & 0x7F;
                                int var31 = var28 >> 29 & 0x3;
                                int var32 = var28 >> 14 & 0x7FFF;
                                if (var26 != var28) {
                                    var26 = var28;
                                    if (var31 == 2 && Statics.field236.method1755(Statics.field1762, var29, var30, var28) >= 0) {
                                        class36 var33 = class36.method28(var32);
                                        if (var33.field852 != null) {
                                            var33 = var33.method663();
                                        }
                                        if (var33 == null) {
                                            continue;
                                        }
                                        if (field346 == 1) {
                                            method531(class142.field2363, field414 + " " + class2.field24 + " " + class2.method3286(65535) + var33.field843, 1, var28, var29, var30);
                                        } else if (!field358) {
                                            String[] var34 = var33.field860;
                                            if (field430) {
                                                var34 = method2574(var34);
                                            }
                                            if (var34 != null) {
                                                for (int var35 = 4; var35 >= 0; var35--) {
                                                    if (var34[var35] != null) {
                                                        short var36 = 0;
                                                        if (var35 == 0) {
                                                            var36 = 3;
                                                        }
                                                        if (var35 == 1) {
                                                            var36 = 4;
                                                        }
                                                        if (var35 == 2) {
                                                            var36 = 5;
                                                        }
                                                        if (var35 == 3) {
                                                            var36 = 6;
                                                        }
                                                        if (var35 == 4) {
                                                            var36 = 1001;
                                                        }
                                                        method531(var34[var35], class2.method3286(65535) + var33.field843, var36, var28, var29, var30);
                                                    }
                                                }
                                            }
                                            method531(class142.field2297, class2.method3286(65535) + var33.field843, 1002, var33.field840 << 14, var29, var30);
                                        } else if ((Statics.field14 & 0x4) == 4) {
                                            method531(field417, field379 + " " + class2.field24 + " " + class2.method3286(65535) + var33.field843, 2, var28, var29, var30);
                                        }
                                    }
                                    if (var31 == 1) {
                                        class30 var37 = field297[var32];
                                        if (var37 == null) {
                                            continue;
                                        }
                                        if (var37.field692.field825 == 1 && (var37.field762 & 0x7F) == 64 && (var37.field726 & 0x7F) == 64) {
                                            for (int var38 = 0; var38 < field298; var38++) {
                                                class30 var39 = field297[field299[var38]];
                                                if (var39 != null && var37 != var39 && var39.field692.field825 == 1 && var37.field762 == var39.field762 && var37.field726 == var39.field726) {
                                                    method128(var39.field692, field299[var38], var29, var30);
                                                }
                                            }
                                            for (int var40 = 0; var40 < field279; var40++) {
                                                class3 var41 = field335[field260[var40]];
                                                if (var41 != null && var37.field762 == var41.field762 && var37.field726 == var41.field726) {
                                                    method2446(var41, field260[var40], var29, var30);
                                                }
                                            }
                                        }
                                        method128(var37.field692, var32, var29, var30);
                                    }
                                    if (var31 == 0) {
                                        class3 var42 = field335[var32];
                                        if (var42 == null) {
                                            continue;
                                        }
                                        if ((var42.field762 & 0x7F) == 64 && (var42.field726 & 0x7F) == 64) {
                                            for (int var43 = 0; var43 < field298; var43++) {
                                                class30 var44 = field297[field299[var43]];
                                                if (var44 != null && var44.field692.field825 == 1 && var42.field762 == var44.field762 && var42.field726 == var44.field726) {
                                                    method128(var44.field692, field299[var43], var29, var30);
                                                }
                                            }
                                            for (int var45 = 0; var45 < field279; var45++) {
                                                class3 var46 = field335[field260[var45]];
                                                if (var46 != null && var42 != var46 && var42.field762 == var46.field762 && var42.field726 == var46.field726) {
                                                    method2446(var46, field260[var45], var29, var30);
                                                }
                                            }
                                        }
                                        method2446(var42, var32, var29, var30);
                                    }
                                    if (var31 == 3) {
                                        class177 var47 = field393[Statics.field1762][var29][var30];
                                        if (var47 != null) {
                                            for (class25 var48 = (class25) var47.method3186(); var48 != null; var48 = (class25) var47.method3188()) {
                                                class45 var49 = class45.method2057(var48.field605);
                                                if (field346 == 1) {
                                                    method531(class142.field2363, field414 + " " + class2.field24 + " " + class2.method3286(16748608) + var49.field1019, 16, var48.field605, var29, var30);
                                                } else if (!field358) {
                                                    String[] var50 = var49.field1033;
                                                    if (field430) {
                                                        var50 = method2574(var50);
                                                    }
                                                    for (int var51 = 4; var51 >= 0; var51--) {
                                                        if (var50 != null && var50[var51] != null) {
                                                            byte var52 = 0;
                                                            if (var51 == 0) {
                                                                var52 = 18;
                                                            }
                                                            if (var51 == 1) {
                                                                var52 = 19;
                                                            }
                                                            if (var51 == 2) {
                                                                var52 = 20;
                                                            }
                                                            if (var51 == 3) {
                                                                var52 = 21;
                                                            }
                                                            if (var51 == 4) {
                                                                var52 = 22;
                                                            }
                                                            method531(var50[var51], class2.method3286(16748608) + var49.field1019, var52, var48.field605, var29, var30);
                                                        } else if (var51 == 2) {
                                                            method531(class142.field2365, class2.method3286(16748608) + var49.field1019, 20, var48.field605, var29, var30);
                                                        }
                                                    }
                                                    method531(class142.field2297, class2.method3286(16748608) + var49.field1019, 1004, var48.field605, var29, var30);
                                                } else if ((Statics.field14 & 0x1) == 1) {
                                                    method531(field417, field379 + " " + class2.field24 + " " + class2.method3286(16748608) + var49.field1019, 17, var48.field605, var29, var30);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var9.field2534 != 1338) {
                        if (!field401 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var64 = var24 - var10;
                            int var65 = var25 - var11;
                            if (var9.field2533 == 1) {
                                method531(var9.field2631, "", 24, 0, 0, var9.field2530);
                            }
                            if (var9.field2533 == 2 && !field358) {
                                String var66 = method2729(var9);
                                if (var66 != null) {
                                    method531(var66, class2.method3286(65280) + var9.field2630, 25, 0, -1, var9.field2530);
                                }
                            }
                            if (var9.field2533 == 3) {
                                method531(class142.field2240, "", 26, 0, 0, var9.field2530);
                            }
                            if (var9.field2533 == 4) {
                                method531(var9.field2631, "", 28, 0, 0, var9.field2530);
                            }
                            if (var9.field2533 == 5) {
                                method531(var9.field2631, "", 29, 0, 0, var9.field2530);
                            }
                            if (var9.field2533 == 6 && field423 == null) {
                                method531(var9.field2631, "", 30, 0, -1, var9.field2530);
                            }
                            if (var9.field2580 == 2) {
                                int var67 = 0;
                                for (int var68 = 0; var68 < var9.field2540; var68++) {
                                    for (int var69 = 0; var69 < var9.field2575; var69++) {
                                        int var70 = (var9.field2583 + 32) * var69;
                                        int var71 = (var9.field2584 + 32) * var68;
                                        if (var67 < 20) {
                                            var70 += var9.field2585[var67];
                                            var71 += var9.field2586[var67];
                                        }
                                        if (var64 >= var70 && var65 >= var71 && var64 < var70 + 32 && var65 < var71 + 32) {
                                            field319 = var67;
                                            Statics.field68 = var9;
                                            if (var9.field2563[var67] > 0) {
                                                class45 var72 = class45.method2057(var9.field2563[var67] - 1);
                                                if (field346 == 1 && class156.method2056(Statics.method2146(var9))) {
                                                    if (Statics.field1826 != var9.field2530 || Statics.field23 != var67) {
                                                        method531(class142.field2363, field414 + " " + class2.field24 + " " + class2.method3286(16748608) + var72.field1019, 31, var72.field1052, var67, var9.field2530);
                                                    }
                                                } else if (!field358 || !class156.method2056(Statics.method2146(var9))) {
                                                    String[] var73 = var72.field1034;
                                                    if (field430) {
                                                        var73 = method2574(var73);
                                                    }
                                                    if (class156.method2056(Statics.method2146(var9))) {
                                                        for (int var74 = 4; var74 >= 3; var74--) {
                                                            if (var73 != null && var73[var74] != null) {
                                                                byte var75;
                                                                if (var74 == 3) {
                                                                    var75 = 36;
                                                                } else {
                                                                    var75 = 37;
                                                                }
                                                                method531(var73[var74], class2.method3286(16748608) + var72.field1019, var75, var72.field1052, var67, var9.field2530);
                                                            } else if (var74 == 4) {
                                                                method531(class142.field2148, class2.method3286(16748608) + var72.field1019, 37, var72.field1052, var67, var9.field2530);
                                                            }
                                                        }
                                                    }
                                                    if (class156.method2671(Statics.method2146(var9))) {
                                                        method531(class142.field2363, class2.method3286(16748608) + var72.field1019, 38, var72.field1052, var67, var9.field2530);
                                                    }
                                                    if (class156.method2056(Statics.method2146(var9)) && var73 != null) {
                                                        for (int var76 = 2; var76 >= 0; var76--) {
                                                            if (var73[var76] != null) {
                                                                byte var77 = 0;
                                                                if (var76 == 0) {
                                                                    var77 = 33;
                                                                }
                                                                if (var76 == 1) {
                                                                    var77 = 34;
                                                                }
                                                                if (var76 == 2) {
                                                                    var77 = 35;
                                                                }
                                                                method531(var73[var76], class2.method3286(16748608) + var72.field1019, var77, var72.field1052, var67, var9.field2530);
                                                            }
                                                        }
                                                    }
                                                    String[] var78 = var9.field2571;
                                                    if (field430) {
                                                        var78 = method2574(var78);
                                                    }
                                                    if (var78 != null) {
                                                        for (int var79 = 4; var79 >= 0; var79--) {
                                                            if (var78[var79] != null) {
                                                                byte var80 = 0;
                                                                if (var79 == 0) {
                                                                    var80 = 39;
                                                                }
                                                                if (var79 == 1) {
                                                                    var80 = 40;
                                                                }
                                                                if (var79 == 2) {
                                                                    var80 = 41;
                                                                }
                                                                if (var79 == 3) {
                                                                    var80 = 42;
                                                                }
                                                                if (var79 == 4) {
                                                                    var80 = 43;
                                                                }
                                                                method531(var78[var79], class2.method3286(16748608) + var72.field1019, var80, var72.field1052, var67, var9.field2530);
                                                            }
                                                        }
                                                    }
                                                    method531(class142.field2297, class2.method3286(16748608) + var72.field1019, 1005, var72.field1052, var67, var9.field2530);
                                                } else if ((Statics.field14 & 0x10) == 16) {
                                                    method531(field417, field379 + " " + class2.field24 + " " + class2.method3286(16748608) + var72.field1019, 32, var72.field1052, var67, var9.field2530);
                                                }
                                            }
                                        }
                                        var67++;
                                    }
                                }
                            }
                            if (var9.field2529) {
                                if (field358) {
                                    int var81 = Statics.method2146(var9);
                                    boolean var82 = (var81 >> 21 & 0x1) != 0;
                                    if (var82 && (Statics.field14 & 0x20) == 32) {
                                        method531(field417, field379 + " " + class2.field24 + " " + var9.field2590, 58, 0, var9.field2531, var9.field2530);
                                    }
                                } else {
                                    for (int var83 = 9; var83 >= 5; var83--) {
                                        int var84 = Statics.method2146(var9);
                                        boolean var85 = (var84 >> var83 + 1 & 0x1) != 0;
                                        String var86;
                                        if (!var85 && var9.field2528 == null) {
                                            var86 = null;
                                        } else if (var9.field2591 == null || var9.field2591.length <= var83 || var9.field2591[var83] == null || var9.field2591[var83].trim().length() == 0) {
                                            var86 = null;
                                        } else {
                                            var86 = var9.field2591[var83];
                                        }
                                        if (var86 != null) {
                                            method531(var86, var9.field2590, 1007, var83 + 1, var9.field2531, var9.field2530);
                                        }
                                    }
                                    String var88 = method2729(var9);
                                    if (var88 != null) {
                                        method531(var88, var9.field2590, 25, 0, var9.field2531, var9.field2530);
                                    }
                                    for (int var89 = 4; var89 >= 0; var89--) {
                                        int var90 = Statics.method2146(var9);
                                        boolean var91 = (var90 >> var89 + 1 & 0x1) != 0;
                                        String var92;
                                        if (!var91 && var9.field2528 == null) {
                                            var92 = null;
                                        } else if (var9.field2591 == null || var9.field2591.length <= var89 || var9.field2591[var89] == null || var9.field2591[var89].trim().length() == 0) {
                                            var92 = null;
                                        } else {
                                            var92 = var9.field2591[var89];
                                        }
                                        if (var92 != null) {
                                            method531(var92, var9.field2590, 57, var89 + 1, var9.field2531, var9.field2530);
                                        }
                                    }
                                    int var94 = Statics.method2146(var9);
                                    boolean var95 = (var94 & 0x1) != 0;
                                    if (var95) {
                                        method531(class142.field2152, "", 30, 0, var9.field2531, var9.field2530);
                                    }
                                }
                            }
                        }
                        if (var9.field2580 == 0) {
                            if (!var9.field2529 && method528(var9) && Statics.field1275 != var9) {
                                continue;
                            }
                            method86(arg0, var9.field2530, var12, var13, var14, var15, var10 - var9.field2543, var11 - var9.field2544);
                            if (var9.field2633 != null) {
                                method86(var9.field2633, var9.field2530, var12, var13, var14, var15, var10 - var9.field2543, var11 - var9.field2544);
                            }
                            class4 var96 = (class4) field420.method3157((long) var9.field2530);
                            if (var96 != null) {
                                if (var96.field55 == 0 && class127.field2004 >= var12 && class127.field2005 >= var13 && class127.field2004 < var14 && class127.field2005 < var15 && !field401 && !field516) {
                                    field407[0] = class142.field2248;
                                    field408[0] = "";
                                    field370[0] = 1006;
                                    field368 = 1;
                                }
                                method1009(var96.field54, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2529) {
                            if (var9.field2647 && class127.field2004 >= var12 && class127.field2005 >= var13 && class127.field2004 < var14 && class127.field2005 < var15) {
                                for (class1 var97 = (class1) field493.method3185(); var97 != null; var97 = (class1) field493.method3187()) {
                                    if (var97.field2) {
                                        var97.method3260();
                                        var97.field1.field2639 = false;
                                    }
                                }
                                if (Statics.field723 == 0) {
                                    field431 = null;
                                    field518 = null;
                                }
                                if (!field401) {
                                    field407[0] = class142.field2248;
                                    field408[0] = "";
                                    field370[0] = 1006;
                                    field368 = 1;
                                }
                            }
                            boolean var98;
                            if (class127.field2004 >= var12 && class127.field2005 >= var13 && class127.field2004 < var14 && class127.field2005 < var15) {
                                var98 = true;
                            } else {
                                var98 = false;
                            }
                            boolean var99 = false;
                            if ((class127.field2011 == 1 || !Statics.field1901 && class127.field2011 == 4) && var98) {
                                var99 = true;
                            }
                            boolean var100 = false;
                            if ((class127.field2010 == 1 || !Statics.field1901 && class127.field2010 == 4) && class127.field2013 >= var12 && class127.field2012 >= var13 && class127.field2013 < var14 && class127.field2012 < var15) {
                                var100 = true;
                            }
                            if (var100) {
                                method2347(var9, class127.field2013 - var10, class127.field2012 - var11);
                            }
                            if (field431 != null && field431 != var9 && var98) {
                                int var101 = Statics.method2146(var9);
                                boolean var102 = (var101 >> 20 & 0x1) != 0;
                                if (var102) {
                                    field435 = var9;
                                }
                            }
                            if (field518 == var9) {
                                field436 = true;
                                field437 = var10;
                                field471 = var11;
                            }
                            if (var9.field2597) {
                                if (var98 && field457 != 0 && var9.field2618 != null) {
                                    class1 var103 = new class1();
                                    var103.field2 = true;
                                    var103.field1 = var9;
                                    var103.field5 = field457;
                                    var103.field15 = var9.field2618;
                                    field493.method3180(var103);
                                }
                                if (field431 != null || Statics.field2679 != null || field401) {
                                    var100 = false;
                                    var99 = false;
                                    var98 = false;
                                }
                                if (!var9.field2640 && var100) {
                                    var9.field2640 = true;
                                    if (var9.field2599 != null) {
                                        class1 var104 = new class1();
                                        var104.field2 = true;
                                        var104.field1 = var9;
                                        var104.field4 = class127.field2013 - var10;
                                        var104.field5 = class127.field2012 - var11;
                                        var104.field15 = var9.field2599;
                                        field493.method3180(var104);
                                    }
                                }
                                if (var9.field2640 && var99 && var9.field2555 != null) {
                                    class1 var105 = new class1();
                                    var105.field2 = true;
                                    var105.field1 = var9;
                                    var105.field4 = class127.field2004 - var10;
                                    var105.field5 = class127.field2005 - var11;
                                    var105.field15 = var9.field2555;
                                    field493.method3180(var105);
                                }
                                if (var9.field2640 && !var99) {
                                    var9.field2640 = false;
                                    if (var9.field2549 != null) {
                                        class1 var106 = new class1();
                                        var106.field2 = true;
                                        var106.field1 = var9;
                                        var106.field4 = class127.field2004 - var10;
                                        var106.field5 = class127.field2005 - var11;
                                        var106.field15 = var9.field2549;
                                        field277.method3180(var106);
                                    }
                                }
                                if (var99 && var9.field2602 != null) {
                                    class1 var107 = new class1();
                                    var107.field2 = true;
                                    var107.field1 = var9;
                                    var107.field4 = class127.field2004 - var10;
                                    var107.field5 = class127.field2005 - var11;
                                    var107.field15 = var9.field2602;
                                    field493.method3180(var107);
                                }
                                if (!var9.field2639 && var98) {
                                    var9.field2639 = true;
                                    if (var9.field2522 != null) {
                                        class1 var108 = new class1();
                                        var108.field2 = true;
                                        var108.field1 = var9;
                                        var108.field4 = class127.field2004 - var10;
                                        var108.field5 = class127.field2005 - var11;
                                        var108.field15 = var9.field2522;
                                        field493.method3180(var108);
                                    }
                                }
                                if (var9.field2639 && var98 && var9.field2560 != null) {
                                    class1 var109 = new class1();
                                    var109.field2 = true;
                                    var109.field1 = var9;
                                    var109.field4 = class127.field2004 - var10;
                                    var109.field5 = class127.field2005 - var11;
                                    var109.field15 = var9.field2560;
                                    field493.method3180(var109);
                                }
                                if (var9.field2639 && !var98) {
                                    var9.field2639 = false;
                                    if (var9.field2627 != null) {
                                        class1 var110 = new class1();
                                        var110.field2 = true;
                                        var110.field1 = var9;
                                        var110.field4 = class127.field2004 - var10;
                                        var110.field5 = class127.field2005 - var11;
                                        var110.field15 = var9.field2627;
                                        field277.method3180(var110);
                                    }
                                }
                                if (var9.field2606 != null) {
                                    class1 var111 = new class1();
                                    var111.field1 = var9;
                                    var111.field15 = var9.field2606;
                                    field459.method3180(var111);
                                }
                                if (var9.field2610 != null && field426 > var9.field2605) {
                                    if (var9.field2616 == null || field426 - var9.field2605 > 32) {
                                        class1 var116 = new class1();
                                        var116.field1 = var9;
                                        var116.field15 = var9.field2610;
                                        field493.method3180(var116);
                                    } else {
                                        label959: for (int var112 = var9.field2605; var112 < field426; var112++) {
                                            int var113 = field445[var112 & 0x1F];
                                            for (int var114 = 0; var114 < var9.field2616.length; var114++) {
                                                if (var9.field2616[var114] == var113) {
                                                    class1 var115 = new class1();
                                                    var115.field1 = var9;
                                                    var115.field15 = var9.field2610;
                                                    field493.method3180(var115);
                                                    break label959;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2605 = field426;
                                }
                                if (var9.field2612 != null && field448 > var9.field2643) {
                                    if (var9.field2613 == null || field448 - var9.field2643 > 32) {
                                        class1 var121 = new class1();
                                        var121.field1 = var9;
                                        var121.field15 = var9.field2612;
                                        field493.method3180(var121);
                                    } else {
                                        label935: for (int var117 = var9.field2643; var117 < field448; var117++) {
                                            int var118 = field447[var117 & 0x1F];
                                            for (int var119 = 0; var119 < var9.field2613.length; var119++) {
                                                if (var9.field2613[var119] == var118) {
                                                    class1 var120 = new class1();
                                                    var120.field1 = var9;
                                                    var120.field15 = var9.field2612;
                                                    field493.method3180(var120);
                                                    break label935;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2643 = field448;
                                }
                                if (var9.field2614 != null && field345 > var9.field2644) {
                                    if (var9.field2621 == null || field345 - var9.field2644 > 32) {
                                        class1 var126 = new class1();
                                        var126.field1 = var9;
                                        var126.field15 = var9.field2614;
                                        field493.method3180(var126);
                                    } else {
                                        label911: for (int var122 = var9.field2644; var122 < field345; var122++) {
                                            int var123 = field434[var122 & 0x1F];
                                            for (int var124 = 0; var124 < var9.field2621.length; var124++) {
                                                if (var9.field2621[var124] == var123) {
                                                    class1 var125 = new class1();
                                                    var125.field1 = var9;
                                                    var125.field15 = var9.field2614;
                                                    field493.method3180(var125);
                                                    break label911;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2644 = field345;
                                }
                                if (field451 > var9.field2641 && var9.field2558 != null) {
                                    class1 var127 = new class1();
                                    var127.field1 = var9;
                                    var127.field15 = var9.field2558;
                                    field493.method3180(var127);
                                }
                                if (field452 > var9.field2641 && var9.field2637 != null) {
                                    class1 var128 = new class1();
                                    var128.field1 = var9;
                                    var128.field15 = var9.field2637;
                                    field493.method3180(var128);
                                }
                                if (field321 > var9.field2641 && var9.field2622 != null) {
                                    class1 var129 = new class1();
                                    var129.field1 = var9;
                                    var129.field15 = var9.field2622;
                                    field493.method3180(var129);
                                }
                                if (field351 > var9.field2641 && var9.field2623 != null) {
                                    class1 var130 = new class1();
                                    var130.field1 = var9;
                                    var130.field15 = var9.field2623;
                                    field493.method3180(var130);
                                }
                                var9.field2641 = field443;
                                if (var9.field2565 != null) {
                                    for (int var131 = 0; var131 < field477; var131++) {
                                        class1 var132 = new class1();
                                        var132.field1 = var9;
                                        var132.field3 = field506[var131];
                                        var132.field9 = field478[var131];
                                        var132.field15 = var9.field2565;
                                        field493.method3180(var132);
                                    }
                                }
                            }
                        }
                        if (!var9.field2529 && field431 == null && Statics.field2679 == null && !field401) {
                            if ((var9.field2629 >= 0 || var9.field2638 != 0) && class127.field2004 >= var12 && class127.field2005 >= var13 && class127.field2004 < var14 && class127.field2005 < var15) {
                                if (var9.field2629 >= 0) {
                                    Statics.field1275 = arg0[var9.field2629];
                                } else {
                                    Statics.field1275 = var9;
                                }
                            }
                            if (var9.field2580 == 8 && class127.field2004 >= var12 && class127.field2005 >= var13 && class127.field2004 < var14 && class127.field2005 < var15) {
                                Statics.field2109 = var9;
                            }
                            if (var9.field2546 > var9.field2540) {
                                method2869(var9, var9.field2575 + var10, var11, var9.field2540, var9.field2546, class127.field2004, class127.field2005);
                            }
                        }
                    } else if ((field490 == 0 || field490 == 3) && (class127.field2010 == 1 || !Statics.field1901 && class127.field2010 == 4)) {
                        int var53 = class127.field2013 - 25 - var10;
                        int var54 = class127.field2012 - 5 - var11;
                        if (var53 >= 0 && var54 >= 0 && var53 < 146 && var54 < 151 && (var53 < 0 || var53 > 23 || var54 < 117 || var54 > 142)) {
                            var53 -= 73;
                            var54 -= 75;
                            int var55 = field458 + field330 & 0x7FF;
                            int var56 = class84.field1470[var55];
                            int var57 = class84.field1484[var55];
                            int var58 = (field332 + 256) * var56 >> 8;
                            int var59 = (field332 + 256) * var57 >> 8;
                            int var60 = var53 * var59 + var54 * var58 >> 11;
                            int var61 = var54 * var59 - var53 * var58 >> 11;
                            int var62 = Statics.field578.field762 + var60 >> 7;
                            int var63 = Statics.field578.field726 - var61 >> 7;
                            field300.method2389(58);
                            field300.method2242(18);
                            field300.method2163(Statics.field169 + var63);
                            field300.method2162(Statics.field982 + var62);
                            field300.method2155(class124.field1971[82] ? (class124.field1971[81] ? 2 : 1) : 0);
                            field300.method2242(var53);
                            field300.method2242(var54);
                            field300.method2277(field458);
                            field300.method2242(57);
                            field300.method2242(field330);
                            field300.method2242(field332);
                            field300.method2242(89);
                            field300.method2277(Statics.field578.field762);
                            field300.method2277(Statics.field578.field726);
                            field300.method2242(63);
                            field377 = var62;
                            field489 = var63;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.cd([Lec;II)V")
    public static final void method14(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2580 == 0) {
                    if (var3.field2633 != null) {
                        method14(var3.field2633, arg1);
                    }
                    class4 var4 = (class4) field420.method3157((long) var3.field2530);
                    if (var4 != null) {
                        int var5 = var4.field54;
                        if (class152.method139(var5)) {
                            method14(Statics.field2628[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2624 != null) {
                    class1 var6 = new class1();
                    var6.field1 = var3;
                    var6.field15 = var3.field2624;
                    class32.method487(var6);
                }
                if (arg1 == 1 && var3.field2617 != null) {
                    if (var3.field2531 >= 0) {
                        class152 var7 = Statics.method159(var3.field2530);
                        if (var7 == null || var7.field2633 == null || var3.field2531 >= var7.field2633.length || var7.field2633[var3.field2531] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field1 = var3;
                    var8.field15 = var3.field2617;
                    class32.method487(var8);
                }
            }
        }
    }

    @ObfuscatedName("dh.cm(Lec;III)V")
    public static final void method2347(class152 arg0, int arg1, int arg2) {
        if (field431 != null || field401 || arg0 == null) {
            return;
        }
        class152 var3 = method1885(arg0);
        if (var3 == null) {
            var3 = arg0.field2592;
        }
        if (var3 == null) {
            return;
        }
        field431 = arg0;
        class152 var5 = method1885(arg0);
        if (var5 == null) {
            var5 = arg0.field2592;
        }
        field518 = var5;
        field433 = arg1;
        field331 = arg2;
        Statics.field723 = 0;
        field442 = false;
        if (field368 > 0) {
            int var7 = field368 - 1;
            Statics.field2409 = new class27();
            Statics.field2409.field628 = field403[var7];
            Statics.field2409.field627 = field391[var7];
            Statics.field2409.field634 = field370[var7];
            Statics.field2409.field629 = field406[var7];
            Statics.field2409.field630 = field407[var7];
        }
        return;
    }

    @ObfuscatedName("o.cy(I)V")
    public static final void method30() {
        method535(field431);
        Statics.field723++;
        if (field439 && field436) {
            int var0 = class127.field2004;
            int var1 = class127.field2005;
            int var2 = var0 - field433;
            int var3 = var1 - field331;
            if (var2 < field437) {
                var2 = field437;
            }
            if (field431.field2575 + var2 > field437 + field518.field2575) {
                var2 = field437 + field518.field2575 - field431.field2575;
            }
            if (var3 < field471) {
                var3 = field471;
            }
            if (field431.field2540 + var3 > field471 + field518.field2540) {
                var3 = field471 + field518.field2540 - field431.field2540;
            }
            int var4 = var2 - field440;
            int var5 = var3 - field441;
            int var6 = field431.field2593;
            if (Statics.field723 > field431.field2594 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field442 = true;
            }
            int var7 = field518.field2543 + (var2 - field437);
            int var8 = field518.field2544 + (var3 - field471);
            if (field431.field2603 != null && field442) {
                class1 var9 = new class1();
                var9.field1 = field431;
                var9.field4 = var7;
                var9.field5 = var8;
                var9.field15 = field431.field2603;
                class32.method487(var9);
            }
            if (class127.field2011 == 0) {
                if (field442) {
                    if (field431.field2648 != null) {
                        class1 var10 = new class1();
                        var10.field1 = field431;
                        var10.field4 = var7;
                        var10.field5 = var8;
                        var10.field7 = field435;
                        var10.field15 = field431.field2648;
                        class32.method487(var10);
                    }
                    if (field435 != null && method1885(field431) != null) {
                        field300.method2389(156);
                        field300.method2173(field435.field2530);
                        field300.method2163(field431.field2531);
                        field300.method2277(field435.field2531);
                        field300.method2276(field431.field2530);
                    }
                } else if ((field400 == 1 || method160(field368 - 1)) && field368 > 2) {
                    method2469(field440 + field433, field441 + field331);
                } else if (field368 > 0) {
                    method534(field440 + field433, field441 + field331);
                }
                field431 = null;
            }
        } else if (Statics.field723 > 1) {
            field431 = null;
        }
    }

    @ObfuscatedName("al.cf(IIB)V")
    public static void method534(int arg0, int arg1) {
        method585(Statics.field2409, arg0, arg1);
        Statics.field2409 = null;
    }

    @ObfuscatedName("al.cu(Lec;B)V")
    public static void method535(class152 arg0) {
        if (field309 == arg0.field2646) {
            field464[arg0.field2645] = true;
        }
    }

    @ObfuscatedName("cs.ce(I)V")
    public static void method1789() {
        for (class4 var0 = (class4) field420.method3150(); var0 != null; var0 = (class4) field420.method3151()) {
            int var1 = var0.field54;
            if (class152.method139(var1)) {
                boolean var2 = true;
                class152[] var3 = Statics.field2628[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2529;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2861;
                    class152 var6 = Statics.method159(var5);
                    if (var6 != null) {
                        method535(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dy.cg([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2574(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("client.ch(II)V")
    public static final void method253(int arg0) {
        if (!class152.method139(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2628[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3 != null) {
                var3.field2532 = 0;
                var3.field2604 = 0;
            }
        }
    }

    @ObfuscatedName("ai.ca(II)V")
    public static final void method573(int arg0) {
        if (class152.method139(arg0)) {
            method885(Statics.field2628[arg0], -1);
        }
    }

    @ObfuscatedName("av.cb([Lec;IB)V")
    public static final void method885(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null && var3.field2582 == arg1 && (!var3.field2529 || !method528(var3))) {
                if (var3.field2580 == 0) {
                    if (!var3.field2529 && method528(var3) && Statics.field1275 != var3) {
                        continue;
                    }
                    method885(arg0, var3.field2530);
                    if (var3.field2633 != null) {
                        method885(var3.field2633, var3.field2530);
                    }
                    class4 var4 = (class4) field420.method3157((long) var3.field2530);
                    if (var4 != null) {
                        method573(var4.field54);
                    }
                }
                if (var3.field2580 == 6) {
                    if (var3.field2566 != -1 || var3.field2567 != -1) {
                        boolean var5 = method1787(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2567;
                        } else {
                            var6 = var3.field2566;
                        }
                        if (var6 != -1) {
                            class38 var7 = Statics.method484(var6);
                            var3.field2604 += field421;
                            while (var3.field2604 > var7.field900[var3.field2532]) {
                                var3.field2604 -= var7.field900[var3.field2532];
                                var3.field2532++;
                                if (var3.field2532 >= var7.field911.length) {
                                    var3.field2532 -= var7.field908;
                                    if (var3.field2532 < 0 || var3.field2532 >= var7.field911.length) {
                                        var3.field2532 = 0;
                                    }
                                }
                                method535(var3);
                            }
                        }
                    }
                    if (var3.field2574 != 0 && !var3.field2529) {
                        int var8 = var3.field2574 >> 16;
                        int var9 = var3.field2574 << 16 >> 16;
                        int var10 = field421 * var8;
                        int var11 = field421 * var9;
                        var3.field2570 = var3.field2570 + var10 & 0x7FF;
                        var3.field2607 = var3.field2607 + var11 & 0x7FF;
                        method535(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gu.cl(II)V")
    public static final void method3433(int arg0) {
        method1789();
        for (class20 var1 = (class20) class20.field541.method3185(); var1 != null; var1 = (class20) class20.field541.method3187()) {
            if (var1.field551 != null) {
                var1.method491();
            }
        }
        int var2 = class46.method498(arg0).field1064;
        if (var2 == 0) {
            return;
        }
        int var3 = class154.field2657[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class84.method1796(0.9D);
                ((class88) Statics.field1460).method1878(0.9D);
            }
            if (var3 == 2) {
                class84.method1796(0.8D);
                ((class88) Statics.field1460).method1878(0.8D);
            }
            if (var3 == 3) {
                class84.method1796(0.7D);
                ((class88) Statics.field1460).method1878(0.7D);
            }
            if (var3 == 4) {
                class84.method1796(0.6D);
                ((class88) Statics.field1460).method1878(0.6D);
            }
            class45.field1016.method3117();
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
            if (field491 != var4) {
                if (field491 == 0 && field348 != -1) {
                    class161.method2681(Statics.field2462, field348, 0, var4, false);
                    field305 = false;
                } else if (var4 == 0) {
                    Statics.field1003.method3003();
                    class161.field2705 = 1;
                    Statics.field2519 = null;
                    field305 = false;
                } else {
                    class161.method1614(var4);
                }
                field491 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field494 = 127;
            }
            if (var3 == 1) {
                field494 = 96;
            }
            if (var3 == 2) {
                field494 = 64;
            }
            if (var3 == 3) {
                field494 = 32;
            }
            if (var3 == 4) {
                field494 = 0;
            }
        }
        if (var2 == 5) {
            field400 = var3;
        }
        if (var2 == 6) {
            field291 = var3;
        }
        if (var2 == 9) {
            field422 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field473 = 127;
            }
            if (var3 == 1) {
                field473 = 96;
            }
            if (var3 == 2) {
                field473 = 64;
            }
            if (var3 == 3) {
                field473 = 32;
            }
            if (var3 == 4) {
                field473 = 0;
            }
        }
        if (var2 == 17) {
            field444 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field285 = (class18) class99.method2656(class18.method1417(), var3);
            if (field285 == null) {
                field285 = class18.field524;
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

    @ObfuscatedName("h.dj(Lec;I)V")
    public static final void method486(class152 arg0) {
        int var1 = arg0.field2534;
        if (var1 == 324) {
            if (field293 == -1) {
                field293 = arg0.field2619;
                field310 = arg0.field2581;
            }
            if (field514.field2670) {
                arg0.field2619 = field293;
            } else {
                arg0.field2619 = field310;
            }
        } else if (var1 == 325) {
            if (field293 == -1) {
                field293 = arg0.field2619;
                field310 = arg0.field2581;
            }
            if (field514.field2670) {
                arg0.field2619 = field310;
            } else {
                arg0.field2619 = field293;
            }
        } else if (var1 == 327) {
            arg0.field2570 = 150;
            arg0.field2607 = (int) (Math.sin((double) field376 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2588 = 5;
            arg0.field2642 = 0;
        } else if (var1 == 328) {
            arg0.field2570 = 150;
            arg0.field2607 = (int) (Math.sin((double) field376 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2588 = 5;
            arg0.field2642 = 1;
        }
    }

    @ObfuscatedName("p.dh(IIII)Lj;")
    public static final class4 method112(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field54 = arg1;
        var3.field55 = arg2;
        field420.method3147(var3, (long) arg0);
        method253(arg1);
        class32.method896(arg1);
        class152 var4 = Statics.method159(arg0);
        if (var4 != null) {
            method535(var4);
        }
        if (field423 != null) {
            method535(field423);
            field423 = null;
        }
        for (int var5 = 0; var5 < field368; var5++) {
            int var6 = field370[var5];
            boolean var7 = var6 == 57 || var6 == 58 || var6 == 1007 || var6 == 25 || var6 == 30;
            if (var7) {
                if (var5 < field368 - 1) {
                    for (int var8 = var5; var8 < field368 - 1; var8++) {
                        field407[var8] = field407[var8 + 1];
                        field408[var8] = field408[var8 + 1];
                        field370[var8] = field370[var8 + 1];
                        field406[var8] = field406[var8 + 1];
                        field403[var8] = field403[var8 + 1];
                        field391[var8] = field391[var8 + 1];
                    }
                }
                field368--;
            }
        }
        if (field419 != -1) {
            int var9 = field419;
            if (class152.method139(var9)) {
                method14(Statics.field2628[var9], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("f.dt(Lj;ZI)V")
    public static final void method93(class4 arg0, boolean arg1) {
        int var2 = arg0.field54;
        int var3 = (int) arg0.field2861;
        arg0.method3260();
        if (arg1) {
            class152.method94(var2);
        }
        for (class179 var4 = (class179) field461.method3150(); var4 != null; var4 = (class179) field461.method3151()) {
            if ((long) var2 == (var4.field2861 >> 48 & 0xFFFFL)) {
                var4.method3260();
            }
        }
        class152 var5 = Statics.method159(var3);
        if (var5 != null) {
            method535(var5);
        }
        for (int var6 = 0; var6 < field368; var6++) {
            int var7 = field370[var6];
            boolean var8 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
            if (var8) {
                if (var6 < field368 - 1) {
                    for (int var9 = var6; var9 < field368 - 1; var9++) {
                        field407[var9] = field407[var9 + 1];
                        field408[var9] = field408[var9 + 1];
                        field370[var9] = field370[var9 + 1];
                        field406[var9] = field406[var9 + 1];
                        field403[var9] = field403[var9 + 1];
                        field391[var9] = field391[var9 + 1];
                    }
                }
                field368--;
            }
        }
        if (field419 != -1) {
            int var10 = field419;
            if (class152.method139(var10)) {
                method14(Statics.field2628[var10], 1);
            }
        }
    }

    @ObfuscatedName("ei.db(Lec;B)Z")
    public static final boolean method2824(class152 arg0) {
        int var1 = arg0.field2534;
        if (var1 == 205) {
            field328 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field514.method2885(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field514.method2913(var4, var5 == 1);
        }
        if (var1 == 324) {
            field514.method2887(false);
        }
        if (var1 == 325) {
            field514.method2887(true);
        }
        if (var1 == 326) {
            field300.method2389(76);
            field514.method2890(field300);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("y.dw(IIIILbk;I)V")
    public static final void method90(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method490(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field458 + field330 & 0x7FF;
        int var7 = class84.field1470[var6];
        int var8 = class84.field1484[var6];
        int var9 = var7 * 256 / (field332 + 256);
        int var10 = var8 * 256 / (field332 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field219.method1446(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("a.dk(IIIILbk;I)V")
    public static final void method490(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field458 + field330 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1470[var5];
        int var8 = class84.field1484[var5];
        int var9 = var7 * 256 / (field332 + 256);
        int var10 = var8 * 256 / (field332 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1475(Statics.field942, arg0 + 94 + var11 - arg4.field1298 / 2 + 4, arg1 + 83 - var12 - arg4.field1299 / 2 - 4);
        } else {
            arg4.method1435(arg0 + 94 + var11 - arg4.field1298 / 2 + 4, arg1 + 83 - var12 - arg4.field1299 / 2 - 4);
        }
    }

    @ObfuscatedName("dq.dg(Ljava/lang/String;ZI)Z")
    public static boolean method2538(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class198.method1884(arg0, Statics.field1847);
        for (int var3 = 0; var3 < field508; var3++) {
            if (var2.equalsIgnoreCase(class198.method1884(field510[var3].field232, Statics.field1847)) && (!arg1 || field510[var3].field228 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class198.method1884(Statics.field578.field46, Statics.field1847))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("j.df(Ljava/lang/String;B)Z")
    public static boolean method25(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class198.method1884(arg0, Statics.field1847);
        for (int var2 = 0; var2 < field512; var2++) {
            class8 var3 = field513[var2];
            if (var1.equalsIgnoreCase(class198.method1884(var3.field129, Statics.field1847))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class198.method1884(var3.field130, Statics.field1847))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ef.dd(Ljava/lang/String;ZI)V")
    public static final void method2780(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field512 < 100 || field380 == 1) || field512 >= 400) {
            class10.method88(31, "", class142.field2314);
            return;
        }
        String var2 = class198.method1884(arg0, Statics.field1847);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field512; var3++) {
            class8 var4 = field513[var3];
            String var5 = class198.method1884(var4.field129, Statics.field1847);
            if (var5 != null && var5.equals(var2)) {
                class10.method88(31, "", arg0 + class142.field2315);
                return;
            }
            if (var4.field130 != null) {
                String var6 = class198.method1884(var4.field130, Statics.field1847);
                if (var6 != null && var6.equals(var2)) {
                    class10.method88(31, "", arg0 + class142.field2315);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field508; var7++) {
            class16 var8 = field510[var7];
            String var9 = class198.method1884(var8.field232, Statics.field1847);
            if (var9 != null && var9.equals(var2)) {
                class10.method88(31, "", class142.field2146 + arg0 + class142.field2321);
                return;
            }
            if (var8.field227 != null) {
                String var10 = class198.method1884(var8.field227, Statics.field1847);
                if (var10 != null && var10.equals(var2)) {
                    class10.method88(31, "", class142.field2146 + arg0 + class142.field2321);
                    return;
                }
            }
        }
        if (class198.method1884(Statics.field578.field46, Statics.field1847).equals(var2)) {
            class10.method88(31, "", class142.field2317);
            return;
        }
        field300.method2389(135);
        class110 var11 = field300;
        int var12 = arg0.length() + 1;
        var11.method2242(var12);
        field300.method2126(arg0);
    }

    @ObfuscatedName("az.dn(Ljava/lang/String;I)V")
    public static final void method568(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class198.method1884(arg0, Statics.field1847);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field508; var2++) {
            class16 var3 = field510[var2];
            String var4 = var3.field232;
            String var5 = class198.method1884(var4, Statics.field1847);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field508--;
                for (int var7 = var2; var7 < field508; var7++) {
                    field510[var7] = field510[var7 + 1];
                }
                field452 = field443;
                field300.method2389(131);
                class110 var8 = field300;
                int var9 = arg0.length() + 1;
                var8.method2242(var9);
                field300.method2126(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("aq.ds(Ljava/lang/String;I)V")
    public static final void method876(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        field300.method2389(153);
        class110 var1 = field300;
        int var2 = arg0.length() + 1;
        var1.method2242(var2);
        field300.method2126(arg0);
    }

    @ObfuscatedName("cc.dv(Lec;I)Lec;")
    public static class152 method1885(class152 arg0) {
        int var1 = class156.method2068(Statics.method2146(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = Statics.method159(arg0.field2582);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("r.dp(Lec;B)Z")
    public static boolean method528(class152 arg0) {
        if (field516) {
            if (Statics.method2146(arg0) != 0) {
                return false;
            }
            if (arg0.field2580 == 0) {
                return false;
            }
        }
        return arg0.field2542;
    }

    @ObfuscatedName("eg.dl(Lec;B)Ljava/lang/String;")
    public static String method2729(class152 arg0) {
        if (class156.method570(Statics.method2146(arg0)) == 0) {
            return null;
        } else if (arg0.field2596 == null || arg0.field2596.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2596;
        }
    }

    @ObfuscatedName("ck.de(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method1883(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field261 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field261 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field261 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field261 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field261 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field265 + "/";
    }
}

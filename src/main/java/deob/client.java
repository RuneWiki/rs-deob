package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;

public final class client extends class131 {

    @ObfuscatedName("client.z")
    public static boolean field346 = true;

    @ObfuscatedName("client.h")
    public static int field249 = 1;

    @ObfuscatedName("client.k")
    public static int field250 = 0;

    @ObfuscatedName("client.e")
    public static int field252 = 0;

    @ObfuscatedName("client.f")
    public static boolean field254 = false;

    @ObfuscatedName("client.a")
    public static boolean field255 = false;

    @ObfuscatedName("client.i")
    public static int field256 = 0;

    @ObfuscatedName("client.q")
    public static int field257 = 0;

    @ObfuscatedName("client.t")
    public static boolean field418 = true;

    @ObfuscatedName("client.r")
    public static int field259 = 0;

    @ObfuscatedName("client.s")
    public static long field260 = 1L;

    @ObfuscatedName("client.m")
    public static int field261 = -1;

    @ObfuscatedName("client.o")
    public static int field262 = -1;

    @ObfuscatedName("client.b")
    public static int field258 = -1;

    @ObfuscatedName("client.c")
    public static boolean field264 = true;

    @ObfuscatedName("client.w")
    public static class197[] field308 = new class197[4];

    @ObfuscatedName("client.u")
    public static boolean field265 = false;

    @ObfuscatedName("client.ac")
    public static int field266 = 0;

    @ObfuscatedName("client.ap")
    public static int field267 = 0;

    @ObfuscatedName("client.ai")
    public static int field268 = 0;

    @ObfuscatedName("client.as")
    public static int field339 = 0;

    @ObfuscatedName("client.aa")
    public static int field270 = 0;

    @ObfuscatedName("client.aq")
    public static int field271 = 0;

    @ObfuscatedName("client.aw")
    public static int field272 = 0;

    @ObfuscatedName("client.am")
    public static int field273 = 0;

    @ObfuscatedName("client.av")
    public static int field376 = 0;

    @ObfuscatedName("client.an")
    public static class107 field368 = new class107(new byte[5000]);

    @ObfuscatedName("client.ag")
    public static class18 field277 = class18.field518;

    @ObfuscatedName("client.ay")
    public static int field278 = 0;

    @ObfuscatedName("client.ae")
    public static int field246 = 0;

    @ObfuscatedName("client.af")
    public static int field280 = 0;

    @ObfuscatedName("client.bs")
    public static int field383 = 0;

    @ObfuscatedName("client.bv")
    public static int field340 = 0;

    @ObfuscatedName("client.bm")
    public static int field283 = 0;

    @ObfuscatedName("client.br")
    public static int field284 = 0;

    @ObfuscatedName("client.bd")
    public static int field295 = 0;

    @ObfuscatedName("client.bb")
    public static class30[] field287 = new class30[32768];

    @ObfuscatedName("client.bw")
    public static int field293 = 0;

    @ObfuscatedName("client.bj")
    public static int[] field289 = new int[32768];

    @ObfuscatedName("client.co")
    public static class110 field290 = new class110(5000);

    @ObfuscatedName("client.cs")
    public static class110 field291 = new class110(5000);

    @ObfuscatedName("client.cf")
    public static class110 field292 = new class110(5000);

    @ObfuscatedName("client.cc")
    public static int field471 = 0;

    @ObfuscatedName("client.cb")
    public static int field294 = 0;

    @ObfuscatedName("client.cd")
    public static int field462 = 0;

    @ObfuscatedName("client.ck")
    public static int field490 = 0;

    @ObfuscatedName("client.cz")
    public static int field297 = 0;

    @ObfuscatedName("client.cq")
    public static int field347 = 0;

    @ObfuscatedName("client.cr")
    public static int field299 = 0;

    @ObfuscatedName("client.cn")
    public static int field300 = 0;

    @ObfuscatedName("client.cv")
    public static boolean field263 = false;

    @ObfuscatedName("client.cu")
    public static int field434 = 0;

    @ObfuscatedName("client.cw")
    public static int field303 = 0;

    @ObfuscatedName("client.dy")
    public static int field374 = 1;

    @ObfuscatedName("client.dt")
    public static int field305 = 0;

    @ObfuscatedName("client.dm")
    public static int field306 = 1;

    @ObfuscatedName("client.do")
    public static int field487 = 0;

    @ObfuscatedName("client.dd")
    public static boolean field389 = false;

    @ObfuscatedName("client.dr")
    public static int[][][] field310 = new int[4][13][13];

    @ObfuscatedName("client.dz")
    public static final int[] field311 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.di")
    public static int field312 = 0;

    @ObfuscatedName("client.db")
    public static int field313 = 2;

    @ObfuscatedName("client.dl")
    public static int field314 = 0;

    @ObfuscatedName("client.du")
    public static int field388 = 2;

    @ObfuscatedName("client.df")
    public static int field316 = 0;

    @ObfuscatedName("client.da")
    public static int field317 = 1;

    @ObfuscatedName("client.dh")
    public static int field318 = 0;

    @ObfuscatedName("client.dx")
    public static int field319 = 0;

    @ObfuscatedName("client.dg")
    public static int field332 = 2;

    @ObfuscatedName("client.dk")
    public static int field501 = 0;

    @ObfuscatedName("client.er")
    public static int field322 = 1;

    @ObfuscatedName("client.ef")
    public static int field382 = 0;

    @ObfuscatedName("client.ew")
    public static int field324 = 0;

    @ObfuscatedName("client.eu")
    public static int field325 = 2301979;

    @ObfuscatedName("client.ek")
    public static int field326 = 5063219;

    @ObfuscatedName("client.ez")
    public static int field327 = 3353893;

    @ObfuscatedName("client.et")
    public static int field328 = 7759444;

    @ObfuscatedName("client.eb")
    public static boolean field329 = false;

    @ObfuscatedName("client.ff")
    public static int field420 = 0;

    @ObfuscatedName("client.fr")
    public static int field360 = 128;

    @ObfuscatedName("client.fv")
    public static int field315 = 0;

    @ObfuscatedName("client.fo")
    public static int field390 = 0;

    @ObfuscatedName("client.fw")
    public static int field334 = 0;

    @ObfuscatedName("client.fa")
    public static int field335 = 0;

    @ObfuscatedName("client.fu")
    public static int field336 = 0;

    @ObfuscatedName("client.fy")
    public static int field282 = 0;

    @ObfuscatedName("client.fc")
    public static boolean field338 = false;

    @ObfuscatedName("client.ft")
    public static int field298 = 0;

    @ObfuscatedName("client.fs")
    public static int field348 = 0;

    @ObfuscatedName("client.fb")
    public static int field341 = 50;

    @ObfuscatedName("client.fj")
    public static int[] field342 = new int[field341];

    @ObfuscatedName("client.fx")
    public static int[] field343 = new int[field341];

    @ObfuscatedName("client.fm")
    public static int[] field344 = new int[field341];

    @ObfuscatedName("client.fh")
    public static int[] field361 = new int[field341];

    @ObfuscatedName("client.fe")
    public static int[] field320 = new int[field341];

    @ObfuscatedName("client.fn")
    public static int[] field307 = new int[field341];

    @ObfuscatedName("client.fl")
    public static int[] field491 = new int[field341];

    @ObfuscatedName("client.gm")
    public static String[] field349 = new String[field341];

    @ObfuscatedName("client.ga")
    public static int[][] field350 = new int[104][104];

    @ObfuscatedName("client.gl")
    public static int field351 = 0;

    @ObfuscatedName("client.gc")
    public static int field352 = -1;

    @ObfuscatedName("client.gr")
    public static int field353 = -1;

    @ObfuscatedName("client.gz")
    public static int field354 = 0;

    @ObfuscatedName("client.gd")
    public static int field355 = 0;

    @ObfuscatedName("client.gn")
    public static int field373 = 0;

    @ObfuscatedName("client.ge")
    public static int field357 = 0;

    @ObfuscatedName("client.gj")
    public static int field358 = 0;

    @ObfuscatedName("client.gf")
    public static int field359 = 0;

    @ObfuscatedName("client.gi")
    public static int field407 = 0;

    @ObfuscatedName("client.gg")
    public static int field444 = 0;

    @ObfuscatedName("client.gu")
    public static int field447 = 0;

    @ObfuscatedName("client.gq")
    public static int field455 = 0;

    @ObfuscatedName("client.gt")
    public static boolean field404 = false;

    @ObfuscatedName("client.gp")
    public static int field385 = 0;

    @ObfuscatedName("client.gh")
    public static int field366 = 0;

    @ObfuscatedName("client.gv")
    public static class3[] field433 = new class3[2048];

    @ObfuscatedName("client.gw")
    public static int field337 = 0;

    @ObfuscatedName("client.go")
    public static int[] field369 = new int[2048];

    @ObfuscatedName("client.hg")
    public static int field489 = 0;

    @ObfuscatedName("client.hb")
    public static int[] field371 = new int[2048];

    @ObfuscatedName("client.hl")
    public static class107[] field372 = new class107[2048];

    @ObfuscatedName("client.hx")
    public static int field367 = -1;

    @ObfuscatedName("client.hv")
    public static int field302 = 0;

    @ObfuscatedName("client.hj")
    public static int field405 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field345 = new int[1000];

    @ObfuscatedName("client.hh")
    public static final int[] field377 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hd")
    public static String[] field378 = new String[8];

    @ObfuscatedName("client.hn")
    public static boolean[] field379 = new boolean[8];

    @ObfuscatedName("client.hk")
    public static int[] field380 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hs")
    public static int field381 = -1;

    @ObfuscatedName("client.hz")
    public static class177[][][] field384 = new class177[4][104][104];

    @ObfuscatedName("client.ho")
    public static class177 field483 = new class177();

    @ObfuscatedName("client.hf")
    public static class177 field365 = new class177();

    @ObfuscatedName("client.ha")
    public static class177 field472 = new class177();

    @ObfuscatedName("client.hy")
    public static int[] field386 = new int[25];

    @ObfuscatedName("client.ht")
    public static int[] field387 = new int[25];

    @ObfuscatedName("client.hp")
    public static int[] field466 = new int[25];

    @ObfuscatedName("client.hr")
    public static int field309 = 0;

    @ObfuscatedName("client.hw")
    public static boolean field495 = false;

    @ObfuscatedName("client.iy")
    public static int field391 = 0;

    @ObfuscatedName("client.ic")
    public static int[] field392 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field393 = new int[500];

    @ObfuscatedName("client.ir")
    public static int[] field394 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field395 = new int[500];

    @ObfuscatedName("client.im")
    public static String[] field396 = new String[500];

    @ObfuscatedName("client.if")
    public static String[] field412 = new String[500];

    @ObfuscatedName("client.iv")
    public static int field279 = -1;

    @ObfuscatedName("client.iw")
    public static int field364 = -1;

    @ObfuscatedName("client.ig")
    public static int field400 = 0;

    @ObfuscatedName("client.iu")
    public static int field401 = 50;

    @ObfuscatedName("client.is")
    public static int field402 = 0;

    @ObfuscatedName("client.it")
    public static String field403 = null;

    @ObfuscatedName("client.ii")
    public static boolean field425 = false;

    @ObfuscatedName("client.ie")
    public static int field480 = -1;

    @ObfuscatedName("client.ix")
    public static int field321 = -1;

    @ObfuscatedName("client.jt")
    public static String field485 = null;

    @ObfuscatedName("client.jm")
    public static String field363 = null;

    @ObfuscatedName("client.je")
    public static int field409 = -1;

    @ObfuscatedName("client.jw")
    public static class174 field410 = new class174(8);

    @ObfuscatedName("client.jc")
    public static int field411 = 0;

    @ObfuscatedName("client.jk")
    public static int field274 = 0;

    @ObfuscatedName("client.jn")
    public static class152 field413 = null;

    @ObfuscatedName("client.jj")
    public static int field414 = 0;

    @ObfuscatedName("client.jy")
    public static int field415 = 0;

    @ObfuscatedName("client.jq")
    public static int field416 = 0;

    @ObfuscatedName("client.jz")
    public static int field333 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field493 = false;

    @ObfuscatedName("client.jg")
    public static boolean field419 = false;

    @ObfuscatedName("client.jl")
    public static boolean field288 = false;

    @ObfuscatedName("client.jv")
    public static class152 field421 = null;

    @ObfuscatedName("client.ji")
    public static class152 field422 = null;

    @ObfuscatedName("client.js")
    public static int field423 = 0;

    @ObfuscatedName("client.jo")
    public static int field424 = 0;

    @ObfuscatedName("client.jh")
    public static class152 field362 = null;

    @ObfuscatedName("client.jx")
    public static boolean field426 = false;

    @ObfuscatedName("client.jr")
    public static int field427 = -1;

    @ObfuscatedName("client.jd")
    public static int field428 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field429 = false;

    @ObfuscatedName("client.ju")
    public static int field459 = -1;

    @ObfuscatedName("client.jp")
    public static int field330 = -1;

    @ObfuscatedName("client.kp")
    public static boolean field432 = false;

    @ObfuscatedName("client.kg")
    public static int field275 = 1;

    @ObfuscatedName("client.kq")
    public static int[] field461 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field435 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field436 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field437 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field331 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field296 = 0;

    @ObfuscatedName("client.ku")
    public static int field440 = 0;

    @ObfuscatedName("client.ki")
    public static int field441 = 0;

    @ObfuscatedName("client.kr")
    public static int field442 = 0;

    @ObfuscatedName("client.ko")
    public static int field443 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field408 = new int[2000];

    @ObfuscatedName("client.kt")
    public static String[] field445 = new String[1000];

    @ObfuscatedName("client.kd")
    public static int field446 = 0;

    @ObfuscatedName("client.kl")
    public static class177 field281 = new class177();

    @ObfuscatedName("client.kc")
    public static class177 field448 = new class177();

    @ObfuscatedName("client.kv")
    public static class177 field370 = new class177();

    @ObfuscatedName("client.kh")
    public static class174 field450 = new class174(512);

    @ObfuscatedName("client.la")
    public static int field451 = 0;

    @ObfuscatedName("client.lo")
    public static int field398 = -2;

    @ObfuscatedName("client.ls")
    public static boolean[] field453 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field454 = new boolean[100];

    @ObfuscatedName("client.ln")
    public static boolean[] field375 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static int[] field456 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field457 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field458 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field449 = new int[100];

    @ObfuscatedName("client.lb")
    public static int field460 = 0;

    @ObfuscatedName("client.ld")
    public static int[] field452 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ly")
    public static int field323 = 0;

    @ObfuscatedName("client.lg")
    public static int field463 = 0;

    @ObfuscatedName("client.lu")
    public static long[] field464 = new long[100];

    @ObfuscatedName("client.lv")
    public static int field465 = 0;

    @ObfuscatedName("client.lf")
    public static int field406 = 0;

    @ObfuscatedName("client.lm")
    public static int[] field467 = new int[128];

    @ObfuscatedName("client.lz")
    public static int[] field468 = new int[128];

    @ObfuscatedName("client.lq")
    public static long field469 = -1L;

    @ObfuscatedName("client.lr")
    public static String field511 = null;

    @ObfuscatedName("client.lw")
    public static String field478 = null;

    @ObfuscatedName("client.ms")
    public static int field399 = -1;

    @ObfuscatedName("client.mi")
    public static int field503 = 0;

    @ObfuscatedName("client.mg")
    public static int[] field474 = new int[1000];

    @ObfuscatedName("client.mf")
    public static int[] field475 = new int[1000];

    @ObfuscatedName("client.me")
    public static class72[] field476 = new class72[1000];

    @ObfuscatedName("client.ml")
    public static int field477 = 0;

    @ObfuscatedName("client.mk")
    public static int field438 = 0;

    @ObfuscatedName("client.mr")
    public static int field479 = 0;

    @ObfuscatedName("client.mx")
    public static int field417 = 255;

    @ObfuscatedName("client.mm")
    public static int field481 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field482 = false;

    @ObfuscatedName("client.mw")
    public static int field356 = 127;

    @ObfuscatedName("client.mj")
    public static int field484 = 127;

    @ObfuscatedName("client.nh")
    public static int field439 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field486 = new int[50];

    @ObfuscatedName("client.ne")
    public static int[] field301 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field488 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field248 = new int[50];

    @ObfuscatedName("client.nd")
    public static class52[] field285 = new class52[50];

    @ObfuscatedName("client.nx")
    public static boolean field430 = false;

    @ObfuscatedName("client.nb")
    public static boolean[] field492 = new boolean[5];

    @ObfuscatedName("client.ni")
    public static int[] field269 = new int[5];

    @ObfuscatedName("client.nv")
    public static int[] field494 = new int[5];

    @ObfuscatedName("client.nw")
    public static int[] field397 = new int[5];

    @ObfuscatedName("client.nz")
    public static int[] field496 = new int[5];

    @ObfuscatedName("client.nl")
    public static int field497 = 0;

    @ObfuscatedName("client.ox")
    public static int field498 = 0;

    @ObfuscatedName("client.og")
    public static class16[] field499 = new class16[400];

    @ObfuscatedName("client.ov")
    public static class173 field500 = new class173();

    @ObfuscatedName("client.oi")
    public static int field473 = 0;

    @ObfuscatedName("client.om")
    public static class8[] field502 = new class8[400];

    @ObfuscatedName("client.od")
    public static class157 field470 = new class157();

    @ObfuscatedName("client.of")
    public static int field504 = -1;

    @ObfuscatedName("client.oh")
    public static int field505 = -1;

    @ObfuscatedName("client.z(I)V")
    public final void method164() {
    }

    public final void init() {
        if (!this.method2652()) {
            return;
        }
        class168[] var1 = class168.method2310();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class168 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2824);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2824)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class2.field19)) {
                            field254 = true;
                        } else {
                            field254 = false;
                        }
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class2.field19)) {
                        }
                        break;
                    case 3:
                        class139[] var10 = class139.method2896();
                        int var11 = Integer.parseInt(var4);
                        class139[] var12 = var10;
                        int var13 = 0;
                        class139 var15;
                        while (true) {
                            if (var13 >= var12.length) {
                                var15 = null;
                                break;
                            }
                            class139 var14 = var12[var13];
                            if (var11 == var14.method455()) {
                                var15 = var14;
                                break;
                            }
                            var13++;
                        }
                        Statics.field253 = (class139) var15;
                        if (Statics.field253 == class139.field2137) {
                            Statics.field883 = class190.field2897;
                        } else {
                            Statics.field883 = class190.field2899;
                        }
                    case 4:
                    default:
                        break;
                    case 5:
                        int var5 = Integer.parseInt(var4);
                        class138[] var6 = class138.method1986();
                        int var7 = 0;
                        class138 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class138 var8 = var6[var7];
                            if (var8.field2125 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field251 = var9;
                        break;
                    case 6:
                        Statics.field1869 = var4;
                        break;
                    case 7:
                        field250 = Integer.parseInt(var4);
                        break;
                    case 8:
                        field252 = Integer.parseInt(var4);
                        break;
                    case 9:
                        field249 = Integer.parseInt(var4);
                        break;
                    case 10:
                        field256 = Integer.parseInt(var4);
                }
            }
        }
        method1440();
        Statics.field2075 = this.getCodeBase().getHost();
        String var16 = Statics.field251.field2130;
        byte var17 = 0;
        try {
            Statics.field2956 = 16;
            Statics.field208 = var17;
            try {
                Statics.field1897 = System.getProperty("os.name");
            } catch (Exception var62) {
                Statics.field1897 = "Unknown";
            }
            Statics.field1526 = Statics.field1897.toLowerCase();
            try {
                Statics.field1262 = System.getProperty("user.home");
                if (Statics.field1262 != null) {
                    Statics.field1262 = Statics.field1262 + "/";
                }
            } catch (Exception var61) {
            }
            try {
                if (Statics.field1526.startsWith("win")) {
                    if (Statics.field1262 == null) {
                        Statics.field1262 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1262 == null) {
                    Statics.field1262 = System.getenv("HOME");
                }
                if (Statics.field1262 != null) {
                    Statics.field1262 = Statics.field1262 + "/";
                }
            } catch (Exception var60) {
            }
            if (Statics.field1262 == null) {
                Statics.field1262 = "~/";
            }
            Statics.field1887 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1262, "/tmp/", "" };
            Statics.field694 = new String[] { ".jagex_cache_" + Statics.field208, ".file_store_" + Statics.field208 };
            int var21 = 0;
            label279: while (var21 < 4) {
                String var22 = var21 == 0 ? "" : "" + var21;
                Statics.field2100 = new File(Statics.field1262, "jagex_cl_oldschool_" + var16 + var22 + ".dat");
                String var23 = null;
                String var24 = null;
                boolean var25 = false;
                if (Statics.field2100.exists()) {
                    try {
                        class195 var26 = new class195(Statics.field2100, "rw", 10000L);
                        class107 var27 = new class107((int) var26.method3431());
                        while (var27.field1839 < var27.field1840.length) {
                            int var28 = var26.method3434(var27.field1840, var27.field1839, var27.field1840.length - var27.field1839);
                            if (var28 == -1) {
                                throw new IOException();
                            }
                            var27.field1839 += var28;
                        }
                        var27.field1839 = 0;
                        int var29 = var27.method2139();
                        if (var29 < 1 || var29 > 3) {
                            throw new IOException("" + var29);
                        }
                        int var30 = 0;
                        if (var29 > 1) {
                            var30 = var27.method2139();
                        }
                        if (var29 <= 2) {
                            var23 = var27.method2148();
                            if (var30 == 1) {
                                var24 = var27.method2148();
                            }
                        } else {
                            var23 = var27.method2258();
                            if (var30 == 1) {
                                var24 = var27.method2258();
                            }
                        }
                        var26.method3430();
                    } catch (IOException var65) {
                        var65.printStackTrace();
                    }
                    if (var23 != null) {
                        File var32 = new File(var23);
                        if (!var32.exists()) {
                            var23 = null;
                        }
                    }
                    if (var23 != null) {
                        File var33 = new File(var23, "test.dat");
                        if (!class136.method2089(var33, true)) {
                            var23 = null;
                        }
                    }
                }
                if (var23 == null && var21 == 0) {
                    label255: for (int var34 = 0; var34 < Statics.field694.length; var34++) {
                        for (int var35 = 0; var35 < Statics.field1887.length; var35++) {
                            File var36 = new File(Statics.field1887[var35] + Statics.field694[var34] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var36.exists() && class136.method2089(new File(var36, "test.dat"), true)) {
                                var23 = var36.toString();
                                var25 = true;
                                break label255;
                            }
                        }
                    }
                }
                if (var23 == null) {
                    var23 = Statics.field1262 + File.separatorChar + "jagexcache" + var22 + File.separatorChar + "oldschool" + File.separatorChar + var16 + File.separatorChar;
                    var25 = true;
                }
                if (var24 != null) {
                    File var37 = new File(var24);
                    File var38 = new File(var23);
                    try {
                        File[] var39 = var37.listFiles();
                        File[] var40 = var39;
                        for (int var41 = 0; var41 < var40.length; var41++) {
                            File var42 = var40[var41];
                            File var43 = new File(var38, var42.getName());
                            boolean var44 = var42.renameTo(var43);
                            if (!var44) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var64) {
                        var64.printStackTrace();
                    }
                    var25 = true;
                }
                if (var25) {
                    class136.method1890(new File(var23), (File) null);
                }
                File var46 = new File(var23);
                Statics.field2097 = var46;
                if (!Statics.field2097.exists()) {
                    Statics.field2097.mkdirs();
                }
                File[] var47 = Statics.field2097.listFiles();
                if (var47 == null) {
                    break;
                }
                File[] var48 = var47;
                int var49 = 0;
                while (true) {
                    if (var49 >= var48.length) {
                        break label279;
                    }
                    File var50 = var48[var49];
                    if (!class136.method2089(var50, false)) {
                        var21++;
                        break;
                    }
                    var49++;
                }
            }
            class122.method87(Statics.field2097);
            try {
                File var51 = new File(Statics.field1262, "random.dat");
                if (var51.exists()) {
                    class136.field2104 = new class196(new class195(var51, "rw", 25L), 24, 0);
                } else {
                    label210: for (int var52 = 0; var52 < Statics.field694.length; var52++) {
                        for (int var53 = 0; var53 < Statics.field1887.length; var53++) {
                            File var54 = new File(Statics.field1887[var53] + Statics.field694[var52] + File.separatorChar + "random.dat");
                            if (var54.exists()) {
                                class136.field2104 = new class196(new class195(var54, "rw", 25L), 24, 0);
                                break label210;
                            }
                        }
                    }
                }
                if (class136.field2104 == null) {
                    RandomAccessFile var55 = new RandomAccessFile(var51, "rw");
                    int var56 = var55.read();
                    var55.seek(0L);
                    var55.write(var56);
                    var55.seek(0L);
                    var55.close();
                    class136.field2104 = new class196(new class195(var51, "rw", 25L), 24, 0);
                }
            } catch (IOException var63) {
            }
            class136.field2105 = new class196(new class195(class122.method2443("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class136.field2112 = new class196(new class195(class122.method2443("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2107 = new class196[Statics.field2956];
            for (int var58 = 0; var58 < Statics.field2956; var58++) {
                Statics.field2107[var58] = new class196(new class195(class122.method2443("main_file_cache.idx" + var58), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var66) {
            class135.method495((String) null, var66);
        }
        Statics.field247 = this;
        this.method2587(765, 503, 60);
    }

    @ObfuscatedName("bp.k(I)V")
    public static final void method1440() {
        class79.field1362 = false;
        field255 = false;
    }

    @ObfuscatedName("client.l(B)V")
    public final void method166() {
        Statics.field286 = field252 == 0 ? 43594 : field249 + 40000;
        Statics.field152 = field252 == 0 ? 443 : field249 + 50000;
        Statics.field1938 = Statics.field286;
        Statics.field2663 = class153.field2654;
        Statics.field2678 = class153.field2650;
        Statics.field567 = class153.field2651;
        Statics.field2677 = class153.field2652;
        class124.method1887();
        Canvas var1 = Statics.field632;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1985);
        var1.addFocusListener(class124.field1985);
        class127.method719(Statics.field632);
        Statics.field543 = class118.method2408();
        if (Statics.field543 != null) {
            Statics.field543.method2428(Statics.field632);
        }
        Statics.field1764 = new class121(255, class136.field2105, class136.field2112, 500000);
        class195 var2 = null;
        class9 var3 = new class9();
        try {
            var2 = class136.method602("", Statics.field253.field2138, false);
            byte[] var4 = new byte[(int) var2.method3431()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3434(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class9(new class107(var4));
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method3430();
            }
        } catch (Exception var10) {
        }
        Statics.field123 = var3;
        Statics.field223 = this.getToolkit().getSystemClipboard();
        class125.method2083(this, Statics.field1769);
        if (field252 != 0) {
            field265 = true;
        }
    }

    @ObfuscatedName("client.e(I)V")
    public final void method167() {
        field259++;
        this.method262();
        while (true) {
            class177 var1 = class149.field2493;
            class148 var2;
            synchronized (class149.field2493) {
                var2 = (class148) class149.field2491.method3235();
            }
            if (var2 == null) {
                try {
                    if (class161.field2712 == 1) {
                        int var4 = Statics.field64.method3122();
                        if (var4 > 0 && Statics.field64.method3042()) {
                            int var5 = var4 - Statics.field539;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field64.method3068(var5);
                        } else {
                            Statics.field64.method3041();
                            Statics.field64.method3039();
                            if (Statics.field2647 == null) {
                                class161.field2712 = 0;
                            } else {
                                class161.field2712 = 2;
                            }
                            Statics.field1881 = null;
                            Statics.field1926 = null;
                        }
                    }
                } catch (Exception var469) {
                    var469.printStackTrace();
                    Statics.field64.method3041();
                    class161.field2712 = 0;
                    Statics.field1881 = null;
                    Statics.field1926 = null;
                    Statics.field2647 = null;
                }
                method150();
                class124 var7 = class124.field1985;
                synchronized (class124.field1985) {
                    class124.field1974++;
                    class124.field1991 = class124.field1993;
                    class124.field1996 = 0;
                    if (class124.field1986 >= 0) {
                        while (class124.field1986 != class124.field1976) {
                            int var9 = class124.field1984[class124.field1976];
                            class124.field1976 = class124.field1976 + 1 & 0x7F;
                            if (var9 < 0) {
                                class124.field1994[~var9] = false;
                            } else {
                                if (!class124.field1994[var9] && class124.field1996 < class124.field1989.length - 1) {
                                    class124.field1989[++class124.field1996 - 1] = var9;
                                }
                                class124.field1994[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class124.field1994[var8] = false;
                        }
                        class124.field1986 = class124.field1976;
                    }
                    class124.field1993 = class124.field1970;
                }
                class127.method609();
                if (Statics.field543 != null) {
                    int var11 = Statics.field543.method2416();
                    field446 = var11;
                }
                if (field257 == 0) {
                    method161();
                    class131.method1089();
                } else if (field257 == 5) {
                    class28.method857(this);
                    method161();
                    class131.method1089();
                } else if (field257 == 10 || field257 == 11) {
                    class28.method857(this);
                } else if (field257 == 20) {
                    class28.method857(this);
                    method2348();
                } else if (field257 == 25) {
                    method1088();
                }
                if (field257 == 30) {
                    if (field266 > 1) {
                        field266--;
                    }
                    if (field297 > 0) {
                        field297--;
                    }
                    if (field263) {
                        field263 = false;
                        method1052();
                    } else {
                        if (!field495) {
                            field396[0] = class142.field2262;
                            field412[0] = "";
                            field394[0] = 1006;
                            field391 = 1;
                        }
                        for (int var12 = 0; var12 < 100; var12++) {
                            boolean var13;
                            if (Statics.field1054 == null) {
                                var13 = false;
                            } else {
                                label3062: {
                                    try {
                                        int var14 = Statics.field1054.method2568();
                                        if (var14 == 0) {
                                            var13 = false;
                                            break label3062;
                                        }
                                        if (field294 == -1) {
                                            Statics.field1054.method2569(field292.field1840, 0, 1);
                                            field292.field1839 = 0;
                                            field294 = field292.method2369();
                                            field471 = class166.field2806[field294];
                                            var14--;
                                        }
                                        if (field471 == -1) {
                                            if (var14 <= 0) {
                                                var13 = false;
                                                break label3062;
                                            }
                                            Statics.field1054.method2569(field292.field1840, 0, 1);
                                            field471 = field292.field1840[0] & 0xFF;
                                            var14--;
                                        }
                                        if (field471 == -2) {
                                            if (var14 <= 1) {
                                                var13 = false;
                                                break label3062;
                                            }
                                            Statics.field1054.method2569(field292.field1840, 0, 2);
                                            field292.field1839 = 0;
                                            field471 = field292.method2141();
                                            var14 -= 2;
                                        }
                                        if (var14 < field471) {
                                            var13 = false;
                                            break label3062;
                                        }
                                        field292.field1839 = 0;
                                        Statics.field1054.method2569(field292.field1840, 0, field471);
                                        field462 = 0;
                                        field300 = field299;
                                        field299 = field347;
                                        field347 = field294;
                                        if (field294 == 37) {
                                            method1894();
                                            field294 = -1;
                                            var13 = false;
                                            break label3062;
                                        }
                                        if (field294 == 227) {
                                            int var15 = field292.method2141();
                                            int var16 = field292.method2141();
                                            int var17 = field292.method2178();
                                            class152 var18 = class152.method2801(var17);
                                            var18.field2618 = (var16 << 16) + var15;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 207) {
                                            String var19 = field292.method2147();
                                            int var20 = field292.method2141();
                                            byte var21 = field292.method2140();
                                            boolean var22 = false;
                                            if (var21 == -128) {
                                                var22 = true;
                                            }
                                            if (var22) {
                                                if (Statics.field1822 == 0) {
                                                    field294 = -1;
                                                    var13 = true;
                                                    break label3062;
                                                }
                                                boolean var23 = false;
                                                int var24;
                                                for (var24 = 0; var24 < Statics.field1822 && (!Statics.field526[var24].field561.equals(var19) || Statics.field526[var24].field562 != var20); var24++) {
                                                }
                                                if (var24 < Statics.field1822) {
                                                    while (var24 < Statics.field1822 - 1) {
                                                        Statics.field526[var24] = Statics.field526[var24 + 1];
                                                        var24++;
                                                    }
                                                    Statics.field1822--;
                                                    Statics.field526[Statics.field1822] = null;
                                                }
                                            } else {
                                                field292.method2147();
                                                class21 var25 = new class21();
                                                var25.field561 = var19;
                                                var25.field569 = class200.method35(var25.field561, Statics.field883);
                                                var25.field562 = var20;
                                                var25.field560 = var21;
                                                int var26;
                                                for (var26 = Statics.field1822 - 1; var26 >= 0; var26--) {
                                                    int var27 = Statics.field526[var26].field569.compareTo(var25.field561);
                                                    if (var27 == 0) {
                                                        Statics.field526[var26].field562 = var20;
                                                        Statics.field526[var26].field560 = var21;
                                                        if (var19.equals(Statics.field61.field45)) {
                                                            Statics.field828 = var21;
                                                        }
                                                        field442 = field275;
                                                        field294 = -1;
                                                        var13 = true;
                                                        break label3062;
                                                    }
                                                    if (var27 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field1822 >= Statics.field526.length) {
                                                    field294 = -1;
                                                    var13 = true;
                                                    break label3062;
                                                }
                                                for (int var28 = Statics.field1822 - 1; var28 > var26; var28--) {
                                                    Statics.field526[var28 + 1] = Statics.field526[var28];
                                                }
                                                if (Statics.field1822 == 0) {
                                                    Statics.field526 = new class21[100];
                                                }
                                                Statics.field526[var26 + 1] = var25;
                                                Statics.field1822++;
                                                if (var19.equals(Statics.field61.field45)) {
                                                    Statics.field828 = var21;
                                                }
                                            }
                                            field442 = field275;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 94) {
                                            field430 = true;
                                            Statics.field1057 = field292.method2139();
                                            Statics.field586 = field292.method2139();
                                            Statics.field1492 = field292.method2141();
                                            Statics.field225 = field292.method2139();
                                            Statics.field964 = field292.method2139();
                                            if (Statics.field964 >= 100) {
                                                Statics.field1808 = Statics.field1057 * 128 + 64;
                                                Statics.field2930 = Statics.field586 * 128 + 64;
                                                Statics.field11 = method1(Statics.field1808, Statics.field2930, Statics.field975) - Statics.field1492;
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 105) {
                                            int var29 = field292.method2139();
                                            int var30 = field292.method2288();
                                            int var31 = field292.method2178();
                                            class4 var32 = (class4) field410.method3201((long) var31);
                                            if (var32 != null) {
                                                method34(var32, var32.field56 != var30);
                                            }
                                            class4 var33 = new class4();
                                            var33.field56 = var30;
                                            var33.field55 = var29;
                                            field410.method3202(var33, (long) var31);
                                            method130(var30);
                                            class32.method520(var30);
                                            class152 var34 = class152.method2801(var31);
                                            if (var34 != null) {
                                                method2553(var34);
                                            }
                                            if (field413 != null) {
                                                method2553(field413);
                                                field413 = null;
                                            }
                                            method2665();
                                            if (field409 != -1) {
                                                int var35 = field409;
                                                if (class152.method2777(var35)) {
                                                    method1805(Statics.field2616[var35], 1);
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 162) {
                                            field292.field1839 += 28;
                                            if (field292.method2159()) {
                                                class110 var36 = field292;
                                                int var37 = field292.field1839 - 28;
                                                if (class136.field2104 != null) {
                                                    try {
                                                        class136.field2104.method3450(0L);
                                                        class136.field2104.method3446(var36.field1840, var37, 24);
                                                    } catch (Exception var458) {
                                                    }
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 223) {
                                            String var39 = field292.method2147();
                                            Object[] var40 = new Object[var39.length() + 1];
                                            for (int var41 = var39.length() - 1; var41 >= 0; var41--) {
                                                if (var39.charAt(var41) == 's') {
                                                    var40[var41 + 1] = field292.method2147();
                                                } else {
                                                    var40[var41 + 1] = Integer.valueOf(field292.method2144());
                                                }
                                            }
                                            var40[0] = Integer.valueOf(field292.method2144());
                                            class1 var42 = new class1();
                                            var42.field4 = var40;
                                            class32.method120(var42);
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 174) {
                                            int var43 = field292.method2139();
                                            int var44 = field292.method2139();
                                            int var45 = field292.method2139();
                                            int var46 = field292.method2139();
                                            field492[var43] = true;
                                            field269[var43] = var44;
                                            field494[var43] = var45;
                                            field397[var43] = var46;
                                            field496[var43] = 0;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 213) {
                                            int var47 = field292.method2144();
                                            int var48 = field292.method2141();
                                            if (var47 < -70000) {
                                                var48 += 32768;
                                            }
                                            class152 var49;
                                            if (var47 >= 0) {
                                                var49 = class152.method2801(var47);
                                            } else {
                                                var49 = null;
                                            }
                                            while (field292.field1839 < field471) {
                                                int var50 = field292.method2152();
                                                int var51 = field292.method2141();
                                                int var52 = 0;
                                                if (var51 != 0) {
                                                    var52 = field292.method2139();
                                                    if (var52 == 255) {
                                                        var52 = field292.method2144();
                                                    }
                                                }
                                                if (var49 != null && var50 >= 0 && var50 < var49.field2631.length) {
                                                    var49.field2631[var50] = var51;
                                                    var49.field2632[var50] = var52;
                                                }
                                                class14.method9(var48, var50, var51 - 1, var52);
                                            }
                                            if (var49 != null) {
                                                method2553(var49);
                                            }
                                            method453();
                                            field436[++field437 - 1 & 0x1F] = var48 & 0x7FFF;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 246) {
                                            field405 = 0;
                                            field489 = 0;
                                            field292.method2352();
                                            int var53 = field292.method2353(1);
                                            if (var53 != 0) {
                                                int var54 = field292.method2353(2);
                                                if (var54 == 0) {
                                                    field371[++field489 - 1] = 2047;
                                                } else if (var54 == 1) {
                                                    int var55 = field292.method2353(3);
                                                    Statics.field61.method595(var55, false);
                                                    int var56 = field292.method2353(1);
                                                    if (var56 == 1) {
                                                        field371[++field489 - 1] = 2047;
                                                    }
                                                } else if (var54 == 2) {
                                                    int var57 = field292.method2353(3);
                                                    Statics.field61.method595(var57, true);
                                                    int var58 = field292.method2353(3);
                                                    Statics.field61.method595(var58, true);
                                                    int var59 = field292.method2353(1);
                                                    if (var59 == 1) {
                                                        field371[++field489 - 1] = 2047;
                                                    }
                                                } else if (var54 == 3) {
                                                    int var60 = field292.method2353(1);
                                                    int var61 = field292.method2353(7);
                                                    Statics.field975 = field292.method2353(2);
                                                    int var62 = field292.method2353(7);
                                                    int var63 = field292.method2353(1);
                                                    if (var63 == 1) {
                                                        field371[++field489 - 1] = 2047;
                                                    }
                                                    Statics.field61.method594(var61, var62, var60 == 1);
                                                }
                                            }
                                            method1993();
                                            while (field292.method2350(field471) >= 11) {
                                                int var64 = field292.method2353(11);
                                                if (var64 == 2047) {
                                                    break;
                                                }
                                                boolean var65 = false;
                                                if (field433[var64] == null) {
                                                    field433[var64] = new class3();
                                                    if (field372[var64] != null) {
                                                        field433[var64].method14(field372[var64]);
                                                    }
                                                    var65 = true;
                                                }
                                                field369[++field337 - 1] = var64;
                                                class3 var66 = field433[var64];
                                                var66.field768 = field259;
                                                int var67 = field380[field292.method2353(3)];
                                                if (var65) {
                                                    var66.field737 = var66.field728 = var67;
                                                }
                                                int var68 = field292.method2353(1);
                                                int var69 = field292.method2353(5);
                                                if (var69 > 15) {
                                                    var69 -= 32;
                                                }
                                                int var70 = field292.method2353(1);
                                                if (var70 == 1) {
                                                    field371[++field489 - 1] = var64;
                                                }
                                                int var71 = field292.method2353(5);
                                                if (var71 > 15) {
                                                    var71 -= 32;
                                                }
                                                var66.method594(Statics.field61.field774[0] + var69, Statics.field61.field775[0] + var71, var68 == 1);
                                            }
                                            field292.method2358();
                                            method915();
                                            for (int var72 = 0; var72 < field405; var72++) {
                                                int var73 = field345[var72];
                                                if (field259 != field433[var73].field768) {
                                                    field433[var73] = null;
                                                }
                                            }
                                            if (field471 != field292.field1839) {
                                                throw new RuntimeException(field292.field1839 + class2.field22 + field471);
                                            }
                                            for (int var74 = 0; var74 < field337; var74++) {
                                                if (field433[field369[var74]] == null) {
                                                    throw new RuntimeException(var74 + class2.field22 + field337);
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 240) {
                                            String var75 = field292.method2147();
                                            class110 var76 = field292;
                                            String var80;
                                            try {
                                                int var77 = var76.method2152();
                                                if (var77 > 32767) {
                                                    var77 = 32767;
                                                }
                                                byte[] var78 = new byte[var77];
                                                var76.field1839 += Statics.field2902.method2072(var76.field1840, var76.field1839, var78, 0, var77);
                                                String var79 = class201.method466(var78, 0, var77);
                                                var80 = var79;
                                            } catch (Exception var457) {
                                                var80 = "Cabbage";
                                            }
                                            String var83 = class192.method3355(Statics.method2387(var80));
                                            Statics.method1994(6, var75, var83);
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 221) {
                                            for (int var84 = 0; var84 < Statics.field1060; var84++) {
                                                class46 var85 = class46.method769(var84);
                                                if (var85 != null) {
                                                    class154.field2662[var84] = 0;
                                                    class154.field2660[var84] = 0;
                                                }
                                            }
                                            method453();
                                            field435 += 32;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 141) {
                                            int var86 = field292.method2173();
                                            int var87 = field292.method2144();
                                            class152 var88 = class152.method2801(var87);
                                            if (var88.field2561 != 2 || var88.field2562 != var86) {
                                                var88.field2561 = 2;
                                                var88.field2562 = var86;
                                                method2553(var88);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 18) {
                                            field266 = field292.method2141() * 30;
                                            field443 = field275;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 95) {
                                            String var89 = field292.method2147();
                                            int var90 = field292.method2144();
                                            class152 var91 = class152.method2801(var90);
                                            if (!var89.equals(var91.field2576)) {
                                                var91.field2576 = var89;
                                                method2553(var91);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 232 || field294 == 216 || field294 == 71 || field294 == 250 || field294 == 85 || field294 == 155 || field294 == 67 || field294 == 126 || field294 == 92 || field294 == 29) {
                                            method1807();
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 79) {
                                            int var92 = field292.method2182();
                                            class152 var93 = class152.method2801(var92);
                                            for (int var94 = 0; var94 < var93.field2631.length; var94++) {
                                                var93.field2631[var94] = -1;
                                                var93.field2631[var94] = 0;
                                            }
                                            method2553(var93);
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 202) {
                                            Statics.field31 = field292.method2234();
                                            Statics.field1292 = field292.method2139();
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 19) {
                                            int var95 = field292.method2127();
                                            class14.method83(var95);
                                            field436[++field437 - 1 & 0x1F] = var95 & 0x7FFF;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 154) {
                                            int var96 = field292.method2152();
                                            boolean var97 = field292.method2139() == 1;
                                            String var98 = "";
                                            boolean var99 = false;
                                            if (var97) {
                                                var98 = field292.method2147();
                                                if (method1875(var98)) {
                                                    var99 = true;
                                                }
                                            }
                                            String var100 = field292.method2147();
                                            if (!var99) {
                                                Statics.method1994(var96, var98, var100);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 167) {
                                            int var101 = field292.method2144();
                                            class4 var102 = (class4) field410.method3201((long) var101);
                                            if (var102 != null) {
                                                method34(var102, true);
                                            }
                                            if (field413 != null) {
                                                method2553(field413);
                                                field413 = null;
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 237) {
                                            for (int var103 = 0; var103 < field433.length; var103++) {
                                                if (field433[var103] != null) {
                                                    field433[var103].field751 = -1;
                                                }
                                            }
                                            for (int var104 = 0; var104 < field287.length; var104++) {
                                                if (field287[var104] != null) {
                                                    field287[var104].field751 = -1;
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 104) {
                                            field477 = field292.method2139();
                                            if (field477 == 255) {
                                                field477 = 0;
                                            }
                                            field438 = field292.method2139();
                                            if (field438 == 255) {
                                                field438 = 0;
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 44) {
                                            method1804(true);
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 131) {
                                            field323 = field292.method2139();
                                            field463 = field292.method2139();
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 55) {
                                            int var105 = field292.method2182();
                                            int var106 = field292.method2133();
                                            int var107 = field292.method2127();
                                            if (var107 == 65535) {
                                                var107 = -1;
                                            }
                                            int var108 = field292.method2288();
                                            if (var108 == 65535) {
                                                var108 = -1;
                                            }
                                            for (int var109 = var108; var109 <= var107; var109++) {
                                                long var110 = ((long) var106 << 32) + (long) var109;
                                                class186 var112 = field450.method3201(var110);
                                                if (var112 != null) {
                                                    var112.method3322();
                                                }
                                                field450.method3202(new class179(var105), var110);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 11) {
                                            while (field292.field1839 < field471) {
                                                boolean var113 = field292.method2139() == 1;
                                                String var114 = field292.method2147();
                                                String var115 = field292.method2147();
                                                int var116 = field292.method2141();
                                                int var117 = field292.method2139();
                                                int var118 = field292.method2139();
                                                boolean var119 = (var118 & 0x2) != 0;
                                                boolean var120 = (var118 & 0x1) != 0;
                                                if (var116 > 0) {
                                                    field292.method2147();
                                                    field292.method2139();
                                                    field292.method2144();
                                                }
                                                field292.method2147();
                                                for (int var121 = 0; var121 < field497; var121++) {
                                                    class16 var122 = field499[var121];
                                                    if (var113) {
                                                        if (var115.equals(var122.field227)) {
                                                            var122.field227 = var114;
                                                            var122.field219 = var115;
                                                            var114 = null;
                                                            break;
                                                        }
                                                    } else if (var114.equals(var122.field227)) {
                                                        if (var122.field226 != var116) {
                                                            boolean var123 = true;
                                                            for (class34 var124 = (class34) field500.method3192(); var124 != null; var124 = (class34) field500.method3193()) {
                                                                if (var124.field783.equals(var114)) {
                                                                    if (var116 != 0 && var124.field784 == 0) {
                                                                        var124.method3317();
                                                                        var123 = false;
                                                                    } else if (var116 == 0 && var124.field784 != 0) {
                                                                        var124.method3317();
                                                                        var123 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var123) {
                                                                field500.method3198(new class34(var114, var116));
                                                            }
                                                            var122.field226 = var116;
                                                        }
                                                        var122.field219 = var115;
                                                        var122.field221 = var117;
                                                        var122.field222 = var119;
                                                        var122.field220 = var120;
                                                        var114 = null;
                                                        break;
                                                    }
                                                }
                                                if (var114 != null && field497 < 400) {
                                                    class16 var125 = new class16();
                                                    field499[field497] = var125;
                                                    var125.field227 = var114;
                                                    var125.field219 = var115;
                                                    var125.field226 = var116;
                                                    var125.field221 = var117;
                                                    var125.field222 = var119;
                                                    var125.field220 = var120;
                                                    field497++;
                                                }
                                            }
                                            field498 = 2;
                                            field441 = field275;
                                            boolean var126 = false;
                                            int var127 = field497;
                                            while (var127 > 0) {
                                                boolean var128 = true;
                                                var127--;
                                                for (int var129 = 0; var129 < var127; var129++) {
                                                    boolean var130 = false;
                                                    class16 var131 = field499[var129];
                                                    class16 var132 = field499[var129 + 1];
                                                    if (field249 != var131.field226 && field249 == var132.field226) {
                                                        var130 = true;
                                                    }
                                                    if (!var130 && var131.field226 == 0 && var132.field226 != 0) {
                                                        var130 = true;
                                                    }
                                                    if (!var130 && !var131.field222 && var132.field222) {
                                                        var130 = true;
                                                    }
                                                    if (!var130 && !var131.field220 && var132.field220) {
                                                        var130 = true;
                                                    }
                                                    if (var130) {
                                                        class16 var133 = field499[var129];
                                                        field499[var129] = field499[var129 + 1];
                                                        field499[var129 + 1] = var133;
                                                        var128 = false;
                                                    }
                                                }
                                                if (var128) {
                                                    break;
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 205) {
                                            method453();
                                            field415 = field292.method2142();
                                            field443 = field275;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 15) {
                                            Statics.field31 = field292.method2139();
                                            Statics.field1292 = field292.method2163();
                                            while (field292.field1839 < field471) {
                                                field294 = field292.method2139();
                                                method1807();
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 116) {
                                            while (field292.field1839 < field471) {
                                                int var134 = field292.method2139();
                                                boolean var135 = (var134 & 0x1) == 1;
                                                String var136 = field292.method2147();
                                                String var137 = field292.method2147();
                                                field292.method2147();
                                                for (int var138 = 0; var138 < field473; var138++) {
                                                    class8 var139 = field502[var138];
                                                    if (var135) {
                                                        if (var137.equals(var139.field132)) {
                                                            var139.field132 = var136;
                                                            var139.field124 = var137;
                                                            var136 = null;
                                                            break;
                                                        }
                                                    } else if (var136.equals(var139.field132)) {
                                                        var139.field132 = var136;
                                                        var139.field124 = var137;
                                                        var136 = null;
                                                        break;
                                                    }
                                                }
                                                if (var136 != null && field473 < 400) {
                                                    class8 var140 = new class8();
                                                    field502[field473] = var140;
                                                    var140.field132 = var136;
                                                    var140.field124 = var137;
                                                    field473++;
                                                }
                                            }
                                            field441 = field275;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 134) {
                                            field479 = field292.method2139();
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 219) {
                                            field442 = field275;
                                            if (field471 == 0) {
                                                field511 = null;
                                                field478 = null;
                                                Statics.field1822 = 0;
                                                Statics.field526 = null;
                                                field294 = -1;
                                                var13 = true;
                                                break label3062;
                                            }
                                            field478 = field292.method2147();
                                            long var141 = field292.method2145();
                                            long var143 = var141;
                                            String var145;
                                            if (var141 <= 0L || var141 >= 6582952005840035281L) {
                                                var145 = null;
                                            } else if (var141 % 37L == 0L) {
                                                var145 = null;
                                            } else {
                                                int var146 = 0;
                                                for (long var147 = var141; var147 != 0L; var147 /= 37L) {
                                                    var146++;
                                                }
                                                StringBuilder var149 = new StringBuilder(var146);
                                                while (var143 != 0L) {
                                                    long var150 = var143;
                                                    var143 /= 37L;
                                                    var149.append(class198.field2957[(int) (var150 - var143 * 37L)]);
                                                }
                                                var145 = var149.reverse().toString();
                                            }
                                            field511 = var145;
                                            Statics.field1341 = field292.method2140();
                                            int var152 = field292.method2139();
                                            if (var152 == 255) {
                                                field294 = -1;
                                                var13 = true;
                                                break label3062;
                                            }
                                            Statics.field1822 = var152;
                                            class21[] var153 = new class21[100];
                                            for (int var154 = 0; var154 < Statics.field1822; var154++) {
                                                var153[var154] = new class21();
                                                var153[var154].field561 = field292.method2147();
                                                var153[var154].field569 = class200.method35(var153[var154].field561, Statics.field883);
                                                var153[var154].field562 = field292.method2141();
                                                var153[var154].field560 = field292.method2140();
                                                field292.method2147();
                                                if (var153[var154].field561.equals(Statics.field61.field45)) {
                                                    Statics.field828 = var153[var154].field560;
                                                }
                                            }
                                            boolean var155 = false;
                                            int var156 = Statics.field1822;
                                            while (var156 > 0) {
                                                boolean var157 = true;
                                                var156--;
                                                for (int var158 = 0; var158 < var156; var158++) {
                                                    if (var153[var158].field569.compareTo(var153[var158 + 1].field569) > 0) {
                                                        class21 var159 = var153[var158];
                                                        var153[var158] = var153[var158 + 1];
                                                        var153[var158 + 1] = var159;
                                                        var157 = false;
                                                    }
                                                }
                                                if (var157) {
                                                    break;
                                                }
                                            }
                                            Statics.field526 = var153;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 129) {
                                            method1354();
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 138) {
                                            String var160 = field292.method2147();
                                            long var161 = field292.method2145();
                                            long var163 = (long) field292.method2141();
                                            long var165 = (long) field292.method2230();
                                            int var167 = field292.method2139();
                                            long var168 = (var163 << 32) + var165;
                                            boolean var170 = false;
                                            for (int var171 = 0; var171 < 100; var171++) {
                                                if (field464[var171] == var168) {
                                                    var170 = true;
                                                    break;
                                                }
                                            }
                                            if (var167 <= 1 && method1875(var160)) {
                                                var170 = true;
                                            }
                                            if (!var170 && field366 == 0) {
                                                field464[field465] = var168;
                                                field465 = (field465 + 1) % 100;
                                                class110 var172 = field292;
                                                String var176;
                                                try {
                                                    int var173 = var172.method2152();
                                                    if (var173 > 32767) {
                                                        var173 = 32767;
                                                    }
                                                    byte[] var174 = new byte[var173];
                                                    var172.field1839 += Statics.field2902.method2072(var172.field1840, var172.field1839, var174, 0, var173);
                                                    String var175 = class201.method466(var174, 0, var173);
                                                    var176 = var175;
                                                } catch (Exception var456) {
                                                    var176 = "Cabbage";
                                                }
                                                String var179 = class192.method3355(Statics.method2387(var176));
                                                if (var167 == 2 || var167 == 3) {
                                                    class10.method804(9, class2.method2799(1) + var160, var179, class198.method3(var161));
                                                } else if (var167 == 1) {
                                                    class10.method804(9, class2.method2799(0) + var160, var179, class198.method3(var161));
                                                } else {
                                                    class10.method804(9, var160, var179, class198.method3(var161));
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 87) {
                                            int var180 = field292.method2182();
                                            int var181 = field292.method2142();
                                            class152 var182 = class152.method2801(var180);
                                            if (var182.field2565 != var181 || var181 == -1) {
                                                var182.field2565 = var181;
                                                var182.field2635 = 0;
                                                var182.field2563 = 0;
                                                method2553(var182);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 139) {
                                            int var183 = field292.method2182();
                                            int var184 = field292.method2127();
                                            class152 var185 = class152.method2801(var183);
                                            if (var185 != null && var185.field2566 == 0) {
                                                if (var184 > var185.field2545 - var185.field2548) {
                                                    var184 = var185.field2545 - var185.field2548;
                                                }
                                                if (var184 < 0) {
                                                    var184 = 0;
                                                }
                                                if (var185.field2543 != var184) {
                                                    var185.field2543 = var184;
                                                    method2553(var185);
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 121) {
                                            method453();
                                            int var186 = field292.method2139();
                                            int var187 = field292.method2139();
                                            int var188 = field292.method2178();
                                            field466[var186] = var188;
                                            field386[var186] = var187;
                                            field387[var186] = 1;
                                            for (int var189 = 0; var189 < 98; var189++) {
                                                if (var188 >= class140.field2142[var189]) {
                                                    field387[var186] = var189 + 2;
                                                }
                                            }
                                            field331[++field296 - 1 & 0x1F] = var186;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 206) {
                                            method453();
                                            field414 = field292.method2139();
                                            field443 = field275;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 81) {
                                            int var190 = field292.method2173();
                                            if (var190 == 65535) {
                                                var190 = -1;
                                            }
                                            if (var190 == -1 && !field482) {
                                                Statics.field64.method3041();
                                                class161.field2712 = 1;
                                                Statics.field2647 = null;
                                            } else if (var190 != -1 && field481 != var190 && field417 != 0 && !field482) {
                                                class147 var191 = Statics.field224;
                                                int var192 = field417;
                                                class161.field2712 = 1;
                                                Statics.field2647 = var191;
                                                Statics.field2716 = var190;
                                                Statics.field782 = 0;
                                                Statics.field1821 = var192;
                                                Statics.field568 = false;
                                                Statics.field539 = 2;
                                            }
                                            field481 = var190;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 77) {
                                            int var193 = field292.method2230();
                                            int var194 = field292.method2141();
                                            if (var194 == 65535) {
                                                var194 = -1;
                                            }
                                            method2450(var194, var193);
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 51) {
                                            int var195 = field292.method2173();
                                            if (var195 == 65535) {
                                                var195 = -1;
                                            }
                                            int var196 = field292.method2133();
                                            int var197 = field292.method2178();
                                            class152 var198 = class152.method2801(var196);
                                            if (var198.field2613) {
                                                var198.field2633 = var195;
                                                var198.field2533 = var197;
                                                class45 var200 = class45.method744(var195);
                                                var198.field2528 = var200.field1008;
                                                var198.field2570 = var200.field1020;
                                                var198.field2571 = var200.field1021;
                                                var198.field2567 = var200.field1036;
                                                var198.field2568 = var200.field1023;
                                                var198.field2636 = var200.field1019;
                                                if (var198.field2608 > 0) {
                                                    var198.field2636 = var198.field2636 * 32 / var198.field2608;
                                                }
                                                method2553(var198);
                                            } else {
                                                if (var195 == -1) {
                                                    var198.field2561 = 0;
                                                    field294 = -1;
                                                    var13 = true;
                                                    break label3062;
                                                }
                                                class45 var199 = class45.method744(var195);
                                                var198.field2561 = 4;
                                                var198.field2562 = var195;
                                                var198.field2528 = var199.field1008;
                                                var198.field2570 = var199.field1020;
                                                var198.field2636 = var199.field1019 * 100 / var197;
                                                method2553(var198);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 132) {
                                            int var201 = field292.method2142();
                                            int var202 = field292.method2182();
                                            int var203 = field292.method2175();
                                            class152 var204 = class152.method2801(var202);
                                            int var205 = var204.field2536 + var203;
                                            int var206 = var204.field2537 + var201;
                                            if (var204.field2534 != var205 || var204.field2582 != var206) {
                                                var204.field2534 = var205;
                                                var204.field2582 = var206;
                                                method2553(var204);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 76) {
                                            int var207 = field292.method2178();
                                            int var208 = field292.method2288();
                                            class154.field2662[var208] = var207;
                                            if (class154.field2660[var208] != var207) {
                                                class154.field2660[var208] = var207;
                                                method2676(var208);
                                            }
                                            field461[++field435 - 1 & 0x1F] = var208;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 153) {
                                            class110 var209 = field292;
                                            int var210 = field471;
                                            class188 var211 = new class188();
                                            var211.field2879 = var209.method2139();
                                            var211.field2881 = var209.method2144();
                                            var211.field2883 = new int[var211.field2879];
                                            var211.field2882 = new int[var211.field2879];
                                            var211.field2880 = new Field[var211.field2879];
                                            var211.field2884 = new int[var211.field2879];
                                            var211.field2885 = new Method[var211.field2879];
                                            var211.field2886 = new byte[var211.field2879][][];
                                            for (int var212 = 0; var212 < var211.field2879; var212++) {
                                                try {
                                                    int var213 = var209.method2139();
                                                    if (var213 == 0 || var213 == 1 || var213 == 2) {
                                                        String var214 = var209.method2147();
                                                        String var215 = var209.method2147();
                                                        int var216 = 0;
                                                        if (var213 == 1) {
                                                            var216 = var209.method2144();
                                                        }
                                                        var211.field2883[var212] = var213;
                                                        var211.field2884[var212] = var216;
                                                        if (class189.method2804(var214).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        var211.field2880[var212] = class189.method2804(var214).getDeclaredField(var215);
                                                    } else if (var213 == 3 || var213 == 4) {
                                                        String var217 = var209.method2147();
                                                        String var218 = var209.method2147();
                                                        int var219 = var209.method2139();
                                                        String[] var220 = new String[var219];
                                                        for (int var221 = 0; var221 < var219; var221++) {
                                                            var220[var221] = var209.method2147();
                                                        }
                                                        String var222 = var209.method2147();
                                                        byte[][] var223 = new byte[var219][];
                                                        if (var213 == 3) {
                                                            for (int var224 = 0; var224 < var219; var224++) {
                                                                int var225 = var209.method2144();
                                                                var223[var224] = new byte[var225];
                                                                var209.method2150(var223[var224], 0, var225);
                                                            }
                                                        }
                                                        var211.field2883[var212] = var213;
                                                        Class[] var226 = new Class[var219];
                                                        for (int var227 = 0; var227 < var219; var227++) {
                                                            var226[var227] = class189.method2804(var220[var227]);
                                                        }
                                                        Class var228 = class189.method2804(var222);
                                                        if (class189.method2804(var217).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        Method[] var229 = class189.method2804(var217).getDeclaredMethods();
                                                        Method[] var230 = var229;
                                                        for (int var231 = 0; var231 < var230.length; var231++) {
                                                            Method var232 = var230[var231];
                                                            if (var232.getName().equals(var218)) {
                                                                Class[] var233 = var232.getParameterTypes();
                                                                if (var226.length == var233.length) {
                                                                    boolean var234 = true;
                                                                    for (int var235 = 0; var235 < var226.length; var235++) {
                                                                        if (var226[var235] != var233[var235]) {
                                                                            var234 = false;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var234 && var228 == var232.getReturnType()) {
                                                                        var211.field2885[var212] = var232;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var211.field2886[var212] = var223;
                                                    }
                                                } catch (ClassNotFoundException var461) {
                                                    var211.field2882[var212] = -1;
                                                } catch (SecurityException var462) {
                                                    var211.field2882[var212] = -2;
                                                } catch (NullPointerException var463) {
                                                    var211.field2882[var212] = -3;
                                                } catch (Exception var464) {
                                                    var211.field2882[var212] = -4;
                                                } catch (Throwable var465) {
                                                    var211.field2882[var212] = -5;
                                                }
                                            }
                                            class189.field2888.method3268(var211);
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 163) {
                                            field498 = 1;
                                            field441 = field275;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 226) {
                                            int var241 = field292.method2288();
                                            field409 = var241;
                                            method130(var241);
                                            class32.method520(field409);
                                            for (int var242 = 0; var242 < 100; var242++) {
                                                field453[var242] = true;
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 165) {
                                            field430 = true;
                                            Statics.field781 = field292.method2139();
                                            Statics.field1280 = field292.method2139();
                                            Statics.field516 = field292.method2141();
                                            Statics.field992 = field292.method2139();
                                            Statics.field1290 = field292.method2139();
                                            if (Statics.field1290 >= 100) {
                                                int var243 = Statics.field781 * 128 + 64;
                                                int var244 = Statics.field1280 * 128 + 64;
                                                int var245 = method1(var243, var244, Statics.field975) - Statics.field516;
                                                int var246 = var243 - Statics.field1808;
                                                int var247 = var245 - Statics.field11;
                                                int var248 = var244 - Statics.field2930;
                                                int var249 = (int) Math.sqrt((double) (var246 * var246 + var248 * var248));
                                                Statics.field2087 = (int) (Math.atan2((double) var247, (double) var249) * 325.949D) & 0x7FF;
                                                Statics.field2057 = (int) (Math.atan2((double) var246, (double) var248) * -325.949D) & 0x7FF;
                                                if (Statics.field2087 < 128) {
                                                    Statics.field2087 = 128;
                                                }
                                                if (Statics.field2087 > 383) {
                                                    Statics.field2087 = 383;
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 17) {
                                            int var250 = field292.method2288();
                                            int var251 = field292.method2133();
                                            int var252 = field292.method2141();
                                            int var253 = field292.method2173();
                                            class152 var254 = class152.method2801(var251);
                                            if (var254.field2528 != var252 || var254.field2570 != var253 || var254.field2636 != var250) {
                                                var254.field2528 = var252;
                                                var254.field2570 = var253;
                                                var254.field2636 = var250;
                                                method2553(var254);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 143) {
                                            String var255 = field292.method2147();
                                            long var256 = (long) field292.method2141();
                                            long var258 = (long) field292.method2230();
                                            int var260 = field292.method2139();
                                            long var261 = (var256 << 32) + var258;
                                            boolean var263 = false;
                                            for (int var264 = 0; var264 < 100; var264++) {
                                                if (field464[var264] == var261) {
                                                    var263 = true;
                                                    break;
                                                }
                                            }
                                            if (method1875(var255)) {
                                                var263 = true;
                                            }
                                            if (!var263 && field366 == 0) {
                                                field464[field465] = var261;
                                                field465 = (field465 + 1) % 100;
                                                class110 var265 = field292;
                                                String var269;
                                                try {
                                                    int var266 = var265.method2152();
                                                    if (var266 > 32767) {
                                                        var266 = 32767;
                                                    }
                                                    byte[] var267 = new byte[var266];
                                                    var265.field1839 += Statics.field2902.method2072(var265.field1840, var265.field1839, var267, 0, var266);
                                                    String var268 = class201.method466(var267, 0, var266);
                                                    var269 = var268;
                                                } catch (Exception var455) {
                                                    var269 = "Cabbage";
                                                }
                                                String var272 = class192.method3355(Statics.method2387(var269));
                                                if (var260 == 2 || var260 == 3) {
                                                    Statics.method1994(7, class2.method2799(1) + var255, var272);
                                                } else if (var260 == 1) {
                                                    Statics.method1994(7, class2.method2799(0) + var255, var272);
                                                } else {
                                                    Statics.method1994(3, var255, var272);
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 158) {
                                            class22 var273 = new class22();
                                            var273.field573 = field292.method2147();
                                            var273.field581 = field292.method2141();
                                            int var274 = field292.method2144();
                                            var273.field570 = var274;
                                            method2374(45);
                                            Statics.field1054.method2575();
                                            Statics.field1054 = null;
                                            class28.method593(var273);
                                            field294 = -1;
                                            var13 = false;
                                            break label3062;
                                        }
                                        if (field294 == 60) {
                                            int var275 = field292.method2173();
                                            byte var276 = field292.method2180();
                                            class154.field2662[var275] = var276;
                                            if (class154.field2660[var275] != var276) {
                                                class154.field2660[var275] = var276;
                                                method2676(var275);
                                            }
                                            field461[++field435 - 1 & 0x1F] = var275;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 171) {
                                            int var277 = field292.method2139();
                                            class117[] var278 = class117.method3142();
                                            int var279 = 0;
                                            class117 var281;
                                            while (true) {
                                                if (var279 >= var278.length) {
                                                    var281 = null;
                                                    break;
                                                }
                                                class117 var280 = var278[var279];
                                                if (var280.field1907 == var277) {
                                                    var281 = var280;
                                                    break;
                                                }
                                                var279++;
                                            }
                                            Statics.field126 = var281;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 120) {
                                            int var282 = field292.method2144();
                                            Statics.field276 = Statics.field985.method2473(var282);
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 68) {
                                            field430 = false;
                                            for (int var283 = 0; var283 < 5; var283++) {
                                                field492[var283] = false;
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 30) {
                                            int var284 = field292.method2163();
                                            int var285 = field292.method2172();
                                            int var286 = field292.method2163();
                                            Statics.field975 = var286 >> 1;
                                            Statics.field61.method594(var285, var284, (var286 & 0x1) == 1);
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 235) {
                                            int var287 = field292.method2144();
                                            int var288 = field292.method2141();
                                            if (var287 < -70000) {
                                                var288 += 32768;
                                            }
                                            class152 var289;
                                            if (var287 >= 0) {
                                                var289 = class152.method2801(var287);
                                            } else {
                                                var289 = null;
                                            }
                                            if (var289 != null) {
                                                for (int var290 = 0; var290 < var289.field2631.length; var290++) {
                                                    var289.field2631[var290] = 0;
                                                    var289.field2632[var290] = 0;
                                                }
                                            }
                                            class14.method1356(var288);
                                            int var291 = field292.method2141();
                                            for (int var292 = 0; var292 < var291; var292++) {
                                                int var293 = field292.method2139();
                                                if (var293 == 255) {
                                                    var293 = field292.method2144();
                                                }
                                                int var294 = field292.method2288();
                                                if (var289 != null && var292 < var289.field2631.length) {
                                                    var289.field2631[var292] = var294;
                                                    var289.field2632[var292] = var293;
                                                }
                                                class14.method9(var288, var292, var294 - 1, var293);
                                            }
                                            if (var289 != null) {
                                                method2553(var289);
                                            }
                                            method453();
                                            field436[++field437 - 1 & 0x1F] = var288 & 0x7FFF;
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 50) {
                                            field267 = field292.method2139();
                                            if (field267 == 1) {
                                                field268 = field292.method2141();
                                            }
                                            if (field267 >= 2 && field267 <= 6) {
                                                if (field267 == 2) {
                                                    field273 = 64;
                                                    field376 = 64;
                                                }
                                                if (field267 == 3) {
                                                    field273 = 0;
                                                    field376 = 64;
                                                }
                                                if (field267 == 4) {
                                                    field273 = 128;
                                                    field376 = 64;
                                                }
                                                if (field267 == 5) {
                                                    field273 = 64;
                                                    field376 = 0;
                                                }
                                                if (field267 == 6) {
                                                    field273 = 64;
                                                    field376 = 128;
                                                }
                                                field267 = 2;
                                                field270 = field292.method2141();
                                                field271 = field292.method2141();
                                                field272 = field292.method2139();
                                            }
                                            if (field267 == 10) {
                                                field339 = field292.method2141();
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 142) {
                                            for (int var295 = 0; var295 < class154.field2660.length; var295++) {
                                                if (class154.field2662[var295] != class154.field2660[var295]) {
                                                    class154.field2660[var295] = class154.field2662[var295];
                                                    method2676(var295);
                                                    field461[++field435 - 1 & 0x1F] = var295;
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 136) {
                                            int var296 = field292.method2141();
                                            int var297 = field292.method2139();
                                            int var298 = field292.method2141();
                                            if (field356 != 0 && var297 != 0 && field439 < 50) {
                                                field486[field439] = var296;
                                                field301[field439] = var297;
                                                field488[field439] = var298;
                                                field285[field439] = null;
                                                field248[field439] = 0;
                                                field439++;
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 238) {
                                            method1804(false);
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 222) {
                                            if (field409 != -1) {
                                                Statics.method2346(field409, 0);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 145) {
                                            int var302 = field292.method2182();
                                            class152 var303 = class152.method2801(var302);
                                            var303.field2561 = 3;
                                            var303.field2562 = Statics.field61.field40.method2911();
                                            method2553(var303);
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 231) {
                                            int var304 = field292.method2139();
                                            int var305 = field292.method2163();
                                            String var306 = field292.method2147();
                                            if (var305 >= 1 && var305 <= 8) {
                                                if (var306.equalsIgnoreCase("null")) {
                                                    var306 = null;
                                                }
                                                field378[var305 - 1] = var306;
                                                field379[var305 - 1] = var304 == 0;
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 20) {
                                            int var307 = field292.method2127();
                                            int var308 = field292.method2182();
                                            int var309 = var307 >> 10 & 0x1F;
                                            int var310 = var307 >> 5 & 0x1F;
                                            int var311 = var307 & 0x1F;
                                            int var312 = (var311 << 3) + (var309 << 19) + (var310 << 11);
                                            class152 var313 = class152.method2801(var308);
                                            if (var313.field2546 != var312) {
                                                var313.field2546 = var312;
                                                method2553(var313);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 96) {
                                            int var314 = field292.method2182();
                                            int var315 = field292.method2288();
                                            class152 var316 = class152.method2801(var314);
                                            if (var316.field2561 != 1 || var316.field2562 != var315) {
                                                var316.field2561 = 1;
                                                var316.field2562 = var315;
                                                method2553(var316);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 2) {
                                            int var317 = field292.method2144();
                                            boolean var318 = field292.method2163() == 1;
                                            class152 var319 = class152.method2801(var317);
                                            if (var319.field2541 != var318) {
                                                var319.field2541 = var318;
                                                method2553(var319);
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 72) {
                                            int var320 = field471 + field292.field1839;
                                            int var321 = field292.method2141();
                                            int var322 = field292.method2141();
                                            if (field409 != var321) {
                                                field409 = var321;
                                                method130(field409);
                                                class32.method520(field409);
                                                for (int var323 = 0; var323 < 100; var323++) {
                                                    field453[var323] = true;
                                                }
                                            }
                                            while (var322-- > 0) {
                                                int var324 = field292.method2144();
                                                int var325 = field292.method2141();
                                                int var326 = field292.method2139();
                                                class4 var327 = (class4) field410.method3201((long) var324);
                                                if (var327 != null && var327.field56 != var325) {
                                                    method34(var327, true);
                                                    var327 = null;
                                                }
                                                if (var327 == null) {
                                                    class4 var328 = new class4();
                                                    var328.field56 = var325;
                                                    var328.field55 = var326;
                                                    field410.method3202(var328, (long) var324);
                                                    method130(var325);
                                                    class32.method520(var325);
                                                    class152 var329 = class152.method2801(var324);
                                                    if (var329 != null) {
                                                        method2553(var329);
                                                    }
                                                    if (field413 != null) {
                                                        method2553(field413);
                                                        field413 = null;
                                                    }
                                                    method2665();
                                                    if (field409 != -1) {
                                                        int var330 = field409;
                                                        if (class152.method2777(var330)) {
                                                            method1805(Statics.field2616[var330], 1);
                                                        }
                                                    }
                                                    var327 = var328;
                                                }
                                                var327.field60 = true;
                                            }
                                            for (class4 var332 = (class4) field410.method3204(); var332 != null; var332 = (class4) field410.method3203()) {
                                                if (var332.field60) {
                                                    var332.field60 = false;
                                                } else {
                                                    method34(var332, true);
                                                }
                                            }
                                            field450 = new class174(512);
                                            while (field292.field1839 < var320) {
                                                int var333 = field292.method2144();
                                                int var334 = field292.method2141();
                                                int var335 = field292.method2141();
                                                int var336 = field292.method2144();
                                                for (int var337 = var334; var337 <= var335; var337++) {
                                                    long var338 = ((long) var333 << 32) + (long) var337;
                                                    field450.method3202(new class179(var336), var338);
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        if (field294 == 124) {
                                            Statics.field1292 = field292.method2172();
                                            Statics.field31 = field292.method2234();
                                            for (int var340 = Statics.field31; var340 < Statics.field31 + 8; var340++) {
                                                for (int var341 = Statics.field1292; var341 < Statics.field1292 + 8; var341++) {
                                                    if (field384[Statics.field975][var340][var341] != null) {
                                                        field384[Statics.field975][var340][var341] = null;
                                                        method3158(var340, var341);
                                                    }
                                                }
                                            }
                                            for (class15 var342 = (class15) field483.method3237(); var342 != null; var342 = (class15) field483.method3239()) {
                                                if (var342.field214 >= Statics.field31 && var342.field214 < Statics.field31 + 8 && var342.field203 >= Statics.field1292 && var342.field203 < Statics.field1292 + 8 && Statics.field975 == var342.field216) {
                                                    var342.field212 = 0;
                                                }
                                            }
                                            field294 = -1;
                                            var13 = true;
                                            break label3062;
                                        }
                                        class135.method495("" + field294 + class2.field22 + field299 + class2.field22 + field300 + class2.field22 + field471, (Throwable) null);
                                        method1894();
                                    } catch (IOException var466) {
                                        method1052();
                                    } catch (Exception var467) {
                                        String var345 = "" + field294 + class2.field22 + field299 + class2.field22 + field300 + class2.field22 + field471 + class2.field22 + (Statics.field2758 + Statics.field61.field774[0]) + class2.field22 + (Statics.field1113 + Statics.field61.field775[0]) + class2.field22;
                                        for (int var346 = 0; var346 < field471 && var346 < 50; var346++) {
                                            var345 = var345 + field292.field1840[var346] + class2.field22;
                                        }
                                        class135.method495(var345, var467);
                                        method1894();
                                    }
                                    var13 = true;
                                }
                            }
                            if (!var13) {
                                break;
                            }
                        }
                        if (field257 == 30) {
                            while (true) {
                                class188 var347 = (class188) class189.field2888.method3270();
                                boolean var348;
                                if (var347 == null) {
                                    var348 = false;
                                } else {
                                    var348 = true;
                                }
                                if (!var348) {
                                    Object var350 = Statics.field1.field181;
                                    synchronized (Statics.field1.field181) {
                                        if (!field346) {
                                            Statics.field1.field171 = 0;
                                        } else if (class127.field2033 != 0 || Statics.field1.field171 >= 40) {
                                            field290.method2354(59);
                                            field290.method2126(0);
                                            int var351 = field290.field1839;
                                            int var352 = 0;
                                            for (int var353 = 0; var353 < Statics.field1.field171 && field290.field1839 - var351 < 240; var353++) {
                                                var352++;
                                                int var354 = Statics.field1.field175[var353];
                                                if (var354 < 0) {
                                                    var354 = 0;
                                                } else if (var354 > 502) {
                                                    var354 = 502;
                                                }
                                                int var355 = Statics.field1.field174[var353];
                                                if (var355 < 0) {
                                                    var355 = 0;
                                                } else if (var355 > 764) {
                                                    var355 = 764;
                                                }
                                                int var356 = var354 * 765 + var355;
                                                if (Statics.field1.field175[var353] == -1 && Statics.field1.field174[var353] == -1) {
                                                    var355 = -1;
                                                    var354 = -1;
                                                    var356 = 524287;
                                                }
                                                if (field261 != var355 || field262 != var354) {
                                                    int var357 = var355 - field261;
                                                    field261 = var355;
                                                    int var358 = var354 - field262;
                                                    field262 = var354;
                                                    if (field258 < 8 && var357 >= -32 && var357 <= 31 && var358 >= -32 && var358 <= 31) {
                                                        var357 += 32;
                                                        var358 += 32;
                                                        field290.method2151((field258 << 12) + (var357 << 6) + var358);
                                                        field258 = 0;
                                                    } else if (field258 < 8) {
                                                        field290.method2226((field258 << 19) + 8388608 + var356);
                                                        field258 = 0;
                                                    } else {
                                                        field290.method2236((field258 << 19) + -1073741824 + var356);
                                                        field258 = 0;
                                                    }
                                                } else if (field258 < 2047) {
                                                    field258++;
                                                }
                                            }
                                            field290.method2136(field290.field1839 - var351);
                                            if (var352 >= Statics.field1.field171) {
                                                Statics.field1.field171 = 0;
                                            } else {
                                                Statics.field1.field171 -= var352;
                                                for (int var359 = 0; var359 < Statics.field1.field171; var359++) {
                                                    Statics.field1.field174[var359] = Statics.field1.field174[var352 + var359];
                                                    Statics.field1.field175[var359] = Statics.field1.field175[var352 + var359];
                                                }
                                            }
                                        }
                                    }
                                    if (class127.field2033 == 1 || !Statics.field2761 && class127.field2033 == 4 || class127.field2033 == 2) {
                                        long var361 = (class127.field2032 - field260 * -1L) / 50L;
                                        if (var361 > 4095L) {
                                            var361 = 4095L;
                                        }
                                        field260 = class127.field2032 * -1L;
                                        int var363 = class127.field2031;
                                        if (var363 < 0) {
                                            var363 = 0;
                                        } else if (var363 > 502) {
                                            var363 = 502;
                                        }
                                        int var364 = class127.field2027;
                                        if (var364 < 0) {
                                            var364 = 0;
                                        } else if (var364 > 764) {
                                            var364 = 764;
                                        }
                                        int var365 = var363 * 765 + var364;
                                        byte var366 = 0;
                                        if (class127.field2033 == 2) {
                                            var366 = 1;
                                        }
                                        int var367 = (int) var361;
                                        field290.method2354(163);
                                        field290.method2236((var366 << 19) + (var367 << 20) + var365);
                                    }
                                    if (class124.field1996 > 0) {
                                        field290.method2354(42);
                                        field290.method2151(0);
                                        int var368 = field290.field1839;
                                        long var369 = class103.method19();
                                        for (int var371 = 0; var371 < class124.field1996; var371++) {
                                            long var372 = var369 - field469;
                                            if (var372 > 16777215L) {
                                                var372 = 16777215L;
                                            }
                                            field469 = var369;
                                            field290.method2176((int) var372);
                                            field290.method2160(class124.field1989[var371]);
                                        }
                                        field290.method2135(field290.field1839 - var368);
                                    }
                                    if (field282 > 0) {
                                        field282--;
                                    }
                                    if (class124.field1994[96] || class124.field1994[97] || class124.field1994[98] || class124.field1994[99]) {
                                        field338 = true;
                                    }
                                    if (field338 && field282 <= 0) {
                                        field282 = 20;
                                        field338 = false;
                                        field290.method2354(100);
                                        field290.method2169(field360);
                                        field290.method2170(field315);
                                    }
                                    if (Statics.field1851 && !field264) {
                                        field264 = true;
                                        field290.method2354(201);
                                        field290.method2126(1);
                                    }
                                    if (!Statics.field1851 && field264) {
                                        field264 = false;
                                        field290.method2354(201);
                                        field290.method2126(0);
                                    }
                                    method702();
                                    if (field257 == 30) {
                                        for (class15 var374 = (class15) field483.method3237(); var374 != null; var374 = (class15) field483.method3239()) {
                                            if (var374.field212 > 0) {
                                                var374.field212--;
                                            }
                                            if (var374.field212 == 0) {
                                                if (var374.field205 >= 0) {
                                                    int var375 = var374.field205;
                                                    int var376 = var374.field207;
                                                    class36 var377 = class36.method505(var375);
                                                    if (var376 == 11) {
                                                        var376 = 10;
                                                    }
                                                    if (var376 >= 5 && var376 <= 8) {
                                                        var376 = 4;
                                                    }
                                                    boolean var378 = var377.method647(var376);
                                                    if (!var378) {
                                                        continue;
                                                    }
                                                }
                                                method491(var374.field216, var374.field201, var374.field214, var374.field203, var374.field205, var374.field206, var374.field207);
                                                var374.method3322();
                                            } else {
                                                if (var374.field211 > 0) {
                                                    var374.field211--;
                                                }
                                                if (var374.field211 == 0 && var374.field214 >= 1 && var374.field203 >= 1 && var374.field214 <= 102 && var374.field203 <= 102) {
                                                    if (var374.field204 >= 0) {
                                                        int var379 = var374.field204;
                                                        int var380 = var374.field210;
                                                        class36 var381 = class36.method505(var379);
                                                        if (var380 == 11) {
                                                            var380 = 10;
                                                        }
                                                        if (var380 >= 5 && var380 <= 8) {
                                                            var380 = 4;
                                                        }
                                                        boolean var382 = var381.method647(var380);
                                                        if (!var382) {
                                                            continue;
                                                        }
                                                    }
                                                    method491(var374.field216, var374.field201, var374.field214, var374.field203, var374.field204, var374.field209, var374.field210);
                                                    var374.field211 = -1;
                                                    if (var374.field205 == var374.field204 && var374.field205 == -1) {
                                                        var374.method3322();
                                                    } else if (var374.field205 == var374.field204 && var374.field209 == var374.field206 && var374.field210 == var374.field207) {
                                                        var374.method3322();
                                                    }
                                                }
                                            }
                                        }
                                        method2956();
                                        field462++;
                                        if (field462 > 750) {
                                            method1052();
                                        } else {
                                            method688();
                                            for (int var383 = 0; var383 < field293; var383++) {
                                                int var384 = field289[var383];
                                                class30 var385 = field287[var384];
                                                if (var385 != null) {
                                                    method2497(var385, var385.field696.field800);
                                                }
                                            }
                                            method1433();
                                            field324++;
                                            if (field357 != 0) {
                                                field373 += 20;
                                                if (field373 >= 400) {
                                                    field357 = 0;
                                                }
                                            }
                                            if (Statics.field679 != null) {
                                                field358++;
                                                if (field358 >= 15) {
                                                    method2553(Statics.field679);
                                                    Statics.field679 = null;
                                                }
                                            }
                                            class152 var386 = Statics.field2119;
                                            class152 var387 = Statics.field827;
                                            Statics.field2119 = null;
                                            Statics.field827 = null;
                                            field362 = null;
                                            field429 = false;
                                            field426 = false;
                                            field406 = 0;
                                            while (true) {
                                                while (class124.method1441() && field406 < 128) {
                                                    if (field416 >= 2 && class124.field1994[82] && Statics.field1276 == 66) {
                                                        String var388 = "";
                                                        Iterator var389 = class10.field149.iterator();
                                                        while (var389.hasNext()) {
                                                            class31 var390 = (class31) var389.next();
                                                            var388 = var388 + var390.field700 + ':' + var390.field704 + '\n';
                                                        }
                                                        Statics.field223.setContents(new StringSelection(var388), (ClipboardOwner) null);
                                                    } else {
                                                        field468[field406] = Statics.field1276;
                                                        field467[field406] = Statics.field1848;
                                                        field406++;
                                                    }
                                                }
                                                int var393 = field409;
                                                if (class152.method2777(var393)) {
                                                    method89(Statics.field2616[var393], -1, 0, 0, 765, 503, 0, 0);
                                                }
                                                field275++;
                                                while (true) {
                                                    class1 var394;
                                                    class152 var395;
                                                    class152 var396;
                                                    do {
                                                        var394 = (class1) field448.method3235();
                                                        if (var394 == null) {
                                                            while (true) {
                                                                class1 var397;
                                                                class152 var398;
                                                                class152 var399;
                                                                do {
                                                                    var397 = (class1) field370.method3235();
                                                                    if (var397 == null) {
                                                                        while (true) {
                                                                            class1 var400;
                                                                            class152 var401;
                                                                            class152 var402;
                                                                            do {
                                                                                var400 = (class1) field281.method3235();
                                                                                if (var400 == null) {
                                                                                    method62();
                                                                                    if (Statics.field1874 == null && field421 == null) {
                                                                                        int var403 = class127.field2033;
                                                                                        if (field495) {
                                                                                            if (var403 != 1 && (Statics.field2761 || var403 != 4)) {
                                                                                                int var404 = class127.field2023;
                                                                                                int var405 = class127.field2017 * 1105708693;
                                                                                                if (var404 < Statics.field186 - 10 || var404 > Statics.field1898 + Statics.field186 + 10 || var405 < Statics.field2024 - 10 || var405 > Statics.field612 + Statics.field2024 + 10) {
                                                                                                    field495 = false;
                                                                                                    method849(Statics.field186, Statics.field2024, Statics.field1898, Statics.field612);
                                                                                                }
                                                                                            }
                                                                                            if (var403 == 1 || !Statics.field2761 && var403 == 4) {
                                                                                                int var406 = Statics.field186;
                                                                                                int var407 = Statics.field2024;
                                                                                                int var408 = Statics.field1898;
                                                                                                int var409 = class127.field2027;
                                                                                                int var410 = class127.field2031;
                                                                                                int var411 = -1;
                                                                                                for (int var412 = 0; var412 < field391; var412++) {
                                                                                                    int var413 = (field391 - 1 - var412) * 15 + var407 + 31;
                                                                                                    if (var409 > var406 && var409 < var406 + var408 && var410 > var413 - 13 && var410 < var413 + 3) {
                                                                                                        var411 = var412;
                                                                                                    }
                                                                                                }
                                                                                                if (var411 != -1) {
                                                                                                    method2961(var411);
                                                                                                }
                                                                                                field495 = false;
                                                                                                method849(Statics.field186, Statics.field2024, Statics.field1898, Statics.field612);
                                                                                            }
                                                                                        } else {
                                                                                            label3169: {
                                                                                                if ((var403 == 1 || !Statics.field2761 && var403 == 4) && field391 > 0) {
                                                                                                    int var414 = field394[field391 - 1];
                                                                                                    if (var414 == 39 || var414 == 40 || var414 == 41 || var414 == 42 || var414 == 43 || var414 == 33 || var414 == 34 || var414 == 35 || var414 == 36 || var414 == 37 || var414 == 38 || var414 == 1005) {
                                                                                                        label3148: {
                                                                                                            int var415 = field392[field391 - 1];
                                                                                                            int var416 = field393[field391 - 1];
                                                                                                            class152 var417 = class152.method2801(var416);
                                                                                                            if (!class156.method2467(method37(var417))) {
                                                                                                                int var418 = method37(var417);
                                                                                                                boolean var419 = (var418 >> 29 & 0x1) != 0;
                                                                                                                if (!var419) {
                                                                                                                    break label3148;
                                                                                                                }
                                                                                                            }
                                                                                                            if (Statics.field1874 != null && !field404 && field309 != 1 && !method38(field391 - 1) && field391 > 0) {
                                                                                                                method451(field444, field447);
                                                                                                            }
                                                                                                            field404 = false;
                                                                                                            field385 = 0;
                                                                                                            if (Statics.field1874 != null) {
                                                                                                                method2553(Statics.field1874);
                                                                                                            }
                                                                                                            Statics.field1874 = class152.method2801(var416);
                                                                                                            field407 = var415;
                                                                                                            field444 = class127.field2027;
                                                                                                            field447 = class127.field2031;
                                                                                                            if (field391 > 0) {
                                                                                                                method1984(field391 - 1);
                                                                                                            }
                                                                                                            method2553(Statics.field1874);
                                                                                                            break label3169;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if ((var403 == 1 || !Statics.field2761 && var403 == 4) && (field309 == 1 && field391 > 2 || method38(field391 - 1))) {
                                                                                                    var403 = 2;
                                                                                                }
                                                                                                if ((var403 == 1 || !Statics.field2761 && var403 == 4) && field391 > 0) {
                                                                                                    method2961(field391 - 1);
                                                                                                }
                                                                                                if (var403 == 2 && field391 > 0) {
                                                                                                    method2664(class127.field2027, class127.field2031);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (field421 != null) {
                                                                                        method2407();
                                                                                    }
                                                                                    if (Statics.field1874 != null) {
                                                                                        method2553(Statics.field1874);
                                                                                        field385++;
                                                                                        if (class127.field2022 == 0) {
                                                                                            if (field404) {
                                                                                                if (Statics.field59 == Statics.field1874 && field455 != field407) {
                                                                                                    class152 var420 = Statics.field1874;
                                                                                                    byte var421 = 0;
                                                                                                    if (field274 == 1 && var420.field2644 == 206) {
                                                                                                        var421 = 1;
                                                                                                    }
                                                                                                    if (var420.field2631[field455] <= 0) {
                                                                                                        var421 = 0;
                                                                                                    }
                                                                                                    int var422 = method37(var420);
                                                                                                    boolean var423 = (var422 >> 29 & 0x1) != 0;
                                                                                                    if (var423) {
                                                                                                        int var424 = field407;
                                                                                                        int var425 = field455;
                                                                                                        var420.field2631[var425] = var420.field2631[var424];
                                                                                                        var420.field2632[var425] = var420.field2632[var424];
                                                                                                        var420.field2631[var424] = -1;
                                                                                                        var420.field2632[var424] = 0;
                                                                                                    } else if (var421 == 1) {
                                                                                                        int var426 = field407;
                                                                                                        int var427 = field455;
                                                                                                        while (var426 != var427) {
                                                                                                            if (var426 > var427) {
                                                                                                                var420.method2837(var426 - 1, var426);
                                                                                                                var426--;
                                                                                                            } else if (var426 < var427) {
                                                                                                                var420.method2837(var426 + 1, var426);
                                                                                                                var426++;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        var420.method2837(field455, field407);
                                                                                                    }
                                                                                                    field290.method2354(204);
                                                                                                    field290.method2160(var421);
                                                                                                    field290.method2170(field455);
                                                                                                    field290.method2169(field407);
                                                                                                    field290.method2177(Statics.field1874.field2597);
                                                                                                }
                                                                                            } else if ((field309 == 1 || method38(field391 - 1)) && field391 > 2) {
                                                                                                method2664(field444, field447);
                                                                                            } else if (field391 > 0) {
                                                                                                int var428 = field444;
                                                                                                int var429 = field447;
                                                                                                method1091(Statics.field2768, var428, var429);
                                                                                                Statics.field2768 = null;
                                                                                            }
                                                                                            field358 = 10;
                                                                                            class127.field2033 = 0;
                                                                                            Statics.field1874 = null;
                                                                                        } else if (field385 >= 5 && (class127.field2023 > field444 + 5 || class127.field2023 < field444 - 5 || class127.field2017 * 1105708693 > field447 + 5 || class127.field2017 * 1105708693 < field447 - 5)) {
                                                                                            field404 = true;
                                                                                        }
                                                                                    }
                                                                                    if (class79.field1388 != -1) {
                                                                                        int var430 = class79.field1388;
                                                                                        int var431 = class79.field1375;
                                                                                        field290.method2354(236);
                                                                                        field290.method2126(5);
                                                                                        field290.method2161(class124.field1994[82] ? (class124.field1994[81] ? 2 : 1) : 0);
                                                                                        field290.method2216(Statics.field1113 + var431);
                                                                                        field290.method2216(Statics.field2758 + var430);
                                                                                        class79.field1388 = -1;
                                                                                        field354 = class127.field2027;
                                                                                        field355 = class127.field2031;
                                                                                        field357 = 1;
                                                                                        field373 = 0;
                                                                                        field477 = var430;
                                                                                        field438 = var431;
                                                                                    }
                                                                                    if (Statics.field2119 != var386) {
                                                                                        if (var386 != null) {
                                                                                            method2553(var386);
                                                                                        }
                                                                                        if (Statics.field2119 != null) {
                                                                                            method2553(Statics.field2119);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field827 != var387 && field401 == field400) {
                                                                                        if (var387 != null) {
                                                                                            method2553(var387);
                                                                                        }
                                                                                        if (Statics.field827 != null) {
                                                                                            method2553(Statics.field827);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field827 == null) {
                                                                                        if (field400 > 0) {
                                                                                            field400--;
                                                                                        }
                                                                                    } else if (field400 < field401) {
                                                                                        field400++;
                                                                                        if (field401 == field400) {
                                                                                            method2553(Statics.field827);
                                                                                        }
                                                                                    }
                                                                                    method687();
                                                                                    if (field430) {
                                                                                        int var432 = Statics.field1057 * 128 + 64;
                                                                                        int var433 = Statics.field586 * 128 + 64;
                                                                                        int var434 = method1(var432, var433, Statics.field975) - Statics.field1492;
                                                                                        if (Statics.field1808 < var432) {
                                                                                            Statics.field1808 += Statics.field964 * (var432 - Statics.field1808) / 1000 + Statics.field225;
                                                                                            if (Statics.field1808 > var432) {
                                                                                                Statics.field1808 = var432;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field1808 > var432) {
                                                                                            Statics.field1808 -= Statics.field964 * (Statics.field1808 - var432) / 1000 + Statics.field225;
                                                                                            if (Statics.field1808 < var432) {
                                                                                                Statics.field1808 = var432;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field11 < var434) {
                                                                                            Statics.field11 += Statics.field964 * (var434 - Statics.field11) / 1000 + Statics.field225;
                                                                                            if (Statics.field11 > var434) {
                                                                                                Statics.field11 = var434;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field11 > var434) {
                                                                                            Statics.field11 -= Statics.field964 * (Statics.field11 - var434) / 1000 + Statics.field225;
                                                                                            if (Statics.field11 < var434) {
                                                                                                Statics.field11 = var434;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field2930 < var433) {
                                                                                            Statics.field2930 += Statics.field964 * (var433 - Statics.field2930) / 1000 + Statics.field225;
                                                                                            if (Statics.field2930 > var433) {
                                                                                                Statics.field2930 = var433;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field2930 > var433) {
                                                                                            Statics.field2930 -= Statics.field964 * (Statics.field2930 - var433) / 1000 + Statics.field225;
                                                                                            if (Statics.field2930 < var433) {
                                                                                                Statics.field2930 = var433;
                                                                                            }
                                                                                        }
                                                                                        int var435 = Statics.field781 * 128 + 64;
                                                                                        int var436 = Statics.field1280 * 128 + 64;
                                                                                        int var437 = method1(var435, var436, Statics.field975) - Statics.field516;
                                                                                        int var438 = var435 - Statics.field1808;
                                                                                        int var439 = var437 - Statics.field11;
                                                                                        int var440 = var436 - Statics.field2930;
                                                                                        int var441 = (int) Math.sqrt((double) (var438 * var438 + var440 * var440));
                                                                                        int var442 = (int) (Math.atan2((double) var439, (double) var441) * 325.949D) & 0x7FF;
                                                                                        int var443 = (int) (Math.atan2((double) var438, (double) var440) * -325.949D) & 0x7FF;
                                                                                        if (var442 < 128) {
                                                                                            var442 = 128;
                                                                                        }
                                                                                        if (var442 > 383) {
                                                                                            var442 = 383;
                                                                                        }
                                                                                        if (Statics.field2087 < var442) {
                                                                                            Statics.field2087 += Statics.field1290 * (var442 - Statics.field2087) / 1000 + Statics.field992;
                                                                                            if (Statics.field2087 > var442) {
                                                                                                Statics.field2087 = var442;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field2087 > var442) {
                                                                                            Statics.field2087 -= Statics.field1290 * (Statics.field2087 - var442) / 1000 + Statics.field992;
                                                                                            if (Statics.field2087 < var442) {
                                                                                                Statics.field2087 = var442;
                                                                                            }
                                                                                        }
                                                                                        int var444 = var443 - Statics.field2057;
                                                                                        if (var444 > 1024) {
                                                                                            var444 -= 2048;
                                                                                        }
                                                                                        if (var444 < -1024) {
                                                                                            var444 += 2048;
                                                                                        }
                                                                                        if (var444 > 0) {
                                                                                            Statics.field2057 += Statics.field1290 * var444 / 1000 + Statics.field992;
                                                                                            Statics.field2057 &= 0x7FF;
                                                                                        }
                                                                                        if (var444 < 0) {
                                                                                            Statics.field2057 -= Statics.field1290 * -var444 / 1000 + Statics.field992;
                                                                                            Statics.field2057 &= 0x7FF;
                                                                                        }
                                                                                        int var445 = var443 - Statics.field2057;
                                                                                        if (var445 > 1024) {
                                                                                            var445 -= 2048;
                                                                                        }
                                                                                        if (var445 < -1024) {
                                                                                            var445 += 2048;
                                                                                        }
                                                                                        if (var445 < 0 && var444 > 0 || var445 > 0 && var444 < 0) {
                                                                                            Statics.field2057 = var443;
                                                                                        }
                                                                                    }
                                                                                    for (int var446 = 0; var446 < 5; var446++) {
                                                                                        int var10002 = field496[var446]++;
                                                                                    }
                                                                                    int var447 = Statics.method1895();
                                                                                    int var448 = class124.field1974;
                                                                                    if (var447 > 15000 && var448 > 15000) {
                                                                                        field297 = 250;
                                                                                        class127.method890(14500);
                                                                                        field290.method2354(55);
                                                                                    }
                                                                                    field318++;
                                                                                    if (field318 > 500) {
                                                                                        field318 = 0;
                                                                                        int var450 = (int) (Math.random() * 8.0D);
                                                                                        if ((var450 & 0x1) == 1) {
                                                                                            field312 += field313;
                                                                                        }
                                                                                        if ((var450 & 0x2) == 2) {
                                                                                            field314 += field388;
                                                                                        }
                                                                                        if ((var450 & 0x4) == 4) {
                                                                                            field316 += field317;
                                                                                        }
                                                                                    }
                                                                                    if (field312 < -50) {
                                                                                        field313 = 2;
                                                                                    }
                                                                                    if (field312 > 50) {
                                                                                        field313 = -2;
                                                                                    }
                                                                                    if (field314 < -55) {
                                                                                        field388 = 2;
                                                                                    }
                                                                                    if (field314 > 55) {
                                                                                        field388 = -2;
                                                                                    }
                                                                                    if (field316 < -40) {
                                                                                        field317 = 1;
                                                                                    }
                                                                                    if (field316 > 40) {
                                                                                        field317 = -1;
                                                                                    }
                                                                                    field382++;
                                                                                    if (field382 > 500) {
                                                                                        field382 = 0;
                                                                                        int var451 = (int) (Math.random() * 8.0D);
                                                                                        if ((var451 & 0x1) == 1) {
                                                                                            field319 += field332;
                                                                                        }
                                                                                        if ((var451 & 0x2) == 2) {
                                                                                            field501 += field322;
                                                                                        }
                                                                                    }
                                                                                    if (field319 < -60) {
                                                                                        field332 = 2;
                                                                                    }
                                                                                    if (field319 > 60) {
                                                                                        field332 = -2;
                                                                                    }
                                                                                    if (field501 < -20) {
                                                                                        field322 = 1;
                                                                                    }
                                                                                    if (field501 > 10) {
                                                                                        field322 = -1;
                                                                                    }
                                                                                    for (class34 var452 = (class34) field500.method3192(); var452 != null; var452 = (class34) field500.method3193()) {
                                                                                        if ((long) var452.field788 < class103.method19() / 1000L - 5L) {
                                                                                            if (var452.field784 > 0) {
                                                                                                Statics.method1994(5, "", var452.field783 + class142.field2354);
                                                                                            }
                                                                                            if (var452.field784 == 0) {
                                                                                                Statics.method1994(5, "", var452.field783 + class142.field2326);
                                                                                            }
                                                                                            var452.method3317();
                                                                                        }
                                                                                    }
                                                                                    field490++;
                                                                                    if (field490 > 50) {
                                                                                        field290.method2354(32);
                                                                                    }
                                                                                    try {
                                                                                        if (Statics.field1054 != null && field290.field1839 > 0) {
                                                                                            Statics.field1054.method2570(field290.field1840, 0, field290.field1839);
                                                                                            field290.field1839 = 0;
                                                                                            field490 = 0;
                                                                                            return;
                                                                                        }
                                                                                    } catch (IOException var454) {
                                                                                        method1052();
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                var401 = var400.field10;
                                                                                if (var401.field2530 < 0) {
                                                                                    break;
                                                                                }
                                                                                var402 = class152.method2801(var401.field2540);
                                                                            } while (var402 == null || var402.field2637 == null || var401.field2530 >= var402.field2637.length || var402.field2637[var401.field2530] != var401);
                                                                            class32.method120(var400);
                                                                        }
                                                                    }
                                                                    var398 = var397.field10;
                                                                    if (var398.field2530 < 0) {
                                                                        break;
                                                                    }
                                                                    var399 = class152.method2801(var398.field2540);
                                                                } while (var399 == null || var399.field2637 == null || var398.field2530 >= var399.field2637.length || var399.field2637[var398.field2530] != var398);
                                                                class32.method120(var397);
                                                            }
                                                        }
                                                        var395 = var394.field10;
                                                        if (var395.field2530 < 0) {
                                                            break;
                                                        }
                                                        var396 = class152.method2801(var395.field2540);
                                                    } while (var396 == null || var396.field2637 == null || var395.field2530 >= var396.field2637.length || var396.field2637[var395.field2530] != var395);
                                                    class32.method120(var394);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                field290.method2354(169);
                                field290.method2126(0);
                                int var349 = field290.field1839;
                                class189.method2828(field290);
                                field290.method2136(field290.field1839 - var349);
                            }
                        }
                    }
                } else if (field257 == 40 || field257 == 45) {
                    method2348();
                }
                return;
            }
            var2.field2484.method2792(var2.field2485, (int) var2.field2875, var2.field2482, false);
        }
    }

    @ObfuscatedName("client.j(B)V")
    public final void method168() {
        boolean var1;
        label217: {
            try {
                if (class161.field2712 == 2) {
                    if (Statics.field1881 == null) {
                        Statics.field1881 = class158.method2944(Statics.field2647, Statics.field2716, Statics.field782);
                        if (Statics.field1881 == null) {
                            var1 = false;
                            break label217;
                        }
                    }
                    if (Statics.field1926 == null) {
                        Statics.field1926 = new class53(Statics.field2889, Statics.field2713);
                    }
                    if (Statics.field64.method3099(Statics.field1881, Statics.field2715, Statics.field1926, 22050)) {
                        Statics.field64.method3038();
                        Statics.field64.method3068(Statics.field1821);
                        Statics.field64.method3040(Statics.field1881, Statics.field568);
                        class161.field2712 = 0;
                        Statics.field1881 = null;
                        Statics.field1926 = null;
                        Statics.field2647 = null;
                        var1 = true;
                        break label217;
                    }
                }
            } catch (Exception var24) {
                var24.printStackTrace();
                Statics.field64.method3041();
                class161.field2712 = 0;
                Statics.field1881 = null;
                Statics.field1926 = null;
                Statics.field2647 = null;
            }
            var1 = false;
        }
        if (var1 && field482 && Statics.field685 != null) {
            Statics.field685.method1018();
        }
        if (field2067) {
            Canvas var4 = Statics.field632;
            var4.removeKeyListener(class124.field1985);
            var4.removeFocusListener(class124.field1985);
            class124.field1986 = -1;
            class127.method117(Statics.field632);
            if (Statics.field543 != null) {
                Statics.field543.method2425(Statics.field632);
            }
            this.method2588();
            Canvas var5 = Statics.field632;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class124.field1985);
            var5.addFocusListener(class124.field1985);
            class127.method719(Statics.field632);
            if (Statics.field543 != null) {
                Statics.field543.method2428(Statics.field632);
            }
        }
        if (field257 == 0) {
            class131.method122(class28.field656, class28.field657, (Color) null);
        } else if (field257 == 5) {
            class28.method686(Statics.field2836, Statics.field681);
        } else if (field257 == 10 || field257 == 11) {
            class28.method686(Statics.field2836, Statics.field681);
        } else if (field257 == 20) {
            class28.method686(Statics.field2836, Statics.field681);
        } else if (field257 == 25) {
            if (field487 == 1) {
                if (field303 > field374) {
                    field374 = field303;
                }
                int var6 = (field374 * 50 - field303 * 50) / field374;
                method2690(class142.field2201 + class2.field17 + class2.field20 + var6 + "%" + class2.field21, false);
            } else if (field487 == 2) {
                if (field305 > field306) {
                    field306 = field305;
                }
                int var7 = (field306 * 50 - field305 * 50) / field306 + 50;
                method2690(class142.field2201 + class2.field17 + class2.field20 + var7 + "%" + class2.field21, false);
            } else {
                method2690(class142.field2201, false);
            }
        } else if (field257 == 30) {
            if (field409 != -1) {
                int var8 = field409;
                if (class152.method2777(var8)) {
                    method4(Statics.field2616[var8], -1);
                }
            }
            for (int var9 = 0; var9 < field451; var9++) {
                if (field453[var9]) {
                    field454[var9] = true;
                }
                field375[var9] = field453[var9];
                field453[var9] = false;
            }
            field398 = field259;
            field279 = -1;
            field364 = -1;
            Statics.field59 = null;
            if (field409 != -1) {
                field451 = 0;
                method461(field409, 0, 0, 765, 503, 0, 0, -1);
            }
            class73.method1533();
            if (field495) {
                method745();
            } else if (field279 != -1) {
                int var10 = field279;
                int var11 = field364;
                if (field391 >= 2 || field402 != 0 || field425) {
                    String var12;
                    if (field402 == 1 && field391 < 2) {
                        var12 = class142.field2225 + class142.field2316 + field403 + " " + class2.field23;
                    } else if (field425 && field391 < 2) {
                        var12 = field485 + class142.field2316 + field363 + " " + class2.field23;
                    } else {
                        int var13 = field391 - 1;
                        String var14;
                        if (field412[var13].length() > 0) {
                            var14 = field396[var13] + class142.field2316 + field412[var13];
                        } else {
                            var14 = field396[var13];
                        }
                        var12 = var14;
                    }
                    if (field391 > 2) {
                        var12 = var12 + class2.method2078(16777215) + " " + '/' + " " + (field391 - 2) + class142.field2251;
                    }
                    Statics.field2836.method3363(var12, var10 + 4, var11 + 15, 16777215, 0, field259 / 1000);
                }
            }
            if (field460 == 3) {
                for (int var15 = 0; var15 < field451; var15++) {
                    if (field375[var15]) {
                        class73.method1567(field456[var15], field457[var15], field458[var15], field449[var15], 16711935, 128);
                    } else if (field454[var15]) {
                        class73.method1567(field456[var15], field457[var15], field458[var15], field449[var15], 16711680, 128);
                    }
                }
            }
            class20.method160(Statics.field975, Statics.field61.field777, Statics.field61.field722, field324);
            field324 = 0;
        } else if (field257 == 40) {
            method2690(class142.field2166 + class2.field17 + class142.field2167, false);
        } else if (field257 == 45) {
            method2690(class142.field2248, false);
        }
        if (field257 == 30 && field460 == 0 && !field2062) {
            try {
                Graphics var16 = Statics.field632.getGraphics();
                for (int var17 = 0; var17 < field451; var17++) {
                    if (field454[var17]) {
                        Statics.field1889.method1361(var16, field456[var17], field457[var17], field458[var17], field449[var17]);
                        field454[var17] = false;
                    }
                }
            } catch (Exception var23) {
                Statics.field632.repaint();
            }
        } else if (field257 > 0) {
            try {
                Graphics var19 = Statics.field632.getGraphics();
                Statics.field1889.method1360(var19, 0, 0);
                field2062 = false;
                for (int var20 = 0; var20 < field451; var20++) {
                    field454[var20] = false;
                }
            } catch (Exception var22) {
                Statics.field632.repaint();
            }
        }
    }

    @ObfuscatedName("client.n(I)V")
    public final void method169() {
        if (Statics.field1 != null) {
            Statics.field1.field178 = false;
        }
        Statics.field1 = null;
        if (Statics.field1054 != null) {
            Statics.field1054.method2575();
            Statics.field1054 = null;
        }
        if (class124.field1985 != null) {
            class124 var1 = class124.field1985;
            synchronized (class124.field1985) {
                class124.field1985 = null;
            }
        }
        class127.method110();
        Statics.field543 = null;
        if (Statics.field685 != null) {
            Statics.field685.method1019();
        }
        if (Statics.field517 != null) {
            Statics.field517.method1019();
        }
        class150.method1888();
        Object var3 = class149.field2490;
        synchronized (class149.field2490) {
            if (class149.field2492 != 0) {
                class149.field2492 = 1;
                try {
                    class149.field2490.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        Statics.method152();
    }

    @ObfuscatedName("de.f(II)V")
    public static void method2374(int arg0) {
        if (field257 == arg0) {
            return;
        }
        if (field257 == 0) {
            class131.method2521();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field340 = 0;
            field283 = 0;
            field284 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1345 != null) {
            Statics.field1345.method2575();
            Statics.field1345 = null;
        }
        if (field257 == 25) {
            field487 = 0;
            field303 = 0;
            field374 = 1;
            field305 = 0;
            field306 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method2311(Statics.field632, Statics.field2096, Statics.field592, true, 0);
        } else if (arg0 == 20) {
            class28.method2311(Statics.field632, Statics.field2096, Statics.field592, true, field257 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method2311(Statics.field632, Statics.field2096, Statics.field592, false, 4);
        } else if (Statics.field662) {
            Statics.field651 = null;
            Statics.field643 = null;
            Statics.field715 = null;
            Statics.field644 = null;
            Statics.field1451 = null;
            Statics.field1934 = null;
            Statics.field180 = null;
            Statics.field648 = null;
            Statics.field1576 = null;
            Statics.field1493 = null;
            Statics.field579 = null;
            Statics.field2090 = null;
            Statics.field1983 = null;
            Statics.field522 = null;
            Statics.field179 = null;
            Statics.field2009 = null;
            Statics.field510 = null;
            Statics.field58 = null;
            Statics.field2007 = null;
            Statics.field1338 = null;
            Statics.field1915 = null;
            Statics.field577 = null;
            class161.method1081(2);
            class150.method848(true);
            Statics.field662 = false;
        }
        field257 = arg0;
    }

    @ObfuscatedName("client.a(I)V")
    public void method262() {
        if (field257 != 1000) {
            boolean var1 = class150.method2383();
            if (!var1) {
                this.method171();
            }
        }
    }

    @ObfuscatedName("client.i(I)V")
    public void method171() {
        if (class150.field2513 >= 4) {
            this.method2632("js5crc");
            field257 = 1000;
            return;
        }
        if (class150.field2514 >= 4) {
            if (field257 <= 5) {
                this.method2632("js5io");
                field257 = 1000;
                return;
            }
            field280 = 3000;
            class150.field2514 = 3;
        }
        if (--field280 + 1 > 0) {
            return;
        }
        try {
            if (field246 == 0) {
                Statics.field1658 = Statics.field985.method2468(Statics.field2075, Statics.field1938);
                field246++;
            }
            if (field246 == 1) {
                if (Statics.field1658.field2081 == 2) {
                    this.method309(-1);
                    return;
                }
                if (Statics.field1658.field2081 == 1) {
                    field246++;
                }
            }
            if (field246 == 2) {
                Statics.field935 = new class130((Socket) Statics.field1658.field2083, Statics.field985);
                class107 var1 = new class107(5);
                var1.method2126(15);
                var1.method2236(60);
                Statics.field935.method2570(var1.field1840, 0, 5);
                field246++;
                Statics.field194 = class103.method19();
            }
            if (field246 == 3) {
                if (field257 <= 5 || Statics.field935.method2568() > 0) {
                    int var2 = Statics.field935.method2584();
                    if (var2 != 0) {
                        this.method309(var2);
                        return;
                    }
                    field246++;
                } else if (class103.method19() - Statics.field194 > 30000L) {
                    this.method309(-2);
                    return;
                }
            }
            if (field246 == 4) {
                class150.method11(Statics.field935, field257 > 20);
                Statics.field1658 = null;
                Statics.field935 = null;
                field246 = 0;
                field383 = 0;
            }
        } catch (IOException var4) {
            this.method309(-3);
        }
    }

    @ObfuscatedName("client.y(IB)V")
    public void method309(int arg0) {
        Statics.field1658 = null;
        Statics.field935 = null;
        field246 = 0;
        if (Statics.field286 == Statics.field1938) {
            Statics.field1938 = Statics.field152;
        } else {
            Statics.field1938 = Statics.field286;
        }
        field383++;
        if (field383 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field257 <= 5) {
                this.method2632("js5connect_full");
                field257 = 1000;
            } else {
                field280 = 3000;
            }
        } else if (field383 >= 2 && arg0 == 6) {
            this.method2632("js5connect_outofdate");
            field257 = 1000;
        } else if (field383 >= 4) {
            if (field257 <= 5) {
                this.method2632("js5connect");
                field257 = 1000;
            } else {
                field280 = 3000;
            }
        }
    }

    @ObfuscatedName("r.p(I)V")
    public static void method161() {
        if (field278 == 0) {
            Statics.field2004 = new class79(4, 104, 104, class6.field86);
            for (int var0 = 0; var0 < 4; var0++) {
                field308[var0] = new class197(104, 104);
            }
            Statics.field2411 = new class72(512, 512);
            class28.field657 = class142.field2168;
            class28.field656 = 5;
            field278 = 20;
        } else if (field278 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1471[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1703(var1, 500, 800, 512, 334);
            class28.field657 = class142.field2169;
            class28.field656 = 10;
            field278 = 30;
        } else if (field278 == 30) {
            Statics.field94 = method27(0, false, true, true);
            Statics.field62 = method27(1, false, true, true);
            Statics.field2470 = method27(2, true, false, true);
            Statics.field968 = method27(3, false, true, true);
            Statics.field2962 = method27(4, false, true, true);
            Statics.field1960 = method27(5, true, true, true);
            Statics.field224 = method27(6, true, true, false);
            Statics.field25 = method27(7, false, true, true);
            Statics.field592 = method27(8, false, true, true);
            Statics.field674 = method27(9, false, true, true);
            Statics.field2096 = method27(10, false, true, true);
            Statics.field2823 = method27(11, false, true, true);
            Statics.field215 = method27(12, false, true, true);
            Statics.field1903 = method27(13, true, false, true);
            Statics.field1812 = method27(14, false, true, false);
            Statics.field1875 = method27(15, false, true, true);
            class28.field657 = class142.field2170;
            class28.field656 = 20;
            field278 = 40;
        } else if (field278 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field94.method2785() * 4 / 100;
            int var8 = var7 + Statics.field62.method2785() * 4 / 100;
            int var9 = var8 + Statics.field2470.method2785() * 2 / 100;
            int var10 = var9 + Statics.field968.method2785() * 2 / 100;
            int var11 = var10 + Statics.field2962.method2785() * 6 / 100;
            int var12 = var11 + Statics.field1960.method2785() * 4 / 100;
            int var13 = var12 + Statics.field224.method2785() * 2 / 100;
            int var14 = var13 + Statics.field25.method2785() * 60 / 100;
            int var15 = var14 + Statics.field592.method2785() * 2 / 100;
            int var16 = var15 + Statics.field674.method2785() * 2 / 100;
            int var17 = var16 + Statics.field2096.method2785() * 2 / 100;
            int var18 = var17 + Statics.field2823.method2785() * 2 / 100;
            int var19 = var18 + Statics.field215.method2785() * 2 / 100;
            int var20 = var19 + Statics.field1903.method2785() * 2 / 100;
            int var21 = var20 + Statics.field1812.method2785() * 2 / 100;
            int var22 = var21 + Statics.field1875.method2785() * 2 / 100;
            if (var22 == 100) {
                class28.field657 = class142.field2275;
                class28.field656 = 30;
                field278 = 45;
            } else {
                if (var22 != 0) {
                    class28.field657 = class142.field2171 + var22 + "%";
                }
                class28.field656 = 30;
            }
        } else if (field278 == 45) {
            class50.method84(22050, !field255, 2);
            class162 var23 = new class162();
            var23.method3034(9, 128);
            Statics.field685 = class50.method1077(Statics.field985, Statics.field632, 0, 22050);
            Statics.field685.method1015(var23);
            class161.method611(Statics.field1875, Statics.field1812, Statics.field2962, var23);
            Statics.field517 = class50.method1077(Statics.field985, Statics.field632, 1, 2048);
            Statics.field153 = new class49();
            Statics.field517.method1015(Statics.field153);
            Statics.field168 = new class68(22050, Statics.field1074);
            class28.field657 = class142.field2377;
            class28.field656 = 35;
            field278 = 50;
        } else if (field278 == 50) {
            int var24 = 0;
            if (Statics.field681 == null) {
                class147 var25 = Statics.field592;
                class147 var26 = Statics.field1903;
                int var27 = var25.method2709("p11_full");
                int var28 = var25.method2724(var27, "");
                class193 var29 = class70.method862(var25, var26, var27, var28);
                Statics.field681 = var29;
            } else {
                var24++;
            }
            if (Statics.field881 == null) {
                class147 var30 = Statics.field592;
                class147 var31 = Statics.field1903;
                int var32 = var30.method2709("p12_full");
                int var33 = var30.method2724(var32, "");
                class193 var34 = class70.method862(var30, var31, var32, var33);
                Statics.field881 = var34;
            } else {
                var24++;
            }
            if (Statics.field2836 == null) {
                class147 var35 = Statics.field592;
                class147 var36 = Statics.field1903;
                int var37 = var35.method2709("b12_full");
                int var38 = var35.method2724(var37, "");
                class193 var39 = class70.method862(var35, var36, var37, var38);
                Statics.field2836 = var39;
            } else {
                var24++;
            }
            if (var24 < 3) {
                class28.field657 = class142.field2174 + var24 * 100 / 3 + "%";
                class28.field656 = 40;
            } else {
                Statics.field2801 = new class145(true);
                class28.field657 = class142.field2175;
                class28.field656 = 40;
                field278 = 60;
            }
        } else if (field278 == 60) {
            class147 var40 = Statics.field2096;
            class147 var41 = Statics.field592;
            int var42 = 0;
            if (var40.method2726("title.jpg", "")) {
                var42++;
            }
            if (var41.method2726("logo", "")) {
                var42++;
            }
            if (var41.method2726("titlebox", "")) {
                var42++;
            }
            if (var41.method2726("titlebutton", "")) {
                var42++;
            }
            if (var41.method2726("runes", "")) {
                var42++;
            }
            if (var41.method2726("title_mute", "")) {
                var42++;
            }
            if (var41.method2727("options_radio_buttons,0")) {
                var42++;
            }
            if (var41.method2727("options_radio_buttons,2")) {
                var42++;
            }
            var41.method2726("sl_back", "");
            var41.method2726("sl_flags", "");
            var41.method2726("sl_arrows", "");
            var41.method2726("sl_stars", "");
            var41.method2726("sl_button", "");
            int var45 = class28.method101();
            if (var42 < var45) {
                class28.field657 = class142.field2176 + var42 * 100 / var45 + "%";
                class28.field656 = 50;
            } else {
                class28.field657 = class142.field2320;
                class28.field656 = 50;
                method2374(5);
                field278 = 70;
            }
        } else if (field278 == 70) {
            if (Statics.field2470.method2723()) {
                class41.method85(Statics.field2470);
                class147 var46 = Statics.field2470;
                Statics.field888 = var46;
                class40.method1991(Statics.field2470, Statics.field25);
                class36.method28(Statics.field2470, Statics.field25, field255);
                class35.method1418(Statics.field2470, Statics.field25);
                class147 var47 = Statics.field2470;
                class147 var48 = Statics.field25;
                boolean var49 = field254;
                class193 var50 = Statics.field681;
                Statics.field1031 = var47;
                Statics.field1005 = var48;
                Statics.field1006 = var49;
                Statics.field1031.method2718(10);
                Statics.field1010 = var50;
                class147 var51 = Statics.field2470;
                class147 var52 = Statics.field94;
                class147 var53 = Statics.field62;
                Statics.field918 = var51;
                Statics.field897 = var52;
                Statics.field902 = var53;
                class39.method628(Statics.field2470, Statics.field25);
                class42.method91(Statics.field2470);
                class46.method560(Statics.field2470);
                class147 var54 = Statics.field968;
                class147 var55 = Statics.field25;
                class147 var56 = Statics.field592;
                class147 var57 = Statics.field1903;
                Statics.field2522 = var54;
                Statics.field2965 = var55;
                Statics.field2523 = var56;
                Statics.field976 = var57;
                Statics.field2616 = new class152[Statics.field2522.method2719()][];
                Statics.field2521 = new boolean[Statics.field2522.method2719()];
                class147 var58 = Statics.field2470;
                Statics.field999 = var58;
                class147 var59 = Statics.field2470;
                Statics.field983 = var59;
                class28.field657 = class142.field2179;
                class28.field656 = 60;
                field278 = 80;
            } else {
                class28.field657 = class142.field2178 + Statics.field2470.method2784() + "%";
                class28.field656 = 60;
            }
        } else if (field278 == 80) {
            int var60 = 0;
            if (Statics.field1894 == null) {
                Statics.field1894 = class70.method496(Statics.field592, "compass", "");
            } else {
                var60++;
            }
            if (Statics.field949 == null) {
                Statics.field949 = class70.method496(Statics.field592, "mapedge", "");
            } else {
                var60++;
            }
            if (Statics.field601 == null) {
                Statics.field601 = class70.method452(Statics.field592, "mapscene", "");
            } else {
                var60++;
            }
            if (Statics.field970 == null) {
                Statics.field970 = class70.method70(Statics.field592, "mapfunction", "");
            } else {
                var60++;
            }
            if (Statics.field508 == null) {
                Statics.field508 = class70.method70(Statics.field592, "hitmarks", "");
            } else {
                var60++;
            }
            if (Statics.field1427 == null) {
                Statics.field1427 = class70.method70(Statics.field592, "headicons_pk", "");
            } else {
                var60++;
            }
            if (Statics.field717 == null) {
                Statics.field717 = class70.method70(Statics.field592, "headicons_prayer", "");
            } else {
                var60++;
            }
            if (Statics.field1283 == null) {
                Statics.field1283 = class70.method70(Statics.field592, "headicons_hint", "");
            } else {
                var60++;
            }
            if (Statics.field2011 == null) {
                Statics.field2011 = class70.method70(Statics.field592, "mapmarker", "");
            } else {
                var60++;
            }
            if (Statics.field1501 == null) {
                Statics.field1501 = class70.method70(Statics.field592, "cross", "");
            } else {
                var60++;
            }
            if (Statics.field1348 == null) {
                Statics.field1348 = class70.method70(Statics.field592, "mapdots", "");
            } else {
                var60++;
            }
            if (Statics.field1942 == null) {
                Statics.field1942 = class70.method452(Statics.field592, "scrollbar", "");
            } else {
                var60++;
            }
            if (Statics.field114 == null) {
                Statics.field114 = class70.method452(Statics.field592, "mod_icons", "");
            } else {
                var60++;
            }
            if (Statics.field1893 == null) {
                Statics.field1893 = class70.method1623(Statics.field592, "mapback", "");
            } else {
                var60++;
            }
            if (var60 < 14) {
                class28.field657 = class142.field2196 + var60 * 100 / 14 + "%";
                class28.field656 = 70;
            } else {
                Statics.field2913 = Statics.field114;
                Statics.field949.method1494();
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 41.0D) - 20;
                for (int var65 = 0; var65 < Statics.field970.length; var65++) {
                    Statics.field970[var65].method1447(var61 + var64, var62 + var64, var63 + var64);
                }
                Statics.field601[0].method1598(var61 + var64, var62 + var64, var63 + var64);
                Statics.field134 = new int[33];
                Statics.field606 = new int[33];
                Statics.field962 = new int[151];
                Statics.field1058 = new int[151];
                for (int var66 = 0; var66 < 33; var66++) {
                    int var67 = 999;
                    int var68 = 0;
                    for (int var69 = 0; var69 < 34; var69++) {
                        if (Statics.field1893.field1320[Statics.field1893.field1316 * var66 + var69] == 0) {
                            if (var67 == 999) {
                                var67 = var69;
                            }
                        } else if (var67 != 999) {
                            var68 = var69;
                            break;
                        }
                    }
                    Statics.field134[var66] = var67;
                    Statics.field606[var66] = var68 - var67;
                }
                for (int var70 = 5; var70 < 156; var70++) {
                    int var71 = 999;
                    int var72 = 0;
                    for (int var73 = 25; var73 < 172; var73++) {
                        if (Statics.field1893.field1320[Statics.field1893.field1316 * var70 + var73] == 0 && var73 > 34 || var70 > 34) {
                            if (var71 == 999) {
                                var71 = var73;
                            }
                        } else if (var71 != 999) {
                            var72 = var73;
                            break;
                        }
                    }
                    Statics.field962[var70 - 5] = var71 - 25;
                    Statics.field1058[var70 - 5] = var72 - var71;
                }
                class28.field657 = class142.field2181;
                class28.field656 = 70;
                field278 = 90;
            }
        } else if (field278 == 90) {
            if (Statics.field674.method2723()) {
                class88 var74 = new class88(Statics.field674, Statics.field592, 20, 0.8D, field255 ? 64 : 128);
                class84.method1861(var74);
                class84.method1862(0.8D);
                class28.field657 = class142.field2183;
                class28.field656 = 90;
                field278 = 110;
            } else {
                class28.field657 = class142.field2182 + Statics.field674.method2784() + "%";
                class28.field656 = 90;
            }
        } else if (field278 == 110) {
            Statics.field1 = new class12();
            Statics.field985.method2472(Statics.field1, 10);
            class28.field657 = class142.field2350;
            class28.field656 = 94;
            field278 = 120;
        } else if (field278 == 120) {
            if (Statics.field2096.method2726("huffman", "")) {
                class102 var75 = new class102(Statics.field2096.method2725("huffman", ""));
                Statics.field2902 = var75;
                class28.field657 = class142.field2186;
                class28.field656 = 96;
                field278 = 130;
            } else {
                class28.field657 = class142.field2185 + "%";
                class28.field656 = 96;
            }
        } else if (field278 == 130) {
            if (!Statics.field968.method2723()) {
                class28.field657 = class142.field2187 + Statics.field968.method2784() * 4 / 5 + "%";
                class28.field656 = 100;
            } else if (!Statics.field215.method2723()) {
                class28.field657 = class142.field2187 + (80 + Statics.field215.method2784() / 6) + "%";
                class28.field656 = 100;
            } else if (Statics.field1903.method2723()) {
                class28.field657 = class142.field2188;
                class28.field656 = 100;
                field278 = 140;
            } else {
                class28.field657 = class142.field2187 + (96 + Statics.field1903.method2784() / 20) + "%";
                class28.field656 = 100;
            }
        } else if (field278 == 140) {
            method2374(10);
        }
    }

    @ObfuscatedName("z.q(IZZZI)Leg;")
    public static class147 method27(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2105 != null) {
            var4 = new class121(arg0, class136.field2105, Statics.field2107[arg0], 1000000);
        }
        return new class147(var4, Statics.field1764, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dq.t(I)V")
    public static final void method2348() {
        try {
            if (field340 == 0) {
                if (Statics.field1054 != null) {
                    Statics.field1054.method2575();
                    Statics.field1054 = null;
                }
                Statics.field125 = null;
                field263 = false;
                field283 = 0;
                field340 = 1;
            }
            if (field340 == 1) {
                if (Statics.field125 == null) {
                    Statics.field125 = Statics.field985.method2468(Statics.field2075, Statics.field1938);
                }
                if (Statics.field125.field2081 == 2) {
                    throw new IOException();
                }
                if (Statics.field125.field2081 == 1) {
                    Statics.field1054 = new class130((Socket) Statics.field125.field2083, Statics.field985);
                    Statics.field125 = null;
                    field340 = 2;
                }
            }
            if (field340 == 2) {
                field290.field1839 = 0;
                field290.method2126(14);
                Statics.field1054.method2570(field290.field1840, 0, 1);
                field292.field1839 = 0;
                field340 = 3;
            }
            if (field340 == 3) {
                if (Statics.field685 != null) {
                    Statics.field685.method1017();
                }
                if (Statics.field517 != null) {
                    Statics.field517.method1017();
                }
                int var0 = Statics.field1054.method2584();
                if (Statics.field685 != null) {
                    Statics.field685.method1017();
                }
                if (Statics.field517 != null) {
                    Statics.field517.method1017();
                }
                if (var0 != 0) {
                    method151(var0);
                    return;
                }
                field292.field1839 = 0;
                field340 = 5;
            }
            if (field340 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field290.field1839 = 0;
                field290.method2126(1);
                field290.method2126(class28.field669.method455());
                field290.method2236(var1[0]);
                field290.method2236(var1[1]);
                field290.method2236(var1[2]);
                field290.method2236(var1[3]);
                switch(class28.field669.field2414) {
                    case 0:
                        field290.field1839 += 8;
                        break;
                    case 1:
                        field290.method2236((Integer) Statics.field123.field142.get(class199.method1396(class28.field642)));
                        field290.field1839 += 4;
                        break;
                    case 2:
                    case 3:
                        field290.method2226(Statics.field1659);
                        field290.field1839 += 5;
                }
                field290.method2257(class28.field663);
                field290.method2157(class5.field69, class5.field68);
                field291.field1839 = 0;
                if (field257 == 40) {
                    field291.method2126(18);
                } else {
                    field291.method2126(16);
                }
                field291.method2151(0);
                int var2 = field291.field1839;
                field291.method2236(60);
                field291.method2302(field290.field1840, 0, field290.field1839);
                int var3 = field291.field1839;
                field291.method2257(class28.field642);
                field291.method2126(field255 ? 1 : 0);
                class110 var4 = field291;
                byte[] var5 = new byte[24];
                try {
                    class136.field2104.method3450(0L);
                    class136.field2104.method3451(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var39) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2302(var5, 0, 24);
                class107 var9 = new class107(Statics.field2801.method2701());
                Statics.field2801.method2698(var9);
                field291.method2302(var9.field1840, 0, var9.field1840.length);
                field291.method2236(Statics.field94.field2457);
                field291.method2236(Statics.field62.field2457);
                field291.method2236(Statics.field2470.field2457);
                field291.method2236(Statics.field968.field2457);
                field291.method2236(Statics.field2962.field2457);
                field291.method2236(Statics.field1960.field2457);
                field291.method2236(Statics.field224.field2457);
                field291.method2236(Statics.field25.field2457);
                field291.method2236(Statics.field592.field2457);
                field291.method2236(Statics.field674.field2457);
                field291.method2236(Statics.field2096.field2457);
                field291.method2236(Statics.field2823.field2457);
                field291.method2236(Statics.field215.field2457);
                field291.method2236(Statics.field1903.field2457);
                field291.method2236(Statics.field1812.field2457);
                field291.method2236(Statics.field1875.field2457);
                field291.method2155(var1, var3, field291.field1839);
                field291.method2135(field291.field1839 - var2);
                Statics.field1054.method2570(field291.field1840, 0, field291.field1839);
                field290.method2363(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field292.method2363(var1);
                field340 = 6;
            }
            if (field340 == 6 && Statics.field1054.method2568() > 0) {
                int var11 = Statics.field1054.method2584();
                if (var11 == 21 && field257 == 20) {
                    field340 = 7;
                } else if (var11 == 2) {
                    field340 = 9;
                } else if (var11 == 15 && field257 == 40) {
                    field290.field1839 = 0;
                    field292.field1839 = 0;
                    field294 = -1;
                    field347 = -1;
                    field299 = -1;
                    field300 = -1;
                    field471 = 0;
                    field462 = 0;
                    field266 = 0;
                    field391 = 0;
                    field495 = false;
                    field479 = 0;
                    field477 = 0;
                    for (int var12 = 0; var12 < field433.length; var12++) {
                        if (field433[var12] != null) {
                            field433[var12].field745 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field287.length; var13++) {
                        if (field287[var13] != null) {
                            field287[var13].field745 = -1;
                        }
                    }
                    class14.field195 = new class174(32);
                    method2374(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field453[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field284 < 1) {
                    field284++;
                    field340 = 0;
                } else {
                    method151(var11);
                    return;
                }
            }
            if (field340 == 7 && Statics.field1054.method2568() > 0) {
                field295 = (Statics.field1054.method2584() + 3) * 60;
                field340 = 8;
            }
            if (field340 == 8) {
                field283 = 0;
                class28.method494(class142.field2192, class142.field2193, field295 / 60 + class142.field2194);
                if (--field295 <= 0) {
                    field340 = 0;
                }
            } else {
                if (field340 == 9 && Statics.field1054.method2568() >= 13) {
                    boolean var15 = Statics.field1054.method2584() == 1;
                    Statics.field1054.method2569(field292.field1840, 0, 4);
                    field292.field1839 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = field292.method2369() << 24;
                        int var18 = var17 | field292.method2369() << 16;
                        int var19 = var18 | field292.method2369() << 8;
                        int var20 = var19 | field292.method2369();
                        int var21 = class199.method1396(class28.field642);
                        if (Statics.field123.field142.size() >= 10 && !Statics.field123.field142.containsKey(var21)) {
                            Iterator var22 = Statics.field123.field142.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field123.field142.put(var21, var20);
                        class9.method2441();
                    }
                    field416 = Statics.field1054.method2584();
                    field493 = Statics.field1054.method2584() == 1;
                    field367 = Statics.field1054.method2584();
                    field367 <<= 0x8;
                    field367 += Statics.field1054.method2584();
                    field302 = Statics.field1054.method2584();
                    Statics.field1054.method2569(field292.field1840, 0, 1);
                    field292.field1839 = 0;
                    field294 = field292.method2369();
                    Statics.field1054.method2569(field292.field1840, 0, 2);
                    field292.field1839 = 0;
                    field471 = field292.method2141();
                    if (field302 == 1) {
                        try {
                            class119.method2440(Statics.field247, "zap");
                        } catch (Throwable var38) {
                        }
                    } else {
                        try {
                            class119.method2440(Statics.field247, "unzap");
                        } catch (Throwable var37) {
                        }
                    }
                    field340 = 10;
                }
                if (field340 != 10) {
                    field283++;
                    if (field283 > 2000) {
                        if (field284 < 1) {
                            if (Statics.field286 == Statics.field1938) {
                                Statics.field1938 = Statics.field152;
                            } else {
                                Statics.field1938 = Statics.field286;
                            }
                            field284++;
                            field340 = 0;
                        } else {
                            method151(-3);
                        }
                    }
                } else if (Statics.field1054.method2568() >= field471) {
                    field292.field1839 = 0;
                    Statics.field1054.method2569(field292.field1840, 0, field471);
                    field260 = 1L;
                    field258 = -1;
                    Statics.field1.field171 = 0;
                    Statics.field1851 = true;
                    field264 = true;
                    field469 = -1L;
                    class189.method3335();
                    field290.field1839 = 0;
                    field292.field1839 = 0;
                    field294 = -1;
                    field347 = -1;
                    field299 = -1;
                    field300 = -1;
                    field462 = 0;
                    field266 = 0;
                    field297 = 0;
                    field267 = 0;
                    field391 = 0;
                    field495 = false;
                    class127.method890(0);
                    Statics.method124();
                    field402 = 0;
                    field425 = false;
                    field439 = 0;
                    field312 = (int) (Math.random() * 100.0D) - 50;
                    field314 = (int) (Math.random() * 110.0D) - 55;
                    field316 = (int) (Math.random() * 80.0D) - 40;
                    field319 = (int) (Math.random() * 120.0D) - 60;
                    field501 = (int) (Math.random() * 30.0D) - 20;
                    field315 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field479 = 0;
                    field399 = -1;
                    field477 = 0;
                    field438 = 0;
                    field277 = class18.field518;
                    field337 = 0;
                    field293 = 0;
                    for (int var25 = 0; var25 < 2048; var25++) {
                        field433[var25] = null;
                        field372[var25] = null;
                    }
                    for (int var26 = 0; var26 < 32768; var26++) {
                        field287[var26] = null;
                    }
                    Statics.field61 = field433[2047] = new class3();
                    field381 = -1;
                    field365.method3231();
                    field472.method3231();
                    for (int var27 = 0; var27 < 4; var27++) {
                        for (int var28 = 0; var28 < 104; var28++) {
                            for (int var29 = 0; var29 < 104; var29++) {
                                field384[var27][var28][var29] = null;
                            }
                        }
                    }
                    field483 = new class177();
                    field498 = 0;
                    field497 = 0;
                    field473 = 0;
                    for (int var30 = 0; var30 < Statics.field1060; var30++) {
                        class46 var31 = class46.method769(var30);
                        if (var31 != null) {
                            class154.field2662[var30] = 0;
                            class154.field2660[var30] = 0;
                        }
                    }
                    for (int var32 = 0; var32 < field408.length; var32++) {
                        field408[var32] = -1;
                    }
                    field333 = -1;
                    if (field409 != -1) {
                        class152.method582(field409);
                    }
                    for (class4 var33 = (class4) field410.method3204(); var33 != null; var33 = (class4) field410.method3203()) {
                        method34(var33, true);
                    }
                    field409 = -1;
                    field410 = new class174(8);
                    field413 = null;
                    field495 = false;
                    field391 = 0;
                    field470.method2935((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var34 = 0; var34 < 8; var34++) {
                        field378[var34] = null;
                        field379[var34] = false;
                    }
                    class14.field195 = new class174(32);
                    field418 = true;
                    for (int var35 = 0; var35 < 100; var35++) {
                        field453[var35] = true;
                    }
                    field511 = null;
                    Statics.field1822 = 0;
                    Statics.field526 = null;
                    Statics.field218 = -1;
                    method1804(false);
                    field294 = -1;
                }
            }
        } catch (IOException var40) {
            if (field284 < 1) {
                if (Statics.field286 == Statics.field1938) {
                    Statics.field1938 = Statics.field152;
                } else {
                    Statics.field1938 = Statics.field286;
                }
                field284++;
                field340 = 0;
            } else {
                method151(-2);
            }
        }
    }

    @ObfuscatedName("t.r(II)V")
    public static void method151(int arg0) {
        if (arg0 == -3) {
            class28.method494(class142.field2195, class142.field2393, class142.field2344);
        } else if (arg0 == -2) {
            class28.method494(class142.field2239, class142.field2199, class142.field2244);
        } else if (arg0 == -1) {
            class28.method494(class142.field2352, class142.field2202, class142.field2203);
        } else if (arg0 == 3) {
            class28.method494(class142.field2204, class142.field2205, class142.field2206);
        } else if (arg0 == 4) {
            class28.method494(class142.field2390, class142.field2208, class142.field2268);
        } else if (arg0 == 5) {
            class28.method494(class142.field2361, class142.field2197, class142.field2212);
        } else if (arg0 == 6) {
            class28.method494(class142.field2340, class142.field2156, class142.field2215);
        } else if (arg0 == 7) {
            class28.method494(class142.field2347, class142.field2217, class142.field2235);
        } else if (arg0 == 8) {
            class28.method494(class142.field2219, class142.field2317, class142.field2221);
        } else if (arg0 == 9) {
            class28.method494(class142.field2330, class142.field2223, class142.field2224);
        } else if (arg0 == 10) {
            class28.method494(class142.field2328, class142.field2226, class142.field2227);
        } else if (arg0 == 11) {
            class28.method494(class142.field2306, class142.field2280, class142.field2230);
        } else if (arg0 == 12) {
            class28.method494(class142.field2213, class142.field2385, class142.field2357);
        } else if (arg0 == 13) {
            class28.method494(class142.field2234, class142.field2384, class142.field2236);
        } else if (arg0 == 14) {
            class28.method494(class142.field2334, class142.field2238, class142.field2164);
        } else if (arg0 == 16) {
            class28.method494(class142.field2240, class142.field2241, class142.field2242);
        } else if (arg0 == 17) {
            class28.method494(class142.field2310, class142.field2218, class142.field2245);
        } else if (arg0 == 18) {
            class28.method494(class142.field2246, class142.field2247, class142.field2265);
        } else if (arg0 == 19) {
            class28.method494(class142.field2249, class142.field2250, class142.field2327);
        } else if (arg0 == 20) {
            class28.method494(class142.field2256, class142.field2259, class142.field2254);
        } else if (arg0 == 22) {
            class28.method494(class142.field2255, class142.field2200, class142.field2257);
        } else if (arg0 == 23) {
            class28.method494(class142.field2258, class142.field2307, class142.field2260);
        } else if (arg0 == 24) {
            class28.method494(class142.field2261, class142.field2322, class142.field2263);
        } else if (arg0 == 25) {
            class28.method494(class142.field2264, class142.field2220, class142.field2266);
        } else if (arg0 == 26) {
            class28.method494(class142.field2180, class142.field2222, class142.field2284);
        } else if (arg0 == 27) {
            class28.method494(class142.field2319, class142.field2271, class142.field2272);
        } else if (arg0 == 31) {
            class28.method494(class142.field2279, class142.field2253, class142.field2281);
        } else if (arg0 == 32) {
            class28.method494(class142.field2353, class142.field2283, class142.field2358);
        } else if (arg0 == 37) {
            class28.method494(class142.field2285, class142.field2286, class142.field2287);
        } else if (arg0 == 38) {
            class28.method494(class142.field2288, class142.field2289, class142.field2290);
        } else if (arg0 == 55) {
            class28.method494(class142.field2323, class142.field2292, class142.field2293);
        } else if (arg0 == 56) {
            class28.method494(class142.field2294, class142.field2159, class142.field2296);
            method2374(11);
            return;
        } else if (arg0 == 57) {
            class28.method494(class142.field2297, class142.field2298, class142.field2299);
            method2374(11);
            return;
        } else {
            class28.method494(class142.field2300, class142.field2237, class142.field2324);
        }
        method2374(10);
    }

    @ObfuscatedName("cr.x(I)V")
    public static final void method1894() {
        if (Statics.field1054 != null) {
            Statics.field1054.method2575();
            Statics.field1054 = null;
        }
        method2399();
        Statics.field2004.method1693();
        for (int var0 = 0; var0 < 4; var0++) {
            field308[var0].method3469();
        }
        System.gc();
        class161.method1081(2);
        field481 = -1;
        field482 = false;
        class20.method570();
        method2374(10);
    }

    @ObfuscatedName("dv.s(I)V")
    public static final void method2399() {
        class41.method663();
        class37.field884.method3176();
        class40.method2412();
        class36.method33();
        class35.field791.method3176();
        class35.field792.method3176();
        class45.method1900();
        class38.method557();
        class39.field921.method3176();
        class39.field922.method3176();
        class42.method588();
        class46.field1055.method3176();
        class157.field2681.method3176();
        class152.field2524.method3176();
        class152.field2595.method3176();
        class152.field2526.method3176();
        ((class88) Statics.field1462).method1877();
        class19.field537.method3176();
        Statics.field94.method2721();
        Statics.field62.method2721();
        Statics.field968.method2721();
        Statics.field2962.method2721();
        Statics.field1960.method2721();
        Statics.field224.method2721();
        Statics.field25.method2721();
        Statics.field592.method2721();
        Statics.field674.method2721();
        Statics.field2096.method2721();
        Statics.field2823.method2721();
        Statics.field215.method2721();
    }

    @ObfuscatedName("az.d(I)V")
    public static final void method1052() {
        if (field297 > 0) {
            method1894();
        } else {
            method2374(40);
            Statics.field1345 = Statics.field1054;
            Statics.field1054 = null;
        }
    }

    @ObfuscatedName("t.m(I)V")
    public static final void method150() {
        if (Statics.field517 != null) {
            Statics.field517.method1016();
        }
        if (Statics.field685 != null) {
            Statics.field685.method1016();
        }
    }

    @ObfuscatedName("fp.o(I)V")
    public static final void method2956() {
        for (int var0 = 0; var0 < field439; var0++) {
            int var10002 = field488[var0]--;
            if (field488[var0] >= -10) {
                class52 var2 = field285[var0];
                if (var2 == null) {
                    class52 var10000 = (class52) null;
                    var2 = class52.method1066(Statics.field2962, field486[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field488[var0] += var2.method1067();
                    field285[var0] = var2;
                }
                if (field488[var0] < 0) {
                    int var9;
                    if (field248[var0] == 0) {
                        var9 = field356;
                    } else {
                        int var3 = (field248[var0] & 0xFF) * 128;
                        int var4 = field248[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field61.field777;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field248[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field61.field722;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field488[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field484 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method1065().method1104(Statics.field168);
                        class58 var11 = class58.method1122(var10, 100, var9);
                        var11.method1154(field301[var0] - 1);
                        Statics.field153.method993(var11);
                    }
                    field488[var0] = -100;
                }
            } else {
                field439--;
                for (int var1 = var0; var1 < field439; var1++) {
                    field486[var1] = field486[var1 + 1];
                    field285[var1] = field285[var1 + 1];
                    field301[var1] = field301[var1 + 1];
                    field488[var1] = field488[var1 + 1];
                    field248[var1] = field248[var1 + 1];
                }
                var0--;
            }
        }
        if (field482 && !class161.method32()) {
            if (field417 != 0 && field481 != -1) {
                class161.method1985(Statics.field224, field481, 0, field417, false);
            }
            field482 = false;
        }
    }

    @ObfuscatedName("dk.b(Lao;IIIS)V")
    public static void method2585(class38 arg0, int arg1, int arg2, int arg3) {
        if (field439 >= 50 || field484 == 0 || arg0.field904 == null || arg1 >= arg0.field904.length) {
            return;
        }
        int var4 = arg0.field904[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field486[field439] = var5;
        field301[field439] = var6;
        field488[field439] = 0;
        field285[field439] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field248[field439] = (var8 << 16) + (var9 << 8) + var7;
        field439++;
    }

    @ObfuscatedName("dc.c(III)V")
    public static void method2450(int arg0, int arg1) {
        if (field417 != 0 && arg0 != -1) {
            class161.method1985(Statics.field2823, arg0, 0, field417, false);
            field482 = true;
        }
    }

    @ObfuscatedName("at.w(I)V")
    public static final void method702() {
        if (field255 && Statics.field975 != field434) {
            method483(Statics.field218, Statics.field2128, Statics.field975, Statics.field61.field774[0], Statics.field61.field775[0]);
        } else if (Statics.field975 != field399) {
            field399 = Statics.field975;
            method566(Statics.field975);
        }
    }

    @ObfuscatedName("a.u(IIB)V")
    public static final void method119(int arg0, int arg1) {
        if (field479 != 0 && field479 != 3 || class127.field2033 != 1 && Statics.field2761 || class127.field2033 != 4) {
            return;
        }
        int var2 = class127.field2027 - 25 - arg0;
        int var3 = class127.field2031 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field319 + field315 & 0x7FF;
        int var5 = class84.field1471[var4];
        int var6 = class84.field1476[var4];
        int var7 = (field501 + 256) * var5 >> 8;
        int var8 = (field501 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field61.field777 + var9 >> 7;
        int var12 = Statics.field61.field722 - var10 >> 7;
        field290.method2354(52);
        field290.method2126(18);
        field290.method2161(class124.field1994[82] ? (class124.field1994[81] ? 2 : 1) : 0);
        field290.method2216(Statics.field1113 + var12);
        field290.method2216(Statics.field2758 + var11);
        field290.method2126(var2);
        field290.method2126(var3);
        field290.method2151(field315);
        field290.method2126(57);
        field290.method2126(field319);
        field290.method2126(field501);
        field290.method2126(89);
        field290.method2151(Statics.field61.field777);
        field290.method2151(Statics.field61.field722);
        field290.method2126(63);
        field477 = var11;
        field438 = var12;
    }

    @ObfuscatedName("bp.ac(I)V")
    public static final void method1433() {
        for (int var0 = -1; var0 < field337; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field369[var0];
            }
            class3 var2 = field433[var1];
            if (var2 != null && var2.field736 > 0) {
                var2.field736--;
                if (var2.field736 == 0) {
                    var2.field742 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field293; var3++) {
            int var4 = field289[var3];
            class30 var5 = field287[var4];
            if (var5 != null && var5.field736 > 0) {
                var5.field736--;
                if (var5.field736 == 0) {
                    var5.field742 = null;
                }
            }
        }
    }

    @ObfuscatedName("dz.ap(Ljava/lang/String;I)V")
    public static final void method2415(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field123.field140 = !Statics.field123.field140;
            class9.method2441();
            if (Statics.field123.field140) {
                Statics.method1994(99, "", "Roofs are now all hidden");
            } else {
                Statics.method1994(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field416 >= 2) {
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
                method1052();
            }
            if (arg0.equalsIgnoreCase("errortest") && field252 == 2) {
                throw new RuntimeException();
            }
        }
        field290.method2354(164);
        field290.method2126(arg0.length() + 1);
        field290.method2257(arg0);
    }

    @ObfuscatedName("an.ai(B)V")
    public static final void method687() {
        int var0 = field312 + Statics.field61.field777;
        int var1 = field314 + Statics.field61.field722;
        if (Statics.field610 - var0 < -500 || Statics.field610 - var0 > 500 || Statics.field1575 - var1 < -500 || Statics.field1575 - var1 > 500) {
            Statics.field610 = var0;
            Statics.field1575 = var1;
        }
        if (Statics.field610 != var0) {
            Statics.field610 += (var0 - Statics.field610) / 16;
        }
        if (Statics.field1575 != var1) {
            Statics.field1575 += (var1 - Statics.field1575) / 16;
        }
        if (class127.field2022 == 4 && Statics.field2761) {
            int var2 = class127.field2017 * 1105708693 - field336;
            field334 = var2 * 2;
            field336 = var2 == -1 || var2 == 1 ? class127.field2017 * 1105708693 : (field336 + class127.field2017 * 1105708693) / 2;
            int var3 = field335 - class127.field2023;
            field390 = var3 * 2;
            field335 = var3 == -1 || var3 == 1 ? class127.field2023 : (field335 + class127.field2023) / 2;
        } else {
            if (class124.field1994[96]) {
                field390 += (-24 - field390) / 2;
            } else if (class124.field1994[97]) {
                field390 += (24 - field390) / 2;
            } else {
                field390 /= 2;
            }
            if (class124.field1994[98]) {
                field334 += (12 - field334) / 2;
            } else if (class124.field1994[99]) {
                field334 += (-12 - field334) / 2;
            } else {
                field334 /= 2;
            }
            field336 = class127.field2017 * 1105708693;
            field335 = class127.field2023;
        }
        field315 = field390 / 2 + field315 & 0x7FF;
        field360 += field334 / 2;
        if (field360 < 128) {
            field360 = 128;
        }
        if (field360 > 383) {
            field360 = 383;
        }
        int var4 = Statics.field610 >> 7;
        int var5 = Statics.field1575 >> 7;
        int var6 = method1(Statics.field610, Statics.field1575, Statics.field975);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field975;
                    if (var10 < 3 && (class6.field84[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field86[var10][var8][var9];
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
        if (var12 > field298) {
            field298 += (var12 - field298) / 24;
        } else if (var12 < field298) {
            field298 += (var12 - field298) / 80;
        }
    }

    @ObfuscatedName("an.as(B)V")
    public static final void method688() {
        for (int var0 = -1; var0 < field337; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field369[var0];
            }
            class3 var2 = field433[var1];
            if (var2 != null) {
                method2497(var2, 1);
            }
        }
    }

    @ObfuscatedName("du.aa(Law;II)V")
    public static final void method2497(class33 arg0, int arg1) {
        if (arg0.field765 > field259) {
            int var2 = arg0.field765 - field259;
            int var3 = arg0.field732 * 64 + arg0.field729 * 128;
            int var4 = arg0.field763 * 128 + arg0.field732 * 64;
            arg0.field777 += (var3 - arg0.field777) / var2;
            arg0.field722 += (var4 - arg0.field722) / var2;
            arg0.field721 = 0;
            if (arg0.field767 == 0) {
                arg0.field737 = 1024;
            }
            if (arg0.field767 == 1) {
                arg0.field737 = 1536;
            }
            if (arg0.field767 == 2) {
                arg0.field737 = 0;
            }
            if (arg0.field767 == 3) {
                arg0.field737 = 512;
            }
        } else if (arg0.field766 >= field259) {
            method621(arg0);
        } else {
            arg0.field748 = arg0.field726;
            if (arg0.field773 == 0) {
                arg0.field721 = 0;
            } else {
                label331: {
                    if (arg0.field751 != -1 && arg0.field754 == 0) {
                        class38 var5 = class38.method1996(arg0.field751);
                        if (arg0.field778 > 0 && var5.field919 == 0) {
                            arg0.field721++;
                            break label331;
                        }
                        if (arg0.field778 <= 0 && var5.field900 == 0) {
                            arg0.field721++;
                            break label331;
                        }
                    }
                    int var6 = arg0.field777;
                    int var7 = arg0.field722;
                    int var8 = arg0.field774[arg0.field773 - 1] * 128 + arg0.field732 * 64;
                    int var9 = arg0.field775[arg0.field773 - 1] * 128 + arg0.field732 * 64;
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        if (var6 < var8) {
                            if (var7 < var9) {
                                arg0.field737 = 1280;
                            } else if (var7 > var9) {
                                arg0.field737 = 1792;
                            } else {
                                arg0.field737 = 1536;
                            }
                        } else if (var6 > var8) {
                            if (var7 < var9) {
                                arg0.field737 = 768;
                            } else if (var7 > var9) {
                                arg0.field737 = 256;
                            } else {
                                arg0.field737 = 512;
                            }
                        } else if (var7 < var9) {
                            arg0.field737 = 1024;
                        } else if (var7 > var9) {
                            arg0.field737 = 0;
                        }
                        int var10 = arg0.field737 - arg0.field728 & 0x7FF;
                        if (var10 > 1024) {
                            var10 -= 2048;
                        }
                        int var11 = arg0.field730;
                        if (var10 >= -256 && var10 <= 256) {
                            var11 = arg0.field740;
                        } else if (var10 >= 256 && var10 < 768) {
                            var11 = arg0.field761;
                        } else if (var10 >= -768 && var10 <= -256) {
                            var11 = arg0.field759;
                        }
                        if (var11 == -1) {
                            var11 = arg0.field740;
                        }
                        arg0.field748 = var11;
                        int var12 = 4;
                        boolean var13 = true;
                        if (arg0 instanceof class30) {
                            var13 = ((class30) arg0).field696.field804;
                        }
                        if (var13) {
                            if (arg0.field737 != arg0.field728 && arg0.field745 == -1 && arg0.field772 != 0) {
                                var12 = 2;
                            }
                            if (arg0.field773 > 2) {
                                var12 = 6;
                            }
                            if (arg0.field773 > 3) {
                                var12 = 8;
                            }
                            if (arg0.field721 > 0 && arg0.field773 > 1) {
                                var12 = 8;
                                arg0.field721--;
                            }
                        } else {
                            if (arg0.field773 > 1) {
                                var12 = 6;
                            }
                            if (arg0.field773 > 2) {
                                var12 = 8;
                            }
                            if (arg0.field721 > 0 && arg0.field773 > 1) {
                                var12 = 8;
                                arg0.field721--;
                            }
                        }
                        if (arg0.field776[arg0.field773 - 1]) {
                            var12 <<= 0x1;
                        }
                        if (var12 >= 8 && arg0.field748 == arg0.field740 && arg0.field733 != -1) {
                            arg0.field748 = arg0.field733;
                        }
                        if (var6 < var8) {
                            arg0.field777 += var12;
                            if (arg0.field777 > var8) {
                                arg0.field777 = var8;
                            }
                        } else if (var6 > var8) {
                            arg0.field777 -= var12;
                            if (arg0.field777 < var8) {
                                arg0.field777 = var8;
                            }
                        }
                        if (var7 < var9) {
                            arg0.field722 += var12;
                            if (arg0.field722 > var9) {
                                arg0.field722 = var9;
                            }
                        } else if (var7 > var9) {
                            arg0.field722 -= var12;
                            if (arg0.field722 < var9) {
                                arg0.field722 = var9;
                            }
                        }
                        if (arg0.field777 == var8 && arg0.field722 == var9) {
                            arg0.field773--;
                            if (arg0.field778 > 0) {
                                arg0.field778--;
                            }
                        }
                    } else {
                        arg0.field777 = var8;
                        arg0.field722 = var9;
                    }
                }
            }
        }
        if (arg0.field777 < 128 || arg0.field722 < 128 || arg0.field777 >= 13184 || arg0.field722 >= 13184) {
            arg0.field751 = -1;
            arg0.field756 = -1;
            arg0.field765 = 0;
            arg0.field766 = 0;
            arg0.field777 = arg0.field774[0] * 128 + arg0.field732 * 64;
            arg0.field722 = arg0.field775[0] * 128 + arg0.field732 * 64;
            arg0.method597();
        }
        if (Statics.field61 == arg0 && (arg0.field777 < 1536 || arg0.field722 < 1536 || arg0.field777 >= 11776 || arg0.field722 >= 11776)) {
            arg0.field751 = -1;
            arg0.field756 = -1;
            arg0.field765 = 0;
            arg0.field766 = 0;
            arg0.field777 = arg0.field774[0] * 128 + arg0.field732 * 64;
            arg0.field722 = arg0.field775[0] * 128 + arg0.field732 * 64;
            arg0.method597();
        }
        if (arg0.field772 != 0) {
            if (arg0.field745 != -1 && arg0.field745 < 32768) {
                class30 var14 = field287[arg0.field745];
                if (var14 != null) {
                    int var15 = arg0.field777 - var14.field777;
                    int var16 = arg0.field722 - var14.field722;
                    if (var15 != 0 || var16 != 0) {
                        arg0.field737 = (int) (Math.atan2((double) var15, (double) var16) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field745 >= 32768) {
                int var17 = arg0.field745 - 32768;
                if (field367 == var17) {
                    var17 = 2047;
                }
                class3 var18 = field433[var17];
                if (var18 != null) {
                    int var19 = arg0.field777 - var18.field777;
                    int var20 = arg0.field722 - var18.field722;
                    if (var19 != 0 || var20 != 0) {
                        arg0.field737 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field746 != 0 || arg0.field770 != 0) && (arg0.field773 == 0 || arg0.field721 > 0)) {
                int var21 = arg0.field777 - (arg0.field746 * 64 - Statics.field2758 * 64 - Statics.field2758 * 64);
                int var22 = arg0.field722 - (arg0.field770 * 64 - Statics.field1113 * 64 - Statics.field1113 * 64);
                if (var21 != 0 || var22 != 0) {
                    arg0.field737 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                }
                arg0.field746 = 0;
                arg0.field770 = 0;
            }
            int var23 = arg0.field737 - arg0.field728 & 0x7FF;
            if (var23 == 0) {
                arg0.field780 = 0;
            } else {
                arg0.field780++;
                if (var23 > 1024) {
                    arg0.field728 -= arg0.field772;
                    boolean var24 = true;
                    if (var23 < arg0.field772 || var23 > 2048 - arg0.field772) {
                        arg0.field728 = arg0.field737;
                        var24 = false;
                    }
                    if (arg0.field748 == arg0.field726 && (arg0.field780 > 25 || var24)) {
                        if (arg0.field727 == -1) {
                            arg0.field748 = arg0.field740;
                        } else {
                            arg0.field748 = arg0.field727;
                        }
                    }
                } else {
                    arg0.field728 += arg0.field772;
                    boolean var25 = true;
                    if (var23 < arg0.field772 || var23 > 2048 - arg0.field772) {
                        arg0.field728 = arg0.field737;
                        var25 = false;
                    }
                    if (arg0.field748 == arg0.field726 && (arg0.field780 > 25 || var25)) {
                        if (arg0.field753 == -1) {
                            arg0.field748 = arg0.field740;
                        } else {
                            arg0.field748 = arg0.field753;
                        }
                    }
                }
                arg0.field728 &= 0x7FF;
            }
        }
        method558(arg0);
    }

    @ObfuscatedName("av.aq(Law;S)V")
    public static final void method621(class33 arg0) {
        if (field259 == arg0.field766 || arg0.field751 == -1 || arg0.field754 != 0 || arg0.field779 + 1 > class38.method1996(arg0.field751).field903[arg0.field724]) {
            int var1 = arg0.field766 - arg0.field765;
            int var2 = field259 - arg0.field765;
            int var3 = arg0.field732 * 64 + arg0.field729 * 128;
            int var4 = arg0.field763 * 128 + arg0.field732 * 64;
            int var5 = arg0.field762 * 128 + arg0.field732 * 64;
            int var6 = arg0.field734 * 128 + arg0.field732 * 64;
            arg0.field777 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field722 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field721 = 0;
        if (arg0.field767 == 0) {
            arg0.field737 = 1024;
        }
        if (arg0.field767 == 1) {
            arg0.field737 = 1536;
        }
        if (arg0.field767 == 2) {
            arg0.field737 = 0;
        }
        if (arg0.field767 == 3) {
            arg0.field737 = 512;
        }
        arg0.field728 = arg0.field737;
    }

    @ObfuscatedName("ap.aw(Law;S)V")
    public static final void method558(class33 arg0) {
        arg0.field731 = false;
        if (arg0.field748 != -1) {
            class38 var1 = class38.method1996(arg0.field748);
            if (var1 == null || var1.field901 == null) {
                arg0.field748 = -1;
            } else {
                arg0.field750++;
                if (arg0.field749 < var1.field901.length && arg0.field750 > var1.field903[arg0.field749]) {
                    arg0.field750 = 1;
                    arg0.field749++;
                    method2585(var1, arg0.field749, arg0.field777, arg0.field722);
                }
                if (arg0.field749 >= var1.field901.length) {
                    arg0.field750 = 0;
                    arg0.field749 = 0;
                    method2585(var1, arg0.field749, arg0.field777, arg0.field722);
                }
            }
        }
        if (arg0.field756 != -1 && field259 >= arg0.field764) {
            if (arg0.field757 < 0) {
                arg0.field757 = 0;
            }
            int var2 = class39.method563(arg0.field756).field925;
            if (var2 == -1) {
                arg0.field756 = -1;
            } else {
                class38 var3 = class38.method1996(var2);
                if (var3 == null || var3.field901 == null) {
                    arg0.field756 = -1;
                } else {
                    arg0.field758++;
                    if (arg0.field757 < var3.field901.length && arg0.field758 > var3.field903[arg0.field757]) {
                        arg0.field758 = 1;
                        arg0.field757++;
                        method2585(var3, arg0.field757, arg0.field777, arg0.field722);
                    }
                    if (arg0.field757 >= var3.field901.length && (arg0.field757 < 0 || arg0.field757 >= var3.field901.length)) {
                        arg0.field756 = -1;
                    }
                }
            }
        }
        if (arg0.field751 != -1 && arg0.field754 <= 1) {
            class38 var4 = class38.method1996(arg0.field751);
            if (var4.field919 == 1 && arg0.field778 > 0 && arg0.field765 <= field259 && arg0.field766 < field259) {
                arg0.field754 = 1;
                return;
            }
        }
        if (arg0.field751 != -1 && arg0.field754 == 0) {
            class38 var5 = class38.method1996(arg0.field751);
            if (var5 == null || var5.field901 == null) {
                arg0.field751 = -1;
            } else {
                arg0.field779++;
                if (arg0.field724 < var5.field901.length && arg0.field779 > var5.field903[arg0.field724]) {
                    arg0.field779 = 1;
                    arg0.field724++;
                    method2585(var5, arg0.field724, arg0.field777, arg0.field722);
                }
                if (arg0.field724 >= var5.field901.length) {
                    arg0.field724 -= var5.field905;
                    arg0.field755++;
                    if (arg0.field755 >= var5.field911) {
                        arg0.field751 = -1;
                    } else if (arg0.field724 >= 0 && arg0.field724 < var5.field901.length) {
                        method2585(var5, arg0.field724, arg0.field777, arg0.field722);
                    } else {
                        arg0.field751 = -1;
                    }
                }
                arg0.field731 = var5.field907;
            }
        }
        if (arg0.field754 > 0) {
            arg0.field754--;
        }
    }

    @ObfuscatedName("y.am(Lz;IIS)V")
    public static void method127(class3 arg0, int arg1, int arg2) {
        if (arg0.field751 == arg1 && arg1 != -1) {
            int var3 = class38.method1996(arg1).field914;
            if (var3 == 1) {
                arg0.field724 = 0;
                arg0.field779 = 0;
                arg0.field754 = arg2;
                arg0.field755 = 0;
            }
            if (var3 == 2) {
                arg0.field755 = 0;
            }
        } else if (arg1 == -1 || arg0.field751 == -1 || class38.method1996(arg1).field908 >= class38.method1996(arg0.field751).field908) {
            arg0.field751 = arg1;
            arg0.field724 = 0;
            arg0.field779 = 0;
            arg0.field754 = arg2;
            arg0.field755 = 0;
            arg0.field778 = arg0.field773;
        }
    }

    @ObfuscatedName("es.av(Ljava/lang/String;ZI)V")
    public static final void method2690(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field881.method3353(arg0, 250);
        int var6 = Statics.field881.method3354(arg0, 250) * 13;
        class73.method1590(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1542(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field881.method3359(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method849(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field632.getGraphics();
                Statics.field1889.method1360(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field632.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field451; var13++) {
            if (field458[var13] + field456[var13] > var9 && field456[var13] < var9 + var11 && field457[var13] + field449[var13] > var10 && field457[var13] < var10 + var12) {
                field454[var13] = true;
            }
        }
    }

    @ObfuscatedName("as.an(IIIII)V")
    public static final void method565(int arg0, int arg1, int arg2, int arg3) {
        class73.method1539(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class84.method1856();
        field351++;
        method3157(class29.field693);
        boolean var4 = false;
        if (field381 >= 0) {
            for (int var5 = 0; var5 < field337; var5++) {
                if (field381 == field369[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method3157(class29.field692);
        }
        method2803(true);
        method3157(var4 ? class29.field683 : class29.field682);
        method2803(false);
        for (class7 var6 = (class7) field365.method3237(); var6 != null; var6 = (class7) field365.method3239()) {
            if (Statics.field975 != var6.field93 || field259 > var6.field96) {
                var6.method3322();
            } else if (field259 >= var6.field97) {
                if (var6.field102 > 0) {
                    class30 var7 = field287[var6.field102 - 1];
                    if (var7 != null && var7.field777 >= 0 && var7.field777 < 13312 && var7.field722 >= 0 && var7.field722 < 13312) {
                        var6.method77(var7.field777, var7.field722, method1(var7.field777, var7.field722, var6.field93) - var6.field111, field259);
                    }
                }
                if (var6.field102 < 0) {
                    int var8 = -var6.field102 - 1;
                    class3 var9;
                    if (field367 == var8) {
                        var9 = Statics.field61;
                    } else {
                        var9 = field433[var8];
                    }
                    if (var9 != null && var9.field777 >= 0 && var9.field777 < 13312 && var9.field722 >= 0 && var9.field722 < 13312) {
                        var6.method77(var9.field777, var9.field722, method1(var9.field777, var9.field722, var6.field93) - var6.field111, field259);
                    }
                }
                var6.method82(field324);
                Statics.field2004.method1639(Statics.field975, (int) var6.field104, (int) var6.field105, (int) var6.field106, 60, var6, var6.field112, -1, false);
            }
        }
        method578();
        if (!field430) {
            int var10 = field360;
            if (field298 / 256 > var10) {
                var10 = field298 / 256;
            }
            if (field492[4] && field494[4] + 128 > var10) {
                var10 = field494[4] + 128;
            }
            int var11 = field316 + field315 & 0x7FF;
            method1898(Statics.field610, method1(Statics.field61.field777, Statics.field61.field722, Statics.field975) - 50, Statics.field1575, var10, var11, var10 * 3 + 600);
        }
        int var24;
        if (field430) {
            var24 = method2522();
        } else {
            int var12;
            if (Statics.field123.field140) {
                var12 = Statics.field975;
            } else {
                int var13 = 3;
                if (Statics.field2087 < 310) {
                    int var14 = Statics.field1808 >> 7;
                    int var15 = Statics.field2930 >> 7;
                    int var16 = Statics.field61.field777 >> 7;
                    int var17 = Statics.field61.field722 >> 7;
                    if ((class6.field84[Statics.field975][var14][var15] & 0x4) != 0) {
                        var13 = Statics.field975;
                    }
                    int var18;
                    if (var16 > var14) {
                        var18 = var16 - var14;
                    } else {
                        var18 = var14 - var16;
                    }
                    int var19;
                    if (var17 > var15) {
                        var19 = var17 - var15;
                    } else {
                        var19 = var15 - var17;
                    }
                    if (var18 > var19) {
                        int var20 = var19 * 65536 / var18;
                        int var21 = 32768;
                        while (var14 != var16) {
                            if (var14 < var16) {
                                var14++;
                            } else if (var14 > var16) {
                                var14--;
                            }
                            if ((class6.field84[Statics.field975][var14][var15] & 0x4) != 0) {
                                var13 = Statics.field975;
                            }
                            var21 += var20;
                            if (var21 >= 65536) {
                                var21 -= 65536;
                                if (var15 < var17) {
                                    var15++;
                                } else if (var15 > var17) {
                                    var15--;
                                }
                                if ((class6.field84[Statics.field975][var14][var15] & 0x4) != 0) {
                                    var13 = Statics.field975;
                                }
                            }
                        }
                    } else {
                        int var22 = var18 * 65536 / var19;
                        int var23 = 32768;
                        while (var15 != var17) {
                            if (var15 < var17) {
                                var15++;
                            } else if (var15 > var17) {
                                var15--;
                            }
                            if ((class6.field84[Statics.field975][var14][var15] & 0x4) != 0) {
                                var13 = Statics.field975;
                            }
                            var23 += var22;
                            if (var23 >= 65536) {
                                var23 -= 65536;
                                if (var14 < var16) {
                                    var14++;
                                } else if (var14 > var16) {
                                    var14--;
                                }
                                if ((class6.field84[Statics.field975][var14][var15] & 0x4) != 0) {
                                    var13 = Statics.field975;
                                }
                            }
                        }
                    }
                }
                if ((class6.field84[Statics.field975][Statics.field61.field777 >> 7][Statics.field61.field722 >> 7] & 0x4) != 0) {
                    var13 = Statics.field975;
                }
                var12 = var13;
            }
            var24 = var12;
        }
        int var25 = Statics.field1808;
        int var26 = Statics.field11;
        int var27 = Statics.field2930;
        int var28 = Statics.field2087;
        int var29 = Statics.field2057;
        for (int var30 = 0; var30 < 5; var30++) {
            if (field492[var30]) {
                int var31 = (int) (Math.random() * (double) (field269[var30] * 2 + 1) - (double) field269[var30] + Math.sin((double) field397[var30] / 100.0D * (double) field496[var30]) * (double) field494[var30]);
                if (var30 == 0) {
                    Statics.field1808 += var31;
                }
                if (var30 == 1) {
                    Statics.field11 += var31;
                }
                if (var30 == 2) {
                    Statics.field2930 += var31;
                }
                if (var30 == 3) {
                    Statics.field2057 = Statics.field2057 + var31 & 0x7FF;
                }
                if (var30 == 4) {
                    Statics.field2087 += var31;
                    if (Statics.field2087 < 128) {
                        Statics.field2087 = 128;
                    }
                    if (Statics.field2087 > 383) {
                        Statics.field2087 = 383;
                    }
                }
            }
        }
        int var32 = class127.field2023;
        int var33 = class127.field2017 * 1105708693;
        if (class127.field2033 != 0) {
            var32 = class127.field2027;
            var33 = class127.field2031;
        }
        if (var32 >= arg0 && var32 < arg0 + arg2 && var33 >= arg1 && var33 < arg1 + arg3) {
            class98.field1745 = true;
            class98.field1749 = 0;
            class98.field1746 = var32 - arg0;
            class98.field1747 = var33 - arg1;
        } else {
            class98.field1745 = false;
            class98.field1749 = 0;
        }
        method150();
        class73.method1590(arg0, arg1, arg2, arg3, 0);
        method150();
        Statics.field2004.method1666(Statics.field1808, Statics.field11, Statics.field2930, Statics.field2087, Statics.field2057, var24);
        method150();
        Statics.field2004.method1642();
        field348 = 0;
        boolean var34 = false;
        int var35 = -1;
        for (int var36 = -1; var36 < field337 + field293; var36++) {
            class33 var37;
            if (var36 == -1) {
                var37 = Statics.field61;
            } else if (var36 < field337) {
                var37 = field433[field369[var36]];
                if (field381 == field369[var36]) {
                    var34 = true;
                    var35 = var36;
                    continue;
                }
            } else {
                var37 = field287[field289[var36 - field337]];
            }
            method39(var37, var36, arg0, arg1, arg2, arg3);
        }
        if (var34) {
            method39(field433[field381], var35, arg0, arg1, arg2, arg3);
        }
        for (int var38 = 0; var38 < field348; var38++) {
            int var39 = field342[var38];
            int var40 = field343[var38];
            int var41 = field361[var38];
            int var42 = field344[var38];
            boolean var43 = true;
            while (var43) {
                var43 = false;
                for (int var44 = 0; var44 < var38; var44++) {
                    if (var40 + 2 > field343[var44] - field344[var44] && var40 - var42 < field343[var44] + 2 && var39 - var41 < field361[var44] + field342[var44] && var39 + var41 > field342[var44] - field361[var44] && field343[var44] - field344[var44] < var40) {
                        var40 = field343[var44] - field344[var44];
                        var43 = true;
                    }
                }
            }
            field352 = field342[var38];
            field353 = field343[var38] = var40;
            String var45 = field349[var38];
            if (field411 == 0) {
                int var46 = 16776960;
                if (field320[var38] < 6) {
                    var46 = field452[field320[var38]];
                }
                if (field320[var38] == 6) {
                    var46 = field351 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field320[var38] == 7) {
                    var46 = field351 % 20 < 10 ? 255 : 65535;
                }
                if (field320[var38] == 8) {
                    var46 = field351 % 20 < 10 ? 45056 : 8454016;
                }
                if (field320[var38] == 9) {
                    int var47 = 150 - field491[var38];
                    if (var47 < 50) {
                        var46 = var47 * 1280 + 16711680;
                    } else if (var47 < 100) {
                        var46 = 16776960 - (var47 - 50) * 327680;
                    } else if (var47 < 150) {
                        var46 = (var47 - 100) * 5 + 65280;
                    }
                }
                if (field320[var38] == 10) {
                    int var48 = 150 - field491[var38];
                    if (var48 < 50) {
                        var46 = var48 * 5 + 16711680;
                    } else if (var48 < 100) {
                        var46 = 16711935 - (var48 - 50) * 327680;
                    } else if (var48 < 150) {
                        var46 = (var48 - 100) * 327680 + 255 - (var48 - 100) * 5;
                    }
                }
                if (field320[var38] == 11) {
                    int var49 = 150 - field491[var38];
                    if (var49 < 50) {
                        var46 = 16777215 - var49 * 327685;
                    } else if (var49 < 100) {
                        var46 = (var49 - 50) * 327685 + 65280;
                    } else if (var49 < 150) {
                        var46 = 16777215 - (var49 - 100) * 327680;
                    }
                }
                if (field307[var38] == 0) {
                    Statics.field2836.method3358(var45, field352 + arg0, field353 + arg1, var46, 0);
                }
                if (field307[var38] == 1) {
                    Statics.field2836.method3369(var45, field352 + arg0, field353 + arg1, var46, 0, field351);
                }
                if (field307[var38] == 2) {
                    Statics.field2836.method3393(var45, field352 + arg0, field353 + arg1, var46, 0, field351);
                }
                if (field307[var38] == 3) {
                    Statics.field2836.method3362(var45, field352 + arg0, field353 + arg1, var46, 0, field351, 150 - field491[var38]);
                }
                if (field307[var38] == 4) {
                    int var50 = (150 - field491[var38]) * (Statics.field2836.method3351(var45) + 100) / 150;
                    class73.method1535(field352 + arg0 - 50, arg1, field352 + arg0 + 50, arg1 + arg3);
                    Statics.field2836.method3356(var45, field352 + arg0 + 50 - var50, field353 + arg1, var46, 0);
                    class73.method1539(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field307[var38] == 5) {
                    int var51 = 150 - field491[var38];
                    int var52 = 0;
                    if (var51 < 25) {
                        var52 = var51 - 25;
                    } else if (var51 > 125) {
                        var52 = var51 - 125;
                    }
                    class73.method1535(arg0, field353 + arg1 - Statics.field2836.field2912 - 1, arg0 + arg2, field353 + arg1 + 5);
                    Statics.field2836.method3358(var45, field352 + arg0, field353 + arg1 + var52, var46, 0);
                    class73.method1539(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2836.method3358(var45, field352 + arg0, field353 + arg1, 16776960, 0);
            }
        }
        if (field267 == 2) {
            method577((field270 - Statics.field2758 << 7) + field273, (field271 - Statics.field1113 << 7) + field376, field272 * 2);
            if (field352 > -1 && field259 % 20 < 10) {
                Statics.field1283[0].method1448(field352 + arg0 - 12, field353 + arg1 - 28);
            }
        }
        ((class88) Statics.field1462).method1876(field324);
        method2829(arg0, arg1, arg2, arg3);
        Statics.field1808 = var25;
        Statics.field11 = var26;
        Statics.field2930 = var27;
        Statics.field2087 = var28;
        Statics.field2057 = var29;
        if (field418) {
            byte var53 = 0;
            int var54 = class150.field2502 + class150.field2500 + var53;
            if (var54 == 0) {
                field418 = false;
            }
        }
        if (field418) {
            class73.method1590(arg0, arg1, arg2, arg3, 0);
            method2690(class142.field2201, false);
        }
    }

    @ObfuscatedName("fo.at(Lai;I)V")
    public static final void method3157(class29 arg0) {
        if (Statics.field61.field777 >> 7 == field477 && Statics.field61.field722 >> 7 == field438) {
            field477 = 0;
        }
        int var1 = field337;
        if (class29.field693 == arg0 || class29.field692 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field693 == arg0) {
                var3 = Statics.field61;
                var4 = 33538048;
            } else if (class29.field692 == arg0) {
                var3 = field433[field381];
                var4 = field381 << 14;
            } else {
                var3 = field433[field369[var2]];
                var4 = field369[var2] << 14;
                if (class29.field683 == arg0 && field381 == field369[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method15() && !var3.field51) {
                var3.field49 = false;
                if ((field255 && field337 > 50 || field337 > 200) && class29.field693 != arg0 && var3.field748 == var3.field726) {
                    var3.field49 = true;
                }
                int var5 = var3.field777 >> 7;
                int var6 = var3.field722 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field44 == null || field259 < var3.field34 || field259 >= var3.field39) {
                        if ((var3.field777 & 0x7F) == 64 && (var3.field722 & 0x7F) == 64) {
                            if (field351 == field350[var5][var6]) {
                                continue;
                            }
                            field350[var5][var6] = field351;
                        }
                        var3.field38 = method1(var3.field777, var3.field722, Statics.field975);
                        Statics.field2004.method1639(Statics.field975, var3.field777, var3.field722, var3.field38, 60, var3, var3.field728, var4, var3.field731);
                    } else {
                        var3.field49 = false;
                        var3.field38 = method1(var3.field777, var3.field722, Statics.field975);
                        Statics.field2004.method1640(Statics.field975, var3.field777, var3.field722, var3.field38, 60, var3, var3.field728, var4, var3.field47, var3.field46, var3.field33, var3.field48);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eo.ao(ZI)V")
    public static final void method2803(boolean arg0) {
        for (int var1 = 0; var1 < field293; var1++) {
            class30 var2 = field287[field289[var1]];
            int var3 = (field289[var1] << 14) + 536870912;
            if (var2 != null && var2.method15() && var2.field696.field814 == arg0 && var2.field696.method612()) {
                int var4 = var2.field777 >> 7;
                int var5 = var2.field722 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field732 == 1 && (var2.field777 & 0x7F) == 64 && (var2.field722 & 0x7F) == 64) {
                        if (field351 == field350[var4][var5]) {
                            continue;
                        }
                        field350[var4][var5] = field351;
                    }
                    if (!var2.field696.field822) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2004.method1639(Statics.field975, var2.field777, var2.field722, method1(var2.field777 + (var2.field732 * 64 - 64), var2.field722 + (var2.field732 * 64 - 64), Statics.field975), var2.field732 * 64 - 64 + 60, var2, var2.field728, var3, var2.field731);
                }
            }
        }
    }

    @ObfuscatedName("aa.ag(B)V")
    public static final void method578() {
        for (class26 var0 = (class26) field472.method3237(); var0 != null; var0 = (class26) field472.method3239()) {
            if (Statics.field975 != var0.field621 || var0.field630) {
                var0.method3322();
            } else if (field259 >= var0.field620) {
                var0.method517(field324);
                if (var0.field630) {
                    var0.method3322();
                } else {
                    Statics.field2004.method1639(var0.field621, var0.field627, var0.field623, var0.field624, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("df.ax(I)I")
    public static final int method2522() {
        if (Statics.field123.field140) {
            return Statics.field975;
        } else {
            int var0 = method1(Statics.field1808, Statics.field2930, Statics.field975);
            return var0 - Statics.field11 >= 800 || (class6.field84[Statics.field975][Statics.field1808 >> 7][Statics.field2930 >> 7] & 0x4) == 0 ? 3 : Statics.field975;
        }
    }

    @ObfuscatedName("k.ay(Law;IIIIII)V")
    public static final void method39(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method15()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field696;
            if (var6.field819 != null) {
                var6 = var6.method618();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field337) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field51) {
                return;
            }
            if (var8.field32 != -1 || var8.field35 != -1) {
                method148(arg0, arg0.field769 + 15);
                if (field352 > -1) {
                    if (var8.field32 != -1) {
                        Statics.field1427[var8.field32].method1448(field352 + arg2 - 12, field353 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field35 != -1) {
                        Statics.field717[var8.field35].method1448(field352 + arg2 - 12, field353 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field267 == 10 && field339 == field369[arg1]) {
                method148(arg0, arg0.field769 + 15);
                if (field352 > -1) {
                    Statics.field1283[1].method1448(field352 + arg2 - 12, field353 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field696;
            if (var9.field819 != null) {
                var9 = var9.method618();
            }
            if (var9.field817 >= 0 && var9.field817 < Statics.field717.length) {
                method148(arg0, arg0.field769 + 15);
                if (field352 > -1) {
                    Statics.field717[var9.field817].method1448(field352 + arg2 - 12, field353 + arg3 - 30);
                }
            }
            if (field267 == 1 && field268 == field289[arg1 - field337] && field259 % 20 < 10) {
                method148(arg0, arg0.field769 + 15);
                if (field352 > -1) {
                    Statics.field1283[0].method1448(field352 + arg2 - 12, field353 + arg3 - 28);
                }
            }
        }
        if (arg0.field742 != null && (arg1 >= field337 || field323 == 4 || !arg0.field735 && (field323 == 0 || field323 == 3 || field323 == 1 && Statics.method1896(((class3) arg0).field45, false)))) {
            method148(arg0, arg0.field769);
            if (field352 > -1 && field348 < field341) {
                field361[field348] = Statics.field2836.method3351(arg0.field742) / 2;
                field344[field348] = Statics.field2836.field2912;
                field342[field348] = field352;
                field343[field348] = field353;
                field320[field348] = arg0.field760;
                field307[field348] = arg0.field738;
                field491[field348] = arg0.field736;
                field349[field348] = arg0.field742;
                field348++;
            }
        }
        if (arg0.field725 > field259) {
            method148(arg0, arg0.field769 + 15);
            if (field352 > -1) {
                int var10;
                if (arg1 < field337) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field696;
                    var10 = var11.field818;
                }
                int var12 = arg0.field743 * var10 / arg0.field744;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field743 > 0) {
                    var12 = 1;
                }
                class73.method1590(field352 + arg2 - var10 / 2, field353 + arg3 - 3, var12, 5, 65280);
                class73.method1590(field352 + arg2 - var10 / 2 + var12, field353 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field752[var13] > field259) {
                method148(arg0, arg0.field769 / 2);
                if (field352 > -1) {
                    if (var13 == 1) {
                        field353 -= 20;
                    }
                    if (var13 == 2) {
                        field352 -= 15;
                        field353 -= 10;
                    }
                    if (var13 == 3) {
                        field352 += 15;
                        field353 -= 10;
                    }
                    Statics.field508[arg0.field739[var13]].method1448(field352 + arg2 - 12, field353 + arg3 - 12);
                    Statics.field681.method3358(Integer.toString(arg0.field741[var13]), field352 + arg2 - 1, field353 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("eq.ab(IIIII)V")
    public static final void method2829(int arg0, int arg1, int arg2, int arg3) {
        if (field357 == 1) {
            Statics.field1501[field373 / 100].method1448(field354 - 8, field355 - 8);
        }
        if (field357 == 2) {
            Statics.field1501[field373 / 100 + 4].method1448(field354 - 8, field355 - 8);
        }
        field366 = 0;
        int var4 = (Statics.field61.field777 >> 7) + Statics.field2758;
        int var5 = (Statics.field61.field722 >> 7) + Statics.field1113;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field366 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field366 = 1;
        }
        if (field366 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field366 = 0;
        }
        if (!field265) {
            return;
        }
        int var6 = arg0 + 512 - 5;
        int var7 = arg1 + 20;
        Statics.field881.method3357("Fps:" + field2069, var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && field255) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !field255) {
            var10 = 16711680;
        }
        Statics.field881.method3357("Mem:" + var9 + "k", var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @ObfuscatedName("t.al(Law;II)V")
    public static final void method148(class33 arg0, int arg1) {
        method577(arg0.field777, arg0.field722, arg1);
    }

    @ObfuscatedName("aa.ae(IIIS)V")
    public static final void method577(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field352 = -1;
            field353 = -1;
            return;
        }
        int var3 = method1(arg0, arg1, Statics.field975) - arg2;
        int var4 = arg0 - Statics.field1808;
        int var5 = var3 - Statics.field11;
        int var6 = arg1 - Statics.field2930;
        int var7 = class84.field1471[Statics.field2087];
        int var8 = class84.field1476[Statics.field2087];
        int var9 = class84.field1471[Statics.field2057];
        int var10 = class84.field1476[Statics.field2057];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field352 = (var11 << 9) / var15 + 256;
            field353 = (var14 << 9) / var15 + 167;
        } else {
            field352 = -1;
            field353 = -1;
        }
    }

    @ObfuscatedName("g.af(IIII)I")
    public static final int method1(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field84[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field86[var5][var3][var4] + class6.field86[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field86[var5][var3][var4 + 1] + class6.field86[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cn.aj(IIIIIIB)V")
    public static final void method1898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class84.field1471[var6];
            int var12 = class84.field1476[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class84.field1471[var7];
            int var15 = class84.field1476[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1808 = arg0 - var8;
        Statics.field11 = arg1 - var9;
        Statics.field2930 = arg2 - var10;
        Statics.field2087 = arg3;
        Statics.field2057 = arg4;
    }

    @ObfuscatedName("co.ah(ZB)V")
    public static final void method1804(boolean arg0) {
        field389 = arg0;
        if (!field389) {
            int var1 = field292.method2173();
            int var2 = field292.method2139();
            int var3 = field292.method2173();
            int var4 = (field471 - field292.field1839) / 16;
            Statics.field28 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field28[var5][var6] = field292.method2144();
                }
            }
            int var7 = field292.method2173();
            int var8 = field292.method2288();
            Statics.field1286 = new int[var4];
            Statics.field66 = new int[var4];
            Statics.field15 = new int[var4];
            Statics.field684 = new byte[var4][];
            Statics.field531 = new byte[var4][];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var3 / 8 == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var3 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= (var3 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1286[var10] = var13;
                        Statics.field66[var10] = Statics.field1960.method2709("m" + var11 + "_" + var12);
                        Statics.field15[var10] = Statics.field1960.method2709("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method483(var7, var3, var2, var1, var8);
            return;
        }
        int var14 = field292.method2139();
        int var15 = field292.method2173();
        int var16 = field292.method2173();
        int var17 = field292.method2141();
        field292.method2352();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field292.method2353(1);
                    if (var21 == 1) {
                        field310[var18][var19][var20] = field292.method2353(26);
                    } else {
                        field310[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field292.method2358();
        int var22 = (field471 - field292.field1839) / 16;
        Statics.field28 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field28[var23][var24] = field292.method2182();
            }
        }
        int var25 = field292.method2288();
        Statics.field1286 = new int[var22];
        Statics.field66 = new int[var22];
        Statics.field15 = new int[var22];
        Statics.field684 = new byte[var22][];
        Statics.field531 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field310[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1286[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1286[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field66[var26] = Statics.field1960.method2709("m" + var35 + "_" + var36);
                            Statics.field15[var26] = Statics.field1960.method2709("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method483(var16, var15, var14, var17, var25);
    }

    @ObfuscatedName("m.au(IIIIIB)V")
    public static final void method483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field218 == arg0 && Statics.field2128 == arg1 && field434 == arg2 || !field255) {
            return;
        }
        Statics.field218 = arg0;
        Statics.field2128 = arg1;
        field434 = arg2;
        if (!field255) {
            field434 = 0;
        }
        method2374(25);
        method2690(class142.field2201, true);
        int var5 = Statics.field2758;
        int var6 = Statics.field1113;
        Statics.field2758 = (arg0 - 6) * 8;
        Statics.field1113 = (arg1 - 6) * 8;
        int var7 = Statics.field2758 - var5;
        int var8 = Statics.field1113 - var6;
        int var9 = Statics.field2758;
        int var10 = Statics.field1113;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field287[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field774[var13] -= var7;
                    var12.field775[var13] -= var8;
                }
                var12.field777 -= var7 * 128;
                var12.field722 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field433[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field774[var16] -= var7;
                    var15.field775[var16] -= var8;
                }
                var15.field777 -= var7 * 128;
                var15.field722 -= var8 * 128;
            }
        }
        Statics.field975 = arg2;
        Statics.field61.method594(arg3, arg4, false);
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
                        field384[var27][var23][var24] = field384[var27][var25][var26];
                    } else {
                        field384[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field483.method3237(); var28 != null; var28 = (class15) field483.method3239()) {
            var28.field214 -= var7;
            var28.field203 -= var8;
            if (var28.field214 < 0 || var28.field203 < 0 || var28.field214 >= 104 || var28.field203 >= 104) {
                var28.method3322();
            }
        }
        if (field477 != 0) {
            field477 -= var7;
            field438 -= var8;
        }
        field439 = 0;
        field430 = false;
        field399 = -1;
        field472.method3231();
        field365.method3231();
    }

    @ObfuscatedName("b.ad(ZB)V")
    public static final void method499(boolean arg0) {
        method150();
        field490++;
        if (field490 < 50 && !arg0) {
            return;
        }
        field490 = 0;
        if (field263 || Statics.field1054 == null) {
            return;
        }
        field290.method2354(32);
        try {
            Statics.field1054.method2570(field290.field1840, 0, field290.field1839);
            field290.field1839 = 0;
        } catch (IOException var2) {
            field263 = true;
        }
    }

    @ObfuscatedName("bu.az(B)V")
    public static final void method1088() {
        method499(false);
        field303 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field684.length; var1++) {
            if (Statics.field66[var1] != -1 && Statics.field684[var1] == null) {
                Statics.field684[var1] = Statics.field1960.method2708(Statics.field66[var1], 0);
                if (Statics.field684[var1] == null) {
                    var0 = false;
                    field303++;
                }
            }
            if (Statics.field15[var1] != -1 && Statics.field531[var1] == null) {
                Statics.field531[var1] = Statics.field1960.method2742(Statics.field15[var1], 0, Statics.field28[var1]);
                if (Statics.field531[var1] == null) {
                    var0 = false;
                    field303++;
                }
            }
        }
        if (!var0) {
            field487 = 1;
            return;
        }
        field305 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field684.length; var3++) {
            byte[] var4 = Statics.field531[var3];
            if (var4 != null) {
                int var5 = (Statics.field1286[var3] >> 8) * 64 - Statics.field2758;
                int var6 = (Statics.field1286[var3] & 0xFF) * 64 - Statics.field1113;
                if (field389) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class107 var9 = new class107(var4);
                int var10 = -1;
                label481: while (true) {
                    int var11 = var9.method2152();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2152();
                            if (var16 == 0) {
                                continue label481;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2139() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class36 var22 = class36.method505(var10);
                                if (var19 != 22 || !field255 || var22.field853 != 0 || var22.field859 == 1 || var22.field869) {
                                    if (!var22.method642()) {
                                        field305++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2152();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2139();
                    }
                }
            }
        }
        if (!var2) {
            field487 = 2;
            return;
        }
        if (field487 != 0) {
            method2690(class142.field2201 + class2.field17 + class2.field20 + 100 + "%" + class2.field21, true);
        }
        method150();
        method2399();
        method150();
        Statics.field2004.method1693();
        method150();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field308[var23].method3469();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field84[var24][var25][var26] = 0;
                }
            }
        }
        method150();
        Statics.method510();
        int var27 = Statics.field684.length;
        class20.method570();
        method499(true);
        if (!field389) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field1286[var28] >> 8) * 64 - Statics.field2758;
                int var30 = (Statics.field1286[var28] & 0xFF) * 64 - Statics.field1113;
                byte[] var31 = Statics.field684[var28];
                if (var31 != null) {
                    method150();
                    int var32 = Statics.field218 * 8 - 48;
                    int var33 = Statics.field2128 * 8 - 48;
                    class197[] var34 = field308;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field2955[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class107 var38 = new class107(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class6.method463(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field1286[var42] >> 8) * 64 - Statics.field2758;
                int var44 = (Statics.field1286[var42] & 0xFF) * 64 - Statics.field1113;
                byte[] var45 = Statics.field684[var42];
                if (var45 == null && Statics.field2128 < 800) {
                    method150();
                    class6.method1357(var43, var44, 64, 64);
                }
            }
            method499(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field531[var46];
                if (var47 != null) {
                    int var48 = (Statics.field1286[var46] >> 8) * 64 - Statics.field2758;
                    int var49 = (Statics.field1286[var46] & 0xFF) * 64 - Statics.field1113;
                    method150();
                    class6.method1394(var47, var48, var49, Statics.field2004, field308);
                }
            }
        }
        if (field389) {
            for (int var50 = 0; var50 < 4; var50++) {
                method150();
                for (int var51 = 0; var51 < 13; var51++) {
                    for (int var52 = 0; var52 < 13; var52++) {
                        boolean var53 = false;
                        int var54 = field310[var50][var51][var52];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < Statics.field1286.length; var60++) {
                                if (Statics.field1286[var60] == var59 && Statics.field684[var60] != null) {
                                    class6.method42(Statics.field684[var60], var50, var51 * 8, var52 * 8, var55, (var57 & 0x7) * 8, (var58 & 0x7) * 8, var56, field308);
                                    var53 = true;
                                    break;
                                }
                            }
                        }
                        if (!var53) {
                            class6.method462(var50, var51 * 8, var52 * 8);
                        }
                    }
                }
            }
            for (int var61 = 0; var61 < 13; var61++) {
                for (int var62 = 0; var62 < 13; var62++) {
                    int var63 = field310[0][var61][var62];
                    if (var63 == -1) {
                        class6.method1357(var61 * 8, var62 * 8, 8, 8);
                    }
                }
            }
            method499(true);
            for (int var64 = 0; var64 < 4; var64++) {
                method150();
                for (int var65 = 0; var65 < 13; var65++) {
                    label320: for (int var66 = 0; var66 < 13; var66++) {
                        int var67 = field310[var64][var65][var66];
                        if (var67 != -1) {
                            int var68 = var67 >> 24 & 0x3;
                            int var69 = var67 >> 1 & 0x3;
                            int var70 = var67 >> 14 & 0x3FF;
                            int var71 = var67 >> 3 & 0x7FF;
                            int var72 = (var70 / 8 << 8) + var71 / 8;
                            for (int var73 = 0; var73 < Statics.field1286.length; var73++) {
                                if (Statics.field1286[var73] == var72 && Statics.field531[var73] != null) {
                                    byte[] var74 = Statics.field531[var73];
                                    int var75 = var65 * 8;
                                    int var76 = var66 * 8;
                                    int var77 = (var70 & 0x7) * 8;
                                    int var78 = (var71 & 0x7) * 8;
                                    class79 var79 = Statics.field2004;
                                    class197[] var80 = field308;
                                    class107 var81 = new class107(var74);
                                    int var82 = -1;
                                    while (true) {
                                        int var83 = var81.method2152();
                                        if (var83 == 0) {
                                            continue label320;
                                        }
                                        var82 += var83;
                                        int var84 = 0;
                                        while (true) {
                                            int var85 = var81.method2152();
                                            if (var85 == 0) {
                                                break;
                                            }
                                            var84 += var85 - 1;
                                            int var86 = var84 & 0x3F;
                                            int var87 = var84 >> 6 & 0x3F;
                                            int var88 = var84 >> 12;
                                            int var89 = var81.method2139();
                                            int var90 = var89 >> 2;
                                            int var91 = var89 & 0x3;
                                            if (var68 == var88 && var87 >= var77 && var87 < var77 + 8 && var86 >= var78 && var86 < var78 + 8) {
                                                class36 var92 = class36.method505(var82);
                                                int var93 = var75 + class155.method2703(var87 & 0x7, var86 & 0x7, var69, var92.field846, var92.field847, var91);
                                                int var94 = var76 + class155.method2683(var87 & 0x7, var86 & 0x7, var69, var92.field846, var92.field847, var91);
                                                if (var93 > 0 && var94 > 0 && var93 < 103 && var94 < 103) {
                                                    int var95 = var64;
                                                    if ((class6.field84[1][var93][var94] & 0x2) == 2) {
                                                        var95 = var64 - 1;
                                                    }
                                                    class197 var96 = null;
                                                    if (var95 >= 0) {
                                                        var96 = var80[var95];
                                                    }
                                                    class6.method2561(var64, var93, var94, var82, var69 + var91 & 0x3, var90, var79, var96);
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
        method499(true);
        method2399();
        method150();
        class6.method523(Statics.field2004, field308);
        method499(true);
        int var97 = class6.field74;
        if (var97 > Statics.field975) {
            var97 = Statics.field975;
        }
        if (var97 < Statics.field975 - 1) {
            int var98 = Statics.field975 - 1;
        }
        if (field255) {
            Statics.field2004.method1793(class6.field74);
        } else {
            Statics.field2004.method1793(0);
        }
        for (int var99 = 0; var99 < 104; var99++) {
            for (int var100 = 0; var100 < 104; var100++) {
                method3158(var99, var100);
            }
        }
        method150();
        for (class15 var101 = (class15) field483.method3237(); var101 != null; var101 = (class15) field483.method3239()) {
            if (var101.field212 == -1) {
                var101.field211 = 0;
                method484(var101);
            } else {
                var101.method3322();
            }
        }
        class36.field841.method3176();
        if (Statics.field891 != null) {
            field290.method2354(144);
            field290.method2236(1057001181);
        }
        if (!field389) {
            int var102 = (Statics.field218 - 6) / 8;
            int var103 = (Statics.field218 + 6) / 8;
            int var104 = (Statics.field2128 - 6) / 8;
            int var105 = (Statics.field2128 + 6) / 8;
            for (int var106 = var102 - 1; var106 <= var103 + 1; var106++) {
                for (int var107 = var104 - 1; var107 <= var105 + 1; var107++) {
                    if (var106 < var102 || var106 > var103 || var107 < var104 || var107 > var105) {
                        Statics.field1960.method2728("m" + var106 + "_" + var107);
                        Statics.field1960.method2728("l" + var106 + "_" + var107);
                    }
                }
            }
        }
        method2374(30);
        method150();
        Statics.field1825 = (byte[][][]) null;
        Statics.field75 = (byte[][][]) null;
        Statics.field76 = (byte[][][]) null;
        Statics.field1660 = (byte[][][]) null;
        Statics.field1263 = (int[][][]) null;
        Statics.field77 = (byte[][][]) null;
        Statics.field1258 = (int[][]) null;
        Statics.field73 = null;
        Statics.field79 = null;
        Statics.field1937 = null;
        Statics.field1850 = null;
        Statics.field1422 = null;
        field290.method2354(133);
        class131.method1089();
    }

    @ObfuscatedName("as.ak(IB)V")
    public static final void method566(int arg0) {
        int[] var1 = Statics.field2411.field1305;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field84[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2004.method1662(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field84[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2004.method1662(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2411.method1446();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field84[arg0][var10][var9] & 0x18) == 0) {
                    method2883(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field84[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2883(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field503 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2004.method1657(Statics.field975, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class36.method505(var14).field843;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field308[Statics.field975].field2955;
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
                        field476[field503] = Statics.field970[var15];
                        field474[field503] = var16;
                        field475[field503] = var17;
                        field503++;
                    }
                }
            }
        }
        Statics.field1889.method1432();
    }

    @ObfuscatedName("ek.ar(IIIIII)V")
    public static final void method2883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2004.method1654(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2004.method1658(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2411.field1305;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method505(var12);
            if (var13.field860 == -1) {
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
                class74 var14 = Statics.field601[var13.field860];
                if (var14 != null) {
                    int var15 = (var13.field846 * 4 - var14.field1316) / 2;
                    int var16 = (var13.field847 * 4 - var14.field1317) / 2;
                    var14.method1595(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field847) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2004.method1656(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2004.method1658(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method505(var21);
            if (var22.field860 != -1) {
                class74 var23 = Statics.field601[var22.field860];
                if (var23 != null) {
                    int var24 = (var22.field846 * 4 - var23.field1316) / 2;
                    int var25 = (var22.field847 * 4 - var23.field1317) / 2;
                    var23.method1595(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field847) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2411.field1305;
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
        int var29 = Statics.field2004.method1657(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method505(var30);
        if (var31.field860 == -1) {
            return;
        }
        class74 var32 = Statics.field601[var31.field860];
        if (var32 != null) {
            int var33 = (var31.field846 * 4 - var32.field1316) / 2;
            int var34 = (var31.field847 * 4 - var32.field1317) / 2;
            var32.method1595(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field847) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("cs.bu(B)V")
    public static final void method1807() {
        if (field294 == 85) {
            int var0 = field292.method2139();
            int var1 = (var0 >> 4 & 0x7) + Statics.field31;
            int var2 = (var0 & 0x7) + Statics.field1292;
            int var3 = var1 + field292.method2140();
            int var4 = var2 + field292.method2140();
            int var5 = field292.method2142();
            int var6 = field292.method2141();
            int var7 = field292.method2139() * 4;
            int var8 = field292.method2139() * 4;
            int var9 = field292.method2141();
            int var10 = field292.method2141();
            int var11 = field292.method2139();
            int var12 = field292.method2139();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class7 var17 = new class7(var6, Statics.field975, var13, var14, method1(var13, var14, Statics.field975) - var7, field259 + var9, field259 + var10, var11, var12, var5, var8);
                var17.method77(var15, var16, method1(var15, var16, Statics.field975) - var8, field259 + var9);
                field365.method3232(var17);
            }
        } else if (field294 == 29) {
            int var18 = field292.method2163();
            int var19 = (var18 >> 4 & 0x7) + Statics.field31;
            int var20 = (var18 & 0x7) + Statics.field1292;
            int var21 = field292.method2139();
            int var22 = var21 >> 2;
            int var23 = var21 & 0x3;
            int var24 = field311[var22];
            int var25 = field292.method2173();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                method129(Statics.field975, var19, var20, var24, var25, var22, var23, 0, -1);
            }
        } else if (field294 == 67) {
            int var26 = field292.method2234();
            int var27 = (var26 >> 4 & 0x7) + Statics.field31;
            int var28 = (var26 & 0x7) + Statics.field1292;
            int var29 = field292.method2288();
            int var30 = field292.method2173();
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                class25 var31 = new class25();
                var31.field613 = var29;
                var31.field608 = var30;
                if (field384[Statics.field975][var27][var28] == null) {
                    field384[Statics.field975][var27][var28] = new class177();
                }
                field384[Statics.field975][var27][var28].method3232(var31);
                method3158(var27, var28);
            }
        } else if (field294 == 92) {
            int var32 = field292.method2172();
            int var33 = (var32 >> 4 & 0x7) + Statics.field31;
            int var34 = (var32 & 0x7) + Statics.field1292;
            int var35 = field292.method2172();
            int var36 = var35 >> 2;
            int var37 = var35 & 0x3;
            int var38 = field311[var36];
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                method129(Statics.field975, var33, var34, var38, -1, var36, var37, 0, -1);
            }
        } else if (field294 == 126) {
            int var39 = field292.method2172();
            int var40 = (var39 >> 4 & 0x7) + Statics.field31;
            int var41 = (var39 & 0x7) + Statics.field1292;
            int var42 = field292.method2172();
            int var43 = var42 >> 2;
            int var44 = var42 & 0x3;
            int var45 = field311[var43];
            int var46 = field292.method2141();
            if (var40 >= 0 && var41 >= 0 && var40 < 103 && var41 < 103) {
                if (var45 == 0) {
                    class80 var47 = Statics.field2004.method1720(Statics.field975, var40, var41);
                    if (var47 != null) {
                        int var48 = var47.field1419 >> 14 & 0x7FFF;
                        if (var43 == 2) {
                            var47.field1420 = new class11(var48, 2, var44 + 4, Statics.field975, var40, var41, var46, false, var47.field1420);
                            var47.field1425 = new class11(var48, 2, var44 + 1 & 0x3, Statics.field975, var40, var41, var46, false, var47.field1425);
                        } else {
                            var47.field1420 = new class11(var48, var43, var44, Statics.field975, var40, var41, var46, false, var47.field1420);
                        }
                    }
                }
                if (var45 == 1) {
                    class87 var49 = Statics.field2004.method1651(Statics.field975, var40, var41);
                    if (var49 != null) {
                        int var50 = var49.field1506 >> 14 & 0x7FFF;
                        if (var43 == 4 || var43 == 5) {
                            var49.field1504 = new class11(var50, 4, var44, Statics.field975, var40, var41, var46, false, var49.field1504);
                        } else if (var43 == 6) {
                            var49.field1504 = new class11(var50, 4, var44 + 4, Statics.field975, var40, var41, var46, false, var49.field1504);
                        } else if (var43 == 7) {
                            var49.field1504 = new class11(var50, 4, (var44 + 2 & 0x3) + 4, Statics.field975, var40, var41, var46, false, var49.field1504);
                        } else if (var43 == 8) {
                            var49.field1504 = new class11(var50, 4, var44 + 4, Statics.field975, var40, var41, var46, false, var49.field1504);
                            var49.field1505 = new class11(var50, 4, (var44 + 2 & 0x3) + 4, Statics.field975, var40, var41, var46, false, var49.field1505);
                        }
                    }
                }
                if (var45 == 2) {
                    class91 var51 = Statics.field2004.method1729(Statics.field975, var40, var41);
                    if (var43 == 11) {
                        var43 = 10;
                    }
                    if (var51 != null) {
                        var51.field1554 = new class11(var51.field1566 >> 14 & 0x7FFF, var43, var44, Statics.field975, var40, var41, var46, false, var51.field1554);
                    }
                }
                if (var45 == 3) {
                    class86 var52 = Statics.field2004.method1653(Statics.field975, var40, var41);
                    if (var52 != null) {
                        var52.field1484 = new class11(var52.field1491 >> 14 & 0x7FFF, 22, var44, Statics.field975, var40, var41, var46, false, var52.field1484);
                    }
                }
            }
        } else if (field294 == 155) {
            int var53 = field292.method2234();
            int var54 = (var53 >> 4 & 0x7) + Statics.field31;
            int var55 = (var53 & 0x7) + Statics.field1292;
            int var56 = field292.method2141();
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                class177 var57 = field384[Statics.field975][var54][var55];
                if (var57 != null) {
                    for (class25 var58 = (class25) var57.method3237(); var58 != null; var58 = (class25) var57.method3239()) {
                        if ((var56 & 0x7FFF) == var58.field613) {
                            var58.method3322();
                            break;
                        }
                    }
                    if (var57.method3237() == null) {
                        field384[Statics.field975][var54][var55] = null;
                    }
                    method3158(var54, var55);
                }
            }
        } else if (field294 == 216) {
            int var59 = field292.method2139();
            int var60 = (var59 >> 4 & 0x7) + Statics.field31;
            int var61 = (var59 & 0x7) + Statics.field1292;
            int var62 = field292.method2141();
            int var63 = field292.method2141();
            int var64 = field292.method2141();
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                class177 var65 = field384[Statics.field975][var60][var61];
                if (var65 != null) {
                    for (class25 var66 = (class25) var65.method3237(); var66 != null; var66 = (class25) var65.method3239()) {
                        if ((var62 & 0x7FFF) == var66.field613 && var66.field608 == var63) {
                            var66.field608 = var64;
                            break;
                        }
                    }
                    method3158(var60, var61);
                }
            }
        } else {
            if (field294 == 232) {
                int var67 = field292.method2139();
                int var68 = (var67 >> 4 & 0x7) + Statics.field31;
                int var69 = (var67 & 0x7) + Statics.field1292;
                int var70 = field292.method2141();
                int var71 = field292.method2139();
                int var72 = var71 >> 4 & 0xF;
                int var73 = var71 & 0x7;
                int var74 = field292.method2139();
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                    int var75 = var72 + 1;
                    if (Statics.field61.field774[0] >= var68 - var75 && Statics.field61.field774[0] <= var68 + var75 && Statics.field61.field775[0] >= var69 - var75 && Statics.field61.field775[0] <= var69 + var75 && field484 != 0 && var73 > 0 && field439 < 50) {
                        field486[field439] = var70;
                        field301[field439] = var73;
                        field488[field439] = var74;
                        field285[field439] = null;
                        field248[field439] = (var68 << 16) + (var69 << 8) + var72;
                        field439++;
                    }
                }
            }
            if (field294 == 71) {
                byte var76 = field292.method2166();
                int var77 = field292.method2141();
                byte var78 = field292.method2180();
                int var79 = field292.method2173();
                int var80 = field292.method2288();
                int var81 = field292.method2234();
                int var82 = var81 >> 2;
                int var83 = var81 & 0x3;
                int var84 = field311[var82];
                byte var85 = field292.method2207();
                int var86 = field292.method2127();
                byte var87 = field292.method2207();
                int var88 = field292.method2163();
                int var89 = (var88 >> 4 & 0x7) + Statics.field31;
                int var90 = (var88 & 0x7) + Statics.field1292;
                class3 var91;
                if (field367 == var77) {
                    var91 = Statics.field61;
                } else {
                    var91 = field433[var77];
                }
                if (var91 != null) {
                    class36 var92 = class36.method505(var80);
                    int var93;
                    int var94;
                    if (var83 == 1 || var83 == 3) {
                        var93 = var92.field847;
                        var94 = var92.field846;
                    } else {
                        var93 = var92.field846;
                        var94 = var92.field847;
                    }
                    int var95 = (var93 >> 1) + var89;
                    int var96 = (var93 + 1 >> 1) + var89;
                    int var97 = (var94 >> 1) + var90;
                    int var98 = (var94 + 1 >> 1) + var90;
                    int[][] var99 = class6.field86[Statics.field975];
                    int var100 = var99[var95][var97] + var99[var96][var97] + var99[var95][var98] + var99[var96][var98] >> 2;
                    int var101 = (var89 << 7) + (var93 << 6);
                    int var102 = (var90 << 7) + (var94 << 6);
                    class98 var103 = var92.method644(var82, var83, var99, var101, var100, var102);
                    if (var103 != null) {
                        method129(Statics.field975, var89, var90, var84, -1, 0, 0, var79 + 1, var86 + 1);
                        var91.field34 = field259 + var79;
                        var91.field39 = field259 + var86;
                        var91.field44 = var103;
                        var91.field41 = var89 * 128 + var93 * 64;
                        var91.field43 = var90 * 128 + var94 * 64;
                        var91.field42 = var100;
                        if (var78 > var87) {
                            byte var104 = var78;
                            var78 = var87;
                            var87 = var104;
                        }
                        if (var85 > var76) {
                            byte var105 = var85;
                            var85 = var76;
                            var76 = var105;
                        }
                        var91.field47 = var78 + var89;
                        var91.field33 = var87 + var89;
                        var91.field46 = var85 + var90;
                        var91.field48 = var76 + var90;
                    }
                }
            }
            if (field294 == 250) {
                int var106 = field292.method2139();
                int var107 = (var106 >> 4 & 0x7) + Statics.field31;
                int var108 = (var106 & 0x7) + Statics.field1292;
                int var109 = field292.method2141();
                int var110 = field292.method2139();
                int var111 = field292.method2141();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var112 = var107 * 128 + 64;
                    int var113 = var108 * 128 + 64;
                    class26 var114 = new class26(var109, Statics.field975, var112, var113, method1(var112, var113, Statics.field975) - var110, var111, field259);
                    field472.method3232(var114);
                }
            }
        }
    }

    @ObfuscatedName("y.bo(IIIIIIIIIB)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field483.method3237(); var10 != null; var10 = (class15) field483.method3239()) {
            if (var10.field216 == arg0 && var10.field214 == arg1 && var10.field203 == arg2 && var10.field201 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field216 = arg0;
            var9.field201 = arg3;
            var9.field214 = arg1;
            var9.field203 = arg2;
            method484(var9);
            field483.method3232(var9);
        }
        var9.field204 = arg4;
        var9.field210 = arg5;
        var9.field209 = arg6;
        var9.field211 = arg7;
        var9.field212 = arg8;
    }

    @ObfuscatedName("m.be(Lq;B)V")
    public static final void method484(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field201 == 0) {
            var1 = Statics.field2004.method1654(arg0.field216, arg0.field214, arg0.field203);
        }
        if (arg0.field201 == 1) {
            var1 = Statics.field2004.method1652(arg0.field216, arg0.field214, arg0.field203);
        }
        if (arg0.field201 == 2) {
            var1 = Statics.field2004.method1656(arg0.field216, arg0.field214, arg0.field203);
        }
        if (arg0.field201 == 3) {
            var1 = Statics.field2004.method1657(arg0.field216, arg0.field214, arg0.field203);
        }
        if (var1 != 0) {
            int var5 = Statics.field2004.method1658(arg0.field216, arg0.field214, arg0.field203, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field205 = var2;
        arg0.field207 = var3;
        arg0.field206 = var4;
    }

    @ObfuscatedName("o.bq(IIIIIIII)V")
    public static final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field255 && Statics.field975 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2004.method1654(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2004.method1652(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2004.method1656(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2004.method1657(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2004.method1658(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2004.method1645(arg0, arg2, arg3);
                class36 var15 = class36.method505(var12);
                if (var15.field859 != 0) {
                    field308[arg0].method3475(arg2, arg3, var13, var14, var15.field879);
                }
            }
            if (arg1 == 1) {
                Statics.field2004.method1722(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2004.method1647(arg0, arg2, arg3);
                class36 var16 = class36.method505(var12);
                if (var16.field846 + arg2 > 103 || var16.field846 + arg3 > 103 || var16.field847 + arg2 > 103 || var16.field847 + arg3 > 103) {
                    return;
                }
                if (var16.field859 != 0) {
                    field308[arg0].method3479(arg2, arg3, var16.field846, var16.field847, var14, var16.field879);
                }
            }
            if (arg1 == 3) {
                Statics.field2004.method1648(arg0, arg2, arg3);
                class36 var17 = class36.method505(var12);
                if (var17.field859 == 1) {
                    field308[arg0].method3477(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field84[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class79 var19 = Statics.field2004;
        class197 var20 = field308[arg0];
        class36 var21 = class36.method505(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field847;
            var23 = var21.field846;
        } else {
            var22 = var21.field846;
            var23 = var21.field847;
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
        int[][] var28 = class6.field86[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field853 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field871 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field854 == -1 && var21.field872 == null) {
                var34 = var21.method644(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1634(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field859 == 1) {
                var20.method3476(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field854 == -1 && var21.field872 == null) {
                var57 = var21.method644(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1638(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field859 != 0) {
                var20.method3471(arg2, arg3, var22, var23, var21.field879);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field854 == -1 && var21.field872 == null) {
                var35 = var21.method644(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1638(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field859 != 0) {
                var20.method3471(arg2, arg3, var22, var23, var21.field879);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field854 == -1 && var21.field872 == null) {
                var36 = var21.method644(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1636(arg0, arg2, arg3, var29, var36, (class78) null, class6.field80[arg5], 0, var32, var33);
            if (var21.field859 != 0) {
                var20.method3470(arg2, arg3, arg6, arg5, var21.field879);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field854 == -1 && var21.field872 == null) {
                var37 = var21.method644(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1636(arg0, arg2, arg3, var29, var37, (class78) null, class6.field72[arg5], 0, var32, var33);
            if (var21.field859 != 0) {
                var20.method3470(arg2, arg3, arg6, arg5, var21.field879);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field854 == -1 && var21.field872 == null) {
                var39 = var21.method644(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method644(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field854, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1636(arg0, arg2, arg3, var29, var39, var40, class6.field80[arg5], class6.field80[var38], var32, var33);
            if (var21.field859 != 0) {
                var20.method3470(arg2, arg3, arg6, arg5, var21.field879);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field854 == -1 && var21.field872 == null) {
                var41 = var21.method644(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1636(arg0, arg2, arg3, var29, var41, (class78) null, class6.field72[arg5], 0, var32, var33);
            if (var21.field859 != 0) {
                var20.method3470(arg2, arg3, arg6, arg5, var21.field879);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field854 == -1 && var21.field872 == null) {
                var42 = var21.method644(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1638(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field859 != 0) {
                var20.method3471(arg2, arg3, var22, var23, var21.field879);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field854 == -1 && var21.field872 == null) {
                var43 = var21.method644(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1637(arg0, arg2, arg3, var29, var43, (class78) null, class6.field80[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1654(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method505(var45 >> 14 & 0x7FFF).field834;
            }
            class78 var46;
            if (var21.field854 == -1 && var21.field872 == null) {
                var46 = var21.method644(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1637(arg0, arg2, arg3, var29, var46, (class78) null, class6.field80[arg5], 0, class6.field82[arg5] * var44, class6.field83[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1654(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method505(var48 >> 14 & 0x7FFF).field834 / 2;
            }
            class78 var49;
            if (var21.field854 == -1 && var21.field872 == null) {
                var49 = var21.method644(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1637(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field81[arg5] * var47, class6.field85[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field854 == -1 && var21.field872 == null) {
                var51 = var21.method644(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1637(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1654(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method505(var53 >> 14 & 0x7FFF).field834 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field854 == -1 && var21.field872 == null) {
                var55 = var21.method644(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method644(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field854, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field854, true, (class78) null);
            }
            var19.method1637(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field81[arg5] * var52, class6.field85[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("fw.bh(IIB)V")
    public static final void method3158(int arg0, int arg1) {
        class177 var2 = field384[Statics.field975][arg0][arg1];
        if (var2 == null) {
            Statics.field2004.method1712(Statics.field975, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3237(); var6 != null; var6 = (class25) var2.method3239()) {
            class45 var7 = class45.method744(var6.field613);
            long var8 = (long) var7.field1011;
            if (var7.field1024 == 1) {
                var8 = (long) (var6.field608 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2004.method1712(Statics.field975, arg0, arg1);
            return;
        }
        var2.method3238(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3237(); var12 != null; var12 = (class25) var2.method3239()) {
            if (var5.field613 != var12.field613) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field613 != var12.field613 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2004.method1635(Statics.field975, arg0, arg1, method1(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field975), var5, var13, var10, var11);
    }

    @ObfuscatedName("cl.bc(I)V")
    public static final void method1993() {
        int var0 = field292.method2353(8);
        if (var0 < field337) {
            for (int var1 = var0; var1 < field337; var1++) {
                field345[++field405 - 1] = field369[var1];
            }
        }
        if (var0 > field337) {
            throw new RuntimeException("");
        }
        field337 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field369[var2];
            class3 var4 = field433[var3];
            int var5 = field292.method2353(1);
            if (var5 == 0) {
                field369[++field337 - 1] = var3;
                var4.field768 = field259;
            } else {
                int var6 = field292.method2353(2);
                if (var6 == 0) {
                    field369[++field337 - 1] = var3;
                    var4.field768 = field259;
                    field371[++field489 - 1] = var3;
                } else if (var6 == 1) {
                    field369[++field337 - 1] = var3;
                    var4.field768 = field259;
                    int var7 = field292.method2353(3);
                    var4.method595(var7, false);
                    int var8 = field292.method2353(1);
                    if (var8 == 1) {
                        field371[++field489 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field369[++field337 - 1] = var3;
                    var4.field768 = field259;
                    int var9 = field292.method2353(3);
                    var4.method595(var9, true);
                    int var10 = field292.method2353(3);
                    var4.method595(var10, true);
                    int var11 = field292.method2353(1);
                    if (var11 == 1) {
                        field371[++field489 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field345[++field405 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("af.ba(I)V")
    public static final void method915() {
        for (int var0 = 0; var0 < field489; var0++) {
            int var1 = field371[var0];
            class3 var2 = field433[var1];
            int var3 = field292.method2139();
            if ((var3 & 0x4) != 0) {
                var3 += field292.method2139() << 8;
            }
            if ((var3 & 0x1) != 0) {
                var2.field746 = field292.method2127();
                var2.field770 = field292.method2173();
            }
            if ((var3 & 0x2) != 0) {
                var2.field742 = field292.method2147();
                if (var2.field742.charAt(0) == '~') {
                    var2.field742 = var2.field742.substring(1);
                    Statics.method1994(2, var2.field45, var2.field742);
                } else if (Statics.field61 == var2) {
                    Statics.method1994(2, var2.field45, var2.field742);
                }
                var2.field735 = false;
                var2.field760 = 0;
                var2.field738 = 0;
                var2.field736 = 150;
            }
            if ((var3 & 0x100) != 0) {
                int var4 = field292.method2288();
                int var5 = field292.method2139();
                var2.method598(var4, var5, field259);
                var2.field725 = field259 + 300;
                var2.field743 = field292.method2172();
                var2.field744 = field292.method2163();
            }
            if ((var3 & 0x10) != 0) {
                var2.field745 = field292.method2127();
                if (var2.field745 == 65535) {
                    var2.field745 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var6 = field292.method2139();
                byte[] var7 = new byte[var6];
                class107 var8 = new class107(var7);
                field292.method2202(var7, 0, var6);
                field372[var1] = var8;
                var2.method14(var8);
            }
            if ((var3 & 0x400) != 0) {
                var2.field756 = field292.method2141();
                int var9 = field292.method2144();
                var2.field771 = var9 >> 16;
                var2.field764 = (var9 & 0xFFFF) + field259;
                var2.field757 = 0;
                var2.field758 = 0;
                if (var2.field764 > field259) {
                    var2.field757 = -1;
                }
                if (var2.field756 == 65535) {
                    var2.field756 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var10 = field292.method2173();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = field292.method2234();
                method127(var2, var10, var11);
            }
            if ((var3 & 0x200) != 0) {
                var2.field729 = field292.method2172();
                var2.field763 = field292.method2234();
                var2.field762 = field292.method2139();
                var2.field734 = field292.method2139();
                var2.field765 = field292.method2173() + field259;
                var2.field766 = field292.method2141() + field259;
                var2.field767 = field292.method2163();
                var2.field773 = 1;
                var2.field778 = 0;
            }
            if ((var3 & 0x8) != 0) {
                int var12 = field292.method2288();
                int var13 = field292.method2139();
                var2.method598(var12, var13, field259);
                var2.field725 = field259 + 300;
                var2.field743 = field292.method2139();
                var2.field744 = field292.method2139();
            }
            if ((var3 & 0x40) != 0) {
                int var14 = field292.method2127();
                int var15 = field292.method2172();
                boolean var16 = field292.method2234() == 1;
                int var17 = field292.method2139();
                int var18 = field292.field1839;
                if (var2.field45 != null && var2.field40 != null) {
                    boolean var19 = false;
                    if (var15 <= 1 && method1875(var2.field45)) {
                        var19 = true;
                    }
                    if (!var19 && field366 == 0 && !var2.field51) {
                        field368.field1839 = 0;
                        field292.method2150(field368.field1840, 0, var17);
                        field368.field1839 = 0;
                        class107 var20 = field368;
                        String var24;
                        try {
                            int var21 = var20.method2152();
                            if (var21 > 32767) {
                                var21 = 32767;
                            }
                            byte[] var22 = new byte[var21];
                            var20.field1839 += Statics.field2902.method2072(var20.field1840, var20.field1839, var22, 0, var21);
                            String var23 = class201.method466(var22, 0, var21);
                            var24 = var23;
                        } catch (Exception var28) {
                            var24 = "Cabbage";
                        }
                        String var27 = class192.method3355(Statics.method2387(var24));
                        var2.field742 = var27.trim();
                        var2.field760 = var14 >> 8;
                        var2.field738 = var14 & 0xFF;
                        var2.field736 = 150;
                        var2.field735 = var16;
                        if (var15 == 2 || var15 == 3) {
                            Statics.method1994(var16 ? 91 : 1, class2.method2799(1) + var2.field45, var27);
                        } else if (var15 == 1) {
                            Statics.method1994(var16 ? 91 : 1, class2.method2799(0) + var2.field45, var27);
                        } else {
                            Statics.method1994(var16 ? 90 : 2, var2.field45, var27);
                        }
                    }
                }
                field292.field1839 = var17 + var18;
            }
        }
    }

    @ObfuscatedName("bz.bn(I)V")
    public static final void method1354() {
        field405 = 0;
        field489 = 0;
        method800();
        method568();
        for (int var0 = 0; var0 < field489; var0++) {
            int var1 = field371[var0];
            class30 var2 = field287[var1];
            int var3 = field292.method2139();
            if ((var3 & 0x10) != 0) {
                var2.field756 = field292.method2173();
                int var4 = field292.method2178();
                var2.field771 = var4 >> 16;
                var2.field764 = (var4 & 0xFFFF) + field259;
                var2.field757 = 0;
                var2.field758 = 0;
                if (var2.field764 > field259) {
                    var2.field757 = -1;
                }
                if (var2.field756 == 65535) {
                    var2.field756 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var5 = field292.method2163();
                int var6 = field292.method2234();
                var2.method598(var5, var6, field259);
                var2.field725 = field259 + 300;
                var2.field743 = field292.method2127();
                var2.field744 = field292.method2288();
            }
            if ((var3 & 0x8) != 0) {
                var2.field745 = field292.method2141();
                if (var2.field745 == 65535) {
                    var2.field745 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var7 = field292.method2163();
                int var8 = field292.method2234();
                var2.method598(var7, var8, field259);
                var2.field725 = field259 + 300;
                var2.field743 = field292.method2288();
                var2.field744 = field292.method2288();
            }
            if ((var3 & 0x1) != 0) {
                var2.field696 = class35.method143(field292.method2288());
                var2.field732 = var2.field696.field800;
                var2.field772 = var2.field696.field790;
                var2.field740 = var2.field696.field801;
                var2.field730 = var2.field696.field807;
                var2.field759 = var2.field696.field803;
                var2.field761 = var2.field696.field812;
                var2.field726 = var2.field696.field798;
                var2.field727 = var2.field696.field799;
                var2.field753 = var2.field696.field823;
            }
            if ((var3 & 0x4) != 0) {
                int var9 = field292.method2127();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field292.method2172();
                if (var2.field751 == var9 && var9 != -1) {
                    int var11 = class38.method1996(var9).field914;
                    if (var11 == 1) {
                        var2.field724 = 0;
                        var2.field779 = 0;
                        var2.field754 = var10;
                        var2.field755 = 0;
                    }
                    if (var11 == 2) {
                        var2.field755 = 0;
                    }
                } else if (var9 == -1 || var2.field751 == -1 || class38.method1996(var9).field908 >= class38.method1996(var2.field751).field908) {
                    var2.field751 = var9;
                    var2.field724 = 0;
                    var2.field779 = 0;
                    var2.field754 = var10;
                    var2.field755 = 0;
                    var2.field778 = var2.field773;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field742 = field292.method2147();
                var2.field736 = 100;
            }
            if ((var3 & 0x80) != 0) {
                var2.field746 = field292.method2127();
                var2.field770 = field292.method2173();
            }
        }
        for (int var12 = 0; var12 < field405; var12++) {
            int var13 = field345[var12];
            if (field259 != field287[var13].field768) {
                field287[var13].field696 = null;
                field287[var13] = null;
            }
        }
        if (field471 != field292.field1839) {
            throw new RuntimeException(field292.field1839 + class2.field22 + field471);
        }
        for (int var14 = 0; var14 < field293; var14++) {
            if (field287[field289[var14]] == null) {
                throw new RuntimeException(var14 + class2.field22 + field293);
            }
        }
    }

    @ObfuscatedName("ax.bx(B)V")
    public static final void method800() {
        field292.method2352();
        int var0 = field292.method2353(8);
        if (var0 < field293) {
            for (int var1 = var0; var1 < field293; var1++) {
                field345[++field405 - 1] = field289[var1];
            }
        }
        if (var0 > field293) {
            throw new RuntimeException("");
        }
        field293 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field289[var2];
            class30 var4 = field287[var3];
            int var5 = field292.method2353(1);
            if (var5 == 0) {
                field289[++field293 - 1] = var3;
                var4.field768 = field259;
            } else {
                int var6 = field292.method2353(2);
                if (var6 == 0) {
                    field289[++field293 - 1] = var3;
                    var4.field768 = field259;
                    field371[++field489 - 1] = var3;
                } else if (var6 == 1) {
                    field289[++field293 - 1] = var3;
                    var4.field768 = field259;
                    int var7 = field292.method2353(3);
                    var4.method595(var7, false);
                    int var8 = field292.method2353(1);
                    if (var8 == 1) {
                        field371[++field489 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field289[++field293 - 1] = var3;
                    var4.field768 = field259;
                    int var9 = field292.method2353(3);
                    var4.method595(var9, true);
                    int var10 = field292.method2353(3);
                    var4.method595(var10, true);
                    int var11 = field292.method2353(1);
                    if (var11 == 1) {
                        field371[++field489 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field345[++field405 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("as.by(I)V")
    public static final void method568() {
        while (true) {
            if (field292.method2350(field471) >= 27) {
                int var0 = field292.method2353(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field287[var0] == null) {
                        field287[var0] = new class30();
                        var1 = true;
                    }
                    class30 var2 = field287[var0];
                    field289[++field293 - 1] = var0;
                    var2.field768 = field259;
                    int var3 = field292.method2353(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    var2.field696 = class35.method143(field292.method2353(14));
                    int var4 = field292.method2353(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field292.method2353(1);
                    int var6 = field380[field292.method2353(3)];
                    if (var1) {
                        var2.field737 = var2.field728 = var6;
                    }
                    int var7 = field292.method2353(1);
                    if (var7 == 1) {
                        field371[++field489 - 1] = var0;
                    }
                    var2.field732 = var2.field696.field800;
                    var2.field772 = var2.field696.field790;
                    if (var2.field772 == 0) {
                        var2.field728 = 0;
                    }
                    var2.field740 = var2.field696.field801;
                    var2.field730 = var2.field696.field807;
                    var2.field759 = var2.field696.field803;
                    var2.field761 = var2.field696.field812;
                    var2.field726 = var2.field696.field798;
                    var2.field727 = var2.field696.field799;
                    var2.field753 = var2.field696.field823;
                    var2.method594(Statics.field61.field774[0] + var4, Statics.field61.field775[0] + var3, var5 == 1);
                    continue;
                }
            }
            field292.method2358();
            return;
        }
    }

    @ObfuscatedName("ao.bs(B)V")
    public static final void method745() {
        int var0 = Statics.field186;
        int var1 = Statics.field2024;
        int var2 = Statics.field1898;
        int var3 = Statics.field612;
        int var4 = 6116423;
        class73.method1590(var0, var1, var2, var3, var4);
        class73.method1590(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1542(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field2836.method3356(class142.field2309, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field2023;
        int var6 = class127.field2017 * 1105708693;
        for (int var7 = 0; var7 < field391; var7++) {
            int var8 = (field391 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class193 var10 = Statics.field2836;
            String var11;
            if (field412[var7].length() > 0) {
                var11 = field396[var7] + class142.field2316 + field412[var7];
            } else {
                var11 = field396[var7];
            }
            var10.method3356(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field186;
        int var13 = Statics.field2024;
        int var14 = Statics.field1898;
        int var15 = Statics.field612;
        for (int var16 = 0; var16 < field451; var16++) {
            if (field458[var16] + field456[var16] > var12 && field456[var16] < var12 + var14 && field457[var16] + field449[var16] > var13 && field457[var16] < var13 + var15) {
                field454[var16] = true;
            }
        }
    }

    @ObfuscatedName("al.bv(IIIIB)V")
    public static final void method849(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field451; var4++) {
            if (field458[var4] + field456[var4] > arg0 && field456[var4] < arg0 + arg2 && field457[var4] + field449[var4] > arg1 && field457[var4] < arg1 + arg3) {
                field453[var4] = true;
            }
        }
    }

    @ObfuscatedName("er.bm(IIB)V")
    public static final void method2664(int arg0, int arg1) {
        int var2 = Statics.field2836.method3351(class142.field2309);
        for (int var3 = 0; var3 < field391; var3++) {
            class193 var4 = Statics.field2836;
            String var5;
            if (field412[var3].length() > 0) {
                var5 = field396[var3] + class142.field2316 + field412[var3];
            } else {
                var5 = field396[var3];
            }
            int var6 = var4.method3351(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field391 * 15 + 21;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > 765) {
            var8 = 765 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > 503) {
            var9 = 503 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field495 = true;
        Statics.field186 = var8;
        Statics.field2024 = var9;
        Statics.field1898 = var2;
        Statics.field612 = field391 * 15 + 22;
    }

    @ObfuscatedName("k.br(II)Z")
    public static final boolean method38(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field394[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("fp.bd(IB)V")
    public static final void method2961(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field392[arg0];
        int var2 = field393[arg0];
        int var3 = field394[arg0];
        int var4 = field395[arg0];
        String var5 = field396[arg0];
        String var6 = field412[arg0];
        method125(var1, var2, var3, var4, var5, var6, class127.field2027, class127.field2031);
    }

    @ObfuscatedName("bu.bz(Lac;IIS)V")
    public static final void method1091(class27 arg0, int arg1, int arg2) {
        method125(arg0.field636, arg0.field631, arg0.field633, arg0.field635, arg0.field634, arg0.field634, arg1, arg2);
    }

    @ObfuscatedName("i.bf(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method125(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 8) {
            class30 var8 = field287[arg3];
            if (var8 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(61);
                field290.method2236(Statics.field233);
                field290.method2169(arg3);
                field290.method2169(field480);
                field290.method2161(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 47) {
            class3 var9 = field433[arg3];
            if (var9 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(141);
                field290.method2216(arg3);
                field290.method2126(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 7) {
            class30 var10 = field287[arg3];
            if (var10 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(7);
                field290.method2216(Statics.field192);
                field290.method2169(arg3);
                field290.method2161(class124.field1994[82] ? 1 : 0);
                field290.method2277(Statics.field519);
                field290.method2170(Statics.field1293);
            }
        }
        if (arg2 == 35) {
            field290.method2354(166);
            field290.method2216(arg0);
            field290.method2236(arg1);
            field290.method2169(arg3);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 34) {
            field290.method2354(94);
            field290.method2236(arg1);
            field290.method2216(arg0);
            field290.method2169(arg3);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 51) {
            class3 var11 = field433[arg3];
            if (var11 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(179);
                field290.method2170(arg3);
                field290.method2161(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class30 var12 = field287[arg3];
            if (var12 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(4);
                field290.method2216(arg3);
                field290.method2161(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class152 var13 = class152.method2342(arg1, arg0);
            if (var13 != null) {
                method2895();
                int var14 = class156.method562(method37(var13));
                int var15 = var13.field2633;
                class152 var16 = class152.method2342(arg1, arg0);
                if (var16 != null && var16.field2607 != null) {
                    class1 var17 = new class1();
                    var17.field10 = var16;
                    var17.field4 = var16.field2607;
                    class32.method120(var17);
                }
                field321 = var15;
                field425 = true;
                Statics.field233 = arg1;
                field480 = arg0;
                Statics.field1880 = var14;
                method2553(var16);
                field402 = 0;
                String var18;
                if (class156.method562(method37(var13)) == 0) {
                    var18 = null;
                } else if (var13.field2642 == null || var13.field2642.trim().length() == 0) {
                    var18 = null;
                } else {
                    var18 = var13.field2642;
                }
                field485 = var18;
                if (field485 == null) {
                    field485 = "Null";
                }
                if (var13.field2613) {
                    field363 = var13.field2579 + class2.method2078(16777215);
                } else {
                    field363 = class2.method2078(65280) + var13.field2629 + class2.method2078(16777215);
                }
            }
            return;
        }
        if (arg2 == 44) {
            class3 var19 = field433[arg3];
            if (var19 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(135);
                field290.method2169(arg3);
                field290.method2126(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(73);
            field290.method2162(class124.field1994[82] ? 1 : 0);
            field290.method2277(Statics.field233);
            field290.method2151(arg3 >> 14 & 0x7FFF);
            field290.method2169(Statics.field1113 + arg1);
            field290.method2151(field480);
            field290.method2170(Statics.field2758 + arg0);
        }
        if (arg2 == 46) {
            class3 var20 = field433[arg3];
            if (var20 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(217);
                field290.method2126(class124.field1994[82] ? 1 : 0);
                field290.method2151(arg3);
            }
        }
        if (arg2 == 29) {
            field290.method2354(76);
            field290.method2236(arg1);
            class152 var21 = class152.method2801(arg1);
            if (var21.field2625 != null && var21.field2625[0][0] == 5) {
                int var22 = var21.field2625[0][1];
                if (class154.field2660[var22] != var21.field2535[0]) {
                    class154.field2660[var22] = var21.field2535[0];
                    method2676(var22);
                }
            }
        }
        if (arg2 == 6) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(181);
            field290.method2169(Statics.field1113 + arg1);
            field290.method2170(Statics.field2758 + arg0);
            field290.method2216(arg3 >> 14 & 0x7FFF);
            field290.method2126(class124.field1994[82] ? 1 : 0);
        }
        if (arg2 == 23) {
            Statics.field2004.method1665(Statics.field975, arg0, arg1);
        }
        if (arg2 == 38) {
            method2895();
            class152 var23 = class152.method2801(arg1);
            field402 = 1;
            Statics.field192 = arg0;
            Statics.field519 = arg1;
            Statics.field1293 = arg3;
            method2553(var23);
            field403 = class2.method2078(16748608) + class45.method744(arg3).field1017 + class2.method2078(16777215);
            if (field403 == null) {
                field403 = "null";
            }
            return;
        }
        if (arg2 == 16) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(121);
            field290.method2169(Statics.field2758 + arg0);
            field290.method2216(Statics.field1113 + arg1);
            field290.method2170(arg3);
            field290.method2126(class124.field1994[82] ? 1 : 0);
            field290.method2267(Statics.field519);
            field290.method2151(Statics.field192);
            field290.method2151(Statics.field1293);
        }
        if (arg2 == 20) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(156);
            field290.method2216(arg3);
            field290.method2169(Statics.field1113 + arg1);
            field290.method2151(Statics.field2758 + arg0);
            field290.method2160(class124.field1994[82] ? 1 : 0);
        }
        if (arg2 == 11) {
            class30 var24 = field287[arg3];
            if (var24 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(240);
                field290.method2216(arg3);
                field290.method2160(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field290.method2354(214);
            field290.method2267(arg1);
            field290.method2216(arg3);
            field290.method2151(arg0);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 1) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(75);
            field290.method2169(Statics.field1293);
            field290.method2151(Statics.field192);
            field290.method2170(Statics.field2758 + arg0);
            field290.method2177(Statics.field519);
            field290.method2216(Statics.field1113 + arg1);
            field290.method2126(class124.field1994[82] ? 1 : 0);
            field290.method2170(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 50) {
            class3 var25 = field433[arg3];
            if (var25 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(82);
                field290.method2170(arg3);
                field290.method2126(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 17) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(102);
            field290.method2151(field480);
            field290.method2170(arg3);
            field290.method2151(Statics.field1113 + arg1);
            field290.method2267(Statics.field233);
            field290.method2160(class124.field1994[82] ? 1 : 0);
            field290.method2170(Statics.field2758 + arg0);
        }
        if (arg2 == 21) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(198);
            field290.method2170(arg3);
            field290.method2169(Statics.field1113 + arg1);
            field290.method2126(class124.field1994[82] ? 1 : 0);
            field290.method2169(Statics.field2758 + arg0);
        }
        if (arg2 == 19) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(37);
            field290.method2126(class124.field1994[82] ? 1 : 0);
            field290.method2169(Statics.field2758 + arg0);
            field290.method2151(Statics.field1113 + arg1);
            field290.method2151(arg3);
        }
        if (arg2 == 48) {
            class3 var26 = field433[arg3];
            if (var26 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(115);
                field290.method2162(class124.field1994[82] ? 1 : 0);
                field290.method2170(arg3);
            }
        }
        if (arg2 == 1002) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field290.method2354(108);
            field290.method2151(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1005) {
            class152 var27 = class152.method2801(arg1);
            if (var27 == null || var27.field2632[arg0] < 100000) {
                field290.method2354(138);
                field290.method2216(arg3);
            } else {
                Statics.method1994(27, "", var27.field2632[arg0] + " x " + class45.method744(arg3).field1017);
            }
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 45) {
            class3 var28 = field433[arg3];
            if (var28 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(36);
                field290.method2169(arg3);
                field290.method2162(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class30 var29 = field287[arg3];
            if (var29 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(224);
                field290.method2160(class124.field1994[82] ? 1 : 0);
                field290.method2169(arg3);
            }
        }
        if (arg2 == 58) {
            class152 var30 = class152.method2342(arg1, arg0);
            if (var30 != null) {
                field290.method2354(95);
                field290.method2170(field480);
                field290.method2267(Statics.field233);
                field290.method2236(arg1);
                field290.method2216(var30.field2633);
                field290.method2169(arg0);
                field290.method2169(field321);
            }
        }
        if (arg2 == 9) {
            class30 var31 = field287[arg3];
            if (var31 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(53);
                field290.method2169(arg3);
                field290.method2162(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var32 = field433[arg3];
            if (var32 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(189);
                field290.method2216(arg3);
                field290.method2161(class124.field1994[82] ? 1 : 0);
                field290.method2267(Statics.field519);
                field290.method2170(Statics.field192);
                field290.method2170(Statics.field1293);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class152 var33 = class152.method2342(arg1, arg0);
            if (var33 != null) {
                method1442(arg3, arg1, arg0, var33.field2633, arg5);
            }
        }
        if (arg2 == 30 && field413 == null) {
            field290.method2354(250);
            field290.method2236(arg1);
            field290.method2216(arg0);
            field413 = class152.method2342(arg1, arg0);
            method2553(field413);
        }
        if (arg2 == 18) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(173);
            field290.method2160(class124.field1994[82] ? 1 : 0);
            field290.method2151(Statics.field1113 + arg1);
            field290.method2169(Statics.field2758 + arg0);
            field290.method2216(arg3);
        }
        if (arg2 == 12) {
            class30 var34 = field287[arg3];
            if (var34 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(86);
                field290.method2126(class124.field1994[82] ? 1 : 0);
                field290.method2216(arg3);
            }
        }
        if (arg2 == 39) {
            field290.method2354(45);
            field290.method2216(arg3);
            field290.method2151(arg0);
            field290.method2236(arg1);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 1003) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            class30 var35 = field287[arg3];
            if (var35 != null) {
                class35 var36 = var35.field696;
                if (var36.field819 != null) {
                    var36 = var36.method618();
                }
                if (var36 != null) {
                    field290.method2354(210);
                    field290.method2151(var36.field793);
                }
            }
        }
        if (arg2 == 4) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(21);
            field290.method2160(class124.field1994[82] ? 1 : 0);
            field290.method2151(Statics.field2758 + arg0);
            field290.method2151(arg3 >> 14 & 0x7FFF);
            field290.method2170(Statics.field1113 + arg1);
        }
        if (arg2 == 31) {
            field290.method2354(197);
            field290.method2169(arg3);
            field290.method2277(Statics.field519);
            field290.method2177(arg1);
            field290.method2151(Statics.field1293);
            field290.method2216(Statics.field192);
            field290.method2151(arg0);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 49) {
            class3 var37 = field433[arg3];
            if (var37 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(62);
                field290.method2169(arg3);
                field290.method2162(class124.field1994[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class3 var38 = field433[arg3];
            if (var38 != null) {
                field354 = arg6;
                field355 = arg7;
                field357 = 2;
                field373 = 0;
                field477 = arg0;
                field438 = arg1;
                field290.method2354(243);
                field290.method2236(Statics.field233);
                field290.method2126(class124.field1994[82] ? 1 : 0);
                field290.method2169(arg3);
                field290.method2151(field480);
            }
        }
        if (arg2 == 40) {
            field290.method2354(192);
            field290.method2267(arg1);
            field290.method2151(arg0);
            field290.method2151(arg3);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 1004) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field290.method2354(138);
            field290.method2216(arg3);
        }
        if (arg2 == 5) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(200);
            field290.method2170(Statics.field1113 + arg1);
            field290.method2151(Statics.field2758 + arg0);
            field290.method2162(class124.field1994[82] ? 1 : 0);
            field290.method2216(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 32) {
            field290.method2354(106);
            field290.method2216(arg3);
            field290.method2236(Statics.field233);
            field290.method2277(arg1);
            field290.method2169(arg0);
            field290.method2151(field480);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 41) {
            field290.method2354(134);
            field290.method2216(arg3);
            field290.method2277(arg1);
            field290.method2170(arg0);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 37) {
            field290.method2354(154);
            field290.method2169(arg3);
            field290.method2177(arg1);
            field290.method2151(arg0);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 1001) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(47);
            field290.method2216(Statics.field2758 + arg0);
            field290.method2216(Statics.field1113 + arg1);
            field290.method2151(arg3 >> 14 & 0x7FFF);
            field290.method2126(class124.field1994[82] ? 1 : 0);
        }
        if (arg2 == 22) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(206);
            field290.method2169(Statics.field1113 + arg1);
            field290.method2170(Statics.field2758 + arg0);
            field290.method2160(class124.field1994[82] ? 1 : 0);
            field290.method2216(arg3);
        }
        if (arg2 == 24) {
            class152 var39 = class152.method2801(arg1);
            boolean var40 = true;
            if (var39.field2644 > 0) {
                var40 = method2830(var39);
            }
            if (var40) {
                field290.method2354(76);
                field290.method2236(arg1);
            }
        }
        if (arg2 == 3) {
            field354 = arg6;
            field355 = arg7;
            field357 = 2;
            field373 = 0;
            field477 = arg0;
            field438 = arg1;
            field290.method2354(19);
            field290.method2126(class124.field1994[82] ? 1 : 0);
            field290.method2216(arg3 >> 14 & 0x7FFF);
            field290.method2151(Statics.field1113 + arg1);
            field290.method2169(Statics.field2758 + arg0);
        }
        if (arg2 == 33) {
            field290.method2354(150);
            field290.method2169(arg3);
            field290.method2151(arg0);
            field290.method2177(arg1);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 42) {
            field290.method2354(241);
            field290.method2169(arg0);
            field290.method2177(arg1);
            field290.method2151(arg3);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 26) {
            method134();
        }
        if (arg2 == 43) {
            field290.method2354(255);
            field290.method2151(arg3);
            field290.method2216(arg0);
            field290.method2277(arg1);
            field358 = 0;
            Statics.field679 = class152.method2801(arg1);
            field359 = arg0;
        }
        if (arg2 == 28) {
            field290.method2354(76);
            field290.method2236(arg1);
            class152 var41 = class152.method2801(arg1);
            if (var41.field2625 != null && var41.field2625[0][0] == 5) {
                int var42 = var41.field2625[0][1];
                class154.field2660[var42] = 1 - class154.field2660[var42];
                method2676(var42);
            }
        }
        if (field402 != 0) {
            field402 = 0;
            method2553(class152.method2801(Statics.field519));
        }
        if (field425) {
            method2895();
        }
        if (Statics.field679 != null && field358 == 0) {
            method2553(Statics.field679);
        }
    }

    @ObfuscatedName("et.bg(I)V")
    public static void method2895() {
        if (!field425) {
            return;
        }
        class152 var0 = class152.method2342(Statics.field233, field480);
        if (var0 != null && var0.field2531 != null) {
            class1 var1 = new class1();
            var1.field10 = var0;
            var1.field4 = var0.field2531;
            class32.method120(var1);
        }
        field425 = false;
        method2553(var0);
    }

    @ObfuscatedName("bp.bp(IIIILjava/lang/String;B)V")
    public static void method1442(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class152 var5 = class152.method2342(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2553 != null) {
            class1 var6 = new class1();
            var6.field10 = var5;
            var6.field6 = arg0;
            var6.field8 = arg4;
            var6.field4 = var5.field2553;
            class32.method120(var6);
        }
        boolean var7 = true;
        if (var5.field2644 > 0) {
            var7 = method2830(var5);
        }
        if (!var7 || !Statics.method1430(method37(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field290.method2354(99);
            field290.method2236(arg1);
            field290.method2151(arg2);
            field290.method2151(arg3);
        }
        if (arg0 == 2) {
            field290.method2354(215);
            field290.method2236(arg1);
            field290.method2151(arg2);
            field290.method2151(arg3);
        }
        if (arg0 == 3) {
            field290.method2354(69);
            field290.method2236(arg1);
            field290.method2151(arg2);
            field290.method2151(arg3);
        }
        if (arg0 == 4) {
            field290.method2354(130);
            field290.method2236(arg1);
            field290.method2151(arg2);
            field290.method2151(arg3);
        }
        if (arg0 == 5) {
            field290.method2354(145);
            field290.method2236(arg1);
            field290.method2151(arg2);
            field290.method2151(arg3);
        }
        if (arg0 == 6) {
            field290.method2354(23);
            field290.method2236(arg1);
            field290.method2151(arg2);
            field290.method2151(arg3);
        }
        if (arg0 == 7) {
            field290.method2354(172);
            field290.method2236(arg1);
            field290.method2151(arg2);
            field290.method2151(arg3);
        }
        if (arg0 == 8) {
            field290.method2354(38);
            field290.method2236(arg1);
            field290.method2151(arg2);
            field290.method2151(arg3);
        }
        if (arg0 == 9) {
            field290.method2354(57);
            field290.method2236(arg1);
            field290.method2151(arg2);
            field290.method2151(arg3);
        }
        if (arg0 == 10) {
            field290.method2354(93);
            field290.method2236(arg1);
            field290.method2151(arg2);
            field290.method2151(arg3);
        }
    }

    @ObfuscatedName("l.bk(B)V")
    public static final void method62() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field391 - 1; var1++) {
                if (field394[var1] < 1000 && field394[var1 + 1] > 1000) {
                    String var2 = field412[var1];
                    field412[var1] = field412[var1 + 1];
                    field412[var1 + 1] = var2;
                    String var3 = field396[var1];
                    field396[var1] = field396[var1 + 1];
                    field396[var1 + 1] = var3;
                    int var4 = field394[var1];
                    field394[var1] = field394[var1 + 1];
                    field394[var1 + 1] = var4;
                    int var5 = field392[var1];
                    field392[var1] = field392[var1 + 1];
                    field392[var1 + 1] = var5;
                    int var6 = field393[var1];
                    field393[var1] = field393[var1 + 1];
                    field393[var1 + 1] = var6;
                    int var7 = field395[var1];
                    field395[var1] = field395[var1 + 1];
                    field395[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ap.bl(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method559(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field495 || field391 >= 500) {
            return;
        }
        field396[field391] = arg0;
        field412[field391] = arg1;
        field394[field391] = arg2;
        field395[field391] = arg3;
        field392[field391] = arg4;
        field393[field391] = arg5;
        field391++;
    }

    @ObfuscatedName("er.bt(B)V")
    public static void method2665() {
        for (int var0 = 0; var0 < field391; var0++) {
            int var1 = field394[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field391 - 1) {
                    for (int var3 = var0; var3 < field391 - 1; var3++) {
                        field396[var3] = field396[var3 + 1];
                        field412[var3] = field412[var3 + 1];
                        field394[var3] = field394[var3 + 1];
                        field395[var3] = field395[var3 + 1];
                        field392[var3] = field392[var3 + 1];
                        field393[var3] = field393[var3 + 1];
                    }
                }
                field391--;
            }
        }
    }

    @ObfuscatedName("ag.bi(Lav;IIII)V")
    public static final void method768(class35 arg0, int arg1, int arg2, int arg3) {
        if (field391 >= 400) {
            return;
        }
        if (arg0.field819 != null) {
            arg0 = arg0.method618();
        }
        if (arg0 == null || !arg0.field822 || arg0.field824 && field333 != arg1) {
            return;
        }
        String var4 = arg0.field794;
        if (arg0.field811 != 0) {
            var4 = var4 + method146(arg0.field811, Statics.field61.field50) + " " + class2.field20 + class142.field2276 + arg0.field811 + class2.field21;
        }
        if (field402 == 1) {
            method559(class142.field2225, field403 + " " + class2.field23 + " " + class2.method2078(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field425) {
            String[] var5 = arg0.field809;
            if (field288) {
                var5 = method497(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class142.field2198)) {
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
                        method559(var5[var6], class2.method2078(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class142.field2198)) {
                        short var9 = 0;
                        if (field277 == class18.field521 || field277 == class18.field518 && arg0.field811 > Statics.field61.field50) {
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
                        method559(var5[var8], class2.method2078(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method559(class142.field2302, class2.method2078(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1880 & 0x2) == 2) {
            method559(field485, field363 + " " + class2.field23 + " " + class2.method2078(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("t.bb(Lz;IIIS)V")
    public static final void method149(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field61 == arg0 || field391 >= 400) {
            return;
        }
        String var4;
        if (arg0.field37 == 0) {
            var4 = arg0.field45 + method146(arg0.field50, Statics.field61.field50) + " " + class2.field20 + class142.field2276 + arg0.field50 + class2.field21;
        } else {
            var4 = arg0.field45 + " " + class2.field20 + class142.field2313 + arg0.field37 + class2.field21;
        }
        if (field402 == 1) {
            method559(class142.field2225, field403 + " " + class2.field23 + " " + class2.method2078(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field425) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field378[var5] != null) {
                    short var6 = 0;
                    if (field378[var5].equalsIgnoreCase(class142.field2198)) {
                        if (field277 == class18.field521 || field277 == class18.field518 && arg0.field50 > Statics.field61.field50) {
                            var6 = 2000;
                        }
                        if (Statics.field61.field36 != 0 && arg0.field36 != 0) {
                            if (Statics.field61.field36 == arg0.field36) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field379[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field377[var5] + var6;
                    method559(field378[var5], class2.method2078(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1880 & 0x8) == 8) {
            method559(field485, field363 + " " + class2.field23 + " " + class2.method2078(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field391; var9++) {
            if (field394[var9] == 23) {
                field412[var9] = class2.method2078(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("q.bw(III)Ljava/lang/String;")
    public static final String method146(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2078(16711680);
        } else if (var2 < -6) {
            return class2.method2078(16723968);
        } else if (var2 < -3) {
            return class2.method2078(16740352);
        } else if (var2 < 0) {
            return class2.method2078(16756736);
        } else if (var2 > 9) {
            return class2.method2078(65280);
        } else if (var2 > 6) {
            return class2.method2078(4259584);
        } else if (var2 > 3) {
            return class2.method2078(8453888);
        } else if (var2 > 0) {
            return class2.method2078(12648192);
        } else {
            return class2.method2078(16776960);
        }
    }

    @ObfuscatedName("x.bj(IIIIIIIII)V")
    public static final void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class152.method2777(arg0)) {
            Statics.field507 = null;
            method464(Statics.field2616[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field507 != null) {
                method464(Statics.field507, -1412584499, arg1, arg2, arg3, arg4, Statics.field245, Statics.field2684, arg7);
                Statics.field507 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field453[var8] = true;
            }
        } else {
            field453[arg7] = true;
        }
    }

    @ObfuscatedName("s.cm([Leu;IIIIIIIII)V")
    public static final void method464(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1539(arg2, arg3, arg4, arg5);
        class84.method1856();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class152 var10 = arg0[var9];
            if (var10 != null && (var10.field2540 == arg1 || arg1 == -1412584499 && field421 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field456[field451] = var10.field2534 + arg6;
                    field457[field451] = var10.field2582 + arg7;
                    field458[field451] = var10.field2608;
                    field449[field451] = var10.field2548;
                    var11 = ++field451 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2538 = var11;
                var10.field2645 = field259;
                if (!var10.field2613 || !method838(var10)) {
                    if (var10.field2644 > 0) {
                        int var12 = var10.field2644;
                        if (var12 == 324) {
                            if (field504 == -1) {
                                field504 = var10.field2628;
                                field505 = var10.field2554;
                            }
                            if (field470.field2674) {
                                var10.field2628 = field504;
                            } else {
                                var10.field2628 = field505;
                            }
                        } else if (var12 == 325) {
                            if (field504 == -1) {
                                field504 = var10.field2628;
                                field505 = var10.field2554;
                            }
                            if (field470.field2674) {
                                var10.field2628 = field505;
                            } else {
                                var10.field2628 = field504;
                            }
                        } else if (var12 == 327) {
                            var10.field2528 = 150;
                            var10.field2570 = (int) (Math.sin((double) field259 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2561 = 5;
                            var10.field2562 = 0;
                        } else if (var12 == 328) {
                            var10.field2528 = 150;
                            var10.field2570 = (int) (Math.sin((double) field259 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2561 = 5;
                            var10.field2562 = 1;
                        }
                    }
                    int var13 = var10.field2534 + arg6;
                    int var14 = var10.field2582 + arg7;
                    int var15 = var10.field2551;
                    if (field421 == var10) {
                        if (arg1 != -1412584499 && !var10.field2594) {
                            Statics.field507 = arg0;
                            Statics.field245 = arg6;
                            Statics.field2684 = arg7;
                            continue;
                        }
                        if (field432 && field426) {
                            int var16 = class127.field2023;
                            int var17 = class127.field2017 * 1105708693;
                            int var18 = var16 - field423;
                            int var19 = var17 - field424;
                            if (var18 < field427) {
                                var18 = field427;
                            }
                            if (var10.field2608 + var18 > field427 + field422.field2608) {
                                var18 = field427 + field422.field2608 - var10.field2608;
                            }
                            if (var19 < field428) {
                                var19 = field428;
                            }
                            if (var10.field2548 + var19 > field428 + field422.field2548) {
                                var19 = field428 + field422.field2548 - var10.field2548;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2594) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2566 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2566 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2608 + var13;
                        int var27 = var10.field2548 + var14;
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
                        int var30 = var10.field2608 + var13;
                        int var31 = var10.field2548 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2613 || var20 < var22 && var21 < var23) {
                        if (var10.field2644 != 0) {
                            if (var10.field2644 == 1337) {
                                field279 = var13;
                                field364 = var14;
                                method565(var13, var14, var10.field2608, var10.field2548);
                                class73.method1539(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2644 == 1338) {
                                method460(var13, var14, var11);
                                class73.method1539(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2566 == 0) {
                            if (!var10.field2613 && method838(var10) && Statics.field2119 != var10) {
                                continue;
                            }
                            if (!var10.field2613) {
                                if (var10.field2543 > var10.field2545 - var10.field2548) {
                                    var10.field2543 = var10.field2545 - var10.field2548;
                                }
                                if (var10.field2543 < 0) {
                                    var10.field2543 = 0;
                                }
                            }
                            method464(arg0, var10.field2597, var20, var21, var22, var23, var13 - var10.field2542, var14 - var10.field2543, var11);
                            if (var10.field2637 != null) {
                                method464(var10.field2637, var10.field2597, var20, var21, var22, var23, var13 - var10.field2542, var14 - var10.field2543, var11);
                            }
                            class4 var32 = (class4) field410.method3201((long) var10.field2597);
                            if (var32 != null) {
                                method461(var32.field56, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class73.method1539(arg2, arg3, arg4, arg5);
                            class84.method1856();
                        }
                        if (field375[var11] || field460 > 1) {
                            if (var10.field2566 == 0 && !var10.field2613 && var10.field2545 > var10.field2548) {
                                method2692(var10.field2608 + var13, var14, var10.field2543, var10.field2548, var10.field2545);
                            }
                            if (var10.field2566 != 1) {
                                if (var10.field2566 == 2) {
                                    int var33 = 0;
                                    for (int var34 = 0; var34 < var10.field2548; var34++) {
                                        for (int var35 = 0; var35 < var10.field2608; var35++) {
                                            int var36 = (var10.field2525 + 32) * var35 + var13;
                                            int var37 = (var10.field2583 + 32) * var34 + var14;
                                            if (var33 < 20) {
                                                var36 += var10.field2585[var33];
                                                var37 += var10.field2520[var33];
                                            }
                                            if (var10.field2631[var33] > 0) {
                                                boolean var38 = false;
                                                boolean var39 = false;
                                                int var40 = var10.field2631[var33] - 1;
                                                if (var36 + 32 > arg2 && var36 < arg4 && var37 + 32 > arg3 && var37 < arg5 || Statics.field1874 == var10 && field407 == var33) {
                                                    class72 var41;
                                                    if (field402 == 1 && Statics.field192 == var33 && Statics.field519 == var10.field2597) {
                                                        var41 = class45.method590(var40, var10.field2632[var33], 2, 0, false);
                                                    } else {
                                                        var41 = class45.method590(var40, var10.field2632[var33], 1, 3153952, false);
                                                    }
                                                    if (var41 == null) {
                                                        method2553(var10);
                                                    } else if (Statics.field1874 == var10 && field407 == var33) {
                                                        int var42 = class127.field2023 - field444;
                                                        int var43 = class127.field2017 * 1105708693 - field447;
                                                        if (var42 < 5 && var42 > -5) {
                                                            var42 = 0;
                                                        }
                                                        if (var43 < 5 && var43 > -5) {
                                                            var43 = 0;
                                                        }
                                                        if (field385 < 5) {
                                                            var42 = 0;
                                                            var43 = 0;
                                                        }
                                                        var41.method1520(var36 + var42, var37 + var43, 128);
                                                        if (arg1 != -1) {
                                                            class152 var44 = arg0[arg1 & 0xFFFF];
                                                            if (var37 + var43 < class73.field1310 && var44.field2543 > 0) {
                                                                int var45 = field324 * (class73.field1310 - var37 - var43) / 3;
                                                                if (var45 > field324 * 10) {
                                                                    var45 = field324 * 10;
                                                                }
                                                                if (var45 > var44.field2543) {
                                                                    var45 = var44.field2543;
                                                                }
                                                                var44.field2543 -= var45;
                                                                field447 += var45;
                                                                method2553(var44);
                                                            }
                                                            if (var37 + var43 + 32 > class73.field1311 && var44.field2543 < var44.field2545 - var44.field2548) {
                                                                int var46 = field324 * (var37 + var43 + 32 - class73.field1311) / 3;
                                                                if (var46 > field324 * 10) {
                                                                    var46 = field324 * 10;
                                                                }
                                                                if (var46 > var44.field2545 - var44.field2548 - var44.field2543) {
                                                                    var46 = var44.field2545 - var44.field2548 - var44.field2543;
                                                                }
                                                                var44.field2543 += var46;
                                                                field447 -= var46;
                                                                method2553(var44);
                                                            }
                                                        }
                                                    } else if (Statics.field679 == var10 && field359 == var33) {
                                                        var41.method1520(var36, var37, 128);
                                                    } else {
                                                        var41.method1448(var36, var37);
                                                    }
                                                }
                                            } else if (var10.field2627 != null && var33 < 20) {
                                                class72 var47 = var10.method2861(var33);
                                                if (var47 != null) {
                                                    var47.method1448(var36, var37);
                                                } else if (class152.field2527) {
                                                    method2553(var10);
                                                }
                                            }
                                            var33++;
                                        }
                                    }
                                } else if (var10.field2566 == 3) {
                                    int var48;
                                    if (method2686(var10)) {
                                        var48 = var10.field2624;
                                        if (Statics.field2119 == var10 && var10.field2586 != 0) {
                                            var48 = var10.field2586;
                                        }
                                    } else {
                                        var48 = var10.field2546;
                                        if (Statics.field2119 == var10 && var10.field2598 != 0) {
                                            var48 = var10.field2598;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2550) {
                                            class73.method1590(var13, var14, var10.field2608, var10.field2548, var48);
                                        } else {
                                            class73.method1542(var13, var14, var10.field2608, var10.field2548, var48);
                                        }
                                    } else if (var10.field2550) {
                                        class73.method1567(var13, var14, var10.field2608, var10.field2548, var48, 256 - (var15 & 0xFF));
                                    } else {
                                        class73.method1543(var13, var14, var10.field2608, var10.field2548, var48, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2566 == 4) {
                                    class193 var49 = var10.method2850();
                                    if (var49 != null) {
                                        String var50 = var10.field2576;
                                        int var51;
                                        if (method2686(var10)) {
                                            var51 = var10.field2624;
                                            if (Statics.field2119 == var10 && var10.field2586 != 0) {
                                                var51 = var10.field2586;
                                            }
                                            if (var10.field2602.length() > 0) {
                                                var50 = var10.field2602;
                                            }
                                        } else {
                                            var51 = var10.field2546;
                                            if (Statics.field2119 == var10 && var10.field2598 != 0) {
                                                var51 = var10.field2598;
                                            }
                                        }
                                        if (var10.field2613 && var10.field2633 != -1) {
                                            class45 var52 = class45.method744(var10.field2633);
                                            var50 = var52.field1017;
                                            if (var50 == null) {
                                                var50 = "null";
                                            }
                                            if ((var52.field1024 == 1 || var10.field2533 != 1) && var10.field2533 != -1) {
                                                var50 = class2.method2078(16748608) + var50 + class2.field24 + " " + 'x' + method26(var10.field2533);
                                            }
                                        }
                                        if (field413 == var10) {
                                            class142 var10000 = (class142) null;
                                            var50 = class142.field2248;
                                            var51 = var10.field2546;
                                        }
                                        if (!var10.field2613) {
                                            var50 = method561(var50, var10);
                                        }
                                        var49.method3359(var50, var13, var14, var10.field2608, var10.field2548, var51, var10.field2581 ? 0 : -1, var10.field2621, var10.field2620, var10.field2578);
                                    } else if (class152.field2527) {
                                        method2553(var10);
                                    }
                                } else if (var10.field2566 == 5) {
                                    if (var10.field2613) {
                                        class72 var54;
                                        if (var10.field2633 == -1) {
                                            var54 = var10.method2840(false);
                                        } else {
                                            var54 = class45.method590(var10.field2633, var10.field2533, var10.field2557, var10.field2558, false);
                                        }
                                        if (var54 != null) {
                                            int var55 = var54.field1303;
                                            int var56 = var54.field1301;
                                            if (var10.field2556) {
                                                class73.method1535(var13, var14, var10.field2608 + var13, var10.field2548 + var14);
                                                int var57 = (var10.field2608 + (var55 - 1)) / var55;
                                                int var58 = (var10.field2548 + (var56 - 1)) / var56;
                                                for (int var59 = 0; var59 < var57; var59++) {
                                                    for (int var60 = 0; var60 < var58; var60++) {
                                                        if (var10.field2555 != 0) {
                                                            var54.method1468(var55 / 2 + var55 * var59 + var13, var56 / 2 + var56 * var60 + var14, var10.field2555, 4096);
                                                        } else if (var15 == 0) {
                                                            var54.method1448(var55 * var59 + var13, var56 * var60 + var14);
                                                        } else {
                                                            var54.method1520(var55 * var59 + var13, var56 * var60 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1539(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var61 = var10.field2608 * 4096 / var55;
                                                if (var10.field2555 != 0) {
                                                    var54.method1468(var10.field2608 / 2 + var13, var10.field2548 / 2 + var14, var10.field2555, var61);
                                                } else if (var15 != 0) {
                                                    var54.method1464(var13, var14, var10.field2608, var10.field2548, 256 - (var15 & 0xFF));
                                                } else if (var10.field2608 == var55 && var10.field2548 == var56) {
                                                    var54.method1448(var13, var14);
                                                } else {
                                                    var54.method1458(var13, var14, var10.field2608, var10.field2548);
                                                }
                                            }
                                        } else if (class152.field2527) {
                                            method2553(var10);
                                        }
                                    } else {
                                        class72 var53 = var10.method2840(method2686(var10));
                                        if (var53 != null) {
                                            var53.method1448(var13, var14);
                                        } else if (class152.field2527) {
                                            method2553(var10);
                                        }
                                    }
                                } else if (var10.field2566 == 6) {
                                    boolean var62 = method2686(var10);
                                    int var63;
                                    if (var62) {
                                        var63 = var10.field2573;
                                    } else {
                                        var63 = var10.field2565;
                                    }
                                    class98 var64 = null;
                                    int var65 = 0;
                                    if (var10.field2633 != -1) {
                                        class45 var66 = class45.method744(var10.field2633);
                                        if (var66 != null) {
                                            class45 var67 = var66.method916(var10.field2533);
                                            var64 = var67.method867(1);
                                            if (var64 == null) {
                                                method2553(var10);
                                            } else {
                                                var64.method2003();
                                                var65 = var64.field1351 / 2;
                                            }
                                        }
                                    } else if (var10.field2561 == 5) {
                                        if (var10.field2562 == 0) {
                                            var64 = field470.method2916((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var64 = Statics.field61.method25();
                                        }
                                    } else if (var63 == -1) {
                                        var64 = var10.method2878((class38) null, -1, var62, Statics.field61.field40);
                                        if (var64 == null && class152.field2527) {
                                            method2553(var10);
                                        }
                                    } else {
                                        class38 var68 = class38.method1996(var63);
                                        var64 = var10.method2878(var68, var10.field2635, var62, Statics.field61.field40);
                                        if (var64 == null && class152.field2527) {
                                            method2553(var10);
                                        }
                                    }
                                    class84.method1812(var10.field2608 / 2 + var13, var10.field2548 / 2 + var14);
                                    int var69 = var10.field2636 * class84.field1471[var10.field2528] >> 16;
                                    int var70 = var10.field2636 * class84.field1476[var10.field2528] >> 16;
                                    if (var64 != null) {
                                        if (var10.field2613) {
                                            var64.method2003();
                                            if (var10.field2574) {
                                                var64.method2016(0, var10.field2570, var10.field2571, var10.field2528, var10.field2567, var10.field2568 + var65 + var69, var10.field2568 + var70, var10.field2636);
                                            } else {
                                                var64.method2064(0, var10.field2570, var10.field2571, var10.field2528, var10.field2567, var10.field2568 + var65 + var69, var10.field2568 + var70);
                                            }
                                        } else {
                                            var64.method2064(0, var10.field2570, 0, var10.field2528, 0, var69, var70);
                                        }
                                    }
                                    class84.method1811();
                                } else {
                                    if (var10.field2566 == 7) {
                                        class193 var71 = var10.method2850();
                                        if (var71 == null) {
                                            if (class152.field2527) {
                                                method2553(var10);
                                            }
                                            continue;
                                        }
                                        int var72 = 0;
                                        for (int var73 = 0; var73 < var10.field2548; var73++) {
                                            for (int var74 = 0; var74 < var10.field2608; var74++) {
                                                if (var10.field2631[var72] > 0) {
                                                    class45 var75 = class45.method744(var10.field2631[var72] - 1);
                                                    String var76;
                                                    if (var75.field1024 != 1 && var10.field2632[var72] == 1) {
                                                        var76 = class2.method2078(16748608) + var75.field1017 + class2.field24;
                                                    } else {
                                                        var76 = class2.method2078(16748608) + var75.field1017 + class2.field24 + " " + 'x' + method26(var10.field2632[var72]);
                                                    }
                                                    int var77 = (var10.field2525 + 115) * var74 + var13;
                                                    int var78 = (var10.field2583 + 12) * var73 + var14;
                                                    if (var10.field2621 == 0) {
                                                        var71.method3356(var76, var77, var78, var10.field2546, var10.field2581 ? 0 : -1);
                                                    } else if (var10.field2621 == 1) {
                                                        var71.method3358(var76, var10.field2608 / 2 + var77, var78, var10.field2546, var10.field2581 ? 0 : -1);
                                                    } else {
                                                        var71.method3357(var76, var10.field2608 + var77 - 1, var78, var10.field2546, var10.field2581 ? 0 : -1);
                                                    }
                                                }
                                                var72++;
                                            }
                                        }
                                    }
                                    if (var10.field2566 == 8 && Statics.field827 == var10 && field401 == field400) {
                                        int var79 = 0;
                                        int var80 = 0;
                                        class193 var81 = Statics.field881;
                                        String var82 = var10.field2576;
                                        String var83 = method561(var82, var10);
                                        while (var83.length() > 0) {
                                            int var84 = var83.indexOf(class2.field17);
                                            String var85;
                                            if (var84 == -1) {
                                                var85 = var83;
                                                var83 = "";
                                            } else {
                                                var85 = var83.substring(0, var84);
                                                var83 = var83.substring(var84 + 4);
                                            }
                                            int var86 = var81.method3351(var85);
                                            if (var86 > var79) {
                                                var79 = var86;
                                            }
                                            var80 += var81.field2912 + 1;
                                        }
                                        var79 += 6;
                                        var80 += 7;
                                        int var87 = var10.field2608 + var13 - 5 - var79;
                                        int var88 = var10.field2548 + var14 + 5;
                                        if (var87 < var13 + 5) {
                                            var87 = var13 + 5;
                                        }
                                        if (var79 + var87 > arg4) {
                                            var87 = arg4 - var79;
                                        }
                                        if (var80 + var88 > arg5) {
                                            var88 = arg5 - var80;
                                        }
                                        class73.method1590(var87, var88, var79, var80, 16777120);
                                        class73.method1542(var87, var88, var79, var80, 0);
                                        String var89 = var10.field2576;
                                        int var90 = var81.field2912 + var88 + 2;
                                        String var91 = method561(var89, var10);
                                        while (var91.length() > 0) {
                                            int var92 = var91.indexOf(class2.field17);
                                            String var93;
                                            if (var92 == -1) {
                                                var93 = var91;
                                                var91 = "";
                                            } else {
                                                var93 = var91.substring(0, var92);
                                                var91 = var91.substring(var92 + 4);
                                            }
                                            var81.method3356(var93, var87 + 3, var90, 0, -1);
                                            var90 += var81.field2912 + 1;
                                        }
                                    }
                                    if (var10.field2566 == 9) {
                                        if (var10.field2569 == 1) {
                                            class73.method1548(var13, var14, var10.field2608 + var13, var10.field2548 + var14, var10.field2546);
                                        } else {
                                            int var94 = var10.field2608 >= 0 ? var10.field2608 : -var10.field2608;
                                            int var95 = var10.field2548 >= 0 ? var10.field2548 : -var10.field2548;
                                            int var96 = var94;
                                            if (var94 < var95) {
                                                var96 = var95;
                                            }
                                            if (var96 != 0) {
                                                int var97 = (var10.field2608 << 16) / var96;
                                                int var98 = (var10.field2548 << 16) / var96;
                                                if (var98 <= var97) {
                                                    var97 = -var97;
                                                } else {
                                                    var98 = -var98;
                                                }
                                                int var99 = var10.field2569 * var98 >> 17;
                                                int var100 = var10.field2569 * var98 + 1 >> 17;
                                                int var101 = var10.field2569 * var97 >> 17;
                                                int var102 = var10.field2569 * var97 + 1 >> 17;
                                                int var103 = var13 + var99;
                                                int var104 = var13 - var100;
                                                int var105 = var10.field2608 + var13 - var100;
                                                int var106 = var10.field2608 + var13 + var99;
                                                int var107 = var14 + var101;
                                                int var108 = var14 - var102;
                                                int var109 = var10.field2548 + var14 - var102;
                                                int var110 = var10.field2548 + var14 + var101;
                                                class84.method1817(var103, var104, var105);
                                                class84.method1819(var107, var108, var109, var103, var104, var105, var10.field2546);
                                                class84.method1817(var103, var105, var106);
                                                class84.method1819(var107, var109, var110, var103, var105, var106, var10.field2546);
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

    @ObfuscatedName("ai.cg(Ljava/lang/String;Leu;I)Ljava/lang/String;")
    public static String method561(String arg0, class152 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3145(arg1, var2 - 1);
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
                    var8 = class199.method2451(Statics.field276.field2085);
                    if (Statics.field276.field2083 != null) {
                        var8 = (String) Statics.field276.field2083;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("z.ct(IB)Ljava/lang/String;")
    public static final String method26(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field22 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2078(65408) + var1.substring(0, var1.length() - 8) + class142.field2304 + " " + class2.field20 + var1 + class2.field21 + class2.field24;
        } else if (var1.length() > 6) {
            return " " + class2.method2078(16777215) + var1.substring(0, var1.length() - 4) + class142.field2402 + " " + class2.field20 + var1 + class2.field21 + class2.field24;
        } else {
            return " " + class2.method2078(16776960) + var1 + class2.field24;
        }
    }

    @ObfuscatedName("r.co(Leu;IIIIIIS)V")
    public static final void method159(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field329) {
            field420 = 32;
        } else {
            field420 = 0;
        }
        field329 = false;
        if (class127.field2022 == 1 || !Statics.field2761 && class127.field2022 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2543 -= 4;
                method2553(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2543 += 4;
                method2553(arg0);
            } else if (arg5 >= arg1 - field420 && arg5 < field420 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2543 = (arg4 - arg3) * var8 / var9;
                method2553(arg0);
                field329 = true;
            }
        }
        if (field446 == 0) {
            return;
        }
        int var10 = arg0.field2608;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2543 += field446 * 45;
            method2553(arg0);
        }
    }

    @ObfuscatedName("ev.cs(IIIIII)V")
    public static final void method2692(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1942[0].method1595(arg0, arg1);
        Statics.field1942[1].method1595(arg0, arg1 + arg3 - 16);
        class73.method1590(arg0, arg1 + 16, 16, arg3 - 32, field325);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1590(arg0, arg1 + 16 + var6, 16, var5, field326);
        class73.method1546(arg0, arg1 + 16 + var6, var5, field328);
        class73.method1546(arg0 + 1, arg1 + 16 + var6, var5, field328);
        class73.method1544(arg0, arg1 + 16 + var6, 16, field328);
        class73.method1544(arg0, arg1 + 17 + var6, 16, field328);
        class73.method1546(arg0 + 15, arg1 + 16 + var6, var5, field327);
        class73.method1546(arg0 + 14, arg1 + 17 + var6, var5 - 1, field327);
        class73.method1544(arg0, arg1 + 15 + var6 + var5, 16, field327);
        class73.method1544(arg0 + 1, arg1 + 14 + var6 + var5, 15, field327);
    }

    @ObfuscatedName("es.cf(Leu;B)Z")
    public static final boolean method2686(class152 arg0) {
        if (arg0.field2529 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2529.length; var1++) {
            int var2 = method3145(arg0, var1);
            int var3 = arg0.field2535[var1];
            if (arg0.field2529[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2529[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2529[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fv.cc(Leu;IS)I")
    public static final int method3145(class152 arg0, int arg1) {
        if (arg0.field2625 == null || arg1 >= arg0.field2625.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2625[arg1];
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
                    var7 = field386[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field387[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field466[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class152 var11 = class152.method2801(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method744(var12).field1026 || field254)) {
                        for (int var13 = 0; var13 < var11.field2631.length; var13++) {
                            if (var12 + 1 == var11.field2631[var13]) {
                                var7 += var11.field2632[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class154.field2660[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2142[field387[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class154.field2660[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field61.field50;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2140[var14]) {
                            var7 += field387[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class152 var17 = class152.method2801(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method744(var18).field1026 || field254)) {
                        for (int var19 = 0; var19 < var17.field2631.length; var19++) {
                            if (var18 + 1 == var17.field2631[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field414;
                }
                if (var6 == 12) {
                    var7 = field415;
                }
                if (var6 == 13) {
                    int var20 = class154.field2660[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class154.method2684(var22);
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
                    var7 = (Statics.field61.field777 >> 7) + Statics.field2758;
                }
                if (var6 == 19) {
                    var7 = (Statics.field61.field722 >> 7) + Statics.field1113;
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

    @ObfuscatedName("cn.cb(Leu;III)V")
    public static final void method1901(class152 arg0, int arg1, int arg2) {
        if (arg0.field2549 == 1) {
            method559(arg0.field2630, "", 24, 0, 0, arg0.field2597);
        }
        if (arg0.field2549 == 2 && !field425) {
            String var3 = method716(arg0);
            if (var3 != null) {
                method559(var3, class2.method2078(65280) + arg0.field2629, 25, 0, -1, arg0.field2597);
            }
        }
        if (arg0.field2549 == 3) {
            method559(class142.field2315, "", 26, 0, 0, arg0.field2597);
        }
        if (arg0.field2549 == 4) {
            method559(arg0.field2630, "", 28, 0, 0, arg0.field2597);
        }
        if (arg0.field2549 == 5) {
            method559(arg0.field2630, "", 29, 0, 0, arg0.field2597);
        }
        if (arg0.field2549 == 6 && field413 == null) {
            method559(arg0.field2630, "", 30, 0, -1, arg0.field2597);
        }
        if (arg0.field2566 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2548; var5++) {
                for (int var6 = 0; var6 < arg0.field2608; var6++) {
                    int var7 = (arg0.field2525 + 32) * var6;
                    int var8 = (arg0.field2583 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2585[var4];
                        var8 += arg0.field2520[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field455 = var4;
                        Statics.field59 = arg0;
                        if (arg0.field2631[var4] > 0) {
                            class45 var9 = class45.method744(arg0.field2631[var4] - 1);
                            if (field402 == 1 && class156.method519(method37(arg0))) {
                                if (Statics.field519 != arg0.field2597 || Statics.field192 != var4) {
                                    method559(class142.field2225, field403 + " " + class2.field23 + " " + class2.method2078(16748608) + var9.field1017, 31, var9.field1047, var4, arg0.field2597);
                                }
                            } else if (!field425 || !class156.method519(method37(arg0))) {
                                String[] var10 = var9.field1028;
                                if (field288) {
                                    var10 = method497(var10);
                                }
                                if (class156.method519(method37(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method559(var10[var11], class2.method2078(16748608) + var9.field1017, var12, var9.field1047, var4, arg0.field2597);
                                        } else if (var11 == 4) {
                                            method559(class142.field2158, class2.method2078(16748608) + var9.field1017, 37, var9.field1047, var4, arg0.field2597);
                                        }
                                    }
                                }
                                int var13 = method37(arg0);
                                boolean var14 = (var13 >> 31 & 0x1) != 0;
                                if (var14) {
                                    method559(class142.field2225, class2.method2078(16748608) + var9.field1017, 38, var9.field1047, var4, arg0.field2597);
                                }
                                class156 var10000 = (class156) null;
                                if (class156.method519(method37(arg0)) && var10 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var10[var15] != null) {
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 33;
                                            }
                                            if (var15 == 1) {
                                                var16 = 34;
                                            }
                                            if (var15 == 2) {
                                                var16 = 35;
                                            }
                                            method559(var10[var15], class2.method2078(16748608) + var9.field1017, var16, var9.field1047, var4, arg0.field2597);
                                        }
                                    }
                                }
                                String[] var17 = arg0.field2587;
                                if (field288) {
                                    var17 = method497(var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 39;
                                            }
                                            if (var18 == 1) {
                                                var19 = 40;
                                            }
                                            if (var18 == 2) {
                                                var19 = 41;
                                            }
                                            if (var18 == 3) {
                                                var19 = 42;
                                            }
                                            if (var18 == 4) {
                                                var19 = 43;
                                            }
                                            method559(var17[var18], class2.method2078(16748608) + var9.field1017, var19, var9.field1047, var4, arg0.field2597);
                                        }
                                    }
                                }
                                method559(class142.field2302, class2.method2078(16748608) + var9.field1017, 1005, var9.field1047, var4, arg0.field2597);
                            } else if ((Statics.field1880 & 0x10) == 16) {
                                method559(field485, field363 + " " + class2.field23 + " " + class2.method2078(16748608) + var9.field1017, 32, var9.field1047, var4, arg0.field2597);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2613) {
            return;
        }
        if (!field425) {
            for (int var20 = 9; var20 >= 5; var20--) {
                String var21;
                if (!Statics.method1430(method37(arg0), var20) && arg0.field2553 == null) {
                    var21 = null;
                } else if (arg0.field2590 == null || arg0.field2590.length <= var20 || arg0.field2590[var20] == null || arg0.field2590[var20].trim().length() == 0) {
                    var21 = null;
                } else {
                    var21 = arg0.field2590[var20];
                }
                if (var21 != null) {
                    method559(var21, arg0.field2579, 1007, var20 + 1, arg0.field2530, arg0.field2597);
                }
            }
            String var23 = method716(arg0);
            if (var23 != null) {
                method559(var23, arg0.field2579, 25, 0, arg0.field2530, arg0.field2597);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25;
                if (!Statics.method1430(method37(arg0), var24) && arg0.field2553 == null) {
                    var25 = null;
                } else if (arg0.field2590 == null || arg0.field2590.length <= var24 || arg0.field2590[var24] == null || arg0.field2590[var24].trim().length() == 0) {
                    var25 = null;
                } else {
                    var25 = arg0.field2590[var24];
                }
                if (var25 != null) {
                    method559(var25, arg0.field2579, 57, var24 + 1, arg0.field2530, arg0.field2597);
                }
            }
            if (class156.method522(method37(arg0))) {
                method559(class142.field2162, "", 30, 0, arg0.field2530, arg0.field2597);
            }
        } else if (class156.method459(method37(arg0)) && (Statics.field1880 & 0x20) == 32) {
            method559(field485, field363 + " " + class2.field23 + " " + arg0.field2579, 58, 0, arg0.field2530, arg0.field2597);
        }
    }

    @ObfuscatedName("j.cd([Leu;IIIIIIII)V")
    public static final void method89(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class152 var9 = arg0[var8];
            if (var9 != null && (!var9.field2613 || var9.field2566 == 0 || var9.field2596 || method37(var9) != 0 || field422 == var9) && var9.field2540 == arg1 && (!var9.field2613 || !method838(var9))) {
                int var10 = var9.field2534 + arg6;
                int var11 = var9.field2582 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2566 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2566 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2608 + var10;
                    int var19 = var9.field2548 + var11;
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
                    int var22 = var9.field2608 + var10;
                    int var23 = var9.field2548 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field421 == var9) {
                    field429 = true;
                    field459 = var10;
                    field330 = var11;
                }
                if (!var9.field2613 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2023;
                    int var25 = class127.field2017 * 1105708693;
                    if (class127.field2033 != 0) {
                        var24 = class127.field2027;
                        var25 = class127.field2031;
                    }
                    if (var9.field2644 == 1337) {
                        method2553(var9);
                        if (!field418 && !field495 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field402 == 0 && !field425) {
                                method559(class142.field2269, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            for (int var27 = 0; var27 < class98.field1749; var27++) {
                                int var28 = class98.field1754[var27];
                                int var29 = var28 & 0x7F;
                                int var30 = var28 >> 7 & 0x7F;
                                int var31 = var28 >> 29 & 0x3;
                                int var32 = var28 >> 14 & 0x7FFF;
                                if (var26 != var28) {
                                    var26 = var28;
                                    if (var31 == 2 && Statics.field2004.method1658(Statics.field975, var29, var30, var28) >= 0) {
                                        class36 var33 = class36.method505(var32);
                                        if (var33.field872 != null) {
                                            var33 = var33.method648();
                                        }
                                        if (var33 == null) {
                                            continue;
                                        }
                                        if (field402 == 1) {
                                            method559(class142.field2225, field403 + " " + class2.field23 + " " + class2.method2078(65535) + var33.field838, 1, var28, var29, var30);
                                        } else if (!field425) {
                                            String[] var34 = var33.field858;
                                            if (field288) {
                                                var34 = method497(var34);
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
                                                        method559(var34[var35], class2.method2078(65535) + var33.field838, var36, var28, var29, var30);
                                                    }
                                                }
                                            }
                                            method559(class142.field2302, class2.method2078(65535) + var33.field838, 1002, var33.field866 << 14, var29, var30);
                                        } else if ((Statics.field1880 & 0x4) == 4) {
                                            method559(field485, field363 + " " + class2.field23 + " " + class2.method2078(65535) + var33.field838, 2, var28, var29, var30);
                                        }
                                    }
                                    if (var31 == 1) {
                                        class30 var37 = field287[var32];
                                        if (var37 == null) {
                                            continue;
                                        }
                                        if (var37.field696.field800 == 1 && (var37.field777 & 0x7F) == 64 && (var37.field722 & 0x7F) == 64) {
                                            for (int var38 = 0; var38 < field293; var38++) {
                                                class30 var39 = field287[field289[var38]];
                                                if (var39 != null && var37 != var39 && var39.field696.field800 == 1 && var37.field777 == var39.field777 && var37.field722 == var39.field722) {
                                                    method768(var39.field696, field289[var38], var29, var30);
                                                }
                                            }
                                            for (int var40 = 0; var40 < field337; var40++) {
                                                class3 var41 = field433[field369[var40]];
                                                if (var41 != null && var37.field777 == var41.field777 && var37.field722 == var41.field722) {
                                                    method149(var41, field369[var40], var29, var30);
                                                }
                                            }
                                        }
                                        method768(var37.field696, var32, var29, var30);
                                    }
                                    if (var31 == 0) {
                                        class3 var42 = field433[var32];
                                        if (var42 == null) {
                                            continue;
                                        }
                                        if ((var42.field777 & 0x7F) == 64 && (var42.field722 & 0x7F) == 64) {
                                            for (int var43 = 0; var43 < field293; var43++) {
                                                class30 var44 = field287[field289[var43]];
                                                if (var44 != null && var44.field696.field800 == 1 && var42.field777 == var44.field777 && var42.field722 == var44.field722) {
                                                    method768(var44.field696, field289[var43], var29, var30);
                                                }
                                            }
                                            for (int var45 = 0; var45 < field337; var45++) {
                                                class3 var46 = field433[field369[var45]];
                                                if (var46 != null && var42 != var46 && var42.field777 == var46.field777 && var42.field722 == var46.field722) {
                                                    method149(var46, field369[var45], var29, var30);
                                                }
                                            }
                                        }
                                        method149(var42, var32, var29, var30);
                                    }
                                    if (var31 == 3) {
                                        class177 var47 = field384[Statics.field975][var29][var30];
                                        if (var47 != null) {
                                            for (class25 var48 = (class25) var47.method3230(); var48 != null; var48 = (class25) var47.method3240()) {
                                                class45 var49 = class45.method744(var48.field613);
                                                if (field402 == 1) {
                                                    method559(class142.field2225, field403 + " " + class2.field23 + " " + class2.method2078(16748608) + var49.field1017, 16, var48.field613, var29, var30);
                                                } else if (!field425) {
                                                    String[] var50 = var49.field1027;
                                                    if (field288) {
                                                        var50 = method497(var50);
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
                                                            method559(var50[var51], class2.method2078(16748608) + var49.field1017, var52, var48.field613, var29, var30);
                                                        } else if (var51 == 2) {
                                                            method559(class142.field2177, class2.method2078(16748608) + var49.field1017, 20, var48.field613, var29, var30);
                                                        }
                                                    }
                                                    method559(class142.field2302, class2.method2078(16748608) + var49.field1017, 1004, var48.field613, var29, var30);
                                                } else if ((Statics.field1880 & 0x1) == 1) {
                                                    method559(field485, field363 + " " + class2.field23 + " " + class2.method2078(16748608) + var49.field1017, 17, var48.field613, var29, var30);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var9.field2644 == 1338) {
                        method119(var10, var11);
                    } else {
                        if (!field495 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1901(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2566 == 0) {
                            if (!var9.field2613 && method838(var9) && Statics.field2119 != var9) {
                                continue;
                            }
                            method89(arg0, var9.field2597, var12, var13, var14, var15, var10 - var9.field2542, var11 - var9.field2543);
                            if (var9.field2637 != null) {
                                method89(var9.field2637, var9.field2597, var12, var13, var14, var15, var10 - var9.field2542, var11 - var9.field2543);
                            }
                            class4 var53 = (class4) field410.method3201((long) var9.field2597);
                            if (var53 != null) {
                                if (var53.field55 == 0 && class127.field2023 >= var12 && class127.field2017 * 1105708693 >= var13 && class127.field2023 < var14 && class127.field2017 * 1105708693 < var15 && !field495 && !field419) {
                                    field396[0] = class142.field2262;
                                    field412[0] = "";
                                    field394[0] = 1006;
                                    field391 = 1;
                                }
                                int var54 = var53.field56;
                                if (class152.method2777(var54)) {
                                    method89(Statics.field2616[var54], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2613) {
                            if (var9.field2584 && class127.field2023 >= var12 && class127.field2017 * 1105708693 >= var13 && class127.field2023 < var14 && class127.field2017 * 1105708693 < var15) {
                                for (class1 var55 = (class1) field281.method3237(); var55 != null; var55 = (class1) field281.method3239()) {
                                    if (var55.field2) {
                                        var55.method3322();
                                        var55.field10.field2638 = false;
                                    }
                                }
                                if (Statics.field1279 == 0) {
                                    field421 = null;
                                    field422 = null;
                                }
                                if (!field495) {
                                    field396[0] = class142.field2262;
                                    field412[0] = "";
                                    field394[0] = 1006;
                                    field391 = 1;
                                }
                            }
                            boolean var56;
                            if (class127.field2023 >= var12 && class127.field2017 * 1105708693 >= var13 && class127.field2023 < var14 && class127.field2017 * 1105708693 < var15) {
                                var56 = true;
                            } else {
                                var56 = false;
                            }
                            boolean var57 = false;
                            if ((class127.field2022 == 1 || !Statics.field2761 && class127.field2022 == 4) && var56) {
                                var57 = true;
                            }
                            boolean var58 = false;
                            if ((class127.field2033 == 1 || !Statics.field2761 && class127.field2033 == 4) && class127.field2027 >= var12 && class127.field2031 >= var13 && class127.field2027 < var14 && class127.field2031 < var15) {
                                var58 = true;
                            }
                            if (var58) {
                                method2372(var9, class127.field2027 - var10, class127.field2031 - var11);
                            }
                            if (field421 != null && field421 != var9 && var56) {
                                int var59 = method37(var9);
                                boolean var60 = (var59 >> 20 & 0x1) != 0;
                                if (var60) {
                                    field362 = var9;
                                }
                            }
                            if (field422 == var9) {
                                field426 = true;
                                field427 = var10;
                                field428 = var11;
                            }
                            if (var9.field2596) {
                                if (var56 && field446 != 0 && var9.field2617 != null) {
                                    class1 var61 = new class1();
                                    var61.field2 = true;
                                    var61.field10 = var9;
                                    var61.field5 = field446;
                                    var61.field4 = var9.field2617;
                                    field281.method3232(var61);
                                }
                                if (field421 != null || Statics.field1874 != null || field495) {
                                    var58 = false;
                                    var57 = false;
                                    var56 = false;
                                }
                                if (!var9.field2639 && var58) {
                                    var9.field2639 = true;
                                    if (var9.field2552 != null) {
                                        class1 var62 = new class1();
                                        var62.field2 = true;
                                        var62.field10 = var9;
                                        var62.field3 = class127.field2027 - var10;
                                        var62.field5 = class127.field2031 - var11;
                                        var62.field4 = var9.field2552;
                                        field281.method3232(var62);
                                    }
                                }
                                if (var9.field2639 && var57 && var9.field2599 != null) {
                                    class1 var63 = new class1();
                                    var63.field2 = true;
                                    var63.field10 = var9;
                                    var63.field3 = class127.field2023 - var10;
                                    var63.field5 = class127.field2017 * 1105708693 - var11;
                                    var63.field4 = var9.field2599;
                                    field281.method3232(var63);
                                }
                                if (var9.field2639 && !var57) {
                                    var9.field2639 = false;
                                    if (var9.field2600 != null) {
                                        class1 var64 = new class1();
                                        var64.field2 = true;
                                        var64.field10 = var9;
                                        var64.field3 = class127.field2023 - var10;
                                        var64.field5 = class127.field2017 * 1105708693 - var11;
                                        var64.field4 = var9.field2600;
                                        field370.method3232(var64);
                                    }
                                }
                                if (var57 && var9.field2601 != null) {
                                    class1 var65 = new class1();
                                    var65.field2 = true;
                                    var65.field10 = var9;
                                    var65.field3 = class127.field2023 - var10;
                                    var65.field5 = class127.field2017 * 1105708693 - var11;
                                    var65.field4 = var9.field2601;
                                    field281.method3232(var65);
                                }
                                if (!var9.field2638 && var56) {
                                    var9.field2638 = true;
                                    if (var9.field2560 != null) {
                                        class1 var66 = new class1();
                                        var66.field2 = true;
                                        var66.field10 = var9;
                                        var66.field3 = class127.field2023 - var10;
                                        var66.field5 = class127.field2017 * 1105708693 - var11;
                                        var66.field4 = var9.field2560;
                                        field281.method3232(var66);
                                    }
                                }
                                if (var9.field2638 && var56 && var9.field2603 != null) {
                                    class1 var67 = new class1();
                                    var67.field2 = true;
                                    var67.field10 = var9;
                                    var67.field3 = class127.field2023 - var10;
                                    var67.field5 = class127.field2017 * 1105708693 - var11;
                                    var67.field4 = var9.field2603;
                                    field281.method3232(var67);
                                }
                                if (var9.field2638 && !var56) {
                                    var9.field2638 = false;
                                    if (var9.field2634 != null) {
                                        class1 var68 = new class1();
                                        var68.field2 = true;
                                        var68.field10 = var9;
                                        var68.field3 = class127.field2023 - var10;
                                        var68.field5 = class127.field2017 * 1105708693 - var11;
                                        var68.field4 = var9.field2634;
                                        field370.method3232(var68);
                                    }
                                }
                                if (var9.field2615 != null) {
                                    class1 var69 = new class1();
                                    var69.field10 = var9;
                                    var69.field4 = var9.field2615;
                                    field448.method3232(var69);
                                }
                                if (var9.field2609 != null && field435 > var9.field2641) {
                                    if (var9.field2610 == null || field435 - var9.field2641 > 32) {
                                        class1 var74 = new class1();
                                        var74.field10 = var9;
                                        var74.field4 = var9.field2609;
                                        field281.method3232(var74);
                                    } else {
                                        label738: for (int var70 = var9.field2641; var70 < field435; var70++) {
                                            int var71 = field461[var70 & 0x1F];
                                            for (int var72 = 0; var72 < var9.field2610.length; var72++) {
                                                if (var9.field2610[var72] == var71) {
                                                    class1 var73 = new class1();
                                                    var73.field10 = var9;
                                                    var73.field4 = var9.field2609;
                                                    field281.method3232(var73);
                                                    break label738;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2641 = field435;
                                }
                                if (var9.field2611 != null && field437 > var9.field2577) {
                                    if (var9.field2612 == null || field437 - var9.field2577 > 32) {
                                        class1 var79 = new class1();
                                        var79.field10 = var9;
                                        var79.field4 = var9.field2611;
                                        field281.method3232(var79);
                                    } else {
                                        label714: for (int var75 = var9.field2577; var75 < field437; var75++) {
                                            int var76 = field436[var75 & 0x1F];
                                            for (int var77 = 0; var77 < var9.field2612.length; var77++) {
                                                if (var9.field2612[var77] == var76) {
                                                    class1 var78 = new class1();
                                                    var78.field10 = var9;
                                                    var78.field4 = var9.field2611;
                                                    field281.method3232(var78);
                                                    break label714;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2577 = field437;
                                }
                                if (var9.field2626 != null && field296 > var9.field2643) {
                                    if (var9.field2614 == null || field296 - var9.field2643 > 32) {
                                        class1 var84 = new class1();
                                        var84.field10 = var9;
                                        var84.field4 = var9.field2626;
                                        field281.method3232(var84);
                                    } else {
                                        label690: for (int var80 = var9.field2643; var80 < field296; var80++) {
                                            int var81 = field331[var80 & 0x1F];
                                            for (int var82 = 0; var82 < var9.field2614.length; var82++) {
                                                if (var9.field2614[var82] == var81) {
                                                    class1 var83 = new class1();
                                                    var83.field10 = var9;
                                                    var83.field4 = var9.field2626;
                                                    field281.method3232(var83);
                                                    break label690;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2643 = field296;
                                }
                                if (field440 > var9.field2532 && var9.field2539 != null) {
                                    class1 var85 = new class1();
                                    var85.field10 = var9;
                                    var85.field4 = var9.field2539;
                                    field281.method3232(var85);
                                }
                                if (field441 > var9.field2532 && var9.field2580 != null) {
                                    class1 var86 = new class1();
                                    var86.field10 = var9;
                                    var86.field4 = var9.field2580;
                                    field281.method3232(var86);
                                }
                                if (field442 > var9.field2532 && var9.field2572 != null) {
                                    class1 var87 = new class1();
                                    var87.field10 = var9;
                                    var87.field4 = var9.field2572;
                                    field281.method3232(var87);
                                }
                                if (field443 > var9.field2532 && var9.field2622 != null) {
                                    class1 var88 = new class1();
                                    var88.field10 = var9;
                                    var88.field4 = var9.field2622;
                                    field281.method3232(var88);
                                }
                                var9.field2532 = field275;
                                if (var9.field2547 != null) {
                                    for (int var89 = 0; var89 < field406; var89++) {
                                        class1 var90 = new class1();
                                        var90.field10 = var9;
                                        var90.field12 = field468[var89];
                                        var90.field9 = field467[var89];
                                        var90.field4 = var9.field2547;
                                        field281.method3232(var90);
                                    }
                                }
                            }
                        }
                        if (!var9.field2613 && field421 == null && Statics.field1874 == null && !field495) {
                            if ((var9.field2604 >= 0 || var9.field2598 != 0) && class127.field2023 >= var12 && class127.field2017 * 1105708693 >= var13 && class127.field2023 < var14 && class127.field2017 * 1105708693 < var15) {
                                if (var9.field2604 >= 0) {
                                    Statics.field2119 = arg0[var9.field2604];
                                } else {
                                    Statics.field2119 = var9;
                                }
                            }
                            if (var9.field2566 == 8 && class127.field2023 >= var12 && class127.field2017 * 1105708693 >= var13 && class127.field2023 < var14 && class127.field2017 * 1105708693 < var15) {
                                Statics.field827 = var9;
                            }
                            if (var9.field2545 > var9.field2548) {
                                method159(var9, var9.field2608 + var10, var11, var9.field2548, var9.field2545, class127.field2023, class127.field2017 * 1105708693);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("co.cz([Leu;II)V")
    public static final void method1805(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2566 == 0) {
                    if (var3.field2637 != null) {
                        method1805(var3.field2637, arg1);
                    }
                    class4 var4 = (class4) field410.method3201((long) var3.field2597);
                    if (var4 != null) {
                        int var5 = var4.field56;
                        if (class152.method2777(var5)) {
                            method1805(Statics.field2616[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2623 != null) {
                    class1 var6 = new class1();
                    var6.field10 = var3;
                    var6.field4 = var3.field2623;
                    class32.method120(var6);
                }
                if (arg1 == 1 && var3.field2640 != null) {
                    if (var3.field2530 >= 0) {
                        class152 var7 = class152.method2801(var3.field2597);
                        if (var7 == null || var7.field2637 == null || var3.field2530 >= var7.field2637.length || var7.field2637[var3.field2530] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field10 = var3;
                    var8.field4 = var3.field2640;
                    class32.method120(var8);
                }
            }
        }
    }

    @ObfuscatedName("dj.cq(Leu;IIB)V")
    public static final void method2372(class152 arg0, int arg1, int arg2) {
        if (field421 != null || field495 || arg0 == null) {
            return;
        }
        class152 var3 = arg0;
        int var4 = class156.method2831(method37(arg0));
        class152 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class152.method2801(var3.field2540);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class152 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2591;
        }
        if (var7 == null) {
            return;
        }
        field421 = arg0;
        class152 var9 = arg0;
        int var10 = class156.method2831(method37(arg0));
        class152 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class152.method2801(var9.field2540);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class152 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2591;
        }
        field422 = var13;
        field423 = arg1;
        field424 = arg2;
        Statics.field1279 = 0;
        field432 = false;
        if (field391 > 0) {
            method1984(field391 - 1);
        }
        return;
    }

    @ObfuscatedName("dd.cr(B)V")
    public static final void method2407() {
        method2553(field421);
        Statics.field1279++;
        if (field429 && field426) {
            int var0 = class127.field2023;
            int var1 = class127.field2017 * 1105708693;
            int var2 = var0 - field423;
            int var3 = var1 - field424;
            if (var2 < field427) {
                var2 = field427;
            }
            if (field421.field2608 + var2 > field427 + field422.field2608) {
                var2 = field427 + field422.field2608 - field421.field2608;
            }
            if (var3 < field428) {
                var3 = field428;
            }
            if (field421.field2548 + var3 > field428 + field422.field2548) {
                var3 = field428 + field422.field2548 - field421.field2548;
            }
            int var4 = var2 - field459;
            int var5 = var3 - field330;
            int var6 = field421.field2592;
            if (Statics.field1279 > field421.field2593 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field432 = true;
            }
            int var7 = field422.field2542 + (var2 - field427);
            int var8 = field422.field2543 + (var3 - field428);
            if (field421.field2605 != null && field432) {
                class1 var9 = new class1();
                var9.field10 = field421;
                var9.field3 = var7;
                var9.field5 = var8;
                var9.field4 = field421.field2605;
                class32.method120(var9);
            }
            if (class127.field2022 == 0) {
                if (field432) {
                    if (field421.field2606 != null) {
                        class1 var10 = new class1();
                        var10.field10 = field421;
                        var10.field3 = var7;
                        var10.field5 = var8;
                        var10.field7 = field362;
                        var10.field4 = field421.field2606;
                        class32.method120(var10);
                    }
                    if (field362 != null) {
                        class152 var11 = field421;
                        int var12 = class156.method2831(method37(var11));
                        class152 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class152.method2801(var11.field2540);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field290.method2354(63);
                            field290.method2170(field421.field2633);
                            field290.method2170(field362.field2530);
                            field290.method2170(field362.field2633);
                            field290.method2277(field421.field2597);
                            field290.method2267(field362.field2597);
                            field290.method2170(field421.field2530);
                        }
                    }
                } else if ((field309 == 1 || method38(field391 - 1)) && field391 > 2) {
                    method2664(field459 + field423, field424 + field330);
                } else if (field391 > 0) {
                    method451(field459 + field423, field424 + field330);
                }
                field421 = null;
            }
        } else if (Statics.field1279 > 1) {
            field421 = null;
        }
    }

    @ObfuscatedName("ch.cn(II)V")
    public static void method1984(int arg0) {
        Statics.field2768 = new class27();
        Statics.field2768.field636 = field392[arg0];
        Statics.field2768.field631 = field393[arg0];
        Statics.field2768.field633 = field394[arg0];
        Statics.field2768.field635 = field395[arg0];
        Statics.field2768.field634 = field396[arg0];
    }

    @ObfuscatedName("client.cv(III)V")
    public static void method451(int arg0, int arg1) {
        method1091(Statics.field2768, arg0, arg1);
        Statics.field2768 = null;
    }

    @ObfuscatedName("dh.ch(Leu;I)V")
    public static void method2553(class152 arg0) {
        if (field398 == arg0.field2645) {
            field453[arg0.field2538] = true;
        }
    }

    @ObfuscatedName("client.ci(I)V")
    public static void method453() {
        for (class4 var0 = (class4) field410.method3204(); var0 != null; var0 = (class4) field410.method3203()) {
            int var1 = var0.field56;
            if (class152.method2777(var1)) {
                boolean var2 = true;
                class152[] var3 = Statics.field2616[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2613;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2875;
                    class152 var6 = class152.method2801(var5);
                    if (var6 != null) {
                        method2553(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.cl([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method497(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("y.cx(II)V")
    public static final void method130(int arg0) {
        if (!class152.method2777(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2616[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3 != null) {
                var3.field2635 = 0;
                var3.field2563 = 0;
            }
        }
    }

    @ObfuscatedName("v.ce([Leu;II)V")
    public static final void method4(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null && var3.field2540 == arg1 && (!var3.field2613 || !method838(var3))) {
                if (var3.field2566 == 0) {
                    if (!var3.field2613 && method838(var3) && Statics.field2119 != var3) {
                        continue;
                    }
                    method4(arg0, var3.field2597);
                    if (var3.field2637 != null) {
                        method4(var3.field2637, var3.field2597);
                    }
                    class4 var4 = (class4) field410.method3201((long) var3.field2597);
                    if (var4 != null) {
                        int var5 = var4.field56;
                        if (class152.method2777(var5)) {
                            method4(Statics.field2616[var5], -1);
                        }
                    }
                }
                if (var3.field2566 == 6) {
                    if (var3.field2565 != -1 || var3.field2573 != -1) {
                        boolean var6 = method2686(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2573;
                        } else {
                            var7 = var3.field2565;
                        }
                        if (var7 != -1) {
                            class38 var8 = class38.method1996(var7);
                            var3.field2563 += field324;
                            while (var3.field2563 > var8.field903[var3.field2635]) {
                                var3.field2563 -= var8.field903[var3.field2635];
                                var3.field2635++;
                                if (var3.field2635 >= var8.field901.length) {
                                    var3.field2635 -= var8.field905;
                                    if (var3.field2635 < 0 || var3.field2635 >= var8.field901.length) {
                                        var3.field2635 = 0;
                                    }
                                }
                                method2553(var3);
                            }
                        }
                    }
                    if (var3.field2618 != 0 && !var3.field2613) {
                        int var9 = var3.field2618 >> 16;
                        int var10 = var3.field2618 << 16 >> 16;
                        int var11 = field324 * var9;
                        int var12 = field324 * var10;
                        var3.field2528 = var3.field2528 + var11 & 0x7FF;
                        var3.field2570 = var3.field2570 + var12 & 0x7FF;
                        method2553(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ep.cp(IB)V")
    public static final void method2676(int arg0) {
        method453();
        class20.method502();
        int var1 = class46.method769(arg0).field1056;
        if (var1 == 0) {
            return;
        }
        int var2 = class154.field2660[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class84.method1862(0.9D);
                ((class88) Statics.field1462).method1882(0.9D);
            }
            if (var2 == 2) {
                class84.method1862(0.8D);
                ((class88) Statics.field1462).method1882(0.8D);
            }
            if (var2 == 3) {
                class84.method1862(0.7D);
                ((class88) Statics.field1462).method1882(0.7D);
            }
            if (var2 == 4) {
                class84.method1862(0.6D);
                ((class88) Statics.field1462).method1882(0.6D);
            }
            class45.field1009.method3176();
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
            if (field417 != var3) {
                if (field417 == 0 && field481 != -1) {
                    class161.method1985(Statics.field224, field481, 0, var3, false);
                    field482 = false;
                } else if (var3 == 0) {
                    Statics.field64.method3041();
                    class161.field2712 = 1;
                    Statics.field2647 = null;
                    field482 = false;
                } else if (class161.field2712 == 0) {
                    Statics.field64.method3068(var3);
                } else {
                    Statics.field1821 = var3;
                }
                field417 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field356 = 127;
            }
            if (var2 == 1) {
                field356 = 96;
            }
            if (var2 == 2) {
                field356 = 64;
            }
            if (var2 == 3) {
                field356 = 32;
            }
            if (var2 == 4) {
                field356 = 0;
            }
        }
        if (var1 == 5) {
            field309 = var2;
        }
        if (var1 == 6) {
            field411 = var2;
        }
        if (var1 == 9) {
            field274 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field484 = 127;
            }
            if (var2 == 1) {
                field484 = 96;
            }
            if (var2 == 2) {
                field484 = 64;
            }
            if (var2 == 3) {
                field484 = 32;
            }
            if (var2 == 4) {
                field484 = 0;
            }
        }
        if (var1 == 17) {
            field333 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class18[] var4 = new class18[] { class18.field514, class18.field518, class18.field521 };
            class18[] var5 = var4;
            int var6 = 0;
            class18 var8;
            while (true) {
                if (var6 >= var5.length) {
                    var8 = null;
                    break;
                }
                class18 var7 = var5[var6];
                if (var2 == var7.method455()) {
                    var8 = var7;
                    break;
                }
                var6++;
            }
            field277 = (class18) var8;
            if (field277 == null) {
                field277 = class18.field518;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field381 = -1;
        } else {
            field381 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("p.ca(I)V")
    public static final void method134() {
        field290.method2354(132);
        for (class4 var0 = (class4) field410.method3204(); var0 != null; var0 = (class4) field410.method3203()) {
            if (var0.field55 == 0 || var0.field55 == 3) {
                method34(var0, true);
            }
        }
        if (field413 != null) {
            method2553(field413);
            field413 = null;
        }
    }

    @ObfuscatedName("h.cu(Lh;ZS)V")
    public static final void method34(class4 arg0, boolean arg1) {
        int var2 = arg0.field56;
        int var3 = (int) arg0.field2875;
        arg0.method3322();
        if (arg1) {
            class152.method582(var2);
        }
        method2079(var2);
        class152 var4 = class152.method2801(var3);
        if (var4 != null) {
            method2553(var4);
        }
        method2665();
        if (field409 != -1) {
            Statics.method2346(field409, 1);
        }
    }

    @ObfuscatedName("eq.cy(Leu;I)Z")
    public static final boolean method2830(class152 arg0) {
        int var1 = arg0.field2644;
        if (var1 == 205) {
            field297 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field470.method2912(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field470.method2938(var4, var5 == 1);
        }
        if (var1 == 324) {
            field470.method2913(false);
        }
        if (var1 == 325) {
            field470.method2913(true);
        }
        if (var1 == 326) {
            field290.method2354(246);
            field470.method2914(field290);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("x.cj(IIIS)V")
    public static final void method460(int arg0, int arg1, int arg2) {
        method150();
        class73.method1539(arg0, arg1, Statics.field1893.field1316 + arg0, Statics.field1893.field1317 + arg1);
        if (field479 == 2 || field479 == 5) {
            class73.method1549(arg0 + 25, arg1 + 5, 0, Statics.field962, Statics.field1058);
        } else {
            int var3 = field319 + field315 & 0x7FF;
            int var4 = Statics.field61.field777 / 32 + 48;
            int var5 = 464 - Statics.field61.field722 / 32;
            Statics.field2411.method1457(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field501 + 256, Statics.field962, Statics.field1058);
            for (int var6 = 0; var6 < field503; var6++) {
                int var7 = field474[var6] * 4 + 2 - Statics.field61.field777 / 32;
                int var8 = field475[var6] * 4 + 2 - Statics.field61.field722 / 32;
                method1395(arg0, arg1, var7, var8, field476[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field384[Statics.field975][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field61.field777 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field61.field722 / 32;
                        method1395(arg0, arg1, var12, var13, Statics.field1348[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field293; var14++) {
                class30 var15 = field287[field289[var14]];
                if (var15 != null && var15.method15()) {
                    class35 var16 = var15.field696;
                    if (var16 != null && var16.field819 != null) {
                        var16 = var16.method618();
                    }
                    if (var16 != null && var16.field810 && var16.field822) {
                        int var17 = var15.field777 / 32 - Statics.field61.field777 / 32;
                        int var18 = var15.field722 / 32 - Statics.field61.field722 / 32;
                        method1395(arg0, arg1, var17, var18, Statics.field1348[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field337; var19++) {
                class3 var20 = field433[field369[var19]];
                if (var20 != null && var20.method15() && !var20.field51) {
                    int var21 = var20.field777 / 32 - Statics.field61.field777 / 32;
                    int var22 = var20.field722 / 32 - Statics.field61.field722 / 32;
                    boolean var23 = false;
                    if (Statics.method1896(var20.field45, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field1822; var25++) {
                        if (var20.field45.equals(Statics.field526[var25].field561)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field61.field36 != 0 && var20.field36 != 0 && Statics.field61.field36 == var20.field36) {
                        var26 = true;
                    }
                    if (var23) {
                        method1395(arg0, arg1, var21, var22, Statics.field1348[3]);
                    } else if (var26) {
                        method1395(arg0, arg1, var21, var22, Statics.field1348[4]);
                    } else if (var24) {
                        method1395(arg0, arg1, var21, var22, Statics.field1348[5]);
                    } else {
                        method1395(arg0, arg1, var21, var22, Statics.field1348[2]);
                    }
                }
            }
            if (field267 != 0 && field259 % 20 < 10) {
                if (field267 == 1 && field268 >= 0 && field268 < field287.length) {
                    class30 var27 = field287[field268];
                    if (var27 != null) {
                        int var28 = var27.field777 / 32 - Statics.field61.field777 / 32;
                        int var29 = var27.field722 / 32 - Statics.field61.field722 / 32;
                        method920(arg0, arg1, var28, var29, Statics.field2011[1]);
                    }
                }
                if (field267 == 2) {
                    int var30 = field270 * 4 - Statics.field2758 * 4 + 2 - Statics.field61.field777 / 32;
                    int var31 = field271 * 4 - Statics.field1113 * 4 + 2 - Statics.field61.field722 / 32;
                    method920(arg0, arg1, var30, var31, Statics.field2011[1]);
                }
                if (field267 == 10 && field339 >= 0 && field339 < field433.length) {
                    class3 var32 = field433[field339];
                    if (var32 != null) {
                        int var33 = var32.field777 / 32 - Statics.field61.field777 / 32;
                        int var34 = var32.field722 / 32 - Statics.field61.field722 / 32;
                        method920(arg0, arg1, var33, var34, Statics.field2011[1]);
                    }
                }
            }
            if (field477 != 0) {
                int var35 = field477 * 4 + 2 - Statics.field61.field777 / 32;
                int var36 = field438 * 4 + 2 - Statics.field61.field722 / 32;
                method1395(arg0, arg1, var35, var36, Statics.field2011[0]);
            }
            if (!Statics.field61.field51) {
                class73.method1590(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field479 < 3) {
            Statics.field1894.method1457(arg0, arg1, 33, 33, 25, 25, field315, 256, Statics.field134, Statics.field606);
        } else {
            class73.method1549(arg0, arg1, 0, Statics.field134, Statics.field606);
        }
        if (field375[arg2]) {
            Statics.field1893.method1595(arg0, arg1);
        }
        field454[arg2] = true;
    }

    @ObfuscatedName("aj.cw(IIIILbk;B)V")
    public static final void method920(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1395(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field319 + field315 & 0x7FF;
        int var7 = class84.field1471[var6];
        int var8 = class84.field1476[var6];
        int var9 = var7 * 256 / (field501 + 256);
        int var10 = var8 * 256 / (field501 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field949.method1467(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("bf.dy(IIIILbk;I)V")
    public static final void method1395(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field319 + field315 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1471[var5];
        int var8 = class84.field1476[var5];
        int var9 = var7 * 256 / (field501 + 256);
        int var10 = var8 * 256 / (field501 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1480(Statics.field1893, arg0 + 94 + var11 - arg4.field1303 / 2 + 4, arg1 + 83 - var12 - arg4.field1301 / 2 - 4);
        } else {
            arg4.method1448(arg0 + 94 + var11 - arg4.field1303 / 2 + 4, arg1 + 83 - var12 - arg4.field1301 / 2 - 4);
        }
    }

    @ObfuscatedName("cd.dm(Ljava/lang/String;I)Z")
    public static boolean method1875(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class200.method35(arg0, Statics.field883);
        for (int var2 = 0; var2 < field473; var2++) {
            class8 var3 = field502[var2];
            if (var1.equalsIgnoreCase(class200.method35(var3.field132, Statics.field883))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class200.method35(var3.field124, Statics.field883))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bf.do(Ljava/lang/String;ZI)V")
    public static final void method1363(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field473 < 100 || field302 == 1) || field473 >= 400) {
            Statics.method1994(31, "", class142.field2270);
            return;
        }
        String var2 = class200.method35(arg0, Statics.field883);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field473; var3++) {
            class8 var4 = field502[var3];
            String var5 = class200.method35(var4.field132, Statics.field883);
            if (var5 != null && var5.equals(var2)) {
                Statics.method1994(31, "", arg0 + class142.field2325);
                return;
            }
            if (var4.field124 != null) {
                String var6 = class200.method35(var4.field124, Statics.field883);
                if (var6 != null && var6.equals(var2)) {
                    Statics.method1994(31, "", arg0 + class142.field2325);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field497; var7++) {
            class16 var8 = field499[var7];
            String var9 = class200.method35(var8.field227, Statics.field883);
            if (var9 != null && var9.equals(var2)) {
                Statics.method1994(31, "", class142.field2231 + arg0 + class142.field2331);
                return;
            }
            if (var8.field219 != null) {
                String var10 = class200.method35(var8.field219, Statics.field883);
                if (var10 != null && var10.equals(var2)) {
                    Statics.method1994(31, "", class142.field2231 + arg0 + class142.field2331);
                    return;
                }
            }
        }
        if (class200.method35(Statics.field61.field45, Statics.field883).equals(var2)) {
            Statics.method1994(31, "", class142.field2312);
        } else {
            field290.method2354(222);
            field290.method2126(class107.method859(arg0));
            field290.method2257(arg0);
        }
    }

    @ObfuscatedName("z.dq(Ljava/lang/String;I)V")
    public static final void method16(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class200.method35(arg0, Statics.field883);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field497; var2++) {
            class16 var3 = field499[var2];
            String var4 = var3.field227;
            String var5 = class200.method35(var4, Statics.field883);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field497--;
                for (int var7 = var2; var7 < field497; var7++) {
                    field499[var7] = field499[var7 + 1];
                }
                field441 = field275;
                field290.method2354(39);
                field290.method2126(class107.method859(arg0));
                field290.method2257(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("bz.dj(Ljava/lang/String;IB)V")
    public static final void method1347(String arg0, int arg1) {
        field290.method2354(114);
        field290.method2126(class107.method859(arg0) + 1);
        field290.method2257(arg0);
        field290.method2162(arg1);
    }

    @ObfuscatedName("aq.de(Ljava/lang/String;I)V")
    public static final void method592(String arg0) {
        if (!arg0.equals("")) {
            field290.method2354(107);
            field290.method2126(class107.method859(arg0));
            field290.method2257(arg0);
        }
    }

    @ObfuscatedName("fa.ds(I)V")
    public static final void method3160() {
        field290.method2354(107);
        field290.method2126(0);
    }

    @ObfuscatedName("cy.dv(II)V")
    public static void method2079(int arg0) {
        for (class179 var1 = (class179) field450.method3204(); var1 != null; var1 = (class179) field450.method3203()) {
            if ((long) arg0 == (var1.field2875 >> 48 & 0xFFFFL)) {
                var1.method3322();
            }
        }
    }

    @ObfuscatedName("k.dp(Leu;I)I")
    public static int method37(class152 arg0) {
        class179 var1 = (class179) field450.method3201(((long) arg0.field2597 << 32) + (long) arg0.field2530);
        return var1 == null ? arg0.field2588 : var1.field2862;
    }

    @ObfuscatedName("al.dn(Leu;B)Z")
    public static boolean method838(class152 arg0) {
        if (field419) {
            if (method37(arg0) != 0) {
                return false;
            }
            if (arg0.field2566 == 0) {
                return false;
            }
        }
        return arg0.field2541;
    }

    @ObfuscatedName("ao.dd(Leu;B)Ljava/lang/String;")
    public static String method716(class152 arg0) {
        if (class156.method562(method37(arg0)) == 0) {
            return null;
        } else if (arg0.field2642 == null || arg0.field2642.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2642;
        }
    }

    @ObfuscatedName("ap.dr(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method549(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field252 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field252 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field252 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field252 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field252 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field256 + "/";
    }
}

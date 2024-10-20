package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class131 {

    @ObfuscatedName("client.h")
    public static boolean field260 = true;

    @ObfuscatedName("client.r")
    public static int field350 = 1;

    @ObfuscatedName("client.e")
    public static int field262 = 0;

    @ObfuscatedName("client.b")
    public static int field317 = 0;

    @ObfuscatedName("client.q")
    public static boolean field264 = false;

    @ObfuscatedName("client.i")
    public static boolean field407 = false;

    @ObfuscatedName("client.f")
    public static int field266 = 0;

    @ObfuscatedName("client.t")
    public static int field268 = 0;

    @ObfuscatedName("client.c")
    public static boolean field269 = true;

    @ObfuscatedName("client.d")
    public static int field280 = 0;

    @ObfuscatedName("client.g")
    public static long field411 = -1L;

    @ObfuscatedName("client.m")
    public static int field390 = -1;

    @ObfuscatedName("client.v")
    public static int field273 = -1;

    @ObfuscatedName("client.u")
    public static int field274 = -1;

    @ObfuscatedName("client.p")
    public static boolean field275 = true;

    @ObfuscatedName("client.l")
    public static boolean field276 = false;

    @ObfuscatedName("client.w")
    public static class195[] field324 = new class195[4];

    @ObfuscatedName("client.aj")
    public static int field277 = 0;

    @ObfuscatedName("client.al")
    public static int field278 = 0;

    @ObfuscatedName("client.af")
    public static int field279 = 0;

    @ObfuscatedName("client.ai")
    public static int field281 = 0;

    @ObfuscatedName("client.ak")
    public static int field270 = 0;

    @ObfuscatedName("client.ae")
    public static int field282 = 0;

    @ObfuscatedName("client.ag")
    public static int field283 = 0;

    @ObfuscatedName("client.ar")
    public static int field284 = 0;

    @ObfuscatedName("client.an")
    public static int field263 = 0;

    @ObfuscatedName("client.av")
    public static class107 field286 = new class107(new byte[5000]);

    @ObfuscatedName("client.ad")
    public static class18 field429 = class18.field528;

    @ObfuscatedName("client.aa")
    public static int field288 = 0;

    @ObfuscatedName("client.az")
    public static int field289 = 0;

    @ObfuscatedName("client.au")
    public static int field401 = 0;

    @ObfuscatedName("client.bx")
    public static int field456 = 0;

    @ObfuscatedName("client.br")
    public static int field296 = 0;

    @ObfuscatedName("client.bb")
    public static int field486 = 0;

    @ObfuscatedName("client.bw")
    public static int field397 = 0;

    @ObfuscatedName("client.bo")
    public static int field299 = 0;

    @ObfuscatedName("client.bc")
    public static class30[] field300 = new class30[32768];

    @ObfuscatedName("client.bj")
    public static int field301 = 0;

    @ObfuscatedName("client.bv")
    public static int[] field348 = new int[32768];

    @ObfuscatedName("client.cq")
    public static class110 field304 = new class110(5000);

    @ObfuscatedName("client.cy")
    public static class110 field355 = new class110(5000);

    @ObfuscatedName("client.cr")
    public static class110 field306 = new class110(5000);

    @ObfuscatedName("client.cj")
    public static int field314 = 0;

    @ObfuscatedName("client.co")
    public static int field308 = 0;

    @ObfuscatedName("client.cb")
    public static int field309 = 0;

    @ObfuscatedName("client.cp")
    public static int field310 = 0;

    @ObfuscatedName("client.cm")
    public static int field438 = 0;

    @ObfuscatedName("client.cg")
    public static int field312 = 0;

    @ObfuscatedName("client.cz")
    public static int field313 = 0;

    @ObfuscatedName("client.ct")
    public static int field357 = 0;

    @ObfuscatedName("client.cx")
    public static boolean field315 = false;

    @ObfuscatedName("client.cf")
    public static int field400 = 0;

    @ObfuscatedName("client.cs")
    public static int field500 = 0;

    @ObfuscatedName("client.dh")
    public static int field319 = 1;

    @ObfuscatedName("client.dt")
    public static int field320 = 0;

    @ObfuscatedName("client.de")
    public static int field434 = 1;

    @ObfuscatedName("client.dk")
    public static int field322 = 0;

    @ObfuscatedName("client.dc")
    public static boolean field511 = false;

    @ObfuscatedName("client.da")
    public static int[][][] field374 = new int[4][13][13];

    @ObfuscatedName("client.dy")
    public static final int[] field327 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dv")
    public static int field328 = 0;

    @ObfuscatedName("client.dx")
    public static int field522 = 2;

    @ObfuscatedName("client.dg")
    public static int field330 = 0;

    @ObfuscatedName("client.du")
    public static int field331 = 2;

    @ObfuscatedName("client.do")
    public static int field332 = 0;

    @ObfuscatedName("client.ds")
    public static int field333 = 1;

    @ObfuscatedName("client.dp")
    public static int field334 = 0;

    @ObfuscatedName("client.dj")
    public static int field335 = 0;

    @ObfuscatedName("client.di")
    public static int field379 = 2;

    @ObfuscatedName("client.df")
    public static int field345 = 0;

    @ObfuscatedName("client.ef")
    public static int field338 = 1;

    @ObfuscatedName("client.ej")
    public static int field339 = 0;

    @ObfuscatedName("client.en")
    public static int field340 = 0;

    @ObfuscatedName("client.em")
    public static int field341 = 2301979;

    @ObfuscatedName("client.eb")
    public static int field342 = 5063219;

    @ObfuscatedName("client.ea")
    public static int field377 = 3353893;

    @ObfuscatedName("client.el")
    public static int field344 = 7759444;

    @ObfuscatedName("client.ev")
    public static boolean field404 = false;

    @ObfuscatedName("client.fu")
    public static int field523 = 0;

    @ObfuscatedName("client.fg")
    public static int field347 = 128;

    @ObfuscatedName("client.fx")
    public static int field447 = 0;

    @ObfuscatedName("client.fb")
    public static int field349 = 0;

    @ObfuscatedName("client.fj")
    public static int field450 = 0;

    @ObfuscatedName("client.fr")
    public static int field373 = 0;

    @ObfuscatedName("client.fw")
    public static int field352 = 0;

    @ObfuscatedName("client.fq")
    public static int field353 = 0;

    @ObfuscatedName("client.fh")
    public static boolean field258 = false;

    @ObfuscatedName("client.fc")
    public static int field326 = 0;

    @ObfuscatedName("client.fo")
    public static int field356 = 0;

    @ObfuscatedName("client.fk")
    public static int field484 = 50;

    @ObfuscatedName("client.fm")
    public static int[] field295 = new int[field484];

    @ObfuscatedName("client.fa")
    public static int[] field359 = new int[field484];

    @ObfuscatedName("client.ff")
    public static int[] field360 = new int[field484];

    @ObfuscatedName("client.fp")
    public static int[] field285 = new int[field484];

    @ObfuscatedName("client.fy")
    public static int[] field271 = new int[field484];

    @ObfuscatedName("client.fe")
    public static int[] field363 = new int[field484];

    @ObfuscatedName("client.fn")
    public static int[] field364 = new int[field484];

    @ObfuscatedName("client.gg")
    public static String[] field372 = new String[field484];

    @ObfuscatedName("client.gb")
    public static int[][] field366 = new int[104][104];

    @ObfuscatedName("client.gv")
    public static int field367 = 0;

    @ObfuscatedName("client.gx")
    public static int field368 = -1;

    @ObfuscatedName("client.gm")
    public static int field369 = -1;

    @ObfuscatedName("client.gl")
    public static int field370 = 0;

    @ObfuscatedName("client.gt")
    public static int field371 = 0;

    @ObfuscatedName("client.gh")
    public static int field325 = 0;

    @ObfuscatedName("client.gq")
    public static int field433 = 0;

    @ObfuscatedName("client.gi")
    public static int field490 = 0;

    @ObfuscatedName("client.gr")
    public static int field496 = 0;

    @ObfuscatedName("client.gy")
    public static int field351 = 0;

    @ObfuscatedName("client.gu")
    public static int field337 = 0;

    @ObfuscatedName("client.gc")
    public static int field478 = 0;

    @ObfuscatedName("client.gp")
    public static int field406 = 0;

    @ObfuscatedName("client.go")
    public static boolean field453 = false;

    @ObfuscatedName("client.gf")
    public static int field381 = 0;

    @ObfuscatedName("client.gs")
    public static int field382 = 0;

    @ObfuscatedName("client.gd")
    public static class3[] field383 = new class3[2048];

    @ObfuscatedName("client.gz")
    public static int field384 = 0;

    @ObfuscatedName("client.gw")
    public static int[] field385 = new int[2048];

    @ObfuscatedName("client.hr")
    public static int field386 = 0;

    @ObfuscatedName("client.hq")
    public static int[] field413 = new int[2048];

    @ObfuscatedName("client.hf")
    public static class107[] field388 = new class107[2048];

    @ObfuscatedName("client.hl")
    public static int field389 = -1;

    @ObfuscatedName("client.ht")
    public static int field321 = 0;

    @ObfuscatedName("client.hv")
    public static int field362 = 0;

    @ObfuscatedName("client.hw")
    public static int[] field393 = new int[1000];

    @ObfuscatedName("client.hy")
    public static final int[] field394 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hh")
    public static String[] field395 = new String[8];

    @ObfuscatedName("client.hz")
    public static boolean[] field365 = new boolean[8];

    @ObfuscatedName("client.ho")
    public static int[] field343 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hp")
    public static int field398 = -1;

    @ObfuscatedName("client.he")
    public static class177[][][] field399 = new class177[4][104][104];

    @ObfuscatedName("client.hm")
    public static class177 field402 = new class177();

    @ObfuscatedName("client.hu")
    public static class177 field305 = new class177();

    @ObfuscatedName("client.hk")
    public static class177 field291 = new class177();

    @ObfuscatedName("client.hn")
    public static int[] field403 = new int[25];

    @ObfuscatedName("client.hx")
    public static int[] field323 = new int[25];

    @ObfuscatedName("client.ha")
    public static int[] field405 = new int[25];

    @ObfuscatedName("client.hd")
    public static int field409 = 0;

    @ObfuscatedName("client.hb")
    public static boolean field410 = false;

    @ObfuscatedName("client.ia")
    public static int field408 = 0;

    @ObfuscatedName("client.ig")
    public static int[] field272 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field380 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field375 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field412 = new int[500];

    @ObfuscatedName("client.ip")
    public static String[] field378 = new String[500];

    @ObfuscatedName("client.is")
    public static String[] field414 = new String[500];

    @ObfuscatedName("client.im")
    public static int field294 = -1;

    @ObfuscatedName("client.ic")
    public static int field318 = -1;

    @ObfuscatedName("client.if")
    public static int field417 = 0;

    @ObfuscatedName("client.ij")
    public static int field418 = 50;

    @ObfuscatedName("client.ik")
    public static int field419 = 0;

    @ObfuscatedName("client.it")
    public static String field420 = null;

    @ObfuscatedName("client.iy")
    public static boolean field421 = false;

    @ObfuscatedName("client.iu")
    public static int field422 = -1;

    @ObfuscatedName("client.jq")
    public static String field423 = null;

    @ObfuscatedName("client.je")
    public static String field424 = null;

    @ObfuscatedName("client.jl")
    public static int field425 = -1;

    @ObfuscatedName("client.jv")
    public static class174 field297 = new class174(8);

    @ObfuscatedName("client.jp")
    public static int field427 = 0;

    @ObfuscatedName("client.jo")
    public static int field428 = 0;

    @ObfuscatedName("client.jm")
    public static class152 field265 = null;

    @ObfuscatedName("client.ja")
    public static int field430 = 0;

    @ObfuscatedName("client.ji")
    public static int field431 = 0;

    @ObfuscatedName("client.jt")
    public static int field432 = 0;

    @ObfuscatedName("client.jf")
    public static int field307 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field287 = false;

    @ObfuscatedName("client.jd")
    public static boolean field448 = false;

    @ObfuscatedName("client.jr")
    public static boolean field336 = false;

    @ObfuscatedName("client.jk")
    public static class152 field437 = null;

    @ObfuscatedName("client.jb")
    public static class152 field346 = null;

    @ObfuscatedName("client.jh")
    public static int field439 = 0;

    @ObfuscatedName("client.js")
    public static int field440 = 0;

    @ObfuscatedName("client.jw")
    public static class152 field441 = null;

    @ObfuscatedName("client.jz")
    public static boolean field442 = false;

    @ObfuscatedName("client.jx")
    public static int field443 = -1;

    @ObfuscatedName("client.jj")
    public static int field444 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field445 = false;

    @ObfuscatedName("client.ju")
    public static int field446 = -1;

    @ObfuscatedName("client.jg")
    public static int field259 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field387 = false;

    @ObfuscatedName("client.ks")
    public static int field416 = 1;

    @ObfuscatedName("client.kz")
    public static int[] field302 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field452 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field462 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field454 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field455 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field510 = 0;

    @ObfuscatedName("client.kv")
    public static int field457 = 0;

    @ObfuscatedName("client.kq")
    public static int field458 = 0;

    @ObfuscatedName("client.ke")
    public static int field311 = 0;

    @ObfuscatedName("client.ky")
    public static int field460 = 0;

    @ObfuscatedName("client.km")
    public static int[] field461 = new int[2000];

    @ObfuscatedName("client.ki")
    public static String[] field483 = new String[1000];

    @ObfuscatedName("client.kg")
    public static int field463 = 0;

    @ObfuscatedName("client.ku")
    public static class177 field464 = new class177();

    @ObfuscatedName("client.kr")
    public static class177 field465 = new class177();

    @ObfuscatedName("client.kl")
    public static class177 field466 = new class177();

    @ObfuscatedName("client.kc")
    public static class174 field467 = new class174(512);

    @ObfuscatedName("client.ls")
    public static int field468 = 0;

    @ObfuscatedName("client.lo")
    public static int field469 = -2;

    @ObfuscatedName("client.lz")
    public static boolean[] field470 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static boolean[] field471 = new boolean[100];

    @ObfuscatedName("client.lw")
    public static boolean[] field506 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static int[] field473 = new int[100];

    @ObfuscatedName("client.ly")
    public static int[] field474 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field472 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field476 = new int[100];

    @ObfuscatedName("client.li")
    public static int field477 = 0;

    @ObfuscatedName("client.lk")
    public static int[] field303 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ln")
    public static int field392 = 0;

    @ObfuscatedName("client.lf")
    public static int field480 = 0;

    @ObfuscatedName("client.lb")
    public static long[] field481 = new long[100];

    @ObfuscatedName("client.lp")
    public static int field482 = 0;

    @ObfuscatedName("client.lg")
    public static int field290 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field426 = new int[128];

    @ObfuscatedName("client.le")
    public static int[] field485 = new int[128];

    @ObfuscatedName("client.lr")
    public static long field516 = -1L;

    @ObfuscatedName("client.ll")
    public static String field487 = null;

    @ObfuscatedName("client.lv")
    public static String field488 = null;

    @ObfuscatedName("client.mv")
    public static int field489 = -1;

    @ObfuscatedName("client.mr")
    public static int field376 = 0;

    @ObfuscatedName("client.mi")
    public static int[] field491 = new int[1000];

    @ObfuscatedName("client.mh")
    public static int[] field492 = new int[1000];

    @ObfuscatedName("client.mm")
    public static class72[] field361 = new class72[1000];

    @ObfuscatedName("client.ml")
    public static int field494 = 0;

    @ObfuscatedName("client.mo")
    public static int field495 = 0;

    @ObfuscatedName("client.mu")
    public static int field512 = 0;

    @ObfuscatedName("client.mj")
    public static int field497 = 255;

    @ObfuscatedName("client.mw")
    public static int field498 = -1;

    @ObfuscatedName("client.mk")
    public static boolean field499 = false;

    @ObfuscatedName("client.mf")
    public static int field415 = 127;

    @ObfuscatedName("client.ms")
    public static int field501 = 127;

    @ObfuscatedName("client.na")
    public static int field502 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field503 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field504 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field505 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field479 = new int[50];

    @ObfuscatedName("client.nv")
    public static class52[] field507 = new class52[50];

    @ObfuscatedName("client.nh")
    public static boolean field508 = false;

    @ObfuscatedName("client.ni")
    public static boolean[] field509 = new boolean[5];

    @ObfuscatedName("client.no")
    public static int[] field459 = new int[5];

    @ObfuscatedName("client.ng")
    public static int[] field396 = new int[5];

    @ObfuscatedName("client.ne")
    public static int[] field354 = new int[5];

    @ObfuscatedName("client.nn")
    public static int[] field513 = new int[5];

    @ObfuscatedName("client.nt")
    public static int field514 = 0;

    @ObfuscatedName("client.nm")
    public static int field515 = 0;

    @ObfuscatedName("client.og")
    public static class16[] field298 = new class16[400];

    @ObfuscatedName("client.or")
    public static class173 field517 = new class173();

    @ObfuscatedName("client.ok")
    public static int field518 = 0;

    @ObfuscatedName("client.ox")
    public static class8[] field519 = new class8[400];

    @ObfuscatedName("client.oc")
    public static class157 field520 = new class157();

    @ObfuscatedName("client.ot")
    public static int field521 = -1;

    @ObfuscatedName("client.op")
    public static int field358 = -1;

    @ObfuscatedName("client.z(I)V")
    public final void method165() {
    }

    public final void init() {
        if (!this.method2673()) {
            return;
        }
        class168[] var1 = class168.method1605();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class168 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2812);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2812)) {
                    case 1:
                        field262 = Integer.parseInt(var4);
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class2.field23)) {
                        }
                    case 3:
                    default:
                        break;
                    case 4:
                        Statics.field267 = var4;
                        break;
                    case 5:
                        class139[] var11 = class139.method1888();
                        int var12 = Integer.parseInt(var4);
                        class139[] var13 = var11;
                        int var14 = 0;
                        class139 var16;
                        while (true) {
                            if (var14 >= var13.length) {
                                var16 = null;
                                break;
                            }
                            class139 var15 = var13[var14];
                            if (var12 == var15.method433()) {
                                var16 = var15;
                                break;
                            }
                            var14++;
                        }
                        Statics.field800 = (class139) var16;
                        if (Statics.field800 == class139.field2130) {
                            Statics.field2697 = class188.field2883;
                        } else {
                            Statics.field2697 = class188.field2879;
                        }
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class2.field23)) {
                            field264 = true;
                        } else {
                            field264 = false;
                        }
                        break;
                    case 7:
                        int var5 = Integer.parseInt(var4);
                        class138[] var6 = new class138[] { class138.field2117, class138.field2119, class138.field2118, class138.field2115 };
                        class138[] var7 = var6;
                        int var8 = 0;
                        class138 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class138 var9 = var7[var8];
                            if (var9.field2120 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field1769 = var10;
                        break;
                    case 8:
                        field317 = Integer.parseInt(var4);
                        break;
                    case 9:
                        field266 = Integer.parseInt(var4);
                        break;
                    case 10:
                        field350 = Integer.parseInt(var4);
                }
            }
        }
        method2853();
        Statics.field220 = this.getCodeBase().getHost();
        String var17 = Statics.field1769.field2116;
        byte var18 = 0;
        try {
            Statics.field2094 = 16;
            Statics.field1940 = var18;
            try {
                Statics.field2101 = System.getProperty("os.name");
            } catch (Exception var31) {
                Statics.field2101 = "Unknown";
            }
            Statics.field1567 = Statics.field2101.toLowerCase();
            try {
                Statics.field1578 = System.getProperty("user.home");
                if (Statics.field1578 != null) {
                    Statics.field1578 = Statics.field1578 + "/";
                }
            } catch (Exception var30) {
            }
            try {
                if (Statics.field1567.startsWith("win")) {
                    if (Statics.field1578 == null) {
                        Statics.field1578 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1578 == null) {
                    Statics.field1578 = System.getenv("HOME");
                }
                if (Statics.field1578 != null) {
                    Statics.field1578 = Statics.field1578 + "/";
                }
            } catch (Exception var29) {
            }
            if (Statics.field1578 == null) {
                Statics.field1578 = "~/";
            }
            Statics.field2100 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1578, "/tmp/", "" };
            Statics.field2958 = new String[] { ".jagex_cache_" + Statics.field1940, ".file_store_" + Statics.field1940 };
            label121: for (int var22 = 0; var22 < 4; var22++) {
                Statics.field2093 = class136.method1873("oldschool", var17, var22);
                if (!Statics.field2093.exists()) {
                    Statics.field2093.mkdirs();
                }
                File[] var23 = Statics.field2093.listFiles();
                if (var23 == null) {
                    break;
                }
                File[] var24 = var23;
                int var25 = 0;
                while (true) {
                    if (var25 >= var24.length) {
                        break label121;
                    }
                    File var26 = var24[var25];
                    if (!class136.method488(var26, false)) {
                        break;
                    }
                    var25++;
                }
            }
            class122.method2059(Statics.field2093);
            Statics.method35();
            class136.field2098 = new class194(new class193(class122.method2473("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class136.field2090 = new class194(new class193(class122.method2473("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2037 = new class194[Statics.field2094];
            for (int var27 = 0; var27 < Statics.field2094; var27++) {
                Statics.field2037[var27] = new class194(new class193(class122.method2473("main_file_cache.idx" + var27), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var32) {
            class135.method495((String) null, var32);
        }
        Statics.field475 = this;
        this.method2674(765, 503, 52);
    }

    @ObfuscatedName("ed.h(I)V")
    public static final void method2853() {
        class79.field1362 = false;
        field407 = false;
    }

    @ObfuscatedName("client.r(B)V")
    public final void method167() {
        Statics.field1862 = field317 == 0 ? 43594 : field350 + 40000;
        Statics.field1001 = field317 == 0 ? 443 : field350 + 50000;
        Statics.field627 = Statics.field1862;
        Statics.field1933 = class153.field2659;
        Statics.field1822 = class153.field2657;
        Statics.field2668 = class153.field2661;
        Statics.field619 = class153.field2658;
        if (Statics.field1947.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1990[44] = 71;
            class124.field1990[45] = 26;
            class124.field1990[46] = 72;
            class124.field1990[47] = 73;
            class124.field1990[59] = 57;
            class124.field1990[61] = 27;
            class124.field1990[91] = 42;
            class124.field1990[92] = 74;
            class124.field1990[93] = 43;
            class124.field1990[192] = 28;
            class124.field1990[222] = 58;
            class124.field1990[520] = 59;
        } else {
            class124.field1990[186] = 57;
            class124.field1990[187] = 27;
            class124.field1990[188] = 71;
            class124.field1990[189] = 26;
            class124.field1990[190] = 72;
            class124.field1990[191] = 73;
            class124.field1990[192] = 58;
            class124.field1990[219] = 42;
            class124.field1990[220] = 74;
            class124.field1990[221] = 43;
            class124.field1990[222] = 59;
            class124.field1990[223] = 28;
        }
        class124.method501(Statics.field1521);
        class127.method1980(Statics.field1521);
        class132 var1;
        try {
            var1 = new class132();
        } catch (Throwable var12) {
            var1 = null;
        }
        Statics.field1529 = var1;
        if (Statics.field1529 != null) {
            Statics.field1529.method2446(Statics.field1521);
        }
        Statics.field141 = new class121(255, class136.field2098, class136.field2090, 500000);
        class193 var3 = null;
        class9 var4 = new class9();
        try {
            var3 = class136.method3322("", Statics.field800.field2127, false);
            byte[] var5 = new byte[(int) var3.method3439()];
            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method3435(var5, var6, var5.length - var6);
                if (var7 == -1) {
                    throw new IOException();
                }
            }
            var4 = new class9(new class107(var5));
        } catch (Exception var13) {
        }
        try {
            if (var3 != null) {
                var3.method3434();
            }
        } catch (Exception var11) {
        }
        Statics.field1921 = var4;
        Statics.field586 = this.getToolkit().getSystemClipboard();
        class125.method588(this, Statics.field574);
        if (field317 != 0) {
            field276 = true;
        }
    }

    @ObfuscatedName("client.e(I)V")
    public final void method168() {
        field280++;
        this.method222();
        class149.method2363();
        class161.method1886();
        method682();
        class124.method2616();
        class127 var1 = class127.field2013;
        synchronized (class127.field2013) {
            class127.field2012 = class127.field2009;
            class127.field2016 = class127.field2010;
            class127.field2011 = class127.field2008 * -1967730383;
            class127.field2019 = class127.field2014;
            class127.field2020 = class127.field2022;
            class127.field2021 = class127.field2015;
            class127.field2007 = class127.field2018;
            class127.field2014 = 0;
        }
        if (Statics.field1529 != null) {
            int var3 = Statics.field1529.method2448();
            field463 = var3;
        }
        if (field268 == 0) {
            method1875();
            class131.method767();
        } else if (field268 == 5) {
            class28.method127(this);
            method1875();
            class131.method767();
        } else if (field268 == 10 || field268 == 11) {
            class28.method127(this);
        } else if (field268 == 20) {
            class28.method127(this);
            method40();
        } else if (field268 == 25) {
            method95(false);
            field500 = 0;
            boolean var4 = true;
            for (int var5 = 0; var5 < Statics.field195.length; var5++) {
                if (Statics.field451[var5] != -1 && Statics.field195[var5] == null) {
                    Statics.field195[var5] = Statics.field436.method2739(Statics.field451[var5], 0);
                    if (Statics.field195[var5] == null) {
                        var4 = false;
                        field500++;
                    }
                }
                if (Statics.field2095[var5] != -1 && Statics.field226[var5] == null) {
                    Statics.field226[var5] = Statics.field436.method2740(Statics.field2095[var5], 0, Statics.field1356[var5]);
                    if (Statics.field226[var5] == null) {
                        var4 = false;
                        field500++;
                    }
                }
            }
            if (var4) {
                field320 = 0;
                boolean var6 = true;
                for (int var7 = 0; var7 < Statics.field195.length; var7++) {
                    byte[] var8 = Statics.field226[var7];
                    if (var8 != null) {
                        int var9 = (Statics.field2912[var7] >> 8) * 64 - Statics.field88;
                        int var10 = (Statics.field2912[var7] & 0xFF) * 64 - Statics.field316;
                        if (field511) {
                            var9 = 10;
                            var10 = 10;
                        }
                        boolean var12 = true;
                        class107 var13 = new class107(var8);
                        int var14 = -1;
                        label599: while (true) {
                            int var15 = var13.method2197();
                            if (var15 == 0) {
                                var6 &= var12;
                                break;
                            }
                            var14 += var15;
                            int var16 = 0;
                            boolean var17 = false;
                            while (true) {
                                while (!var17) {
                                    int var19 = var13.method2197();
                                    if (var19 == 0) {
                                        continue label599;
                                    }
                                    var16 += var19 - 1;
                                    int var20 = var16 & 0x3F;
                                    int var21 = var16 >> 6 & 0x3F;
                                    int var22 = var13.method2130() >> 2;
                                    int var23 = var9 + var21;
                                    int var24 = var10 + var20;
                                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                                        class36 var25 = class36.method2079(var14);
                                        if (var22 != 22 || !field407 || var25.field858 != 0 || var25.field856 == 1 || var25.field877) {
                                            if (!var25.method659()) {
                                                field320++;
                                                var12 = false;
                                            }
                                            var17 = true;
                                        }
                                    }
                                }
                                int var18 = var13.method2197();
                                if (var18 == 0) {
                                    break;
                                }
                                var13.method2130();
                            }
                        }
                    }
                }
                if (var6) {
                    if (field322 != 0) {
                        method115(class142.field2164 + class2.field22 + class2.field19 + 100 + "%" + class2.field20, true);
                    }
                    method682();
                    method1871();
                    method682();
                    Statics.field1257.method1607();
                    method682();
                    System.gc();
                    for (int var27 = 0; var27 < 4; var27++) {
                        field324[var27].method3482();
                    }
                    for (int var28 = 0; var28 < 4; var28++) {
                        for (int var29 = 0; var29 < 104; var29++) {
                            for (int var30 = 0; var30 < 104; var30++) {
                                class6.field87[var28][var29][var30] = 0;
                            }
                        }
                    }
                    method682();
                    class6.method26();
                    int var31 = Statics.field195.length;
                    for (class20 var32 = (class20) class20.field560.method3236(); var32 != null; var32 = (class20) class20.field560.method3243()) {
                        if (var32.field558 != null) {
                            Statics.field144.method948(var32.field558);
                            var32.field558 = null;
                        }
                        if (var32.field563 != null) {
                            Statics.field144.method948(var32.field563);
                            var32.field563 = null;
                        }
                    }
                    class20.field560.method3264();
                    method95(true);
                    if (!field511) {
                        int var33 = 0;
                        label531: while (true) {
                            if (var33 >= var31) {
                                for (int var47 = 0; var47 < var31; var47++) {
                                    int var48 = (Statics.field2912[var47] >> 8) * 64 - Statics.field88;
                                    int var49 = (Statics.field2912[var47] & 0xFF) * 64 - Statics.field316;
                                    byte[] var50 = Statics.field195[var47];
                                    if (var50 == null && Statics.field1063 < 800) {
                                        method682();
                                        class6.method3321(var48, var49, 64, 64);
                                    }
                                }
                                method95(true);
                                int var51 = 0;
                                while (true) {
                                    if (var51 >= var31) {
                                        break label531;
                                    }
                                    byte[] var52 = Statics.field226[var51];
                                    if (var52 != null) {
                                        int var53 = (Statics.field2912[var51] >> 8) * 64 - Statics.field88;
                                        int var54 = (Statics.field2912[var51] & 0xFF) * 64 - Statics.field316;
                                        method682();
                                        class6.method36(var52, var53, var54, Statics.field1257, field324);
                                    }
                                    var51++;
                                }
                            }
                            int var34 = (Statics.field2912[var33] >> 8) * 64 - Statics.field88;
                            int var35 = (Statics.field2912[var33] & 0xFF) * 64 - Statics.field316;
                            byte[] var36 = Statics.field195[var33];
                            if (var36 != null) {
                                method682();
                                int var37 = Statics.field534 * 8 - 48;
                                int var38 = Statics.field1063 * 8 - 48;
                                class195[] var39 = field324;
                                int var40 = 0;
                                label528: while (true) {
                                    if (var40 >= 4) {
                                        class107 var43 = new class107(var36);
                                        int var44 = 0;
                                        while (true) {
                                            if (var44 >= 4) {
                                                break label528;
                                            }
                                            for (int var45 = 0; var45 < 64; var45++) {
                                                for (int var46 = 0; var46 < 64; var46++) {
                                                    Statics.method493(var43, var44, var34 + var45, var35 + var46, var37, var38, 0);
                                                }
                                            }
                                            var44++;
                                        }
                                    }
                                    for (int var41 = 0; var41 < 64; var41++) {
                                        for (int var42 = 0; var42 < 64; var42++) {
                                            if (var34 + var41 > 0 && var34 + var41 < 103 && var35 + var42 > 0 && var35 + var42 < 103) {
                                                var39[var40].field2936[var34 + var41][var35 + var42] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var40++;
                                }
                            }
                            var33++;
                        }
                    }
                    if (field511) {
                        int var55 = 0;
                        label477: while (true) {
                            if (var55 >= 4) {
                                for (int var87 = 0; var87 < 13; var87++) {
                                    for (int var88 = 0; var88 < 13; var88++) {
                                        int var89 = field374[0][var87][var88];
                                        if (var89 == -1) {
                                            class6.method3321(var87 * 8, var88 * 8, 8, 8);
                                        }
                                    }
                                }
                                method95(true);
                                int var90 = 0;
                                while (true) {
                                    if (var90 >= 4) {
                                        break label477;
                                    }
                                    method682();
                                    for (int var91 = 0; var91 < 13; var91++) {
                                        label400: for (int var92 = 0; var92 < 13; var92++) {
                                            int var93 = field374[var90][var91][var92];
                                            if (var93 != -1) {
                                                int var94 = var93 >> 24 & 0x3;
                                                int var95 = var93 >> 1 & 0x3;
                                                int var96 = var93 >> 14 & 0x3FF;
                                                int var97 = var93 >> 3 & 0x7FF;
                                                int var98 = (var96 / 8 << 8) + var97 / 8;
                                                for (int var99 = 0; var99 < Statics.field2912.length; var99++) {
                                                    if (Statics.field2912[var99] == var98 && Statics.field226[var99] != null) {
                                                        byte[] var100 = Statics.field226[var99];
                                                        int var101 = var91 * 8;
                                                        int var102 = var92 * 8;
                                                        int var103 = (var96 & 0x7) * 8;
                                                        int var104 = (var97 & 0x7) * 8;
                                                        class79 var105 = Statics.field1257;
                                                        class195[] var106 = field324;
                                                        class107 var107 = new class107(var100);
                                                        int var108 = -1;
                                                        while (true) {
                                                            int var109 = var107.method2197();
                                                            if (var109 == 0) {
                                                                continue label400;
                                                            }
                                                            var108 += var109;
                                                            int var110 = 0;
                                                            while (true) {
                                                                int var111 = var107.method2197();
                                                                if (var111 == 0) {
                                                                    break;
                                                                }
                                                                var110 += var111 - 1;
                                                                int var112 = var110 & 0x3F;
                                                                int var113 = var110 >> 6 & 0x3F;
                                                                int var114 = var110 >> 12;
                                                                int var115 = var107.method2130();
                                                                int var116 = var115 >> 2;
                                                                int var117 = var115 & 0x3;
                                                                if (var94 == var114 && var113 >= var103 && var113 < var103 + 8 && var112 >= var104 && var112 < var104 + 8) {
                                                                    class36 var118 = class36.method2079(var108);
                                                                    int var119 = var101 + class155.method812(var113 & 0x7, var112 & 0x7, var95, var118.field878, var118.field854, var117);
                                                                    int var120 = var102 + class155.method2440(var113 & 0x7, var112 & 0x7, var95, var118.field878, var118.field854, var117);
                                                                    if (var119 > 0 && var120 > 0 && var119 < 103 && var120 < 103) {
                                                                        int var121 = var90;
                                                                        if ((class6.field87[1][var119][var120] & 0x2) == 2) {
                                                                            var121 = var90 - 1;
                                                                        }
                                                                        class195 var122 = null;
                                                                        if (var121 >= 0) {
                                                                            var122 = var106[var121];
                                                                        }
                                                                        class6.method731(var90, var119, var120, var108, var95 + var117 & 0x3, var116, var105, var122);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var90++;
                                }
                            }
                            method682();
                            for (int var56 = 0; var56 < 13; var56++) {
                                for (int var57 = 0; var57 < 13; var57++) {
                                    boolean var58 = false;
                                    int var59 = field374[var55][var56][var57];
                                    if (var59 != -1) {
                                        int var60 = var59 >> 24 & 0x3;
                                        int var61 = var59 >> 1 & 0x3;
                                        int var62 = var59 >> 14 & 0x3FF;
                                        int var63 = var59 >> 3 & 0x7FF;
                                        int var64 = (var62 / 8 << 8) + var63 / 8;
                                        for (int var65 = 0; var65 < Statics.field2912.length; var65++) {
                                            if (Statics.field2912[var65] == var64 && Statics.field195[var65] != null) {
                                                byte[] var66 = Statics.field195[var65];
                                                int var67 = var56 * 8;
                                                int var68 = var57 * 8;
                                                int var69 = (var62 & 0x7) * 8;
                                                int var70 = (var63 & 0x7) * 8;
                                                class195[] var71 = field324;
                                                for (int var72 = 0; var72 < 8; var72++) {
                                                    for (int var73 = 0; var73 < 8; var73++) {
                                                        if (var67 + var72 > 0 && var67 + var72 < 103 && var68 + var73 > 0 && var68 + var73 < 103) {
                                                            var71[var55].field2936[var67 + var72][var68 + var73] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class107 var74 = new class107(var66);
                                                for (int var75 = 0; var75 < 4; var75++) {
                                                    for (int var76 = 0; var76 < 64; var76++) {
                                                        for (int var77 = 0; var77 < 64; var77++) {
                                                            if (var60 == var75 && var76 >= var69 && var76 < var69 + 8 && var77 >= var70 && var77 < var70 + 8) {
                                                                int var80 = var67 + class155.method1336(var76 & 0x7, var77 & 0x7, var61);
                                                                int var82 = var76 & 0x7;
                                                                int var83 = var77 & 0x7;
                                                                int var85 = var61 & 0x3;
                                                                int var86;
                                                                if (var85 == 0) {
                                                                    var86 = var83;
                                                                } else if (var85 == 1) {
                                                                    var86 = 7 - var82;
                                                                } else if (var85 == 2) {
                                                                    var86 = 7 - var83;
                                                                } else {
                                                                    var86 = var82;
                                                                }
                                                                Statics.method493(var74, var55, var80, var68 + var86, 0, 0, var61);
                                                            } else {
                                                                Statics.method493(var74, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var58 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var58) {
                                        class6.method2488(var55, var56 * 8, var57 * 8);
                                    }
                                }
                            }
                            var55++;
                        }
                    }
                    method95(true);
                    method1871();
                    method682();
                    class6.method104(Statics.field1257, field324);
                    method95(true);
                    int var123 = class6.field90;
                    if (var123 > Statics.field1494) {
                        var123 = Statics.field1494;
                    }
                    if (var123 < Statics.field1494 - 1) {
                        int var124 = Statics.field1494 - 1;
                    }
                    if (field407) {
                        Statics.field1257.method1608(class6.field90);
                    } else {
                        Statics.field1257.method1608(0);
                    }
                    for (int var125 = 0; var125 < 104; var125++) {
                        for (int var126 = 0; var126 < 104; var126++) {
                            method29(var125, var126);
                        }
                    }
                    method682();
                    method2457();
                    class36.field842.method3170();
                    if (Statics.field1278 != null) {
                        field304.method2369(58);
                        field304.method2119(1057001181);
                    }
                    if (!field511) {
                        int var127 = (Statics.field534 - 6) / 8;
                        int var128 = (Statics.field534 + 6) / 8;
                        int var129 = (Statics.field1063 - 6) / 8;
                        int var130 = (Statics.field1063 + 6) / 8;
                        for (int var131 = var127 - 1; var131 <= var128 + 1; var131++) {
                            for (int var132 = var129 - 1; var132 <= var130 + 1; var132++) {
                                if (var131 < var127 || var131 > var128 || var132 < var129 || var132 > var130) {
                                    Statics.field436.method2759("m" + var131 + "_" + var132);
                                    Statics.field436.method2759("l" + var131 + "_" + var132);
                                }
                            }
                        }
                    }
                    method1978(30);
                    method682();
                    class6.method468();
                    field304.method2369(90);
                    class131.method767();
                } else {
                    field322 = 2;
                }
            } else {
                field322 = 1;
            }
        }
        if (field268 == 30) {
            Statics.method1876();
        } else if (field268 == 40 || field268 == 45) {
            method40();
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method186() {
        boolean var1 = class161.method546();
        if (var1 && field499 && Statics.field2102 != null) {
            Statics.field2102.method984();
        }
        if (field2065) {
            Canvas var2 = Statics.field1521;
            var2.removeKeyListener(class124.field1989);
            var2.removeFocusListener(class124.field1989);
            class124.field1980 = -1;
            Canvas var3 = Statics.field1521;
            var3.removeMouseListener(class127.field2013);
            var3.removeMouseMotionListener(class127.field2013);
            var3.removeFocusListener(class127.field2013);
            class127.field2009 = 0;
            if (Statics.field1529 != null) {
                Statics.field1529.method2445(Statics.field1521);
            }
            this.method2658();
            class124.method501(Statics.field1521);
            class127.method1980(Statics.field1521);
            if (Statics.field1529 != null) {
                Statics.field1529.method2446(Statics.field1521);
            }
        }
        if (field268 == 0) {
            class131.method2628(class28.field667, class28.field668, (Color) null);
        } else if (field268 == 5) {
            class28.method1979(Statics.field91, Statics.field792);
        } else if (field268 == 10 || field268 == 11) {
            class28.method1979(Statics.field91, Statics.field792);
        } else if (field268 == 20) {
            class28.method1979(Statics.field91, Statics.field792);
        } else if (field268 == 25) {
            if (field322 == 1) {
                if (field500 > field319) {
                    field319 = field500;
                }
                int var4 = (field319 * 50 - field500 * 50) / field319;
                method115(class142.field2164 + class2.field22 + class2.field19 + var4 + "%" + class2.field20, false);
            } else if (field322 == 2) {
                if (field320 > field434) {
                    field434 = field320;
                }
                int var5 = (field434 * 50 - field320 * 50) / field434 + 50;
                method115(class142.field2164 + class2.field22 + class2.field19 + var5 + "%" + class2.field20, false);
            } else {
                method115(class142.field2164, false);
            }
        } else if (field268 == 30) {
            if (field425 != -1) {
                int var6 = field425;
                if (class152.method487(var6)) {
                    Statics.method436(Statics.field2633[var6], -1);
                }
            }
            for (int var7 = 0; var7 < field468; var7++) {
                if (field470[var7]) {
                    field471[var7] = true;
                }
                field506[var7] = field470[var7];
                field470[var7] = false;
            }
            field469 = field280;
            field294 = -1;
            field318 = -1;
            Statics.field623 = null;
            if (field425 != -1) {
                field468 = 0;
                method139(field425, 0, 0, 765, 503, 0, 0, -1);
            }
            class73.method1544();
            if (field410) {
                int var8 = Statics.field1490;
                int var9 = Statics.field868;
                int var10 = Statics.field690;
                int var11 = Statics.field2695;
                int var12 = 6116423;
                class73.method1524(var8, var9, var10, var11, var12);
                class73.method1524(var8 + 1, var9 + 1, var10 - 2, 16, 0);
                class73.method1539(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
                Statics.field91.method3344(class142.field2308, var8 + 3, var9 + 14, var12, -1);
                int var13 = class127.field2016;
                int var14 = class127.field2011 * 1253894097;
                for (int var15 = 0; var15 < field408; var15++) {
                    int var16 = (field408 - 1 - var15) * 15 + var9 + 31;
                    int var17 = 16777215;
                    if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                        var17 = 16776960;
                    }
                    Statics.field91.method3344(Statics.method1414(var15), var8 + 3, var16, var17, 0);
                }
                int var18 = Statics.field1490;
                int var19 = Statics.field868;
                int var20 = Statics.field690;
                int var21 = Statics.field2695;
                for (int var22 = 0; var22 < field468; var22++) {
                    if (field473[var22] + field472[var22] > var18 && field473[var22] < var18 + var20 && field476[var22] + field474[var22] > var19 && field474[var22] < var19 + var21) {
                        field471[var22] = true;
                    }
                }
            } else if (field294 != -1) {
                method112(field294, field318);
            }
            if (field477 == 3) {
                for (int var23 = 0; var23 < field468; var23++) {
                    if (field506[var23]) {
                        class73.method1523(field473[var23], field474[var23], field472[var23], field476[var23], 16711935, 128);
                    } else if (field471[var23]) {
                        class73.method1523(field473[var23], field474[var23], field472[var23], field476[var23], 16711680, 128);
                    }
                }
            }
            class20.method824(Statics.field1494, Statics.field391.field747, Statics.field391.field735, field340);
            field340 = 0;
        } else if (field268 == 40) {
            method115(class142.field2165 + class2.field22 + class142.field2166, false);
        } else if (field268 == 45) {
            method115(class142.field2313, false);
        }
        if (field268 == 30 && field477 == 0 && !field2068) {
            try {
                Graphics var24 = Statics.field1521.getGraphics();
                for (int var25 = 0; var25 < field468; var25++) {
                    if (field471[var25]) {
                        Statics.field200.method1339(var24, field473[var25], field474[var25], field472[var25], field476[var25]);
                        field471[var25] = false;
                    }
                }
            } catch (Exception var31) {
                Statics.field1521.repaint();
            }
        } else if (field268 > 0) {
            try {
                Graphics var27 = Statics.field1521.getGraphics();
                Statics.field200.method1338(var27, 0, 0);
                field2068 = false;
                for (int var28 = 0; var28 < field468; var28++) {
                    field471[var28] = false;
                }
            } catch (Exception var30) {
                Statics.field1521.repaint();
            }
        }
    }

    @ObfuscatedName("client.b(B)V")
    public final void method170() {
        if (Statics.field174 != null) {
            Statics.field174.field179 = false;
        }
        Statics.field174 = null;
        if (Statics.field329 != null) {
            Statics.field329.method2627();
            Statics.field329 = null;
        }
        class124.method568();
        class127.method1365();
        Statics.field1529 = null;
        if (Statics.field2102 != null) {
            Statics.field2102.method977();
        }
        if (Statics.field1352 != null) {
            Statics.field1352.method977();
        }
        if (Statics.field2515 != null) {
            Statics.field2515.method2627();
        }
        class149.method621();
        try {
            class136.field2098.method3453();
            for (int var1 = 0; var1 < Statics.field2094; var1++) {
                Statics.field2037[var1].method3453();
            }
            class136.field2090.method3453();
            class136.field2097.method3453();
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ck.n(IS)V")
    public static void method1978(int arg0) {
        if (field268 == arg0) {
            return;
        }
        if (field268 == 0) {
            class131.method2850();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field296 = 0;
            field486 = 0;
            field397 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1860 != null) {
            Statics.field1860.method2627();
            Statics.field1860 = null;
        }
        if (field268 == 25) {
            field322 = 0;
            field500 = 0;
            field319 = 1;
            field320 = 0;
            field434 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method108(Statics.field1521, Statics.field199, Statics.field1827, true, 0);
        } else if (arg0 == 20) {
            class28.method108(Statics.field1521, Statics.field199, Statics.field1827, true, field268 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method108(Statics.field1521, Statics.field199, Statics.field1827, false, 4);
        } else {
            class28.method547();
        }
        field268 = arg0;
    }

    @ObfuscatedName("client.a(B)V")
    public void method222() {
        if (field268 != 1000) {
            boolean var1 = class150.method1892();
            if (!var1) {
                this.method172();
            }
        }
    }

    @ObfuscatedName("client.q(B)V")
    public void method172() {
        if (class150.field2519 >= 4) {
            this.method2641("js5crc");
            field268 = 1000;
            return;
        }
        if (class150.field2507 >= 4) {
            if (field268 <= 5) {
                this.method2641("js5io");
                field268 = 1000;
                return;
            }
            field401 = 3000;
            class150.field2507 = 3;
        }
        if (--field401 + 1 > 0) {
            return;
        }
        try {
            if (field289 == 0) {
                Statics.field2497 = Statics.field1884.method2505(Statics.field220, Statics.field627);
                field289++;
            }
            if (field289 == 1) {
                if (Statics.field2497.field2071 == 2) {
                    this.method393(-1);
                    return;
                }
                if (Statics.field2497.field2071 == 1) {
                    field289++;
                }
            }
            if (field289 == 2) {
                Statics.field135 = new class130((Socket) Statics.field2497.field2075, Statics.field1884);
                class107 var1 = new class107(5);
                var1.method2116(15);
                var1.method2119(52);
                Statics.field135.method2613(var1.field1849, 0, 5);
                field289++;
                Statics.field493 = class103.method553();
            }
            if (field289 == 3) {
                if (field268 <= 5 || Statics.field135.method2607() > 0) {
                    int var2 = Statics.field135.method2612();
                    if (var2 != 0) {
                        this.method393(var2);
                        return;
                    }
                    field289++;
                } else if (class103.method553() - Statics.field493 > 30000L) {
                    this.method393(-2);
                    return;
                }
            }
            if (field289 == 4) {
                class150.method665(Statics.field135, field268 > 20);
                Statics.field2497 = null;
                Statics.field135 = null;
                field289 = 0;
                field456 = 0;
            }
        } catch (IOException var4) {
            this.method393(-3);
        }
    }

    @ObfuscatedName("client.i(II)V")
    public void method393(int arg0) {
        Statics.field2497 = null;
        Statics.field135 = null;
        field289 = 0;
        if (Statics.field627 == Statics.field1862) {
            Statics.field627 = Statics.field1001;
        } else {
            Statics.field627 = Statics.field1862;
        }
        field456++;
        if (field456 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field268 <= 5) {
                this.method2641("js5connect_full");
                field268 = 1000;
            } else {
                field401 = 3000;
            }
        } else if (field456 >= 2 && arg0 == 6) {
            this.method2641("js5connect_outofdate");
            field268 = 1000;
        } else if (field456 >= 4) {
            if (field268 <= 5) {
                this.method2641("js5connect");
                field268 = 1000;
            } else {
                field401 = 3000;
            }
        }
    }

    @ObfuscatedName("cb.f(B)V")
    public static void method1875() {
        if (field288 == 0) {
            Statics.field1257 = new class79(4, 104, 104, class6.field92);
            for (int var0 = 0; var0 < 4; var0++) {
                field324[var0] = new class195(104, 104);
            }
            Statics.field571 = new class72(512, 512);
            class28.field668 = class142.field2167;
            class28.field667 = 5;
            field288 = 20;
        } else if (field288 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1476[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1642(var1, 500, 800, 512, 334);
            class28.field668 = class142.field2330;
            class28.field667 = 10;
            field288 = 30;
        } else if (field288 == 30) {
            Statics.field292 = method663(0, false, true, true);
            Statics.field67 = method663(1, false, true, true);
            Statics.field293 = method663(2, true, false, true);
            Statics.field591 = method663(3, false, true, true);
            Statics.field71 = method663(4, false, true, true);
            Statics.field436 = method663(5, true, true, true);
            Statics.field940 = method663(6, true, true, false);
            Statics.field958 = method663(7, false, true, true);
            Statics.field1827 = method663(8, false, true, true);
            Statics.field2874 = method663(9, false, true, true);
            Statics.field199 = method663(10, false, true, true);
            Statics.field2873 = method663(11, false, true, true);
            Statics.field2051 = method663(12, false, true, true);
            Statics.field1820 = method663(13, true, false, true);
            Statics.field1271 = method663(14, false, true, false);
            Statics.field2114 = method663(15, false, true, true);
            class28.field668 = class142.field2169;
            class28.field667 = 20;
            field288 = 40;
        } else if (field288 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field292.method2842() * 4 / 100;
            int var8 = var7 + Statics.field67.method2842() * 4 / 100;
            int var9 = var8 + Statics.field293.method2842() * 2 / 100;
            int var10 = var9 + Statics.field591.method2842() * 2 / 100;
            int var11 = var10 + Statics.field71.method2842() * 6 / 100;
            int var12 = var11 + Statics.field436.method2842() * 4 / 100;
            int var13 = var12 + Statics.field940.method2842() * 2 / 100;
            int var14 = var13 + Statics.field958.method2842() * 60 / 100;
            int var15 = var14 + Statics.field1827.method2842() * 2 / 100;
            int var16 = var15 + Statics.field2874.method2842() * 2 / 100;
            int var17 = var16 + Statics.field199.method2842() * 2 / 100;
            int var18 = var17 + Statics.field2873.method2842() * 2 / 100;
            int var19 = var18 + Statics.field2051.method2842() * 2 / 100;
            int var20 = var19 + Statics.field1820.method2842() * 2 / 100;
            int var21 = var20 + Statics.field1271.method2842() * 2 / 100;
            int var22 = var21 + Statics.field2114.method2842() * 2 / 100;
            if (var22 == 100) {
                class28.field668 = class142.field2373;
                class28.field667 = 30;
                field288 = 45;
            } else {
                if (var22 != 0) {
                    class28.field668 = class142.field2170 + var22 + "%";
                }
                class28.field667 = 30;
            }
        } else if (field288 == 45) {
            boolean var23 = !field407;
            Statics.field1090 = 22050;
            Statics.field1086 = var23;
            Statics.field1080 = 2;
            class162 var24 = new class162();
            var24.method3056(9, 128);
            Statics.field2102 = class50.method2691(Statics.field1884, Statics.field1521, 0, 22050);
            Statics.field2102.method974(var24);
            class147 var25 = Statics.field2114;
            class147 var26 = Statics.field1271;
            class147 var27 = Statics.field71;
            Statics.field2718 = var25;
            Statics.field2713 = var26;
            Statics.field2715 = var27;
            Statics.field2714 = var24;
            Statics.field1352 = class50.method2691(Statics.field1884, Statics.field1521, 1, 2048);
            Statics.field144 = new class49();
            Statics.field1352.method974(Statics.field144);
            Statics.field2027 = new class68(22050, Statics.field1090);
            class28.field668 = class142.field2172;
            class28.field667 = 35;
            field288 = 50;
        } else if (field288 == 50) {
            int var28 = 0;
            if (Statics.field792 == null) {
                Statics.field792 = class70.method427(Statics.field1827, Statics.field1820, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field229 == null) {
                Statics.field229 = class70.method427(Statics.field1827, Statics.field1820, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field91 == null) {
                Statics.field91 = class70.method427(Statics.field1827, Statics.field1820, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class28.field668 = class142.field2337 + var28 * 100 / 3 + "%";
                class28.field667 = 40;
            } else {
                Statics.field595 = new class145(true);
                class28.field668 = class142.field2174;
                class28.field667 = 40;
                field288 = 60;
            }
        } else if (field288 == 60) {
            int var29 = class28.method2693(Statics.field199, Statics.field1827);
            byte var30 = 8;
            if (var29 < var30) {
                class28.field668 = class142.field2175 + var29 * 100 / var30 + "%";
                class28.field667 = 50;
            } else {
                class28.field668 = class142.field2176;
                class28.field667 = 50;
                method1978(5);
                field288 = 70;
            }
        } else if (field288 == 70) {
            if (Statics.field293.method2804()) {
                class147 var32 = Statics.field293;
                Statics.field957 = var32;
                class147 var33 = Statics.field293;
                Statics.field891 = var33;
                class40.method430(Statics.field293, Statics.field958);
                class36.method1891(Statics.field293, Statics.field958, field407);
                Statics.method32(Statics.field293, Statics.field958);
                Statics.method453(Statics.field293, Statics.field958, field264, Statics.field792);
                class147 var34 = Statics.field293;
                class147 var35 = Statics.field292;
                class147 var36 = Statics.field67;
                Statics.field921 = var34;
                Statics.field901 = var35;
                Statics.field916 = var36;
                class39.method1786(Statics.field293, Statics.field958);
                class147 var37 = Statics.field293;
                Statics.field978 = var37;
                class46.method156(Statics.field293);
                class147 var38 = Statics.field591;
                class147 var39 = Statics.field958;
                class147 var40 = Statics.field1827;
                class147 var41 = Statics.field1820;
                Statics.field70 = var38;
                Statics.field2529 = var39;
                Statics.field2562 = var40;
                Statics.field2531 = var41;
                Statics.field2633 = new class152[Statics.field70.method2750()][];
                Statics.field2528 = new boolean[Statics.field70.method2750()];
                class147 var42 = Statics.field293;
                Statics.field1000 = var42;
                class147 var43 = Statics.field293;
                Statics.field989 = var43;
                class28.field668 = class142.field2178;
                class28.field667 = 60;
                field288 = 80;
            } else {
                class28.field668 = class142.field2177 + Statics.field293.method2836() + "%";
                class28.field667 = 60;
            }
        } else if (field288 == 80) {
            int var44 = 0;
            if (Statics.field710 == null) {
                Statics.field710 = class70.method145(Statics.field1827, "compass", "");
            } else {
                var44++;
            }
            if (Statics.field1525 == null) {
                Statics.field1525 = class70.method145(Statics.field1827, "mapedge", "");
            } else {
                var44++;
            }
            if (Statics.field2655 == null) {
                Statics.field2655 = class70.method1972(Statics.field1827, "mapscene", "");
            } else {
                var44++;
            }
            if (Statics.field241 == null) {
                Statics.field241 = class70.method442(Statics.field1827, "mapfunction", "");
            } else {
                var44++;
            }
            if (Statics.field589 == null) {
                Statics.field589 = class70.method442(Statics.field1827, "hitmarks", "");
            } else {
                var44++;
            }
            if (Statics.field49 == null) {
                Statics.field49 = class70.method442(Statics.field1827, "headicons_pk", "");
            } else {
                var44++;
            }
            if (Statics.field166 == null) {
                Statics.field166 = class70.method442(Statics.field1827, "headicons_prayer", "");
            } else {
                var44++;
            }
            if (Statics.field1869 == null) {
                Statics.field1869 = class70.method442(Statics.field1827, "headicons_hint", "");
            } else {
                var44++;
            }
            if (Statics.field239 == null) {
                Statics.field239 = class70.method442(Statics.field1827, "mapmarker", "");
            } else {
                var44++;
            }
            if (Statics.field1125 == null) {
                Statics.field1125 = class70.method442(Statics.field1827, "cross", "");
            } else {
                var44++;
            }
            if (Statics.field125 == null) {
                Statics.field125 = class70.method442(Statics.field1827, "mapdots", "");
            } else {
                var44++;
            }
            if (Statics.field1284 == null) {
                Statics.field1284 = class70.method1972(Statics.field1827, "scrollbar", "");
            } else {
                var44++;
            }
            if (Statics.field237 == null) {
                Statics.field237 = class70.method1972(Statics.field1827, "mod_icons", "");
            } else {
                var44++;
            }
            if (Statics.field622 == null) {
                Statics.field622 = class70.method496(Statics.field1827, "mapback", "");
            } else {
                var44++;
            }
            if (var44 < 14) {
                class28.field668 = class142.field2179 + var44 * 100 / 14 + "%";
                class28.field667 = 70;
            } else {
                Statics.field2894 = Statics.field237;
                Statics.field1525.method1427();
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 41.0D) - 20;
                for (int var49 = 0; var49 < Statics.field241.length; var49++) {
                    Statics.field241[var49].method1426(var45 + var48, var46 + var48, var47 + var48);
                }
                Statics.field2655[0].method1577(var45 + var48, var46 + var48, var47 + var48);
                method444();
                class28.field668 = class142.field2180;
                class28.field667 = 70;
                field288 = 90;
            }
        } else if (field288 == 90) {
            if (Statics.field2874.method2804()) {
                class88 var50 = new class88(Statics.field2874, Statics.field1827, 20, 0.8D, field407 ? 64 : 128);
                class84.method1795(var50);
                class84.method1829(0.8D);
                class28.field668 = class142.field2182;
                class28.field667 = 90;
                field288 = 110;
            } else {
                class28.field668 = class142.field2346 + Statics.field2874.method2836() + "%";
                class28.field667 = 90;
            }
        } else if (field288 == 110) {
            Statics.field174 = new class12();
            Statics.field1884.method2492(Statics.field174, 10);
            class28.field668 = class142.field2183;
            class28.field667 = 94;
            field288 = 120;
        } else if (field288 == 120) {
            if (Statics.field199.method2762("huffman", "")) {
                class102 var51 = new class102(Statics.field199.method2756("huffman", ""));
                class189.method815(var51);
                class28.field668 = class142.field2199;
                class28.field667 = 96;
                field288 = 130;
            } else {
                class28.field668 = class142.field2371 + "%";
                class28.field667 = 96;
            }
        } else if (field288 == 130) {
            if (!Statics.field591.method2804()) {
                class28.field668 = class142.field2236 + Statics.field591.method2836() * 4 / 5 + "%";
                class28.field667 = 100;
            } else if (!Statics.field2051.method2804()) {
                class28.field668 = class142.field2236 + (80 + Statics.field2051.method2836() / 6) + "%";
                class28.field667 = 100;
            } else if (Statics.field1820.method2804()) {
                class28.field668 = class142.field2187;
                class28.field667 = 100;
                field288 = 140;
            } else {
                class28.field668 = class142.field2236 + (96 + Statics.field1820.method2836() / 20) + "%";
                class28.field667 = 100;
            }
        } else if (field288 == 140) {
            method1978(10);
        }
    }

    @ObfuscatedName("av.o(IZZZB)Lei;")
    public static class147 method663(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2098 != null) {
            var4 = new class121(arg0, class136.field2098, Statics.field2037[arg0], 1000000);
        }
        return new class147(var4, Statics.field141, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("m.t(I)V")
    public static void method444() {
        Statics.field28 = new int[33];
        Statics.field1491 = new int[33];
        Statics.field227 = new int[151];
        Statics.field2053 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field622.field1325[Statics.field622.field1324 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field28[var0] = var1;
            Statics.field1491[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field622.field1325[Statics.field622.field1324 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field227[var4 - 5] = var5 - 25;
            Statics.field2053[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("r.c(I)V")
    public static final void method40() {
        try {
            if (field296 == 0) {
                if (Statics.field329 != null) {
                    Statics.field329.method2627();
                    Statics.field329 = null;
                }
                Statics.field955 = null;
                field315 = false;
                field486 = 0;
                field296 = 1;
            }
            if (field296 == 1) {
                if (Statics.field955 == null) {
                    Statics.field955 = Statics.field1884.method2505(Statics.field220, Statics.field627);
                }
                if (Statics.field955.field2071 == 2) {
                    throw new IOException();
                }
                if (Statics.field955.field2071 == 1) {
                    Statics.field329 = new class130((Socket) Statics.field955.field2075, Statics.field1884);
                    Statics.field955 = null;
                    field296 = 2;
                }
            }
            if (field296 == 2) {
                field304.field1847 = 0;
                field304.method2116(14);
                Statics.field329.method2613(field304.field1849, 0, 1);
                field306.field1847 = 0;
                field296 = 3;
            }
            if (field296 == 3) {
                if (Statics.field2102 != null) {
                    Statics.field2102.method982();
                }
                if (Statics.field1352 != null) {
                    Statics.field1352.method982();
                }
                int var0 = Statics.field329.method2612();
                if (Statics.field2102 != null) {
                    Statics.field2102.method982();
                }
                if (Statics.field1352 != null) {
                    Statics.field1352.method982();
                }
                if (var0 != 0) {
                    method2390(var0);
                    return;
                }
                field306.field1847 = 0;
                field296 = 5;
            }
            if (field296 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field304.field1847 = 0;
                field304.method2116(1);
                field304.method2116(class28.field665.method433());
                field304.method2119(var1[0]);
                field304.method2119(var1[1]);
                field304.method2119(var1[2]);
                field304.method2119(var1[3]);
                switch(class28.field665.field2415) {
                    case 0:
                        field304.field1847 += 8;
                        break;
                    case 1:
                        field304.method2119((Integer) Statics.field1921.field139.get(class197.method1982(class28.field680)));
                        field304.field1847 += 4;
                        break;
                    case 2:
                    case 3:
                        field304.method2118(Statics.field1122);
                        field304.field1847 += 5;
                }
                field304.method2121(class28.field674);
                field304.method2148(class5.field69, class5.field65);
                field355.field1847 = 0;
                if (field268 == 40) {
                    field355.method2116(18);
                } else {
                    field355.method2116(16);
                }
                field355.method2270(0);
                int var2 = field355.field1847;
                field355.method2119(52);
                field355.method2124(field304.field1849, 0, field304.field1847);
                int var3 = field355.field1847;
                field355.method2121(class28.field680);
                field355.method2116(field407 ? 1 : 0);
                class110 var4 = field355;
                byte[] var5 = new byte[24];
                try {
                    class136.field2097.method3454(0L);
                    class136.field2097.method3456(var5);
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
                var4.method2124(var5, 0, 24);
                class107 var9 = new class107(Statics.field595.method2729());
                Statics.field595.method2728(var9);
                field355.method2124(var9.field1849, 0, var9.field1849.length);
                field355.method2119(Statics.field292.field2471);
                field355.method2119(Statics.field67.field2471);
                field355.method2119(Statics.field293.field2471);
                field355.method2119(Statics.field591.field2471);
                field355.method2119(Statics.field71.field2471);
                field355.method2119(Statics.field436.field2471);
                field355.method2119(Statics.field940.field2471);
                field355.method2119(Statics.field958.field2471);
                field355.method2119(Statics.field1827.field2471);
                field355.method2119(Statics.field2874.field2471);
                field355.method2119(Statics.field199.field2471);
                field355.method2119(Statics.field2873.field2471);
                field355.method2119(Statics.field2051.field2471);
                field355.method2119(Statics.field1820.field2471);
                field355.method2119(Statics.field1271.field2471);
                field355.method2119(Statics.field2114.field2471);
                field355.method2146(var1, var3, field355.field1847);
                field355.method2150(field355.field1847 - var2);
                Statics.field329.method2613(field355.field1849, 0, field355.field1847);
                field304.method2368(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field306.method2368(var1);
                field296 = 6;
            }
            if (field296 == 6 && Statics.field329.method2607() > 0) {
                int var11 = Statics.field329.method2612();
                if (var11 == 21 && field268 == 20) {
                    field296 = 7;
                } else if (var11 == 2) {
                    field296 = 9;
                } else if (var11 == 15 && field268 == 40) {
                    field304.field1847 = 0;
                    field306.field1847 = 0;
                    field308 = -1;
                    field312 = -1;
                    field313 = -1;
                    field357 = -1;
                    field314 = 0;
                    field309 = 0;
                    field277 = 0;
                    field408 = 0;
                    field410 = false;
                    field512 = 0;
                    field494 = 0;
                    for (int var12 = 0; var12 < field383.length; var12++) {
                        if (field383[var12] != null) {
                            field383[var12].field757 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field300.length; var13++) {
                        if (field300[var13] != null) {
                            field300[var13].field757 = -1;
                        }
                    }
                    Statics.method1872();
                    method1978(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field470[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field397 < 1) {
                    field397++;
                    field296 = 0;
                } else {
                    method2390(var11);
                    return;
                }
            }
            if (field296 == 7 && Statics.field329.method2607() > 0) {
                field299 = (Statics.field329.method2612() + 3) * 60;
                field296 = 8;
            }
            if (field296 == 8) {
                field486 = 0;
                class28.method1312(class142.field2191, class142.field2382, field299 / 60 + class142.field2185);
                if (--field299 <= 0) {
                    field296 = 0;
                }
            } else {
                if (field296 == 9 && Statics.field329.method2607() >= 13) {
                    boolean var15 = Statics.field329.method2612() == 1;
                    Statics.field329.method2608(field306.field1849, 0, 4);
                    field306.field1847 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = field306.method2370() << 24;
                        int var18 = var17 | field306.method2370() << 16;
                        int var19 = var18 | field306.method2370() << 8;
                        int var20 = var19 | field306.method2370();
                        int var21 = class197.method1982(class28.field680);
                        if (Statics.field1921.field139.size() >= 10 && !Statics.field1921.field139.containsKey(var21)) {
                            Iterator var22 = Statics.field1921.field139.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field1921.field139.put(var21, var20);
                        class9.method552();
                    }
                    field432 = Statics.field329.method2612();
                    field287 = Statics.field329.method2612() == 1;
                    field389 = Statics.field329.method2612();
                    field389 <<= 0x8;
                    field389 += Statics.field329.method2612();
                    field321 = Statics.field329.method2612();
                    Statics.field329.method2608(field306.field1849, 0, 1);
                    field306.field1847 = 0;
                    field308 = field306.method2370();
                    Statics.field329.method2608(field306.field1849, 0, 2);
                    field306.field1847 = 0;
                    field314 = field306.method2132();
                    if (field321 == 1) {
                        try {
                            class119.method2453(Statics.field475, "zap");
                        } catch (Throwable var39) {
                        }
                    } else {
                        try {
                            client var24 = Statics.field475;
                            JSObject.getWindow(var24).call("unzap", (Object[]) null);
                        } catch (Throwable var38) {
                        }
                    }
                    field296 = 10;
                }
                if (field296 != 10) {
                    field486++;
                    if (field486 > 2000) {
                        if (field397 < 1) {
                            if (Statics.field627 == Statics.field1862) {
                                Statics.field627 = Statics.field1001;
                            } else {
                                Statics.field627 = Statics.field1862;
                            }
                            field397++;
                            field296 = 0;
                        } else {
                            method2390(-3);
                        }
                    }
                } else if (Statics.field329.method2607() >= field314) {
                    field306.field1847 = 0;
                    Statics.field329.method2608(field306.field1849, 0, field314);
                    field411 = -1L;
                    field274 = -1;
                    Statics.field174.field173 = 0;
                    Statics.field2055 = true;
                    field275 = true;
                    field516 = -1L;
                    class187.field2875 = new class177();
                    field304.field1847 = 0;
                    field306.field1847 = 0;
                    field308 = -1;
                    field312 = -1;
                    field313 = -1;
                    field357 = -1;
                    field309 = 0;
                    field277 = 0;
                    field438 = 0;
                    field278 = 0;
                    field408 = 0;
                    field410 = false;
                    class127.method1053(0);
                    class10.field154.clear();
                    class10.field151.method3233();
                    class10.field152.method3270();
                    class10.field153 = 0;
                    field419 = 0;
                    field421 = false;
                    field502 = 0;
                    field328 = (int) (Math.random() * 100.0D) - 50;
                    field330 = (int) (Math.random() * 110.0D) - 55;
                    field332 = (int) (Math.random() * 80.0D) - 40;
                    field335 = (int) (Math.random() * 120.0D) - 60;
                    field345 = (int) (Math.random() * 30.0D) - 20;
                    field447 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field512 = 0;
                    field489 = -1;
                    field494 = 0;
                    field495 = 0;
                    field429 = class18.field528;
                    field384 = 0;
                    field301 = 0;
                    for (int var26 = 0; var26 < 2048; var26++) {
                        field383[var26] = null;
                        field388[var26] = null;
                    }
                    for (int var27 = 0; var27 < 32768; var27++) {
                        field300[var27] = null;
                    }
                    Statics.field391 = field383[2047] = new class3();
                    field398 = -1;
                    field305.method3264();
                    field291.method3264();
                    for (int var28 = 0; var28 < 4; var28++) {
                        for (int var29 = 0; var29 < 104; var29++) {
                            for (int var30 = 0; var30 < 104; var30++) {
                                field399[var28][var29][var30] = null;
                            }
                        }
                    }
                    field402 = new class177();
                    field515 = 0;
                    field514 = 0;
                    field518 = 0;
                    for (int var31 = 0; var31 < Statics.field1061; var31++) {
                        class46 var32 = class46.method2054(var31);
                        if (var32 != null) {
                            class154.field2663[var31] = 0;
                            class154.field2664[var31] = 0;
                        }
                    }
                    for (int var33 = 0; var33 < field461.length; var33++) {
                        field461[var33] = -1;
                    }
                    field307 = -1;
                    if (field425 != -1) {
                        Statics.method154(field425);
                    }
                    for (class4 var34 = (class4) field297.method3210(); var34 != null; var34 = (class4) field297.method3207()) {
                        method81(var34, true);
                    }
                    field425 = -1;
                    field297 = new class174(8);
                    field265 = null;
                    field410 = false;
                    field408 = 0;
                    field520.method2944((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var35 = 0; var35 < 8; var35++) {
                        field395[var35] = null;
                        field365[var35] = false;
                    }
                    Statics.method1872();
                    field269 = true;
                    for (int var36 = 0; var36 < 100; var36++) {
                        field470[var36] = true;
                    }
                    field487 = null;
                    Statics.field1357 = 0;
                    Statics.field1887 = null;
                    Statics.field534 = -1;
                    method215(false);
                    field308 = -1;
                }
            }
        } catch (IOException var41) {
            if (field397 < 1) {
                if (Statics.field627 == Statics.field1862) {
                    Statics.field627 = Statics.field1001;
                } else {
                    Statics.field627 = Statics.field1862;
                }
                field397++;
                field296 = 0;
            } else {
                method2390(-2);
            }
        }
    }

    @ObfuscatedName("dn.d(II)V")
    public static void method2390(int arg0) {
        if (arg0 == -3) {
            class28.method1312(class142.field2194, class142.field2195, class142.field2374);
        } else if (arg0 == -2) {
            class28.method1312(class142.field2333, class142.field2198, class142.field2387);
        } else if (arg0 == -1) {
            class28.method1312(class142.field2197, class142.field2201, class142.field2202);
        } else if (arg0 == 3) {
            class28.method1312(class142.field2203, class142.field2369, class142.field2205);
        } else if (arg0 == 4) {
            class28.method1312(class142.field2206, class142.field2207, class142.field2235);
        } else if (arg0 == 5) {
            class28.method1312(class142.field2209, class142.field2210, class142.field2211);
        } else if (arg0 == 6) {
            class28.method1312(class142.field2193, class142.field2213, class142.field2253);
        } else if (arg0 == 7) {
            class28.method1312(class142.field2215, class142.field2229, class142.field2217);
        } else if (arg0 == 8) {
            class28.method1312(class142.field2353, class142.field2257, class142.field2155);
        } else if (arg0 == 9) {
            class28.method1312(class142.field2227, class142.field2222, class142.field2383);
        } else if (arg0 == 10) {
            class28.method1312(class142.field2224, class142.field2186, class142.field2226);
        } else if (arg0 == 11) {
            class28.method1312(class142.field2376, class142.field2273, class142.field2401);
        } else if (arg0 == 12) {
            class28.method1312(class142.field2230, class142.field2231, class142.field2232);
        } else if (arg0 == 13) {
            class28.method1312(class142.field2163, class142.field2234, class142.field2264);
        } else if (arg0 == 14) {
            class28.method1312(class142.field2221, class142.field2237, class142.field2320);
        } else if (arg0 == 16) {
            class28.method1312(class142.field2397, class142.field2240, class142.field2241);
        } else if (arg0 == 17) {
            class28.method1312(class142.field2242, class142.field2243, class142.field2244);
        } else if (arg0 == 18) {
            class28.method1312(class142.field2245, class142.field2246, class142.field2247);
        } else if (arg0 == 19) {
            class28.method1312(class142.field2248, class142.field2290, class142.field2250);
        } else if (arg0 == 20) {
            class28.method1312(class142.field2216, class142.field2252, class142.field2225);
        } else if (arg0 == 22) {
            class28.method1312(class142.field2254, class142.field2255, class142.field2256);
        } else if (arg0 == 23) {
            class28.method1312(class142.field2173, class142.field2388, class142.field2259);
        } else if (arg0 == 24) {
            class28.method1312(class142.field2260, class142.field2261, class142.field2262);
        } else if (arg0 == 25) {
            class28.method1312(class142.field2263, class142.field2196, class142.field2265);
        } else if (arg0 == 26) {
            class28.method1312(class142.field2266, class142.field2267, class142.field2390);
        } else if (arg0 == 27) {
            class28.method1312(class142.field2159, class142.field2270, class142.field2271);
        } else if (arg0 == 31) {
            class28.method1312(class142.field2278, class142.field2279, class142.field2269);
        } else if (arg0 == 32) {
            class28.method1312(class142.field2281, class142.field2282, class142.field2394);
        } else if (arg0 == 37) {
            class28.method1312(class142.field2284, class142.field2223, class142.field2208);
        } else if (arg0 == 38) {
            class28.method1312(class142.field2287, class142.field2238, class142.field2289);
        } else if (arg0 == 55) {
            class28.method1312(class142.field2181, class142.field2291, class142.field2292);
        } else if (arg0 == 56) {
            class28.method1312(class142.field2286, class142.field2363, class142.field2295);
            method1978(11);
            return;
        } else if (arg0 == 57) {
            class28.method1312(class142.field2296, class142.field2297, class142.field2298);
            method1978(11);
            return;
        } else {
            class28.method1312(class142.field2299, class142.field2300, class142.field2219);
        }
        method1978(10);
    }

    @ObfuscatedName("do.g(B)V")
    public static final void method2552() {
        if (Statics.field329 != null) {
            Statics.field329.method2627();
            Statics.field329 = null;
        }
        method1871();
        Statics.field1257.method1607();
        for (int var0 = 0; var0 < 4; var0++) {
            field324[var0].method3482();
        }
        System.gc();
        class161.method2553(2);
        field498 = -1;
        field499 = false;
        for (class20 var1 = (class20) class20.field560.method3236(); var1 != null; var1 = (class20) class20.field560.method3243()) {
            if (var1.field558 != null) {
                Statics.field144.method948(var1.field558);
                var1.field558 = null;
            }
            if (var1.field563 != null) {
                Statics.field144.method948(var1.field563);
                var1.field563 = null;
            }
        }
        class20.field560.method3264();
        method1978(10);
    }

    @ObfuscatedName("co.s(I)V")
    public static final void method1871() {
        class41.field972.method3170();
        class37.method713();
        class40.method2419();
        class36.method2709();
        class35.field806.method3170();
        class35.field812.method3170();
        class45.method2056();
        class38.method477();
        class39.method2437();
        class42.field976.method3170();
        class46.field1059.method3170();
        class157.field2681.method3170();
        class152.field2532.method3170();
        class152.field2533.method3170();
        class152.field2534.method3170();
        ((class88) Statics.field1465).method1878();
        class19.field545.method3170();
        Statics.field292.method2752();
        Statics.field67.method2752();
        Statics.field591.method2752();
        Statics.field71.method2752();
        Statics.field436.method2752();
        Statics.field940.method2752();
        Statics.field958.method2752();
        Statics.field1827.method2752();
        Statics.field2874.method2752();
        Statics.field199.method2752();
        Statics.field2873.method2752();
        Statics.field2051.method2752();
    }

    @ObfuscatedName("y.m(I)V")
    public static final void method27() {
        if (field438 > 0) {
            method2552();
        } else {
            method1978(40);
            Statics.field1860 = Statics.field329;
            Statics.field329 = null;
        }
    }

    @ObfuscatedName("aw.u(I)V")
    public static final void method682() {
        if (Statics.field1352 != null) {
            Statics.field1352.method976();
        }
        if (Statics.field2102 != null) {
            Statics.field2102.method976();
        }
    }

    @ObfuscatedName("z.p(B)V")
    public static final void method5() {
        for (int var0 = 0; var0 < field502; var0++) {
            int var10002 = field505[var0]--;
            if (field505[var0] >= -10) {
                class52 var2 = field507[var0];
                if (var2 == null) {
                    class52 var10000 = (class52) null;
                    var2 = class52.method1022(Statics.field71, field503[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field505[var0] += var2.method1035();
                    field507[var0] = var2;
                }
                if (field505[var0] < 0) {
                    int var9;
                    if (field479[var0] == 0) {
                        var9 = field415;
                    } else {
                        int var3 = (field479[var0] & 0xFF) * 128;
                        int var4 = field479[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field391.field747;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field479[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field391.field735;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field505[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field501 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method1026().method1065(Statics.field2027);
                        class58 var11 = class58.method1088(var10, 100, var9);
                        var11.method1091(field504[var0] - 1);
                        Statics.field144.method957(var11);
                    }
                    field505[var0] = -100;
                }
            } else {
                field502--;
                for (int var1 = var0; var1 < field502; var1++) {
                    field503[var1] = field503[var1 + 1];
                    field507[var1] = field507[var1 + 1];
                    field504[var1] = field504[var1 + 1];
                    field505[var1] = field505[var1 + 1];
                    field479[var1] = field479[var1 + 1];
                }
                var0--;
            }
        }
        if (!field499) {
            return;
        }
        boolean var12;
        if (class161.field2716 == 0) {
            var12 = Statics.field2714.method3130();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field497 != 0 && field498 != -1) {
                class161.method620(Statics.field940, field498, 0, field497, false);
            }
            field499 = false;
        }
    }

    @ObfuscatedName("ae.l(Laq;IIII)V")
    public static void method565(class38 arg0, int arg1, int arg2, int arg3) {
        if (field502 >= 50 || field501 == 0 || arg0.field902 == null || arg1 >= arg0.field902.length) {
            return;
        }
        int var4 = arg0.field902[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field503[field502] = var5;
        field504[field502] = var6;
        field505[field502] = 0;
        field507[field502] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field479[field502] = (var8 << 16) + (var9 << 8) + var7;
        field502++;
    }

    @ObfuscatedName("ac.w(II)V")
    public static void method885(int arg0) {
        if (arg0 == -1 && !field499) {
            class161.method2717();
        } else if (arg0 != -1 && field498 != arg0 && field497 != 0 && !field499) {
            class147 var1 = Statics.field940;
            int var2 = field497;
            class161.field2716 = 1;
            Statics.field1004 = var1;
            Statics.field1285 = arg0;
            Statics.field979 = 0;
            Statics.field2121 = var2;
            Statics.field1677 = false;
            Statics.field2886 = 2;
        }
        field498 = arg0;
    }

    @ObfuscatedName("ct.x(IIB)V")
    public static void method1890(int arg0, int arg1) {
        if (field497 != 0 && arg0 != -1) {
            class161.method620(Statics.field2873, arg0, 0, field497, false);
            field499 = true;
        }
    }

    @ObfuscatedName("ef.aj(IIB)V")
    public static final void method2692(int arg0, int arg1) {
        if (field512 != 0 && field512 != 3 || class127.field2019 != 1 && Statics.field58 || class127.field2019 != 4) {
            return;
        }
        int var2 = class127.field2020 - 25 - arg0;
        int var3 = class127.field2021 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field447 + field335 & 0x7FF;
        int var5 = class84.field1476[var4];
        int var6 = class84.field1471[var4];
        int var7 = (field345 + 256) * var5 >> 8;
        int var8 = (field345 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field391.field747 + var9 >> 7;
        int var12 = Statics.field391.field735 - var10 >> 7;
        field304.method2369(126);
        field304.method2116(18);
        field304.method2158(Statics.field316 + var12);
        field304.method2256(class124.field1977[82] ? (class124.field1977[81] ? 2 : 1) : 0);
        field304.method2160(Statics.field88 + var11);
        field304.method2116(var2);
        field304.method2116(var3);
        field304.method2270(field447);
        field304.method2116(57);
        field304.method2116(field335);
        field304.method2116(field345);
        field304.method2116(89);
        field304.method2270(Statics.field391.field747);
        field304.method2270(Statics.field391.field735);
        field304.method2116(63);
        field494 = var11;
        field495 = var12;
    }

    @ObfuscatedName("client.al(I)V")
    public static final void method431() {
        for (int var0 = -1; var0 < field384; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field385[var0];
            }
            class3 var2 = field383[var1];
            if (var2 != null) {
                method768(var2, 1);
            }
        }
    }

    @ObfuscatedName("a.af(I)V")
    public static final void method113() {
        for (int var0 = 0; var0 < field301; var0++) {
            int var1 = field348[var0];
            class30 var2 = field300[var1];
            if (var2 != null) {
                method768(var2, var2.field703.field808);
            }
        }
    }

    @ObfuscatedName("at.ai(Lag;II)V")
    public static final void method768(class33 arg0, int arg1) {
        if (arg0.field778 > field280) {
            int var2 = arg0.field778 - field280;
            int var3 = arg0.field776 * 128 + arg0.field738 * 64;
            int var4 = arg0.field738 * 64 + arg0.field736 * 128;
            arg0.field747 += (var3 - arg0.field747) / var2;
            arg0.field735 += (var4 - arg0.field735) / var2;
            arg0.field790 = 0;
            if (arg0.field780 == 0) {
                arg0.field783 = 1024;
            }
            if (arg0.field780 == 1) {
                arg0.field783 = 1536;
            }
            if (arg0.field780 == 2) {
                arg0.field783 = 0;
            }
            if (arg0.field780 == 3) {
                arg0.field783 = 512;
            }
        } else if (arg0.field744 >= field280) {
            if (field280 == arg0.field744 || arg0.field785 == -1 || arg0.field791 != 0 || arg0.field766 + 1 > class38.method38(arg0.field785).field907[arg0.field753]) {
                int var5 = arg0.field744 - arg0.field778;
                int var6 = field280 - arg0.field778;
                int var7 = arg0.field776 * 128 + arg0.field738 * 64;
                int var8 = arg0.field738 * 64 + arg0.field736 * 128;
                int var9 = arg0.field775 * 128 + arg0.field738 * 64;
                int var10 = arg0.field777 * 128 + arg0.field738 * 64;
                arg0.field747 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field735 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field790 = 0;
            if (arg0.field780 == 0) {
                arg0.field783 = 1024;
            }
            if (arg0.field780 == 1) {
                arg0.field783 = 1536;
            }
            if (arg0.field780 == 2) {
                arg0.field783 = 0;
            }
            if (arg0.field780 == 3) {
                arg0.field783 = 512;
            }
            arg0.field768 = arg0.field783;
        } else {
            arg0.field741 = arg0.field739;
            if (arg0.field786 == 0) {
                arg0.field790 = 0;
            } else {
                label360: {
                    if (arg0.field785 != -1 && arg0.field791 == 0) {
                        class38 var11 = class38.method38(arg0.field785);
                        if (arg0.field769 > 0 && var11.field913 == 0) {
                            arg0.field790++;
                            break label360;
                        }
                        if (arg0.field769 <= 0 && var11.field917 == 0) {
                            arg0.field790++;
                            break label360;
                        }
                    }
                    int var12 = arg0.field747;
                    int var13 = arg0.field735;
                    int var14 = arg0.field787[arg0.field786 - 1] * 128 + arg0.field738 * 64;
                    int var15 = arg0.field779[arg0.field786 - 1] * 128 + arg0.field738 * 64;
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        if (var12 < var14) {
                            if (var13 < var15) {
                                arg0.field783 = 1280;
                            } else if (var13 > var15) {
                                arg0.field783 = 1792;
                            } else {
                                arg0.field783 = 1536;
                            }
                        } else if (var12 > var14) {
                            if (var13 < var15) {
                                arg0.field783 = 768;
                            } else if (var13 > var15) {
                                arg0.field783 = 256;
                            } else {
                                arg0.field783 = 512;
                            }
                        } else if (var13 < var15) {
                            arg0.field783 = 1024;
                        } else if (var13 > var15) {
                            arg0.field783 = 0;
                        }
                        int var16 = arg0.field783 - arg0.field768 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field761;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field742;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field765;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field789;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field742;
                        }
                        arg0.field741 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class30) {
                            var19 = ((class30) arg0).field703.field836;
                        }
                        if (var19) {
                            if (arg0.field783 != arg0.field768 && arg0.field757 == -1 && arg0.field734 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field786 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field786 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field790 > 0 && arg0.field786 > 1) {
                                var18 = 8;
                                arg0.field790--;
                            }
                        } else {
                            if (arg0.field786 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field786 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field790 > 0 && arg0.field786 > 1) {
                                var18 = 8;
                                arg0.field790--;
                            }
                        }
                        if (arg0.field748[arg0.field786 - 1]) {
                            var18 <<= 0x1;
                        }
                        if (var18 >= 8 && arg0.field742 == arg0.field741 && arg0.field746 != -1) {
                            arg0.field741 = arg0.field746;
                        }
                        if (var12 < var14) {
                            arg0.field747 += var18;
                            if (arg0.field747 > var14) {
                                arg0.field747 = var14;
                            }
                        } else if (var12 > var14) {
                            arg0.field747 -= var18;
                            if (arg0.field747 < var14) {
                                arg0.field747 = var14;
                            }
                        }
                        if (var13 < var15) {
                            arg0.field735 += var18;
                            if (arg0.field735 > var15) {
                                arg0.field735 = var15;
                            }
                        } else if (var13 > var15) {
                            arg0.field735 -= var18;
                            if (arg0.field735 < var15) {
                                arg0.field735 = var15;
                            }
                        }
                        if (arg0.field747 == var14 && arg0.field735 == var15) {
                            arg0.field786--;
                            if (arg0.field769 > 0) {
                                arg0.field769--;
                            }
                        }
                    } else {
                        arg0.field747 = var14;
                        arg0.field735 = var15;
                    }
                }
            }
        }
        if (arg0.field747 < 128 || arg0.field735 < 128 || arg0.field747 >= 13184 || arg0.field735 >= 13184) {
            arg0.field785 = -1;
            arg0.field774 = -1;
            arg0.field778 = 0;
            arg0.field744 = 0;
            arg0.field747 = arg0.field787[0] * 128 + arg0.field738 * 64;
            arg0.field735 = arg0.field779[0] * 128 + arg0.field738 * 64;
            arg0.method571();
        }
        if (Statics.field391 == arg0 && (arg0.field747 < 1536 || arg0.field735 < 1536 || arg0.field747 >= 11776 || arg0.field735 >= 11776)) {
            arg0.field785 = -1;
            arg0.field774 = -1;
            arg0.field778 = 0;
            arg0.field744 = 0;
            arg0.field747 = arg0.field787[0] * 128 + arg0.field738 * 64;
            arg0.field735 = arg0.field779[0] * 128 + arg0.field738 * 64;
            arg0.method571();
        }
        if (arg0.field734 != 0) {
            if (arg0.field757 != -1 && arg0.field757 < 32768) {
                class30 var20 = field300[arg0.field757];
                if (var20 != null) {
                    int var21 = arg0.field747 - var20.field747;
                    int var22 = arg0.field735 - var20.field735;
                    if (var21 != 0 || var22 != 0) {
                        arg0.field783 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field757 >= 32768) {
                int var23 = arg0.field757 - 32768;
                if (field389 == var23) {
                    var23 = 2047;
                }
                class3 var24 = field383[var23];
                if (var24 != null) {
                    int var25 = arg0.field747 - var24.field747;
                    int var26 = arg0.field735 - var24.field735;
                    if (var25 != 0 || var26 != 0) {
                        arg0.field783 = (int) (Math.atan2((double) var25, (double) var26) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field759 != 0 || arg0.field760 != 0) && (arg0.field786 == 0 || arg0.field790 > 0)) {
                int var27 = arg0.field747 - (arg0.field759 * 64 - Statics.field88 * 64 - Statics.field88 * 64);
                int var28 = arg0.field735 - (arg0.field760 * 64 - Statics.field316 * 64 - Statics.field316 * 64);
                if (var27 != 0 || var28 != 0) {
                    arg0.field783 = (int) (Math.atan2((double) var27, (double) var28) * 325.949D) & 0x7FF;
                }
                arg0.field759 = 0;
                arg0.field760 = 0;
            }
            int var29 = arg0.field783 - arg0.field768 & 0x7FF;
            if (var29 == 0) {
                arg0.field784 = 0;
            } else {
                arg0.field784++;
                if (var29 > 1024) {
                    arg0.field768 -= arg0.field734;
                    boolean var30 = true;
                    if (var29 < arg0.field734 || var29 > 2048 - arg0.field734) {
                        arg0.field768 = arg0.field783;
                        var30 = false;
                    }
                    if (arg0.field741 == arg0.field739 && (arg0.field784 > 25 || var30)) {
                        if (arg0.field740 == -1) {
                            arg0.field741 = arg0.field742;
                        } else {
                            arg0.field741 = arg0.field740;
                        }
                    }
                } else {
                    arg0.field768 += arg0.field734;
                    boolean var31 = true;
                    if (var29 < arg0.field734 || var29 > 2048 - arg0.field734) {
                        arg0.field768 = arg0.field783;
                        var31 = false;
                    }
                    if (arg0.field741 == arg0.field739 && (arg0.field784 > 25 || var31)) {
                        if (arg0.field758 == -1) {
                            arg0.field741 = arg0.field742;
                        } else {
                            arg0.field741 = arg0.field758;
                        }
                    }
                }
                arg0.field768 &= 0x7FF;
            }
        }
        method1889(arg0);
    }

    @ObfuscatedName("ct.ak(Lag;I)V")
    public static final void method1889(class33 arg0) {
        arg0.field743 = false;
        if (arg0.field741 != -1) {
            class38 var1 = class38.method38(arg0.field741);
            if (var1 == null || var1.field908 == null) {
                arg0.field741 = -1;
            } else {
                arg0.field763++;
                if (arg0.field762 < var1.field908.length && arg0.field763 > var1.field907[arg0.field762]) {
                    arg0.field763 = 1;
                    arg0.field762++;
                    method565(var1, arg0.field762, arg0.field747, arg0.field735);
                }
                if (arg0.field762 >= var1.field908.length) {
                    arg0.field763 = 0;
                    arg0.field762 = 0;
                    method565(var1, arg0.field762, arg0.field747, arg0.field735);
                }
            }
        }
        if (arg0.field774 != -1 && field280 >= arg0.field772) {
            if (arg0.field770 < 0) {
                arg0.field770 = 0;
            }
            int var2 = class39.method3319(arg0.field774).field929;
            if (var2 == -1) {
                arg0.field774 = -1;
            } else {
                class38 var3 = class38.method38(var2);
                if (var3 == null || var3.field908 == null) {
                    arg0.field774 = -1;
                } else {
                    arg0.field788++;
                    if (arg0.field770 < var3.field908.length && arg0.field788 > var3.field907[arg0.field770]) {
                        arg0.field788 = 1;
                        arg0.field770++;
                        method565(var3, arg0.field770, arg0.field747, arg0.field735);
                    }
                    if (arg0.field770 >= var3.field908.length && (arg0.field770 < 0 || arg0.field770 >= var3.field908.length)) {
                        arg0.field774 = -1;
                    }
                }
            }
        }
        if (arg0.field785 != -1 && arg0.field791 <= 1) {
            class38 var4 = class38.method38(arg0.field785);
            if (var4.field913 == 1 && arg0.field769 > 0 && arg0.field778 <= field280 && arg0.field744 < field280) {
                arg0.field791 = 1;
                return;
            }
        }
        if (arg0.field785 != -1 && arg0.field791 == 0) {
            class38 var5 = class38.method38(arg0.field785);
            if (var5 == null || var5.field908 == null) {
                arg0.field785 = -1;
            } else {
                arg0.field766++;
                if (arg0.field753 < var5.field908.length && arg0.field766 > var5.field907[arg0.field753]) {
                    arg0.field766 = 1;
                    arg0.field753++;
                    method565(var5, arg0.field753, arg0.field747, arg0.field735);
                }
                if (arg0.field753 >= var5.field908.length) {
                    arg0.field753 -= var5.field909;
                    arg0.field782++;
                    if (arg0.field782 >= var5.field915) {
                        arg0.field785 = -1;
                    } else if (arg0.field753 >= 0 && arg0.field753 < var5.field908.length) {
                        method565(var5, arg0.field753, arg0.field747, arg0.field735);
                    } else {
                        arg0.field785 = -1;
                    }
                }
                arg0.field743 = var5.field911;
            }
        }
        if (arg0.field791 > 0) {
            arg0.field791--;
        }
    }

    @ObfuscatedName("ae.ae(Ly;IIB)V")
    public static void method560(class3 arg0, int arg1, int arg2) {
        if (arg0.field785 == arg1 && arg1 != -1) {
            int var3 = class38.method38(arg1).field918;
            if (var3 == 1) {
                arg0.field753 = 0;
                arg0.field766 = 0;
                arg0.field791 = arg2;
                arg0.field782 = 0;
            }
            if (var3 == 2) {
                arg0.field782 = 0;
            }
        } else if (arg1 == -1 || arg0.field785 == -1 || class38.method38(arg1).field912 >= class38.method38(arg0.field785).field912) {
            arg0.field785 = arg1;
            arg0.field753 = 0;
            arg0.field766 = 0;
            arg0.field791 = arg2;
            arg0.field782 = 0;
            arg0.field769 = arg0.field786;
        }
    }

    @ObfuscatedName("a.ag(Ljava/lang/String;ZI)V")
    public static final void method115(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field229.method3341(arg0, 250);
        int var6 = Statics.field229.method3349(arg0, 250) * 13;
        class73.method1524(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1539(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field229.method3347(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2734(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1521.getGraphics();
                Statics.field200.method1338(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1521.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field468; var13++) {
            if (field473[var13] + field472[var13] > var9 && field473[var13] < var9 + var11 && field476[var13] + field474[var13] > var10 && field474[var13] < var10 + var12) {
                field471[var13] = true;
            }
        }
    }

    @ObfuscatedName("d.ar(Laf;I)V")
    public static final void method163(class29 arg0) {
        if (Statics.field391.field747 >> 7 == field494 && Statics.field391.field735 >> 7 == field495) {
            field494 = 0;
        }
        int var1 = field384;
        if (class29.field697 == arg0 || class29.field694 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field697 == arg0) {
                var3 = Statics.field391;
                var4 = 33538048;
            } else if (class29.field694 == arg0) {
                var3 = field383[field398];
                var4 = field398 << 14;
            } else {
                var3 = field383[field385[var2]];
                var4 = field385[var2] << 14;
                if (class29.field693 == arg0 && field398 == field385[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method16()) {
                var3.field47 = false;
                if ((field407 && field384 > 50 || field384 > 200) && class29.field697 != arg0 && var3.field741 == var3.field739) {
                    var3.field47 = true;
                }
                int var5 = var3.field747 >> 7;
                int var6 = var3.field735 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field42 == null || field280 < var3.field44 || field280 >= var3.field36) {
                        if ((var3.field747 & 0x7F) == 64 && (var3.field735 & 0x7F) == 64) {
                            if (field367 == field366[var5][var6]) {
                                continue;
                            }
                            field366[var5][var6] = field367;
                        }
                        var3.field30 = method107(var3.field747, var3.field735, Statics.field1494);
                        Statics.field1257.method1618(Statics.field1494, var3.field747, var3.field735, var3.field30, 60, var3, var3.field768, var4, var3.field743);
                    } else {
                        var3.field47 = false;
                        var3.field30 = method107(var3.field747, var3.field735, Statics.field1494);
                        Statics.field1257.method1606(Statics.field1494, var3.field747, var3.field735, var3.field30, 60, var3, var3.field768, var4, var3.field43, var3.field35, var3.field45, var3.field46);
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.an(ZB)V")
    public static final void method869(boolean arg0) {
        for (int var1 = 0; var1 < field301; var1++) {
            class30 var2 = field300[field348[var1]];
            int var3 = (field348[var1] << 14) + 536870912;
            if (var2 != null && var2.method16() && var2.field703.field827 == arg0 && var2.field703.method597()) {
                int var4 = var2.field747 >> 7;
                int var5 = var2.field735 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field738 == 1 && (var2.field747 & 0x7F) == 64 && (var2.field735 & 0x7F) == 64) {
                        if (field367 == field366[var4][var5]) {
                            continue;
                        }
                        field366[var4][var5] = field367;
                    }
                    if (!var2.field703.field835) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1257.method1618(Statics.field1494, var2.field747, var2.field735, method107(var2.field747 + (var2.field738 * 64 - 64), var2.field735 + (var2.field738 * 64 - 64), Statics.field1494), var2.field738 * 64 - 64 + 60, var2, var2.field768, var3, var2.field743);
                }
            }
        }
    }

    @ObfuscatedName("df.av(I)V")
    public static final void method2630() {
        for (class7 var0 = (class7) field305.method3236(); var0 != null; var0 = (class7) field305.method3243()) {
            if (Statics.field1494 != var0.field96 || field280 > var0.field105) {
                var0.method3309();
            } else if (field280 >= var0.field115) {
                if (var0.field113 > 0) {
                    class30 var1 = field300[var0.field113 - 1];
                    if (var1 != null && var1.field747 >= 0 && var1.field747 < 13312 && var1.field735 >= 0 && var1.field735 < 13312) {
                        var0.method92(var1.field747, var1.field735, method107(var1.field747, var1.field735, var0.field96) - var0.field100, field280);
                    }
                }
                if (var0.field113 < 0) {
                    int var2 = -var0.field113 - 1;
                    class3 var3;
                    if (field389 == var2) {
                        var3 = Statics.field391;
                    } else {
                        var3 = field383[var2];
                    }
                    if (var3 != null && var3.field747 >= 0 && var3.field747 < 13312 && var3.field735 >= 0 && var3.field735 < 13312) {
                        var0.method92(var3.field747, var3.field735, method107(var3.field747, var3.field735, var0.field96) - var0.field100, field280);
                    }
                }
                var0.method84(field340);
                Statics.field1257.method1618(Statics.field1494, (int) var0.field111, (int) var0.field108, (int) var0.field109, 60, var0, var0.field112, -1, false);
            }
        }
    }

    @ObfuscatedName("v.aw(S)V")
    public static final void method455() {
        for (class26 var0 = (class26) field291.method3236(); var0 != null; var0 = (class26) field291.method3243()) {
            if (Statics.field1494 != var0.field636 || var0.field638) {
                var0.method3309();
            } else if (field280 >= var0.field630) {
                var0.method492(field340);
                if (var0.field638) {
                    var0.method3309();
                } else {
                    Statics.field1257.method1618(var0.field636, var0.field632, var0.field633, var0.field634, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("h.aq(B)I")
    public static final int method28() {
        if (Statics.field1921.field140) {
            return Statics.field1494;
        }
        int var0 = 3;
        if (Statics.field1687 < 310) {
            int var1 = Statics.field1956 >> 7;
            int var2 = Statics.field1661 >> 7;
            int var3 = Statics.field391.field747 >> 7;
            int var4 = Statics.field391.field735 >> 7;
            if ((class6.field87[Statics.field1494][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1494;
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
                    if ((class6.field87[Statics.field1494][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1494;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field87[Statics.field1494][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1494;
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
                    if ((class6.field87[Statics.field1494][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1494;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field87[Statics.field1494][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1494;
                        }
                    }
                }
            }
        }
        if ((class6.field87[Statics.field1494][Statics.field391.field747 >> 7][Statics.field391.field735 >> 7] & 0x4) != 0) {
            var0 = Statics.field1494;
        }
        return var0;
    }

    @ObfuscatedName("cq.ad(III)V")
    public static final void method1788(int arg0, int arg1) {
        if (field278 == 2) {
            method3162((field270 - Statics.field88 << 7) + field284, (field282 - Statics.field316 << 7) + field263, field283 * 2);
            if (field368 > -1 && field280 % 20 < 10) {
                Statics.field1869[0].method1510(field368 + arg0 - 12, field369 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("au.at(Lag;IIIIIB)V")
    public static final void method868(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method16()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field703;
            if (var6.field803 != null) {
                var6 = var6.method596();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field384) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field33 != -1 || var8.field40 != -1) {
                method90(arg0, arg0.field767 + 15);
                if (field368 > -1) {
                    if (var8.field33 != -1) {
                        Statics.field49[var8.field33].method1510(field368 + arg2 - 12, field369 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field40 != -1) {
                        Statics.field166[var8.field40].method1510(field368 + arg2 - 12, field369 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field278 == 10 && field281 == field385[arg1]) {
                method90(arg0, arg0.field767 + 15);
                if (field368 > -1) {
                    Statics.field1869[1].method1510(field368 + arg2 - 12, field369 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field703;
            if (var9.field803 != null) {
                var9 = var9.method596();
            }
            if (var9.field830 >= 0 && var9.field830 < Statics.field166.length) {
                method90(arg0, arg0.field767 + 15);
                if (field368 > -1) {
                    Statics.field166[var9.field830].method1510(field368 + arg2 - 12, field369 + arg3 - 30);
                }
            }
            if (field278 == 1 && field279 == field348[arg1 - field384] && field280 % 20 < 10) {
                method90(arg0, arg0.field767 + 15);
                if (field368 > -1) {
                    Statics.field1869[0].method1510(field368 + arg2 - 12, field369 + arg3 - 28);
                }
            }
        }
        if (arg0.field749 != null && (arg1 >= field384 || field392 == 4 || !arg0.field773 && (field392 == 0 || field392 == 3 || field392 == 1 && method200(((class3) arg0).field32, false)))) {
            method90(arg0, arg0.field767);
            if (field368 > -1 && field356 < field484) {
                field285[field356] = Statics.field91.method3339(arg0.field749) / 2;
                field360[field356] = Statics.field91.field2896;
                field295[field356] = field368;
                field359[field356] = field369;
                field271[field356] = arg0.field750;
                field363[field356] = arg0.field751;
                field364[field356] = arg0.field745;
                field372[field356] = arg0.field749;
                field356++;
            }
        }
        if (arg0.field755 > field280) {
            method90(arg0, arg0.field767 + 15);
            if (field368 > -1) {
                int var10 = arg0.field756 * 30 / arg0.field771;
                if (var10 > 30) {
                    var10 = 30;
                } else if (var10 == 0 && arg0.field756 > 0) {
                    var10 = 1;
                }
                class73.method1524(field368 + arg2 - 15, field369 + arg3 - 3, var10, 5, 65280);
                class73.method1524(field368 + arg2 - 15 + var10, field369 + arg3 - 3, 30 - var10, 5, 16711680);
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            if (arg0.field754[var11] > field280) {
                method90(arg0, arg0.field767 / 2);
                if (field368 > -1) {
                    if (var11 == 1) {
                        field369 -= 20;
                    }
                    if (var11 == 2) {
                        field368 -= 15;
                        field369 -= 10;
                    }
                    if (var11 == 3) {
                        field368 += 15;
                        field369 -= 10;
                    }
                    Statics.field589[arg0.field737[var11]].method1510(field368 + arg2 - 12, field369 + arg3 - 12);
                    Statics.field792.method3346(Integer.toString(arg0.field752[var11]), field368 + arg2 - 1, field369 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("k.aa(Lag;II)V")
    public static final void method90(class33 arg0, int arg1) {
        method3162(arg0.field747, arg0.field735, arg1);
    }

    @ObfuscatedName("fr.ay(IIII)V")
    public static final void method3162(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field368 = -1;
            field369 = -1;
            return;
        }
        int var3 = method107(arg0, arg1, Statics.field1494) - arg2;
        int var4 = arg0 - Statics.field1956;
        int var5 = var3 - Statics.field531;
        int var6 = arg1 - Statics.field1661;
        int var7 = class84.field1476[Statics.field1687];
        int var8 = class84.field1471[Statics.field1687];
        int var9 = class84.field1476[Statics.field149];
        int var10 = class84.field1471[Statics.field149];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field368 = (var11 << 9) / var15 + 256;
            field369 = (var14 << 9) / var15 + 167;
        } else {
            field368 = -1;
            field369 = -1;
        }
    }

    @ObfuscatedName("n.am(IIII)I")
    public static final int method107(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field87[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field92[var5][var3][var4] + class6.field92[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field92[var5][var3][var4 + 1] + class6.field92[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("o.az(IIIIIII)V")
    public static final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class84.field1476[var6];
            int var12 = class84.field1471[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class84.field1476[var7];
            int var15 = class84.field1471[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1956 = arg0 - var8;
        Statics.field531 = arg1 - var9;
        Statics.field1661 = arg2 - var10;
        Statics.field1687 = arg3;
        Statics.field149 = arg4;
    }

    @ObfuscatedName("client.au(ZI)V")
    public static final void method215(boolean arg0) {
        field511 = arg0;
        if (!field511) {
            int var1 = field306.method2132();
            int var2 = field306.method2161();
            int var3 = field306.method2132();
            int var4 = (field314 - field306.field1847) / 16;
            Statics.field1356 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1356[var5][var6] = field306.method2217();
                }
            }
            int var7 = field306.method2130();
            int var8 = field306.method2161();
            Statics.field2912 = new int[var4];
            Statics.field451 = new int[var4];
            Statics.field2095 = new int[var4];
            Statics.field195 = new byte[var4][];
            Statics.field226 = new byte[var4][];
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
                        Statics.field2912[var10] = var13;
                        Statics.field451[var10] = Statics.field436.method2771("m" + var11 + "_" + var12);
                        Statics.field2095[var10] = Statics.field436.method2771("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1002(var8, var2, var7, var3, var1);
            return;
        }
        int var14 = field306.method2228();
        int var15 = field306.method2228();
        int var16 = field306.method2228();
        int var17 = field306.method2163();
        int var18 = field306.method2130();
        field306.method2371();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field306.method2388(1);
                    if (var22 == 1) {
                        field374[var19][var20][var21] = field306.method2388(26);
                    } else {
                        field374[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field306.method2373();
        int var23 = (field314 - field306.field1847) / 16;
        Statics.field1356 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field1356[var24][var25] = field306.method2217();
            }
        }
        Statics.field2912 = new int[var23];
        Statics.field451 = new int[var23];
        Statics.field2095 = new int[var23];
        Statics.field195 = new byte[var23][];
        Statics.field226 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field374[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2912[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2912[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field451[var26] = Statics.field436.method2771("m" + var35 + "_" + var36);
                            Statics.field2095[var26] = Statics.field436.method2771("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1002(var17, var16, var18, var14, var15);
    }

    @ObfuscatedName("ap.ac(IIIIII)V")
    public static final void method1002(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field534 == arg0 && Statics.field1063 == arg1 && field400 == arg2 || !field407) {
            return;
        }
        Statics.field534 = arg0;
        Statics.field1063 = arg1;
        field400 = arg2;
        if (!field407) {
            field400 = 0;
        }
        method1978(25);
        method115(class142.field2164, true);
        int var5 = Statics.field88;
        int var6 = Statics.field316;
        Statics.field88 = (arg0 - 6) * 8;
        Statics.field316 = (arg1 - 6) * 8;
        int var7 = Statics.field88 - var5;
        int var8 = Statics.field316 - var6;
        int var9 = Statics.field88;
        int var10 = Statics.field316;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field300[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field787[var13] -= var7;
                    var12.field779[var13] -= var8;
                }
                var12.field747 -= var7 * 128;
                var12.field735 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field383[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field787[var16] -= var7;
                    var15.field779[var16] -= var8;
                }
                var15.field747 -= var7 * 128;
                var15.field735 -= var8 * 128;
            }
        }
        Statics.field1494 = arg2;
        Statics.field391.method569(arg3, arg4, false);
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
                        field399[var27][var23][var24] = field399[var27][var25][var26];
                    } else {
                        field399[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field402.method3236(); var28 != null; var28 = (class15) field402.method3243()) {
            var28.field206 -= var7;
            var28.field207 -= var8;
            if (var28.field206 < 0 || var28.field207 < 0 || var28.field206 >= 104 || var28.field207 >= 104) {
                var28.method3309();
            }
        }
        if (field494 != 0) {
            field494 -= var7;
            field495 -= var8;
        }
        field502 = 0;
        field508 = false;
        field489 = -1;
        field291.method3264();
        field305.method3264();
    }

    @ObfuscatedName("b.ab(ZB)V")
    public static final void method95(boolean arg0) {
        method682();
        field310++;
        if (field310 < 50 && !arg0) {
            return;
        }
        field310 = 0;
        if (field315 || Statics.field329 == null) {
            return;
        }
        field304.method2369(112);
        try {
            Statics.field329.method2613(field304.field1849, 0, field304.field1847);
            field304.field1847 = 0;
        } catch (IOException var2) {
            field315 = true;
        }
    }

    @ObfuscatedName("g.ao(II)V")
    public static final void method435(int arg0) {
        int[] var1 = Statics.field571.field1307;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field87[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1257.method1609(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field87[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1257.method1609(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field571.method1425();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field87[arg0][var10][var9] & 0x18) == 0) {
                    method2443(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field87[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2443(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field376 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1257.method1636(Statics.field1494, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class36.method2079(var14).field867;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field324[Statics.field1494].field2936;
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
                        field361[field376] = Statics.field241[var15];
                        field491[field376] = var16;
                        field492[field376] = var17;
                        field376++;
                    }
                }
            }
        }
        Statics.field200.method1418();
    }

    @ObfuscatedName("da.ah(IIIIII)V")
    public static final void method2443(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1257.method1727(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1257.method1648(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field571.field1307;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method2079(var12);
            if (var13.field839 == -1) {
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
                class74 var14 = Statics.field2655[var13.field839];
                if (var14 != null) {
                    int var15 = (var13.field878 * 4 - var14.field1324) / 2;
                    int var16 = (var13.field854 * 4 - var14.field1328) / 2;
                    var14.method1586(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field854) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1257.method1635(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1257.method1648(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method2079(var21);
            if (var22.field839 != -1) {
                class74 var23 = Statics.field2655[var22.field839];
                if (var23 != null) {
                    int var24 = (var22.field878 * 4 - var23.field1324) / 2;
                    int var25 = (var22.field854 * 4 - var23.field1328) / 2;
                    var23.method1586(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field854) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field571.field1307;
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
        int var29 = Statics.field1257.method1636(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method2079(var30);
        if (var31.field839 == -1) {
            return;
        }
        class74 var32 = Statics.field2655[var31.field839];
        if (var32 != null) {
            int var33 = (var31.field878 * 4 - var32.field1324) / 2;
            int var34 = (var31.field854 * 4 - var32.field1328) / 2;
            var32.method1586(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field854) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bj.ap(I)Z")
    public static final boolean method1600() {
        if (Statics.field329 == null) {
            return false;
        }
        try {
            int var0 = Statics.field329.method2607();
            if (var0 == 0) {
                return false;
            }
            if (field308 == -1) {
                Statics.field329.method2608(field306.field1849, 0, 1);
                field306.field1847 = 0;
                field308 = field306.method2370();
                field314 = class166.field2802[field308];
                var0--;
            }
            if (field314 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field329.method2608(field306.field1849, 0, 1);
                field314 = field306.field1849[0] & 0xFF;
                var0--;
            }
            if (field314 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field329.method2608(field306.field1849, 0, 2);
                field306.field1847 = 0;
                field314 = field306.method2132();
                var0 -= 2;
            }
            if (var0 < field314) {
                return false;
            }
            field306.field1847 = 0;
            Statics.field329.method2608(field306.field1849, 0, field314);
            field309 = 0;
            field357 = field313;
            field313 = field312;
            field312 = field308;
            if (field308 == 146) {
                field515 = 1;
                field458 = field416;
                field308 = -1;
                return true;
            }
            if (field308 == 224) {
                int var1 = field306.method2217();
                int var2 = field306.method2165();
                class152 var3 = class152.method2559(var1);
                if (var3.field2644 != var2 || var2 == -1) {
                    var3.field2644 = var2;
                    var3.field2643 = 0;
                    var3.field2568 = 0;
                    method130(var3);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 37) {
                for (int var4 = 0; var4 < Statics.field1061; var4++) {
                    class46 var5 = class46.method2054(var4);
                    if (var5 != null) {
                        class154.field2663[var4] = 0;
                        class154.field2664[var4] = 0;
                    }
                }
                method618();
                field452 += 32;
                field308 = -1;
                return true;
            }
            if (field308 == 4) {
                method618();
                field430 = field306.method2130();
                field460 = field416;
                field308 = -1;
                return true;
            }
            if (field308 == 99) {
                int var6 = field306.method2228();
                int var7 = field306.method2135();
                class152 var8 = class152.method2559(var7);
                if (var8.field2612 != 1 || var8.field2634 != var6) {
                    var8.field2612 = 1;
                    var8.field2634 = var6;
                    method130(var8);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 55) {
                while (field306.field1847 < field314) {
                    int var9 = field306.method2130();
                    boolean var10 = (var9 & 0x1) == 1;
                    String var11 = field306.method2138();
                    String var12 = field306.method2138();
                    field306.method2138();
                    for (int var13 = 0; var13 < field518; var13++) {
                        class8 var14 = field519[var13];
                        if (var10) {
                            if (var12.equals(var14.field130)) {
                                var14.field130 = var11;
                                var14.field124 = var12;
                                var11 = null;
                                break;
                            }
                        } else if (var11.equals(var14.field130)) {
                            var14.field130 = var11;
                            var14.field124 = var12;
                            var11 = null;
                            break;
                        }
                    }
                    if (var11 != null && field518 < 400) {
                        class8 var15 = new class8();
                        field519[field518] = var15;
                        var15.field130 = var11;
                        var15.field124 = var12;
                        field518++;
                    }
                }
                field458 = field416;
                field308 = -1;
                return true;
            }
            if (field308 == 1) {
                Statics.field2039 = class117.method2486(field306.method2130());
                field308 = -1;
                return true;
            }
            if (field308 == 125) {
                int var16 = field306.method2154();
                int var17 = field306.method2154();
                int var18 = field306.method2156();
                Statics.field1494 = var16 >> 1;
                Statics.field391.method569(var17, var18, (var16 & 0x1) == 1);
                field308 = -1;
                return true;
            }
            if (field308 == 135) {
                method2552();
                field308 = -1;
                return false;
            }
            if (field308 == 190) {
                Statics.field1941 = field306.method2130();
                Statics.field1507 = field306.method2156();
                field308 = -1;
                return true;
            }
            if (field308 == 17) {
                String var19 = field306.method2138();
                String var20 = class190.method3343(class197.method3147(Statics.method1313(field306)));
                class10.method545(6, var19, var20);
                field308 = -1;
                return true;
            }
            if (field308 == 63) {
                field392 = field306.method2130();
                field480 = field306.method2130();
                field308 = -1;
                return true;
            }
            if (field308 == 240) {
                String var21 = field306.method2138();
                long var22 = field306.method2201();
                long var24 = (long) field306.method2132();
                long var26 = (long) field306.method2252();
                int var28 = field306.method2130();
                long var29 = (var24 << 32) + var26;
                boolean var31 = false;
                for (int var32 = 0; var32 < 100; var32++) {
                    if (field481[var32] == var29) {
                        var31 = true;
                        break;
                    }
                }
                if (var28 <= 1 && method129(var21)) {
                    var31 = true;
                }
                if (!var31 && field382 == 0) {
                    field481[field482] = var29;
                    field482 = (field482 + 1) % 100;
                    String var33 = class190.method3343(class197.method3147(Statics.method1313(field306)));
                    if (var28 == 2 || var28 == 3) {
                        class10.method2713(9, class2.method1971(1) + var21, var33, class196.method3515(var22));
                    } else if (var28 == 1) {
                        class10.method2713(9, class2.method1971(0) + var21, var33, class196.method3515(var22));
                    } else {
                        class10.method2713(9, var21, var33, class196.method3515(var22));
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 207) {
                int var34 = field314 + field306.field1847;
                int var35 = field306.method2132();
                int var36 = field306.method2132();
                if (field425 != var35) {
                    field425 = var35;
                    method9(field425);
                    class32.method470(field425);
                    for (int var37 = 0; var37 < 100; var37++) {
                        field470[var37] = true;
                    }
                }
                while (var36-- > 0) {
                    int var38 = field306.method2135();
                    int var39 = field306.method2132();
                    int var40 = field306.method2130();
                    class4 var41 = (class4) field297.method3214((long) var38);
                    if (var41 != null && var41.field62 != var39) {
                        method81(var41, true);
                        var41 = null;
                    }
                    if (var41 == null) {
                        var41 = method2723(var38, var39, var40);
                    }
                    var41.field60 = true;
                }
                for (class4 var42 = (class4) field297.method3210(); var42 != null; var42 = (class4) field297.method3207()) {
                    if (var42.field60) {
                        var42.field60 = false;
                    } else {
                        method81(var42, true);
                    }
                }
                field467 = new class174(512);
                while (field306.field1847 < var34) {
                    int var43 = field306.method2135();
                    int var44 = field306.method2132();
                    int var45 = field306.method2132();
                    int var46 = field306.method2135();
                    for (int var47 = var44; var47 <= var45; var47++) {
                        long var48 = ((long) var43 << 32) + (long) var47;
                        field467.method3208(new class179(var46), var48);
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 47) {
                field277 = field306.method2161() * 30;
                field460 = field416;
                field308 = -1;
                return true;
            }
            if (field308 == 28) {
                int var50 = field306.method2135();
                int var51 = field306.method2132();
                if (var50 < -70000) {
                    var51 += 32768;
                }
                class152 var52;
                if (var50 >= 0) {
                    var52 = class152.method2559(var50);
                } else {
                    var52 = null;
                }
                while (field306.field1847 < field314) {
                    int var53 = field306.method2197();
                    int var54 = field306.method2132();
                    int var55 = 0;
                    if (var54 != 0) {
                        var55 = field306.method2130();
                        if (var55 == 255) {
                            var55 = field306.method2135();
                        }
                    }
                    if (var52 != null && var53 >= 0 && var53 < var52.field2639.length) {
                        var52.field2639[var53] = var54;
                        var52.field2640[var53] = var55;
                    }
                    class14.method96(var51, var53, var54 - 1, var55);
                }
                if (var52 != null) {
                    method130(var52);
                }
                method618();
                field462[++field454 - 1 & 0x1F] = var51 & 0x7FFF;
                field308 = -1;
                return true;
            }
            if (field308 == 81) {
                field508 = false;
                for (int var56 = 0; var56 < 5; var56++) {
                    field509[var56] = false;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 188) {
                int var57 = field306.method2172();
                int var58 = field306.method2161();
                class152 var59 = class152.method2559(var57);
                if (var59 != null && var59.field2539 == 0) {
                    if (var58 > var59.field2553 - var59.field2547) {
                        var58 = var59.field2553 - var59.field2547;
                    }
                    if (var58 < 0) {
                        var58 = 0;
                    }
                    if (var59.field2551 != var58) {
                        var59.field2551 = var58;
                        method130(var59);
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 108) {
                int var60 = field306.method2132();
                int var61 = field306.method2172();
                class154.field2663[var60] = var61;
                if (class154.field2664[var60] != var61) {
                    class154.field2664[var60] = var61;
                    method79(var60);
                }
                field302[++field452 - 1 & 0x1F] = var60;
                field308 = -1;
                return true;
            }
            if (field308 == 98) {
                int var62 = field306.method2228();
                class14 var63 = (class14) class14.field203.method3214((long) var62);
                if (var63 != null) {
                    var63.method3309();
                }
                field462[++field454 - 1 & 0x1F] = var62 & 0x7FFF;
                field308 = -1;
                return true;
            }
            if (field308 == 110) {
                String var64 = field306.method2138();
                int var65 = field306.method2135();
                class152 var66 = class152.method2559(var65);
                if (!var64.equals(var66.field2584)) {
                    var66.field2584 = var64;
                    method130(var66);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 64) {
                if (field425 != -1) {
                    method2487(field425, 0);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 209) {
                field311 = field416;
                if (field314 == 0) {
                    field487 = null;
                    field488 = null;
                    Statics.field1357 = 0;
                    Statics.field1887 = null;
                    field308 = -1;
                    return true;
                }
                field488 = field306.method2138();
                long var67 = field306.method2201();
                long var69 = var67;
                String var71;
                if (var67 <= 0L || var67 >= 6582952005840035281L) {
                    var71 = null;
                } else if (var67 % 37L == 0L) {
                    var71 = null;
                } else {
                    int var72 = 0;
                    for (long var73 = var67; var73 != 0L; var73 /= 37L) {
                        var72++;
                    }
                    StringBuilder var75 = new StringBuilder(var72);
                    while (var69 != 0L) {
                        long var76 = var69;
                        var69 /= 37L;
                        var75.append(class196.field2949[(int) (var76 - var69 * 37L)]);
                    }
                    var71 = var75.reverse().toString();
                }
                field487 = var71;
                Statics.field148 = field306.method2131();
                int var78 = field306.method2130();
                if (var78 == 255) {
                    field308 = -1;
                    return true;
                }
                Statics.field1357 = var78;
                class21[] var79 = new class21[100];
                for (int var80 = 0; var80 < Statics.field1357; var80++) {
                    var79[var80] = new class21();
                    var79[var80].field577 = field306.method2138();
                    var79[var80].field569 = class198.method2067(var79[var80].field577, Statics.field2697);
                    var79[var80].field568 = field306.method2132();
                    var79[var80].field570 = field306.method2131();
                    field306.method2138();
                    if (var79[var80].field577.equals(Statics.field391.field32)) {
                        Statics.field888 = var79[var80].field570;
                    }
                }
                boolean var81 = false;
                int var82 = Statics.field1357;
                while (var82 > 0) {
                    boolean var83 = true;
                    var82--;
                    for (int var84 = 0; var84 < var82; var84++) {
                        if (var79[var84].field569.compareTo(var79[var84 + 1].field569) > 0) {
                            class21 var85 = var79[var84];
                            var79[var84] = var79[var84 + 1];
                            var79[var84 + 1] = var85;
                            var83 = false;
                        }
                    }
                    if (var83) {
                        break;
                    }
                }
                Statics.field1887 = var79;
                field308 = -1;
                return true;
            }
            if (field308 == 192) {
                int var86 = field306.method2161();
                byte var87 = field306.method2131();
                class154.field2663[var86] = var87;
                if (class154.field2664[var86] != var87) {
                    class154.field2664[var86] = var87;
                    method79(var86);
                }
                field302[++field452 - 1 & 0x1F] = var86;
                field308 = -1;
                return true;
            }
            if (field308 == 27) {
                field362 = 0;
                field386 = 0;
                method566();
                method2604();
                while (field306.method2375(field314) >= 11) {
                    int var88 = field306.method2388(11);
                    if (var88 == 2047) {
                        break;
                    }
                    boolean var89 = false;
                    if (field383[var88] == null) {
                        field383[var88] = new class3();
                        if (field388[var88] != null) {
                            field383[var88].method19(field388[var88]);
                        }
                        var89 = true;
                    }
                    field385[++field384 - 1] = var88;
                    class3 var90 = field383[var88];
                    var90.field781 = field280;
                    int var91 = field306.method2388(5);
                    if (var91 > 15) {
                        var91 -= 32;
                    }
                    int var92 = field306.method2388(5);
                    if (var92 > 15) {
                        var92 -= 32;
                    }
                    int var93 = field306.method2388(1);
                    if (var93 == 1) {
                        field413[++field386 - 1] = var88;
                    }
                    int var94 = field343[field306.method2388(3)];
                    if (var89) {
                        var90.field783 = var90.field768 = var94;
                    }
                    int var95 = field306.method2388(1);
                    var90.method569(Statics.field391.field787[0] + var91, Statics.field391.field779[0] + var92, var95 == 1);
                }
                field306.method2373();
                method587();
                for (int var96 = 0; var96 < field362; var96++) {
                    int var97 = field393[var96];
                    if (field280 != field383[var97].field781) {
                        field383[var97] = null;
                    }
                }
                if (field314 != field306.field1847) {
                    throw new RuntimeException(field306.field1847 + class2.field17 + field314);
                }
                for (int var98 = 0; var98 < field384; var98++) {
                    if (field383[field385[var98]] == null) {
                        throw new RuntimeException(var98 + class2.field17 + field384);
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 202) {
                method215(true);
                field308 = -1;
                return true;
            }
            if (field308 == 9) {
                boolean var99 = field306.method2154() == 1;
                int var100 = field306.method2172();
                class152 var101 = class152.method2559(var100);
                if (var101.field2549 != var99) {
                    var101.field2549 = var99;
                    method130(var101);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 223) {
                field494 = field306.method2130();
                if (field494 == 255) {
                    field494 = 0;
                }
                field495 = field306.method2130();
                if (field495 == 255) {
                    field495 = 0;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 232) {
                int var102 = field306.method2305();
                int var103 = field306.method2163();
                class152 var104 = class152.method2559(var102);
                if (var104.field2612 != 2 || var104.field2634 != var103) {
                    var104.field2612 = 2;
                    var104.field2634 = var103;
                    method130(var104);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 90) {
                int var105 = field306.method2228();
                if (var105 == 65535) {
                    var105 = -1;
                }
                int var106 = field306.method2217();
                int var107 = field306.method2172();
                int var108 = field306.method2161();
                if (var108 == 65535) {
                    var108 = -1;
                }
                for (int var109 = var108; var109 <= var105; var109++) {
                    long var110 = ((long) var106 << 32) + (long) var109;
                    class184 var112 = field467.method3214(var110);
                    if (var112 != null) {
                        var112.method3309();
                    }
                    field467.method3208(new class179(var107), var110);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 216) {
                String var113 = field306.method2138();
                int var114 = field306.method2132();
                byte var115 = field306.method2131();
                boolean var116 = false;
                if (var115 == -128) {
                    var116 = true;
                }
                if (var116) {
                    if (Statics.field1357 == 0) {
                        field308 = -1;
                        return true;
                    }
                    boolean var117 = false;
                    int var118;
                    for (var118 = 0; var118 < Statics.field1357 && (!Statics.field1887[var118].field577.equals(var113) || Statics.field1887[var118].field568 != var114); var118++) {
                    }
                    if (var118 < Statics.field1357) {
                        while (var118 < Statics.field1357 - 1) {
                            Statics.field1887[var118] = Statics.field1887[var118 + 1];
                            var118++;
                        }
                        Statics.field1357--;
                        Statics.field1887[Statics.field1357] = null;
                    }
                } else {
                    field306.method2138();
                    class21 var119 = new class21();
                    var119.field577 = var113;
                    var119.field569 = class198.method2067(var119.field577, Statics.field2697);
                    var119.field568 = var114;
                    var119.field570 = var115;
                    int var120;
                    for (var120 = Statics.field1357 - 1; var120 >= 0; var120--) {
                        int var121 = Statics.field1887[var120].field569.compareTo(var119.field577);
                        if (var121 == 0) {
                            Statics.field1887[var120].field568 = var114;
                            Statics.field1887[var120].field570 = var115;
                            if (var113.equals(Statics.field391.field32)) {
                                Statics.field888 = var115;
                            }
                            field311 = field416;
                            field308 = -1;
                            return true;
                        }
                        if (var121 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1357 >= Statics.field1887.length) {
                        field308 = -1;
                        return true;
                    }
                    for (int var122 = Statics.field1357 - 1; var122 > var120; var122--) {
                        Statics.field1887[var122 + 1] = Statics.field1887[var122];
                    }
                    if (Statics.field1357 == 0) {
                        Statics.field1887 = new class21[100];
                    }
                    Statics.field1887[var120 + 1] = var119;
                    Statics.field1357++;
                    if (var113.equals(Statics.field391.field32)) {
                        Statics.field888 = var115;
                    }
                }
                field311 = field416;
                field308 = -1;
                return true;
            }
            if (field308 == 220) {
                method2485();
                field308 = -1;
                return true;
            }
            if (field308 == 219) {
                int var123 = field306.method2217();
                int var124 = field306.method2163();
                int var125 = var124 >> 10 & 0x1F;
                int var126 = var124 >> 5 & 0x1F;
                int var127 = var124 & 0x1F;
                int var128 = (var127 << 3) + (var125 << 19) + (var126 << 11);
                class152 var129 = class152.method2559(var123);
                if (var129.field2565 != var128) {
                    var129.field2565 = var128;
                    method130(var129);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 171) {
                int var130 = field306.method2164();
                int var131 = field306.method2164();
                int var132 = field306.method2305();
                class152 var133 = class152.method2559(var132);
                int var134 = var133.field2544 + var130;
                int var135 = var133.field2630 + var131;
                if (var133.field2542 != var134 || var133.field2543 != var135) {
                    var133.field2542 = var134;
                    var133.field2543 = var135;
                    method130(var133);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 24) {
                field512 = field306.method2130();
                field308 = -1;
                return true;
            }
            if (field308 == 44) {
                int var136 = field306.method2130();
                String var137 = field306.method2138();
                int var138 = field306.method2156();
                if (var136 >= 1 && var136 <= 8) {
                    if (var137.equalsIgnoreCase("null")) {
                        var137 = null;
                    }
                    field395[var136 - 1] = var137;
                    field365[var136 - 1] = var138 == 0;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 33) {
                int var139 = field306.method2130();
                int var140 = field306.method2130();
                int var141 = field306.method2130();
                int var142 = field306.method2130();
                field509[var139] = true;
                field459[var139] = var140;
                field396[var139] = var141;
                field354[var139] = var142;
                field513[var139] = 0;
                field308 = -1;
                return true;
            }
            if (field308 == 80) {
                method618();
                int var143 = field306.method2154();
                int var144 = field306.method2217();
                int var145 = field306.method2130();
                field405[var143] = var144;
                field403[var143] = var145;
                field323[var143] = 1;
                for (int var146 = 0; var146 < 98; var146++) {
                    if (var144 >= class140.field2139[var146]) {
                        field323[var143] = var146 + 2;
                    }
                }
                field455[++field510 - 1 & 0x1F] = var143;
                field308 = -1;
                return true;
            }
            if (field308 == 227) {
                field508 = true;
                Statics.field1504 = field306.method2130();
                Statics.field1069 = field306.method2130();
                Statics.field177 = field306.method2132();
                Statics.field1885 = field306.method2130();
                Statics.field1931 = field306.method2130();
                if (Statics.field1931 >= 100) {
                    int var147 = Statics.field1504 * 128 + 64;
                    int var148 = Statics.field1069 * 128 + 64;
                    int var149 = method107(var147, var148, Statics.field1494) - Statics.field177;
                    int var150 = var147 - Statics.field1956;
                    int var151 = var149 - Statics.field531;
                    int var152 = var148 - Statics.field1661;
                    int var153 = (int) Math.sqrt((double) (var150 * var150 + var152 * var152));
                    Statics.field1687 = (int) (Math.atan2((double) var151, (double) var153) * 325.949D) & 0x7FF;
                    Statics.field149 = (int) (Math.atan2((double) var150, (double) var152) * -325.949D) & 0x7FF;
                    if (Statics.field1687 < 128) {
                        Statics.field1687 = 128;
                    }
                    if (Statics.field1687 > 383) {
                        Statics.field1687 = 383;
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 96) {
                int var154 = field306.method2197();
                boolean var155 = field306.method2130() == 1;
                String var156 = "";
                boolean var157 = false;
                if (var155) {
                    var156 = field306.method2138();
                    if (method129(var156)) {
                        var157 = true;
                    }
                }
                String var158 = field306.method2138();
                if (!var157) {
                    class10.method545(var154, var156, var158);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 50) {
                class22 var159 = new class22();
                var159.field584 = field306.method2138();
                var159.field594 = field306.method2132();
                int var160 = field306.method2135();
                var159.field582 = var160;
                method1978(45);
                Statics.field329.method2627();
                Statics.field329 = null;
                class28.method485(var159);
                field308 = -1;
                return false;
            }
            if (field308 == 201) {
                Statics.method3046(field306, field314);
                field308 = -1;
                return true;
            }
            if (field308 == 105) {
                int var161 = field306.method2172();
                int var162 = field306.method2163();
                if (var162 == 65535) {
                    var162 = -1;
                }
                int var163 = field306.method2135();
                class152 var164 = class152.method2559(var163);
                if (var164.field2536) {
                    var164.field2641 = var162;
                    var164.field2642 = var161;
                    class45 var166 = class45.method500(var162);
                    var164.field2577 = var166.field1024;
                    var164.field2578 = var166.field1025;
                    var164.field2579 = var166.field1029;
                    var164.field2567 = var166.field1027;
                    var164.field2574 = var166.field1009;
                    var164.field2569 = var166.field1047;
                    if (var164.field2546 > 0) {
                        var164.field2569 = var164.field2569 * 32 / var164.field2546;
                    }
                    method130(var164);
                } else if (var162 == -1) {
                    var164.field2612 = 0;
                    field308 = -1;
                    return true;
                } else {
                    class45 var165 = class45.method500(var162);
                    var164.field2612 = 4;
                    var164.field2634 = var162;
                    var164.field2577 = var165.field1024;
                    var164.field2578 = var165.field1025;
                    var164.field2569 = var165.field1047 * 100 / var161;
                    method130(var164);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 238) {
                int var167 = field306.method2161();
                field425 = var167;
                method9(var167);
                class32.method470(field425);
                for (int var168 = 0; var168 < 100; var168++) {
                    field470[var168] = true;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 54) {
                method618();
                field431 = field306.method2133();
                field460 = field416;
                field308 = -1;
                return true;
            }
            if (field308 == 130) {
                field278 = field306.method2130();
                if (field278 == 1) {
                    field279 = field306.method2132();
                }
                if (field278 >= 2 && field278 <= 6) {
                    if (field278 == 2) {
                        field284 = 64;
                        field263 = 64;
                    }
                    if (field278 == 3) {
                        field284 = 0;
                        field263 = 64;
                    }
                    if (field278 == 4) {
                        field284 = 128;
                        field263 = 64;
                    }
                    if (field278 == 5) {
                        field284 = 64;
                        field263 = 0;
                    }
                    if (field278 == 6) {
                        field284 = 64;
                        field263 = 128;
                    }
                    field278 = 2;
                    field270 = field306.method2132();
                    field282 = field306.method2132();
                    field283 = field306.method2130();
                }
                if (field278 == 10) {
                    field281 = field306.method2132();
                }
                field308 = -1;
                return true;
            }
            if (field308 == 46) {
                int var169 = field306.method2135();
                int var170 = field306.method2132();
                if (var169 < -70000) {
                    var170 += 32768;
                }
                class152 var171;
                if (var169 >= 0) {
                    var171 = class152.method2559(var169);
                } else {
                    var171 = null;
                }
                if (var171 != null) {
                    for (int var172 = 0; var172 < var171.field2639.length; var172++) {
                        var171.field2639[var172] = 0;
                        var171.field2640[var172] = 0;
                    }
                }
                class14 var173 = (class14) class14.field203.method3214((long) var170);
                if (var173 != null) {
                    for (int var174 = 0; var174 < var173.field193.length; var174++) {
                        var173.field193[var174] = -1;
                        var173.field194[var174] = 0;
                    }
                }
                int var175 = field306.method2132();
                for (int var176 = 0; var176 < var175; var176++) {
                    int var177 = field306.method2130();
                    if (var177 == 255) {
                        var177 = field306.method2135();
                    }
                    int var178 = field306.method2163();
                    if (var171 != null && var176 < var171.field2639.length) {
                        var171.field2639[var176] = var178;
                        var171.field2640[var176] = var177;
                    }
                    class14.method96(var170, var176, var178 - 1, var177);
                }
                if (var171 != null) {
                    method130(var171);
                }
                method618();
                field462[++field454 - 1 & 0x1F] = var170 & 0x7FFF;
                field308 = -1;
                return true;
            }
            if (field308 == 206) {
                int var179 = field306.method2135();
                class4 var180 = (class4) field297.method3214((long) var179);
                if (var180 != null) {
                    method81(var180, true);
                }
                if (field265 != null) {
                    method130(field265);
                    field265 = null;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 49) {
                String var181 = field306.method2138();
                Object[] var182 = new Object[var181.length() + 1];
                for (int var183 = var181.length() - 1; var183 >= 0; var183--) {
                    if (var181.charAt(var183) == 's') {
                        var182[var183 + 1] = field306.method2138();
                    } else {
                        var182[var183 + 1] = Integer.valueOf(field306.method2135());
                    }
                }
                var182[0] = Integer.valueOf(field306.method2135());
                class1 var184 = new class1();
                var184.field9 = var182;
                class32.method451(var184);
                field308 = -1;
                return true;
            }
            if (field308 == 70) {
                int var185 = field306.method2132();
                int var186 = field306.method2130();
                int var187 = field306.method2132();
                if (field415 != 0 && var186 != 0 && field502 < 50) {
                    field503[field502] = var185;
                    field504[field502] = var186;
                    field505[field502] = var187;
                    field507[field502] = null;
                    field479[field502] = 0;
                    field502++;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 45) {
                method215(false);
                field308 = -1;
                return true;
            }
            if (field308 == 40) {
                while (field306.field1847 < field314) {
                    boolean var191 = field306.method2130() == 1;
                    String var192 = field306.method2138();
                    String var193 = field306.method2138();
                    int var194 = field306.method2132();
                    int var195 = field306.method2130();
                    int var196 = field306.method2130();
                    boolean var197 = (var196 & 0x2) != 0;
                    boolean var198 = (var196 & 0x1) != 0;
                    if (var194 > 0) {
                        field306.method2138();
                        field306.method2130();
                        field306.method2135();
                    }
                    field306.method2138();
                    for (int var199 = 0; var199 < field514; var199++) {
                        class16 var200 = field298[var199];
                        if (var191) {
                            if (var193.equals(var200.field234)) {
                                var200.field234 = var192;
                                var200.field242 = var193;
                                var192 = null;
                                break;
                            }
                        } else if (var192.equals(var200.field234)) {
                            if (var200.field230 != var194) {
                                boolean var201 = true;
                                for (class34 var202 = (class34) field517.method3194(); var202 != null; var202 = (class34) field517.method3197()) {
                                    if (var202.field797.equals(var192)) {
                                        if (var194 != 0 && var202.field798 == 0) {
                                            var202.method3306();
                                            var201 = false;
                                        } else if (var194 == 0 && var202.field798 != 0) {
                                            var202.method3306();
                                            var201 = false;
                                        }
                                    }
                                }
                                if (var201) {
                                    field517.method3203(new class34(var192, var194));
                                }
                                var200.field230 = var194;
                            }
                            var200.field242 = var193;
                            var200.field228 = var195;
                            var200.field232 = var197;
                            var200.field233 = var198;
                            var192 = null;
                            break;
                        }
                    }
                    if (var192 != null && field514 < 400) {
                        class16 var203 = new class16();
                        field298[field514] = var203;
                        var203.field234 = var192;
                        var203.field242 = var193;
                        var203.field230 = var194;
                        var203.field228 = var195;
                        var203.field232 = var197;
                        var203.field233 = var198;
                        field514++;
                    }
                }
                field515 = 2;
                field458 = field416;
                boolean var204 = false;
                int var205 = field514;
                while (var205 > 0) {
                    boolean var206 = true;
                    var205--;
                    for (int var207 = 0; var207 < var205; var207++) {
                        boolean var208 = false;
                        class16 var209 = field298[var207];
                        class16 var210 = field298[var207 + 1];
                        if (field350 != var209.field230 && field350 == var210.field230) {
                            var208 = true;
                        }
                        if (!var208 && var209.field230 == 0 && var210.field230 != 0) {
                            var208 = true;
                        }
                        if (!var208 && !var209.field232 && var210.field232) {
                            var208 = true;
                        }
                        if (!var208 && !var209.field233 && var210.field233) {
                            var208 = true;
                        }
                        if (var208) {
                            class16 var211 = field298[var207];
                            field298[var207] = field298[var207 + 1];
                            field298[var207 + 1] = var211;
                            var206 = false;
                        }
                    }
                    if (var206) {
                        break;
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 246) {
                String var212 = field306.method2138();
                long var213 = (long) field306.method2132();
                long var215 = (long) field306.method2252();
                int var217 = field306.method2130();
                long var218 = (var213 << 32) + var215;
                boolean var220 = false;
                for (int var221 = 0; var221 < 100; var221++) {
                    if (field481[var221] == var218) {
                        var220 = true;
                        break;
                    }
                }
                if (method129(var212)) {
                    var220 = true;
                }
                if (!var220 && field382 == 0) {
                    field481[field482] = var218;
                    field482 = (field482 + 1) % 100;
                    String var222 = class190.method3343(class197.method3147(Statics.method1313(field306)));
                    if (var217 == 2 || var217 == 3) {
                        class10.method545(7, class2.method1971(1) + var212, var222);
                    } else if (var217 == 1) {
                        class10.method545(7, class2.method1971(0) + var212, var222);
                    } else {
                        class10.method545(3, var212, var222);
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 248 || field308 == 197 || field308 == 89 || field308 == 196 || field308 == 255 || field308 == 164 || field308 == 168 || field308 == 15 || field308 == 22 || field308 == 179) {
                method2397();
                field308 = -1;
                return true;
            }
            if (field308 == 154) {
                int var223 = field306.method2172();
                Statics.field1457 = Statics.field1884.method2502(var223);
                field308 = -1;
                return true;
            }
            if (field308 == 193) {
                field306.field1847 += 28;
                if (field306.method2162()) {
                    class110 var224 = field306;
                    int var225 = field306.field1847 - 28;
                    if (class136.field2097 != null) {
                        try {
                            class136.field2097.method3454(0L);
                            class136.field2097.method3459(var224.field1849, var225, 24);
                        } catch (Exception var258) {
                        }
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 181) {
                int var227 = field306.method2163();
                int var228 = field306.method2228();
                int var229 = field306.method2172();
                class152 var230 = class152.method2559(var229);
                var230.field2581 = (var227 << 16) + var228;
                field308 = -1;
                return true;
            }
            if (field308 == 6) {
                for (int var231 = 0; var231 < field383.length; var231++) {
                    if (field383[var231] != null) {
                        field383[var231].field785 = -1;
                    }
                }
                for (int var232 = 0; var232 < field300.length; var232++) {
                    if (field300[var232] != null) {
                        field300[var232].field785 = -1;
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 159) {
                for (int var233 = 0; var233 < class154.field2664.length; var233++) {
                    if (class154.field2664[var233] != class154.field2663[var233]) {
                        class154.field2664[var233] = class154.field2663[var233];
                        method79(var233);
                        field302[++field452 - 1 & 0x1F] = var233;
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 177) {
                int var234 = field306.method2154();
                int var235 = field306.method2305();
                int var236 = field306.method2161();
                class4 var237 = (class4) field297.method3214((long) var235);
                if (var237 != null) {
                    method81(var237, var237.field62 != var236);
                }
                method2723(var235, var236, var234);
                field308 = -1;
                return true;
            }
            if (field308 == 68) {
                int var238 = field306.method2172();
                class152 var239 = class152.method2559(var238);
                for (int var240 = 0; var240 < var239.field2639.length; var240++) {
                    var239.field2639[var240] = -1;
                    var239.field2639[var240] = 0;
                }
                method130(var239);
                field308 = -1;
                return true;
            }
            if (field308 == 137) {
                int var241 = field306.method2161();
                int var242 = field306.method2163();
                int var243 = field306.method2172();
                int var244 = field306.method2132();
                class152 var245 = class152.method2559(var243);
                if (var245.field2577 != var244 || var245.field2578 != var242 || var245.field2569 != var241) {
                    var245.field2577 = var244;
                    var245.field2578 = var242;
                    var245.field2569 = var241;
                    method130(var245);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 245) {
                Statics.field1507 = field306.method2154();
                Statics.field1941 = field306.method2130();
                while (field306.field1847 < field314) {
                    field308 = field306.method2130();
                    method2397();
                }
                field308 = -1;
                return true;
            }
            if (field308 == 228) {
                Statics.field1941 = field306.method2155();
                Statics.field1507 = field306.method2156();
                for (int var246 = Statics.field1941; var246 < Statics.field1941 + 8; var246++) {
                    for (int var247 = Statics.field1507; var247 < Statics.field1507 + 8; var247++) {
                        if (field399[Statics.field1494][var246][var247] != null) {
                            field399[Statics.field1494][var246][var247] = null;
                            method29(var246, var247);
                        }
                    }
                }
                for (class15 var248 = (class15) field402.method3236(); var248 != null; var248 = (class15) field402.method3243()) {
                    if (var248.field206 >= Statics.field1941 && var248.field206 < Statics.field1941 + 8 && var248.field207 >= Statics.field1507 && var248.field207 < Statics.field1507 + 8 && Statics.field1494 == var248.field219) {
                        var248.field211 = 0;
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 233) {
                int var249 = field306.method2132();
                if (var249 == 65535) {
                    var249 = -1;
                }
                method885(var249);
                field308 = -1;
                return true;
            }
            if (field308 == 200) {
                int var250 = field306.method2161();
                if (var250 == 65535) {
                    var250 = -1;
                }
                int var251 = field306.method2166();
                method1890(var250, var251);
                field308 = -1;
                return true;
            }
            if (field308 == 182) {
                field508 = true;
                Statics.field244 = field306.method2130();
                Statics.field185 = field306.method2130();
                Statics.field55 = field306.method2132();
                Statics.field590 = field306.method2130();
                Statics.field146 = field306.method2130();
                if (Statics.field146 >= 100) {
                    Statics.field1956 = Statics.field244 * 128 + 64;
                    Statics.field1661 = Statics.field185 * 128 + 64;
                    Statics.field531 = method107(Statics.field1956, Statics.field1661, Statics.field1494) - Statics.field55;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 60) {
                int var252 = field306.method2217();
                class152 var253 = class152.method2559(var252);
                var253.field2612 = 3;
                var253.field2634 = Statics.field391.field38.method2951();
                method130(var253);
                field308 = -1;
                return true;
            }
            class135.method495("" + field308 + class2.field17 + field313 + class2.field17 + field357 + class2.field17 + field314, (Throwable) null);
            method2552();
        } catch (IOException var259) {
            method27();
        } catch (Exception var260) {
            String var256 = "" + field308 + class2.field17 + field313 + class2.field17 + field357 + class2.field17 + field314 + class2.field17 + (Statics.field88 + Statics.field391.field787[0]) + class2.field17 + (Statics.field316 + Statics.field391.field779[0]) + class2.field17;
            for (int var257 = 0; var257 < field314 && var257 < 50; var257++) {
                var256 = var256 + field306.field1849[var257] + class2.field17;
            }
            class135.method495(var256, var260);
            method2552();
        }
        return true;
    }

    @ObfuscatedName("dq.as(I)V")
    public static final void method2397() {
        if (field308 == 15) {
            int var0 = field306.method2155();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1941;
            int var2 = (var0 & 0x7) + Statics.field1507;
            int var3 = field306.method2228();
            int var4 = field306.method2130();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field327[var5];
            if (var1 >= 0 && var2 >= 0 && var1 < 103 && var2 < 103) {
                if (var7 == 0) {
                    class80 var8 = Statics.field1257.method1629(Statics.field1494, var1, var2);
                    if (var8 != null) {
                        int var9 = var8.field1421 >> 14 & 0x7FFF;
                        if (var5 == 2) {
                            var8.field1431 = new class11(var9, 2, var6 + 4, Statics.field1494, var1, var2, var3, false, var8.field1431);
                            var8.field1427 = new class11(var9, 2, var6 + 1 & 0x3, Statics.field1494, var1, var2, var3, false, var8.field1427);
                        } else {
                            var8.field1431 = new class11(var9, var5, var6, Statics.field1494, var1, var2, var3, false, var8.field1431);
                        }
                    }
                }
                if (var7 == 1) {
                    class87 var10 = Statics.field1257.method1694(Statics.field1494, var1, var2);
                    if (var10 != null) {
                        int var11 = var10.field1502 >> 14 & 0x7FFF;
                        if (var5 == 4 || var5 == 5) {
                            var10.field1501 = new class11(var11, 4, var6, Statics.field1494, var1, var2, var3, false, var10.field1501);
                        } else if (var5 == 6) {
                            var10.field1501 = new class11(var11, 4, var6 + 4, Statics.field1494, var1, var2, var3, false, var10.field1501);
                        } else if (var5 == 7) {
                            var10.field1501 = new class11(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field1494, var1, var2, var3, false, var10.field1501);
                        } else if (var5 == 8) {
                            var10.field1501 = new class11(var11, 4, var6 + 4, Statics.field1494, var1, var2, var3, false, var10.field1501);
                            var10.field1509 = new class11(var11, 4, (var6 + 2 & 0x3) + 4, Statics.field1494, var1, var2, var3, false, var10.field1509);
                        }
                    }
                }
                if (var7 == 2) {
                    class91 var12 = Statics.field1257.method1631(Statics.field1494, var1, var2);
                    if (var5 == 11) {
                        var5 = 10;
                    }
                    if (var12 != null) {
                        var12.field1572 = new class11(var12.field1562 >> 14 & 0x7FFF, var5, var6, Statics.field1494, var1, var2, var3, false, var12.field1572);
                    }
                }
                if (var7 == 3) {
                    class86 var13 = Statics.field1257.method1632(Statics.field1494, var1, var2);
                    if (var13 != null) {
                        var13.field1486 = new class11(var13.field1487 >> 14 & 0x7FFF, 22, var6, Statics.field1494, var1, var2, var3, false, var13.field1486);
                    }
                }
            }
        } else if (field308 == 22) {
            int var14 = field306.method2156();
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = field327[var15];
            int var18 = field306.method2156();
            int var19 = (var18 >> 4 & 0x7) + Statics.field1941;
            int var20 = (var18 & 0x7) + Statics.field1507;
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                method2444(Statics.field1494, var19, var20, var17, -1, var15, var16, 0, -1);
            }
        } else {
            if (field308 == 248) {
                int var21 = field306.method2130();
                int var22 = (var21 >> 4 & 0x7) + Statics.field1941;
                int var23 = (var21 & 0x7) + Statics.field1507;
                int var24 = field306.method2132();
                int var25 = field306.method2130();
                int var26 = var25 >> 4 & 0xF;
                int var27 = var25 & 0x7;
                int var28 = field306.method2130();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    int var29 = var26 + 1;
                    if (Statics.field391.field787[0] >= var22 - var29 && Statics.field391.field787[0] <= var22 + var29 && Statics.field391.field779[0] >= var23 - var29 && Statics.field391.field779[0] <= var23 + var29 && field501 != 0 && var27 > 0 && field502 < 50) {
                        field503[field502] = var24;
                        field504[field502] = var27;
                        field505[field502] = var28;
                        field507[field502] = null;
                        field479[field502] = (var22 << 16) + (var23 << 8) + var26;
                        field502++;
                    }
                }
            }
            if (field308 == 255) {
                int var30 = field306.method2130();
                int var31 = (var30 >> 4 & 0x7) + Statics.field1941;
                int var32 = (var30 & 0x7) + Statics.field1507;
                int var33 = var31 + field306.method2131();
                int var34 = var32 + field306.method2131();
                int var35 = field306.method2133();
                int var36 = field306.method2132();
                int var37 = field306.method2130() * 4;
                int var38 = field306.method2130() * 4;
                int var39 = field306.method2132();
                int var40 = field306.method2132();
                int var41 = field306.method2130();
                int var42 = field306.method2130();
                if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                    int var43 = var31 * 128 + 64;
                    int var44 = var32 * 128 + 64;
                    int var45 = var33 * 128 + 64;
                    int var46 = var34 * 128 + 64;
                    class7 var47 = new class7(var36, Statics.field1494, var43, var44, method107(var43, var44, Statics.field1494) - var37, field280 + var39, field280 + var40, var41, var42, var35, var38);
                    var47.method92(var45, var46, method107(var45, var46, Statics.field1494) - var38, field280 + var39);
                    field305.method3253(var47);
                }
            } else {
                if (field308 == 89) {
                    int var48 = field306.method2132();
                    byte var49 = field306.method2157();
                    int var50 = field306.method2161();
                    byte var51 = field306.method2131();
                    int var52 = field306.method2161();
                    byte var53 = field306.method2131();
                    byte var54 = field306.method2131();
                    int var55 = field306.method2130();
                    int var56 = (var55 >> 4 & 0x7) + Statics.field1941;
                    int var57 = (var55 & 0x7) + Statics.field1507;
                    int var58 = field306.method2130();
                    int var59 = var58 >> 2;
                    int var60 = var58 & 0x3;
                    int var61 = field327[var59];
                    int var62 = field306.method2161();
                    class3 var63;
                    if (field389 == var52) {
                        var63 = Statics.field391;
                    } else {
                        var63 = field383[var52];
                    }
                    if (var63 != null) {
                        class36 var64 = class36.method2079(var62);
                        int var65;
                        int var66;
                        if (var60 == 1 || var60 == 3) {
                            var65 = var64.field854;
                            var66 = var64.field878;
                        } else {
                            var65 = var64.field878;
                            var66 = var64.field854;
                        }
                        int var67 = (var65 >> 1) + var56;
                        int var68 = (var65 + 1 >> 1) + var56;
                        int var69 = (var66 >> 1) + var57;
                        int var70 = (var66 + 1 >> 1) + var57;
                        int[][] var71 = class6.field92[Statics.field1494];
                        int var72 = var71[var67][var69] + var71[var68][var69] + var71[var67][var70] + var71[var68][var70] >> 2;
                        int var73 = (var56 << 7) + (var65 << 6);
                        int var74 = (var57 << 7) + (var66 << 6);
                        class98 var75 = var64.method629(var59, var60, var71, var73, var72, var74);
                        if (var75 != null) {
                            method2444(Statics.field1494, var56, var57, var61, -1, 0, 0, var48 + 1, var50 + 1);
                            var63.field44 = field280 + var48;
                            var63.field36 = field280 + var50;
                            var63.field42 = var75;
                            var63.field39 = var56 * 128 + var65 * 64;
                            var63.field41 = var57 * 128 + var66 * 64;
                            var63.field37 = var72;
                            if (var53 > var49) {
                                byte var76 = var53;
                                var53 = var49;
                                var49 = var76;
                            }
                            if (var54 > var51) {
                                byte var77 = var54;
                                var54 = var51;
                                var51 = var77;
                            }
                            var63.field43 = var53 + var56;
                            var63.field45 = var49 + var56;
                            var63.field35 = var54 + var57;
                            var63.field46 = var51 + var57;
                        }
                    }
                }
                if (field308 == 197) {
                    int var78 = field306.method2130();
                    int var79 = (var78 >> 4 & 0x7) + Statics.field1941;
                    int var80 = (var78 & 0x7) + Statics.field1507;
                    int var81 = field306.method2132();
                    int var82 = field306.method2132();
                    int var83 = field306.method2132();
                    if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                        class177 var84 = field399[Statics.field1494][var79][var80];
                        if (var84 != null) {
                            for (class25 var85 = (class25) var84.method3236(); var85 != null; var85 = (class25) var84.method3243()) {
                                if ((var81 & 0x7FFF) == var85.field625 && var85.field624 == var82) {
                                    var85.field624 = var83;
                                    break;
                                }
                            }
                            method29(var79, var80);
                        }
                    }
                } else if (field308 == 196) {
                    int var86 = field306.method2130();
                    int var87 = (var86 >> 4 & 0x7) + Statics.field1941;
                    int var88 = (var86 & 0x7) + Statics.field1507;
                    int var89 = field306.method2132();
                    int var90 = field306.method2130();
                    int var91 = field306.method2132();
                    if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                        int var92 = var87 * 128 + 64;
                        int var93 = var88 * 128 + 64;
                        class26 var94 = new class26(var89, Statics.field1494, var92, var93, method107(var92, var93, Statics.field1494) - var90, var91, field280);
                        field291.method3253(var94);
                    }
                } else if (field308 == 164) {
                    int var95 = field306.method2163();
                    int var96 = field306.method2155();
                    int var97 = (var96 >> 4 & 0x7) + Statics.field1941;
                    int var98 = (var96 & 0x7) + Statics.field1507;
                    if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                        class177 var99 = field399[Statics.field1494][var97][var98];
                        if (var99 != null) {
                            for (class25 var100 = (class25) var99.method3236(); var100 != null; var100 = (class25) var99.method3243()) {
                                if ((var95 & 0x7FFF) == var100.field625) {
                                    var100.method3309();
                                    break;
                                }
                            }
                            if (var99.method3236() == null) {
                                field399[Statics.field1494][var97][var98] = null;
                            }
                            method29(var97, var98);
                        }
                    }
                } else if (field308 == 179) {
                    int var101 = field306.method2154();
                    int var102 = (var101 >> 4 & 0x7) + Statics.field1941;
                    int var103 = (var101 & 0x7) + Statics.field1507;
                    int var104 = field306.method2228();
                    int var105 = field306.method2154();
                    int var106 = var105 >> 2;
                    int var107 = var105 & 0x3;
                    int var108 = field327[var106];
                    if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                        method2444(Statics.field1494, var102, var103, var108, var104, var106, var107, 0, -1);
                    }
                } else if (field308 == 168) {
                    int var109 = field306.method2130();
                    int var110 = (var109 >> 4 & 0x7) + Statics.field1941;
                    int var111 = (var109 & 0x7) + Statics.field1507;
                    int var112 = field306.method2228();
                    int var113 = field306.method2132();
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        class25 var114 = new class25();
                        var114.field625 = var112;
                        var114.field624 = var113;
                        if (field399[Statics.field1494][var110][var111] == null) {
                            field399[Statics.field1494][var110][var111] = new class177();
                        }
                        field399[Statics.field1494][var110][var111].method3253(var114);
                        method29(var110, var111);
                    }
                }
            }
        }
    }

    @ObfuscatedName("da.ax(IIIIIIIIII)V")
    public static final void method2444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field402.method3236(); var10 != null; var10 = (class15) field402.method3243()) {
            if (var10.field219 == arg0 && var10.field206 == arg1 && var10.field207 == arg2 && var10.field205 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field219 = arg0;
            var9.field205 = arg3;
            var9.field206 = arg1;
            var9.field207 = arg2;
            method2916(var9);
            field402.method3253(var9);
        }
        var9.field216 = arg4;
        var9.field212 = arg5;
        var9.field204 = arg6;
        var9.field214 = arg7;
        var9.field211 = arg8;
    }

    @ObfuscatedName("dm.bg(I)V")
    public static final void method2457() {
        for (class15 var0 = (class15) field402.method3236(); var0 != null; var0 = (class15) field402.method3243()) {
            if (var0.field211 == -1) {
                var0.field214 = 0;
                method2916(var0);
            } else {
                var0.method3309();
            }
        }
    }

    @ObfuscatedName("eb.bd(Lt;I)V")
    public static final void method2916(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field205 == 0) {
            var1 = Statics.field1257.method1727(arg0.field219, arg0.field206, arg0.field207);
        }
        if (arg0.field205 == 1) {
            var1 = Statics.field1257.method1634(arg0.field219, arg0.field206, arg0.field207);
        }
        if (arg0.field205 == 2) {
            var1 = Statics.field1257.method1635(arg0.field219, arg0.field206, arg0.field207);
        }
        if (arg0.field205 == 3) {
            var1 = Statics.field1257.method1636(arg0.field219, arg0.field206, arg0.field207);
        }
        if (var1 != 0) {
            int var5 = Statics.field1257.method1648(arg0.field219, arg0.field206, arg0.field207, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field208 = var2;
        arg0.field210 = var3;
        arg0.field209 = var4;
    }

    @ObfuscatedName("cy.bp(I)V")
    public static final void method1789() {
        for (class15 var0 = (class15) field402.method3236(); var0 != null; var0 = (class15) field402.method3243()) {
            if (var0.field211 > 0) {
                var0.field211--;
            }
            if (var0.field211 != 0) {
                if (var0.field214 > 0) {
                    var0.field214--;
                }
                if (var0.field214 == 0 && var0.field206 >= 1 && var0.field207 >= 1 && var0.field206 <= 102 && var0.field207 <= 102 && (var0.field216 < 0 || class6.method437(var0.field216, var0.field212))) {
                    method2594(var0.field219, var0.field205, var0.field206, var0.field207, var0.field216, var0.field204, var0.field212);
                    var0.field214 = -1;
                    if (var0.field216 == var0.field208 && var0.field208 == -1) {
                        var0.method3309();
                    } else if (var0.field216 == var0.field208 && var0.field209 == var0.field204 && var0.field212 == var0.field210) {
                        var0.method3309();
                    }
                }
            } else if (var0.field208 < 0 || class6.method437(var0.field208, var0.field210)) {
                method2594(var0.field219, var0.field205, var0.field206, var0.field207, var0.field208, var0.field209, var0.field210);
                var0.method3309();
            }
        }
    }

    @ObfuscatedName("dp.bm(IIIIIIII)V")
    public static final void method2594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field407 && Statics.field1494 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1257.method1727(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1257.method1634(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1257.method1635(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1257.method1636(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1257.method1648(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1257.method1624(arg0, arg2, arg3);
                class36 var15 = class36.method2079(var12);
                if (var15.field856 != 0) {
                    field324[arg0].method3487(arg2, arg3, var13, var14, var15.field873);
                }
            }
            if (arg1 == 1) {
                Statics.field1257.method1625(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1257.method1626(arg0, arg2, arg3);
                class36 var16 = class36.method2079(var12);
                if (var16.field878 + arg2 > 103 || var16.field878 + arg3 > 103 || var16.field854 + arg2 > 103 || var16.field854 + arg3 > 103) {
                    return;
                }
                if (var16.field856 != 0) {
                    field324[arg0].method3488(arg2, arg3, var16.field878, var16.field854, var14, var16.field873);
                }
            }
            if (arg1 == 3) {
                Statics.field1257.method1627(arg0, arg2, arg3);
                class36 var17 = class36.method2079(var12);
                if (var17.field856 == 1) {
                    field324[arg0].method3512(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field87[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class79 var19 = Statics.field1257;
        class195 var20 = field324[arg0];
        class36 var21 = class36.method2079(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field854;
            var23 = var21.field878;
        } else {
            var22 = var21.field878;
            var23 = var21.field854;
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
        int[][] var28 = class6.field92[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field858 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field879 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field862 == -1 && var21.field880 == null) {
                var34 = var21.method629(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1613(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field856 == 1) {
                var20.method3485(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field862 == -1 && var21.field880 == null) {
                var57 = var21.method629(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1617(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field856 != 0) {
                var20.method3483(arg2, arg3, var22, var23, var21.field873);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field862 == -1 && var21.field880 == null) {
                var35 = var21.method629(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1617(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field856 != 0) {
                var20.method3483(arg2, arg3, var22, var23, var21.field873);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field862 == -1 && var21.field880 == null) {
                var36 = var21.method629(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1615(arg0, arg2, arg3, var29, var36, (class78) null, class6.field80[arg5], 0, var32, var33);
            if (var21.field856 != 0) {
                var20.method3511(arg2, arg3, arg6, arg5, var21.field873);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field862 == -1 && var21.field880 == null) {
                var37 = var21.method629(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1615(arg0, arg2, arg3, var29, var37, (class78) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field856 != 0) {
                var20.method3511(arg2, arg3, arg6, arg5, var21.field873);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field862 == -1 && var21.field880 == null) {
                var39 = var21.method629(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method629(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field862, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1615(arg0, arg2, arg3, var29, var39, var40, class6.field80[arg5], class6.field80[var38], var32, var33);
            if (var21.field856 != 0) {
                var20.method3511(arg2, arg3, arg6, arg5, var21.field873);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field862 == -1 && var21.field880 == null) {
                var41 = var21.method629(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1615(arg0, arg2, arg3, var29, var41, (class78) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field856 != 0) {
                var20.method3511(arg2, arg3, arg6, arg5, var21.field873);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field862 == -1 && var21.field880 == null) {
                var42 = var21.method629(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1617(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field856 != 0) {
                var20.method3483(arg2, arg3, var22, var23, var21.field873);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field862 == -1 && var21.field880 == null) {
                var43 = var21.method629(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1620(arg0, arg2, arg3, var29, var43, (class78) null, class6.field80[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1727(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method2079(var45 >> 14 & 0x7FFF).field859;
            }
            class78 var46;
            if (var21.field862 == -1 && var21.field880 == null) {
                var46 = var21.method629(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1620(arg0, arg2, arg3, var29, var46, (class78) null, class6.field80[arg5], 0, class6.field82[arg5] * var44, class6.field73[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1727(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method2079(var48 >> 14 & 0x7FFF).field859 / 2;
            }
            class78 var49;
            if (var21.field862 == -1 && var21.field880 == null) {
                var49 = var21.method629(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1620(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field84[arg5] * var47, class6.field85[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field862 == -1 && var21.field880 == null) {
                var51 = var21.method629(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1620(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1727(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method2079(var53 >> 14 & 0x7FFF).field859 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field862 == -1 && var21.field880 == null) {
                var55 = var21.method629(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method629(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field862, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field862, true, (class78) null);
            }
            var19.method1620(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field84[arg5] * var52, class6.field85[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("h.bh(III)V")
    public static final void method29(int arg0, int arg1) {
        class177 var2 = field399[Statics.field1494][arg0][arg1];
        if (var2 == null) {
            Statics.field1257.method1628(Statics.field1494, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3236(); var6 != null; var6 = (class25) var2.method3243()) {
            class45 var7 = class45.method500(var6.field625);
            long var8 = (long) var7.field1030;
            if (var7.field1053 == 1) {
                var8 = (long) (var6.field624 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1257.method1628(Statics.field1494, arg0, arg1);
            return;
        }
        var2.method3237(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3236(); var12 != null; var12 = (class25) var2.method3243()) {
            if (var5.field625 != var12.field625) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field625 != var12.field625 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1257.method1614(Statics.field1494, arg0, arg1, method107(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1494), var5, var13, var10, var11);
    }

    @ObfuscatedName("ae.be(I)V")
    public static final void method566() {
        field306.method2371();
        int var0 = field306.method2388(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field306.method2388(2);
        if (var1 == 0) {
            field413[++field386 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field306.method2388(3);
            Statics.field391.method570(var2, false);
            int var3 = field306.method2388(1);
            if (var3 == 1) {
                field413[++field386 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field306.method2388(3);
            Statics.field391.method570(var4, true);
            int var5 = field306.method2388(3);
            Statics.field391.method570(var5, true);
            int var6 = field306.method2388(1);
            if (var6 == 1) {
                field413[++field386 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field306.method2388(7);
            int var8 = field306.method2388(1);
            int var9 = field306.method2388(1);
            if (var9 == 1) {
                field413[++field386 - 1] = 2047;
            }
            Statics.field1494 = field306.method2388(2);
            int var10 = field306.method2388(7);
            Statics.field391.method569(var10, var7, var8 == 1);
        }
    }

    @ObfuscatedName("di.bt(I)V")
    public static final void method2604() {
        int var0 = field306.method2388(8);
        if (var0 < field384) {
            for (int var1 = var0; var1 < field384; var1++) {
                field393[++field362 - 1] = field385[var1];
            }
        }
        if (var0 > field384) {
            throw new RuntimeException("");
        }
        field384 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field385[var2];
            class3 var4 = field383[var3];
            int var5 = field306.method2388(1);
            if (var5 == 0) {
                field385[++field384 - 1] = var3;
                var4.field781 = field280;
            } else {
                int var6 = field306.method2388(2);
                if (var6 == 0) {
                    field385[++field384 - 1] = var3;
                    var4.field781 = field280;
                    field413[++field386 - 1] = var3;
                } else if (var6 == 1) {
                    field385[++field384 - 1] = var3;
                    var4.field781 = field280;
                    int var7 = field306.method2388(3);
                    var4.method570(var7, false);
                    int var8 = field306.method2388(1);
                    if (var8 == 1) {
                        field413[++field386 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field385[++field384 - 1] = var3;
                    var4.field781 = field280;
                    int var9 = field306.method2388(3);
                    var4.method570(var9, true);
                    int var10 = field306.method2388(3);
                    var4.method570(var10, true);
                    int var11 = field306.method2388(1);
                    if (var11 == 1) {
                        field413[++field386 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field393[++field362 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ar.bf(I)V")
    public static final void method587() {
        for (int var0 = 0; var0 < field386; var0++) {
            int var1 = field413[var0];
            class3 var2 = field383[var1];
            int var3 = field306.method2130();
            if ((var3 & 0x2) != 0) {
                var3 += field306.method2130() << 8;
            }
            Statics.method2827(var1, var2, var3);
        }
    }

    @ObfuscatedName("dx.bs(I)V")
    public static final void method2485() {
        field362 = 0;
        field386 = 0;
        method162();
        while (field306.method2375(field314) >= 27) {
            int var0 = field306.method2388(15);
            if (var0 == 32767) {
                break;
            }
            boolean var16 = false;
            if (field300[var0] == null) {
                field300[var0] = new class30();
                var16 = true;
            }
            class30 var17 = field300[var0];
            field348[++field301 - 1] = var0;
            var17.field781 = field280;
            int var18 = field306.method2388(5);
            if (var18 > 15) {
                var18 -= 32;
            }
            var17.field703 = class35.method464(field306.method2388(14));
            int var19 = field306.method2388(1);
            if (var19 == 1) {
                field413[++field386 - 1] = var0;
            }
            int var20 = field306.method2388(1);
            int var21 = field343[field306.method2388(3)];
            if (var16) {
                var17.field783 = var17.field768 = var21;
            }
            int var22 = field306.method2388(5);
            if (var22 > 15) {
                var22 -= 32;
            }
            var17.field738 = var17.field703.field808;
            var17.field734 = var17.field703.field831;
            if (var17.field734 == 0) {
                var17.field768 = 0;
            }
            var17.field742 = var17.field703.field814;
            var17.field761 = var17.field703.field815;
            var17.field789 = var17.field703.field816;
            var17.field765 = var17.field703.field817;
            var17.field739 = var17.field703.field832;
            var17.field740 = var17.field703.field837;
            var17.field758 = var17.field703.field813;
            var17.method569(Statics.field391.field787[0] + var18, Statics.field391.field779[0] + var22, var20 == 1);
        }
        field306.method2373();
        for (int var1 = 0; var1 < field386; var1++) {
            int var2 = field413[var1];
            class30 var3 = field300[var2];
            int var4 = field306.method2130();
            if ((var4 & 0x10) != 0) {
                int var5 = field306.method2155();
                int var6 = field306.method2156();
                var3.method572(var5, var6, field280);
                var3.field755 = field280 + 300;
                var3.field756 = field306.method2156();
                var3.field771 = field306.method2155();
            }
            if ((var4 & 0x4) != 0) {
                int var7 = field306.method2132();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field306.method2155();
                if (var3.field785 == var7 && var7 != -1) {
                    int var9 = class38.method38(var7).field918;
                    if (var9 == 1) {
                        var3.field753 = 0;
                        var3.field766 = 0;
                        var3.field791 = var8;
                        var3.field782 = 0;
                    }
                    if (var9 == 2) {
                        var3.field782 = 0;
                    }
                } else if (var7 == -1 || var3.field785 == -1 || class38.method38(var7).field912 >= class38.method38(var3.field785).field912) {
                    var3.field785 = var7;
                    var3.field753 = 0;
                    var3.field766 = 0;
                    var3.field791 = var8;
                    var3.field782 = 0;
                    var3.field769 = var3.field786;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field749 = field306.method2138();
                var3.field745 = 100;
            }
            if ((var4 & 0x80) != 0) {
                var3.field774 = field306.method2161();
                int var10 = field306.method2217();
                var3.field764 = var10 >> 16;
                var3.field772 = (var10 & 0xFFFF) + field280;
                var3.field770 = 0;
                var3.field788 = 0;
                if (var3.field772 > field280) {
                    var3.field770 = -1;
                }
                if (var3.field774 == 65535) {
                    var3.field774 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field759 = field306.method2132();
                var3.field760 = field306.method2228();
            }
            if ((var4 & 0x40) != 0) {
                int var11 = field306.method2130();
                int var12 = field306.method2154();
                var3.method572(var11, var12, field280);
                var3.field755 = field280 + 300;
                var3.field756 = field306.method2155();
                var3.field771 = field306.method2156();
            }
            if ((var4 & 0x2) != 0) {
                var3.field757 = field306.method2228();
                if (var3.field757 == 65535) {
                    var3.field757 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field703 = class35.method464(field306.method2161());
                var3.field738 = var3.field703.field808;
                var3.field734 = var3.field703.field831;
                var3.field742 = var3.field703.field814;
                var3.field761 = var3.field703.field815;
                var3.field789 = var3.field703.field816;
                var3.field765 = var3.field703.field817;
                var3.field739 = var3.field703.field832;
                var3.field740 = var3.field703.field837;
                var3.field758 = var3.field703.field813;
            }
        }
        for (int var13 = 0; var13 < field362; var13++) {
            int var14 = field393[var13];
            if (field280 != field300[var14].field781) {
                field300[var14].field703 = null;
                field300[var14] = null;
            }
        }
        if (field314 != field306.field1847) {
            throw new RuntimeException(field306.field1847 + class2.field17 + field314);
        }
        for (int var15 = 0; var15 < field301; var15++) {
            if (field300[field348[var15]] == null) {
                throw new RuntimeException(var15 + class2.field17 + field301);
            }
        }
    }

    @ObfuscatedName("d.bi(I)V")
    public static final void method162() {
        field306.method2371();
        int var0 = field306.method2388(8);
        if (var0 < field301) {
            for (int var1 = var0; var1 < field301; var1++) {
                field393[++field362 - 1] = field348[var1];
            }
        }
        if (var0 > field301) {
            throw new RuntimeException("");
        }
        field301 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field348[var2];
            class30 var4 = field300[var3];
            int var5 = field306.method2388(1);
            if (var5 == 0) {
                field348[++field301 - 1] = var3;
                var4.field781 = field280;
            } else {
                int var6 = field306.method2388(2);
                if (var6 == 0) {
                    field348[++field301 - 1] = var3;
                    var4.field781 = field280;
                    field413[++field386 - 1] = var3;
                } else if (var6 == 1) {
                    field348[++field301 - 1] = var3;
                    var4.field781 = field280;
                    int var7 = field306.method2388(3);
                    var4.method570(var7, false);
                    int var8 = field306.method2388(1);
                    if (var8 == 1) {
                        field413[++field386 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field348[++field301 - 1] = var3;
                    var4.field781 = field280;
                    int var9 = field306.method2388(3);
                    var4.method570(var9, true);
                    int var10 = field306.method2388(3);
                    var4.method570(var10, true);
                    int var11 = field306.method2388(1);
                    if (var11 == 1) {
                        field413[++field386 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field393[++field362 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("a.bx(IIB)V")
    public static final void method112(int arg0, int arg1) {
        if (field408 < 2 && field419 == 0 && !field421) {
            return;
        }
        String var2;
        if (field419 == 1 && field408 < 2) {
            var2 = class142.field2305 + class142.field2285 + field420 + " " + class2.field21;
        } else if (field421 && field408 < 2) {
            var2 = field423 + class142.field2285 + field424 + " " + class2.field21;
        } else {
            var2 = Statics.method1414(field408 - 1);
        }
        if (field408 > 2) {
            var2 = var2 + class2.method2720(16777215) + " " + '/' + " " + (field408 - 2) + class142.field2309;
        }
        Statics.field91.method3351(var2, arg0 + 4, arg1 + 15, 16777215, 0, field280 / 1000);
    }

    @ObfuscatedName("ew.br(IIIIB)V")
    public static final void method2734(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field468; var4++) {
            if (field473[var4] + field472[var4] > arg0 && field473[var4] < arg0 + arg2 && field476[var4] + field474[var4] > arg1 && field474[var4] < arg1 + arg3) {
                field470[var4] = true;
            }
        }
    }

    @ObfuscatedName("j.bb(III)V")
    public static final void method2(int arg0, int arg1) {
        int var2 = Statics.field91.method3339(class142.field2308);
        for (int var3 = 0; var3 < field408; var3++) {
            int var4 = Statics.field91.method3339(Statics.method1414(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field408 * 15 + 21;
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
        field410 = true;
        Statics.field1490 = var6;
        Statics.field868 = var7;
        Statics.field690 = var2;
        Statics.field2695 = field408 * 15 + 22;
    }

    @ObfuscatedName("cu.bw(II)Z")
    public static final boolean method2055(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field375[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dd.bo(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2420(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 7) {
            class30 var8 = field300[arg3];
            if (var8 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(47);
                field304.method2270(Statics.field1057);
                field304.method2256(class124.field1977[82] ? 1 : 0);
                field304.method2169(Statics.field1953);
                field304.method2158(Statics.field189);
                field304.method2158(arg3);
            }
        }
        if (arg2 == 13) {
            class30 var9 = field300[arg3];
            if (var9 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(253);
                field304.method2159(arg3);
                field304.method2204(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class3 var10 = field383[arg3];
            if (var10 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(38);
                field304.method2204(class124.field1977[82] ? 1 : 0);
                field304.method2159(arg3);
            }
        }
        if (arg2 == 22) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(171);
            field304.method2256(class124.field1977[82] ? 1 : 0);
            field304.method2160(Statics.field88 + arg0);
            field304.method2159(arg3);
            field304.method2160(Statics.field316 + arg1);
        }
        if (arg2 == 1) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(44);
            field304.method2169(Statics.field1953);
            field304.method2204(class124.field1977[82] ? 1 : 0);
            field304.method2270(Statics.field316 + arg1);
            field304.method2159(Statics.field1057);
            field304.method2270(Statics.field189);
            field304.method2270(Statics.field88 + arg0);
            field304.method2270(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 35) {
            field304.method2369(197);
            field304.method2158(arg0);
            field304.method2160(arg3);
            field304.method2119(arg1);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 19) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(247);
            field304.method2158(arg3);
            field304.method2270(Statics.field88 + arg0);
            field304.method2158(Statics.field316 + arg1);
            field304.method2204(class124.field1977[82] ? 1 : 0);
        }
        if (arg2 == 26) {
            method1003();
        }
        if (arg2 == 3) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(0);
            field304.method2256(class124.field1977[82] ? 1 : 0);
            field304.method2159(Statics.field316 + arg1);
            field304.method2158(Statics.field88 + arg0);
            field304.method2158(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 24) {
            class152 var11 = class152.method2559(arg1);
            boolean var12 = true;
            if (var11.field2530 > 0) {
                var12 = method1874(var11);
            }
            if (var12) {
                field304.method2369(103);
                field304.method2119(arg1);
            }
        }
        if (arg2 == 5) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(252);
            field304.method2158(Statics.field316 + arg1);
            field304.method2158(arg3 >> 14 & 0x7FFF);
            field304.method2151(class124.field1977[82] ? 1 : 0);
            field304.method2160(Statics.field88 + arg0);
        }
        if (arg2 == 46) {
            class3 var13 = field383[arg3];
            if (var13 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(67);
                field304.method2204(class124.field1977[82] ? 1 : 0);
                field304.method2160(arg3);
            }
        }
        if (arg2 == 1005) {
            class152 var14 = class152.method2559(arg1);
            if (var14 == null || var14.field2640[arg0] < 100000) {
                field304.method2369(102);
                field304.method2270(arg3);
            } else {
                class10.method545(27, "", var14.field2640[arg0] + " x " + class45.method500(arg3).field1026);
            }
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 14) {
            class3 var15 = field383[arg3];
            if (var15 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(163);
                field304.method2158(Statics.field189);
                field304.method2167(Statics.field1953);
                field304.method2160(arg3);
                field304.method2256(class124.field1977[82] ? 1 : 0);
                field304.method2159(Statics.field1057);
            }
        }
        if (arg2 == 4) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(241);
            field304.method2256(class124.field1977[82] ? 1 : 0);
            field304.method2270(arg3 >> 14 & 0x7FFF);
            field304.method2270(Statics.field316 + arg1);
            field304.method2159(Statics.field88 + arg0);
        }
        if (arg2 == 20) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(186);
            field304.method2160(Statics.field316 + arg1);
            field304.method2256(class124.field1977[82] ? 1 : 0);
            field304.method2160(arg3);
            field304.method2158(Statics.field88 + arg0);
        }
        if (arg2 == 1001) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(193);
            field304.method2256(class124.field1977[82] ? 1 : 0);
            field304.method2270(arg3 >> 14 & 0x7FFF);
            field304.method2158(Statics.field316 + arg1);
            field304.method2270(Statics.field88 + arg0);
        }
        if (arg2 == 11) {
            class30 var16 = field300[arg3];
            if (var16 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(49);
                field304.method2159(arg3);
                field304.method2151(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class3 var17 = field383[arg3];
            if (var17 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(25);
                field304.method2159(arg3);
                field304.method2256(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field304.method2369(4);
            field304.method2159(arg0);
            field304.method2159(arg3);
            field304.method2119(arg1);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 16) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(61);
            field304.method2160(Statics.field316 + arg1);
            field304.method2160(arg3);
            field304.method2159(Statics.field189);
            field304.method2160(Statics.field88 + arg0);
            field304.method2204(class124.field1977[82] ? 1 : 0);
            field304.method2159(Statics.field1057);
            field304.method2169(Statics.field1953);
        }
        if (arg2 == 48) {
            class3 var18 = field383[arg3];
            if (var18 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(120);
                field304.method2116(class124.field1977[82] ? 1 : 0);
                field304.method2160(arg3);
            }
        }
        if (arg2 == 58) {
            field304.method2369(141);
            field304.method2167(Statics.field143);
            field304.method2119(arg1);
            field304.method2159(field422);
            field304.method2160(arg0);
        }
        if (arg2 == 33) {
            field304.method2369(60);
            field304.method2270(arg0);
            field304.method2159(arg3);
            field304.method2231(arg1);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 12) {
            class30 var19 = field300[arg3];
            if (var19 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(20);
                field304.method2158(arg3);
                field304.method2151(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(184);
            field304.method2116(class124.field1977[82] ? 1 : 0);
            field304.method2270(Statics.field88 + arg0);
            field304.method2160(Statics.field316 + arg1);
            field304.method2160(arg3);
        }
        if (arg2 == 45) {
            class3 var20 = field383[arg3];
            if (var20 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(119);
                field304.method2256(class124.field1977[82] ? 1 : 0);
                field304.method2270(arg3);
            }
        }
        if (arg2 == 1004) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field304.method2369(102);
            field304.method2270(arg3);
        }
        if (arg2 == 34) {
            field304.method2369(52);
            field304.method2159(arg0);
            field304.method2270(arg3);
            field304.method2167(arg1);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 2) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(81);
            field304.method2158(Statics.field88 + arg0);
            field304.method2159(Statics.field316 + arg1);
            field304.method2160(arg3 >> 14 & 0x7FFF);
            field304.method2119(Statics.field143);
            field304.method2158(field422);
            field304.method2151(class124.field1977[82] ? 1 : 0);
        }
        if (arg2 == 25) {
            class152 var21 = Statics.method2714(arg1, arg0);
            if (var21 != null) {
                method466();
                int var22 = method94(var21);
                int var23 = var22 >> 11 & 0x3F;
                class152 var25 = Statics.method2714(arg1, arg0);
                if (var25 != null && var25.field2615 != null) {
                    class1 var26 = new class1();
                    var26.field3 = var25;
                    var26.field9 = var25.field2615;
                    class32.method451(var26);
                }
                field421 = true;
                Statics.field143 = arg1;
                field422 = arg0;
                Statics.field1997 = var23;
                method130(var25);
                field419 = 0;
                field423 = method2708(var21);
                if (field423 == null) {
                    field423 = "Null";
                }
                if (var21.field2536) {
                    field424 = var21.field2597 + class2.method2720(16777215);
                } else {
                    field424 = class2.method2720(65280) + var21.field2637 + class2.method2720(16777215);
                }
            }
            return;
        }
        if (arg2 == 49) {
            class3 var27 = field383[arg3];
            if (var27 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(146);
                field304.method2256(class124.field1977[82] ? 1 : 0);
                field304.method2159(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field1257.method1644(Statics.field1494, arg0, arg1);
        }
        if (arg2 == 32) {
            field304.method2369(93);
            field304.method2270(arg3);
            field304.method2231(arg1);
            field304.method2160(field422);
            field304.method2159(arg0);
            field304.method2167(Statics.field143);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 28) {
            field304.method2369(103);
            field304.method2119(arg1);
            class152 var28 = class152.method2559(arg1);
            if (var28.field2559 != null && var28.field2559[0][0] == 5) {
                int var29 = var28.field2559[0][1];
                class154.field2664[var29] = 1 - class154.field2664[var29];
                method79(var29);
            }
        }
        if (arg2 == 36) {
            field304.method2369(50);
            field304.method2167(arg1);
            field304.method2158(arg3);
            field304.method2158(arg0);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 15) {
            class3 var30 = field383[arg3];
            if (var30 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(122);
                field304.method2159(field422);
                field304.method2256(class124.field1977[82] ? 1 : 0);
                field304.method2167(Statics.field143);
                field304.method2160(arg3);
            }
        }
        if (arg2 == 29) {
            field304.method2369(103);
            field304.method2119(arg1);
            class152 var31 = class152.method2559(arg1);
            if (var31.field2559 != null && var31.field2559[0][0] == 5) {
                int var32 = var31.field2559[0][1];
                if (class154.field2664[var32] != var31.field2580[0]) {
                    class154.field2664[var32] = var31.field2580[0];
                    method79(var32);
                }
            }
        }
        if (arg2 == 1003) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            class30 var33 = field300[arg3];
            if (var33 != null) {
                class35 var34 = var33.field703;
                if (var34.field803 != null) {
                    var34 = var34.method596();
                }
                if (var34 != null) {
                    field304.method2369(72);
                    field304.method2159(var34.field811);
                }
            }
        }
        if (arg2 == 9) {
            class30 var35 = field300[arg3];
            if (var35 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(138);
                field304.method2256(class124.field1977[82] ? 1 : 0);
                field304.method2158(arg3);
            }
        }
        if (arg2 == 37) {
            field304.method2369(248);
            field304.method2158(arg3);
            field304.method2169(arg1);
            field304.method2159(arg0);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 51) {
            class3 var36 = field383[arg3];
            if (var36 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(114);
                field304.method2204(class124.field1977[82] ? 1 : 0);
                field304.method2160(arg3);
            }
        }
        if (arg2 == 10) {
            class30 var37 = field300[arg3];
            if (var37 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(37);
                field304.method2270(arg3);
                field304.method2151(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field304.method2369(233);
            field304.method2231(arg1);
            field304.method2270(arg3);
            field304.method2158(arg0);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 31) {
            field304.method2369(137);
            field304.method2231(arg1);
            field304.method2270(Statics.field1057);
            field304.method2270(Statics.field189);
            field304.method2119(Statics.field1953);
            field304.method2159(arg3);
            field304.method2158(arg0);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 1002) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field304.method2369(246);
            field304.method2160(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 39) {
            field304.method2369(153);
            field304.method2169(arg1);
            field304.method2158(arg3);
            field304.method2270(arg0);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 8) {
            class30 var38 = field300[arg3];
            if (var38 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(177);
                field304.method2270(field422);
                field304.method2270(arg3);
                field304.method2256(class124.field1977[82] ? 1 : 0);
                field304.method2119(Statics.field143);
            }
        }
        if (arg2 == 47) {
            class3 var39 = field383[arg3];
            if (var39 != null) {
                field370 = arg6;
                field371 = arg7;
                field433 = 2;
                field325 = 0;
                field494 = arg0;
                field495 = arg1;
                field304.method2369(105);
                field304.method2270(arg3);
                field304.method2256(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 40) {
            field304.method2369(180);
            field304.method2159(arg0);
            field304.method2231(arg1);
            field304.method2270(arg3);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 30 && field265 == null) {
            field304.method2369(46);
            field304.method2160(arg0);
            field304.method2169(arg1);
            field265 = Statics.method2714(arg1, arg0);
            method130(field265);
        }
        if (arg2 == 43) {
            field304.method2369(238);
            field304.method2270(arg3);
            field304.method2270(arg0);
            field304.method2119(arg1);
            field490 = 0;
            Statics.field618 = class152.method2559(arg1);
            field496 = arg0;
        }
        if (arg2 == 18) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(34);
            field304.method2256(class124.field1977[82] ? 1 : 0);
            field304.method2159(Statics.field88 + arg0);
            field304.method2270(arg3);
            field304.method2158(Statics.field316 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class152 var40 = Statics.method2714(arg1, arg0);
            if (var40 != null) {
                if (var40.field2624 != null) {
                    class1 var41 = new class1();
                    var41.field3 = var40;
                    var41.field6 = arg3;
                    var41.field10 = arg5;
                    var41.field9 = var40.field2624;
                    class32.method451(var41);
                }
                boolean var42 = true;
                if (var40.field2530 > 0) {
                    var42 = method1874(var40);
                }
                if (var42 && class156.method1893(method94(var40), arg3 - 1)) {
                    if (arg3 == 1) {
                        field304.method2369(32);
                        field304.method2119(arg1);
                        field304.method2270(arg0);
                    }
                    if (arg3 == 2) {
                        field304.method2369(222);
                        field304.method2119(arg1);
                        field304.method2270(arg0);
                    }
                    if (arg3 == 3) {
                        field304.method2369(175);
                        field304.method2119(arg1);
                        field304.method2270(arg0);
                    }
                    if (arg3 == 4) {
                        field304.method2369(136);
                        field304.method2119(arg1);
                        field304.method2270(arg0);
                    }
                    if (arg3 == 5) {
                        field304.method2369(198);
                        field304.method2119(arg1);
                        field304.method2270(arg0);
                    }
                    if (arg3 == 6) {
                        field304.method2369(73);
                        field304.method2119(arg1);
                        field304.method2270(arg0);
                    }
                    if (arg3 == 7) {
                        field304.method2369(139);
                        field304.method2119(arg1);
                        field304.method2270(arg0);
                    }
                    if (arg3 == 8) {
                        field304.method2369(84);
                        field304.method2119(arg1);
                        field304.method2270(arg0);
                    }
                    if (arg3 == 9) {
                        field304.method2369(158);
                        field304.method2119(arg1);
                        field304.method2270(arg0);
                    }
                    if (arg3 == 10) {
                        field304.method2369(203);
                        field304.method2119(arg1);
                        field304.method2270(arg0);
                    }
                }
            }
        }
        if (arg2 == 6) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(250);
            field304.method2159(Statics.field316 + arg1);
            field304.method2159(arg3 >> 14 & 0x7FFF);
            field304.method2160(Statics.field88 + arg0);
            field304.method2204(class124.field1977[82] ? 1 : 0);
        }
        if (arg2 == 38) {
            method466();
            class152 var43 = class152.method2559(arg1);
            field419 = 1;
            Statics.field1057 = arg0;
            Statics.field1953 = arg1;
            Statics.field189 = arg3;
            method130(var43);
            field420 = class2.method2720(16748608) + class45.method500(arg3).field1026 + class2.method2720(16777215);
            if (field420 == null) {
                field420 = "null";
            }
            return;
        }
        if (arg2 == 17) {
            field370 = arg6;
            field371 = arg7;
            field433 = 2;
            field325 = 0;
            field494 = arg0;
            field495 = arg1;
            field304.method2369(1);
            field304.method2231(Statics.field143);
            field304.method2270(Statics.field88 + arg0);
            field304.method2256(class124.field1977[82] ? 1 : 0);
            field304.method2159(arg3);
            field304.method2158(Statics.field316 + arg1);
            field304.method2160(field422);
        }
        if (field419 != 0) {
            field419 = 0;
            method130(class152.method2559(Statics.field1953));
        }
        if (field421) {
            method466();
        }
        if (Statics.field618 != null && field490 == 0) {
            method130(Statics.field618);
        }
    }

    @ObfuscatedName("z.bl(ILjava/lang/String;B)V")
    public static void method7(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field384; var3++) {
            class3 var4 = field383[field385[var3]];
            if (var4 != null && var4.field32 != null && var4.field32.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field304.method2369(38);
                    field304.method2204(0);
                    field304.method2159(field385[var3]);
                } else if (arg0 == 4) {
                    field304.method2369(105);
                    field304.method2270(field385[var3]);
                    field304.method2256(0);
                } else if (arg0 == 6) {
                    field304.method2369(146);
                    field304.method2256(0);
                    field304.method2159(field385[var3]);
                } else if (arg0 == 7) {
                    field304.method2369(25);
                    field304.method2159(field385[var3]);
                    field304.method2256(0);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class10.method545(4, "", class142.field2304 + arg1);
        }
    }

    @ObfuscatedName("u.ba(B)V")
    public static void method466() {
        if (!field421) {
            return;
        }
        class152 var0 = Statics.method2714(Statics.field143, field422);
        if (var0 != null && var0.field2616 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field9 = var0.field2616;
            class32.method451(var1);
        }
        field421 = false;
        method130(var0);
    }

    @ObfuscatedName("i.bq(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method134(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field410 || field408 >= 500) {
            return;
        }
        field378[field408] = arg0;
        field414[field408] = arg1;
        field375[field408] = arg2;
        field412[field408] = arg3;
        field272[field408] = arg4;
        field380[field408] = arg5;
        field408++;
    }

    @ObfuscatedName("bb.bu(I)V")
    public static void method1314() {
        for (int var0 = 0; var0 < field408; var0++) {
            int var1 = field375[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field408 - 1) {
                    for (int var3 = var0; var3 < field408 - 1; var3++) {
                        field378[var3] = field378[var3 + 1];
                        field414[var3] = field414[var3 + 1];
                        field375[var3] = field375[var3 + 1];
                        field412[var3] = field412[var3 + 1];
                        field272[var3] = field272[var3 + 1];
                        field380[var3] = field380[var3 + 1];
                    }
                }
                field408--;
            }
        }
    }

    @ObfuscatedName("h.bn(IIIIB)V")
    public static final void method30(int arg0, int arg1, int arg2, int arg3) {
        if (field419 == 0 && !field421) {
            method134(class142.field2310, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class98.field1737; var5++) {
            int var6 = class98.field1761[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field1257.method1648(Statics.field1494, var7, var8, var6) >= 0) {
                    class36 var11 = class36.method2079(var10);
                    if (var11.field880 != null) {
                        var11 = var11.method626();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field419 == 1) {
                        method134(class142.field2305, field420 + " " + class2.field21 + " " + class2.method2720(65535) + var11.field849, 1, var6, var7, var8);
                    } else if (!field421) {
                        String[] var12 = var11.field852;
                        if (field336) {
                            var12 = method814(var12);
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
                                    method134(var12[var13], class2.method2720(65535) + var11.field849, var14, var6, var7, var8);
                                }
                            }
                        }
                        method134(class142.field2214, class2.method2720(65535) + var11.field849, 1002, var11.field846 << 14, var7, var8);
                    } else if ((Statics.field1997 & 0x4) == 4) {
                        method134(field423, field424 + " " + class2.field21 + " " + class2.method2720(65535) + var11.field849, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class30 var15 = field300[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field703.field808 == 1 && (var15.field747 & 0x7F) == 64 && (var15.field735 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field301; var16++) {
                            class30 var17 = field300[field348[var16]];
                            if (var17 != null && var15 != var17 && var17.field703.field808 == 1 && var15.field747 == var17.field747 && var15.field735 == var17.field735) {
                                method2563(var17.field703, field348[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field384; var18++) {
                            class3 var19 = field383[field385[var18]];
                            if (var19 != null && var15.field747 == var19.field747 && var15.field735 == var19.field735) {
                                method2395(var19, field385[var18], var7, var8);
                            }
                        }
                    }
                    method2563(var15.field703, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field383[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field747 & 0x7F) == 64 && (var20.field735 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field301; var21++) {
                            class30 var22 = field300[field348[var21]];
                            if (var22 != null && var22.field703.field808 == 1 && var20.field747 == var22.field747 && var20.field735 == var22.field735) {
                                method2563(var22.field703, field348[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field384; var23++) {
                            class3 var24 = field383[field385[var23]];
                            if (var24 != null && var20 != var24 && var20.field747 == var24.field747 && var20.field735 == var24.field735) {
                                method2395(var24, field385[var23], var7, var8);
                            }
                        }
                    }
                    method2395(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field399[Statics.field1494][var7][var8];
                    if (var25 != null) {
                        for (class25 var26 = (class25) var25.method3256(); var26 != null; var26 = (class25) var25.method3244()) {
                            class45 var27 = class45.method500(var26.field625);
                            if (field419 == 1) {
                                method134(class142.field2305, field420 + " " + class2.field21 + " " + class2.method2720(16748608) + var27.field1026, 16, var26.field625, var7, var8);
                            } else if (!field421) {
                                String[] var28 = var27.field1032;
                                if (field336) {
                                    var28 = method814(var28);
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
                                        method134(var28[var29], class2.method2720(16748608) + var27.field1026, var30, var26.field625, var7, var8);
                                    } else if (var29 == 2) {
                                        method134(class142.field2301, class2.method2720(16748608) + var27.field1026, 20, var26.field625, var7, var8);
                                    }
                                }
                                method134(class142.field2214, class2.method2720(16748608) + var27.field1026, 1004, var26.field625, var7, var8);
                            } else if ((Statics.field1997 & 0x1) == 1) {
                                method134(field423, field424 + " " + class2.field21 + " " + class2.method2720(16748608) + var27.field1026, 17, var26.field625, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.bc(Lan;IIII)V")
    public static final void method2563(class35 arg0, int arg1, int arg2, int arg3) {
        if (field408 >= 400) {
            return;
        }
        if (arg0.field803 != null) {
            arg0 = arg0.method596();
        }
        if (arg0 == null || !arg0.field835 || arg0.field807 && field307 != arg1) {
            return;
        }
        String var4 = arg0.field820;
        if (arg0.field824 != 0) {
            var4 = var4 + method136(arg0.field824, Statics.field391.field34) + " " + class2.field19 + class142.field2311 + arg0.field824 + class2.field20;
        }
        if (field419 == 1) {
            method134(class142.field2305, field420 + " " + class2.field21 + " " + class2.method2720(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field421) {
            String[] var5 = arg0.field822;
            if (field336) {
                var5 = method814(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class142.field2307)) {
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
                        method134(var5[var6], class2.method2720(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class142.field2307)) {
                        short var9 = 0;
                        if (field429 == class18.field527 || field429 == class18.field528 && arg0.field824 > Statics.field391.field34) {
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
                        method134(var5[var8], class2.method2720(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method134(class142.field2214, class2.method2720(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1997 & 0x2) == 2) {
            method134(field423, field424 + " " + class2.field21 + " " + class2.method2720(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dq.bj(Ly;IIII)V")
    public static final void method2395(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field391 == arg0 || field408 >= 400) {
            return;
        }
        String var4;
        if (arg0.field48 == 0) {
            var4 = arg0.field32 + method136(arg0.field34, Statics.field391.field34) + " " + class2.field19 + class142.field2311 + arg0.field34 + class2.field20;
        } else {
            var4 = arg0.field32 + " " + class2.field19 + class142.field2312 + arg0.field48 + class2.field20;
        }
        if (field419 == 1) {
            method134(class142.field2305, field420 + " " + class2.field21 + " " + class2.method2720(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field421) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field395[var5] != null) {
                    short var6 = 0;
                    if (field395[var5].equalsIgnoreCase(class142.field2307)) {
                        if (field429 == class18.field527 || field429 == class18.field528 && arg0.field34 > Statics.field391.field34) {
                            var6 = 2000;
                        }
                        if (Statics.field391.field31 != 0 && arg0.field31 != 0) {
                            if (Statics.field391.field31 == arg0.field31) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field365[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field394[var5] + var6;
                    method134(field395[var5], class2.method2720(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1997 & 0x8) == 8) {
            method134(field423, field424 + " " + class2.field21 + " " + class2.method2720(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field408; var9++) {
            if (field375[var9] == 23) {
                field414[var9] = class2.method2720(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("i.bv(III)Ljava/lang/String;")
    public static final String method136(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2720(16711680);
        } else if (var2 < -6) {
            return class2.method2720(16723968);
        } else if (var2 < -3) {
            return class2.method2720(16740352);
        } else if (var2 < 0) {
            return class2.method2720(16756736);
        } else if (var2 > 9) {
            return class2.method2720(65280);
        } else if (var2 > 6) {
            return class2.method2720(4259584);
        } else if (var2 > 3) {
            return class2.method2720(8453888);
        } else if (var2 > 0) {
            return class2.method2720(12648192);
        } else {
            return class2.method2720(16776960);
        }
    }

    @ObfuscatedName("f.cc(IIIIIIIIB)V")
    public static final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class152.method487(arg0)) {
            Statics.field178 = null;
            method3320(Statics.field2633[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field178 != null) {
                method3320(Statics.field178, -1412584499, arg1, arg2, arg3, arg4, Statics.field449, Statics.field53, arg7);
                Statics.field178 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field470[var8] = true;
            }
        } else {
            field470[arg7] = true;
        }
    }

    @ObfuscatedName("gx.ch([Lem;IIIIIIIII)V")
    public static final void method3320(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1518(arg2, arg3, arg4, arg5);
        class84.method1791();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class152 var10 = arg0[var9];
            if (var10 != null && (var10.field2573 == arg1 || arg1 == -1412584499 && field437 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field473[field468] = var10.field2542 + arg6;
                    field474[field468] = var10.field2543 + arg7;
                    field472[field468] = var10.field2546;
                    field476[field468] = var10.field2547;
                    var11 = ++field468 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2652 = var11;
                var10.field2653 = field280;
                if (!var10.field2536 || !method158(var10)) {
                    if (var10.field2530 > 0) {
                        int var12 = var10.field2530;
                        if (var12 == 324) {
                            if (field521 == -1) {
                                field521 = var10.field2561;
                                field358 = var10.field2548;
                            }
                            if (field520.field2676) {
                                var10.field2561 = field521;
                            } else {
                                var10.field2561 = field358;
                            }
                        } else if (var12 == 325) {
                            if (field521 == -1) {
                                field521 = var10.field2561;
                                field358 = var10.field2548;
                            }
                            if (field520.field2676) {
                                var10.field2561 = field358;
                            } else {
                                var10.field2561 = field521;
                            }
                        } else if (var12 == 327) {
                            var10.field2577 = 150;
                            var10.field2578 = (int) (Math.sin((double) field280 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2612 = 5;
                            var10.field2634 = 0;
                        } else if (var12 == 328) {
                            var10.field2577 = 150;
                            var10.field2578 = (int) (Math.sin((double) field280 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2612 = 5;
                            var10.field2634 = 1;
                        }
                    }
                    int var13 = var10.field2542 + arg6;
                    int var14 = var10.field2543 + arg7;
                    int var15 = var10.field2594;
                    if (field437 == var10) {
                        if (arg1 != -1412584499 && !var10.field2602) {
                            Statics.field178 = arg0;
                            Statics.field449 = arg6;
                            Statics.field53 = arg7;
                            continue;
                        }
                        if (field387 && field442) {
                            int var16 = class127.field2016;
                            int var17 = class127.field2011 * 1253894097;
                            int var18 = var16 - field439;
                            int var19 = var17 - field440;
                            if (var18 < field443) {
                                var18 = field443;
                            }
                            if (var10.field2546 + var18 > field443 + field346.field2546) {
                                var18 = field443 + field346.field2546 - var10.field2546;
                            }
                            if (var19 < field444) {
                                var19 = field444;
                            }
                            if (var10.field2547 + var19 > field444 + field346.field2547) {
                                var19 = field444 + field346.field2547 - var10.field2547;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2602) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2539 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2539 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2546 + var13;
                        int var27 = var10.field2547 + var14;
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
                        int var30 = var10.field2546 + var13;
                        int var31 = var10.field2547 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2536 || var20 < var22 && var21 < var23) {
                        if (var10.field2530 != 0) {
                            if (var10.field2530 == 1337) {
                                field294 = var13;
                                field318 = var14;
                                int var32 = var10.field2546;
                                int var33 = var10.field2547;
                                class73.method1518(var13, var14, var13 + var32, var14 + var33);
                                class84.method1791();
                                field367++;
                                method163(class29.field697);
                                boolean var34 = false;
                                if (field398 >= 0) {
                                    for (int var35 = 0; var35 < field384; var35++) {
                                        if (field398 == field385[var35]) {
                                            var34 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var34) {
                                    method163(class29.field694);
                                }
                                method869(true);
                                method163(var34 ? class29.field693 : class29.field692);
                                method869(false);
                                method2630();
                                method455();
                                if (!field508) {
                                    int var36 = field347;
                                    if (field326 / 256 > var36) {
                                        var36 = field326 / 256;
                                    }
                                    if (field509[4] && field396[4] + 128 > var36) {
                                        var36 = field396[4] + 128;
                                    }
                                    int var37 = field447 + field332 & 0x7FF;
                                    method151(Statics.field986, method107(Statics.field391.field747, Statics.field391.field735, Statics.field1494) - 50, Statics.field1282, var36, var37, var36 * 3 + 600);
                                }
                                int var38;
                                if (field508) {
                                    int var39;
                                    if (Statics.field1921.field140) {
                                        var39 = Statics.field1494;
                                    } else {
                                        int var40 = method107(Statics.field1956, Statics.field1661, Statics.field1494);
                                        if (var40 - Statics.field531 >= 800 || (class6.field87[Statics.field1494][Statics.field1956 >> 7][Statics.field1661 >> 7] & 0x4) == 0) {
                                            var39 = 3;
                                        } else {
                                            var39 = Statics.field1494;
                                        }
                                    }
                                    var38 = var39;
                                } else {
                                    var38 = method28();
                                }
                                int var41 = Statics.field1956;
                                int var42 = Statics.field531;
                                int var43 = Statics.field1661;
                                int var44 = Statics.field1687;
                                int var45 = Statics.field149;
                                for (int var46 = 0; var46 < 5; var46++) {
                                    if (field509[var46]) {
                                        int var47 = (int) (Math.random() * (double) (field459[var46] * 2 + 1) - (double) field459[var46] + Math.sin((double) field354[var46] / 100.0D * (double) field513[var46]) * (double) field396[var46]);
                                        if (var46 == 0) {
                                            Statics.field1956 += var47;
                                        }
                                        if (var46 == 1) {
                                            Statics.field531 += var47;
                                        }
                                        if (var46 == 2) {
                                            Statics.field1661 += var47;
                                        }
                                        if (var46 == 3) {
                                            Statics.field149 = Statics.field149 + var47 & 0x7FF;
                                        }
                                        if (var46 == 4) {
                                            Statics.field1687 += var47;
                                            if (Statics.field1687 < 128) {
                                                Statics.field1687 = 128;
                                            }
                                            if (Statics.field1687 > 383) {
                                                Statics.field1687 = 383;
                                            }
                                        }
                                    }
                                }
                                int var48 = class127.field2016;
                                int var49 = class127.field2011 * 1253894097;
                                if (class127.field2019 != 0) {
                                    var48 = class127.field2020;
                                    var49 = class127.field2021;
                                }
                                if (var48 >= var13 && var48 < var13 + var32 && var49 >= var14 && var49 < var14 + var33) {
                                    class98.field1757 = true;
                                    class98.field1737 = 0;
                                    class98.field1760 = var48 - var13;
                                    class98.field1759 = var49 - var14;
                                } else {
                                    class98.field1757 = false;
                                    class98.field1737 = 0;
                                }
                                method682();
                                class73.method1524(var13, var14, var32, var33, 0);
                                method682();
                                Statics.field1257.method1645(Statics.field1956, Statics.field531, Statics.field1661, Statics.field1687, Statics.field149, var38);
                                method682();
                                Statics.field1257.method1773();
                                field356 = 0;
                                boolean var50 = false;
                                int var51 = -1;
                                for (int var52 = -1; var52 < field384 + field301; var52++) {
                                    class33 var53;
                                    if (var52 == -1) {
                                        var53 = Statics.field391;
                                    } else if (var52 < field384) {
                                        var53 = field383[field385[var52]];
                                        if (field398 == field385[var52]) {
                                            var50 = true;
                                            var51 = var52;
                                            continue;
                                        }
                                    } else {
                                        var53 = field300[field348[var52 - field384]];
                                    }
                                    method868(var53, var52, var13, var14, var32, var33);
                                }
                                if (var50) {
                                    method868(field383[field398], var51, var13, var14, var32, var33);
                                }
                                for (int var54 = 0; var54 < field356; var54++) {
                                    int var55 = field295[var54];
                                    int var56 = field359[var54];
                                    int var57 = field285[var54];
                                    int var58 = field360[var54];
                                    boolean var59 = true;
                                    while (var59) {
                                        var59 = false;
                                        for (int var60 = 0; var60 < var54; var60++) {
                                            if (var56 + 2 > field359[var60] - field360[var60] && var56 - var58 < field359[var60] + 2 && var55 - var57 < field295[var60] + field285[var60] && var55 + var57 > field295[var60] - field285[var60] && field359[var60] - field360[var60] < var56) {
                                                var56 = field359[var60] - field360[var60];
                                                var59 = true;
                                            }
                                        }
                                    }
                                    field368 = field295[var54];
                                    field369 = field359[var54] = var56;
                                    String var61 = field372[var54];
                                    if (field427 == 0) {
                                        int var62 = 16776960;
                                        if (field271[var54] < 6) {
                                            var62 = field303[field271[var54]];
                                        }
                                        if (field271[var54] == 6) {
                                            var62 = field367 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field271[var54] == 7) {
                                            var62 = field367 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field271[var54] == 8) {
                                            var62 = field367 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field271[var54] == 9) {
                                            int var63 = 150 - field364[var54];
                                            if (var63 < 50) {
                                                var62 = var63 * 1280 + 16711680;
                                            } else if (var63 < 100) {
                                                var62 = 16776960 - (var63 - 50) * 327680;
                                            } else if (var63 < 150) {
                                                var62 = (var63 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field271[var54] == 10) {
                                            int var64 = 150 - field364[var54];
                                            if (var64 < 50) {
                                                var62 = var64 * 5 + 16711680;
                                            } else if (var64 < 100) {
                                                var62 = 16711935 - (var64 - 50) * 327680;
                                            } else if (var64 < 150) {
                                                var62 = (var64 - 100) * 327680 + 255 - (var64 - 100) * 5;
                                            }
                                        }
                                        if (field271[var54] == 11) {
                                            int var65 = 150 - field364[var54];
                                            if (var65 < 50) {
                                                var62 = 16777215 - var65 * 327685;
                                            } else if (var65 < 100) {
                                                var62 = (var65 - 50) * 327685 + 65280;
                                            } else if (var65 < 150) {
                                                var62 = 16777215 - (var65 - 100) * 327680;
                                            }
                                        }
                                        if (field363[var54] == 0) {
                                            Statics.field91.method3346(var61, field368 + var13, field369 + var14, var62, 0);
                                        }
                                        if (field363[var54] == 1) {
                                            Statics.field91.method3348(var61, field368 + var13, field369 + var14, var62, 0, field367);
                                        }
                                        if (field363[var54] == 2) {
                                            Statics.field91.method3406(var61, field368 + var13, field369 + var14, var62, 0, field367);
                                        }
                                        if (field363[var54] == 3) {
                                            Statics.field91.method3350(var61, field368 + var13, field369 + var14, var62, 0, field367, 150 - field364[var54]);
                                        }
                                        if (field363[var54] == 4) {
                                            int var66 = (150 - field364[var54]) * (Statics.field91.method3339(var61) + 100) / 150;
                                            class73.method1519(field368 + var13 - 50, var14, field368 + var13 + 50, var14 + var33);
                                            Statics.field91.method3344(var61, field368 + var13 + 50 - var66, field369 + var14, var62, 0);
                                            class73.method1518(var13, var14, var13 + var32, var14 + var33);
                                        }
                                        if (field363[var54] == 5) {
                                            int var67 = 150 - field364[var54];
                                            int var68 = 0;
                                            if (var67 < 25) {
                                                var68 = var67 - 25;
                                            } else if (var67 > 125) {
                                                var68 = var67 - 125;
                                            }
                                            class73.method1519(var13, field369 + var14 - Statics.field91.field2896 - 1, var13 + var32, field369 + var14 + 5);
                                            Statics.field91.method3346(var61, field368 + var13, field369 + var14 + var68, var62, 0);
                                            class73.method1518(var13, var14, var13 + var32, var14 + var33);
                                        }
                                    } else {
                                        Statics.field91.method3346(var61, field368 + var13, field369 + var14, 16776960, 0);
                                    }
                                }
                                method1788(var13, var14);
                                ((class88) Statics.field1465).method1879(field340);
                                if (field433 == 1) {
                                    Statics.field1125[field325 / 100].method1510(field370 - 8, field371 - 8);
                                }
                                if (field433 == 2) {
                                    Statics.field1125[field325 / 100 + 4].method1510(field370 - 8, field371 - 8);
                                }
                                field382 = 0;
                                int var69 = (Statics.field391.field747 >> 7) + Statics.field88;
                                int var70 = (Statics.field391.field735 >> 7) + Statics.field316;
                                if (var69 >= 3053 && var69 <= 3156 && var70 >= 3056 && var70 <= 3136) {
                                    field382 = 1;
                                }
                                if (var69 >= 3072 && var69 <= 3118 && var70 >= 9492 && var70 <= 9535) {
                                    field382 = 1;
                                }
                                if (field382 == 1 && var69 >= 3139 && var69 <= 3199 && var70 >= 3008 && var70 <= 3062) {
                                    field382 = 0;
                                }
                                if (field276) {
                                    int var71 = var13 + 512 - 5;
                                    int var72 = var14 + 20;
                                    Statics.field229.method3345("Fps:" + field2060, var71, var72, 16776960, -1);
                                    int var192 = var72 + 15;
                                    Runtime var73 = Runtime.getRuntime();
                                    int var74 = (int) ((var73.totalMemory() - var73.freeMemory()) / 1024L);
                                    int var75 = 16776960;
                                    if (var74 > 32768 && field407) {
                                        var75 = 16711680;
                                    }
                                    if (var74 > 65536 && !field407) {
                                        var75 = 16711680;
                                    }
                                    Statics.field229.method3345("Mem:" + var74 + "k", var71, var192, var75, -1);
                                    var72 = var192 + 15;
                                }
                                Statics.field1956 = var41;
                                Statics.field531 = var42;
                                Statics.field1661 = var43;
                                Statics.field1687 = var44;
                                Statics.field149 = var45;
                                if (field269) {
                                    byte var76 = 0;
                                    int var77 = class150.field2508 + class150.field2501 + var76;
                                    if (var77 == 0) {
                                        field269 = false;
                                    }
                                }
                                if (field269) {
                                    class73.method1524(var13, var14, var32, var33, 0);
                                    method115(class142.field2164, false);
                                }
                                class73.method1518(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2530 == 1338) {
                                method682();
                                class73.method1518(var13, var14, Statics.field622.field1324 + var13, Statics.field622.field1328 + var14);
                                if (field512 == 2 || field512 == 5) {
                                    class73.method1533(var13 + 25, var14 + 5, 0, Statics.field227, Statics.field2053);
                                } else {
                                    int var79 = field447 + field335 & 0x7FF;
                                    int var80 = Statics.field391.field747 / 32 + 48;
                                    int var81 = 464 - Statics.field391.field735 / 32;
                                    Statics.field571.method1466(var13 + 25, var14 + 5, 146, 151, var80, var81, var79, field345 + 256, Statics.field227, Statics.field2053);
                                    for (int var82 = 0; var82 < field376; var82++) {
                                        int var83 = field491[var82] * 4 + 2 - Statics.field391.field747 / 32;
                                        int var84 = field492[var82] * 4 + 2 - Statics.field391.field735 / 32;
                                        method2600(var13, var14, var83, var84, field361[var82]);
                                    }
                                    for (int var85 = 0; var85 < 104; var85++) {
                                        for (int var86 = 0; var86 < 104; var86++) {
                                            class177 var87 = field399[Statics.field1494][var85][var86];
                                            if (var87 != null) {
                                                int var88 = var85 * 4 + 2 - Statics.field391.field747 / 32;
                                                int var89 = var86 * 4 + 2 - Statics.field391.field735 / 32;
                                                method2600(var13, var14, var88, var89, Statics.field125[0]);
                                            }
                                        }
                                    }
                                    for (int var90 = 0; var90 < field301; var90++) {
                                        class30 var91 = field300[field348[var90]];
                                        if (var91 != null && var91.method16()) {
                                            class35 var92 = var91.field703;
                                            if (var92 != null && var92.field803 != null) {
                                                var92 = var92.method596();
                                            }
                                            if (var92 != null && var92.field823 && var92.field835) {
                                                int var93 = var91.field747 / 32 - Statics.field391.field747 / 32;
                                                int var94 = var91.field735 / 32 - Statics.field391.field735 / 32;
                                                method2600(var13, var14, var93, var94, Statics.field125[1]);
                                            }
                                        }
                                    }
                                    for (int var95 = 0; var95 < field384; var95++) {
                                        class3 var96 = field383[field385[var95]];
                                        if (var96 != null && var96.method16()) {
                                            int var97 = var96.field747 / 32 - Statics.field391.field747 / 32;
                                            int var98 = var96.field735 / 32 - Statics.field391.field735 / 32;
                                            boolean var99 = false;
                                            if (method200(var96.field32, true)) {
                                                var99 = true;
                                            }
                                            boolean var100 = false;
                                            for (int var101 = 0; var101 < Statics.field1357; var101++) {
                                                if (var96.field32.equals(Statics.field1887[var101].field577)) {
                                                    var100 = true;
                                                    break;
                                                }
                                            }
                                            boolean var102 = false;
                                            if (Statics.field391.field31 != 0 && var96.field31 != 0 && Statics.field391.field31 == var96.field31) {
                                                var102 = true;
                                            }
                                            if (var99) {
                                                method2600(var13, var14, var97, var98, Statics.field125[3]);
                                            } else if (var102) {
                                                method2600(var13, var14, var97, var98, Statics.field125[4]);
                                            } else if (var100) {
                                                method2600(var13, var14, var97, var98, Statics.field125[5]);
                                            } else {
                                                method2600(var13, var14, var97, var98, Statics.field125[2]);
                                            }
                                        }
                                    }
                                    if (field278 != 0 && field280 % 20 < 10) {
                                        if (field278 == 1 && field279 >= 0 && field279 < field300.length) {
                                            class30 var103 = field300[field279];
                                            if (var103 != null) {
                                                int var104 = var103.field747 / 32 - Statics.field391.field747 / 32;
                                                int var105 = var103.field735 / 32 - Statics.field391.field735 / 32;
                                                method1981(var13, var14, var104, var105, Statics.field239[1]);
                                            }
                                        }
                                        if (field278 == 2) {
                                            int var106 = field270 * 4 - Statics.field88 * 4 + 2 - Statics.field391.field747 / 32;
                                            int var107 = field282 * 4 - Statics.field316 * 4 + 2 - Statics.field391.field735 / 32;
                                            method1981(var13, var14, var106, var107, Statics.field239[1]);
                                        }
                                        if (field278 == 10 && field281 >= 0 && field281 < field383.length) {
                                            class3 var108 = field383[field281];
                                            if (var108 != null) {
                                                int var109 = var108.field747 / 32 - Statics.field391.field747 / 32;
                                                int var110 = var108.field735 / 32 - Statics.field391.field735 / 32;
                                                method1981(var13, var14, var109, var110, Statics.field239[1]);
                                            }
                                        }
                                    }
                                    if (field494 != 0) {
                                        int var111 = field494 * 4 + 2 - Statics.field391.field747 / 32;
                                        int var112 = field495 * 4 + 2 - Statics.field391.field735 / 32;
                                        method2600(var13, var14, var111, var112, Statics.field239[0]);
                                    }
                                    class73.method1524(var13 + 93 + 4, var14 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field512 < 3) {
                                    Statics.field710.method1466(var13, var14, 33, 33, 25, 25, field447, 256, Statics.field28, Statics.field1491);
                                } else {
                                    class73.method1533(var13, var14, 0, Statics.field28, Statics.field1491);
                                }
                                if (field506[var11]) {
                                    Statics.field622.method1586(var13, var14);
                                }
                                field471[var11] = true;
                                class73.method1518(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2539 == 0) {
                            if (!var10.field2536 && method158(var10) && Statics.field1912 != var10) {
                                continue;
                            }
                            if (!var10.field2536) {
                                if (var10.field2551 > var10.field2553 - var10.field2547) {
                                    var10.field2551 = var10.field2553 - var10.field2547;
                                }
                                if (var10.field2551 < 0) {
                                    var10.field2551 = 0;
                                }
                            }
                            method3320(arg0, var10.field2645, var20, var21, var22, var23, var13 - var10.field2550, var14 - var10.field2551, var11);
                            if (var10.field2541 != null) {
                                method3320(var10.field2541, var10.field2645, var20, var21, var22, var23, var13 - var10.field2550, var14 - var10.field2551, var11);
                            }
                            class4 var113 = (class4) field297.method3214((long) var10.field2645);
                            if (var113 != null) {
                                method139(var113.field62, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class73.method1518(arg2, arg3, arg4, arg5);
                            class84.method1791();
                        }
                        if (field506[var11] || field477 > 1) {
                            if (var10.field2539 == 0 && !var10.field2536 && var10.field2553 > var10.field2547) {
                                method2412(var10.field2546 + var13, var14, var10.field2551, var10.field2547, var10.field2553);
                            }
                            if (var10.field2539 != 1) {
                                if (var10.field2539 == 2) {
                                    int var114 = 0;
                                    for (int var115 = 0; var115 < var10.field2547; var115++) {
                                        for (int var116 = 0; var116 < var10.field2546; var116++) {
                                            int var117 = (var10.field2598 + 32) * var116 + var13;
                                            int var118 = (var10.field2628 + 32) * var115 + var14;
                                            if (var114 < 20) {
                                                var117 += var10.field2646[var114];
                                                var118 += var10.field2593[var114];
                                            }
                                            if (var10.field2639[var114] > 0) {
                                                boolean var119 = false;
                                                boolean var120 = false;
                                                int var121 = var10.field2639[var114] - 1;
                                                if (var117 + 32 > arg2 && var117 < arg4 && var118 + 32 > arg3 && var118 < arg5 || Statics.field57 == var10 && field351 == var114) {
                                                    class72 var122;
                                                    if (field419 == 1 && Statics.field1057 == var114 && Statics.field1953 == var10.field2645) {
                                                        var122 = class45.method155(var121, var10.field2640[var114], 2, 0, false);
                                                    } else {
                                                        var122 = class45.method155(var121, var10.field2640[var114], 1, 3153952, false);
                                                    }
                                                    if (var122 == null) {
                                                        method130(var10);
                                                    } else if (Statics.field57 == var10 && field351 == var114) {
                                                        int var123 = class127.field2016 - field337;
                                                        int var124 = class127.field2011 * 1253894097 - field478;
                                                        if (var123 < 5 && var123 > -5) {
                                                            var123 = 0;
                                                        }
                                                        if (var124 < 5 && var124 > -5) {
                                                            var124 = 0;
                                                        }
                                                        if (field381 < 5) {
                                                            var123 = 0;
                                                            var124 = 0;
                                                        }
                                                        var122.method1440(var117 + var123, var118 + var124, 128);
                                                        if (arg1 != -1) {
                                                            class152 var125 = arg0[arg1 & 0xFFFF];
                                                            if (var118 + var124 < class73.field1315 && var125.field2551 > 0) {
                                                                int var126 = field340 * (class73.field1315 - var118 - var124) / 3;
                                                                if (var126 > field340 * 10) {
                                                                    var126 = field340 * 10;
                                                                }
                                                                if (var126 > var125.field2551) {
                                                                    var126 = var125.field2551;
                                                                }
                                                                var125.field2551 -= var126;
                                                                field478 += var126;
                                                                method130(var125);
                                                            }
                                                            if (var118 + var124 + 32 > class73.field1319 && var125.field2551 < var125.field2553 - var125.field2547) {
                                                                int var127 = field340 * (var118 + var124 + 32 - class73.field1319) / 3;
                                                                if (var127 > field340 * 10) {
                                                                    var127 = field340 * 10;
                                                                }
                                                                if (var127 > var125.field2553 - var125.field2547 - var125.field2551) {
                                                                    var127 = var125.field2553 - var125.field2547 - var125.field2551;
                                                                }
                                                                var125.field2551 += var127;
                                                                field478 -= var127;
                                                                method130(var125);
                                                            }
                                                        }
                                                    } else if (Statics.field618 == var10 && field496 == var114) {
                                                        var122.method1440(var117, var118, 128);
                                                    } else {
                                                        var122.method1510(var117, var118);
                                                    }
                                                }
                                            } else if (var10.field2545 != null && var114 < 20) {
                                                class72 var128 = var10.method2883(var114);
                                                if (var128 != null) {
                                                    var128.method1510(var117, var118);
                                                } else if (class152.field2535) {
                                                    method130(var10);
                                                }
                                            }
                                            var114++;
                                        }
                                    }
                                } else if (var10.field2539 == 3) {
                                    int var129;
                                    if (method132(var10)) {
                                        var129 = var10.field2555;
                                        if (Statics.field1912 == var10 && var10.field2557 != 0) {
                                            var129 = var10.field2557;
                                        }
                                    } else {
                                        var129 = var10.field2565;
                                        if (Statics.field1912 == var10 && var10.field2571 != 0) {
                                            var129 = var10.field2571;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2558) {
                                            class73.method1524(var13, var14, var10.field2546, var10.field2547, var129);
                                        } else {
                                            class73.method1539(var13, var14, var10.field2546, var10.field2547, var129);
                                        }
                                    } else if (var10.field2558) {
                                        class73.method1523(var13, var14, var10.field2546, var10.field2547, var129, 256 - (var15 & 0xFF));
                                    } else {
                                        class73.method1527(var13, var14, var10.field2546, var10.field2547, var129, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2539 == 4) {
                                    class191 var130 = var10.method2910();
                                    if (var130 != null) {
                                        String var131 = var10.field2584;
                                        int var132;
                                        if (method132(var10)) {
                                            var132 = var10.field2555;
                                            if (Statics.field1912 == var10 && var10.field2557 != 0) {
                                                var132 = var10.field2557;
                                            }
                                            if (var10.field2585.length() > 0) {
                                                var131 = var10.field2585;
                                            }
                                        } else {
                                            var132 = var10.field2565;
                                            if (Statics.field1912 == var10 && var10.field2571 != 0) {
                                                var132 = var10.field2571;
                                            }
                                        }
                                        if (var10.field2536 && var10.field2641 != -1) {
                                            class45 var133 = class45.method500(var10.field2641);
                                            var131 = var133.field1026;
                                            if (var131 == null) {
                                                var131 = "null";
                                            }
                                            if ((var133.field1053 == 1 || var10.field2642 != 1) && var10.field2642 != -1) {
                                                var131 = class2.method2720(16748608) + var131 + class2.field24 + " " + 'x' + method1(var10.field2642);
                                            }
                                        }
                                        if (field265 == var10) {
                                            class142 var10000 = (class142) null;
                                            var131 = class142.field2313;
                                            var132 = var10.field2565;
                                        }
                                        if (!var10.field2536) {
                                            var131 = Statics.method31(var131, var10);
                                        }
                                        var130.method3347(var131, var13, var14, var10.field2546, var10.field2547, var132, var10.field2589 ? 0 : -1, var10.field2587, var10.field2588, var10.field2586);
                                    } else if (class152.field2535) {
                                        method130(var10);
                                    }
                                } else if (var10.field2539 == 5) {
                                    if (var10.field2536) {
                                        class72 var135;
                                        if (var10.field2641 == -1) {
                                            var135 = var10.method2881(false);
                                        } else {
                                            var135 = class45.method155(var10.field2641, var10.field2642, var10.field2614, var10.field2566, false);
                                        }
                                        if (var135 != null) {
                                            int var136 = var135.field1303;
                                            int var137 = var135.field1309;
                                            if (var10.field2564) {
                                                class73.method1519(var13, var14, var10.field2546 + var13, var10.field2547 + var14);
                                                int var138 = (var10.field2546 + (var136 - 1)) / var136;
                                                int var139 = (var10.field2547 + (var137 - 1)) / var137;
                                                for (int var140 = 0; var140 < var138; var140++) {
                                                    for (int var141 = 0; var141 < var139; var141++) {
                                                        if (var10.field2563 != 0) {
                                                            var135.method1446(var136 / 2 + var136 * var140 + var13, var137 / 2 + var137 * var141 + var14, var10.field2563, 4096);
                                                        } else if (var15 == 0) {
                                                            var135.method1510(var136 * var140 + var13, var137 * var141 + var14);
                                                        } else {
                                                            var135.method1440(var136 * var140 + var13, var137 * var141 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1518(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var142 = var10.field2546 * 4096 / var136;
                                                if (var10.field2563 != 0) {
                                                    var135.method1446(var10.field2546 / 2 + var13, var10.field2547 / 2 + var14, var10.field2563, var142);
                                                } else if (var15 != 0) {
                                                    var135.method1442(var13, var14, var10.field2546, var10.field2547, 256 - (var15 & 0xFF));
                                                } else if (var10.field2546 == var136 && var10.field2547 == var137) {
                                                    var135.method1510(var13, var14);
                                                } else {
                                                    var135.method1464(var13, var14, var10.field2546, var10.field2547);
                                                }
                                            }
                                        } else if (class152.field2535) {
                                            method130(var10);
                                        }
                                    } else {
                                        class72 var134 = var10.method2881(method132(var10));
                                        if (var134 != null) {
                                            var134.method1510(var13, var14);
                                        } else if (class152.field2535) {
                                            method130(var10);
                                        }
                                    }
                                } else if (var10.field2539 == 6) {
                                    boolean var143 = method132(var10);
                                    int var144;
                                    if (var143) {
                                        var144 = var10.field2609;
                                    } else {
                                        var144 = var10.field2644;
                                    }
                                    class98 var145 = null;
                                    int var146 = 0;
                                    if (var10.field2641 != -1) {
                                        class45 var147 = class45.method500(var10.field2641);
                                        if (var147 != null) {
                                            class45 var148 = var147.method850(var10.field2642);
                                            var145 = var148.method833(1);
                                            if (var145 == null) {
                                                method130(var10);
                                            } else {
                                                var145.method1988();
                                                var146 = var145.field1354 / 2;
                                            }
                                        }
                                    } else if (var10.field2612 == 5) {
                                        if (var10.field2634 == 0) {
                                            var145 = field520.method2950((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var145 = Statics.field391.method15();
                                        }
                                    } else if (var144 == -1) {
                                        var145 = var10.method2892((class38) null, -1, var143, Statics.field391.field38);
                                        if (var145 == null && class152.field2535) {
                                            method130(var10);
                                        }
                                    } else {
                                        class38 var149 = class38.method38(var144);
                                        var145 = var10.method2892(var149, var10.field2643, var143, Statics.field391.field38);
                                        if (var145 == null && class152.field2535) {
                                            method130(var10);
                                        }
                                    }
                                    class84.method1794(var10.field2546 / 2 + var13, var10.field2547 / 2 + var14);
                                    int var150 = var10.field2569 * class84.field1476[var10.field2577] >> 16;
                                    int var151 = var10.field2569 * class84.field1471[var10.field2577] >> 16;
                                    if (var145 != null) {
                                        if (var10.field2536) {
                                            var145.method1988();
                                            if (var10.field2629) {
                                                var145.method2000(0, var10.field2578, var10.field2579, var10.field2577, var10.field2567, var10.field2574 + var146 + var150, var10.field2574 + var151, var10.field2569);
                                            } else {
                                                var145.method1999(0, var10.field2578, var10.field2579, var10.field2577, var10.field2567, var10.field2574 + var146 + var150, var10.field2574 + var151);
                                            }
                                        } else {
                                            var145.method1999(0, var10.field2578, 0, var10.field2577, 0, var150, var151);
                                        }
                                    }
                                    class84.method1793();
                                } else {
                                    if (var10.field2539 == 7) {
                                        class191 var152 = var10.method2910();
                                        if (var152 == null) {
                                            if (class152.field2535) {
                                                method130(var10);
                                            }
                                            continue;
                                        }
                                        int var153 = 0;
                                        for (int var154 = 0; var154 < var10.field2547; var154++) {
                                            for (int var155 = 0; var155 < var10.field2546; var155++) {
                                                if (var10.field2639[var153] > 0) {
                                                    class45 var156 = class45.method500(var10.field2639[var153] - 1);
                                                    String var157;
                                                    if (var156.field1053 != 1 && var10.field2640[var153] == 1) {
                                                        var157 = class2.method2720(16748608) + var156.field1026 + class2.field24;
                                                    } else {
                                                        var157 = class2.method2720(16748608) + var156.field1026 + class2.field24 + " " + 'x' + method1(var10.field2640[var153]);
                                                    }
                                                    int var158 = (var10.field2598 + 115) * var155 + var13;
                                                    int var159 = (var10.field2628 + 12) * var154 + var14;
                                                    if (var10.field2587 == 0) {
                                                        var152.method3344(var157, var158, var159, var10.field2565, var10.field2589 ? 0 : -1);
                                                    } else if (var10.field2587 == 1) {
                                                        var152.method3346(var157, var10.field2546 / 2 + var158, var159, var10.field2565, var10.field2589 ? 0 : -1);
                                                    } else {
                                                        var152.method3345(var157, var10.field2546 + var158 - 1, var159, var10.field2565, var10.field2589 ? 0 : -1);
                                                    }
                                                }
                                                var153++;
                                            }
                                        }
                                    }
                                    if (var10.field2539 == 8 && Statics.field1701 == var10 && field418 == field417) {
                                        int var160 = 0;
                                        int var161 = 0;
                                        class191 var162 = Statics.field229;
                                        String var163 = var10.field2584;
                                        String var164 = Statics.method31(var163, var10);
                                        while (var164.length() > 0) {
                                            int var165 = var164.indexOf(class2.field22);
                                            String var166;
                                            if (var165 == -1) {
                                                var166 = var164;
                                                var164 = "";
                                            } else {
                                                var166 = var164.substring(0, var165);
                                                var164 = var164.substring(var165 + 4);
                                            }
                                            int var167 = var162.method3339(var166);
                                            if (var167 > var160) {
                                                var160 = var167;
                                            }
                                            var161 += var162.field2896 + 1;
                                        }
                                        var160 += 6;
                                        var161 += 7;
                                        int var168 = var10.field2546 + var13 - 5 - var160;
                                        int var169 = var10.field2547 + var14 + 5;
                                        if (var168 < var13 + 5) {
                                            var168 = var13 + 5;
                                        }
                                        if (var160 + var168 > arg4) {
                                            var168 = arg4 - var160;
                                        }
                                        if (var161 + var169 > arg5) {
                                            var169 = arg5 - var161;
                                        }
                                        class73.method1524(var168, var169, var160, var161, 16777120);
                                        class73.method1539(var168, var169, var160, var161, 0);
                                        String var170 = var10.field2584;
                                        int var171 = var162.field2896 + var169 + 2;
                                        String var172 = Statics.method31(var170, var10);
                                        while (var172.length() > 0) {
                                            int var173 = var172.indexOf(class2.field22);
                                            String var174;
                                            if (var173 == -1) {
                                                var174 = var172;
                                                var172 = "";
                                            } else {
                                                var174 = var172.substring(0, var173);
                                                var172 = var172.substring(var173 + 4);
                                            }
                                            var162.method3344(var174, var168 + 3, var171, 0, -1);
                                            var171 += var162.field2896 + 1;
                                        }
                                    }
                                    if (var10.field2539 == 9) {
                                        if (var10.field2560 == 1) {
                                            class73.method1532(var13, var14, var10.field2546 + var13, var10.field2547 + var14, var10.field2565);
                                        } else {
                                            int var175 = var10.field2546 >= 0 ? var10.field2546 : -var10.field2546;
                                            int var176 = var10.field2547 >= 0 ? var10.field2547 : -var10.field2547;
                                            int var177 = var175;
                                            if (var175 < var176) {
                                                var177 = var176;
                                            }
                                            if (var177 != 0) {
                                                int var178 = (var10.field2546 << 16) / var177;
                                                int var179 = (var10.field2547 << 16) / var177;
                                                if (var179 <= var178) {
                                                    var178 = -var178;
                                                } else {
                                                    var179 = -var179;
                                                }
                                                int var180 = var10.field2560 * var179 >> 17;
                                                int var181 = var10.field2560 * var179 + 1 >> 17;
                                                int var182 = var10.field2560 * var178 >> 17;
                                                int var183 = var10.field2560 * var178 + 1 >> 17;
                                                int var184 = var13 + var180;
                                                int var185 = var13 - var181;
                                                int var186 = var10.field2546 + var13 - var181;
                                                int var187 = var10.field2546 + var13 + var180;
                                                int var188 = var14 + var182;
                                                int var189 = var14 - var183;
                                                int var190 = var10.field2547 + var14 - var183;
                                                int var191 = var10.field2547 + var14 + var182;
                                                class84.method1799(var184, var185, var186);
                                                class84.method1847(var188, var189, var190, var184, var185, var186, var10.field2565);
                                                class84.method1799(var184, var186, var187);
                                                class84.method1847(var188, var190, var191, var184, var186, var187, var10.field2565);
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

    @ObfuscatedName("j.cq(II)Ljava/lang/String;")
    public static final String method1(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2720(65408) + var1.substring(0, var1.length() - 8) + class142.field2220 + " " + class2.field19 + var1 + class2.field20 + class2.field24;
        } else if (var1.length() > 6) {
            return " " + class2.method2720(16777215) + var1.substring(0, var1.length() - 4) + class142.field2318 + " " + class2.field19 + var1 + class2.field20 + class2.field24;
        } else {
            return " " + class2.method2720(16776960) + var1 + class2.field24;
        }
    }

    @ObfuscatedName("dd.cy(IIIIII)V")
    public static final void method2412(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1284[0].method1586(arg0, arg1);
        Statics.field1284[1].method1586(arg0, arg1 + arg3 - 16);
        class73.method1524(arg0, arg1 + 16, 16, arg3 - 32, field341);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1524(arg0, arg1 + 16 + var6, 16, var5, field342);
        class73.method1526(arg0, arg1 + 16 + var6, var5, field344);
        class73.method1526(arg0 + 1, arg1 + 16 + var6, var5, field344);
        class73.method1528(arg0, arg1 + 16 + var6, 16, field344);
        class73.method1528(arg0, arg1 + 17 + var6, 16, field344);
        class73.method1526(arg0 + 15, arg1 + 16 + var6, var5, field377);
        class73.method1526(arg0 + 14, arg1 + 17 + var6, var5 - 1, field377);
        class73.method1528(arg0, arg1 + 15 + var6 + var5, 16, field377);
        class73.method1528(arg0 + 1, arg1 + 14 + var6 + var5, 15, field377);
    }

    @ObfuscatedName("i.cr(Lem;I)Z")
    public static final boolean method132(class152 arg0) {
        if (arg0.field2554 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2554.length; var1++) {
            int var2 = method8(arg0, var1);
            int var3 = arg0.field2580[var1];
            if (arg0.field2554[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2554[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2554[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("z.cj(Lem;IB)I")
    public static final int method8(class152 arg0, int arg1) {
        if (arg0.field2559 == null || arg1 >= arg0.field2559.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2559[arg1];
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
                    var7 = field403[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field323[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field405[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class152 var11 = class152.method2559(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method500(var12).field1021 || field264)) {
                        for (int var13 = 0; var13 < var11.field2639.length; var13++) {
                            if (var12 + 1 == var11.field2639[var13]) {
                                var7 += var11.field2640[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class154.field2664[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2139[field323[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class154.field2664[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field391.field34;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2136[var14]) {
                            var7 += field323[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class152 var17 = class152.method2559(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method500(var18).field1021 || field264)) {
                        for (int var19 = 0; var19 < var17.field2639.length; var19++) {
                            if (var18 + 1 == var17.field2639[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field430;
                }
                if (var6 == 12) {
                    var7 = field431;
                }
                if (var6 == 13) {
                    int var20 = class154.field2664[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class154.method480(var22);
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
                    var7 = (Statics.field391.field747 >> 7) + Statics.field88;
                }
                if (var6 == 19) {
                    var7 = (Statics.field391.field735 >> 7) + Statics.field316;
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

    @ObfuscatedName("f.co(Lem;III)V")
    public static final void method138(class152 arg0, int arg1, int arg2) {
        if (arg0.field2540 == 1) {
            method134(arg0.field2638, "", 24, 0, 0, arg0.field2645);
        }
        if (arg0.field2540 == 2 && !field421) {
            String var3 = method2708(arg0);
            if (var3 != null) {
                method134(var3, class2.method2720(65280) + arg0.field2637, 25, 0, -1, arg0.field2645);
            }
        }
        if (arg0.field2540 == 3) {
            method134(class142.field2391, "", 26, 0, 0, arg0.field2645);
        }
        if (arg0.field2540 == 4) {
            method134(arg0.field2638, "", 28, 0, 0, arg0.field2645);
        }
        if (arg0.field2540 == 5) {
            method134(arg0.field2638, "", 29, 0, 0, arg0.field2645);
        }
        if (arg0.field2540 == 6 && field265 == null) {
            method134(arg0.field2638, "", 30, 0, -1, arg0.field2645);
        }
        if (arg0.field2539 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2547; var5++) {
                for (int var6 = 0; var6 < arg0.field2546; var6++) {
                    int var7 = (arg0.field2598 + 32) * var6;
                    int var8 = (arg0.field2628 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2646[var4];
                        var8 += arg0.field2593[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field406 = var4;
                        Statics.field623 = arg0;
                        if (arg0.field2639[var4] > 0) {
                            label319: {
                                class45 var9 = class45.method500(arg0.field2639[var4] - 1);
                                if (field419 == 1) {
                                    int var10 = method94(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field1953 != arg0.field2645 || Statics.field1057 != var4) {
                                            method134(class142.field2305, field420 + " " + class2.field21 + " " + class2.method2720(16748608) + var9.field1026, 31, var9.field1031, var4, arg0.field2645);
                                        }
                                        break label319;
                                    }
                                }
                                if (field421) {
                                    int var12 = method94(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1997 & 0x10) == 16) {
                                            method134(field423, field424 + " " + class2.field21 + " " + class2.method2720(16748608) + var9.field1026, 32, var9.field1031, var4, arg0.field2645);
                                        }
                                        break label319;
                                    }
                                }
                                String[] var14 = var9.field1033;
                                if (field336) {
                                    var14 = method814(var14);
                                }
                                int var15 = method94(arg0);
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
                                            method134(var14[var17], class2.method2720(16748608) + var9.field1026, var18, var9.field1031, var4, arg0.field2645);
                                        } else if (var17 == 4) {
                                            method134(class142.field2157, class2.method2720(16748608) + var9.field1026, 37, var9.field1031, var4, arg0.field2645);
                                        }
                                    }
                                }
                                class156 var10000 = (class156) null;
                                if (class156.method37(method94(arg0))) {
                                    method134(class142.field2305, class2.method2720(16748608) + var9.field1026, 38, var9.field1031, var4, arg0.field2645);
                                }
                                int var19 = method94(arg0);
                                boolean var20 = (var19 >> 30 & 0x1) != 0;
                                if (var20 && var14 != null) {
                                    for (int var21 = 2; var21 >= 0; var21--) {
                                        if (var14[var21] != null) {
                                            byte var22 = 0;
                                            if (var21 == 0) {
                                                var22 = 33;
                                            }
                                            if (var21 == 1) {
                                                var22 = 34;
                                            }
                                            if (var21 == 2) {
                                                var22 = 35;
                                            }
                                            method134(var14[var21], class2.method2720(16748608) + var9.field1026, var22, var9.field1031, var4, arg0.field2645);
                                        }
                                    }
                                }
                                String[] var23 = arg0.field2595;
                                if (field336) {
                                    var23 = method814(var23);
                                }
                                if (var23 != null) {
                                    for (int var24 = 4; var24 >= 0; var24--) {
                                        if (var23[var24] != null) {
                                            byte var25 = 0;
                                            if (var24 == 0) {
                                                var25 = 39;
                                            }
                                            if (var24 == 1) {
                                                var25 = 40;
                                            }
                                            if (var24 == 2) {
                                                var25 = 41;
                                            }
                                            if (var24 == 3) {
                                                var25 = 42;
                                            }
                                            if (var24 == 4) {
                                                var25 = 43;
                                            }
                                            method134(var23[var24], class2.method2720(16748608) + var9.field1026, var25, var9.field1031, var4, arg0.field2645);
                                        }
                                    }
                                }
                                method134(class142.field2214, class2.method2720(16748608) + var9.field1026, 1005, var9.field1031, var4, arg0.field2645);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2536) {
            return;
        }
        if (!field421) {
            for (int var26 = 9; var26 >= 5; var26--) {
                String var27;
                if (!class156.method1893(method94(arg0), var26) && arg0.field2624 == null) {
                    var27 = null;
                } else if (arg0.field2592 == null || arg0.field2592.length <= var26 || arg0.field2592[var26] == null || arg0.field2592[var26].trim().length() == 0) {
                    var27 = null;
                } else {
                    var27 = arg0.field2592[var26];
                }
                if (var27 != null) {
                    method134(var27, arg0.field2597, 1007, var26 + 1, arg0.field2538, arg0.field2645);
                }
            }
            String var29 = method2708(arg0);
            if (var29 != null) {
                method134(var29, arg0.field2597, 25, 0, arg0.field2538, arg0.field2645);
            }
            for (int var30 = 4; var30 >= 0; var30--) {
                String var31;
                if (!class156.method1893(method94(arg0), var30) && arg0.field2624 == null) {
                    var31 = null;
                } else if (arg0.field2592 == null || arg0.field2592.length <= var30 || arg0.field2592[var30] == null || arg0.field2592[var30].trim().length() == 0) {
                    var31 = null;
                } else {
                    var31 = arg0.field2592[var30];
                }
                if (var31 != null) {
                    method134(var31, arg0.field2597, 57, var30 + 1, arg0.field2538, arg0.field2645);
                }
            }
            if (class156.method489(method94(arg0))) {
                method134(class142.field2161, "", 30, 0, arg0.field2538, arg0.field2645);
            }
        } else if (class156.method1787(method94(arg0)) && (Statics.field1997 & 0x20) == 32) {
            method134(field423, field424 + " " + class2.field21 + " " + arg0.field2597, 58, 0, arg0.field2538, arg0.field2645);
        }
    }

    @ObfuscatedName("dx.cm(IIB)V")
    public static final void method2487(int arg0, int arg1) {
        if (class152.method487(arg0)) {
            method2541(Statics.field2633[arg0], arg1);
        }
    }

    @ObfuscatedName("do.cg([Lem;IB)V")
    public static final void method2541(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2539 == 0) {
                    if (var3.field2541 != null) {
                        method2541(var3.field2541, arg1);
                    }
                    class4 var4 = (class4) field297.method3214((long) var3.field2645);
                    if (var4 != null) {
                        method2487(var4.field62, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2631 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field9 = var3.field2631;
                    class32.method451(var5);
                }
                if (arg1 == 1 && var3.field2575 != null) {
                    if (var3.field2538 >= 0) {
                        class152 var6 = class152.method2559(var3.field2645);
                        if (var6 == null || var6.field2541 == null || var3.field2538 >= var6.field2541.length || var6.field2541[var3.field2538] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field9 = var3.field2575;
                    class32.method451(var7);
                }
            }
        }
    }

    @ObfuscatedName("dg.cz(Lem;III)V")
    public static final void method2506(class152 arg0, int arg1, int arg2) {
        if (field437 != null || field410 || arg0 == null) {
            return;
        }
        class152 var3 = arg0;
        int var4 = method94(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class152 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class152.method2559(var3.field2573);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class152 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2599;
        }
        if (var9 == null) {
            return;
        }
        field437 = arg0;
        class152 var11 = arg0;
        int var12 = method94(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class152 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class152.method2559(var11.field2573);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class152 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2599;
        }
        field346 = var17;
        field439 = arg1;
        field440 = arg2;
        Statics.field201 = 0;
        field387 = false;
        if (field408 > 0) {
            int var19 = field408 - 1;
            Statics.field59 = new class27();
            Statics.field59.field644 = field272[var19];
            Statics.field59.field642 = field380[var19];
            Statics.field59.field643 = field375[var19];
            Statics.field59.field641 = field412[var19];
            Statics.field59.field645 = field378[var19];
        }
        return;
    }

    @ObfuscatedName("i.cx(Lem;I)V")
    public static void method130(class152 arg0) {
        if (field469 == arg0.field2653) {
            field470[arg0.field2652] = true;
        }
    }

    @ObfuscatedName("an.ca(B)V")
    public static void method618() {
        for (class4 var0 = (class4) field297.method3210(); var0 != null; var0 = (class4) field297.method3207()) {
            int var1 = var0.field62;
            if (class152.method487(var1)) {
                boolean var2 = true;
                class152[] var3 = Statics.field2633[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2536;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2861;
                    class152 var6 = class152.method2559(var5);
                    if (var6 != null) {
                        method130(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.ci([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method814(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("z.ck(II)V")
    public static final void method9(int arg0) {
        if (!class152.method487(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2633[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3 != null) {
                var3.field2643 = 0;
                var3.field2568 = 0;
            }
        }
    }

    @ObfuscatedName("e.cl(IS)V")
    public static final void method79(int arg0) {
        method618();
        class20.method2601();
        int var1 = class46.method2054(arg0).field1064;
        if (var1 == 0) {
            return;
        }
        int var2 = class154.field2664[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class84.method1829(0.9D);
                ((class88) Statics.field1465).method1877(0.9D);
            }
            if (var2 == 2) {
                class84.method1829(0.8D);
                ((class88) Statics.field1465).method1877(0.8D);
            }
            if (var2 == 3) {
                class84.method1829(0.7D);
                ((class88) Statics.field1465).method1877(0.7D);
            }
            if (var2 == 4) {
                class84.method1829(0.6D);
                ((class88) Statics.field1465).method1877(0.6D);
            }
            class45.method11();
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
            if (field497 != var3) {
                if (field497 == 0 && field498 != -1) {
                    class161.method620(Statics.field940, field498, 0, var3, false);
                    field499 = false;
                } else if (var3 == 0) {
                    class161.method2717();
                    field499 = false;
                } else if (class161.field2716 == 0) {
                    Statics.field2714.method3129(var3);
                } else {
                    Statics.field2121 = var3;
                }
                field497 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field415 = 127;
            }
            if (var2 == 1) {
                field415 = 96;
            }
            if (var2 == 2) {
                field415 = 64;
            }
            if (var2 == 3) {
                field415 = 32;
            }
            if (var2 == 4) {
                field415 = 0;
            }
        }
        if (var1 == 5) {
            field409 = var2;
        }
        if (var1 == 6) {
            field427 = var2;
        }
        if (var1 == 9) {
            field428 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field501 = 127;
            }
            if (var2 == 1) {
                field501 = 96;
            }
            if (var2 == 2) {
                field501 = 64;
            }
            if (var2 == 3) {
                field501 = 32;
            }
            if (var2 == 4) {
                field501 = 0;
            }
        }
        if (var1 == 17) {
            field307 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class18[] var4 = new class18[] { class18.field536, class18.field528, class18.field527 };
            class18[] var5 = var4;
            int var6 = 0;
            class18 var8;
            while (true) {
                if (var6 >= var5.length) {
                    var8 = null;
                    break;
                }
                class18 var7 = var5[var6];
                if (var2 == var7.method433()) {
                    var8 = var7;
                    break;
                }
                var6++;
            }
            field429 = (class18) var8;
            if (field429 == null) {
                field429 = class18.field528;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field398 = -1;
        } else {
            field398 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("ap.ce(I)V")
    public static final void method1003() {
        field304.method2369(131);
        for (class4 var0 = (class4) field297.method3210(); var0 != null; var0 = (class4) field297.method3207()) {
            if (var0.field54 == 0 || var0.field54 == 3) {
                method81(var0, true);
            }
        }
        if (field265 != null) {
            method130(field265);
            field265 = null;
        }
    }

    @ObfuscatedName("ez.cu(IIII)Lh;")
    public static final class4 method2723(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field62 = arg1;
        var3.field54 = arg2;
        field297.method3208(var3, (long) arg0);
        method9(arg1);
        class32.method470(arg1);
        class152 var4 = class152.method2559(arg0);
        if (var4 != null) {
            method130(var4);
        }
        if (field265 != null) {
            method130(field265);
            field265 = null;
        }
        method1314();
        if (field425 != -1) {
            method2487(field425, 1);
        }
        return var3;
    }

    @ObfuscatedName("k.cf(Lh;ZI)V")
    public static final void method81(class4 arg0, boolean arg1) {
        int var2 = arg0.field62;
        int var3 = (int) arg0.field2861;
        arg0.method3309();
        if (arg1) {
            Statics.method154(var2);
        }
        method1344(var2);
        class152 var4 = class152.method2559(var3);
        if (var4 != null) {
            method130(var4);
        }
        method1314();
        if (field425 != -1) {
            method2487(field425, 1);
        }
    }

    @ObfuscatedName("cb.cv(Lem;S)Z")
    public static final boolean method1874(class152 arg0) {
        int var1 = arg0.field2530;
        if (var1 == 205) {
            field438 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field520.method2945(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field520.method2962(var4, var5 == 1);
        }
        if (var1 == 324) {
            field520.method2976(false);
        }
        if (var1 == 325) {
            field520.method2976(true);
        }
        if (var1 == 326) {
            field304.method2369(113);
            field520.method2968(field304);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cw.cn(IIIILbq;I)V")
    public static final void method1981(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method2600(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field447 + field335 & 0x7FF;
        int var7 = class84.field1476[var6];
        int var8 = class84.field1471[var6];
        int var9 = var7 * 256 / (field345 + 256);
        int var10 = var8 * 256 / (field345 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1525.method1445(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("dp.cs(IIIILbq;B)V")
    public static final void method2600(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field447 + field335 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1476[var5];
        int var8 = class84.field1471[var5];
        int var9 = var7 * 256 / (field345 + 256);
        int var10 = var8 * 256 / (field345 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1468(Statics.field622, arg0 + 94 + var11 - arg4.field1303 / 2 + 4, arg1 + 83 - var12 - arg4.field1309 / 2 - 4);
        } else {
            arg4.method1510(arg0 + 94 + var11 - arg4.field1303 / 2 + 4, arg1 + 83 - var12 - arg4.field1309 / 2 - 4);
        }
    }

    @ObfuscatedName("client.dh(Ljava/lang/String;ZB)Z")
    public static boolean method200(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class198.method2067(arg0, Statics.field2697);
        for (int var3 = 0; var3 < field514; var3++) {
            if (var2.equalsIgnoreCase(class198.method2067(field298[var3].field234, Statics.field2697)) && (!arg1 || field298[var3].field230 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class198.method2067(Statics.field391.field32, Statics.field2697))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("q.dt(Ljava/lang/String;I)Z")
    public static boolean method129(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class198.method2067(arg0, Statics.field2697);
        for (int var2 = 0; var2 < field518; var2++) {
            class8 var3 = field519[var2];
            if (var1.equalsIgnoreCase(class198.method2067(var3.field130, Statics.field2697))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class198.method2067(var3.field124, Statics.field2697))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bz.de(Ljava/lang/String;B)V")
    public static final void method1420(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class198.method2067(arg0, Statics.field2697);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field518; var2++) {
            class8 var3 = field519[var2];
            String var4 = var3.field130;
            String var5 = class198.method2067(var4, Statics.field2697);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field518--;
                for (int var7 = var2; var7 < field518; var7++) {
                    field519[var7] = field519[var7 + 1];
                }
                field458 = field416;
                field304.method2369(201);
                field304.method2116(class107.method1004(arg0));
                field304.method2121(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("de.dw(Ljava/lang/String;I)V")
    public static final void method2324(String arg0) {
        if (!arg0.equals("")) {
            field304.method2369(232);
            field304.method2116(class107.method1004(arg0));
            field304.method2121(arg0);
        }
    }

    @ObfuscatedName("bl.dn(IB)V")
    public static void method1344(int arg0) {
        for (class179 var1 = (class179) field467.method3210(); var1 != null; var1 = (class179) field467.method3207()) {
            if ((long) arg0 == (var1.field2861 >> 48 & 0xFFFFL)) {
                var1.method3309();
            }
        }
    }

    @ObfuscatedName("b.dq(Lem;I)I")
    public static int method94(class152 arg0) {
        class179 var1 = (class179) field467.method3214(((long) arg0.field2645 << 32) + (long) arg0.field2538);
        return var1 == null ? arg0.field2618 : var1.field2851;
    }

    @ObfuscatedName("d.dd(Lem;I)Z")
    public static boolean method158(class152 arg0) {
        if (field448) {
            if (method94(arg0) != 0) {
                return false;
            }
            if (arg0.field2539 == 0) {
                return false;
            }
        }
        return arg0.field2549;
    }

    @ObfuscatedName("er.dz(Lem;B)Ljava/lang/String;")
    public static String method2708(class152 arg0) {
        int var1 = method94(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2537 == null || arg0.field2537.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2537;
        }
    }

    @ObfuscatedName("ck.dl(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1976(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field317 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field317 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field317 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field317 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field317 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field266 + "/";
    }
}

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
import java.net.Socket;
import java.util.Iterator;

public final class client extends class131 {

    @ObfuscatedName("client.w")
    public static class197[] field314 = new class197[4];

    @ObfuscatedName("client.m")
    public static boolean field252 = true;

    @ObfuscatedName("client.j")
    public static int field253 = 1;

    @ObfuscatedName("client.g")
    public static int field309 = 0;

    @ObfuscatedName("client.o")
    public static int field255 = 0;

    @ObfuscatedName("client.d")
    public static boolean field256 = false;

    @ObfuscatedName("client.s")
    public static boolean field394 = false;

    @ObfuscatedName("client.v")
    public static int field258 = 0;

    @ObfuscatedName("client.u")
    public static int field259 = 0;

    @ObfuscatedName("client.l")
    public static boolean field264 = true;

    @ObfuscatedName("client.i")
    public static int field261 = 0;

    @ObfuscatedName("client.h")
    public static long field486 = 1L;

    @ObfuscatedName("client.a")
    public static int field263 = -1;

    @ObfuscatedName("client.c")
    public static int field504 = -1;

    @ObfuscatedName("client.f")
    public static int field320 = -1;

    @ObfuscatedName("client.q")
    public static boolean field266 = true;

    @ObfuscatedName("client.z")
    public static boolean field375 = false;

    @ObfuscatedName("client.aa")
    public static int field268 = 0;

    @ObfuscatedName("client.ak")
    public static int field338 = 0;

    @ObfuscatedName("client.al")
    public static int field270 = 0;

    @ObfuscatedName("client.aw")
    public static int field271 = 0;

    @ObfuscatedName("client.ai")
    public static int field280 = 0;

    @ObfuscatedName("client.av")
    public static int field273 = 0;

    @ObfuscatedName("client.an")
    public static int field303 = 0;

    @ObfuscatedName("client.aq")
    public static int field275 = 0;

    @ObfuscatedName("client.aj")
    public static int field276 = 0;

    @ObfuscatedName("client.az")
    public static class107 field277 = new class107(new byte[5000]);

    @ObfuscatedName("client.ar")
    public static class18 field279 = class18.field523;

    @ObfuscatedName("client.ae")
    public static int field378 = 0;

    @ObfuscatedName("client.af")
    public static int field281 = 0;

    @ObfuscatedName("client.ab")
    public static int field282 = 0;

    @ObfuscatedName("client.bc")
    public static int field257 = 0;

    @ObfuscatedName("client.ba")
    public static int field288 = 0;

    @ObfuscatedName("client.bb")
    public static int field272 = 0;

    @ObfuscatedName("client.bv")
    public static int field372 = 0;

    @ObfuscatedName("client.bl")
    public static int field291 = 0;

    @ObfuscatedName("client.bm")
    public static class30[] field292 = new class30[32768];

    @ObfuscatedName("client.bt")
    public static int field293 = 0;

    @ObfuscatedName("client.bx")
    public static int[] field294 = new int[32768];

    @ObfuscatedName("client.cr")
    public static class110 field382 = new class110(5000);

    @ObfuscatedName("client.cj")
    public static class110 field296 = new class110(5000);

    @ObfuscatedName("client.cy")
    public static class110 field297 = new class110(5000);

    @ObfuscatedName("client.ce")
    public static int field464 = 0;

    @ObfuscatedName("client.cf")
    public static int field299 = 0;

    @ObfuscatedName("client.ca")
    public static int field300 = 0;

    @ObfuscatedName("client.cs")
    public static int field301 = 0;

    @ObfuscatedName("client.cc")
    public static int field254 = 0;

    @ObfuscatedName("client.cx")
    public static int field434 = 0;

    @ObfuscatedName("client.ck")
    public static int field400 = 0;

    @ObfuscatedName("client.ci")
    public static int field305 = 0;

    @ObfuscatedName("client.cl")
    public static boolean field456 = false;

    @ObfuscatedName("client.cq")
    public static int field367 = 0;

    @ObfuscatedName("client.cg")
    public static int field262 = 0;

    @ObfuscatedName("client.du")
    public static int field310 = 1;

    @ObfuscatedName("client.df")
    public static int field350 = 0;

    @ObfuscatedName("client.de")
    public static int field448 = 1;

    @ObfuscatedName("client.dc")
    public static int field313 = 0;

    @ObfuscatedName("client.dr")
    public static boolean field315 = false;

    @ObfuscatedName("client.dk")
    public static int[][][] field316 = new int[4][13][13];

    @ObfuscatedName("client.dx")
    public static final int[] field429 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dt")
    public static int field318 = 0;

    @ObfuscatedName("client.dm")
    public static int field274 = 2;

    @ObfuscatedName("client.dh")
    public static int field415 = 0;

    @ObfuscatedName("client.da")
    public static int field321 = 2;

    @ObfuscatedName("client.dw")
    public static int field431 = 0;

    @ObfuscatedName("client.dd")
    public static int field323 = 1;

    @ObfuscatedName("client.dz")
    public static int field457 = 0;

    @ObfuscatedName("client.dj")
    public static int field463 = 0;

    @ObfuscatedName("client.dq")
    public static int field450 = 2;

    @ObfuscatedName("client.dy")
    public static int field327 = 0;

    @ObfuscatedName("client.er")
    public static int field304 = 1;

    @ObfuscatedName("client.ef")
    public static int field329 = 0;

    @ObfuscatedName("client.eb")
    public static int field330 = 0;

    @ObfuscatedName("client.en")
    public static int field284 = 2301979;

    @ObfuscatedName("client.ey")
    public static int field332 = 5063219;

    @ObfuscatedName("client.eo")
    public static int field333 = 3353893;

    @ObfuscatedName("client.ei")
    public static int field334 = 7759444;

    @ObfuscatedName("client.ea")
    public static boolean field335 = false;

    @ObfuscatedName("client.fx")
    public static int field336 = 0;

    @ObfuscatedName("client.fp")
    public static int field337 = 128;

    @ObfuscatedName("client.fg")
    public static int field511 = 0;

    @ObfuscatedName("client.fn")
    public static int field339 = 0;

    @ObfuscatedName("client.ff")
    public static int field340 = 0;

    @ObfuscatedName("client.fe")
    public static int field341 = 0;

    @ObfuscatedName("client.fy")
    public static int field342 = 0;

    @ObfuscatedName("client.fz")
    public static int field343 = 0;

    @ObfuscatedName("client.ft")
    public static boolean field344 = false;

    @ObfuscatedName("client.fo")
    public static int field446 = 0;

    @ObfuscatedName("client.fd")
    public static int field349 = 0;

    @ObfuscatedName("client.fu")
    public static int field347 = 50;

    @ObfuscatedName("client.fq")
    public static int[] field348 = new int[field347];

    @ObfuscatedName("client.fi")
    public static int[] field358 = new int[field347];

    @ObfuscatedName("client.fk")
    public static int[] field295 = new int[field347];

    @ObfuscatedName("client.fc")
    public static int[] field250 = new int[field347];

    @ObfuscatedName("client.fh")
    public static int[] field352 = new int[field347];

    @ObfuscatedName("client.fm")
    public static int[] field353 = new int[field347];

    @ObfuscatedName("client.fj")
    public static int[] field354 = new int[field347];

    @ObfuscatedName("client.gv")
    public static String[] field355 = new String[field347];

    @ObfuscatedName("client.gw")
    public static int[][] field356 = new int[104][104];

    @ObfuscatedName("client.gg")
    public static int field393 = 0;

    @ObfuscatedName("client.go")
    public static int field487 = -1;

    @ObfuscatedName("client.gx")
    public static int field477 = -1;

    @ObfuscatedName("client.gj")
    public static int field360 = 0;

    @ObfuscatedName("client.gs")
    public static int field361 = 0;

    @ObfuscatedName("client.gd")
    public static int field363 = 0;

    @ObfuscatedName("client.ge")
    public static int field445 = 0;

    @ObfuscatedName("client.gl")
    public static int field403 = 0;

    @ObfuscatedName("client.gy")
    public static int field307 = 0;

    @ObfuscatedName("client.ga")
    public static int field366 = 0;

    @ObfuscatedName("client.gb")
    public static int field505 = 0;

    @ObfuscatedName("client.gu")
    public static int field306 = 0;

    @ObfuscatedName("client.gp")
    public static int field474 = 0;

    @ObfuscatedName("client.gq")
    public static boolean field370 = false;

    @ObfuscatedName("client.gi")
    public static int field365 = 0;

    @ObfuscatedName("client.gf")
    public static int field345 = 0;

    @ObfuscatedName("client.gc")
    public static class3[] field311 = new class3[2048];

    @ObfuscatedName("client.gh")
    public static int field374 = 0;

    @ObfuscatedName("client.gt")
    public static int[] field317 = new int[2048];

    @ObfuscatedName("client.hr")
    public static int field376 = 0;

    @ObfuscatedName("client.hd")
    public static int[] field377 = new int[2048];

    @ObfuscatedName("client.hy")
    public static class107[] field351 = new class107[2048];

    @ObfuscatedName("client.hn")
    public static int field379 = -1;

    @ObfuscatedName("client.hi")
    public static int field380 = 0;

    @ObfuscatedName("client.hc")
    public static int field381 = 0;

    @ObfuscatedName("client.hm")
    public static int[] field290 = new int[1000];

    @ObfuscatedName("client.hz")
    public static final int[] field383 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hb")
    public static String[] field328 = new String[8];

    @ObfuscatedName("client.hh")
    public static boolean[] field326 = new boolean[8];

    @ObfuscatedName("client.he")
    public static int[] field386 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hf")
    public static int field387 = -1;

    @ObfuscatedName("client.hg")
    public static class177[][][] field302 = new class177[4][104][104];

    @ObfuscatedName("client.ht")
    public static class177 field389 = new class177();

    @ObfuscatedName("client.hj")
    public static class177 field503 = new class177();

    @ObfuscatedName("client.ho")
    public static class177 field391 = new class177();

    @ObfuscatedName("client.hp")
    public static int[] field324 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field502 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field312 = new int[25];

    @ObfuscatedName("client.hu")
    public static int field466 = 0;

    @ObfuscatedName("client.hl")
    public static boolean field396 = false;

    @ObfuscatedName("client.iv")
    public static int field398 = 0;

    @ObfuscatedName("client.in")
    public static int[] field384 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field492 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field401 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field402 = new int[500];

    @ObfuscatedName("client.iy")
    public static String[] field498 = new String[500];

    @ObfuscatedName("client.ib")
    public static String[] field404 = new String[500];

    @ObfuscatedName("client.ii")
    public static int field433 = -1;

    @ObfuscatedName("client.ie")
    public static int field406 = -1;

    @ObfuscatedName("client.iw")
    public static int field407 = 0;

    @ObfuscatedName("client.ir")
    public static int field408 = 50;

    @ObfuscatedName("client.ic")
    public static int field409 = 0;

    @ObfuscatedName("client.it")
    public static String field410 = null;

    @ObfuscatedName("client.ix")
    public static boolean field411 = false;

    @ObfuscatedName("client.io")
    public static int field412 = -1;

    @ObfuscatedName("client.ig")
    public static int field413 = -1;

    @ObfuscatedName("client.jq")
    public static String field442 = null;

    @ObfuscatedName("client.je")
    public static String field399 = null;

    @ObfuscatedName("client.jp")
    public static int field416 = -1;

    @ObfuscatedName("client.jk")
    public static class174 field417 = new class174(8);

    @ObfuscatedName("client.jn")
    public static int field418 = 0;

    @ObfuscatedName("client.jh")
    public static int field419 = 0;

    @ObfuscatedName("client.jm")
    public static class152 field420 = null;

    @ObfuscatedName("client.jo")
    public static int field421 = 0;

    @ObfuscatedName("client.jg")
    public static int field488 = 0;

    @ObfuscatedName("client.jr")
    public static int field423 = 0;

    @ObfuscatedName("client.ju")
    public static int field424 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field425 = false;

    @ObfuscatedName("client.jb")
    public static boolean field426 = false;

    @ObfuscatedName("client.jv")
    public static boolean field427 = false;

    @ObfuscatedName("client.jz")
    public static class152 field428 = null;

    @ObfuscatedName("client.ja")
    public static class152 field444 = null;

    @ObfuscatedName("client.jj")
    public static int field430 = 0;

    @ObfuscatedName("client.jy")
    public static int field368 = 0;

    @ObfuscatedName("client.js")
    public static class152 field432 = null;

    @ObfuscatedName("client.jt")
    public static boolean field482 = false;

    @ObfuscatedName("client.jc")
    public static int field308 = -1;

    @ObfuscatedName("client.jx")
    public static int field435 = -1;

    @ObfuscatedName("client.jf")
    public static boolean field436 = false;

    @ObfuscatedName("client.jl")
    public static int field364 = -1;

    @ObfuscatedName("client.ji")
    public static int field438 = -1;

    @ObfuscatedName("client.kx")
    public static boolean field322 = false;

    @ObfuscatedName("client.ku")
    public static int field325 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field441 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field501 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field443 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field510 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field260 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field388 = 0;

    @ObfuscatedName("client.kj")
    public static int field447 = 0;

    @ObfuscatedName("client.kw")
    public static int field359 = 0;

    @ObfuscatedName("client.ka")
    public static int field449 = 0;

    @ObfuscatedName("client.km")
    public static int field319 = 0;

    @ObfuscatedName("client.kk")
    public static int[] field440 = new int[2000];

    @ObfuscatedName("client.kn")
    public static String[] field452 = new String[1000];

    @ObfuscatedName("client.kf")
    public static int field453 = 0;

    @ObfuscatedName("client.kd")
    public static class177 field454 = new class177();

    @ObfuscatedName("client.kv")
    public static class177 field455 = new class177();

    @ObfuscatedName("client.ky")
    public static class177 field422 = new class177();

    @ObfuscatedName("client.kh")
    public static class174 field298 = new class174(512);

    @ObfuscatedName("client.la")
    public static int field458 = 0;

    @ObfuscatedName("client.lc")
    public static int field459 = -2;

    @ObfuscatedName("client.lt")
    public static boolean[] field460 = new boolean[100];

    @ObfuscatedName("client.lx")
    public static boolean[] field414 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field346 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static int[] field265 = new int[100];

    @ObfuscatedName("client.lj")
    public static int[] field287 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field465 = new int[100];

    @ObfuscatedName("client.lw")
    public static int[] field357 = new int[100];

    @ObfuscatedName("client.le")
    public static int field467 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field468 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lr")
    public static int field469 = 0;

    @ObfuscatedName("client.lk")
    public static int field470 = 0;

    @ObfuscatedName("client.ln")
    public static long[] field471 = new long[100];

    @ObfuscatedName("client.lu")
    public static int field472 = 0;

    @ObfuscatedName("client.lg")
    public static int field473 = 0;

    @ObfuscatedName("client.lm")
    public static int[] field484 = new int[128];

    @ObfuscatedName("client.li")
    public static int[] field475 = new int[128];

    @ObfuscatedName("client.ly")
    public static long field476 = -1L;

    @ObfuscatedName("client.lb")
    public static String field331 = null;

    @ObfuscatedName("client.lz")
    public static String field478 = null;

    @ObfuscatedName("client.mq")
    public static int field479 = -1;

    @ObfuscatedName("client.me")
    public static int field480 = 0;

    @ObfuscatedName("client.ml")
    public static int[] field481 = new int[1000];

    @ObfuscatedName("client.mr")
    public static int[] field390 = new int[1000];

    @ObfuscatedName("client.ms")
    public static class72[] field462 = new class72[1000];

    @ObfuscatedName("client.ma")
    public static int field392 = 0;

    @ObfuscatedName("client.mw")
    public static int field485 = 0;

    @ObfuscatedName("client.mo")
    public static int field437 = 0;

    @ObfuscatedName("client.mv")
    public static int field405 = 255;

    @ObfuscatedName("client.mx")
    public static int field267 = -1;

    @ObfuscatedName("client.mh")
    public static boolean field489 = false;

    @ObfuscatedName("client.mt")
    public static int field490 = 127;

    @ObfuscatedName("client.mg")
    public static int field491 = 127;

    @ObfuscatedName("client.nd")
    public static int field497 = 0;

    @ObfuscatedName("client.nz")
    public static int[] field493 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field494 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field495 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field496 = new int[50];

    @ObfuscatedName("client.np")
    public static class52[] field289 = new class52[50];

    @ObfuscatedName("client.nw")
    public static boolean field371 = false;

    @ObfuscatedName("client.nu")
    public static boolean[] field499 = new boolean[5];

    @ObfuscatedName("client.nq")
    public static int[] field500 = new int[5];

    @ObfuscatedName("client.nb")
    public static int[] field461 = new int[5];

    @ObfuscatedName("client.nh")
    public static int[] field385 = new int[5];

    @ObfuscatedName("client.no")
    public static int[] field269 = new int[5];

    @ObfuscatedName("client.nf")
    public static int field369 = 0;

    @ObfuscatedName("client.oc")
    public static int field395 = 0;

    @ObfuscatedName("client.oj")
    public static class16[] field506 = new class16[400];

    @ObfuscatedName("client.or")
    public static class173 field507 = new class173();

    @ObfuscatedName("client.ou")
    public static int field508 = 0;

    @ObfuscatedName("client.oh")
    public static class8[] field509 = new class8[400];

    @ObfuscatedName("client.ol")
    public static class157 field373 = new class157();

    @ObfuscatedName("client.ob")
    public static int field483 = -1;

    @ObfuscatedName("client.oo")
    public static int field512 = -1;

    @ObfuscatedName("client.m(I)V")
    public final void method161() {
    }

    public final void init() {
        if (!this.method2578()) {
            return;
        }
        class168[] var1 = class168.method610();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class168 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2830);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2830)) {
                    case 1:
                        Statics.field2890 = var4;
                        break;
                    case 2:
                        field255 = Integer.parseInt(var4);
                    case 3:
                    default:
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class2.field24)) {
                        }
                        break;
                    case 5:
                        field309 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field253 = Integer.parseInt(var4);
                        break;
                    case 7:
                        int var6 = Integer.parseInt(var4);
                        class138[] var7 = class138.method2408();
                        int var8 = 0;
                        class138 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class138 var9 = var7[var8];
                            if (var9.field2111 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field983 = var10;
                        break;
                    case 8:
                        field258 = Integer.parseInt(var4);
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class2.field24)) {
                            field256 = true;
                        } else {
                            field256 = false;
                        }
                        break;
                    case 10:
                        class139[] var5 = new class139[] { class139.field2120, class139.field2117, class139.field2119, class139.field2121, class139.field2118, class139.field2115 };
                        Statics.field705 = (class139) class99.method1850(var5, Integer.parseInt(var4));
                        if (Statics.field705 == class139.field2120) {
                            Statics.field2960 = class190.field2898;
                        } else {
                            Statics.field2960 = class190.field2896;
                        }
                }
            }
        }
        method107();
        Statics.field151 = this.getCodeBase().getHost();
        String var11 = Statics.field983.field2110;
        byte var12 = 0;
        try {
            Statics.field1916 = 16;
            Statics.field2089 = var12;
            try {
                Statics.field2092 = System.getProperty("os.name");
            } catch (Exception var26) {
                Statics.field2092 = "Unknown";
            }
            Statics.field2090 = Statics.field2092.toLowerCase();
            try {
                Statics.field636 = System.getProperty("user.home");
                if (Statics.field636 != null) {
                    Statics.field636 = Statics.field636 + "/";
                }
            } catch (Exception var25) {
            }
            try {
                if (Statics.field2090.startsWith("win")) {
                    if (Statics.field636 == null) {
                        Statics.field636 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field636 == null) {
                    Statics.field636 = System.getenv("HOME");
                }
                if (Statics.field636 != null) {
                    Statics.field636 = Statics.field636 + "/";
                }
            } catch (Exception var24) {
            }
            if (Statics.field636 == null) {
                Statics.field636 = "~/";
            }
            Statics.field982 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field636, "/tmp/", "" };
            Statics.field985 = new String[] { ".jagex_cache_" + Statics.field2089, ".file_store_" + Statics.field2089 };
            label120: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field2084 = class136.method2381("oldschool", var11, var16);
                if (!Statics.field2084.exists()) {
                    Statics.field2084.mkdirs();
                }
                File[] var17 = Statics.field2084.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label120;
                    }
                    File var20 = var18[var19];
                    if (!class136.method755(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            File var21 = Statics.field2084;
            Statics.field1946 = var21;
            if (!Statics.field1946.exists()) {
                throw new RuntimeException("");
            }
            class122.field1947 = true;
            class136.method1967();
            class136.field2087 = new class196(new class195(class122.method1960("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class136.field2086 = new class196(new class195(class122.method1960("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1906 = new class196[Statics.field1916];
            for (int var22 = 0; var22 < Statics.field1916; var22++) {
                Statics.field1906[var22] = new class196(new class195(class122.method1960("main_file_cache.idx" + var22), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var27) {
            class135.method1963((String) null, var27);
        }
        Statics.field251 = this;
        this.method2632(765, 503, 59);
    }

    @ObfuscatedName("b.g(B)V")
    public static final void method107() {
        class79.field1401 = false;
        field394 = false;
    }

    @ObfuscatedName("client.p(I)V")
    public final void method202() {
        Statics.field998 = field255 == 0 ? 43594 : field253 + 40000;
        Statics.field2679 = field255 == 0 ? 443 : field253 + 50000;
        Statics.field1000 = Statics.field998;
        Statics.field2680 = class153.field2657;
        Statics.field2681 = class153.field2656;
        Statics.field74 = class153.field2658;
        Statics.field1344 = class153.field2659;
        if (Statics.field1961.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1988[44] = 71;
            class124.field1988[45] = 26;
            class124.field1988[46] = 72;
            class124.field1988[47] = 73;
            class124.field1988[59] = 57;
            class124.field1988[61] = 27;
            class124.field1988[91] = 42;
            class124.field1988[92] = 74;
            class124.field1988[93] = 43;
            class124.field1988[192] = 28;
            class124.field1988[222] = 58;
            class124.field1988[520] = 59;
        } else {
            class124.field1988[186] = 57;
            class124.field1988[187] = 27;
            class124.field1988[188] = 71;
            class124.field1988[189] = 26;
            class124.field1988[190] = 72;
            class124.field1988[191] = 73;
            class124.field1988[192] = 58;
            class124.field1988[219] = 42;
            class124.field1988[220] = 74;
            class124.field1988[221] = 43;
            class124.field1988[222] = 59;
            class124.field1988[223] = 28;
        }
        Canvas var1 = Statics.field1589;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1971);
        var1.addFocusListener(class124.field1971);
        Canvas var2 = Statics.field1589;
        var2.addMouseListener(class127.field2007);
        var2.addMouseMotionListener(class127.field2007);
        var2.addFocusListener(class127.field2007);
        class132 var3;
        try {
            var3 = new class132();
        } catch (Throwable var7) {
            var3 = null;
        }
        Statics.field2655 = var3;
        if (Statics.field2655 != null) {
            Statics.field2655.method2424(Statics.field1589);
        }
        Statics.field1994 = new class121(255, class136.field2087, class136.field2086, 500000);
        Statics.field1087 = class9.method593();
        Statics.field141 = this.getToolkit().getSystemClipboard();
        String var6 = Statics.field1250;
        class125.field1995 = this;
        class125.field1998 = var6;
        if (field255 != 0) {
            field375 = true;
        }
    }

    @ObfuscatedName("client.o(I)V")
    public final void method249() {
        field261++;
        this.method167();
        class149.method463();
        class161.method2551();
        method111();
        class124.method579();
        class127.method1784();
        if (Statics.field2655 != null) {
            int var1 = Statics.field2655.method2422();
            field453 = var1;
        }
        if (field259 == 0) {
            Statics.method115();
            Statics.field2010.method2433();
            for (int var2 = 0; var2 < 32; var2++) {
                field2044[var2] = 0L;
            }
            for (int var3 = 0; var3 < 32; var3++) {
                field2053[var3] = 0L;
            }
            Statics.field1775 = 0;
        } else if (field259 == 5) {
            class28.method112(this);
            Statics.method115();
            class131.method788();
        } else if (field259 == 10 || field259 == 11) {
            class28.method112(this);
        } else if (field259 == 20) {
            class28.method112(this);
            Statics.method567();
        } else if (field259 == 25) {
            method670(false);
            field262 = 0;
            boolean var4 = true;
            for (int var5 = 0; var5 < Statics.field165.length; var5++) {
                if (Statics.field1530[var5] != -1 && Statics.field165[var5] == null) {
                    Statics.field165[var5] = Statics.field1456.method2749(Statics.field1530[var5], 0);
                    if (Statics.field165[var5] == null) {
                        var4 = false;
                        field262++;
                    }
                }
                if (Statics.field2511[var5] != -1 && Statics.field606[var5] == null) {
                    Statics.field606[var5] = Statics.field1456.method2680(Statics.field2511[var5], 0, Statics.field1999[var5]);
                    if (Statics.field606[var5] == null) {
                        var4 = false;
                        field262++;
                    }
                }
            }
            if (var4) {
                field350 = 0;
                boolean var6 = true;
                for (int var7 = 0; var7 < Statics.field165.length; var7++) {
                    byte[] var8 = Statics.field606[var7];
                    if (var8 != null) {
                        int var9 = (Statics.field988[var7] >> 8) * 64 - Statics.field1492;
                        int var10 = (Statics.field988[var7] & 0xFF) * 64 - Statics.field1454;
                        if (field315) {
                            var9 = 10;
                            var10 = 10;
                        }
                        boolean var12 = true;
                        class107 var13 = new class107(var8);
                        int var14 = -1;
                        label445: while (true) {
                            int var15 = var13.method2124();
                            if (var15 == 0) {
                                var6 &= var12;
                                break;
                            }
                            var14 += var15;
                            int var17 = 0;
                            boolean var18 = false;
                            while (true) {
                                while (!var18) {
                                    int var20 = var13.method2124();
                                    if (var20 == 0) {
                                        continue label445;
                                    }
                                    var17 += var20 - 1;
                                    int var21 = var17 & 0x3F;
                                    int var22 = var17 >> 6 & 0x3F;
                                    int var23 = var13.method2111() >> 2;
                                    int var24 = var9 + var22;
                                    int var25 = var10 + var21;
                                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                                        class36 var26 = class36.method147(var14);
                                        if (var23 != 22 || !field394 || var26.field857 != 0 || var26.field865 == 1 || var26.field876) {
                                            if (!var26.method631()) {
                                                field350++;
                                                var12 = false;
                                            }
                                            var18 = true;
                                        }
                                    }
                                }
                                int var19 = var13.method2124();
                                if (var19 == 0) {
                                    break;
                                }
                                var13.method2111();
                            }
                        }
                    }
                }
                if (var6) {
                    if (field313 != 0) {
                        method850(class142.field2157 + class2.field22 + class2.field19 + 100 + "%" + class2.field20, true);
                    }
                    method111();
                    method2439();
                    method111();
                    Statics.field199.method1607();
                    method111();
                    System.gc();
                    for (int var27 = 0; var27 < 4; var27++) {
                        field314[var27].method3458();
                    }
                    for (int var28 = 0; var28 < 4; var28++) {
                        for (int var29 = 0; var29 < 104; var29++) {
                            for (int var30 = 0; var30 < 104; var30++) {
                                class6.field80[var28][var29][var30] = 0;
                            }
                        }
                    }
                    method111();
                    class6.field88 = 99;
                    Statics.field93 = new byte[4][104][104];
                    Statics.field76 = new byte[4][104][104];
                    Statics.field64 = new byte[4][104][104];
                    Statics.field1834 = new byte[4][104][104];
                    Statics.field567 = new int[4][105][105];
                    Statics.field1270 = new byte[4][105][105];
                    Statics.field2928 = new int[105][105];
                    Statics.field896 = new int[104];
                    Statics.field85 = new int[104];
                    Statics.field2903 = new int[104];
                    Statics.field61 = new int[104];
                    Statics.field1535 = new int[104];
                    int var31 = Statics.field165.length;
                    class20.method1869();
                    method670(true);
                    if (!field315) {
                        for (int var32 = 0; var32 < var31; var32++) {
                            int var33 = (Statics.field988[var32] >> 8) * 64 - Statics.field1492;
                            int var34 = (Statics.field988[var32] & 0xFF) * 64 - Statics.field1454;
                            byte[] var35 = Statics.field165[var32];
                            if (var35 != null) {
                                method111();
                                class6.method1866(var35, var33, var34, Statics.field618 * 8 - 48, Statics.field439 * 8 - 48, field314);
                            }
                        }
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var37 = (Statics.field988[var36] >> 8) * 64 - Statics.field1492;
                            int var38 = (Statics.field988[var36] & 0xFF) * 64 - Statics.field1454;
                            byte[] var39 = Statics.field165[var36];
                            if (var39 == null && Statics.field439 < 800) {
                                method111();
                                class6.method471(var37, var38, 64, 64);
                            }
                        }
                        method670(true);
                        for (int var40 = 0; var40 < var31; var40++) {
                            byte[] var41 = Statics.field606[var40];
                            if (var41 != null) {
                                int var42 = (Statics.field988[var40] >> 8) * 64 - Statics.field1492;
                                int var43 = (Statics.field988[var40] & 0xFF) * 64 - Statics.field1454;
                                method111();
                                class79 var44 = Statics.field199;
                                class197[] var45 = field314;
                                class107 var46 = new class107(var41);
                                int var47 = -1;
                                while (true) {
                                    int var48 = var46.method2124();
                                    if (var48 == 0) {
                                        break;
                                    }
                                    var47 += var48;
                                    int var49 = 0;
                                    while (true) {
                                        int var50 = var46.method2124();
                                        if (var50 == 0) {
                                            break;
                                        }
                                        var49 += var50 - 1;
                                        int var51 = var49 & 0x3F;
                                        int var52 = var49 >> 6 & 0x3F;
                                        int var53 = var49 >> 12;
                                        int var54 = var46.method2111();
                                        int var55 = var54 >> 2;
                                        int var56 = var54 & 0x3;
                                        int var57 = var42 + var52;
                                        int var58 = var43 + var51;
                                        if (var57 > 0 && var58 > 0 && var57 < 103 && var58 < 103) {
                                            int var59 = var53;
                                            if ((class6.field80[1][var57][var58] & 0x2) == 2) {
                                                var59 = var53 - 1;
                                            }
                                            class197 var60 = null;
                                            if (var59 >= 0) {
                                                var60 = var45[var59];
                                            }
                                            Statics.method103(var53, var57, var58, var47, var56, var55, var44, var60);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (field315) {
                        int var61 = 0;
                        label350: while (true) {
                            if (var61 >= 4) {
                                for (int var72 = 0; var72 < 13; var72++) {
                                    for (int var73 = 0; var73 < 13; var73++) {
                                        int var74 = field316[0][var72][var73];
                                        if (var74 == -1) {
                                            class6.method471(var72 * 8, var73 * 8, 8, 8);
                                        }
                                    }
                                }
                                method670(true);
                                int var75 = 0;
                                while (true) {
                                    if (var75 >= 4) {
                                        break label350;
                                    }
                                    method111();
                                    for (int var76 = 0; var76 < 13; var76++) {
                                        for (int var77 = 0; var77 < 13; var77++) {
                                            int var78 = field316[var75][var76][var77];
                                            if (var78 != -1) {
                                                int var79 = var78 >> 24 & 0x3;
                                                int var80 = var78 >> 1 & 0x3;
                                                int var81 = var78 >> 14 & 0x3FF;
                                                int var82 = var78 >> 3 & 0x7FF;
                                                int var83 = (var81 / 8 << 8) + var82 / 8;
                                                for (int var84 = 0; var84 < Statics.field988.length; var84++) {
                                                    if (Statics.field988[var84] == var83 && Statics.field606[var84] != null) {
                                                        class6.method1599(Statics.field606[var84], var75, var76 * 8, var77 * 8, var79, (var81 & 0x7) * 8, (var82 & 0x7) * 8, var80, Statics.field199, field314);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var75++;
                                }
                            }
                            method111();
                            for (int var62 = 0; var62 < 13; var62++) {
                                for (int var63 = 0; var63 < 13; var63++) {
                                    boolean var64 = false;
                                    int var65 = field316[var61][var62][var63];
                                    if (var65 != -1) {
                                        int var66 = var65 >> 24 & 0x3;
                                        int var67 = var65 >> 1 & 0x3;
                                        int var68 = var65 >> 14 & 0x3FF;
                                        int var69 = var65 >> 3 & 0x7FF;
                                        int var70 = (var68 / 8 << 8) + var69 / 8;
                                        for (int var71 = 0; var71 < Statics.field988.length; var71++) {
                                            if (Statics.field988[var71] == var70 && Statics.field165[var71] != null) {
                                                class6.method3129(Statics.field165[var71], var61, var62 * 8, var63 * 8, var66, (var68 & 0x7) * 8, (var69 & 0x7) * 8, var67, field314);
                                                var64 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var64) {
                                        class6.method10(var61, var62 * 8, var63 * 8);
                                    }
                                }
                            }
                            var61++;
                        }
                    }
                    method670(true);
                    method2439();
                    method111();
                    class6.method1432(Statics.field199, field314);
                    method670(true);
                    int var85 = class6.field88;
                    if (var85 > Statics.field207) {
                        var85 = Statics.field207;
                    }
                    if (var85 < Statics.field207 - 1) {
                        int var86 = Statics.field207 - 1;
                    }
                    if (field394) {
                        Statics.field199.method1608(class6.field88);
                    } else {
                        Statics.field199.method1608(0);
                    }
                    for (int var87 = 0; var87 < 104; var87++) {
                        for (int var88 = 0; var88 < 104; var88++) {
                            method705(var87, var88);
                        }
                    }
                    method111();
                    for (class15 var89 = (class15) field389.method3195(); var89 != null; var89 = (class15) field389.method3212()) {
                        if (var89.field220 == -1) {
                            var89.field219 = 0;
                            method2064(var89);
                        } else {
                            var89.method3275();
                        }
                    }
                    class36.field841.method3138();
                    if (Statics.field1907 != null) {
                        field382.method2356(47);
                        field382.method2100(1057001181);
                    }
                    if (!field315) {
                        int var90 = (Statics.field618 - 6) / 8;
                        int var91 = (Statics.field618 + 6) / 8;
                        int var92 = (Statics.field439 - 6) / 8;
                        int var93 = (Statics.field439 + 6) / 8;
                        for (int var94 = var90 - 1; var94 <= var91 + 1; var94++) {
                            for (int var95 = var92 - 1; var95 <= var93 + 1; var95++) {
                                if (var94 < var90 || var94 > var91 || var95 < var92 || var95 > var93) {
                                    Statics.field1456.method2714("m" + var94 + "_" + var95);
                                    Statics.field1456.method2714("l" + var94 + "_" + var95);
                                }
                            }
                        }
                    }
                    method762(30);
                    method111();
                    class6.method484();
                    field382.method2356(138);
                    class131.method788();
                } else {
                    field313 = 2;
                }
            } else {
                field313 = 1;
            }
        }
        if (field259 == 30) {
            method1602();
        } else if (field259 == 40 || field259 == 45) {
            Statics.method567();
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method165() {
        boolean var1;
        label157: {
            try {
                if (class161.field2713 == 2) {
                    if (Statics.field1831 == null) {
                        Statics.field1831 = class158.method2920(Statics.field2673, Statics.field1903, Statics.field1936);
                        if (Statics.field1831 == null) {
                            var1 = false;
                            break label157;
                        }
                    }
                    if (Statics.field2717 == null) {
                        Statics.field2717 = new class53(Statics.field2714, Statics.field2721);
                    }
                    if (Statics.field203.method3052(Statics.field1831, Statics.field2718, Statics.field2717, 22050)) {
                        Statics.field203.method3006();
                        Statics.field203.method3038(Statics.field2716);
                        Statics.field203.method3008(Statics.field1831, Statics.field600);
                        class161.field2713 = 0;
                        Statics.field1831 = null;
                        Statics.field2717 = null;
                        Statics.field2673 = null;
                        var1 = true;
                        break label157;
                    }
                }
            } catch (Exception var28) {
                var28.printStackTrace();
                Statics.field203.method3009();
                class161.field2713 = 0;
                Statics.field1831 = null;
                Statics.field2717 = null;
                Statics.field2673 = null;
            }
            var1 = false;
        }
        if (var1 && field489 && Statics.field609 != null) {
            Statics.field609.method1013();
        }
        if (field2048) {
            class124.method2457(Statics.field1589);
            Canvas var4 = Statics.field1589;
            var4.removeMouseListener(class127.field2007);
            var4.removeMouseMotionListener(class127.field2007);
            var4.removeFocusListener(class127.field2007);
            class127.field2006 = 0;
            if (Statics.field2655 != null) {
                Statics.field2655.method2414(Statics.field1589);
            }
            this.method2577();
            Canvas var5 = Statics.field1589;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class124.field1971);
            var5.addFocusListener(class124.field1971);
            Canvas var6 = Statics.field1589;
            var6.addMouseListener(class127.field2007);
            var6.addMouseMotionListener(class127.field2007);
            var6.addFocusListener(class127.field2007);
            if (Statics.field2655 != null) {
                Statics.field2655.method2424(Statics.field1589);
            }
        }
        if (field259 == 0) {
            int var7 = class28.field664;
            String var8 = class28.field661;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field1589.getGraphics();
                if (Statics.field1989 == null) {
                    Statics.field1989 = new Font("Helvetica", 1, 13);
                    Statics.field789 = Statics.field1589.getFontMetrics(Statics.field1989);
                }
                if (field2054) {
                    field2054 = false;
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field1526, Statics.field1682);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1285 == null) {
                        Statics.field1285 = Statics.field1589.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field1285.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field1989);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field789.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field1285, Statics.field1526 / 2 - 152, Statics.field1682 / 2 - 18, (ImageObserver) null);
                } catch (Exception var24) {
                    int var13 = Statics.field1526 / 2 - 152;
                    int var14 = Statics.field1682 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field1989);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field789.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var25) {
                Statics.field1589.repaint();
            }
        } else if (field259 == 5) {
            class28.method1969(Statics.field58, Statics.field1873);
        } else if (field259 == 10 || field259 == 11) {
            class28.method1969(Statics.field58, Statics.field1873);
        } else if (field259 == 20) {
            class28.method1969(Statics.field58, Statics.field1873);
        } else if (field259 == 25) {
            if (field313 == 1) {
                if (field262 > field310) {
                    field310 = field262;
                }
                int var16 = (field310 * 50 - field262 * 50) / field310;
                method850(class142.field2157 + class2.field22 + class2.field19 + var16 + "%" + class2.field20, false);
            } else if (field313 == 2) {
                if (field350 > field448) {
                    field448 = field350;
                }
                int var17 = (field448 * 50 - field350 * 50) / field448 + 50;
                method850(class142.field2157 + class2.field22 + class2.field19 + var17 + "%" + class2.field20, false);
            } else {
                method850(class142.field2157, false);
            }
        } else if (field259 == 30) {
            Statics.method835();
        } else if (field259 == 40) {
            method850(class142.field2158 + class2.field22 + class142.field2159, false);
        } else if (field259 == 45) {
            method850(class142.field2231, false);
        }
        if (field259 == 30 && field467 == 0 && !field2054) {
            try {
                Graphics var18 = Statics.field1589.getGraphics();
                for (int var19 = 0; var19 < field458; var19++) {
                    if (field414[var19]) {
                        Statics.field582.method1366(var18, field265[var19], field287[var19], field465[var19], field357[var19]);
                        field414[var19] = false;
                    }
                }
            } catch (Exception var27) {
                Statics.field1589.repaint();
            }
        } else if (field259 > 0) {
            try {
                Graphics var21 = Statics.field1589.getGraphics();
                Statics.field582.method1365(var21, 0, 0);
                field2054 = false;
                for (int var22 = 0; var22 < field458; var22++) {
                    field414[var22] = false;
                }
            } catch (Exception var26) {
                Statics.field1589.repaint();
            }
        }
    }

    @ObfuscatedName("client.x(I)V")
    public final void method169() {
        if (Statics.field1884 != null) {
            Statics.field1884.field182 = false;
        }
        Statics.field1884 = null;
        if (Statics.field1451 != null) {
            Statics.field1451.method2552();
            Statics.field1451 = null;
        }
        if (class124.field1971 != null) {
            class124 var1 = class124.field1971;
            synchronized (class124.field1971) {
                class124.field1971 = null;
            }
        }
        if (class127.field2007 != null) {
            class127 var3 = class127.field2007;
            synchronized (class127.field2007) {
                class127.field2007 = null;
            }
        }
        Statics.field2655 = null;
        if (Statics.field609 != null) {
            Statics.field609.method1008();
        }
        if (Statics.field1504 != null) {
            Statics.field1504.method1008();
        }
        if (Statics.field2514 != null) {
            Statics.field2514.method2552();
        }
        Object var5 = class149.field2490;
        synchronized (class149.field2490) {
            if (class149.field2489 != 0) {
                class149.field2489 = 1;
                try {
                    class149.field2490.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class136.method1863();
    }

    @ObfuscatedName("am.n(IB)V")
    public static void method762(int arg0) {
        if (field259 == arg0) {
            return;
        }
        if (field259 == 0) {
            class131.method2804();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field288 = 0;
            field272 = 0;
            field372 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2759 != null) {
            Statics.field2759.method2552();
            Statics.field2759 = null;
        }
        if (field259 == 25) {
            field313 = 0;
            field262 = 0;
            field310 = 1;
            field350 = 0;
            field448 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method108(Statics.field1589, Statics.field285, Statics.field216, true, 0);
        } else if (arg0 == 20) {
            class28.method108(Statics.field1589, Statics.field285, Statics.field216, true, field259 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method108(Statics.field1589, Statics.field285, Statics.field216, false, 4);
        } else if (Statics.field658) {
            Statics.field642 = null;
            Statics.field643 = null;
            Statics.field641 = null;
            Statics.field645 = null;
            Statics.field646 = null;
            Statics.field1934 = null;
            Statics.field663 = null;
            Statics.field638 = null;
            Statics.field650 = null;
            Statics.field564 = null;
            Statics.field675 = null;
            Statics.field612 = null;
            Statics.field2030 = null;
            Statics.field77 = null;
            Statics.field1911 = null;
            Statics.field1962 = null;
            Statics.field652 = null;
            Statics.field2128 = null;
            Statics.field655 = null;
            Statics.field161 = null;
            Statics.field53 = null;
            Statics.field2660 = null;
            class161.method2819(2);
            class150.method2662(true);
            Statics.field658 = false;
        }
        field259 = arg0;
    }

    @ObfuscatedName("client.d(B)V")
    public void method167() {
        if (field259 == 1000) {
            return;
        }
        long var1 = class103.method470();
        int var3 = (int) (var1 - Statics.field2505);
        Statics.field2505 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class150.field2495 += var3;
        boolean var4;
        if (class150.field2497 == 0 && class150.field2512 == 0 && class150.field2500 == 0 && class150.field2498 == 0) {
            var4 = true;
        } else if (Statics.field2514 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class150.field2495 > 30000) {
                        throw new IOException();
                    }
                    while (class150.field2512 < 20 && class150.field2498 > 0) {
                        class151 var5 = (class151) class150.field2504.method3166();
                        class107 var6 = new class107(4);
                        var6.method2097(1);
                        var6.method2182((int) var5.field2877);
                        Statics.field2514.method2556(var6.field1865, 0, 4);
                        class150.field2499.method3164(var5, var5.field2877);
                        class150.field2498--;
                        class150.field2512++;
                    }
                    while (class150.field2497 < 20 && class150.field2500 > 0) {
                        class151 var7 = (class151) class150.field2494.method3241();
                        class107 var8 = new class107(4);
                        var8.method2097(0);
                        var8.method2182((int) var7.field2877);
                        Statics.field2514.method2556(var8.field1865, 0, 4);
                        var7.method3256();
                        class150.field2513.method3164(var7, var7.field2877);
                        class150.field2500--;
                        class150.field2497++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2514.method2555();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class150.field2495 = 0;
                        byte var11 = 0;
                        if (Statics.field2880 == null) {
                            var11 = 8;
                        } else if (class150.field2507 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class150.field2506.field1863;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2514.method2567(class150.field2506.field1865, class150.field2506.field1863, var12);
                            if (class150.field2510 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class150.field2506.field1865[class150.field2506.field1863 + var13] ^= class150.field2510;
                                }
                            }
                            class150.field2506.field1863 += var12;
                            if (class150.field2506.field1863 < var11) {
                                break;
                            }
                            if (Statics.field2880 == null) {
                                class150.field2506.field1863 = 0;
                                int var14 = class150.field2506.method2111();
                                int var15 = class150.field2506.method2232();
                                int var16 = class150.field2506.method2111();
                                int var17 = class150.field2506.method2116();
                                long var18 = (long) ((var14 << 16) + var15);
                                class151 var20 = (class151) class150.field2499.method3163(var18);
                                Statics.field1683 = true;
                                if (var20 == null) {
                                    var20 = (class151) class150.field2513.method3163(var18);
                                    Statics.field1683 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2880 = var20;
                                Statics.field513 = new class107(var17 + var21 + Statics.field2880.field2522);
                                Statics.field513.method2097(var16);
                                Statics.field513.method2100(var17);
                                class150.field2507 = 8;
                                class150.field2506.field1863 = 0;
                            } else if (class150.field2507 == 0) {
                                if (class150.field2506.field1865[0] == -1) {
                                    class150.field2507 = 1;
                                    class150.field2506.field1863 = 0;
                                } else {
                                    Statics.field2880 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field513.field1865.length - Statics.field2880.field2522;
                            int var23 = 512 - class150.field2507;
                            if (var23 > var22 - Statics.field513.field1863) {
                                var23 = var22 - Statics.field513.field1863;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2514.method2567(Statics.field513.field1865, Statics.field513.field1863, var23);
                            if (class150.field2510 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field513.field1865[Statics.field513.field1863 + var24] ^= class150.field2510;
                                }
                            }
                            Statics.field513.field1863 += var23;
                            class150.field2507 += var23;
                            if (Statics.field513.field1863 == var22) {
                                if (Statics.field2880.field2877 == 16711935L) {
                                    Statics.field2031 = Statics.field513;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class147 var26 = class150.field2509[var25];
                                        if (var26 != null) {
                                            Statics.field2031.field1863 = var25 * 8 + 5;
                                            int var27 = Statics.field2031.method2116();
                                            int var28 = Statics.field2031.method2116();
                                            var26.method2764(var27, var28);
                                        }
                                    }
                                } else {
                                    class150.field2508.reset();
                                    class150.field2508.update(Statics.field513.field1865, 0, var22);
                                    int var29 = (int) class150.field2508.getValue();
                                    if (Statics.field2880.field2517 != var29) {
                                        try {
                                            Statics.field2514.method2552();
                                        } catch (Exception var35) {
                                        }
                                        class150.field2501++;
                                        Statics.field2514 = null;
                                        class150.field2510 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class150.field2501 = 0;
                                    class150.field2496 = 0;
                                    Statics.field2880.field2518.method2774((int) (Statics.field2880.field2877 & 0xFFFFL), Statics.field513.field1865, (Statics.field2880.field2877 & 0xFF0000L) == 16711680L, Statics.field1683);
                                }
                                Statics.field2880.method3275();
                                if (Statics.field1683) {
                                    class150.field2512--;
                                } else {
                                    class150.field2497--;
                                }
                                class150.field2507 = 0;
                                Statics.field2880 = null;
                                Statics.field513 = null;
                            } else {
                                if (class150.field2507 != 512) {
                                    break;
                                }
                                class150.field2507 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2514.method2552();
                } catch (Exception var34) {
                }
                class150.field2496++;
                Statics.field2514 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method287();
        }
    }

    @ObfuscatedName("client.s(B)V")
    public void method287() {
        if (class150.field2501 >= 4) {
            this.method2611("js5crc");
            field259 = 1000;
            return;
        }
        if (class150.field2496 >= 4) {
            if (field259 <= 5) {
                this.method2611("js5io");
                field259 = 1000;
                return;
            }
            field282 = 3000;
            class150.field2496 = 3;
        }
        if (--field282 + 1 > 0) {
            return;
        }
        try {
            if (field281 == 0) {
                Statics.field206 = Statics.field1680.method2462(Statics.field151, Statics.field1000);
                field281++;
            }
            if (field281 == 1) {
                if (Statics.field206.field2066 == 2) {
                    this.method319(-1);
                    return;
                }
                if (Statics.field206.field2066 == 1) {
                    field281++;
                }
            }
            if (field281 == 2) {
                Statics.field1933 = new class130((Socket) Statics.field206.field2070, Statics.field1680);
                class107 var1 = new class107(5);
                var1.method2097(15);
                var1.method2100(59);
                Statics.field1933.method2556(var1.field1865, 0, 5);
                field281++;
                Statics.field1949 = class103.method470();
            }
            if (field281 == 3) {
                if (field259 <= 5 || Statics.field1933.method2555() > 0) {
                    int var2 = Statics.field1933.method2554();
                    if (var2 != 0) {
                        this.method319(var2);
                        return;
                    }
                    field281++;
                } else if (class103.method470() - Statics.field1949 > 30000L) {
                    this.method319(-2);
                    return;
                }
            }
            if (field281 == 4) {
                class150.method1854(Statics.field1933, field259 > 20);
                Statics.field206 = null;
                Statics.field1933 = null;
                field281 = 0;
                field257 = 0;
            }
        } catch (IOException var4) {
            this.method319(-3);
        }
    }

    @ObfuscatedName("client.v(IB)V")
    public void method319(int arg0) {
        Statics.field206 = null;
        Statics.field1933 = null;
        field281 = 0;
        if (Statics.field998 == Statics.field1000) {
            Statics.field1000 = Statics.field2679;
        } else {
            Statics.field1000 = Statics.field998;
        }
        field257++;
        if (field257 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field259 <= 5) {
                this.method2611("js5connect_full");
                field259 = 1000;
            } else {
                field282 = 3000;
            }
        } else if (field257 >= 2 && arg0 == 6) {
            this.method2611("js5connect_outofdate");
            field259 = 1000;
        } else if (field257 >= 4) {
            if (field259 <= 5) {
                this.method2611("js5connect");
                field259 = 1000;
            } else {
                field282 = 3000;
            }
        }
    }

    @ObfuscatedName("b.u(IZZZI)Let;")
    public static class147 method110(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2087 != null) {
            var4 = new class121(arg0, class136.field2087, Statics.field1906[arg0], 1000000);
        }
        return new class147(var4, Statics.field1994, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ek.i(B)V")
    public static void method2656() {
        field382.field1863 = 0;
        field297.field1863 = 0;
        field299 = -1;
        field434 = -1;
        field400 = -1;
        field305 = -1;
        field464 = 0;
        field300 = 0;
        field268 = 0;
        field398 = 0;
        field396 = false;
        field437 = 0;
        field392 = 0;
        for (int var0 = 0; var0 < field311.length; var0++) {
            if (field311[var0] != null) {
                field311[var0].field754 = -1;
            }
        }
        for (int var1 = 0; var1 < field292.length; var1++) {
            if (field292[var1] != null) {
                field292[var1].field754 = -1;
            }
        }
        class14.method2639();
        method762(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field460[var2] = true;
        }
    }

    @ObfuscatedName("k.e(I)V")
    public static final void method4() {
        if (Statics.field1451 != null) {
            Statics.field1451.method2552();
            Statics.field1451 = null;
        }
        method2439();
        Statics.field199.method1607();
        for (int var0 = 0; var0 < 4; var0++) {
            field314[var0].method3458();
        }
        System.gc();
        class161.method2819(2);
        field267 = -1;
        field489 = false;
        class20.method1869();
        method762(10);
    }

    @ObfuscatedName("di.a(I)V")
    public static final void method2439() {
        class41.method564();
        class37.method515();
        class40.method836();
        class36.field883.method3138();
        class36.field841.method3138();
        class36.field842.method3138();
        class36.field843.method3138();
        Statics.method2636();
        class45.method121();
        class38.method3306();
        class39.field925.method3138();
        class39.field926.method3138();
        class42.method468();
        class46.method2542();
        class157.field2683.method3138();
        class152.method2401();
        ((class88) Statics.field1487).method1860();
        class19.field535.method3138();
        Statics.field283.method2691();
        Statics.field1839.method2691();
        Statics.field362.method2691();
        Statics.field1900.method2691();
        Statics.field1456.method2691();
        Statics.field2112.method2691();
        Statics.field792.method2691();
        Statics.field216.method2691();
        Statics.field1450.method2691();
        Statics.field285.method2691();
        Statics.field286.method2691();
        Statics.field2101.method2691();
    }

    @ObfuscatedName("cm.c(B)V")
    public static final void method1970() {
        if (field254 > 0) {
            method4();
        } else {
            method762(40);
            Statics.field2759 = Statics.field1451;
            Statics.field1451 = null;
        }
    }

    @ObfuscatedName("bx.f(I)V")
    public static final void method1602() {
        if (field268 > 1) {
            field268--;
        }
        if (field254 > 0) {
            field254--;
        }
        if (field456) {
            field456 = false;
            method1970();
            return;
        }
        if (!field396) {
            field498[0] = class142.field2284;
            field404[0] = "";
            field401[0] = 1006;
            field398 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field1451 == null) {
                var1 = false;
            } else {
                label2711: {
                    try {
                        int var2 = Statics.field1451.method2555();
                        if (var2 == 0) {
                            var1 = false;
                            break label2711;
                        }
                        if (field299 == -1) {
                            Statics.field1451.method2567(field297.field1865, 0, 1);
                            field297.field1863 = 0;
                            field299 = field297.method2343();
                            field464 = class166.field2800[field299];
                            var2--;
                        }
                        if (field464 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2711;
                            }
                            Statics.field1451.method2567(field297.field1865, 0, 1);
                            field464 = field297.field1865[0] & 0xFF;
                            var2--;
                        }
                        if (field464 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2711;
                            }
                            Statics.field1451.method2567(field297.field1865, 0, 2);
                            field297.field1863 = 0;
                            field464 = field297.method2232();
                            var2 -= 2;
                        }
                        if (var2 < field464) {
                            var1 = false;
                            break label2711;
                        }
                        field297.field1863 = 0;
                        Statics.field1451.method2567(field297.field1865, 0, field464);
                        field300 = 0;
                        field305 = field400;
                        field400 = field434;
                        field434 = field299;
                        if (field299 == 98) {
                            method1(false);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 44) {
                            int var3 = field297.method2135();
                            int var4 = field297.method2111();
                            int var5 = field297.method2136();
                            Statics.field207 = var3 >> 1;
                            Statics.field555.method591(var5, var4, (var3 & 0x1) == 1);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 140) {
                            String var6 = field297.method2119();
                            long var7 = field297.method2172();
                            long var9 = (long) field297.method2232();
                            long var11 = (long) field297.method2262();
                            int var13 = field297.method2111();
                            long var14 = (var9 << 32) + var11;
                            boolean var16 = false;
                            for (int var17 = 0; var17 < 100; var17++) {
                                if (field471[var17] == var14) {
                                    var16 = true;
                                    break;
                                }
                            }
                            if (var13 <= 1 && method3066(var6)) {
                                var16 = true;
                            }
                            if (!var16 && field345 == 0) {
                                field471[field472] = var14;
                                field472 = (field472 + 1) % 100;
                                String var18 = class192.method3354(Statics.method1962(class191.method3071(field297)));
                                if (var13 == 2 || var13 == 3) {
                                    class10.method2411(9, class2.method760(1) + var6, var18, class198.method448(var7));
                                } else if (var13 == 1) {
                                    class10.method2411(9, class2.method760(0) + var6, var18, class198.method448(var7));
                                } else {
                                    class10.method2411(9, var6, var18, class198.method448(var7));
                                }
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 176 || field299 == 6 || field299 == 216 || field299 == 102 || field299 == 136 || field299 == 204 || field299 == 18 || field299 == 175 || field299 == 228 || field299 == 236) {
                            method30();
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 208) {
                            field371 = true;
                            Statics.field887 = field297.method2111();
                            Statics.field522 = field297.method2111();
                            Statics.field2397 = field297.method2232();
                            Statics.field2147 = field297.method2111();
                            Statics.field2078 = field297.method2111();
                            if (Statics.field2078 >= 100) {
                                int var19 = Statics.field887 * 128 + 64;
                                int var20 = Statics.field522 * 128 + 64;
                                int var21 = method28(var19, var20, Statics.field207) - Statics.field2397;
                                int var22 = var19 - Statics.field514;
                                int var23 = var21 - Statics.field2107;
                                int var24 = var20 - Statics.field649;
                                int var25 = (int) Math.sqrt((double) (var22 * var22 + var24 * var24));
                                Statics.field1288 = (int) (Math.atan2((double) var23, (double) var25) * 325.949D) & 0x7FF;
                                Statics.field2945 = (int) (Math.atan2((double) var22, (double) var24) * -325.949D) & 0x7FF;
                                if (Statics.field1288 < 128) {
                                    Statics.field1288 = 128;
                                }
                                if (Statics.field1288 > 383) {
                                    Statics.field1288 = 383;
                                }
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 8) {
                            int var26 = field297.method2144();
                            int var27 = field297.method2175();
                            class154.field2663[var26] = var27;
                            if (class154.field2665[var26] != var27) {
                                class154.field2665[var26] = var27;
                                method502(var26);
                            }
                            field441[++field501 - 1 & 0x1F] = var26;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 214) {
                            method2507();
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 235) {
                            int var28 = field297.method2151();
                            int var29 = field297.method2116();
                            int var30 = field297.method2232();
                            if (var30 == 65535) {
                                var30 = -1;
                            }
                            class152 var31 = Statics.method480(var29);
                            if (var31.field2533) {
                                var31.field2638 = var30;
                                var31.field2639 = var28;
                                class45 var33 = class45.method1864(var30);
                                var31.field2574 = var33.field1052;
                                var31.field2612 = var33.field1027;
                                var31.field2597 = var33.field1028;
                                var31.field2572 = var33.field1029;
                                var31.field2573 = var33.field1030;
                                var31.field2577 = var33.field1025;
                                if (var31.field2543 > 0) {
                                    var31.field2577 = var31.field2577 * 32 / var31.field2543;
                                }
                                method3127(var31);
                            } else {
                                if (var30 == -1) {
                                    var31.field2566 = 0;
                                    field299 = -1;
                                    var1 = true;
                                    break label2711;
                                }
                                class45 var32 = class45.method1864(var30);
                                var31.field2566 = 4;
                                var31.field2559 = var30;
                                var31.field2574 = var32.field1052;
                                var31.field2612 = var32.field1027;
                                var31.field2577 = var32.field1025 * 100 / var28;
                                method3127(var31);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 79) {
                            class22 var34 = new class22();
                            var34.field573 = field297.method2119();
                            var34.field574 = field297.method2232();
                            int var35 = field297.method2116();
                            var34.field571 = var35;
                            method762(45);
                            Statics.field1451.method2552();
                            Statics.field1451 = null;
                            class28.method114(var34);
                            field299 = -1;
                            var1 = false;
                            break label2711;
                        }
                        if (field299 == 28) {
                            field371 = false;
                            for (int var36 = 0; var36 < 5; var36++) {
                                field499[var36] = false;
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 254) {
                            int var37 = field297.method2175();
                            int var38 = field297.method2146();
                            class152 var39 = Statics.method480(var37);
                            if (var39.field2644 != var38 || var38 == -1) {
                                var39.field2644 = var38;
                                var39.field2654 = 0;
                                var39.field2641 = 0;
                                method3127(var39);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 132) {
                            while (field297.field1863 < field464) {
                                boolean var40 = field297.method2111() == 1;
                                String var41 = field297.method2119();
                                String var42 = field297.method2119();
                                int var43 = field297.method2232();
                                int var44 = field297.method2111();
                                int var45 = field297.method2111();
                                boolean var46 = (var45 & 0x2) != 0;
                                boolean var47 = (var45 & 0x1) != 0;
                                if (var43 > 0) {
                                    field297.method2119();
                                    field297.method2111();
                                    field297.method2116();
                                }
                                field297.method2119();
                                for (int var48 = 0; var48 < field369; var48++) {
                                    class16 var49 = field506[var48];
                                    if (var40) {
                                        if (var42.equals(var49.field234)) {
                                            var49.field234 = var41;
                                            var49.field228 = var42;
                                            var41 = null;
                                            break;
                                        }
                                    } else if (var41.equals(var49.field234)) {
                                        if (var49.field229 != var43) {
                                            boolean var50 = true;
                                            for (class34 var51 = (class34) field507.method3161(); var51 != null; var51 = (class34) field507.method3156()) {
                                                if (var51.field794.equals(var41)) {
                                                    if (var43 != 0 && var51.field791 == 0) {
                                                        var51.method3273();
                                                        var50 = false;
                                                    } else if (var43 == 0 && var51.field791 != 0) {
                                                        var51.method3273();
                                                        var50 = false;
                                                    }
                                                }
                                            }
                                            if (var50) {
                                                field507.method3157(new class34(var41, var43));
                                            }
                                            var49.field229 = var43;
                                        }
                                        var49.field228 = var42;
                                        var49.field230 = var44;
                                        var49.field231 = var46;
                                        var49.field232 = var47;
                                        var41 = null;
                                        break;
                                    }
                                }
                                if (var41 != null && field369 < 400) {
                                    class16 var52 = new class16();
                                    field506[field369] = var52;
                                    var52.field234 = var41;
                                    var52.field228 = var42;
                                    var52.field229 = var43;
                                    var52.field230 = var44;
                                    var52.field231 = var46;
                                    var52.field232 = var47;
                                    field369++;
                                }
                            }
                            field395 = 2;
                            field359 = field325;
                            boolean var53 = false;
                            int var54 = field369;
                            while (var54 > 0) {
                                boolean var55 = true;
                                var54--;
                                for (int var56 = 0; var56 < var54; var56++) {
                                    boolean var57 = false;
                                    class16 var58 = field506[var56];
                                    class16 var59 = field506[var56 + 1];
                                    if (field253 != var58.field229 && field253 == var59.field229) {
                                        var57 = true;
                                    }
                                    if (!var57 && var58.field229 == 0 && var59.field229 != 0) {
                                        var57 = true;
                                    }
                                    if (!var57 && !var58.field231 && var59.field231) {
                                        var57 = true;
                                    }
                                    if (!var57 && !var58.field232 && var59.field232) {
                                        var57 = true;
                                    }
                                    if (var57) {
                                        class16 var60 = field506[var56];
                                        field506[var56] = field506[var56 + 1];
                                        field506[var56 + 1] = var60;
                                        var55 = false;
                                    }
                                }
                                if (var55) {
                                    break;
                                }
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 27) {
                            int var61 = field297.method2145();
                            int var62 = field297.method2144();
                            int var63 = field297.method2175();
                            int var64 = field297.method2232();
                            class152 var65 = Statics.method480(var63);
                            if (var65.field2574 != var62 || var65.field2612 != var64 || var65.field2577 != var61) {
                                var65.field2574 = var62;
                                var65.field2612 = var64;
                                var65.field2577 = var61;
                                method3127(var65);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 173) {
                            Statics.field890 = field297.method2111();
                            Statics.field920 = field297.method2135();
                            while (field297.field1863 < field464) {
                                field299 = field297.method2111();
                                method30();
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 142) {
                            field297.field1863 += 28;
                            if (field297.method2131()) {
                                class136.method31(field297, field297.field1863 - 28);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 227) {
                            int var66 = field297.method2143();
                            int var67 = field297.method2116();
                            int var68 = var66 >> 10 & 0x1F;
                            int var69 = var66 >> 5 & 0x1F;
                            int var70 = var66 & 0x1F;
                            int var71 = (var70 << 3) + (var68 << 19) + (var69 << 11);
                            class152 var72 = Statics.method480(var67);
                            if (var72.field2551 != var71) {
                                var72.field2551 = var71;
                                method3127(var72);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 199) {
                            int var73 = field297.method2116();
                            int var74 = field297.method2145();
                            class152 var75 = Statics.method480(var73);
                            if (var75.field2566 != 2 || var75.field2559 != var74) {
                                var75.field2566 = 2;
                                var75.field2559 = var74;
                                method3127(var75);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 141) {
                            class189.method447(field297, field464);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 163) {
                            int var76 = field297.method2111();
                            int var77 = field297.method2111();
                            int var78 = field297.method2111();
                            int var79 = field297.method2111();
                            field499[var76] = true;
                            field500[var76] = var77;
                            field461[var76] = var78;
                            field385[var76] = var79;
                            field269[var76] = 0;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 131) {
                            int var80 = field464 + field297.field1863;
                            int var81 = field297.method2232();
                            int var82 = field297.method2232();
                            if (field416 != var81) {
                                field416 = var81;
                                method22(field416);
                                class32.method507(field416);
                                for (int var83 = 0; var83 < 100; var83++) {
                                    field460[var83] = true;
                                }
                            }
                            while (var82-- > 0) {
                                int var84 = field297.method2116();
                                int var85 = field297.method2232();
                                int var86 = field297.method2111();
                                class4 var87 = (class4) field417.method3163((long) var84);
                                if (var87 != null && var87.field56 != var85) {
                                    method740(var87, true);
                                    var87 = null;
                                }
                                if (var87 == null) {
                                    var87 = method2362(var84, var85, var86);
                                }
                                var87.field55 = true;
                            }
                            for (class4 var88 = (class4) field417.method3166(); var88 != null; var88 = (class4) field417.method3168()) {
                                if (var88.field55) {
                                    var88.field55 = false;
                                } else {
                                    method740(var88, true);
                                }
                            }
                            field298 = new class174(512);
                            while (field297.field1863 < var80) {
                                int var89 = field297.method2116();
                                int var90 = field297.method2232();
                                int var91 = field297.method2232();
                                int var92 = field297.method2116();
                                for (int var93 = var90; var93 <= var91; var93++) {
                                    long var94 = ((long) var89 << 32) + (long) var93;
                                    field298.method3164(new class179(var92), var94);
                                }
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 40) {
                            String var96 = field297.method2119();
                            int var97 = field297.method2151();
                            class152 var98 = Statics.method480(var97);
                            if (!var96.equals(var98.field2646)) {
                                var98.field2646 = var96;
                                method3127(var98);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 17) {
                            int var99 = field297.method2144();
                            class14 var100 = (class14) class14.field200.method3163((long) var99);
                            if (var100 != null) {
                                var100.method3275();
                            }
                            field443[++field510 - 1 & 0x1F] = var99 & 0x7FFF;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 53) {
                            int var101 = field297.method2116();
                            int var102 = field297.method2146();
                            int var103 = field297.method2240();
                            class152 var104 = Statics.method480(var101);
                            int var105 = var104.field2613 + var102;
                            int var106 = var104.field2603 + var103;
                            if (var104.field2587 != var105 || var104.field2540 != var106) {
                                var104.field2587 = var105;
                                var104.field2540 = var106;
                                method3127(var104);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 47) {
                            int var107 = field297.method2145();
                            int var108 = field297.method2175();
                            int var109 = field297.method2145();
                            class152 var110 = Statics.method480(var108);
                            var110.field2578 = (var107 << 16) + var109;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 221) {
                            field469 = field297.method2111();
                            field470 = field297.method2111();
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 243) {
                            int var111 = field297.method2116();
                            class152 var112 = Statics.method480(var111);
                            var112.field2566 = 3;
                            var112.field2559 = Statics.field555.field29.method2901();
                            method3127(var112);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 35) {
                            Statics.method27();
                            field488 = field297.method2240();
                            field319 = field325;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 222) {
                            field371 = true;
                            Statics.field185 = field297.method2111();
                            Statics.field249 = field297.method2111();
                            Statics.field987 = field297.method2232();
                            Statics.field57 = field297.method2111();
                            Statics.field11 = field297.method2111();
                            if (Statics.field11 >= 100) {
                                Statics.field514 = Statics.field185 * 128 + 64;
                                Statics.field649 = Statics.field249 * 128 + 64;
                                Statics.field2107 = method28(Statics.field514, Statics.field649, Statics.field207) - Statics.field987;
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 19) {
                            Statics.method27();
                            int var113 = field297.method2151();
                            int var114 = field297.method2111();
                            int var115 = field297.method2102();
                            field312[var115] = var113;
                            field324[var115] = var114;
                            field502[var115] = 1;
                            for (int var116 = 0; var116 < 98; var116++) {
                                if (var113 >= class140.field2130[var116]) {
                                    field502[var115] = var116 + 2;
                                }
                            }
                            field260[++field388 - 1 & 0x1F] = var115;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 223) {
                            field268 = field297.method2143() * 30;
                            field319 = field325;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 106) {
                            int var117 = field297.method2143();
                            field416 = var117;
                            method22(var117);
                            class32.method507(field416);
                            for (int var118 = 0; var118 < 100; var118++) {
                                field460[var118] = true;
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 12) {
                            boolean var119 = field297.method2135() == 1;
                            int var120 = field297.method2116();
                            class152 var121 = Statics.method480(var120);
                            if (var121.field2546 != var119) {
                                var121.field2546 = var119;
                                method3127(var121);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 63) {
                            field392 = field297.method2111();
                            if (field392 == 255) {
                                field392 = 0;
                            }
                            field485 = field297.method2111();
                            if (field485 == 255) {
                                field485 = 0;
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 150) {
                            int var122 = field297.method2153();
                            class152 var123 = Statics.method480(var122);
                            for (int var124 = 0; var124 < var123.field2636.length; var124++) {
                                var123.field2636[var124] = -1;
                                var123.field2636[var124] = 0;
                            }
                            method3127(var123);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 36) {
                            int var125 = field297.method2151();
                            Statics.field278 = Statics.field1680.method2477(var125);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 117) {
                            field449 = field325;
                            if (field464 == 0) {
                                field331 = null;
                                field478 = null;
                                Statics.field172 = 0;
                                Statics.field2404 = null;
                                field299 = -1;
                                var1 = true;
                            } else {
                                field478 = field297.method2119();
                                long var126 = field297.method2172();
                                long var128 = var126;
                                String var130;
                                if (var126 <= 0L || var126 >= 6582952005840035281L) {
                                    var130 = null;
                                } else if (var126 % 37L == 0L) {
                                    var130 = null;
                                } else {
                                    int var131 = 0;
                                    for (long var132 = var126; var132 != 0L; var132 /= 37L) {
                                        var131++;
                                    }
                                    StringBuilder var134 = new StringBuilder(var131);
                                    while (var128 != 0L) {
                                        long var135 = var128;
                                        var128 /= 37L;
                                        var134.append(class198.field2959[(int) (var135 - var128 * 37L)]);
                                    }
                                    var130 = var134.reverse().toString();
                                }
                                field331 = var130;
                                Statics.field1352 = field297.method2112();
                                int var137 = field297.method2111();
                                if (var137 == 255) {
                                    field299 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field172 = var137;
                                    class21[] var138 = new class21[100];
                                    for (int var139 = 0; var139 < Statics.field172; var139++) {
                                        var138[var139] = new class21();
                                        var138[var139].field566 = field297.method2119();
                                        var138[var139].field560 = class200.method2549(var138[var139].field566, Statics.field2960);
                                        var138[var139].field568 = field297.method2232();
                                        var138[var139].field562 = field297.method2112();
                                        field297.method2119();
                                        if (var138[var139].field566.equals(Statics.field555.field43)) {
                                            Statics.field788 = var138[var139].field562;
                                        }
                                    }
                                    boolean var140 = false;
                                    int var141 = Statics.field172;
                                    while (var141 > 0) {
                                        boolean var142 = true;
                                        var141--;
                                        for (int var143 = 0; var143 < var141; var143++) {
                                            if (var138[var143].field560.compareTo(var138[var143 + 1].field560) > 0) {
                                                class21 var144 = var138[var143];
                                                var138[var143] = var138[var143 + 1];
                                                var138[var143 + 1] = var144;
                                                var142 = false;
                                            }
                                        }
                                        if (var142) {
                                            break;
                                        }
                                    }
                                    Statics.field2404 = var138;
                                    field299 = -1;
                                    var1 = true;
                                }
                            }
                            break label2711;
                        }
                        if (field299 == 46) {
                            int var145 = field297.method2145();
                            int var146 = field297.method2102();
                            int var147 = field297.method2175();
                            class4 var148 = (class4) field417.method3163((long) var147);
                            if (var148 != null) {
                                method740(var148, var148.field56 != var145);
                            }
                            method2362(var147, var145, var146);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 233) {
                            Statics.field920 = field297.method2102();
                            Statics.field890 = field297.method2136();
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 218) {
                            int var149 = field297.method2232();
                            if (var149 == 65535) {
                                var149 = -1;
                            }
                            method505(var149);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 225) {
                            int var150 = field297.method2262();
                            int var151 = field297.method2144();
                            if (var151 == 65535) {
                                var151 = -1;
                            }
                            method562(var151, var150);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 2) {
                            for (int var152 = 0; var152 < Statics.field1062; var152++) {
                                class46 var153 = class46.method113(var152);
                                if (var153 != null) {
                                    class154.field2663[var152] = 0;
                                    class154.field2665[var152] = 0;
                                }
                            }
                            Statics.method27();
                            field501 += 32;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 91) {
                            for (int var154 = 0; var154 < field311.length; var154++) {
                                if (field311[var154] != null) {
                                    field311[var154].field760 = -1;
                                }
                            }
                            for (int var155 = 0; var155 < field292.length; var155++) {
                                if (field292[var155] != null) {
                                    field292[var155].field760 = -1;
                                }
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 219) {
                            String var156 = field297.method2119();
                            String var157 = class192.method3354(Statics.method1962(class191.method3071(field297)));
                            class10.method2663(6, var156, var157);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 34) {
                            field395 = 1;
                            field359 = field325;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 242) {
                            int var158 = field297.method2135();
                            String var159 = field297.method2119();
                            int var160 = field297.method2135();
                            if (var158 >= 1 && var158 <= 8) {
                                if (var159.equalsIgnoreCase("null")) {
                                    var159 = null;
                                }
                                field328[var158 - 1] = var159;
                                field326[var158 - 1] = var160 == 0;
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 134) {
                            String var161 = field297.method2119();
                            int var162 = field297.method2232();
                            byte var163 = field297.method2112();
                            boolean var164 = false;
                            if (var163 == -128) {
                                var164 = true;
                            }
                            if (var164) {
                                if (Statics.field172 == 0) {
                                    field299 = -1;
                                    var1 = true;
                                    break label2711;
                                }
                                boolean var165 = false;
                                int var166;
                                for (var166 = 0; var166 < Statics.field172 && (!Statics.field2404[var166].field566.equals(var161) || Statics.field2404[var166].field568 != var162); var166++) {
                                }
                                if (var166 < Statics.field172) {
                                    while (var166 < Statics.field172 - 1) {
                                        Statics.field2404[var166] = Statics.field2404[var166 + 1];
                                        var166++;
                                    }
                                    Statics.field172--;
                                    Statics.field2404[Statics.field172] = null;
                                }
                            } else {
                                field297.method2119();
                                class21 var167 = new class21();
                                var167.field566 = var161;
                                var167.field560 = class200.method2549(var167.field566, Statics.field2960);
                                var167.field568 = var162;
                                var167.field562 = var163;
                                int var168;
                                for (var168 = Statics.field172 - 1; var168 >= 0; var168--) {
                                    int var169 = Statics.field2404[var168].field560.compareTo(var167.field566);
                                    if (var169 == 0) {
                                        Statics.field2404[var168].field568 = var162;
                                        Statics.field2404[var168].field562 = var163;
                                        if (var161.equals(Statics.field555.field43)) {
                                            Statics.field788 = var163;
                                        }
                                        field449 = field325;
                                        field299 = -1;
                                        var1 = true;
                                        break label2711;
                                    }
                                    if (var169 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field172 >= Statics.field2404.length) {
                                    field299 = -1;
                                    var1 = true;
                                    break label2711;
                                }
                                for (int var170 = Statics.field172 - 1; var170 > var168; var170--) {
                                    Statics.field2404[var170 + 1] = Statics.field2404[var170];
                                }
                                if (Statics.field172 == 0) {
                                    Statics.field2404 = new class21[100];
                                }
                                Statics.field2404[var168 + 1] = var167;
                                Statics.field172++;
                                if (var161.equals(Statics.field555.field43)) {
                                    Statics.field788 = var163;
                                }
                            }
                            field449 = field325;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 154) {
                            String var171 = field297.method2119();
                            long var172 = (long) field297.method2232();
                            long var174 = (long) field297.method2262();
                            int var176 = field297.method2111();
                            long var177 = (var172 << 32) + var174;
                            boolean var179 = false;
                            for (int var180 = 0; var180 < 100; var180++) {
                                if (field471[var180] == var177) {
                                    var179 = true;
                                    break;
                                }
                            }
                            if (method3066(var171)) {
                                var179 = true;
                            }
                            if (!var179 && field345 == 0) {
                                field471[field472] = var177;
                                field472 = (field472 + 1) % 100;
                                String var181 = class192.method3354(Statics.method1962(class191.method3071(field297)));
                                if (var176 == 2 || var176 == 3) {
                                    class10.method2663(7, class2.method760(1) + var171, var181);
                                } else if (var176 == 1) {
                                    class10.method2663(7, class2.method760(0) + var171, var181);
                                } else {
                                    class10.method2663(3, var171, var181);
                                }
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 119) {
                            int var182 = field297.method2116();
                            int var183 = field297.method2232();
                            if (var182 < -70000) {
                                var183 += 32768;
                            }
                            class152 var184;
                            if (var182 >= 0) {
                                var184 = Statics.method480(var182);
                            } else {
                                var184 = null;
                            }
                            while (field297.field1863 < field464) {
                                int var185 = field297.method2124();
                                int var186 = field297.method2232();
                                int var187 = 0;
                                if (var186 != 0) {
                                    var187 = field297.method2111();
                                    if (var187 == 255) {
                                        var187 = field297.method2116();
                                    }
                                }
                                if (var184 != null && var185 >= 0 && var185 < var184.field2636.length) {
                                    var184.field2636[var185] = var186;
                                    var184.field2637[var185] = var187;
                                }
                                class14.method26(var183, var185, var186 - 1, var187);
                            }
                            if (var184 != null) {
                                method3127(var184);
                            }
                            Statics.method27();
                            field443[++field510 - 1 & 0x1F] = var183 & 0x7FFF;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 51) {
                            for (int var188 = 0; var188 < class154.field2665.length; var188++) {
                                if (class154.field2665[var188] != class154.field2663[var188]) {
                                    class154.field2665[var188] = class154.field2663[var188];
                                    method502(var188);
                                    field441[++field501 - 1 & 0x1F] = var188;
                                }
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 189) {
                            String var189 = field297.method2119();
                            Object[] var190 = new Object[var189.length() + 1];
                            for (int var191 = var189.length() - 1; var191 >= 0; var191--) {
                                if (var189.charAt(var191) == 's') {
                                    var190[var191 + 1] = field297.method2119();
                                } else {
                                    var190[var191 + 1] = Integer.valueOf(field297.method2116());
                                }
                            }
                            var190[0] = Integer.valueOf(field297.method2116());
                            class1 var192 = new class1();
                            var192.field8 = var190;
                            class32.method1033(var192);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 156) {
                            Statics.method27();
                            field421 = field297.method2111();
                            field319 = field325;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 99) {
                            int var193 = field297.method2232();
                            int var194 = field297.method2111();
                            int var195 = field297.method2232();
                            if (field490 != 0 && var194 != 0 && field497 < 50) {
                                field493[field497] = var193;
                                field494[field497] = var194;
                                field495[field497] = var195;
                                field289[field497] = null;
                                field496[field497] = 0;
                                field497++;
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 202) {
                            Statics.field890 = field297.method2136();
                            Statics.field920 = field297.method2135();
                            for (int var199 = Statics.field890; var199 < Statics.field890 + 8; var199++) {
                                for (int var200 = Statics.field920; var200 < Statics.field920 + 8; var200++) {
                                    if (field302[Statics.field207][var199][var200] != null) {
                                        field302[Statics.field207][var199][var200] = null;
                                        method705(var199, var200);
                                    }
                                }
                            }
                            for (class15 var201 = (class15) field389.method3195(); var201 != null; var201 = (class15) field389.method3212()) {
                                if (var201.field211 >= Statics.field890 && var201.field211 < Statics.field890 + 8 && var201.field224 >= Statics.field920 && var201.field224 < Statics.field920 + 8 && Statics.field207 == var201.field212) {
                                    var201.field220 = 0;
                                }
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 15) {
                            int var202 = field297.method2144();
                            byte var203 = field297.method2171();
                            class154.field2663[var202] = var203;
                            if (class154.field2665[var202] != var203) {
                                class154.field2665[var202] = var203;
                                method502(var202);
                            }
                            field441[++field501 - 1 & 0x1F] = var202;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 82) {
                            int var204 = field297.method2124();
                            boolean var205 = field297.method2111() == 1;
                            String var206 = "";
                            boolean var207 = false;
                            if (var205) {
                                var206 = field297.method2119();
                                if (method3066(var206)) {
                                    var207 = true;
                                }
                            }
                            String var208 = field297.method2119();
                            if (!var207) {
                                class10.method2663(var204, var206, var208);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 80) {
                            method74();
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 178) {
                            field338 = field297.method2111();
                            if (field338 == 1) {
                                field270 = field297.method2232();
                            }
                            if (field338 >= 2 && field338 <= 6) {
                                if (field338 == 2) {
                                    field275 = 64;
                                    field276 = 64;
                                }
                                if (field338 == 3) {
                                    field275 = 0;
                                    field276 = 64;
                                }
                                if (field338 == 4) {
                                    field275 = 128;
                                    field276 = 64;
                                }
                                if (field338 == 5) {
                                    field275 = 64;
                                    field276 = 0;
                                }
                                if (field338 == 6) {
                                    field275 = 64;
                                    field276 = 128;
                                }
                                field338 = 2;
                                field280 = field297.method2232();
                                field273 = field297.method2232();
                                field303 = field297.method2111();
                            }
                            if (field338 == 10) {
                                field271 = field297.method2232();
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 244) {
                            int var209 = field297.method2151();
                            int var210 = field297.method2144();
                            class152 var211 = Statics.method480(var209);
                            if (var211 != null && var211.field2536 == 0) {
                                if (var210 > var211.field2550 - var211.field2544) {
                                    var210 = var211.field2550 - var211.field2544;
                                }
                                if (var210 < 0) {
                                    var210 = 0;
                                }
                                if (var211.field2553 != var210) {
                                    var211.field2553 = var210;
                                    method3127(var211);
                                }
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 96) {
                            method1(true);
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 69) {
                            method4();
                            field299 = -1;
                            var1 = false;
                            break label2711;
                        }
                        if (field299 == 177) {
                            int var212 = field297.method2153();
                            int var213 = field297.method2143();
                            class152 var214 = Statics.method480(var212);
                            if (var214.field2566 != 1 || var214.field2559 != var213) {
                                var214.field2566 = 1;
                                var214.field2559 = var213;
                                method3127(var214);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 105) {
                            int var215 = field297.method2116();
                            int var216 = field297.method2232();
                            if (var215 < -70000) {
                                var216 += 32768;
                            }
                            class152 var217;
                            if (var215 >= 0) {
                                var217 = Statics.method480(var215);
                            } else {
                                var217 = null;
                            }
                            if (var217 != null) {
                                for (int var218 = 0; var218 < var217.field2636.length; var218++) {
                                    var217.field2636[var218] = 0;
                                    var217.field2637[var218] = 0;
                                }
                            }
                            class14.method569(var216);
                            int var219 = field297.method2232();
                            for (int var220 = 0; var220 < var219; var220++) {
                                int var221 = field297.method2102();
                                if (var221 == 255) {
                                    var221 = field297.method2151();
                                }
                                int var222 = field297.method2145();
                                if (var217 != null && var220 < var217.field2636.length) {
                                    var217.field2636[var220] = var222;
                                    var217.field2637[var220] = var221;
                                }
                                class14.method26(var216, var220, var222 - 1, var221);
                            }
                            if (var217 != null) {
                                method3127(var217);
                            }
                            Statics.method27();
                            field443[++field510 - 1 & 0x1F] = var216 & 0x7FFF;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 186) {
                            field437 = field297.method2111();
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 121) {
                            int var223 = field297.method2116();
                            class4 var224 = (class4) field417.method3163((long) var223);
                            if (var224 != null) {
                                method740(var224, true);
                            }
                            if (field420 != null) {
                                method3127(field420);
                                field420 = null;
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 29) {
                            int var225 = field297.method2151();
                            int var226 = field297.method2144();
                            if (var226 == 65535) {
                                var226 = -1;
                            }
                            int var227 = field297.method2175();
                            int var228 = field297.method2143();
                            if (var228 == 65535) {
                                var228 = -1;
                            }
                            for (int var229 = var228; var229 <= var226; var229++) {
                                long var230 = ((long) var225 << 32) + (long) var229;
                                class186 var232 = field298.method3163(var230);
                                if (var232 != null) {
                                    var232.method3275();
                                }
                                field298.method3164(new class179(var227), var230);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 94) {
                            Statics.field603 = Statics.method1871(field297.method2111());
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 115) {
                            while (field297.field1863 < field464) {
                                int var233 = field297.method2111();
                                boolean var234 = (var233 & 0x1) == 1;
                                String var235 = field297.method2119();
                                String var236 = field297.method2119();
                                field297.method2119();
                                for (int var237 = 0; var237 < field508; var237++) {
                                    class8 var238 = field509[var237];
                                    if (var234) {
                                        if (var236.equals(var238.field131)) {
                                            var238.field131 = var235;
                                            var238.field125 = var236;
                                            var235 = null;
                                            break;
                                        }
                                    } else if (var235.equals(var238.field131)) {
                                        var238.field131 = var235;
                                        var238.field125 = var236;
                                        var235 = null;
                                        break;
                                    }
                                }
                                if (var235 != null && field508 < 400) {
                                    class8 var239 = new class8();
                                    field509[field508] = var239;
                                    var239.field131 = var235;
                                    var239.field125 = var236;
                                    field508++;
                                }
                            }
                            field359 = field325;
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        if (field299 == 180) {
                            if (field416 != -1) {
                                method607(field416, 0);
                            }
                            field299 = -1;
                            var1 = true;
                            break label2711;
                        }
                        class135.method1963("" + field299 + class2.field17 + field400 + class2.field17 + field305 + class2.field17 + field464, (Throwable) null);
                        method4();
                    } catch (IOException var387) {
                        method1970();
                    } catch (Exception var388) {
                        String var242 = "" + field299 + class2.field17 + field400 + class2.field17 + field305 + class2.field17 + field464 + class2.field17 + (Statics.field1492 + Statics.field555.field783[0]) + class2.field17 + (Statics.field1454 + Statics.field555.field784[0]) + class2.field17;
                        for (int var243 = 0; var243 < field464 && var243 < 50; var243++) {
                            var242 = var242 + field297.field1865[var243] + class2.field17;
                        }
                        class135.method1963(var242, var388);
                        method4();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field259 != 30) {
            return;
        }
        while (class189.method522()) {
            field382.method2356(104);
            field382.method2097(0);
            int var244 = field382.field1863;
            class189.method2063(field382);
            field382.method2108(field382.field1863 - var244);
        }
        Object var245 = Statics.field1884.field188;
        synchronized (Statics.field1884.field188) {
            if (!field252) {
                Statics.field1884.field180 = 0;
            } else if (class127.field2017 != 0 || Statics.field1884.field180 >= 40) {
                field382.method2356(251);
                field382.method2097(0);
                int var246 = field382.field1863;
                int var247 = 0;
                for (int var248 = 0; var248 < Statics.field1884.field180 && field382.field1863 - var246 < 240; var248++) {
                    var247++;
                    int var249 = Statics.field1884.field183[var248];
                    if (var249 < 0) {
                        var249 = 0;
                    } else if (var249 > 502) {
                        var249 = 502;
                    }
                    int var250 = Statics.field1884.field181[var248];
                    if (var250 < 0) {
                        var250 = 0;
                    } else if (var250 > 764) {
                        var250 = 764;
                    }
                    int var251 = var249 * 765 + var250;
                    if (Statics.field1884.field183[var248] == -1 && Statics.field1884.field181[var248] == -1) {
                        var250 = -1;
                        var249 = -1;
                        var251 = 524287;
                    }
                    if (field263 != var250 || field504 != var249) {
                        int var252 = var250 - field263;
                        field263 = var250;
                        int var253 = var249 - field504;
                        field504 = var249;
                        if (field320 < 8 && var252 >= -32 && var252 <= 31 && var253 >= -32 && var253 <= 31) {
                            var252 += 32;
                            var253 += 32;
                            field382.method2098((field320 << 12) + (var252 << 6) + var253);
                            field320 = 0;
                        } else if (field320 < 8) {
                            field382.method2182((field320 << 19) + 8388608 + var251);
                            field320 = 0;
                        } else {
                            field382.method2100((field320 << 19) + -1073741824 + var251);
                            field320 = 0;
                        }
                    } else if (field320 < 2047) {
                        field320++;
                    }
                }
                field382.method2108(field382.field1863 - var246);
                if (var247 >= Statics.field1884.field180) {
                    Statics.field1884.field180 = 0;
                } else {
                    Statics.field1884.field180 -= var247;
                    for (int var254 = 0; var254 < Statics.field1884.field180; var254++) {
                        Statics.field1884.field181[var254] = Statics.field1884.field181[var247 + var254];
                        Statics.field1884.field183[var254] = Statics.field1884.field183[var247 + var254];
                    }
                }
            }
        }
        if (class127.field2017 == 1 || !Statics.field1294 && class127.field2017 == 4 || class127.field2017 == 2) {
            long var256 = (class127.field2020 - field486 * -1L) / 50L;
            if (var256 > 4095L) {
                var256 = 4095L;
            }
            field486 = class127.field2020 * -1L;
            int var258 = class127.field2019;
            if (var258 < 0) {
                var258 = 0;
            } else if (var258 > 502) {
                var258 = 502;
            }
            int var259 = class127.field2014;
            if (var259 < 0) {
                var259 = 0;
            } else if (var259 > 764) {
                var259 = 764;
            }
            int var260 = var258 * 765 + var259;
            byte var261 = 0;
            if (class127.field2017 == 2) {
                var261 = 1;
            }
            int var262 = (int) var256;
            field382.method2356(70);
            field382.method2100((var261 << 19) + (var262 << 20) + var260);
        }
        if (class124.field1983 > 0) {
            field382.method2356(244);
            field382.method2098(0);
            int var263 = field382.field1863;
            long var264 = class103.method470();
            for (int var266 = 0; var266 < class124.field1983; var266++) {
                long var267 = var264 - field476;
                if (var267 > 16777215L) {
                    var267 = 16777215L;
                }
                field476 = var264;
                field382.method2134(class124.field1982[var266]);
                field382.method2147((int) var267);
            }
            field382.method2233(field382.field1863 - var263);
        }
        if (field343 > 0) {
            field343--;
        }
        if (class124.field1976[96] || class124.field1976[97] || class124.field1976[98] || class124.field1976[99]) {
            field344 = true;
        }
        if (field344 && field343 <= 0) {
            field343 = 20;
            field344 = false;
            field382.method2356(12);
            field382.method2098(field511);
            field382.method2236(field337);
        }
        if (Statics.field626 && !field266) {
            field266 = true;
            field382.method2356(69);
            field382.method2097(1);
        }
        if (!Statics.field626 && field266) {
            field266 = false;
            field382.method2356(69);
            field382.method2097(0);
        }
        method86();
        if (field259 != 30) {
            return;
        }
        for (class15 var269 = (class15) field389.method3195(); var269 != null; var269 = (class15) field389.method3212()) {
            if (var269.field220 > 0) {
                var269.field220--;
            }
            if (var269.field220 == 0) {
                if (var269.field221 >= 0) {
                    int var270 = var269.field221;
                    int var271 = var269.field223;
                    class36 var272 = class36.method147(var270);
                    if (var271 == 11) {
                        var271 = 10;
                    }
                    if (var271 >= 5 && var271 <= 8) {
                        var271 = 4;
                    }
                    boolean var273 = var272.method630(var271);
                    if (!var273) {
                        continue;
                    }
                }
                method148(var269.field212, var269.field210, var269.field211, var269.field224, var269.field221, var269.field214, var269.field223);
                var269.method3275();
            } else {
                if (var269.field219 > 0) {
                    var269.field219--;
                }
                if (var269.field219 == 0 && var269.field211 >= 1 && var269.field224 >= 1 && var269.field211 <= 102 && var269.field224 <= 102) {
                    if (var269.field226 >= 0) {
                        int var274 = var269.field226;
                        int var275 = var269.field218;
                        class36 var276 = class36.method147(var274);
                        if (var275 == 11) {
                            var275 = 10;
                        }
                        if (var275 >= 5 && var275 <= 8) {
                            var275 = 4;
                        }
                        boolean var277 = var276.method630(var275);
                        if (!var277) {
                            continue;
                        }
                    }
                    method148(var269.field212, var269.field210, var269.field211, var269.field224, var269.field226, var269.field217, var269.field218);
                    var269.field219 = -1;
                    if (var269.field226 == var269.field221 && var269.field221 == -1) {
                        var269.method3275();
                    } else if (var269.field226 == var269.field221 && var269.field217 == var269.field214 && var269.field223 == var269.field218) {
                        var269.method3275();
                    }
                }
            }
        }
        method452();
        field300++;
        if (field300 > 750) {
            method1970();
            return;
        }
        Statics.method2();
        method1868();
        for (int var278 = -1; var278 < field374; var278++) {
            int var279;
            if (var278 == -1) {
                var279 = 2047;
            } else {
                var279 = field317[var278];
            }
            class3 var280 = field311[var279];
            if (var280 != null && var280.field731 > 0) {
                var280.field731--;
                if (var280.field731 == 0) {
                    var280.field743 = null;
                }
            }
        }
        for (int var281 = 0; var281 < field293; var281++) {
            int var282 = field294[var281];
            class30 var283 = field292[var282];
            if (var283 != null && var283.field731 > 0) {
                var283.field731--;
                if (var283.field731 == 0) {
                    var283.field743 = null;
                }
            }
        }
        field330++;
        if (field445 != 0) {
            field363 += 20;
            if (field363 >= 400) {
                field445 = 0;
            }
        }
        if (Statics.field158 != null) {
            field403++;
            if (field403 >= 15) {
                method3127(Statics.field158);
                Statics.field158 = null;
            }
        }
        class152 var284 = Statics.field1676;
        class152 var285 = Statics.field1273;
        Statics.field1676 = null;
        Statics.field1273 = null;
        field432 = null;
        field436 = false;
        field482 = false;
        field473 = 0;
        while (class124.method438() && field473 < 128) {
            if (field423 >= 2 && class124.field1976[82] && Statics.field578 == 66) {
                String var286 = "";
                Iterator var287 = class10.field152.iterator();
                while (var287.hasNext()) {
                    class31 var288 = (class31) var287.next();
                    var286 = var286 + var288.field703 + ':' + var288.field706 + '\n';
                }
                Statics.field141.setContents(new StringSelection(var286), (ClipboardOwner) null);
            } else {
                field475[field473] = Statics.field578;
                field484[field473] = Statics.field1536;
                field473++;
            }
        }
        int var291 = field416;
        if (class152.method565(var291)) {
            method2660(Statics.field2634[var291], -1, 0, 0, 765, 503, 0, 0);
        }
        field325++;
        while (true) {
            class1 var292;
            class152 var293;
            class152 var294;
            do {
                var292 = (class1) field455.method3211();
                if (var292 == null) {
                    while (true) {
                        class1 var295;
                        class152 var296;
                        class152 var297;
                        do {
                            var295 = (class1) field422.method3211();
                            if (var295 == null) {
                                while (true) {
                                    class1 var298;
                                    class152 var299;
                                    class152 var300;
                                    do {
                                        var298 = (class1) field454.method3211();
                                        if (var298 == null) {
                                            Statics.method25();
                                            if (Statics.field1032 == null && field428 == null) {
                                                int var301 = class127.field2017;
                                                if (field396) {
                                                    if (var301 != 1 && (Statics.field1294 || var301 != 4)) {
                                                        int var302 = class127.field2011;
                                                        int var303 = class127.field2008 * -391950985;
                                                        if (var302 < Statics.field1008 - 10 || var302 > Statics.field397 + Statics.field1008 + 10 || var303 < Statics.field1663 - 10 || var303 > Statics.field1663 + Statics.field1533 + 10) {
                                                            field396 = false;
                                                            method11(Statics.field1008, Statics.field1663, Statics.field397, Statics.field1533);
                                                        }
                                                    }
                                                    if (var301 == 1 || !Statics.field1294 && var301 == 4) {
                                                        int var304 = Statics.field1008;
                                                        int var305 = Statics.field1663;
                                                        int var306 = Statics.field397;
                                                        int var307 = class127.field2014;
                                                        int var308 = class127.field2019;
                                                        int var309 = -1;
                                                        for (int var310 = 0; var310 < field398; var310++) {
                                                            int var311 = (field398 - 1 - var310) * 15 + var305 + 31;
                                                            if (var307 > var304 && var307 < var304 + var306 && var308 > var311 - 13 && var308 < var311 + 3) {
                                                                var309 = var310;
                                                            }
                                                        }
                                                        if (var309 != -1) {
                                                            method1971(var309);
                                                        }
                                                        field396 = false;
                                                        method11(Statics.field1008, Statics.field1663, Statics.field397, Statics.field1533);
                                                    }
                                                } else {
                                                    label2926: {
                                                        if ((var301 == 1 || !Statics.field1294 && var301 == 4) && field398 > 0) {
                                                            int var312 = field401[field398 - 1];
                                                            if (var312 == 39 || var312 == 40 || var312 == 41 || var312 == 42 || var312 == 43 || var312 == 33 || var312 == 34 || var312 == 35 || var312 == 36 || var312 == 37 || var312 == 38 || var312 == 1005) {
                                                                label2897: {
                                                                    int var313 = field384[field398 - 1];
                                                                    int var314 = field492[field398 - 1];
                                                                    class152 var315 = Statics.method480(var314);
                                                                    int var316 = method2818(var315);
                                                                    boolean var317 = (var316 >> 28 & 0x1) != 0;
                                                                    if (!var317) {
                                                                        class156 var389 = (class156) null;
                                                                        if (!class156.method2374(method2818(var315))) {
                                                                            break label2897;
                                                                        }
                                                                    }
                                                                    if (Statics.field1032 != null && !field370 && field466 != 1 && !method144(field398 - 1) && field398 > 0) {
                                                                        int var318 = field505;
                                                                        int var319 = field306;
                                                                        method1604(Statics.field695, var318, var319);
                                                                        Statics.field695 = null;
                                                                    }
                                                                    field370 = false;
                                                                    field365 = 0;
                                                                    if (Statics.field1032 != null) {
                                                                        method3127(Statics.field1032);
                                                                    }
                                                                    Statics.field1032 = Statics.method480(var314);
                                                                    field366 = var313;
                                                                    field505 = class127.field2014;
                                                                    field306 = class127.field2019;
                                                                    if (field398 > 0) {
                                                                        int var320 = field398 - 1;
                                                                        Statics.field695 = new class27();
                                                                        Statics.field695.field630 = field384[var320];
                                                                        Statics.field695.field629 = field492[var320];
                                                                        Statics.field695.field639 = field401[var320];
                                                                        Statics.field695.field631 = field402[var320];
                                                                        Statics.field695.field633 = field498[var320];
                                                                    }
                                                                    method3127(Statics.field1032);
                                                                    break label2926;
                                                                }
                                                            }
                                                        }
                                                        if ((var301 == 1 || !Statics.field1294 && var301 == 4) && (field466 == 1 && field398 > 2 || method144(field398 - 1))) {
                                                            var301 = 2;
                                                        }
                                                        if ((var301 == 1 || !Statics.field1294 && var301 == 4) && field398 > 0) {
                                                            method1971(field398 - 1);
                                                        }
                                                        if (var301 == 2 && field398 > 0) {
                                                            Statics.method1959(class127.field2014, class127.field2019);
                                                        }
                                                    }
                                                }
                                            }
                                            if (field428 != null) {
                                                method3127(field428);
                                                Statics.field2516++;
                                                if (field436 && field482) {
                                                    int var321 = class127.field2011;
                                                    int var322 = class127.field2008 * -391950985;
                                                    int var323 = var321 - field430;
                                                    int var324 = var322 - field368;
                                                    if (var323 < field308) {
                                                        var323 = field308;
                                                    }
                                                    if (field428.field2543 + var323 > field308 + field444.field2543) {
                                                        var323 = field308 + field444.field2543 - field428.field2543;
                                                    }
                                                    if (var324 < field435) {
                                                        var324 = field435;
                                                    }
                                                    if (field428.field2544 + var324 > field435 + field444.field2544) {
                                                        var324 = field435 + field444.field2544 - field428.field2544;
                                                    }
                                                    int var325 = var323 - field364;
                                                    int var326 = var324 - field438;
                                                    int var327 = field428.field2575;
                                                    if (Statics.field2516 > field428.field2538 && (var325 > var327 || var325 < -var327 || var326 > var327 || var326 < -var327)) {
                                                        field322 = true;
                                                    }
                                                    int var328 = field444.field2547 + (var323 - field308);
                                                    int var329 = field444.field2553 + (var324 - field435);
                                                    if (field428.field2610 != null && field322) {
                                                        class1 var330 = new class1();
                                                        var330.field3 = field428;
                                                        var330.field6 = var328;
                                                        var330.field5 = var329;
                                                        var330.field8 = field428.field2610;
                                                        class32.method1033(var330);
                                                    }
                                                    if (class127.field2018 == 0) {
                                                        if (field322) {
                                                            if (field428.field2611 != null) {
                                                                class1 var331 = new class1();
                                                                var331.field3 = field428;
                                                                var331.field6 = var328;
                                                                var331.field5 = var329;
                                                                var331.field7 = field432;
                                                                var331.field8 = field428.field2611;
                                                                class32.method1033(var331);
                                                            }
                                                            if (field432 != null) {
                                                                class152 var332 = field428;
                                                                int var333 = method2818(var332);
                                                                int var334 = var333 >> 17 & 0x7;
                                                                int var335 = var334;
                                                                class152 var336;
                                                                if (var334 == 0) {
                                                                    var336 = null;
                                                                } else {
                                                                    int var337 = 0;
                                                                    while (true) {
                                                                        if (var337 >= var335) {
                                                                            var336 = var332;
                                                                            break;
                                                                        }
                                                                        var332 = Statics.method480(var332.field2545);
                                                                        if (var332 == null) {
                                                                            var336 = null;
                                                                            break;
                                                                        }
                                                                        var337++;
                                                                    }
                                                                }
                                                                if (var336 != null) {
                                                                    field382.method2356(37);
                                                                    field382.method2100(field428.field2549);
                                                                    field382.method2220(field432.field2638);
                                                                    field382.method2098(field432.field2535);
                                                                    field382.method2220(field428.field2638);
                                                                    field382.method2152(field432.field2549);
                                                                    field382.method2187(field428.field2535);
                                                                }
                                                            }
                                                        } else if ((field466 == 1 || method144(field398 - 1)) && field398 > 2) {
                                                            Statics.method1959(field430 + field364, field438 + field368);
                                                        } else if (field398 > 0) {
                                                            int var338 = field430 + field364;
                                                            int var339 = field438 + field368;
                                                            method1604(Statics.field695, var338, var339);
                                                            Statics.field695 = null;
                                                        }
                                                        field428 = null;
                                                    }
                                                } else if (Statics.field2516 > 1) {
                                                    field428 = null;
                                                }
                                            }
                                            if (Statics.field1032 != null) {
                                                method3127(Statics.field1032);
                                                field365++;
                                                if (class127.field2018 == 0) {
                                                    if (field370) {
                                                        if (Statics.field2722 == Statics.field1032 && field474 != field366) {
                                                            class152 var340 = Statics.field1032;
                                                            byte var341 = 0;
                                                            if (field419 == 1 && var340.field2585 == 206) {
                                                                var341 = 1;
                                                            }
                                                            if (var340.field2636[field474] <= 0) {
                                                                var341 = 0;
                                                            }
                                                            if (class156.method2374(method2818(var340))) {
                                                                int var342 = field366;
                                                                int var343 = field474;
                                                                var340.field2636[var343] = var340.field2636[var342];
                                                                var340.field2637[var343] = var340.field2637[var342];
                                                                var340.field2636[var342] = -1;
                                                                var340.field2637[var342] = 0;
                                                            } else if (var341 == 1) {
                                                                int var344 = field366;
                                                                int var345 = field474;
                                                                while (var344 != var345) {
                                                                    if (var344 > var345) {
                                                                        var340.method2827(var344 - 1, var344);
                                                                        var344--;
                                                                    } else if (var344 < var345) {
                                                                        var340.method2827(var344 + 1, var344);
                                                                        var344++;
                                                                    }
                                                                }
                                                            } else {
                                                                var340.method2827(field474, field366);
                                                            }
                                                            field382.method2356(218);
                                                            field382.method2132(var341);
                                                            field382.method2098(field474);
                                                            field382.method2152(Statics.field1032.field2549);
                                                            field382.method2187(field366);
                                                        }
                                                    } else if ((field466 == 1 || method144(field398 - 1)) && field398 > 2) {
                                                        Statics.method1959(field505, field306);
                                                    } else if (field398 > 0) {
                                                        int var346 = field505;
                                                        int var347 = field306;
                                                        method1604(Statics.field695, var346, var347);
                                                        Statics.field695 = null;
                                                    }
                                                    field403 = 10;
                                                    class127.field2017 = 0;
                                                    Statics.field1032 = null;
                                                } else if (field365 >= 5 && (class127.field2011 > field505 + 5 || class127.field2011 < field505 - 5 || class127.field2008 * -391950985 > field306 + 5 || class127.field2008 * -391950985 < field306 - 5)) {
                                                    field370 = true;
                                                }
                                            }
                                            if (class79.field1404 != -1) {
                                                int var348 = class79.field1404;
                                                int var349 = class79.field1393;
                                                field382.method2356(252);
                                                field382.method2097(5);
                                                field382.method2187(Statics.field1492 + var348);
                                                field382.method2098(Statics.field1454 + var349);
                                                field382.method2134(class124.field1976[82] ? (class124.field1976[81] ? 2 : 1) : 0);
                                                class79.field1404 = -1;
                                                field360 = class127.field2014;
                                                field361 = class127.field2019;
                                                field445 = 1;
                                                field363 = 0;
                                                field392 = var348;
                                                field485 = var349;
                                            }
                                            if (Statics.field1676 != var284) {
                                                if (var284 != null) {
                                                    method3127(var284);
                                                }
                                                if (Statics.field1676 != null) {
                                                    method3127(Statics.field1676);
                                                }
                                            }
                                            if (Statics.field1273 != var285 && field408 == field407) {
                                                if (var285 != null) {
                                                    method3127(var285);
                                                }
                                                if (Statics.field1273 != null) {
                                                    method3127(Statics.field1273);
                                                }
                                            }
                                            if (Statics.field1273 == null) {
                                                if (field407 > 0) {
                                                    field407--;
                                                }
                                            } else if (field407 < field408) {
                                                field407++;
                                                if (field408 == field407) {
                                                    method3127(Statics.field1273);
                                                }
                                            }
                                            int var350 = field318 + Statics.field555.field730;
                                            int var351 = field415 + Statics.field555.field780;
                                            if (Statics.field693 - var350 < -500 || Statics.field693 - var350 > 500 || Statics.field692 - var351 < -500 || Statics.field692 - var351 > 500) {
                                                Statics.field693 = var350;
                                                Statics.field692 = var351;
                                            }
                                            if (Statics.field693 != var350) {
                                                Statics.field693 += (var350 - Statics.field693) / 16;
                                            }
                                            if (Statics.field692 != var351) {
                                                Statics.field692 += (var351 - Statics.field692) / 16;
                                            }
                                            if (class127.field2018 == 4 && Statics.field1294) {
                                                int var352 = class127.field2008 * -391950985 - field342;
                                                field340 = var352 * 2;
                                                field342 = var352 == -1 || var352 == 1 ? class127.field2008 * -391950985 : (field342 + class127.field2008 * -391950985) / 2;
                                                int var353 = field341 - class127.field2011;
                                                field339 = var353 * 2;
                                                field341 = var353 == -1 || var353 == 1 ? class127.field2011 : (field341 + class127.field2011) / 2;
                                            } else {
                                                if (class124.field1976[96]) {
                                                    field339 += (-24 - field339) / 2;
                                                } else if (class124.field1976[97]) {
                                                    field339 += (24 - field339) / 2;
                                                } else {
                                                    field339 /= 2;
                                                }
                                                if (class124.field1976[98]) {
                                                    field340 += (12 - field340) / 2;
                                                } else if (class124.field1976[99]) {
                                                    field340 += (-12 - field340) / 2;
                                                } else {
                                                    field340 /= 2;
                                                }
                                                field342 = class127.field2008 * -391950985;
                                                field341 = class127.field2011;
                                            }
                                            field511 = field339 / 2 + field511 & 0x7FF;
                                            field337 += field340 / 2;
                                            if (field337 < 128) {
                                                field337 = 128;
                                            }
                                            if (field337 > 383) {
                                                field337 = 383;
                                            }
                                            int var354 = Statics.field693 >> 7;
                                            int var355 = Statics.field692 >> 7;
                                            int var356 = method28(Statics.field693, Statics.field692, Statics.field207);
                                            int var357 = 0;
                                            if (var354 > 3 && var355 > 3 && var354 < 100 && var355 < 100) {
                                                for (int var358 = var354 - 4; var358 <= var354 + 4; var358++) {
                                                    for (int var359 = var355 - 4; var359 <= var355 + 4; var359++) {
                                                        int var360 = Statics.field207;
                                                        if (var360 < 3 && (class6.field80[1][var358][var359] & 0x2) == 2) {
                                                            var360++;
                                                        }
                                                        int var361 = var356 - class6.field78[var360][var358][var359];
                                                        if (var361 > var357) {
                                                            var357 = var361;
                                                        }
                                                    }
                                                }
                                            }
                                            int var362 = var357 * 192;
                                            if (var362 > 98048) {
                                                var362 = 98048;
                                            }
                                            if (var362 < 32768) {
                                                var362 = 32768;
                                            }
                                            if (var362 > field446) {
                                                field446 += (var362 - field446) / 24;
                                            } else if (var362 < field446) {
                                                field446 += (var362 - field446) / 80;
                                            }
                                            if (field371) {
                                                int var363 = Statics.field185 * 128 + 64;
                                                int var364 = Statics.field249 * 128 + 64;
                                                int var365 = method28(var363, var364, Statics.field207) - Statics.field987;
                                                if (Statics.field514 < var363) {
                                                    Statics.field514 += Statics.field11 * (var363 - Statics.field514) / 1000 + Statics.field57;
                                                    if (Statics.field514 > var363) {
                                                        Statics.field514 = var363;
                                                    }
                                                }
                                                if (Statics.field514 > var363) {
                                                    Statics.field514 -= Statics.field11 * (Statics.field514 - var363) / 1000 + Statics.field57;
                                                    if (Statics.field514 < var363) {
                                                        Statics.field514 = var363;
                                                    }
                                                }
                                                if (Statics.field2107 < var365) {
                                                    Statics.field2107 += Statics.field11 * (var365 - Statics.field2107) / 1000 + Statics.field57;
                                                    if (Statics.field2107 > var365) {
                                                        Statics.field2107 = var365;
                                                    }
                                                }
                                                if (Statics.field2107 > var365) {
                                                    Statics.field2107 -= Statics.field11 * (Statics.field2107 - var365) / 1000 + Statics.field57;
                                                    if (Statics.field2107 < var365) {
                                                        Statics.field2107 = var365;
                                                    }
                                                }
                                                if (Statics.field649 < var364) {
                                                    Statics.field649 += Statics.field11 * (var364 - Statics.field649) / 1000 + Statics.field57;
                                                    if (Statics.field649 > var364) {
                                                        Statics.field649 = var364;
                                                    }
                                                }
                                                if (Statics.field649 > var364) {
                                                    Statics.field649 -= Statics.field11 * (Statics.field649 - var364) / 1000 + Statics.field57;
                                                    if (Statics.field649 < var364) {
                                                        Statics.field649 = var364;
                                                    }
                                                }
                                                int var366 = Statics.field887 * 128 + 64;
                                                int var367 = Statics.field522 * 128 + 64;
                                                int var368 = method28(var366, var367, Statics.field207) - Statics.field2397;
                                                int var369 = var366 - Statics.field514;
                                                int var370 = var368 - Statics.field2107;
                                                int var371 = var367 - Statics.field649;
                                                int var372 = (int) Math.sqrt((double) (var369 * var369 + var371 * var371));
                                                int var373 = (int) (Math.atan2((double) var370, (double) var372) * 325.949D) & 0x7FF;
                                                int var374 = (int) (Math.atan2((double) var369, (double) var371) * -325.949D) & 0x7FF;
                                                if (var373 < 128) {
                                                    var373 = 128;
                                                }
                                                if (var373 > 383) {
                                                    var373 = 383;
                                                }
                                                if (Statics.field1288 < var373) {
                                                    Statics.field1288 += Statics.field2078 * (var373 - Statics.field1288) / 1000 + Statics.field2147;
                                                    if (Statics.field1288 > var373) {
                                                        Statics.field1288 = var373;
                                                    }
                                                }
                                                if (Statics.field1288 > var373) {
                                                    Statics.field1288 -= Statics.field2078 * (Statics.field1288 - var373) / 1000 + Statics.field2147;
                                                    if (Statics.field1288 < var373) {
                                                        Statics.field1288 = var373;
                                                    }
                                                }
                                                int var375 = var374 - Statics.field2945;
                                                if (var375 > 1024) {
                                                    var375 -= 2048;
                                                }
                                                if (var375 < -1024) {
                                                    var375 += 2048;
                                                }
                                                if (var375 > 0) {
                                                    Statics.field2945 += Statics.field2078 * var375 / 1000 + Statics.field2147;
                                                    Statics.field2945 &= 0x7FF;
                                                }
                                                if (var375 < 0) {
                                                    Statics.field2945 -= Statics.field2078 * -var375 / 1000 + Statics.field2147;
                                                    Statics.field2945 &= 0x7FF;
                                                }
                                                int var376 = var374 - Statics.field2945;
                                                if (var376 > 1024) {
                                                    var376 -= 2048;
                                                }
                                                if (var376 < -1024) {
                                                    var376 += 2048;
                                                }
                                                if (var376 < 0 && var375 > 0 || var376 > 0 && var375 < 0) {
                                                    Statics.field2945 = var374;
                                                }
                                            }
                                            for (int var377 = 0; var377 < 5; var377++) {
                                                int var10002 = field269[var377]++;
                                            }
                                            int var378 = ++class127.field2005 - 1;
                                            int var380 = class124.method2550();
                                            if (var378 > 15000 && var380 > 15000) {
                                                field254 = 250;
                                                class127.field2005 = 14500;
                                                field382.method2356(155);
                                            }
                                            field457++;
                                            if (field457 > 500) {
                                                field457 = 0;
                                                int var381 = (int) (Math.random() * 8.0D);
                                                if ((var381 & 0x1) == 1) {
                                                    field318 += field274;
                                                }
                                                if ((var381 & 0x2) == 2) {
                                                    field415 += field321;
                                                }
                                                if ((var381 & 0x4) == 4) {
                                                    field431 += field323;
                                                }
                                            }
                                            if (field318 < -50) {
                                                field274 = 2;
                                            }
                                            if (field318 > 50) {
                                                field274 = -2;
                                            }
                                            if (field415 < -55) {
                                                field321 = 2;
                                            }
                                            if (field415 > 55) {
                                                field321 = -2;
                                            }
                                            if (field431 < -40) {
                                                field323 = 1;
                                            }
                                            if (field431 > 40) {
                                                field323 = -1;
                                            }
                                            field329++;
                                            if (field329 > 500) {
                                                field329 = 0;
                                                int var382 = (int) (Math.random() * 8.0D);
                                                if ((var382 & 0x1) == 1) {
                                                    field463 += field450;
                                                }
                                                if ((var382 & 0x2) == 2) {
                                                    field327 += field304;
                                                }
                                            }
                                            if (field463 < -60) {
                                                field450 = 2;
                                            }
                                            if (field463 > 60) {
                                                field450 = -2;
                                            }
                                            if (field327 < -20) {
                                                field304 = 1;
                                            }
                                            if (field327 > 10) {
                                                field304 = -1;
                                            }
                                            for (class34 var383 = (class34) field507.method3161(); var383 != null; var383 = (class34) field507.method3156()) {
                                                if ((long) var383.field793 < class103.method470() / 1000L - 5L) {
                                                    if (var383.field791 > 0) {
                                                        class10.method2663(5, "", var383.field794 + class142.field2382);
                                                    }
                                                    if (var383.field791 == 0) {
                                                        class10.method2663(5, "", var383.field794 + class142.field2296);
                                                    }
                                                    var383.method3273();
                                                }
                                            }
                                            field301++;
                                            if (field301 > 50) {
                                                field382.method2356(62);
                                            }
                                            try {
                                                if (Statics.field1451 != null && field382.field1863 > 0) {
                                                    Statics.field1451.method2556(field382.field1865, 0, field382.field1863);
                                                    field382.field1863 = 0;
                                                    field301 = 0;
                                                }
                                            } catch (IOException var385) {
                                                method1970();
                                            }
                                            return;
                                        }
                                        var299 = var298.field3;
                                        if (var299.field2535 < 0) {
                                            break;
                                        }
                                        var300 = Statics.method480(var299.field2545);
                                    } while (var300 == null || var300.field2604 == null || var299.field2535 >= var300.field2604.length || var300.field2604[var299.field2535] != var299);
                                    class32.method1033(var298);
                                }
                            }
                            var296 = var295.field3;
                            if (var296.field2535 < 0) {
                                break;
                            }
                            var297 = Statics.method480(var296.field2545);
                        } while (var297 == null || var297.field2604 == null || var296.field2535 >= var297.field2604.length || var297.field2604[var296.field2535] != var296);
                        class32.method1033(var295);
                    }
                }
                var293 = var292.field3;
                if (var293.field2535 < 0) {
                    break;
                }
                var294 = Statics.method480(var293.field2545);
            } while (var294 == null || var294.field2604 == null || var293.field2535 >= var294.field2604.length || var294.field2604[var293.field2535] != var293);
            class32.method1033(var292);
        }
    }

    @ObfuscatedName("x.q(I)V")
    public static final void method111() {
        if (Statics.field1504 != null) {
            Statics.field1504.method1006();
        }
        if (Statics.field609 != null) {
            Statics.field609.method1006();
        }
    }

    @ObfuscatedName("i.z(B)V")
    public static final void method452() {
        for (int var0 = 0; var0 < field497; var0++) {
            int var10002 = field495[var0]--;
            if (field495[var0] >= -10) {
                class52 var2 = field289[var0];
                if (var2 == null) {
                    class52 var10000 = (class52) null;
                    var2 = class52.method1053(Statics.field1900, field493[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field495[var0] += var2.method1061();
                    field289[var0] = var2;
                }
                if (field495[var0] < 0) {
                    int var9;
                    if (field496[var0] == 0) {
                        var9 = field490;
                    } else {
                        int var3 = (field496[var0] & 0xFF) * 128;
                        int var4 = field496[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field555.field730;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field496[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field555.field780;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field495[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field491 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method1051().method1089(Statics.field1925);
                        class58 var11 = class58.method1110(var10, 100, var9);
                        var11.method1113(field494[var0] - 1);
                        Statics.field2370.method967(var11);
                    }
                    field495[var0] = -100;
                }
            } else {
                field497--;
                for (int var1 = var0; var1 < field497; var1++) {
                    field493[var1] = field493[var1 + 1];
                    field289[var1] = field289[var1 + 1];
                    field494[var1] = field494[var1 + 1];
                    field495[var1] = field495[var1 + 1];
                    field496[var1] = field496[var1 + 1];
                }
                var0--;
            }
        }
        if (!field489) {
            return;
        }
        boolean var12;
        if (class161.field2713 == 0) {
            var12 = Statics.field203.method3010();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field405 != 0 && field267 != -1) {
                class161.method839(Statics.field2112, field267, 0, field405, false);
            }
            field489 = false;
        }
    }

    @ObfuscatedName("aw.aa(Lap;IIII)V")
    public static void method568(class38 arg0, int arg1, int arg2, int arg3) {
        if (field497 >= 50 || field491 == 0 || arg0.field908 == null || arg1 >= arg0.field908.length) {
            return;
        }
        int var4 = arg0.field908[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field493[field497] = var5;
        field494[field497] = var6;
        field495[field497] = 0;
        field289[field497] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field496[field497] = (var8 << 16) + (var9 << 8) + var7;
        field497++;
    }

    @ObfuscatedName("f.ak(IB)V")
    public static void method505(int arg0) {
        if (arg0 == -1 && !field489) {
            Statics.method413();
        } else if (arg0 != -1 && field267 != arg0 && field405 != 0 && !field489) {
            class161.method2805(2, Statics.field2112, arg0, 0, field405, false);
        }
        field267 = arg0;
    }

    @ObfuscatedName("al.al(IIS)V")
    public static void method562(int arg0, int arg1) {
        if (field405 != 0 && arg0 != -1) {
            class161.method839(Statics.field286, arg0, 0, field405, false);
            field489 = true;
        }
    }

    @ObfuscatedName("p.aw(I)V")
    public static final void method86() {
        if (field394 && Statics.field207 != field367) {
            method1852(Statics.field618, Statics.field439, Statics.field207, Statics.field555.field783[0], Statics.field555.field784[0]);
        } else if (Statics.field207 != field479) {
            field479 = Statics.field207;
            method1870(Statics.field207);
        }
    }

    @ObfuscatedName("ck.av(I)V")
    public static final void method1868() {
        for (int var0 = 0; var0 < field293; var0++) {
            int var1 = field294[var0];
            class30 var2 = field292[var1];
            if (var2 != null) {
                method520(var2, var2.field698.field823);
            }
        }
    }

    @ObfuscatedName("aa.an(Lan;II)V")
    public static final void method520(class33 arg0, int arg1) {
        if (arg0.field742 > field261) {
            method3125(arg0);
        } else if (arg0.field775 >= field261) {
            if (field261 == arg0.field775 || arg0.field760 == -1 || arg0.field763 != 0 || arg0.field762 + 1 > class38.method102(arg0.field760).field905[arg0.field761]) {
                int var2 = arg0.field775 - arg0.field742;
                int var3 = field261 - arg0.field742;
                int var4 = arg0.field777 * 128 + arg0.field734 * 64;
                int var5 = arg0.field772 * 128 + arg0.field734 * 64;
                int var6 = arg0.field771 * 128 + arg0.field734 * 64;
                int var7 = arg0.field767 * 128 + arg0.field734 * 64;
                arg0.field730 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field780 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field786 = 0;
            if (arg0.field776 == 0) {
                arg0.field779 = 1024;
            }
            if (arg0.field776 == 1) {
                arg0.field779 = 1536;
            }
            if (arg0.field776 == 2) {
                arg0.field779 = 0;
            }
            if (arg0.field776 == 3) {
                arg0.field779 = 512;
            }
            arg0.field732 = arg0.field779;
        } else {
            method1786(arg0);
        }
        if (arg0.field730 < 128 || arg0.field780 < 128 || arg0.field730 >= 13184 || arg0.field780 >= 13184) {
            arg0.field760 = -1;
            arg0.field765 = -1;
            arg0.field742 = 0;
            arg0.field775 = 0;
            arg0.field730 = arg0.field783[0] * 128 + arg0.field734 * 64;
            arg0.field780 = arg0.field784[0] * 128 + arg0.field734 * 64;
            arg0.method586();
        }
        if (Statics.field555 == arg0 && (arg0.field730 < 1536 || arg0.field780 < 1536 || arg0.field730 >= 11776 || arg0.field780 >= 11776)) {
            arg0.field760 = -1;
            arg0.field765 = -1;
            arg0.field742 = 0;
            arg0.field775 = 0;
            arg0.field730 = arg0.field783[0] * 128 + arg0.field734 * 64;
            arg0.field780 = arg0.field784[0] * 128 + arg0.field734 * 64;
            arg0.method586();
        }
        if (arg0.field781 != 0) {
            if (arg0.field754 != -1 && arg0.field754 < 32768) {
                class30 var8 = field292[arg0.field754];
                if (var8 != null) {
                    int var9 = arg0.field730 - var8.field730;
                    int var10 = arg0.field780 - var8.field780;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field779 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field754 >= 32768) {
                int var11 = arg0.field754 - 32768;
                if (field379 == var11) {
                    var11 = 2047;
                }
                class3 var12 = field311[var11];
                if (var12 != null) {
                    int var13 = arg0.field730 - var12.field730;
                    int var14 = arg0.field780 - var12.field780;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field779 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field750 != 0 || arg0.field758 != 0) && (arg0.field782 == 0 || arg0.field786 > 0)) {
                int var15 = arg0.field730 - (arg0.field750 * 64 - Statics.field1492 * 64 - Statics.field1492 * 64);
                int var16 = arg0.field780 - (arg0.field758 * 64 - Statics.field1454 * 64 - Statics.field1454 * 64);
                if (var15 != 0 || var16 != 0) {
                    arg0.field779 = (int) (Math.atan2((double) var15, (double) var16) * 325.949D) & 0x7FF;
                }
                arg0.field750 = 0;
                arg0.field758 = 0;
            }
            int var17 = arg0.field779 - arg0.field732 & 0x7FF;
            if (var17 == 0) {
                arg0.field746 = 0;
            } else {
                arg0.field746++;
                if (var17 > 1024) {
                    arg0.field732 -= arg0.field781;
                    boolean var18 = true;
                    if (var17 < arg0.field781 || var17 > 2048 - arg0.field781) {
                        arg0.field732 = arg0.field779;
                        var18 = false;
                    }
                    if (arg0.field757 == arg0.field745 && (arg0.field746 > 25 || var18)) {
                        if (arg0.field768 == -1) {
                            arg0.field757 = arg0.field738;
                        } else {
                            arg0.field757 = arg0.field768;
                        }
                    }
                } else {
                    arg0.field732 += arg0.field781;
                    boolean var19 = true;
                    if (var17 < arg0.field781 || var17 > 2048 - arg0.field781) {
                        arg0.field732 = arg0.field779;
                        var19 = false;
                    }
                    if (arg0.field757 == arg0.field745 && (arg0.field746 > 25 || var19)) {
                        if (arg0.field737 == -1) {
                            arg0.field757 = arg0.field738;
                        } else {
                            arg0.field757 = arg0.field737;
                        }
                    }
                }
                arg0.field732 &= 0x7FF;
            }
        }
        arg0.field733 = false;
        if (arg0.field757 != -1) {
            class38 var21 = class38.method102(arg0.field757);
            if (var21 == null || var21.field900 == null) {
                arg0.field757 = -1;
            } else {
                arg0.field759++;
                if (arg0.field769 < var21.field900.length && arg0.field759 > var21.field905[arg0.field769]) {
                    arg0.field759 = 1;
                    arg0.field769++;
                    method568(var21, arg0.field769, arg0.field730, arg0.field780);
                }
                if (arg0.field769 >= var21.field900.length) {
                    arg0.field759 = 0;
                    arg0.field769 = 0;
                    method568(var21, arg0.field769, arg0.field730, arg0.field780);
                }
            }
        }
        if (arg0.field765 != -1 && field261 >= arg0.field773) {
            if (arg0.field766 < 0) {
                arg0.field766 = 0;
            }
            int var22 = class39.method1416(arg0.field765).field930;
            if (var22 == -1) {
                arg0.field765 = -1;
            } else {
                class38 var23 = class38.method102(var22);
                if (var23 == null || var23.field900 == null) {
                    arg0.field765 = -1;
                } else {
                    arg0.field756++;
                    if (arg0.field766 < var23.field900.length && arg0.field756 > var23.field905[arg0.field766]) {
                        arg0.field756 = 1;
                        arg0.field766++;
                        method568(var23, arg0.field766, arg0.field730, arg0.field780);
                    }
                    if (arg0.field766 >= var23.field900.length && (arg0.field766 < 0 || arg0.field766 >= var23.field900.length)) {
                        arg0.field765 = -1;
                    }
                }
            }
        }
        if (arg0.field760 != -1 && arg0.field763 <= 1) {
            class38 var24 = class38.method102(arg0.field760);
            if (var24.field921 == 1 && arg0.field755 > 0 && arg0.field742 <= field261 && arg0.field775 < field261) {
                arg0.field763 = 1;
                return;
            }
        }
        if (arg0.field760 != -1 && arg0.field763 == 0) {
            class38 var25 = class38.method102(arg0.field760);
            if (var25 == null || var25.field900 == null) {
                arg0.field760 = -1;
            } else {
                arg0.field762++;
                if (arg0.field761 < var25.field900.length && arg0.field762 > var25.field905[arg0.field761]) {
                    arg0.field762 = 1;
                    arg0.field761++;
                    method568(var25, arg0.field761, arg0.field730, arg0.field780);
                }
                if (arg0.field761 >= var25.field900.length) {
                    arg0.field761 -= var25.field909;
                    arg0.field787++;
                    if (arg0.field787 >= var25.field915) {
                        arg0.field760 = -1;
                    } else if (arg0.field761 >= 0 && arg0.field761 < var25.field900.length) {
                        method568(var25, arg0.field761, arg0.field730, arg0.field780);
                    } else {
                        arg0.field760 = -1;
                    }
                }
                arg0.field733 = var25.field907;
            }
        }
        if (arg0.field763 > 0) {
            arg0.field763--;
        }
    }

    @ObfuscatedName("ff.aq(Lan;I)V")
    public static final void method3125(class33 arg0) {
        int var1 = arg0.field742 - field261;
        int var2 = arg0.field777 * 128 + arg0.field734 * 64;
        int var3 = arg0.field772 * 128 + arg0.field734 * 64;
        arg0.field730 += (var2 - arg0.field730) / var1;
        arg0.field780 += (var3 - arg0.field780) / var1;
        arg0.field786 = 0;
        if (arg0.field776 == 0) {
            arg0.field779 = 1024;
        }
        if (arg0.field776 == 1) {
            arg0.field779 = 1536;
        }
        if (arg0.field776 == 2) {
            arg0.field779 = 0;
        }
        if (arg0.field776 == 3) {
            arg0.field779 = 512;
        }
    }

    @ObfuscatedName("cr.aj(Lan;I)V")
    public static final void method1786(class33 arg0) {
        arg0.field757 = arg0.field745;
        if (arg0.field782 == 0) {
            arg0.field786 = 0;
            return;
        }
        if (arg0.field760 != -1 && arg0.field763 == 0) {
            class38 var1 = class38.method102(arg0.field760);
            if (arg0.field755 > 0 && var1.field921 == 0) {
                arg0.field786++;
                return;
            }
            if (arg0.field755 <= 0 && var1.field917 == 0) {
                arg0.field786++;
                return;
            }
        }
        int var2 = arg0.field730;
        int var3 = arg0.field780;
        int var4 = arg0.field783[arg0.field782 - 1] * 128 + arg0.field734 * 64;
        int var5 = arg0.field784[arg0.field782 - 1] * 128 + arg0.field734 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field730 = var4;
            arg0.field780 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field779 = 1280;
            } else if (var3 > var5) {
                arg0.field779 = 1792;
            } else {
                arg0.field779 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field779 = 768;
            } else if (var3 > var5) {
                arg0.field779 = 256;
            } else {
                arg0.field779 = 512;
            }
        } else if (var3 < var5) {
            arg0.field779 = 1024;
        } else if (var3 > var5) {
            arg0.field779 = 0;
        }
        int var6 = arg0.field779 - arg0.field732 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field739;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field738;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field741;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field740;
        }
        if (var7 == -1) {
            var7 = arg0.field738;
        }
        arg0.field757 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class30) {
            var9 = ((class30) arg0).field698.field830;
        }
        if (var9) {
            if (arg0.field779 != arg0.field732 && arg0.field754 == -1 && arg0.field781 != 0) {
                var8 = 2;
            }
            if (arg0.field782 > 2) {
                var8 = 6;
            }
            if (arg0.field782 > 3) {
                var8 = 8;
            }
            if (arg0.field786 > 0 && arg0.field782 > 1) {
                var8 = 8;
                arg0.field786--;
            }
        } else {
            if (arg0.field782 > 1) {
                var8 = 6;
            }
            if (arg0.field782 > 2) {
                var8 = 8;
            }
            if (arg0.field786 > 0 && arg0.field782 > 1) {
                var8 = 8;
                arg0.field786--;
            }
        }
        if (arg0.field785[arg0.field782 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field757 == arg0.field738 && arg0.field736 != -1) {
            arg0.field757 = arg0.field736;
        }
        if (var2 < var4) {
            arg0.field730 += var8;
            if (arg0.field730 > var4) {
                arg0.field730 = var4;
            }
        } else if (var2 > var4) {
            arg0.field730 -= var8;
            if (arg0.field730 < var4) {
                arg0.field730 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field780 += var8;
            if (arg0.field780 > var5) {
                arg0.field780 = var5;
            }
        } else if (var3 > var5) {
            arg0.field780 -= var8;
            if (arg0.field780 < var5) {
                arg0.field780 = var5;
            }
        }
        if (arg0.field730 == var4 && arg0.field780 == var5) {
            arg0.field782--;
            if (arg0.field755 > 0) {
                arg0.field755--;
            }
        }
    }

    @ObfuscatedName("m.az(Ly;III)V")
    public static void method35(class3 arg0, int arg1, int arg2) {
        if (arg0.field760 == arg1 && arg1 != -1) {
            int var3 = class38.method102(arg1).field918;
            if (var3 == 1) {
                arg0.field761 = 0;
                arg0.field762 = 0;
                arg0.field763 = arg2;
                arg0.field787 = 0;
            }
            if (var3 == 2) {
                arg0.field787 = 0;
            }
        } else if (arg1 == -1 || arg0.field760 == -1 || class38.method102(arg1).field914 >= class38.method102(arg0.field760).field914) {
            arg0.field760 = arg1;
            arg0.field761 = 0;
            arg0.field762 = 0;
            arg0.field763 = arg2;
            arg0.field787 = 0;
            arg0.field755 = arg0.field782;
        }
    }

    @ObfuscatedName("af.ap(Ljava/lang/String;ZI)V")
    public static final void method850(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1457.method3318(arg0, 250);
        int var6 = Statics.field1457.method3312(arg0, 250) * 13;
        class73.method1527(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1544(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1457.method3352(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method11(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method142(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1589.getGraphics();
            Statics.field582.method1365(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1589.repaint();
        }
    }

    @ObfuscatedName("n.ar(IIIII)V")
    public static final void method120(int arg0, int arg1, int arg2, int arg3) {
        class73.method1520(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class84.method1789();
        field393++;
        method506(class29.field691);
        boolean var4 = false;
        if (field387 >= 0) {
            for (int var5 = 0; var5 < field374; var5++) {
                if (field387 == field317[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method506(class29.field688);
        }
        method575(true);
        method506(var4 ? class29.field690 : class29.field689);
        method575(false);
        for (class7 var6 = (class7) field503.method3195(); var6 != null; var6 = (class7) field503.method3212()) {
            if (Statics.field207 != var6.field113 || field261 > var6.field119) {
                var6.method3275();
            } else if (field261 >= var6.field109) {
                if (var6.field105 > 0) {
                    class30 var7 = field292[var6.field105 - 1];
                    if (var7 != null && var7.field730 >= 0 && var7.field730 < 13312 && var7.field780 >= 0 && var7.field780 < 13312) {
                        var6.method78(var7.field730, var7.field780, method28(var7.field730, var7.field780, var6.field113) - var6.field100, field261);
                    }
                }
                if (var6.field105 < 0) {
                    int var8 = -var6.field105 - 1;
                    class3 var9;
                    if (field379 == var8) {
                        var9 = Statics.field555;
                    } else {
                        var9 = field311[var8];
                    }
                    if (var9 != null && var9.field730 >= 0 && var9.field730 < 13312 && var9.field780 >= 0 && var9.field780 < 13312) {
                        var6.method78(var9.field730, var9.field780, method28(var9.field730, var9.field780, var6.field113) - var6.field100, field261);
                    }
                }
                var6.method77(field330);
                Statics.field199.method1618(Statics.field207, (int) var6.field107, (int) var6.field108, (int) var6.field99, 60, var6, var6.field115, -1, false);
            }
        }
        method837();
        if (!field371) {
            int var10 = field337;
            if (field446 / 256 > var10) {
                var10 = field446 / 256;
            }
            if (field499[4] && field461[4] + 128 > var10) {
                var10 = field461[4] + 128;
            }
            int var11 = field511 + field431 & 0x7FF;
            int var12 = Statics.field693;
            int var13 = method28(Statics.field555.field730, Statics.field555.field780, Statics.field207) - 50;
            int var14 = Statics.field692;
            int var15 = var10 * 3 + 600;
            int var16 = 2048 - var10 & 0x7FF;
            int var17 = 2048 - var11 & 0x7FF;
            int var18 = 0;
            int var19 = 0;
            int var20 = var15;
            if (var16 != 0) {
                int var21 = class84.field1470[var16];
                int var22 = class84.field1491[var16];
                int var23 = var19 * var22 - var15 * var21 >> 16;
                var20 = var19 * var21 + var15 * var22 >> 16;
                var19 = var23;
            }
            if (var17 != 0) {
                int var24 = class84.field1470[var17];
                int var25 = class84.field1491[var17];
                int var26 = var18 * var25 + var20 * var24 >> 16;
                var20 = var20 * var25 - var18 * var24 >> 16;
                var18 = var26;
            }
            Statics.field514 = var12 - var18;
            Statics.field2107 = var13 - var19;
            Statics.field649 = var14 - var20;
            Statics.field1288 = var10;
            Statics.field2945 = var11;
        }
        int var39;
        if (field371) {
            var39 = method671();
        } else {
            int var27;
            if (Statics.field1087.field134) {
                var27 = Statics.field207;
            } else {
                int var28 = 3;
                if (Statics.field1288 < 310) {
                    int var29 = Statics.field514 >> 7;
                    int var30 = Statics.field649 >> 7;
                    int var31 = Statics.field555.field730 >> 7;
                    int var32 = Statics.field555.field780 >> 7;
                    if ((class6.field80[Statics.field207][var29][var30] & 0x4) != 0) {
                        var28 = Statics.field207;
                    }
                    int var33;
                    if (var31 > var29) {
                        var33 = var31 - var29;
                    } else {
                        var33 = var29 - var31;
                    }
                    int var34;
                    if (var32 > var30) {
                        var34 = var32 - var30;
                    } else {
                        var34 = var30 - var32;
                    }
                    if (var33 > var34) {
                        int var35 = var34 * 65536 / var33;
                        int var36 = 32768;
                        while (var29 != var31) {
                            if (var29 < var31) {
                                var29++;
                            } else if (var29 > var31) {
                                var29--;
                            }
                            if ((class6.field80[Statics.field207][var29][var30] & 0x4) != 0) {
                                var28 = Statics.field207;
                            }
                            var36 += var35;
                            if (var36 >= 65536) {
                                var36 -= 65536;
                                if (var30 < var32) {
                                    var30++;
                                } else if (var30 > var32) {
                                    var30--;
                                }
                                if ((class6.field80[Statics.field207][var29][var30] & 0x4) != 0) {
                                    var28 = Statics.field207;
                                }
                            }
                        }
                    } else {
                        int var37 = var33 * 65536 / var34;
                        int var38 = 32768;
                        while (var30 != var32) {
                            if (var30 < var32) {
                                var30++;
                            } else if (var30 > var32) {
                                var30--;
                            }
                            if ((class6.field80[Statics.field207][var29][var30] & 0x4) != 0) {
                                var28 = Statics.field207;
                            }
                            var38 += var37;
                            if (var38 >= 65536) {
                                var38 -= 65536;
                                if (var29 < var31) {
                                    var29++;
                                } else if (var29 > var31) {
                                    var29--;
                                }
                                if ((class6.field80[Statics.field207][var29][var30] & 0x4) != 0) {
                                    var28 = Statics.field207;
                                }
                            }
                        }
                    }
                }
                if ((class6.field80[Statics.field207][Statics.field555.field730 >> 7][Statics.field555.field780 >> 7] & 0x4) != 0) {
                    var28 = Statics.field207;
                }
                var27 = var28;
            }
            var39 = var27;
        }
        int var40 = Statics.field514;
        int var41 = Statics.field2107;
        int var42 = Statics.field649;
        int var43 = Statics.field1288;
        int var44 = Statics.field2945;
        for (int var45 = 0; var45 < 5; var45++) {
            if (field499[var45]) {
                int var46 = (int) (Math.random() * (double) (field500[var45] * 2 + 1) - (double) field500[var45] + Math.sin((double) field385[var45] / 100.0D * (double) field269[var45]) * (double) field461[var45]);
                if (var45 == 0) {
                    Statics.field514 += var46;
                }
                if (var45 == 1) {
                    Statics.field2107 += var46;
                }
                if (var45 == 2) {
                    Statics.field649 += var46;
                }
                if (var45 == 3) {
                    Statics.field2945 = Statics.field2945 + var46 & 0x7FF;
                }
                if (var45 == 4) {
                    Statics.field1288 += var46;
                    if (Statics.field1288 < 128) {
                        Statics.field1288 = 128;
                    }
                    if (Statics.field1288 > 383) {
                        Statics.field1288 = 383;
                    }
                }
            }
        }
        int var47 = class127.field2011;
        int var48 = class127.field2008 * -391950985;
        if (class127.field2017 != 0) {
            var47 = class127.field2014;
            var48 = class127.field2019;
        }
        if (var47 >= arg0 && var47 < arg0 + arg2 && var48 >= arg1 && var48 < arg1 + arg3) {
            class98.field1763 = true;
            class98.field1758 = 0;
            class98.field1711 = var47 - arg0;
            class98.field1765 = var48 - arg1;
        } else {
            class98.field1763 = false;
            class98.field1758 = 0;
        }
        method111();
        class73.method1527(arg0, arg1, arg2, arg3, 0);
        method111();
        Statics.field199.method1717(Statics.field514, Statics.field2107, Statics.field649, Statics.field1288, Statics.field2945, var39);
        method111();
        Statics.field199.method1697();
        method2053(arg0, arg1, arg2, arg3);
        if (field338 == 2) {
            method145((field280 - Statics.field1492 << 7) + field275, (field273 - Statics.field1454 << 7) + field276, field303 * 2);
            if (field487 > -1 && field261 % 20 < 10) {
                Statics.field711[0].method1512(field487 + arg0 - 12, field477 + arg1 - 28);
            }
        }
        ((class88) Statics.field1487).method1856(field330);
        method158(arg0, arg1, arg2, arg3);
        Statics.field514 = var40;
        Statics.field2107 = var41;
        Statics.field649 = var42;
        Statics.field1288 = var43;
        Statics.field2945 = var44;
        if (field264 && class150.method472(true, false) == 0) {
            field264 = false;
        }
        if (field264) {
            class73.method1527(arg0, arg1, arg2, arg3, 0);
            method850(class142.field2157, false);
        }
    }

    @ObfuscatedName("f.am(Lal;I)V")
    public static final void method506(class29 arg0) {
        if (Statics.field555.field730 >> 7 == field392 && Statics.field555.field780 >> 7 == field485) {
            field392 = 0;
        }
        int var1 = field374;
        if (class29.field691 == arg0 || class29.field688 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field691 == arg0) {
                var3 = Statics.field555;
                var4 = 33538048;
            } else if (class29.field688 == arg0) {
                var3 = field311[field387];
                var4 = field387 << 14;
            } else {
                var3 = field311[field317[var2]];
                var4 = field317[var2] << 14;
                if (class29.field690 == arg0 && field387 == field317[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method12() && !var3.field30) {
                var3.field46 = false;
                if ((field394 && field374 > 50 || field374 > 200) && class29.field691 != arg0 && var3.field757 == var3.field745) {
                    var3.field46 = true;
                }
                int var5 = var3.field730 >> 7;
                int var6 = var3.field780 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field40 == null || field261 < var3.field35 || field261 >= var3.field34) {
                        if ((var3.field730 & 0x7F) == 64 && (var3.field780 & 0x7F) == 64) {
                            if (field393 == field356[var5][var6]) {
                                continue;
                            }
                            field356[var5][var6] = field393;
                        }
                        var3.field39 = method28(var3.field730, var3.field780, Statics.field207);
                        Statics.field199.method1618(Statics.field207, var3.field730, var3.field780, var3.field39, 60, var3, var3.field732, var4, var3.field733);
                    } else {
                        var3.field46 = false;
                        var3.field39 = method28(var3.field730, var3.field780, Statics.field207);
                        Statics.field199.method1744(Statics.field207, var3.field730, var3.field780, var3.field39, 60, var3, var3.field732, var4, var3.field41, var3.field42, var3.field47, var3.field44);
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.ae(ZI)V")
    public static final void method575(boolean arg0) {
        for (int var1 = 0; var1 < field293; var1++) {
            class30 var2 = field292[field294[var1]];
            int var3 = (field294[var1] << 14) + 536870912;
            if (var2 != null && var2.method12() && var2.field698.field835 == arg0 && var2.field698.method602()) {
                int var4 = var2.field730 >> 7;
                int var5 = var2.field780 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field734 == 1 && (var2.field730 & 0x7F) == 64 && (var2.field780 & 0x7F) == 64) {
                        if (field393 == field356[var4][var5]) {
                            continue;
                        }
                        field356[var4][var5] = field393;
                    }
                    if (!var2.field698.field829) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field199.method1618(Statics.field207, var2.field730, var2.field780, method28(var2.field730 + (var2.field734 * 64 - 64), var2.field780 + (var2.field734 * 64 - 64), Statics.field207), var2.field734 * 64 - 64 + 60, var2, var2.field732, var3, var2.field733);
                }
            }
        }
    }

    @ObfuscatedName("ad.as(I)V")
    public static final void method837() {
        for (class26 var0 = (class26) field391.method3195(); var0 != null; var0 = (class26) field391.method3212()) {
            if (Statics.field207 != var0.field616 || var0.field623) {
                var0.method3275();
            } else if (field261 >= var0.field615) {
                var0.method510(field330);
                if (var0.field623) {
                    var0.method3275();
                } else {
                    Statics.field199.method1618(var0.field616, var0.field617, var0.field627, var0.field619, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("az.ad(I)I")
    public static final int method671() {
        if (Statics.field1087.field134) {
            return Statics.field207;
        } else {
            int var0 = method28(Statics.field514, Statics.field649, Statics.field207);
            return var0 - Statics.field2107 >= 800 || (class6.field80[Statics.field207][Statics.field514 >> 7][Statics.field649 >> 7] & 0x4) == 0 ? 3 : Statics.field207;
        }
    }

    @ObfuscatedName("cw.ab(IIIIB)V")
    public static final void method2053(int arg0, int arg1, int arg2, int arg3) {
        field349 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field374 + field293; var6++) {
            class33 var7;
            if (var6 == -1) {
                var7 = Statics.field555;
            } else if (var6 < field374) {
                var7 = field311[field317[var6]];
                if (field387 == field317[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field292[field294[var6 - field374]];
            }
            Statics.method1332(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            Statics.method1332(field311[field387], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field349; var8++) {
            int var9 = field348[var8];
            int var10 = field358[var8];
            int var11 = field250[var8];
            int var12 = field295[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field358[var14] - field295[var14] && var10 - var12 < field358[var14] + 2 && var9 - var11 < field348[var14] + field250[var14] && var9 + var11 > field348[var14] - field250[var14] && field358[var14] - field295[var14] < var10) {
                        var10 = field358[var14] - field295[var14];
                        var13 = true;
                    }
                }
            }
            field487 = field348[var8];
            field477 = field358[var8] = var10;
            String var15 = field355[var8];
            if (field418 == 0) {
                int var16 = 16776960;
                if (field352[var8] < 6) {
                    var16 = field468[field352[var8]];
                }
                if (field352[var8] == 6) {
                    var16 = field393 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field352[var8] == 7) {
                    var16 = field393 % 20 < 10 ? 255 : 65535;
                }
                if (field352[var8] == 8) {
                    var16 = field393 % 20 < 10 ? 45056 : 8454016;
                }
                if (field352[var8] == 9) {
                    int var17 = 150 - field354[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field352[var8] == 10) {
                    int var18 = 150 - field354[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field352[var8] == 11) {
                    int var19 = 150 - field354[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field353[var8] == 0) {
                    Statics.field58.method3323(var15, field487 + arg0, field477 + arg1, var16, 0);
                }
                if (field353[var8] == 1) {
                    Statics.field58.method3330(var15, field487 + arg0, field477 + arg1, var16, 0, field393);
                }
                if (field353[var8] == 2) {
                    Statics.field58.method3326(var15, field487 + arg0, field477 + arg1, var16, 0, field393);
                }
                if (field353[var8] == 3) {
                    Statics.field58.method3357(var15, field487 + arg0, field477 + arg1, var16, 0, field393, 150 - field354[var8]);
                }
                if (field353[var8] == 4) {
                    int var20 = (150 - field354[var8]) * (Statics.field58.method3375(var15) + 100) / 150;
                    class73.method1521(field487 + arg0 - 50, arg1, field487 + arg0 + 50, arg1 + arg3);
                    Statics.field58.method3321(var15, field487 + arg0 + 50 - var20, field477 + arg1, var16, 0);
                    class73.method1520(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field353[var8] == 5) {
                    int var21 = 150 - field354[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class73.method1521(arg0, field477 + arg1 - Statics.field58.field2919 - 1, arg0 + arg2, field477 + arg1 + 5);
                    Statics.field58.method3323(var15, field487 + arg0, field477 + arg1 + var22, var16, 0);
                    class73.method1520(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field58.method3323(var15, field487 + arg0, field477 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ex.at(I)V")
    public static final void method2661() {
        field345 = 0;
        int var0 = (Statics.field555.field730 >> 7) + Statics.field1492;
        int var1 = (Statics.field555.field780 >> 7) + Statics.field1454;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field345 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field345 = 1;
        }
        if (field345 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field345 = 0;
        }
    }

    @ObfuscatedName("u.ag(IIIII)V")
    public static final void method158(int arg0, int arg1, int arg2, int arg3) {
        if (field445 == 1) {
            Statics.field2072[field363 / 100].method1512(field360 - 8, field361 - 8);
        }
        if (field445 == 2) {
            Statics.field2072[field363 / 100 + 4].method1512(field360 - 8, field361 - 8);
        }
        method2661();
        if (!field375) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field1457.method3322("Fps:" + field2051, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field394) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field394) {
            var8 = 16711680;
        }
        Statics.field1457.method3322("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("am.ah(Lan;II)V")
    public static final void method789(class33 arg0, int arg1) {
        method145(arg0.field730, arg0.field780, arg1);
    }

    @ObfuscatedName("v.ac(IIII)V")
    public static final void method145(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field487 = -1;
            field477 = -1;
            return;
        }
        int var3 = method28(arg0, arg1, Statics.field207) - arg2;
        int var4 = arg0 - Statics.field514;
        int var5 = var3 - Statics.field2107;
        int var6 = arg1 - Statics.field649;
        int var7 = class84.field1470[Statics.field1288];
        int var8 = class84.field1491[Statics.field1288];
        int var9 = class84.field1470[Statics.field2945];
        int var10 = class84.field1491[Statics.field2945];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field487 = (var11 << 9) / var15 + 256;
            field477 = (var14 << 9) / var15 + 167;
        } else {
            field487 = -1;
            field477 = -1;
        }
    }

    @ObfuscatedName("w.ay(IIIS)I")
    public static final int method28(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field78[var5][var3][var4] + class6.field78[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field78[var5][var3][var4 + 1] + class6.field78[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("k.au(ZI)V")
    public static final void method1(boolean arg0) {
        field315 = arg0;
        if (!field315) {
            int var1 = field297.method2145();
            int var2 = field297.method2102();
            int var3 = (field464 - field297.field1863) / 16;
            Statics.field1999 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1999[var4][var5] = field297.method2175();
                }
            }
            int var6 = field297.method2144();
            int var7 = field297.method2144();
            int var8 = field297.method2144();
            Statics.field988 = new int[var3];
            Statics.field1530 = new int[var3];
            Statics.field2511 = new int[var3];
            Statics.field165 = new byte[var3][];
            Statics.field606 = new byte[var3][];
            boolean var9 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var1 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var1 - 6) / 8; var11 <= (var1 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field988[var10] = var13;
                        Statics.field1530[var10] = Statics.field1456.method2738("m" + var11 + "_" + var12);
                        Statics.field2511[var10] = Statics.field1456.method2738("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1852(var1, var8, var2, var7, var6);
            return;
        }
        int var14 = field297.method2143();
        int var15 = field297.method2135();
        int var16 = field297.method2144();
        int var17 = field297.method2143();
        int var18 = field297.method2143();
        field297.method2344();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field297.method2340(1);
                    if (var22 == 1) {
                        field316[var19][var20][var21] = field297.method2340(26);
                    } else {
                        field316[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field297.method2345();
        int var23 = (field464 - field297.field1863) / 16;
        Statics.field1999 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field1999[var24][var25] = field297.method2116();
            }
        }
        Statics.field988 = new int[var23];
        Statics.field1530 = new int[var23];
        Statics.field2511 = new int[var23];
        Statics.field165 = new byte[var23][];
        Statics.field606 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field316[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field988[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field988[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1530[var26] = Statics.field1456.method2738("m" + var35 + "_" + var36);
                            Statics.field2511[var26] = Statics.field1456.method2738("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1852(var14, var18, var15, var17, var16);
    }

    @ObfuscatedName("ca.ao(IIIIIB)V")
    public static final void method1852(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field618 == arg0 && Statics.field439 == arg1 && field367 == arg2 || !field394) {
            return;
        }
        Statics.field618 = arg0;
        Statics.field439 = arg1;
        field367 = arg2;
        if (!field394) {
            field367 = 0;
        }
        method762(25);
        method850(class142.field2157, true);
        int var5 = Statics.field1492;
        int var6 = Statics.field1454;
        Statics.field1492 = (arg0 - 6) * 8;
        Statics.field1454 = (arg1 - 6) * 8;
        int var7 = Statics.field1492 - var5;
        int var8 = Statics.field1454 - var6;
        int var9 = Statics.field1492;
        int var10 = Statics.field1454;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field292[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field783[var13] -= var7;
                    var12.field784[var13] -= var8;
                }
                var12.field730 -= var7 * 128;
                var12.field780 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field311[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field783[var16] -= var7;
                    var15.field784[var16] -= var8;
                }
                var15.field730 -= var7 * 128;
                var15.field780 -= var8 * 128;
            }
        }
        Statics.field207 = arg2;
        Statics.field555.method591(arg3, arg4, false);
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
                        field302[var27][var23][var24] = field302[var27][var25][var26];
                    } else {
                        field302[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field389.method3195(); var28 != null; var28 = (class15) field389.method3212()) {
            var28.field211 -= var7;
            var28.field224 -= var8;
            if (var28.field211 < 0 || var28.field224 < 0 || var28.field211 >= 104 || var28.field224 >= 104) {
                var28.method3275();
            }
        }
        if (field392 != 0) {
            field392 -= var7;
            field485 -= var8;
        }
        field497 = 0;
        field371 = false;
        field479 = -1;
        field391.method3189();
        field503.method3189();
    }

    @ObfuscatedName("az.bh(ZI)V")
    public static final void method670(boolean arg0) {
        method111();
        field301++;
        if (field301 < 50 && !arg0) {
            return;
        }
        field301 = 0;
        if (field456 || Statics.field1451 == null) {
            return;
        }
        field382.method2356(62);
        try {
            Statics.field1451.method2556(field382.field1865, 0, field382.field1863);
            field382.field1863 = 0;
        } catch (IOException var2) {
            field456 = true;
        }
    }

    @ObfuscatedName("ci.bf(II)V")
    public static final void method1870(int arg0) {
        int[] var1 = Statics.field637.field1304;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field80[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field199.method1680(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field80[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field199.method1680(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field637.method1436();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field80[arg0][var10][var9] & 0x18) == 0) {
                    method155(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field80[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method155(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field480 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field199.method1636(Statics.field207, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class36.method147(var14).field866;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field314[Statics.field207].field2957;
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
                        field462[field480] = Statics.field177[var15];
                        field481[field480] = var16;
                        field390[field480] = var17;
                        field480++;
                    }
                }
            }
        }
        Statics.field582.method1428();
    }

    @ObfuscatedName("u.bn(IIIIII)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field199.method1633(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field199.method1637(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field637.field1304;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method147(var12);
            if (var13.field867 == -1) {
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
                class74 var14 = Statics.field903[var13.field867];
                if (var14 != null) {
                    int var15 = (var13.field854 * 4 - var14.field1317) / 2;
                    int var16 = (var13.field846 * 4 - var14.field1320) / 2;
                    var14.method1576(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field846) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field199.method1742(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field199.method1637(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method147(var21);
            if (var22.field867 != -1) {
                class74 var23 = Statics.field903[var22.field867];
                if (var23 != null) {
                    int var24 = (var22.field854 * 4 - var23.field1317) / 2;
                    int var25 = (var22.field846 * 4 - var23.field1320) / 2;
                    var23.method1576(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field846) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field637.field1304;
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
        int var29 = Statics.field199.method1636(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method147(var30);
        if (var31.field867 == -1) {
            return;
        }
        class74 var32 = Statics.field903[var31.field867];
        if (var32 != null) {
            int var33 = (var31.field854 * 4 - var32.field1317) / 2;
            int var34 = (var31.field846 * 4 - var32.field1320) / 2;
            var32.method1576(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field846) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("w.bw(I)V")
    public static final void method30() {
        if (field299 == 102) {
            int var0 = field297.method2111();
            int var1 = (var0 >> 4 & 0x7) + Statics.field890;
            int var2 = (var0 & 0x7) + Statics.field920;
            int var3 = field297.method2232();
            int var4 = field297.method2111();
            int var5 = field297.method2232();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var6 = var1 * 128 + 64;
                int var7 = var2 * 128 + 64;
                class26 var8 = new class26(var3, Statics.field207, var6, var7, method28(var6, var7, Statics.field207) - var4, var5, field261);
                field391.method3190(var8);
            }
            return;
        }
        if (field299 == 176) {
            int var9 = field297.method2111();
            int var10 = (var9 >> 4 & 0x7) + Statics.field890;
            int var11 = (var9 & 0x7) + Statics.field920;
            int var12 = field297.method2232();
            int var13 = field297.method2111();
            int var14 = var13 >> 4 & 0xF;
            int var15 = var13 & 0x7;
            int var16 = field297.method2111();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                int var17 = var14 + 1;
                if (Statics.field555.field783[0] >= var10 - var17 && Statics.field555.field783[0] <= var10 + var17 && Statics.field555.field784[0] >= var11 - var17 && Statics.field555.field784[0] <= var11 + var17 && field491 != 0 && var15 > 0 && field497 < 50) {
                    field493[field497] = var12;
                    field494[field497] = var15;
                    field495[field497] = var16;
                    field289[field497] = null;
                    field496[field497] = (var10 << 16) + (var11 << 8) + var14;
                    field497++;
                }
            }
        }
        if (field299 == 6) {
            int var18 = field297.method2111();
            int var19 = (var18 >> 4 & 0x7) + Statics.field890;
            int var20 = (var18 & 0x7) + Statics.field920;
            int var21 = field297.method2232();
            int var22 = field297.method2232();
            int var23 = field297.method2232();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class177 var24 = field302[Statics.field207][var19][var20];
                if (var24 != null) {
                    for (class25 var25 = (class25) var24.method3195(); var25 != null; var25 = (class25) var24.method3212()) {
                        if ((var21 & 0x7FFF) == var25.field610 && var25.field608 == var22) {
                            var25.field608 = var23;
                            break;
                        }
                    }
                    method705(var19, var20);
                }
            }
        } else if (field299 == 136) {
            int var26 = field297.method2111();
            int var27 = (var26 >> 4 & 0x7) + Statics.field890;
            int var28 = (var26 & 0x7) + Statics.field920;
            int var29 = var27 + field297.method2112();
            int var30 = var28 + field297.method2112();
            int var31 = field297.method2240();
            int var32 = field297.method2232();
            int var33 = field297.method2111() * 4;
            int var34 = field297.method2111() * 4;
            int var35 = field297.method2232();
            int var36 = field297.method2232();
            int var37 = field297.method2111();
            int var38 = field297.method2111();
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104 && var32 != 65535) {
                int var39 = var27 * 128 + 64;
                int var40 = var28 * 128 + 64;
                int var41 = var29 * 128 + 64;
                int var42 = var30 * 128 + 64;
                class7 var43 = new class7(var32, Statics.field207, var39, var40, method28(var39, var40, Statics.field207) - var33, field261 + var35, field261 + var36, var37, var38, var31, var34);
                var43.method78(var41, var42, method28(var41, var42, Statics.field207) - var34, field261 + var35);
                field503.method3190(var43);
            }
        } else if (field299 == 175) {
            int var44 = field297.method2135();
            int var45 = (var44 >> 4 & 0x7) + Statics.field890;
            int var46 = (var44 & 0x7) + Statics.field920;
            int var47 = field297.method2144();
            int var48 = field297.method2111();
            int var49 = var48 >> 2;
            int var50 = var48 & 0x3;
            int var51 = field429[var49];
            if (var45 >= 0 && var46 >= 0 && var45 < 103 && var46 < 103) {
                if (var51 == 0) {
                    class80 var52 = Statics.field199.method1774(Statics.field207, var45, var46);
                    if (var52 != null) {
                        int var53 = var52.field1427 >> 14 & 0x7FFF;
                        if (var49 == 2) {
                            var52.field1424 = new class11(var53, 2, var50 + 4, Statics.field207, var45, var46, var47, false, var52.field1424);
                            var52.field1425 = new class11(var53, 2, var50 + 1 & 0x3, Statics.field207, var45, var46, var47, false, var52.field1425);
                        } else {
                            var52.field1424 = new class11(var53, var49, var50, Statics.field207, var45, var46, var47, false, var52.field1424);
                        }
                    }
                }
                if (var51 == 1) {
                    class87 var54 = Statics.field199.method1630(Statics.field207, var45, var46);
                    if (var54 != null) {
                        int var55 = var54.field1512 >> 14 & 0x7FFF;
                        if (var49 == 4 || var49 == 5) {
                            var54.field1510 = new class11(var55, 4, var50, Statics.field207, var45, var46, var47, false, var54.field1510);
                        } else if (var49 == 6) {
                            var54.field1510 = new class11(var55, 4, var50 + 4, Statics.field207, var45, var46, var47, false, var54.field1510);
                        } else if (var49 == 7) {
                            var54.field1510 = new class11(var55, 4, (var50 + 2 & 0x3) + 4, Statics.field207, var45, var46, var47, false, var54.field1510);
                        } else if (var49 == 8) {
                            var54.field1510 = new class11(var55, 4, var50 + 4, Statics.field207, var45, var46, var47, false, var54.field1510);
                            var54.field1511 = new class11(var55, 4, (var50 + 2 & 0x3) + 4, Statics.field207, var45, var46, var47, false, var54.field1511);
                        }
                    }
                }
                if (var51 == 2) {
                    class91 var56 = Statics.field199.method1631(Statics.field207, var45, var46);
                    if (var49 == 11) {
                        var49 = 10;
                    }
                    if (var56 != null) {
                        var56.field1578 = new class11(var56.field1574 >> 14 & 0x7FFF, var49, var50, Statics.field207, var45, var46, var47, false, var56.field1578);
                    }
                }
                if (var51 == 3) {
                    class86 var57 = Statics.field199.method1673(Statics.field207, var45, var46);
                    if (var57 != null) {
                        var57.field1495 = new class11(var57.field1496 >> 14 & 0x7FFF, 22, var50, Statics.field207, var45, var46, var47, false, var57.field1495);
                    }
                }
            }
        } else {
            if (field299 == 216) {
                int var58 = field297.method2135();
                int var59 = var58 >> 2;
                int var60 = var58 & 0x3;
                int var61 = field429[var59];
                int var62 = field297.method2143();
                byte var63 = field297.method2138();
                int var64 = field297.method2232();
                byte var65 = field297.method2171();
                byte var66 = field297.method2138();
                int var67 = field297.method2143();
                byte var68 = field297.method2112();
                int var69 = field297.method2102();
                int var70 = (var69 >> 4 & 0x7) + Statics.field890;
                int var71 = (var69 & 0x7) + Statics.field920;
                int var72 = field297.method2143();
                class3 var73;
                if (field379 == var67) {
                    var73 = Statics.field555;
                } else {
                    var73 = field311[var67];
                }
                if (var73 != null) {
                    class36 var74 = class36.method147(var62);
                    int var75;
                    int var76;
                    if (var60 == 1 || var60 == 3) {
                        var75 = var74.field846;
                        var76 = var74.field854;
                    } else {
                        var75 = var74.field854;
                        var76 = var74.field846;
                    }
                    int var77 = (var75 >> 1) + var70;
                    int var78 = (var75 + 1 >> 1) + var70;
                    int var79 = (var76 >> 1) + var71;
                    int var80 = (var76 + 1 >> 1) + var71;
                    int[][] var81 = class6.field78[Statics.field207];
                    int var82 = var81[var77][var79] + var81[var78][var79] + var81[var77][var80] + var81[var78][var80] >> 2;
                    int var83 = (var70 << 7) + (var75 << 6);
                    int var84 = (var71 << 7) + (var76 << 6);
                    class98 var85 = var74.method660(var59, var60, var81, var83, var82, var84);
                    if (var85 != null) {
                        method2527(Statics.field207, var70, var71, var61, -1, 0, 0, var72 + 1, var64 + 1);
                        var73.field35 = field261 + var72;
                        var73.field34 = field261 + var64;
                        var73.field40 = var85;
                        var73.field37 = var70 * 128 + var75 * 64;
                        var73.field36 = var71 * 128 + var76 * 64;
                        var73.field52 = var82;
                        if (var66 > var68) {
                            byte var86 = var66;
                            var66 = var68;
                            var68 = var86;
                        }
                        if (var63 > var65) {
                            byte var87 = var63;
                            var63 = var65;
                            var65 = var87;
                        }
                        var73.field41 = var66 + var70;
                        var73.field47 = var68 + var70;
                        var73.field42 = var63 + var71;
                        var73.field44 = var65 + var71;
                    }
                }
            }
            if (field299 == 236) {
                int var88 = field297.method2143();
                int var89 = field297.method2135();
                int var90 = (var89 >> 4 & 0x7) + Statics.field890;
                int var91 = (var89 & 0x7) + Statics.field920;
                int var92 = field297.method2136();
                int var93 = var92 >> 2;
                int var94 = var92 & 0x3;
                int var95 = field429[var93];
                if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                    method2527(Statics.field207, var90, var91, var95, var88, var93, var94, 0, -1);
                }
            } else if (field299 == 18) {
                int var96 = field297.method2143();
                int var97 = field297.method2102();
                int var98 = (var97 >> 4 & 0x7) + Statics.field890;
                int var99 = (var97 & 0x7) + Statics.field920;
                int var100 = field297.method2144();
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                    class25 var101 = new class25();
                    var101.field610 = var100;
                    var101.field608 = var96;
                    if (field302[Statics.field207][var98][var99] == null) {
                        field302[Statics.field207][var98][var99] = new class177();
                    }
                    field302[Statics.field207][var98][var99].method3190(var101);
                    method705(var98, var99);
                }
            } else if (field299 == 204) {
                int var102 = field297.method2102();
                int var103 = (var102 >> 4 & 0x7) + Statics.field890;
                int var104 = (var102 & 0x7) + Statics.field920;
                int var105 = field297.method2232();
                if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                    class177 var106 = field302[Statics.field207][var103][var104];
                    if (var106 != null) {
                        for (class25 var107 = (class25) var106.method3195(); var107 != null; var107 = (class25) var106.method3212()) {
                            if ((var105 & 0x7FFF) == var107.field610) {
                                var107.method3275();
                                break;
                            }
                        }
                        if (var106.method3195() == null) {
                            field302[Statics.field207][var103][var104] = null;
                        }
                        method705(var103, var104);
                    }
                }
            } else if (field299 == 228) {
                int var108 = field297.method2136();
                int var109 = var108 >> 2;
                int var110 = var108 & 0x3;
                int var111 = field429[var109];
                int var112 = field297.method2111();
                int var113 = (var112 >> 4 & 0x7) + Statics.field890;
                int var114 = (var112 & 0x7) + Statics.field920;
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    method2527(Statics.field207, var113, var114, var111, -1, var109, var110, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("dz.be(IIIIIIIIIB)V")
    public static final void method2527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field389.method3195(); var10 != null; var10 = (class15) field389.method3212()) {
            if (var10.field212 == arg0 && var10.field211 == arg1 && var10.field224 == arg2 && var10.field210 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field212 = arg0;
            var9.field210 = arg3;
            var9.field211 = arg1;
            var9.field224 = arg2;
            method2064(var9);
            field389.method3190(var9);
        }
        var9.field226 = arg4;
        var9.field218 = arg5;
        var9.field217 = arg6;
        var9.field219 = arg7;
        var9.field220 = arg8;
    }

    @ObfuscatedName("cg.bd(Lv;B)V")
    public static final void method2064(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field210 == 0) {
            var1 = Statics.field199.method1633(arg0.field212, arg0.field211, arg0.field224);
        }
        if (arg0.field210 == 1) {
            var1 = Statics.field199.method1634(arg0.field212, arg0.field211, arg0.field224);
        }
        if (arg0.field210 == 2) {
            var1 = Statics.field199.method1742(arg0.field212, arg0.field211, arg0.field224);
        }
        if (arg0.field210 == 3) {
            var1 = Statics.field199.method1636(arg0.field212, arg0.field211, arg0.field224);
        }
        if (var1 != 0) {
            int var5 = Statics.field199.method1637(arg0.field212, arg0.field211, arg0.field224, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field221 = var2;
        arg0.field223 = var3;
        arg0.field214 = var4;
    }

    @ObfuscatedName("t.bo(IIIIIIII)V")
    public static final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field394 && Statics.field207 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field199.method1633(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field199.method1634(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field199.method1742(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field199.method1636(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field199.method1637(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field199.method1624(arg0, arg2, arg3);
                class36 var15 = class36.method147(var12);
                if (var15.field865 != 0) {
                    field314[arg0].method3484(arg2, arg3, var13, var14, var15.field855);
                }
            }
            if (arg1 == 1) {
                Statics.field199.method1625(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field199.method1629(arg0, arg2, arg3);
                class36 var16 = class36.method147(var12);
                if (var16.field854 + arg2 > 103 || var16.field854 + arg3 > 103 || var16.field846 + arg2 > 103 || var16.field846 + arg3 > 103) {
                    return;
                }
                if (var16.field865 != 0) {
                    field314[arg0].method3465(arg2, arg3, var16.field854, var16.field846, var14, var16.field855);
                }
            }
            if (arg1 == 3) {
                Statics.field199.method1627(arg0, arg2, arg3);
                class36 var17 = class36.method147(var12);
                if (var17.field865 == 1) {
                    field314[arg0].method3466(arg2, arg3);
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
        class79 var19 = Statics.field199;
        class197 var20 = field314[arg0];
        class36 var21 = class36.method147(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field846;
            var23 = var21.field854;
        } else {
            var22 = var21.field854;
            var23 = var21.field846;
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
        int[][] var28 = class6.field78[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field857 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field878 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field861 == -1 && var21.field879 == null) {
                var34 = var21.method660(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1643(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field865 == 1) {
                var20.method3462(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field861 == -1 && var21.field879 == null) {
                var57 = var21.method660(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1617(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field865 != 0) {
                var20.method3460(arg2, arg3, var22, var23, var21.field855);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field861 == -1 && var21.field879 == null) {
                var35 = var21.method660(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1617(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field865 != 0) {
                var20.method3460(arg2, arg3, var22, var23, var21.field855);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field861 == -1 && var21.field879 == null) {
                var36 = var21.method660(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1719(arg0, arg2, arg3, var29, var36, (class78) null, class6.field82[arg5], 0, var32, var33);
            if (var21.field865 != 0) {
                var20.method3469(arg2, arg3, arg6, arg5, var21.field855);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field861 == -1 && var21.field879 == null) {
                var37 = var21.method660(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1719(arg0, arg2, arg3, var29, var37, (class78) null, class6.field83[arg5], 0, var32, var33);
            if (var21.field865 != 0) {
                var20.method3469(arg2, arg3, arg6, arg5, var21.field855);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field861 == -1 && var21.field879 == null) {
                var39 = var21.method660(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method660(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field861, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1719(arg0, arg2, arg3, var29, var39, var40, class6.field82[arg5], class6.field82[var38], var32, var33);
            if (var21.field865 != 0) {
                var20.method3469(arg2, arg3, arg6, arg5, var21.field855);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field861 == -1 && var21.field879 == null) {
                var41 = var21.method660(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1719(arg0, arg2, arg3, var29, var41, (class78) null, class6.field83[arg5], 0, var32, var33);
            if (var21.field865 != 0) {
                var20.method3469(arg2, arg3, arg6, arg5, var21.field855);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field861 == -1 && var21.field879 == null) {
                var42 = var21.method660(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1617(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field865 != 0) {
                var20.method3460(arg2, arg3, var22, var23, var21.field855);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field861 == -1 && var21.field879 == null) {
                var43 = var21.method660(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var43, (class78) null, class6.field82[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1633(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method147(var45 >> 14 & 0x7FFF).field862;
            }
            class78 var46;
            if (var21.field861 == -1 && var21.field879 == null) {
                var46 = var21.method660(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var46, (class78) null, class6.field82[arg5], 0, class6.field84[arg5] * var44, class6.field79[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1633(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method147(var48 >> 14 & 0x7FFF).field862 / 2;
            }
            class78 var49;
            if (var21.field861 == -1 && var21.field879 == null) {
                var49 = var21.method660(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field86[arg5] * var47, class6.field87[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field861 == -1 && var21.field879 == null) {
                var51 = var21.method660(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1633(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method147(var53 >> 14 & 0x7FFF).field862 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field861 == -1 && var21.field879 == null) {
                var55 = var21.method660(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method660(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field861, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field861, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field86[arg5] * var52, class6.field87[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ap.bz(IIB)V")
    public static final void method705(int arg0, int arg1) {
        class177 var2 = field302[Statics.field207][arg0][arg1];
        if (var2 == null) {
            Statics.field199.method1628(Statics.field207, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3195(); var6 != null; var6 = (class25) var2.method3212()) {
            class45 var7 = class45.method1864(var6.field610);
            long var8 = (long) var7.field1035;
            if (var7.field1031 == 1) {
                var8 = (long) (var6.field608 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field199.method1628(Statics.field207, arg0, arg1);
            return;
        }
        var2.method3191(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3195(); var12 != null; var12 = (class25) var2.method3212()) {
            if (var5.field610 != var12.field610) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field610 != var12.field610 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field199.method1614(Statics.field207, arg0, arg1, method28(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field207), var5, var13, var10, var11);
    }

    @ObfuscatedName("j.bq(I)V")
    public static final void method74() {
        field381 = 0;
        field376 = 0;
        method2522();
        int var0 = field297.method2340(8);
        if (var0 < field374) {
            for (int var1 = var0; var1 < field374; var1++) {
                field290[++field381 - 1] = field317[var1];
            }
        }
        if (var0 > field374) {
            throw new RuntimeException("");
        }
        field374 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field317[var2];
            class3 var4 = field311[var3];
            int var5 = field297.method2340(1);
            if (var5 == 0) {
                field317[++field374 - 1] = var3;
                var4.field770 = field261;
            } else {
                int var6 = field297.method2340(2);
                if (var6 == 0) {
                    field317[++field374 - 1] = var3;
                    var4.field770 = field261;
                    field377[++field376 - 1] = var3;
                } else if (var6 == 1) {
                    field317[++field374 - 1] = var3;
                    var4.field770 = field261;
                    int var7 = field297.method2340(3);
                    var4.method585(var7, false);
                    int var8 = field297.method2340(1);
                    if (var8 == 1) {
                        field377[++field376 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field317[++field374 - 1] = var3;
                    var4.field770 = field261;
                    int var9 = field297.method2340(3);
                    var4.method585(var9, true);
                    int var10 = field297.method2340(3);
                    var4.method585(var10, true);
                    int var11 = field297.method2340(1);
                    if (var11 == 1) {
                        field377[++field376 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field290[++field381 - 1] = var3;
                }
            }
        }
        method3280();
        for (int var12 = 0; var12 < field376; var12++) {
            int var13 = field377[var12];
            class3 var14 = field311[var13];
            int var15 = field297.method2111();
            if ((var15 & 0x8) != 0) {
                var15 += field297.method2111() << 8;
            }
            method15(var13, var14, var15);
        }
        for (int var16 = 0; var16 < field381; var16++) {
            int var17 = field290[var16];
            if (field261 != field311[var17].field770) {
                field311[var17] = null;
            }
        }
        if (field464 != field297.field1863) {
            throw new RuntimeException(field297.field1863 + class2.field17 + field464);
        }
        for (int var18 = 0; var18 < field374; var18++) {
            if (field311[field317[var18]] == null) {
                throw new RuntimeException(var18 + class2.field17 + field374);
            }
        }
    }

    @ObfuscatedName("dd.bu(I)V")
    public static final void method2522() {
        field297.method2344();
        int var0 = field297.method2340(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field297.method2340(2);
        if (var1 == 0) {
            field377[++field376 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field297.method2340(3);
            Statics.field555.method585(var2, false);
            int var3 = field297.method2340(1);
            if (var3 == 1) {
                field377[++field376 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field297.method2340(3);
            Statics.field555.method585(var4, true);
            int var5 = field297.method2340(3);
            Statics.field555.method585(var5, true);
            int var6 = field297.method2340(1);
            if (var6 == 1) {
                field377[++field376 - 1] = 2047;
            }
        } else if (var1 == 3) {
            Statics.field207 = field297.method2340(2);
            int var7 = field297.method2340(1);
            int var8 = field297.method2340(7);
            int var9 = field297.method2340(7);
            int var10 = field297.method2340(1);
            if (var10 == 1) {
                field377[++field376 - 1] = 2047;
            }
            Statics.field555.method591(var9, var8, var7 == 1);
        }
    }

    @ObfuscatedName("gx.bk(I)V")
    public static final void method3280() {
        while (true) {
            if (field297.method2346(field464) >= 11) {
                int var0 = field297.method2340(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field311[var0] == null) {
                        field311[var0] = new class3();
                        if (field351[var0] != null) {
                            field311[var0].method13(field351[var0]);
                        }
                        var1 = true;
                    }
                    field317[++field374 - 1] = var0;
                    class3 var2 = field311[var0];
                    var2.field770 = field261;
                    int var3 = field386[field297.method2340(3)];
                    if (var1) {
                        var2.field779 = var2.field732 = var3;
                    }
                    int var4 = field297.method2340(1);
                    int var5 = field297.method2340(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field297.method2340(1);
                    if (var6 == 1) {
                        field377[++field376 - 1] = var0;
                    }
                    int var7 = field297.method2340(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method591(Statics.field555.field783[0] + var7, Statics.field555.field784[0] + var5, var4 == 1);
                    continue;
                }
            }
            field297.method2345();
            return;
        }
    }

    @ObfuscatedName("y.bc(ILy;IB)V")
    public static final void method15(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x400) != 0) {
            int var3 = field297.method2145();
            int var4 = field297.method2111();
            arg1.method587(var3, var4, field261);
            arg1.field751 = field261 + 300;
            arg1.field752 = field297.method2135();
            arg1.field753 = field297.method2135();
        }
        if ((arg2 & 0x10) != 0) {
            int var5 = field297.method2145();
            int var6 = field297.method2111();
            arg1.method587(var5, var6, field261);
            arg1.field751 = field261 + 300;
            arg1.field752 = field297.method2136();
            arg1.field753 = field297.method2136();
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field743 = field297.method2119();
            if (arg1.field743.charAt(0) == '~') {
                arg1.field743 = arg1.field743.substring(1);
                class10.method2663(2, arg1.field43, arg1.field743);
            } else if (Statics.field555 == arg1) {
                class10.method2663(2, arg1.field43, arg1.field743);
            }
            arg1.field744 = false;
            arg1.field747 = 0;
            arg1.field764 = 0;
            arg1.field731 = 150;
        }
        if ((arg2 & 0x80) != 0) {
            int var7 = field297.method2136();
            byte[] var8 = new byte[var7];
            class107 var9 = new class107(var8);
            field297.method2122(var8, 0, var7);
            field351[arg0] = var9;
            arg1.method13(var9);
        }
        if ((arg2 & 0x40) != 0) {
            int var10 = field297.method2232();
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = field297.method2136();
            method35(arg1, var10, var11);
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field765 = field297.method2145();
            int var12 = field297.method2175();
            arg1.field774 = var12 >> 16;
            arg1.field773 = (var12 & 0xFFFF) + field261;
            arg1.field766 = 0;
            arg1.field756 = 0;
            if (arg1.field773 > field261) {
                arg1.field766 = -1;
            }
            if (arg1.field765 == 65535) {
                arg1.field765 = -1;
            }
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field777 = field297.method2111();
            arg1.field772 = field297.method2135();
            arg1.field771 = field297.method2102();
            arg1.field767 = field297.method2102();
            arg1.field742 = field297.method2145() + field261;
            arg1.field775 = field297.method2232() + field261;
            arg1.field776 = field297.method2102();
            arg1.field782 = 1;
            arg1.field755 = 0;
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field750 = field297.method2143();
            arg1.field758 = field297.method2145();
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field754 = field297.method2145();
            if (arg1.field754 == 65535) {
                arg1.field754 = -1;
            }
        }
        if ((arg2 & 0x4) == 0) {
            return;
        }
        int var13 = field297.method2232();
        int var14 = field297.method2102();
        boolean var15 = field297.method2102() == 1;
        int var16 = field297.method2111();
        int var17 = field297.field1863;
        if (arg1.field43 != null && arg1.field29 != null) {
            boolean var18 = false;
            if (var14 <= 1 && method3066(arg1.field43)) {
                var18 = true;
            }
            if (!var18 && field345 == 0 && !arg1.field30) {
                field277.field1863 = 0;
                field297.method2154(field277.field1865, 0, var16);
                field277.field1863 = 0;
                String var19 = class192.method3354(Statics.method1962(class191.method3071(field277)));
                arg1.field743 = var19.trim();
                arg1.field747 = var13 >> 8;
                arg1.field764 = var13 & 0xFF;
                arg1.field731 = 150;
                arg1.field744 = var15;
                if (var14 == 2 || var14 == 3) {
                    class10.method2663(var15 ? 91 : 1, class2.method760(1) + arg1.field43, var19);
                } else if (var14 == 1) {
                    class10.method2663(var15 ? 91 : 1, class2.method760(0) + arg1.field43, var19);
                } else {
                    class10.method2663(var15 ? 90 : 2, arg1.field43, var19);
                }
            }
        }
        field297.field1863 = var16 + var17;
    }

    @ObfuscatedName("da.ba(B)V")
    public static final void method2507() {
        field381 = 0;
        field376 = 0;
        field297.method2344();
        int var0 = field297.method2340(8);
        if (var0 < field293) {
            for (int var1 = var0; var1 < field293; var1++) {
                field290[++field381 - 1] = field294[var1];
            }
        }
        if (var0 > field293) {
            throw new RuntimeException("");
        }
        field293 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field294[var2];
            class30 var4 = field292[var3];
            int var5 = field297.method2340(1);
            if (var5 == 0) {
                field294[++field293 - 1] = var3;
                var4.field770 = field261;
            } else {
                int var6 = field297.method2340(2);
                if (var6 == 0) {
                    field294[++field293 - 1] = var3;
                    var4.field770 = field261;
                    field377[++field376 - 1] = var3;
                } else if (var6 == 1) {
                    field294[++field293 - 1] = var3;
                    var4.field770 = field261;
                    int var7 = field297.method2340(3);
                    var4.method585(var7, false);
                    int var8 = field297.method2340(1);
                    if (var8 == 1) {
                        field377[++field376 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field294[++field293 - 1] = var3;
                    var4.field770 = field261;
                    int var9 = field297.method2340(3);
                    var4.method585(var9, true);
                    int var10 = field297.method2340(3);
                    var4.method585(var10, true);
                    int var11 = field297.method2340(1);
                    if (var11 == 1) {
                        field377[++field376 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field290[++field381 - 1] = var3;
                }
            }
        }
        method2412();
        for (int var12 = 0; var12 < field376; var12++) {
            int var13 = field377[var12];
            class30 var14 = field292[var13];
            int var15 = field297.method2111();
            if ((var15 & 0x40) != 0) {
                var14.field750 = field297.method2232();
                var14.field758 = field297.method2143();
            }
            if ((var15 & 0x2) != 0) {
                int var16 = field297.method2232();
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = field297.method2136();
                if (var14.field760 == var16 && var16 != -1) {
                    int var18 = class38.method102(var16).field918;
                    if (var18 == 1) {
                        var14.field761 = 0;
                        var14.field762 = 0;
                        var14.field763 = var17;
                        var14.field787 = 0;
                    }
                    if (var18 == 2) {
                        var14.field787 = 0;
                    }
                } else if (var16 == -1 || var14.field760 == -1 || class38.method102(var16).field914 >= class38.method102(var14.field760).field914) {
                    var14.field760 = var16;
                    var14.field761 = 0;
                    var14.field762 = 0;
                    var14.field763 = var17;
                    var14.field787 = 0;
                    var14.field755 = var14.field782;
                }
            }
            if ((var15 & 0x10) != 0) {
                int var19 = field297.method2111();
                int var20 = field297.method2102();
                var14.method587(var19, var20, field261);
                var14.field751 = field261 + 300;
                var14.field752 = field297.method2232();
                var14.field753 = field297.method2144();
            }
            if ((var15 & 0x8) != 0) {
                var14.field698 = class35.method917(field297.method2144());
                var14.field734 = var14.field698.field823;
                var14.field781 = var14.field698.field828;
                var14.field738 = var14.field698.field808;
                var14.field739 = var14.field698.field812;
                var14.field740 = var14.field698.field810;
                var14.field741 = var14.field698.field825;
                var14.field745 = var14.field698.field821;
                var14.field768 = var14.field698.field806;
                var14.field737 = var14.field698.field803;
            }
            if ((var15 & 0x20) != 0) {
                var14.field765 = field297.method2144();
                int var21 = field297.method2153();
                var14.field774 = var21 >> 16;
                var14.field773 = (var21 & 0xFFFF) + field261;
                var14.field766 = 0;
                var14.field756 = 0;
                if (var14.field773 > field261) {
                    var14.field766 = -1;
                }
                if (var14.field765 == 65535) {
                    var14.field765 = -1;
                }
            }
            if ((var15 & 0x4) != 0) {
                var14.field743 = field297.method2119();
                var14.field731 = 100;
            }
            if ((var15 & 0x80) != 0) {
                var14.field754 = field297.method2145();
                if (var14.field754 == 65535) {
                    var14.field754 = -1;
                }
            }
            if ((var15 & 0x1) != 0) {
                int var22 = field297.method2135();
                int var23 = field297.method2111();
                var14.method587(var22, var23, field261);
                var14.field751 = field261 + 300;
                var14.field752 = field297.method2143();
                var14.field753 = field297.method2143();
            }
        }
        for (int var24 = 0; var24 < field381; var24++) {
            int var25 = field290[var24];
            if (field261 != field292[var25].field770) {
                field292[var25].field698 = null;
                field292[var25] = null;
            }
        }
        if (field464 != field297.field1863) {
            throw new RuntimeException(field297.field1863 + class2.field17 + field464);
        }
        for (int var26 = 0; var26 < field293; var26++) {
            if (field292[field294[var26]] == null) {
                throw new RuntimeException(var26 + class2.field17 + field293);
            }
        }
    }

    @ObfuscatedName("dx.bb(B)V")
    public static final void method2412() {
        while (true) {
            if (field297.method2346(field464) >= 27) {
                int var0 = field297.method2340(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field292[var0] == null) {
                        field292[var0] = new class30();
                        var1 = true;
                    }
                    class30 var2 = field292[var0];
                    field294[++field293 - 1] = var0;
                    var2.field770 = field261;
                    int var3 = field386[field297.method2340(3)];
                    if (var1) {
                        var2.field779 = var2.field732 = var3;
                    }
                    int var4 = field297.method2340(1);
                    if (var4 == 1) {
                        field377[++field376 - 1] = var0;
                    }
                    var2.field698 = class35.method917(field297.method2340(14));
                    int var5 = field297.method2340(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field297.method2340(1);
                    int var7 = field297.method2340(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.field734 = var2.field698.field823;
                    var2.field781 = var2.field698.field828;
                    if (var2.field781 == 0) {
                        var2.field732 = 0;
                    }
                    var2.field738 = var2.field698.field808;
                    var2.field739 = var2.field698.field812;
                    var2.field740 = var2.field698.field810;
                    var2.field741 = var2.field698.field825;
                    var2.field745 = var2.field698.field821;
                    var2.field768 = var2.field698.field806;
                    var2.field737 = var2.field698.field803;
                    var2.method591(Statics.field555.field783[0] + var5, Statics.field555.field784[0] + var7, var6 == 1);
                    continue;
                }
            }
            field297.method2345();
            return;
        }
    }

    @ObfuscatedName("bl.bv(I)V")
    public static final void method1362() {
        int var0 = Statics.field1008;
        int var1 = Statics.field1663;
        int var2 = Statics.field397;
        int var3 = Statics.field1533;
        int var4 = 6116423;
        class73.method1527(var0, var1, var2, var3, var4);
        class73.method1527(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1544(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field58.method3321(class142.field2216, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field2011;
        int var6 = class127.field2008 * -391950985;
        for (int var7 = 0; var7 < field398; var7++) {
            int var8 = (field398 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field58.method3321(method119(var7), var0 + 3, var8, var9, 0);
        }
        method142(Statics.field1008, Statics.field1663, Statics.field397, Statics.field1533);
    }

    @ObfuscatedName("r.bl(IIIIB)V")
    public static final void method11(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field458; var4++) {
            if (field465[var4] + field265[var4] > arg0 && field265[var4] < arg0 + arg2 && field357[var4] + field287[var4] > arg1 && field287[var4] < arg1 + arg3) {
                field460[var4] = true;
            }
        }
    }

    @ObfuscatedName("s.br(IIIIS)V")
    public static final void method142(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field458; var4++) {
            if (field465[var4] + field265[var4] > arg0 && field265[var4] < arg0 + arg2 && field357[var4] + field287[var4] > arg1 && field287[var4] < arg1 + arg3) {
                field414[var4] = true;
            }
        }
    }

    @ObfuscatedName("v.bj(II)Z")
    public static final boolean method144(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field401[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("cm.bp(IB)V")
    public static final void method1971(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field384[arg0];
        int var2 = field492[arg0];
        int var3 = field401[arg0];
        int var4 = field402[arg0];
        String var5 = field498[arg0];
        String var6 = field404[arg0];
        method32(var1, var2, var3, var4, var5, var6, class127.field2014, class127.field2019);
    }

    @ObfuscatedName("bx.bs(Laa;IIB)V")
    public static final void method1604(class27 arg0, int arg1, int arg2) {
        method32(arg0.field630, arg0.field629, arg0.field639, arg0.field631, arg0.field633, arg0.field633, arg1, arg2);
    }

    @ObfuscatedName("m.by(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 16) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(213);
            field382.method2132(class124.field1976[82] ? 1 : 0);
            field382.method2098(arg3);
            field382.method2152(Statics.field233);
            field382.method2187(Statics.field565);
            field382.method2236(Statics.field1355);
            field382.method2098(Statics.field1492 + arg0);
            field382.method2236(Statics.field1454 + arg1);
        }
        if (arg2 == 37) {
            field382.method2356(223);
            field382.method2098(arg3);
            field382.method2149(arg1);
            field382.method2236(arg0);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 22) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(84);
            field382.method2133(class124.field1976[82] ? 1 : 0);
            field382.method2236(arg3);
            field382.method2187(Statics.field1492 + arg0);
            field382.method2187(Statics.field1454 + arg1);
        }
        if (arg2 == 20) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(225);
            field382.method2098(Statics.field1454 + arg1);
            field382.method2132(class124.field1976[82] ? 1 : 0);
            field382.method2098(Statics.field1492 + arg0);
            field382.method2187(arg3);
        }
        if (arg2 == 1002) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field382.method2356(144);
            field382.method2098(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 48) {
            class3 var8 = field311[arg3];
            if (var8 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(171);
                field382.method2220(arg3);
                field382.method2133(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field382.method2356(91);
            field382.method2149(arg1);
            field382.method2236(field412);
            field382.method2220(arg0);
            field382.method2149(Statics.field561);
            field382.method2220(arg3);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 1) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(194);
            field382.method2134(class124.field1976[82] ? 1 : 0);
            field382.method2098(Statics.field1492 + arg0);
            field382.method2236(arg3 >> 14 & 0x7FFF);
            field382.method2187(Statics.field565);
            field382.method2187(Statics.field1355);
            field382.method2220(Statics.field1454 + arg1);
            field382.method2100(Statics.field233);
        }
        if (arg2 == 15) {
            class3 var9 = field311[arg3];
            if (var9 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(161);
                field382.method2133(class124.field1976[82] ? 1 : 0);
                field382.method2220(field412);
                field382.method2100(Statics.field561);
                field382.method2187(arg3);
            }
        }
        if (arg2 == 6) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(10);
            field382.method2187(Statics.field1454 + arg1);
            field382.method2134(class124.field1976[82] ? 1 : 0);
            field382.method2098(arg3 >> 14 & 0x7FFF);
            field382.method2220(Statics.field1492 + arg0);
        }
        if (arg2 == 45) {
            class3 var10 = field311[arg3];
            if (var10 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(32);
                field382.method2132(class124.field1976[82] ? 1 : 0);
                field382.method2098(arg3);
            }
        }
        if (arg2 == 38) {
            method561();
            class152 var11 = Statics.method480(arg1);
            field409 = 1;
            Statics.field1355 = arg0;
            Statics.field233 = arg1;
            Statics.field565 = arg3;
            method3127(var11);
            field410 = class2.method3305(16748608) + class45.method1864(arg3).field1020 + class2.method3305(16777215);
            if (field410 == null) {
                field410 = "null";
            }
            return;
        }
        if (arg2 == 17) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(228);
            field382.method2150(Statics.field561);
            field382.method2097(class124.field1976[82] ? 1 : 0);
            field382.method2220(arg3);
            field382.method2187(Statics.field1492 + arg0);
            field382.method2236(field412);
            field382.method2098(Statics.field1454 + arg1);
        }
        if (arg2 == 5) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(204);
            field382.method2098(arg3 >> 14 & 0x7FFF);
            field382.method2236(Statics.field1492 + arg0);
            field382.method2133(class124.field1976[82] ? 1 : 0);
            field382.method2220(Statics.field1454 + arg1);
        }
        if (arg2 == 43) {
            field382.method2356(81);
            field382.method2152(arg1);
            field382.method2098(arg3);
            field382.method2098(arg0);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 13) {
            class30 var12 = field292[arg3];
            if (var12 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(39);
                field382.method2133(class124.field1976[82] ? 1 : 0);
                field382.method2220(arg3);
            }
        }
        if (arg2 == 1005) {
            class152 var13 = Statics.method480(arg1);
            if (var13 == null || var13.field2637[arg0] < 100000) {
                field382.method2356(96);
                field382.method2236(arg3);
            } else {
                class10.method2663(27, "", var13.field2637[arg0] + " x " + class45.method1864(arg3).field1020);
            }
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 44) {
            class3 var14 = field311[arg3];
            if (var14 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(149);
                field382.method2132(class124.field1976[82] ? 1 : 0);
                field382.method2098(arg3);
            }
        }
        if (arg2 == 3) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(253);
            field382.method2098(Statics.field1492 + arg0);
            field382.method2187(Statics.field1454 + arg1);
            field382.method2098(arg3 >> 14 & 0x7FFF);
            field382.method2132(class124.field1976[82] ? 1 : 0);
        }
        if (arg2 == 1004) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field382.method2356(96);
            field382.method2236(arg3);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class152 var15 = class152.method696(arg1, arg0);
            if (var15 != null) {
                method669(arg3, arg1, arg0, var15.field2638, arg5);
            }
        }
        if (arg2 == 12) {
            class30 var16 = field292[arg3];
            if (var16 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(83);
                field382.method2220(arg3);
                field382.method2097(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            Statics.field199.method1656(Statics.field207, arg0, arg1);
        }
        if (arg2 == 4) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(224);
            field382.method2132(class124.field1976[82] ? 1 : 0);
            field382.method2098(Statics.field1492 + arg0);
            field382.method2187(arg3 >> 14 & 0x7FFF);
            field382.method2236(Statics.field1454 + arg1);
        }
        if (arg2 == 31) {
            field382.method2356(176);
            field382.method2187(Statics.field1355);
            field382.method2187(Statics.field565);
            field382.method2220(arg0);
            field382.method2220(arg3);
            field382.method2152(Statics.field233);
            field382.method2149(arg1);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 25) {
            class152 var17 = class152.method696(arg1, arg0);
            if (var17 != null) {
                method561();
                Statics.method2382(arg1, arg0, class156.method439(method2818(var17)), var17.field2638);
                field409 = 0;
                field442 = method1078(var17);
                if (field442 == null) {
                    field442 = "Null";
                }
                if (var17.field2533) {
                    field399 = var17.field2594 + class2.method3305(16777215);
                } else {
                    field399 = class2.method3305(65280) + var17.field2529 + class2.method3305(16777215);
                }
            }
            return;
        }
        if (arg2 == 8) {
            class30 var18 = field292[arg3];
            if (var18 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(154);
                field382.method2098(arg3);
                field382.method2149(Statics.field561);
                field382.method2132(class124.field1976[82] ? 1 : 0);
                field382.method2098(field412);
            }
        }
        if (arg2 == 24) {
            class152 var19 = Statics.method480(arg1);
            boolean var20 = true;
            if (var19.field2585 > 0) {
                var20 = method815(var19);
            }
            if (var20) {
                field382.method2356(20);
                field382.method2100(arg1);
            }
        }
        if (arg2 == 1003) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            class30 var21 = field292[arg3];
            if (var21 != null) {
                class35 var22 = var21.field698;
                if (var22.field800 != null) {
                    var22 = var22.method601();
                }
                if (var22 != null) {
                    field382.method2356(234);
                    field382.method2220(var22.field805);
                }
            }
        }
        if (arg2 == 35) {
            field382.method2356(241);
            field382.method2236(arg0);
            field382.method2187(arg3);
            field382.method2152(arg1);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 33) {
            field382.method2356(48);
            field382.method2100(arg1);
            field382.method2187(arg3);
            field382.method2098(arg0);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 14) {
            class3 var23 = field311[arg3];
            if (var23 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(247);
                field382.method2236(Statics.field565);
                field382.method2134(class124.field1976[82] ? 1 : 0);
                field382.method2100(Statics.field233);
                field382.method2220(arg3);
                field382.method2098(Statics.field1355);
            }
        }
        if (arg2 == 28) {
            field382.method2356(20);
            field382.method2100(arg1);
            class152 var24 = Statics.method480(arg1);
            if (var24.field2530 != null && var24.field2530[0][0] == 5) {
                int var25 = var24.field2530[0][1];
                class154.field2665[var25] = 1 - class154.field2665[var25];
                method502(var25);
            }
        }
        if (arg2 == 9) {
            class30 var26 = field292[arg3];
            if (var26 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(125);
                field382.method2134(class124.field1976[82] ? 1 : 0);
                field382.method2236(arg3);
            }
        }
        if (arg2 == 19) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(92);
            field382.method2133(class124.field1976[82] ? 1 : 0);
            field382.method2220(Statics.field1454 + arg1);
            field382.method2187(Statics.field1492 + arg0);
            field382.method2220(arg3);
        }
        if (arg2 == 49) {
            class3 var27 = field311[arg3];
            if (var27 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(132);
                field382.method2220(arg3);
                field382.method2133(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field382.method2356(166);
            field382.method2220(arg3);
            field382.method2220(arg0);
            field382.method2150(arg1);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 29) {
            field382.method2356(20);
            field382.method2100(arg1);
            class152 var28 = Statics.method480(arg1);
            if (var28.field2530 != null && var28.field2530[0][0] == 5) {
                int var29 = var28.field2530[0][1];
                if (class154.field2665[var29] != var28.field2632[0]) {
                    class154.field2665[var29] = var28.field2632[0];
                    method502(var29);
                }
            }
        }
        if (arg2 == 47) {
            class3 var30 = field311[arg3];
            if (var30 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(193);
                field382.method2133(class124.field1976[82] ? 1 : 0);
                field382.method2236(arg3);
            }
        }
        if (arg2 == 1001) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(95);
            field382.method2220(Statics.field1454 + arg1);
            field382.method2098(Statics.field1492 + arg0);
            field382.method2098(arg3 >> 14 & 0x7FFF);
            field382.method2132(class124.field1976[82] ? 1 : 0);
        }
        if (arg2 == 21) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(30);
            field382.method2220(arg3);
            field382.method2098(Statics.field1454 + arg1);
            field382.method2220(Statics.field1492 + arg0);
            field382.method2133(class124.field1976[82] ? 1 : 0);
        }
        if (arg2 == 40) {
            field382.method2356(245);
            field382.method2098(arg3);
            field382.method2187(arg0);
            field382.method2152(arg1);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 36) {
            field382.method2356(93);
            field382.method2220(arg0);
            field382.method2152(arg1);
            field382.method2187(arg3);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 18) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(135);
            field382.method2098(Statics.field1492 + arg0);
            field382.method2098(arg3);
            field382.method2220(Statics.field1454 + arg1);
            field382.method2134(class124.field1976[82] ? 1 : 0);
        }
        if (arg2 == 2) {
            field360 = arg6;
            field361 = arg7;
            field445 = 2;
            field363 = 0;
            field392 = arg0;
            field485 = arg1;
            field382.method2356(97);
            field382.method2220(field412);
            field382.method2098(Statics.field1454 + arg1);
            field382.method2100(Statics.field561);
            field382.method2220(Statics.field1492 + arg0);
            field382.method2134(class124.field1976[82] ? 1 : 0);
            field382.method2098(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 11) {
            class30 var31 = field292[arg3];
            if (var31 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(101);
                field382.method2187(arg3);
                field382.method2132(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 7) {
            class30 var32 = field292[arg3];
            if (var32 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(165);
                field382.method2149(Statics.field233);
                field382.method2236(arg3);
                field382.method2132(class124.field1976[82] ? 1 : 0);
                field382.method2220(Statics.field1355);
                field382.method2220(Statics.field565);
            }
        }
        if (arg2 == 42) {
            field382.method2356(117);
            field382.method2220(arg0);
            field382.method2220(arg3);
            field382.method2149(arg1);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 51) {
            class3 var33 = field311[arg3];
            if (var33 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(38);
                field382.method2133(class124.field1976[82] ? 1 : 0);
                field382.method2187(arg3);
            }
        }
        if (arg2 == 39) {
            field382.method2356(226);
            field382.method2149(arg1);
            field382.method2220(arg0);
            field382.method2220(arg3);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 10) {
            class30 var34 = field292[arg3];
            if (var34 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(71);
                field382.method2097(class124.field1976[82] ? 1 : 0);
                field382.method2220(arg3);
            }
        }
        if (arg2 == 50) {
            class3 var35 = field311[arg3];
            if (var35 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(172);
                field382.method2098(arg3);
                field382.method2097(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field420 == null) {
            method1077(arg1, arg0);
            field420 = class152.method696(arg1, arg0);
            method3127(field420);
        }
        if (arg2 == 41) {
            field382.method2356(157);
            field382.method2220(arg3);
            field382.method2152(arg1);
            field382.method2098(arg0);
            field403 = 0;
            Statics.field158 = Statics.method480(arg1);
            field307 = arg0;
        }
        if (arg2 == 46) {
            class3 var36 = field311[arg3];
            if (var36 != null) {
                field360 = arg6;
                field361 = arg7;
                field445 = 2;
                field363 = 0;
                field392 = arg0;
                field485 = arg1;
                field382.method2356(23);
                field382.method2097(class124.field1976[82] ? 1 : 0);
                field382.method2187(arg3);
            }
        }
        if (arg2 == 26) {
            method2820();
        }
        if (arg2 == 58) {
            class152 var37 = class152.method696(arg1, arg0);
            if (var37 != null) {
                field382.method2356(190);
                field382.method2220(field413);
                field382.method2187(var37.field2638);
                field382.method2100(Statics.field561);
                field382.method2236(field412);
                field382.method2150(arg1);
                field382.method2220(arg0);
            }
        }
        if (field409 != 0) {
            field409 = 0;
            method3127(Statics.method480(Statics.field233));
        }
        if (field411) {
            method561();
        }
        if (Statics.field158 != null && field403 == 0) {
            method3127(Statics.field158);
        }
    }

    @ObfuscatedName("al.bm(I)V")
    public static void method561() {
        if (!field411) {
            return;
        }
        class152 var0 = class152.method696(Statics.field561, field412);
        if (var0 != null && var0.field2652 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field8 = var0.field2652;
            class32.method1033(var1);
        }
        field411 = false;
        method3127(var0);
    }

    @ObfuscatedName("bh.bt(IIB)V")
    public static void method1077(int arg0, int arg1) {
        field382.method2356(65);
        field382.method2187(arg1);
        field382.method2149(arg0);
    }

    @ObfuscatedName("az.bx(IIIILjava/lang/String;I)V")
    public static void method669(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class152 var5 = class152.method696(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2621 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field1 = arg0;
            var6.field10 = arg4;
            var6.field8 = var5.field2621;
            class32.method1033(var6);
        }
        boolean var7 = true;
        if (var5.field2585 > 0) {
            var7 = method815(var5);
        }
        if (!var7 || !class156.method1972(method2818(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field382.method2356(122);
            field382.method2100(arg1);
            field382.method2098(arg2);
            field382.method2098(arg3);
        }
        if (arg0 == 2) {
            field382.method2356(206);
            field382.method2100(arg1);
            field382.method2098(arg2);
            field382.method2098(arg3);
        }
        if (arg0 == 3) {
            field382.method2356(40);
            field382.method2100(arg1);
            field382.method2098(arg2);
            field382.method2098(arg3);
        }
        if (arg0 == 4) {
            field382.method2356(177);
            field382.method2100(arg1);
            field382.method2098(arg2);
            field382.method2098(arg3);
        }
        if (arg0 == 5) {
            field382.method2356(254);
            field382.method2100(arg1);
            field382.method2098(arg2);
            field382.method2098(arg3);
        }
        if (arg0 == 6) {
            field382.method2356(184);
            field382.method2100(arg1);
            field382.method2098(arg2);
            field382.method2098(arg3);
        }
        if (arg0 == 7) {
            field382.method2356(209);
            field382.method2100(arg1);
            field382.method2098(arg2);
            field382.method2098(arg3);
        }
        if (arg0 == 8) {
            field382.method2356(61);
            field382.method2100(arg1);
            field382.method2098(arg2);
            field382.method2098(arg3);
        }
        if (arg0 == 9) {
            field382.method2356(41);
            field382.method2100(arg1);
            field382.method2098(arg2);
            field382.method2098(arg3);
        }
        if (arg0 == 10) {
            field382.method2356(151);
            field382.method2100(arg1);
            field382.method2098(arg2);
            field382.method2098(arg3);
        }
    }

    @ObfuscatedName("k.ch(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method3(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field396 || field398 >= 500) {
            return;
        }
        field498[field398] = arg0;
        field404[field398] = arg1;
        field401[field398] = arg2;
        field402[field398] = arg3;
        field384[field398] = arg4;
        field492[field398] = arg5;
        field398++;
    }

    @ObfuscatedName("e.cd(I)V")
    public static void method467() {
        for (int var0 = 0; var0 < field398; var0++) {
            int var1 = field401[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field398 - 1) {
                    for (int var3 = var0; var3 < field398 - 1; var3++) {
                        field498[var3] = field498[var3 + 1];
                        field404[var3] = field404[var3 + 1];
                        field401[var3] = field401[var3 + 1];
                        field402[var3] = field402[var3 + 1];
                        field384[var3] = field384[var3 + 1];
                        field492[var3] = field492[var3 + 1];
                    }
                }
                field398--;
            }
        }
    }

    @ObfuscatedName("n.cr(II)Ljava/lang/String;")
    public static String method119(int arg0) {
        return field404[arg0].length() > 0 ? field498[arg0] + class142.field2308 + field404[arg0] : field498[arg0];
    }

    @ObfuscatedName("ap.cj(Laj;IIIB)V")
    public static final void method739(class35 arg0, int arg1, int arg2, int arg3) {
        if (field398 >= 400) {
            return;
        }
        if (arg0.field800 != null) {
            arg0 = arg0.method601();
        }
        if (arg0 == null || !arg0.field829 || arg0.field831 && field424 != arg1) {
            return;
        }
        String var4 = arg0.field801;
        if (arg0.field818 != 0) {
            int var6 = arg0.field818;
            int var7 = Statics.field555.field32;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method3305(16711680);
            } else if (var8 < -6) {
                var9 = class2.method3305(16723968);
            } else if (var8 < -3) {
                var9 = class2.method3305(16740352);
            } else if (var8 < 0) {
                var9 = class2.method3305(16756736);
            } else if (var8 > 9) {
                var9 = class2.method3305(65280);
            } else if (var8 > 6) {
                var9 = class2.method3305(4259584);
            } else if (var8 > 3) {
                var9 = class2.method3305(8453888);
            } else if (var8 > 0) {
                var9 = class2.method3305(12648192);
            } else {
                var9 = class2.method3305(16776960);
            }
            var4 = var4 + var9 + " " + class2.field19 + class142.field2304 + arg0.field818 + class2.field20;
        }
        if (field409 == 1) {
            method3(class142.field2334, field410 + " " + class2.field21 + " " + class2.method3305(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field411) {
            String[] var10 = arg0.field826;
            if (field427) {
                var10 = method140(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class142.field2229)) {
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
                        method3(var10[var11], class2.method3305(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class142.field2229)) {
                        short var14 = 0;
                        if (field279 == class18.field516 || field279 == class18.field523 && arg0.field818 > Statics.field555.field32) {
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
                        method3(var10[var13], class2.method3305(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method3(class142.field2299, class2.method3305(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2595 & 0x2) == 2) {
            method3(field442, field399 + " " + class2.field21 + " " + class2.method3305(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("d.cy(Ly;IIII)V")
    public static final void method127(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field555 == arg0 || field398 >= 400) {
            return;
        }
        String var9;
        if (arg0.field33 == 0) {
            String var4 = arg0.field43;
            int var5 = arg0.field32;
            int var6 = Statics.field555.field32;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method3305(16711680);
            } else if (var7 < -6) {
                var8 = class2.method3305(16723968);
            } else if (var7 < -3) {
                var8 = class2.method3305(16740352);
            } else if (var7 < 0) {
                var8 = class2.method3305(16756736);
            } else if (var7 > 9) {
                var8 = class2.method3305(65280);
            } else if (var7 > 6) {
                var8 = class2.method3305(4259584);
            } else if (var7 > 3) {
                var8 = class2.method3305(8453888);
            } else if (var7 > 0) {
                var8 = class2.method3305(12648192);
            } else {
                var8 = class2.method3305(16776960);
            }
            var9 = var4 + var8 + " " + class2.field19 + class142.field2304 + arg0.field32 + class2.field20;
        } else {
            var9 = arg0.field43 + " " + class2.field19 + class142.field2305 + arg0.field33 + class2.field20;
        }
        if (field409 == 1) {
            method3(class142.field2334, field410 + " " + class2.field21 + " " + class2.method3305(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field411) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field328[var10] != null) {
                    short var11 = 0;
                    if (field328[var10].equalsIgnoreCase(class142.field2229)) {
                        if (field279 == class18.field516 || field279 == class18.field523 && arg0.field32 > Statics.field555.field32) {
                            var11 = 2000;
                        }
                        if (Statics.field555.field38 != 0 && arg0.field38 != 0) {
                            if (Statics.field555.field38 == arg0.field38) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field326[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field383[var10] + var11;
                    method3(field328[var10], class2.method3305(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2595 & 0x8) == 8) {
            method3(field442, field399 + " " + class2.field21 + " " + class2.method3305(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field398; var14++) {
            if (field401[var14] == 23) {
                field404[var14] = class2.method3305(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("h.ce(IIIIIIIII)V")
    public static final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class152.method565(arg0)) {
            Statics.field528 = null;
            method3114(Statics.field2634[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field528 != null) {
                method3114(Statics.field528, -1412584499, arg1, arg2, arg3, arg4, Statics.field966, Statics.field2482, arg7);
                Statics.field528 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field460[var8] = true;
            }
        } else {
            field460[arg7] = true;
        }
    }

    @ObfuscatedName("fv.cf([Len;IIIIIIIIB)V")
    public static final void method3114(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1520(arg2, arg3, arg4, arg5);
        class84.method1789();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class152 var10 = arg0[var9];
            if (var10 != null && (var10.field2545 == arg1 || arg1 == -1412584499 && field428 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field265[field458] = var10.field2587 + arg6;
                    field287[field458] = var10.field2540 + arg7;
                    field465[field458] = var10.field2543;
                    field357[field458] = var10.field2544;
                    var11 = ++field458 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2640 = var11;
                var10.field2650 = field261;
                if (!var10.field2533 || !method504(var10)) {
                    if (var10.field2585 > 0) {
                        method1030(var10);
                    }
                    int var12 = var10.field2587 + arg6;
                    int var13 = var10.field2540 + arg7;
                    int var14 = var10.field2556;
                    if (field428 == var10) {
                        if (arg1 != -1412584499 && !var10.field2631) {
                            Statics.field528 = arg0;
                            Statics.field966 = arg6;
                            Statics.field2482 = arg7;
                            continue;
                        }
                        if (field322 && field482) {
                            int var15 = class127.field2011;
                            int var16 = class127.field2008 * -391950985;
                            int var17 = var15 - field430;
                            int var18 = var16 - field368;
                            if (var17 < field308) {
                                var17 = field308;
                            }
                            if (var10.field2543 + var17 > field308 + field444.field2543) {
                                var17 = field308 + field444.field2543 - var10.field2543;
                            }
                            if (var18 < field435) {
                                var18 = field435;
                            }
                            if (var10.field2544 + var18 > field435 + field444.field2544) {
                                var18 = field435 + field444.field2544 - var10.field2544;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2631) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2536 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2536 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2543 + var12;
                        int var26 = var10.field2544 + var13;
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
                        int var29 = var10.field2543 + var12;
                        int var30 = var10.field2544 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2533 || var19 < var21 && var20 < var22) {
                        if (var10.field2585 != 0) {
                            if (var10.field2585 == 1337) {
                                field433 = var12;
                                field406 = var13;
                                method120(var12, var13, var10.field2543, var10.field2544);
                                class73.method1520(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2585 == 1338) {
                                method742(var12, var13, var11);
                                class73.method1520(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2536 == 0) {
                            if (!var10.field2533 && method504(var10) && Statics.field1676 != var10) {
                                continue;
                            }
                            if (!var10.field2533) {
                                if (var10.field2553 > var10.field2550 - var10.field2544) {
                                    var10.field2553 = var10.field2550 - var10.field2544;
                                }
                                if (var10.field2553 < 0) {
                                    var10.field2553 = 0;
                                }
                            }
                            method3114(arg0, var10.field2549, var19, var20, var21, var22, var12 - var10.field2547, var13 - var10.field2553, var11);
                            if (var10.field2604 != null) {
                                method3114(var10.field2604, var10.field2549, var19, var20, var21, var22, var12 - var10.field2547, var13 - var10.field2553, var11);
                            }
                            class4 var31 = (class4) field417.method3163((long) var10.field2549);
                            if (var31 != null) {
                                method465(var31.field56, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class73.method1520(arg2, arg3, arg4, arg5);
                            class84.method1789();
                        }
                        if (field346[var11] || field467 > 1) {
                            if (var10.field2536 == 0 && !var10.field2533 && var10.field2550 > var10.field2544) {
                                method1865(var10.field2543 + var12, var13, var10.field2553, var10.field2544, var10.field2550);
                            }
                            if (var10.field2536 != 1) {
                                if (var10.field2536 == 2) {
                                    int var32 = 0;
                                    for (int var33 = 0; var33 < var10.field2544; var33++) {
                                        for (int var34 = 0; var34 < var10.field2543; var34++) {
                                            int var35 = (var10.field2563 + 32) * var34 + var12;
                                            int var36 = (var10.field2588 + 32) * var33 + var13;
                                            if (var32 < 20) {
                                                var35 += var10.field2614[var32];
                                                var36 += var10.field2626[var32];
                                            }
                                            if (var10.field2636[var32] > 0) {
                                                boolean var37 = false;
                                                boolean var38 = false;
                                                int var39 = var10.field2636[var32] - 1;
                                                if (var35 + 32 > arg2 && var35 < arg4 && var36 + 32 > arg3 && var36 < arg5 || Statics.field1032 == var10 && field366 == var32) {
                                                    class72 var40;
                                                    if (field409 == 1 && Statics.field1355 == var32 && Statics.field233 == var10.field2549) {
                                                        var40 = class45.method736(var39, var10.field2637[var32], 2, 0, false);
                                                    } else {
                                                        var40 = class45.method736(var39, var10.field2637[var32], 1, 3153952, false);
                                                    }
                                                    if (var40 == null) {
                                                        method3127(var10);
                                                    } else if (Statics.field1032 == var10 && field366 == var32) {
                                                        int var41 = class127.field2011 - field505;
                                                        int var42 = class127.field2008 * -391950985 - field306;
                                                        if (var41 < 5 && var41 > -5) {
                                                            var41 = 0;
                                                        }
                                                        if (var42 < 5 && var42 > -5) {
                                                            var42 = 0;
                                                        }
                                                        if (field365 < 5) {
                                                            var41 = 0;
                                                            var42 = 0;
                                                        }
                                                        var40.method1452(var35 + var41, var36 + var42, 128);
                                                        if (arg1 != -1) {
                                                            class152 var43 = arg0[arg1 & 0xFFFF];
                                                            if (var36 + var42 < class73.field1313 && var43.field2553 > 0) {
                                                                int var44 = field330 * (class73.field1313 - var36 - var42) / 3;
                                                                if (var44 > field330 * 10) {
                                                                    var44 = field330 * 10;
                                                                }
                                                                if (var44 > var43.field2553) {
                                                                    var44 = var43.field2553;
                                                                }
                                                                var43.field2553 -= var44;
                                                                field306 += var44;
                                                                method3127(var43);
                                                            }
                                                            if (var36 + var42 + 32 > class73.field1316 && var43.field2553 < var43.field2550 - var43.field2544) {
                                                                int var45 = field330 * (var36 + var42 + 32 - class73.field1316) / 3;
                                                                if (var45 > field330 * 10) {
                                                                    var45 = field330 * 10;
                                                                }
                                                                if (var45 > var43.field2550 - var43.field2544 - var43.field2553) {
                                                                    var45 = var43.field2550 - var43.field2544 - var43.field2553;
                                                                }
                                                                var43.field2553 += var45;
                                                                field306 -= var45;
                                                                method3127(var43);
                                                            }
                                                        }
                                                    } else if (Statics.field158 == var10 && field307 == var32) {
                                                        var40.method1452(var35, var36, 128);
                                                    } else {
                                                        var40.method1512(var35, var36);
                                                    }
                                                }
                                            } else if (var10.field2591 != null && var32 < 20) {
                                                class72 var46 = var10.method2830(var32);
                                                if (var46 != null) {
                                                    var46.method1512(var35, var36);
                                                } else if (class152.field2532) {
                                                    method3127(var10);
                                                }
                                            }
                                            var32++;
                                        }
                                    }
                                } else if (var10.field2536 == 3) {
                                    int var47;
                                    if (method124(var10)) {
                                        var47 = var10.field2642;
                                        if (Statics.field1676 == var10 && var10.field2554 != 0) {
                                            var47 = var10.field2554;
                                        }
                                    } else {
                                        var47 = var10.field2551;
                                        if (Statics.field1676 == var10 && var10.field2598 != 0) {
                                            var47 = var10.field2598;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2555) {
                                            class73.method1527(var12, var13, var10.field2543, var10.field2544, var47);
                                        } else {
                                            class73.method1544(var12, var13, var10.field2543, var10.field2544, var47);
                                        }
                                    } else if (var10.field2555) {
                                        class73.method1525(var12, var13, var10.field2543, var10.field2544, var47, 256 - (var14 & 0xFF));
                                    } else {
                                        class73.method1545(var12, var13, var10.field2543, var10.field2544, var47, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2536 == 4) {
                                    class193 var48 = var10.method2833();
                                    if (var48 != null) {
                                        String var49 = var10.field2646;
                                        int var50;
                                        if (method124(var10)) {
                                            var50 = var10.field2642;
                                            if (Statics.field1676 == var10 && var10.field2554 != 0) {
                                                var50 = var10.field2554;
                                            }
                                            if (var10.field2582.length() > 0) {
                                                var49 = var10.field2582;
                                            }
                                        } else {
                                            var50 = var10.field2551;
                                            if (Statics.field1676 == var10 && var10.field2598 != 0) {
                                                var50 = var10.field2598;
                                            }
                                        }
                                        if (var10.field2533 && var10.field2638 != -1) {
                                            class45 var51 = class45.method1864(var10.field2638);
                                            var49 = var51.field1020;
                                            if (var49 == null) {
                                                var49 = "null";
                                            }
                                            if ((var51.field1031 == 1 || var10.field2639 != 1) && var10.field2639 != -1) {
                                                var49 = class2.method3305(16748608) + var49 + class2.field26 + " " + 'x' + method473(var10.field2639);
                                            }
                                        }
                                        if (field420 == var10) {
                                            class142 var10000 = (class142) null;
                                            var49 = class142.field2231;
                                            var50 = var10.field2551;
                                        }
                                        if (!var10.field2533) {
                                            var49 = method129(var49, var10);
                                        }
                                        var48.method3352(var49, var12, var13, var10.field2543, var10.field2544, var50, var10.field2586 ? 0 : -1, var10.field2584, var10.field2539, var10.field2526);
                                    } else if (class152.field2532) {
                                        method3127(var10);
                                    }
                                } else if (var10.field2536 == 5) {
                                    if (var10.field2533) {
                                        class72 var53;
                                        if (var10.field2638 == -1) {
                                            var53 = var10.method2822(false);
                                        } else {
                                            var53 = class45.method736(var10.field2638, var10.field2639, var10.field2562, var10.field2605, false);
                                        }
                                        if (var53 != null) {
                                            int var54 = var53.field1303;
                                            int var55 = var53.field1305;
                                            if (var10.field2571) {
                                                class73.method1521(var12, var13, var10.field2543 + var12, var10.field2544 + var13);
                                                int var56 = (var10.field2543 + (var54 - 1)) / var54;
                                                int var57 = (var10.field2544 + (var55 - 1)) / var55;
                                                for (int var58 = 0; var58 < var56; var58++) {
                                                    for (int var59 = 0; var59 < var57; var59++) {
                                                        if (var10.field2560 != 0) {
                                                            var53.method1458(var54 / 2 + var54 * var58 + var12, var55 / 2 + var55 * var59 + var13, var10.field2560, 4096);
                                                        } else if (var14 == 0) {
                                                            var53.method1512(var54 * var58 + var12, var55 * var59 + var13);
                                                        } else {
                                                            var53.method1452(var54 * var58 + var12, var55 * var59 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1520(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var60 = var10.field2543 * 4096 / var54;
                                                if (var10.field2560 != 0) {
                                                    var53.method1458(var10.field2543 / 2 + var12, var10.field2544 / 2 + var13, var10.field2560, var60);
                                                } else if (var14 != 0) {
                                                    var53.method1490(var12, var13, var10.field2543, var10.field2544, 256 - (var14 & 0xFF));
                                                } else if (var10.field2543 == var54 && var10.field2544 == var55) {
                                                    var53.method1512(var12, var13);
                                                } else {
                                                    var53.method1448(var12, var13, var10.field2543, var10.field2544);
                                                }
                                            }
                                        } else if (class152.field2532) {
                                            method3127(var10);
                                        }
                                    } else {
                                        class72 var52 = var10.method2822(method124(var10));
                                        if (var52 != null) {
                                            var52.method1512(var12, var13);
                                        } else if (class152.field2532) {
                                            method3127(var10);
                                        }
                                    }
                                } else if (var10.field2536 == 6) {
                                    boolean var61 = method124(var10);
                                    int var62;
                                    if (var61) {
                                        var62 = var10.field2599;
                                    } else {
                                        var62 = var10.field2644;
                                    }
                                    class98 var63 = null;
                                    int var64 = 0;
                                    if (var10.field2638 != -1) {
                                        class45 var65 = class45.method1864(var10.field2638);
                                        if (var65 != null) {
                                            class45 var66 = var65.method909(var10.field2639);
                                            var63 = var66.method858(1);
                                            if (var63 == null) {
                                                method3127(var10);
                                            } else {
                                                var63.method1998();
                                                var64 = var63.field1354 / 2;
                                            }
                                        }
                                    } else if (var10.field2566 == 5) {
                                        if (var10.field2559 == 0) {
                                            var63 = field373.method2899((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var63 = Statics.field555.method24();
                                        }
                                    } else if (var62 == -1) {
                                        var63 = var10.method2831((class38) null, -1, var61, Statics.field555.field29);
                                        if (var63 == null && class152.field2532) {
                                            method3127(var10);
                                        }
                                    } else {
                                        class38 var67 = class38.method102(var62);
                                        var63 = var10.method2831(var67, var10.field2654, var61, Statics.field555.field29);
                                        if (var63 == null && class152.field2532) {
                                            method3127(var10);
                                        }
                                    }
                                    class84.method1792(var10.field2543 / 2 + var12, var10.field2544 / 2 + var13);
                                    int var68 = var10.field2577 * class84.field1470[var10.field2574] >> 16;
                                    int var69 = var10.field2577 * class84.field1491[var10.field2574] >> 16;
                                    if (var63 != null) {
                                        if (var10.field2533) {
                                            var63.method1998();
                                            if (var10.field2579) {
                                                var63.method1993(0, var10.field2612, var10.field2597, var10.field2574, var10.field2572, var10.field2573 + var64 + var68, var10.field2573 + var69, var10.field2577);
                                            } else {
                                                var63.method1992(0, var10.field2612, var10.field2597, var10.field2574, var10.field2572, var10.field2573 + var64 + var68, var10.field2573 + var69);
                                            }
                                        } else {
                                            var63.method1992(0, var10.field2612, 0, var10.field2574, 0, var68, var69);
                                        }
                                    }
                                    class84.method1791();
                                } else {
                                    if (var10.field2536 == 7) {
                                        class193 var70 = var10.method2833();
                                        if (var70 == null) {
                                            if (class152.field2532) {
                                                method3127(var10);
                                            }
                                            continue;
                                        }
                                        int var71 = 0;
                                        for (int var72 = 0; var72 < var10.field2544; var72++) {
                                            for (int var73 = 0; var73 < var10.field2543; var73++) {
                                                if (var10.field2636[var71] > 0) {
                                                    class45 var74 = class45.method1864(var10.field2636[var71] - 1);
                                                    String var75;
                                                    if (var74.field1031 != 1 && var10.field2637[var71] == 1) {
                                                        var75 = class2.method3305(16748608) + var74.field1020 + class2.field26;
                                                    } else {
                                                        var75 = class2.method3305(16748608) + var74.field1020 + class2.field26 + " " + 'x' + method473(var10.field2637[var71]);
                                                    }
                                                    int var76 = (var10.field2563 + 115) * var73 + var12;
                                                    int var77 = (var10.field2588 + 12) * var72 + var13;
                                                    if (var10.field2584 == 0) {
                                                        var70.method3321(var75, var76, var77, var10.field2551, var10.field2586 ? 0 : -1);
                                                    } else if (var10.field2584 == 1) {
                                                        var70.method3323(var75, var10.field2543 / 2 + var76, var77, var10.field2551, var10.field2586 ? 0 : -1);
                                                    } else {
                                                        var70.method3322(var75, var10.field2543 + var76 - 1, var77, var10.field2551, var10.field2586 ? 0 : -1);
                                                    }
                                                }
                                                var71++;
                                            }
                                        }
                                    }
                                    if (var10.field2536 == 8 && Statics.field1273 == var10 && field408 == field407) {
                                        int var78 = 0;
                                        int var79 = 0;
                                        class193 var80 = Statics.field1457;
                                        String var81 = var10.field2646;
                                        String var82 = method129(var81, var10);
                                        while (var82.length() > 0) {
                                            int var83 = var82.indexOf(class2.field22);
                                            String var84;
                                            if (var83 == -1) {
                                                var84 = var82;
                                                var82 = "";
                                            } else {
                                                var84 = var82.substring(0, var83);
                                                var82 = var82.substring(var83 + 4);
                                            }
                                            int var85 = var80.method3375(var84);
                                            if (var85 > var78) {
                                                var78 = var85;
                                            }
                                            var79 += var80.field2919 + 1;
                                        }
                                        var78 += 6;
                                        var79 += 7;
                                        int var86 = var10.field2543 + var12 - 5 - var78;
                                        int var87 = var10.field2544 + var13 + 5;
                                        if (var86 < var12 + 5) {
                                            var86 = var12 + 5;
                                        }
                                        if (var78 + var86 > arg4) {
                                            var86 = arg4 - var78;
                                        }
                                        if (var79 + var87 > arg5) {
                                            var87 = arg5 - var79;
                                        }
                                        class73.method1527(var86, var87, var78, var79, 16777120);
                                        class73.method1544(var86, var87, var78, var79, 0);
                                        String var88 = var10.field2646;
                                        int var89 = var80.field2919 + var87 + 2;
                                        String var90 = method129(var88, var10);
                                        while (var90.length() > 0) {
                                            int var91 = var90.indexOf(class2.field22);
                                            String var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = "";
                                            } else {
                                                var92 = var90.substring(0, var91);
                                                var90 = var90.substring(var91 + 4);
                                            }
                                            var80.method3321(var92, var86 + 3, var89, 0, -1);
                                            var89 += var80.field2919 + 1;
                                        }
                                    }
                                    if (var10.field2536 == 9) {
                                        if (var10.field2557 == 1) {
                                            class73.method1533(var12, var13, var10.field2543 + var12, var10.field2544 + var13, var10.field2551);
                                        } else {
                                            int var93 = var10.field2543 >= 0 ? var10.field2543 : -var10.field2543;
                                            int var94 = var10.field2544 >= 0 ? var10.field2544 : -var10.field2544;
                                            int var95 = var93;
                                            if (var93 < var94) {
                                                var95 = var94;
                                            }
                                            if (var95 != 0) {
                                                int var96 = (var10.field2543 << 16) / var95;
                                                int var97 = (var10.field2544 << 16) / var95;
                                                if (var97 <= var96) {
                                                    var96 = -var96;
                                                } else {
                                                    var97 = -var97;
                                                }
                                                int var98 = var10.field2557 * var97 >> 17;
                                                int var99 = var10.field2557 * var97 + 1 >> 17;
                                                int var100 = var10.field2557 * var96 >> 17;
                                                int var101 = var10.field2557 * var96 + 1 >> 17;
                                                int var102 = var12 + var98;
                                                int var103 = var12 - var99;
                                                int var104 = var10.field2543 + var12 - var99;
                                                int var105 = var10.field2543 + var12 + var98;
                                                int var106 = var13 + var100;
                                                int var107 = var13 - var101;
                                                int var108 = var10.field2544 + var13 - var101;
                                                int var109 = var10.field2544 + var13 + var100;
                                                class84.method1797(var102, var103, var104);
                                                class84.method1829(var106, var107, var108, var102, var103, var104, var10.field2551);
                                                class84.method1797(var102, var104, var105);
                                                class84.method1829(var106, var108, var109, var102, var104, var105, var10.field2551);
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

    @ObfuscatedName("s.ca(Ljava/lang/String;Len;I)Ljava/lang/String;")
    public static String method129(String arg0, class152 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1787(arg1, var2 - 1);
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
                if (Statics.field278 != null) {
                    var8 = class199.method2664(Statics.field278.field2062);
                    if (Statics.field278.field2070 != null) {
                        var8 = (String) Statics.field278.field2070;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("a.cs(IB)Ljava/lang/String;")
    public static final String method473(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method3305(65408) + var1.substring(0, var1.length() - 8) + class142.field2309 + " " + class2.field19 + var1 + class2.field20 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method3305(16777215) + var1.substring(0, var1.length() - 4) + class142.field2311 + " " + class2.field19 + var1 + class2.field20 + class2.field26;
        } else {
            return " " + class2.method3305(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("af.cc(Len;IIIIIII)V")
    public static final void method851(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field335) {
            field336 = 32;
        } else {
            field336 = 0;
        }
        field335 = false;
        if (class127.field2018 == 1 || !Statics.field1294 && class127.field2018 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2553 -= 4;
                method3127(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2553 += 4;
                method3127(arg0);
            } else if (arg5 >= arg1 - field336 && arg5 < field336 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2553 = (arg4 - arg3) * var8 / var9;
                method3127(arg0);
                field335 = true;
            }
        }
        if (field453 == 0) {
            return;
        }
        int var10 = arg0.field2543;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2553 += field453 * 45;
            method3127(arg0);
        }
    }

    @ObfuscatedName("cs.cx(IIIIIB)V")
    public static final void method1865(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field68[0].method1576(arg0, arg1);
        Statics.field68[1].method1576(arg0, arg1 + arg3 - 16);
        class73.method1527(arg0, arg1 + 16, 16, arg3 - 32, field284);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1527(arg0, arg1 + 16 + var6, 16, var5, field332);
        class73.method1528(arg0, arg1 + 16 + var6, var5, field334);
        class73.method1528(arg0 + 1, arg1 + 16 + var6, var5, field334);
        class73.method1529(arg0, arg1 + 16 + var6, 16, field334);
        class73.method1529(arg0, arg1 + 17 + var6, 16, field334);
        class73.method1528(arg0 + 15, arg1 + 16 + var6, var5, field333);
        class73.method1528(arg0 + 14, arg1 + 17 + var6, var5 - 1, field333);
        class73.method1529(arg0, arg1 + 15 + var6 + var5, 16, field333);
        class73.method1529(arg0 + 1, arg1 + 14 + var6 + var5, 15, field333);
    }

    @ObfuscatedName("n.ck(Len;I)Z")
    public static final boolean method124(class152 arg0) {
        if (arg0.field2645 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2645.length; var1++) {
            int var2 = method1787(arg0, var1);
            int var3 = arg0.field2632[var1];
            if (arg0.field2645[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2645[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2645[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cj.ci(Len;II)I")
    public static final int method1787(class152 arg0, int arg1) {
        if (arg0.field2530 == null || arg1 >= arg0.field2530.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2530[arg1];
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
                    var7 = field324[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field502[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field312[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class152 var11 = Statics.method480(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method1864(var12).field1057 || field256)) {
                        for (int var13 = 0; var13 < var11.field2636.length; var13++) {
                            if (var12 + 1 == var11.field2636[var13]) {
                                var7 += var11.field2637[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class154.field2665[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2130[field502[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class154.field2665[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field555.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2129[var14]) {
                            var7 += field502[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class152 var17 = Statics.method480(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method1864(var18).field1057 || field256)) {
                        for (int var19 = 0; var19 < var17.field2636.length; var19++) {
                            if (var18 + 1 == var17.field2636[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field421;
                }
                if (var6 == 12) {
                    var7 = field488;
                }
                if (var6 == 13) {
                    int var20 = class154.field2665[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class154.method2548(var22);
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
                    var7 = (Statics.field555.field730 >> 7) + Statics.field1492;
                }
                if (var6 == 19) {
                    var7 = (Statics.field555.field780 >> 7) + Statics.field1454;
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

    @ObfuscatedName("v.cl(Len;III)V")
    public static final void method143(class152 arg0, int arg1, int arg2) {
        if (arg0.field2537 == 1) {
            method3(arg0.field2630, "", 24, 0, 0, arg0.field2549);
        }
        if (arg0.field2537 == 2 && !field411) {
            String var3 = method1078(arg0);
            if (var3 != null) {
                method3(var3, class2.method3305(65280) + arg0.field2529, 25, 0, -1, arg0.field2549);
            }
        }
        if (arg0.field2537 == 3) {
            method3(class142.field2307, "", 26, 0, 0, arg0.field2549);
        }
        if (arg0.field2537 == 4) {
            method3(arg0.field2630, "", 28, 0, 0, arg0.field2549);
        }
        if (arg0.field2537 == 5) {
            method3(arg0.field2630, "", 29, 0, 0, arg0.field2549);
        }
        if (arg0.field2537 == 6 && field420 == null) {
            method3(arg0.field2630, "", 30, 0, -1, arg0.field2549);
        }
        if (arg0.field2536 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2544; var5++) {
                for (int var6 = 0; var6 < arg0.field2543; var6++) {
                    int var7 = (arg0.field2563 + 32) * var6;
                    int var8 = (arg0.field2588 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2614[var4];
                        var8 += arg0.field2626[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field474 = var4;
                        Statics.field2722 = arg0;
                        if (arg0.field2636[var4] > 0) {
                            class45 var9 = class45.method1864(arg0.field2636[var4] - 1);
                            if (field409 == 1 && class156.method1337(method2818(arg0))) {
                                if (Statics.field233 != arg0.field2549 || Statics.field1355 != var4) {
                                    method3(class142.field2334, field410 + " " + class2.field21 + " " + class2.method3305(16748608) + var9.field1020, 31, var9.field1018, var4, arg0.field2549);
                                }
                            } else if (!field411 || !class156.method1337(method2818(arg0))) {
                                String[] var10 = var9.field1021;
                                if (field427) {
                                    var10 = method140(var10);
                                }
                                if (class156.method1337(method2818(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method3(var10[var11], class2.method3305(16748608) + var9.field1020, var12, var9.field1018, var4, arg0.field2549);
                                        } else if (var11 == 4) {
                                            method3(class142.field2150, class2.method3305(16748608) + var9.field1020, 37, var9.field1018, var4, arg0.field2549);
                                        }
                                    }
                                }
                                if (Statics.method2791(method2818(arg0))) {
                                    method3(class142.field2334, class2.method3305(16748608) + var9.field1020, 38, var9.field1018, var4, arg0.field2549);
                                }
                                if (class156.method1337(method2818(arg0)) && var10 != null) {
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
                                            method3(var10[var13], class2.method3305(16748608) + var9.field1020, var14, var9.field1018, var4, arg0.field2549);
                                        }
                                    }
                                }
                                String[] var15 = arg0.field2576;
                                if (field427) {
                                    var15 = method140(var15);
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
                                            method3(var15[var16], class2.method3305(16748608) + var9.field1020, var17, var9.field1018, var4, arg0.field2549);
                                        }
                                    }
                                }
                                method3(class142.field2299, class2.method3305(16748608) + var9.field1020, 1005, var9.field1018, var4, arg0.field2549);
                            } else if ((Statics.field2595 & 0x10) == 16) {
                                method3(field442, field399 + " " + class2.field21 + " " + class2.method3305(16748608) + var9.field1020, 32, var9.field1018, var4, arg0.field2549);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2533) {
            return;
        }
        if (field411) {
            int var18 = method2818(arg0);
            boolean var19 = (var18 >> 21 & 0x1) != 0;
            if (var19 && (Statics.field2595 & 0x20) == 32) {
                method3(field442, field399 + " " + class2.field21 + " " + arg0.field2594, 58, 0, arg0.field2535, arg0.field2549);
            }
            return;
        }
        for (int var20 = 9; var20 >= 5; var20--) {
            String var21;
            if (!class156.method1972(method2818(arg0), var20) && arg0.field2621 == null) {
                var21 = null;
            } else if (arg0.field2552 == null || arg0.field2552.length <= var20 || arg0.field2552[var20] == null || arg0.field2552[var20].trim().length() == 0) {
                var21 = null;
            } else {
                var21 = arg0.field2552[var20];
            }
            if (var21 != null) {
                method3(var21, arg0.field2594, 1007, var20 + 1, arg0.field2535, arg0.field2549);
            }
        }
        String var23 = method1078(arg0);
        if (var23 != null) {
            method3(var23, arg0.field2594, 25, 0, arg0.field2535, arg0.field2549);
        }
        for (int var24 = 4; var24 >= 0; var24--) {
            String var25 = method2559(arg0, var24);
            if (var25 != null) {
                method3(var25, arg0.field2594, 57, var24 + 1, arg0.field2535, arg0.field2549);
            }
        }
        int var26 = method2818(arg0);
        boolean var27 = (var26 & 0x1) != 0;
        if (var27) {
            method3(class142.field2232, "", 30, 0, arg0.field2535, arg0.field2549);
        }
    }

    @ObfuscatedName("ex.cb([Len;IIIIIIIS)V")
    public static final void method2660(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class152 var9 = arg0[var8];
            if (var9 != null && (!var9.field2533 || var9.field2536 == 0 || var9.field2601 || method2818(var9) != 0 || field444 == var9) && var9.field2545 == arg1 && (!var9.field2533 || !method504(var9))) {
                int var10 = var9.field2587 + arg6;
                int var11 = var9.field2540 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2536 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2536 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2543 + var10;
                    int var19 = var9.field2544 + var11;
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
                    int var22 = var9.field2543 + var10;
                    int var23 = var9.field2544 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field428 == var9) {
                    field436 = true;
                    field364 = var10;
                    field438 = var11;
                }
                if (!var9.field2533 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2011;
                    int var25 = class127.field2008 * -391950985;
                    if (class127.field2017 != 0) {
                        var24 = class127.field2014;
                        var25 = class127.field2019;
                    }
                    if (var9.field2585 == 1337) {
                        method3127(var9);
                        if (!field264 && !field396 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field409 == 0 && !field411) {
                                method3(class142.field2303, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            for (int var27 = 0; var27 < class98.field1758; var27++) {
                                int var28 = class98.field1760[var27];
                                int var29 = var28 & 0x7F;
                                int var30 = var28 >> 7 & 0x7F;
                                int var31 = var28 >> 29 & 0x3;
                                int var32 = var28 >> 14 & 0x7FFF;
                                if (var26 != var28) {
                                    var26 = var28;
                                    if (var31 == 2 && Statics.field199.method1637(Statics.field207, var29, var30, var28) >= 0) {
                                        class36 var33 = class36.method147(var32);
                                        if (var33.field879 != null) {
                                            var33 = var33.method636();
                                        }
                                        if (var33 == null) {
                                            continue;
                                        }
                                        if (field409 == 1) {
                                            method3(class142.field2334, field410 + " " + class2.field21 + " " + class2.method3305(65535) + var33.field871, 1, var28, var29, var30);
                                        } else if (!field411) {
                                            String[] var34 = var33.field856;
                                            if (field427) {
                                                var34 = method140(var34);
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
                                                        method3(var34[var35], class2.method3305(65535) + var33.field871, var36, var28, var29, var30);
                                                    }
                                                }
                                            }
                                            method3(class142.field2299, class2.method3305(65535) + var33.field871, 1002, var33.field859 << 14, var29, var30);
                                        } else if ((Statics.field2595 & 0x4) == 4) {
                                            method3(field442, field399 + " " + class2.field21 + " " + class2.method3305(65535) + var33.field871, 2, var28, var29, var30);
                                        }
                                    }
                                    if (var31 == 1) {
                                        class30 var37 = field292[var32];
                                        if (var37 == null) {
                                            continue;
                                        }
                                        if (var37.field698.field823 == 1 && (var37.field730 & 0x7F) == 64 && (var37.field780 & 0x7F) == 64) {
                                            for (int var38 = 0; var38 < field293; var38++) {
                                                class30 var39 = field292[field294[var38]];
                                                if (var39 != null && var37 != var39 && var39.field698.field823 == 1 && var37.field730 == var39.field730 && var37.field780 == var39.field780) {
                                                    method739(var39.field698, field294[var38], var29, var30);
                                                }
                                            }
                                            for (int var40 = 0; var40 < field374; var40++) {
                                                class3 var41 = field311[field317[var40]];
                                                if (var41 != null && var37.field730 == var41.field730 && var37.field780 == var41.field780) {
                                                    method127(var41, field317[var40], var29, var30);
                                                }
                                            }
                                        }
                                        method739(var37.field698, var32, var29, var30);
                                    }
                                    if (var31 == 0) {
                                        class3 var42 = field311[var32];
                                        if (var42 == null) {
                                            continue;
                                        }
                                        if ((var42.field730 & 0x7F) == 64 && (var42.field780 & 0x7F) == 64) {
                                            for (int var43 = 0; var43 < field293; var43++) {
                                                class30 var44 = field292[field294[var43]];
                                                if (var44 != null && var44.field698.field823 == 1 && var42.field730 == var44.field730 && var42.field780 == var44.field780) {
                                                    method739(var44.field698, field294[var43], var29, var30);
                                                }
                                            }
                                            for (int var45 = 0; var45 < field374; var45++) {
                                                class3 var46 = field311[field317[var45]];
                                                if (var46 != null && var42 != var46 && var42.field730 == var46.field730 && var42.field780 == var46.field780) {
                                                    method127(var46, field317[var45], var29, var30);
                                                }
                                            }
                                        }
                                        method127(var42, var32, var29, var30);
                                    }
                                    if (var31 == 3) {
                                        class177 var47 = field302[Statics.field207][var29][var30];
                                        if (var47 != null) {
                                            for (class25 var48 = (class25) var47.method3196(); var48 != null; var48 = (class25) var47.method3198()) {
                                                class45 var49 = class45.method1864(var48.field610);
                                                if (field409 == 1) {
                                                    method3(class142.field2334, field410 + " " + class2.field21 + " " + class2.method3305(16748608) + var49.field1020, 16, var48.field610, var29, var30);
                                                } else if (!field411) {
                                                    String[] var50 = var49.field1034;
                                                    if (field427) {
                                                        var50 = method140(var50);
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
                                                            method3(var50[var51], class2.method3305(16748608) + var49.field1020, var52, var48.field610, var29, var30);
                                                        } else if (var51 == 2) {
                                                            method3(class142.field2149, class2.method3305(16748608) + var49.field1020, 20, var48.field610, var29, var30);
                                                        }
                                                    }
                                                    method3(class142.field2299, class2.method3305(16748608) + var49.field1020, 1004, var48.field610, var29, var30);
                                                } else if ((Statics.field2595 & 0x1) == 1) {
                                                    method3(field442, field399 + " " + class2.field21 + " " + class2.method3305(16748608) + var49.field1020, 17, var48.field610, var29, var30);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var9.field2585 != 1338) {
                        if (!field396 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method143(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2536 == 0) {
                            if (!var9.field2533 && method504(var9) && Statics.field1676 != var9) {
                                continue;
                            }
                            method2660(arg0, var9.field2549, var12, var13, var14, var15, var10 - var9.field2547, var11 - var9.field2553);
                            if (var9.field2604 != null) {
                                method2660(var9.field2604, var9.field2549, var12, var13, var14, var15, var10 - var9.field2547, var11 - var9.field2553);
                            }
                            class4 var64 = (class4) field417.method3163((long) var9.field2549);
                            if (var64 != null) {
                                if (var64.field54 == 0 && class127.field2011 >= var12 && class127.field2008 * -391950985 >= var13 && class127.field2011 < var14 && class127.field2008 * -391950985 < var15 && !field396 && !field426) {
                                    field498[0] = class142.field2284;
                                    field404[0] = "";
                                    field401[0] = 1006;
                                    field398 = 1;
                                }
                                int var65 = var64.field56;
                                if (class152.method565(var65)) {
                                    method2660(Statics.field2634[var65], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2533) {
                            if (var9.field2651 && class127.field2011 >= var12 && class127.field2008 * -391950985 >= var13 && class127.field2011 < var14 && class127.field2008 * -391950985 < var15) {
                                for (class1 var66 = (class1) field454.method3195(); var66 != null; var66 = (class1) field454.method3212()) {
                                    if (var66.field2) {
                                        var66.method3275();
                                        var66.field3.field2643 = false;
                                    }
                                }
                                if (Statics.field2516 == 0) {
                                    field428 = null;
                                    field444 = null;
                                }
                                if (!field396) {
                                    field498[0] = class142.field2284;
                                    field404[0] = "";
                                    field401[0] = 1006;
                                    field398 = 1;
                                }
                            }
                            boolean var67;
                            if (class127.field2011 >= var12 && class127.field2008 * -391950985 >= var13 && class127.field2011 < var14 && class127.field2008 * -391950985 < var15) {
                                var67 = true;
                            } else {
                                var67 = false;
                            }
                            boolean var68 = false;
                            if ((class127.field2018 == 1 || !Statics.field1294 && class127.field2018 == 4) && var67) {
                                var68 = true;
                            }
                            boolean var69 = false;
                            if ((class127.field2017 == 1 || !Statics.field1294 && class127.field2017 == 4) && class127.field2014 >= var12 && class127.field2019 >= var13 && class127.field2014 < var14 && class127.field2019 < var15) {
                                var69 = true;
                            }
                            if (var69) {
                                method2301(var9, class127.field2014 - var10, class127.field2019 - var11);
                            }
                            if (field428 != null && field428 != var9 && var67 && class156.method838(method2818(var9))) {
                                field432 = var9;
                            }
                            if (field444 == var9) {
                                field482 = true;
                                field308 = var10;
                                field435 = var11;
                            }
                            if (var9.field2601) {
                                if (var67 && field453 != 0 && var9.field2622 != null) {
                                    class1 var70 = new class1();
                                    var70.field2 = true;
                                    var70.field3 = var9;
                                    var70.field5 = field453;
                                    var70.field8 = var9.field2622;
                                    field454.method3190(var70);
                                }
                                if (field428 != null || Statics.field1032 != null || field396) {
                                    var69 = false;
                                    var68 = false;
                                    var67 = false;
                                }
                                if (!var9.field2534 && var69) {
                                    var9.field2534 = true;
                                    if (var9.field2542 != null) {
                                        class1 var71 = new class1();
                                        var71.field2 = true;
                                        var71.field3 = var9;
                                        var71.field6 = class127.field2014 - var10;
                                        var71.field5 = class127.field2019 - var11;
                                        var71.field8 = var9.field2542;
                                        field454.method3190(var71);
                                    }
                                }
                                if (var9.field2534 && var68 && var9.field2581 != null) {
                                    class1 var72 = new class1();
                                    var72.field2 = true;
                                    var72.field3 = var9;
                                    var72.field6 = class127.field2011 - var10;
                                    var72.field5 = class127.field2008 * -391950985 - var11;
                                    var72.field8 = var9.field2581;
                                    field454.method3190(var72);
                                }
                                if (var9.field2534 && !var68) {
                                    var9.field2534 = false;
                                    if (var9.field2583 != null) {
                                        class1 var73 = new class1();
                                        var73.field2 = true;
                                        var73.field3 = var9;
                                        var73.field6 = class127.field2011 - var10;
                                        var73.field5 = class127.field2008 * -391950985 - var11;
                                        var73.field8 = var9.field2583;
                                        field422.method3190(var73);
                                    }
                                }
                                if (var68 && var9.field2606 != null) {
                                    class1 var74 = new class1();
                                    var74.field2 = true;
                                    var74.field3 = var9;
                                    var74.field6 = class127.field2011 - var10;
                                    var74.field5 = class127.field2008 * -391950985 - var11;
                                    var74.field8 = var9.field2606;
                                    field454.method3190(var74);
                                }
                                if (!var9.field2643 && var67) {
                                    var9.field2643 = true;
                                    if (var9.field2607 != null) {
                                        class1 var75 = new class1();
                                        var75.field2 = true;
                                        var75.field3 = var9;
                                        var75.field6 = class127.field2011 - var10;
                                        var75.field5 = class127.field2008 * -391950985 - var11;
                                        var75.field8 = var9.field2607;
                                        field454.method3190(var75);
                                    }
                                }
                                if (var9.field2643 && var67 && var9.field2608 != null) {
                                    class1 var76 = new class1();
                                    var76.field2 = true;
                                    var76.field3 = var9;
                                    var76.field6 = class127.field2011 - var10;
                                    var76.field5 = class127.field2008 * -391950985 - var11;
                                    var76.field8 = var9.field2608;
                                    field454.method3190(var76);
                                }
                                if (var9.field2643 && !var67) {
                                    var9.field2643 = false;
                                    if (var9.field2609 != null) {
                                        class1 var77 = new class1();
                                        var77.field2 = true;
                                        var77.field3 = var9;
                                        var77.field6 = class127.field2011 - var10;
                                        var77.field5 = class127.field2008 * -391950985 - var11;
                                        var77.field8 = var9.field2609;
                                        field422.method3190(var77);
                                    }
                                }
                                if (var9.field2623 != null) {
                                    class1 var78 = new class1();
                                    var78.field3 = var9;
                                    var78.field8 = var9.field2623;
                                    field455.method3190(var78);
                                }
                                if (var9.field2570 != null && field501 > var9.field2548) {
                                    if (var9.field2615 == null || field501 - var9.field2548 > 32) {
                                        class1 var83 = new class1();
                                        var83.field3 = var9;
                                        var83.field8 = var9.field2570;
                                        field454.method3190(var83);
                                    } else {
                                        label778: for (int var79 = var9.field2548; var79 < field501; var79++) {
                                            int var80 = field441[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var9.field2615.length; var81++) {
                                                if (var9.field2615[var81] == var80) {
                                                    class1 var82 = new class1();
                                                    var82.field3 = var9;
                                                    var82.field8 = var9.field2570;
                                                    field454.method3190(var82);
                                                    break label778;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2548 = field501;
                                }
                                if (var9.field2616 != null && field510 > var9.field2647) {
                                    if (var9.field2617 == null || field510 - var9.field2647 > 32) {
                                        class1 var88 = new class1();
                                        var88.field3 = var9;
                                        var88.field8 = var9.field2616;
                                        field454.method3190(var88);
                                    } else {
                                        label754: for (int var84 = var9.field2647; var84 < field510; var84++) {
                                            int var85 = field443[var84 & 0x1F];
                                            for (int var86 = 0; var86 < var9.field2617.length; var86++) {
                                                if (var9.field2617[var86] == var85) {
                                                    class1 var87 = new class1();
                                                    var87.field3 = var9;
                                                    var87.field8 = var9.field2616;
                                                    field454.method3190(var87);
                                                    break label754;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2647 = field510;
                                }
                                if (var9.field2618 != null && field388 > var9.field2648) {
                                    if (var9.field2619 == null || field388 - var9.field2648 > 32) {
                                        class1 var93 = new class1();
                                        var93.field3 = var9;
                                        var93.field8 = var9.field2618;
                                        field454.method3190(var93);
                                    } else {
                                        label730: for (int var89 = var9.field2648; var89 < field388; var89++) {
                                            int var90 = field260[var89 & 0x1F];
                                            for (int var91 = 0; var91 < var9.field2619.length; var91++) {
                                                if (var9.field2619[var91] == var90) {
                                                    class1 var92 = new class1();
                                                    var92.field3 = var9;
                                                    var92.field8 = var9.field2618;
                                                    field454.method3190(var92);
                                                    break label730;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2648 = field388;
                                }
                                if (field447 > var9.field2649 && var9.field2635 != null) {
                                    class1 var94 = new class1();
                                    var94.field3 = var9;
                                    var94.field8 = var9.field2635;
                                    field454.method3190(var94);
                                }
                                if (field359 > var9.field2649 && var9.field2625 != null) {
                                    class1 var95 = new class1();
                                    var95.field3 = var9;
                                    var95.field8 = var9.field2625;
                                    field454.method3190(var95);
                                }
                                if (field449 > var9.field2649 && var9.field2541 != null) {
                                    class1 var96 = new class1();
                                    var96.field3 = var9;
                                    var96.field8 = var9.field2541;
                                    field454.method3190(var96);
                                }
                                if (field319 > var9.field2649 && var9.field2627 != null) {
                                    class1 var97 = new class1();
                                    var97.field3 = var9;
                                    var97.field8 = var9.field2627;
                                    field454.method3190(var97);
                                }
                                var9.field2649 = field325;
                                if (var9.field2624 != null) {
                                    for (int var98 = 0; var98 < field473; var98++) {
                                        class1 var99 = new class1();
                                        var99.field3 = var9;
                                        var99.field15 = field475[var98];
                                        var99.field9 = field484[var98];
                                        var99.field8 = var9.field2624;
                                        field454.method3190(var99);
                                    }
                                }
                            }
                        }
                        if (!var9.field2533 && field428 == null && Statics.field1032 == null && !field396) {
                            if ((var9.field2633 >= 0 || var9.field2598 != 0) && class127.field2011 >= var12 && class127.field2008 * -391950985 >= var13 && class127.field2011 < var14 && class127.field2008 * -391950985 < var15) {
                                if (var9.field2633 >= 0) {
                                    Statics.field1676 = arg0[var9.field2633];
                                } else {
                                    Statics.field1676 = var9;
                                }
                            }
                            if (var9.field2536 == 8 && class127.field2011 >= var12 && class127.field2008 * -391950985 >= var13 && class127.field2011 < var14 && class127.field2008 * -391950985 < var15) {
                                Statics.field1273 = var9;
                            }
                            if (var9.field2550 > var9.field2544) {
                                method851(var9, var9.field2543 + var10, var11, var9.field2544, var9.field2550, class127.field2011, class127.field2008 * -391950985);
                            }
                        }
                    } else if ((field437 == 0 || field437 == 3) && (class127.field2017 == 1 || !Statics.field1294 && class127.field2017 == 4)) {
                        int var53 = class127.field2014 - 25 - var10;
                        int var54 = class127.field2019 - 5 - var11;
                        if (var53 >= 0 && var54 >= 0 && var53 < 146 && var54 < 151 && (var53 < 0 || var53 > 23 || var54 < 117 || var54 > 142)) {
                            var53 -= 73;
                            var54 -= 75;
                            int var55 = field511 + field463 & 0x7FF;
                            int var56 = class84.field1470[var55];
                            int var57 = class84.field1491[var55];
                            int var58 = (field327 + 256) * var56 >> 8;
                            int var59 = (field327 + 256) * var57 >> 8;
                            int var60 = var53 * var59 + var54 * var58 >> 11;
                            int var61 = var54 * var59 - var53 * var58 >> 11;
                            int var62 = Statics.field555.field730 + var60 >> 7;
                            int var63 = Statics.field555.field780 - var61 >> 7;
                            field382.method2356(163);
                            field382.method2097(18);
                            field382.method2187(Statics.field1492 + var62);
                            field382.method2098(Statics.field1454 + var63);
                            field382.method2134(class124.field1976[82] ? (class124.field1976[81] ? 2 : 1) : 0);
                            field382.method2097(var53);
                            field382.method2097(var54);
                            field382.method2098(field511);
                            field382.method2097(57);
                            field382.method2097(field463);
                            field382.method2097(field327);
                            field382.method2097(89);
                            field382.method2098(Statics.field555.field730);
                            field382.method2098(Statics.field555.field780);
                            field382.method2097(63);
                            field392 = var62;
                            field485 = var63;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.ct(IIS)V")
    public static final void method607(int arg0, int arg1) {
        if (class152.method565(arg0)) {
            method521(Statics.field2634[arg0], arg1);
        }
    }

    @ObfuscatedName("aa.cv([Len;II)V")
    public static final void method521(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2536 == 0) {
                    if (var3.field2604 != null) {
                        method521(var3.field2604, arg1);
                    }
                    class4 var4 = (class4) field417.method3163((long) var3.field2549);
                    if (var4 != null) {
                        method607(var4.field56, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2628 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field8 = var3.field2628;
                    class32.method1033(var5);
                }
                if (arg1 == 1 && var3.field2629 != null) {
                    if (var3.field2535 >= 0) {
                        class152 var6 = Statics.method480(var3.field2549);
                        if (var6 == null || var6.field2604 == null || var3.field2535 >= var6.field2604.length || var6.field2604[var3.field2535] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field8 = var3.field2629;
                    class32.method1033(var7);
                }
            }
        }
    }

    @ObfuscatedName("de.cm(Len;III)V")
    public static final void method2301(class152 arg0, int arg1, int arg2) {
        if (field428 != null || field396 || arg0 == null) {
            return;
        }
        class152 var3 = arg0;
        int var4 = method2818(arg0);
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
                var3 = Statics.method480(var3.field2545);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class152 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2596;
        }
        if (var9 == null) {
            return;
        }
        field428 = arg0;
        class152 var11 = arg0;
        int var12 = method2818(arg0);
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
                var11 = Statics.method480(var11.field2545);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class152 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2596;
        }
        field444 = var17;
        field430 = arg1;
        field368 = arg2;
        Statics.field2516 = 0;
        field322 = false;
        if (field398 > 0) {
            method29(field398 - 1);
        }
        return;
    }

    @ObfuscatedName("w.cp(II)V")
    public static void method29(int arg0) {
        Statics.field695 = new class27();
        Statics.field695.field630 = field384[arg0];
        Statics.field695.field629 = field492[arg0];
        Statics.field695.field639 = field401[arg0];
        Statics.field695.field631 = field402[arg0];
        Statics.field695.field633 = field498[arg0];
    }

    @ObfuscatedName("fe.cw(Len;B)V")
    public static void method3127(class152 arg0) {
        if (field459 == arg0.field2650) {
            field460[arg0.field2640] = true;
        }
    }

    @ObfuscatedName("s.cq([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method140(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("y.co(II)V")
    public static final void method22(int arg0) {
        if (!class152.method565(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2634[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3 != null) {
                var3.field2654 = 0;
                var3.field2641 = 0;
            }
        }
    }

    @ObfuscatedName("o.cz([Len;II)V")
    public static final void method101(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null && var3.field2545 == arg1 && (!var3.field2533 || !method504(var3))) {
                if (var3.field2536 == 0) {
                    if (!var3.field2533 && method504(var3) && Statics.field1676 != var3) {
                        continue;
                    }
                    method101(arg0, var3.field2549);
                    if (var3.field2604 != null) {
                        method101(var3.field2604, var3.field2549);
                    }
                    class4 var4 = (class4) field417.method3163((long) var3.field2549);
                    if (var4 != null) {
                        int var5 = var4.field56;
                        if (class152.method565(var5)) {
                            method101(Statics.field2634[var5], -1);
                        }
                    }
                }
                if (var3.field2536 == 6) {
                    if (var3.field2644 != -1 || var3.field2599 != -1) {
                        boolean var6 = method124(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2599;
                        } else {
                            var7 = var3.field2644;
                        }
                        if (var7 != -1) {
                            class38 var8 = class38.method102(var7);
                            var3.field2641 += field330;
                            while (var3.field2641 > var8.field905[var3.field2654]) {
                                var3.field2641 -= var8.field905[var3.field2654];
                                var3.field2654++;
                                if (var3.field2654 >= var8.field900.length) {
                                    var3.field2654 -= var8.field909;
                                    if (var3.field2654 < 0 || var3.field2654 >= var8.field900.length) {
                                        var3.field2654 = 0;
                                    }
                                }
                                method3127(var3);
                            }
                        }
                    }
                    if (var3.field2578 != 0 && !var3.field2533) {
                        int var9 = var3.field2578 >> 16;
                        int var10 = var3.field2578 << 16 >> 16;
                        int var11 = field330 * var9;
                        int var12 = field330 * var10;
                        var3.field2574 = var3.field2574 + var11 & 0x7FF;
                        var3.field2612 = var3.field2612 + var12 & 0x7FF;
                        method3127(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.cg(IB)V")
    public static final void method502(int arg0) {
        Statics.method27();
        for (class20 var1 = (class20) class20.field546.method3195(); var1 != null; var1 = (class20) class20.field546.method3212()) {
            if (var1.field552 != null) {
                var1.method459();
            }
        }
        int var2 = class46.method113(arg0).field1063;
        if (var2 == 0) {
            return;
        }
        int var3 = class154.field2665[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class84.method1795(0.9D);
                ((class88) Statics.field1487).method1853(0.9D);
            }
            if (var3 == 2) {
                class84.method1795(0.8D);
                ((class88) Statics.field1487).method1853(0.8D);
            }
            if (var3 == 3) {
                class84.method1795(0.7D);
                ((class88) Statics.field1487).method1853(0.7D);
            }
            if (var3 == 4) {
                class84.method1795(0.6D);
                ((class88) Statics.field1487).method1853(0.6D);
            }
            class45.field1036.method3138();
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
            if (field405 != var4) {
                if (field405 == 0 && field267 != -1) {
                    class161.method839(Statics.field2112, field267, 0, var4, false);
                    field489 = false;
                } else if (var4 == 0) {
                    Statics.method413();
                    field489 = false;
                } else {
                    Statics.method2659(var4);
                }
                field405 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field490 = 127;
            }
            if (var3 == 1) {
                field490 = 96;
            }
            if (var3 == 2) {
                field490 = 64;
            }
            if (var3 == 3) {
                field490 = 32;
            }
            if (var3 == 4) {
                field490 = 0;
            }
        }
        if (var2 == 5) {
            field466 = var3;
        }
        if (var2 == 6) {
            field418 = var3;
        }
        if (var2 == 9) {
            field419 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field491 = 127;
            }
            if (var3 == 1) {
                field491 = 96;
            }
            if (var3 == 2) {
                field491 = 64;
            }
            if (var3 == 3) {
                field491 = 32;
            }
            if (var3 == 4) {
                field491 = 0;
            }
        }
        if (var2 == 17) {
            field424 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field279 = (class18) class99.method1850(class18.method2458(), var3);
            if (field279 == null) {
                field279 = class18.field523;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field387 = -1;
        } else {
            field387 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("ay.du(Len;B)V")
    public static final void method1030(class152 arg0) {
        int var1 = arg0.field2585;
        if (var1 == 324) {
            if (field483 == -1) {
                field483 = arg0.field2558;
                field512 = arg0.field2531;
            }
            if (field373.field2674) {
                arg0.field2558 = field483;
            } else {
                arg0.field2558 = field512;
            }
        } else if (var1 == 325) {
            if (field483 == -1) {
                field483 = arg0.field2558;
                field512 = arg0.field2531;
            }
            if (field373.field2674) {
                arg0.field2558 = field512;
            } else {
                arg0.field2558 = field483;
            }
        } else if (var1 == 327) {
            arg0.field2574 = 150;
            arg0.field2612 = (int) (Math.sin((double) field261 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2566 = 5;
            arg0.field2559 = 0;
        } else if (var1 == 328) {
            arg0.field2574 = 150;
            arg0.field2612 = (int) (Math.sin((double) field261 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2566 = 5;
            arg0.field2559 = 1;
        }
    }

    @ObfuscatedName("eq.df(S)V")
    public static final void method2820() {
        field382.method2356(9);
        for (class4 var0 = (class4) field417.method3166(); var0 != null; var0 = (class4) field417.method3168()) {
            if (var0.field54 == 0 || var0.field54 == 3) {
                method740(var0, true);
            }
        }
        if (field420 != null) {
            method3127(field420);
            field420 = null;
        }
    }

    @ObfuscatedName("dn.de(IIII)Lw;")
    public static final class4 method2362(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field56 = arg1;
        var3.field54 = arg2;
        field417.method3164(var3, (long) arg0);
        method22(arg1);
        class32.method507(arg1);
        class152 var4 = Statics.method480(arg0);
        if (var4 != null) {
            method3127(var4);
        }
        if (field420 != null) {
            method3127(field420);
            field420 = null;
        }
        method467();
        if (field416 != -1) {
            method607(field416, 1);
        }
        return var3;
    }

    @ObfuscatedName("ap.dc(Lw;ZI)V")
    public static final void method740(class4 arg0, boolean arg1) {
        int var2 = arg0.field56;
        int var3 = (int) arg0.field2877;
        arg0.method3275();
        if (arg1 && var2 != -1 && Statics.field2668[var2]) {
            Statics.field1350.method2690(var2);
            if (Statics.field2634[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2634[var2].length; var5++) {
                    if (Statics.field2634[var2][var5] != null) {
                        if (Statics.field2634[var2][var5].field2536 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2634[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2634[var2] = null;
                }
                Statics.field2668[var2] = false;
            }
        }
        Statics.method157(var2);
        class152 var6 = Statics.method480(var3);
        if (var6 != null) {
            method3127(var6);
        }
        method467();
        if (field416 != -1) {
            method607(field416, 1);
        }
    }

    @ObfuscatedName("as.ds(Len;B)Z")
    public static final boolean method815(class152 arg0) {
        int var1 = arg0.field2585;
        if (var1 == 205) {
            field254 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field373.method2895(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field373.method2908(var4, var5 == 1);
        }
        if (var1 == 324) {
            field373.method2896(false);
        }
        if (var1 == 325) {
            field373.method2896(true);
        }
        if (var1 == 326) {
            field382.method2356(73);
            field373.method2897(field382);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.dp(IIIB)V")
    public static final void method742(int arg0, int arg1, int arg2) {
        method111();
        class73.method1520(arg0, arg1, Statics.field597.field1317 + arg0, Statics.field597.field1320 + arg1);
        if (field437 == 2 || field437 == 5) {
            class73.method1534(arg0 + 25, arg1 + 5, 0, Statics.field126, Statics.field1293);
        } else {
            int var3 = field511 + field463 & 0x7FF;
            int var4 = Statics.field555.field730 / 32 + 48;
            int var5 = 464 - Statics.field555.field780 / 32;
            Statics.field637.method1456(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field327 + 256, Statics.field126, Statics.field1293);
            for (int var6 = 0; var6 < field480; var6++) {
                int var7 = field481[var6] * 4 + 2 - Statics.field555.field730 / 32;
                int var8 = field390[var6] * 4 + 2 - Statics.field555.field780 / 32;
                method1433(arg0, arg1, var7, var8, field462[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field302[Statics.field207][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field555.field730 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field555.field780 / 32;
                        method1433(arg0, arg1, var12, var13, Statics.field45[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field293; var14++) {
                class30 var15 = field292[field294[var14]];
                if (var15 != null && var15.method12()) {
                    class35 var16 = var15.field698;
                    if (var16 != null && var16.field800 != null) {
                        var16 = var16.method601();
                    }
                    if (var16 != null && var16.field807 && var16.field829) {
                        int var17 = var15.field730 / 32 - Statics.field555.field730 / 32;
                        int var18 = var15.field780 / 32 - Statics.field555.field780 / 32;
                        method1433(arg0, arg1, var17, var18, Statics.field45[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field374; var19++) {
                class3 var20 = field311[field317[var19]];
                if (var20 != null && var20.method12() && !var20.field30) {
                    int var21 = var20.field730 / 32 - Statics.field555.field730 / 32;
                    int var22 = var20.field780 / 32 - Statics.field555.field780 / 32;
                    boolean var23 = false;
                    if (method517(var20.field43, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field172; var25++) {
                        if (var20.field43.equals(Statics.field2404[var25].field566)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field555.field38 != 0 && var20.field38 != 0 && Statics.field555.field38 == var20.field38) {
                        var26 = true;
                    }
                    if (var23) {
                        method1433(arg0, arg1, var21, var22, Statics.field45[3]);
                    } else if (var26) {
                        method1433(arg0, arg1, var21, var22, Statics.field45[4]);
                    } else if (var24) {
                        method1433(arg0, arg1, var21, var22, Statics.field45[5]);
                    } else {
                        method1433(arg0, arg1, var21, var22, Statics.field45[2]);
                    }
                }
            }
            if (field338 != 0 && field261 % 20 < 10) {
                if (field338 == 1 && field270 >= 0 && field270 < field292.length) {
                    class30 var27 = field292[field270];
                    if (var27 != null) {
                        int var28 = var27.field730 / 32 - Statics.field555.field730 / 32;
                        int var29 = var27.field780 / 32 - Statics.field555.field780 / 32;
                        method156(arg0, arg1, var28, var29, Statics.field2486[1]);
                    }
                }
                if (field338 == 2) {
                    int var30 = field280 * 4 - Statics.field1492 * 4 + 2 - Statics.field555.field730 / 32;
                    int var31 = field273 * 4 - Statics.field1454 * 4 + 2 - Statics.field555.field780 / 32;
                    method156(arg0, arg1, var30, var31, Statics.field2486[1]);
                }
                if (field338 == 10 && field271 >= 0 && field271 < field311.length) {
                    class3 var32 = field311[field271];
                    if (var32 != null) {
                        int var33 = var32.field730 / 32 - Statics.field555.field730 / 32;
                        int var34 = var32.field780 / 32 - Statics.field555.field780 / 32;
                        method156(arg0, arg1, var33, var34, Statics.field2486[1]);
                    }
                }
            }
            if (field392 != 0) {
                int var35 = field392 * 4 + 2 - Statics.field555.field730 / 32;
                int var36 = field485 * 4 + 2 - Statics.field555.field780 / 32;
                method1433(arg0, arg1, var35, var36, Statics.field2486[0]);
            }
            if (!Statics.field555.field30) {
                class73.method1527(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field437 < 3) {
            Statics.field2724.method1456(arg0, arg1, 33, 33, 25, 25, field511, 256, Statics.field120, Statics.field1586);
        } else {
            class73.method1534(arg0, arg1, 0, Statics.field120, Statics.field1586);
        }
        if (field346[arg2]) {
            Statics.field597.method1576(arg0, arg1);
        }
        field414[arg2] = true;
    }

    @ObfuscatedName("u.dn(IIIILbp;I)V")
    public static final void method156(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1433(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field511 + field463 & 0x7FF;
        int var7 = class84.field1470[var6];
        int var8 = class84.field1491[var6];
        int var9 = var7 * 256 / (field327 + 256);
        int var10 = var8 * 256 / (field327 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field198.method1457(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("bj.dg(IIIILbp;B)V")
    public static final void method1433(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field511 + field463 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1470[var5];
        int var8 = class84.field1491[var5];
        int var9 = var7 * 256 / (field327 + 256);
        int var10 = var8 * 256 / (field327 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1460(Statics.field597, arg0 + 94 + var11 - arg4.field1303 / 2 + 4, arg1 + 83 - var12 - arg4.field1305 / 2 - 4);
        } else {
            arg4.method1512(arg0 + 94 + var11 - arg4.field1303 / 2 + 4, arg1 + 83 - var12 - arg4.field1305 / 2 - 4);
        }
    }

    @ObfuscatedName("z.dl(Ljava/lang/String;ZI)Z")
    public static boolean method517(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class200.method2549(arg0, Statics.field2960);
        for (int var3 = 0; var3 < field369; var3++) {
            if (var2.equalsIgnoreCase(class200.method2549(field506[var3].field234, Statics.field2960)) && (!arg1 || field506[var3].field229 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class200.method2549(Statics.field555.field43, Statics.field2960))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fv.db(Ljava/lang/String;I)Z")
    public static boolean method3066(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class200.method2549(arg0, Statics.field2960);
        for (int var2 = 0; var2 < field508; var2++) {
            class8 var3 = field509[var2];
            if (var1.equalsIgnoreCase(class200.method2549(var3.field131, Statics.field2960))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class200.method2549(var3.field125, Statics.field2960))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ae.do(Ljava/lang/String;I)V")
    public static final void method811(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class200.method2549(arg0, Statics.field2960);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field369; var2++) {
            class16 var3 = field506[var2];
            String var4 = var3.field234;
            String var5 = class200.method2549(var4, Statics.field2960);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field369--;
                for (int var7 = var2; var7 < field369; var7++) {
                    field506[var7] = field506[var7 + 1];
                }
                field359 = field325;
                field382.method2356(129);
                class110 var8 = field382;
                int var9 = arg0.length() + 1;
                var8.method2097(var9);
                field382.method2186(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("an.dr(Ljava/lang/String;I)V")
    public static final void method592(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        field382.method2356(186);
        class110 var1 = field382;
        int var2 = arg0.length() + 1;
        var1.method2097(var2);
        field382.method2186(arg0);
    }

    @ObfuscatedName("z.dk(I)V")
    public static final void method516() {
        field382.method2356(186);
        field382.method2097(0);
    }

    @ObfuscatedName("eq.dv(Len;I)I")
    public static int method2818(class152 arg0) {
        class179 var1 = (class179) field298.method3163(((long) arg0.field2549 << 32) + (long) arg0.field2535);
        return var1 == null ? arg0.field2593 : var1.field2862;
    }

    @ObfuscatedName("f.di(Len;I)Z")
    public static boolean method504(class152 arg0) {
        if (field426) {
            if (method2818(arg0) != 0) {
                return false;
            }
            if (arg0.field2536 == 0) {
                return false;
            }
        }
        return arg0.field2546;
    }

    @ObfuscatedName("dy.dt(Len;II)Ljava/lang/String;")
    public static String method2559(class152 arg0, int arg1) {
        if (!class156.method1972(method2818(arg0), arg1) && arg0.field2621 == null) {
            return null;
        } else if (arg0.field2552 == null || arg0.field2552.length <= arg1 || arg0.field2552[arg1] == null || arg0.field2552[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2552[arg1];
        }
    }

    @ObfuscatedName("bh.dm(Len;I)Ljava/lang/String;")
    public static String method1078(class152 arg0) {
        if (class156.method439(method2818(arg0)) == 0) {
            return null;
        } else if (arg0.field2600 == null || arg0.field2600.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2600;
        }
    }

    @ObfuscatedName("i.dh(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method451(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field255 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field255 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field255 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field255 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field255 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field258 + "/";
    }
}
